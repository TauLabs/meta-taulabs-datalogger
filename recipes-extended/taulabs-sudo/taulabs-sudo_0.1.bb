DESCRIPTION = "Tau Labs User Sudo Access"
AUTHOR = "Stacey Sheldon <stac@solidgoldbomb.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PR = "r1"
SRC_URI = "file://taulabs-sudo-rules"

S = "${WORKDIR}"

DEPENDS_${PN} = "sudo"

do_install() {
	     # Install sudoers config for taulabs user
	     install -d -m 755 ${D}${sysconfdir}/sudoers.d/
	     install -p -m 0440 taulabs-sudo-rules ${D}${sysconfdir}/sudoers.d/
}

FILES_${PN} = "${sysconfdir}/sudoers.d/taulabs-sudo-rules"
