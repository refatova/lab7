package refatova.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


/**
 * Created by Saniye on 21.09.16.
 */
@RemoteServiceRelativePath("login_module")
public interface LoginServiceIntf extends RemoteService {
    void login(String username, String password, String locale) throws Exception;

}
