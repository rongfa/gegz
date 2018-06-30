/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50532
Source Host           : localhost:3306
Source Database       : gegz

Target Server Type    : MYSQL
Target Server Version : 50532
File Encoding         : 65001

Date: 2018-06-12 17:31:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `plat_answer`
-- ----------------------------
DROP TABLE IF EXISTS `plat_answer`;
CREATE TABLE `plat_answer` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT NULL COMMENT '答案内容',
  `is_right` bit(1) DEFAULT NULL COMMENT '是否为正确答案 1:是 0:否',
  `question_id` bigint(20) DEFAULT NULL COMMENT '对应的问题Id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of plat_answer
-- ----------------------------
INSERT INTO `plat_answer` VALUES ('1', '啊', '', '1');
INSERT INTO `plat_answer` VALUES ('2', 'adsfa', '', '1');
INSERT INTO `plat_answer` VALUES ('3', 'adfas', '', '1');
INSERT INTO `plat_answer` VALUES ('4', 'adfa', '', '1');
INSERT INTO `plat_answer` VALUES ('5', 'adfd', '', '2');
INSERT INTO `plat_answer` VALUES ('6', 'werw', '', '2');
INSERT INTO `plat_answer` VALUES ('7', 'fsd', '', '2');
INSERT INTO `plat_answer` VALUES ('8', 'xcxvx', '', '2');
INSERT INTO `plat_answer` VALUES ('9', 'xccvx', '', '3');
INSERT INTO `plat_answer` VALUES ('10', 'sfwf', '', '3');
INSERT INTO `plat_answer` VALUES ('11', 'dsdf', '', '3');
INSERT INTO `plat_answer` VALUES ('12', 'xvvx', '', '3');
INSERT INTO `plat_answer` VALUES ('13', 'xcvxs', '', '4');
INSERT INTO `plat_answer` VALUES ('14', 'sdfs', '', '4');
INSERT INTO `plat_answer` VALUES ('15', 'werw', '', '4');
INSERT INTO `plat_answer` VALUES ('16', 'sdf', '', '4');
INSERT INTO `plat_answer` VALUES ('17', 'yiy', '', '5');
INSERT INTO `plat_answer` VALUES ('18', 'rtyry', '', '5');
INSERT INTO `plat_answer` VALUES ('19', 'uiy', '', '5');
INSERT INTO `plat_answer` VALUES ('20', 'wewr', '', '5');
INSERT INTO `plat_answer` VALUES ('21', 'wrewe', '', '6');
INSERT INTO `plat_answer` VALUES ('22', 'werwe', '', '6');
INSERT INTO `plat_answer` VALUES ('23', 'wersfds', '', '6');
INSERT INTO `plat_answer` VALUES ('24', 'erter', '', '6');
INSERT INTO `plat_answer` VALUES ('25', 'sdf', '', '7');
INSERT INTO `plat_answer` VALUES ('26', 'jyui', '', '7');
INSERT INTO `plat_answer` VALUES ('27', 'yuy', '', '7');
INSERT INTO `plat_answer` VALUES ('28', 'uiou', '', '7');
INSERT INTO `plat_answer` VALUES ('29', 'hyyuiy', '', '8');
INSERT INTO `plat_answer` VALUES ('30', 'wrq', '', '8');
INSERT INTO `plat_answer` VALUES ('31', 'eryytr', '', '8');
INSERT INTO `plat_answer` VALUES ('32', 'tereter', '', '8');
INSERT INTO `plat_answer` VALUES ('33', 'gjyt', '', '9');
INSERT INTO `plat_answer` VALUES ('34', 'guy7t', '', '9');
INSERT INTO `plat_answer` VALUES ('35', 'fewr', '', '9');
INSERT INTO `plat_answer` VALUES ('36', 'sgsg', '', '9');
INSERT INTO `plat_answer` VALUES ('37', 'ewww', '', '10');
INSERT INTO `plat_answer` VALUES ('38', 'sfgs', '', '10');
INSERT INTO `plat_answer` VALUES ('39', 'hgsdf', '', '10');
INSERT INTO `plat_answer` VALUES ('40', 'ssfgsd', '', '10');
INSERT INTO `plat_answer` VALUES ('41', 'wrwe', '', '11');
INSERT INTO `plat_answer` VALUES ('42', 'qqq', '', '11');
INSERT INTO `plat_answer` VALUES ('43', 'sdsd', '', '11');
INSERT INTO `plat_answer` VALUES ('44', 'dgdfgd', '', '11');
INSERT INTO `plat_answer` VALUES ('45', 'ewrwe', '', '12');
INSERT INTO `plat_answer` VALUES ('46', 'fgddfgd', '', '12');
INSERT INTO `plat_answer` VALUES ('47', 'dsfsdfs', '', '12');
INSERT INTO `plat_answer` VALUES ('48', 'gdfgd', '', '12');

-- ----------------------------
-- Table structure for `plat_manager`
-- ----------------------------
DROP TABLE IF EXISTS `plat_manager`;
CREATE TABLE `plat_manager` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `phone` varchar(255) DEFAULT NULL COMMENT '电话',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of plat_manager
-- ----------------------------
INSERT INTO `plat_manager` VALUES ('1', '13551804620', '50F02ACBAB8DC7167AA5AC026289EE2691D05A831C72194F74EA14EE');

-- ----------------------------
-- Table structure for `plat_question`
-- ----------------------------
DROP TABLE IF EXISTS `plat_question`;
CREATE TABLE `plat_question` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL COMMENT '题目标题',
  `status` bit(1) DEFAULT NULL COMMENT '状态 1:有效 0:无效',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of plat_question
-- ----------------------------
INSERT INTO `plat_question` VALUES ('1', 'aaaaaaaaa', '', '2018-06-12 15:36:46', '2018-06-12 15:36:49');
INSERT INTO `plat_question` VALUES ('2', 'bbbbbbbb', '', '2018-06-12 15:36:55', '2018-06-12 15:36:57');
INSERT INTO `plat_question` VALUES ('3', 'cccccccccc', '', '2018-06-12 15:36:55', '2018-06-12 15:36:55');
INSERT INTO `plat_question` VALUES ('4', 'dddddddd', '', '2018-06-12 15:36:55', '2018-06-12 15:36:55');
INSERT INTO `plat_question` VALUES ('5', 'eeeeeeee', '', '2018-06-12 15:36:55', '2018-06-12 15:36:55');
INSERT INTO `plat_question` VALUES ('6', 'fffffffffff', '', '2018-06-12 15:36:55', '2018-06-12 15:36:55');
INSERT INTO `plat_question` VALUES ('7', 'ggggggggggg', '', '2018-06-12 15:36:55', '2018-06-12 15:36:55');
INSERT INTO `plat_question` VALUES ('8', 'hhhhhhhhhh', '', '2018-06-12 15:36:55', '2018-06-12 15:36:55');
INSERT INTO `plat_question` VALUES ('9', 'qqqqqqqqqq', '', '2018-06-12 15:36:55', '2018-06-12 15:36:55');
INSERT INTO `plat_question` VALUES ('10', 'wwwwwwww', '', '2018-06-12 15:36:55', '2018-06-12 15:36:55');
INSERT INTO `plat_question` VALUES ('11', 'rrrrrrrrrrrrrr', '', '2018-06-12 15:36:55', '2018-06-12 15:36:55');
INSERT INTO `plat_question` VALUES ('12', 'zzzzzzzzzzz', '', '2018-06-12 15:36:55', '2018-06-12 15:36:55');

-- ----------------------------
-- Table structure for `plat_user`
-- ----------------------------
DROP TABLE IF EXISTS `plat_user`;
CREATE TABLE `plat_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `avatar_url` varchar(255) DEFAULT NULL COMMENT '用户头像',
  `nick_name` varchar(255) DEFAULT NULL COMMENT '用户昵称',
  `gender` varchar(3) DEFAULT NULL COMMENT '用户的性别',
  `province` varchar(255) DEFAULT NULL COMMENT '省份',
  `city` varchar(255) DEFAULT NULL COMMENT '城市',
  `country` varchar(255) DEFAULT NULL COMMENT '国家',
  `in_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of plat_user
-- ----------------------------
INSERT INTO `plat_user` VALUES ('1', 'http://long423.oss-cn-beijing.aliyuncs.com/zndl/img/43ed6415-263b-480e-8fe2-82bc770cc9a9.jpg?Expires=1840091378&OSSAccessKeyId=LTAIqr71ifVZg9OG&Signature=LDm25ntVTufVBKQD%2BQnjBSCU6OU%3D', 'aaa', '1', '四川', '成都', '中国', '2018-04-26 17:54:27');
INSERT INTO `plat_user` VALUES ('2', 'http://long423.oss-cn-beijing.aliyuncs.com/zndl/img/43ed6415-263b-480e-8fe2-82bc770cc9a9.jpg?Expires=1840091378&OSSAccessKeyId=LTAIqr71ifVZg9OG&Signature=LDm25ntVTufVBKQD%2BQnjBSCU6OU%3D', 'adf', '0', '四川', '成都', '中国', '2018-04-27 17:54:27');
INSERT INTO `plat_user` VALUES ('3', 'http://long423.oss-cn-beijing.aliyuncs.com/zndl/img/43ed6415-263b-480e-8fe2-82bc770cc9a9.jpg?Expires=1840091378&OSSAccessKeyId=LTAIqr71ifVZg9OG&Signature=LDm25ntVTufVBKQD%2BQnjBSCU6OU%3D', 'adfasdf', '1', '四川', '成都', '中国', '2018-04-27 17:54:27');
INSERT INTO `plat_user` VALUES ('4', 'http://long423.oss-cn-beijing.aliyuncs.com/zndl/img/43ed6415-263b-480e-8fe2-82bc770cc9a9.jpg?Expires=1840091378&OSSAccessKeyId=LTAIqr71ifVZg9OG&Signature=LDm25ntVTufVBKQD%2BQnjBSCU6OU%3D', 'asdfas', '0', '四川', '成都', '中国', '2018-04-27 17:54:27');
INSERT INTO `plat_user` VALUES ('5', 'http://long423.oss-cn-beijing.aliyuncs.com/zndl/img/43ed6415-263b-480e-8fe2-82bc770cc9a9.jpg?Expires=1840091378&OSSAccessKeyId=LTAIqr71ifVZg9OG&Signature=LDm25ntVTufVBKQD%2BQnjBSCU6OU%3D', 'asafasdf', '2', '四川', '成都', '中国', '2018-04-27 17:54:27');
INSERT INTO `plat_user` VALUES ('6', 'http://long423.oss-cn-beijing.aliyuncs.com/zndl/img/43ed6415-263b-480e-8fe2-82bc770cc9a9.jpg?Expires=1840091378&OSSAccessKeyId=LTAIqr71ifVZg9OG&Signature=LDm25ntVTufVBKQD%2BQnjBSCU6OU%3D', 'asdfsdf', '0', '四川', '成都', '中国', '2018-04-27 17:54:27');
INSERT INTO `plat_user` VALUES ('7', 'http://long423.oss-cn-beijing.aliyuncs.com/zndl/img/43ed6415-263b-480e-8fe2-82bc770cc9a9.jpg?Expires=1840091378&OSSAccessKeyId=LTAIqr71ifVZg9OG&Signature=LDm25ntVTufVBKQD%2BQnjBSCU6OU%3D', 'gsewe', '1', '四川', '成都', '中国', '2018-04-27 17:54:27');
INSERT INTO `plat_user` VALUES ('8', 'http://long423.oss-cn-beijing.aliyuncs.com/zndl/img/43ed6415-263b-480e-8fe2-82bc770cc9a9.jpg?Expires=1840091378&OSSAccessKeyId=LTAIqr71ifVZg9OG&Signature=LDm25ntVTufVBKQD%2BQnjBSCU6OU%3D', 'gffgd', '1', '四川', '成都', '中国', '2018-04-27 17:54:27');
INSERT INTO `plat_user` VALUES ('9', 'http://long423.oss-cn-beijing.aliyuncs.com/zndl/img/43ed6415-263b-480e-8fe2-82bc770cc9a9.jpg?Expires=1840091378&OSSAccessKeyId=LTAIqr71ifVZg9OG&Signature=LDm25ntVTufVBKQD%2BQnjBSCU6OU%3D', 'sfdgdf', '1', '四川', '成都', '中国', '2018-04-27 17:54:27');
INSERT INTO `plat_user` VALUES ('10', 'http://long423.oss-cn-beijing.aliyuncs.com/zndl/img/43ed6415-263b-480e-8fe2-82bc770cc9a9.jpg?Expires=1840091378&OSSAccessKeyId=LTAIqr71ifVZg9OG&Signature=LDm25ntVTufVBKQD%2BQnjBSCU6OU%3D', 'fhgy', '2', '四川', '成都', '中国', '2018-04-27 17:54:27');
INSERT INTO `plat_user` VALUES ('11', 'http://long423.oss-cn-beijing.aliyuncs.com/zndl/img/43ed6415-263b-480e-8fe2-82bc770cc9a9.jpg?Expires=1840091378&OSSAccessKeyId=LTAIqr71ifVZg9OG&Signature=LDm25ntVTufVBKQD%2BQnjBSCU6OU%3D', 'rete', '2', '四川', '成都', '中国', '2018-04-27 17:54:27');
INSERT INTO `plat_user` VALUES ('12', 'http://long423.oss-cn-beijing.aliyuncs.com/zndl/img/43ed6415-263b-480e-8fe2-82bc770cc9a9.jpg?Expires=1840091378&OSSAccessKeyId=LTAIqr71ifVZg9OG&Signature=LDm25ntVTufVBKQD%2BQnjBSCU6OU%3D', 'dfgde', '2', '四川', '成都', '中国', '2018-04-27 17:54:27');
INSERT INTO `plat_user` VALUES ('13', 'http://long423.oss-cn-beijing.aliyuncs.com/zndl/img/43ed6415-263b-480e-8fe2-82bc770cc9a9.jpg?Expires=1840091378&OSSAccessKeyId=LTAIqr71ifVZg9OG&Signature=LDm25ntVTufVBKQD%2BQnjBSCU6OU%3D', 'dfhdrre', '2', '四川', '成都', '中国', '2018-04-27 17:54:27');
INSERT INTO `plat_user` VALUES ('14', 'http://long423.oss-cn-beijing.aliyuncs.com/zndl/img/43ed6415-263b-480e-8fe2-82bc770cc9a9.jpg?Expires=1840091378&OSSAccessKeyId=LTAIqr71ifVZg9OG&Signature=LDm25ntVTufVBKQD%2BQnjBSCU6OU%3D', 'wtw', '2', '四川', '成都', '中国', '2018-04-27 17:54:27');
INSERT INTO `plat_user` VALUES ('15', 'http://long423.oss-cn-beijing.aliyuncs.com/zndl/img/43ed6415-263b-480e-8fe2-82bc770cc9a9.jpg?Expires=1840091378&OSSAccessKeyId=LTAIqr71ifVZg9OG&Signature=LDm25ntVTufVBKQD%2BQnjBSCU6OU%3D', 'dfgwd', '1', '四川', '成都', '中国', '2018-04-27 17:54:27');
INSERT INTO `plat_user` VALUES ('16', 'http://long423.oss-cn-beijing.aliyuncs.com/zndl/img/43ed6415-263b-480e-8fe2-82bc770cc9a9.jpg?Expires=1840091378&OSSAccessKeyId=LTAIqr71ifVZg9OG&Signature=LDm25ntVTufVBKQD%2BQnjBSCU6OU%3D', 'dfg', '1', '四川', '成都', '中国', '2018-04-27 17:54:27');
INSERT INTO `plat_user` VALUES ('17', 'http://long423.oss-cn-beijing.aliyuncs.com/zndl/img/43ed6415-263b-480e-8fe2-82bc770cc9a9.jpg?Expires=1840091378&OSSAccessKeyId=LTAIqr71ifVZg9OG&Signature=LDm25ntVTufVBKQD%2BQnjBSCU6OU%3D', 'fgdg', '1', '四川', '成都', '中国', '2018-04-27 17:54:27');
INSERT INTO `plat_user` VALUES ('18', 'http://long423.oss-cn-beijing.aliyuncs.com/zndl/img/43ed6415-263b-480e-8fe2-82bc770cc9a9.jpg?Expires=1840091378&OSSAccessKeyId=LTAIqr71ifVZg9OG&Signature=LDm25ntVTufVBKQD%2BQnjBSCU6OU%3D', 'fhgf', '2', '四川', '成都', '中国', '2018-04-27 17:54:27');
INSERT INTO `plat_user` VALUES ('19', 'http://long423.oss-cn-beijing.aliyuncs.com/zndl/img/43ed6415-263b-480e-8fe2-82bc770cc9a9.jpg?Expires=1840091378&OSSAccessKeyId=LTAIqr71ifVZg9OG&Signature=LDm25ntVTufVBKQD%2BQnjBSCU6OU%3D', 'hfghf', '2', '四川', '成都', '中国', '2018-04-27 17:54:27');
INSERT INTO `plat_user` VALUES ('20', 'http://long423.oss-cn-beijing.aliyuncs.com/zndl/img/43ed6415-263b-480e-8fe2-82bc770cc9a9.jpg?Expires=1840091378&OSSAccessKeyId=LTAIqr71ifVZg9OG&Signature=LDm25ntVTufVBKQD%2BQnjBSCU6OU%3D', 'eww', '2', '四川', '成都', '中国', '2018-03-26 17:54:27');
INSERT INTO `plat_user` VALUES ('21', 'http://long423.oss-cn-beijing.aliyuncs.com/zndl/img/43ed6415-263b-480e-8fe2-82bc770cc9a9.jpg?Expires=1840091378&OSSAccessKeyId=LTAIqr71ifVZg9OG&Signature=LDm25ntVTufVBKQD%2BQnjBSCU6OU%3D', 'ssdfa', '1', '四川', '成都', '中国', '2018-04-27 13:55:35');
