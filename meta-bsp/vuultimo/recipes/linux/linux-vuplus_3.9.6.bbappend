FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp2"

SRC_URI += "\
        file://vu_ultimo_fixed_mtd.patch \
        file://linux-sata_bcm.patch \
        "       


