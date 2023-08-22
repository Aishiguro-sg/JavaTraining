package com.s_giken.training.webapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChargeSearchCondition {
    private String name;
    private String charge;
    // 料金名検索用メンバ変数を用意
    private String sortColName = "";
    private String sortOrder = "";
}
