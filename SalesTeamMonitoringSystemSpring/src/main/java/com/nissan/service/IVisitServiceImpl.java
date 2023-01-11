package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nissan.commons.APIResponse;
import com.nissan.dao.VisitDao;
import com.nissan.entity.Visit;

@Service
@Transactional
public class IVisitServiceImpl implements IVisitService {

	@Autowired
	public VisitDao visitDao;

	// get all visits
	@Override
	public APIResponse listAllVisits() {

		APIResponse apiResponse = new APIResponse();

		List<Visit> listVisit = visitDao.findAll();

		if (listVisit.isEmpty()) {
			apiResponse.setStatus(HttpStatus.NOT_FOUND.value());
			apiResponse.setError("No One Visited or not found on the database!!!");
		} else {
			apiResponse.setData(listVisit);
		}

		return apiResponse;

	}

	@Override
	public APIResponse addVisits(Visit newVisit) {

		APIResponse apiResponse = new APIResponse();

		visitDao.save(newVisit);

		apiResponse.setData("Visitor " + Visit.getCust_name() + " added to the database successfully!!!");

		return apiResponse;
	}

}
