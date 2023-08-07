package com.s_giken.training.webapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberSearchCondition {
    private String mail;
    private String name;
    private String charge;
    // 氏名検索用メンバ変数を用意
}
