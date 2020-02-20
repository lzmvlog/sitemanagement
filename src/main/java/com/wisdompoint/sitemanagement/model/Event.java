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
 * @data： 2019年12月26日 14:09
 * @Description： 违规事件
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@ApiModel(value = "Event", description = "违规事件")
public class Event implements Serializable {

    private static final long serialVersionUID = 5360195426157074483L;

    /**
     * 违规事件id
     */
    @ApiModelProperty(name = "id", value = "违规事件的编号")
    private String id;

    /**
     * 违规内存
     */
    @NotNull(message = "违规内容不能为空")
    @ApiModelProperty(name = "context", value = "违规内容")
    private String context;

    /**
     * 违规代码
     */
    @NotNull(message = "违规代码不能为空")
    @ApiModelProperty(name = "code", value = "违规代码")
    private String code;

    /**
     * 违规级别
     */
    @NotNull(message = "违规级别不能为空")
    @ApiModelProperty(name = "level", value = "违规级别")
    private String level;

    /**
     * 备注
     */
    @ApiModelProperty(name = "remark", value = "备注")
    private String remark;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(name = "id", value = "createTime", dataType = "date")
    private Date createTime;

    /**
     * 显示状态
     *
     * @see com.wisdompoint.sitemanagement.util.em.StatusEnum
     */
    @ApiModelProperty(name = "status", value = "状态", dataType = "Integer")
    private Integer status;

}
