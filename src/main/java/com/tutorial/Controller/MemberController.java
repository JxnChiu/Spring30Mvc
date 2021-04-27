package com.tutorial.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tutorial.Dao.MemberRepository;
import com.tutorial.Model.MemberAccount;
import com.tutorial.Model.MemberAccountJPA;
import com.tutorial.Service.MemberService;

@Controller
public class MemberController {

	@Autowired
	MemberAccount memberAccount;

	@Autowired
	MemberRepository memberRepository;

	@Autowired
	MemberService memberService;

	@GetMapping("/login")
	public String login(@ModelAttribute MemberAccountJPA memberAccountJPA) {
		return "login";
	}

	@PostMapping("/doLogin")
	public String doLogin(@ModelAttribute MemberAccountJPA memberAccountJPA) {
		System.out.println(
				memberRepository.findCheckMemberAccount(memberAccountJPA.getEmail(), memberAccountJPA.getPassword()));
		return "welcome";
	}

	@GetMapping("/addMemberPage")
	public String addMemberPage() {
		List<MemberAccountJPA> memberAccountJPA = new ArrayList<MemberAccountJPA>();
		memberAccountJPA = memberRepository.findAll();

		for (int i = 0; i < memberAccountJPA.size(); i++) {
			System.out.println(memberAccountJPA.get(i).getId());
		}

		return "addMemberPage";
	}

	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		memberAccount = new MemberAccount();
		memberAccount.setPassword("1234");
		memberAccount.setEmail("test@gmail.com");
		memberAccount.setCellphone("0912345678");
		memberAccount.setAddress("台北市");

		memberService.addMember(memberAccount);
		return "新增會員成功";
	}

}
