package client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class HomePageViewImpl_MyBinderUiBinderImpl_GenBundle_uk_InlineClientBundleGenerator implements client.ui.HomePageViewImpl_MyBinderUiBinderImpl_GenBundle {
  private static HomePageViewImpl_MyBinderUiBinderImpl_GenBundle_uk_InlineClientBundleGenerator _instance0 = new HomePageViewImpl_MyBinderUiBinderImpl_GenBundle_uk_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new client.ui.HomePageViewImpl_MyBinderUiBinderImpl_GenCss_style() {
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
        return (".GIEE-TUDB{color:" + ("black")  + ";padding:" + ("5px")  + ";}.GIEE-TUDA{margin:" + ("10px")  + ";padding:" + ("3px"+ " " +"10px")  + ";background:" + ("orange")  + ";}");
      }
      public java.lang.String buttonStyle() {
        return "GIEE-TUDA";
      }
      public java.lang.String messageStyle() {
        return "GIEE-TUDB";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static client.ui.HomePageViewImpl_MyBinderUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public client.ui.HomePageViewImpl_MyBinderUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static client.ui.HomePageViewImpl_MyBinderUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@client.ui.HomePageViewImpl_MyBinderUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
