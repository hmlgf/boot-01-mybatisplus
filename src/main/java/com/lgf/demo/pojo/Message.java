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
 * 消息通知表 
 * </p>
 *
 * @author lgf
 * @since 2021-09-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Message对象", description="消息通知表 ")
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "创建人")
    @TableField("CREATED_BY")
    private String createdBy;

    @ApiModelProperty(value = "创建时间")
    @TableField("CREATED_TIME")
    private Date createdTime;

    @ApiModelProperty(value = "发送人")
    private Long fuid;

    @ApiModelProperty(value = "接收人")
    private Long juid;

    @ApiModelProperty(value = "消息主体")
    private String mainText;

    @ApiModelProperty(value = "id")
      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "消息主题")
    private String titleText;

    @ApiModelProperty(value = "消息类型（1索要 2录入 3合同 4财务收付款 5票单）")
    private Integer messageType;

    @ApiModelProperty(value = "消息状态 1未读 2已读")
    private Integer state;

    @TableLogic
    private Integer isdel;

    @ApiModelProperty(value = "创建时间")
      @TableField(fill = FieldFill.INSERT)
    private Date createdate;

    @ApiModelProperty(value = "修改时间")
      @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updatedate;

    @ApiModelProperty(value = "版本号")
    @Version
    private Integer version;


}
