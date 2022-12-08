package com.study.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;


public class DTO {
	private DTO() {}

	public static Map<String, String> getParms(HttpServletRequest request) {
		Map<String, String> dataMap = new HashMap<>();
		
		Set<String> keySet = request.getParameterMap().keySet();
		keySet.forEach(key -> {
			dataMap.put(key, request.getParameter(key));
		});
		
		return dataMap;
	}
	
}
