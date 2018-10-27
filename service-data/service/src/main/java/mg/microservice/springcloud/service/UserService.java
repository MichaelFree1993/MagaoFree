package mg.microservice.springcloud.service;

import mg.microservice.springcloud.model.User;

import java.util.List;

public interface UserService {

    List<User> selectAllUser();

    User selectUserById(int id);

    User selectUserByName(String name);

    void deleteUserById(int id);

    void deleteUserByName(String name);
}
