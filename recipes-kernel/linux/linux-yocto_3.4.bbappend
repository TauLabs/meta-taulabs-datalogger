FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

PR := "${PR}.2"

COMPATIBLE_MACHINE_taulabs-datalogger = "taulabs-datalogger"


KBRANCH_taulabs-datalogger  = "standard/beagleboard"


KMACHINE_taulabs-datalogger  = "taulabs-datalogger"


SRC_URI += " \
	file://taulabs-datalogger-standard.scc \
	file://taulabs-datalogger.scc \
	file://taulabs-datalogger.cfg \
	file://taulabs-datalogger-caspa.scc \
	file://taulabs-datalogger-caspa.cfg \
	file://taulabs-datalogger-dsp.scc \
	file://taulabs-datalogger-dsp.cfg \
	file://user-config.cfg \
	file://user-patches.scc \
        file://defconfig \
	file://0001-spidev-enable-spidev-devices-when-otherwise-unused.patch \
        file://0004-Enable-overo-camera-support.patch \
	"

# uncomment and replace these SRCREVs with the real commit ids once you've had
# the appropriate changes committed to the upstream linux-yocto repo
#SRCREV_machine_pn-linux-yocto_taulabs-datalogger ?= "85d394ecb685cac55834471dfa4e7c0f30b4ccf3"
#SRCREV_meta_pn-linux-yocto_taulabs-datalogger ?= "504a1101a93f09fdbc25a919749d3efd2a4a053d"
