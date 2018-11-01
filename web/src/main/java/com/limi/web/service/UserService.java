package com.limi.web.service;

import com.limi.web.entity.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @Author Limi Pan
 * @Date 2018-10-25 17:58
 * @Version v1.0
 */
@Service
public class UserService {

    Map<Long, User> users = new HashMap<>();

    public User queryUserById(Long id) {
        return users.get(id);
    }


    public void saveUser(User user) {
        users.put(user.getId(), user);
    }

    public void updateUser(User user) {
        users.put(user.getId(), user);
    }


    public void deleteUserById(Long id) {
        users.remove(id);
    }
}
