package vn.com.spring.mapper;

import org.apache.ibatis.annotations.Mapper;
import vn.com.spring.model.UsersModel;

import java.util.List;

@Mapper
public interface UsersMapper {
    List<UsersModel> getAllUser();
}
