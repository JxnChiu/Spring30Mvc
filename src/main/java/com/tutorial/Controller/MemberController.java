package com.tutorial.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.tutorial.Model.MemberAccount;
import com.tutorial.Service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	MemberAccount memberAccount;
	
	@Autowired
	MemberService memberService;
	
	@GetMapping("/addMemberPage")
	public String addMemberPage() {
		return "addMemberPage";
	}
	
//	@RequestMapping("/")
//	public String hello() {
//		memberAccount = new MemberAccount();
//		memberAccount.setPassword("12345678");
//		memberAccount.setEmail("test@gmail.com");
//		memberAccount.setCellphone("0912345678");
//		memberAccount.setAddress("台北市");
//		
//		memberService.addMember(memberAccount);
//		return "新增會員成功";
//	}
	
	
}
