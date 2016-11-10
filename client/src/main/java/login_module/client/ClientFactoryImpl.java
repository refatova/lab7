package login_module.client;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import login_module.client.ClientFactory;


/**
 * Created by Saniye on 27.10.16.
 */
public class ClientFactoryImpl implements ClientFactory
{
    private static final EventBus eventBus = Injector.INSTANCE.getEventBus();
    private static final PlaceController placeController = new PlaceController(eventBus);

    @Override
    public EventBus getEventBus()
    {
        return eventBus;
    }

    @Override
    public PlaceController getPlaceController()
    {
        return placeController;
    }


}
