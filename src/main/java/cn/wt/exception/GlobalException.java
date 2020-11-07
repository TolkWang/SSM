package cn.wt.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(value = {RuntimeException.class})
    public ModelAndView handleException01(RuntimeException globalException) {
        System.out.println("出现异常..");
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("ex", globalException);
        return modelAndView;
    }
}
