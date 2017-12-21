package com.xiaopotian.demo.service;

import com.xiaopotian.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zoulu on 2017-12-21.
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserName(String userName);
    User findByUserNameOrEmail(String userName,String email);
}
