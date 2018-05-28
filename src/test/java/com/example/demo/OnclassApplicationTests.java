package com.example.demo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.service.OnClassService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OnclassApplicationTests {

	@Autowired
	private OnClassService onClassService;
	
	@Test
	public void contextLoads() {
		
	}
	@Test
	public void testSignIn() {
		List<String> list = new ArrayList<>();
		list.add("小明");
		list.add("小红");
		list.add("小强");
		List<String> stu = new ArrayList<>();
		stu.add("小明");
		assertEquals("小明", onClassService.signInService("小明",list,stu));
	}
	@Test
	public void testQuery() {
		List<String> list = new ArrayList<>();
		list.add("小明");
		list.add("小红");
		list.add("小强");
		List<String> stu = new ArrayList<>();
		stu.add("小明");
		assertEquals("小明", onClassService.query("小明",list,stu));
	}
	@Test
	public void testTong() {
		List<String> list = new ArrayList<>();
		list.add("小明");
		list.add("小红");
		list.add("小强");
		List<String> us = new ArrayList<>();
		us.add("小明");
		assertEquals("1", onClassService.count(list));
	}
}
