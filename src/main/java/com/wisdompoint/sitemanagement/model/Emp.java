package com.wisdompoint.sitemanagement.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @author： ShaoJie
 * @data： 2019年12月17日 11:03
 * @Description： 员工的基础信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@ApiModel(value = "emp", description = "员工信息")
public class Emp implements Serializable {

    private static final long serialVersionUID = 1811915576682885746L;

    /**
     * 员工的编号
     */
    @NotNull
    @ApiModelProperty(name = "id", value = "员工的编号", dataType = "String")
    private String id;

    /**
     * 员工的姓名
     */
    @NotNull(message = "员工姓名不能为空")
    @ApiModelProperty(name = "name", value = "员工的姓名", dataType = "String")
    private String name;

    /**
     * 员工的性别
     */
    @ApiModelProperty(name = "sex", value = "员工的性别", dataType = "Integer")
    private Integer sex;

    /**
     * 员工的职位
     */
    @NotNull(message = "员工职位不能为空")
    @ApiModelProperty(name = "position", value = "员工的职位", dataType = "String")
    private String position;

    /**
     * 是否婚配
     */
    @ApiModelProperty(name = "marriage", value = "marriage", dataType = "Integer")
    private Integer marriage;

    /**
     * 电话号码
     */
    @ApiModelProperty(name = "tel", value = "电话号码", dataType = "String")
    private String tel;

    /**
     * 生日
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @ApiModelProperty(name = "birthday", value = "生日", dataType = "Date")
    private Date birthday;

    /**
     * 身份证号
     */
    @NotNull(message = "员工身份证号不能为空")
    @ApiModelProperty(name = "idCard", value = "idCard", dataType = "String")
    private String idCard;

    /**
     * 居住地址
     */
    @ApiModelProperty(name = "address", value = "居住地址", dataType = "String")
    private String address;

    /**
     * 学历
     */
    @ApiModelProperty(name = "education", value = "学历", dataType = "String")
    private String education;

    /**
     * 邮箱
     */
    @ApiModelProperty(name = "email", value = "邮箱", dataType = "String")
    private String email;

    /**
     * 毕业院校
     */
    @ApiModelProperty(name = "graSchool", value = "毕业院校", dataType = "String")
    private String graSchool;

    /**
     * 记录创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(name = "id", value = "createTime", dataType = "date")
    private Date createTime;

    /**
     * 状态
     *
     * @see com.wisdompoint.sitemanagement.util.em.StatusEnum
     */
    @ApiModelProperty(name = "status", value = "状态", dataType = "Integer")
    private Integer status;

}
