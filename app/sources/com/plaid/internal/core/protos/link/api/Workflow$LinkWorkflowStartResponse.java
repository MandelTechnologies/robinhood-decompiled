package com.plaid.internal.core.protos.link.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.BoolValue;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.FloatValue;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int64Value;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.StringValue;
import com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC6691M;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC6930p0;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.core.protos.link.workflow.primitives.EnumC7026f;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class Workflow$LinkWorkflowStartResponse extends GeneratedMessageLite<Workflow$LinkWorkflowStartResponse, C6253b> implements MessageLiteOrBuilder {
    public static final int ADDITIONAL_PANES_FIELD_NUMBER = 3;
    public static final int ANDROID_SMS_VERIFICATION_API_TYPE_FIELD_NUMBER = 13;
    public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 6;
    private static final Workflow$LinkWorkflowStartResponse DEFAULT_INSTANCE;
    public static final int ERROR_TRACKING_METADATA_FIELD_NUMBER = 10;
    public static final int EVENTS_FIELD_NUMBER = 5;
    public static final int HEARTBEAT_CONFIGURATION_FIELD_NUMBER = 9;
    public static final int NEXT_PANE_FIELD_NUMBER = 2;
    private static volatile Parser<Workflow$LinkWorkflowStartResponse> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 4;
    public static final int SEND_BACKEND_EVENTS_FIELD_NUMBER = 12;
    public static final int SESSION_RENDERING_DATA_FIELD_NUMBER = 8;
    public static final int TD_RUN_CONFIGURATION_FIELD_NUMBER = 14;
    public static final int WEBVIEW_FALLBACK_FIELD_NUMBER = 7;
    public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 1;
    private int androidSmsVerificationApiType_;
    private int bitField0_;
    private ErrorTrackingMetadata errorTrackingMetadata_;
    private Events events_;
    private HeartbeatConfiguration heartbeatConfiguration_;
    private Pane$PaneRendering nextPane_;
    private int sendBackendEvents_;
    private SessionRenderingData sessionRenderingData_;
    private int tdRunConfiguration_;
    private Common$WebviewFallback webviewFallback_;
    private String workflowSessionId_ = "";
    private String continuationToken_ = "";
    private Internal.ProtobufList<Pane$PaneRendering> additionalPanes_ = GeneratedMessageLite.emptyProtobufList();
    private String requestId_ = "";

    public static final class ErrorTrackingMetadata extends GeneratedMessageLite<ErrorTrackingMetadata, C6231a> implements MessageLiteOrBuilder {
        private static final ErrorTrackingMetadata DEFAULT_INSTANCE;
        private static volatile Parser<ErrorTrackingMetadata> PARSER = null;
        public static final int WORKFLOW_NAME_FIELD_NUMBER = 1;
        private String workflowName_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$ErrorTrackingMetadata$a */
        public static final class C6231a extends GeneratedMessageLite.Builder<ErrorTrackingMetadata, C6231a> implements MessageLiteOrBuilder {
            public C6231a() {
                super(ErrorTrackingMetadata.DEFAULT_INSTANCE);
            }
        }

        static {
            ErrorTrackingMetadata errorTrackingMetadata = new ErrorTrackingMetadata();
            DEFAULT_INSTANCE = errorTrackingMetadata;
            GeneratedMessageLite.registerDefaultInstance(ErrorTrackingMetadata.class, errorTrackingMetadata);
        }

        private ErrorTrackingMetadata() {
        }

        private void clearWorkflowName() {
            this.workflowName_ = getDefaultInstance().getWorkflowName();
        }

        public static ErrorTrackingMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6231a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ErrorTrackingMetadata parseDelimitedFrom(InputStream inputStream) {
            return (ErrorTrackingMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ErrorTrackingMetadata parseFrom(ByteBuffer byteBuffer) {
            return (ErrorTrackingMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ErrorTrackingMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setWorkflowName(String str) {
            str.getClass();
            this.workflowName_ = str;
        }

        private void setWorkflowNameBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.workflowName_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ErrorTrackingMetadata();
                case 2:
                    return new C6231a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"workflowName_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ErrorTrackingMetadata> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ErrorTrackingMetadata.class) {
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

        public String getWorkflowName() {
            return this.workflowName_;
        }

        public ByteString getWorkflowNameBytes() {
            return ByteString.copyFromUtf8(this.workflowName_);
        }

        public static C6231a newBuilder(ErrorTrackingMetadata errorTrackingMetadata) {
            return DEFAULT_INSTANCE.createBuilder(errorTrackingMetadata);
        }

        public static ErrorTrackingMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ErrorTrackingMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ErrorTrackingMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ErrorTrackingMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ErrorTrackingMetadata parseFrom(ByteString byteString) {
            return (ErrorTrackingMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ErrorTrackingMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ErrorTrackingMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ErrorTrackingMetadata parseFrom(byte[] bArr) {
            return (ErrorTrackingMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ErrorTrackingMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ErrorTrackingMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ErrorTrackingMetadata parseFrom(InputStream inputStream) {
            return (ErrorTrackingMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ErrorTrackingMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ErrorTrackingMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ErrorTrackingMetadata parseFrom(CodedInputStream codedInputStream) {
            return (ErrorTrackingMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ErrorTrackingMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ErrorTrackingMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Events extends GeneratedMessageLite<Events, C6232a> implements MessageLiteOrBuilder {
        private static final Events DEFAULT_INSTANCE;
        public static final int ON_APPEAR_FIELD_NUMBER = 1;
        private static volatile Parser<Events> PARSER;
        private Internal.ProtobufList<Common$SDKEvent> onAppear_ = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$Events$a */
        public static final class C6232a extends GeneratedMessageLite.Builder<Events, C6232a> implements MessageLiteOrBuilder {
            public C6232a() {
                super(Events.DEFAULT_INSTANCE);
            }
        }

        static {
            Events events = new Events();
            DEFAULT_INSTANCE = events;
            GeneratedMessageLite.registerDefaultInstance(Events.class, events);
        }

        private Events() {
        }

        private void addAllOnAppear(Iterable<? extends Common$SDKEvent> iterable) {
            ensureOnAppearIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.onAppear_);
        }

        private void addOnAppear(Common$SDKEvent common$SDKEvent) {
            common$SDKEvent.getClass();
            ensureOnAppearIsMutable();
            this.onAppear_.add(common$SDKEvent);
        }

        private void clearOnAppear() {
            this.onAppear_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureOnAppearIsMutable() {
            Internal.ProtobufList<Common$SDKEvent> protobufList = this.onAppear_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.onAppear_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static Events getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6232a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Events parseDelimitedFrom(InputStream inputStream) {
            return (Events) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Events parseFrom(ByteBuffer byteBuffer) {
            return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Events> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeOnAppear(int i) {
            ensureOnAppearIsMutable();
            this.onAppear_.remove(i);
        }

        private void setOnAppear(int i, Common$SDKEvent common$SDKEvent) {
            common$SDKEvent.getClass();
            ensureOnAppearIsMutable();
            this.onAppear_.set(i, common$SDKEvent);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Events();
                case 2:
                    return new C6232a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"onAppear_", Common$SDKEvent.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Events> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Events.class) {
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

        public Common$SDKEvent getOnAppear(int i) {
            return this.onAppear_.get(i);
        }

        public int getOnAppearCount() {
            return this.onAppear_.size();
        }

        public List<Common$SDKEvent> getOnAppearList() {
            return this.onAppear_;
        }

        public InterfaceC6691M getOnAppearOrBuilder(int i) {
            return this.onAppear_.get(i);
        }

        public List<? extends InterfaceC6691M> getOnAppearOrBuilderList() {
            return this.onAppear_;
        }

        public static C6232a newBuilder(Events events) {
            return DEFAULT_INSTANCE.createBuilder(events);
        }

        public static Events parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Events) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Events parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Events parseFrom(ByteString byteString) {
            return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void addOnAppear(int i, Common$SDKEvent common$SDKEvent) {
            common$SDKEvent.getClass();
            ensureOnAppearIsMutable();
            this.onAppear_.add(i, common$SDKEvent);
        }

        public static Events parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Events parseFrom(byte[] bArr) {
            return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Events parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Events parseFrom(InputStream inputStream) {
            return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Events parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Events parseFrom(CodedInputStream codedInputStream) {
            return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Events parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class HeartbeatConfiguration extends GeneratedMessageLite<HeartbeatConfiguration, C6233a> implements MessageLiteOrBuilder {
        private static final HeartbeatConfiguration DEFAULT_INSTANCE;
        public static final int LINK_SESSION_ID_FIELD_NUMBER = 1;
        private static volatile Parser<HeartbeatConfiguration> PARSER = null;
        public static final int SERVE_NEW_WARDEN_FIELD_NUMBER = 2;
        private String linkSessionId_ = "";
        private boolean serveNewWarden_;

        /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$HeartbeatConfiguration$a */
        public static final class C6233a extends GeneratedMessageLite.Builder<HeartbeatConfiguration, C6233a> implements MessageLiteOrBuilder {
            public C6233a() {
                super(HeartbeatConfiguration.DEFAULT_INSTANCE);
            }
        }

        static {
            HeartbeatConfiguration heartbeatConfiguration = new HeartbeatConfiguration();
            DEFAULT_INSTANCE = heartbeatConfiguration;
            GeneratedMessageLite.registerDefaultInstance(HeartbeatConfiguration.class, heartbeatConfiguration);
        }

        private HeartbeatConfiguration() {
        }

        private void clearLinkSessionId() {
            this.linkSessionId_ = getDefaultInstance().getLinkSessionId();
        }

        private void clearServeNewWarden() {
            this.serveNewWarden_ = false;
        }

        public static HeartbeatConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6233a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static HeartbeatConfiguration parseDelimitedFrom(InputStream inputStream) {
            return (HeartbeatConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeartbeatConfiguration parseFrom(ByteBuffer byteBuffer) {
            return (HeartbeatConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<HeartbeatConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setLinkSessionId(String str) {
            str.getClass();
            this.linkSessionId_ = str;
        }

        private void setLinkSessionIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.linkSessionId_ = byteString.toStringUtf8();
        }

        private void setServeNewWarden(boolean z) {
            this.serveNewWarden_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                case 1:
                    return new HeartbeatConfiguration();
                case 2:
                    return new C6233a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"linkSessionId_", "serveNewWarden_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<HeartbeatConfiguration> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (HeartbeatConfiguration.class) {
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

        public String getLinkSessionId() {
            return this.linkSessionId_;
        }

        public ByteString getLinkSessionIdBytes() {
            return ByteString.copyFromUtf8(this.linkSessionId_);
        }

        public boolean getServeNewWarden() {
            return this.serveNewWarden_;
        }

        public static C6233a newBuilder(HeartbeatConfiguration heartbeatConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(heartbeatConfiguration);
        }

        public static HeartbeatConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HeartbeatConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HeartbeatConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (HeartbeatConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static HeartbeatConfiguration parseFrom(ByteString byteString) {
            return (HeartbeatConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static HeartbeatConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (HeartbeatConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static HeartbeatConfiguration parseFrom(byte[] bArr) {
            return (HeartbeatConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HeartbeatConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (HeartbeatConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static HeartbeatConfiguration parseFrom(InputStream inputStream) {
            return (HeartbeatConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeartbeatConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HeartbeatConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HeartbeatConfiguration parseFrom(CodedInputStream codedInputStream) {
            return (HeartbeatConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static HeartbeatConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HeartbeatConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SessionRenderingData extends GeneratedMessageLite<SessionRenderingData, C6248b> implements MessageLiteOrBuilder {
        public static final int APPEARANCE_FIELD_NUMBER = 6;
        public static final int BODY_TEXT_OVERRIDE_FIELD_NUMBER = 15;
        private static final SessionRenderingData DEFAULT_INSTANCE;
        public static final int DISCLAIMER_TEXT_OVERRIDE_FIELD_NUMBER = 16;
        public static final int HEADER_TEXT_OVERRIDE_FIELD_NUMBER = 10;
        public static final int ILLUSTRATION_OVERRIDE_FIELD_NUMBER = 11;
        public static final int INSTANTIATE_WEB3_BRIDGE_FIELD_NUMBER = 5;
        public static final int NAVIGATION_OVERRIDE_FIELD_NUMBER = 18;
        public static final int OVERLAY_BACKGROUND_COLOR_FIELD_NUMBER = 2;
        public static final int OVERLAY_BACKGROUND_FOOTER_FIELD_NUMBER = 1;
        private static volatile Parser<SessionRenderingData> PARSER = null;
        public static final int PRIMARY_BUTTON_OVERRIDE_FIELD_NUMBER = 12;
        public static final int RECAPTCHA_ENTERPRISE_ENABLED_FIELD_NUMBER = 3;
        public static final int SPACING_OVERRIDE_FIELD_NUMBER = 19;
        public static final int TEXT_ALIGNMENT_OVERRIDE_FIELD_NUMBER = 9;
        public static final int TEXT_INPUT_OVERRIDE_FIELD_NUMBER = 14;
        public static final int THREADS_INPUT_VARIATION_FIELD_NUMBER = 13;
        public static final int USE_HAPTICS_FIELD_NUMBER = 17;
        public static final int USE_HOSTED_LINK_UI_CUSTOMIZATIONS_FIELD_NUMBER = 8;
        public static final int USE_LINK_REFRESH_FIELD_NUMBER = 7;
        private int appearance_;
        private int bitField0_;
        private BodyTextOverride bodyTextOverride_;
        private DisclaimerTextOverride disclaimerTextOverride_;
        private HeaderTextOverride headerTextOverride_;
        private IllustrationOverride illustrationOverride_;
        private boolean instantiateWeb3Bridge_;
        private NavigationOverride navigationOverride_;
        private Common$AttributedLocalizedString overlayBackgroundFooter_;
        private PrimaryButtonOverride primaryButtonOverride_;
        private boolean recaptchaEnterpriseEnabled_;
        private SpacingOverride spacingOverride_;
        private int textAlignmentOverride_;
        private TextInputOverride textInputOverride_;
        private boolean useHaptics_;
        private boolean useHostedLinkUiCustomizations_;
        private boolean useLinkRefresh_;
        private String overlayBackgroundColor_ = "";
        private String threadsInputVariation_ = "";

        public static final class BaseTextInputOverride extends GeneratedMessageLite<BaseTextInputOverride, C6234a> implements MessageLiteOrBuilder {
            public static final int ACTIVE_BORDER_COLOR_FIELD_NUMBER = 5;
            public static final int BORDER_COLOR_FIELD_NUMBER = 4;
            public static final int BORDER_RADIUS_FIELD_NUMBER = 2;
            public static final int BORDER_WIDTH_FIELD_NUMBER = 3;
            private static final BaseTextInputOverride DEFAULT_INSTANCE;
            public static final int HEIGHT_FIELD_NUMBER = 1;
            public static final int HIDE_CALLING_CODE_FIELD_NUMBER = 6;
            private static volatile Parser<BaseTextInputOverride> PARSER;
            private StringValue activeBorderColor_;
            private int bitField0_;
            private StringValue borderColor_;
            private Int64Value borderRadius_;
            private FloatValue borderWidth_;
            private Int64Value height_;
            private BoolValue hideCallingCode_;

            /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$SessionRenderingData$BaseTextInputOverride$a */
            public static final class C6234a extends GeneratedMessageLite.Builder<BaseTextInputOverride, C6234a> implements MessageLiteOrBuilder {
                public C6234a() {
                    super(BaseTextInputOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                BaseTextInputOverride baseTextInputOverride = new BaseTextInputOverride();
                DEFAULT_INSTANCE = baseTextInputOverride;
                GeneratedMessageLite.registerDefaultInstance(BaseTextInputOverride.class, baseTextInputOverride);
            }

            private BaseTextInputOverride() {
            }

            private void clearActiveBorderColor() {
                this.activeBorderColor_ = null;
                this.bitField0_ &= -17;
            }

            private void clearBorderColor() {
                this.borderColor_ = null;
                this.bitField0_ &= -9;
            }

            private void clearBorderRadius() {
                this.borderRadius_ = null;
                this.bitField0_ &= -3;
            }

            private void clearBorderWidth() {
                this.borderWidth_ = null;
                this.bitField0_ &= -5;
            }

            private void clearHeight() {
                this.height_ = null;
                this.bitField0_ &= -2;
            }

            private void clearHideCallingCode() {
                this.hideCallingCode_ = null;
                this.bitField0_ &= -33;
            }

            public static BaseTextInputOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeActiveBorderColor(StringValue stringValue) {
                stringValue.getClass();
                StringValue stringValue2 = this.activeBorderColor_;
                if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                    this.activeBorderColor_ = stringValue;
                } else {
                    this.activeBorderColor_ = StringValue.newBuilder(this.activeBorderColor_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
                }
                this.bitField0_ |= 16;
            }

            private void mergeBorderColor(StringValue stringValue) {
                stringValue.getClass();
                StringValue stringValue2 = this.borderColor_;
                if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                    this.borderColor_ = stringValue;
                } else {
                    this.borderColor_ = StringValue.newBuilder(this.borderColor_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            private void mergeBorderRadius(Int64Value int64Value) {
                int64Value.getClass();
                Int64Value int64Value2 = this.borderRadius_;
                if (int64Value2 == null || int64Value2 == Int64Value.getDefaultInstance()) {
                    this.borderRadius_ = int64Value;
                } else {
                    this.borderRadius_ = Int64Value.newBuilder(this.borderRadius_).mergeFrom((Int64Value.Builder) int64Value).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeBorderWidth(FloatValue floatValue) {
                floatValue.getClass();
                FloatValue floatValue2 = this.borderWidth_;
                if (floatValue2 == null || floatValue2 == FloatValue.getDefaultInstance()) {
                    this.borderWidth_ = floatValue;
                } else {
                    this.borderWidth_ = FloatValue.newBuilder(this.borderWidth_).mergeFrom((FloatValue.Builder) floatValue).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeHeight(Int64Value int64Value) {
                int64Value.getClass();
                Int64Value int64Value2 = this.height_;
                if (int64Value2 == null || int64Value2 == Int64Value.getDefaultInstance()) {
                    this.height_ = int64Value;
                } else {
                    this.height_ = Int64Value.newBuilder(this.height_).mergeFrom((Int64Value.Builder) int64Value).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeHideCallingCode(BoolValue boolValue) {
                boolValue.getClass();
                BoolValue boolValue2 = this.hideCallingCode_;
                if (boolValue2 == null || boolValue2 == BoolValue.getDefaultInstance()) {
                    this.hideCallingCode_ = boolValue;
                } else {
                    this.hideCallingCode_ = BoolValue.newBuilder(this.hideCallingCode_).mergeFrom((BoolValue.Builder) boolValue).buildPartial();
                }
                this.bitField0_ |= 32;
            }

            public static C6234a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static BaseTextInputOverride parseDelimitedFrom(InputStream inputStream) {
                return (BaseTextInputOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static BaseTextInputOverride parseFrom(ByteBuffer byteBuffer) {
                return (BaseTextInputOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<BaseTextInputOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setActiveBorderColor(StringValue stringValue) {
                stringValue.getClass();
                this.activeBorderColor_ = stringValue;
                this.bitField0_ |= 16;
            }

            private void setBorderColor(StringValue stringValue) {
                stringValue.getClass();
                this.borderColor_ = stringValue;
                this.bitField0_ |= 8;
            }

            private void setBorderRadius(Int64Value int64Value) {
                int64Value.getClass();
                this.borderRadius_ = int64Value;
                this.bitField0_ |= 2;
            }

            private void setBorderWidth(FloatValue floatValue) {
                floatValue.getClass();
                this.borderWidth_ = floatValue;
                this.bitField0_ |= 4;
            }

            private void setHeight(Int64Value int64Value) {
                int64Value.getClass();
                this.height_ = int64Value;
                this.bitField0_ |= 1;
            }

            private void setHideCallingCode(BoolValue boolValue) {
                boolValue.getClass();
                this.hideCallingCode_ = boolValue;
                this.bitField0_ |= 32;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new BaseTextInputOverride();
                    case 2:
                        return new C6234a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"bitField0_", "height_", "borderRadius_", "borderWidth_", "borderColor_", "activeBorderColor_", "hideCallingCode_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<BaseTextInputOverride> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (BaseTextInputOverride.class) {
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

            public StringValue getActiveBorderColor() {
                StringValue stringValue = this.activeBorderColor_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            public StringValue getBorderColor() {
                StringValue stringValue = this.borderColor_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            public Int64Value getBorderRadius() {
                Int64Value int64Value = this.borderRadius_;
                return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
            }

            public FloatValue getBorderWidth() {
                FloatValue floatValue = this.borderWidth_;
                return floatValue == null ? FloatValue.getDefaultInstance() : floatValue;
            }

            public Int64Value getHeight() {
                Int64Value int64Value = this.height_;
                return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
            }

            public BoolValue getHideCallingCode() {
                BoolValue boolValue = this.hideCallingCode_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            public boolean hasActiveBorderColor() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasBorderColor() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasBorderRadius() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasBorderWidth() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasHeight() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasHideCallingCode() {
                return (this.bitField0_ & 32) != 0;
            }

            public static C6234a newBuilder(BaseTextInputOverride baseTextInputOverride) {
                return DEFAULT_INSTANCE.createBuilder(baseTextInputOverride);
            }

            public static BaseTextInputOverride parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (BaseTextInputOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static BaseTextInputOverride parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (BaseTextInputOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static BaseTextInputOverride parseFrom(ByteString byteString) {
                return (BaseTextInputOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static BaseTextInputOverride parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (BaseTextInputOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static BaseTextInputOverride parseFrom(byte[] bArr) {
                return (BaseTextInputOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static BaseTextInputOverride parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (BaseTextInputOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static BaseTextInputOverride parseFrom(InputStream inputStream) {
                return (BaseTextInputOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static BaseTextInputOverride parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (BaseTextInputOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static BaseTextInputOverride parseFrom(CodedInputStream codedInputStream) {
                return (BaseTextInputOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static BaseTextInputOverride parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (BaseTextInputOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class BodyTextOverride extends GeneratedMessageLite<BodyTextOverride, C6235a> implements MessageLiteOrBuilder {
            public static final int DEFAULT_FONT_OVERRIDE_FIELD_NUMBER = 1;
            private static final BodyTextOverride DEFAULT_INSTANCE;
            private static volatile Parser<BodyTextOverride> PARSER;
            private int bitField0_;
            private FontOverride defaultFontOverride_;

            /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$SessionRenderingData$BodyTextOverride$a */
            public static final class C6235a extends GeneratedMessageLite.Builder<BodyTextOverride, C6235a> implements MessageLiteOrBuilder {
                public C6235a() {
                    super(BodyTextOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                BodyTextOverride bodyTextOverride = new BodyTextOverride();
                DEFAULT_INSTANCE = bodyTextOverride;
                GeneratedMessageLite.registerDefaultInstance(BodyTextOverride.class, bodyTextOverride);
            }

            private BodyTextOverride() {
            }

            private void clearDefaultFontOverride() {
                this.defaultFontOverride_ = null;
                this.bitField0_ &= -2;
            }

            public static BodyTextOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeDefaultFontOverride(FontOverride fontOverride) {
                fontOverride.getClass();
                FontOverride fontOverride2 = this.defaultFontOverride_;
                if (fontOverride2 == null || fontOverride2 == FontOverride.getDefaultInstance()) {
                    this.defaultFontOverride_ = fontOverride;
                } else {
                    this.defaultFontOverride_ = FontOverride.newBuilder(this.defaultFontOverride_).mergeFrom((FontOverride.C6238a) fontOverride).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6235a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static BodyTextOverride parseDelimitedFrom(InputStream inputStream) {
                return (BodyTextOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static BodyTextOverride parseFrom(ByteBuffer byteBuffer) {
                return (BodyTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<BodyTextOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setDefaultFontOverride(FontOverride fontOverride) {
                fontOverride.getClass();
                this.defaultFontOverride_ = fontOverride;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new BodyTextOverride();
                    case 2:
                        return new C6235a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "defaultFontOverride_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<BodyTextOverride> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (BodyTextOverride.class) {
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

            public FontOverride getDefaultFontOverride() {
                FontOverride fontOverride = this.defaultFontOverride_;
                return fontOverride == null ? FontOverride.getDefaultInstance() : fontOverride;
            }

            public boolean hasDefaultFontOverride() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6235a newBuilder(BodyTextOverride bodyTextOverride) {
                return DEFAULT_INSTANCE.createBuilder(bodyTextOverride);
            }

            public static BodyTextOverride parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (BodyTextOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static BodyTextOverride parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (BodyTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static BodyTextOverride parseFrom(ByteString byteString) {
                return (BodyTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static BodyTextOverride parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (BodyTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static BodyTextOverride parseFrom(byte[] bArr) {
                return (BodyTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static BodyTextOverride parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (BodyTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static BodyTextOverride parseFrom(InputStream inputStream) {
                return (BodyTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static BodyTextOverride parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (BodyTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static BodyTextOverride parseFrom(CodedInputStream codedInputStream) {
                return (BodyTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static BodyTextOverride parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (BodyTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ButtonOverride extends GeneratedMessageLite<ButtonOverride, C6236a> implements MessageLiteOrBuilder {
            private static final ButtonOverride DEFAULT_INSTANCE;
            public static final int FONT_SIZE_FIELD_NUMBER = 2;
            public static final int HEIGHT_FIELD_NUMBER = 1;
            private static volatile Parser<ButtonOverride> PARSER;
            private int bitField0_;
            private Int64Value fontSize_;
            private Int64Value height_;

            /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$SessionRenderingData$ButtonOverride$a */
            public static final class C6236a extends GeneratedMessageLite.Builder<ButtonOverride, C6236a> implements MessageLiteOrBuilder {
                public C6236a() {
                    super(ButtonOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                ButtonOverride buttonOverride = new ButtonOverride();
                DEFAULT_INSTANCE = buttonOverride;
                GeneratedMessageLite.registerDefaultInstance(ButtonOverride.class, buttonOverride);
            }

            private ButtonOverride() {
            }

            private void clearFontSize() {
                this.fontSize_ = null;
                this.bitField0_ &= -3;
            }

            private void clearHeight() {
                this.height_ = null;
                this.bitField0_ &= -2;
            }

            public static ButtonOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeFontSize(Int64Value int64Value) {
                int64Value.getClass();
                Int64Value int64Value2 = this.fontSize_;
                if (int64Value2 == null || int64Value2 == Int64Value.getDefaultInstance()) {
                    this.fontSize_ = int64Value;
                } else {
                    this.fontSize_ = Int64Value.newBuilder(this.fontSize_).mergeFrom((Int64Value.Builder) int64Value).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeHeight(Int64Value int64Value) {
                int64Value.getClass();
                Int64Value int64Value2 = this.height_;
                if (int64Value2 == null || int64Value2 == Int64Value.getDefaultInstance()) {
                    this.height_ = int64Value;
                } else {
                    this.height_ = Int64Value.newBuilder(this.height_).mergeFrom((Int64Value.Builder) int64Value).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6236a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ButtonOverride parseDelimitedFrom(InputStream inputStream) {
                return (ButtonOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonOverride parseFrom(ByteBuffer byteBuffer) {
                return (ButtonOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ButtonOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setFontSize(Int64Value int64Value) {
                int64Value.getClass();
                this.fontSize_ = int64Value;
                this.bitField0_ |= 2;
            }

            private void setHeight(Int64Value int64Value) {
                int64Value.getClass();
                this.height_ = int64Value;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ButtonOverride();
                    case 2:
                        return new C6236a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "height_", "fontSize_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ButtonOverride> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ButtonOverride.class) {
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

            public Int64Value getFontSize() {
                Int64Value int64Value = this.fontSize_;
                return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
            }

            public Int64Value getHeight() {
                Int64Value int64Value = this.height_;
                return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
            }

            public boolean hasFontSize() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasHeight() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6236a newBuilder(ButtonOverride buttonOverride) {
                return DEFAULT_INSTANCE.createBuilder(buttonOverride);
            }

            public static ButtonOverride parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonOverride parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ButtonOverride parseFrom(ByteString byteString) {
                return (ButtonOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ButtonOverride parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ButtonOverride parseFrom(byte[] bArr) {
                return (ButtonOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ButtonOverride parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ButtonOverride parseFrom(InputStream inputStream) {
                return (ButtonOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonOverride parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonOverride parseFrom(CodedInputStream codedInputStream) {
                return (ButtonOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ButtonOverride parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class DisclaimerTextOverride extends GeneratedMessageLite<DisclaimerTextOverride, C6237a> implements MessageLiteOrBuilder {
            public static final int DEFAULT_FONT_OVERRIDE_FIELD_NUMBER = 1;
            private static final DisclaimerTextOverride DEFAULT_INSTANCE;
            private static volatile Parser<DisclaimerTextOverride> PARSER;
            private int bitField0_;
            private FontOverride defaultFontOverride_;

            /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$SessionRenderingData$DisclaimerTextOverride$a */
            public static final class C6237a extends GeneratedMessageLite.Builder<DisclaimerTextOverride, C6237a> implements MessageLiteOrBuilder {
                public C6237a() {
                    super(DisclaimerTextOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                DisclaimerTextOverride disclaimerTextOverride = new DisclaimerTextOverride();
                DEFAULT_INSTANCE = disclaimerTextOverride;
                GeneratedMessageLite.registerDefaultInstance(DisclaimerTextOverride.class, disclaimerTextOverride);
            }

            private DisclaimerTextOverride() {
            }

            private void clearDefaultFontOverride() {
                this.defaultFontOverride_ = null;
                this.bitField0_ &= -2;
            }

            public static DisclaimerTextOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeDefaultFontOverride(FontOverride fontOverride) {
                fontOverride.getClass();
                FontOverride fontOverride2 = this.defaultFontOverride_;
                if (fontOverride2 == null || fontOverride2 == FontOverride.getDefaultInstance()) {
                    this.defaultFontOverride_ = fontOverride;
                } else {
                    this.defaultFontOverride_ = FontOverride.newBuilder(this.defaultFontOverride_).mergeFrom((FontOverride.C6238a) fontOverride).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6237a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static DisclaimerTextOverride parseDelimitedFrom(InputStream inputStream) {
                return (DisclaimerTextOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static DisclaimerTextOverride parseFrom(ByteBuffer byteBuffer) {
                return (DisclaimerTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<DisclaimerTextOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setDefaultFontOverride(FontOverride fontOverride) {
                fontOverride.getClass();
                this.defaultFontOverride_ = fontOverride;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new DisclaimerTextOverride();
                    case 2:
                        return new C6237a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "defaultFontOverride_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<DisclaimerTextOverride> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (DisclaimerTextOverride.class) {
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

            public FontOverride getDefaultFontOverride() {
                FontOverride fontOverride = this.defaultFontOverride_;
                return fontOverride == null ? FontOverride.getDefaultInstance() : fontOverride;
            }

            public boolean hasDefaultFontOverride() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6237a newBuilder(DisclaimerTextOverride disclaimerTextOverride) {
                return DEFAULT_INSTANCE.createBuilder(disclaimerTextOverride);
            }

            public static DisclaimerTextOverride parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (DisclaimerTextOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static DisclaimerTextOverride parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (DisclaimerTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static DisclaimerTextOverride parseFrom(ByteString byteString) {
                return (DisclaimerTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static DisclaimerTextOverride parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (DisclaimerTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static DisclaimerTextOverride parseFrom(byte[] bArr) {
                return (DisclaimerTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static DisclaimerTextOverride parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (DisclaimerTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static DisclaimerTextOverride parseFrom(InputStream inputStream) {
                return (DisclaimerTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static DisclaimerTextOverride parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (DisclaimerTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static DisclaimerTextOverride parseFrom(CodedInputStream codedInputStream) {
                return (DisclaimerTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static DisclaimerTextOverride parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (DisclaimerTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class FontOverride extends GeneratedMessageLite<FontOverride, C6238a> implements MessageLiteOrBuilder {
            private static final FontOverride DEFAULT_INSTANCE;
            public static final int FONT_COLOR_FIELD_NUMBER = 4;
            public static final int FONT_FAMILY_FIELD_NUMBER = 1;
            public static final int FONT_SIZE_FIELD_NUMBER = 3;
            public static final int FONT_WEIGHT_FIELD_NUMBER = 2;
            public static final int HYPERLINK_FONT_FIELD_NUMBER = 6;
            public static final int LINE_HEIGHT_FIELD_NUMBER = 5;
            private static volatile Parser<FontOverride> PARSER;
            private int bitField0_;
            private StringValue fontColor_;
            private int fontFamily_;
            private Int64Value fontSize_;
            private Int64Value fontWeight_;
            private HyperlinkFontOverride hyperlinkFont_;
            private Int64Value lineHeight_;

            /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$SessionRenderingData$FontOverride$a */
            public static final class C6238a extends GeneratedMessageLite.Builder<FontOverride, C6238a> implements MessageLiteOrBuilder {
                public C6238a() {
                    super(FontOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                FontOverride fontOverride = new FontOverride();
                DEFAULT_INSTANCE = fontOverride;
                GeneratedMessageLite.registerDefaultInstance(FontOverride.class, fontOverride);
            }

            private FontOverride() {
            }

            private void clearFontColor() {
                this.fontColor_ = null;
                this.bitField0_ &= -5;
            }

            private void clearFontFamily() {
                this.fontFamily_ = 0;
            }

            private void clearFontSize() {
                this.fontSize_ = null;
                this.bitField0_ &= -3;
            }

            private void clearFontWeight() {
                this.fontWeight_ = null;
                this.bitField0_ &= -2;
            }

            private void clearHyperlinkFont() {
                this.hyperlinkFont_ = null;
                this.bitField0_ &= -17;
            }

            private void clearLineHeight() {
                this.lineHeight_ = null;
                this.bitField0_ &= -9;
            }

            public static FontOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeFontColor(StringValue stringValue) {
                stringValue.getClass();
                StringValue stringValue2 = this.fontColor_;
                if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                    this.fontColor_ = stringValue;
                } else {
                    this.fontColor_ = StringValue.newBuilder(this.fontColor_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeFontSize(Int64Value int64Value) {
                int64Value.getClass();
                Int64Value int64Value2 = this.fontSize_;
                if (int64Value2 == null || int64Value2 == Int64Value.getDefaultInstance()) {
                    this.fontSize_ = int64Value;
                } else {
                    this.fontSize_ = Int64Value.newBuilder(this.fontSize_).mergeFrom((Int64Value.Builder) int64Value).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeFontWeight(Int64Value int64Value) {
                int64Value.getClass();
                Int64Value int64Value2 = this.fontWeight_;
                if (int64Value2 == null || int64Value2 == Int64Value.getDefaultInstance()) {
                    this.fontWeight_ = int64Value;
                } else {
                    this.fontWeight_ = Int64Value.newBuilder(this.fontWeight_).mergeFrom((Int64Value.Builder) int64Value).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeHyperlinkFont(HyperlinkFontOverride hyperlinkFontOverride) {
                hyperlinkFontOverride.getClass();
                HyperlinkFontOverride hyperlinkFontOverride2 = this.hyperlinkFont_;
                if (hyperlinkFontOverride2 == null || hyperlinkFontOverride2 == HyperlinkFontOverride.getDefaultInstance()) {
                    this.hyperlinkFont_ = hyperlinkFontOverride;
                } else {
                    this.hyperlinkFont_ = HyperlinkFontOverride.newBuilder(this.hyperlinkFont_).mergeFrom((HyperlinkFontOverride.C6241a) hyperlinkFontOverride).buildPartial();
                }
                this.bitField0_ |= 16;
            }

            private void mergeLineHeight(Int64Value int64Value) {
                int64Value.getClass();
                Int64Value int64Value2 = this.lineHeight_;
                if (int64Value2 == null || int64Value2 == Int64Value.getDefaultInstance()) {
                    this.lineHeight_ = int64Value;
                } else {
                    this.lineHeight_ = Int64Value.newBuilder(this.lineHeight_).mergeFrom((Int64Value.Builder) int64Value).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            public static C6238a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static FontOverride parseDelimitedFrom(InputStream inputStream) {
                return (FontOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static FontOverride parseFrom(ByteBuffer byteBuffer) {
                return (FontOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<FontOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setFontColor(StringValue stringValue) {
                stringValue.getClass();
                this.fontColor_ = stringValue;
                this.bitField0_ |= 4;
            }

            private void setFontFamily(EnumC6250d enumC6250d) {
                this.fontFamily_ = enumC6250d.getNumber();
            }

            private void setFontFamilyValue(int i) {
                this.fontFamily_ = i;
            }

            private void setFontSize(Int64Value int64Value) {
                int64Value.getClass();
                this.fontSize_ = int64Value;
                this.bitField0_ |= 2;
            }

            private void setFontWeight(Int64Value int64Value) {
                int64Value.getClass();
                this.fontWeight_ = int64Value;
                this.bitField0_ |= 1;
            }

            private void setHyperlinkFont(HyperlinkFontOverride hyperlinkFontOverride) {
                hyperlinkFontOverride.getClass();
                this.hyperlinkFont_ = hyperlinkFontOverride;
                this.bitField0_ |= 16;
            }

            private void setLineHeight(Int64Value int64Value) {
                int64Value.getClass();
                this.lineHeight_ = int64Value;
                this.bitField0_ |= 8;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new FontOverride();
                    case 2:
                        return new C6238a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004", new Object[]{"bitField0_", "fontFamily_", "fontWeight_", "fontSize_", "fontColor_", "lineHeight_", "hyperlinkFont_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<FontOverride> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (FontOverride.class) {
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

            public StringValue getFontColor() {
                StringValue stringValue = this.fontColor_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            public EnumC6250d getFontFamily() {
                EnumC6250d enumC6250dForNumber = EnumC6250d.forNumber(this.fontFamily_);
                return enumC6250dForNumber == null ? EnumC6250d.UNRECOGNIZED : enumC6250dForNumber;
            }

            public int getFontFamilyValue() {
                return this.fontFamily_;
            }

            public Int64Value getFontSize() {
                Int64Value int64Value = this.fontSize_;
                return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
            }

            public Int64Value getFontWeight() {
                Int64Value int64Value = this.fontWeight_;
                return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
            }

            public HyperlinkFontOverride getHyperlinkFont() {
                HyperlinkFontOverride hyperlinkFontOverride = this.hyperlinkFont_;
                return hyperlinkFontOverride == null ? HyperlinkFontOverride.getDefaultInstance() : hyperlinkFontOverride;
            }

            public Int64Value getLineHeight() {
                Int64Value int64Value = this.lineHeight_;
                return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
            }

            public boolean hasFontColor() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasFontSize() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasFontWeight() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasHyperlinkFont() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasLineHeight() {
                return (this.bitField0_ & 8) != 0;
            }

            public static C6238a newBuilder(FontOverride fontOverride) {
                return DEFAULT_INSTANCE.createBuilder(fontOverride);
            }

            public static FontOverride parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (FontOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static FontOverride parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (FontOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static FontOverride parseFrom(ByteString byteString) {
                return (FontOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static FontOverride parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (FontOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static FontOverride parseFrom(byte[] bArr) {
                return (FontOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static FontOverride parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (FontOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static FontOverride parseFrom(InputStream inputStream) {
                return (FontOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static FontOverride parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (FontOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static FontOverride parseFrom(CodedInputStream codedInputStream) {
                return (FontOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static FontOverride parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (FontOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class HeaderTextOverride extends GeneratedMessageLite<HeaderTextOverride, C6239a> implements MessageLiteOrBuilder {
            public static final int DEFAULT_FONT_OVERRIDE_FIELD_NUMBER = 1;
            private static final HeaderTextOverride DEFAULT_INSTANCE;
            private static volatile Parser<HeaderTextOverride> PARSER;
            private int bitField0_;
            private FontOverride defaultFontOverride_;

            /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$SessionRenderingData$HeaderTextOverride$a */
            public static final class C6239a extends GeneratedMessageLite.Builder<HeaderTextOverride, C6239a> implements MessageLiteOrBuilder {
                public C6239a() {
                    super(HeaderTextOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                HeaderTextOverride headerTextOverride = new HeaderTextOverride();
                DEFAULT_INSTANCE = headerTextOverride;
                GeneratedMessageLite.registerDefaultInstance(HeaderTextOverride.class, headerTextOverride);
            }

            private HeaderTextOverride() {
            }

            private void clearDefaultFontOverride() {
                this.defaultFontOverride_ = null;
                this.bitField0_ &= -2;
            }

            public static HeaderTextOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeDefaultFontOverride(FontOverride fontOverride) {
                fontOverride.getClass();
                FontOverride fontOverride2 = this.defaultFontOverride_;
                if (fontOverride2 == null || fontOverride2 == FontOverride.getDefaultInstance()) {
                    this.defaultFontOverride_ = fontOverride;
                } else {
                    this.defaultFontOverride_ = FontOverride.newBuilder(this.defaultFontOverride_).mergeFrom((FontOverride.C6238a) fontOverride).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6239a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static HeaderTextOverride parseDelimitedFrom(InputStream inputStream) {
                return (HeaderTextOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static HeaderTextOverride parseFrom(ByteBuffer byteBuffer) {
                return (HeaderTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<HeaderTextOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setDefaultFontOverride(FontOverride fontOverride) {
                fontOverride.getClass();
                this.defaultFontOverride_ = fontOverride;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new HeaderTextOverride();
                    case 2:
                        return new C6239a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "defaultFontOverride_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<HeaderTextOverride> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (HeaderTextOverride.class) {
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

            public FontOverride getDefaultFontOverride() {
                FontOverride fontOverride = this.defaultFontOverride_;
                return fontOverride == null ? FontOverride.getDefaultInstance() : fontOverride;
            }

            public boolean hasDefaultFontOverride() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6239a newBuilder(HeaderTextOverride headerTextOverride) {
                return DEFAULT_INSTANCE.createBuilder(headerTextOverride);
            }

            public static HeaderTextOverride parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (HeaderTextOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static HeaderTextOverride parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (HeaderTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static HeaderTextOverride parseFrom(ByteString byteString) {
                return (HeaderTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static HeaderTextOverride parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (HeaderTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static HeaderTextOverride parseFrom(byte[] bArr) {
                return (HeaderTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static HeaderTextOverride parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (HeaderTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static HeaderTextOverride parseFrom(InputStream inputStream) {
                return (HeaderTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static HeaderTextOverride parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (HeaderTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static HeaderTextOverride parseFrom(CodedInputStream codedInputStream) {
                return (HeaderTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static HeaderTextOverride parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (HeaderTextOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class HeaderTextSpacingOverride extends GeneratedMessageLite<HeaderTextSpacingOverride, C6240a> implements MessageLiteOrBuilder {
            private static final HeaderTextSpacingOverride DEFAULT_INSTANCE;
            public static final int MARGIN_BOTTOM_FIELD_NUMBER = 1;
            private static volatile Parser<HeaderTextSpacingOverride> PARSER;
            private int bitField0_;
            private Int64Value marginBottom_;

            /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$SessionRenderingData$HeaderTextSpacingOverride$a */
            public static final class C6240a extends GeneratedMessageLite.Builder<HeaderTextSpacingOverride, C6240a> implements MessageLiteOrBuilder {
                public C6240a() {
                    super(HeaderTextSpacingOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                HeaderTextSpacingOverride headerTextSpacingOverride = new HeaderTextSpacingOverride();
                DEFAULT_INSTANCE = headerTextSpacingOverride;
                GeneratedMessageLite.registerDefaultInstance(HeaderTextSpacingOverride.class, headerTextSpacingOverride);
            }

            private HeaderTextSpacingOverride() {
            }

            private void clearMarginBottom() {
                this.marginBottom_ = null;
                this.bitField0_ &= -2;
            }

            public static HeaderTextSpacingOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeMarginBottom(Int64Value int64Value) {
                int64Value.getClass();
                Int64Value int64Value2 = this.marginBottom_;
                if (int64Value2 == null || int64Value2 == Int64Value.getDefaultInstance()) {
                    this.marginBottom_ = int64Value;
                } else {
                    this.marginBottom_ = Int64Value.newBuilder(this.marginBottom_).mergeFrom((Int64Value.Builder) int64Value).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6240a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static HeaderTextSpacingOverride parseDelimitedFrom(InputStream inputStream) {
                return (HeaderTextSpacingOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static HeaderTextSpacingOverride parseFrom(ByteBuffer byteBuffer) {
                return (HeaderTextSpacingOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<HeaderTextSpacingOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setMarginBottom(Int64Value int64Value) {
                int64Value.getClass();
                this.marginBottom_ = int64Value;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new HeaderTextSpacingOverride();
                    case 2:
                        return new C6240a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "marginBottom_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<HeaderTextSpacingOverride> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (HeaderTextSpacingOverride.class) {
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

            public Int64Value getMarginBottom() {
                Int64Value int64Value = this.marginBottom_;
                return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
            }

            public boolean hasMarginBottom() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6240a newBuilder(HeaderTextSpacingOverride headerTextSpacingOverride) {
                return DEFAULT_INSTANCE.createBuilder(headerTextSpacingOverride);
            }

            public static HeaderTextSpacingOverride parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (HeaderTextSpacingOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static HeaderTextSpacingOverride parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (HeaderTextSpacingOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static HeaderTextSpacingOverride parseFrom(ByteString byteString) {
                return (HeaderTextSpacingOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static HeaderTextSpacingOverride parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (HeaderTextSpacingOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static HeaderTextSpacingOverride parseFrom(byte[] bArr) {
                return (HeaderTextSpacingOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static HeaderTextSpacingOverride parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (HeaderTextSpacingOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static HeaderTextSpacingOverride parseFrom(InputStream inputStream) {
                return (HeaderTextSpacingOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static HeaderTextSpacingOverride parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (HeaderTextSpacingOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static HeaderTextSpacingOverride parseFrom(CodedInputStream codedInputStream) {
                return (HeaderTextSpacingOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static HeaderTextSpacingOverride parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (HeaderTextSpacingOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class HyperlinkFontOverride extends GeneratedMessageLite<HyperlinkFontOverride, C6241a> implements MessageLiteOrBuilder {
            private static final HyperlinkFontOverride DEFAULT_INSTANCE;
            public static final int FONT_COLOR_FIELD_NUMBER = 2;
            public static final int FONT_WEIGHT_FIELD_NUMBER = 1;
            private static volatile Parser<HyperlinkFontOverride> PARSER = null;
            public static final int TEXT_DECORATION_FIELD_NUMBER = 3;
            private int bitField0_;
            private StringValue fontColor_;
            private Int64Value fontWeight_;
            private StringValue textDecoration_;

            /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$SessionRenderingData$HyperlinkFontOverride$a */
            public static final class C6241a extends GeneratedMessageLite.Builder<HyperlinkFontOverride, C6241a> implements MessageLiteOrBuilder {
                public C6241a() {
                    super(HyperlinkFontOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                HyperlinkFontOverride hyperlinkFontOverride = new HyperlinkFontOverride();
                DEFAULT_INSTANCE = hyperlinkFontOverride;
                GeneratedMessageLite.registerDefaultInstance(HyperlinkFontOverride.class, hyperlinkFontOverride);
            }

            private HyperlinkFontOverride() {
            }

            private void clearFontColor() {
                this.fontColor_ = null;
                this.bitField0_ &= -3;
            }

            private void clearFontWeight() {
                this.fontWeight_ = null;
                this.bitField0_ &= -2;
            }

            private void clearTextDecoration() {
                this.textDecoration_ = null;
                this.bitField0_ &= -5;
            }

            public static HyperlinkFontOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeFontColor(StringValue stringValue) {
                stringValue.getClass();
                StringValue stringValue2 = this.fontColor_;
                if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                    this.fontColor_ = stringValue;
                } else {
                    this.fontColor_ = StringValue.newBuilder(this.fontColor_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeFontWeight(Int64Value int64Value) {
                int64Value.getClass();
                Int64Value int64Value2 = this.fontWeight_;
                if (int64Value2 == null || int64Value2 == Int64Value.getDefaultInstance()) {
                    this.fontWeight_ = int64Value;
                } else {
                    this.fontWeight_ = Int64Value.newBuilder(this.fontWeight_).mergeFrom((Int64Value.Builder) int64Value).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeTextDecoration(StringValue stringValue) {
                stringValue.getClass();
                StringValue stringValue2 = this.textDecoration_;
                if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                    this.textDecoration_ = stringValue;
                } else {
                    this.textDecoration_ = StringValue.newBuilder(this.textDecoration_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            public static C6241a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static HyperlinkFontOverride parseDelimitedFrom(InputStream inputStream) {
                return (HyperlinkFontOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static HyperlinkFontOverride parseFrom(ByteBuffer byteBuffer) {
                return (HyperlinkFontOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<HyperlinkFontOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setFontColor(StringValue stringValue) {
                stringValue.getClass();
                this.fontColor_ = stringValue;
                this.bitField0_ |= 2;
            }

            private void setFontWeight(Int64Value int64Value) {
                int64Value.getClass();
                this.fontWeight_ = int64Value;
                this.bitField0_ |= 1;
            }

            private void setTextDecoration(StringValue stringValue) {
                stringValue.getClass();
                this.textDecoration_ = stringValue;
                this.bitField0_ |= 4;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new HyperlinkFontOverride();
                    case 2:
                        return new C6241a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "fontWeight_", "fontColor_", "textDecoration_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<HyperlinkFontOverride> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (HyperlinkFontOverride.class) {
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

            public StringValue getFontColor() {
                StringValue stringValue = this.fontColor_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            public Int64Value getFontWeight() {
                Int64Value int64Value = this.fontWeight_;
                return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
            }

            public StringValue getTextDecoration() {
                StringValue stringValue = this.textDecoration_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            public boolean hasFontColor() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasFontWeight() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasTextDecoration() {
                return (this.bitField0_ & 4) != 0;
            }

            public static C6241a newBuilder(HyperlinkFontOverride hyperlinkFontOverride) {
                return DEFAULT_INSTANCE.createBuilder(hyperlinkFontOverride);
            }

            public static HyperlinkFontOverride parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (HyperlinkFontOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static HyperlinkFontOverride parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (HyperlinkFontOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static HyperlinkFontOverride parseFrom(ByteString byteString) {
                return (HyperlinkFontOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static HyperlinkFontOverride parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (HyperlinkFontOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static HyperlinkFontOverride parseFrom(byte[] bArr) {
                return (HyperlinkFontOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static HyperlinkFontOverride parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (HyperlinkFontOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static HyperlinkFontOverride parseFrom(InputStream inputStream) {
                return (HyperlinkFontOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static HyperlinkFontOverride parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (HyperlinkFontOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static HyperlinkFontOverride parseFrom(CodedInputStream codedInputStream) {
                return (HyperlinkFontOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static HyperlinkFontOverride parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (HyperlinkFontOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class IllustrationOverride extends GeneratedMessageLite<IllustrationOverride, C6242a> implements MessageLiteOrBuilder {
            private static final IllustrationOverride DEFAULT_INSTANCE;
            public static final int HIDE_ILLUSTRATIONS_FIELD_NUMBER = 1;
            private static volatile Parser<IllustrationOverride> PARSER;
            private int bitField0_;
            private BoolValue hideIllustrations_;

            /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$SessionRenderingData$IllustrationOverride$a */
            public static final class C6242a extends GeneratedMessageLite.Builder<IllustrationOverride, C6242a> implements MessageLiteOrBuilder {
                public C6242a() {
                    super(IllustrationOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                IllustrationOverride illustrationOverride = new IllustrationOverride();
                DEFAULT_INSTANCE = illustrationOverride;
                GeneratedMessageLite.registerDefaultInstance(IllustrationOverride.class, illustrationOverride);
            }

            private IllustrationOverride() {
            }

            private void clearHideIllustrations() {
                this.hideIllustrations_ = null;
                this.bitField0_ &= -2;
            }

            public static IllustrationOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeHideIllustrations(BoolValue boolValue) {
                boolValue.getClass();
                BoolValue boolValue2 = this.hideIllustrations_;
                if (boolValue2 == null || boolValue2 == BoolValue.getDefaultInstance()) {
                    this.hideIllustrations_ = boolValue;
                } else {
                    this.hideIllustrations_ = BoolValue.newBuilder(this.hideIllustrations_).mergeFrom((BoolValue.Builder) boolValue).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6242a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static IllustrationOverride parseDelimitedFrom(InputStream inputStream) {
                return (IllustrationOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static IllustrationOverride parseFrom(ByteBuffer byteBuffer) {
                return (IllustrationOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<IllustrationOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setHideIllustrations(BoolValue boolValue) {
                boolValue.getClass();
                this.hideIllustrations_ = boolValue;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new IllustrationOverride();
                    case 2:
                        return new C6242a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "hideIllustrations_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<IllustrationOverride> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (IllustrationOverride.class) {
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

            public BoolValue getHideIllustrations() {
                BoolValue boolValue = this.hideIllustrations_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            public boolean hasHideIllustrations() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6242a newBuilder(IllustrationOverride illustrationOverride) {
                return DEFAULT_INSTANCE.createBuilder(illustrationOverride);
            }

            public static IllustrationOverride parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (IllustrationOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static IllustrationOverride parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (IllustrationOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static IllustrationOverride parseFrom(ByteString byteString) {
                return (IllustrationOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static IllustrationOverride parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (IllustrationOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static IllustrationOverride parseFrom(byte[] bArr) {
                return (IllustrationOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static IllustrationOverride parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (IllustrationOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static IllustrationOverride parseFrom(InputStream inputStream) {
                return (IllustrationOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static IllustrationOverride parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (IllustrationOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static IllustrationOverride parseFrom(CodedInputStream codedInputStream) {
                return (IllustrationOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static IllustrationOverride parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (IllustrationOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class NavigationOverride extends GeneratedMessageLite<NavigationOverride, C6243a> implements MessageLiteOrBuilder {
            public static final int BACK_ICON_OVERRIDE_FIELD_NUMBER = 1;
            public static final int CLOSE_ICON_OVERRIDE_FIELD_NUMBER = 2;
            private static final NavigationOverride DEFAULT_INSTANCE;
            private static volatile Parser<NavigationOverride> PARSER;
            private int backIconOverride_;
            private int closeIconOverride_;

            /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$SessionRenderingData$NavigationOverride$a */
            public static final class C6243a extends GeneratedMessageLite.Builder<NavigationOverride, C6243a> implements MessageLiteOrBuilder {
                public C6243a() {
                    super(NavigationOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                NavigationOverride navigationOverride = new NavigationOverride();
                DEFAULT_INSTANCE = navigationOverride;
                GeneratedMessageLite.registerDefaultInstance(NavigationOverride.class, navigationOverride);
            }

            private NavigationOverride() {
            }

            private void clearBackIconOverride() {
                this.backIconOverride_ = 0;
            }

            private void clearCloseIconOverride() {
                this.closeIconOverride_ = 0;
            }

            public static NavigationOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6243a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static NavigationOverride parseDelimitedFrom(InputStream inputStream) {
                return (NavigationOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static NavigationOverride parseFrom(ByteBuffer byteBuffer) {
                return (NavigationOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<NavigationOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setBackIconOverride(EnumC6247a enumC6247a) {
                this.backIconOverride_ = enumC6247a.getNumber();
            }

            private void setBackIconOverrideValue(int i) {
                this.backIconOverride_ = i;
            }

            private void setCloseIconOverride(EnumC6249c enumC6249c) {
                this.closeIconOverride_ = enumC6249c.getNumber();
            }

            private void setCloseIconOverrideValue(int i) {
                this.closeIconOverride_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new NavigationOverride();
                    case 2:
                        return new C6243a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"backIconOverride_", "closeIconOverride_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<NavigationOverride> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (NavigationOverride.class) {
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

            public EnumC6247a getBackIconOverride() {
                EnumC6247a enumC6247aForNumber = EnumC6247a.forNumber(this.backIconOverride_);
                return enumC6247aForNumber == null ? EnumC6247a.UNRECOGNIZED : enumC6247aForNumber;
            }

            public int getBackIconOverrideValue() {
                return this.backIconOverride_;
            }

            public EnumC6249c getCloseIconOverride() {
                EnumC6249c enumC6249cForNumber = EnumC6249c.forNumber(this.closeIconOverride_);
                return enumC6249cForNumber == null ? EnumC6249c.UNRECOGNIZED : enumC6249cForNumber;
            }

            public int getCloseIconOverrideValue() {
                return this.closeIconOverride_;
            }

            public static C6243a newBuilder(NavigationOverride navigationOverride) {
                return DEFAULT_INSTANCE.createBuilder(navigationOverride);
            }

            public static NavigationOverride parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (NavigationOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static NavigationOverride parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (NavigationOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static NavigationOverride parseFrom(ByteString byteString) {
                return (NavigationOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static NavigationOverride parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (NavigationOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static NavigationOverride parseFrom(byte[] bArr) {
                return (NavigationOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static NavigationOverride parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (NavigationOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static NavigationOverride parseFrom(InputStream inputStream) {
                return (NavigationOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static NavigationOverride parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (NavigationOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static NavigationOverride parseFrom(CodedInputStream codedInputStream) {
                return (NavigationOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static NavigationOverride parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (NavigationOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class PrimaryButtonOverride extends GeneratedMessageLite<PrimaryButtonOverride, C6244a> implements MessageLiteOrBuilder {
            public static final int DEFAULT_BUTTON_OVERRIDE_FIELD_NUMBER = 1;
            private static final PrimaryButtonOverride DEFAULT_INSTANCE;
            private static volatile Parser<PrimaryButtonOverride> PARSER;
            private int bitField0_;
            private ButtonOverride defaultButtonOverride_;

            /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$SessionRenderingData$PrimaryButtonOverride$a */
            public static final class C6244a extends GeneratedMessageLite.Builder<PrimaryButtonOverride, C6244a> implements MessageLiteOrBuilder {
                public C6244a() {
                    super(PrimaryButtonOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                PrimaryButtonOverride primaryButtonOverride = new PrimaryButtonOverride();
                DEFAULT_INSTANCE = primaryButtonOverride;
                GeneratedMessageLite.registerDefaultInstance(PrimaryButtonOverride.class, primaryButtonOverride);
            }

            private PrimaryButtonOverride() {
            }

            private void clearDefaultButtonOverride() {
                this.defaultButtonOverride_ = null;
                this.bitField0_ &= -2;
            }

            public static PrimaryButtonOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeDefaultButtonOverride(ButtonOverride buttonOverride) {
                buttonOverride.getClass();
                ButtonOverride buttonOverride2 = this.defaultButtonOverride_;
                if (buttonOverride2 == null || buttonOverride2 == ButtonOverride.getDefaultInstance()) {
                    this.defaultButtonOverride_ = buttonOverride;
                } else {
                    this.defaultButtonOverride_ = ButtonOverride.newBuilder(this.defaultButtonOverride_).mergeFrom((ButtonOverride.C6236a) buttonOverride).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6244a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static PrimaryButtonOverride parseDelimitedFrom(InputStream inputStream) {
                return (PrimaryButtonOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PrimaryButtonOverride parseFrom(ByteBuffer byteBuffer) {
                return (PrimaryButtonOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<PrimaryButtonOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setDefaultButtonOverride(ButtonOverride buttonOverride) {
                buttonOverride.getClass();
                this.defaultButtonOverride_ = buttonOverride;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new PrimaryButtonOverride();
                    case 2:
                        return new C6244a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "defaultButtonOverride_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<PrimaryButtonOverride> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (PrimaryButtonOverride.class) {
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

            public ButtonOverride getDefaultButtonOverride() {
                ButtonOverride buttonOverride = this.defaultButtonOverride_;
                return buttonOverride == null ? ButtonOverride.getDefaultInstance() : buttonOverride;
            }

            public boolean hasDefaultButtonOverride() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6244a newBuilder(PrimaryButtonOverride primaryButtonOverride) {
                return DEFAULT_INSTANCE.createBuilder(primaryButtonOverride);
            }

            public static PrimaryButtonOverride parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PrimaryButtonOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PrimaryButtonOverride parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (PrimaryButtonOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static PrimaryButtonOverride parseFrom(ByteString byteString) {
                return (PrimaryButtonOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static PrimaryButtonOverride parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (PrimaryButtonOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static PrimaryButtonOverride parseFrom(byte[] bArr) {
                return (PrimaryButtonOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static PrimaryButtonOverride parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (PrimaryButtonOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static PrimaryButtonOverride parseFrom(InputStream inputStream) {
                return (PrimaryButtonOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PrimaryButtonOverride parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PrimaryButtonOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PrimaryButtonOverride parseFrom(CodedInputStream codedInputStream) {
                return (PrimaryButtonOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static PrimaryButtonOverride parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PrimaryButtonOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SpacingOverride extends GeneratedMessageLite<SpacingOverride, C6245a> implements MessageLiteOrBuilder {
            private static final SpacingOverride DEFAULT_INSTANCE;
            public static final int HEADER_TEXT_SPACING_OVERRIDE_FIELD_NUMBER = 1;
            private static volatile Parser<SpacingOverride> PARSER;
            private int bitField0_;
            private HeaderTextSpacingOverride headerTextSpacingOverride_;

            /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$SessionRenderingData$SpacingOverride$a */
            public static final class C6245a extends GeneratedMessageLite.Builder<SpacingOverride, C6245a> implements MessageLiteOrBuilder {
                public C6245a() {
                    super(SpacingOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                SpacingOverride spacingOverride = new SpacingOverride();
                DEFAULT_INSTANCE = spacingOverride;
                GeneratedMessageLite.registerDefaultInstance(SpacingOverride.class, spacingOverride);
            }

            private SpacingOverride() {
            }

            private void clearHeaderTextSpacingOverride() {
                this.headerTextSpacingOverride_ = null;
                this.bitField0_ &= -2;
            }

            public static SpacingOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeHeaderTextSpacingOverride(HeaderTextSpacingOverride headerTextSpacingOverride) {
                headerTextSpacingOverride.getClass();
                HeaderTextSpacingOverride headerTextSpacingOverride2 = this.headerTextSpacingOverride_;
                if (headerTextSpacingOverride2 == null || headerTextSpacingOverride2 == HeaderTextSpacingOverride.getDefaultInstance()) {
                    this.headerTextSpacingOverride_ = headerTextSpacingOverride;
                } else {
                    this.headerTextSpacingOverride_ = HeaderTextSpacingOverride.newBuilder(this.headerTextSpacingOverride_).mergeFrom((HeaderTextSpacingOverride.C6240a) headerTextSpacingOverride).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6245a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static SpacingOverride parseDelimitedFrom(InputStream inputStream) {
                return (SpacingOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SpacingOverride parseFrom(ByteBuffer byteBuffer) {
                return (SpacingOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<SpacingOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setHeaderTextSpacingOverride(HeaderTextSpacingOverride headerTextSpacingOverride) {
                headerTextSpacingOverride.getClass();
                this.headerTextSpacingOverride_ = headerTextSpacingOverride;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SpacingOverride();
                    case 2:
                        return new C6245a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "headerTextSpacingOverride_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<SpacingOverride> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (SpacingOverride.class) {
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

            public HeaderTextSpacingOverride getHeaderTextSpacingOverride() {
                HeaderTextSpacingOverride headerTextSpacingOverride = this.headerTextSpacingOverride_;
                return headerTextSpacingOverride == null ? HeaderTextSpacingOverride.getDefaultInstance() : headerTextSpacingOverride;
            }

            public boolean hasHeaderTextSpacingOverride() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6245a newBuilder(SpacingOverride spacingOverride) {
                return DEFAULT_INSTANCE.createBuilder(spacingOverride);
            }

            public static SpacingOverride parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SpacingOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SpacingOverride parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (SpacingOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static SpacingOverride parseFrom(ByteString byteString) {
                return (SpacingOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static SpacingOverride parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (SpacingOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static SpacingOverride parseFrom(byte[] bArr) {
                return (SpacingOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static SpacingOverride parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (SpacingOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static SpacingOverride parseFrom(InputStream inputStream) {
                return (SpacingOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SpacingOverride parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SpacingOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SpacingOverride parseFrom(CodedInputStream codedInputStream) {
                return (SpacingOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static SpacingOverride parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SpacingOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class TextInputOverride extends GeneratedMessageLite<TextInputOverride, C6246a> implements MessageLiteOrBuilder {
            private static final TextInputOverride DEFAULT_INSTANCE;
            public static final int DEFAULT_TEXT_INPUT_OVERRIDE_FIELD_NUMBER = 1;
            private static volatile Parser<TextInputOverride> PARSER;
            private int bitField0_;
            private BaseTextInputOverride defaultTextInputOverride_;

            /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$SessionRenderingData$TextInputOverride$a */
            public static final class C6246a extends GeneratedMessageLite.Builder<TextInputOverride, C6246a> implements MessageLiteOrBuilder {
                public C6246a() {
                    super(TextInputOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                TextInputOverride textInputOverride = new TextInputOverride();
                DEFAULT_INSTANCE = textInputOverride;
                GeneratedMessageLite.registerDefaultInstance(TextInputOverride.class, textInputOverride);
            }

            private TextInputOverride() {
            }

            private void clearDefaultTextInputOverride() {
                this.defaultTextInputOverride_ = null;
                this.bitField0_ &= -2;
            }

            public static TextInputOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeDefaultTextInputOverride(BaseTextInputOverride baseTextInputOverride) {
                baseTextInputOverride.getClass();
                BaseTextInputOverride baseTextInputOverride2 = this.defaultTextInputOverride_;
                if (baseTextInputOverride2 == null || baseTextInputOverride2 == BaseTextInputOverride.getDefaultInstance()) {
                    this.defaultTextInputOverride_ = baseTextInputOverride;
                } else {
                    this.defaultTextInputOverride_ = BaseTextInputOverride.newBuilder(this.defaultTextInputOverride_).mergeFrom((BaseTextInputOverride.C6234a) baseTextInputOverride).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6246a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static TextInputOverride parseDelimitedFrom(InputStream inputStream) {
                return (TextInputOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TextInputOverride parseFrom(ByteBuffer byteBuffer) {
                return (TextInputOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<TextInputOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setDefaultTextInputOverride(BaseTextInputOverride baseTextInputOverride) {
                baseTextInputOverride.getClass();
                this.defaultTextInputOverride_ = baseTextInputOverride;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new TextInputOverride();
                    case 2:
                        return new C6246a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "defaultTextInputOverride_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<TextInputOverride> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (TextInputOverride.class) {
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

            public BaseTextInputOverride getDefaultTextInputOverride() {
                BaseTextInputOverride baseTextInputOverride = this.defaultTextInputOverride_;
                return baseTextInputOverride == null ? BaseTextInputOverride.getDefaultInstance() : baseTextInputOverride;
            }

            public boolean hasDefaultTextInputOverride() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6246a newBuilder(TextInputOverride textInputOverride) {
                return DEFAULT_INSTANCE.createBuilder(textInputOverride);
            }

            public static TextInputOverride parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TextInputOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TextInputOverride parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (TextInputOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static TextInputOverride parseFrom(ByteString byteString) {
                return (TextInputOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static TextInputOverride parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (TextInputOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static TextInputOverride parseFrom(byte[] bArr) {
                return (TextInputOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static TextInputOverride parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (TextInputOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static TextInputOverride parseFrom(InputStream inputStream) {
                return (TextInputOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TextInputOverride parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TextInputOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TextInputOverride parseFrom(CodedInputStream codedInputStream) {
                return (TextInputOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static TextInputOverride parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TextInputOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$SessionRenderingData$a */
        public enum EnumC6247a implements Internal.EnumLite {
            BACK_ICON_NO_OVERRIDE(0),
            BACK_ICON_CHEVRON_1(1),
            UNRECOGNIZED(-1);

            public static final int BACK_ICON_CHEVRON_1_VALUE = 1;
            public static final int BACK_ICON_NO_OVERRIDE_VALUE = 0;

            /* renamed from: b */
            public static final a f2119b = new a();

            /* renamed from: a */
            public final int f2121a;

            /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$SessionRenderingData$a$a */
            public class a implements Internal.EnumLiteMap<EnumC6247a> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final Internal.EnumLite findValueByNumber(int i) {
                    return EnumC6247a.forNumber(i);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$SessionRenderingData$a$b */
            public static final class b implements Internal.EnumVerifier {

                /* renamed from: a */
                public static final b f2122a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return EnumC6247a.forNumber(i) != null;
                }
            }

            EnumC6247a(int i) {
                this.f2121a = i;
            }

            public static EnumC6247a forNumber(int i) {
                if (i == 0) {
                    return BACK_ICON_NO_OVERRIDE;
                }
                if (i != 1) {
                    return null;
                }
                return BACK_ICON_CHEVRON_1;
            }

            public static Internal.EnumLiteMap<EnumC6247a> internalGetValueMap() {
                return f2119b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f2122a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f2121a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static EnumC6247a valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$SessionRenderingData$b */
        public static final class C6248b extends GeneratedMessageLite.Builder<SessionRenderingData, C6248b> implements MessageLiteOrBuilder {
            public C6248b() {
                super(SessionRenderingData.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$SessionRenderingData$c */
        public enum EnumC6249c implements Internal.EnumLite {
            CLOSE_ICON_NO_OVERRIDE(0),
            CLOSE_ICON_X_1(1),
            UNRECOGNIZED(-1);

            public static final int CLOSE_ICON_NO_OVERRIDE_VALUE = 0;
            public static final int CLOSE_ICON_X_1_VALUE = 1;

            /* renamed from: b */
            public static final a f2123b = new a();

            /* renamed from: a */
            public final int f2125a;

            /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$SessionRenderingData$c$a */
            public class a implements Internal.EnumLiteMap<EnumC6249c> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final Internal.EnumLite findValueByNumber(int i) {
                    return EnumC6249c.forNumber(i);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$SessionRenderingData$c$b */
            public static final class b implements Internal.EnumVerifier {

                /* renamed from: a */
                public static final b f2126a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return EnumC6249c.forNumber(i) != null;
                }
            }

            EnumC6249c(int i) {
                this.f2125a = i;
            }

            public static EnumC6249c forNumber(int i) {
                if (i == 0) {
                    return CLOSE_ICON_NO_OVERRIDE;
                }
                if (i != 1) {
                    return null;
                }
                return CLOSE_ICON_X_1;
            }

            public static Internal.EnumLiteMap<EnumC6249c> internalGetValueMap() {
                return f2123b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f2126a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f2125a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static EnumC6249c valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$SessionRenderingData$d */
        public enum EnumC6250d implements Internal.EnumLite {
            FONT_FAMILY_NO_OVERRIDE(0),
            FONT_FAMILY_ATHLETICS(1),
            FONT_FAMILY_SCTO_GROTESK_A(2),
            UNRECOGNIZED(-1);

            public static final int FONT_FAMILY_ATHLETICS_VALUE = 1;
            public static final int FONT_FAMILY_NO_OVERRIDE_VALUE = 0;
            public static final int FONT_FAMILY_SCTO_GROTESK_A_VALUE = 2;

            /* renamed from: b */
            public static final a f2127b = new a();

            /* renamed from: a */
            public final int f2129a;

            /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$SessionRenderingData$d$a */
            public class a implements Internal.EnumLiteMap<EnumC6250d> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final Internal.EnumLite findValueByNumber(int i) {
                    return EnumC6250d.forNumber(i);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$SessionRenderingData$d$b */
            public static final class b implements Internal.EnumVerifier {

                /* renamed from: a */
                public static final b f2130a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return EnumC6250d.forNumber(i) != null;
                }
            }

            EnumC6250d(int i) {
                this.f2129a = i;
            }

            public static EnumC6250d forNumber(int i) {
                if (i == 0) {
                    return FONT_FAMILY_NO_OVERRIDE;
                }
                if (i == 1) {
                    return FONT_FAMILY_ATHLETICS;
                }
                if (i != 2) {
                    return null;
                }
                return FONT_FAMILY_SCTO_GROTESK_A;
            }

            public static Internal.EnumLiteMap<EnumC6250d> internalGetValueMap() {
                return f2127b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f2130a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f2129a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static EnumC6250d valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$SessionRenderingData$e */
        public enum EnumC6251e implements Internal.EnumLite {
            NO_OVERRIDE(0),
            LEFT(1),
            UNRECOGNIZED(-1);

            public static final int LEFT_VALUE = 1;
            public static final int NO_OVERRIDE_VALUE = 0;

            /* renamed from: b */
            public static final a f2131b = new a();

            /* renamed from: a */
            public final int f2133a;

            /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$SessionRenderingData$e$a */
            public class a implements Internal.EnumLiteMap<EnumC6251e> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final Internal.EnumLite findValueByNumber(int i) {
                    return EnumC6251e.forNumber(i);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$SessionRenderingData$e$b */
            public static final class b implements Internal.EnumVerifier {

                /* renamed from: a */
                public static final b f2134a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return EnumC6251e.forNumber(i) != null;
                }
            }

            EnumC6251e(int i) {
                this.f2133a = i;
            }

            public static EnumC6251e forNumber(int i) {
                if (i == 0) {
                    return NO_OVERRIDE;
                }
                if (i != 1) {
                    return null;
                }
                return LEFT;
            }

            public static Internal.EnumLiteMap<EnumC6251e> internalGetValueMap() {
                return f2131b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f2134a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f2133a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static EnumC6251e valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            SessionRenderingData sessionRenderingData = new SessionRenderingData();
            DEFAULT_INSTANCE = sessionRenderingData;
            GeneratedMessageLite.registerDefaultInstance(SessionRenderingData.class, sessionRenderingData);
        }

        private SessionRenderingData() {
        }

        private void clearAppearance() {
            this.appearance_ = 0;
        }

        private void clearBodyTextOverride() {
            this.bodyTextOverride_ = null;
            this.bitField0_ &= -5;
        }

        private void clearDisclaimerTextOverride() {
            this.disclaimerTextOverride_ = null;
            this.bitField0_ &= -9;
        }

        private void clearHeaderTextOverride() {
            this.headerTextOverride_ = null;
            this.bitField0_ &= -3;
        }

        private void clearIllustrationOverride() {
            this.illustrationOverride_ = null;
            this.bitField0_ &= -17;
        }

        private void clearInstantiateWeb3Bridge() {
            this.instantiateWeb3Bridge_ = false;
        }

        private void clearNavigationOverride() {
            this.navigationOverride_ = null;
            this.bitField0_ &= -129;
        }

        private void clearOverlayBackgroundColor() {
            this.overlayBackgroundColor_ = getDefaultInstance().getOverlayBackgroundColor();
        }

        private void clearOverlayBackgroundFooter() {
            this.overlayBackgroundFooter_ = null;
            this.bitField0_ &= -2;
        }

        private void clearPrimaryButtonOverride() {
            this.primaryButtonOverride_ = null;
            this.bitField0_ &= -33;
        }

        private void clearRecaptchaEnterpriseEnabled() {
            this.recaptchaEnterpriseEnabled_ = false;
        }

        private void clearSpacingOverride() {
            this.spacingOverride_ = null;
            this.bitField0_ &= -257;
        }

        private void clearTextAlignmentOverride() {
            this.textAlignmentOverride_ = 0;
        }

        private void clearTextInputOverride() {
            this.textInputOverride_ = null;
            this.bitField0_ &= -65;
        }

        private void clearThreadsInputVariation() {
            this.threadsInputVariation_ = getDefaultInstance().getThreadsInputVariation();
        }

        private void clearUseHaptics() {
            this.useHaptics_ = false;
        }

        private void clearUseHostedLinkUiCustomizations() {
            this.useHostedLinkUiCustomizations_ = false;
        }

        private void clearUseLinkRefresh() {
            this.useLinkRefresh_ = false;
        }

        public static SessionRenderingData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeBodyTextOverride(BodyTextOverride bodyTextOverride) {
            bodyTextOverride.getClass();
            BodyTextOverride bodyTextOverride2 = this.bodyTextOverride_;
            if (bodyTextOverride2 == null || bodyTextOverride2 == BodyTextOverride.getDefaultInstance()) {
                this.bodyTextOverride_ = bodyTextOverride;
            } else {
                this.bodyTextOverride_ = BodyTextOverride.newBuilder(this.bodyTextOverride_).mergeFrom((BodyTextOverride.C6235a) bodyTextOverride).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        private void mergeDisclaimerTextOverride(DisclaimerTextOverride disclaimerTextOverride) {
            disclaimerTextOverride.getClass();
            DisclaimerTextOverride disclaimerTextOverride2 = this.disclaimerTextOverride_;
            if (disclaimerTextOverride2 == null || disclaimerTextOverride2 == DisclaimerTextOverride.getDefaultInstance()) {
                this.disclaimerTextOverride_ = disclaimerTextOverride;
            } else {
                this.disclaimerTextOverride_ = DisclaimerTextOverride.newBuilder(this.disclaimerTextOverride_).mergeFrom((DisclaimerTextOverride.C6237a) disclaimerTextOverride).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        private void mergeHeaderTextOverride(HeaderTextOverride headerTextOverride) {
            headerTextOverride.getClass();
            HeaderTextOverride headerTextOverride2 = this.headerTextOverride_;
            if (headerTextOverride2 == null || headerTextOverride2 == HeaderTextOverride.getDefaultInstance()) {
                this.headerTextOverride_ = headerTextOverride;
            } else {
                this.headerTextOverride_ = HeaderTextOverride.newBuilder(this.headerTextOverride_).mergeFrom((HeaderTextOverride.C6239a) headerTextOverride).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeIllustrationOverride(IllustrationOverride illustrationOverride) {
            illustrationOverride.getClass();
            IllustrationOverride illustrationOverride2 = this.illustrationOverride_;
            if (illustrationOverride2 == null || illustrationOverride2 == IllustrationOverride.getDefaultInstance()) {
                this.illustrationOverride_ = illustrationOverride;
            } else {
                this.illustrationOverride_ = IllustrationOverride.newBuilder(this.illustrationOverride_).mergeFrom((IllustrationOverride.C6242a) illustrationOverride).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        private void mergeNavigationOverride(NavigationOverride navigationOverride) {
            navigationOverride.getClass();
            NavigationOverride navigationOverride2 = this.navigationOverride_;
            if (navigationOverride2 == null || navigationOverride2 == NavigationOverride.getDefaultInstance()) {
                this.navigationOverride_ = navigationOverride;
            } else {
                this.navigationOverride_ = NavigationOverride.newBuilder(this.navigationOverride_).mergeFrom((NavigationOverride.C6243a) navigationOverride).buildPartial();
            }
            this.bitField0_ |= 128;
        }

        private void mergeOverlayBackgroundFooter(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.overlayBackgroundFooter_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                this.overlayBackgroundFooter_ = common$AttributedLocalizedString;
            } else {
                this.overlayBackgroundFooter_ = Common$AttributedLocalizedString.newBuilder(this.overlayBackgroundFooter_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergePrimaryButtonOverride(PrimaryButtonOverride primaryButtonOverride) {
            primaryButtonOverride.getClass();
            PrimaryButtonOverride primaryButtonOverride2 = this.primaryButtonOverride_;
            if (primaryButtonOverride2 == null || primaryButtonOverride2 == PrimaryButtonOverride.getDefaultInstance()) {
                this.primaryButtonOverride_ = primaryButtonOverride;
            } else {
                this.primaryButtonOverride_ = PrimaryButtonOverride.newBuilder(this.primaryButtonOverride_).mergeFrom((PrimaryButtonOverride.C6244a) primaryButtonOverride).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        private void mergeSpacingOverride(SpacingOverride spacingOverride) {
            spacingOverride.getClass();
            SpacingOverride spacingOverride2 = this.spacingOverride_;
            if (spacingOverride2 == null || spacingOverride2 == SpacingOverride.getDefaultInstance()) {
                this.spacingOverride_ = spacingOverride;
            } else {
                this.spacingOverride_ = SpacingOverride.newBuilder(this.spacingOverride_).mergeFrom((SpacingOverride.C6245a) spacingOverride).buildPartial();
            }
            this.bitField0_ |= 256;
        }

        private void mergeTextInputOverride(TextInputOverride textInputOverride) {
            textInputOverride.getClass();
            TextInputOverride textInputOverride2 = this.textInputOverride_;
            if (textInputOverride2 == null || textInputOverride2 == TextInputOverride.getDefaultInstance()) {
                this.textInputOverride_ = textInputOverride;
            } else {
                this.textInputOverride_ = TextInputOverride.newBuilder(this.textInputOverride_).mergeFrom((TextInputOverride.C6246a) textInputOverride).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        public static C6248b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SessionRenderingData parseDelimitedFrom(InputStream inputStream) {
            return (SessionRenderingData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionRenderingData parseFrom(ByteBuffer byteBuffer) {
            return (SessionRenderingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SessionRenderingData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAppearance(LinkCustomizations$LinkCustomization.EnumC6066c enumC6066c) {
            this.appearance_ = enumC6066c.getNumber();
        }

        private void setAppearanceValue(int i) {
            this.appearance_ = i;
        }

        private void setBodyTextOverride(BodyTextOverride bodyTextOverride) {
            bodyTextOverride.getClass();
            this.bodyTextOverride_ = bodyTextOverride;
            this.bitField0_ |= 4;
        }

        private void setDisclaimerTextOverride(DisclaimerTextOverride disclaimerTextOverride) {
            disclaimerTextOverride.getClass();
            this.disclaimerTextOverride_ = disclaimerTextOverride;
            this.bitField0_ |= 8;
        }

        private void setHeaderTextOverride(HeaderTextOverride headerTextOverride) {
            headerTextOverride.getClass();
            this.headerTextOverride_ = headerTextOverride;
            this.bitField0_ |= 2;
        }

        private void setIllustrationOverride(IllustrationOverride illustrationOverride) {
            illustrationOverride.getClass();
            this.illustrationOverride_ = illustrationOverride;
            this.bitField0_ |= 16;
        }

        private void setInstantiateWeb3Bridge(boolean z) {
            this.instantiateWeb3Bridge_ = z;
        }

        private void setNavigationOverride(NavigationOverride navigationOverride) {
            navigationOverride.getClass();
            this.navigationOverride_ = navigationOverride;
            this.bitField0_ |= 128;
        }

        private void setOverlayBackgroundColor(String str) {
            str.getClass();
            this.overlayBackgroundColor_ = str;
        }

        private void setOverlayBackgroundColorBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.overlayBackgroundColor_ = byteString.toStringUtf8();
        }

        private void setOverlayBackgroundFooter(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.overlayBackgroundFooter_ = common$AttributedLocalizedString;
            this.bitField0_ |= 1;
        }

        private void setPrimaryButtonOverride(PrimaryButtonOverride primaryButtonOverride) {
            primaryButtonOverride.getClass();
            this.primaryButtonOverride_ = primaryButtonOverride;
            this.bitField0_ |= 32;
        }

        private void setRecaptchaEnterpriseEnabled(boolean z) {
            this.recaptchaEnterpriseEnabled_ = z;
        }

        private void setSpacingOverride(SpacingOverride spacingOverride) {
            spacingOverride.getClass();
            this.spacingOverride_ = spacingOverride;
            this.bitField0_ |= 256;
        }

        private void setTextAlignmentOverride(EnumC6251e enumC6251e) {
            this.textAlignmentOverride_ = enumC6251e.getNumber();
        }

        private void setTextAlignmentOverrideValue(int i) {
            this.textAlignmentOverride_ = i;
        }

        private void setTextInputOverride(TextInputOverride textInputOverride) {
            textInputOverride.getClass();
            this.textInputOverride_ = textInputOverride;
            this.bitField0_ |= 64;
        }

        private void setThreadsInputVariation(String str) {
            str.getClass();
            this.threadsInputVariation_ = str;
        }

        private void setThreadsInputVariationBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.threadsInputVariation_ = byteString.toStringUtf8();
        }

        private void setUseHaptics(boolean z) {
            this.useHaptics_ = z;
        }

        private void setUseHostedLinkUiCustomizations(boolean z) {
            this.useHostedLinkUiCustomizations_ = z;
        }

        private void setUseLinkRefresh(boolean z) {
            this.useLinkRefresh_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                case 1:
                    return new SessionRenderingData();
                case 2:
                    return new C6248b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0012\u0000\u0001\u0001\u0013\u0012\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\u0007\u0005\u0007\u0006\f\u0007\u0007\b\u0007\t\f\nဉ\u0001\u000bဉ\u0004\fဉ\u0005\rȈ\u000eဉ\u0006\u000fဉ\u0002\u0010ဉ\u0003\u0011\u0007\u0012ဉ\u0007\u0013ဉ\b", new Object[]{"bitField0_", "overlayBackgroundFooter_", "overlayBackgroundColor_", "recaptchaEnterpriseEnabled_", "instantiateWeb3Bridge_", "appearance_", "useLinkRefresh_", "useHostedLinkUiCustomizations_", "textAlignmentOverride_", "headerTextOverride_", "illustrationOverride_", "primaryButtonOverride_", "threadsInputVariation_", "textInputOverride_", "bodyTextOverride_", "disclaimerTextOverride_", "useHaptics_", "navigationOverride_", "spacingOverride_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SessionRenderingData> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SessionRenderingData.class) {
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

        public LinkCustomizations$LinkCustomization.EnumC6066c getAppearance() {
            LinkCustomizations$LinkCustomization.EnumC6066c enumC6066cForNumber = LinkCustomizations$LinkCustomization.EnumC6066c.forNumber(this.appearance_);
            return enumC6066cForNumber == null ? LinkCustomizations$LinkCustomization.EnumC6066c.UNRECOGNIZED : enumC6066cForNumber;
        }

        public int getAppearanceValue() {
            return this.appearance_;
        }

        public BodyTextOverride getBodyTextOverride() {
            BodyTextOverride bodyTextOverride = this.bodyTextOverride_;
            return bodyTextOverride == null ? BodyTextOverride.getDefaultInstance() : bodyTextOverride;
        }

        public DisclaimerTextOverride getDisclaimerTextOverride() {
            DisclaimerTextOverride disclaimerTextOverride = this.disclaimerTextOverride_;
            return disclaimerTextOverride == null ? DisclaimerTextOverride.getDefaultInstance() : disclaimerTextOverride;
        }

        public HeaderTextOverride getHeaderTextOverride() {
            HeaderTextOverride headerTextOverride = this.headerTextOverride_;
            return headerTextOverride == null ? HeaderTextOverride.getDefaultInstance() : headerTextOverride;
        }

        public IllustrationOverride getIllustrationOverride() {
            IllustrationOverride illustrationOverride = this.illustrationOverride_;
            return illustrationOverride == null ? IllustrationOverride.getDefaultInstance() : illustrationOverride;
        }

        public boolean getInstantiateWeb3Bridge() {
            return this.instantiateWeb3Bridge_;
        }

        public NavigationOverride getNavigationOverride() {
            NavigationOverride navigationOverride = this.navigationOverride_;
            return navigationOverride == null ? NavigationOverride.getDefaultInstance() : navigationOverride;
        }

        public String getOverlayBackgroundColor() {
            return this.overlayBackgroundColor_;
        }

        public ByteString getOverlayBackgroundColorBytes() {
            return ByteString.copyFromUtf8(this.overlayBackgroundColor_);
        }

        public Common$AttributedLocalizedString getOverlayBackgroundFooter() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.overlayBackgroundFooter_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public PrimaryButtonOverride getPrimaryButtonOverride() {
            PrimaryButtonOverride primaryButtonOverride = this.primaryButtonOverride_;
            return primaryButtonOverride == null ? PrimaryButtonOverride.getDefaultInstance() : primaryButtonOverride;
        }

        public boolean getRecaptchaEnterpriseEnabled() {
            return this.recaptchaEnterpriseEnabled_;
        }

        public SpacingOverride getSpacingOverride() {
            SpacingOverride spacingOverride = this.spacingOverride_;
            return spacingOverride == null ? SpacingOverride.getDefaultInstance() : spacingOverride;
        }

        public EnumC6251e getTextAlignmentOverride() {
            EnumC6251e enumC6251eForNumber = EnumC6251e.forNumber(this.textAlignmentOverride_);
            return enumC6251eForNumber == null ? EnumC6251e.UNRECOGNIZED : enumC6251eForNumber;
        }

        public int getTextAlignmentOverrideValue() {
            return this.textAlignmentOverride_;
        }

        public TextInputOverride getTextInputOverride() {
            TextInputOverride textInputOverride = this.textInputOverride_;
            return textInputOverride == null ? TextInputOverride.getDefaultInstance() : textInputOverride;
        }

        public String getThreadsInputVariation() {
            return this.threadsInputVariation_;
        }

        public ByteString getThreadsInputVariationBytes() {
            return ByteString.copyFromUtf8(this.threadsInputVariation_);
        }

        public boolean getUseHaptics() {
            return this.useHaptics_;
        }

        public boolean getUseHostedLinkUiCustomizations() {
            return this.useHostedLinkUiCustomizations_;
        }

        public boolean getUseLinkRefresh() {
            return this.useLinkRefresh_;
        }

        public boolean hasBodyTextOverride() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasDisclaimerTextOverride() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasHeaderTextOverride() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasIllustrationOverride() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasNavigationOverride() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasOverlayBackgroundFooter() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasPrimaryButtonOverride() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasSpacingOverride() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasTextInputOverride() {
            return (this.bitField0_ & 64) != 0;
        }

        public static C6248b newBuilder(SessionRenderingData sessionRenderingData) {
            return DEFAULT_INSTANCE.createBuilder(sessionRenderingData);
        }

        public static SessionRenderingData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionRenderingData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SessionRenderingData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionRenderingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SessionRenderingData parseFrom(ByteString byteString) {
            return (SessionRenderingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SessionRenderingData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionRenderingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SessionRenderingData parseFrom(byte[] bArr) {
            return (SessionRenderingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SessionRenderingData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionRenderingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SessionRenderingData parseFrom(InputStream inputStream) {
            return (SessionRenderingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionRenderingData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionRenderingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SessionRenderingData parseFrom(CodedInputStream codedInputStream) {
            return (SessionRenderingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SessionRenderingData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionRenderingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$a */
    public enum EnumC6252a implements Internal.EnumLite {
        NO_BACKEND_EVENTS(0),
        BACKEND_AND_FRONTEND_EVENTS(1),
        ONLY_BACKEND_EVENTS(2),
        UNRECOGNIZED(-1);

        public static final int BACKEND_AND_FRONTEND_EVENTS_VALUE = 1;
        public static final int NO_BACKEND_EVENTS_VALUE = 0;
        public static final int ONLY_BACKEND_EVENTS_VALUE = 2;

        /* renamed from: b */
        public static final a f2135b = new a();

        /* renamed from: a */
        public final int f2137a;

        /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$a$a */
        public class a implements Internal.EnumLiteMap<EnumC6252a> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6252a.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$a$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2138a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6252a.forNumber(i) != null;
            }
        }

        EnumC6252a(int i) {
            this.f2137a = i;
        }

        public static EnumC6252a forNumber(int i) {
            if (i == 0) {
                return NO_BACKEND_EVENTS;
            }
            if (i == 1) {
                return BACKEND_AND_FRONTEND_EVENTS;
            }
            if (i != 2) {
                return null;
            }
            return ONLY_BACKEND_EVENTS;
        }

        public static Internal.EnumLiteMap<EnumC6252a> internalGetValueMap() {
            return f2135b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2138a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2137a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC6252a valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$b */
    public static final class C6253b extends GeneratedMessageLite.Builder<Workflow$LinkWorkflowStartResponse, C6253b> implements MessageLiteOrBuilder {
        public C6253b() {
            super(Workflow$LinkWorkflowStartResponse.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$c */
    public enum EnumC6254c implements Internal.EnumLite {
        TD_CONFIGURATION_UNKNOWN(0),
        TD_CONFIGURATION_RUN_ON_OPEN(1),
        TD_CONFIGURATION_RUN_IMMEDIATELY(2),
        UNRECOGNIZED(-1);

        public static final int TD_CONFIGURATION_RUN_IMMEDIATELY_VALUE = 2;
        public static final int TD_CONFIGURATION_RUN_ON_OPEN_VALUE = 1;
        public static final int TD_CONFIGURATION_UNKNOWN_VALUE = 0;

        /* renamed from: b */
        public static final a f2139b = new a();

        /* renamed from: a */
        public final int f2141a;

        /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$c$a */
        public class a implements Internal.EnumLiteMap<EnumC6254c> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6254c.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$c$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2142a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6254c.forNumber(i) != null;
            }
        }

        EnumC6254c(int i) {
            this.f2141a = i;
        }

        public static EnumC6254c forNumber(int i) {
            if (i == 0) {
                return TD_CONFIGURATION_UNKNOWN;
            }
            if (i == 1) {
                return TD_CONFIGURATION_RUN_ON_OPEN;
            }
            if (i != 2) {
                return null;
            }
            return TD_CONFIGURATION_RUN_IMMEDIATELY;
        }

        public static Internal.EnumLiteMap<EnumC6254c> internalGetValueMap() {
            return f2139b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2142a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2141a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC6254c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Workflow$LinkWorkflowStartResponse workflow$LinkWorkflowStartResponse = new Workflow$LinkWorkflowStartResponse();
        DEFAULT_INSTANCE = workflow$LinkWorkflowStartResponse;
        GeneratedMessageLite.registerDefaultInstance(Workflow$LinkWorkflowStartResponse.class, workflow$LinkWorkflowStartResponse);
    }

    private Workflow$LinkWorkflowStartResponse() {
    }

    private void addAdditionalPanes(Pane$PaneRendering pane$PaneRendering) {
        pane$PaneRendering.getClass();
        ensureAdditionalPanesIsMutable();
        this.additionalPanes_.add(pane$PaneRendering);
    }

    private void addAllAdditionalPanes(Iterable<? extends Pane$PaneRendering> iterable) {
        ensureAdditionalPanesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.additionalPanes_);
    }

    private void clearAdditionalPanes() {
        this.additionalPanes_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearAndroidSmsVerificationApiType() {
        this.androidSmsVerificationApiType_ = 0;
    }

    private void clearContinuationToken() {
        this.continuationToken_ = getDefaultInstance().getContinuationToken();
    }

    private void clearErrorTrackingMetadata() {
        this.errorTrackingMetadata_ = null;
        this.bitField0_ &= -33;
    }

    private void clearEvents() {
        this.events_ = null;
        this.bitField0_ &= -3;
    }

    private void clearHeartbeatConfiguration() {
        this.heartbeatConfiguration_ = null;
        this.bitField0_ &= -17;
    }

    private void clearNextPane() {
        this.nextPane_ = null;
        this.bitField0_ &= -2;
    }

    private void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    private void clearSendBackendEvents() {
        this.sendBackendEvents_ = 0;
    }

    private void clearSessionRenderingData() {
        this.sessionRenderingData_ = null;
        this.bitField0_ &= -9;
    }

    private void clearTdRunConfiguration() {
        this.tdRunConfiguration_ = 0;
    }

    private void clearWebviewFallback() {
        this.webviewFallback_ = null;
        this.bitField0_ &= -5;
    }

    private void clearWorkflowSessionId() {
        this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
    }

    private void ensureAdditionalPanesIsMutable() {
        Internal.ProtobufList<Pane$PaneRendering> protobufList = this.additionalPanes_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.additionalPanes_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Workflow$LinkWorkflowStartResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeErrorTrackingMetadata(ErrorTrackingMetadata errorTrackingMetadata) {
        errorTrackingMetadata.getClass();
        ErrorTrackingMetadata errorTrackingMetadata2 = this.errorTrackingMetadata_;
        if (errorTrackingMetadata2 == null || errorTrackingMetadata2 == ErrorTrackingMetadata.getDefaultInstance()) {
            this.errorTrackingMetadata_ = errorTrackingMetadata;
        } else {
            this.errorTrackingMetadata_ = ErrorTrackingMetadata.newBuilder(this.errorTrackingMetadata_).mergeFrom((ErrorTrackingMetadata.C6231a) errorTrackingMetadata).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    private void mergeEvents(Events events) {
        events.getClass();
        Events events2 = this.events_;
        if (events2 == null || events2 == Events.getDefaultInstance()) {
            this.events_ = events;
        } else {
            this.events_ = Events.newBuilder(this.events_).mergeFrom((Events.C6232a) events).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeHeartbeatConfiguration(HeartbeatConfiguration heartbeatConfiguration) {
        heartbeatConfiguration.getClass();
        HeartbeatConfiguration heartbeatConfiguration2 = this.heartbeatConfiguration_;
        if (heartbeatConfiguration2 == null || heartbeatConfiguration2 == HeartbeatConfiguration.getDefaultInstance()) {
            this.heartbeatConfiguration_ = heartbeatConfiguration;
        } else {
            this.heartbeatConfiguration_ = HeartbeatConfiguration.newBuilder(this.heartbeatConfiguration_).mergeFrom((HeartbeatConfiguration.C6233a) heartbeatConfiguration).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    private void mergeNextPane(Pane$PaneRendering pane$PaneRendering) {
        pane$PaneRendering.getClass();
        Pane$PaneRendering pane$PaneRendering2 = this.nextPane_;
        if (pane$PaneRendering2 == null || pane$PaneRendering2 == Pane$PaneRendering.getDefaultInstance()) {
            this.nextPane_ = pane$PaneRendering;
        } else {
            this.nextPane_ = Pane$PaneRendering.newBuilder(this.nextPane_).mergeFrom((Pane$PaneRendering.C6733a) pane$PaneRendering).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeSessionRenderingData(SessionRenderingData sessionRenderingData) {
        sessionRenderingData.getClass();
        SessionRenderingData sessionRenderingData2 = this.sessionRenderingData_;
        if (sessionRenderingData2 == null || sessionRenderingData2 == SessionRenderingData.getDefaultInstance()) {
            this.sessionRenderingData_ = sessionRenderingData;
        } else {
            this.sessionRenderingData_ = SessionRenderingData.newBuilder(this.sessionRenderingData_).mergeFrom((SessionRenderingData.C6248b) sessionRenderingData).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    private void mergeWebviewFallback(Common$WebviewFallback common$WebviewFallback) {
        common$WebviewFallback.getClass();
        Common$WebviewFallback common$WebviewFallback2 = this.webviewFallback_;
        if (common$WebviewFallback2 == null || common$WebviewFallback2 == Common$WebviewFallback.getDefaultInstance()) {
            this.webviewFallback_ = common$WebviewFallback;
        } else {
            this.webviewFallback_ = Common$WebviewFallback.newBuilder(this.webviewFallback_).mergeFrom((Common$WebviewFallback.C6552a) common$WebviewFallback).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    public static C6253b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Workflow$LinkWorkflowStartResponse parseDelimitedFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowStartResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowStartResponse parseFrom(ByteBuffer byteBuffer) {
        return (Workflow$LinkWorkflowStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Workflow$LinkWorkflowStartResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeAdditionalPanes(int i) {
        ensureAdditionalPanesIsMutable();
        this.additionalPanes_.remove(i);
    }

    private void setAdditionalPanes(int i, Pane$PaneRendering pane$PaneRendering) {
        pane$PaneRendering.getClass();
        ensureAdditionalPanesIsMutable();
        this.additionalPanes_.set(i, pane$PaneRendering);
    }

    private void setAndroidSmsVerificationApiType(EnumC7026f enumC7026f) {
        this.androidSmsVerificationApiType_ = enumC7026f.getNumber();
    }

    private void setAndroidSmsVerificationApiTypeValue(int i) {
        this.androidSmsVerificationApiType_ = i;
    }

    private void setContinuationToken(String str) {
        str.getClass();
        this.continuationToken_ = str;
    }

    private void setContinuationTokenBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.continuationToken_ = byteString.toStringUtf8();
    }

    private void setErrorTrackingMetadata(ErrorTrackingMetadata errorTrackingMetadata) {
        errorTrackingMetadata.getClass();
        this.errorTrackingMetadata_ = errorTrackingMetadata;
        this.bitField0_ |= 32;
    }

    private void setEvents(Events events) {
        events.getClass();
        this.events_ = events;
        this.bitField0_ |= 2;
    }

    private void setHeartbeatConfiguration(HeartbeatConfiguration heartbeatConfiguration) {
        heartbeatConfiguration.getClass();
        this.heartbeatConfiguration_ = heartbeatConfiguration;
        this.bitField0_ |= 16;
    }

    private void setNextPane(Pane$PaneRendering pane$PaneRendering) {
        pane$PaneRendering.getClass();
        this.nextPane_ = pane$PaneRendering;
        this.bitField0_ |= 1;
    }

    private void setRequestId(String str) {
        str.getClass();
        this.requestId_ = str;
    }

    private void setRequestIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.requestId_ = byteString.toStringUtf8();
    }

    private void setSendBackendEvents(EnumC6252a enumC6252a) {
        this.sendBackendEvents_ = enumC6252a.getNumber();
    }

    private void setSendBackendEventsValue(int i) {
        this.sendBackendEvents_ = i;
    }

    private void setSessionRenderingData(SessionRenderingData sessionRenderingData) {
        sessionRenderingData.getClass();
        this.sessionRenderingData_ = sessionRenderingData;
        this.bitField0_ |= 8;
    }

    private void setTdRunConfiguration(EnumC6254c enumC6254c) {
        this.tdRunConfiguration_ = enumC6254c.getNumber();
    }

    private void setTdRunConfigurationValue(int i) {
        this.tdRunConfiguration_ = i;
    }

    private void setWebviewFallback(Common$WebviewFallback common$WebviewFallback) {
        common$WebviewFallback.getClass();
        this.webviewFallback_ = common$WebviewFallback;
        this.bitField0_ |= 4;
    }

    private void setWorkflowSessionId(String str) {
        str.getClass();
        this.workflowSessionId_ = str;
    }

    private void setWorkflowSessionIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.workflowSessionId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
            case 1:
                return new Workflow$LinkWorkflowStartResponse();
            case 2:
                return new C6253b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\u000e\r\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b\u0004Ȉ\u0005ဉ\u0001\u0006Ȉ\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\f\f\r\f\u000e\f", new Object[]{"bitField0_", "workflowSessionId_", "nextPane_", "additionalPanes_", Pane$PaneRendering.class, "requestId_", "events_", "continuationToken_", "webviewFallback_", "sessionRenderingData_", "heartbeatConfiguration_", "errorTrackingMetadata_", "sendBackendEvents_", "androidSmsVerificationApiType_", "tdRunConfiguration_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Workflow$LinkWorkflowStartResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Workflow$LinkWorkflowStartResponse.class) {
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

    public Pane$PaneRendering getAdditionalPanes(int i) {
        return this.additionalPanes_.get(i);
    }

    public int getAdditionalPanesCount() {
        return this.additionalPanes_.size();
    }

    public List<Pane$PaneRendering> getAdditionalPanesList() {
        return this.additionalPanes_;
    }

    public InterfaceC6930p0 getAdditionalPanesOrBuilder(int i) {
        return this.additionalPanes_.get(i);
    }

    public List<? extends InterfaceC6930p0> getAdditionalPanesOrBuilderList() {
        return this.additionalPanes_;
    }

    public EnumC7026f getAndroidSmsVerificationApiType() {
        EnumC7026f enumC7026fForNumber = EnumC7026f.forNumber(this.androidSmsVerificationApiType_);
        return enumC7026fForNumber == null ? EnumC7026f.UNRECOGNIZED : enumC7026fForNumber;
    }

    public int getAndroidSmsVerificationApiTypeValue() {
        return this.androidSmsVerificationApiType_;
    }

    public String getContinuationToken() {
        return this.continuationToken_;
    }

    public ByteString getContinuationTokenBytes() {
        return ByteString.copyFromUtf8(this.continuationToken_);
    }

    public ErrorTrackingMetadata getErrorTrackingMetadata() {
        ErrorTrackingMetadata errorTrackingMetadata = this.errorTrackingMetadata_;
        return errorTrackingMetadata == null ? ErrorTrackingMetadata.getDefaultInstance() : errorTrackingMetadata;
    }

    public Events getEvents() {
        Events events = this.events_;
        return events == null ? Events.getDefaultInstance() : events;
    }

    public HeartbeatConfiguration getHeartbeatConfiguration() {
        HeartbeatConfiguration heartbeatConfiguration = this.heartbeatConfiguration_;
        return heartbeatConfiguration == null ? HeartbeatConfiguration.getDefaultInstance() : heartbeatConfiguration;
    }

    public Pane$PaneRendering getNextPane() {
        Pane$PaneRendering pane$PaneRendering = this.nextPane_;
        return pane$PaneRendering == null ? Pane$PaneRendering.getDefaultInstance() : pane$PaneRendering;
    }

    public String getRequestId() {
        return this.requestId_;
    }

    public ByteString getRequestIdBytes() {
        return ByteString.copyFromUtf8(this.requestId_);
    }

    public EnumC6252a getSendBackendEvents() {
        EnumC6252a enumC6252aForNumber = EnumC6252a.forNumber(this.sendBackendEvents_);
        return enumC6252aForNumber == null ? EnumC6252a.UNRECOGNIZED : enumC6252aForNumber;
    }

    public int getSendBackendEventsValue() {
        return this.sendBackendEvents_;
    }

    public SessionRenderingData getSessionRenderingData() {
        SessionRenderingData sessionRenderingData = this.sessionRenderingData_;
        return sessionRenderingData == null ? SessionRenderingData.getDefaultInstance() : sessionRenderingData;
    }

    public EnumC6254c getTdRunConfiguration() {
        EnumC6254c enumC6254cForNumber = EnumC6254c.forNumber(this.tdRunConfiguration_);
        return enumC6254cForNumber == null ? EnumC6254c.UNRECOGNIZED : enumC6254cForNumber;
    }

    public int getTdRunConfigurationValue() {
        return this.tdRunConfiguration_;
    }

    public Common$WebviewFallback getWebviewFallback() {
        Common$WebviewFallback common$WebviewFallback = this.webviewFallback_;
        return common$WebviewFallback == null ? Common$WebviewFallback.getDefaultInstance() : common$WebviewFallback;
    }

    public String getWorkflowSessionId() {
        return this.workflowSessionId_;
    }

    public ByteString getWorkflowSessionIdBytes() {
        return ByteString.copyFromUtf8(this.workflowSessionId_);
    }

    public boolean hasErrorTrackingMetadata() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasEvents() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasHeartbeatConfiguration() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasNextPane() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSessionRenderingData() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasWebviewFallback() {
        return (this.bitField0_ & 4) != 0;
    }

    public static C6253b newBuilder(Workflow$LinkWorkflowStartResponse workflow$LinkWorkflowStartResponse) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowStartResponse);
    }

    public static Workflow$LinkWorkflowStartResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowStartResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowStartResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowStartResponse parseFrom(ByteString byteString) {
        return (Workflow$LinkWorkflowStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addAdditionalPanes(int i, Pane$PaneRendering pane$PaneRendering) {
        pane$PaneRendering.getClass();
        ensureAdditionalPanesIsMutable();
        this.additionalPanes_.add(i, pane$PaneRendering);
    }

    public static Workflow$LinkWorkflowStartResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowStartResponse parseFrom(byte[] bArr) {
        return (Workflow$LinkWorkflowStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Workflow$LinkWorkflowStartResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowStartResponse parseFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowStartResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowStartResponse parseFrom(CodedInputStream codedInputStream) {
        return (Workflow$LinkWorkflowStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Workflow$LinkWorkflowStartResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
