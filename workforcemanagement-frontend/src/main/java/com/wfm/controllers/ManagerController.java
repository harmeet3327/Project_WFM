package com.wfm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wfm.models.ResAssignmentReq;
import com.wfm.services.RequestAssignmentDaoService;

@Controller
public class ManagerController {
	
@Autowired RequestAssignmentDaoService reqService;


@RequestMapping(value="/req",method=RequestMethod.GET)

public String reqForm(ModelMap map)

{
	map.addAttribute("reqObj",new ResAssignmentReq());
	return "ManagerRequest";
}


}
