// .ui.xml template last modified: 1478143764000
package client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class LoginPageViewImpl_LoginBinderUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, client.ui.LoginPageViewImpl>, client.ui.LoginPageViewImpl.LoginBinderUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span> <span id='{1}'></span> <span id='{2}'></span>")
    SafeHtml html1(String arg0, String arg1, String arg2);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final client.ui.LoginPageViewImpl owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final client.ui.LoginPageViewImpl owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onClickLogin((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final client.ui.LoginPageViewImpl owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_labelName();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_nameField();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_labelPassword();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_passwordTextBox();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0(), get_domId1(), get_domId2());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private client.ui.LoginPageViewImpl_LoginBinderUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private client.ui.LoginPageViewImpl_LoginBinderUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final client.ui.LoginPageViewImpl_LoginBinderUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (client.ui.LoginPageViewImpl_LoginBinderUiBinderImpl_GenBundle) GWT.create(client.ui.LoginPageViewImpl_LoginBinderUiBinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 2 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private client.ui.LoginPageViewImpl_LoginBinderUiBinderImpl_GenCss_style style;
    private client.ui.LoginPageViewImpl_LoginBinderUiBinderImpl_GenCss_style get_style() {
      return style;
    }
    private client.ui.LoginPageViewImpl_LoginBinderUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());

        get_domId0Element().get();
        get_domId1Element().get();
        get_domId2Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_HTMLPanel1.addAndReplaceElement(get_f_VerticalPanel2(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_loginButton(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_errorMessage(), get_domId2Element().get());

      return f_HTMLPanel1;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId0;
    private java.lang.String get_domId0() {
      return domId0;
    }
    private java.lang.String build_domId0() {
      // Creation section.
      domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId0;
    }

    /**
     * Getter for f_VerticalPanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel2() {
      return build_f_VerticalPanel2();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel2 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel2.add(get_f_HorizontalPanel3());
      f_VerticalPanel2.add(get_f_HorizontalPanel4());

      return f_VerticalPanel2;
    }

    /**
     * Getter for f_HorizontalPanel3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel3() {
      return build_f_HorizontalPanel3();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel3() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel3 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel3.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
      f_HorizontalPanel3.add(get_labelName());
      f_HorizontalPanel3.setCellHorizontalAlignment(get_labelName(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_LEFT);
      f_HorizontalPanel3.setCellVerticalAlignment(get_labelName(), com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
      f_HorizontalPanel3.setCellWidth(get_labelName(), "90px");
      f_HorizontalPanel3.setCellHeight(get_labelName(), "40px");
      f_HorizontalPanel3.add(get_nameField());
      f_HorizontalPanel3.setCellHorizontalAlignment(get_nameField(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
      f_HorizontalPanel3.setCellVerticalAlignment(get_nameField(), com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
      f_HorizontalPanel3.setCellWidth(get_nameField(), "150px");
      f_HorizontalPanel3.setCellHeight(get_nameField(), "40px");

      return f_HorizontalPanel3;
    }

    /**
     * Getter for labelName called 5 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label labelName;
    private com.google.gwt.user.client.ui.Label get_labelName() {
      return labelName;
    }
    private com.google.gwt.user.client.ui.Label build_labelName() {
      // Creation section.
      labelName = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.

      this.owner.labelName = labelName;

      return labelName;
    }

    /**
     * Getter for nameField called 5 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.TextBox nameField;
    private com.google.gwt.user.client.ui.TextBox get_nameField() {
      return nameField;
    }
    private com.google.gwt.user.client.ui.TextBox build_nameField() {
      // Creation section.
      nameField = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      nameField.setName("username");

      this.owner.nameField = nameField;

      return nameField;
    }

    /**
     * Getter for f_HorizontalPanel4 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel4() {
      return build_f_HorizontalPanel4();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel4() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel4 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel4.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
      f_HorizontalPanel4.add(get_labelPassword());
      f_HorizontalPanel4.setCellHorizontalAlignment(get_labelPassword(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_LEFT);
      f_HorizontalPanel4.setCellVerticalAlignment(get_labelPassword(), com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
      f_HorizontalPanel4.setCellWidth(get_labelPassword(), "90px");
      f_HorizontalPanel4.setCellHeight(get_labelPassword(), "40px");
      f_HorizontalPanel4.add(get_passwordTextBox());
      f_HorizontalPanel4.setCellHorizontalAlignment(get_passwordTextBox(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
      f_HorizontalPanel4.setCellVerticalAlignment(get_passwordTextBox(), com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
      f_HorizontalPanel4.setCellWidth(get_passwordTextBox(), "150px");
      f_HorizontalPanel4.setCellHeight(get_passwordTextBox(), "40px");

      return f_HorizontalPanel4;
    }

    /**
     * Getter for labelPassword called 5 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label labelPassword;
    private com.google.gwt.user.client.ui.Label get_labelPassword() {
      return labelPassword;
    }
    private com.google.gwt.user.client.ui.Label build_labelPassword() {
      // Creation section.
      labelPassword = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.

      this.owner.labelPassword = labelPassword;

      return labelPassword;
    }

    /**
     * Getter for passwordTextBox called 5 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.PasswordTextBox passwordTextBox;
    private com.google.gwt.user.client.ui.PasswordTextBox get_passwordTextBox() {
      return passwordTextBox;
    }
    private com.google.gwt.user.client.ui.PasswordTextBox build_passwordTextBox() {
      // Creation section.
      passwordTextBox = (com.google.gwt.user.client.ui.PasswordTextBox) GWT.create(com.google.gwt.user.client.ui.PasswordTextBox.class);
      // Setup section.
      passwordTextBox.setName("password");

      this.owner.passwordTextBox = passwordTextBox;

      return passwordTextBox;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId0Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId0Element() {
      return domId0Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId0Element() {
      // Creation section.
      domId0Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId0());
      // Setup section.

      return domId0Element;
    }

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId1;
    private java.lang.String get_domId1() {
      return domId1;
    }
    private java.lang.String build_domId1() {
      // Creation section.
      domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId1;
    }

    /**
     * Getter for loginButton called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Button get_loginButton() {
      return build_loginButton();
    }
    private com.google.gwt.user.client.ui.Button build_loginButton() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button loginButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      loginButton.setStyleName("" + get_style().buttonStyle() + "");
      loginButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.loginButton = loginButton;

      return loginButton;
    }

    /**
     * Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId1Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId1Element() {
      return domId1Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId1Element() {
      // Creation section.
      domId1Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId1());
      // Setup section.

      return domId1Element;
    }

    /**
     * Getter for domId2 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId2;
    private java.lang.String get_domId2() {
      return domId2;
    }
    private java.lang.String build_domId2() {
      // Creation section.
      domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId2;
    }

    /**
     * Getter for errorMessage called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_errorMessage() {
      return build_errorMessage();
    }
    private com.google.gwt.user.client.ui.Label build_errorMessage() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label errorMessage = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      errorMessage.setStyleName("" + get_style().errorMessageStyle() + "");

      this.owner.errorMessage = errorMessage;

      return errorMessage;
    }

    /**
     * Getter for domId2Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId2Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId2Element() {
      return domId2Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId2Element() {
      // Creation section.
      domId2Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId2());
      // Setup section.

      return domId2Element;
    }
  }
}
