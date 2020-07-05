package com.techsoft.technolink.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techsoft.technolink.bean.AdminSignUp;
import com.techsoft.technolink.entity.AdminSignUpEntity;
import com.techsoft.technolink.repository.AdminRepository;
import com.techsoft.technolink.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public int adminRegisteration(AdminSignUp adminSignUp) {
		String methodName = "adminRegisteration";
		AdminSignUpEntity signUpEntity = new AdminSignUpEntity();

		signUpEntity.setContactNo(adminSignUp.getContactNo());
		signUpEntity.setEmailId(adminSignUp.getEmailId());
		signUpEntity.setFirstName(adminSignUp.getFirstName());
		signUpEntity.setFullName(adminSignUp.getFullName());
		signUpEntity.setGender(adminSignUp.getGender());
		// signUpEntity.setId(adminSignUp.getId());
		signUpEntity.setRoleId(1);
		signUpEntity.setRoleName("principal");
		signUpEntity.setLastName(adminSignUp.getLastName());
		AdminSignUpEntity recordId = adminRepository.save(signUpEntity);

		return 1;
	}

}
