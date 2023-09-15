package cn.iocoder.yudao.module.code.controller.app;

import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;

/**
 * description: AppCodeTestController
 *
 * @author BaronWang
 * @date 2023/9/15 16:06
 */
@Tag(name = "用户 App - Test")
@RestController
@RequestMapping("/code/test")
@Validated
public class AppCodeTestController {

    @GetMapping("/get")
    @Operation(summary = "获取 test 信息")
    public CommonResult<String> get() {
        return success("app的code服务运行成功");
    }

}
