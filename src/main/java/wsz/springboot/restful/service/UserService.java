package wsz.springboot.restful.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wsz.springboot.restful.dao.UserDao;
import wsz.springboot.restful.domain.User;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User findById(Long id){
        return userDao.findById(id);
    }

    public List<User> getAll(){
        return userDao.getAll();
    }

    public Long saveUser(User user){
        userDao.saveUser(user);
        return user.getId();
    }

    public User updateUser(User user){
        userDao.updateUser(user);
        return user;
    }

    public Long deleteUser(Long id){
        return userDao.deleteUser(id);
    }
}
