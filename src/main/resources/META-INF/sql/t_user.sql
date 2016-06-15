/*
Navicat MySQL Data Transfer

Source Server         : 183.60.227.88
Source Server Version : 50549
Source Host           : 183.60.227.88:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2016-06-15 17:08:17
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `STR_2_VARCHAR` varchar(10) DEFAULT NULL,
  `STR_2_DATE` date DEFAULT NULL,
  `DATE_2_VARCHAR` varchar(10) DEFAULT NULL,
  `DATE_2_DATE` date DEFAULT NULL,
  `DATE_2_TIMESTAMP` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO t_user VALUES ('1', '2016-06-15', '2016-06-15', '2016-06-15', '2016-06-15', '2016-06-15 15:49:12');
