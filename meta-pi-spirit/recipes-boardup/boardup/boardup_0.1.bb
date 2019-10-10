SUMMARY = "pi3 boardup recipes"
DESCRIPTION = "setup network and more"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# Setup ethernet0
SRC_URI += "file://eth0.network"
FILES_${PN} += "/etc/systemd/network/eth0.network"

do_install() {
    install -d ${D}/etc/systemd/network
    install -m 0755 ${WORKDIR}/eth0.network ${D}/etc/systemd/network
}
