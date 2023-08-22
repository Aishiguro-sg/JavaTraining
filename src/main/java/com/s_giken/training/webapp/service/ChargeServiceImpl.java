package com.s_giken.training.webapp.service;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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

    @Override // メソッド
    public List<Charge> findByConditions(ChargeSearchCondition chargeSearchCondition) {

        String colname = chargeSearchCondition.getSortColName();
        String order = chargeSearchCondition.getSortOrder();
        Direction direction = null;
        if (order.equals("asc")) {
            direction = Direction.ASC;
        } else {
            direction = Direction.DESC;
        }
        Sort sort = Sort.by(direction, colname);
        return chargeRepository.findByNameLike(
                "%" + chargeSearchCondition.getName() + "%", sort);
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
