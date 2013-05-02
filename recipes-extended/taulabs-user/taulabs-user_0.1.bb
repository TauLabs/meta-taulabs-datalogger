DESCRIPTION = "Tau Labs User Account"
AUTHOR = "Stacey Sheldon <stac@solidgoldbomb.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PR = "r1"
SRC_URI = "file://README"

S = "${WORKDIR}"

# Create a userid so we can manage its home directory configuration
# Default password is "taulabs" and was created with 'mkpasswd taulabs 00'
inherit useradd
USERADD_PACKAGES = "${PN}"
USERADD_PARAM_${PN} = "--create-home --shell /bin/bash --user-group --groups sudo,video --password 00.S.cmg9hqBk taulabs"

do_install() {
	     # Install files into the taulabs home directory
	     install -d -m 755 ${D}/home/taulabs

	     install -p -m 644 README ${D}/home/taulabs/

	     chown -R taulabs ${D}/home/taulabs
	     chgrp -R taulabs ${D}/home/taulabs
}

FILES_${PN} = "/home/taulabs/*"

# Prevents do_package failures with:
# debugsources.list: No such file or directory:
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

