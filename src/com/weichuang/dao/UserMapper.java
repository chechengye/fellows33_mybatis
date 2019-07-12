package com.weichuang.dao;

import com.weichuang.pojo.User;
import com.weichuang.vo.QueryVo;

public interface UserMapper {
    User getUserById(int id);

    void insertUser(User user);

    User getUserByQueryVo(QueryVo vo);
}
