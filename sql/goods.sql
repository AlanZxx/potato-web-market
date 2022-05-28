/*
 Navicat Premium Data Transfer

 Source Server         : market
 Source Server Type    : MySQL
 Source Server Version : 50738
 Source Host           : localhost:3306
 Source Schema         : market

 Target Server Type    : MySQL
 Target Server Version : 50738
 File Encoding         : 65001

 Date: 28/05/2022 19:09:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `goodId` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品id',
  `goodName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品名称',
  `mallTypeId` int(255) NOT NULL COMMENT '商品种类id',
  `saleTypeId` int(255) NOT NULL COMMENT '售卖种类id',
  `counts` int(255) NOT NULL COMMENT '商品库存量',
  `detail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `price` decimal(10, 2) NOT NULL COMMENT '商品价格',
  `priceDis` decimal(10, 2) NOT NULL COMMENT '折扣价格',
  `discount` float(10, 2) NOT NULL COMMENT '折扣力度',
  `createTime` datetime(0) NOT NULL COMMENT '创建时间',
  `updateTime` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`goodId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
