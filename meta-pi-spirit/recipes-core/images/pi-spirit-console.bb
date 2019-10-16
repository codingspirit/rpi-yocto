SUMMARY = "A basic console image for raspberry pi."
HOMEPAGE = "https://github.com/codingspirit/rpi-yocto"
LICENSE = "MIT"

IMAGE_FEATURES += " debug-tweaks"

inherit core-image

CORE_OS = " \
    kernel-module \
"

WIFI_SUPPORT = " \
    linux-firmware-bcm43430 \
    wpa-supplicant \
"

BT_SUPPORT = " \
    bluez5 \
"

DEV_SUPPORT = " \
    gdb \
    gdbserver \
"

IMAGE_INSTALL += " \
    ${DEV_SUPPORT} \
    ${BT_SUPPORT} \
    ${WIFI_SUPPORT} \
"

