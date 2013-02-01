DESCRIPTION = "Yet Another V4L2 Test Application"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING.GPL;md5=751419260aa954499f7abaabaa882bbe"

SRCREV = "${AUTOREV}"
SRC_URI = "git://git.ideasonboard.org/git/yavta.git;protocol=http"

PV = "0.3+git${SRCREV}"
S = "${WORKDIR}/git"

do_install() {
	install -d ${D}${bindir}
	install -m 0755 yavta ${D}${bindir}
}


