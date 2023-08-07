package com.s_giken.training.webapp.model;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "T_CHARGE") // 対応するデータベーステーブル名
@Data // メンバー変数に対するゲッター・セッターを自動生成
@NoArgsConstructor // 引数のないコンストラクタを自動生成
@AllArgsConstructor // 全てのメンバ変数に対する引数を持つコンストラクタを自動生成
public class Charge {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "charge_id") // 料金ID
    private int chargeId;

    @Column(name = "name") // 料金名
    @NotNull
    @NotBlank
    private String name;

    @Column(name = "type") // 種別
    @NotNull
    private int type;

    @Column(name = "amount") // 料金
    @NotNull
    private String amount;

    @Column(name = "start_date") // 適用開始日
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private Date startDate;

    @Column(name = "end_date") // 適用終了日
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;

    // 確定

    // キャンセル

    @CreatedDate
    private Timestamp createdDate;

    @LastModifiedDate
    private Timestamp updatedDate;
}
