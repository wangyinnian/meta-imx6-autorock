require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "u-boot for Autorock imx6 boards."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=c7383a594871c03da76b3707929d2919"
COMPATIBLE_MACHINE = "wisehmi"

PROVIDES = "u-boot"

SRCREV = "21f983d43d37b95fda1861e8e43a6190b87ee8a3"
SRCBRANCH = "v2014.10"
SRC_URI = "git://git@gitlab.autorock.com/i-mx6/das-uboot.git;branch=${SRCBRANCH};protocol=ssh"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

PV = "2014.10+git${SRCPV}"
