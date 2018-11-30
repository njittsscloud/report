
CREATE DATABASE /*!32312 IF NOT EXISTS*/`njit_report` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `njit_report`;


CREATE TABLE `njit_task` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `year` varchar(20) DEFAULT '' COMMENT '学年',
  `term` int(1) DEFAULT '1' COMMENT '学期',
  `name` varchar(50) DEFAULT '' COMMENT '任务名称',
  `name_type` int(1) DEFAULT '1' COMMENT '名称生成方式 1实验项目 2手动输入',
  `begin_time` datetime DEFAULT NULL COMMENT '开始时间',
  `deadline_time` datetime DEFAULT NULL COMMENT '截止时间',
  `attach_name` varchar(50) DEFAULT '' COMMENT '附件名称',
  `attach_url` varchar(50) DEFAULT '' COMMENT '附件地址',
  `publish_time` datetime DEFAULT NULL COMMENT '下发时间',
  `desc` varchar(200) DEFAULT '' COMMENT '说明',
  `status` int(1) DEFAULT '0' COMMENT '发布状态 1待发布 2已发布',
  `course_id` bigint(20) DEFAULT '-1' COMMENT '课程分配id',
  `curriculum_id` bigint(20) DEFAULT '-1' COMMENT '课程id',
  `curriculum_name` varchar(50) DEFAULT '' COMMENT '课程名称',
  `teacher_id` bigint(20) DEFAULT '-1' COMMENT '教师id',
  `teacher_name` varchar(50) DEFAULT '' COMMENT '教师姓名',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `del_flag` int(11) DEFAULT '0' COMMENT '删除标志',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `njit_task_class` */

CREATE TABLE `njit_task_class` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `task_id` bigint(20) DEFAULT '-1' COMMENT '实验任务id',
  `task_name` varchar(50) DEFAULT '' COMMENT '实验任务名称',
  `class_id` bigint(20) DEFAULT '-1' COMMENT '班级id',
  `class_name` varchar(50) DEFAULT '' COMMENT '班级名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `del_flag` int(1) DEFAULT '0' COMMENT '删除标志 0正常 1删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table njit_report
(
   id                   bigint not null auto_increment comment 'id',
   report_name          varchar(100) default '' comment '报告名称',
   file_name            varchar(50) default '' comment '文件名称',
   file_path            varchar(50) default '' comment '文件路径',
   `desc`               varchar(200) default '' comment '报告描述',
   submit_time          datetime comment '提交时间',
   correct_status       int(1) default 1 comment '批阅状态 1待批阅 2待发布 3已发布',
   correct_content      text comment '批阅内容',
   score_type           int(1) default 0 comment '分类类型 0未知 1等第制 2百分制',
   score                varchar(50) default '' comment '得分',
   task_id              bigint default -1 comment '实验任务id',
   task_name            varchar(100) default '' comment '实验任务名称',
   student_id           bigint default -1 comment '学生id',
   student_name         varchar(50) default '' comment '学生姓名',
   student_no           varchar(50) default '' comment '学号',
   class_id             bigint default -1 comment '学生班级id',
   class_name           varchar(50) default '' comment '学生班级名称',
   create_time          datetime comment '创建时间',
   update_time          datetime default CURRENT_TIMESTAMP comment '更新时间',
   del_flag             int(1) default 0 comment '删除标志 0正常 1已删除',
   primary key (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
alter table njit_report comment '报告表';


