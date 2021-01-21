package com.imoyu;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("---------------TestServlet doGet");

        resp.getWriter().print("Hi from TestServlet doGet method\r\n");
        resp.getWriter().print("path: " + this.getClass().getResource("/").getPath());
    }

}
