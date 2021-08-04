package com.hp.controller;

import com.alibaba.fastjson.JSON;
import com.hp.bean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "UserServlet",urlPatterns = "/UserServlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.service(req, resp);
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");
        //创建一个layui后台的json格式
        ArrayList<User> users = new ArrayList<>();
        User u1 = new User();
        u1.setId(1);
        u1.setBid("[009]");
        u1.setName("");
        u1.setNumber(4);
        u1.setLevel("高危");
        u1.setDomainname("www.baidu.com");
        u1.setDomaintype("用户名遍历漏洞，人以文字....");
        users.add(u1);

        User u2 = new User();
        u2.setId(2);
        u2.setBid("[008]");
        u2.setName("");
        u2.setNumber(4);
        u2.setLevel("高危");
        u2.setDomainname("www.baidu.com");
        u2.setDomaintype("用户名遍历漏洞，人以文字....");
        users.add(u2);

        User u3 = new User();
        u3.setId(3);
        u3.setBid("[007]");
        u3.setName("");
        u3.setNumber(4);
        u3.setLevel("高危");
        u3.setDomainname("www.baidu.com");
        u3.setDomaintype("用户名遍历漏洞，人以文字....");
        users.add(u3);

        User u4 = new User();
        u4.setId(4);
        u4.setBid("[006]");
        u4.setName("");
        u4.setNumber(4);
        u4.setLevel("高危");
        u4.setDomainname("www.baidu.com");
        u4.setDomaintype("用户名遍历漏洞，人以文字....");
        users.add(u4);

        User u5 = new User();
        u5.setId(5);
        u5.setBid("[005]");
        u5.setName("");
        u5.setNumber(4);
        u5.setLevel("高危");
        u5.setDomainname("www.baidu.com");
        u5.setDomaintype("用户名遍历漏洞，人以文字....");
        users.add(u5);

        User u6 = new User();
        u6.setId(6);
        u6.setBid("[004]");
        u6.setName("");
        u6.setNumber(4);
        u6.setLevel("高危");
        u6.setDomainname("www.baidu.com");
        u6.setDomaintype("用户名遍历漏洞，人以文字....");
        users.add(u6);

        User u7 = new User();
        u7.setId(7);
        u7.setBid("[003]");
        u7.setName("");
        u7.setNumber(4);
        u7.setLevel("高危");
        u7.setDomainname("www.baidu.com");
        u7.setDomaintype("用户名遍历漏洞，人以文字....");
        users.add(u7);

        User u8 = new User();
        u8.setId(8);
        u8.setBid("[002]");
        u8.setName("");
        u8.setNumber(4);
        u8.setLevel("高危");
        u8.setDomainname("www.baidu.com");
        u8.setDomaintype("用户名遍历漏洞，人以文字....");
        users.add(u8);

        User u9 = new User();
        u9.setId(9);
        u9.setBid("[001]");
        u9.setName("");
        u9.setNumber(4);
        u9.setLevel("高危");
        u9.setDomainname("www.baidu.com");
        u9.setDomaintype("用户名遍历漏洞，人以文字....");
        users.add(u9);

        Map map = new HashMap<>();
        map.put("code",0);
        map.put("msg","写啥都行");
        map.put("count",50);
        map.put("data",users);
        String s = JSON.toJSONString(map);
        PrintWriter writer = resp.getWriter();
        writer.println(s);
        writer.close();
    }
}
