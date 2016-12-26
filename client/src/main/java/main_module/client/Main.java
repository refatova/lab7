package main_module.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.LocaleInfo;
import com.google.gwt.user.client.Cookies;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;
import main_module.client.ui.HomePageView;
import main_module.client.ui.HomePageViewImpl;
import refatova.client.GreetingMessageIntf;
import refatova.client.GreetingMessageIntfAsync;

/**
 * Created by Saniye on 10.11.16.
 */
public class Main implements EntryPoint {

    private final GreetingMessageIntfAsync greetingservice = GWT.create(GreetingMessageIntf.class);

    public void onModuleLoad() {
        String s = Cookies.getCookie("logged_user");
        if (s!=null) {
            AsyncCallback<String> callback = new AsyncCallback<String>() {
                @Override
                public void onFailure(Throwable caught) {
                    System.out.println("error");
                }

                @Override
                public void onSuccess(String result) {
                    HomePageView homePageView = new HomePageViewImpl();
                    homePageView.setExitButtonText();
                    homePageView.setGreetingMessage(result + " " + s);
                    RootPanel.get("content_home").add(homePageView);
                }
            };
            greetingservice.getGreeting(LocaleInfo.getCurrentLocale().getLocaleName(), callback);
        }
        else{
            Window.open("Help.html","","");
        }
    }
}
