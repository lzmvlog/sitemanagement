package com.wisdompoint.sitemanagement.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author： ShaoJie
 * @data： 2020年02月20日 14:55
 * @Description： 资信
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@ApiModel(value = "credit", description = "员工资信")
public class Credit implements Serializable {

    private static final long serialVersionUID = 4089948935655257196L;

    /**
     * 资信编号
     */
    @NotNull
    @ApiModelProperty(name = "id", value = "资信编号", dataType = "String")
    private String id;

    /**
     * 员工的编号
     */
    @NotNull
    @ApiModelProperty(name = "empId", value = "员工的编号", dataType = "String")
    private String empId;

    /**
     * 资信分
     */
    @NotNull
    @ApiModelProperty(name = "minute", value = "资信分", dataType = "String")
    private String minute;

    /**
     * 状态
     *
     * @see com.wisdompoint.sitemanagement.util.em.StatusEnum
     */
    @ApiModelProperty(name = "status", value = "状态", dataType = "Integer")
    private Integer status;
}
