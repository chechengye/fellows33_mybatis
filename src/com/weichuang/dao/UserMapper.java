package com.weichuang.dao;

import com.weichuang.pojo.User;
import com.weichuang.vo.QueryVo;

import java.util.List;

public interface UserMapper {
    User getUserById(int id);

    void insertUser(User user);

    User getUserByQueryVo(QueryVo vo);

    int getCountForUser();

    List<User> getUsersByNameAndSex(User user);

    //List<User> getUsersByIds(List<Integer> ids);
    List<User> getUsersByIds(Integer[] ids);

    List<User> getUsersByQueryVo(QueryVo vo);

    List<User> getUsersByOBM();
}
