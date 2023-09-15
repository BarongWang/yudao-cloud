package cn.iocoder.yudao.module.code.controller.admin;

import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: CodeTestController
 *
 * @author BaronWang
 * @date 2023/9/15 16:01
 */
@Tag(name = "编码后台-test")
@RestController
@RequestMapping("/code/test")
@Validated
public class CodeTestController {

    @GetMapping("/get")
    @Operation(summary = "获取test运行信息")
    public CommonResult<String> get() {
        return CommonResult.success("code服务运行成功");
    }

}
