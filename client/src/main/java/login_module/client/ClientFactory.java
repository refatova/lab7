package login_module.client;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;


/**
 * Created by Saniye on 27.10.16.
 */
public interface ClientFactory
{
    EventBus getEventBus();
    PlaceController getPlaceController();

}
