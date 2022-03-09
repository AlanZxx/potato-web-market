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

 Date: 09/03/2022 18:14:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for saletype
-- ----------------------------
DROP TABLE IF EXISTS `saletype`;
CREATE TABLE `saletype`  (
  `saleTypeId` tinyint(4) NOT NULL COMMENT '售卖种类id',
  `saleTypeName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '售卖种类名称',
  PRIMARY KEY (`saleTypeId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
