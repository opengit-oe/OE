DESCRIPTION="AiO screenshot grabber"
MAINTAINER = "PLi team"
LICENSE = "GPL"

DEPENDS = "jpeg libpng zlib"

inherit gitpkgv

PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"
PR = "r1"

SRC_URI = "git://oe.git.sourceforge.net/gitroot/oe/aio-grab;protocol=git"

S = "${WORKDIR}/git"

inherit autotools pkgconfig
