package com.myfund.ssh.action;

import com.google.gson.Gson;
import com.myfund.ssh.service.RankService;
import com.myfund.ssh.util.ResultUtils;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

@Controller("rankAction")
//表示每接收一个请求都创建一个Action对象
@Scope("prototype")
public class RankAction extends ActionSupport {
    //注入service业务层接口
    @Resource
    private RankService rankService;

    public String getRank() throws IOException {
        List rankInfo = rankService.getRankInfo();

//        Map<String, Object> session = ActionContext.getContext().getSession();
//        session.put("rankInfo", rankInfo);

        //以json格式返回数据给前端
        ResultUtils.toJson(ServletActionContext.getResponse(), rankInfo);
        return null;
    }
}
