DESCRIPTION = "vuplus web manual"
SECTION = "base"
PRIORITY = "required"
LICENSE = "CLOSED"

PR = "${SRC_DATE}_r1"
SRC_URI = "http://code.vuplus.com/download/build.fc3abf29fb03f797e78f907928125638/embedded/vuplus_manual/${MACHINE}_${SRC_DATE}.tar.gz"

INHIBIT_PACKAGE_STRIP = "1"
S = "${WORKDIR}/${MACHINE}"

do_compile() {
}

do_install() {
        install -d ${D}/usr/local/manual
        install -d ${D}/usr/local/manual/${IMAGE_DIR}
	for f in *.html; do
                install -m 0644 ${WORKDIR}/${MACHINE}/$f ${D}/usr/local/manual/;
        done

	for f in *.jpeg; do
                install -m 0644 ${WORKDIR}/${MACHINE}/${IMAGE_DIR}/$f ${D}/usr/local/manual/${IMAGE_DIR}/;
	done
	for f in *.jpg; do
                install -m 0644 ${WORKDIR}/${MACHINE}/${IMAGE_DIR}/$f ${D}/usr/local/manual/${IMAGE_DIR}/;
	done
        for f in *.png; do
                install -m 0644 ${WORKDIR}/${MACHINE}/${IMAGE_DIR}/$f ${D}/usr/local/manual/${IMAGE_DIR}/;
        done
}

PACKAGE_ARCH := "${MACHINE_ARCH}"

PACKAGES = "${PN}"
FILES_${PN} = "/"

