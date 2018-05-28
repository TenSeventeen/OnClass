package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.service.OnClassService;

@Configuration
public class OnClassController {
	@Autowired
	private OnClassService onClassService;

	@Bean
	public String ready() {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("杜迪");
		list.add("赵滨");
		list.add("肖明");
		Scanner scanner = new Scanner(System.in);
		List<String> stu = new ArrayList<>();
        String sc;
	
	while (true) {
		System.out.println("sign");
		System.out.println("query");
		System.out.println("count");
		System.out.println("请输入您选择的服务:");
		sc = scanner.next();
		while (sc.equals("sign")) {
			System.out.println("请输入签到姓名：");
			String name = scanner.next();
			String na=onClassService.signInService(name, list, stu);
			System.out.println("输入n退出签到");
			String selected = scanner.next();
			if (selected.equals("n")) {
				break;
			}
		}
		while (sc.equals("query")) {
			System.out.println("请输入要查询的学生姓名：");
			String name1 = scanner.next();
			String na1=onClassService.query(name1,list,stu);
			System.out.println("输入n退出查询");
			String what = scanner.next();
			if (what.equals("n")) {
				break;
			}
		}
		if (sc.equals("count")) {
			int i=onClassService.count(stu);
			System.out.println("已签到人数："+i);
		}
	}
  }
}