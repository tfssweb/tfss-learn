package com.tfss.controller;

import com.alibaba.fastjson.JSONObject;
import com.tfss.service.GeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by tfss on 2019/7/14.
 */
@Controller
public class IndexController {
    @Autowired
    public GeneratorService genService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/gen")
    @ResponseBody
    public String generator(HttpServletRequest request) {

        String path = request.getContextPath();
        String basePath = request.getScheme() + "://"
                + request.getServerName() + ":" + request.getServerPort()
                + path + "/";

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", genService.genCode(request));
        jsonObject.put("basepath", basePath);


        return jsonObject.toJSONString();
    }
}
