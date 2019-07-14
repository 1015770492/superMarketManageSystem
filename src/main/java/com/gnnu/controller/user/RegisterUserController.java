package com.gnnu.controller.user;

import com.gnnu.entity.user.User;
import com.gnnu.service.user.InsertUserService;
import com.gnnu.service.user.impl.InsertUserServiceImpl;
import com.gnnu.utils.SystemStaticService;
import org.apache.commons.codec.digest.DigestUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/sregister.do")
public class RegisterUserController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //测试实例对象
        req.setCharacterEncoding("utf-8");
        String usname=req.getParameter("uname");
        String password=req.getParameter("upassword");
        DigestUtils.md5Hex(SystemStaticService.PASSWORD);
        // DigestUtils.md5Hex()此方法为加密方法
        String upassword =DigestUtils.md5Hex(password+ SystemStaticService.SOLT);

        //实例user对象
        User user=new User(usname,upassword,"user");

        //实例Service
        InsertUserService insertUserService=new InsertUserServiceImpl();
        //进行保存
        boolean isok=insertUserService.save(user);

        String msg="";
        String url="";
        //根据结果提示用户
        if(isok) {
            //设置成功消息
            msg="注册成功！";
            //设置跳转的地址
            url="login.jsp";
            //把信息保存到request
            req.setAttribute("msg", msg);
            req.setAttribute("url", url);
            //跳转页面
            req.getRequestDispatcher("success.jsp").forward(req, resp);
        }else {
            msg="注册失败！两次密码不一致";
            req.setAttribute("msg", msg);
            req.setAttribute("url",url);
            //跳转页面
            req.getRequestDispatcher("fail.jsp").forward(req, resp);
        }


    }
}
