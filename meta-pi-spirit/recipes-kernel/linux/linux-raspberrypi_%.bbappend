
FILESEXTRAPATHS_prepend:="${THISDIR}/${PN}:"

# Enable adb
SRC_URI_append += "file://enable_adb-cp.cfg"

do_configure_append() {
    ${S}/scripts/kconfig/merge_config.sh -m -O ${B} ${B}/.config ${WORKDIR}/*-cp.cfg
}

