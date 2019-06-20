package com.vmware.cloud.demo.user.service;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.BDDMockito.*;
import com.vmware.cloud.demo.user.model.User;
import com.vmware.cloud.demo.user.service.UserService;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
	
	@Mock
	UserService userService;
	
	@Test
	public void testGetUser() {
		//when(userService.getUser("1")).thenReturn(new User());
		//assertEquals("Josh Snow", userService.getUser("1").getName());
	}

}
