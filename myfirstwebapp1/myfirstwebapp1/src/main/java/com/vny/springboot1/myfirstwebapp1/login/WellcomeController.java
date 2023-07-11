package com.vny.springboot1.myfirstwebapp1.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WellcomeController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String goToWellcomePage(ModelMap model){
        model.put("name", getLoggedinUsername() );
        return "wellcome";

    }

    private String getLoggedinUsername(){
        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();
        return  authentication.getName();
    }

    //    private AuthenticationService authentication;
//    public LoginController(AuthenticationService authentication) {
//        this.authentication = authentication;
//    }

    //    @RequestMapping(value = "login", method = RequestMethod.POST)
//    public String goToWellcomePage(@RequestParam String name,
//                                   @RequestParam String password, ModelMap model){
//
//        if(AuthenticationService.authentication(name,password)) {
//            model.put("name", name);
//            model.put("password", password);
//         //if credentials are valid return welcome
//            return "wellcome";
//        }
//        model.put("errorMsg","Invalid credentials ");
//        //if credentials are not valid return Loginpage
//        return "login";
//
//    }




}
