DESCRIPTION = "Overo Wifi Module Service"
AUTHOR = "Stacey Sheldon"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PR = "r1"
SRC_URI = "file://wifi-modules"

# Make sure the wifi modules are inserted
inherit update-rc.d
INITSCRIPT_PACKAGES = "${PN}"
INITSCRIPT_NAME_${PN} = "wifi-modules"
INITSCRIPT_PARAMS_${PN} = "defaults 80"

do_install_append () {
	install -d ${D}${sysconfdir}/init.d
	install -m 0755 ${WORKDIR}/wifi-modules ${D}${sysconfdir}/init.d/wifi-modules
}

FILES_${PN} += "${sysconfdir}/init.d/wifi-modules"
