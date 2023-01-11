package com.nissan.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nissan.entity.Visit;

public interface VisitDao extends JpaRepository<Visit, Long> {

}
