package com.myfund.ssh.action;

import com.myfund.ssh.entity.User;
import com.myfund.ssh.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 调用业务逻辑，结合struts.xml来进行处理页面跳转
 * 
 * @author: haocheng
 * @date: 2019-05-15 15:31
 * 
 */
@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport {

    //注入service业务层接口
    @Resource
    private UserService userService;


    private User user;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String login(){
        if (userService.login(user)){
            Map<String, Object> session = ActionContext.getContext().getSession();
            session.put("user", user);
            return SUCCESS;
        }else {
            return ERROR;
        }
    }
}
