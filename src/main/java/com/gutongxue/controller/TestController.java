package com.gutongxue.controller;

import com.gutongxue.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {
    @RequestMapping("/home")
    public String index() {
        return "jsp/index1";
    }
    @RequestMapping("/goHome")
    public String htmlView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("/WEB-INF/html/home.html").forward(request, response);
        return "html/home";
    }
    @RequestMapping("/returnJson")
    @ResponseBody
    public Result returnJson(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, Object> destMap = new HashMap<>();
        destMap.put("name", "nb");
        destMap.put("age", 32);
        return new Result(Result.STATE_SUCCESS, Result.INFO_SUCCESS, destMap);
    }
    @RequestMapping("/goVue")
    public String goVue(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("/WEB-INF/html/home.html").forward(request, response);
        return "html/vue";
    }
    @RequestMapping("/goFirstVueDemo")
    public String goFirstVueDemo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("/WEB-INF/html/home.html").forward(request, response);
        return "html/firstVueDemo";
    }

    /**
     *  Vue的监听属性demo  watch
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/goVueWatch")
    public String goVueWatch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        return "html/VueWatch";
    }
}
