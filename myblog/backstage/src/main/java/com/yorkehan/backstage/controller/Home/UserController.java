package com.yorkehan.backstage.controller.Home;

import com.yorkehan.backstage.service.UserService;
import com.yorkehan.backstage.util.Functions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户的controller
 * Created by 言曌 on 2017/8/24.
 */
@Controller
public class UserController {

	@Autowired
	private HttpServletRequest request;

	@Autowired
	private UserService userService;

	@Autowired
	private Functions functions;








}
