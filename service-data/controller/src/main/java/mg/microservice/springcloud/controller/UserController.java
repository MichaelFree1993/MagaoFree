package mg.microservice.springcloud.controller;

import mg.microservice.springcloud.model.User;
import mg.microservice.springcloud.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    User user = new User(1, 123456, "magao", "123", "13125090700");

    @RequestMapping("/example")
    public String example() {
        return "hello world!";
    }

    @RequestMapping("/rest-example")
    public User restExample() {
        return user;
    }

    @RequestMapping("/query-user")
    public List<User> selectAllUser() throws Exception {
        LOGGER.info("get all users info: begin");
        List<User> users = userService.selectAllUser();
        LOGGER.info("get all users info: end");
        return users;
    }

}