package cn.wang.jenkins.github;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Index {
	@RequestMapping(value="index")
	@ResponseBody
	public String toIndex(){
		return "hello,jenkins for github!!hahahahaha";
	}
}
