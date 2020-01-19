package com.fh.bean.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@TableName("jq_user")
@Data
public class User {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private Double salary;
    private Integer jobId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date showTime;
    private Integer deptId;
    private String userName;
    private String leaderName;
}
