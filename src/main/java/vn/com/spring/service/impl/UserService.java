package vn.com.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.spring.mapper.UsersMapper;
import vn.com.spring.model.UsersModel;
import vn.com.spring.service.IUsersService;

import java.util.List;

@Service
public class UserService implements IUsersService {

    @Autowired
    private UsersMapper mapper;

    @Override
    public List<UsersModel>  getAllUser() {
        List<UsersModel> usersModelList = mapper.getAllUser();
        return  usersModelList;
    }
}
