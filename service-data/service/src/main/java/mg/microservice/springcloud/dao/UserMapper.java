package mg.microservice.springcloud.dao;

import mg.microservice.springcloud.model.User;

import java.util.List;


/**
 * 这个接口只做数据库字段与实体类的映射，sql语句与接口方法的映射
 */

public interface UserMapper {

    List<User> selectAllUser();

    User selectUserById(int id);

    User selectUserByName(String name);

    void deleteUserById(int id);

    void deleteUserByName(String name);
}
