package com.s_giken.training.webapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.s_giken.training.webapp.model.Charge;
import com.s_giken.training.webapp.model.ChargeSearchCondition;
import com.s_giken.training.webapp.repository.ChargeRepository;

@Service
public class ChargeServiceImpl implements ChargeService {
    private ChargeRepository chargeRepository;

    public ChargeServiceImpl(ChargeRepository chargeRepository) {
        this.chargeRepository = chargeRepository;
    }

    @Override
    public List<Charge> findAll() {
        return chargeRepository.findAll();
    }

    @Override
    public Optional<Charge> findById(int chargeId) {
        return chargeRepository.findById(chargeId);
    }

    @Override
    public List<Charge> findByConditions(ChargeSearchCondition chargeSearchCondition) {
        return chargeRepository.findByNameLike(
                "%" + chargeSearchCondition.getName() + "%");
    }

    @Override
    public void save(Charge charge) {
        chargeRepository.save(charge);
    }

    @Override
    public void deleteById(int chargeId) {
        chargeRepository.deleteById(chargeId);
    }
}
