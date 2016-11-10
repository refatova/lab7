package client;

import client.ui.HomePageView;
import client.ui.HomePageViewImpl;
import client.ui.LoginPageView;
import client.ui.LoginPageViewImpl;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.AbstractGinModule;



/**
 * Created by Saniye on 31.10.16.
 */
public class InjectorModule extends AbstractGinModule {
    @Override
    protected void configure() {
        bind(EventBus.class).to(SimpleEventBus.class);
        bind(HomePageView.class).to(HomePageViewImpl.class);
        bind(LoginPageView.class).to(LoginPageViewImpl.class);
    }
}
