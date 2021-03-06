package service;

import dao.UserDao;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);
    }
    @Transactional
    @Override
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }
    @Transactional
    @Override
    public void editUser(User user) {
        userDao.editUser(user);
    }
    @Transactional(readOnly = true)
    @Override
    public List<User> listAllUsers() {
        return userDao.listAllUsers();
    }
    @Transactional(readOnly = true)
    @Override
    public User getUserByLogin(String login) {
        return userDao.getUserByLogin(login);
    }
    @Transactional(readOnly = true)
    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

}
