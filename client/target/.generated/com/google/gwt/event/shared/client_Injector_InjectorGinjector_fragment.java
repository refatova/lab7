package com.google.gwt.event.shared;

import com.google.gwt.core.client.GWT;
import client.client_Injector_InjectorGinjector;

public class client_Injector_InjectorGinjector_fragment {
  public void memberInject_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$(com.google.gwt.event.shared.SimpleEventBus injectee) {
    
  }
  
  
  /**
   * Binding for com.google.gwt.event.shared.EventBus declared at:
   *   client.InjectorModule.configure(InjectorModule.java:19)
   */
  public com.google.gwt.event.shared.EventBus get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$() {
    com.google.gwt.event.shared.EventBus result = get_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$();
    return result;
    
  }
  
  
  /**
   * Binding for com.google.gwt.event.shared.SimpleEventBus declared at:
   *   Implicit GWT.create binding for com.google.gwt.event.shared.SimpleEventBus
   */
  public com.google.gwt.event.shared.SimpleEventBus get_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$() {
    Object created = GWT.create(com.google.gwt.event.shared.SimpleEventBus.class);
    assert created instanceof com.google.gwt.event.shared.SimpleEventBus;
    com.google.gwt.event.shared.SimpleEventBus result = (com.google.gwt.event.shared.SimpleEventBus) created;
    
    memberInject_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$(result);
    
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
