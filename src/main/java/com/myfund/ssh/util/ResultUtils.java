package com.myfund.ssh.util;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 返回结果转换工具类
 *
 * @author: haocheng
 * @date: 2019-05-17 15:30
 *
 */
public class ResultUtils {
    public static void toJson(HttpServletResponse response, Object data)
            throws IOException {
//        Gson gson = new Gson();
//        String result = gson.toJson(data);
        String result = JSON.toJSONString(data, true);
        response.setContentType("text/json; charset=utf-8");
        response.setHeader("Cache-Control", "no-cache"); //取消浏览器缓存
        PrintWriter out = response.getWriter();
        out.print(result);
        out.flush();
        out.close();
    }
}
