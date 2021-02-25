package org.xsm.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author jack.tang
 */
@Controller
@RequestMapping("/spring.do")
public class IndexController {

	@RequestMapping("/index/{userName}")
	@ResponseBody
	public String index(@PathVariable("userName")String userName) {
		return "欢迎光临：" + userName;
	}
}
