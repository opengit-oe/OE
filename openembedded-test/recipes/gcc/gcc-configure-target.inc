require gcc-configure-common.inc

EXTRA_OECONF_PATHS = " \
    --with-local-prefix=${prefix}/local \
    --with-gxx-include-dir=${includedir}/c++/${BINV} \
    --with-build-sysroot=${STAGING_DIR_HOST} \
   "
