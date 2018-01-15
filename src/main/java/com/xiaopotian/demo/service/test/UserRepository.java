package com.xiaopotian.demo.service.test;

import com.xiaopotian.demo.domain.User;
import com.xiaopotian.demo.service.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zoulu on 2017-12-21.
 */
public interface UserRepository extends BaseRepository<User> {
    User findByUserName(String userName);

    User findByUserNameOrEmail(String userName, String email);
}
