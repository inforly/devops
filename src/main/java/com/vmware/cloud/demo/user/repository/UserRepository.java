package com.vmware.cloud.demo.user.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vmware.cloud.demo.user.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,String> {

}
