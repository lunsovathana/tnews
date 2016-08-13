package com.tnews.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/category")
public class CategoryController {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getAllCategories(){
		
		Map<String, Object> body = new HashMap<>();
		
		Map<String, String> cat = new HashMap<>();
		cat.put("ID", "1000");
		cat.put("NAME", "Car");
		
		Map<String, String> cat1 = new HashMap<>();
		cat1.put("ID", "2000");
		cat1.put("NAME", "Phone");
		
		ArrayList<Map<String, String>> arr = new ArrayList<>();
		arr.add(cat);
		arr.add(cat1);
		
		body.put("DATA", arr);
		body.put("COUNT", arr.size());
		
		return new ResponseEntity<Map<String,Object>>(body, HttpStatus.OK);
	}
	
}
