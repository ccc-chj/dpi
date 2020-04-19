/*
 Navicat Premium Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : dpi

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 19/04/2020 16:12:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for memorandum
-- ----------------------------
DROP TABLE IF EXISTS `memorandum`;
CREATE TABLE `memorandum`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `openid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `date` datetime(6) NULL DEFAULT NULL,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of memorandum
-- ----------------------------
INSERT INTO `memorandum` VALUES (1, 'oa2H_4-gO1UGaRsp0L4_VwXleyqk', '2020-04-19 00:00:00.000000', '测试备忘录', '这是一条设置用的备忘录');
INSERT INTO `memorandum` VALUES (2, 'oa2H_4-gO1UGaRsp0L4_VwXleyqk', '2020-04-19 00:00:00.000000', '恋爱', '今天好开心，打了一天代码');
INSERT INTO `memorandum` VALUES (6, 'oa2H_4-gO1UGaRsp0L4_VwXleyqk', '2020-04-19 00:00:00.000000', '日记', '这是今天的备忘录,确实真是厉害呢\n');
INSERT INTO `memorandum` VALUES (10, 'oa2H_4-gO1UGaRsp0L4_VwXleyqk', '2020-04-19 00:00:00.000000', '微信小程序', '微信小程序在对动态的数据进行setData操作时需要如下使用如：this.setData({\n          [\'memorandumList[\'+i+\']\'] : item\n        })');

SET FOREIGN_KEY_CHECKS = 1;
