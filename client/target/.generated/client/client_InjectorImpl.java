package client;

public class client_InjectorImpl implements client.Injector {
  
  /**
   * Top-level injector instance for injector interface client.Injector.
   */
  private final client_Injector_InjectorGinjector fieldclient_Injector_InjectorGinjector = new client_Injector_InjectorGinjector(this);
  public client_InjectorImpl() {
    
  }
  
  public com.google.gwt.event.shared.EventBus getEventBus() {
    return fieldclient_Injector_InjectorGinjector.getFragment_com_google_gwt_event_shared().get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$();
  }
  
  public client.ui.LoginPageView getLoginPageView() {
    return fieldclient_Injector_InjectorGinjector.getFragment_client_ui().get_Key$type$client$ui$LoginPageView$_annotation$$none$$();
  }
  
  public client.ui.HomePageView gethomePageView() {
    return fieldclient_Injector_InjectorGinjector.getFragment_client_ui().get_Key$type$client$ui$HomePageView$_annotation$$none$$();
  }
  
}
