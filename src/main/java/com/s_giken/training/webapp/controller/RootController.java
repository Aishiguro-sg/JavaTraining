package com.s_giken.training.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

/**
 * ルートパスのコントローラークラス
 */
@Controller
@RequestMapping("/")
public class RootController {
	/**
	 * ルートパスにアクセスされた場合の処理
	 * 
	 * @return トップ画面のテンプレート名
	 */
	@GetMapping("/")
	public String hello() {
		return "top";
	}

	/**
	 * ログイン画面を表示する
	 * 
	 * @return ログイン画面のテンプレート名
	 */
	@GetMapping("/login")
	public String login() {
		return "login";
	}
}