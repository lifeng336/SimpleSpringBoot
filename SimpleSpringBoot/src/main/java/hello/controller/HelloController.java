package hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
@Api(value="第一个实例")
@RestController
@RequestMapping("/hello")
public class HelloController {

	@ApiOperation(value="登陆",notes="登陆")
	@ApiImplicitParams({
		@ApiImplicitParam(name="name",value="用户名",required=true,dataType="String",paramType="query"),
		@ApiImplicitParam(name="pass",value="密码",required=true,dataType="String",paramType="query")
	})
    @RequestMapping(value="/login",method= {RequestMethod.POST})
    public String login(String name,String pass){
        return "name="+name+",password="+pass;
    }
}