package com.hbdev.eventoApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexConroller {
		
	public String Index() {
		return "Hb";
	}
}
