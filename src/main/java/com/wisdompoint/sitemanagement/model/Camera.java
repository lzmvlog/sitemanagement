package com.wisdompoint.sitemanagement.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;

/**
 * @author： ShaoJie
 * @data： 2019年12月31日 10:38
 * @Description： 摄像头信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@ApiModel(value = "camera", description = "摄像头信息")
public class Camera {

    /**
     * 摄像头的编号
     */
    @NotNull
    @ApiModelProperty(name = "id", value = "摄像头的编号", dataType = "String")
    private String id;

    @ApiModelProperty(name = "address", value = "摄像头地点", dataType = "String")
    private String address;

    @ApiModelProperty(name = "ip", value = "摄像头ip", dataType = "String")
    private String ip;

    @ApiModelProperty(name = "name", value = "摄像头名称", dataType = "String")
    private String name;

    /**
     * 状态
     *
     * @see com.wisdompoint.sitemanagement.util.em.StatusEnum
     */
    @ApiModelProperty(name = "status", value = "状态", dataType = "Integer")
    private Integer status;

}
