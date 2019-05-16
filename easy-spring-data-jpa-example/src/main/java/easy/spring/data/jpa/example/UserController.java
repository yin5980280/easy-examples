package easy.spring.data.jpa.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import easy.spring.data.jpa.example.entity.User;
import easy.spring.data.jpa.example.repository.UserRepository;

/**
 * @author : yinlin
 * @version : 1.0
 * @date : 2019-05-16 18:33
 * @Description :
 * @Copyright : Copyright (c) 2018
 * @Company : EasySite Technology Chengdu Co. Ltd.
 * @link : easy.spring.data.jpa.example.UserController
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("users")
    public List<User> all() {
        return userRepository.findAll();
    }

    @GetMapping("user")
    public User findByName(@RequestParam("name") String name) {
        return userRepository.findByName(name);
    }
}
