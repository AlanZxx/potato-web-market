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

 Date: 10/03/2022 18:23:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for malltype
-- ----------------------------
DROP TABLE IF EXISTS `malltype`;
CREATE TABLE `malltype`  (
  `typeId` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品种类id',
  `typeName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '类别名称',
  `mallCounts` int(11) NOT NULL DEFAULT 0 COMMENT '类别包含商品数',
  `mallTypeStatus` tinyint(4) NOT NULL DEFAULT 0 COMMENT '当前类别商品状态',
  `addTime` datetime NOT NULL COMMENT '创建时间',
  `updateTime` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `detail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品描述',
  PRIMARY KEY (`typeId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
