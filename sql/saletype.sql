/*
 Navicat MySQL Data Transfer

 Source Server         : mysql_spdb
 Source Server Type    : MySQL
 Source Server Version : 50736
 Source Host           : localhost:3306
 Source Schema         : market

 Target Server Type    : MySQL
 Target Server Version : 50736
 File Encoding         : 65001

 Date: 17/03/2022 20:02:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for saletype
-- ----------------------------
DROP TABLE IF EXISTS `saletype`;
CREATE TABLE `saletype`  (
  `saleTypeId` int(11) NOT NULL AUTO_INCREMENT COMMENT '销售方式id',
  `saleTypeName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '销售方式名称',
  `goodsCount` int(10) NOT NULL COMMENT '当前下所属商品数量',
  `detail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `addTime` datetime NOT NULL COMMENT '添加时间',
  `updateTime` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`saleTypeId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;

SET FOREIGN_KEY_CHECKS = 1;
