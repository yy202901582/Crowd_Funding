package com.my.crowd.mvc.config;

import com.google.gson.Gson;
import com.my.crowd.constant.CrowdConstant;
import com.my.crowd.exception.LoginAcctAlreadyInUseException;
import com.my.crowd.exception.LoginAcctAlreadyInUseForUpdateException;
import com.my.crowd.exception.LoginFailedException;
import com.my.crowd.util.CrowdUtil;
import com.my.crowd.util.ResultEntity;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//  @ControllerAdvice 表示当前类是基于注解的异常处理类
@ControllerAdvice
public class CrowdExceptionResolver {

    @ExceptionHandler(value = LoginAcctAlreadyInUseForUpdateException.class)
    public ModelAndView LoginAcctAlreadyInUseForUpdateException(
            LoginAcctAlreadyInUseForUpdateException exception,
            HttpServletRequest request,
            HttpServletResponse response) {
        String viewName = "system-error";
        return commonResolve(viewName, exception, request, response);
    }

    @ExceptionHandler(value = LoginAcctAlreadyInUseException.class)
    public ModelAndView resolveLoginAcctAlreadyInUseException(
            LoginAcctAlreadyInUseException exception,
            HttpServletRequest request,
            HttpServletResponse response) {
        String viewName = "admin-add";
        return commonResolve(viewName, exception, request, response);
    }

    @ExceptionHandler(value = LoginFailedException.class)
    public ModelAndView resolveLoginException(
            LoginFailedException exception,
            HttpServletRequest request,
            HttpServletResponse response) {
        String viewName = "admin-login";
        return commonResolve(viewName, exception, request, response);
    }


    @ExceptionHandler(value = ArithmeticException.class)
    public ModelAndView resolveMathException(
            ArithmeticException exception,
            HttpServletRequest request,
            HttpServletResponse response) {
        String viewName = "system-error";
        return commonResolve(viewName, exception, request, response);
    }



    // @ExceptionHandler将一个具体的异常类型和一个方法联系起来
    @ExceptionHandler(value = NullPointerException.class)
    public ModelAndView resolveNullPointException(
            NullPointerException exception,
            HttpServletRequest request,
            HttpServletResponse response){
        String viewName = "system-error";
        return commonResolve(viewName, exception, request, response);
    }

    private ModelAndView commonResolve(
            // 异常处理完成后去的地方
            String viewName,
            // 实际捕捉到的异常类型
            Exception exception,
            //当前请求对象
            HttpServletRequest request,
            // 当前相应对象
            HttpServletResponse response){

        // 获取异常消息
        String message = exception.getMessage();
        //1.判断当前请求的类型
        boolean judgeResult = CrowdUtil.judgeRequestType(request);
        //2.如果是一个ajax请求
        if (judgeResult) {
            //3.创建ResultEntity对象
            ResultEntity<Object> failed = ResultEntity.failed(message);
            //4.创建Gson对象
            Gson gson = new Gson();
            //5.将对象转换为Json字符串
            String json = gson.toJson(failed);
            //6.将Json字符串作为响应体返回给浏览器
            try {
                response.getWriter().write(json);
            } catch (IOException e) {
                e.printStackTrace();
            }
            //7.由于上面已经通过原生response对象返回了响应，所以不提供ModelAndView对象
            return null;
        }
        // 8.不是ajax请求
        ModelAndView modelAndView = new ModelAndView();
        // 9.将exception对象存入模型
        modelAndView.addObject(CrowdConstant.ATTR_NAME_EXCEPTION, exception);
        // 10.设置对应视图
        modelAndView.setViewName(viewName);
        // 11.返回modelAndView
        return modelAndView;
    }
}

