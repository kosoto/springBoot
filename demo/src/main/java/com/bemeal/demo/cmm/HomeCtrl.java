package com.bemeal.demo.cmm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bemeal.demo.mbr.MemberService;

@Controller
public class HomeCtrl {
	@Autowired MemberService mbrService;
	@GetMapping
	@RequestMapping("/")
	public String home(Model model) {
		System.out.println("----1----");
		String count = mbrService.countAll();
		System.out.println("회원수는 총 "+count+"입니다");
		model.addAttribute("count",count);
		return "index";
	}
	@GetMapping
	@RequestMapping("/pieChart")
	public String pieChart(Model model) {
		System.out.println("----pieChart----");
		return "util/pieChart";
	}
	@GetMapping
	@RequestMapping("/wordCloud")
	public String wordCloud(Model model) {
		System.out.println("----wordCloud----");
		return "util/wordCloud";
	}
	@GetMapping
	@RequestMapping("/gmap")
	public String gmap(Model model) {
		System.out.println("----gmap----");
		return "util/gmap";
	}
	@GetMapping
	@RequestMapping("/initmap")
	public String initmap(Model model) {
		System.out.println("----initmap----");
		return "util/initmap";
	}
}
