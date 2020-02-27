package vn.com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.com.spring.model.UsersModel;
import vn.com.spring.service.impl.UserService;

import java.util.List;

@RestController
@RequestMapping("api/spring-pg/")
public class UsersController {

    @Autowired
    private UserService iUserService;

    @GetMapping("user")
    public List<UsersModel> getAllUser() {
        return iUserService.getAllUser();
    }
}
