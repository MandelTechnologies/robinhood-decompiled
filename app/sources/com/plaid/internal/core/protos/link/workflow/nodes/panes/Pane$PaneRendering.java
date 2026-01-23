package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
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
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$AutomaticActions;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode;
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
public final class Pane$PaneRendering extends GeneratedMessageLite<Pane$PaneRendering, C6733a> implements InterfaceC6930p0 {
    public static final int AUTOMATIC_ACTIONS_FIELD_NUMBER = 6;
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
    private static final Pane$PaneRendering DEFAULT_INSTANCE;
    public static final int FLEXIBLE_FIELD_NUMBER = 128;
    public static final int GRID_SELECTION_FIELD_NUMBER = 114;
    public static final int HEADLESS_O_AUTH_FIELD_NUMBER = 120;
    public static final int IDENTITY_DATA_SHARING_FIELD_NUMBER = 151;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LOADING_FIELD_NUMBER = 131;
    public static final int LOGGING_METADATA_FIELD_NUMBER = 5;
    public static final int NAVIGATION_FIELD_NUMBER = 3;
    public static final int OAUTH_FIELD_NUMBER = 115;
    public static final int ORDERED_LIST_FIELD_NUMBER = 116;
    public static final int PANE_NODE_ID_FIELD_NUMBER = 2;
    private static volatile Parser<Pane$PaneRendering> PARSER = null;
    public static final int PRESENTATION_MODE_FIELD_NUMBER = 8;
    public static final int PROFILE_AUTHENTICATION_FIELD_NUMBER = 167;
    public static final int QR_CODE_FIELD_NUMBER = 125;
    public static final int RENDERING_PROPERTY_KEY_FIELD_NUMBER = 100;
    public static final int SANDBOX_MESSAGE_FIELD_NUMBER = 4;
    public static final int SEARCH_AND_SELECT_FIELD_NUMBER = 111;
    public static final int SESSION_HANDOFF_FIELD_NUMBER = 136;
    public static final int SINK_FIELD_NUMBER = 102;
    public static final int SOURCE_FIELD_NUMBER = 101;
    public static final int USER_INPUT_FIELD_NUMBER = 112;
    public static final int USER_SELECTION_FIELD_NUMBER = 113;
    public static final int VARIABLE_HEIGHT_BUTTON_FIELD_NUMBER = 144;
    public static final int VARIABLE_HEIGHT_VERIFICATION_CODE_INPUT_FIELD_NUMBER = 147;
    private Pane$AutomaticActions automaticActions_;
    private int bitField0_;
    private LoggingMetadata loggingMetadata_;
    private Pane$Navigation navigation_;
    private Pane$PresentationMode presentationMode_;
    private Object rendering_;
    private int renderingCase_ = 0;
    private String id_ = "";
    private String paneNodeId_ = "";
    private String sandboxMessage_ = "";
    private String renderingPropertyKey_ = "";

    public static final class LoggingMetadata extends GeneratedMessageLite<LoggingMetadata, C6732a> implements MessageLiteOrBuilder {
        private static final LoggingMetadata DEFAULT_INSTANCE;
        private static volatile Parser<LoggingMetadata> PARSER = null;
        public static final int TEAM_FIELD_NUMBER = 1;
        private String team_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering$LoggingMetadata$a */
        public static final class C6732a extends GeneratedMessageLite.Builder<LoggingMetadata, C6732a> implements MessageLiteOrBuilder {
            public C6732a() {
                super(LoggingMetadata.DEFAULT_INSTANCE);
            }
        }

        static {
            LoggingMetadata loggingMetadata = new LoggingMetadata();
            DEFAULT_INSTANCE = loggingMetadata;
            GeneratedMessageLite.registerDefaultInstance(LoggingMetadata.class, loggingMetadata);
        }

        private LoggingMetadata() {
        }

        private void clearTeam() {
            this.team_ = getDefaultInstance().getTeam();
        }

        public static LoggingMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6732a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static LoggingMetadata parseDelimitedFrom(InputStream inputStream) {
            return (LoggingMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LoggingMetadata parseFrom(ByteBuffer byteBuffer) {
            return (LoggingMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<LoggingMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setTeam(String str) {
            str.getClass();
            this.team_ = str;
        }

        private void setTeamBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.team_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6924m0.f2570a[methodToInvoke.ordinal()]) {
                case 1:
                    return new LoggingMetadata();
                case 2:
                    return new C6732a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"team_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<LoggingMetadata> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (LoggingMetadata.class) {
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

        public String getTeam() {
            return this.team_;
        }

        public ByteString getTeamBytes() {
            return ByteString.copyFromUtf8(this.team_);
        }

        public static C6732a newBuilder(LoggingMetadata loggingMetadata) {
            return DEFAULT_INSTANCE.createBuilder(loggingMetadata);
        }

        public static LoggingMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LoggingMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LoggingMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (LoggingMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static LoggingMetadata parseFrom(ByteString byteString) {
            return (LoggingMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static LoggingMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (LoggingMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static LoggingMetadata parseFrom(byte[] bArr) {
            return (LoggingMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LoggingMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (LoggingMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static LoggingMetadata parseFrom(InputStream inputStream) {
            return (LoggingMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LoggingMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LoggingMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LoggingMetadata parseFrom(CodedInputStream codedInputStream) {
            return (LoggingMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static LoggingMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LoggingMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering$a */
    public static final class C6733a extends GeneratedMessageLite.Builder<Pane$PaneRendering, C6733a> implements InterfaceC6930p0 {
        public C6733a() {
            super(Pane$PaneRendering.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering$b */
    public enum EnumC6734b {
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
        RENDERING_NOT_SET(0);


        /* renamed from: a */
        public final int f2433a;

        EnumC6734b(int i) {
            this.f2433a = i;
        }

        public static EnumC6734b forNumber(int i) {
            switch (i) {
                case 0:
                    return RENDERING_NOT_SET;
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
            return this.f2433a;
        }

        @Deprecated
        public static EnumC6734b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Pane$PaneRendering pane$PaneRendering = new Pane$PaneRendering();
        DEFAULT_INSTANCE = pane$PaneRendering;
        GeneratedMessageLite.registerDefaultInstance(Pane$PaneRendering.class, pane$PaneRendering);
    }

    private Pane$PaneRendering() {
    }

    private void clearAutomaticActions() {
        this.automaticActions_ = null;
        this.bitField0_ &= -9;
    }

    private void clearButton() {
        if (this.renderingCase_ == 105) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearButtonList() {
        if (this.renderingCase_ == 106) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearButtonWithAccordion() {
        if (this.renderingCase_ == 107) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearButtonWithCards() {
        if (this.renderingCase_ == 108) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearButtonWithTable() {
        if (this.renderingCase_ == 109) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearButtonWithWebview() {
        if (this.renderingCase_ == 110) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearChallenge() {
        if (this.renderingCase_ == 117) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearClientSubmission() {
        if (this.renderingCase_ == 165) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearConsent() {
        if (this.renderingCase_ == 104) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearCredentials() {
        if (this.renderingCase_ == 103) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearFlexible() {
        if (this.renderingCase_ == 128) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearGridSelection() {
        if (this.renderingCase_ == 114) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearHeadlessOAuth() {
        if (this.renderingCase_ == 120) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearIdentityDataSharing() {
        if (this.renderingCase_ == 151) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearLoading() {
        if (this.renderingCase_ == 131) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearLoggingMetadata() {
        this.loggingMetadata_ = null;
        this.bitField0_ &= -5;
    }

    private void clearNavigation() {
        this.navigation_ = null;
        this.bitField0_ &= -2;
    }

    private void clearOauth() {
        if (this.renderingCase_ == 115) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearOrderedList() {
        if (this.renderingCase_ == 116) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearPaneNodeId() {
        this.paneNodeId_ = getDefaultInstance().getPaneNodeId();
    }

    private void clearPresentationMode() {
        this.presentationMode_ = null;
        this.bitField0_ &= -3;
    }

    private void clearProfileAuthentication() {
        if (this.renderingCase_ == 167) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearQrCode() {
        if (this.renderingCase_ == 125) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearRendering() {
        this.renderingCase_ = 0;
        this.rendering_ = null;
    }

    private void clearRenderingPropertyKey() {
        this.renderingPropertyKey_ = getDefaultInstance().getRenderingPropertyKey();
    }

    private void clearSandboxMessage() {
        this.sandboxMessage_ = getDefaultInstance().getSandboxMessage();
    }

    private void clearSearchAndSelect() {
        if (this.renderingCase_ == 111) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearSessionHandoff() {
        if (this.renderingCase_ == 136) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearSink() {
        if (this.renderingCase_ == 102) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearSource() {
        if (this.renderingCase_ == 101) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearUserInput() {
        if (this.renderingCase_ == 112) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearUserSelection() {
        if (this.renderingCase_ == 113) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearVariableHeightButton() {
        if (this.renderingCase_ == 144) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearVariableHeightVerificationCodeInput() {
        if (this.renderingCase_ == 147) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    public static Pane$PaneRendering getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAutomaticActions(Pane$AutomaticActions pane$AutomaticActions) {
        pane$AutomaticActions.getClass();
        Pane$AutomaticActions pane$AutomaticActions2 = this.automaticActions_;
        if (pane$AutomaticActions2 == null || pane$AutomaticActions2 == Pane$AutomaticActions.getDefaultInstance()) {
            this.automaticActions_ = pane$AutomaticActions;
        } else {
            this.automaticActions_ = Pane$AutomaticActions.newBuilder(this.automaticActions_).mergeFrom((Pane$AutomaticActions.C6721a) pane$AutomaticActions).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    private void mergeButton(ButtonPaneOuterClass$ButtonPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ != 105 || this.rendering_ == ButtonPaneOuterClass$ButtonPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = ButtonPaneOuterClass$ButtonPane.Rendering.newBuilder((ButtonPaneOuterClass$ButtonPane.Rendering) this.rendering_).mergeFrom((ButtonPaneOuterClass$ButtonPane.Rendering.C6317a) rendering).buildPartial();
        }
        this.renderingCase_ = 105;
    }

    private void mergeButtonList(ButtonListPaneOuterClass$ButtonListPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ != 106 || this.rendering_ == ButtonListPaneOuterClass$ButtonListPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = ButtonListPaneOuterClass$ButtonListPane.Rendering.newBuilder((ButtonListPaneOuterClass$ButtonListPane.Rendering) this.rendering_).mergeFrom((ButtonListPaneOuterClass$ButtonListPane.Rendering.C6307a) rendering).buildPartial();
        }
        this.renderingCase_ = 106;
    }

    private void mergeButtonWithAccordion(ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ != 107 || this.rendering_ == ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering.newBuilder((ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering) this.rendering_).mergeFrom((ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering.C6328b) rendering).buildPartial();
        }
        this.renderingCase_ = 107;
    }

    private void mergeButtonWithCards(ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ != 108 || this.rendering_ == ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Rendering.newBuilder((ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Rendering) this.rendering_).mergeFrom((ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Rendering.C6337a) rendering).buildPartial();
        }
        this.renderingCase_ = 108;
    }

    private void mergeButtonWithTable(ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ != 109 || this.rendering_ == ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering.newBuilder((ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering) this.rendering_).mergeFrom((ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering.C6347a) rendering).buildPartial();
        }
        this.renderingCase_ = 109;
    }

    private void mergeButtonWithWebview(ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ != 110 || this.rendering_ == ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Rendering.newBuilder((ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Rendering) this.rendering_).mergeFrom((ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Rendering.C6357a) rendering).buildPartial();
        }
        this.renderingCase_ = 110;
    }

    private void mergeChallenge(ChallengePaneOuterClass$ChallengePane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ != 117 || this.rendering_ == ChallengePaneOuterClass$ChallengePane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = ChallengePaneOuterClass$ChallengePane.Rendering.newBuilder((ChallengePaneOuterClass$ChallengePane.Rendering) this.rendering_).mergeFrom((ChallengePaneOuterClass$ChallengePane.Rendering.C6368a) rendering).buildPartial();
        }
        this.renderingCase_ = 117;
    }

    private void mergeClientSubmission(ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ != 165 || this.rendering_ == ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering.newBuilder((ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering) this.rendering_).mergeFrom((ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering.C6380b) rendering).buildPartial();
        }
        this.renderingCase_ = 165;
    }

    private void mergeConsent(ConsentPaneOuterClass$ConsentPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ != 104 || this.rendering_ == ConsentPaneOuterClass$ConsentPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = ConsentPaneOuterClass$ConsentPane.Rendering.newBuilder((ConsentPaneOuterClass$ConsentPane.Rendering) this.rendering_).mergeFrom((ConsentPaneOuterClass$ConsentPane.Rendering.C6569a) rendering).buildPartial();
        }
        this.renderingCase_ = 104;
    }

    private void mergeCredentials(CredentialsPaneOuterClass$CredentialsPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ != 103 || this.rendering_ == CredentialsPaneOuterClass$CredentialsPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = CredentialsPaneOuterClass$CredentialsPane.Rendering.newBuilder((CredentialsPaneOuterClass$CredentialsPane.Rendering) this.rendering_).mergeFrom((CredentialsPaneOuterClass$CredentialsPane.Rendering.C6585a) rendering).buildPartial();
        }
        this.renderingCase_ = 103;
    }

    private void mergeFlexible(FlexiblePaneOuterClass$FlexiblePane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ != 128 || this.rendering_ == FlexiblePaneOuterClass$FlexiblePane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = FlexiblePaneOuterClass$FlexiblePane.Rendering.newBuilder((FlexiblePaneOuterClass$FlexiblePane.Rendering) this.rendering_).mergeFrom((FlexiblePaneOuterClass$FlexiblePane.Rendering.C6615a) rendering).buildPartial();
        }
        this.renderingCase_ = 128;
    }

    private void mergeGridSelection(GridSelectionPaneOuterClass$GridSelectionPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ != 114 || this.rendering_ == GridSelectionPaneOuterClass$GridSelectionPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = GridSelectionPaneOuterClass$GridSelectionPane.Rendering.newBuilder((GridSelectionPaneOuterClass$GridSelectionPane.Rendering) this.rendering_).mergeFrom((GridSelectionPaneOuterClass$GridSelectionPane.Rendering.C6629a) rendering).buildPartial();
        }
        this.renderingCase_ = 114;
    }

    private void mergeHeadlessOAuth(HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ != 120 || this.rendering_ == HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering.newBuilder((HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering) this.rendering_).mergeFrom((HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering.C6637a) rendering).buildPartial();
        }
        this.renderingCase_ = 120;
    }

    private void mergeIdentityDataSharing(IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ != 151 || this.rendering_ == IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Rendering.newBuilder((IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Rendering) this.rendering_).mergeFrom((IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Rendering.C6669b) rendering).buildPartial();
        }
        this.renderingCase_ = 151;
    }

    private void mergeLoading(LoadingPaneOuterClass$LoadingPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ != 131 || this.rendering_ == LoadingPaneOuterClass$LoadingPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = LoadingPaneOuterClass$LoadingPane.Rendering.newBuilder((LoadingPaneOuterClass$LoadingPane.Rendering) this.rendering_).mergeFrom((LoadingPaneOuterClass$LoadingPane.Rendering.C6688a) rendering).buildPartial();
        }
        this.renderingCase_ = 131;
    }

    private void mergeLoggingMetadata(LoggingMetadata loggingMetadata) {
        loggingMetadata.getClass();
        LoggingMetadata loggingMetadata2 = this.loggingMetadata_;
        if (loggingMetadata2 == null || loggingMetadata2 == LoggingMetadata.getDefaultInstance()) {
            this.loggingMetadata_ = loggingMetadata;
        } else {
            this.loggingMetadata_ = LoggingMetadata.newBuilder(this.loggingMetadata_).mergeFrom((LoggingMetadata.C6732a) loggingMetadata).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    private void mergeNavigation(Pane$Navigation pane$Navigation) {
        pane$Navigation.getClass();
        Pane$Navigation pane$Navigation2 = this.navigation_;
        if (pane$Navigation2 == null || pane$Navigation2 == Pane$Navigation.getDefaultInstance()) {
            this.navigation_ = pane$Navigation;
        } else {
            this.navigation_ = Pane$Navigation.newBuilder(this.navigation_).mergeFrom((Pane$Navigation.C6727a) pane$Navigation).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeOauth(OauthPane$OAuthPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ != 115 || this.rendering_ == OauthPane$OAuthPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = OauthPane$OAuthPane.Rendering.newBuilder((OauthPane$OAuthPane.Rendering) this.rendering_).mergeFrom((OauthPane$OAuthPane.Rendering.C6706a) rendering).buildPartial();
        }
        this.renderingCase_ = 115;
    }

    private void mergeOrderedList(OrderedListPaneOuterClass$OrderedListPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ != 116 || this.rendering_ == OrderedListPaneOuterClass$OrderedListPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = OrderedListPaneOuterClass$OrderedListPane.Rendering.newBuilder((OrderedListPaneOuterClass$OrderedListPane.Rendering) this.rendering_).mergeFrom((OrderedListPaneOuterClass$OrderedListPane.Rendering.C6717a) rendering).buildPartial();
        }
        this.renderingCase_ = 116;
    }

    private void mergePresentationMode(Pane$PresentationMode pane$PresentationMode) {
        pane$PresentationMode.getClass();
        Pane$PresentationMode pane$PresentationMode2 = this.presentationMode_;
        if (pane$PresentationMode2 == null || pane$PresentationMode2 == Pane$PresentationMode.getDefaultInstance()) {
            this.presentationMode_ = pane$PresentationMode;
        } else {
            this.presentationMode_ = Pane$PresentationMode.newBuilder(this.presentationMode_).mergeFrom((Pane$PresentationMode.C6738a) pane$PresentationMode).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeProfileAuthentication(ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ != 167 || this.rendering_ == ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering.newBuilder((ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering) this.rendering_).mergeFrom((ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering.C6783b) rendering).buildPartial();
        }
        this.renderingCase_ = 167;
    }

    private void mergeQrCode(QrCodePane$QRCodePane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ != 125 || this.rendering_ == QrCodePane$QRCodePane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = QrCodePane$QRCodePane.Rendering.newBuilder((QrCodePane$QRCodePane.Rendering) this.rendering_).mergeFrom((QrCodePane$QRCodePane.Rendering.C6795a) rendering).buildPartial();
        }
        this.renderingCase_ = 125;
    }

    private void mergeSearchAndSelect(SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ != 111 || this.rendering_ == SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering.newBuilder((SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering) this.rendering_).mergeFrom((SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering.C6811a) rendering).buildPartial();
        }
        this.renderingCase_ = 111;
    }

    private void mergeSessionHandoff(SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ != 136 || this.rendering_ == SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering.newBuilder((SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering) this.rendering_).mergeFrom((SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering.C6819a) rendering).buildPartial();
        }
        this.renderingCase_ = 136;
    }

    private void mergeSink(SinkPaneOuterClass$SinkPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ != 102 || this.rendering_ == SinkPaneOuterClass$SinkPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = SinkPaneOuterClass$SinkPane.Rendering.newBuilder((SinkPaneOuterClass$SinkPane.Rendering) this.rendering_).mergeFrom((SinkPaneOuterClass$SinkPane.Rendering.C6823a) rendering).buildPartial();
        }
        this.renderingCase_ = 102;
    }

    private void mergeSource(SourcePaneOuterClass$SourcePane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ != 101 || this.rendering_ == SourcePaneOuterClass$SourcePane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = SourcePaneOuterClass$SourcePane.Rendering.newBuilder((SourcePaneOuterClass$SourcePane.Rendering) this.rendering_).mergeFrom((SourcePaneOuterClass$SourcePane.Rendering.C6828a) rendering).buildPartial();
        }
        this.renderingCase_ = 101;
    }

    private void mergeUserInput(UserInputPaneOuterClass$UserInputPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ != 112 || this.rendering_ == UserInputPaneOuterClass$UserInputPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = UserInputPaneOuterClass$UserInputPane.Rendering.newBuilder((UserInputPaneOuterClass$UserInputPane.Rendering) this.rendering_).mergeFrom((UserInputPaneOuterClass$UserInputPane.Rendering.C6846a) rendering).buildPartial();
        }
        this.renderingCase_ = 112;
    }

    private void mergeUserSelection(UserSelectionPaneOuterClass$UserSelectionPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ != 113 || this.rendering_ == UserSelectionPaneOuterClass$UserSelectionPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = UserSelectionPaneOuterClass$UserSelectionPane.Rendering.newBuilder((UserSelectionPaneOuterClass$UserSelectionPane.Rendering) this.rendering_).mergeFrom((UserSelectionPaneOuterClass$UserSelectionPane.Rendering.C6863a) rendering).buildPartial();
        }
        this.renderingCase_ = 113;
    }

    private void mergeVariableHeightButton(VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ != 144 || this.rendering_ == VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Rendering.newBuilder((VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Rendering) this.rendering_).mergeFrom((VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Rendering.C6889a) rendering).buildPartial();
        }
        this.renderingCase_ = 144;
    }

    private void mergeVariableHeightVerificationCodeInput(C6894xa350b647.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ != 147 || this.rendering_ == C6894xa350b647.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = C6894xa350b647.Rendering.newBuilder((C6894xa350b647.Rendering) this.rendering_).mergeFrom((C6894xa350b647.Rendering.a) rendering).buildPartial();
        }
        this.renderingCase_ = 147;
    }

    public static C6733a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Pane$PaneRendering parseDelimitedFrom(InputStream inputStream) {
        return (Pane$PaneRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Pane$PaneRendering parseFrom(ByteBuffer byteBuffer) {
        return (Pane$PaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Pane$PaneRendering> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAutomaticActions(Pane$AutomaticActions pane$AutomaticActions) {
        pane$AutomaticActions.getClass();
        this.automaticActions_ = pane$AutomaticActions;
        this.bitField0_ |= 8;
    }

    private void setButton(ButtonPaneOuterClass$ButtonPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 105;
    }

    private void setButtonList(ButtonListPaneOuterClass$ButtonListPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 106;
    }

    private void setButtonWithAccordion(ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 107;
    }

    private void setButtonWithCards(ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 108;
    }

    private void setButtonWithTable(ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 109;
    }

    private void setButtonWithWebview(ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 110;
    }

    private void setChallenge(ChallengePaneOuterClass$ChallengePane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 117;
    }

    private void setClientSubmission(ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 165;
    }

    private void setConsent(ConsentPaneOuterClass$ConsentPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 104;
    }

    private void setCredentials(CredentialsPaneOuterClass$CredentialsPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 103;
    }

    private void setFlexible(FlexiblePaneOuterClass$FlexiblePane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 128;
    }

    private void setGridSelection(GridSelectionPaneOuterClass$GridSelectionPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 114;
    }

    private void setHeadlessOAuth(HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 120;
    }

    private void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    private void setIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setIdentityDataSharing(IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 151;
    }

    private void setLoading(LoadingPaneOuterClass$LoadingPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 131;
    }

    private void setLoggingMetadata(LoggingMetadata loggingMetadata) {
        loggingMetadata.getClass();
        this.loggingMetadata_ = loggingMetadata;
        this.bitField0_ |= 4;
    }

    private void setNavigation(Pane$Navigation pane$Navigation) {
        pane$Navigation.getClass();
        this.navigation_ = pane$Navigation;
        this.bitField0_ |= 1;
    }

    private void setOauth(OauthPane$OAuthPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 115;
    }

    private void setOrderedList(OrderedListPaneOuterClass$OrderedListPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 116;
    }

    private void setPaneNodeId(String str) {
        str.getClass();
        this.paneNodeId_ = str;
    }

    private void setPaneNodeIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.paneNodeId_ = byteString.toStringUtf8();
    }

    private void setPresentationMode(Pane$PresentationMode pane$PresentationMode) {
        pane$PresentationMode.getClass();
        this.presentationMode_ = pane$PresentationMode;
        this.bitField0_ |= 2;
    }

    private void setProfileAuthentication(ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 167;
    }

    private void setQrCode(QrCodePane$QRCodePane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 125;
    }

    private void setRenderingPropertyKey(String str) {
        str.getClass();
        this.renderingPropertyKey_ = str;
    }

    private void setRenderingPropertyKeyBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.renderingPropertyKey_ = byteString.toStringUtf8();
    }

    private void setSandboxMessage(String str) {
        str.getClass();
        this.sandboxMessage_ = str;
    }

    private void setSandboxMessageBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sandboxMessage_ = byteString.toStringUtf8();
    }

    private void setSearchAndSelect(SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 111;
    }

    private void setSessionHandoff(SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 136;
    }

    private void setSink(SinkPaneOuterClass$SinkPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 102;
    }

    private void setSource(SourcePaneOuterClass$SourcePane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 101;
    }

    private void setUserInput(UserInputPaneOuterClass$UserInputPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 112;
    }

    private void setUserSelection(UserSelectionPaneOuterClass$UserSelectionPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 113;
    }

    private void setVariableHeightButton(VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 144;
    }

    private void setVariableHeightVerificationCodeInput(C6894xa350b647.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 147;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6924m0.f2570a[methodToInvoke.ordinal()]) {
            case 1:
                return new Pane$PaneRendering();
            case 2:
                return new C6733a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000#\u0001\u0001\u0001§#\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ\u0005ဉ\u0002\u0006ဉ\u0003\bဉ\u0001dȈe<\u0000f<\u0000g<\u0000h<\u0000i<\u0000j<\u0000k<\u0000l<\u0000m<\u0000n<\u0000o<\u0000p<\u0000q<\u0000r<\u0000s<\u0000t<\u0000u<\u0000x<\u0000}<\u0000\u0080<\u0000\u0083<\u0000\u0088<\u0000\u0090<\u0000\u0093<\u0000\u0097<\u0000¥<\u0000§<\u0000", new Object[]{"rendering_", "renderingCase_", "bitField0_", "id_", "paneNodeId_", "navigation_", "sandboxMessage_", "loggingMetadata_", "automaticActions_", "presentationMode_", "renderingPropertyKey_", SourcePaneOuterClass$SourcePane.Rendering.class, SinkPaneOuterClass$SinkPane.Rendering.class, CredentialsPaneOuterClass$CredentialsPane.Rendering.class, ConsentPaneOuterClass$ConsentPane.Rendering.class, ButtonPaneOuterClass$ButtonPane.Rendering.class, ButtonListPaneOuterClass$ButtonListPane.Rendering.class, ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering.class, ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Rendering.class, ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering.class, ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Rendering.class, SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering.class, UserInputPaneOuterClass$UserInputPane.Rendering.class, UserSelectionPaneOuterClass$UserSelectionPane.Rendering.class, GridSelectionPaneOuterClass$GridSelectionPane.Rendering.class, OauthPane$OAuthPane.Rendering.class, OrderedListPaneOuterClass$OrderedListPane.Rendering.class, ChallengePaneOuterClass$ChallengePane.Rendering.class, HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering.class, QrCodePane$QRCodePane.Rendering.class, FlexiblePaneOuterClass$FlexiblePane.Rendering.class, LoadingPaneOuterClass$LoadingPane.Rendering.class, SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering.class, VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Rendering.class, C6894xa350b647.Rendering.class, IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Rendering.class, ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering.class, ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Pane$PaneRendering> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Pane$PaneRendering.class) {
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

    public Pane$AutomaticActions getAutomaticActions() {
        Pane$AutomaticActions pane$AutomaticActions = this.automaticActions_;
        return pane$AutomaticActions == null ? Pane$AutomaticActions.getDefaultInstance() : pane$AutomaticActions;
    }

    public ButtonPaneOuterClass$ButtonPane.Rendering getButton() {
        return this.renderingCase_ == 105 ? (ButtonPaneOuterClass$ButtonPane.Rendering) this.rendering_ : ButtonPaneOuterClass$ButtonPane.Rendering.getDefaultInstance();
    }

    public ButtonListPaneOuterClass$ButtonListPane.Rendering getButtonList() {
        return this.renderingCase_ == 106 ? (ButtonListPaneOuterClass$ButtonListPane.Rendering) this.rendering_ : ButtonListPaneOuterClass$ButtonListPane.Rendering.getDefaultInstance();
    }

    public ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering getButtonWithAccordion() {
        return this.renderingCase_ == 107 ? (ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering) this.rendering_ : ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering.getDefaultInstance();
    }

    public ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Rendering getButtonWithCards() {
        return this.renderingCase_ == 108 ? (ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Rendering) this.rendering_ : ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Rendering.getDefaultInstance();
    }

    public ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering getButtonWithTable() {
        return this.renderingCase_ == 109 ? (ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering) this.rendering_ : ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering.getDefaultInstance();
    }

    public ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Rendering getButtonWithWebview() {
        return this.renderingCase_ == 110 ? (ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Rendering) this.rendering_ : ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Rendering.getDefaultInstance();
    }

    public ChallengePaneOuterClass$ChallengePane.Rendering getChallenge() {
        return this.renderingCase_ == 117 ? (ChallengePaneOuterClass$ChallengePane.Rendering) this.rendering_ : ChallengePaneOuterClass$ChallengePane.Rendering.getDefaultInstance();
    }

    public ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering getClientSubmission() {
        return this.renderingCase_ == 165 ? (ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering) this.rendering_ : ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering.getDefaultInstance();
    }

    public ConsentPaneOuterClass$ConsentPane.Rendering getConsent() {
        return this.renderingCase_ == 104 ? (ConsentPaneOuterClass$ConsentPane.Rendering) this.rendering_ : ConsentPaneOuterClass$ConsentPane.Rendering.getDefaultInstance();
    }

    public CredentialsPaneOuterClass$CredentialsPane.Rendering getCredentials() {
        return this.renderingCase_ == 103 ? (CredentialsPaneOuterClass$CredentialsPane.Rendering) this.rendering_ : CredentialsPaneOuterClass$CredentialsPane.Rendering.getDefaultInstance();
    }

    public FlexiblePaneOuterClass$FlexiblePane.Rendering getFlexible() {
        return this.renderingCase_ == 128 ? (FlexiblePaneOuterClass$FlexiblePane.Rendering) this.rendering_ : FlexiblePaneOuterClass$FlexiblePane.Rendering.getDefaultInstance();
    }

    public GridSelectionPaneOuterClass$GridSelectionPane.Rendering getGridSelection() {
        return this.renderingCase_ == 114 ? (GridSelectionPaneOuterClass$GridSelectionPane.Rendering) this.rendering_ : GridSelectionPaneOuterClass$GridSelectionPane.Rendering.getDefaultInstance();
    }

    public HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering getHeadlessOAuth() {
        return this.renderingCase_ == 120 ? (HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering) this.rendering_ : HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering.getDefaultInstance();
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Rendering getIdentityDataSharing() {
        return this.renderingCase_ == 151 ? (IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Rendering) this.rendering_ : IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Rendering.getDefaultInstance();
    }

    public LoadingPaneOuterClass$LoadingPane.Rendering getLoading() {
        return this.renderingCase_ == 131 ? (LoadingPaneOuterClass$LoadingPane.Rendering) this.rendering_ : LoadingPaneOuterClass$LoadingPane.Rendering.getDefaultInstance();
    }

    public LoggingMetadata getLoggingMetadata() {
        LoggingMetadata loggingMetadata = this.loggingMetadata_;
        return loggingMetadata == null ? LoggingMetadata.getDefaultInstance() : loggingMetadata;
    }

    public Pane$Navigation getNavigation() {
        Pane$Navigation pane$Navigation = this.navigation_;
        return pane$Navigation == null ? Pane$Navigation.getDefaultInstance() : pane$Navigation;
    }

    public OauthPane$OAuthPane.Rendering getOauth() {
        return this.renderingCase_ == 115 ? (OauthPane$OAuthPane.Rendering) this.rendering_ : OauthPane$OAuthPane.Rendering.getDefaultInstance();
    }

    public OrderedListPaneOuterClass$OrderedListPane.Rendering getOrderedList() {
        return this.renderingCase_ == 116 ? (OrderedListPaneOuterClass$OrderedListPane.Rendering) this.rendering_ : OrderedListPaneOuterClass$OrderedListPane.Rendering.getDefaultInstance();
    }

    public String getPaneNodeId() {
        return this.paneNodeId_;
    }

    public ByteString getPaneNodeIdBytes() {
        return ByteString.copyFromUtf8(this.paneNodeId_);
    }

    public Pane$PresentationMode getPresentationMode() {
        Pane$PresentationMode pane$PresentationMode = this.presentationMode_;
        return pane$PresentationMode == null ? Pane$PresentationMode.getDefaultInstance() : pane$PresentationMode;
    }

    public ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering getProfileAuthentication() {
        return this.renderingCase_ == 167 ? (ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering) this.rendering_ : ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering.getDefaultInstance();
    }

    public QrCodePane$QRCodePane.Rendering getQrCode() {
        return this.renderingCase_ == 125 ? (QrCodePane$QRCodePane.Rendering) this.rendering_ : QrCodePane$QRCodePane.Rendering.getDefaultInstance();
    }

    public EnumC6734b getRenderingCase() {
        return EnumC6734b.forNumber(this.renderingCase_);
    }

    public String getRenderingPropertyKey() {
        return this.renderingPropertyKey_;
    }

    public ByteString getRenderingPropertyKeyBytes() {
        return ByteString.copyFromUtf8(this.renderingPropertyKey_);
    }

    public String getSandboxMessage() {
        return this.sandboxMessage_;
    }

    public ByteString getSandboxMessageBytes() {
        return ByteString.copyFromUtf8(this.sandboxMessage_);
    }

    public SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering getSearchAndSelect() {
        return this.renderingCase_ == 111 ? (SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering) this.rendering_ : SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering.getDefaultInstance();
    }

    public SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering getSessionHandoff() {
        return this.renderingCase_ == 136 ? (SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering) this.rendering_ : SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering.getDefaultInstance();
    }

    public SinkPaneOuterClass$SinkPane.Rendering getSink() {
        return this.renderingCase_ == 102 ? (SinkPaneOuterClass$SinkPane.Rendering) this.rendering_ : SinkPaneOuterClass$SinkPane.Rendering.getDefaultInstance();
    }

    public SourcePaneOuterClass$SourcePane.Rendering getSource() {
        return this.renderingCase_ == 101 ? (SourcePaneOuterClass$SourcePane.Rendering) this.rendering_ : SourcePaneOuterClass$SourcePane.Rendering.getDefaultInstance();
    }

    public UserInputPaneOuterClass$UserInputPane.Rendering getUserInput() {
        return this.renderingCase_ == 112 ? (UserInputPaneOuterClass$UserInputPane.Rendering) this.rendering_ : UserInputPaneOuterClass$UserInputPane.Rendering.getDefaultInstance();
    }

    public UserSelectionPaneOuterClass$UserSelectionPane.Rendering getUserSelection() {
        return this.renderingCase_ == 113 ? (UserSelectionPaneOuterClass$UserSelectionPane.Rendering) this.rendering_ : UserSelectionPaneOuterClass$UserSelectionPane.Rendering.getDefaultInstance();
    }

    public VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Rendering getVariableHeightButton() {
        return this.renderingCase_ == 144 ? (VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Rendering) this.rendering_ : VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Rendering.getDefaultInstance();
    }

    public C6894xa350b647.Rendering getVariableHeightVerificationCodeInput() {
        return this.renderingCase_ == 147 ? (C6894xa350b647.Rendering) this.rendering_ : C6894xa350b647.Rendering.getDefaultInstance();
    }

    public boolean hasAutomaticActions() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasButton() {
        return this.renderingCase_ == 105;
    }

    public boolean hasButtonList() {
        return this.renderingCase_ == 106;
    }

    public boolean hasButtonWithAccordion() {
        return this.renderingCase_ == 107;
    }

    public boolean hasButtonWithCards() {
        return this.renderingCase_ == 108;
    }

    public boolean hasButtonWithTable() {
        return this.renderingCase_ == 109;
    }

    public boolean hasButtonWithWebview() {
        return this.renderingCase_ == 110;
    }

    public boolean hasChallenge() {
        return this.renderingCase_ == 117;
    }

    public boolean hasClientSubmission() {
        return this.renderingCase_ == 165;
    }

    public boolean hasConsent() {
        return this.renderingCase_ == 104;
    }

    public boolean hasCredentials() {
        return this.renderingCase_ == 103;
    }

    public boolean hasFlexible() {
        return this.renderingCase_ == 128;
    }

    public boolean hasGridSelection() {
        return this.renderingCase_ == 114;
    }

    public boolean hasHeadlessOAuth() {
        return this.renderingCase_ == 120;
    }

    public boolean hasIdentityDataSharing() {
        return this.renderingCase_ == 151;
    }

    public boolean hasLoading() {
        return this.renderingCase_ == 131;
    }

    public boolean hasLoggingMetadata() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasNavigation() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOauth() {
        return this.renderingCase_ == 115;
    }

    public boolean hasOrderedList() {
        return this.renderingCase_ == 116;
    }

    public boolean hasPresentationMode() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasProfileAuthentication() {
        return this.renderingCase_ == 167;
    }

    public boolean hasQrCode() {
        return this.renderingCase_ == 125;
    }

    public boolean hasSearchAndSelect() {
        return this.renderingCase_ == 111;
    }

    public boolean hasSessionHandoff() {
        return this.renderingCase_ == 136;
    }

    public boolean hasSink() {
        return this.renderingCase_ == 102;
    }

    public boolean hasSource() {
        return this.renderingCase_ == 101;
    }

    public boolean hasUserInput() {
        return this.renderingCase_ == 112;
    }

    public boolean hasUserSelection() {
        return this.renderingCase_ == 113;
    }

    public boolean hasVariableHeightButton() {
        return this.renderingCase_ == 144;
    }

    public boolean hasVariableHeightVerificationCodeInput() {
        return this.renderingCase_ == 147;
    }

    public static C6733a newBuilder(Pane$PaneRendering pane$PaneRendering) {
        return DEFAULT_INSTANCE.createBuilder(pane$PaneRendering);
    }

    public static Pane$PaneRendering parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PaneRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Pane$PaneRendering parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Pane$PaneRendering parseFrom(ByteString byteString) {
        return (Pane$PaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Pane$PaneRendering parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Pane$PaneRendering parseFrom(byte[] bArr) {
        return (Pane$PaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Pane$PaneRendering parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Pane$PaneRendering parseFrom(InputStream inputStream) {
        return (Pane$PaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Pane$PaneRendering parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Pane$PaneRendering parseFrom(CodedInputStream codedInputStream) {
        return (Pane$PaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Pane$PaneRendering parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
