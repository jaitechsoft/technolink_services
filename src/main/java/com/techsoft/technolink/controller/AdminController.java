package com.techsoft.technolink.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techsoft.technolink.bean.AdminSignUp;
import com.techsoft.technolink.bean.ResponseBean;
import com.techsoft.technolink.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired(required = true)
	private AdminService adminService;

	@RequestMapping(value = "/registration", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public ResponseEntity<?> adminRegisteration(@RequestBody AdminSignUp adminSignUp) {

		String methodName = "adminRegisteration";
		ResponseBean bean = new ResponseBean();

		ResponseEntity<?> entity = null;
		int recordId = adminService.adminRegisteration(adminSignUp);
		if (recordId != 0) {
			bean.setMessage("Admin Registration Succesfully Inserted");
			bean.setStatus(true);
			entity = new ResponseEntity<>(bean, HttpStatus.OK);
		} else {
			bean.setMessage("Admin Registration Not Inserted Succesfully");
			bean.setStatus(false);
			entity = new ResponseEntity<>(bean, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return entity;

	}

}
