package com.gnnu.controller.user;

import com.gnnu.entity.user.User;
import com.gnnu.service.user.CheckUserService;
import com.gnnu.service.user.impl.CheckUserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login.do")
public class CheckUserLoginController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String uname=req.getParameter("uname");
        String upassword=req.getParameter("upassword");
        String uwork="";

        User user=new User(uname,upassword,uwork);// 前端数据绑定到实体

        CheckUserService checkUserService=new CheckUserServiceImpl();
        int uid = checkUserService.checkUidByPassword(user);// 检测账号密码

        String msg="";
        String url="";

        if(uid>0) {
            //设置成功消息
            msg="登录成功！";
            HttpSession session=req.getSession();
            session.setAttribute("uid",uid);// 设置登录状态

            //设置跳转的地址
            if(uwork.equals("user")){
                url="all.do";
            }else {
                url = "Manager.jsp";
            }
            //把信息保存到request
            req.setAttribute("msg", msg);
            req.setAttribute("uname",uname);
            req.setAttribute("url", url);

            //跳转页面
            req.getRequestDispatcher("success.jsp").forward(req, resp);
        }else {
            msg="登陆失败！密码不正确或者用户与密码不匹配！";
            req.setAttribute("msg", msg);
            //跳转页面
            req.getRequestDispatcher("fail.jsp").forward(req, resp);
        }

    }
}
