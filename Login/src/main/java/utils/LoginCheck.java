package utils;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.interceptor.Interceptor;

import java.util.Map;

/**
 * Created by U0148394 on 10/13/2016.
 */
public class LoginCheck implements Interceptor {
    public void destroy() {

    }

    public void init() {

    }

    public String intercept(ActionInvocation actionInvocation) throws Exception {
        ActionContext invocationContext = actionInvocation.getInvocationContext();
        Map<String, Object> session = invocationContext.getSession();
        ActionProxy proxy = actionInvocation.getProxy();
        String method = proxy.getMethod();
        if(!method.equals("login")){
            if(session.get("user") == null){
                return "login";
            }
        }

        return actionInvocation.invoke();

    }
}
