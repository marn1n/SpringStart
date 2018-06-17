package ua.com.me.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.me.dao.UserDAO;
import ua.com.me.models.User;
@Service
public class UserSerivceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    public UserSerivceImpl() {
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void save(String name) {
        if(!name.isEmpty() && name != null) {
            userDAO.save(new User(name));
        }
    }
}
