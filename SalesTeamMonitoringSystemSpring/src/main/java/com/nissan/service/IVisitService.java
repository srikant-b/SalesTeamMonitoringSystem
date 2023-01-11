package com.nissan.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nissan.commons.APIResponse;
import com.nissan.entity.Visit;

@Service
public interface IVisitService {
	
	 APIResponse listAllVisits();
	
	 APIResponse addVisits(Visit newVisit);

}
