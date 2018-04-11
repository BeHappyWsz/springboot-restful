package wsz.springboot.restful.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import wsz.springboot.restful.domain.User;
import wsz.springboot.restful.service.UserService;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id")Long id){
        return userService.findById(id);
    }

    @ResponseBody
    @RequestMapping(value="/getAll", method = RequestMethod.GET)
    public List<User> getAll(){
        return  userService.getAll();
    }

    @ResponseBody
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public Long saveUser(User user){
        return userService.saveUser(user);
    }

    /**
     *http://localhost:8080/user/user?username=post阿达&password=postdasd阿萨德&age=666&id=3
     * @param user
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public User updateUser(User user){
        return userService.updateUser(user);
    }

    /**
     * http://localhost:8080/user/user/6
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public Long deleteUser(@PathVariable("id")Long id){
        return userService.deleteUser(id);
    }
}
