package com.xulei.yuntobackend.controller;

import com.xulei.yuntobackend.common.BaseResponse;
import com.xulei.yuntobackend.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    /**
     * 健康检查
     * 用于表示项目健康运行
     * 调用接口测试解决跨域问题
     */
    @GetMapping("/health")
    public BaseResponse<String> health() {
        return ResultUtils.success("OK");
    }
}
