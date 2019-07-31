package application.controller;

import application.model.User;
import application.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {

    @Autowired
    private loginService loginService;

    @RequestMapping(method = RequestMethod.POST, value = "login")
    public Object login(@RequestBody User userLogin){
        return loginService.login(userLogin);
    }

}
