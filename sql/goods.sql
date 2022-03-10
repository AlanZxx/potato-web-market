/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50649
 Source Host           : localhost:3306
 Source Schema         : market

 Target Server Type    : MySQL
 Target Server Version : 50649
 File Encoding         : 65001

 Date: 10/03/2022 22:37:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `goodId` int(10) NOT NULL AUTO_INCREMENT COMMENT '商品id',
  `goodName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品名称',
  `mallType` int(255) NOT NULL COMMENT '商品种类id',
  `saleType` int(255) NOT NULL COMMENT '售卖种类id',
  `counts` int(255) NOT NULL COMMENT '商品库存量',
  `detail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `price` decimal(10, 2) NOT NULL COMMENT '商品价格',
  `priceDis` decimal(10, 2) NOT NULL COMMENT '折扣价格',
  `discount` float(10, 2) NOT NULL COMMENT '折扣力度',
  PRIMARY KEY (`goodId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
