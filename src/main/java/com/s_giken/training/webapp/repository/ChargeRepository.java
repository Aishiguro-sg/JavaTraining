package com.s_giken.training.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.s_giken.training.webapp.model.Charge;
//import org.springframework.data.jpa.repository.Query;

public interface ChargeRepository extends JpaRepository<Charge, Integer> {

    // public List<Member> findByChargeLike(String charge);
}
