package refatova.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

import javax.servlet.http.Cookie;


/**
 * Created by Saniye on 21.09.16.
 */
public interface LoginServiceIntfAsync {

    void login(String username, String password, String locale, AsyncCallback<Void> async);
}
