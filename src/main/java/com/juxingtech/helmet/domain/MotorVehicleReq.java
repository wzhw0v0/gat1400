package com.juxingtech.helmet.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author haoxr
 * @date 2020-07-03
 **/

@ApiModel
@Data
public class MotorVehicleReq {

    @ApiModelProperty(value = "设备ID", example = "13030421191190201061", required = true)
    private String deviceId;

    @ApiModelProperty(value = "车牌图片(base64编码格式)", example = "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", required = true)
    private String image;

    @ApiModelProperty(value = "车牌颜色", example = "蓝", required = true)
    private String plateColor;

    @ApiModelProperty(value = "车牌号", example = "沪A88888", required = true)
    private String plateNo;
}
