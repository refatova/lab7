package client;

public class client_Injector_InjectorGinjector {
  
  /**
   * The implementation of interface client.Injector
   */
  private final client.Injector fieldGinjectorInterface;
  public client.Injector getGinjectorInterface() {
    return fieldGinjectorInterface;
  }
  
  
  /**
   * Injector fragment for com.google.gwt.event.shared
   */
  private com.google.gwt.event.shared.client_Injector_InjectorGinjector_fragment fieldFragment_com$google$gwt$event$shared = null;
  /**
   * Getter for injector fragment for com.google.gwt.event.shared
   */
  public com.google.gwt.event.shared.client_Injector_InjectorGinjector_fragment getFragment_com_google_gwt_event_shared() {
    if (fieldFragment_com$google$gwt$event$shared == null) {
        fieldFragment_com$google$gwt$event$shared = new com.google.gwt.event.shared.client_Injector_InjectorGinjector_fragment(this);
    }
    
    return fieldFragment_com$google$gwt$event$shared;
  }
  
  
  /**
   * Injector fragment for client.ui
   */
  private client.ui.client_Injector_InjectorGinjector_fragment fieldFragment_client$ui = null;
  /**
   * Getter for injector fragment for client.ui
   */
  public client.ui.client_Injector_InjectorGinjector_fragment getFragment_client_ui() {
    if (fieldFragment_client$ui == null) {
        fieldFragment_client$ui = new client.ui.client_Injector_InjectorGinjector_fragment(this);
    }
    
    return fieldFragment_client$ui;
  }
  
  public client_Injector_InjectorGinjector(client.Injector fieldGinjectorInterface) {
    this.fieldGinjectorInterface = fieldGinjectorInterface;
  }
  
}
