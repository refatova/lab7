package client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class LoginPageViewImpl_LoginBinderUiBinderImpl_GenBundle_uk_InlineClientBundleGenerator implements client.ui.LoginPageViewImpl_LoginBinderUiBinderImpl_GenBundle {
  private static LoginPageViewImpl_LoginBinderUiBinderImpl_GenBundle_uk_InlineClientBundleGenerator _instance0 = new LoginPageViewImpl_LoginBinderUiBinderImpl_GenBundle_uk_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new client.ui.LoginPageViewImpl_LoginBinderUiBinderImpl_GenCss_style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return (".GIEE-TUDD{color:" + ("red")  + ";padding:" + ("5px")  + ";}.GIEE-TUDC{margin:" + ("10px")  + ";padding:" + ("3px"+ " " +"10px")  + ";background:" + ("orange")  + ";}");
      }
      public java.lang.String buttonStyle() {
        return "GIEE-TUDC";
      }
      public java.lang.String errorMessageStyle() {
        return "GIEE-TUDD";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static client.ui.LoginPageViewImpl_LoginBinderUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public client.ui.LoginPageViewImpl_LoginBinderUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static client.ui.LoginPageViewImpl_LoginBinderUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@client.ui.LoginPageViewImpl_LoginBinderUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
