package com.imoyu;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("---------------TestServlet doGet From Web4");

        Map<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        String json = new Gson().toJson(map);

        resp.getWriter().println(json);
        resp.getWriter().print("Hi from TestServlet doGet method\r\n");
        resp.getWriter().print("path: " + this.getClass().getResource("/").getPath());
    }

}