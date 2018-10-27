package mg.microservice.springcloud.impl;

import mg.microservice.springcloud.dao.UserMapper;
import mg.microservice.springcloud.model.User;
import mg.microservice.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 对dao方法进行组合，对外提供服务
 *
 * 增加事物的操作
 */

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAllUser() {
        return userMapper.selectAllUser();
    }

    @Override
    public User selectUserById(int id) {
        return userMapper.selectUserById(id);
    }

    @Override
    public User selectUserByName(String name) {
        return userMapper.selectUserByName(name);
    }

    @Override
    public void deleteUserById(int id) {
        userMapper.deleteUserById(id);
    }

    @Override
    public void deleteUserByName(String name) {
        userMapper.deleteUserByName(name);
    }
}
