package com.vmware.cloud.demo.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vmware.cloud.demo.user.model.User;
import com.vmware.cloud.demo.user.repository.UserRepository;

@Service
public class UserService {
	
    @Autowired
    private UserRepository repo;

    public User getUser(String id) {
        return repo.findById(id).get();
    }

    public void createUser(User user){
        repo.save(user);
    }

    public void updateUser(User user){
    	repo.save(user);
    }

    public void deleteUser(String id){
    	repo.deleteById(id);
    }

}
