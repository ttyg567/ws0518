package com.kbstar.mapper;

import com.kbstar.dto.User;
import com.kbstar.frame.AespaMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper extends AespaMapper<String, User> {

    public List<User> getallusercart() throws Exception;
    public void updatepwd(User user);

}
