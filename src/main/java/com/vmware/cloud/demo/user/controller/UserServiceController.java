package com.vmware.cloud.demo.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vmware.cloud.demo.user.model.User;
import com.vmware.cloud.demo.user.service.UserService;

@RestController
@RequestMapping(value="v1/user")
public class UserServiceController {
	
    @Autowired
    private UserService userService;


    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable("id") String id) {
        return userService.getUser(id);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.PUT)
    public void updateUser(@RequestBody User user) {
    	userService.updateUser(user);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.POST)
    public void createUser(@RequestBody User user) {
    	userService.createUser(user);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable("id") String id) {
    	userService.deleteUser(id);
    }

}
