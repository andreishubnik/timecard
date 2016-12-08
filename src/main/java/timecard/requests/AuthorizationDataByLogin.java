package timecard.requests;

/**
 * Created by Shubnik on 09.12.2016.
 */
public class AuthorizationDataByLogin {

    private String login;
    private String password;

    public AuthorizationDataByLogin() {
    }

    public AuthorizationDataByLogin(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
