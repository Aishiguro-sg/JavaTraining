package com.s_giken.training.webapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.s_giken.training.webapp.model.Member;
import com.s_giken.training.webapp.model.MemberSearchCondition;
import com.s_giken.training.webapp.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {
    private MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    @Override
    public Optional<Member> findById(int memberId) {
        return memberRepository.findById(memberId);
    }

    @Override
    public List<Member> findByConditions(MemberSearchCondition memberSearchCondition) {
        return memberRepository.findByMailLikeAndNameLike(
                "%" + memberSearchCondition.getMail() + "%",
                "%" + memberSearchCondition.getName() + "%");
    }

    /*
     * 料金情報検索画面
     * 
     * @Override
     * public List<Member> findByConditions(MemberSearchCondition
     * memberSearchCondition) {
     * return memberRepository.findByChargeLike(
     * "%" + memberSearchCondition.getCharge() + "%");
     * }
     * 
     */

    @Override
    public void save(Member member) {
        memberRepository.save(member);
    }

    @Override
    public void deleteById(int memberId) {
        memberRepository.deleteById(memberId);
    }
}
