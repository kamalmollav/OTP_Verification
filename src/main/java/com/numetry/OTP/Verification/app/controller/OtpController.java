package com.numetry.OTP.Verification.app.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.numetry.OTP.Verification.app.entity.User;

@RestController
public class OtpController {
	@PostMapping("/MobileNo")
	public String sendOtp(@RequestBody User user) {
		try {
			System.out.println(user.getPhoneNumber());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return "Successfully OTP Send Your Mobile";
	}
}
