package com.cxy.controller;



import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cxy.pojo.CxyJSONResult;
import com.cxy.pojo.User;



//@Controller
@RestController				//@RestController = @Controller + @ResponseBody  更方便
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/getUserJSON")
	//@ResponseBody
	public CxyJSONResult getUser() {
		User user = new User();
		user.setName("caixiaoyu");
		user.setPassword("123");
		user.setAge(18);
		user.setBirthday(new Date());
		user.setDesc("嘻嘻嘻");
		return CxyJSONResult.ok(user);
	}
	

}
