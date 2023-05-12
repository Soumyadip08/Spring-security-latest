package com.security.services;
import com.security.models.User;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {
    List<User> list = new ArrayList<>();

    public UserService() {
        list.add(new User("Soumyadip08" , "soumyadip" , "soumyadipmallick8@gmail.com"));
        list.add(new User("Ankita" , "ankita" , "ankita.roy@gmail.com"));
    }

    //get all users
    public List<User> getAllUsers(){
        return this.list;
    }
    // get single user
    public User getUser(String username){
        return this.list.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);
    }
    // add new User
    public User addUser(User user){
        this.list.add(user);
        return user;
    }

}
