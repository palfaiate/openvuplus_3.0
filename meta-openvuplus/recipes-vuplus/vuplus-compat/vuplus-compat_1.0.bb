SUMMARY = "Vuplus compatibility links"
SECTION = "base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
PRIORITY = "required"
PR = "r0"

inherit allarch

do_install() {
        install -d ${D}${base_libdir}
        ln -sf libcrypto.so.0.9.8 ${D}${base_libdir}/libcrypto.so.0.9.7
        ln -sf libgcc_s.so.1 ${D}${base_libdir}/libgcc_s_nof.so.1
        install -d ${D}${libdir}
        ln -sf libdvbsi++.so.1 ${D}${libdir}/libdvbsi++.so.0
        ln -sf libgif.so.4 ${D}${libdir}/libungif.so.4
        ln -sf libjpeg.so.8 ${D}${libdir}/libjpeg.so.62
        ln -sf libssl.so.0.9.8 ${D}${libdir}/libssl.so.0.9.7
        ln -sf libpython2.7.so.1.0 ${D}${libdir}/libpython2.6.so.1.0
}

PACKAGES = "${PN}"
