package login_module.client.mvp;


import login_module.client.ClientFactory;
import login_module.client.activity.LoginActivity;
import login_module.client.place.LoginPlace;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;



/**
 * Created by Saniye on 27.10.16.
 */
public class AppActivityMapper  implements ActivityMapper {

    private ClientFactory clientFactory;

    public AppActivityMapper(ClientFactory clientFactory) {
        super();
        this.clientFactory = clientFactory;
    }

    @Override
    public Activity getActivity(Place place) {
         if (place instanceof LoginPlace)
            return new LoginActivity(clientFactory);

        return null;
    }
}
