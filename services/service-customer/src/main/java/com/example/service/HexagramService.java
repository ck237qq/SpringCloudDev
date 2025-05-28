package com.example.service;

import _event.EventMessage;
import hexagram.*;

import java.util.List;



public interface HexagramService {
	
	EventMessage<String> editYaoxiangByHexagramId(EditHexagramDto editHexagramDto);
	
	EventMessage<List<YaoxiangDto>> findYaoxiangByHexagramId(Long hexagram);
	
	EventMessage<List<HexagramNameDto>> findHexagramName();

	EventMessage<List<HexagramDto>> findHexagramDto();
	
	EventMessage<List<HexagramKindDto>> findHexagramKindDto();
	
	EventMessage<String> initHexagramKind();

}
