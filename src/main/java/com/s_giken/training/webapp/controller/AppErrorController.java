package com.s_giken.training.webapp.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * エラー画面のコントローラークラス
 */
@Controller
@RequestMapping("/error")
public class AppErrorController implements ErrorController {
    /**
     * エラー画面のパスを返す
     * 
     * @param mav TymeLeafに渡すデータとテンプレート名
     * @return エラー画面のMAV
     */
    @RequestMapping
    public ModelAndView error(ModelAndView mav) {
        mav.setViewName("error");
        return mav;
    }
}
