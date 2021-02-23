package org.xsm.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index {

	@RequestMapping("/index/{userName}")
	public String index(@PathVariable("userName")String userName) {
		return "欢迎光临：" + userName;
	}
}
