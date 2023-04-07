package study.part1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.model.Model;

// 컨트롤러를 JSON을 반환하는 컨트롤러로 만들어 줌 @Controller + @ResponseBody 어노테이션임
//@RestController

@Controller
public class HelloController {
    
    @GetMapping("hello") // HTTP Get 요청을 받을 수 있는 API를 만들어 줌
//    @ResponseBody // 해당 어노테이션이 없으면 return "index2"; => index2 템플릿 파일 반환
    public String test() {
//        return "Hello World";
        return "index2";
    }
    
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(value = "name", required = false, defaultValue = "Empty") String name, org.springframework.ui.Model model) {
            model.addAttribute("name", name);
            return "hello";
    }
}