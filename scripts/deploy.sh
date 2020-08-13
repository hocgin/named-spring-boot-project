#!/usr/bin/env bash
# ===========================
# 上传到中央仓库 mvn -Drevision=1.0.0.RELEASE clean package -DskipTests
# ===========================
path=$(cd `dirname $0`; pwd)

mvn -Drevision=1.0.0-SNAPSHOT clean package deploy -DskipTests
