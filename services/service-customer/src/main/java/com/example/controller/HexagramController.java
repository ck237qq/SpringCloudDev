package com.example.controller;

import java.util.List;

import _event.EventMessage;
import com.example.service.HexagramService;
import hexagram.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/customer/hexagram")
public class HexagramController {
	

	@Autowired
	private HexagramService hexagramService;
	
	@RequestMapping(value = "/editYaoxiangByHexagramId", method = RequestMethod.PUT)
	public EventMessage<String> editYaoxiangByHexagramId(@RequestBody EditHexagramDto editHexagramDto) {
		return hexagramService.editYaoxiangByHexagramId(editHexagramDto);
	}
	
	@RequestMapping(value = "/findYaoxiangByHexagramId", method = RequestMethod.GET)
	public EventMessage<List<YaoxiangDto>> findYaoxiangByHexagramId(Long hexagramId) {
		return hexagramService.findYaoxiangByHexagramId(hexagramId);
	}
	
	@RequestMapping(value = "/findHexagramName", method = RequestMethod.GET)
	public EventMessage<List<HexagramNameDto>> findHexagramName() {
		return hexagramService.findHexagramName();
	}

	@RequestMapping(value = "/findHexagramDto", method = RequestMethod.GET)
	public EventMessage<List<HexagramDto>> findHexagramDto() {
		return hexagramService.findHexagramDto();
	}
	
	@RequestMapping(value = "/findHexagramKindDto", method = RequestMethod.GET)
	public EventMessage<List<HexagramKindDto>> findHexagramKindDto() {
		return hexagramService.findHexagramKindDto();
	}
	
	
	/** 初始化卦象表 */
	@RequestMapping(value = "/initHexagram", method = RequestMethod.GET)
	public EventMessage<String> initHexagram() {	
		return hexagramService.initHexagramKind();
	}

}
