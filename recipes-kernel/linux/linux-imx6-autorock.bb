require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "Linux kernel for Autorock imx6 boards"

SRC_URI = " \
	git://git@gitlab.autorock.com/i-mx6/fsl-linux.git;branch=${SRCBRANCH};protocol=ssh \
	file://defconfig \
"

SRCBRANCH = "imx_3.10.17_1.0.1_ga"
SRCREV = "3618e2021f645ed3c3ef7f5fb4e650711f7c19a7"

DEPENDS += "lz4-native bc-native"

COMPATIBLE_MACHINE = "wisehmi"

PV = "3.10.17+git${SRCPV}"
