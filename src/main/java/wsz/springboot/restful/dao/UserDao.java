package wsz.springboot.restful.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import wsz.springboot.restful.domain.User;

import java.util.List;

@Mapper
@Repository
public interface UserDao {

    List<User> getAll();
    User findById(Long id);

    Long saveUser(User user);

    Long updateUser(User user);

    Long deleteUser(Long id);
}
