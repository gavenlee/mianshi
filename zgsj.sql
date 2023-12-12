/*
 Navicat Premium Data Transfer

 Source Server         : 111
 Source Server Type    : MySQL
 Source Server Version : 80032
 Source Host           : localhost:3306
 Source Schema         : mianshi

 Target Server Type    : MySQL
 Target Server Version : 80032
 File Encoding         : 65001

 Date: 10/12/2023 23:28:46
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for zgsj
-- ----------------------------
DROP TABLE IF EXISTS `zgsj`;
CREATE TABLE `zgsj`  (
  `id` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '职工id',
  `emp_name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '员工姓名',
  `sex` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '性别：男；女',
  `age` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '年龄',
  `dept_name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '部门名称',
  `emp_degree_name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '学历【大专、本科、研究生】'
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of zgsj
-- ----------------------------
INSERT INTO `zgsj` VALUES ('1', '张一', '男', '25', '业务部', '本科');
INSERT INTO `zgsj` VALUES ('2', '张二', '女', '26', '人事部', '本科');
INSERT INTO `zgsj` VALUES ('3', '张三', '男', '27', '后勤部', '大专');
INSERT INTO `zgsj` VALUES ('4', '张四', '女', '28', '人事部', '大专');
INSERT INTO `zgsj` VALUES ('5', '张五', '男', '29', '后勤部', '大专');
INSERT INTO `zgsj` VALUES ('6', '张六', '女', '29', '后勤部', '本科');
INSERT INTO `zgsj` VALUES ('7', '张七', '男', '33', '业务部', '研究生');
INSERT INTO `zgsj` VALUES ('8', '张八', '男', '32', '业务部', '本科');
INSERT INTO `zgsj` VALUES ('9', '张九', '女', '33', '业务部', '大专');
INSERT INTO `zgsj` VALUES ('10', '李一', '男', '66', '业务部', '研究生');
INSERT INTO `zgsj` VALUES ('11', '李二', '女', '19', '人事部', '本科');
INSERT INTO `zgsj` VALUES ('12', '李三', '男', '28', '业务部', '研究生');
INSERT INTO `zgsj` VALUES ('13', '李四', '女', '46', '后勤部', '研究生');
INSERT INTO `zgsj` VALUES ('14', '李五', '男', '58', '业务部', '大专');
INSERT INTO `zgsj` VALUES ('15', '李六', '女', '22', '人事部', '研究生');
INSERT INTO `zgsj` VALUES ('16', '李七', '男', '26', '后勤部', '大专');
INSERT INTO `zgsj` VALUES ('17', '李八', '男', '25', '人事部', '研究生');
INSERT INTO `zgsj` VALUES ('18', '李九', '女', '29', '后勤部', '研究生');
INSERT INTO `zgsj` VALUES ('19', '王一', '男', '45', '后勤部', '本科');
INSERT INTO `zgsj` VALUES ('20', '王二', '女', '21', '业务部', '本科');
INSERT INTO `zgsj` VALUES ('21', '王三', '男', '21', '业务部', '大专');
INSERT INTO `zgsj` VALUES ('22', '王四', '男', '23', '业务部', '大专');
INSERT INTO `zgsj` VALUES ('23', '王五', '女', '33', '业务部', '大专');
INSERT INTO `zgsj` VALUES ('24', '王六', '男', '45', '人事部', '本科');
INSERT INTO `zgsj` VALUES ('25', '王七', '男', '35', '业务部', '研究生');
INSERT INTO `zgsj` VALUES ('26', '王八', '男', '41', '后勤部', '本科');
INSERT INTO `zgsj` VALUES ('27', '王九', '女', '25', '业务部', '大专');
INSERT INTO `zgsj` VALUES ('28', '赵一', '男', '26', '人事部', '研究生');
INSERT INTO `zgsj` VALUES ('29', '赵二', '男', '20', '后勤部', '本科');
INSERT INTO `zgsj` VALUES ('30', '赵三', '女', '21', '人事部', '研究生');
INSERT INTO `zgsj` VALUES ('31', '赵四', '男', '19', '后勤部', '研究生');
INSERT INTO `zgsj` VALUES ('32', '赵五', '女', '35', '后勤部', '大专');
INSERT INTO `zgsj` VALUES ('33', '赵六', '男', '24', '业务部', '研究生');
INSERT INTO `zgsj` VALUES ('34', '赵七', '男', '29', '业务部', '大专');
INSERT INTO `zgsj` VALUES ('35', '赵八', '女', '33', '业务部', '研究生');
INSERT INTO `zgsj` VALUES ('36', '赵九', '男', '9', '业务部', '本科');
INSERT INTO `zgsj` VALUES ('850d5e5673447aab9c257467bae9d880', '李宪法', '男', '24', '业务部', '大专');
INSERT INTO `zgsj` VALUES ('2e91cde12767192495899d2bcc5137c2', '狗蛋', '男', '12', '业务部', '大专');
INSERT INTO `zgsj` VALUES ('49412bb53c4071a25995ec55aa17b504', '测试', '男', '12', '业务部', '大专');

SET FOREIGN_KEY_CHECKS = 1;
