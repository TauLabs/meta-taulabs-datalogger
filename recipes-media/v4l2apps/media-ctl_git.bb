DESCRIPTION = "Media controller control application"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=d749e86a105281d7a44c2328acebc4b0"


SRCREV = "${AUTOREV}"
SRC_URI = "git://git.ideasonboard.org/media-ctl.git;protocol=git"

PV = "0.0.2+git${SRCREV}"
S = "${WORKDIR}/git"

inherit autotools

# It needs some kernel definitions for v4l2, so it isn't machine specific
STAGING_KERNEL_DIR = "${STAGING_DIR}/${MACHINE_ARCH}${TARGET_VENDOR}-${TARGET_OS}/kernel"
EXTRA_OECONF = "--with-kernel-headers=${STAGING_KERNEL_DIR}"


