package com.lgf.demo.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Delete;

import java.util.Date;
import java.util.concurrent.locks.Condition;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "user_info")
public class User {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;

    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Integer isdel;

    @TableField(fill = FieldFill.INSERT)
    private Date createdate;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updatedate;
}
