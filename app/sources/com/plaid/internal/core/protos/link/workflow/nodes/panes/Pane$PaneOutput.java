package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCardsPaneOuterClass$ButtonWithCardsPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.C6894xa350b647;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.QrCodePane$QRCodePane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Pane$PaneOutput extends GeneratedMessageLite<Pane$PaneOutput, C6730a> implements InterfaceC6928o0 {
    public static final int BUTTON_FIELD_NUMBER = 105;
    public static final int BUTTON_LIST_FIELD_NUMBER = 106;
    public static final int BUTTON_WITH_ACCORDION_FIELD_NUMBER = 107;
    public static final int BUTTON_WITH_CARDS_FIELD_NUMBER = 108;
    public static final int BUTTON_WITH_TABLE_FIELD_NUMBER = 109;
    public static final int BUTTON_WITH_WEBVIEW_FIELD_NUMBER = 110;
    public static final int CHALLENGE_FIELD_NUMBER = 117;
    public static final int CLIENT_SUBMISSION_FIELD_NUMBER = 165;
    public static final int CONSENT_FIELD_NUMBER = 104;
    public static final int CREDENTIALS_FIELD_NUMBER = 103;
    private static final Pane$PaneOutput DEFAULT_INSTANCE;
    public static final int FLEXIBLE_FIELD_NUMBER = 128;
    public static final int GRID_SELECTION_FIELD_NUMBER = 114;
    public static final int HEADLESS_O_AUTH_FIELD_NUMBER = 120;
    public static final int IDENTITY_DATA_SHARING_FIELD_NUMBER = 151;
    public static final int LOADING_FIELD_NUMBER = 131;
    public static final int OAUTH_FIELD_NUMBER = 115;
    public static final int ORDERED_LIST_FIELD_NUMBER = 116;
    public static final int PANE_NODE_ID_FIELD_NUMBER = 2;
    public static final int PANE_RENDERING_ID_FIELD_NUMBER = 1;
    private static volatile Parser<Pane$PaneOutput> PARSER = null;
    public static final int PROFILE_AUTHENTICATION_FIELD_NUMBER = 167;
    public static final int QR_CODE_FIELD_NUMBER = 125;
    public static final int SEARCH_AND_SELECT_FIELD_NUMBER = 111;
    public static final int SESSION_HANDOFF_FIELD_NUMBER = 136;
    public static final int SINK_FIELD_NUMBER = 102;
    public static final int SOURCE_FIELD_NUMBER = 101;
    public static final int USER_INPUT_FIELD_NUMBER = 112;
    public static final int USER_SELECTION_FIELD_NUMBER = 113;
    public static final int VARIABLE_HEIGHT_BUTTON_FIELD_NUMBER = 144;
    public static final int VARIABLE_HEIGHT_VERIFICATION_CODE_INPUT_FIELD_NUMBER = 147;
    private Object output_;
    private int outputCase_ = 0;
    private String paneRenderingId_ = "";
    private String paneNodeId_ = "";

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput$b */
    public enum EnumC6731b {
        SOURCE(101),
        SINK(102),
        CREDENTIALS(103),
        CONSENT(104),
        BUTTON(105),
        BUTTON_LIST(106),
        BUTTON_WITH_ACCORDION(107),
        BUTTON_WITH_CARDS(108),
        BUTTON_WITH_TABLE(109),
        BUTTON_WITH_WEBVIEW(110),
        SEARCH_AND_SELECT(111),
        USER_INPUT(112),
        USER_SELECTION(113),
        GRID_SELECTION(114),
        OAUTH(115),
        ORDERED_LIST(116),
        CHALLENGE(117),
        HEADLESS_O_AUTH(120),
        QR_CODE(125),
        FLEXIBLE(128),
        LOADING(131),
        SESSION_HANDOFF(136),
        VARIABLE_HEIGHT_BUTTON(144),
        VARIABLE_HEIGHT_VERIFICATION_CODE_INPUT(147),
        IDENTITY_DATA_SHARING(151),
        CLIENT_SUBMISSION(165),
        PROFILE_AUTHENTICATION(167),
        OUTPUT_NOT_SET(0);


        /* renamed from: a */
        public final int f2431a;

        EnumC6731b(int i) {
            this.f2431a = i;
        }

        public static EnumC6731b forNumber(int i) {
            switch (i) {
                case 0:
                    return OUTPUT_NOT_SET;
                case 120:
                    return HEADLESS_O_AUTH;
                case 125:
                    return QR_CODE;
                case 128:
                    return FLEXIBLE;
                case 131:
                    return LOADING;
                case 136:
                    return SESSION_HANDOFF;
                case 144:
                    return VARIABLE_HEIGHT_BUTTON;
                case 147:
                    return VARIABLE_HEIGHT_VERIFICATION_CODE_INPUT;
                case 151:
                    return IDENTITY_DATA_SHARING;
                case 165:
                    return CLIENT_SUBMISSION;
                case 167:
                    return PROFILE_AUTHENTICATION;
                default:
                    switch (i) {
                        case 101:
                            return SOURCE;
                        case 102:
                            return SINK;
                        case 103:
                            return CREDENTIALS;
                        case 104:
                            return CONSENT;
                        case 105:
                            return BUTTON;
                        case 106:
                            return BUTTON_LIST;
                        case 107:
                            return BUTTON_WITH_ACCORDION;
                        case 108:
                            return BUTTON_WITH_CARDS;
                        case 109:
                            return BUTTON_WITH_TABLE;
                        case 110:
                            return BUTTON_WITH_WEBVIEW;
                        case 111:
                            return SEARCH_AND_SELECT;
                        case 112:
                            return USER_INPUT;
                        case 113:
                            return USER_SELECTION;
                        case 114:
                            return GRID_SELECTION;
                        case 115:
                            return OAUTH;
                        case 116:
                            return ORDERED_LIST;
                        case 117:
                            return CHALLENGE;
                        default:
                            return null;
                    }
            }
        }

        public int getNumber() {
            return this.f2431a;
        }

        @Deprecated
        public static EnumC6731b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Pane$PaneOutput pane$PaneOutput = new Pane$PaneOutput();
        DEFAULT_INSTANCE = pane$PaneOutput;
        GeneratedMessageLite.registerDefaultInstance(Pane$PaneOutput.class, pane$PaneOutput);
    }

    private Pane$PaneOutput() {
    }

    private void clearButton() {
        if (this.outputCase_ == 105) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearButtonList() {
        if (this.outputCase_ == 106) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearButtonWithAccordion() {
        if (this.outputCase_ == 107) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearButtonWithCards() {
        if (this.outputCase_ == 108) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearButtonWithTable() {
        if (this.outputCase_ == 109) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearButtonWithWebview() {
        if (this.outputCase_ == 110) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearChallenge() {
        if (this.outputCase_ == 117) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearClientSubmission() {
        if (this.outputCase_ == 165) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearConsent() {
        if (this.outputCase_ == 104) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearCredentials() {
        if (this.outputCase_ == 103) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearFlexible() {
        if (this.outputCase_ == 128) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearGridSelection() {
        if (this.outputCase_ == 114) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearHeadlessOAuth() {
        if (this.outputCase_ == 120) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearIdentityDataSharing() {
        if (this.outputCase_ == 151) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearLoading() {
        if (this.outputCase_ == 131) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearOauth() {
        if (this.outputCase_ == 115) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearOrderedList() {
        if (this.outputCase_ == 116) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearOutput() {
        this.outputCase_ = 0;
        this.output_ = null;
    }

    private void clearPaneNodeId() {
        this.paneNodeId_ = getDefaultInstance().getPaneNodeId();
    }

    private void clearPaneRenderingId() {
        this.paneRenderingId_ = getDefaultInstance().getPaneRenderingId();
    }

    private void clearProfileAuthentication() {
        if (this.outputCase_ == 167) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearQrCode() {
        if (this.outputCase_ == 125) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearSearchAndSelect() {
        if (this.outputCase_ == 111) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearSessionHandoff() {
        if (this.outputCase_ == 136) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearSink() {
        if (this.outputCase_ == 102) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearSource() {
        if (this.outputCase_ == 101) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearUserInput() {
        if (this.outputCase_ == 112) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearUserSelection() {
        if (this.outputCase_ == 113) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearVariableHeightButton() {
        if (this.outputCase_ == 144) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearVariableHeightVerificationCodeInput() {
        if (this.outputCase_ == 147) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    public static Pane$PaneOutput getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeButton(ButtonPaneOuterClass$ButtonPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ != 105 || this.output_ == ButtonPaneOuterClass$ButtonPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = ButtonPaneOuterClass$ButtonPane.Actions.newBuilder((ButtonPaneOuterClass$ButtonPane.Actions) this.output_).mergeFrom((ButtonPaneOuterClass$ButtonPane.Actions.C6315b) actions).buildPartial();
        }
        this.outputCase_ = 105;
    }

    private void mergeButtonList(ButtonListPaneOuterClass$ButtonListPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ != 106 || this.output_ == ButtonListPaneOuterClass$ButtonListPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = ButtonListPaneOuterClass$ButtonListPane.Actions.newBuilder((ButtonListPaneOuterClass$ButtonListPane.Actions) this.output_).mergeFrom((ButtonListPaneOuterClass$ButtonListPane.Actions.C6305b) actions).buildPartial();
        }
        this.outputCase_ = 106;
    }

    private void mergeButtonWithAccordion(ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ != 107 || this.output_ == ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions.newBuilder((ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions) this.output_).mergeFrom((ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions.C6324b) actions).buildPartial();
        }
        this.outputCase_ = 107;
    }

    private void mergeButtonWithCards(ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ != 108 || this.output_ == ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Actions.newBuilder((ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Actions) this.output_).mergeFrom((ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Actions.C6334b) actions).buildPartial();
        }
        this.outputCase_ = 108;
    }

    private void mergeButtonWithTable(ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ != 109 || this.output_ == ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions.newBuilder((ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions) this.output_).mergeFrom((ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions.C6344b) actions).buildPartial();
        }
        this.outputCase_ = 109;
    }

    private void mergeButtonWithWebview(ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ != 110 || this.output_ == ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Actions.newBuilder((ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Actions) this.output_).mergeFrom((ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Actions.C6355b) actions).buildPartial();
        }
        this.outputCase_ = 110;
    }

    private void mergeChallenge(ChallengePaneOuterClass$ChallengePane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ != 117 || this.output_ == ChallengePaneOuterClass$ChallengePane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = ChallengePaneOuterClass$ChallengePane.Actions.newBuilder((ChallengePaneOuterClass$ChallengePane.Actions) this.output_).mergeFrom((ChallengePaneOuterClass$ChallengePane.Actions.C6364b) actions).buildPartial();
        }
        this.outputCase_ = 117;
    }

    private void mergeClientSubmission(ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ != 165 || this.output_ == ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions.newBuilder((ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions) this.output_).mergeFrom((ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions.C6377b) actions).buildPartial();
        }
        this.outputCase_ = 165;
    }

    private void mergeConsent(ConsentPaneOuterClass$ConsentPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ != 104 || this.output_ == ConsentPaneOuterClass$ConsentPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = ConsentPaneOuterClass$ConsentPane.Actions.newBuilder((ConsentPaneOuterClass$ConsentPane.Actions) this.output_).mergeFrom((ConsentPaneOuterClass$ConsentPane.Actions.C6562b) actions).buildPartial();
        }
        this.outputCase_ = 104;
    }

    private void mergeCredentials(CredentialsPaneOuterClass$CredentialsPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ != 103 || this.output_ == CredentialsPaneOuterClass$CredentialsPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = CredentialsPaneOuterClass$CredentialsPane.Actions.newBuilder((CredentialsPaneOuterClass$CredentialsPane.Actions) this.output_).mergeFrom((CredentialsPaneOuterClass$CredentialsPane.Actions.C6582b) actions).buildPartial();
        }
        this.outputCase_ = 103;
    }

    private void mergeFlexible(FlexiblePaneOuterClass$FlexiblePane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ != 128 || this.output_ == FlexiblePaneOuterClass$FlexiblePane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = FlexiblePaneOuterClass$FlexiblePane.Actions.newBuilder((FlexiblePaneOuterClass$FlexiblePane.Actions) this.output_).mergeFrom((FlexiblePaneOuterClass$FlexiblePane.Actions.C6608b) actions).buildPartial();
        }
        this.outputCase_ = 128;
    }

    private void mergeGridSelection(GridSelectionPaneOuterClass$GridSelectionPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ != 114 || this.output_ == GridSelectionPaneOuterClass$GridSelectionPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = GridSelectionPaneOuterClass$GridSelectionPane.Actions.newBuilder((GridSelectionPaneOuterClass$GridSelectionPane.Actions) this.output_).mergeFrom((GridSelectionPaneOuterClass$GridSelectionPane.Actions.C6626b) actions).buildPartial();
        }
        this.outputCase_ = 114;
    }

    private void mergeHeadlessOAuth(HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ != 120 || this.output_ == HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.newBuilder((HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions) this.output_).mergeFrom((HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.C6635b) actions).buildPartial();
        }
        this.outputCase_ = 120;
    }

    private void mergeIdentityDataSharing(IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ != 151 || this.output_ == IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Actions.newBuilder((IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Actions) this.output_).mergeFrom((IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Actions.C6648b) actions).buildPartial();
        }
        this.outputCase_ = 151;
    }

    private void mergeLoading(LoadingPaneOuterClass$LoadingPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ != 131 || this.output_ == LoadingPaneOuterClass$LoadingPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = LoadingPaneOuterClass$LoadingPane.Actions.newBuilder((LoadingPaneOuterClass$LoadingPane.Actions) this.output_).mergeFrom((LoadingPaneOuterClass$LoadingPane.Actions.C6682b) actions).buildPartial();
        }
        this.outputCase_ = 131;
    }

    private void mergeOauth(OauthPane$OAuthPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ != 115 || this.output_ == OauthPane$OAuthPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = OauthPane$OAuthPane.Actions.newBuilder((OauthPane$OAuthPane.Actions) this.output_).mergeFrom((OauthPane$OAuthPane.Actions.C6698b) actions).buildPartial();
        }
        this.outputCase_ = 115;
    }

    private void mergeOrderedList(OrderedListPaneOuterClass$OrderedListPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ != 116 || this.output_ == OrderedListPaneOuterClass$OrderedListPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = OrderedListPaneOuterClass$OrderedListPane.Actions.newBuilder((OrderedListPaneOuterClass$OrderedListPane.Actions) this.output_).mergeFrom((OrderedListPaneOuterClass$OrderedListPane.Actions.C6714b) actions).buildPartial();
        }
        this.outputCase_ = 116;
    }

    private void mergeProfileAuthentication(ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ != 167 || this.output_ == ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions.newBuilder((ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions) this.output_).mergeFrom((ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions.C6755b) actions).buildPartial();
        }
        this.outputCase_ = 167;
    }

    private void mergeQrCode(QrCodePane$QRCodePane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ != 125 || this.output_ == QrCodePane$QRCodePane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = QrCodePane$QRCodePane.Actions.newBuilder((QrCodePane$QRCodePane.Actions) this.output_).mergeFrom((QrCodePane$QRCodePane.Actions.C6793b) actions).buildPartial();
        }
        this.outputCase_ = 125;
    }

    private void mergeSearchAndSelect(SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ != 111 || this.output_ == SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions.newBuilder((SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions) this.output_).mergeFrom((SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions.C6806b) actions).buildPartial();
        }
        this.outputCase_ = 111;
    }

    private void mergeSessionHandoff(SessionHandoffPaneOuterClass$SessionHandoffPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ != 136 || this.output_ == SessionHandoffPaneOuterClass$SessionHandoffPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = SessionHandoffPaneOuterClass$SessionHandoffPane.Actions.newBuilder((SessionHandoffPaneOuterClass$SessionHandoffPane.Actions) this.output_).mergeFrom((SessionHandoffPaneOuterClass$SessionHandoffPane.Actions.C6817b) actions).buildPartial();
        }
        this.outputCase_ = 136;
    }

    private void mergeSink(SinkPaneOuterClass$SinkPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ != 102 || this.output_ == SinkPaneOuterClass$SinkPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = SinkPaneOuterClass$SinkPane.Actions.newBuilder((SinkPaneOuterClass$SinkPane.Actions) this.output_).mergeFrom((SinkPaneOuterClass$SinkPane.Actions.C6821a) actions).buildPartial();
        }
        this.outputCase_ = 102;
    }

    private void mergeSource(SourcePaneOuterClass$SourcePane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ != 101 || this.output_ == SourcePaneOuterClass$SourcePane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = SourcePaneOuterClass$SourcePane.Actions.newBuilder((SourcePaneOuterClass$SourcePane.Actions) this.output_).mergeFrom((SourcePaneOuterClass$SourcePane.Actions.C6827b) actions).buildPartial();
        }
        this.outputCase_ = 101;
    }

    private void mergeUserInput(UserInputPaneOuterClass$UserInputPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ != 112 || this.output_ == UserInputPaneOuterClass$UserInputPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = UserInputPaneOuterClass$UserInputPane.Actions.newBuilder((UserInputPaneOuterClass$UserInputPane.Actions) this.output_).mergeFrom((UserInputPaneOuterClass$UserInputPane.Actions.C6843b) actions).buildPartial();
        }
        this.outputCase_ = 112;
    }

    private void mergeUserSelection(UserSelectionPaneOuterClass$UserSelectionPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ != 113 || this.output_ == UserSelectionPaneOuterClass$UserSelectionPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = UserSelectionPaneOuterClass$UserSelectionPane.Actions.newBuilder((UserSelectionPaneOuterClass$UserSelectionPane.Actions) this.output_).mergeFrom((UserSelectionPaneOuterClass$UserSelectionPane.Actions.C6858b) actions).buildPartial();
        }
        this.outputCase_ = 113;
    }

    private void mergeVariableHeightButton(VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ != 144 || this.output_ == VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Actions.newBuilder((VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Actions) this.output_).mergeFrom((VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Actions.C6877b) actions).buildPartial();
        }
        this.outputCase_ = 144;
    }

    private void mergeVariableHeightVerificationCodeInput(C6894xa350b647.Actions actions) {
        actions.getClass();
        if (this.outputCase_ != 147 || this.output_ == C6894xa350b647.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = C6894xa350b647.Actions.newBuilder((C6894xa350b647.Actions) this.output_).mergeFrom((C6894xa350b647.Actions.b) actions).buildPartial();
        }
        this.outputCase_ = 147;
    }

    public static C6730a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Pane$PaneOutput parseDelimitedFrom(InputStream inputStream) {
        return (Pane$PaneOutput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Pane$PaneOutput parseFrom(ByteBuffer byteBuffer) {
        return (Pane$PaneOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Pane$PaneOutput> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButton(ButtonPaneOuterClass$ButtonPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 105;
    }

    private void setButtonList(ButtonListPaneOuterClass$ButtonListPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 106;
    }

    private void setButtonWithAccordion(ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 107;
    }

    private void setButtonWithCards(ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 108;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonWithTable(ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 109;
    }

    private void setButtonWithWebview(ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 110;
    }

    private void setChallenge(ChallengePaneOuterClass$ChallengePane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 117;
    }

    private void setClientSubmission(ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 165;
    }

    private void setConsent(ConsentPaneOuterClass$ConsentPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 104;
    }

    private void setCredentials(CredentialsPaneOuterClass$CredentialsPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 103;
    }

    private void setFlexible(FlexiblePaneOuterClass$FlexiblePane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 128;
    }

    private void setGridSelection(GridSelectionPaneOuterClass$GridSelectionPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 114;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeadlessOAuth(HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 120;
    }

    private void setIdentityDataSharing(IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 151;
    }

    private void setLoading(LoadingPaneOuterClass$LoadingPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 131;
    }

    private void setOauth(OauthPane$OAuthPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 115;
    }

    private void setOrderedList(OrderedListPaneOuterClass$OrderedListPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 116;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaneNodeId(String str) {
        str.getClass();
        this.paneNodeId_ = str;
    }

    private void setPaneNodeIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.paneNodeId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaneRenderingId(String str) {
        str.getClass();
        this.paneRenderingId_ = str;
    }

    private void setPaneRenderingIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.paneRenderingId_ = byteString.toStringUtf8();
    }

    private void setProfileAuthentication(ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 167;
    }

    private void setQrCode(QrCodePane$QRCodePane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 125;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchAndSelect(SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 111;
    }

    private void setSessionHandoff(SessionHandoffPaneOuterClass$SessionHandoffPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 136;
    }

    private void setSink(SinkPaneOuterClass$SinkPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 102;
    }

    private void setSource(SourcePaneOuterClass$SourcePane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 101;
    }

    private void setUserInput(UserInputPaneOuterClass$UserInputPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 112;
    }

    private void setUserSelection(UserSelectionPaneOuterClass$UserSelectionPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 113;
    }

    private void setVariableHeightButton(VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 144;
    }

    private void setVariableHeightVerificationCodeInput(C6894xa350b647.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 147;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6924m0.f2570a[methodToInvoke.ordinal()]) {
            case 1:
                return new Pane$PaneOutput();
            case 2:
                return new C6730a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001d\u0001\u0000\u0001§\u001d\u0000\u0000\u0000\u0001Ȉ\u0002Ȉe<\u0000f<\u0000g<\u0000h<\u0000i<\u0000j<\u0000k<\u0000l<\u0000m<\u0000n<\u0000o<\u0000p<\u0000q<\u0000r<\u0000s<\u0000t<\u0000u<\u0000x<\u0000}<\u0000\u0080<\u0000\u0083<\u0000\u0088<\u0000\u0090<\u0000\u0093<\u0000\u0097<\u0000¥<\u0000§<\u0000", new Object[]{"output_", "outputCase_", "paneRenderingId_", "paneNodeId_", SourcePaneOuterClass$SourcePane.Actions.class, SinkPaneOuterClass$SinkPane.Actions.class, CredentialsPaneOuterClass$CredentialsPane.Actions.class, ConsentPaneOuterClass$ConsentPane.Actions.class, ButtonPaneOuterClass$ButtonPane.Actions.class, ButtonListPaneOuterClass$ButtonListPane.Actions.class, ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions.class, ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Actions.class, ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions.class, ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Actions.class, SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions.class, UserInputPaneOuterClass$UserInputPane.Actions.class, UserSelectionPaneOuterClass$UserSelectionPane.Actions.class, GridSelectionPaneOuterClass$GridSelectionPane.Actions.class, OauthPane$OAuthPane.Actions.class, OrderedListPaneOuterClass$OrderedListPane.Actions.class, ChallengePaneOuterClass$ChallengePane.Actions.class, HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.class, QrCodePane$QRCodePane.Actions.class, FlexiblePaneOuterClass$FlexiblePane.Actions.class, LoadingPaneOuterClass$LoadingPane.Actions.class, SessionHandoffPaneOuterClass$SessionHandoffPane.Actions.class, VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Actions.class, C6894xa350b647.Actions.class, IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Actions.class, ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions.class, ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Pane$PaneOutput> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Pane$PaneOutput.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public ButtonPaneOuterClass$ButtonPane.Actions getButton() {
        return this.outputCase_ == 105 ? (ButtonPaneOuterClass$ButtonPane.Actions) this.output_ : ButtonPaneOuterClass$ButtonPane.Actions.getDefaultInstance();
    }

    public ButtonListPaneOuterClass$ButtonListPane.Actions getButtonList() {
        return this.outputCase_ == 106 ? (ButtonListPaneOuterClass$ButtonListPane.Actions) this.output_ : ButtonListPaneOuterClass$ButtonListPane.Actions.getDefaultInstance();
    }

    public ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions getButtonWithAccordion() {
        return this.outputCase_ == 107 ? (ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions) this.output_ : ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions.getDefaultInstance();
    }

    public ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Actions getButtonWithCards() {
        return this.outputCase_ == 108 ? (ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Actions) this.output_ : ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Actions.getDefaultInstance();
    }

    public ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions getButtonWithTable() {
        return this.outputCase_ == 109 ? (ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions) this.output_ : ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions.getDefaultInstance();
    }

    public ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Actions getButtonWithWebview() {
        return this.outputCase_ == 110 ? (ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Actions) this.output_ : ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Actions.getDefaultInstance();
    }

    public ChallengePaneOuterClass$ChallengePane.Actions getChallenge() {
        return this.outputCase_ == 117 ? (ChallengePaneOuterClass$ChallengePane.Actions) this.output_ : ChallengePaneOuterClass$ChallengePane.Actions.getDefaultInstance();
    }

    public ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions getClientSubmission() {
        return this.outputCase_ == 165 ? (ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions) this.output_ : ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions.getDefaultInstance();
    }

    public ConsentPaneOuterClass$ConsentPane.Actions getConsent() {
        return this.outputCase_ == 104 ? (ConsentPaneOuterClass$ConsentPane.Actions) this.output_ : ConsentPaneOuterClass$ConsentPane.Actions.getDefaultInstance();
    }

    public CredentialsPaneOuterClass$CredentialsPane.Actions getCredentials() {
        return this.outputCase_ == 103 ? (CredentialsPaneOuterClass$CredentialsPane.Actions) this.output_ : CredentialsPaneOuterClass$CredentialsPane.Actions.getDefaultInstance();
    }

    public FlexiblePaneOuterClass$FlexiblePane.Actions getFlexible() {
        return this.outputCase_ == 128 ? (FlexiblePaneOuterClass$FlexiblePane.Actions) this.output_ : FlexiblePaneOuterClass$FlexiblePane.Actions.getDefaultInstance();
    }

    public GridSelectionPaneOuterClass$GridSelectionPane.Actions getGridSelection() {
        return this.outputCase_ == 114 ? (GridSelectionPaneOuterClass$GridSelectionPane.Actions) this.output_ : GridSelectionPaneOuterClass$GridSelectionPane.Actions.getDefaultInstance();
    }

    public HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions getHeadlessOAuth() {
        return this.outputCase_ == 120 ? (HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions) this.output_ : HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.getDefaultInstance();
    }

    public IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Actions getIdentityDataSharing() {
        return this.outputCase_ == 151 ? (IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Actions) this.output_ : IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Actions.getDefaultInstance();
    }

    public LoadingPaneOuterClass$LoadingPane.Actions getLoading() {
        return this.outputCase_ == 131 ? (LoadingPaneOuterClass$LoadingPane.Actions) this.output_ : LoadingPaneOuterClass$LoadingPane.Actions.getDefaultInstance();
    }

    public OauthPane$OAuthPane.Actions getOauth() {
        return this.outputCase_ == 115 ? (OauthPane$OAuthPane.Actions) this.output_ : OauthPane$OAuthPane.Actions.getDefaultInstance();
    }

    public OrderedListPaneOuterClass$OrderedListPane.Actions getOrderedList() {
        return this.outputCase_ == 116 ? (OrderedListPaneOuterClass$OrderedListPane.Actions) this.output_ : OrderedListPaneOuterClass$OrderedListPane.Actions.getDefaultInstance();
    }

    public EnumC6731b getOutputCase() {
        return EnumC6731b.forNumber(this.outputCase_);
    }

    public String getPaneNodeId() {
        return this.paneNodeId_;
    }

    public ByteString getPaneNodeIdBytes() {
        return ByteString.copyFromUtf8(this.paneNodeId_);
    }

    public String getPaneRenderingId() {
        return this.paneRenderingId_;
    }

    public ByteString getPaneRenderingIdBytes() {
        return ByteString.copyFromUtf8(this.paneRenderingId_);
    }

    public ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions getProfileAuthentication() {
        return this.outputCase_ == 167 ? (ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions) this.output_ : ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions.getDefaultInstance();
    }

    public QrCodePane$QRCodePane.Actions getQrCode() {
        return this.outputCase_ == 125 ? (QrCodePane$QRCodePane.Actions) this.output_ : QrCodePane$QRCodePane.Actions.getDefaultInstance();
    }

    public SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions getSearchAndSelect() {
        return this.outputCase_ == 111 ? (SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions) this.output_ : SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions.getDefaultInstance();
    }

    public SessionHandoffPaneOuterClass$SessionHandoffPane.Actions getSessionHandoff() {
        return this.outputCase_ == 136 ? (SessionHandoffPaneOuterClass$SessionHandoffPane.Actions) this.output_ : SessionHandoffPaneOuterClass$SessionHandoffPane.Actions.getDefaultInstance();
    }

    public SinkPaneOuterClass$SinkPane.Actions getSink() {
        return this.outputCase_ == 102 ? (SinkPaneOuterClass$SinkPane.Actions) this.output_ : SinkPaneOuterClass$SinkPane.Actions.getDefaultInstance();
    }

    public SourcePaneOuterClass$SourcePane.Actions getSource() {
        return this.outputCase_ == 101 ? (SourcePaneOuterClass$SourcePane.Actions) this.output_ : SourcePaneOuterClass$SourcePane.Actions.getDefaultInstance();
    }

    public UserInputPaneOuterClass$UserInputPane.Actions getUserInput() {
        return this.outputCase_ == 112 ? (UserInputPaneOuterClass$UserInputPane.Actions) this.output_ : UserInputPaneOuterClass$UserInputPane.Actions.getDefaultInstance();
    }

    public UserSelectionPaneOuterClass$UserSelectionPane.Actions getUserSelection() {
        return this.outputCase_ == 113 ? (UserSelectionPaneOuterClass$UserSelectionPane.Actions) this.output_ : UserSelectionPaneOuterClass$UserSelectionPane.Actions.getDefaultInstance();
    }

    public VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Actions getVariableHeightButton() {
        return this.outputCase_ == 144 ? (VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Actions) this.output_ : VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Actions.getDefaultInstance();
    }

    public C6894xa350b647.Actions getVariableHeightVerificationCodeInput() {
        return this.outputCase_ == 147 ? (C6894xa350b647.Actions) this.output_ : C6894xa350b647.Actions.getDefaultInstance();
    }

    public boolean hasButton() {
        return this.outputCase_ == 105;
    }

    public boolean hasButtonList() {
        return this.outputCase_ == 106;
    }

    public boolean hasButtonWithAccordion() {
        return this.outputCase_ == 107;
    }

    public boolean hasButtonWithCards() {
        return this.outputCase_ == 108;
    }

    public boolean hasButtonWithTable() {
        return this.outputCase_ == 109;
    }

    public boolean hasButtonWithWebview() {
        return this.outputCase_ == 110;
    }

    public boolean hasChallenge() {
        return this.outputCase_ == 117;
    }

    public boolean hasClientSubmission() {
        return this.outputCase_ == 165;
    }

    public boolean hasConsent() {
        return this.outputCase_ == 104;
    }

    public boolean hasCredentials() {
        return this.outputCase_ == 103;
    }

    public boolean hasFlexible() {
        return this.outputCase_ == 128;
    }

    public boolean hasGridSelection() {
        return this.outputCase_ == 114;
    }

    public boolean hasHeadlessOAuth() {
        return this.outputCase_ == 120;
    }

    public boolean hasIdentityDataSharing() {
        return this.outputCase_ == 151;
    }

    public boolean hasLoading() {
        return this.outputCase_ == 131;
    }

    public boolean hasOauth() {
        return this.outputCase_ == 115;
    }

    public boolean hasOrderedList() {
        return this.outputCase_ == 116;
    }

    public boolean hasProfileAuthentication() {
        return this.outputCase_ == 167;
    }

    public boolean hasQrCode() {
        return this.outputCase_ == 125;
    }

    public boolean hasSearchAndSelect() {
        return this.outputCase_ == 111;
    }

    public boolean hasSessionHandoff() {
        return this.outputCase_ == 136;
    }

    public boolean hasSink() {
        return this.outputCase_ == 102;
    }

    public boolean hasSource() {
        return this.outputCase_ == 101;
    }

    public boolean hasUserInput() {
        return this.outputCase_ == 112;
    }

    public boolean hasUserSelection() {
        return this.outputCase_ == 113;
    }

    public boolean hasVariableHeightButton() {
        return this.outputCase_ == 144;
    }

    public boolean hasVariableHeightVerificationCodeInput() {
        return this.outputCase_ == 147;
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput$a */
    public static final class C6730a extends GeneratedMessageLite.Builder<Pane$PaneOutput, C6730a> implements InterfaceC6928o0 {
        public C6730a() {
            super(Pane$PaneOutput.DEFAULT_INSTANCE);
        }

        /* renamed from: a */
        public final C6730a m1444a(String str) {
            copyOnWrite();
            ((Pane$PaneOutput) this.instance).setPaneNodeId(str);
            return this;
        }

        /* renamed from: b */
        public final C6730a m1445b(String str) {
            copyOnWrite();
            ((Pane$PaneOutput) this.instance).setPaneRenderingId(str);
            return this;
        }

        /* renamed from: a */
        public final C6730a m1440a(ButtonPaneOuterClass$ButtonPane.Actions.C6315b c6315b) {
            copyOnWrite();
            ((Pane$PaneOutput) this.instance).setButton(c6315b.build());
            return this;
        }

        /* renamed from: a */
        public final C6730a m1441a(ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions.C6344b c6344b) {
            copyOnWrite();
            ((Pane$PaneOutput) this.instance).setButtonWithTable(c6344b.build());
            return this;
        }

        /* renamed from: a */
        public final C6730a m1443a(SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions.C6806b c6806b) {
            copyOnWrite();
            ((Pane$PaneOutput) this.instance).setSearchAndSelect(c6806b.build());
            return this;
        }

        /* renamed from: a */
        public final C6730a m1442a(HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.C6635b c6635b) {
            copyOnWrite();
            ((Pane$PaneOutput) this.instance).setHeadlessOAuth(c6635b.build());
            return this;
        }
    }

    public static C6730a newBuilder(Pane$PaneOutput pane$PaneOutput) {
        return DEFAULT_INSTANCE.createBuilder(pane$PaneOutput);
    }

    public static Pane$PaneOutput parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PaneOutput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Pane$PaneOutput parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PaneOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Pane$PaneOutput parseFrom(ByteString byteString) {
        return (Pane$PaneOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Pane$PaneOutput parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PaneOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Pane$PaneOutput parseFrom(byte[] bArr) {
        return (Pane$PaneOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Pane$PaneOutput parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PaneOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Pane$PaneOutput parseFrom(InputStream inputStream) {
        return (Pane$PaneOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Pane$PaneOutput parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PaneOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Pane$PaneOutput parseFrom(CodedInputStream codedInputStream) {
        return (Pane$PaneOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Pane$PaneOutput parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PaneOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
