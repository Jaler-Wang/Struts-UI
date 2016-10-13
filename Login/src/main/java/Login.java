import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by U0148394 on 10/11/2016.
 */


public class Login extends ActionSupport implements SessionAware{
    private String userName = null;
    private Map session = null;
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String login() throws Exception {
        System.out.println("login");
        session.put("user", userName);
        return SUCCESS;
    }

    public String showList(){
        return "list";
    }
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
