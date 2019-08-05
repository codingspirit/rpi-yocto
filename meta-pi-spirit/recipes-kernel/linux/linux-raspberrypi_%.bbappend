
FILESEXTRAPATHS_prepend:="${THISDIR}/${PN}:"

SRC_URI += "file://*.cfg \
"

KERNEL_CONFIG_FRAGMENTS += "${WORKDIR}/*.cfg"
