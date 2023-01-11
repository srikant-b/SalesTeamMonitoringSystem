package com.nissan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.commons.APIResponse;
import com.nissan.service.IVisitService;

@CrossOrigin
@RestController
@RequestMapping("/api/visits")
public class VisitController {

	@Autowired
	private IVisitService visitService;

	@GetMapping
	public ResponseEntity<com.nissan.commons.APIResponse> listAllVisits() {
		APIResponse apiResponse = visitService.listAllVisits();
		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
	}
}
