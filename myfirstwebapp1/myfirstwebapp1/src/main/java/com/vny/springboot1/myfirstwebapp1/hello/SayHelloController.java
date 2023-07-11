package com.vny.springboot1.myfirstwebapp1.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    //http://localhost:8122/say-hello
    @RequestMapping("say-hello")
    @ResponseBody //@ResponseBody is used to return whatever in the Body
	public String sayhello(){
        return "Hellow ! What are u learning ?";
    }

    //jsp
    //"say-hello-jsp"-->sayHello.jsp
    //src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
    @RequestMapping("say-hello-jsp")
   // @ResponseBody //@ResponseBody is used to return whatever in the Body
    //so we remove responsebody here
    public String sayhelloJsp(){
        return "sayHello";
    }


}
