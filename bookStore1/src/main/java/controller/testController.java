package controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
	
	@Value("1.0.0")
	private String appVersions;
	
	
	@RequestMapping("/app")
	public Map<String, String> getstatus() {
	    Map<String, String> map = new HashMap<>();
	    map.put("app version", appVersions);
	    return map;
	}



}
