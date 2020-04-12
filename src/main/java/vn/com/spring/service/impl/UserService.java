package vn.com.spring.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.spring.mapper.UsersMapper;
import vn.com.spring.model.UsersModel;
import vn.com.spring.service.IUsersService;

import java.util.List;

@Service
public class UserService implements IUsersService {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UsersMapper mapper;

    @Override
    public List<UsersModel> getAllUser() {
        List<UsersModel> usersModelList = null;
        try {
            usersModelList = mapper.getAllUser();
        } catch (Exception ex) {
            LOGGER.error("Error when get all user" + ex);
        }
        return usersModelList;
    }
}
