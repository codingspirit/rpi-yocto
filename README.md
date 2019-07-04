# rpi-yocto

## poky
git://git.yoctoproject.org/poky
## meta-openembedded
git://git.openembedded.org/meta-openembedded
## meta-raspberrypi
https://github.com/agherzan/meta-raspberrypi.git

# Quick start
```
git submodule init
git submodule update
source poky/oe-init-build-env rpi-build
bitbake core-image-base
```
