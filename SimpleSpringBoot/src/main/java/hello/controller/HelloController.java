package hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
public class HelloController {

	@ApiOperation(value="hello",notes="hello")
	@ApiImplicitParams({
		@ApiImplicitParam(name="name",value="userName",required=true,dataType="String",paramType="UserInfo"),
		@ApiImplicitParam(name="pass",value="passWord",required=true,dataType="String")
	})
    @RequestMapping("/")
    public String hello(){
        return "Greetings from Spring Boot!";
    }
}