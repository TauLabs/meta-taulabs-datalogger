DESCRIPTION = "Tau Labs SPI simple logger"
AUTHOR = "James Cotton"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949"
PR = "r1"
SRC_URI = "git://github.com/TauLabs/overo-datalogger.git;protocol=git"
SRCREV = "master"

S = "${WORKDIR}/git"

do_compile () {
  ${CC} ${CFLAGS} -I${S}/simple_logger ${LDFLAGS} -o ${S}/simple_logger/simple_logger ${S}/simple_logger/*.c 
}

do_install () {
  install -d ${D}${bindir}/
  install -m 0755 ${S}/simple_logger/simple_logger ${D}${bindir}/
}
FILES_${PN} = "${bindir}/simple_logger"
