package com.lgf.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 员工基本信息表
 * </p>
 *
 * @author lgf
 * @since 2021-09-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="PersonInfo对象", description="员工基本信息表")
public class PersonInfo implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "账号id")
    private Long uid;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "别名")
    private String alias;

    @ApiModelProperty(value = "曾用名")
    private String formerName;

    @ApiModelProperty(value = "性别(0女 1男)")
    private Integer sex;

    @ApiModelProperty(value = "手机号码")
    private String phone;

    @ApiModelProperty(value = "个人邮箱")
    private String email;

    @ApiModelProperty(value = "证件类型(1身份证 2港澳居民来往内地通行证 3台湾居民来往大陆通行证 4外国护照 5其他)")
    private Integer certificateType;

    @ApiModelProperty(value = "证件号码")
    private String certificateNumber;

    @ApiModelProperty(value = "证件有效期")
    private String certificateValidity;

    @ApiModelProperty(value = "出生日期/生日")
    private Date birthday;

    @ApiModelProperty(value = "是否已婚(0是 1否)")
    private Integer ismarry;

    @ApiModelProperty(value = "是否已育(0是 1否)")
    private Integer isfertility;

    @ApiModelProperty(value = "民族")
    private String nation;

    @ApiModelProperty(value = "政治面貌")
    private String politicsStatus;

    @ApiModelProperty(value = "籍贯")
    private String nativePlace;

    @ApiModelProperty(value = "户籍所在地")
    private String householdAddress;

    @ApiModelProperty(value = "户籍地址")
    private String householdPlace;

    @ApiModelProperty(value = "户口性质(1城镇户口 2农村户口 3居民户口)")
    private Integer householdType;

    @ApiModelProperty(value = "参加工作时间")
    private Date workTime;

    @ApiModelProperty(value = "血型")
    private String bloodType;

    @ApiModelProperty(value = "健康状况")
    private String healthCondition;

    @ApiModelProperty(value = "健康证有效期")
    private String healthValidity;

      @TableField(fill = FieldFill.INSERT)
    private Date createdate;

    private Long createuser;

      @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updatedate;

    private Long updateuser;

    @ApiModelProperty(value = "是否删除(0未删除 1已删除)")
    @TableLogic
    private Integer isdel;


}
