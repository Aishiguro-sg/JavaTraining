package com.s_giken.training.webapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * リソースが見つからない場合の例外クラス
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {
    /**
     * コンストラクタ
     * 
     * @param message エラーメッセージ
     */
    public NotFoundException(String message) {
        super(message);
    }
}
