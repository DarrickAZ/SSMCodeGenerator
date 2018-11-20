package cn.collabtech.ssmcodegenerator.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Darrick
 * @Date: 2018/10/9 16:45
 * @Description:
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @ApiOperation(value = "测试",notes = "controller测试")
    @GetMapping("/hello")
    public String getAllStudent(){
        return "Hello World.";
    }

}
