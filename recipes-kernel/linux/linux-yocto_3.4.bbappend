FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

PR := "${PR}.2"

COMPATIBLE_MACHINE_op-datalogger = "op-datalogger"


KBRANCH_op-datalogger  = "standard/beagleboard"


KMACHINE_op-datalogger  = "op-datalogger"


SRC_URI += " \
	file://op-datalogger-standard.scc \
	file://op-datalogger.scc \
	file://op-datalogger.cfg \
	file://op-datalogger-caspa.scc \
	file://op-datalogger-caspa.cfg \
	file://op-datalogger-dsp.scc \
	file://op-datalogger-dsp.cfg \
	file://user-config.cfg \
	file://user-patches.scc \
        file://defconfig \
	file://0001-spidev-enable-spidev-devices-when-otherwise-unused.patch \
        file://0004-Enable-overo-camera-support.patch \
	"

# uncomment and replace these SRCREVs with the real commit ids once you've had
# the appropriate changes committed to the upstream linux-yocto repo
#SRCREV_machine_pn-linux-yocto_op-datalogger ?= "85d394ecb685cac55834471dfa4e7c0f30b4ccf3"
#SRCREV_meta_pn-linux-yocto_op-datalogger ?= "504a1101a93f09fdbc25a919749d3efd2a4a053d"
