package client.ui;

import com.google.gwt.core.client.GWT;
import client.client_Injector_InjectorGinjector;

public class client_Injector_InjectorGinjector_fragment {
  public void memberInject_Key$type$client$ui$HomePageViewImpl$_annotation$$none$$(client.ui.HomePageViewImpl injectee) {
    
  }
  
  public void memberInject_Key$type$client$ui$LoginPageViewImpl$_annotation$$none$$(client.ui.LoginPageViewImpl injectee) {
    
  }
  
  
  /**
   * Binding for client.ui.HomePageView declared at:
   *   client.InjectorModule.configure(InjectorModule.java:20)
   */
  public client.ui.HomePageView get_Key$type$client$ui$HomePageView$_annotation$$none$$() {
    client.ui.HomePageView result = get_Key$type$client$ui$HomePageViewImpl$_annotation$$none$$();
    return result;
    
  }
  
  
  /**
   * Binding for client.ui.LoginPageView declared at:
   *   client.InjectorModule.configure(InjectorModule.java:21)
   */
  public client.ui.LoginPageView get_Key$type$client$ui$LoginPageView$_annotation$$none$$() {
    client.ui.LoginPageView result = get_Key$type$client$ui$LoginPageViewImpl$_annotation$$none$$();
    return result;
    
  }
  
  
  /**
   * Binding for client.ui.HomePageViewImpl declared at:
   *   Implicit GWT.create binding for client.ui.HomePageViewImpl
   */
  public client.ui.HomePageViewImpl get_Key$type$client$ui$HomePageViewImpl$_annotation$$none$$() {
    Object created = GWT.create(client.ui.HomePageViewImpl.class);
    assert created instanceof client.ui.HomePageViewImpl;
    client.ui.HomePageViewImpl result = (client.ui.HomePageViewImpl) created;
    
    memberInject_Key$type$client$ui$HomePageViewImpl$_annotation$$none$$(result);
    
    return result;
    
  }
  
  
  /**
   * Binding for client.ui.LoginPageViewImpl declared at:
   *   Implicit GWT.create binding for client.ui.LoginPageViewImpl
   */
  public client.ui.LoginPageViewImpl get_Key$type$client$ui$LoginPageViewImpl$_annotation$$none$$() {
    Object created = GWT.create(client.ui.LoginPageViewImpl.class);
    assert created instanceof client.ui.LoginPageViewImpl;
    client.ui.LoginPageViewImpl result = (client.ui.LoginPageViewImpl) created;
    
    memberInject_Key$type$client$ui$LoginPageViewImpl$_annotation$$none$$(result);
    
    return result;
    
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final client_Injector_InjectorGinjector injector;
  public client_Injector_InjectorGinjector_fragment(client_Injector_InjectorGinjector injector) {
    this.injector = injector;
  }
  
}
