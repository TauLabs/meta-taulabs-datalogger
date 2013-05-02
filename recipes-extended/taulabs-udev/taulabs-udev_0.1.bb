DESCRIPTION = "Tau Labs Udev Rules"
AUTHOR = "Stacey Sheldon <stac@solidgoldbomb.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PR = "r1"
SRC_URI = "file://40-spidev.rules \
           file://40-video.rules"

S = "${WORKDIR}"

DEPENDS_${PN} = "udev"

do_install() {
	     # Install sudoers config for taulabs user
	     install -d -m 755 ${D}${sysconfdir}/udev/rules.d
	     install -p -m 0644 40-spidev.rules ${D}${sysconfdir}/udev/rules.d/
	     install -p -m 0644 40-video.rules ${D}${sysconfdir}/udev/rules.d/
}

FILES_${PN} = "${sysconfdir}/udev/rules.d/*"
