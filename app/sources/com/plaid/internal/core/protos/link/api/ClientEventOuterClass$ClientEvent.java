package com.plaid.internal.core.protos.link.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import com.google.protobuf.WireFormat;
import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes24.dex */
public final class ClientEventOuterClass$ClientEvent extends GeneratedMessageLite<ClientEventOuterClass$ClientEvent, C6176a> implements InterfaceC6257c {
    public static final int ACTION_OVERRIDE_FIELD_NUMBER = 1;
    public static final int ACTIVATE_EXPERIMENT_FIELD_NUMBER = 5;
    public static final int BACK_FIELD_NUMBER = 2;
    public static final int CLEAR_SEARCH_FIELD_NUMBER = 14;
    public static final int CLIENT_LOGO_LOADED_FIELD_NUMBER = 43;
    public static final int CLIENT_OPEN_DELAY_FIELD_NUMBER = 3;
    public static final int CLIENT_PUBLISHED_AT_FIELD_NUMBER = 8;
    public static final int CLOSE_MODAL_FIELD_NUMBER = 48;
    public static final int COMPLETED_PANE_FIELD_NUMBER = 36;
    public static final int CREDENTIALS_ACCORDION_TOGGLE_FIELD_NUMBER = 22;
    public static final int CREDENTIALS_PANE_FIELD_NUMBER = 34;
    private static final ClientEventOuterClass$ClientEvent DEFAULT_INSTANCE;
    public static final int DOCUMENT_LOADED_FIELD_NUMBER = 17;
    public static final int ENROLLMENT_EMAIL_CHANGE_FIELD_NUMBER = 46;
    public static final int ENROLLMENT_OTP_CHANGE_FIELD_NUMBER = 51;
    public static final int ENROLLMENT_PHONE_NUMBER_CHANGE_FIELD_NUMBER = 39;
    public static final int FINGERPRINT_DATA_COLLECTED_FIELD_NUMBER = 26;
    public static final int FIRST_PANE_LOADED_FIELD_NUMBER = 41;
    public static final int FOCUS_SEARCH_FIELD_NUMBER = 15;
    public static final int HOSTED_LINK_SECURITY_MODAL_EXIT_FIELD_NUMBER = 50;
    public static final int INCOME_WRAPPING_PARTNER_ERROR_FIELD_NUMBER = 27;
    public static final int INCOME_WRAPPING_PARTNER_IFRAME_RENDERED_FIELD_NUMBER = 25;
    public static final int INCOME_WRAPPING_PARTNER_METADATA_FIELD_NUMBER = 32;
    public static final int INCOME_WRAPPING_UNSPECIFIED_INTERACTION_FIELD_NUMBER = 37;
    public static final int LARGEST_CONTENTFUL_PAINT_FIELD_NUMBER = 21;
    public static final int LINK_SDK_OPEN_FIELD_NUMBER = 45;
    public static final int NO_NETWORK_CONNECTION_FIELD_NUMBER = 9;
    public static final int OAUTH_INTERSTITIAL_FIELD_NUMBER = 7;
    public static final int OAUTH_LINK_FIELD_NUMBER = 12;
    public static final int OPEN_MODAL_FIELD_NUMBER = 49;
    public static final int PANE_APPEARED_FIELD_NUMBER = 11;
    public static final int PANE_AUTO_SUBMITTED_FIELD_NUMBER = 47;
    private static volatile Parser<ClientEventOuterClass$ClientEvent> PARSER = null;
    public static final int PASSKEY_EVENT_FIELD_NUMBER = 42;
    public static final int PASSKEY_RESULT_FIELD_NUMBER = 40;
    public static final int PAYROLL_SEARCH_PANE_FIELD_NUMBER = 33;
    public static final int SEARCH_SUCCESS_FIELD_NUMBER = 13;
    public static final int SECURE_INPUT_TOGGLE_FIELD_NUMBER = 6;
    public static final int SESSION_EXPIRED_FIELD_NUMBER = 10;
    public static final int SUCCESS_PANE_FIELD_NUMBER = 35;
    public static final int TD_DATA_COLLECTED_FIELD_NUMBER = 28;
    public static final int TRACK_EVENT_WITH_OPTIMIZELY_FIELD_NUMBER = 16;
    public static final int WEB3_PANE_EVENT_FIELD_NUMBER = 19;
    public static final int WEBVIEW_FALLBACK_CANCEL_FIELD_NUMBER = 30;
    public static final int WEBVIEW_FALLBACK_EMIT_PRE_COMPLETION_RESULT_FIELD_NUMBER = 38;
    public static final int WEBVIEW_FALLBACK_OAUTH_POPUP_OPEN_FIELD_NUMBER = 31;
    public static final int WEBVIEW_FALLBACK_OPEN_FIELD_NUMBER = 29;
    public static final int WEBVIEW_FIRST_PANE_LOADED_FIELD_NUMBER = 18;
    public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 4;
    private int bitField0_;
    private Timestamp clientPublishedAt_;
    private Object data_;
    private int dataCase_ = 0;
    private String workflowSessionId_ = "";

    public static final class ActionOverride extends GeneratedMessageLite<ActionOverride, C6086a> implements MessageLiteOrBuilder {
        public static final int CURRENT_PANE_ID_FIELD_NUMBER = 1;
        private static final ActionOverride DEFAULT_INSTANCE;
        public static final int EVENT_METADATA_FIELD_NUMBER = 3;
        public static final int LOCAL_ACTION_ID_FIELD_NUMBER = 2;
        private static volatile Parser<ActionOverride> PARSER;
        private int bitField0_;
        private Common$LocalAction.EventMetadata eventMetadata_;
        private String currentPaneId_ = "";
        private String localActionId_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$ActionOverride$a */
        public static final class C6086a extends GeneratedMessageLite.Builder<ActionOverride, C6086a> implements MessageLiteOrBuilder {
            public C6086a() {
                super(ActionOverride.DEFAULT_INSTANCE);
            }
        }

        static {
            ActionOverride actionOverride = new ActionOverride();
            DEFAULT_INSTANCE = actionOverride;
            GeneratedMessageLite.registerDefaultInstance(ActionOverride.class, actionOverride);
        }

        private ActionOverride() {
        }

        private void clearCurrentPaneId() {
            this.currentPaneId_ = getDefaultInstance().getCurrentPaneId();
        }

        private void clearEventMetadata() {
            this.eventMetadata_ = null;
            this.bitField0_ &= -2;
        }

        private void clearLocalActionId() {
            this.localActionId_ = getDefaultInstance().getLocalActionId();
        }

        public static ActionOverride getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeEventMetadata(Common$LocalAction.EventMetadata eventMetadata) {
            eventMetadata.getClass();
            Common$LocalAction.EventMetadata eventMetadata2 = this.eventMetadata_;
            if (eventMetadata2 == null || eventMetadata2 == Common$LocalAction.EventMetadata.getDefaultInstance()) {
                this.eventMetadata_ = eventMetadata;
            } else {
                this.eventMetadata_ = Common$LocalAction.EventMetadata.newBuilder(this.eventMetadata_).mergeFrom((Common$LocalAction.EventMetadata.C6431a) eventMetadata).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static C6086a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ActionOverride parseDelimitedFrom(InputStream inputStream) {
            return (ActionOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ActionOverride parseFrom(ByteBuffer byteBuffer) {
            return (ActionOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ActionOverride> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCurrentPaneId(String str) {
            str.getClass();
            this.currentPaneId_ = str;
        }

        private void setCurrentPaneIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.currentPaneId_ = byteString.toStringUtf8();
        }

        private void setEventMetadata(Common$LocalAction.EventMetadata eventMetadata) {
            eventMetadata.getClass();
            this.eventMetadata_ = eventMetadata;
            this.bitField0_ |= 1;
        }

        private void setLocalActionId(String str) {
            str.getClass();
            this.localActionId_ = str;
        }

        private void setLocalActionIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.localActionId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ActionOverride();
                case 2:
                    return new C6086a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "currentPaneId_", "localActionId_", "eventMetadata_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ActionOverride> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ActionOverride.class) {
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

        public String getCurrentPaneId() {
            return this.currentPaneId_;
        }

        public ByteString getCurrentPaneIdBytes() {
            return ByteString.copyFromUtf8(this.currentPaneId_);
        }

        public Common$LocalAction.EventMetadata getEventMetadata() {
            Common$LocalAction.EventMetadata eventMetadata = this.eventMetadata_;
            return eventMetadata == null ? Common$LocalAction.EventMetadata.getDefaultInstance() : eventMetadata;
        }

        public String getLocalActionId() {
            return this.localActionId_;
        }

        public ByteString getLocalActionIdBytes() {
            return ByteString.copyFromUtf8(this.localActionId_);
        }

        public boolean hasEventMetadata() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C6086a newBuilder(ActionOverride actionOverride) {
            return DEFAULT_INSTANCE.createBuilder(actionOverride);
        }

        public static ActionOverride parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ActionOverride parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ActionOverride parseFrom(ByteString byteString) {
            return (ActionOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ActionOverride parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ActionOverride parseFrom(byte[] bArr) {
            return (ActionOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ActionOverride parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ActionOverride parseFrom(InputStream inputStream) {
            return (ActionOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ActionOverride parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ActionOverride parseFrom(CodedInputStream codedInputStream) {
            return (ActionOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ActionOverride parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ActivateExperiment extends GeneratedMessageLite<ActivateExperiment, C6087a> implements MessageLiteOrBuilder {
        private static final ActivateExperiment DEFAULT_INSTANCE;
        public static final int EXPERIMENT_KEY_FIELD_NUMBER = 1;
        private static volatile Parser<ActivateExperiment> PARSER;
        private String experimentKey_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$ActivateExperiment$a */
        public static final class C6087a extends GeneratedMessageLite.Builder<ActivateExperiment, C6087a> implements MessageLiteOrBuilder {
            public C6087a() {
                super(ActivateExperiment.DEFAULT_INSTANCE);
            }
        }

        static {
            ActivateExperiment activateExperiment = new ActivateExperiment();
            DEFAULT_INSTANCE = activateExperiment;
            GeneratedMessageLite.registerDefaultInstance(ActivateExperiment.class, activateExperiment);
        }

        private ActivateExperiment() {
        }

        private void clearExperimentKey() {
            this.experimentKey_ = getDefaultInstance().getExperimentKey();
        }

        public static ActivateExperiment getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6087a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ActivateExperiment parseDelimitedFrom(InputStream inputStream) {
            return (ActivateExperiment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ActivateExperiment parseFrom(ByteBuffer byteBuffer) {
            return (ActivateExperiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ActivateExperiment> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setExperimentKey(String str) {
            str.getClass();
            this.experimentKey_ = str;
        }

        private void setExperimentKeyBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.experimentKey_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ActivateExperiment();
                case 2:
                    return new C6087a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"experimentKey_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ActivateExperiment> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ActivateExperiment.class) {
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

        public String getExperimentKey() {
            return this.experimentKey_;
        }

        public ByteString getExperimentKeyBytes() {
            return ByteString.copyFromUtf8(this.experimentKey_);
        }

        public static C6087a newBuilder(ActivateExperiment activateExperiment) {
            return DEFAULT_INSTANCE.createBuilder(activateExperiment);
        }

        public static ActivateExperiment parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActivateExperiment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ActivateExperiment parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ActivateExperiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ActivateExperiment parseFrom(ByteString byteString) {
            return (ActivateExperiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ActivateExperiment parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ActivateExperiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ActivateExperiment parseFrom(byte[] bArr) {
            return (ActivateExperiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ActivateExperiment parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ActivateExperiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ActivateExperiment parseFrom(InputStream inputStream) {
            return (ActivateExperiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ActivateExperiment parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActivateExperiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ActivateExperiment parseFrom(CodedInputStream codedInputStream) {
            return (ActivateExperiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ActivateExperiment parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActivateExperiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Back extends GeneratedMessageLite<Back, C6088a> implements MessageLiteOrBuilder {
        public static final int CURRENT_PANE_ID_FIELD_NUMBER = 1;
        private static final Back DEFAULT_INSTANCE;
        private static volatile Parser<Back> PARSER = null;
        public static final int PREVIOUS_PANE_ID_FIELD_NUMBER = 2;
        private String currentPaneId_ = "";
        private String previousPaneId_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$Back$a */
        public static final class C6088a extends GeneratedMessageLite.Builder<Back, C6088a> implements MessageLiteOrBuilder {
            public C6088a() {
                super(Back.DEFAULT_INSTANCE);
            }

            /* renamed from: a */
            public final void m1392a(String str) {
                copyOnWrite();
                ((Back) this.instance).setCurrentPaneId(str);
            }

            /* renamed from: b */
            public final void m1393b(String str) {
                copyOnWrite();
                ((Back) this.instance).setPreviousPaneId(str);
            }
        }

        static {
            Back back = new Back();
            DEFAULT_INSTANCE = back;
            GeneratedMessageLite.registerDefaultInstance(Back.class, back);
        }

        private Back() {
        }

        private void clearCurrentPaneId() {
            this.currentPaneId_ = getDefaultInstance().getCurrentPaneId();
        }

        private void clearPreviousPaneId() {
            this.previousPaneId_ = getDefaultInstance().getPreviousPaneId();
        }

        public static Back getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6088a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Back parseDelimitedFrom(InputStream inputStream) {
            return (Back) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Back parseFrom(ByteBuffer byteBuffer) {
            return (Back) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Back> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentPaneId(String str) {
            str.getClass();
            this.currentPaneId_ = str;
        }

        private void setCurrentPaneIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.currentPaneId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPreviousPaneId(String str) {
            str.getClass();
            this.previousPaneId_ = str;
        }

        private void setPreviousPaneIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.previousPaneId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Back();
                case 2:
                    return new C6088a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"currentPaneId_", "previousPaneId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Back> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Back.class) {
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

        public String getCurrentPaneId() {
            return this.currentPaneId_;
        }

        public ByteString getCurrentPaneIdBytes() {
            return ByteString.copyFromUtf8(this.currentPaneId_);
        }

        public String getPreviousPaneId() {
            return this.previousPaneId_;
        }

        public ByteString getPreviousPaneIdBytes() {
            return ByteString.copyFromUtf8(this.previousPaneId_);
        }

        public static C6088a newBuilder(Back back) {
            return DEFAULT_INSTANCE.createBuilder(back);
        }

        public static Back parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Back) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Back parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Back) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Back parseFrom(ByteString byteString) {
            return (Back) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Back parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Back) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Back parseFrom(byte[] bArr) {
            return (Back) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Back parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Back) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Back parseFrom(InputStream inputStream) {
            return (Back) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Back parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Back) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Back parseFrom(CodedInputStream codedInputStream) {
            return (Back) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Back parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Back) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class BetaAssetsHiddenToggle extends GeneratedMessageLite<BetaAssetsHiddenToggle, C6089a> implements MessageLiteOrBuilder {
        private static final BetaAssetsHiddenToggle DEFAULT_INSTANCE;
        public static final int EXPANDED_FIELD_NUMBER = 2;
        public static final int HIDDEN_SELECTION_TOGGLE_FIELD_NUMBER = 1;
        private static volatile Parser<BetaAssetsHiddenToggle> PARSER;
        private boolean expanded_;
        private String hiddenSelectionToggle_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$BetaAssetsHiddenToggle$a */
        public static final class C6089a extends GeneratedMessageLite.Builder<BetaAssetsHiddenToggle, C6089a> implements MessageLiteOrBuilder {
            public C6089a() {
                super(BetaAssetsHiddenToggle.DEFAULT_INSTANCE);
            }
        }

        static {
            BetaAssetsHiddenToggle betaAssetsHiddenToggle = new BetaAssetsHiddenToggle();
            DEFAULT_INSTANCE = betaAssetsHiddenToggle;
            GeneratedMessageLite.registerDefaultInstance(BetaAssetsHiddenToggle.class, betaAssetsHiddenToggle);
        }

        private BetaAssetsHiddenToggle() {
        }

        private void clearExpanded() {
            this.expanded_ = false;
        }

        private void clearHiddenSelectionToggle() {
            this.hiddenSelectionToggle_ = getDefaultInstance().getHiddenSelectionToggle();
        }

        public static BetaAssetsHiddenToggle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6089a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BetaAssetsHiddenToggle parseDelimitedFrom(InputStream inputStream) {
            return (BetaAssetsHiddenToggle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BetaAssetsHiddenToggle parseFrom(ByteBuffer byteBuffer) {
            return (BetaAssetsHiddenToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<BetaAssetsHiddenToggle> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setExpanded(boolean z) {
            this.expanded_ = z;
        }

        private void setHiddenSelectionToggle(String str) {
            str.getClass();
            this.hiddenSelectionToggle_ = str;
        }

        private void setHiddenSelectionToggleBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.hiddenSelectionToggle_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new BetaAssetsHiddenToggle();
                case 2:
                    return new C6089a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"hiddenSelectionToggle_", "expanded_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<BetaAssetsHiddenToggle> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (BetaAssetsHiddenToggle.class) {
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

        public boolean getExpanded() {
            return this.expanded_;
        }

        public String getHiddenSelectionToggle() {
            return this.hiddenSelectionToggle_;
        }

        public ByteString getHiddenSelectionToggleBytes() {
            return ByteString.copyFromUtf8(this.hiddenSelectionToggle_);
        }

        public static C6089a newBuilder(BetaAssetsHiddenToggle betaAssetsHiddenToggle) {
            return DEFAULT_INSTANCE.createBuilder(betaAssetsHiddenToggle);
        }

        public static BetaAssetsHiddenToggle parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BetaAssetsHiddenToggle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BetaAssetsHiddenToggle parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (BetaAssetsHiddenToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BetaAssetsHiddenToggle parseFrom(ByteString byteString) {
            return (BetaAssetsHiddenToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BetaAssetsHiddenToggle parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (BetaAssetsHiddenToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BetaAssetsHiddenToggle parseFrom(byte[] bArr) {
            return (BetaAssetsHiddenToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BetaAssetsHiddenToggle parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (BetaAssetsHiddenToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BetaAssetsHiddenToggle parseFrom(InputStream inputStream) {
            return (BetaAssetsHiddenToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BetaAssetsHiddenToggle parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BetaAssetsHiddenToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BetaAssetsHiddenToggle parseFrom(CodedInputStream codedInputStream) {
            return (BetaAssetsHiddenToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BetaAssetsHiddenToggle parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BetaAssetsHiddenToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class BetaSelectTab extends GeneratedMessageLite<BetaSelectTab, C6090a> implements MessageLiteOrBuilder {
        private static final BetaSelectTab DEFAULT_INSTANCE;
        private static volatile Parser<BetaSelectTab> PARSER = null;
        public static final int TAB_FIELD_NUMBER = 1;
        private String tab_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$BetaSelectTab$a */
        public static final class C6090a extends GeneratedMessageLite.Builder<BetaSelectTab, C6090a> implements MessageLiteOrBuilder {
            public C6090a() {
                super(BetaSelectTab.DEFAULT_INSTANCE);
            }
        }

        static {
            BetaSelectTab betaSelectTab = new BetaSelectTab();
            DEFAULT_INSTANCE = betaSelectTab;
            GeneratedMessageLite.registerDefaultInstance(BetaSelectTab.class, betaSelectTab);
        }

        private BetaSelectTab() {
        }

        private void clearTab() {
            this.tab_ = getDefaultInstance().getTab();
        }

        public static BetaSelectTab getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6090a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BetaSelectTab parseDelimitedFrom(InputStream inputStream) {
            return (BetaSelectTab) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BetaSelectTab parseFrom(ByteBuffer byteBuffer) {
            return (BetaSelectTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<BetaSelectTab> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setTab(String str) {
            str.getClass();
            this.tab_ = str;
        }

        private void setTabBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.tab_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new BetaSelectTab();
                case 2:
                    return new C6090a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"tab_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<BetaSelectTab> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (BetaSelectTab.class) {
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

        public String getTab() {
            return this.tab_;
        }

        public ByteString getTabBytes() {
            return ByteString.copyFromUtf8(this.tab_);
        }

        public static C6090a newBuilder(BetaSelectTab betaSelectTab) {
            return DEFAULT_INSTANCE.createBuilder(betaSelectTab);
        }

        public static BetaSelectTab parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BetaSelectTab) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BetaSelectTab parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (BetaSelectTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BetaSelectTab parseFrom(ByteString byteString) {
            return (BetaSelectTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BetaSelectTab parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (BetaSelectTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BetaSelectTab parseFrom(byte[] bArr) {
            return (BetaSelectTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BetaSelectTab parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (BetaSelectTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BetaSelectTab parseFrom(InputStream inputStream) {
            return (BetaSelectTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BetaSelectTab parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BetaSelectTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BetaSelectTab parseFrom(CodedInputStream codedInputStream) {
            return (BetaSelectTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BetaSelectTab parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BetaSelectTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ClearSearch extends GeneratedMessageLite<ClearSearch, C6091a> implements MessageLiteOrBuilder {
        private static final ClearSearch DEFAULT_INSTANCE;
        private static volatile Parser<ClearSearch> PARSER;

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$ClearSearch$a */
        public static final class C6091a extends GeneratedMessageLite.Builder<ClearSearch, C6091a> implements MessageLiteOrBuilder {
            public C6091a() {
                super(ClearSearch.DEFAULT_INSTANCE);
            }
        }

        static {
            ClearSearch clearSearch = new ClearSearch();
            DEFAULT_INSTANCE = clearSearch;
            GeneratedMessageLite.registerDefaultInstance(ClearSearch.class, clearSearch);
        }

        private ClearSearch() {
        }

        public static ClearSearch getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6091a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ClearSearch parseDelimitedFrom(InputStream inputStream) {
            return (ClearSearch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClearSearch parseFrom(ByteBuffer byteBuffer) {
            return (ClearSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ClearSearch> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ClearSearch();
                case 2:
                    return new C6091a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ClearSearch> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ClearSearch.class) {
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

        public static C6091a newBuilder(ClearSearch clearSearch) {
            return DEFAULT_INSTANCE.createBuilder(clearSearch);
        }

        public static ClearSearch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClearSearch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClearSearch parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ClearSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ClearSearch parseFrom(ByteString byteString) {
            return (ClearSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ClearSearch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ClearSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ClearSearch parseFrom(byte[] bArr) {
            return (ClearSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ClearSearch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ClearSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ClearSearch parseFrom(InputStream inputStream) {
            return (ClearSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClearSearch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClearSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClearSearch parseFrom(CodedInputStream codedInputStream) {
            return (ClearSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ClearSearch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClearSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ClientOpenDelay extends GeneratedMessageLite<ClientOpenDelay, C6092a> implements MessageLiteOrBuilder {
        private static final ClientOpenDelay DEFAULT_INSTANCE;
        public static final int DELAY_MS_FIELD_NUMBER = 1;
        private static volatile Parser<ClientOpenDelay> PARSER;
        private String delayMs_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$ClientOpenDelay$a */
        public static final class C6092a extends GeneratedMessageLite.Builder<ClientOpenDelay, C6092a> implements MessageLiteOrBuilder {
            public C6092a() {
                super(ClientOpenDelay.DEFAULT_INSTANCE);
            }

            /* renamed from: a */
            public final C6092a m1394a(String str) {
                copyOnWrite();
                ((ClientOpenDelay) this.instance).setDelayMs(str);
                return this;
            }
        }

        static {
            ClientOpenDelay clientOpenDelay = new ClientOpenDelay();
            DEFAULT_INSTANCE = clientOpenDelay;
            GeneratedMessageLite.registerDefaultInstance(ClientOpenDelay.class, clientOpenDelay);
        }

        private ClientOpenDelay() {
        }

        private void clearDelayMs() {
            this.delayMs_ = getDefaultInstance().getDelayMs();
        }

        public static ClientOpenDelay getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6092a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ClientOpenDelay parseDelimitedFrom(InputStream inputStream) {
            return (ClientOpenDelay) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientOpenDelay parseFrom(ByteBuffer byteBuffer) {
            return (ClientOpenDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ClientOpenDelay> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDelayMs(String str) {
            str.getClass();
            this.delayMs_ = str;
        }

        private void setDelayMsBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.delayMs_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ClientOpenDelay();
                case 2:
                    return new C6092a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"delayMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ClientOpenDelay> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ClientOpenDelay.class) {
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

        public String getDelayMs() {
            return this.delayMs_;
        }

        public ByteString getDelayMsBytes() {
            return ByteString.copyFromUtf8(this.delayMs_);
        }

        public static C6092a newBuilder(ClientOpenDelay clientOpenDelay) {
            return DEFAULT_INSTANCE.createBuilder(clientOpenDelay);
        }

        public static ClientOpenDelay parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClientOpenDelay) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClientOpenDelay parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ClientOpenDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ClientOpenDelay parseFrom(ByteString byteString) {
            return (ClientOpenDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ClientOpenDelay parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ClientOpenDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ClientOpenDelay parseFrom(byte[] bArr) {
            return (ClientOpenDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ClientOpenDelay parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ClientOpenDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ClientOpenDelay parseFrom(InputStream inputStream) {
            return (ClientOpenDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientOpenDelay parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClientOpenDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClientOpenDelay parseFrom(CodedInputStream codedInputStream) {
            return (ClientOpenDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ClientOpenDelay parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClientOpenDelay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CloseModal extends GeneratedMessageLite<CloseModal, C6093a> implements MessageLiteOrBuilder {
        private static final CloseModal DEFAULT_INSTANCE;
        public static final int PANE_NODE_ID_FIELD_NUMBER = 1;
        private static volatile Parser<CloseModal> PARSER;
        private String paneNodeId_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$CloseModal$a */
        public static final class C6093a extends GeneratedMessageLite.Builder<CloseModal, C6093a> implements MessageLiteOrBuilder {
            public C6093a() {
                super(CloseModal.DEFAULT_INSTANCE);
            }
        }

        static {
            CloseModal closeModal = new CloseModal();
            DEFAULT_INSTANCE = closeModal;
            GeneratedMessageLite.registerDefaultInstance(CloseModal.class, closeModal);
        }

        private CloseModal() {
        }

        private void clearPaneNodeId() {
            this.paneNodeId_ = getDefaultInstance().getPaneNodeId();
        }

        public static CloseModal getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6093a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CloseModal parseDelimitedFrom(InputStream inputStream) {
            return (CloseModal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CloseModal parseFrom(ByteBuffer byteBuffer) {
            return (CloseModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CloseModal> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setPaneNodeId(String str) {
            str.getClass();
            this.paneNodeId_ = str;
        }

        private void setPaneNodeIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.paneNodeId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new CloseModal();
                case 2:
                    return new C6093a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"paneNodeId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CloseModal> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (CloseModal.class) {
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

        public String getPaneNodeId() {
            return this.paneNodeId_;
        }

        public ByteString getPaneNodeIdBytes() {
            return ByteString.copyFromUtf8(this.paneNodeId_);
        }

        public static C6093a newBuilder(CloseModal closeModal) {
            return DEFAULT_INSTANCE.createBuilder(closeModal);
        }

        public static CloseModal parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CloseModal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CloseModal parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (CloseModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CloseModal parseFrom(ByteString byteString) {
            return (CloseModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CloseModal parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CloseModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CloseModal parseFrom(byte[] bArr) {
            return (CloseModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CloseModal parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CloseModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CloseModal parseFrom(InputStream inputStream) {
            return (CloseModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CloseModal parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CloseModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CloseModal parseFrom(CodedInputStream codedInputStream) {
            return (CloseModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CloseModal parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CloseModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CompletedPane extends GeneratedMessageLite<CompletedPane, C6094a> implements MessageLiteOrBuilder {
        public static final int COMPANY_METADATA_FIELD_NUMBER = 1;
        private static final CompletedPane DEFAULT_INSTANCE;
        private static volatile Parser<CompletedPane> PARSER = null;
        public static final int PARTNER_FIELD_NUMBER = 4;
        public static final int STATE_FIELD_NUMBER = 3;
        public static final int TOKEN_FIELD_NUMBER = 2;
        private int bitField0_;
        private IncomeWrappingCompanyMetadata companyMetadata_;
        private String partner_ = "";
        private String token_ = "";
        private String state_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$CompletedPane$a */
        public static final class C6094a extends GeneratedMessageLite.Builder<CompletedPane, C6094a> implements MessageLiteOrBuilder {
            public C6094a() {
                super(CompletedPane.DEFAULT_INSTANCE);
            }
        }

        static {
            CompletedPane completedPane = new CompletedPane();
            DEFAULT_INSTANCE = completedPane;
            GeneratedMessageLite.registerDefaultInstance(CompletedPane.class, completedPane);
        }

        private CompletedPane() {
        }

        private void clearCompanyMetadata() {
            this.companyMetadata_ = null;
            this.bitField0_ &= -2;
        }

        private void clearPartner() {
            this.partner_ = getDefaultInstance().getPartner();
        }

        private void clearState() {
            this.state_ = getDefaultInstance().getState();
        }

        private void clearToken() {
            this.token_ = getDefaultInstance().getToken();
        }

        public static CompletedPane getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeCompanyMetadata(IncomeWrappingCompanyMetadata incomeWrappingCompanyMetadata) {
            incomeWrappingCompanyMetadata.getClass();
            IncomeWrappingCompanyMetadata incomeWrappingCompanyMetadata2 = this.companyMetadata_;
            if (incomeWrappingCompanyMetadata2 == null || incomeWrappingCompanyMetadata2 == IncomeWrappingCompanyMetadata.getDefaultInstance()) {
                this.companyMetadata_ = incomeWrappingCompanyMetadata;
            } else {
                this.companyMetadata_ = IncomeWrappingCompanyMetadata.newBuilder(this.companyMetadata_).mergeFrom((IncomeWrappingCompanyMetadata.C6106a) incomeWrappingCompanyMetadata).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static C6094a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CompletedPane parseDelimitedFrom(InputStream inputStream) {
            return (CompletedPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CompletedPane parseFrom(ByteBuffer byteBuffer) {
            return (CompletedPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CompletedPane> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCompanyMetadata(IncomeWrappingCompanyMetadata incomeWrappingCompanyMetadata) {
            incomeWrappingCompanyMetadata.getClass();
            this.companyMetadata_ = incomeWrappingCompanyMetadata;
            this.bitField0_ |= 1;
        }

        private void setPartner(String str) {
            str.getClass();
            this.partner_ = str;
        }

        private void setPartnerBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.partner_ = byteString.toStringUtf8();
        }

        private void setState(String str) {
            str.getClass();
            this.state_ = str;
        }

        private void setStateBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.state_ = byteString.toStringUtf8();
        }

        private void setToken(String str) {
            str.getClass();
            this.token_ = str;
        }

        private void setTokenBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.token_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new CompletedPane();
                case 2:
                    return new C6094a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"bitField0_", "companyMetadata_", "token_", "state_", "partner_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CompletedPane> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (CompletedPane.class) {
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

        public IncomeWrappingCompanyMetadata getCompanyMetadata() {
            IncomeWrappingCompanyMetadata incomeWrappingCompanyMetadata = this.companyMetadata_;
            return incomeWrappingCompanyMetadata == null ? IncomeWrappingCompanyMetadata.getDefaultInstance() : incomeWrappingCompanyMetadata;
        }

        public String getPartner() {
            return this.partner_;
        }

        public ByteString getPartnerBytes() {
            return ByteString.copyFromUtf8(this.partner_);
        }

        public String getState() {
            return this.state_;
        }

        public ByteString getStateBytes() {
            return ByteString.copyFromUtf8(this.state_);
        }

        public String getToken() {
            return this.token_;
        }

        public ByteString getTokenBytes() {
            return ByteString.copyFromUtf8(this.token_);
        }

        public boolean hasCompanyMetadata() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C6094a newBuilder(CompletedPane completedPane) {
            return DEFAULT_INSTANCE.createBuilder(completedPane);
        }

        public static CompletedPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CompletedPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CompletedPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (CompletedPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CompletedPane parseFrom(ByteString byteString) {
            return (CompletedPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CompletedPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CompletedPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CompletedPane parseFrom(byte[] bArr) {
            return (CompletedPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CompletedPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CompletedPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CompletedPane parseFrom(InputStream inputStream) {
            return (CompletedPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CompletedPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CompletedPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CompletedPane parseFrom(CodedInputStream codedInputStream) {
            return (CompletedPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CompletedPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CompletedPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CredentialsAccordionToggle extends GeneratedMessageLite<CredentialsAccordionToggle, C6095a> implements MessageLiteOrBuilder {
        private static final CredentialsAccordionToggle DEFAULT_INSTANCE;
        public static final int EXPANDED_FIELD_NUMBER = 2;
        public static final int INDEX_FIELD_NUMBER = 1;
        private static volatile Parser<CredentialsAccordionToggle> PARSER;
        private boolean expanded_;
        private long index_;

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$CredentialsAccordionToggle$a */
        public static final class C6095a extends GeneratedMessageLite.Builder<CredentialsAccordionToggle, C6095a> implements MessageLiteOrBuilder {
            public C6095a() {
                super(CredentialsAccordionToggle.DEFAULT_INSTANCE);
            }
        }

        static {
            CredentialsAccordionToggle credentialsAccordionToggle = new CredentialsAccordionToggle();
            DEFAULT_INSTANCE = credentialsAccordionToggle;
            GeneratedMessageLite.registerDefaultInstance(CredentialsAccordionToggle.class, credentialsAccordionToggle);
        }

        private CredentialsAccordionToggle() {
        }

        private void clearExpanded() {
            this.expanded_ = false;
        }

        private void clearIndex() {
            this.index_ = 0L;
        }

        public static CredentialsAccordionToggle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6095a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CredentialsAccordionToggle parseDelimitedFrom(InputStream inputStream) {
            return (CredentialsAccordionToggle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CredentialsAccordionToggle parseFrom(ByteBuffer byteBuffer) {
            return (CredentialsAccordionToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CredentialsAccordionToggle> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setExpanded(boolean z) {
            this.expanded_ = z;
        }

        private void setIndex(long j) {
            this.index_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new CredentialsAccordionToggle();
                case 2:
                    return new C6095a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0007", new Object[]{"index_", "expanded_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CredentialsAccordionToggle> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (CredentialsAccordionToggle.class) {
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

        public boolean getExpanded() {
            return this.expanded_;
        }

        public long getIndex() {
            return this.index_;
        }

        public static C6095a newBuilder(CredentialsAccordionToggle credentialsAccordionToggle) {
            return DEFAULT_INSTANCE.createBuilder(credentialsAccordionToggle);
        }

        public static CredentialsAccordionToggle parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CredentialsAccordionToggle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CredentialsAccordionToggle parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (CredentialsAccordionToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CredentialsAccordionToggle parseFrom(ByteString byteString) {
            return (CredentialsAccordionToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CredentialsAccordionToggle parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CredentialsAccordionToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CredentialsAccordionToggle parseFrom(byte[] bArr) {
            return (CredentialsAccordionToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CredentialsAccordionToggle parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CredentialsAccordionToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CredentialsAccordionToggle parseFrom(InputStream inputStream) {
            return (CredentialsAccordionToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CredentialsAccordionToggle parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CredentialsAccordionToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CredentialsAccordionToggle parseFrom(CodedInputStream codedInputStream) {
            return (CredentialsAccordionToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CredentialsAccordionToggle parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CredentialsAccordionToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CredentialsPane extends GeneratedMessageLite<CredentialsPane, C6096a> implements MessageLiteOrBuilder {
        public static final int COMPANY_METADATA_FIELD_NUMBER = 1;
        private static final CredentialsPane DEFAULT_INSTANCE;
        private static volatile Parser<CredentialsPane> PARSER = null;
        public static final int PARTNER_FIELD_NUMBER = 3;
        public static final int TOKEN_FIELD_NUMBER = 2;
        private int bitField0_;
        private IncomeWrappingCompanyMetadata companyMetadata_;
        private String partner_ = "";
        private String token_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$CredentialsPane$a */
        public static final class C6096a extends GeneratedMessageLite.Builder<CredentialsPane, C6096a> implements MessageLiteOrBuilder {
            public C6096a() {
                super(CredentialsPane.DEFAULT_INSTANCE);
            }
        }

        static {
            CredentialsPane credentialsPane = new CredentialsPane();
            DEFAULT_INSTANCE = credentialsPane;
            GeneratedMessageLite.registerDefaultInstance(CredentialsPane.class, credentialsPane);
        }

        private CredentialsPane() {
        }

        private void clearCompanyMetadata() {
            this.companyMetadata_ = null;
            this.bitField0_ &= -2;
        }

        private void clearPartner() {
            this.partner_ = getDefaultInstance().getPartner();
        }

        private void clearToken() {
            this.token_ = getDefaultInstance().getToken();
        }

        public static CredentialsPane getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeCompanyMetadata(IncomeWrappingCompanyMetadata incomeWrappingCompanyMetadata) {
            incomeWrappingCompanyMetadata.getClass();
            IncomeWrappingCompanyMetadata incomeWrappingCompanyMetadata2 = this.companyMetadata_;
            if (incomeWrappingCompanyMetadata2 == null || incomeWrappingCompanyMetadata2 == IncomeWrappingCompanyMetadata.getDefaultInstance()) {
                this.companyMetadata_ = incomeWrappingCompanyMetadata;
            } else {
                this.companyMetadata_ = IncomeWrappingCompanyMetadata.newBuilder(this.companyMetadata_).mergeFrom((IncomeWrappingCompanyMetadata.C6106a) incomeWrappingCompanyMetadata).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static C6096a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CredentialsPane parseDelimitedFrom(InputStream inputStream) {
            return (CredentialsPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CredentialsPane parseFrom(ByteBuffer byteBuffer) {
            return (CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CredentialsPane> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCompanyMetadata(IncomeWrappingCompanyMetadata incomeWrappingCompanyMetadata) {
            incomeWrappingCompanyMetadata.getClass();
            this.companyMetadata_ = incomeWrappingCompanyMetadata;
            this.bitField0_ |= 1;
        }

        private void setPartner(String str) {
            str.getClass();
            this.partner_ = str;
        }

        private void setPartnerBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.partner_ = byteString.toStringUtf8();
        }

        private void setToken(String str) {
            str.getClass();
            this.token_ = str;
        }

        private void setTokenBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.token_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new CredentialsPane();
                case 2:
                    return new C6096a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"bitField0_", "companyMetadata_", "token_", "partner_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CredentialsPane> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (CredentialsPane.class) {
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

        public IncomeWrappingCompanyMetadata getCompanyMetadata() {
            IncomeWrappingCompanyMetadata incomeWrappingCompanyMetadata = this.companyMetadata_;
            return incomeWrappingCompanyMetadata == null ? IncomeWrappingCompanyMetadata.getDefaultInstance() : incomeWrappingCompanyMetadata;
        }

        public String getPartner() {
            return this.partner_;
        }

        public ByteString getPartnerBytes() {
            return ByteString.copyFromUtf8(this.partner_);
        }

        public String getToken() {
            return this.token_;
        }

        public ByteString getTokenBytes() {
            return ByteString.copyFromUtf8(this.token_);
        }

        public boolean hasCompanyMetadata() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C6096a newBuilder(CredentialsPane credentialsPane) {
            return DEFAULT_INSTANCE.createBuilder(credentialsPane);
        }

        public static CredentialsPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CredentialsPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CredentialsPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CredentialsPane parseFrom(ByteString byteString) {
            return (CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CredentialsPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CredentialsPane parseFrom(byte[] bArr) {
            return (CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CredentialsPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CredentialsPane parseFrom(InputStream inputStream) {
            return (CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CredentialsPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CredentialsPane parseFrom(CodedInputStream codedInputStream) {
            return (CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CredentialsPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CredentialsPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DocumentLoaded extends GeneratedMessageLite<DocumentLoaded, C6097a> implements MessageLiteOrBuilder {
        private static final DocumentLoaded DEFAULT_INSTANCE;
        public static final int DELAY_MS_FIELD_NUMBER = 1;
        private static volatile Parser<DocumentLoaded> PARSER;
        private long delayMs_;

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$DocumentLoaded$a */
        public static final class C6097a extends GeneratedMessageLite.Builder<DocumentLoaded, C6097a> implements MessageLiteOrBuilder {
            public C6097a() {
                super(DocumentLoaded.DEFAULT_INSTANCE);
            }
        }

        static {
            DocumentLoaded documentLoaded = new DocumentLoaded();
            DEFAULT_INSTANCE = documentLoaded;
            GeneratedMessageLite.registerDefaultInstance(DocumentLoaded.class, documentLoaded);
        }

        private DocumentLoaded() {
        }

        private void clearDelayMs() {
            this.delayMs_ = 0L;
        }

        public static DocumentLoaded getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6097a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DocumentLoaded parseDelimitedFrom(InputStream inputStream) {
            return (DocumentLoaded) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DocumentLoaded parseFrom(ByteBuffer byteBuffer) {
            return (DocumentLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DocumentLoaded> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDelayMs(long j) {
            this.delayMs_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new DocumentLoaded();
                case 2:
                    return new C6097a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"delayMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DocumentLoaded> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (DocumentLoaded.class) {
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

        public long getDelayMs() {
            return this.delayMs_;
        }

        public static C6097a newBuilder(DocumentLoaded documentLoaded) {
            return DEFAULT_INSTANCE.createBuilder(documentLoaded);
        }

        public static DocumentLoaded parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DocumentLoaded) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DocumentLoaded parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (DocumentLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DocumentLoaded parseFrom(ByteString byteString) {
            return (DocumentLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DocumentLoaded parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (DocumentLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DocumentLoaded parseFrom(byte[] bArr) {
            return (DocumentLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DocumentLoaded parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (DocumentLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DocumentLoaded parseFrom(InputStream inputStream) {
            return (DocumentLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DocumentLoaded parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DocumentLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DocumentLoaded parseFrom(CodedInputStream codedInputStream) {
            return (DocumentLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DocumentLoaded parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DocumentLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class EnrollmentEmailChange extends GeneratedMessageLite<EnrollmentEmailChange, C6098a> implements MessageLiteOrBuilder {
        private static final EnrollmentEmailChange DEFAULT_INSTANCE;
        public static final int IS_AUTOFILL_FIELD_NUMBER = 3;
        public static final int IS_AUTOFILL_PROXY_FIELD_NUMBER = 4;
        public static final int IS_PREFILL_FIELD_NUMBER = 2;
        public static final int LENGTH_FIELD_NUMBER = 1;
        private static volatile Parser<EnrollmentEmailChange> PARSER;
        private boolean isAutofillProxy_;
        private boolean isAutofill_;
        private boolean isPrefill_;
        private long length_;

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$EnrollmentEmailChange$a */
        public static final class C6098a extends GeneratedMessageLite.Builder<EnrollmentEmailChange, C6098a> implements MessageLiteOrBuilder {
            public C6098a() {
                super(EnrollmentEmailChange.DEFAULT_INSTANCE);
            }
        }

        static {
            EnrollmentEmailChange enrollmentEmailChange = new EnrollmentEmailChange();
            DEFAULT_INSTANCE = enrollmentEmailChange;
            GeneratedMessageLite.registerDefaultInstance(EnrollmentEmailChange.class, enrollmentEmailChange);
        }

        private EnrollmentEmailChange() {
        }

        private void clearIsAutofill() {
            this.isAutofill_ = false;
        }

        private void clearIsAutofillProxy() {
            this.isAutofillProxy_ = false;
        }

        private void clearIsPrefill() {
            this.isPrefill_ = false;
        }

        private void clearLength() {
            this.length_ = 0L;
        }

        public static EnrollmentEmailChange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6098a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static EnrollmentEmailChange parseDelimitedFrom(InputStream inputStream) {
            return (EnrollmentEmailChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnrollmentEmailChange parseFrom(ByteBuffer byteBuffer) {
            return (EnrollmentEmailChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<EnrollmentEmailChange> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setIsAutofill(boolean z) {
            this.isAutofill_ = z;
        }

        private void setIsAutofillProxy(boolean z) {
            this.isAutofillProxy_ = z;
        }

        private void setIsPrefill(boolean z) {
            this.isPrefill_ = z;
        }

        private void setLength(long j) {
            this.length_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new EnrollmentEmailChange();
                case 2:
                    return new C6098a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"length_", "isPrefill_", "isAutofill_", "isAutofillProxy_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EnrollmentEmailChange> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (EnrollmentEmailChange.class) {
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

        public boolean getIsAutofill() {
            return this.isAutofill_;
        }

        public boolean getIsAutofillProxy() {
            return this.isAutofillProxy_;
        }

        public boolean getIsPrefill() {
            return this.isPrefill_;
        }

        public long getLength() {
            return this.length_;
        }

        public static C6098a newBuilder(EnrollmentEmailChange enrollmentEmailChange) {
            return DEFAULT_INSTANCE.createBuilder(enrollmentEmailChange);
        }

        public static EnrollmentEmailChange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnrollmentEmailChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EnrollmentEmailChange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (EnrollmentEmailChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EnrollmentEmailChange parseFrom(ByteString byteString) {
            return (EnrollmentEmailChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EnrollmentEmailChange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (EnrollmentEmailChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static EnrollmentEmailChange parseFrom(byte[] bArr) {
            return (EnrollmentEmailChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EnrollmentEmailChange parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (EnrollmentEmailChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EnrollmentEmailChange parseFrom(InputStream inputStream) {
            return (EnrollmentEmailChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnrollmentEmailChange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnrollmentEmailChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EnrollmentEmailChange parseFrom(CodedInputStream codedInputStream) {
            return (EnrollmentEmailChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EnrollmentEmailChange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnrollmentEmailChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class EnrollmentOTPChange extends GeneratedMessageLite<EnrollmentOTPChange, C6099a> implements MessageLiteOrBuilder {
        private static final EnrollmentOTPChange DEFAULT_INSTANCE;
        public static final int IS_AUTOFILL_FIELD_NUMBER = 2;
        public static final int IS_AUTOFILL_PROXY_FIELD_NUMBER = 3;
        public static final int LENGTH_FIELD_NUMBER = 1;
        private static volatile Parser<EnrollmentOTPChange> PARSER;
        private boolean isAutofillProxy_;
        private boolean isAutofill_;
        private long length_;

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$EnrollmentOTPChange$a */
        public static final class C6099a extends GeneratedMessageLite.Builder<EnrollmentOTPChange, C6099a> implements MessageLiteOrBuilder {
            public C6099a() {
                super(EnrollmentOTPChange.DEFAULT_INSTANCE);
            }
        }

        static {
            EnrollmentOTPChange enrollmentOTPChange = new EnrollmentOTPChange();
            DEFAULT_INSTANCE = enrollmentOTPChange;
            GeneratedMessageLite.registerDefaultInstance(EnrollmentOTPChange.class, enrollmentOTPChange);
        }

        private EnrollmentOTPChange() {
        }

        private void clearIsAutofill() {
            this.isAutofill_ = false;
        }

        private void clearIsAutofillProxy() {
            this.isAutofillProxy_ = false;
        }

        private void clearLength() {
            this.length_ = 0L;
        }

        public static EnrollmentOTPChange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6099a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static EnrollmentOTPChange parseDelimitedFrom(InputStream inputStream) {
            return (EnrollmentOTPChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnrollmentOTPChange parseFrom(ByteBuffer byteBuffer) {
            return (EnrollmentOTPChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<EnrollmentOTPChange> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setIsAutofill(boolean z) {
            this.isAutofill_ = z;
        }

        private void setIsAutofillProxy(boolean z) {
            this.isAutofillProxy_ = z;
        }

        private void setLength(long j) {
            this.length_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new EnrollmentOTPChange();
                case 2:
                    return new C6099a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0007\u0003\u0007", new Object[]{"length_", "isAutofill_", "isAutofillProxy_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EnrollmentOTPChange> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (EnrollmentOTPChange.class) {
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

        public boolean getIsAutofill() {
            return this.isAutofill_;
        }

        public boolean getIsAutofillProxy() {
            return this.isAutofillProxy_;
        }

        public long getLength() {
            return this.length_;
        }

        public static C6099a newBuilder(EnrollmentOTPChange enrollmentOTPChange) {
            return DEFAULT_INSTANCE.createBuilder(enrollmentOTPChange);
        }

        public static EnrollmentOTPChange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnrollmentOTPChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EnrollmentOTPChange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (EnrollmentOTPChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EnrollmentOTPChange parseFrom(ByteString byteString) {
            return (EnrollmentOTPChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EnrollmentOTPChange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (EnrollmentOTPChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static EnrollmentOTPChange parseFrom(byte[] bArr) {
            return (EnrollmentOTPChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EnrollmentOTPChange parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (EnrollmentOTPChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EnrollmentOTPChange parseFrom(InputStream inputStream) {
            return (EnrollmentOTPChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnrollmentOTPChange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnrollmentOTPChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EnrollmentOTPChange parseFrom(CodedInputStream codedInputStream) {
            return (EnrollmentOTPChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EnrollmentOTPChange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnrollmentOTPChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class EnrollmentPhoneNumberChange extends GeneratedMessageLite<EnrollmentPhoneNumberChange, C6100a> implements MessageLiteOrBuilder {
        private static final EnrollmentPhoneNumberChange DEFAULT_INSTANCE;
        public static final int IS_AUTOFILL_FIELD_NUMBER = 3;
        public static final int IS_AUTOFILL_PROXY_FIELD_NUMBER = 4;
        public static final int IS_PREFILL_FIELD_NUMBER = 2;
        public static final int LENGTH_FIELD_NUMBER = 1;
        private static volatile Parser<EnrollmentPhoneNumberChange> PARSER;
        private boolean isAutofillProxy_;
        private boolean isAutofill_;
        private boolean isPrefill_;
        private long length_;

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$EnrollmentPhoneNumberChange$a */
        public static final class C6100a extends GeneratedMessageLite.Builder<EnrollmentPhoneNumberChange, C6100a> implements MessageLiteOrBuilder {
            public C6100a() {
                super(EnrollmentPhoneNumberChange.DEFAULT_INSTANCE);
            }
        }

        static {
            EnrollmentPhoneNumberChange enrollmentPhoneNumberChange = new EnrollmentPhoneNumberChange();
            DEFAULT_INSTANCE = enrollmentPhoneNumberChange;
            GeneratedMessageLite.registerDefaultInstance(EnrollmentPhoneNumberChange.class, enrollmentPhoneNumberChange);
        }

        private EnrollmentPhoneNumberChange() {
        }

        private void clearIsAutofill() {
            this.isAutofill_ = false;
        }

        private void clearIsAutofillProxy() {
            this.isAutofillProxy_ = false;
        }

        private void clearIsPrefill() {
            this.isPrefill_ = false;
        }

        private void clearLength() {
            this.length_ = 0L;
        }

        public static EnrollmentPhoneNumberChange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6100a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static EnrollmentPhoneNumberChange parseDelimitedFrom(InputStream inputStream) {
            return (EnrollmentPhoneNumberChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnrollmentPhoneNumberChange parseFrom(ByteBuffer byteBuffer) {
            return (EnrollmentPhoneNumberChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<EnrollmentPhoneNumberChange> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setIsAutofill(boolean z) {
            this.isAutofill_ = z;
        }

        private void setIsAutofillProxy(boolean z) {
            this.isAutofillProxy_ = z;
        }

        private void setIsPrefill(boolean z) {
            this.isPrefill_ = z;
        }

        private void setLength(long j) {
            this.length_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new EnrollmentPhoneNumberChange();
                case 2:
                    return new C6100a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"length_", "isPrefill_", "isAutofill_", "isAutofillProxy_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EnrollmentPhoneNumberChange> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (EnrollmentPhoneNumberChange.class) {
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

        public boolean getIsAutofill() {
            return this.isAutofill_;
        }

        public boolean getIsAutofillProxy() {
            return this.isAutofillProxy_;
        }

        public boolean getIsPrefill() {
            return this.isPrefill_;
        }

        public long getLength() {
            return this.length_;
        }

        public static C6100a newBuilder(EnrollmentPhoneNumberChange enrollmentPhoneNumberChange) {
            return DEFAULT_INSTANCE.createBuilder(enrollmentPhoneNumberChange);
        }

        public static EnrollmentPhoneNumberChange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnrollmentPhoneNumberChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EnrollmentPhoneNumberChange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (EnrollmentPhoneNumberChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EnrollmentPhoneNumberChange parseFrom(ByteString byteString) {
            return (EnrollmentPhoneNumberChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EnrollmentPhoneNumberChange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (EnrollmentPhoneNumberChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static EnrollmentPhoneNumberChange parseFrom(byte[] bArr) {
            return (EnrollmentPhoneNumberChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EnrollmentPhoneNumberChange parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (EnrollmentPhoneNumberChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EnrollmentPhoneNumberChange parseFrom(InputStream inputStream) {
            return (EnrollmentPhoneNumberChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnrollmentPhoneNumberChange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnrollmentPhoneNumberChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EnrollmentPhoneNumberChange parseFrom(CodedInputStream codedInputStream) {
            return (EnrollmentPhoneNumberChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EnrollmentPhoneNumberChange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnrollmentPhoneNumberChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class FingerprintDataCollected extends GeneratedMessageLite<FingerprintDataCollected, C6101a> implements MessageLiteOrBuilder {
        private static final FingerprintDataCollected DEFAULT_INSTANCE;
        public static final int FINGERPRINT_OPEN_SOURCE_CONFIDENCE_FIELD_NUMBER = 5;
        public static final int FINGERPRINT_OPEN_SOURCE_DELAY_MS_FIELD_NUMBER = 7;
        public static final int FINGERPRINT_OPEN_SOURCE_LOAD_DELAY_MS_FIELD_NUMBER = 9;
        public static final int FINGERPRINT_OPEN_SOURCE_RUN_DELAY_MS_FIELD_NUMBER = 11;
        public static final int FINGERPRINT_OPEN_SOURCE_VISITOR_ID_FIELD_NUMBER = 4;
        public static final int FINGERPRINT_PRO_CONFIDENCE_FIELD_NUMBER = 3;
        public static final int FINGERPRINT_PRO_DATA_FROM_CACHE_FIELD_NUMBER = 12;
        public static final int FINGERPRINT_PRO_DATA_RAW_FIELD_NUMBER = 13;
        public static final int FINGERPRINT_PRO_DELAY_MS_FIELD_NUMBER = 6;
        public static final int FINGERPRINT_PRO_ERROR_FIELD_NUMBER = 14;
        public static final int FINGERPRINT_PRO_LOAD_DELAY_MS_FIELD_NUMBER = 8;
        public static final int FINGERPRINT_PRO_REQUEST_ID_FIELD_NUMBER = 1;
        public static final int FINGERPRINT_PRO_RUN_DELAY_MS_FIELD_NUMBER = 10;
        public static final int FINGERPRINT_PRO_VISITOR_ID_FIELD_NUMBER = 2;
        private static volatile Parser<FingerprintDataCollected> PARSER;
        private float fingerprintOpenSourceConfidence_;
        private long fingerprintOpenSourceDelayMs_;
        private long fingerprintOpenSourceLoadDelayMs_;
        private long fingerprintOpenSourceRunDelayMs_;
        private float fingerprintProConfidence_;
        private boolean fingerprintProDataFromCache_;
        private long fingerprintProDelayMs_;
        private long fingerprintProLoadDelayMs_;
        private long fingerprintProRunDelayMs_;
        private String fingerprintProRequestId_ = "";
        private String fingerprintProVisitorId_ = "";
        private String fingerprintOpenSourceVisitorId_ = "";
        private String fingerprintProDataRaw_ = "";
        private String fingerprintProError_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$FingerprintDataCollected$a */
        public static final class C6101a extends GeneratedMessageLite.Builder<FingerprintDataCollected, C6101a> implements MessageLiteOrBuilder {
            public C6101a() {
                super(FingerprintDataCollected.DEFAULT_INSTANCE);
            }
        }

        static {
            FingerprintDataCollected fingerprintDataCollected = new FingerprintDataCollected();
            DEFAULT_INSTANCE = fingerprintDataCollected;
            GeneratedMessageLite.registerDefaultInstance(FingerprintDataCollected.class, fingerprintDataCollected);
        }

        private FingerprintDataCollected() {
        }

        private void clearFingerprintOpenSourceConfidence() {
            this.fingerprintOpenSourceConfidence_ = 0.0f;
        }

        private void clearFingerprintOpenSourceDelayMs() {
            this.fingerprintOpenSourceDelayMs_ = 0L;
        }

        private void clearFingerprintOpenSourceLoadDelayMs() {
            this.fingerprintOpenSourceLoadDelayMs_ = 0L;
        }

        private void clearFingerprintOpenSourceRunDelayMs() {
            this.fingerprintOpenSourceRunDelayMs_ = 0L;
        }

        private void clearFingerprintOpenSourceVisitorId() {
            this.fingerprintOpenSourceVisitorId_ = getDefaultInstance().getFingerprintOpenSourceVisitorId();
        }

        private void clearFingerprintProConfidence() {
            this.fingerprintProConfidence_ = 0.0f;
        }

        private void clearFingerprintProDataFromCache() {
            this.fingerprintProDataFromCache_ = false;
        }

        private void clearFingerprintProDataRaw() {
            this.fingerprintProDataRaw_ = getDefaultInstance().getFingerprintProDataRaw();
        }

        private void clearFingerprintProDelayMs() {
            this.fingerprintProDelayMs_ = 0L;
        }

        private void clearFingerprintProError() {
            this.fingerprintProError_ = getDefaultInstance().getFingerprintProError();
        }

        private void clearFingerprintProLoadDelayMs() {
            this.fingerprintProLoadDelayMs_ = 0L;
        }

        private void clearFingerprintProRequestId() {
            this.fingerprintProRequestId_ = getDefaultInstance().getFingerprintProRequestId();
        }

        private void clearFingerprintProRunDelayMs() {
            this.fingerprintProRunDelayMs_ = 0L;
        }

        private void clearFingerprintProVisitorId() {
            this.fingerprintProVisitorId_ = getDefaultInstance().getFingerprintProVisitorId();
        }

        public static FingerprintDataCollected getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6101a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static FingerprintDataCollected parseDelimitedFrom(InputStream inputStream) {
            return (FingerprintDataCollected) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FingerprintDataCollected parseFrom(ByteBuffer byteBuffer) {
            return (FingerprintDataCollected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<FingerprintDataCollected> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setFingerprintOpenSourceConfidence(float f) {
            this.fingerprintOpenSourceConfidence_ = f;
        }

        private void setFingerprintOpenSourceDelayMs(long j) {
            this.fingerprintOpenSourceDelayMs_ = j;
        }

        private void setFingerprintOpenSourceLoadDelayMs(long j) {
            this.fingerprintOpenSourceLoadDelayMs_ = j;
        }

        private void setFingerprintOpenSourceRunDelayMs(long j) {
            this.fingerprintOpenSourceRunDelayMs_ = j;
        }

        private void setFingerprintOpenSourceVisitorId(String str) {
            str.getClass();
            this.fingerprintOpenSourceVisitorId_ = str;
        }

        private void setFingerprintOpenSourceVisitorIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.fingerprintOpenSourceVisitorId_ = byteString.toStringUtf8();
        }

        private void setFingerprintProConfidence(float f) {
            this.fingerprintProConfidence_ = f;
        }

        private void setFingerprintProDataFromCache(boolean z) {
            this.fingerprintProDataFromCache_ = z;
        }

        private void setFingerprintProDataRaw(String str) {
            str.getClass();
            this.fingerprintProDataRaw_ = str;
        }

        private void setFingerprintProDataRawBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.fingerprintProDataRaw_ = byteString.toStringUtf8();
        }

        private void setFingerprintProDelayMs(long j) {
            this.fingerprintProDelayMs_ = j;
        }

        private void setFingerprintProError(String str) {
            str.getClass();
            this.fingerprintProError_ = str;
        }

        private void setFingerprintProErrorBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.fingerprintProError_ = byteString.toStringUtf8();
        }

        private void setFingerprintProLoadDelayMs(long j) {
            this.fingerprintProLoadDelayMs_ = j;
        }

        private void setFingerprintProRequestId(String str) {
            str.getClass();
            this.fingerprintProRequestId_ = str;
        }

        private void setFingerprintProRequestIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.fingerprintProRequestId_ = byteString.toStringUtf8();
        }

        private void setFingerprintProRunDelayMs(long j) {
            this.fingerprintProRunDelayMs_ = j;
        }

        private void setFingerprintProVisitorId(String str) {
            str.getClass();
            this.fingerprintProVisitorId_ = str;
        }

        private void setFingerprintProVisitorIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.fingerprintProVisitorId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new FingerprintDataCollected();
                case 2:
                    return new C6101a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0001\u0004Ȉ\u0005\u0001\u0006\u0002\u0007\u0002\b\u0002\t\u0002\n\u0002\u000b\u0002\f\u0007\rȈ\u000eȈ", new Object[]{"fingerprintProRequestId_", "fingerprintProVisitorId_", "fingerprintProConfidence_", "fingerprintOpenSourceVisitorId_", "fingerprintOpenSourceConfidence_", "fingerprintProDelayMs_", "fingerprintOpenSourceDelayMs_", "fingerprintProLoadDelayMs_", "fingerprintOpenSourceLoadDelayMs_", "fingerprintProRunDelayMs_", "fingerprintOpenSourceRunDelayMs_", "fingerprintProDataFromCache_", "fingerprintProDataRaw_", "fingerprintProError_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FingerprintDataCollected> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (FingerprintDataCollected.class) {
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

        public float getFingerprintOpenSourceConfidence() {
            return this.fingerprintOpenSourceConfidence_;
        }

        public long getFingerprintOpenSourceDelayMs() {
            return this.fingerprintOpenSourceDelayMs_;
        }

        public long getFingerprintOpenSourceLoadDelayMs() {
            return this.fingerprintOpenSourceLoadDelayMs_;
        }

        public long getFingerprintOpenSourceRunDelayMs() {
            return this.fingerprintOpenSourceRunDelayMs_;
        }

        public String getFingerprintOpenSourceVisitorId() {
            return this.fingerprintOpenSourceVisitorId_;
        }

        public ByteString getFingerprintOpenSourceVisitorIdBytes() {
            return ByteString.copyFromUtf8(this.fingerprintOpenSourceVisitorId_);
        }

        public float getFingerprintProConfidence() {
            return this.fingerprintProConfidence_;
        }

        public boolean getFingerprintProDataFromCache() {
            return this.fingerprintProDataFromCache_;
        }

        public String getFingerprintProDataRaw() {
            return this.fingerprintProDataRaw_;
        }

        public ByteString getFingerprintProDataRawBytes() {
            return ByteString.copyFromUtf8(this.fingerprintProDataRaw_);
        }

        public long getFingerprintProDelayMs() {
            return this.fingerprintProDelayMs_;
        }

        public String getFingerprintProError() {
            return this.fingerprintProError_;
        }

        public ByteString getFingerprintProErrorBytes() {
            return ByteString.copyFromUtf8(this.fingerprintProError_);
        }

        public long getFingerprintProLoadDelayMs() {
            return this.fingerprintProLoadDelayMs_;
        }

        public String getFingerprintProRequestId() {
            return this.fingerprintProRequestId_;
        }

        public ByteString getFingerprintProRequestIdBytes() {
            return ByteString.copyFromUtf8(this.fingerprintProRequestId_);
        }

        public long getFingerprintProRunDelayMs() {
            return this.fingerprintProRunDelayMs_;
        }

        public String getFingerprintProVisitorId() {
            return this.fingerprintProVisitorId_;
        }

        public ByteString getFingerprintProVisitorIdBytes() {
            return ByteString.copyFromUtf8(this.fingerprintProVisitorId_);
        }

        public static C6101a newBuilder(FingerprintDataCollected fingerprintDataCollected) {
            return DEFAULT_INSTANCE.createBuilder(fingerprintDataCollected);
        }

        public static FingerprintDataCollected parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FingerprintDataCollected) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FingerprintDataCollected parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (FingerprintDataCollected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static FingerprintDataCollected parseFrom(ByteString byteString) {
            return (FingerprintDataCollected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FingerprintDataCollected parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (FingerprintDataCollected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static FingerprintDataCollected parseFrom(byte[] bArr) {
            return (FingerprintDataCollected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FingerprintDataCollected parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (FingerprintDataCollected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FingerprintDataCollected parseFrom(InputStream inputStream) {
            return (FingerprintDataCollected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FingerprintDataCollected parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FingerprintDataCollected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FingerprintDataCollected parseFrom(CodedInputStream codedInputStream) {
            return (FingerprintDataCollected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FingerprintDataCollected parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FingerprintDataCollected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class FirstPaneLoaded extends GeneratedMessageLite<FirstPaneLoaded, C6102a> implements MessageLiteOrBuilder {
        private static final FirstPaneLoaded DEFAULT_INSTANCE;
        public static final int DELAY_MS_FIELD_NUMBER = 1;
        public static final int DELAY_SINCE_OPEN_STARTED_MS_FIELD_NUMBER = 2;
        public static final int IS_SESSION_CONTINUATION_FIELD_NUMBER = 3;
        public static final int LINK_CREATE_TO_ON_LOAD_DELTA_FIELD_NUMBER = 7;
        public static final int LINK_CREATE_VS_OPEN_DELTA_FIELD_NUMBER = 6;
        public static final int NAVIGATION_TIMING_FIELD_NUMBER = 4;
        private static volatile Parser<FirstPaneLoaded> PARSER = null;
        public static final int RESOURCE_TIMINGS_FIELD_NUMBER = 5;
        private int bitField0_;
        private long delayMs_;
        private long delaySinceOpenStartedMs_;
        private boolean isSessionContinuation_;
        private long linkCreateToOnLoadDelta_;
        private long linkCreateVsOpenDelta_;
        private ClientEventOuterClass$Performance.NavigationTiming navigationTiming_;
        private MapFieldLite<String, ClientEventOuterClass$Performance.ResourceTiming> resourceTimings_ = MapFieldLite.emptyMapField();

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$FirstPaneLoaded$a */
        public static final class C6102a extends GeneratedMessageLite.Builder<FirstPaneLoaded, C6102a> implements MessageLiteOrBuilder {
            public C6102a() {
                super(FirstPaneLoaded.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$FirstPaneLoaded$b */
        public static final class C6103b {

            /* renamed from: a */
            public static final MapEntryLite<String, ClientEventOuterClass$Performance.ResourceTiming> f2040a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, ClientEventOuterClass$Performance.ResourceTiming.getDefaultInstance());
        }

        static {
            FirstPaneLoaded firstPaneLoaded = new FirstPaneLoaded();
            DEFAULT_INSTANCE = firstPaneLoaded;
            GeneratedMessageLite.registerDefaultInstance(FirstPaneLoaded.class, firstPaneLoaded);
        }

        private FirstPaneLoaded() {
        }

        private void clearDelayMs() {
            this.delayMs_ = 0L;
        }

        private void clearDelaySinceOpenStartedMs() {
            this.delaySinceOpenStartedMs_ = 0L;
        }

        private void clearIsSessionContinuation() {
            this.isSessionContinuation_ = false;
        }

        private void clearLinkCreateToOnLoadDelta() {
            this.linkCreateToOnLoadDelta_ = 0L;
        }

        private void clearLinkCreateVsOpenDelta() {
            this.linkCreateVsOpenDelta_ = 0L;
        }

        private void clearNavigationTiming() {
            this.navigationTiming_ = null;
            this.bitField0_ &= -2;
        }

        public static FirstPaneLoaded getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private Map<String, ClientEventOuterClass$Performance.ResourceTiming> getMutableResourceTimingsMap() {
            return internalGetMutableResourceTimings();
        }

        private MapFieldLite<String, ClientEventOuterClass$Performance.ResourceTiming> internalGetMutableResourceTimings() {
            if (!this.resourceTimings_.isMutable()) {
                this.resourceTimings_ = this.resourceTimings_.mutableCopy();
            }
            return this.resourceTimings_;
        }

        private MapFieldLite<String, ClientEventOuterClass$Performance.ResourceTiming> internalGetResourceTimings() {
            return this.resourceTimings_;
        }

        private void mergeNavigationTiming(ClientEventOuterClass$Performance.NavigationTiming navigationTiming) {
            navigationTiming.getClass();
            ClientEventOuterClass$Performance.NavigationTiming navigationTiming2 = this.navigationTiming_;
            if (navigationTiming2 == null || navigationTiming2 == ClientEventOuterClass$Performance.NavigationTiming.getDefaultInstance()) {
                this.navigationTiming_ = navigationTiming;
            } else {
                this.navigationTiming_ = ClientEventOuterClass$Performance.NavigationTiming.newBuilder(this.navigationTiming_).mergeFrom((ClientEventOuterClass$Performance.NavigationTiming.C6179a) navigationTiming).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static C6102a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static FirstPaneLoaded parseDelimitedFrom(InputStream inputStream) {
            return (FirstPaneLoaded) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FirstPaneLoaded parseFrom(ByteBuffer byteBuffer) {
            return (FirstPaneLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<FirstPaneLoaded> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDelayMs(long j) {
            this.delayMs_ = j;
        }

        private void setDelaySinceOpenStartedMs(long j) {
            this.delaySinceOpenStartedMs_ = j;
        }

        private void setIsSessionContinuation(boolean z) {
            this.isSessionContinuation_ = z;
        }

        private void setLinkCreateToOnLoadDelta(long j) {
            this.linkCreateToOnLoadDelta_ = j;
        }

        private void setLinkCreateVsOpenDelta(long j) {
            this.linkCreateVsOpenDelta_ = j;
        }

        private void setNavigationTiming(ClientEventOuterClass$Performance.NavigationTiming navigationTiming) {
            navigationTiming.getClass();
            this.navigationTiming_ = navigationTiming;
            this.bitField0_ |= 1;
        }

        public boolean containsResourceTimings(String str) {
            str.getClass();
            return internalGetResourceTimings().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new FirstPaneLoaded();
                case 2:
                    return new C6102a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0001\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0007\u0004ဉ\u0000\u00052\u0006\u0002\u0007\u0002", new Object[]{"bitField0_", "delayMs_", "delaySinceOpenStartedMs_", "isSessionContinuation_", "navigationTiming_", "resourceTimings_", C6103b.f2040a, "linkCreateVsOpenDelta_", "linkCreateToOnLoadDelta_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FirstPaneLoaded> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (FirstPaneLoaded.class) {
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

        public long getDelayMs() {
            return this.delayMs_;
        }

        public long getDelaySinceOpenStartedMs() {
            return this.delaySinceOpenStartedMs_;
        }

        public boolean getIsSessionContinuation() {
            return this.isSessionContinuation_;
        }

        public long getLinkCreateToOnLoadDelta() {
            return this.linkCreateToOnLoadDelta_;
        }

        public long getLinkCreateVsOpenDelta() {
            return this.linkCreateVsOpenDelta_;
        }

        public ClientEventOuterClass$Performance.NavigationTiming getNavigationTiming() {
            ClientEventOuterClass$Performance.NavigationTiming navigationTiming = this.navigationTiming_;
            return navigationTiming == null ? ClientEventOuterClass$Performance.NavigationTiming.getDefaultInstance() : navigationTiming;
        }

        @Deprecated
        public Map<String, ClientEventOuterClass$Performance.ResourceTiming> getResourceTimings() {
            return getResourceTimingsMap();
        }

        public int getResourceTimingsCount() {
            return internalGetResourceTimings().size();
        }

        public Map<String, ClientEventOuterClass$Performance.ResourceTiming> getResourceTimingsMap() {
            return Collections.unmodifiableMap(internalGetResourceTimings());
        }

        public ClientEventOuterClass$Performance.ResourceTiming getResourceTimingsOrDefault(String str, ClientEventOuterClass$Performance.ResourceTiming resourceTiming) {
            str.getClass();
            MapFieldLite<String, ClientEventOuterClass$Performance.ResourceTiming> mapFieldLiteInternalGetResourceTimings = internalGetResourceTimings();
            return mapFieldLiteInternalGetResourceTimings.containsKey(str) ? mapFieldLiteInternalGetResourceTimings.get(str) : resourceTiming;
        }

        public ClientEventOuterClass$Performance.ResourceTiming getResourceTimingsOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, ClientEventOuterClass$Performance.ResourceTiming> mapFieldLiteInternalGetResourceTimings = internalGetResourceTimings();
            if (mapFieldLiteInternalGetResourceTimings.containsKey(str)) {
                return mapFieldLiteInternalGetResourceTimings.get(str);
            }
            throw new IllegalArgumentException();
        }

        public boolean hasNavigationTiming() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C6102a newBuilder(FirstPaneLoaded firstPaneLoaded) {
            return DEFAULT_INSTANCE.createBuilder(firstPaneLoaded);
        }

        public static FirstPaneLoaded parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FirstPaneLoaded) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FirstPaneLoaded parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (FirstPaneLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static FirstPaneLoaded parseFrom(ByteString byteString) {
            return (FirstPaneLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FirstPaneLoaded parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (FirstPaneLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static FirstPaneLoaded parseFrom(byte[] bArr) {
            return (FirstPaneLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FirstPaneLoaded parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (FirstPaneLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FirstPaneLoaded parseFrom(InputStream inputStream) {
            return (FirstPaneLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FirstPaneLoaded parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FirstPaneLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FirstPaneLoaded parseFrom(CodedInputStream codedInputStream) {
            return (FirstPaneLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FirstPaneLoaded parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FirstPaneLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class FocusSearch extends GeneratedMessageLite<FocusSearch, C6104a> implements MessageLiteOrBuilder {
        private static final FocusSearch DEFAULT_INSTANCE;
        private static volatile Parser<FocusSearch> PARSER;

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$FocusSearch$a */
        public static final class C6104a extends GeneratedMessageLite.Builder<FocusSearch, C6104a> implements MessageLiteOrBuilder {
            public C6104a() {
                super(FocusSearch.DEFAULT_INSTANCE);
            }
        }

        static {
            FocusSearch focusSearch = new FocusSearch();
            DEFAULT_INSTANCE = focusSearch;
            GeneratedMessageLite.registerDefaultInstance(FocusSearch.class, focusSearch);
        }

        private FocusSearch() {
        }

        public static FocusSearch getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6104a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static FocusSearch parseDelimitedFrom(InputStream inputStream) {
            return (FocusSearch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FocusSearch parseFrom(ByteBuffer byteBuffer) {
            return (FocusSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<FocusSearch> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new FocusSearch();
                case 2:
                    return new C6104a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FocusSearch> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (FocusSearch.class) {
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

        public static C6104a newBuilder(FocusSearch focusSearch) {
            return DEFAULT_INSTANCE.createBuilder(focusSearch);
        }

        public static FocusSearch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FocusSearch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FocusSearch parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (FocusSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static FocusSearch parseFrom(ByteString byteString) {
            return (FocusSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FocusSearch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (FocusSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static FocusSearch parseFrom(byte[] bArr) {
            return (FocusSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FocusSearch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (FocusSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FocusSearch parseFrom(InputStream inputStream) {
            return (FocusSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FocusSearch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FocusSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FocusSearch parseFrom(CodedInputStream codedInputStream) {
            return (FocusSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FocusSearch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FocusSearch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class HostedLinkSecurityModalExit extends GeneratedMessageLite<HostedLinkSecurityModalExit, C6105a> implements MessageLiteOrBuilder {
        public static final int CURRENT_PANE_ID_FIELD_NUMBER = 1;
        private static final HostedLinkSecurityModalExit DEFAULT_INSTANCE;
        private static volatile Parser<HostedLinkSecurityModalExit> PARSER;
        private String currentPaneId_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$HostedLinkSecurityModalExit$a */
        public static final class C6105a extends GeneratedMessageLite.Builder<HostedLinkSecurityModalExit, C6105a> implements MessageLiteOrBuilder {
            public C6105a() {
                super(HostedLinkSecurityModalExit.DEFAULT_INSTANCE);
            }
        }

        static {
            HostedLinkSecurityModalExit hostedLinkSecurityModalExit = new HostedLinkSecurityModalExit();
            DEFAULT_INSTANCE = hostedLinkSecurityModalExit;
            GeneratedMessageLite.registerDefaultInstance(HostedLinkSecurityModalExit.class, hostedLinkSecurityModalExit);
        }

        private HostedLinkSecurityModalExit() {
        }

        private void clearCurrentPaneId() {
            this.currentPaneId_ = getDefaultInstance().getCurrentPaneId();
        }

        public static HostedLinkSecurityModalExit getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6105a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static HostedLinkSecurityModalExit parseDelimitedFrom(InputStream inputStream) {
            return (HostedLinkSecurityModalExit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HostedLinkSecurityModalExit parseFrom(ByteBuffer byteBuffer) {
            return (HostedLinkSecurityModalExit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<HostedLinkSecurityModalExit> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCurrentPaneId(String str) {
            str.getClass();
            this.currentPaneId_ = str;
        }

        private void setCurrentPaneIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.currentPaneId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new HostedLinkSecurityModalExit();
                case 2:
                    return new C6105a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"currentPaneId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<HostedLinkSecurityModalExit> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (HostedLinkSecurityModalExit.class) {
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

        public String getCurrentPaneId() {
            return this.currentPaneId_;
        }

        public ByteString getCurrentPaneIdBytes() {
            return ByteString.copyFromUtf8(this.currentPaneId_);
        }

        public static C6105a newBuilder(HostedLinkSecurityModalExit hostedLinkSecurityModalExit) {
            return DEFAULT_INSTANCE.createBuilder(hostedLinkSecurityModalExit);
        }

        public static HostedLinkSecurityModalExit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HostedLinkSecurityModalExit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HostedLinkSecurityModalExit parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (HostedLinkSecurityModalExit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static HostedLinkSecurityModalExit parseFrom(ByteString byteString) {
            return (HostedLinkSecurityModalExit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static HostedLinkSecurityModalExit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (HostedLinkSecurityModalExit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static HostedLinkSecurityModalExit parseFrom(byte[] bArr) {
            return (HostedLinkSecurityModalExit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HostedLinkSecurityModalExit parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (HostedLinkSecurityModalExit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static HostedLinkSecurityModalExit parseFrom(InputStream inputStream) {
            return (HostedLinkSecurityModalExit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HostedLinkSecurityModalExit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HostedLinkSecurityModalExit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HostedLinkSecurityModalExit parseFrom(CodedInputStream codedInputStream) {
            return (HostedLinkSecurityModalExit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static HostedLinkSecurityModalExit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HostedLinkSecurityModalExit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class IncomeWrappingCompanyMetadata extends GeneratedMessageLite<IncomeWrappingCompanyMetadata, C6106a> implements MessageLiteOrBuilder {
        public static final int COMPANY_FIELD_NUMBER = 1;
        public static final int COMPANY_ID_FIELD_NUMBER = 2;
        private static final IncomeWrappingCompanyMetadata DEFAULT_INSTANCE;
        private static volatile Parser<IncomeWrappingCompanyMetadata> PARSER = null;
        public static final int PAYROLL_PROVIDER_FIELD_NUMBER = 3;
        private String company_ = "";
        private String companyId_ = "";
        private String payrollProvider_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$IncomeWrappingCompanyMetadata$a */
        public static final class C6106a extends GeneratedMessageLite.Builder<IncomeWrappingCompanyMetadata, C6106a> implements MessageLiteOrBuilder {
            public C6106a() {
                super(IncomeWrappingCompanyMetadata.DEFAULT_INSTANCE);
            }
        }

        static {
            IncomeWrappingCompanyMetadata incomeWrappingCompanyMetadata = new IncomeWrappingCompanyMetadata();
            DEFAULT_INSTANCE = incomeWrappingCompanyMetadata;
            GeneratedMessageLite.registerDefaultInstance(IncomeWrappingCompanyMetadata.class, incomeWrappingCompanyMetadata);
        }

        private IncomeWrappingCompanyMetadata() {
        }

        private void clearCompany() {
            this.company_ = getDefaultInstance().getCompany();
        }

        private void clearCompanyId() {
            this.companyId_ = getDefaultInstance().getCompanyId();
        }

        private void clearPayrollProvider() {
            this.payrollProvider_ = getDefaultInstance().getPayrollProvider();
        }

        public static IncomeWrappingCompanyMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6106a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IncomeWrappingCompanyMetadata parseDelimitedFrom(InputStream inputStream) {
            return (IncomeWrappingCompanyMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IncomeWrappingCompanyMetadata parseFrom(ByteBuffer byteBuffer) {
            return (IncomeWrappingCompanyMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<IncomeWrappingCompanyMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCompany(String str) {
            str.getClass();
            this.company_ = str;
        }

        private void setCompanyBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.company_ = byteString.toStringUtf8();
        }

        private void setCompanyId(String str) {
            str.getClass();
            this.companyId_ = str;
        }

        private void setCompanyIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.companyId_ = byteString.toStringUtf8();
        }

        private void setPayrollProvider(String str) {
            str.getClass();
            this.payrollProvider_ = str;
        }

        private void setPayrollProviderBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.payrollProvider_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new IncomeWrappingCompanyMetadata();
                case 2:
                    return new C6106a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"company_", "companyId_", "payrollProvider_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<IncomeWrappingCompanyMetadata> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (IncomeWrappingCompanyMetadata.class) {
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

        public String getCompany() {
            return this.company_;
        }

        public ByteString getCompanyBytes() {
            return ByteString.copyFromUtf8(this.company_);
        }

        public String getCompanyId() {
            return this.companyId_;
        }

        public ByteString getCompanyIdBytes() {
            return ByteString.copyFromUtf8(this.companyId_);
        }

        public String getPayrollProvider() {
            return this.payrollProvider_;
        }

        public ByteString getPayrollProviderBytes() {
            return ByteString.copyFromUtf8(this.payrollProvider_);
        }

        public static C6106a newBuilder(IncomeWrappingCompanyMetadata incomeWrappingCompanyMetadata) {
            return DEFAULT_INSTANCE.createBuilder(incomeWrappingCompanyMetadata);
        }

        public static IncomeWrappingCompanyMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingCompanyMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static IncomeWrappingCompanyMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingCompanyMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static IncomeWrappingCompanyMetadata parseFrom(ByteString byteString) {
            return (IncomeWrappingCompanyMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static IncomeWrappingCompanyMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingCompanyMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static IncomeWrappingCompanyMetadata parseFrom(byte[] bArr) {
            return (IncomeWrappingCompanyMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IncomeWrappingCompanyMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingCompanyMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static IncomeWrappingCompanyMetadata parseFrom(InputStream inputStream) {
            return (IncomeWrappingCompanyMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IncomeWrappingCompanyMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingCompanyMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static IncomeWrappingCompanyMetadata parseFrom(CodedInputStream codedInputStream) {
            return (IncomeWrappingCompanyMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static IncomeWrappingCompanyMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingCompanyMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class IncomeWrappingPartnerError extends GeneratedMessageLite<IncomeWrappingPartnerError, C6107a> implements MessageLiteOrBuilder {
        public static final int CODE_FIELD_NUMBER = 3;
        private static final IncomeWrappingPartnerError DEFAULT_INSTANCE;
        private static volatile Parser<IncomeWrappingPartnerError> PARSER = null;
        public static final int PARTNER_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 2;
        private String partner_ = "";
        private String type_ = "";
        private String code_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$IncomeWrappingPartnerError$a */
        public static final class C6107a extends GeneratedMessageLite.Builder<IncomeWrappingPartnerError, C6107a> implements MessageLiteOrBuilder {
            public C6107a() {
                super(IncomeWrappingPartnerError.DEFAULT_INSTANCE);
            }
        }

        static {
            IncomeWrappingPartnerError incomeWrappingPartnerError = new IncomeWrappingPartnerError();
            DEFAULT_INSTANCE = incomeWrappingPartnerError;
            GeneratedMessageLite.registerDefaultInstance(IncomeWrappingPartnerError.class, incomeWrappingPartnerError);
        }

        private IncomeWrappingPartnerError() {
        }

        private void clearCode() {
            this.code_ = getDefaultInstance().getCode();
        }

        private void clearPartner() {
            this.partner_ = getDefaultInstance().getPartner();
        }

        private void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        public static IncomeWrappingPartnerError getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6107a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IncomeWrappingPartnerError parseDelimitedFrom(InputStream inputStream) {
            return (IncomeWrappingPartnerError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IncomeWrappingPartnerError parseFrom(ByteBuffer byteBuffer) {
            return (IncomeWrappingPartnerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<IncomeWrappingPartnerError> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCode(String str) {
            str.getClass();
            this.code_ = str;
        }

        private void setCodeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.code_ = byteString.toStringUtf8();
        }

        private void setPartner(String str) {
            str.getClass();
            this.partner_ = str;
        }

        private void setPartnerBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.partner_ = byteString.toStringUtf8();
        }

        private void setType(String str) {
            str.getClass();
            this.type_ = str;
        }

        private void setTypeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.type_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new IncomeWrappingPartnerError();
                case 2:
                    return new C6107a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"partner_", "type_", "code_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<IncomeWrappingPartnerError> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (IncomeWrappingPartnerError.class) {
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

        public String getCode() {
            return this.code_;
        }

        public ByteString getCodeBytes() {
            return ByteString.copyFromUtf8(this.code_);
        }

        public String getPartner() {
            return this.partner_;
        }

        public ByteString getPartnerBytes() {
            return ByteString.copyFromUtf8(this.partner_);
        }

        public String getType() {
            return this.type_;
        }

        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        public static C6107a newBuilder(IncomeWrappingPartnerError incomeWrappingPartnerError) {
            return DEFAULT_INSTANCE.createBuilder(incomeWrappingPartnerError);
        }

        public static IncomeWrappingPartnerError parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingPartnerError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static IncomeWrappingPartnerError parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingPartnerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static IncomeWrappingPartnerError parseFrom(ByteString byteString) {
            return (IncomeWrappingPartnerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static IncomeWrappingPartnerError parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingPartnerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static IncomeWrappingPartnerError parseFrom(byte[] bArr) {
            return (IncomeWrappingPartnerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IncomeWrappingPartnerError parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingPartnerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static IncomeWrappingPartnerError parseFrom(InputStream inputStream) {
            return (IncomeWrappingPartnerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IncomeWrappingPartnerError parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingPartnerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static IncomeWrappingPartnerError parseFrom(CodedInputStream codedInputStream) {
            return (IncomeWrappingPartnerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static IncomeWrappingPartnerError parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingPartnerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class IncomeWrappingPartnerIFrameRendered extends GeneratedMessageLite<IncomeWrappingPartnerIFrameRendered, C6108a> implements MessageLiteOrBuilder {
        private static final IncomeWrappingPartnerIFrameRendered DEFAULT_INSTANCE;
        private static volatile Parser<IncomeWrappingPartnerIFrameRendered> PARSER = null;
        public static final int PARTNER_FIELD_NUMBER = 1;
        private String partner_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$IncomeWrappingPartnerIFrameRendered$a */
        public static final class C6108a extends GeneratedMessageLite.Builder<IncomeWrappingPartnerIFrameRendered, C6108a> implements MessageLiteOrBuilder {
            public C6108a() {
                super(IncomeWrappingPartnerIFrameRendered.DEFAULT_INSTANCE);
            }
        }

        static {
            IncomeWrappingPartnerIFrameRendered incomeWrappingPartnerIFrameRendered = new IncomeWrappingPartnerIFrameRendered();
            DEFAULT_INSTANCE = incomeWrappingPartnerIFrameRendered;
            GeneratedMessageLite.registerDefaultInstance(IncomeWrappingPartnerIFrameRendered.class, incomeWrappingPartnerIFrameRendered);
        }

        private IncomeWrappingPartnerIFrameRendered() {
        }

        private void clearPartner() {
            this.partner_ = getDefaultInstance().getPartner();
        }

        public static IncomeWrappingPartnerIFrameRendered getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6108a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IncomeWrappingPartnerIFrameRendered parseDelimitedFrom(InputStream inputStream) {
            return (IncomeWrappingPartnerIFrameRendered) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IncomeWrappingPartnerIFrameRendered parseFrom(ByteBuffer byteBuffer) {
            return (IncomeWrappingPartnerIFrameRendered) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<IncomeWrappingPartnerIFrameRendered> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setPartner(String str) {
            str.getClass();
            this.partner_ = str;
        }

        private void setPartnerBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.partner_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new IncomeWrappingPartnerIFrameRendered();
                case 2:
                    return new C6108a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"partner_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<IncomeWrappingPartnerIFrameRendered> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (IncomeWrappingPartnerIFrameRendered.class) {
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

        public String getPartner() {
            return this.partner_;
        }

        public ByteString getPartnerBytes() {
            return ByteString.copyFromUtf8(this.partner_);
        }

        public static C6108a newBuilder(IncomeWrappingPartnerIFrameRendered incomeWrappingPartnerIFrameRendered) {
            return DEFAULT_INSTANCE.createBuilder(incomeWrappingPartnerIFrameRendered);
        }

        public static IncomeWrappingPartnerIFrameRendered parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingPartnerIFrameRendered) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static IncomeWrappingPartnerIFrameRendered parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingPartnerIFrameRendered) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static IncomeWrappingPartnerIFrameRendered parseFrom(ByteString byteString) {
            return (IncomeWrappingPartnerIFrameRendered) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static IncomeWrappingPartnerIFrameRendered parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingPartnerIFrameRendered) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static IncomeWrappingPartnerIFrameRendered parseFrom(byte[] bArr) {
            return (IncomeWrappingPartnerIFrameRendered) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IncomeWrappingPartnerIFrameRendered parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingPartnerIFrameRendered) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static IncomeWrappingPartnerIFrameRendered parseFrom(InputStream inputStream) {
            return (IncomeWrappingPartnerIFrameRendered) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IncomeWrappingPartnerIFrameRendered parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingPartnerIFrameRendered) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static IncomeWrappingPartnerIFrameRendered parseFrom(CodedInputStream codedInputStream) {
            return (IncomeWrappingPartnerIFrameRendered) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static IncomeWrappingPartnerIFrameRendered parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingPartnerIFrameRendered) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class IncomeWrappingPartnerMetadata extends GeneratedMessageLite<IncomeWrappingPartnerMetadata, C6109a> implements MessageLiteOrBuilder {
        private static final IncomeWrappingPartnerMetadata DEFAULT_INSTANCE;
        public static final int LANGUAGE_FIELD_NUMBER = 2;
        private static volatile Parser<IncomeWrappingPartnerMetadata> PARSER = null;
        public static final int PARTNER_FIELD_NUMBER = 1;
        public static final int PRODUCT_FIELD_NUMBER = 3;
        private String partner_ = "";
        private String language_ = "";
        private String product_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$IncomeWrappingPartnerMetadata$a */
        public static final class C6109a extends GeneratedMessageLite.Builder<IncomeWrappingPartnerMetadata, C6109a> implements MessageLiteOrBuilder {
            public C6109a() {
                super(IncomeWrappingPartnerMetadata.DEFAULT_INSTANCE);
            }
        }

        static {
            IncomeWrappingPartnerMetadata incomeWrappingPartnerMetadata = new IncomeWrappingPartnerMetadata();
            DEFAULT_INSTANCE = incomeWrappingPartnerMetadata;
            GeneratedMessageLite.registerDefaultInstance(IncomeWrappingPartnerMetadata.class, incomeWrappingPartnerMetadata);
        }

        private IncomeWrappingPartnerMetadata() {
        }

        private void clearLanguage() {
            this.language_ = getDefaultInstance().getLanguage();
        }

        private void clearPartner() {
            this.partner_ = getDefaultInstance().getPartner();
        }

        private void clearProduct() {
            this.product_ = getDefaultInstance().getProduct();
        }

        public static IncomeWrappingPartnerMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6109a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IncomeWrappingPartnerMetadata parseDelimitedFrom(InputStream inputStream) {
            return (IncomeWrappingPartnerMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IncomeWrappingPartnerMetadata parseFrom(ByteBuffer byteBuffer) {
            return (IncomeWrappingPartnerMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<IncomeWrappingPartnerMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setLanguage(String str) {
            str.getClass();
            this.language_ = str;
        }

        private void setLanguageBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.language_ = byteString.toStringUtf8();
        }

        private void setPartner(String str) {
            str.getClass();
            this.partner_ = str;
        }

        private void setPartnerBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.partner_ = byteString.toStringUtf8();
        }

        private void setProduct(String str) {
            str.getClass();
            this.product_ = str;
        }

        private void setProductBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.product_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new IncomeWrappingPartnerMetadata();
                case 2:
                    return new C6109a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"partner_", "language_", "product_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<IncomeWrappingPartnerMetadata> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (IncomeWrappingPartnerMetadata.class) {
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

        public String getLanguage() {
            return this.language_;
        }

        public ByteString getLanguageBytes() {
            return ByteString.copyFromUtf8(this.language_);
        }

        public String getPartner() {
            return this.partner_;
        }

        public ByteString getPartnerBytes() {
            return ByteString.copyFromUtf8(this.partner_);
        }

        public String getProduct() {
            return this.product_;
        }

        public ByteString getProductBytes() {
            return ByteString.copyFromUtf8(this.product_);
        }

        public static C6109a newBuilder(IncomeWrappingPartnerMetadata incomeWrappingPartnerMetadata) {
            return DEFAULT_INSTANCE.createBuilder(incomeWrappingPartnerMetadata);
        }

        public static IncomeWrappingPartnerMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingPartnerMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static IncomeWrappingPartnerMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingPartnerMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static IncomeWrappingPartnerMetadata parseFrom(ByteString byteString) {
            return (IncomeWrappingPartnerMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static IncomeWrappingPartnerMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingPartnerMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static IncomeWrappingPartnerMetadata parseFrom(byte[] bArr) {
            return (IncomeWrappingPartnerMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IncomeWrappingPartnerMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingPartnerMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static IncomeWrappingPartnerMetadata parseFrom(InputStream inputStream) {
            return (IncomeWrappingPartnerMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IncomeWrappingPartnerMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingPartnerMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static IncomeWrappingPartnerMetadata parseFrom(CodedInputStream codedInputStream) {
            return (IncomeWrappingPartnerMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static IncomeWrappingPartnerMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingPartnerMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class IncomeWrappingUnspecifiedInteraction extends GeneratedMessageLite<IncomeWrappingUnspecifiedInteraction, C6110a> implements MessageLiteOrBuilder {
        private static final IncomeWrappingUnspecifiedInteraction DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile Parser<IncomeWrappingUnspecifiedInteraction> PARSER = null;
        public static final int PARTNER_FIELD_NUMBER = 1;
        private String partner_ = "";
        private String name_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$IncomeWrappingUnspecifiedInteraction$a */
        public static final class C6110a extends GeneratedMessageLite.Builder<IncomeWrappingUnspecifiedInteraction, C6110a> implements MessageLiteOrBuilder {
            public C6110a() {
                super(IncomeWrappingUnspecifiedInteraction.DEFAULT_INSTANCE);
            }
        }

        static {
            IncomeWrappingUnspecifiedInteraction incomeWrappingUnspecifiedInteraction = new IncomeWrappingUnspecifiedInteraction();
            DEFAULT_INSTANCE = incomeWrappingUnspecifiedInteraction;
            GeneratedMessageLite.registerDefaultInstance(IncomeWrappingUnspecifiedInteraction.class, incomeWrappingUnspecifiedInteraction);
        }

        private IncomeWrappingUnspecifiedInteraction() {
        }

        private void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        private void clearPartner() {
            this.partner_ = getDefaultInstance().getPartner();
        }

        public static IncomeWrappingUnspecifiedInteraction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6110a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IncomeWrappingUnspecifiedInteraction parseDelimitedFrom(InputStream inputStream) {
            return (IncomeWrappingUnspecifiedInteraction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IncomeWrappingUnspecifiedInteraction parseFrom(ByteBuffer byteBuffer) {
            return (IncomeWrappingUnspecifiedInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<IncomeWrappingUnspecifiedInteraction> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        private void setNameBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        private void setPartner(String str) {
            str.getClass();
            this.partner_ = str;
        }

        private void setPartnerBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.partner_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new IncomeWrappingUnspecifiedInteraction();
                case 2:
                    return new C6110a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"partner_", "name_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<IncomeWrappingUnspecifiedInteraction> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (IncomeWrappingUnspecifiedInteraction.class) {
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

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        public String getPartner() {
            return this.partner_;
        }

        public ByteString getPartnerBytes() {
            return ByteString.copyFromUtf8(this.partner_);
        }

        public static C6110a newBuilder(IncomeWrappingUnspecifiedInteraction incomeWrappingUnspecifiedInteraction) {
            return DEFAULT_INSTANCE.createBuilder(incomeWrappingUnspecifiedInteraction);
        }

        public static IncomeWrappingUnspecifiedInteraction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingUnspecifiedInteraction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static IncomeWrappingUnspecifiedInteraction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingUnspecifiedInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static IncomeWrappingUnspecifiedInteraction parseFrom(ByteString byteString) {
            return (IncomeWrappingUnspecifiedInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static IncomeWrappingUnspecifiedInteraction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingUnspecifiedInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static IncomeWrappingUnspecifiedInteraction parseFrom(byte[] bArr) {
            return (IncomeWrappingUnspecifiedInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IncomeWrappingUnspecifiedInteraction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingUnspecifiedInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static IncomeWrappingUnspecifiedInteraction parseFrom(InputStream inputStream) {
            return (IncomeWrappingUnspecifiedInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IncomeWrappingUnspecifiedInteraction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingUnspecifiedInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static IncomeWrappingUnspecifiedInteraction parseFrom(CodedInputStream codedInputStream) {
            return (IncomeWrappingUnspecifiedInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static IncomeWrappingUnspecifiedInteraction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncomeWrappingUnspecifiedInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LargestContentfulPaint extends GeneratedMessageLite<LargestContentfulPaint, C6111a> implements MessageLiteOrBuilder {
        private static final LargestContentfulPaint DEFAULT_INSTANCE;
        public static final int DELAY_MS_FIELD_NUMBER = 1;
        private static volatile Parser<LargestContentfulPaint> PARSER;
        private long delayMs_;

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$LargestContentfulPaint$a */
        public static final class C6111a extends GeneratedMessageLite.Builder<LargestContentfulPaint, C6111a> implements MessageLiteOrBuilder {
            public C6111a() {
                super(LargestContentfulPaint.DEFAULT_INSTANCE);
            }
        }

        static {
            LargestContentfulPaint largestContentfulPaint = new LargestContentfulPaint();
            DEFAULT_INSTANCE = largestContentfulPaint;
            GeneratedMessageLite.registerDefaultInstance(LargestContentfulPaint.class, largestContentfulPaint);
        }

        private LargestContentfulPaint() {
        }

        private void clearDelayMs() {
            this.delayMs_ = 0L;
        }

        public static LargestContentfulPaint getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6111a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static LargestContentfulPaint parseDelimitedFrom(InputStream inputStream) {
            return (LargestContentfulPaint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LargestContentfulPaint parseFrom(ByteBuffer byteBuffer) {
            return (LargestContentfulPaint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<LargestContentfulPaint> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDelayMs(long j) {
            this.delayMs_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new LargestContentfulPaint();
                case 2:
                    return new C6111a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"delayMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<LargestContentfulPaint> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (LargestContentfulPaint.class) {
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

        public long getDelayMs() {
            return this.delayMs_;
        }

        public static C6111a newBuilder(LargestContentfulPaint largestContentfulPaint) {
            return DEFAULT_INSTANCE.createBuilder(largestContentfulPaint);
        }

        public static LargestContentfulPaint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LargestContentfulPaint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LargestContentfulPaint parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (LargestContentfulPaint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static LargestContentfulPaint parseFrom(ByteString byteString) {
            return (LargestContentfulPaint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static LargestContentfulPaint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (LargestContentfulPaint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static LargestContentfulPaint parseFrom(byte[] bArr) {
            return (LargestContentfulPaint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LargestContentfulPaint parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (LargestContentfulPaint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static LargestContentfulPaint parseFrom(InputStream inputStream) {
            return (LargestContentfulPaint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LargestContentfulPaint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LargestContentfulPaint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LargestContentfulPaint parseFrom(CodedInputStream codedInputStream) {
            return (LargestContentfulPaint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static LargestContentfulPaint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LargestContentfulPaint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LinkSdkOpen extends GeneratedMessageLite<LinkSdkOpen, C6112a> implements MessageLiteOrBuilder {
        private static final LinkSdkOpen DEFAULT_INSTANCE;
        public static final int INSTITUTION_ID_FIELD_NUMBER = 3;
        public static final int LINK_OPEN_ID_FIELD_NUMBER = 2;
        private static volatile Parser<LinkSdkOpen> PARSER = null;
        public static final int SDK_METADATA_FIELD_NUMBER = 1;
        private int bitField0_;
        private Configuration$SDKMetadata sdkMetadata_;
        private String linkOpenId_ = "";
        private String institutionId_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$LinkSdkOpen$a */
        public static final class C6112a extends GeneratedMessageLite.Builder<LinkSdkOpen, C6112a> implements MessageLiteOrBuilder {
            public C6112a() {
                super(LinkSdkOpen.DEFAULT_INSTANCE);
            }

            /* renamed from: a */
            public final C6112a m1395a(String str) {
                copyOnWrite();
                ((LinkSdkOpen) this.instance).setLinkOpenId(str);
                return this;
            }
        }

        static {
            LinkSdkOpen linkSdkOpen = new LinkSdkOpen();
            DEFAULT_INSTANCE = linkSdkOpen;
            GeneratedMessageLite.registerDefaultInstance(LinkSdkOpen.class, linkSdkOpen);
        }

        private LinkSdkOpen() {
        }

        private void clearInstitutionId() {
            this.institutionId_ = getDefaultInstance().getInstitutionId();
        }

        private void clearLinkOpenId() {
            this.linkOpenId_ = getDefaultInstance().getLinkOpenId();
        }

        private void clearSdkMetadata() {
            this.sdkMetadata_ = null;
            this.bitField0_ &= -2;
        }

        public static LinkSdkOpen getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeSdkMetadata(Configuration$SDKMetadata configuration$SDKMetadata) {
            configuration$SDKMetadata.getClass();
            Configuration$SDKMetadata configuration$SDKMetadata2 = this.sdkMetadata_;
            if (configuration$SDKMetadata2 == null || configuration$SDKMetadata2 == Configuration$SDKMetadata.getDefaultInstance()) {
                this.sdkMetadata_ = configuration$SDKMetadata;
            } else {
                this.sdkMetadata_ = Configuration$SDKMetadata.newBuilder(this.sdkMetadata_).mergeFrom((Configuration$SDKMetadata.C6985a) configuration$SDKMetadata).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static C6112a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static LinkSdkOpen parseDelimitedFrom(InputStream inputStream) {
            return (LinkSdkOpen) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LinkSdkOpen parseFrom(ByteBuffer byteBuffer) {
            return (LinkSdkOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<LinkSdkOpen> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setInstitutionId(String str) {
            str.getClass();
            this.institutionId_ = str;
        }

        private void setInstitutionIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.institutionId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLinkOpenId(String str) {
            str.getClass();
            this.linkOpenId_ = str;
        }

        private void setLinkOpenIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.linkOpenId_ = byteString.toStringUtf8();
        }

        private void setSdkMetadata(Configuration$SDKMetadata configuration$SDKMetadata) {
            configuration$SDKMetadata.getClass();
            this.sdkMetadata_ = configuration$SDKMetadata;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new LinkSdkOpen();
                case 2:
                    return new C6112a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"bitField0_", "sdkMetadata_", "linkOpenId_", "institutionId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<LinkSdkOpen> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (LinkSdkOpen.class) {
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

        public String getInstitutionId() {
            return this.institutionId_;
        }

        public ByteString getInstitutionIdBytes() {
            return ByteString.copyFromUtf8(this.institutionId_);
        }

        public String getLinkOpenId() {
            return this.linkOpenId_;
        }

        public ByteString getLinkOpenIdBytes() {
            return ByteString.copyFromUtf8(this.linkOpenId_);
        }

        public Configuration$SDKMetadata getSdkMetadata() {
            Configuration$SDKMetadata configuration$SDKMetadata = this.sdkMetadata_;
            return configuration$SDKMetadata == null ? Configuration$SDKMetadata.getDefaultInstance() : configuration$SDKMetadata;
        }

        public boolean hasSdkMetadata() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C6112a newBuilder(LinkSdkOpen linkSdkOpen) {
            return DEFAULT_INSTANCE.createBuilder(linkSdkOpen);
        }

        public static LinkSdkOpen parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LinkSdkOpen) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LinkSdkOpen parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (LinkSdkOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static LinkSdkOpen parseFrom(ByteString byteString) {
            return (LinkSdkOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static LinkSdkOpen parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (LinkSdkOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static LinkSdkOpen parseFrom(byte[] bArr) {
            return (LinkSdkOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LinkSdkOpen parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (LinkSdkOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static LinkSdkOpen parseFrom(InputStream inputStream) {
            return (LinkSdkOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LinkSdkOpen parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LinkSdkOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LinkSdkOpen parseFrom(CodedInputStream codedInputStream) {
            return (LinkSdkOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static LinkSdkOpen parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LinkSdkOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class NoNetworkConnection extends GeneratedMessageLite<NoNetworkConnection, C6113a> implements MessageLiteOrBuilder {
        private static final NoNetworkConnection DEFAULT_INSTANCE;
        private static volatile Parser<NoNetworkConnection> PARSER;

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$NoNetworkConnection$a */
        public static final class C6113a extends GeneratedMessageLite.Builder<NoNetworkConnection, C6113a> implements MessageLiteOrBuilder {
            public C6113a() {
                super(NoNetworkConnection.DEFAULT_INSTANCE);
            }
        }

        static {
            NoNetworkConnection noNetworkConnection = new NoNetworkConnection();
            DEFAULT_INSTANCE = noNetworkConnection;
            GeneratedMessageLite.registerDefaultInstance(NoNetworkConnection.class, noNetworkConnection);
        }

        private NoNetworkConnection() {
        }

        public static NoNetworkConnection getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6113a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NoNetworkConnection parseDelimitedFrom(InputStream inputStream) {
            return (NoNetworkConnection) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NoNetworkConnection parseFrom(ByteBuffer byteBuffer) {
            return (NoNetworkConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NoNetworkConnection> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new NoNetworkConnection();
                case 2:
                    return new C6113a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<NoNetworkConnection> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (NoNetworkConnection.class) {
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

        public static C6113a newBuilder(NoNetworkConnection noNetworkConnection) {
            return DEFAULT_INSTANCE.createBuilder(noNetworkConnection);
        }

        public static NoNetworkConnection parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NoNetworkConnection) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NoNetworkConnection parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (NoNetworkConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NoNetworkConnection parseFrom(ByteString byteString) {
            return (NoNetworkConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NoNetworkConnection parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (NoNetworkConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NoNetworkConnection parseFrom(byte[] bArr) {
            return (NoNetworkConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NoNetworkConnection parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (NoNetworkConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NoNetworkConnection parseFrom(InputStream inputStream) {
            return (NoNetworkConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NoNetworkConnection parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NoNetworkConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NoNetworkConnection parseFrom(CodedInputStream codedInputStream) {
            return (NoNetworkConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NoNetworkConnection parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NoNetworkConnection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OAuthInterstitial extends GeneratedMessageLite<OAuthInterstitial, C6118a> implements MessageLiteOrBuilder {
        public static final int CALLBACK_REQUEST_ID_FIELD_NUMBER = 2;
        private static final OAuthInterstitial DEFAULT_INSTANCE;
        public static final int DESKTOP_TO_MOBILE_HANDOFF_FIELD_NUMBER = 7;
        public static final int INSTITUTION_ID_FIELD_NUMBER = 4;
        public static final int LINK_SESSION_ID_FIELD_NUMBER = 8;
        public static final int NO_REDIRECT_URL_FIELD_NUMBER = 6;
        public static final int OAUTH_STATE_ID_FIELD_NUMBER = 1;
        private static volatile Parser<OAuthInterstitial> PARSER = null;
        public static final int REDIRECT_URL_FIELD_NUMBER = 3;
        public static final int SHOW_CONTINUE_FIELD_NUMBER = 5;
        private Object data_;
        private int dataCase_ = 0;
        private String oauthStateId_ = "";
        private String linkSessionId_ = "";
        private String callbackRequestId_ = "";
        private String redirectUrl_ = "";
        private String institutionId_ = "";

        public static final class DesktopToMobileHandoff extends GeneratedMessageLite<DesktopToMobileHandoff, C6114a> implements MessageLiteOrBuilder {
            private static final DesktopToMobileHandoff DEFAULT_INSTANCE;
            private static volatile Parser<DesktopToMobileHandoff> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthInterstitial$DesktopToMobileHandoff$a */
            public static final class C6114a extends GeneratedMessageLite.Builder<DesktopToMobileHandoff, C6114a> implements MessageLiteOrBuilder {
                public C6114a() {
                    super(DesktopToMobileHandoff.DEFAULT_INSTANCE);
                }
            }

            static {
                DesktopToMobileHandoff desktopToMobileHandoff = new DesktopToMobileHandoff();
                DEFAULT_INSTANCE = desktopToMobileHandoff;
                GeneratedMessageLite.registerDefaultInstance(DesktopToMobileHandoff.class, desktopToMobileHandoff);
            }

            private DesktopToMobileHandoff() {
            }

            public static DesktopToMobileHandoff getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6114a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static DesktopToMobileHandoff parseDelimitedFrom(InputStream inputStream) {
                return (DesktopToMobileHandoff) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static DesktopToMobileHandoff parseFrom(ByteBuffer byteBuffer) {
                return (DesktopToMobileHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<DesktopToMobileHandoff> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new DesktopToMobileHandoff();
                    case 2:
                        return new C6114a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<DesktopToMobileHandoff> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (DesktopToMobileHandoff.class) {
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

            public static C6114a newBuilder(DesktopToMobileHandoff desktopToMobileHandoff) {
                return DEFAULT_INSTANCE.createBuilder(desktopToMobileHandoff);
            }

            public static DesktopToMobileHandoff parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (DesktopToMobileHandoff) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static DesktopToMobileHandoff parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (DesktopToMobileHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static DesktopToMobileHandoff parseFrom(ByteString byteString) {
                return (DesktopToMobileHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static DesktopToMobileHandoff parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (DesktopToMobileHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static DesktopToMobileHandoff parseFrom(byte[] bArr) {
                return (DesktopToMobileHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static DesktopToMobileHandoff parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (DesktopToMobileHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static DesktopToMobileHandoff parseFrom(InputStream inputStream) {
                return (DesktopToMobileHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static DesktopToMobileHandoff parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (DesktopToMobileHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static DesktopToMobileHandoff parseFrom(CodedInputStream codedInputStream) {
                return (DesktopToMobileHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static DesktopToMobileHandoff parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (DesktopToMobileHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class NoRedirectUrl extends GeneratedMessageLite<NoRedirectUrl, C6115a> implements MessageLiteOrBuilder {
            private static final NoRedirectUrl DEFAULT_INSTANCE;
            private static volatile Parser<NoRedirectUrl> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthInterstitial$NoRedirectUrl$a */
            public static final class C6115a extends GeneratedMessageLite.Builder<NoRedirectUrl, C6115a> implements MessageLiteOrBuilder {
                public C6115a() {
                    super(NoRedirectUrl.DEFAULT_INSTANCE);
                }
            }

            static {
                NoRedirectUrl noRedirectUrl = new NoRedirectUrl();
                DEFAULT_INSTANCE = noRedirectUrl;
                GeneratedMessageLite.registerDefaultInstance(NoRedirectUrl.class, noRedirectUrl);
            }

            private NoRedirectUrl() {
            }

            public static NoRedirectUrl getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6115a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static NoRedirectUrl parseDelimitedFrom(InputStream inputStream) {
                return (NoRedirectUrl) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static NoRedirectUrl parseFrom(ByteBuffer byteBuffer) {
                return (NoRedirectUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<NoRedirectUrl> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new NoRedirectUrl();
                    case 2:
                        return new C6115a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<NoRedirectUrl> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (NoRedirectUrl.class) {
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

            public static C6115a newBuilder(NoRedirectUrl noRedirectUrl) {
                return DEFAULT_INSTANCE.createBuilder(noRedirectUrl);
            }

            public static NoRedirectUrl parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (NoRedirectUrl) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static NoRedirectUrl parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (NoRedirectUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static NoRedirectUrl parseFrom(ByteString byteString) {
                return (NoRedirectUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static NoRedirectUrl parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (NoRedirectUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static NoRedirectUrl parseFrom(byte[] bArr) {
                return (NoRedirectUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static NoRedirectUrl parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (NoRedirectUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static NoRedirectUrl parseFrom(InputStream inputStream) {
                return (NoRedirectUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static NoRedirectUrl parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (NoRedirectUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static NoRedirectUrl parseFrom(CodedInputStream codedInputStream) {
                return (NoRedirectUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static NoRedirectUrl parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (NoRedirectUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ShowContinue extends GeneratedMessageLite<ShowContinue, C6116a> implements MessageLiteOrBuilder {
            private static final ShowContinue DEFAULT_INSTANCE;
            private static volatile Parser<ShowContinue> PARSER = null;
            public static final int REASON_FIELD_NUMBER = 1;
            private int reason_;

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthInterstitial$ShowContinue$a */
            public static final class C6116a extends GeneratedMessageLite.Builder<ShowContinue, C6116a> implements MessageLiteOrBuilder {
                public C6116a() {
                    super(ShowContinue.DEFAULT_INSTANCE);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthInterstitial$ShowContinue$b */
            public enum EnumC6117b implements Internal.EnumLite {
                LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_UNSPECIFIED(0),
                LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_TIMEOUT(1),
                LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_UNHANDLED_EXCEPTION(2),
                LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_FORCE_USER_ACTION(3),
                LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_UNIVERSAL_LINK_WORKAROUND(4),
                UNRECOGNIZED(-1);


                /* renamed from: LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_FORCE_USER_ACTION_VALUE */
                public static final int f2042x50568b5f = 3;

                /* renamed from: LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_TIMEOUT_VALUE */
                public static final int f2044x77af876a = 1;

                /* renamed from: LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_UNHANDLED_EXCEPTION_VALUE */
                public static final int f2046x48d4937c = 2;

                /* renamed from: LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_UNIVERSAL_LINK_WORKAROUND_VALUE */
                public static final int f2048xaaf59f58 = 4;

                /* renamed from: LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_UNSPECIFIED_VALUE */
                public static final int f2050x6af57140 = 0;

                /* renamed from: b */
                public static final a f2051b = new a();

                /* renamed from: a */
                public final int f2053a;

                /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthInterstitial$ShowContinue$b$a */
                public class a implements Internal.EnumLiteMap<EnumC6117b> {
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public final Internal.EnumLite findValueByNumber(int i) {
                        return EnumC6117b.forNumber(i);
                    }
                }

                /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthInterstitial$ShowContinue$b$b */
                public static final class b implements Internal.EnumVerifier {

                    /* renamed from: a */
                    public static final b f2054a = new b();

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public final boolean isInRange(int i) {
                        return EnumC6117b.forNumber(i) != null;
                    }
                }

                EnumC6117b(int i) {
                    this.f2053a = i;
                }

                public static EnumC6117b forNumber(int i) {
                    if (i == 0) {
                        return LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_UNSPECIFIED;
                    }
                    if (i == 1) {
                        return LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_TIMEOUT;
                    }
                    if (i == 2) {
                        return LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_UNHANDLED_EXCEPTION;
                    }
                    if (i == 3) {
                        return LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_FORCE_USER_ACTION;
                    }
                    if (i != 4) {
                        return null;
                    }
                    return LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_INTERSTITIAL_SHOW_CONTINUE_REASON_UNIVERSAL_LINK_WORKAROUND;
                }

                public static Internal.EnumLiteMap<EnumC6117b> internalGetValueMap() {
                    return f2051b;
                }

                public static Internal.EnumVerifier internalGetVerifier() {
                    return b.f2054a;
                }

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    if (this != UNRECOGNIZED) {
                        return this.f2053a;
                    }
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }

                @Deprecated
                public static EnumC6117b valueOf(int i) {
                    return forNumber(i);
                }
            }

            static {
                ShowContinue showContinue = new ShowContinue();
                DEFAULT_INSTANCE = showContinue;
                GeneratedMessageLite.registerDefaultInstance(ShowContinue.class, showContinue);
            }

            private ShowContinue() {
            }

            private void clearReason() {
                this.reason_ = 0;
            }

            public static ShowContinue getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6116a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ShowContinue parseDelimitedFrom(InputStream inputStream) {
                return (ShowContinue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ShowContinue parseFrom(ByteBuffer byteBuffer) {
                return (ShowContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ShowContinue> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setReason(EnumC6117b enumC6117b) {
                this.reason_ = enumC6117b.getNumber();
            }

            private void setReasonValue(int i) {
                this.reason_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ShowContinue();
                    case 2:
                        return new C6116a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"reason_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ShowContinue> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ShowContinue.class) {
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

            public EnumC6117b getReason() {
                EnumC6117b enumC6117bForNumber = EnumC6117b.forNumber(this.reason_);
                return enumC6117bForNumber == null ? EnumC6117b.UNRECOGNIZED : enumC6117bForNumber;
            }

            public int getReasonValue() {
                return this.reason_;
            }

            public static C6116a newBuilder(ShowContinue showContinue) {
                return DEFAULT_INSTANCE.createBuilder(showContinue);
            }

            public static ShowContinue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ShowContinue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ShowContinue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ShowContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ShowContinue parseFrom(ByteString byteString) {
                return (ShowContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ShowContinue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ShowContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ShowContinue parseFrom(byte[] bArr) {
                return (ShowContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ShowContinue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ShowContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ShowContinue parseFrom(InputStream inputStream) {
                return (ShowContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ShowContinue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ShowContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ShowContinue parseFrom(CodedInputStream codedInputStream) {
                return (ShowContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ShowContinue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ShowContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthInterstitial$a */
        public static final class C6118a extends GeneratedMessageLite.Builder<OAuthInterstitial, C6118a> implements MessageLiteOrBuilder {
            public C6118a() {
                super(OAuthInterstitial.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthInterstitial$b */
        public enum EnumC6119b {
            SHOW_CONTINUE(5),
            NO_REDIRECT_URL(6),
            DESKTOP_TO_MOBILE_HANDOFF(7),
            DATA_NOT_SET(0);


            /* renamed from: a */
            public final int f2056a;

            EnumC6119b(int i) {
                this.f2056a = i;
            }

            public static EnumC6119b forNumber(int i) {
                if (i == 0) {
                    return DATA_NOT_SET;
                }
                if (i == 5) {
                    return SHOW_CONTINUE;
                }
                if (i == 6) {
                    return NO_REDIRECT_URL;
                }
                if (i != 7) {
                    return null;
                }
                return DESKTOP_TO_MOBILE_HANDOFF;
            }

            public int getNumber() {
                return this.f2056a;
            }

            @Deprecated
            public static EnumC6119b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            OAuthInterstitial oAuthInterstitial = new OAuthInterstitial();
            DEFAULT_INSTANCE = oAuthInterstitial;
            GeneratedMessageLite.registerDefaultInstance(OAuthInterstitial.class, oAuthInterstitial);
        }

        private OAuthInterstitial() {
        }

        private void clearCallbackRequestId() {
            this.callbackRequestId_ = getDefaultInstance().getCallbackRequestId();
        }

        private void clearData() {
            this.dataCase_ = 0;
            this.data_ = null;
        }

        private void clearDesktopToMobileHandoff() {
            if (this.dataCase_ == 7) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        private void clearInstitutionId() {
            this.institutionId_ = getDefaultInstance().getInstitutionId();
        }

        private void clearLinkSessionId() {
            this.linkSessionId_ = getDefaultInstance().getLinkSessionId();
        }

        private void clearNoRedirectUrl() {
            if (this.dataCase_ == 6) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        private void clearOauthStateId() {
            this.oauthStateId_ = getDefaultInstance().getOauthStateId();
        }

        private void clearRedirectUrl() {
            this.redirectUrl_ = getDefaultInstance().getRedirectUrl();
        }

        private void clearShowContinue() {
            if (this.dataCase_ == 5) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        public static OAuthInterstitial getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeDesktopToMobileHandoff(DesktopToMobileHandoff desktopToMobileHandoff) {
            desktopToMobileHandoff.getClass();
            if (this.dataCase_ != 7 || this.data_ == DesktopToMobileHandoff.getDefaultInstance()) {
                this.data_ = desktopToMobileHandoff;
            } else {
                this.data_ = DesktopToMobileHandoff.newBuilder((DesktopToMobileHandoff) this.data_).mergeFrom((DesktopToMobileHandoff.C6114a) desktopToMobileHandoff).buildPartial();
            }
            this.dataCase_ = 7;
        }

        private void mergeNoRedirectUrl(NoRedirectUrl noRedirectUrl) {
            noRedirectUrl.getClass();
            if (this.dataCase_ != 6 || this.data_ == NoRedirectUrl.getDefaultInstance()) {
                this.data_ = noRedirectUrl;
            } else {
                this.data_ = NoRedirectUrl.newBuilder((NoRedirectUrl) this.data_).mergeFrom((NoRedirectUrl.C6115a) noRedirectUrl).buildPartial();
            }
            this.dataCase_ = 6;
        }

        private void mergeShowContinue(ShowContinue showContinue) {
            showContinue.getClass();
            if (this.dataCase_ != 5 || this.data_ == ShowContinue.getDefaultInstance()) {
                this.data_ = showContinue;
            } else {
                this.data_ = ShowContinue.newBuilder((ShowContinue) this.data_).mergeFrom((ShowContinue.C6116a) showContinue).buildPartial();
            }
            this.dataCase_ = 5;
        }

        public static C6118a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OAuthInterstitial parseDelimitedFrom(InputStream inputStream) {
            return (OAuthInterstitial) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OAuthInterstitial parseFrom(ByteBuffer byteBuffer) {
            return (OAuthInterstitial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<OAuthInterstitial> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCallbackRequestId(String str) {
            str.getClass();
            this.callbackRequestId_ = str;
        }

        private void setCallbackRequestIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.callbackRequestId_ = byteString.toStringUtf8();
        }

        private void setDesktopToMobileHandoff(DesktopToMobileHandoff desktopToMobileHandoff) {
            desktopToMobileHandoff.getClass();
            this.data_ = desktopToMobileHandoff;
            this.dataCase_ = 7;
        }

        private void setInstitutionId(String str) {
            str.getClass();
            this.institutionId_ = str;
        }

        private void setInstitutionIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.institutionId_ = byteString.toStringUtf8();
        }

        private void setLinkSessionId(String str) {
            str.getClass();
            this.linkSessionId_ = str;
        }

        private void setLinkSessionIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.linkSessionId_ = byteString.toStringUtf8();
        }

        private void setNoRedirectUrl(NoRedirectUrl noRedirectUrl) {
            noRedirectUrl.getClass();
            this.data_ = noRedirectUrl;
            this.dataCase_ = 6;
        }

        private void setOauthStateId(String str) {
            str.getClass();
            this.oauthStateId_ = str;
        }

        private void setOauthStateIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.oauthStateId_ = byteString.toStringUtf8();
        }

        private void setRedirectUrl(String str) {
            str.getClass();
            this.redirectUrl_ = str;
        }

        private void setRedirectUrlBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.redirectUrl_ = byteString.toStringUtf8();
        }

        private void setShowContinue(ShowContinue showContinue) {
            showContinue.getClass();
            this.data_ = showContinue;
            this.dataCase_ = 5;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new OAuthInterstitial();
                case 2:
                    return new C6118a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005<\u0000\u0006<\u0000\u0007<\u0000\bȈ", new Object[]{"data_", "dataCase_", "oauthStateId_", "callbackRequestId_", "redirectUrl_", "institutionId_", ShowContinue.class, NoRedirectUrl.class, DesktopToMobileHandoff.class, "linkSessionId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<OAuthInterstitial> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (OAuthInterstitial.class) {
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

        public String getCallbackRequestId() {
            return this.callbackRequestId_;
        }

        public ByteString getCallbackRequestIdBytes() {
            return ByteString.copyFromUtf8(this.callbackRequestId_);
        }

        public EnumC6119b getDataCase() {
            return EnumC6119b.forNumber(this.dataCase_);
        }

        public DesktopToMobileHandoff getDesktopToMobileHandoff() {
            return this.dataCase_ == 7 ? (DesktopToMobileHandoff) this.data_ : DesktopToMobileHandoff.getDefaultInstance();
        }

        public String getInstitutionId() {
            return this.institutionId_;
        }

        public ByteString getInstitutionIdBytes() {
            return ByteString.copyFromUtf8(this.institutionId_);
        }

        public String getLinkSessionId() {
            return this.linkSessionId_;
        }

        public ByteString getLinkSessionIdBytes() {
            return ByteString.copyFromUtf8(this.linkSessionId_);
        }

        public NoRedirectUrl getNoRedirectUrl() {
            return this.dataCase_ == 6 ? (NoRedirectUrl) this.data_ : NoRedirectUrl.getDefaultInstance();
        }

        public String getOauthStateId() {
            return this.oauthStateId_;
        }

        public ByteString getOauthStateIdBytes() {
            return ByteString.copyFromUtf8(this.oauthStateId_);
        }

        public String getRedirectUrl() {
            return this.redirectUrl_;
        }

        public ByteString getRedirectUrlBytes() {
            return ByteString.copyFromUtf8(this.redirectUrl_);
        }

        public ShowContinue getShowContinue() {
            return this.dataCase_ == 5 ? (ShowContinue) this.data_ : ShowContinue.getDefaultInstance();
        }

        public boolean hasDesktopToMobileHandoff() {
            return this.dataCase_ == 7;
        }

        public boolean hasNoRedirectUrl() {
            return this.dataCase_ == 6;
        }

        public boolean hasShowContinue() {
            return this.dataCase_ == 5;
        }

        public static C6118a newBuilder(OAuthInterstitial oAuthInterstitial) {
            return DEFAULT_INSTANCE.createBuilder(oAuthInterstitial);
        }

        public static OAuthInterstitial parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthInterstitial) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OAuthInterstitial parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthInterstitial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OAuthInterstitial parseFrom(ByteString byteString) {
            return (OAuthInterstitial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OAuthInterstitial parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthInterstitial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OAuthInterstitial parseFrom(byte[] bArr) {
            return (OAuthInterstitial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OAuthInterstitial parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthInterstitial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OAuthInterstitial parseFrom(InputStream inputStream) {
            return (OAuthInterstitial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OAuthInterstitial parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthInterstitial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OAuthInterstitial parseFrom(CodedInputStream codedInputStream) {
            return (OAuthInterstitial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OAuthInterstitial parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthInterstitial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OAuthLink extends GeneratedMessageLite<OAuthLink, C6138a> implements MessageLiteOrBuilder {
        public static final int CLICK_CONTINUE_AWAIT_LOGIN_URI_FIELD_NUMBER = 17;
        public static final int CLICK_CONTINUE_FIELD_NUMBER = 4;
        private static final OAuthLink DEFAULT_INSTANCE;
        public static final int INSTITUTION_ID_FIELD_NUMBER = 2;
        public static final int LOGIN_CANCELED_FIELD_NUMBER = 8;
        public static final int LOGIN_COMPLETE_FIELD_NUMBER = 10;
        public static final int LOGIN_FAILURE_FIELD_NUMBER = 9;
        public static final int LOGIN_OPEN_FIELD_NUMBER = 7;
        public static final int LOGIN_RESET_STATE_FIELD_NUMBER = 11;
        public static final int OAUTH_POPUP_BLOCKED_FIELD_NUMBER = 18;
        public static final int OAUTH_STATE_ID_FIELD_NUMBER = 1;
        public static final int OAUTH_STATE_INITIALIZED_POLLING_COMPLETE_FIELD_NUMBER = 15;
        public static final int OAUTH_STATE_INITIALIZED_POLLING_FAILED_FIELD_NUMBER = 16;
        public static final int OAUTH_WINDOW_FOCUS_FIELD_NUMBER = 14;
        private static volatile Parser<OAuthLink> PARSER = null;
        public static final int POLLING_COMPLETE_FIELD_NUMBER = 12;
        public static final int POLLING_CONFIRMATION_CLICKED_FIELD_NUMBER = 13;
        public static final int POLLING_STARTED_FIELD_NUMBER = 5;
        public static final int REDIRECT_URI_FIELD_NUMBER = 3;
        public static final int VISIBILITY_STATE_CHANGE_FIELD_NUMBER = 6;
        private Object data_;
        private int dataCase_ = 0;
        private String oauthStateId_ = "";
        private String institutionId_ = "";
        private String redirectUri_ = "";

        public static final class ClickContinue extends GeneratedMessageLite<ClickContinue, C6120a> implements MessageLiteOrBuilder {
            private static final ClickContinue DEFAULT_INSTANCE;
            private static volatile Parser<ClickContinue> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthLink$ClickContinue$a */
            public static final class C6120a extends GeneratedMessageLite.Builder<ClickContinue, C6120a> implements MessageLiteOrBuilder {
                public C6120a() {
                    super(ClickContinue.DEFAULT_INSTANCE);
                }
            }

            static {
                ClickContinue clickContinue = new ClickContinue();
                DEFAULT_INSTANCE = clickContinue;
                GeneratedMessageLite.registerDefaultInstance(ClickContinue.class, clickContinue);
            }

            private ClickContinue() {
            }

            public static ClickContinue getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6120a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ClickContinue parseDelimitedFrom(InputStream inputStream) {
                return (ClickContinue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ClickContinue parseFrom(ByteBuffer byteBuffer) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ClickContinue> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ClickContinue();
                    case 2:
                        return new C6120a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ClickContinue> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ClickContinue.class) {
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

            public static C6120a newBuilder(ClickContinue clickContinue) {
                return DEFAULT_INSTANCE.createBuilder(clickContinue);
            }

            public static ClickContinue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickContinue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ClickContinue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ClickContinue parseFrom(ByteString byteString) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ClickContinue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ClickContinue parseFrom(byte[] bArr) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ClickContinue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ClickContinue parseFrom(InputStream inputStream) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ClickContinue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ClickContinue parseFrom(CodedInputStream codedInputStream) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ClickContinue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ClickContinueAwaitLoginUri extends GeneratedMessageLite<ClickContinueAwaitLoginUri, C6121a> implements MessageLiteOrBuilder {
            private static final ClickContinueAwaitLoginUri DEFAULT_INSTANCE;
            private static volatile Parser<ClickContinueAwaitLoginUri> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthLink$ClickContinueAwaitLoginUri$a */
            public static final class C6121a extends GeneratedMessageLite.Builder<ClickContinueAwaitLoginUri, C6121a> implements MessageLiteOrBuilder {
                public C6121a() {
                    super(ClickContinueAwaitLoginUri.DEFAULT_INSTANCE);
                }
            }

            static {
                ClickContinueAwaitLoginUri clickContinueAwaitLoginUri = new ClickContinueAwaitLoginUri();
                DEFAULT_INSTANCE = clickContinueAwaitLoginUri;
                GeneratedMessageLite.registerDefaultInstance(ClickContinueAwaitLoginUri.class, clickContinueAwaitLoginUri);
            }

            private ClickContinueAwaitLoginUri() {
            }

            public static ClickContinueAwaitLoginUri getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6121a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ClickContinueAwaitLoginUri parseDelimitedFrom(InputStream inputStream) {
                return (ClickContinueAwaitLoginUri) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ClickContinueAwaitLoginUri parseFrom(ByteBuffer byteBuffer) {
                return (ClickContinueAwaitLoginUri) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ClickContinueAwaitLoginUri> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ClickContinueAwaitLoginUri();
                    case 2:
                        return new C6121a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ClickContinueAwaitLoginUri> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ClickContinueAwaitLoginUri.class) {
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

            public static C6121a newBuilder(ClickContinueAwaitLoginUri clickContinueAwaitLoginUri) {
                return DEFAULT_INSTANCE.createBuilder(clickContinueAwaitLoginUri);
            }

            public static ClickContinueAwaitLoginUri parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickContinueAwaitLoginUri) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ClickContinueAwaitLoginUri parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickContinueAwaitLoginUri) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ClickContinueAwaitLoginUri parseFrom(ByteString byteString) {
                return (ClickContinueAwaitLoginUri) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ClickContinueAwaitLoginUri parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickContinueAwaitLoginUri) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ClickContinueAwaitLoginUri parseFrom(byte[] bArr) {
                return (ClickContinueAwaitLoginUri) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ClickContinueAwaitLoginUri parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickContinueAwaitLoginUri) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ClickContinueAwaitLoginUri parseFrom(InputStream inputStream) {
                return (ClickContinueAwaitLoginUri) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ClickContinueAwaitLoginUri parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickContinueAwaitLoginUri) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ClickContinueAwaitLoginUri parseFrom(CodedInputStream codedInputStream) {
                return (ClickContinueAwaitLoginUri) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ClickContinueAwaitLoginUri parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickContinueAwaitLoginUri) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class LoginCanceled extends GeneratedMessageLite<LoginCanceled, C6122a> implements MessageLiteOrBuilder {
            private static final LoginCanceled DEFAULT_INSTANCE;
            private static volatile Parser<LoginCanceled> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthLink$LoginCanceled$a */
            public static final class C6122a extends GeneratedMessageLite.Builder<LoginCanceled, C6122a> implements MessageLiteOrBuilder {
                public C6122a() {
                    super(LoginCanceled.DEFAULT_INSTANCE);
                }
            }

            static {
                LoginCanceled loginCanceled = new LoginCanceled();
                DEFAULT_INSTANCE = loginCanceled;
                GeneratedMessageLite.registerDefaultInstance(LoginCanceled.class, loginCanceled);
            }

            private LoginCanceled() {
            }

            public static LoginCanceled getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6122a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static LoginCanceled parseDelimitedFrom(InputStream inputStream) {
                return (LoginCanceled) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LoginCanceled parseFrom(ByteBuffer byteBuffer) {
                return (LoginCanceled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<LoginCanceled> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new LoginCanceled();
                    case 2:
                        return new C6122a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<LoginCanceled> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (LoginCanceled.class) {
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

            public static C6122a newBuilder(LoginCanceled loginCanceled) {
                return DEFAULT_INSTANCE.createBuilder(loginCanceled);
            }

            public static LoginCanceled parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginCanceled) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LoginCanceled parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginCanceled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static LoginCanceled parseFrom(ByteString byteString) {
                return (LoginCanceled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static LoginCanceled parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginCanceled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static LoginCanceled parseFrom(byte[] bArr) {
                return (LoginCanceled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static LoginCanceled parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginCanceled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static LoginCanceled parseFrom(InputStream inputStream) {
                return (LoginCanceled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LoginCanceled parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginCanceled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LoginCanceled parseFrom(CodedInputStream codedInputStream) {
                return (LoginCanceled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static LoginCanceled parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginCanceled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class LoginComplete extends GeneratedMessageLite<LoginComplete, C6123a> implements MessageLiteOrBuilder {
            private static final LoginComplete DEFAULT_INSTANCE;
            private static volatile Parser<LoginComplete> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthLink$LoginComplete$a */
            public static final class C6123a extends GeneratedMessageLite.Builder<LoginComplete, C6123a> implements MessageLiteOrBuilder {
                public C6123a() {
                    super(LoginComplete.DEFAULT_INSTANCE);
                }
            }

            static {
                LoginComplete loginComplete = new LoginComplete();
                DEFAULT_INSTANCE = loginComplete;
                GeneratedMessageLite.registerDefaultInstance(LoginComplete.class, loginComplete);
            }

            private LoginComplete() {
            }

            public static LoginComplete getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6123a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static LoginComplete parseDelimitedFrom(InputStream inputStream) {
                return (LoginComplete) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LoginComplete parseFrom(ByteBuffer byteBuffer) {
                return (LoginComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<LoginComplete> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new LoginComplete();
                    case 2:
                        return new C6123a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<LoginComplete> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (LoginComplete.class) {
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

            public static C6123a newBuilder(LoginComplete loginComplete) {
                return DEFAULT_INSTANCE.createBuilder(loginComplete);
            }

            public static LoginComplete parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginComplete) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LoginComplete parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static LoginComplete parseFrom(ByteString byteString) {
                return (LoginComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static LoginComplete parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static LoginComplete parseFrom(byte[] bArr) {
                return (LoginComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static LoginComplete parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static LoginComplete parseFrom(InputStream inputStream) {
                return (LoginComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LoginComplete parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LoginComplete parseFrom(CodedInputStream codedInputStream) {
                return (LoginComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static LoginComplete parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class LoginFailure extends GeneratedMessageLite<LoginFailure, C6124a> implements MessageLiteOrBuilder {
            private static final LoginFailure DEFAULT_INSTANCE;
            public static final int ERROR_FIELD_NUMBER = 2;
            private static volatile Parser<LoginFailure> PARSER = null;
            public static final int REASON_FIELD_NUMBER = 1;
            private String error_ = "";
            private int reason_;

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthLink$LoginFailure$a */
            public static final class C6124a extends GeneratedMessageLite.Builder<LoginFailure, C6124a> implements MessageLiteOrBuilder {
                public C6124a() {
                    super(LoginFailure.DEFAULT_INSTANCE);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthLink$LoginFailure$b */
            public enum EnumC6125b implements Internal.EnumLite {
                LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_LINK_LOGIN_FAILURE_REASON_UNKNOWN(0),
                LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_LINK_LOGIN_FAILURE_REASON_TIMEOUT(1),
                LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_LINK_LOGIN_FAILURE_REASON_ERROR(2),
                UNRECOGNIZED(-1);


                /* renamed from: LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_LINK_LOGIN_FAILURE_REASON_ERROR_VALUE */
                public static final int f2058xa4ed7dd8 = 2;

                /* renamed from: LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_LINK_LOGIN_FAILURE_REASON_TIMEOUT_VALUE */
                public static final int f2060x5eede6f1 = 1;

                /* renamed from: LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_LINK_LOGIN_FAILURE_REASON_UNKNOWN_VALUE */
                public static final int f2062x7311b31a = 0;

                /* renamed from: b */
                public static final a f2063b = new a();

                /* renamed from: a */
                public final int f2065a;

                /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthLink$LoginFailure$b$a */
                public class a implements Internal.EnumLiteMap<EnumC6125b> {
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public final Internal.EnumLite findValueByNumber(int i) {
                        return EnumC6125b.forNumber(i);
                    }
                }

                /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthLink$LoginFailure$b$b */
                public static final class b implements Internal.EnumVerifier {

                    /* renamed from: a */
                    public static final b f2066a = new b();

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public final boolean isInRange(int i) {
                        return EnumC6125b.forNumber(i) != null;
                    }
                }

                EnumC6125b(int i) {
                    this.f2065a = i;
                }

                public static EnumC6125b forNumber(int i) {
                    if (i == 0) {
                        return LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_LINK_LOGIN_FAILURE_REASON_UNKNOWN;
                    }
                    if (i == 1) {
                        return LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_LINK_LOGIN_FAILURE_REASON_TIMEOUT;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_LINK_LOGIN_FAILURE_REASON_ERROR;
                }

                public static Internal.EnumLiteMap<EnumC6125b> internalGetValueMap() {
                    return f2063b;
                }

                public static Internal.EnumVerifier internalGetVerifier() {
                    return b.f2066a;
                }

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    if (this != UNRECOGNIZED) {
                        return this.f2065a;
                    }
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }

                @Deprecated
                public static EnumC6125b valueOf(int i) {
                    return forNumber(i);
                }
            }

            static {
                LoginFailure loginFailure = new LoginFailure();
                DEFAULT_INSTANCE = loginFailure;
                GeneratedMessageLite.registerDefaultInstance(LoginFailure.class, loginFailure);
            }

            private LoginFailure() {
            }

            private void clearError() {
                this.error_ = getDefaultInstance().getError();
            }

            private void clearReason() {
                this.reason_ = 0;
            }

            public static LoginFailure getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6124a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static LoginFailure parseDelimitedFrom(InputStream inputStream) {
                return (LoginFailure) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LoginFailure parseFrom(ByteBuffer byteBuffer) {
                return (LoginFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<LoginFailure> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setError(String str) {
                str.getClass();
                this.error_ = str;
            }

            private void setErrorBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.error_ = byteString.toStringUtf8();
            }

            private void setReason(EnumC6125b enumC6125b) {
                this.reason_ = enumC6125b.getNumber();
            }

            private void setReasonValue(int i) {
                this.reason_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new LoginFailure();
                    case 2:
                        return new C6124a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"reason_", "error_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<LoginFailure> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (LoginFailure.class) {
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

            public String getError() {
                return this.error_;
            }

            public ByteString getErrorBytes() {
                return ByteString.copyFromUtf8(this.error_);
            }

            public EnumC6125b getReason() {
                EnumC6125b enumC6125bForNumber = EnumC6125b.forNumber(this.reason_);
                return enumC6125bForNumber == null ? EnumC6125b.UNRECOGNIZED : enumC6125bForNumber;
            }

            public int getReasonValue() {
                return this.reason_;
            }

            public static C6124a newBuilder(LoginFailure loginFailure) {
                return DEFAULT_INSTANCE.createBuilder(loginFailure);
            }

            public static LoginFailure parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginFailure) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LoginFailure parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static LoginFailure parseFrom(ByteString byteString) {
                return (LoginFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static LoginFailure parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static LoginFailure parseFrom(byte[] bArr) {
                return (LoginFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static LoginFailure parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static LoginFailure parseFrom(InputStream inputStream) {
                return (LoginFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LoginFailure parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LoginFailure parseFrom(CodedInputStream codedInputStream) {
                return (LoginFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static LoginFailure parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class LoginOpen extends GeneratedMessageLite<LoginOpen, C6127a> implements MessageLiteOrBuilder {
            private static final LoginOpen DEFAULT_INSTANCE;
            public static final int LOGIN_URI_FIELD_NUMBER = 2;
            public static final int METHOD_FIELD_NUMBER = 1;
            private static volatile Parser<LoginOpen> PARSER = null;
            public static final int WINDOW_OPEN_RETURN_VALUE_FIELD_NUMBER = 3;
            private int bitField0_;
            private String loginUri_ = "";
            private int method_;
            private WindowOpenReturnValue windowOpenReturnValue_;

            public static final class WindowOpenReturnValue extends GeneratedMessageLite<WindowOpenReturnValue, C6126a> implements MessageLiteOrBuilder {
                public static final int CLOSED_FIELD_NUMBER = 1;
                private static final WindowOpenReturnValue DEFAULT_INSTANCE;
                public static final int LENGTH_FIELD_NUMBER = 4;
                public static final int OPENER_FIELD_NUMBER = 2;
                private static volatile Parser<WindowOpenReturnValue> PARSER = null;
                public static final int TOP_FIELD_NUMBER = 3;
                private int closed_;
                private long length_;
                private int opener_;
                private int top_;

                /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthLink$LoginOpen$WindowOpenReturnValue$a */
                public static final class C6126a extends GeneratedMessageLite.Builder<WindowOpenReturnValue, C6126a> implements MessageLiteOrBuilder {
                    public C6126a() {
                        super(WindowOpenReturnValue.DEFAULT_INSTANCE);
                    }
                }

                static {
                    WindowOpenReturnValue windowOpenReturnValue = new WindowOpenReturnValue();
                    DEFAULT_INSTANCE = windowOpenReturnValue;
                    GeneratedMessageLite.registerDefaultInstance(WindowOpenReturnValue.class, windowOpenReturnValue);
                }

                private WindowOpenReturnValue() {
                }

                private void clearClosed() {
                    this.closed_ = 0;
                }

                private void clearLength() {
                    this.length_ = 0L;
                }

                private void clearOpener() {
                    this.opener_ = 0;
                }

                private void clearTop() {
                    this.top_ = 0;
                }

                public static WindowOpenReturnValue getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static C6126a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static WindowOpenReturnValue parseDelimitedFrom(InputStream inputStream) {
                    return (WindowOpenReturnValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static WindowOpenReturnValue parseFrom(ByteBuffer byteBuffer) {
                    return (WindowOpenReturnValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static Parser<WindowOpenReturnValue> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void setClosed(EnumC6178c enumC6178c) {
                    this.closed_ = enumC6178c.getNumber();
                }

                private void setClosedValue(int i) {
                    this.closed_ = i;
                }

                private void setLength(long j) {
                    this.length_ = j;
                }

                private void setOpener(EnumC6178c enumC6178c) {
                    this.opener_ = enumC6178c.getNumber();
                }

                private void setOpenerValue(int i) {
                    this.opener_ = i;
                }

                private void setTop(EnumC6178c enumC6178c) {
                    this.top_ = enumC6178c.getNumber();
                }

                private void setTopValue(int i) {
                    this.top_ = i;
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new WindowOpenReturnValue();
                        case 2:
                            return new C6126a();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f\u0004\u0003", new Object[]{"closed_", "opener_", "top_", "length_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            Parser<WindowOpenReturnValue> parser = PARSER;
                            if (parser != null) {
                                return parser;
                            }
                            synchronized (WindowOpenReturnValue.class) {
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

                public EnumC6178c getClosed() {
                    EnumC6178c enumC6178cForNumber = EnumC6178c.forNumber(this.closed_);
                    return enumC6178cForNumber == null ? EnumC6178c.UNRECOGNIZED : enumC6178cForNumber;
                }

                public int getClosedValue() {
                    return this.closed_;
                }

                public long getLength() {
                    return this.length_;
                }

                public EnumC6178c getOpener() {
                    EnumC6178c enumC6178cForNumber = EnumC6178c.forNumber(this.opener_);
                    return enumC6178cForNumber == null ? EnumC6178c.UNRECOGNIZED : enumC6178cForNumber;
                }

                public int getOpenerValue() {
                    return this.opener_;
                }

                public EnumC6178c getTop() {
                    EnumC6178c enumC6178cForNumber = EnumC6178c.forNumber(this.top_);
                    return enumC6178cForNumber == null ? EnumC6178c.UNRECOGNIZED : enumC6178cForNumber;
                }

                public int getTopValue() {
                    return this.top_;
                }

                public static C6126a newBuilder(WindowOpenReturnValue windowOpenReturnValue) {
                    return DEFAULT_INSTANCE.createBuilder(windowOpenReturnValue);
                }

                public static WindowOpenReturnValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (WindowOpenReturnValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static WindowOpenReturnValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                    return (WindowOpenReturnValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static WindowOpenReturnValue parseFrom(ByteString byteString) {
                    return (WindowOpenReturnValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static WindowOpenReturnValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                    return (WindowOpenReturnValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static WindowOpenReturnValue parseFrom(byte[] bArr) {
                    return (WindowOpenReturnValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static WindowOpenReturnValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                    return (WindowOpenReturnValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static WindowOpenReturnValue parseFrom(InputStream inputStream) {
                    return (WindowOpenReturnValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static WindowOpenReturnValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (WindowOpenReturnValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static WindowOpenReturnValue parseFrom(CodedInputStream codedInputStream) {
                    return (WindowOpenReturnValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static WindowOpenReturnValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (WindowOpenReturnValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthLink$LoginOpen$a */
            public static final class C6127a extends GeneratedMessageLite.Builder<LoginOpen, C6127a> implements MessageLiteOrBuilder {
                public C6127a() {
                    super(LoginOpen.DEFAULT_INSTANCE);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthLink$LoginOpen$b */
            public enum EnumC6128b implements Internal.EnumLite {
                LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_LINK_LOGIN_OPEN_METHOD_UNSPECIFIED(0),
                LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_LINK_LOGIN_OPEN_METHOD_POPUP(1),
                LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_LINK_LOGIN_OPEN_METHOD_REDIRECT(2),
                UNRECOGNIZED(-1);


                /* renamed from: LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_LINK_LOGIN_OPEN_METHOD_POPUP_VALUE */
                public static final int f2067xcf25fdf1 = 1;

                /* renamed from: LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_LINK_LOGIN_OPEN_METHOD_REDIRECT_VALUE */
                public static final int f2069x6334d03b = 2;

                /* renamed from: LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_LINK_LOGIN_OPEN_METHOD_UNSPECIFIED_VALUE */
                public static final int f2071x20a235fc = 0;

                /* renamed from: b */
                public static final a f2072b = new a();

                /* renamed from: a */
                public final int f2074a;

                /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthLink$LoginOpen$b$a */
                public class a implements Internal.EnumLiteMap<EnumC6128b> {
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public final Internal.EnumLite findValueByNumber(int i) {
                        return EnumC6128b.forNumber(i);
                    }
                }

                /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthLink$LoginOpen$b$b */
                public static final class b implements Internal.EnumVerifier {

                    /* renamed from: a */
                    public static final b f2075a = new b();

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public final boolean isInRange(int i) {
                        return EnumC6128b.forNumber(i) != null;
                    }
                }

                EnumC6128b(int i) {
                    this.f2074a = i;
                }

                public static EnumC6128b forNumber(int i) {
                    if (i == 0) {
                        return LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_LINK_LOGIN_OPEN_METHOD_UNSPECIFIED;
                    }
                    if (i == 1) {
                        return LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_LINK_LOGIN_OPEN_METHOD_POPUP;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return LINK_WORKFLOW_EVENT_REQUEST_O_AUTH_LINK_LOGIN_OPEN_METHOD_REDIRECT;
                }

                public static Internal.EnumLiteMap<EnumC6128b> internalGetValueMap() {
                    return f2072b;
                }

                public static Internal.EnumVerifier internalGetVerifier() {
                    return b.f2075a;
                }

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    if (this != UNRECOGNIZED) {
                        return this.f2074a;
                    }
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }

                @Deprecated
                public static EnumC6128b valueOf(int i) {
                    return forNumber(i);
                }
            }

            static {
                LoginOpen loginOpen = new LoginOpen();
                DEFAULT_INSTANCE = loginOpen;
                GeneratedMessageLite.registerDefaultInstance(LoginOpen.class, loginOpen);
            }

            private LoginOpen() {
            }

            private void clearLoginUri() {
                this.loginUri_ = getDefaultInstance().getLoginUri();
            }

            private void clearMethod() {
                this.method_ = 0;
            }

            private void clearWindowOpenReturnValue() {
                this.windowOpenReturnValue_ = null;
                this.bitField0_ &= -2;
            }

            public static LoginOpen getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeWindowOpenReturnValue(WindowOpenReturnValue windowOpenReturnValue) {
                windowOpenReturnValue.getClass();
                WindowOpenReturnValue windowOpenReturnValue2 = this.windowOpenReturnValue_;
                if (windowOpenReturnValue2 == null || windowOpenReturnValue2 == WindowOpenReturnValue.getDefaultInstance()) {
                    this.windowOpenReturnValue_ = windowOpenReturnValue;
                } else {
                    this.windowOpenReturnValue_ = WindowOpenReturnValue.newBuilder(this.windowOpenReturnValue_).mergeFrom((WindowOpenReturnValue.C6126a) windowOpenReturnValue).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6127a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static LoginOpen parseDelimitedFrom(InputStream inputStream) {
                return (LoginOpen) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LoginOpen parseFrom(ByteBuffer byteBuffer) {
                return (LoginOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<LoginOpen> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setLoginUri(String str) {
                str.getClass();
                this.loginUri_ = str;
            }

            private void setLoginUriBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.loginUri_ = byteString.toStringUtf8();
            }

            private void setMethod(EnumC6128b enumC6128b) {
                this.method_ = enumC6128b.getNumber();
            }

            private void setMethodValue(int i) {
                this.method_ = i;
            }

            private void setWindowOpenReturnValue(WindowOpenReturnValue windowOpenReturnValue) {
                windowOpenReturnValue.getClass();
                this.windowOpenReturnValue_ = windowOpenReturnValue;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new LoginOpen();
                    case 2:
                        return new C6127a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "method_", "loginUri_", "windowOpenReturnValue_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<LoginOpen> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (LoginOpen.class) {
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

            public String getLoginUri() {
                return this.loginUri_;
            }

            public ByteString getLoginUriBytes() {
                return ByteString.copyFromUtf8(this.loginUri_);
            }

            public EnumC6128b getMethod() {
                EnumC6128b enumC6128bForNumber = EnumC6128b.forNumber(this.method_);
                return enumC6128bForNumber == null ? EnumC6128b.UNRECOGNIZED : enumC6128bForNumber;
            }

            public int getMethodValue() {
                return this.method_;
            }

            public WindowOpenReturnValue getWindowOpenReturnValue() {
                WindowOpenReturnValue windowOpenReturnValue = this.windowOpenReturnValue_;
                return windowOpenReturnValue == null ? WindowOpenReturnValue.getDefaultInstance() : windowOpenReturnValue;
            }

            public boolean hasWindowOpenReturnValue() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6127a newBuilder(LoginOpen loginOpen) {
                return DEFAULT_INSTANCE.createBuilder(loginOpen);
            }

            public static LoginOpen parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginOpen) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LoginOpen parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static LoginOpen parseFrom(ByteString byteString) {
                return (LoginOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static LoginOpen parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static LoginOpen parseFrom(byte[] bArr) {
                return (LoginOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static LoginOpen parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static LoginOpen parseFrom(InputStream inputStream) {
                return (LoginOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LoginOpen parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LoginOpen parseFrom(CodedInputStream codedInputStream) {
                return (LoginOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static LoginOpen parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class LoginResetState extends GeneratedMessageLite<LoginResetState, C6129a> implements MessageLiteOrBuilder {
            private static final LoginResetState DEFAULT_INSTANCE;
            private static volatile Parser<LoginResetState> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthLink$LoginResetState$a */
            public static final class C6129a extends GeneratedMessageLite.Builder<LoginResetState, C6129a> implements MessageLiteOrBuilder {
                public C6129a() {
                    super(LoginResetState.DEFAULT_INSTANCE);
                }
            }

            static {
                LoginResetState loginResetState = new LoginResetState();
                DEFAULT_INSTANCE = loginResetState;
                GeneratedMessageLite.registerDefaultInstance(LoginResetState.class, loginResetState);
            }

            private LoginResetState() {
            }

            public static LoginResetState getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6129a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static LoginResetState parseDelimitedFrom(InputStream inputStream) {
                return (LoginResetState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LoginResetState parseFrom(ByteBuffer byteBuffer) {
                return (LoginResetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<LoginResetState> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new LoginResetState();
                    case 2:
                        return new C6129a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<LoginResetState> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (LoginResetState.class) {
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

            public static C6129a newBuilder(LoginResetState loginResetState) {
                return DEFAULT_INSTANCE.createBuilder(loginResetState);
            }

            public static LoginResetState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginResetState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LoginResetState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginResetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static LoginResetState parseFrom(ByteString byteString) {
                return (LoginResetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static LoginResetState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginResetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static LoginResetState parseFrom(byte[] bArr) {
                return (LoginResetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static LoginResetState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginResetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static LoginResetState parseFrom(InputStream inputStream) {
                return (LoginResetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LoginResetState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginResetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LoginResetState parseFrom(CodedInputStream codedInputStream) {
                return (LoginResetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static LoginResetState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LoginResetState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OAuthPopupBlocked extends GeneratedMessageLite<OAuthPopupBlocked, C6130a> implements MessageLiteOrBuilder {
            private static final OAuthPopupBlocked DEFAULT_INSTANCE;
            private static volatile Parser<OAuthPopupBlocked> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthLink$OAuthPopupBlocked$a */
            public static final class C6130a extends GeneratedMessageLite.Builder<OAuthPopupBlocked, C6130a> implements MessageLiteOrBuilder {
                public C6130a() {
                    super(OAuthPopupBlocked.DEFAULT_INSTANCE);
                }
            }

            static {
                OAuthPopupBlocked oAuthPopupBlocked = new OAuthPopupBlocked();
                DEFAULT_INSTANCE = oAuthPopupBlocked;
                GeneratedMessageLite.registerDefaultInstance(OAuthPopupBlocked.class, oAuthPopupBlocked);
            }

            private OAuthPopupBlocked() {
            }

            public static OAuthPopupBlocked getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6130a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static OAuthPopupBlocked parseDelimitedFrom(InputStream inputStream) {
                return (OAuthPopupBlocked) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static OAuthPopupBlocked parseFrom(ByteBuffer byteBuffer) {
                return (OAuthPopupBlocked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<OAuthPopupBlocked> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new OAuthPopupBlocked();
                    case 2:
                        return new C6130a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<OAuthPopupBlocked> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (OAuthPopupBlocked.class) {
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

            public static C6130a newBuilder(OAuthPopupBlocked oAuthPopupBlocked) {
                return DEFAULT_INSTANCE.createBuilder(oAuthPopupBlocked);
            }

            public static OAuthPopupBlocked parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (OAuthPopupBlocked) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static OAuthPopupBlocked parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (OAuthPopupBlocked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static OAuthPopupBlocked parseFrom(ByteString byteString) {
                return (OAuthPopupBlocked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static OAuthPopupBlocked parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (OAuthPopupBlocked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static OAuthPopupBlocked parseFrom(byte[] bArr) {
                return (OAuthPopupBlocked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static OAuthPopupBlocked parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (OAuthPopupBlocked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static OAuthPopupBlocked parseFrom(InputStream inputStream) {
                return (OAuthPopupBlocked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static OAuthPopupBlocked parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (OAuthPopupBlocked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static OAuthPopupBlocked parseFrom(CodedInputStream codedInputStream) {
                return (OAuthPopupBlocked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static OAuthPopupBlocked parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (OAuthPopupBlocked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OAuthStateInitializedPollingComplete extends GeneratedMessageLite<OAuthStateInitializedPollingComplete, C6131a> implements MessageLiteOrBuilder {
            private static final OAuthStateInitializedPollingComplete DEFAULT_INSTANCE;
            private static volatile Parser<OAuthStateInitializedPollingComplete> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthLink$OAuthStateInitializedPollingComplete$a */
            public static final class C6131a extends GeneratedMessageLite.Builder<OAuthStateInitializedPollingComplete, C6131a> implements MessageLiteOrBuilder {
                public C6131a() {
                    super(OAuthStateInitializedPollingComplete.DEFAULT_INSTANCE);
                }
            }

            static {
                OAuthStateInitializedPollingComplete oAuthStateInitializedPollingComplete = new OAuthStateInitializedPollingComplete();
                DEFAULT_INSTANCE = oAuthStateInitializedPollingComplete;
                GeneratedMessageLite.registerDefaultInstance(OAuthStateInitializedPollingComplete.class, oAuthStateInitializedPollingComplete);
            }

            private OAuthStateInitializedPollingComplete() {
            }

            public static OAuthStateInitializedPollingComplete getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6131a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static OAuthStateInitializedPollingComplete parseDelimitedFrom(InputStream inputStream) {
                return (OAuthStateInitializedPollingComplete) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static OAuthStateInitializedPollingComplete parseFrom(ByteBuffer byteBuffer) {
                return (OAuthStateInitializedPollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<OAuthStateInitializedPollingComplete> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new OAuthStateInitializedPollingComplete();
                    case 2:
                        return new C6131a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<OAuthStateInitializedPollingComplete> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (OAuthStateInitializedPollingComplete.class) {
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

            public static C6131a newBuilder(OAuthStateInitializedPollingComplete oAuthStateInitializedPollingComplete) {
                return DEFAULT_INSTANCE.createBuilder(oAuthStateInitializedPollingComplete);
            }

            public static OAuthStateInitializedPollingComplete parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (OAuthStateInitializedPollingComplete) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static OAuthStateInitializedPollingComplete parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (OAuthStateInitializedPollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static OAuthStateInitializedPollingComplete parseFrom(ByteString byteString) {
                return (OAuthStateInitializedPollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static OAuthStateInitializedPollingComplete parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (OAuthStateInitializedPollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static OAuthStateInitializedPollingComplete parseFrom(byte[] bArr) {
                return (OAuthStateInitializedPollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static OAuthStateInitializedPollingComplete parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (OAuthStateInitializedPollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static OAuthStateInitializedPollingComplete parseFrom(InputStream inputStream) {
                return (OAuthStateInitializedPollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static OAuthStateInitializedPollingComplete parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (OAuthStateInitializedPollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static OAuthStateInitializedPollingComplete parseFrom(CodedInputStream codedInputStream) {
                return (OAuthStateInitializedPollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static OAuthStateInitializedPollingComplete parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (OAuthStateInitializedPollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OAuthStateInitializedPollingFailed extends GeneratedMessageLite<OAuthStateInitializedPollingFailed, C6132a> implements MessageLiteOrBuilder {
            private static final OAuthStateInitializedPollingFailed DEFAULT_INSTANCE;
            private static volatile Parser<OAuthStateInitializedPollingFailed> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthLink$OAuthStateInitializedPollingFailed$a */
            public static final class C6132a extends GeneratedMessageLite.Builder<OAuthStateInitializedPollingFailed, C6132a> implements MessageLiteOrBuilder {
                public C6132a() {
                    super(OAuthStateInitializedPollingFailed.DEFAULT_INSTANCE);
                }
            }

            static {
                OAuthStateInitializedPollingFailed oAuthStateInitializedPollingFailed = new OAuthStateInitializedPollingFailed();
                DEFAULT_INSTANCE = oAuthStateInitializedPollingFailed;
                GeneratedMessageLite.registerDefaultInstance(OAuthStateInitializedPollingFailed.class, oAuthStateInitializedPollingFailed);
            }

            private OAuthStateInitializedPollingFailed() {
            }

            public static OAuthStateInitializedPollingFailed getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6132a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static OAuthStateInitializedPollingFailed parseDelimitedFrom(InputStream inputStream) {
                return (OAuthStateInitializedPollingFailed) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static OAuthStateInitializedPollingFailed parseFrom(ByteBuffer byteBuffer) {
                return (OAuthStateInitializedPollingFailed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<OAuthStateInitializedPollingFailed> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new OAuthStateInitializedPollingFailed();
                    case 2:
                        return new C6132a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<OAuthStateInitializedPollingFailed> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (OAuthStateInitializedPollingFailed.class) {
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

            public static C6132a newBuilder(OAuthStateInitializedPollingFailed oAuthStateInitializedPollingFailed) {
                return DEFAULT_INSTANCE.createBuilder(oAuthStateInitializedPollingFailed);
            }

            public static OAuthStateInitializedPollingFailed parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (OAuthStateInitializedPollingFailed) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static OAuthStateInitializedPollingFailed parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (OAuthStateInitializedPollingFailed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static OAuthStateInitializedPollingFailed parseFrom(ByteString byteString) {
                return (OAuthStateInitializedPollingFailed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static OAuthStateInitializedPollingFailed parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (OAuthStateInitializedPollingFailed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static OAuthStateInitializedPollingFailed parseFrom(byte[] bArr) {
                return (OAuthStateInitializedPollingFailed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static OAuthStateInitializedPollingFailed parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (OAuthStateInitializedPollingFailed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static OAuthStateInitializedPollingFailed parseFrom(InputStream inputStream) {
                return (OAuthStateInitializedPollingFailed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static OAuthStateInitializedPollingFailed parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (OAuthStateInitializedPollingFailed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static OAuthStateInitializedPollingFailed parseFrom(CodedInputStream codedInputStream) {
                return (OAuthStateInitializedPollingFailed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static OAuthStateInitializedPollingFailed parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (OAuthStateInitializedPollingFailed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OAuthWindowFocus extends GeneratedMessageLite<OAuthWindowFocus, C6133a> implements MessageLiteOrBuilder {
            private static final OAuthWindowFocus DEFAULT_INSTANCE;
            private static volatile Parser<OAuthWindowFocus> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthLink$OAuthWindowFocus$a */
            public static final class C6133a extends GeneratedMessageLite.Builder<OAuthWindowFocus, C6133a> implements MessageLiteOrBuilder {
                public C6133a() {
                    super(OAuthWindowFocus.DEFAULT_INSTANCE);
                }
            }

            static {
                OAuthWindowFocus oAuthWindowFocus = new OAuthWindowFocus();
                DEFAULT_INSTANCE = oAuthWindowFocus;
                GeneratedMessageLite.registerDefaultInstance(OAuthWindowFocus.class, oAuthWindowFocus);
            }

            private OAuthWindowFocus() {
            }

            public static OAuthWindowFocus getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6133a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static OAuthWindowFocus parseDelimitedFrom(InputStream inputStream) {
                return (OAuthWindowFocus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static OAuthWindowFocus parseFrom(ByteBuffer byteBuffer) {
                return (OAuthWindowFocus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<OAuthWindowFocus> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new OAuthWindowFocus();
                    case 2:
                        return new C6133a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<OAuthWindowFocus> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (OAuthWindowFocus.class) {
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

            public static C6133a newBuilder(OAuthWindowFocus oAuthWindowFocus) {
                return DEFAULT_INSTANCE.createBuilder(oAuthWindowFocus);
            }

            public static OAuthWindowFocus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (OAuthWindowFocus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static OAuthWindowFocus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (OAuthWindowFocus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static OAuthWindowFocus parseFrom(ByteString byteString) {
                return (OAuthWindowFocus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static OAuthWindowFocus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (OAuthWindowFocus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static OAuthWindowFocus parseFrom(byte[] bArr) {
                return (OAuthWindowFocus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static OAuthWindowFocus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (OAuthWindowFocus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static OAuthWindowFocus parseFrom(InputStream inputStream) {
                return (OAuthWindowFocus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static OAuthWindowFocus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (OAuthWindowFocus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static OAuthWindowFocus parseFrom(CodedInputStream codedInputStream) {
                return (OAuthWindowFocus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static OAuthWindowFocus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (OAuthWindowFocus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class PollingComplete extends GeneratedMessageLite<PollingComplete, C6134a> implements MessageLiteOrBuilder {
            private static final PollingComplete DEFAULT_INSTANCE;
            private static volatile Parser<PollingComplete> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthLink$PollingComplete$a */
            public static final class C6134a extends GeneratedMessageLite.Builder<PollingComplete, C6134a> implements MessageLiteOrBuilder {
                public C6134a() {
                    super(PollingComplete.DEFAULT_INSTANCE);
                }
            }

            static {
                PollingComplete pollingComplete = new PollingComplete();
                DEFAULT_INSTANCE = pollingComplete;
                GeneratedMessageLite.registerDefaultInstance(PollingComplete.class, pollingComplete);
            }

            private PollingComplete() {
            }

            public static PollingComplete getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6134a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static PollingComplete parseDelimitedFrom(InputStream inputStream) {
                return (PollingComplete) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PollingComplete parseFrom(ByteBuffer byteBuffer) {
                return (PollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<PollingComplete> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new PollingComplete();
                    case 2:
                        return new C6134a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<PollingComplete> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (PollingComplete.class) {
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

            public static C6134a newBuilder(PollingComplete pollingComplete) {
                return DEFAULT_INSTANCE.createBuilder(pollingComplete);
            }

            public static PollingComplete parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingComplete) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PollingComplete parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static PollingComplete parseFrom(ByteString byteString) {
                return (PollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static PollingComplete parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static PollingComplete parseFrom(byte[] bArr) {
                return (PollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static PollingComplete parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static PollingComplete parseFrom(InputStream inputStream) {
                return (PollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PollingComplete parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PollingComplete parseFrom(CodedInputStream codedInputStream) {
                return (PollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static PollingComplete parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class PollingConfirmationClicked extends GeneratedMessageLite<PollingConfirmationClicked, C6135a> implements MessageLiteOrBuilder {
            private static final PollingConfirmationClicked DEFAULT_INSTANCE;
            private static volatile Parser<PollingConfirmationClicked> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthLink$PollingConfirmationClicked$a */
            public static final class C6135a extends GeneratedMessageLite.Builder<PollingConfirmationClicked, C6135a> implements MessageLiteOrBuilder {
                public C6135a() {
                    super(PollingConfirmationClicked.DEFAULT_INSTANCE);
                }
            }

            static {
                PollingConfirmationClicked pollingConfirmationClicked = new PollingConfirmationClicked();
                DEFAULT_INSTANCE = pollingConfirmationClicked;
                GeneratedMessageLite.registerDefaultInstance(PollingConfirmationClicked.class, pollingConfirmationClicked);
            }

            private PollingConfirmationClicked() {
            }

            public static PollingConfirmationClicked getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6135a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static PollingConfirmationClicked parseDelimitedFrom(InputStream inputStream) {
                return (PollingConfirmationClicked) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PollingConfirmationClicked parseFrom(ByteBuffer byteBuffer) {
                return (PollingConfirmationClicked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<PollingConfirmationClicked> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new PollingConfirmationClicked();
                    case 2:
                        return new C6135a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<PollingConfirmationClicked> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (PollingConfirmationClicked.class) {
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

            public static C6135a newBuilder(PollingConfirmationClicked pollingConfirmationClicked) {
                return DEFAULT_INSTANCE.createBuilder(pollingConfirmationClicked);
            }

            public static PollingConfirmationClicked parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingConfirmationClicked) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PollingConfirmationClicked parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingConfirmationClicked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static PollingConfirmationClicked parseFrom(ByteString byteString) {
                return (PollingConfirmationClicked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static PollingConfirmationClicked parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingConfirmationClicked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static PollingConfirmationClicked parseFrom(byte[] bArr) {
                return (PollingConfirmationClicked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static PollingConfirmationClicked parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingConfirmationClicked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static PollingConfirmationClicked parseFrom(InputStream inputStream) {
                return (PollingConfirmationClicked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PollingConfirmationClicked parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingConfirmationClicked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PollingConfirmationClicked parseFrom(CodedInputStream codedInputStream) {
                return (PollingConfirmationClicked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static PollingConfirmationClicked parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingConfirmationClicked) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class PollingStarted extends GeneratedMessageLite<PollingStarted, C6136a> implements MessageLiteOrBuilder {
            private static final PollingStarted DEFAULT_INSTANCE;
            private static volatile Parser<PollingStarted> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthLink$PollingStarted$a */
            public static final class C6136a extends GeneratedMessageLite.Builder<PollingStarted, C6136a> implements MessageLiteOrBuilder {
                public C6136a() {
                    super(PollingStarted.DEFAULT_INSTANCE);
                }
            }

            static {
                PollingStarted pollingStarted = new PollingStarted();
                DEFAULT_INSTANCE = pollingStarted;
                GeneratedMessageLite.registerDefaultInstance(PollingStarted.class, pollingStarted);
            }

            private PollingStarted() {
            }

            public static PollingStarted getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6136a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static PollingStarted parseDelimitedFrom(InputStream inputStream) {
                return (PollingStarted) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PollingStarted parseFrom(ByteBuffer byteBuffer) {
                return (PollingStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<PollingStarted> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new PollingStarted();
                    case 2:
                        return new C6136a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<PollingStarted> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (PollingStarted.class) {
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

            public static C6136a newBuilder(PollingStarted pollingStarted) {
                return DEFAULT_INSTANCE.createBuilder(pollingStarted);
            }

            public static PollingStarted parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingStarted) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PollingStarted parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static PollingStarted parseFrom(ByteString byteString) {
                return (PollingStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static PollingStarted parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static PollingStarted parseFrom(byte[] bArr) {
                return (PollingStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static PollingStarted parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static PollingStarted parseFrom(InputStream inputStream) {
                return (PollingStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PollingStarted parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PollingStarted parseFrom(CodedInputStream codedInputStream) {
                return (PollingStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static PollingStarted parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PollingStarted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class VisibilityStateChange extends GeneratedMessageLite<VisibilityStateChange, C6137a> implements MessageLiteOrBuilder {
            private static final VisibilityStateChange DEFAULT_INSTANCE;
            private static volatile Parser<VisibilityStateChange> PARSER = null;
            public static final int VISIBILITY_STATE_FIELD_NUMBER = 1;
            private String visibilityState_ = "";

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthLink$VisibilityStateChange$a */
            public static final class C6137a extends GeneratedMessageLite.Builder<VisibilityStateChange, C6137a> implements MessageLiteOrBuilder {
                public C6137a() {
                    super(VisibilityStateChange.DEFAULT_INSTANCE);
                }
            }

            static {
                VisibilityStateChange visibilityStateChange = new VisibilityStateChange();
                DEFAULT_INSTANCE = visibilityStateChange;
                GeneratedMessageLite.registerDefaultInstance(VisibilityStateChange.class, visibilityStateChange);
            }

            private VisibilityStateChange() {
            }

            private void clearVisibilityState() {
                this.visibilityState_ = getDefaultInstance().getVisibilityState();
            }

            public static VisibilityStateChange getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6137a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static VisibilityStateChange parseDelimitedFrom(InputStream inputStream) {
                return (VisibilityStateChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static VisibilityStateChange parseFrom(ByteBuffer byteBuffer) {
                return (VisibilityStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<VisibilityStateChange> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setVisibilityState(String str) {
                str.getClass();
                this.visibilityState_ = str;
            }

            private void setVisibilityStateBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.visibilityState_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new VisibilityStateChange();
                    case 2:
                        return new C6137a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"visibilityState_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<VisibilityStateChange> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (VisibilityStateChange.class) {
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

            public String getVisibilityState() {
                return this.visibilityState_;
            }

            public ByteString getVisibilityStateBytes() {
                return ByteString.copyFromUtf8(this.visibilityState_);
            }

            public static C6137a newBuilder(VisibilityStateChange visibilityStateChange) {
                return DEFAULT_INSTANCE.createBuilder(visibilityStateChange);
            }

            public static VisibilityStateChange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (VisibilityStateChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static VisibilityStateChange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (VisibilityStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static VisibilityStateChange parseFrom(ByteString byteString) {
                return (VisibilityStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static VisibilityStateChange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (VisibilityStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static VisibilityStateChange parseFrom(byte[] bArr) {
                return (VisibilityStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static VisibilityStateChange parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (VisibilityStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static VisibilityStateChange parseFrom(InputStream inputStream) {
                return (VisibilityStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static VisibilityStateChange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (VisibilityStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static VisibilityStateChange parseFrom(CodedInputStream codedInputStream) {
                return (VisibilityStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static VisibilityStateChange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (VisibilityStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthLink$b */
        public enum EnumC6139b {
            CLICK_CONTINUE(4),
            CLICK_CONTINUE_AWAIT_LOGIN_URI(17),
            POLLING_STARTED(5),
            VISIBILITY_STATE_CHANGE(6),
            POLLING_COMPLETE(12),
            POLLING_CONFIRMATION_CLICKED(13),
            OAUTH_STATE_INITIALIZED_POLLING_COMPLETE(15),
            OAUTH_STATE_INITIALIZED_POLLING_FAILED(16),
            LOGIN_OPEN(7),
            LOGIN_CANCELED(8),
            LOGIN_FAILURE(9),
            LOGIN_COMPLETE(10),
            LOGIN_RESET_STATE(11),
            OAUTH_WINDOW_FOCUS(14),
            OAUTH_POPUP_BLOCKED(18),
            DATA_NOT_SET(0);


            /* renamed from: a */
            public final int f2077a;

            EnumC6139b(int i) {
                this.f2077a = i;
            }

            public static EnumC6139b forNumber(int i) {
                if (i == 0) {
                    return DATA_NOT_SET;
                }
                switch (i) {
                    case 4:
                        return CLICK_CONTINUE;
                    case 5:
                        return POLLING_STARTED;
                    case 6:
                        return VISIBILITY_STATE_CHANGE;
                    case 7:
                        return LOGIN_OPEN;
                    case 8:
                        return LOGIN_CANCELED;
                    case 9:
                        return LOGIN_FAILURE;
                    case 10:
                        return LOGIN_COMPLETE;
                    case 11:
                        return LOGIN_RESET_STATE;
                    case 12:
                        return POLLING_COMPLETE;
                    case 13:
                        return POLLING_CONFIRMATION_CLICKED;
                    case 14:
                        return OAUTH_WINDOW_FOCUS;
                    case 15:
                        return OAUTH_STATE_INITIALIZED_POLLING_COMPLETE;
                    case 16:
                        return OAUTH_STATE_INITIALIZED_POLLING_FAILED;
                    case 17:
                        return CLICK_CONTINUE_AWAIT_LOGIN_URI;
                    case 18:
                        return OAUTH_POPUP_BLOCKED;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.f2077a;
            }

            @Deprecated
            public static EnumC6139b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            OAuthLink oAuthLink = new OAuthLink();
            DEFAULT_INSTANCE = oAuthLink;
            GeneratedMessageLite.registerDefaultInstance(OAuthLink.class, oAuthLink);
        }

        private OAuthLink() {
        }

        private void clearClickContinue() {
            if (this.dataCase_ == 4) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        private void clearClickContinueAwaitLoginUri() {
            if (this.dataCase_ == 17) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        private void clearData() {
            this.dataCase_ = 0;
            this.data_ = null;
        }

        private void clearInstitutionId() {
            this.institutionId_ = getDefaultInstance().getInstitutionId();
        }

        private void clearLoginCanceled() {
            if (this.dataCase_ == 8) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        private void clearLoginComplete() {
            if (this.dataCase_ == 10) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        private void clearLoginFailure() {
            if (this.dataCase_ == 9) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        private void clearLoginOpen() {
            if (this.dataCase_ == 7) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        private void clearLoginResetState() {
            if (this.dataCase_ == 11) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        private void clearOauthPopupBlocked() {
            if (this.dataCase_ == 18) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        private void clearOauthStateId() {
            this.oauthStateId_ = getDefaultInstance().getOauthStateId();
        }

        private void clearOauthStateInitializedPollingComplete() {
            if (this.dataCase_ == 15) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        private void clearOauthStateInitializedPollingFailed() {
            if (this.dataCase_ == 16) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        private void clearOauthWindowFocus() {
            if (this.dataCase_ == 14) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        private void clearPollingComplete() {
            if (this.dataCase_ == 12) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        private void clearPollingConfirmationClicked() {
            if (this.dataCase_ == 13) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        private void clearPollingStarted() {
            if (this.dataCase_ == 5) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        private void clearRedirectUri() {
            this.redirectUri_ = getDefaultInstance().getRedirectUri();
        }

        private void clearVisibilityStateChange() {
            if (this.dataCase_ == 6) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        public static OAuthLink getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeClickContinue(ClickContinue clickContinue) {
            clickContinue.getClass();
            if (this.dataCase_ != 4 || this.data_ == ClickContinue.getDefaultInstance()) {
                this.data_ = clickContinue;
            } else {
                this.data_ = ClickContinue.newBuilder((ClickContinue) this.data_).mergeFrom((ClickContinue.C6120a) clickContinue).buildPartial();
            }
            this.dataCase_ = 4;
        }

        private void mergeClickContinueAwaitLoginUri(ClickContinueAwaitLoginUri clickContinueAwaitLoginUri) {
            clickContinueAwaitLoginUri.getClass();
            if (this.dataCase_ != 17 || this.data_ == ClickContinueAwaitLoginUri.getDefaultInstance()) {
                this.data_ = clickContinueAwaitLoginUri;
            } else {
                this.data_ = ClickContinueAwaitLoginUri.newBuilder((ClickContinueAwaitLoginUri) this.data_).mergeFrom((ClickContinueAwaitLoginUri.C6121a) clickContinueAwaitLoginUri).buildPartial();
            }
            this.dataCase_ = 17;
        }

        private void mergeLoginCanceled(LoginCanceled loginCanceled) {
            loginCanceled.getClass();
            if (this.dataCase_ != 8 || this.data_ == LoginCanceled.getDefaultInstance()) {
                this.data_ = loginCanceled;
            } else {
                this.data_ = LoginCanceled.newBuilder((LoginCanceled) this.data_).mergeFrom((LoginCanceled.C6122a) loginCanceled).buildPartial();
            }
            this.dataCase_ = 8;
        }

        private void mergeLoginComplete(LoginComplete loginComplete) {
            loginComplete.getClass();
            if (this.dataCase_ != 10 || this.data_ == LoginComplete.getDefaultInstance()) {
                this.data_ = loginComplete;
            } else {
                this.data_ = LoginComplete.newBuilder((LoginComplete) this.data_).mergeFrom((LoginComplete.C6123a) loginComplete).buildPartial();
            }
            this.dataCase_ = 10;
        }

        private void mergeLoginFailure(LoginFailure loginFailure) {
            loginFailure.getClass();
            if (this.dataCase_ != 9 || this.data_ == LoginFailure.getDefaultInstance()) {
                this.data_ = loginFailure;
            } else {
                this.data_ = LoginFailure.newBuilder((LoginFailure) this.data_).mergeFrom((LoginFailure.C6124a) loginFailure).buildPartial();
            }
            this.dataCase_ = 9;
        }

        private void mergeLoginOpen(LoginOpen loginOpen) {
            loginOpen.getClass();
            if (this.dataCase_ != 7 || this.data_ == LoginOpen.getDefaultInstance()) {
                this.data_ = loginOpen;
            } else {
                this.data_ = LoginOpen.newBuilder((LoginOpen) this.data_).mergeFrom((LoginOpen.C6127a) loginOpen).buildPartial();
            }
            this.dataCase_ = 7;
        }

        private void mergeLoginResetState(LoginResetState loginResetState) {
            loginResetState.getClass();
            if (this.dataCase_ != 11 || this.data_ == LoginResetState.getDefaultInstance()) {
                this.data_ = loginResetState;
            } else {
                this.data_ = LoginResetState.newBuilder((LoginResetState) this.data_).mergeFrom((LoginResetState.C6129a) loginResetState).buildPartial();
            }
            this.dataCase_ = 11;
        }

        private void mergeOauthPopupBlocked(OAuthPopupBlocked oAuthPopupBlocked) {
            oAuthPopupBlocked.getClass();
            if (this.dataCase_ != 18 || this.data_ == OAuthPopupBlocked.getDefaultInstance()) {
                this.data_ = oAuthPopupBlocked;
            } else {
                this.data_ = OAuthPopupBlocked.newBuilder((OAuthPopupBlocked) this.data_).mergeFrom((OAuthPopupBlocked.C6130a) oAuthPopupBlocked).buildPartial();
            }
            this.dataCase_ = 18;
        }

        private void mergeOauthStateInitializedPollingComplete(OAuthStateInitializedPollingComplete oAuthStateInitializedPollingComplete) {
            oAuthStateInitializedPollingComplete.getClass();
            if (this.dataCase_ != 15 || this.data_ == OAuthStateInitializedPollingComplete.getDefaultInstance()) {
                this.data_ = oAuthStateInitializedPollingComplete;
            } else {
                this.data_ = OAuthStateInitializedPollingComplete.newBuilder((OAuthStateInitializedPollingComplete) this.data_).mergeFrom((OAuthStateInitializedPollingComplete.C6131a) oAuthStateInitializedPollingComplete).buildPartial();
            }
            this.dataCase_ = 15;
        }

        private void mergeOauthStateInitializedPollingFailed(OAuthStateInitializedPollingFailed oAuthStateInitializedPollingFailed) {
            oAuthStateInitializedPollingFailed.getClass();
            if (this.dataCase_ != 16 || this.data_ == OAuthStateInitializedPollingFailed.getDefaultInstance()) {
                this.data_ = oAuthStateInitializedPollingFailed;
            } else {
                this.data_ = OAuthStateInitializedPollingFailed.newBuilder((OAuthStateInitializedPollingFailed) this.data_).mergeFrom((OAuthStateInitializedPollingFailed.C6132a) oAuthStateInitializedPollingFailed).buildPartial();
            }
            this.dataCase_ = 16;
        }

        private void mergeOauthWindowFocus(OAuthWindowFocus oAuthWindowFocus) {
            oAuthWindowFocus.getClass();
            if (this.dataCase_ != 14 || this.data_ == OAuthWindowFocus.getDefaultInstance()) {
                this.data_ = oAuthWindowFocus;
            } else {
                this.data_ = OAuthWindowFocus.newBuilder((OAuthWindowFocus) this.data_).mergeFrom((OAuthWindowFocus.C6133a) oAuthWindowFocus).buildPartial();
            }
            this.dataCase_ = 14;
        }

        private void mergePollingComplete(PollingComplete pollingComplete) {
            pollingComplete.getClass();
            if (this.dataCase_ != 12 || this.data_ == PollingComplete.getDefaultInstance()) {
                this.data_ = pollingComplete;
            } else {
                this.data_ = PollingComplete.newBuilder((PollingComplete) this.data_).mergeFrom((PollingComplete.C6134a) pollingComplete).buildPartial();
            }
            this.dataCase_ = 12;
        }

        private void mergePollingConfirmationClicked(PollingConfirmationClicked pollingConfirmationClicked) {
            pollingConfirmationClicked.getClass();
            if (this.dataCase_ != 13 || this.data_ == PollingConfirmationClicked.getDefaultInstance()) {
                this.data_ = pollingConfirmationClicked;
            } else {
                this.data_ = PollingConfirmationClicked.newBuilder((PollingConfirmationClicked) this.data_).mergeFrom((PollingConfirmationClicked.C6135a) pollingConfirmationClicked).buildPartial();
            }
            this.dataCase_ = 13;
        }

        private void mergePollingStarted(PollingStarted pollingStarted) {
            pollingStarted.getClass();
            if (this.dataCase_ != 5 || this.data_ == PollingStarted.getDefaultInstance()) {
                this.data_ = pollingStarted;
            } else {
                this.data_ = PollingStarted.newBuilder((PollingStarted) this.data_).mergeFrom((PollingStarted.C6136a) pollingStarted).buildPartial();
            }
            this.dataCase_ = 5;
        }

        private void mergeVisibilityStateChange(VisibilityStateChange visibilityStateChange) {
            visibilityStateChange.getClass();
            if (this.dataCase_ != 6 || this.data_ == VisibilityStateChange.getDefaultInstance()) {
                this.data_ = visibilityStateChange;
            } else {
                this.data_ = VisibilityStateChange.newBuilder((VisibilityStateChange) this.data_).mergeFrom((VisibilityStateChange.C6137a) visibilityStateChange).buildPartial();
            }
            this.dataCase_ = 6;
        }

        public static C6138a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OAuthLink parseDelimitedFrom(InputStream inputStream) {
            return (OAuthLink) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OAuthLink parseFrom(ByteBuffer byteBuffer) {
            return (OAuthLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<OAuthLink> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setClickContinue(ClickContinue clickContinue) {
            clickContinue.getClass();
            this.data_ = clickContinue;
            this.dataCase_ = 4;
        }

        private void setClickContinueAwaitLoginUri(ClickContinueAwaitLoginUri clickContinueAwaitLoginUri) {
            clickContinueAwaitLoginUri.getClass();
            this.data_ = clickContinueAwaitLoginUri;
            this.dataCase_ = 17;
        }

        private void setInstitutionId(String str) {
            str.getClass();
            this.institutionId_ = str;
        }

        private void setInstitutionIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.institutionId_ = byteString.toStringUtf8();
        }

        private void setLoginCanceled(LoginCanceled loginCanceled) {
            loginCanceled.getClass();
            this.data_ = loginCanceled;
            this.dataCase_ = 8;
        }

        private void setLoginComplete(LoginComplete loginComplete) {
            loginComplete.getClass();
            this.data_ = loginComplete;
            this.dataCase_ = 10;
        }

        private void setLoginFailure(LoginFailure loginFailure) {
            loginFailure.getClass();
            this.data_ = loginFailure;
            this.dataCase_ = 9;
        }

        private void setLoginOpen(LoginOpen loginOpen) {
            loginOpen.getClass();
            this.data_ = loginOpen;
            this.dataCase_ = 7;
        }

        private void setLoginResetState(LoginResetState loginResetState) {
            loginResetState.getClass();
            this.data_ = loginResetState;
            this.dataCase_ = 11;
        }

        private void setOauthPopupBlocked(OAuthPopupBlocked oAuthPopupBlocked) {
            oAuthPopupBlocked.getClass();
            this.data_ = oAuthPopupBlocked;
            this.dataCase_ = 18;
        }

        private void setOauthStateId(String str) {
            str.getClass();
            this.oauthStateId_ = str;
        }

        private void setOauthStateIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.oauthStateId_ = byteString.toStringUtf8();
        }

        private void setOauthStateInitializedPollingComplete(OAuthStateInitializedPollingComplete oAuthStateInitializedPollingComplete) {
            oAuthStateInitializedPollingComplete.getClass();
            this.data_ = oAuthStateInitializedPollingComplete;
            this.dataCase_ = 15;
        }

        private void setOauthStateInitializedPollingFailed(OAuthStateInitializedPollingFailed oAuthStateInitializedPollingFailed) {
            oAuthStateInitializedPollingFailed.getClass();
            this.data_ = oAuthStateInitializedPollingFailed;
            this.dataCase_ = 16;
        }

        private void setOauthWindowFocus(OAuthWindowFocus oAuthWindowFocus) {
            oAuthWindowFocus.getClass();
            this.data_ = oAuthWindowFocus;
            this.dataCase_ = 14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPollingComplete(PollingComplete pollingComplete) {
            pollingComplete.getClass();
            this.data_ = pollingComplete;
            this.dataCase_ = 12;
        }

        private void setPollingConfirmationClicked(PollingConfirmationClicked pollingConfirmationClicked) {
            pollingConfirmationClicked.getClass();
            this.data_ = pollingConfirmationClicked;
            this.dataCase_ = 13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPollingStarted(PollingStarted pollingStarted) {
            pollingStarted.getClass();
            this.data_ = pollingStarted;
            this.dataCase_ = 5;
        }

        private void setRedirectUri(String str) {
            str.getClass();
            this.redirectUri_ = str;
        }

        private void setRedirectUriBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.redirectUri_ = byteString.toStringUtf8();
        }

        private void setVisibilityStateChange(VisibilityStateChange visibilityStateChange) {
            visibilityStateChange.getClass();
            this.data_ = visibilityStateChange;
            this.dataCase_ = 6;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new OAuthLink();
                case 2:
                    return new C6138a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0012\u0001\u0000\u0001\u0012\u0012\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000", new Object[]{"data_", "dataCase_", "oauthStateId_", "institutionId_", "redirectUri_", ClickContinue.class, PollingStarted.class, VisibilityStateChange.class, LoginOpen.class, LoginCanceled.class, LoginFailure.class, LoginComplete.class, LoginResetState.class, PollingComplete.class, PollingConfirmationClicked.class, OAuthWindowFocus.class, OAuthStateInitializedPollingComplete.class, OAuthStateInitializedPollingFailed.class, ClickContinueAwaitLoginUri.class, OAuthPopupBlocked.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<OAuthLink> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (OAuthLink.class) {
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

        public ClickContinue getClickContinue() {
            return this.dataCase_ == 4 ? (ClickContinue) this.data_ : ClickContinue.getDefaultInstance();
        }

        public ClickContinueAwaitLoginUri getClickContinueAwaitLoginUri() {
            return this.dataCase_ == 17 ? (ClickContinueAwaitLoginUri) this.data_ : ClickContinueAwaitLoginUri.getDefaultInstance();
        }

        public EnumC6139b getDataCase() {
            return EnumC6139b.forNumber(this.dataCase_);
        }

        public String getInstitutionId() {
            return this.institutionId_;
        }

        public ByteString getInstitutionIdBytes() {
            return ByteString.copyFromUtf8(this.institutionId_);
        }

        public LoginCanceled getLoginCanceled() {
            return this.dataCase_ == 8 ? (LoginCanceled) this.data_ : LoginCanceled.getDefaultInstance();
        }

        public LoginComplete getLoginComplete() {
            return this.dataCase_ == 10 ? (LoginComplete) this.data_ : LoginComplete.getDefaultInstance();
        }

        public LoginFailure getLoginFailure() {
            return this.dataCase_ == 9 ? (LoginFailure) this.data_ : LoginFailure.getDefaultInstance();
        }

        public LoginOpen getLoginOpen() {
            return this.dataCase_ == 7 ? (LoginOpen) this.data_ : LoginOpen.getDefaultInstance();
        }

        public LoginResetState getLoginResetState() {
            return this.dataCase_ == 11 ? (LoginResetState) this.data_ : LoginResetState.getDefaultInstance();
        }

        public OAuthPopupBlocked getOauthPopupBlocked() {
            return this.dataCase_ == 18 ? (OAuthPopupBlocked) this.data_ : OAuthPopupBlocked.getDefaultInstance();
        }

        public String getOauthStateId() {
            return this.oauthStateId_;
        }

        public ByteString getOauthStateIdBytes() {
            return ByteString.copyFromUtf8(this.oauthStateId_);
        }

        public OAuthStateInitializedPollingComplete getOauthStateInitializedPollingComplete() {
            return this.dataCase_ == 15 ? (OAuthStateInitializedPollingComplete) this.data_ : OAuthStateInitializedPollingComplete.getDefaultInstance();
        }

        public OAuthStateInitializedPollingFailed getOauthStateInitializedPollingFailed() {
            return this.dataCase_ == 16 ? (OAuthStateInitializedPollingFailed) this.data_ : OAuthStateInitializedPollingFailed.getDefaultInstance();
        }

        public OAuthWindowFocus getOauthWindowFocus() {
            return this.dataCase_ == 14 ? (OAuthWindowFocus) this.data_ : OAuthWindowFocus.getDefaultInstance();
        }

        public PollingComplete getPollingComplete() {
            return this.dataCase_ == 12 ? (PollingComplete) this.data_ : PollingComplete.getDefaultInstance();
        }

        public PollingConfirmationClicked getPollingConfirmationClicked() {
            return this.dataCase_ == 13 ? (PollingConfirmationClicked) this.data_ : PollingConfirmationClicked.getDefaultInstance();
        }

        public PollingStarted getPollingStarted() {
            return this.dataCase_ == 5 ? (PollingStarted) this.data_ : PollingStarted.getDefaultInstance();
        }

        public String getRedirectUri() {
            return this.redirectUri_;
        }

        public ByteString getRedirectUriBytes() {
            return ByteString.copyFromUtf8(this.redirectUri_);
        }

        public VisibilityStateChange getVisibilityStateChange() {
            return this.dataCase_ == 6 ? (VisibilityStateChange) this.data_ : VisibilityStateChange.getDefaultInstance();
        }

        public boolean hasClickContinue() {
            return this.dataCase_ == 4;
        }

        public boolean hasClickContinueAwaitLoginUri() {
            return this.dataCase_ == 17;
        }

        public boolean hasLoginCanceled() {
            return this.dataCase_ == 8;
        }

        public boolean hasLoginComplete() {
            return this.dataCase_ == 10;
        }

        public boolean hasLoginFailure() {
            return this.dataCase_ == 9;
        }

        public boolean hasLoginOpen() {
            return this.dataCase_ == 7;
        }

        public boolean hasLoginResetState() {
            return this.dataCase_ == 11;
        }

        public boolean hasOauthPopupBlocked() {
            return this.dataCase_ == 18;
        }

        public boolean hasOauthStateInitializedPollingComplete() {
            return this.dataCase_ == 15;
        }

        public boolean hasOauthStateInitializedPollingFailed() {
            return this.dataCase_ == 16;
        }

        public boolean hasOauthWindowFocus() {
            return this.dataCase_ == 14;
        }

        public boolean hasPollingComplete() {
            return this.dataCase_ == 12;
        }

        public boolean hasPollingConfirmationClicked() {
            return this.dataCase_ == 13;
        }

        public boolean hasPollingStarted() {
            return this.dataCase_ == 5;
        }

        public boolean hasVisibilityStateChange() {
            return this.dataCase_ == 6;
        }

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OAuthLink$a */
        public static final class C6138a extends GeneratedMessageLite.Builder<OAuthLink, C6138a> implements MessageLiteOrBuilder {
            public C6138a() {
                super(OAuthLink.DEFAULT_INSTANCE);
            }

            /* renamed from: a */
            public final C6138a m1397a(PollingStarted pollingStarted) {
                copyOnWrite();
                ((OAuthLink) this.instance).setPollingStarted(pollingStarted);
                return this;
            }

            /* renamed from: a */
            public final C6138a m1396a(PollingComplete pollingComplete) {
                copyOnWrite();
                ((OAuthLink) this.instance).setPollingComplete(pollingComplete);
                return this;
            }
        }

        public static C6138a newBuilder(OAuthLink oAuthLink) {
            return DEFAULT_INSTANCE.createBuilder(oAuthLink);
        }

        public static OAuthLink parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthLink) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OAuthLink parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OAuthLink parseFrom(ByteString byteString) {
            return (OAuthLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OAuthLink parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OAuthLink parseFrom(byte[] bArr) {
            return (OAuthLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OAuthLink parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OAuthLink parseFrom(InputStream inputStream) {
            return (OAuthLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OAuthLink parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OAuthLink parseFrom(CodedInputStream codedInputStream) {
            return (OAuthLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OAuthLink parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OpenModal extends GeneratedMessageLite<OpenModal, C6140a> implements MessageLiteOrBuilder {
        private static final OpenModal DEFAULT_INSTANCE;
        public static final int PANE_NODE_ID_FIELD_NUMBER = 1;
        private static volatile Parser<OpenModal> PARSER;
        private String paneNodeId_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$OpenModal$a */
        public static final class C6140a extends GeneratedMessageLite.Builder<OpenModal, C6140a> implements MessageLiteOrBuilder {
            public C6140a() {
                super(OpenModal.DEFAULT_INSTANCE);
            }
        }

        static {
            OpenModal openModal = new OpenModal();
            DEFAULT_INSTANCE = openModal;
            GeneratedMessageLite.registerDefaultInstance(OpenModal.class, openModal);
        }

        private OpenModal() {
        }

        private void clearPaneNodeId() {
            this.paneNodeId_ = getDefaultInstance().getPaneNodeId();
        }

        public static OpenModal getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6140a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OpenModal parseDelimitedFrom(InputStream inputStream) {
            return (OpenModal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OpenModal parseFrom(ByteBuffer byteBuffer) {
            return (OpenModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<OpenModal> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setPaneNodeId(String str) {
            str.getClass();
            this.paneNodeId_ = str;
        }

        private void setPaneNodeIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.paneNodeId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new OpenModal();
                case 2:
                    return new C6140a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"paneNodeId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<OpenModal> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (OpenModal.class) {
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

        public String getPaneNodeId() {
            return this.paneNodeId_;
        }

        public ByteString getPaneNodeIdBytes() {
            return ByteString.copyFromUtf8(this.paneNodeId_);
        }

        public static C6140a newBuilder(OpenModal openModal) {
            return DEFAULT_INSTANCE.createBuilder(openModal);
        }

        public static OpenModal parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OpenModal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OpenModal parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (OpenModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OpenModal parseFrom(ByteString byteString) {
            return (OpenModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OpenModal parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (OpenModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OpenModal parseFrom(byte[] bArr) {
            return (OpenModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OpenModal parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (OpenModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OpenModal parseFrom(InputStream inputStream) {
            return (OpenModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OpenModal parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OpenModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OpenModal parseFrom(CodedInputStream codedInputStream) {
            return (OpenModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OpenModal parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OpenModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PaneAppeared extends GeneratedMessageLite<PaneAppeared, C6141a> implements MessageLiteOrBuilder {
        private static final PaneAppeared DEFAULT_INSTANCE;
        public static final int DELAY_MS_FIELD_NUMBER = 2;
        public static final int PANE_NODE_ID_FIELD_NUMBER = 1;
        public static final int PANE_RENDERING_ID_FIELD_NUMBER = 4;
        private static volatile Parser<PaneAppeared> PARSER = null;
        public static final int PREVIOUS_PANE_NODE_ID_FIELD_NUMBER = 3;
        private long delayMs_;
        private String paneNodeId_ = "";
        private String previousPaneNodeId_ = "";
        private String paneRenderingId_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$PaneAppeared$a */
        public static final class C6141a extends GeneratedMessageLite.Builder<PaneAppeared, C6141a> implements MessageLiteOrBuilder {
            public C6141a() {
                super(PaneAppeared.DEFAULT_INSTANCE);
            }
        }

        static {
            PaneAppeared paneAppeared = new PaneAppeared();
            DEFAULT_INSTANCE = paneAppeared;
            GeneratedMessageLite.registerDefaultInstance(PaneAppeared.class, paneAppeared);
        }

        private PaneAppeared() {
        }

        private void clearDelayMs() {
            this.delayMs_ = 0L;
        }

        private void clearPaneNodeId() {
            this.paneNodeId_ = getDefaultInstance().getPaneNodeId();
        }

        private void clearPaneRenderingId() {
            this.paneRenderingId_ = getDefaultInstance().getPaneRenderingId();
        }

        private void clearPreviousPaneNodeId() {
            this.previousPaneNodeId_ = getDefaultInstance().getPreviousPaneNodeId();
        }

        public static PaneAppeared getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6141a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PaneAppeared parseDelimitedFrom(InputStream inputStream) {
            return (PaneAppeared) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PaneAppeared parseFrom(ByteBuffer byteBuffer) {
            return (PaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<PaneAppeared> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDelayMs(long j) {
            this.delayMs_ = j;
        }

        private void setPaneNodeId(String str) {
            str.getClass();
            this.paneNodeId_ = str;
        }

        private void setPaneNodeIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.paneNodeId_ = byteString.toStringUtf8();
        }

        private void setPaneRenderingId(String str) {
            str.getClass();
            this.paneRenderingId_ = str;
        }

        private void setPaneRenderingIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.paneRenderingId_ = byteString.toStringUtf8();
        }

        private void setPreviousPaneNodeId(String str) {
            str.getClass();
            this.previousPaneNodeId_ = str;
        }

        private void setPreviousPaneNodeIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.previousPaneNodeId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new PaneAppeared();
                case 2:
                    return new C6141a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ\u0004Ȉ", new Object[]{"paneNodeId_", "delayMs_", "previousPaneNodeId_", "paneRenderingId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PaneAppeared> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (PaneAppeared.class) {
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

        public long getDelayMs() {
            return this.delayMs_;
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

        public String getPreviousPaneNodeId() {
            return this.previousPaneNodeId_;
        }

        public ByteString getPreviousPaneNodeIdBytes() {
            return ByteString.copyFromUtf8(this.previousPaneNodeId_);
        }

        public static C6141a newBuilder(PaneAppeared paneAppeared) {
            return DEFAULT_INSTANCE.createBuilder(paneAppeared);
        }

        public static PaneAppeared parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneAppeared) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PaneAppeared parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PaneAppeared parseFrom(ByteString byteString) {
            return (PaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PaneAppeared parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PaneAppeared parseFrom(byte[] bArr) {
            return (PaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PaneAppeared parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PaneAppeared parseFrom(InputStream inputStream) {
            return (PaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PaneAppeared parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PaneAppeared parseFrom(CodedInputStream codedInputStream) {
            return (PaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PaneAppeared parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PaneAutoSubmitted extends GeneratedMessageLite<PaneAutoSubmitted, C6142a> implements MessageLiteOrBuilder {
        public static final int AUTO_SUBMITTED_ACTION_FIELD_NUMBER = 2;
        private static final PaneAutoSubmitted DEFAULT_INSTANCE;
        public static final int PANE_NODE_ID_FIELD_NUMBER = 1;
        private static volatile Parser<PaneAutoSubmitted> PARSER;
        private int autoSubmittedAction_;
        private String paneNodeId_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$PaneAutoSubmitted$a */
        public static final class C6142a extends GeneratedMessageLite.Builder<PaneAutoSubmitted, C6142a> implements MessageLiteOrBuilder {
            public C6142a() {
                super(PaneAutoSubmitted.DEFAULT_INSTANCE);
            }
        }

        static {
            PaneAutoSubmitted paneAutoSubmitted = new PaneAutoSubmitted();
            DEFAULT_INSTANCE = paneAutoSubmitted;
            GeneratedMessageLite.registerDefaultInstance(PaneAutoSubmitted.class, paneAutoSubmitted);
        }

        private PaneAutoSubmitted() {
        }

        private void clearAutoSubmittedAction() {
            this.autoSubmittedAction_ = 0;
        }

        private void clearPaneNodeId() {
            this.paneNodeId_ = getDefaultInstance().getPaneNodeId();
        }

        public static PaneAutoSubmitted getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6142a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PaneAutoSubmitted parseDelimitedFrom(InputStream inputStream) {
            return (PaneAutoSubmitted) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PaneAutoSubmitted parseFrom(ByteBuffer byteBuffer) {
            return (PaneAutoSubmitted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<PaneAutoSubmitted> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAutoSubmittedAction(Common$PaneAutoSubmitOptions.EnumC6454a enumC6454a) {
            this.autoSubmittedAction_ = enumC6454a.getNumber();
        }

        private void setAutoSubmittedActionValue(int i) {
            this.autoSubmittedAction_ = i;
        }

        private void setPaneNodeId(String str) {
            str.getClass();
            this.paneNodeId_ = str;
        }

        private void setPaneNodeIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.paneNodeId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new PaneAutoSubmitted();
                case 2:
                    return new C6142a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"paneNodeId_", "autoSubmittedAction_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PaneAutoSubmitted> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (PaneAutoSubmitted.class) {
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

        public Common$PaneAutoSubmitOptions.EnumC6454a getAutoSubmittedAction() {
            Common$PaneAutoSubmitOptions.EnumC6454a enumC6454aForNumber = Common$PaneAutoSubmitOptions.EnumC6454a.forNumber(this.autoSubmittedAction_);
            return enumC6454aForNumber == null ? Common$PaneAutoSubmitOptions.EnumC6454a.UNRECOGNIZED : enumC6454aForNumber;
        }

        public int getAutoSubmittedActionValue() {
            return this.autoSubmittedAction_;
        }

        public String getPaneNodeId() {
            return this.paneNodeId_;
        }

        public ByteString getPaneNodeIdBytes() {
            return ByteString.copyFromUtf8(this.paneNodeId_);
        }

        public static C6142a newBuilder(PaneAutoSubmitted paneAutoSubmitted) {
            return DEFAULT_INSTANCE.createBuilder(paneAutoSubmitted);
        }

        public static PaneAutoSubmitted parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneAutoSubmitted) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PaneAutoSubmitted parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneAutoSubmitted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PaneAutoSubmitted parseFrom(ByteString byteString) {
            return (PaneAutoSubmitted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PaneAutoSubmitted parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneAutoSubmitted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PaneAutoSubmitted parseFrom(byte[] bArr) {
            return (PaneAutoSubmitted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PaneAutoSubmitted parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneAutoSubmitted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PaneAutoSubmitted parseFrom(InputStream inputStream) {
            return (PaneAutoSubmitted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PaneAutoSubmitted parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneAutoSubmitted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PaneAutoSubmitted parseFrom(CodedInputStream codedInputStream) {
            return (PaneAutoSubmitted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PaneAutoSubmitted parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneAutoSubmitted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PasskeyEvent extends GeneratedMessageLite<PasskeyEvent, C6149a> implements MessageLiteOrBuilder {
        public static final int CHALLENGE_GET_FIELD_NUMBER = 3;
        public static final int CLICK_CONTINUE_FIELD_NUMBER = 1;
        public static final int CLICK_SKIP_FIELD_NUMBER = 2;
        private static final PasskeyEvent DEFAULT_INSTANCE;
        private static volatile Parser<PasskeyEvent> PARSER = null;
        public static final int PASSKEY_COMPLETE_FIELD_NUMBER = 4;
        public static final int RENDER_OOPWV_FIELD_NUMBER = 5;
        public static final int WEB_AUTHN_FIELD_NUMBER = 6;
        private int dataCase_ = 0;
        private Object data_;

        public static final class ChallengeGet extends GeneratedMessageLite<ChallengeGet, C6143a> implements MessageLiteOrBuilder {
            private static final ChallengeGet DEFAULT_INSTANCE;
            public static final int DURATION_MS_FIELD_NUMBER = 1;
            public static final int ERROR_FIELD_NUMBER = 2;
            public static final int EXPERIENCE_TYPE_FIELD_NUMBER = 3;
            public static final int IS_ERROR_FIELD_NUMBER = 4;
            private static volatile Parser<ChallengeGet> PARSER;
            private long durationMs_;
            private String error_ = "";
            private String experienceType_ = "";
            private boolean isError_;

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$PasskeyEvent$ChallengeGet$a */
            public static final class C6143a extends GeneratedMessageLite.Builder<ChallengeGet, C6143a> implements MessageLiteOrBuilder {
                public C6143a() {
                    super(ChallengeGet.DEFAULT_INSTANCE);
                }
            }

            static {
                ChallengeGet challengeGet = new ChallengeGet();
                DEFAULT_INSTANCE = challengeGet;
                GeneratedMessageLite.registerDefaultInstance(ChallengeGet.class, challengeGet);
            }

            private ChallengeGet() {
            }

            private void clearDurationMs() {
                this.durationMs_ = 0L;
            }

            private void clearError() {
                this.error_ = getDefaultInstance().getError();
            }

            private void clearExperienceType() {
                this.experienceType_ = getDefaultInstance().getExperienceType();
            }

            private void clearIsError() {
                this.isError_ = false;
            }

            public static ChallengeGet getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6143a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ChallengeGet parseDelimitedFrom(InputStream inputStream) {
                return (ChallengeGet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ChallengeGet parseFrom(ByteBuffer byteBuffer) {
                return (ChallengeGet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ChallengeGet> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setDurationMs(long j) {
                this.durationMs_ = j;
            }

            private void setError(String str) {
                str.getClass();
                this.error_ = str;
            }

            private void setErrorBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.error_ = byteString.toStringUtf8();
            }

            private void setExperienceType(String str) {
                str.getClass();
                this.experienceType_ = str;
            }

            private void setExperienceTypeBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.experienceType_ = byteString.toStringUtf8();
            }

            private void setIsError(boolean z) {
                this.isError_ = z;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ChallengeGet();
                    case 2:
                        return new C6143a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003Ȉ\u0004\u0007", new Object[]{"durationMs_", "error_", "experienceType_", "isError_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ChallengeGet> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ChallengeGet.class) {
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

            public long getDurationMs() {
                return this.durationMs_;
            }

            public String getError() {
                return this.error_;
            }

            public ByteString getErrorBytes() {
                return ByteString.copyFromUtf8(this.error_);
            }

            public String getExperienceType() {
                return this.experienceType_;
            }

            public ByteString getExperienceTypeBytes() {
                return ByteString.copyFromUtf8(this.experienceType_);
            }

            public boolean getIsError() {
                return this.isError_;
            }

            public static C6143a newBuilder(ChallengeGet challengeGet) {
                return DEFAULT_INSTANCE.createBuilder(challengeGet);
            }

            public static ChallengeGet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ChallengeGet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ChallengeGet parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ChallengeGet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ChallengeGet parseFrom(ByteString byteString) {
                return (ChallengeGet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ChallengeGet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ChallengeGet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ChallengeGet parseFrom(byte[] bArr) {
                return (ChallengeGet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ChallengeGet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ChallengeGet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ChallengeGet parseFrom(InputStream inputStream) {
                return (ChallengeGet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ChallengeGet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ChallengeGet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ChallengeGet parseFrom(CodedInputStream codedInputStream) {
                return (ChallengeGet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ChallengeGet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ChallengeGet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ClickContinue extends GeneratedMessageLite<ClickContinue, C6144a> implements MessageLiteOrBuilder {
            private static final ClickContinue DEFAULT_INSTANCE;
            public static final int EXPERIENCE_TYPE_FIELD_NUMBER = 2;
            private static volatile Parser<ClickContinue> PARSER = null;
            public static final int WEBVIEW_TYPE_FIELD_NUMBER = 1;
            private String webviewType_ = "";
            private String experienceType_ = "";

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$PasskeyEvent$ClickContinue$a */
            public static final class C6144a extends GeneratedMessageLite.Builder<ClickContinue, C6144a> implements MessageLiteOrBuilder {
                public C6144a() {
                    super(ClickContinue.DEFAULT_INSTANCE);
                }
            }

            static {
                ClickContinue clickContinue = new ClickContinue();
                DEFAULT_INSTANCE = clickContinue;
                GeneratedMessageLite.registerDefaultInstance(ClickContinue.class, clickContinue);
            }

            private ClickContinue() {
            }

            private void clearExperienceType() {
                this.experienceType_ = getDefaultInstance().getExperienceType();
            }

            private void clearWebviewType() {
                this.webviewType_ = getDefaultInstance().getWebviewType();
            }

            public static ClickContinue getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6144a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ClickContinue parseDelimitedFrom(InputStream inputStream) {
                return (ClickContinue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ClickContinue parseFrom(ByteBuffer byteBuffer) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ClickContinue> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setExperienceType(String str) {
                str.getClass();
                this.experienceType_ = str;
            }

            private void setExperienceTypeBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.experienceType_ = byteString.toStringUtf8();
            }

            private void setWebviewType(String str) {
                str.getClass();
                this.webviewType_ = str;
            }

            private void setWebviewTypeBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.webviewType_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ClickContinue();
                    case 2:
                        return new C6144a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"webviewType_", "experienceType_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ClickContinue> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ClickContinue.class) {
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

            public String getExperienceType() {
                return this.experienceType_;
            }

            public ByteString getExperienceTypeBytes() {
                return ByteString.copyFromUtf8(this.experienceType_);
            }

            public String getWebviewType() {
                return this.webviewType_;
            }

            public ByteString getWebviewTypeBytes() {
                return ByteString.copyFromUtf8(this.webviewType_);
            }

            public static C6144a newBuilder(ClickContinue clickContinue) {
                return DEFAULT_INSTANCE.createBuilder(clickContinue);
            }

            public static ClickContinue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickContinue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ClickContinue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ClickContinue parseFrom(ByteString byteString) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ClickContinue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ClickContinue parseFrom(byte[] bArr) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ClickContinue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ClickContinue parseFrom(InputStream inputStream) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ClickContinue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ClickContinue parseFrom(CodedInputStream codedInputStream) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ClickContinue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickContinue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ClickSkip extends GeneratedMessageLite<ClickSkip, C6145a> implements MessageLiteOrBuilder {
            private static final ClickSkip DEFAULT_INSTANCE;
            public static final int EXPERIENCE_TYPE_FIELD_NUMBER = 1;
            private static volatile Parser<ClickSkip> PARSER;
            private String experienceType_ = "";

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$PasskeyEvent$ClickSkip$a */
            public static final class C6145a extends GeneratedMessageLite.Builder<ClickSkip, C6145a> implements MessageLiteOrBuilder {
                public C6145a() {
                    super(ClickSkip.DEFAULT_INSTANCE);
                }
            }

            static {
                ClickSkip clickSkip = new ClickSkip();
                DEFAULT_INSTANCE = clickSkip;
                GeneratedMessageLite.registerDefaultInstance(ClickSkip.class, clickSkip);
            }

            private ClickSkip() {
            }

            private void clearExperienceType() {
                this.experienceType_ = getDefaultInstance().getExperienceType();
            }

            public static ClickSkip getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6145a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ClickSkip parseDelimitedFrom(InputStream inputStream) {
                return (ClickSkip) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ClickSkip parseFrom(ByteBuffer byteBuffer) {
                return (ClickSkip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ClickSkip> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setExperienceType(String str) {
                str.getClass();
                this.experienceType_ = str;
            }

            private void setExperienceTypeBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.experienceType_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ClickSkip();
                    case 2:
                        return new C6145a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"experienceType_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ClickSkip> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ClickSkip.class) {
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

            public String getExperienceType() {
                return this.experienceType_;
            }

            public ByteString getExperienceTypeBytes() {
                return ByteString.copyFromUtf8(this.experienceType_);
            }

            public static C6145a newBuilder(ClickSkip clickSkip) {
                return DEFAULT_INSTANCE.createBuilder(clickSkip);
            }

            public static ClickSkip parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickSkip) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ClickSkip parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickSkip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ClickSkip parseFrom(ByteString byteString) {
                return (ClickSkip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ClickSkip parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickSkip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ClickSkip parseFrom(byte[] bArr) {
                return (ClickSkip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ClickSkip parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickSkip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ClickSkip parseFrom(InputStream inputStream) {
                return (ClickSkip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ClickSkip parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickSkip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ClickSkip parseFrom(CodedInputStream codedInputStream) {
                return (ClickSkip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ClickSkip parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ClickSkip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class PasskeyComplete extends GeneratedMessageLite<PasskeyComplete, C6146a> implements MessageLiteOrBuilder {
            private static final PasskeyComplete DEFAULT_INSTANCE;
            public static final int DURATION_MS_FIELD_NUMBER = 1;
            public static final int ERROR_FIELD_NUMBER = 2;
            public static final int EXPERIENCE_TYPE_FIELD_NUMBER = 3;
            public static final int IS_ERROR_FIELD_NUMBER = 4;
            private static volatile Parser<PasskeyComplete> PARSER;
            private long durationMs_;
            private String error_ = "";
            private String experienceType_ = "";
            private boolean isError_;

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$PasskeyEvent$PasskeyComplete$a */
            public static final class C6146a extends GeneratedMessageLite.Builder<PasskeyComplete, C6146a> implements MessageLiteOrBuilder {
                public C6146a() {
                    super(PasskeyComplete.DEFAULT_INSTANCE);
                }
            }

            static {
                PasskeyComplete passkeyComplete = new PasskeyComplete();
                DEFAULT_INSTANCE = passkeyComplete;
                GeneratedMessageLite.registerDefaultInstance(PasskeyComplete.class, passkeyComplete);
            }

            private PasskeyComplete() {
            }

            private void clearDurationMs() {
                this.durationMs_ = 0L;
            }

            private void clearError() {
                this.error_ = getDefaultInstance().getError();
            }

            private void clearExperienceType() {
                this.experienceType_ = getDefaultInstance().getExperienceType();
            }

            private void clearIsError() {
                this.isError_ = false;
            }

            public static PasskeyComplete getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6146a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static PasskeyComplete parseDelimitedFrom(InputStream inputStream) {
                return (PasskeyComplete) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PasskeyComplete parseFrom(ByteBuffer byteBuffer) {
                return (PasskeyComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<PasskeyComplete> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setDurationMs(long j) {
                this.durationMs_ = j;
            }

            private void setError(String str) {
                str.getClass();
                this.error_ = str;
            }

            private void setErrorBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.error_ = byteString.toStringUtf8();
            }

            private void setExperienceType(String str) {
                str.getClass();
                this.experienceType_ = str;
            }

            private void setExperienceTypeBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.experienceType_ = byteString.toStringUtf8();
            }

            private void setIsError(boolean z) {
                this.isError_ = z;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new PasskeyComplete();
                    case 2:
                        return new C6146a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003Ȉ\u0004\u0007", new Object[]{"durationMs_", "error_", "experienceType_", "isError_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<PasskeyComplete> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (PasskeyComplete.class) {
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

            public long getDurationMs() {
                return this.durationMs_;
            }

            public String getError() {
                return this.error_;
            }

            public ByteString getErrorBytes() {
                return ByteString.copyFromUtf8(this.error_);
            }

            public String getExperienceType() {
                return this.experienceType_;
            }

            public ByteString getExperienceTypeBytes() {
                return ByteString.copyFromUtf8(this.experienceType_);
            }

            public boolean getIsError() {
                return this.isError_;
            }

            public static C6146a newBuilder(PasskeyComplete passkeyComplete) {
                return DEFAULT_INSTANCE.createBuilder(passkeyComplete);
            }

            public static PasskeyComplete parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PasskeyComplete) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PasskeyComplete parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (PasskeyComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static PasskeyComplete parseFrom(ByteString byteString) {
                return (PasskeyComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static PasskeyComplete parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (PasskeyComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static PasskeyComplete parseFrom(byte[] bArr) {
                return (PasskeyComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static PasskeyComplete parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (PasskeyComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static PasskeyComplete parseFrom(InputStream inputStream) {
                return (PasskeyComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PasskeyComplete parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PasskeyComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PasskeyComplete parseFrom(CodedInputStream codedInputStream) {
                return (PasskeyComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static PasskeyComplete parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PasskeyComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class RenderOOPWV extends GeneratedMessageLite<RenderOOPWV, C6147a> implements MessageLiteOrBuilder {
            private static final RenderOOPWV DEFAULT_INSTANCE;
            public static final int EXPERIENCE_TYPE_FIELD_NUMBER = 1;
            private static volatile Parser<RenderOOPWV> PARSER;
            private String experienceType_ = "";

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$PasskeyEvent$RenderOOPWV$a */
            public static final class C6147a extends GeneratedMessageLite.Builder<RenderOOPWV, C6147a> implements MessageLiteOrBuilder {
                public C6147a() {
                    super(RenderOOPWV.DEFAULT_INSTANCE);
                }
            }

            static {
                RenderOOPWV renderOOPWV = new RenderOOPWV();
                DEFAULT_INSTANCE = renderOOPWV;
                GeneratedMessageLite.registerDefaultInstance(RenderOOPWV.class, renderOOPWV);
            }

            private RenderOOPWV() {
            }

            private void clearExperienceType() {
                this.experienceType_ = getDefaultInstance().getExperienceType();
            }

            public static RenderOOPWV getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6147a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static RenderOOPWV parseDelimitedFrom(InputStream inputStream) {
                return (RenderOOPWV) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static RenderOOPWV parseFrom(ByteBuffer byteBuffer) {
                return (RenderOOPWV) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<RenderOOPWV> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setExperienceType(String str) {
                str.getClass();
                this.experienceType_ = str;
            }

            private void setExperienceTypeBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.experienceType_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new RenderOOPWV();
                    case 2:
                        return new C6147a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"experienceType_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<RenderOOPWV> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (RenderOOPWV.class) {
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

            public String getExperienceType() {
                return this.experienceType_;
            }

            public ByteString getExperienceTypeBytes() {
                return ByteString.copyFromUtf8(this.experienceType_);
            }

            public static C6147a newBuilder(RenderOOPWV renderOOPWV) {
                return DEFAULT_INSTANCE.createBuilder(renderOOPWV);
            }

            public static RenderOOPWV parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (RenderOOPWV) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static RenderOOPWV parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (RenderOOPWV) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static RenderOOPWV parseFrom(ByteString byteString) {
                return (RenderOOPWV) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static RenderOOPWV parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (RenderOOPWV) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static RenderOOPWV parseFrom(byte[] bArr) {
                return (RenderOOPWV) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static RenderOOPWV parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (RenderOOPWV) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static RenderOOPWV parseFrom(InputStream inputStream) {
                return (RenderOOPWV) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static RenderOOPWV parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (RenderOOPWV) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static RenderOOPWV parseFrom(CodedInputStream codedInputStream) {
                return (RenderOOPWV) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static RenderOOPWV parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (RenderOOPWV) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class WebAuthn extends GeneratedMessageLite<WebAuthn, C6148a> implements MessageLiteOrBuilder {
            private static final WebAuthn DEFAULT_INSTANCE;
            public static final int DURATION_MS_FIELD_NUMBER = 1;
            public static final int ERROR_FIELD_NUMBER = 2;
            public static final int EXPERIENCE_TYPE_FIELD_NUMBER = 3;
            public static final int IS_ERROR_FIELD_NUMBER = 4;
            private static volatile Parser<WebAuthn> PARSER;
            private long durationMs_;
            private String error_ = "";
            private String experienceType_ = "";
            private boolean isError_;

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$PasskeyEvent$WebAuthn$a */
            public static final class C6148a extends GeneratedMessageLite.Builder<WebAuthn, C6148a> implements MessageLiteOrBuilder {
                public C6148a() {
                    super(WebAuthn.DEFAULT_INSTANCE);
                }
            }

            static {
                WebAuthn webAuthn = new WebAuthn();
                DEFAULT_INSTANCE = webAuthn;
                GeneratedMessageLite.registerDefaultInstance(WebAuthn.class, webAuthn);
            }

            private WebAuthn() {
            }

            private void clearDurationMs() {
                this.durationMs_ = 0L;
            }

            private void clearError() {
                this.error_ = getDefaultInstance().getError();
            }

            private void clearExperienceType() {
                this.experienceType_ = getDefaultInstance().getExperienceType();
            }

            private void clearIsError() {
                this.isError_ = false;
            }

            public static WebAuthn getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6148a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static WebAuthn parseDelimitedFrom(InputStream inputStream) {
                return (WebAuthn) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static WebAuthn parseFrom(ByteBuffer byteBuffer) {
                return (WebAuthn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<WebAuthn> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setDurationMs(long j) {
                this.durationMs_ = j;
            }

            private void setError(String str) {
                str.getClass();
                this.error_ = str;
            }

            private void setErrorBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.error_ = byteString.toStringUtf8();
            }

            private void setExperienceType(String str) {
                str.getClass();
                this.experienceType_ = str;
            }

            private void setExperienceTypeBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.experienceType_ = byteString.toStringUtf8();
            }

            private void setIsError(boolean z) {
                this.isError_ = z;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new WebAuthn();
                    case 2:
                        return new C6148a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003Ȉ\u0004\u0007", new Object[]{"durationMs_", "error_", "experienceType_", "isError_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<WebAuthn> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (WebAuthn.class) {
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

            public long getDurationMs() {
                return this.durationMs_;
            }

            public String getError() {
                return this.error_;
            }

            public ByteString getErrorBytes() {
                return ByteString.copyFromUtf8(this.error_);
            }

            public String getExperienceType() {
                return this.experienceType_;
            }

            public ByteString getExperienceTypeBytes() {
                return ByteString.copyFromUtf8(this.experienceType_);
            }

            public boolean getIsError() {
                return this.isError_;
            }

            public static C6148a newBuilder(WebAuthn webAuthn) {
                return DEFAULT_INSTANCE.createBuilder(webAuthn);
            }

            public static WebAuthn parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (WebAuthn) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static WebAuthn parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (WebAuthn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static WebAuthn parseFrom(ByteString byteString) {
                return (WebAuthn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static WebAuthn parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (WebAuthn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static WebAuthn parseFrom(byte[] bArr) {
                return (WebAuthn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static WebAuthn parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (WebAuthn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static WebAuthn parseFrom(InputStream inputStream) {
                return (WebAuthn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static WebAuthn parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (WebAuthn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static WebAuthn parseFrom(CodedInputStream codedInputStream) {
                return (WebAuthn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static WebAuthn parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (WebAuthn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$PasskeyEvent$a */
        public static final class C6149a extends GeneratedMessageLite.Builder<PasskeyEvent, C6149a> implements MessageLiteOrBuilder {
            public C6149a() {
                super(PasskeyEvent.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$PasskeyEvent$b */
        public enum EnumC6150b {
            CLICK_CONTINUE(1),
            CLICK_SKIP(2),
            CHALLENGE_GET(3),
            PASSKEY_COMPLETE(4),
            RENDER_OOPWV(5),
            WEB_AUTHN(6),
            DATA_NOT_SET(0);


            /* renamed from: a */
            public final int f2079a;

            EnumC6150b(int i) {
                this.f2079a = i;
            }

            public static EnumC6150b forNumber(int i) {
                switch (i) {
                    case 0:
                        return DATA_NOT_SET;
                    case 1:
                        return CLICK_CONTINUE;
                    case 2:
                        return CLICK_SKIP;
                    case 3:
                        return CHALLENGE_GET;
                    case 4:
                        return PASSKEY_COMPLETE;
                    case 5:
                        return RENDER_OOPWV;
                    case 6:
                        return WEB_AUTHN;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.f2079a;
            }

            @Deprecated
            public static EnumC6150b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            PasskeyEvent passkeyEvent = new PasskeyEvent();
            DEFAULT_INSTANCE = passkeyEvent;
            GeneratedMessageLite.registerDefaultInstance(PasskeyEvent.class, passkeyEvent);
        }

        private PasskeyEvent() {
        }

        private void clearChallengeGet() {
            if (this.dataCase_ == 3) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        private void clearClickContinue() {
            if (this.dataCase_ == 1) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        private void clearClickSkip() {
            if (this.dataCase_ == 2) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        private void clearData() {
            this.dataCase_ = 0;
            this.data_ = null;
        }

        private void clearPasskeyComplete() {
            if (this.dataCase_ == 4) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        private void clearRenderOopwv() {
            if (this.dataCase_ == 5) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        private void clearWebAuthn() {
            if (this.dataCase_ == 6) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        public static PasskeyEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeChallengeGet(ChallengeGet challengeGet) {
            challengeGet.getClass();
            if (this.dataCase_ != 3 || this.data_ == ChallengeGet.getDefaultInstance()) {
                this.data_ = challengeGet;
            } else {
                this.data_ = ChallengeGet.newBuilder((ChallengeGet) this.data_).mergeFrom((ChallengeGet.C6143a) challengeGet).buildPartial();
            }
            this.dataCase_ = 3;
        }

        private void mergeClickContinue(ClickContinue clickContinue) {
            clickContinue.getClass();
            if (this.dataCase_ != 1 || this.data_ == ClickContinue.getDefaultInstance()) {
                this.data_ = clickContinue;
            } else {
                this.data_ = ClickContinue.newBuilder((ClickContinue) this.data_).mergeFrom((ClickContinue.C6144a) clickContinue).buildPartial();
            }
            this.dataCase_ = 1;
        }

        private void mergeClickSkip(ClickSkip clickSkip) {
            clickSkip.getClass();
            if (this.dataCase_ != 2 || this.data_ == ClickSkip.getDefaultInstance()) {
                this.data_ = clickSkip;
            } else {
                this.data_ = ClickSkip.newBuilder((ClickSkip) this.data_).mergeFrom((ClickSkip.C6145a) clickSkip).buildPartial();
            }
            this.dataCase_ = 2;
        }

        private void mergePasskeyComplete(PasskeyComplete passkeyComplete) {
            passkeyComplete.getClass();
            if (this.dataCase_ != 4 || this.data_ == PasskeyComplete.getDefaultInstance()) {
                this.data_ = passkeyComplete;
            } else {
                this.data_ = PasskeyComplete.newBuilder((PasskeyComplete) this.data_).mergeFrom((PasskeyComplete.C6146a) passkeyComplete).buildPartial();
            }
            this.dataCase_ = 4;
        }

        private void mergeRenderOopwv(RenderOOPWV renderOOPWV) {
            renderOOPWV.getClass();
            if (this.dataCase_ != 5 || this.data_ == RenderOOPWV.getDefaultInstance()) {
                this.data_ = renderOOPWV;
            } else {
                this.data_ = RenderOOPWV.newBuilder((RenderOOPWV) this.data_).mergeFrom((RenderOOPWV.C6147a) renderOOPWV).buildPartial();
            }
            this.dataCase_ = 5;
        }

        private void mergeWebAuthn(WebAuthn webAuthn) {
            webAuthn.getClass();
            if (this.dataCase_ != 6 || this.data_ == WebAuthn.getDefaultInstance()) {
                this.data_ = webAuthn;
            } else {
                this.data_ = WebAuthn.newBuilder((WebAuthn) this.data_).mergeFrom((WebAuthn.C6148a) webAuthn).buildPartial();
            }
            this.dataCase_ = 6;
        }

        public static C6149a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PasskeyEvent parseDelimitedFrom(InputStream inputStream) {
            return (PasskeyEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PasskeyEvent parseFrom(ByteBuffer byteBuffer) {
            return (PasskeyEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<PasskeyEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setChallengeGet(ChallengeGet challengeGet) {
            challengeGet.getClass();
            this.data_ = challengeGet;
            this.dataCase_ = 3;
        }

        private void setClickContinue(ClickContinue clickContinue) {
            clickContinue.getClass();
            this.data_ = clickContinue;
            this.dataCase_ = 1;
        }

        private void setClickSkip(ClickSkip clickSkip) {
            clickSkip.getClass();
            this.data_ = clickSkip;
            this.dataCase_ = 2;
        }

        private void setPasskeyComplete(PasskeyComplete passkeyComplete) {
            passkeyComplete.getClass();
            this.data_ = passkeyComplete;
            this.dataCase_ = 4;
        }

        private void setRenderOopwv(RenderOOPWV renderOOPWV) {
            renderOOPWV.getClass();
            this.data_ = renderOOPWV;
            this.dataCase_ = 5;
        }

        private void setWebAuthn(WebAuthn webAuthn) {
            webAuthn.getClass();
            this.data_ = webAuthn;
            this.dataCase_ = 6;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new PasskeyEvent();
                case 2:
                    return new C6149a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"data_", "dataCase_", ClickContinue.class, ClickSkip.class, ChallengeGet.class, PasskeyComplete.class, RenderOOPWV.class, WebAuthn.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PasskeyEvent> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (PasskeyEvent.class) {
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

        public ChallengeGet getChallengeGet() {
            return this.dataCase_ == 3 ? (ChallengeGet) this.data_ : ChallengeGet.getDefaultInstance();
        }

        public ClickContinue getClickContinue() {
            return this.dataCase_ == 1 ? (ClickContinue) this.data_ : ClickContinue.getDefaultInstance();
        }

        public ClickSkip getClickSkip() {
            return this.dataCase_ == 2 ? (ClickSkip) this.data_ : ClickSkip.getDefaultInstance();
        }

        public EnumC6150b getDataCase() {
            return EnumC6150b.forNumber(this.dataCase_);
        }

        public PasskeyComplete getPasskeyComplete() {
            return this.dataCase_ == 4 ? (PasskeyComplete) this.data_ : PasskeyComplete.getDefaultInstance();
        }

        public RenderOOPWV getRenderOopwv() {
            return this.dataCase_ == 5 ? (RenderOOPWV) this.data_ : RenderOOPWV.getDefaultInstance();
        }

        public WebAuthn getWebAuthn() {
            return this.dataCase_ == 6 ? (WebAuthn) this.data_ : WebAuthn.getDefaultInstance();
        }

        public boolean hasChallengeGet() {
            return this.dataCase_ == 3;
        }

        public boolean hasClickContinue() {
            return this.dataCase_ == 1;
        }

        public boolean hasClickSkip() {
            return this.dataCase_ == 2;
        }

        public boolean hasPasskeyComplete() {
            return this.dataCase_ == 4;
        }

        public boolean hasRenderOopwv() {
            return this.dataCase_ == 5;
        }

        public boolean hasWebAuthn() {
            return this.dataCase_ == 6;
        }

        public static C6149a newBuilder(PasskeyEvent passkeyEvent) {
            return DEFAULT_INSTANCE.createBuilder(passkeyEvent);
        }

        public static PasskeyEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PasskeyEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PasskeyEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (PasskeyEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PasskeyEvent parseFrom(ByteString byteString) {
            return (PasskeyEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PasskeyEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (PasskeyEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PasskeyEvent parseFrom(byte[] bArr) {
            return (PasskeyEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PasskeyEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (PasskeyEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PasskeyEvent parseFrom(InputStream inputStream) {
            return (PasskeyEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PasskeyEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PasskeyEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PasskeyEvent parseFrom(CodedInputStream codedInputStream) {
            return (PasskeyEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PasskeyEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PasskeyEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PasskeyResult extends GeneratedMessageLite<PasskeyResult, C6151a> implements MessageLiteOrBuilder {
        private static final PasskeyResult DEFAULT_INSTANCE;
        public static final int DURATION_MS_FIELD_NUMBER = 1;
        public static final int ERROR_FIELD_NUMBER = 2;
        private static volatile Parser<PasskeyResult> PARSER;
        private long durationMs_;
        private boolean error_;

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$PasskeyResult$a */
        public static final class C6151a extends GeneratedMessageLite.Builder<PasskeyResult, C6151a> implements MessageLiteOrBuilder {
            public C6151a() {
                super(PasskeyResult.DEFAULT_INSTANCE);
            }
        }

        static {
            PasskeyResult passkeyResult = new PasskeyResult();
            DEFAULT_INSTANCE = passkeyResult;
            GeneratedMessageLite.registerDefaultInstance(PasskeyResult.class, passkeyResult);
        }

        private PasskeyResult() {
        }

        private void clearDurationMs() {
            this.durationMs_ = 0L;
        }

        private void clearError() {
            this.error_ = false;
        }

        public static PasskeyResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6151a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PasskeyResult parseDelimitedFrom(InputStream inputStream) {
            return (PasskeyResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PasskeyResult parseFrom(ByteBuffer byteBuffer) {
            return (PasskeyResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<PasskeyResult> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDurationMs(long j) {
            this.durationMs_ = j;
        }

        private void setError(boolean z) {
            this.error_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new PasskeyResult();
                case 2:
                    return new C6151a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0007", new Object[]{"durationMs_", "error_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PasskeyResult> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (PasskeyResult.class) {
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

        public long getDurationMs() {
            return this.durationMs_;
        }

        public boolean getError() {
            return this.error_;
        }

        public static C6151a newBuilder(PasskeyResult passkeyResult) {
            return DEFAULT_INSTANCE.createBuilder(passkeyResult);
        }

        public static PasskeyResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PasskeyResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PasskeyResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (PasskeyResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PasskeyResult parseFrom(ByteString byteString) {
            return (PasskeyResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PasskeyResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (PasskeyResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PasskeyResult parseFrom(byte[] bArr) {
            return (PasskeyResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PasskeyResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (PasskeyResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PasskeyResult parseFrom(InputStream inputStream) {
            return (PasskeyResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PasskeyResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PasskeyResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PasskeyResult parseFrom(CodedInputStream codedInputStream) {
            return (PasskeyResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PasskeyResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PasskeyResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PayrollSearchPane extends GeneratedMessageLite<PayrollSearchPane, C6152a> implements MessageLiteOrBuilder {
        private static final PayrollSearchPane DEFAULT_INSTANCE;
        private static volatile Parser<PayrollSearchPane> PARSER = null;
        public static final int PARTNER_FIELD_NUMBER = 2;
        public static final int TOKEN_FIELD_NUMBER = 1;
        private String partner_ = "";
        private String token_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$PayrollSearchPane$a */
        public static final class C6152a extends GeneratedMessageLite.Builder<PayrollSearchPane, C6152a> implements MessageLiteOrBuilder {
            public C6152a() {
                super(PayrollSearchPane.DEFAULT_INSTANCE);
            }
        }

        static {
            PayrollSearchPane payrollSearchPane = new PayrollSearchPane();
            DEFAULT_INSTANCE = payrollSearchPane;
            GeneratedMessageLite.registerDefaultInstance(PayrollSearchPane.class, payrollSearchPane);
        }

        private PayrollSearchPane() {
        }

        private void clearPartner() {
            this.partner_ = getDefaultInstance().getPartner();
        }

        private void clearToken() {
            this.token_ = getDefaultInstance().getToken();
        }

        public static PayrollSearchPane getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6152a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PayrollSearchPane parseDelimitedFrom(InputStream inputStream) {
            return (PayrollSearchPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PayrollSearchPane parseFrom(ByteBuffer byteBuffer) {
            return (PayrollSearchPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<PayrollSearchPane> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setPartner(String str) {
            str.getClass();
            this.partner_ = str;
        }

        private void setPartnerBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.partner_ = byteString.toStringUtf8();
        }

        private void setToken(String str) {
            str.getClass();
            this.token_ = str;
        }

        private void setTokenBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.token_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new PayrollSearchPane();
                case 2:
                    return new C6152a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"token_", "partner_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PayrollSearchPane> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (PayrollSearchPane.class) {
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

        public String getPartner() {
            return this.partner_;
        }

        public ByteString getPartnerBytes() {
            return ByteString.copyFromUtf8(this.partner_);
        }

        public String getToken() {
            return this.token_;
        }

        public ByteString getTokenBytes() {
            return ByteString.copyFromUtf8(this.token_);
        }

        public static C6152a newBuilder(PayrollSearchPane payrollSearchPane) {
            return DEFAULT_INSTANCE.createBuilder(payrollSearchPane);
        }

        public static PayrollSearchPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PayrollSearchPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PayrollSearchPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (PayrollSearchPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PayrollSearchPane parseFrom(ByteString byteString) {
            return (PayrollSearchPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PayrollSearchPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (PayrollSearchPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PayrollSearchPane parseFrom(byte[] bArr) {
            return (PayrollSearchPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PayrollSearchPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (PayrollSearchPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PayrollSearchPane parseFrom(InputStream inputStream) {
            return (PayrollSearchPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PayrollSearchPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PayrollSearchPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PayrollSearchPane parseFrom(CodedInputStream codedInputStream) {
            return (PayrollSearchPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PayrollSearchPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PayrollSearchPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SearchSuccess extends GeneratedMessageLite<SearchSuccess, C6154a> implements MessageLiteOrBuilder {
        private static final SearchSuccess DEFAULT_INSTANCE;
        private static volatile Parser<SearchSuccess> PARSER = null;
        public static final int QUERY_FIELD_NUMBER = 1;
        public static final int RESULTS_FIELD_NUMBER = 3;
        public static final int RESULT_COUNT_FIELD_NUMBER = 2;
        public static final int WORKFLOW_SEARCH_LATENCY_MS_FIELD_NUMBER = 4;
        private long resultCount_;
        private long workflowSearchLatencyMs_;
        private String query_ = "";
        private Internal.ProtobufList<Result> results_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Result extends GeneratedMessageLite<Result, C6153a> implements InterfaceC6155b {
            private static final Result DEFAULT_INSTANCE;
            public static final int INSTITUTION_ID_FIELD_NUMBER = 1;
            private static volatile Parser<Result> PARSER;
            private String institutionId_ = "";

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$SearchSuccess$Result$a */
            public static final class C6153a extends GeneratedMessageLite.Builder<Result, C6153a> implements InterfaceC6155b {
                public C6153a() {
                    super(Result.DEFAULT_INSTANCE);
                }
            }

            static {
                Result result = new Result();
                DEFAULT_INSTANCE = result;
                GeneratedMessageLite.registerDefaultInstance(Result.class, result);
            }

            private Result() {
            }

            private void clearInstitutionId() {
                this.institutionId_ = getDefaultInstance().getInstitutionId();
            }

            public static Result getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6153a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Result parseDelimitedFrom(InputStream inputStream) {
                return (Result) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Result parseFrom(ByteBuffer byteBuffer) {
                return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Result> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setInstitutionId(String str) {
                str.getClass();
                this.institutionId_ = str;
            }

            private void setInstitutionIdBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.institutionId_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Result();
                    case 2:
                        return new C6153a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"institutionId_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Result> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Result.class) {
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

            public String getInstitutionId() {
                return this.institutionId_;
            }

            public ByteString getInstitutionIdBytes() {
                return ByteString.copyFromUtf8(this.institutionId_);
            }

            public static C6153a newBuilder(Result result) {
                return DEFAULT_INSTANCE.createBuilder(result);
            }

            public static Result parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Result) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Result parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Result parseFrom(ByteString byteString) {
                return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Result parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Result parseFrom(byte[] bArr) {
                return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Result parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Result parseFrom(InputStream inputStream) {
                return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Result parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Result parseFrom(CodedInputStream codedInputStream) {
                return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Result parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$SearchSuccess$a */
        public static final class C6154a extends GeneratedMessageLite.Builder<SearchSuccess, C6154a> implements MessageLiteOrBuilder {
            public C6154a() {
                super(SearchSuccess.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$SearchSuccess$b */
        public interface InterfaceC6155b extends MessageLiteOrBuilder {
        }

        static {
            SearchSuccess searchSuccess = new SearchSuccess();
            DEFAULT_INSTANCE = searchSuccess;
            GeneratedMessageLite.registerDefaultInstance(SearchSuccess.class, searchSuccess);
        }

        private SearchSuccess() {
        }

        private void addAllResults(Iterable<? extends Result> iterable) {
            ensureResultsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.results_);
        }

        private void addResults(Result result) {
            result.getClass();
            ensureResultsIsMutable();
            this.results_.add(result);
        }

        private void clearQuery() {
            this.query_ = getDefaultInstance().getQuery();
        }

        private void clearResultCount() {
            this.resultCount_ = 0L;
        }

        private void clearResults() {
            this.results_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearWorkflowSearchLatencyMs() {
            this.workflowSearchLatencyMs_ = 0L;
        }

        private void ensureResultsIsMutable() {
            Internal.ProtobufList<Result> protobufList = this.results_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.results_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static SearchSuccess getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6154a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SearchSuccess parseDelimitedFrom(InputStream inputStream) {
            return (SearchSuccess) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SearchSuccess parseFrom(ByteBuffer byteBuffer) {
            return (SearchSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SearchSuccess> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeResults(int i) {
            ensureResultsIsMutable();
            this.results_.remove(i);
        }

        private void setQuery(String str) {
            str.getClass();
            this.query_ = str;
        }

        private void setQueryBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.query_ = byteString.toStringUtf8();
        }

        private void setResultCount(long j) {
            this.resultCount_ = j;
        }

        private void setResults(int i, Result result) {
            result.getClass();
            ensureResultsIsMutable();
            this.results_.set(i, result);
        }

        private void setWorkflowSearchLatencyMs(long j) {
            this.workflowSearchLatencyMs_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new SearchSuccess();
                case 2:
                    return new C6154a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u0002\u0003\u001b\u0004\u0002", new Object[]{"query_", "resultCount_", "results_", Result.class, "workflowSearchLatencyMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SearchSuccess> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SearchSuccess.class) {
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

        public String getQuery() {
            return this.query_;
        }

        public ByteString getQueryBytes() {
            return ByteString.copyFromUtf8(this.query_);
        }

        public long getResultCount() {
            return this.resultCount_;
        }

        public Result getResults(int i) {
            return this.results_.get(i);
        }

        public int getResultsCount() {
            return this.results_.size();
        }

        public List<Result> getResultsList() {
            return this.results_;
        }

        public InterfaceC6155b getResultsOrBuilder(int i) {
            return this.results_.get(i);
        }

        public List<? extends InterfaceC6155b> getResultsOrBuilderList() {
            return this.results_;
        }

        public long getWorkflowSearchLatencyMs() {
            return this.workflowSearchLatencyMs_;
        }

        public static C6154a newBuilder(SearchSuccess searchSuccess) {
            return DEFAULT_INSTANCE.createBuilder(searchSuccess);
        }

        public static SearchSuccess parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SearchSuccess) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SearchSuccess parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SearchSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SearchSuccess parseFrom(ByteString byteString) {
            return (SearchSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void addResults(int i, Result result) {
            result.getClass();
            ensureResultsIsMutable();
            this.results_.add(i, result);
        }

        public static SearchSuccess parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SearchSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SearchSuccess parseFrom(byte[] bArr) {
            return (SearchSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SearchSuccess parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SearchSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SearchSuccess parseFrom(InputStream inputStream) {
            return (SearchSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SearchSuccess parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SearchSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SearchSuccess parseFrom(CodedInputStream codedInputStream) {
            return (SearchSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SearchSuccess parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SearchSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SecureInputToggle extends GeneratedMessageLite<SecureInputToggle, C6156a> implements MessageLiteOrBuilder {
        private static final SecureInputToggle DEFAULT_INSTANCE;
        public static final int INPUT_ID_FIELD_NUMBER = 1;
        public static final int INPUT_MASKED_FIELD_NUMBER = 2;
        private static volatile Parser<SecureInputToggle> PARSER;
        private String inputId_ = "";
        private boolean inputMasked_;

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$SecureInputToggle$a */
        public static final class C6156a extends GeneratedMessageLite.Builder<SecureInputToggle, C6156a> implements MessageLiteOrBuilder {
            public C6156a() {
                super(SecureInputToggle.DEFAULT_INSTANCE);
            }
        }

        static {
            SecureInputToggle secureInputToggle = new SecureInputToggle();
            DEFAULT_INSTANCE = secureInputToggle;
            GeneratedMessageLite.registerDefaultInstance(SecureInputToggle.class, secureInputToggle);
        }

        private SecureInputToggle() {
        }

        private void clearInputId() {
            this.inputId_ = getDefaultInstance().getInputId();
        }

        private void clearInputMasked() {
            this.inputMasked_ = false;
        }

        public static SecureInputToggle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6156a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SecureInputToggle parseDelimitedFrom(InputStream inputStream) {
            return (SecureInputToggle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SecureInputToggle parseFrom(ByteBuffer byteBuffer) {
            return (SecureInputToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SecureInputToggle> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setInputId(String str) {
            str.getClass();
            this.inputId_ = str;
        }

        private void setInputIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.inputId_ = byteString.toStringUtf8();
        }

        private void setInputMasked(boolean z) {
            this.inputMasked_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new SecureInputToggle();
                case 2:
                    return new C6156a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"inputId_", "inputMasked_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SecureInputToggle> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SecureInputToggle.class) {
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

        public String getInputId() {
            return this.inputId_;
        }

        public ByteString getInputIdBytes() {
            return ByteString.copyFromUtf8(this.inputId_);
        }

        public boolean getInputMasked() {
            return this.inputMasked_;
        }

        public static C6156a newBuilder(SecureInputToggle secureInputToggle) {
            return DEFAULT_INSTANCE.createBuilder(secureInputToggle);
        }

        public static SecureInputToggle parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SecureInputToggle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SecureInputToggle parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SecureInputToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SecureInputToggle parseFrom(ByteString byteString) {
            return (SecureInputToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SecureInputToggle parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SecureInputToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SecureInputToggle parseFrom(byte[] bArr) {
            return (SecureInputToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SecureInputToggle parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SecureInputToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SecureInputToggle parseFrom(InputStream inputStream) {
            return (SecureInputToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SecureInputToggle parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SecureInputToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SecureInputToggle parseFrom(CodedInputStream codedInputStream) {
            return (SecureInputToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SecureInputToggle parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SecureInputToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SessionExpired extends GeneratedMessageLite<SessionExpired, C6157a> implements MessageLiteOrBuilder {
        private static final SessionExpired DEFAULT_INSTANCE;
        private static volatile Parser<SessionExpired> PARSER;

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$SessionExpired$a */
        public static final class C6157a extends GeneratedMessageLite.Builder<SessionExpired, C6157a> implements MessageLiteOrBuilder {
            public C6157a() {
                super(SessionExpired.DEFAULT_INSTANCE);
            }
        }

        static {
            SessionExpired sessionExpired = new SessionExpired();
            DEFAULT_INSTANCE = sessionExpired;
            GeneratedMessageLite.registerDefaultInstance(SessionExpired.class, sessionExpired);
        }

        private SessionExpired() {
        }

        public static SessionExpired getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6157a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SessionExpired parseDelimitedFrom(InputStream inputStream) {
            return (SessionExpired) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionExpired parseFrom(ByteBuffer byteBuffer) {
            return (SessionExpired) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SessionExpired> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new SessionExpired();
                case 2:
                    return new C6157a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SessionExpired> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SessionExpired.class) {
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

        public static C6157a newBuilder(SessionExpired sessionExpired) {
            return DEFAULT_INSTANCE.createBuilder(sessionExpired);
        }

        public static SessionExpired parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionExpired) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SessionExpired parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionExpired) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SessionExpired parseFrom(ByteString byteString) {
            return (SessionExpired) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SessionExpired parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionExpired) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SessionExpired parseFrom(byte[] bArr) {
            return (SessionExpired) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SessionExpired parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionExpired) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SessionExpired parseFrom(InputStream inputStream) {
            return (SessionExpired) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionExpired parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionExpired) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SessionExpired parseFrom(CodedInputStream codedInputStream) {
            return (SessionExpired) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SessionExpired parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionExpired) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SuccessPane extends GeneratedMessageLite<SuccessPane, C6158a> implements MessageLiteOrBuilder {
        public static final int COMPANY_METADATA_FIELD_NUMBER = 1;
        private static final SuccessPane DEFAULT_INSTANCE;
        private static volatile Parser<SuccessPane> PARSER = null;
        public static final int PARTNER_FIELD_NUMBER = 3;
        public static final int TOKEN_FIELD_NUMBER = 2;
        private int bitField0_;
        private IncomeWrappingCompanyMetadata companyMetadata_;
        private String partner_ = "";
        private String token_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$SuccessPane$a */
        public static final class C6158a extends GeneratedMessageLite.Builder<SuccessPane, C6158a> implements MessageLiteOrBuilder {
            public C6158a() {
                super(SuccessPane.DEFAULT_INSTANCE);
            }
        }

        static {
            SuccessPane successPane = new SuccessPane();
            DEFAULT_INSTANCE = successPane;
            GeneratedMessageLite.registerDefaultInstance(SuccessPane.class, successPane);
        }

        private SuccessPane() {
        }

        private void clearCompanyMetadata() {
            this.companyMetadata_ = null;
            this.bitField0_ &= -2;
        }

        private void clearPartner() {
            this.partner_ = getDefaultInstance().getPartner();
        }

        private void clearToken() {
            this.token_ = getDefaultInstance().getToken();
        }

        public static SuccessPane getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeCompanyMetadata(IncomeWrappingCompanyMetadata incomeWrappingCompanyMetadata) {
            incomeWrappingCompanyMetadata.getClass();
            IncomeWrappingCompanyMetadata incomeWrappingCompanyMetadata2 = this.companyMetadata_;
            if (incomeWrappingCompanyMetadata2 == null || incomeWrappingCompanyMetadata2 == IncomeWrappingCompanyMetadata.getDefaultInstance()) {
                this.companyMetadata_ = incomeWrappingCompanyMetadata;
            } else {
                this.companyMetadata_ = IncomeWrappingCompanyMetadata.newBuilder(this.companyMetadata_).mergeFrom((IncomeWrappingCompanyMetadata.C6106a) incomeWrappingCompanyMetadata).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static C6158a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SuccessPane parseDelimitedFrom(InputStream inputStream) {
            return (SuccessPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SuccessPane parseFrom(ByteBuffer byteBuffer) {
            return (SuccessPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SuccessPane> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCompanyMetadata(IncomeWrappingCompanyMetadata incomeWrappingCompanyMetadata) {
            incomeWrappingCompanyMetadata.getClass();
            this.companyMetadata_ = incomeWrappingCompanyMetadata;
            this.bitField0_ |= 1;
        }

        private void setPartner(String str) {
            str.getClass();
            this.partner_ = str;
        }

        private void setPartnerBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.partner_ = byteString.toStringUtf8();
        }

        private void setToken(String str) {
            str.getClass();
            this.token_ = str;
        }

        private void setTokenBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.token_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new SuccessPane();
                case 2:
                    return new C6158a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"bitField0_", "companyMetadata_", "token_", "partner_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SuccessPane> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SuccessPane.class) {
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

        public IncomeWrappingCompanyMetadata getCompanyMetadata() {
            IncomeWrappingCompanyMetadata incomeWrappingCompanyMetadata = this.companyMetadata_;
            return incomeWrappingCompanyMetadata == null ? IncomeWrappingCompanyMetadata.getDefaultInstance() : incomeWrappingCompanyMetadata;
        }

        public String getPartner() {
            return this.partner_;
        }

        public ByteString getPartnerBytes() {
            return ByteString.copyFromUtf8(this.partner_);
        }

        public String getToken() {
            return this.token_;
        }

        public ByteString getTokenBytes() {
            return ByteString.copyFromUtf8(this.token_);
        }

        public boolean hasCompanyMetadata() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C6158a newBuilder(SuccessPane successPane) {
            return DEFAULT_INSTANCE.createBuilder(successPane);
        }

        public static SuccessPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SuccessPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SuccessPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SuccessPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SuccessPane parseFrom(ByteString byteString) {
            return (SuccessPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SuccessPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SuccessPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SuccessPane parseFrom(byte[] bArr) {
            return (SuccessPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SuccessPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SuccessPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SuccessPane parseFrom(InputStream inputStream) {
            return (SuccessPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SuccessPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SuccessPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SuccessPane parseFrom(CodedInputStream codedInputStream) {
            return (SuccessPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SuccessPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SuccessPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TDDataCollected extends GeneratedMessageLite<TDDataCollected, C6159a> implements MessageLiteOrBuilder {
        private static final TDDataCollected DEFAULT_INSTANCE;
        public static final int DELAY_MS_FIELD_NUMBER = 6;
        public static final int ERROR_FIELD_NUMBER = 14;
        public static final int LOAD_DELAY_MS_FIELD_NUMBER = 8;
        private static volatile Parser<TDDataCollected> PARSER = null;
        public static final int REQUEST_ID_FIELD_NUMBER = 1;
        public static final int RESULT_FIELD_NUMBER = 5;
        public static final int RUN_DELAY_MS_FIELD_NUMBER = 10;
        private long delayMs_;
        private long loadDelayMs_;
        private long runDelayMs_;
        private String requestId_ = "";
        private String error_ = "";
        private String result_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$TDDataCollected$a */
        public static final class C6159a extends GeneratedMessageLite.Builder<TDDataCollected, C6159a> implements MessageLiteOrBuilder {
            public C6159a() {
                super(TDDataCollected.DEFAULT_INSTANCE);
            }
        }

        static {
            TDDataCollected tDDataCollected = new TDDataCollected();
            DEFAULT_INSTANCE = tDDataCollected;
            GeneratedMessageLite.registerDefaultInstance(TDDataCollected.class, tDDataCollected);
        }

        private TDDataCollected() {
        }

        private void clearDelayMs() {
            this.delayMs_ = 0L;
        }

        private void clearError() {
            this.error_ = getDefaultInstance().getError();
        }

        private void clearLoadDelayMs() {
            this.loadDelayMs_ = 0L;
        }

        private void clearRequestId() {
            this.requestId_ = getDefaultInstance().getRequestId();
        }

        private void clearResult() {
            this.result_ = getDefaultInstance().getResult();
        }

        private void clearRunDelayMs() {
            this.runDelayMs_ = 0L;
        }

        public static TDDataCollected getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6159a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TDDataCollected parseDelimitedFrom(InputStream inputStream) {
            return (TDDataCollected) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TDDataCollected parseFrom(ByteBuffer byteBuffer) {
            return (TDDataCollected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<TDDataCollected> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDelayMs(long j) {
            this.delayMs_ = j;
        }

        private void setError(String str) {
            str.getClass();
            this.error_ = str;
        }

        private void setErrorBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.error_ = byteString.toStringUtf8();
        }

        private void setLoadDelayMs(long j) {
            this.loadDelayMs_ = j;
        }

        private void setRequestId(String str) {
            str.getClass();
            this.requestId_ = str;
        }

        private void setRequestIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.requestId_ = byteString.toStringUtf8();
        }

        private void setResult(String str) {
            str.getClass();
            this.result_ = str;
        }

        private void setResultBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.result_ = byteString.toStringUtf8();
        }

        private void setRunDelayMs(long j) {
            this.runDelayMs_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new TDDataCollected();
                case 2:
                    return new C6159a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u000e\u0006\u0000\u0000\u0000\u0001Ȉ\u0005Ȉ\u0006\u0002\b\u0002\n\u0002\u000eȈ", new Object[]{"requestId_", "result_", "delayMs_", "loadDelayMs_", "runDelayMs_", "error_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<TDDataCollected> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (TDDataCollected.class) {
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

        public long getDelayMs() {
            return this.delayMs_;
        }

        public String getError() {
            return this.error_;
        }

        public ByteString getErrorBytes() {
            return ByteString.copyFromUtf8(this.error_);
        }

        public long getLoadDelayMs() {
            return this.loadDelayMs_;
        }

        public String getRequestId() {
            return this.requestId_;
        }

        public ByteString getRequestIdBytes() {
            return ByteString.copyFromUtf8(this.requestId_);
        }

        public String getResult() {
            return this.result_;
        }

        public ByteString getResultBytes() {
            return ByteString.copyFromUtf8(this.result_);
        }

        public long getRunDelayMs() {
            return this.runDelayMs_;
        }

        public static C6159a newBuilder(TDDataCollected tDDataCollected) {
            return DEFAULT_INSTANCE.createBuilder(tDDataCollected);
        }

        public static TDDataCollected parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TDDataCollected) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TDDataCollected parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (TDDataCollected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TDDataCollected parseFrom(ByteString byteString) {
            return (TDDataCollected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TDDataCollected parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (TDDataCollected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TDDataCollected parseFrom(byte[] bArr) {
            return (TDDataCollected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TDDataCollected parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (TDDataCollected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TDDataCollected parseFrom(InputStream inputStream) {
            return (TDDataCollected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TDDataCollected parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TDDataCollected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TDDataCollected parseFrom(CodedInputStream codedInputStream) {
            return (TDDataCollected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TDDataCollected parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TDDataCollected) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TrackEventWithOptimizely extends GeneratedMessageLite<TrackEventWithOptimizely, C6160a> implements MessageLiteOrBuilder {
        private static final TrackEventWithOptimizely DEFAULT_INSTANCE;
        public static final int EVENT_NAME_FIELD_NUMBER = 1;
        private static volatile Parser<TrackEventWithOptimizely> PARSER;
        private String eventName_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$TrackEventWithOptimizely$a */
        public static final class C6160a extends GeneratedMessageLite.Builder<TrackEventWithOptimizely, C6160a> implements MessageLiteOrBuilder {
            public C6160a() {
                super(TrackEventWithOptimizely.DEFAULT_INSTANCE);
            }
        }

        static {
            TrackEventWithOptimizely trackEventWithOptimizely = new TrackEventWithOptimizely();
            DEFAULT_INSTANCE = trackEventWithOptimizely;
            GeneratedMessageLite.registerDefaultInstance(TrackEventWithOptimizely.class, trackEventWithOptimizely);
        }

        private TrackEventWithOptimizely() {
        }

        private void clearEventName() {
            this.eventName_ = getDefaultInstance().getEventName();
        }

        public static TrackEventWithOptimizely getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6160a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TrackEventWithOptimizely parseDelimitedFrom(InputStream inputStream) {
            return (TrackEventWithOptimizely) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TrackEventWithOptimizely parseFrom(ByteBuffer byteBuffer) {
            return (TrackEventWithOptimizely) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<TrackEventWithOptimizely> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setEventName(String str) {
            str.getClass();
            this.eventName_ = str;
        }

        private void setEventNameBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.eventName_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new TrackEventWithOptimizely();
                case 2:
                    return new C6160a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"eventName_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<TrackEventWithOptimizely> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (TrackEventWithOptimizely.class) {
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

        public String getEventName() {
            return this.eventName_;
        }

        public ByteString getEventNameBytes() {
            return ByteString.copyFromUtf8(this.eventName_);
        }

        public static C6160a newBuilder(TrackEventWithOptimizely trackEventWithOptimizely) {
            return DEFAULT_INSTANCE.createBuilder(trackEventWithOptimizely);
        }

        public static TrackEventWithOptimizely parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackEventWithOptimizely) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TrackEventWithOptimizely parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackEventWithOptimizely) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TrackEventWithOptimizely parseFrom(ByteString byteString) {
            return (TrackEventWithOptimizely) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TrackEventWithOptimizely parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackEventWithOptimizely) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TrackEventWithOptimizely parseFrom(byte[] bArr) {
            return (TrackEventWithOptimizely) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TrackEventWithOptimizely parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackEventWithOptimizely) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TrackEventWithOptimizely parseFrom(InputStream inputStream) {
            return (TrackEventWithOptimizely) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TrackEventWithOptimizely parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackEventWithOptimizely) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TrackEventWithOptimizely parseFrom(CodedInputStream codedInputStream) {
            return (TrackEventWithOptimizely) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TrackEventWithOptimizely parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackEventWithOptimizely) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Web3PaneEvent extends GeneratedMessageLite<Web3PaneEvent, C6167a> implements MessageLiteOrBuilder {
        private static final Web3PaneEvent DEFAULT_INSTANCE;
        public static final int EVENT_FIELD_NUMBER = 2;
        private static volatile Parser<Web3PaneEvent> PARSER = null;
        public static final int WALLET_BRAND_ID_FIELD_NUMBER = 3;
        private int bitField0_;
        private Event event_;
        private String walletBrandId_ = "";

        public static final class Event extends GeneratedMessageLite<Event, C6161a> implements MessageLiteOrBuilder {
            private static final Event DEFAULT_INSTANCE;
            private static volatile Parser<Event> PARSER = null;
            public static final int SUBPANE_APPEARED_FIELD_NUMBER = 1;
            private int dataCase_ = 0;
            private Object data_;

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$Web3PaneEvent$Event$a */
            public static final class C6161a extends GeneratedMessageLite.Builder<Event, C6161a> implements MessageLiteOrBuilder {
                public C6161a() {
                    super(Event.DEFAULT_INSTANCE);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$Web3PaneEvent$Event$b */
            public enum EnumC6162b {
                SUBPANE_APPEARED(1),
                DATA_NOT_SET(0);


                /* renamed from: a */
                public final int f2081a;

                EnumC6162b(int i) {
                    this.f2081a = i;
                }

                public static EnumC6162b forNumber(int i) {
                    if (i == 0) {
                        return DATA_NOT_SET;
                    }
                    if (i != 1) {
                        return null;
                    }
                    return SUBPANE_APPEARED;
                }

                public int getNumber() {
                    return this.f2081a;
                }

                @Deprecated
                public static EnumC6162b valueOf(int i) {
                    return forNumber(i);
                }
            }

            static {
                Event event = new Event();
                DEFAULT_INSTANCE = event;
                GeneratedMessageLite.registerDefaultInstance(Event.class, event);
            }

            private Event() {
            }

            private void clearData() {
                this.dataCase_ = 0;
                this.data_ = null;
            }

            private void clearSubpaneAppeared() {
                if (this.dataCase_ == 1) {
                    this.dataCase_ = 0;
                    this.data_ = null;
                }
            }

            public static Event getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeSubpaneAppeared(SubpaneAppeared subpaneAppeared) {
                subpaneAppeared.getClass();
                if (this.dataCase_ != 1 || this.data_ == SubpaneAppeared.getDefaultInstance()) {
                    this.data_ = subpaneAppeared;
                } else {
                    this.data_ = SubpaneAppeared.newBuilder((SubpaneAppeared) this.data_).mergeFrom((SubpaneAppeared.C6166a) subpaneAppeared).buildPartial();
                }
                this.dataCase_ = 1;
            }

            public static C6161a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Event parseDelimitedFrom(InputStream inputStream) {
                return (Event) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Event parseFrom(ByteBuffer byteBuffer) {
                return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Event> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setSubpaneAppeared(SubpaneAppeared subpaneAppeared) {
                subpaneAppeared.getClass();
                this.data_ = subpaneAppeared;
                this.dataCase_ = 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Event();
                    case 2:
                        return new C6161a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"data_", "dataCase_", SubpaneAppeared.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Event> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Event.class) {
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

            public EnumC6162b getDataCase() {
                return EnumC6162b.forNumber(this.dataCase_);
            }

            public SubpaneAppeared getSubpaneAppeared() {
                return this.dataCase_ == 1 ? (SubpaneAppeared) this.data_ : SubpaneAppeared.getDefaultInstance();
            }

            public boolean hasSubpaneAppeared() {
                return this.dataCase_ == 1;
            }

            public static C6161a newBuilder(Event event) {
                return DEFAULT_INSTANCE.createBuilder(event);
            }

            public static Event parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Event) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Event parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Event parseFrom(ByteString byteString) {
                return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Event parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Event parseFrom(byte[] bArr) {
                return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Event parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Event parseFrom(InputStream inputStream) {
                return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Event parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Event parseFrom(CodedInputStream codedInputStream) {
                return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Event parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SubpaneAppeared extends GeneratedMessageLite<SubpaneAppeared, C6166a> implements MessageLiteOrBuilder {
            private static final SubpaneAppeared DEFAULT_INSTANCE;
            public static final int PANE_NAME_FIELD_NUMBER = 1;
            private static volatile Parser<SubpaneAppeared> PARSER = null;
            public static final int SUBPANE_METADATA_FIELD_NUMBER = 2;
            private int bitField0_;
            private String paneName_ = "";
            private SubpaneMetadata subpaneMetadata_;

            public static final class ErrorPaneMetadata extends GeneratedMessageLite<ErrorPaneMetadata, C6163a> implements MessageLiteOrBuilder {
                private static final ErrorPaneMetadata DEFAULT_INSTANCE;
                public static final int ERROR_DESCRIPTION_FIELD_NUMBER = 1;
                public static final int ERROR_METADATA_FIELD_NUMBER = 2;
                private static volatile Parser<ErrorPaneMetadata> PARSER;
                private String errorDescription_ = "";
                private String errorMetadata_ = "";

                /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$Web3PaneEvent$SubpaneAppeared$ErrorPaneMetadata$a */
                public static final class C6163a extends GeneratedMessageLite.Builder<ErrorPaneMetadata, C6163a> implements MessageLiteOrBuilder {
                    public C6163a() {
                        super(ErrorPaneMetadata.DEFAULT_INSTANCE);
                    }
                }

                static {
                    ErrorPaneMetadata errorPaneMetadata = new ErrorPaneMetadata();
                    DEFAULT_INSTANCE = errorPaneMetadata;
                    GeneratedMessageLite.registerDefaultInstance(ErrorPaneMetadata.class, errorPaneMetadata);
                }

                private ErrorPaneMetadata() {
                }

                private void clearErrorDescription() {
                    this.errorDescription_ = getDefaultInstance().getErrorDescription();
                }

                private void clearErrorMetadata() {
                    this.errorMetadata_ = getDefaultInstance().getErrorMetadata();
                }

                public static ErrorPaneMetadata getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static C6163a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static ErrorPaneMetadata parseDelimitedFrom(InputStream inputStream) {
                    return (ErrorPaneMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static ErrorPaneMetadata parseFrom(ByteBuffer byteBuffer) {
                    return (ErrorPaneMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static Parser<ErrorPaneMetadata> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void setErrorDescription(String str) {
                    str.getClass();
                    this.errorDescription_ = str;
                }

                private void setErrorDescriptionBytes(ByteString byteString) throws IllegalArgumentException {
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.errorDescription_ = byteString.toStringUtf8();
                }

                private void setErrorMetadata(String str) {
                    str.getClass();
                    this.errorMetadata_ = str;
                }

                private void setErrorMetadataBytes(ByteString byteString) throws IllegalArgumentException {
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.errorMetadata_ = byteString.toStringUtf8();
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new ErrorPaneMetadata();
                        case 2:
                            return new C6163a();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"errorDescription_", "errorMetadata_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            Parser<ErrorPaneMetadata> parser = PARSER;
                            if (parser != null) {
                                return parser;
                            }
                            synchronized (ErrorPaneMetadata.class) {
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

                public String getErrorDescription() {
                    return this.errorDescription_;
                }

                public ByteString getErrorDescriptionBytes() {
                    return ByteString.copyFromUtf8(this.errorDescription_);
                }

                public String getErrorMetadata() {
                    return this.errorMetadata_;
                }

                public ByteString getErrorMetadataBytes() {
                    return ByteString.copyFromUtf8(this.errorMetadata_);
                }

                public static C6163a newBuilder(ErrorPaneMetadata errorPaneMetadata) {
                    return DEFAULT_INSTANCE.createBuilder(errorPaneMetadata);
                }

                public static ErrorPaneMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (ErrorPaneMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static ErrorPaneMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                    return (ErrorPaneMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static ErrorPaneMetadata parseFrom(ByteString byteString) {
                    return (ErrorPaneMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static ErrorPaneMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                    return (ErrorPaneMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static ErrorPaneMetadata parseFrom(byte[] bArr) {
                    return (ErrorPaneMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static ErrorPaneMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                    return (ErrorPaneMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static ErrorPaneMetadata parseFrom(InputStream inputStream) {
                    return (ErrorPaneMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static ErrorPaneMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (ErrorPaneMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static ErrorPaneMetadata parseFrom(CodedInputStream codedInputStream) {
                    return (ErrorPaneMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static ErrorPaneMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (ErrorPaneMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            public static final class SubpaneMetadata extends GeneratedMessageLite<SubpaneMetadata, C6164a> implements MessageLiteOrBuilder {
                private static final SubpaneMetadata DEFAULT_INSTANCE;
                public static final int ERROR_PANE_METADATA_FIELD_NUMBER = 1;
                private static volatile Parser<SubpaneMetadata> PARSER;
                private int metadataCase_ = 0;
                private Object metadata_;

                /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$Web3PaneEvent$SubpaneAppeared$SubpaneMetadata$a */
                public static final class C6164a extends GeneratedMessageLite.Builder<SubpaneMetadata, C6164a> implements MessageLiteOrBuilder {
                    public C6164a() {
                        super(SubpaneMetadata.DEFAULT_INSTANCE);
                    }
                }

                /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$Web3PaneEvent$SubpaneAppeared$SubpaneMetadata$b */
                public enum EnumC6165b {
                    ERROR_PANE_METADATA(1),
                    METADATA_NOT_SET(0);


                    /* renamed from: a */
                    public final int f2083a;

                    EnumC6165b(int i) {
                        this.f2083a = i;
                    }

                    public static EnumC6165b forNumber(int i) {
                        if (i == 0) {
                            return METADATA_NOT_SET;
                        }
                        if (i != 1) {
                            return null;
                        }
                        return ERROR_PANE_METADATA;
                    }

                    public int getNumber() {
                        return this.f2083a;
                    }

                    @Deprecated
                    public static EnumC6165b valueOf(int i) {
                        return forNumber(i);
                    }
                }

                static {
                    SubpaneMetadata subpaneMetadata = new SubpaneMetadata();
                    DEFAULT_INSTANCE = subpaneMetadata;
                    GeneratedMessageLite.registerDefaultInstance(SubpaneMetadata.class, subpaneMetadata);
                }

                private SubpaneMetadata() {
                }

                private void clearErrorPaneMetadata() {
                    if (this.metadataCase_ == 1) {
                        this.metadataCase_ = 0;
                        this.metadata_ = null;
                    }
                }

                private void clearMetadata() {
                    this.metadataCase_ = 0;
                    this.metadata_ = null;
                }

                public static SubpaneMetadata getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                private void mergeErrorPaneMetadata(ErrorPaneMetadata errorPaneMetadata) {
                    errorPaneMetadata.getClass();
                    if (this.metadataCase_ != 1 || this.metadata_ == ErrorPaneMetadata.getDefaultInstance()) {
                        this.metadata_ = errorPaneMetadata;
                    } else {
                        this.metadata_ = ErrorPaneMetadata.newBuilder((ErrorPaneMetadata) this.metadata_).mergeFrom((ErrorPaneMetadata.C6163a) errorPaneMetadata).buildPartial();
                    }
                    this.metadataCase_ = 1;
                }

                public static C6164a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static SubpaneMetadata parseDelimitedFrom(InputStream inputStream) {
                    return (SubpaneMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static SubpaneMetadata parseFrom(ByteBuffer byteBuffer) {
                    return (SubpaneMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static Parser<SubpaneMetadata> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void setErrorPaneMetadata(ErrorPaneMetadata errorPaneMetadata) {
                    errorPaneMetadata.getClass();
                    this.metadata_ = errorPaneMetadata;
                    this.metadataCase_ = 1;
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new SubpaneMetadata();
                        case 2:
                            return new C6164a();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"metadata_", "metadataCase_", ErrorPaneMetadata.class});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            Parser<SubpaneMetadata> parser = PARSER;
                            if (parser != null) {
                                return parser;
                            }
                            synchronized (SubpaneMetadata.class) {
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

                public ErrorPaneMetadata getErrorPaneMetadata() {
                    return this.metadataCase_ == 1 ? (ErrorPaneMetadata) this.metadata_ : ErrorPaneMetadata.getDefaultInstance();
                }

                public EnumC6165b getMetadataCase() {
                    return EnumC6165b.forNumber(this.metadataCase_);
                }

                public boolean hasErrorPaneMetadata() {
                    return this.metadataCase_ == 1;
                }

                public static C6164a newBuilder(SubpaneMetadata subpaneMetadata) {
                    return DEFAULT_INSTANCE.createBuilder(subpaneMetadata);
                }

                public static SubpaneMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (SubpaneMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static SubpaneMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                    return (SubpaneMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static SubpaneMetadata parseFrom(ByteString byteString) {
                    return (SubpaneMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static SubpaneMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                    return (SubpaneMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static SubpaneMetadata parseFrom(byte[] bArr) {
                    return (SubpaneMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static SubpaneMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                    return (SubpaneMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static SubpaneMetadata parseFrom(InputStream inputStream) {
                    return (SubpaneMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static SubpaneMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (SubpaneMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static SubpaneMetadata parseFrom(CodedInputStream codedInputStream) {
                    return (SubpaneMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static SubpaneMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (SubpaneMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$Web3PaneEvent$SubpaneAppeared$a */
            public static final class C6166a extends GeneratedMessageLite.Builder<SubpaneAppeared, C6166a> implements MessageLiteOrBuilder {
                public C6166a() {
                    super(SubpaneAppeared.DEFAULT_INSTANCE);
                }
            }

            static {
                SubpaneAppeared subpaneAppeared = new SubpaneAppeared();
                DEFAULT_INSTANCE = subpaneAppeared;
                GeneratedMessageLite.registerDefaultInstance(SubpaneAppeared.class, subpaneAppeared);
            }

            private SubpaneAppeared() {
            }

            private void clearPaneName() {
                this.paneName_ = getDefaultInstance().getPaneName();
            }

            private void clearSubpaneMetadata() {
                this.subpaneMetadata_ = null;
                this.bitField0_ &= -2;
            }

            public static SubpaneAppeared getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeSubpaneMetadata(SubpaneMetadata subpaneMetadata) {
                subpaneMetadata.getClass();
                SubpaneMetadata subpaneMetadata2 = this.subpaneMetadata_;
                if (subpaneMetadata2 == null || subpaneMetadata2 == SubpaneMetadata.getDefaultInstance()) {
                    this.subpaneMetadata_ = subpaneMetadata;
                } else {
                    this.subpaneMetadata_ = SubpaneMetadata.newBuilder(this.subpaneMetadata_).mergeFrom((SubpaneMetadata.C6164a) subpaneMetadata).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6166a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static SubpaneAppeared parseDelimitedFrom(InputStream inputStream) {
                return (SubpaneAppeared) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SubpaneAppeared parseFrom(ByteBuffer byteBuffer) {
                return (SubpaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<SubpaneAppeared> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setPaneName(String str) {
                str.getClass();
                this.paneName_ = str;
            }

            private void setPaneNameBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.paneName_ = byteString.toStringUtf8();
            }

            private void setSubpaneMetadata(SubpaneMetadata subpaneMetadata) {
                subpaneMetadata.getClass();
                this.subpaneMetadata_ = subpaneMetadata;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SubpaneAppeared();
                    case 2:
                        return new C6166a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "paneName_", "subpaneMetadata_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<SubpaneAppeared> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (SubpaneAppeared.class) {
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

            public String getPaneName() {
                return this.paneName_;
            }

            public ByteString getPaneNameBytes() {
                return ByteString.copyFromUtf8(this.paneName_);
            }

            public SubpaneMetadata getSubpaneMetadata() {
                SubpaneMetadata subpaneMetadata = this.subpaneMetadata_;
                return subpaneMetadata == null ? SubpaneMetadata.getDefaultInstance() : subpaneMetadata;
            }

            public boolean hasSubpaneMetadata() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6166a newBuilder(SubpaneAppeared subpaneAppeared) {
                return DEFAULT_INSTANCE.createBuilder(subpaneAppeared);
            }

            public static SubpaneAppeared parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SubpaneAppeared) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SubpaneAppeared parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (SubpaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static SubpaneAppeared parseFrom(ByteString byteString) {
                return (SubpaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static SubpaneAppeared parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (SubpaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static SubpaneAppeared parseFrom(byte[] bArr) {
                return (SubpaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static SubpaneAppeared parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (SubpaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static SubpaneAppeared parseFrom(InputStream inputStream) {
                return (SubpaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SubpaneAppeared parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SubpaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SubpaneAppeared parseFrom(CodedInputStream codedInputStream) {
                return (SubpaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static SubpaneAppeared parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SubpaneAppeared) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$Web3PaneEvent$a */
        public static final class C6167a extends GeneratedMessageLite.Builder<Web3PaneEvent, C6167a> implements MessageLiteOrBuilder {
            public C6167a() {
                super(Web3PaneEvent.DEFAULT_INSTANCE);
            }
        }

        static {
            Web3PaneEvent web3PaneEvent = new Web3PaneEvent();
            DEFAULT_INSTANCE = web3PaneEvent;
            GeneratedMessageLite.registerDefaultInstance(Web3PaneEvent.class, web3PaneEvent);
        }

        private Web3PaneEvent() {
        }

        private void clearEvent() {
            this.event_ = null;
            this.bitField0_ &= -2;
        }

        private void clearWalletBrandId() {
            this.walletBrandId_ = getDefaultInstance().getWalletBrandId();
        }

        public static Web3PaneEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeEvent(Event event) {
            event.getClass();
            Event event2 = this.event_;
            if (event2 == null || event2 == Event.getDefaultInstance()) {
                this.event_ = event;
            } else {
                this.event_ = Event.newBuilder(this.event_).mergeFrom((Event.C6161a) event).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static C6167a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Web3PaneEvent parseDelimitedFrom(InputStream inputStream) {
            return (Web3PaneEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Web3PaneEvent parseFrom(ByteBuffer byteBuffer) {
            return (Web3PaneEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Web3PaneEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setEvent(Event event) {
            event.getClass();
            this.event_ = event;
            this.bitField0_ |= 1;
        }

        private void setWalletBrandId(String str) {
            str.getClass();
            this.walletBrandId_ = str;
        }

        private void setWalletBrandIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.walletBrandId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Web3PaneEvent();
                case 2:
                    return new C6167a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003Ȉ", new Object[]{"bitField0_", "event_", "walletBrandId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Web3PaneEvent> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Web3PaneEvent.class) {
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

        public Event getEvent() {
            Event event = this.event_;
            return event == null ? Event.getDefaultInstance() : event;
        }

        public String getWalletBrandId() {
            return this.walletBrandId_;
        }

        public ByteString getWalletBrandIdBytes() {
            return ByteString.copyFromUtf8(this.walletBrandId_);
        }

        public boolean hasEvent() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C6167a newBuilder(Web3PaneEvent web3PaneEvent) {
            return DEFAULT_INSTANCE.createBuilder(web3PaneEvent);
        }

        public static Web3PaneEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Web3PaneEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Web3PaneEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Web3PaneEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Web3PaneEvent parseFrom(ByteString byteString) {
            return (Web3PaneEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Web3PaneEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Web3PaneEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Web3PaneEvent parseFrom(byte[] bArr) {
            return (Web3PaneEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Web3PaneEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Web3PaneEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Web3PaneEvent parseFrom(InputStream inputStream) {
            return (Web3PaneEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Web3PaneEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Web3PaneEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Web3PaneEvent parseFrom(CodedInputStream codedInputStream) {
            return (Web3PaneEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Web3PaneEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Web3PaneEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class WebviewFallbackCancel extends GeneratedMessageLite<WebviewFallbackCancel, C6168a> implements MessageLiteOrBuilder {
        private static final WebviewFallbackCancel DEFAULT_INSTANCE;
        private static volatile Parser<WebviewFallbackCancel> PARSER = null;
        public static final int REASON_FIELD_NUMBER = 1;
        private int reason_;

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$WebviewFallbackCancel$a */
        public static final class C6168a extends GeneratedMessageLite.Builder<WebviewFallbackCancel, C6168a> implements MessageLiteOrBuilder {
            public C6168a() {
                super(WebviewFallbackCancel.DEFAULT_INSTANCE);
            }

            /* renamed from: a */
            public final C6168a m1398a(EnumC6169b enumC6169b) {
                copyOnWrite();
                ((WebviewFallbackCancel) this.instance).setReason(enumC6169b);
                return this;
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$WebviewFallbackCancel$b */
        public enum EnumC6169b implements Internal.EnumLite {
            LINK_WORKFLOW_EVENT_WEBVIEW_FALLBACK_CANCEL_REASON_UNKNOWN(0),
            LINK_WORKFLOW_EVENT_WEBVIEW_FALLBACK_CANCEL_REASON_EXIT_BUTTON(1),
            UNRECOGNIZED(-1);


            /* renamed from: LINK_WORKFLOW_EVENT_WEBVIEW_FALLBACK_CANCEL_REASON_EXIT_BUTTON_VALUE */
            public static final int f2084x95b82018 = 1;
            public static final int LINK_WORKFLOW_EVENT_WEBVIEW_FALLBACK_CANCEL_REASON_UNKNOWN_VALUE = 0;

            /* renamed from: b */
            public static final a f2085b = new a();

            /* renamed from: a */
            public final int f2087a;

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$WebviewFallbackCancel$b$a */
            public class a implements Internal.EnumLiteMap<EnumC6169b> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final Internal.EnumLite findValueByNumber(int i) {
                    return EnumC6169b.forNumber(i);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$WebviewFallbackCancel$b$b */
            public static final class b implements Internal.EnumVerifier {

                /* renamed from: a */
                public static final b f2088a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return EnumC6169b.forNumber(i) != null;
                }
            }

            EnumC6169b(int i) {
                this.f2087a = i;
            }

            public static EnumC6169b forNumber(int i) {
                if (i == 0) {
                    return LINK_WORKFLOW_EVENT_WEBVIEW_FALLBACK_CANCEL_REASON_UNKNOWN;
                }
                if (i != 1) {
                    return null;
                }
                return LINK_WORKFLOW_EVENT_WEBVIEW_FALLBACK_CANCEL_REASON_EXIT_BUTTON;
            }

            public static Internal.EnumLiteMap<EnumC6169b> internalGetValueMap() {
                return f2085b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f2088a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f2087a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static EnumC6169b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            WebviewFallbackCancel webviewFallbackCancel = new WebviewFallbackCancel();
            DEFAULT_INSTANCE = webviewFallbackCancel;
            GeneratedMessageLite.registerDefaultInstance(WebviewFallbackCancel.class, webviewFallbackCancel);
        }

        private WebviewFallbackCancel() {
        }

        private void clearReason() {
            this.reason_ = 0;
        }

        public static WebviewFallbackCancel getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6168a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static WebviewFallbackCancel parseDelimitedFrom(InputStream inputStream) {
            return (WebviewFallbackCancel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WebviewFallbackCancel parseFrom(ByteBuffer byteBuffer) {
            return (WebviewFallbackCancel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<WebviewFallbackCancel> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReason(EnumC6169b enumC6169b) {
            this.reason_ = enumC6169b.getNumber();
        }

        private void setReasonValue(int i) {
            this.reason_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new WebviewFallbackCancel();
                case 2:
                    return new C6168a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"reason_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<WebviewFallbackCancel> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (WebviewFallbackCancel.class) {
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

        public EnumC6169b getReason() {
            EnumC6169b enumC6169bForNumber = EnumC6169b.forNumber(this.reason_);
            return enumC6169bForNumber == null ? EnumC6169b.UNRECOGNIZED : enumC6169bForNumber;
        }

        public int getReasonValue() {
            return this.reason_;
        }

        public static C6168a newBuilder(WebviewFallbackCancel webviewFallbackCancel) {
            return DEFAULT_INSTANCE.createBuilder(webviewFallbackCancel);
        }

        public static WebviewFallbackCancel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallbackCancel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WebviewFallbackCancel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallbackCancel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static WebviewFallbackCancel parseFrom(ByteString byteString) {
            return (WebviewFallbackCancel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static WebviewFallbackCancel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallbackCancel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static WebviewFallbackCancel parseFrom(byte[] bArr) {
            return (WebviewFallbackCancel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WebviewFallbackCancel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallbackCancel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static WebviewFallbackCancel parseFrom(InputStream inputStream) {
            return (WebviewFallbackCancel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WebviewFallbackCancel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallbackCancel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WebviewFallbackCancel parseFrom(CodedInputStream codedInputStream) {
            return (WebviewFallbackCancel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static WebviewFallbackCancel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallbackCancel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class WebviewFallbackEmitPreCompletionResult extends GeneratedMessageLite<WebviewFallbackEmitPreCompletionResult, C6170a> implements MessageLiteOrBuilder {
        private static final WebviewFallbackEmitPreCompletionResult DEFAULT_INSTANCE;
        private static volatile Parser<WebviewFallbackEmitPreCompletionResult> PARSER;

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$WebviewFallbackEmitPreCompletionResult$a */
        public static final class C6170a extends GeneratedMessageLite.Builder<WebviewFallbackEmitPreCompletionResult, C6170a> implements MessageLiteOrBuilder {
            public C6170a() {
                super(WebviewFallbackEmitPreCompletionResult.DEFAULT_INSTANCE);
            }
        }

        static {
            WebviewFallbackEmitPreCompletionResult webviewFallbackEmitPreCompletionResult = new WebviewFallbackEmitPreCompletionResult();
            DEFAULT_INSTANCE = webviewFallbackEmitPreCompletionResult;
            GeneratedMessageLite.registerDefaultInstance(WebviewFallbackEmitPreCompletionResult.class, webviewFallbackEmitPreCompletionResult);
        }

        private WebviewFallbackEmitPreCompletionResult() {
        }

        public static WebviewFallbackEmitPreCompletionResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6170a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static WebviewFallbackEmitPreCompletionResult parseDelimitedFrom(InputStream inputStream) {
            return (WebviewFallbackEmitPreCompletionResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WebviewFallbackEmitPreCompletionResult parseFrom(ByteBuffer byteBuffer) {
            return (WebviewFallbackEmitPreCompletionResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<WebviewFallbackEmitPreCompletionResult> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new WebviewFallbackEmitPreCompletionResult();
                case 2:
                    return new C6170a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<WebviewFallbackEmitPreCompletionResult> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (WebviewFallbackEmitPreCompletionResult.class) {
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

        public static C6170a newBuilder(WebviewFallbackEmitPreCompletionResult webviewFallbackEmitPreCompletionResult) {
            return DEFAULT_INSTANCE.createBuilder(webviewFallbackEmitPreCompletionResult);
        }

        public static WebviewFallbackEmitPreCompletionResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallbackEmitPreCompletionResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WebviewFallbackEmitPreCompletionResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallbackEmitPreCompletionResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static WebviewFallbackEmitPreCompletionResult parseFrom(ByteString byteString) {
            return (WebviewFallbackEmitPreCompletionResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static WebviewFallbackEmitPreCompletionResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallbackEmitPreCompletionResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static WebviewFallbackEmitPreCompletionResult parseFrom(byte[] bArr) {
            return (WebviewFallbackEmitPreCompletionResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WebviewFallbackEmitPreCompletionResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallbackEmitPreCompletionResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static WebviewFallbackEmitPreCompletionResult parseFrom(InputStream inputStream) {
            return (WebviewFallbackEmitPreCompletionResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WebviewFallbackEmitPreCompletionResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallbackEmitPreCompletionResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WebviewFallbackEmitPreCompletionResult parseFrom(CodedInputStream codedInputStream) {
            return (WebviewFallbackEmitPreCompletionResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static WebviewFallbackEmitPreCompletionResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallbackEmitPreCompletionResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class WebviewFallbackOAuthPopupOpen extends GeneratedMessageLite<WebviewFallbackOAuthPopupOpen, C6171a> implements MessageLiteOrBuilder {
        private static final WebviewFallbackOAuthPopupOpen DEFAULT_INSTANCE;
        public static final int METHOD_FIELD_NUMBER = 1;
        private static volatile Parser<WebviewFallbackOAuthPopupOpen> PARSER;
        private int method_;

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$WebviewFallbackOAuthPopupOpen$a */
        public static final class C6171a extends GeneratedMessageLite.Builder<WebviewFallbackOAuthPopupOpen, C6171a> implements MessageLiteOrBuilder {
            public C6171a() {
                super(WebviewFallbackOAuthPopupOpen.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$WebviewFallbackOAuthPopupOpen$b */
        public enum EnumC6172b implements Internal.EnumLite {
            LINK_WORKFLOW_EVENT_WEBVIEW_FALLBACK_OAUTH_POPUP_OPEN_METHOD_UNKNOWN(0),
            LINK_WORKFLOW_EVENT_WEBVIEW_FALLBACK_OAUTH_POPUP_OPEN_METHOD_UNIVERSAL_LINK(1),
            LINK_WORKFLOW_EVENT_WEBVIEW_FALLBACK_OAUTH_POPUP_OPEN_METHOD_DEFAULT_BROWSER(2),
            LINK_WORKFLOW_EVENT_WEBVIEW_FALLBACK_OAUTH_POPUP_OPEN_METHOD_AUTH_SESSION_EPHEMERAL(3),
            LINK_WORKFLOW_EVENT_WEBVIEW_FALLBACK_OAUTH_POPUP_OPEN_METHOD_AUTH_SESSION_WITH_PROMPT(4),
            UNRECOGNIZED(-1);


            /* renamed from: LINK_WORKFLOW_EVENT_WEBVIEW_FALLBACK_OAUTH_POPUP_OPEN_METHOD_AUTH_SESSION_EPHEMERAL_VALUE */
            public static final int f2090x1b2caaea = 3;

            /* renamed from: LINK_WORKFLOW_EVENT_WEBVIEW_FALLBACK_OAUTH_POPUP_OPEN_METHOD_AUTH_SESSION_WITH_PROMPT_VALUE */
            public static final int f2092x1d5cedaa = 4;

            /* renamed from: LINK_WORKFLOW_EVENT_WEBVIEW_FALLBACK_OAUTH_POPUP_OPEN_METHOD_DEFAULT_BROWSER_VALUE */
            public static final int f2094x664773e1 = 2;

            /* renamed from: LINK_WORKFLOW_EVENT_WEBVIEW_FALLBACK_OAUTH_POPUP_OPEN_METHOD_UNIVERSAL_LINK_VALUE */
            public static final int f2096x6c36b69b = 1;

            /* renamed from: LINK_WORKFLOW_EVENT_WEBVIEW_FALLBACK_OAUTH_POPUP_OPEN_METHOD_UNKNOWN_VALUE */
            public static final int f2098x96fba221 = 0;

            /* renamed from: b */
            public static final a f2099b = new a();

            /* renamed from: a */
            public final int f2101a;

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$WebviewFallbackOAuthPopupOpen$b$a */
            public class a implements Internal.EnumLiteMap<EnumC6172b> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final Internal.EnumLite findValueByNumber(int i) {
                    return EnumC6172b.forNumber(i);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$WebviewFallbackOAuthPopupOpen$b$b */
            public static final class b implements Internal.EnumVerifier {

                /* renamed from: a */
                public static final b f2102a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return EnumC6172b.forNumber(i) != null;
                }
            }

            EnumC6172b(int i) {
                this.f2101a = i;
            }

            public static EnumC6172b forNumber(int i) {
                if (i == 0) {
                    return LINK_WORKFLOW_EVENT_WEBVIEW_FALLBACK_OAUTH_POPUP_OPEN_METHOD_UNKNOWN;
                }
                if (i == 1) {
                    return LINK_WORKFLOW_EVENT_WEBVIEW_FALLBACK_OAUTH_POPUP_OPEN_METHOD_UNIVERSAL_LINK;
                }
                if (i == 2) {
                    return LINK_WORKFLOW_EVENT_WEBVIEW_FALLBACK_OAUTH_POPUP_OPEN_METHOD_DEFAULT_BROWSER;
                }
                if (i == 3) {
                    return LINK_WORKFLOW_EVENT_WEBVIEW_FALLBACK_OAUTH_POPUP_OPEN_METHOD_AUTH_SESSION_EPHEMERAL;
                }
                if (i != 4) {
                    return null;
                }
                return LINK_WORKFLOW_EVENT_WEBVIEW_FALLBACK_OAUTH_POPUP_OPEN_METHOD_AUTH_SESSION_WITH_PROMPT;
            }

            public static Internal.EnumLiteMap<EnumC6172b> internalGetValueMap() {
                return f2099b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f2102a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f2101a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static EnumC6172b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            WebviewFallbackOAuthPopupOpen webviewFallbackOAuthPopupOpen = new WebviewFallbackOAuthPopupOpen();
            DEFAULT_INSTANCE = webviewFallbackOAuthPopupOpen;
            GeneratedMessageLite.registerDefaultInstance(WebviewFallbackOAuthPopupOpen.class, webviewFallbackOAuthPopupOpen);
        }

        private WebviewFallbackOAuthPopupOpen() {
        }

        private void clearMethod() {
            this.method_ = 0;
        }

        public static WebviewFallbackOAuthPopupOpen getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6171a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static WebviewFallbackOAuthPopupOpen parseDelimitedFrom(InputStream inputStream) {
            return (WebviewFallbackOAuthPopupOpen) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WebviewFallbackOAuthPopupOpen parseFrom(ByteBuffer byteBuffer) {
            return (WebviewFallbackOAuthPopupOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<WebviewFallbackOAuthPopupOpen> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setMethod(EnumC6172b enumC6172b) {
            this.method_ = enumC6172b.getNumber();
        }

        private void setMethodValue(int i) {
            this.method_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new WebviewFallbackOAuthPopupOpen();
                case 2:
                    return new C6171a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"method_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<WebviewFallbackOAuthPopupOpen> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (WebviewFallbackOAuthPopupOpen.class) {
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

        public EnumC6172b getMethod() {
            EnumC6172b enumC6172bForNumber = EnumC6172b.forNumber(this.method_);
            return enumC6172bForNumber == null ? EnumC6172b.UNRECOGNIZED : enumC6172bForNumber;
        }

        public int getMethodValue() {
            return this.method_;
        }

        public static C6171a newBuilder(WebviewFallbackOAuthPopupOpen webviewFallbackOAuthPopupOpen) {
            return DEFAULT_INSTANCE.createBuilder(webviewFallbackOAuthPopupOpen);
        }

        public static WebviewFallbackOAuthPopupOpen parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallbackOAuthPopupOpen) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WebviewFallbackOAuthPopupOpen parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallbackOAuthPopupOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static WebviewFallbackOAuthPopupOpen parseFrom(ByteString byteString) {
            return (WebviewFallbackOAuthPopupOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static WebviewFallbackOAuthPopupOpen parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallbackOAuthPopupOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static WebviewFallbackOAuthPopupOpen parseFrom(byte[] bArr) {
            return (WebviewFallbackOAuthPopupOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WebviewFallbackOAuthPopupOpen parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallbackOAuthPopupOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static WebviewFallbackOAuthPopupOpen parseFrom(InputStream inputStream) {
            return (WebviewFallbackOAuthPopupOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WebviewFallbackOAuthPopupOpen parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallbackOAuthPopupOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WebviewFallbackOAuthPopupOpen parseFrom(CodedInputStream codedInputStream) {
            return (WebviewFallbackOAuthPopupOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static WebviewFallbackOAuthPopupOpen parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallbackOAuthPopupOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class WebviewFallbackOpen extends GeneratedMessageLite<WebviewFallbackOpen, C6173a> implements MessageLiteOrBuilder {
        private static final WebviewFallbackOpen DEFAULT_INSTANCE;
        private static volatile Parser<WebviewFallbackOpen> PARSER;

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$WebviewFallbackOpen$a */
        public static final class C6173a extends GeneratedMessageLite.Builder<WebviewFallbackOpen, C6173a> implements MessageLiteOrBuilder {
            public C6173a() {
                super(WebviewFallbackOpen.DEFAULT_INSTANCE);
            }
        }

        static {
            WebviewFallbackOpen webviewFallbackOpen = new WebviewFallbackOpen();
            DEFAULT_INSTANCE = webviewFallbackOpen;
            GeneratedMessageLite.registerDefaultInstance(WebviewFallbackOpen.class, webviewFallbackOpen);
        }

        private WebviewFallbackOpen() {
        }

        public static WebviewFallbackOpen getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6173a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static WebviewFallbackOpen parseDelimitedFrom(InputStream inputStream) {
            return (WebviewFallbackOpen) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WebviewFallbackOpen parseFrom(ByteBuffer byteBuffer) {
            return (WebviewFallbackOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<WebviewFallbackOpen> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new WebviewFallbackOpen();
                case 2:
                    return new C6173a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<WebviewFallbackOpen> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (WebviewFallbackOpen.class) {
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

        public static C6173a newBuilder(WebviewFallbackOpen webviewFallbackOpen) {
            return DEFAULT_INSTANCE.createBuilder(webviewFallbackOpen);
        }

        public static WebviewFallbackOpen parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallbackOpen) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WebviewFallbackOpen parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallbackOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static WebviewFallbackOpen parseFrom(ByteString byteString) {
            return (WebviewFallbackOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static WebviewFallbackOpen parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallbackOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static WebviewFallbackOpen parseFrom(byte[] bArr) {
            return (WebviewFallbackOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WebviewFallbackOpen parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallbackOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static WebviewFallbackOpen parseFrom(InputStream inputStream) {
            return (WebviewFallbackOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WebviewFallbackOpen parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallbackOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WebviewFallbackOpen parseFrom(CodedInputStream codedInputStream) {
            return (WebviewFallbackOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static WebviewFallbackOpen parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFallbackOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class WebviewFirstPaneLoaded extends GeneratedMessageLite<WebviewFirstPaneLoaded, C6174a> implements MessageLiteOrBuilder {
        private static final WebviewFirstPaneLoaded DEFAULT_INSTANCE;
        public static final int DELAY_MS_FIELD_NUMBER = 1;
        public static final int DELAY_SINCE_OPEN_STARTED_MS_FIELD_NUMBER = 2;
        public static final int IS_SESSION_CONTINUATION_FIELD_NUMBER = 3;
        public static final int NAVIGATION_TIMING_FIELD_NUMBER = 4;
        private static volatile Parser<WebviewFirstPaneLoaded> PARSER = null;
        public static final int RESOURCE_TIMINGS_FIELD_NUMBER = 5;
        private int bitField0_;
        private long delayMs_;
        private long delaySinceOpenStartedMs_;
        private boolean isSessionContinuation_;
        private ClientEventOuterClass$Performance.NavigationTiming navigationTiming_;
        private MapFieldLite<String, ClientEventOuterClass$Performance.ResourceTiming> resourceTimings_ = MapFieldLite.emptyMapField();

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$WebviewFirstPaneLoaded$a */
        public static final class C6174a extends GeneratedMessageLite.Builder<WebviewFirstPaneLoaded, C6174a> implements MessageLiteOrBuilder {
            public C6174a() {
                super(WebviewFirstPaneLoaded.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$WebviewFirstPaneLoaded$b */
        public static final class C6175b {

            /* renamed from: a */
            public static final MapEntryLite<String, ClientEventOuterClass$Performance.ResourceTiming> f2103a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, ClientEventOuterClass$Performance.ResourceTiming.getDefaultInstance());
        }

        static {
            WebviewFirstPaneLoaded webviewFirstPaneLoaded = new WebviewFirstPaneLoaded();
            DEFAULT_INSTANCE = webviewFirstPaneLoaded;
            GeneratedMessageLite.registerDefaultInstance(WebviewFirstPaneLoaded.class, webviewFirstPaneLoaded);
        }

        private WebviewFirstPaneLoaded() {
        }

        private void clearDelayMs() {
            this.delayMs_ = 0L;
        }

        private void clearDelaySinceOpenStartedMs() {
            this.delaySinceOpenStartedMs_ = 0L;
        }

        private void clearIsSessionContinuation() {
            this.isSessionContinuation_ = false;
        }

        private void clearNavigationTiming() {
            this.navigationTiming_ = null;
            this.bitField0_ &= -2;
        }

        public static WebviewFirstPaneLoaded getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private Map<String, ClientEventOuterClass$Performance.ResourceTiming> getMutableResourceTimingsMap() {
            return internalGetMutableResourceTimings();
        }

        private MapFieldLite<String, ClientEventOuterClass$Performance.ResourceTiming> internalGetMutableResourceTimings() {
            if (!this.resourceTimings_.isMutable()) {
                this.resourceTimings_ = this.resourceTimings_.mutableCopy();
            }
            return this.resourceTimings_;
        }

        private MapFieldLite<String, ClientEventOuterClass$Performance.ResourceTiming> internalGetResourceTimings() {
            return this.resourceTimings_;
        }

        private void mergeNavigationTiming(ClientEventOuterClass$Performance.NavigationTiming navigationTiming) {
            navigationTiming.getClass();
            ClientEventOuterClass$Performance.NavigationTiming navigationTiming2 = this.navigationTiming_;
            if (navigationTiming2 == null || navigationTiming2 == ClientEventOuterClass$Performance.NavigationTiming.getDefaultInstance()) {
                this.navigationTiming_ = navigationTiming;
            } else {
                this.navigationTiming_ = ClientEventOuterClass$Performance.NavigationTiming.newBuilder(this.navigationTiming_).mergeFrom((ClientEventOuterClass$Performance.NavigationTiming.C6179a) navigationTiming).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static C6174a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static WebviewFirstPaneLoaded parseDelimitedFrom(InputStream inputStream) {
            return (WebviewFirstPaneLoaded) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WebviewFirstPaneLoaded parseFrom(ByteBuffer byteBuffer) {
            return (WebviewFirstPaneLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<WebviewFirstPaneLoaded> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDelayMs(long j) {
            this.delayMs_ = j;
        }

        private void setDelaySinceOpenStartedMs(long j) {
            this.delaySinceOpenStartedMs_ = j;
        }

        private void setIsSessionContinuation(boolean z) {
            this.isSessionContinuation_ = z;
        }

        private void setNavigationTiming(ClientEventOuterClass$Performance.NavigationTiming navigationTiming) {
            navigationTiming.getClass();
            this.navigationTiming_ = navigationTiming;
            this.bitField0_ |= 1;
        }

        public boolean containsResourceTimings(String str) {
            str.getClass();
            return internalGetResourceTimings().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new WebviewFirstPaneLoaded();
                case 2:
                    return new C6174a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0007\u0004ဉ\u0000\u00052", new Object[]{"bitField0_", "delayMs_", "delaySinceOpenStartedMs_", "isSessionContinuation_", "navigationTiming_", "resourceTimings_", C6175b.f2103a});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<WebviewFirstPaneLoaded> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (WebviewFirstPaneLoaded.class) {
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

        public long getDelayMs() {
            return this.delayMs_;
        }

        public long getDelaySinceOpenStartedMs() {
            return this.delaySinceOpenStartedMs_;
        }

        public boolean getIsSessionContinuation() {
            return this.isSessionContinuation_;
        }

        public ClientEventOuterClass$Performance.NavigationTiming getNavigationTiming() {
            ClientEventOuterClass$Performance.NavigationTiming navigationTiming = this.navigationTiming_;
            return navigationTiming == null ? ClientEventOuterClass$Performance.NavigationTiming.getDefaultInstance() : navigationTiming;
        }

        @Deprecated
        public Map<String, ClientEventOuterClass$Performance.ResourceTiming> getResourceTimings() {
            return getResourceTimingsMap();
        }

        public int getResourceTimingsCount() {
            return internalGetResourceTimings().size();
        }

        public Map<String, ClientEventOuterClass$Performance.ResourceTiming> getResourceTimingsMap() {
            return Collections.unmodifiableMap(internalGetResourceTimings());
        }

        public ClientEventOuterClass$Performance.ResourceTiming getResourceTimingsOrDefault(String str, ClientEventOuterClass$Performance.ResourceTiming resourceTiming) {
            str.getClass();
            MapFieldLite<String, ClientEventOuterClass$Performance.ResourceTiming> mapFieldLiteInternalGetResourceTimings = internalGetResourceTimings();
            return mapFieldLiteInternalGetResourceTimings.containsKey(str) ? mapFieldLiteInternalGetResourceTimings.get(str) : resourceTiming;
        }

        public ClientEventOuterClass$Performance.ResourceTiming getResourceTimingsOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, ClientEventOuterClass$Performance.ResourceTiming> mapFieldLiteInternalGetResourceTimings = internalGetResourceTimings();
            if (mapFieldLiteInternalGetResourceTimings.containsKey(str)) {
                return mapFieldLiteInternalGetResourceTimings.get(str);
            }
            throw new IllegalArgumentException();
        }

        public boolean hasNavigationTiming() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C6174a newBuilder(WebviewFirstPaneLoaded webviewFirstPaneLoaded) {
            return DEFAULT_INSTANCE.createBuilder(webviewFirstPaneLoaded);
        }

        public static WebviewFirstPaneLoaded parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFirstPaneLoaded) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WebviewFirstPaneLoaded parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFirstPaneLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static WebviewFirstPaneLoaded parseFrom(ByteString byteString) {
            return (WebviewFirstPaneLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static WebviewFirstPaneLoaded parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFirstPaneLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static WebviewFirstPaneLoaded parseFrom(byte[] bArr) {
            return (WebviewFirstPaneLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WebviewFirstPaneLoaded parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFirstPaneLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static WebviewFirstPaneLoaded parseFrom(InputStream inputStream) {
            return (WebviewFirstPaneLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WebviewFirstPaneLoaded parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFirstPaneLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WebviewFirstPaneLoaded parseFrom(CodedInputStream codedInputStream) {
            return (WebviewFirstPaneLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static WebviewFirstPaneLoaded parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WebviewFirstPaneLoaded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$b */
    public enum EnumC6177b {
        ACTION_OVERRIDE(1),
        BACK(2),
        CLIENT_OPEN_DELAY(3),
        ACTIVATE_EXPERIMENT(5),
        TRACK_EVENT_WITH_OPTIMIZELY(16),
        SECURE_INPUT_TOGGLE(6),
        OAUTH_INTERSTITIAL(7),
        OAUTH_LINK(12),
        NO_NETWORK_CONNECTION(9),
        SESSION_EXPIRED(10),
        PANE_APPEARED(11),
        PANE_AUTO_SUBMITTED(47),
        OPEN_MODAL(49),
        CLOSE_MODAL(48),
        SEARCH_SUCCESS(13),
        CLEAR_SEARCH(14),
        FOCUS_SEARCH(15),
        DOCUMENT_LOADED(17),
        WEBVIEW_FIRST_PANE_LOADED(18),
        FIRST_PANE_LOADED(41),
        LARGEST_CONTENTFUL_PAINT(21),
        WEB3_PANE_EVENT(19),
        CREDENTIALS_ACCORDION_TOGGLE(22),
        CLIENT_LOGO_LOADED(43),
        INCOME_WRAPPING_PARTNER_METADATA(32),
        PAYROLL_SEARCH_PANE(33),
        CREDENTIALS_PANE(34),
        SUCCESS_PANE(35),
        COMPLETED_PANE(36),
        INCOME_WRAPPING_UNSPECIFIED_INTERACTION(37),
        INCOME_WRAPPING_PARTNER_IFRAME_RENDERED(25),
        INCOME_WRAPPING_PARTNER_ERROR(27),
        FINGERPRINT_DATA_COLLECTED(26),
        TD_DATA_COLLECTED(28),
        WEBVIEW_FALLBACK_OPEN(29),
        WEBVIEW_FALLBACK_CANCEL(30),
        WEBVIEW_FALLBACK_OAUTH_POPUP_OPEN(31),
        WEBVIEW_FALLBACK_EMIT_PRE_COMPLETION_RESULT(38),
        ENROLLMENT_PHONE_NUMBER_CHANGE(39),
        ENROLLMENT_EMAIL_CHANGE(46),
        ENROLLMENT_OTP_CHANGE(51),
        PASSKEY_RESULT(40),
        PASSKEY_EVENT(42),
        LINK_SDK_OPEN(45),
        HOSTED_LINK_SECURITY_MODAL_EXIT(50),
        DATA_NOT_SET(0);


        /* renamed from: a */
        public final int f2105a;

        EnumC6177b(int i) {
            this.f2105a = i;
        }

        public static EnumC6177b forNumber(int i) {
            switch (i) {
                case 0:
                    return DATA_NOT_SET;
                case 1:
                    return ACTION_OVERRIDE;
                case 2:
                    return BACK;
                case 3:
                    return CLIENT_OPEN_DELAY;
                case 4:
                case 8:
                case 20:
                case 23:
                case 24:
                case 44:
                default:
                    return null;
                case 5:
                    return ACTIVATE_EXPERIMENT;
                case 6:
                    return SECURE_INPUT_TOGGLE;
                case 7:
                    return OAUTH_INTERSTITIAL;
                case 9:
                    return NO_NETWORK_CONNECTION;
                case 10:
                    return SESSION_EXPIRED;
                case 11:
                    return PANE_APPEARED;
                case 12:
                    return OAUTH_LINK;
                case 13:
                    return SEARCH_SUCCESS;
                case 14:
                    return CLEAR_SEARCH;
                case 15:
                    return FOCUS_SEARCH;
                case 16:
                    return TRACK_EVENT_WITH_OPTIMIZELY;
                case 17:
                    return DOCUMENT_LOADED;
                case 18:
                    return WEBVIEW_FIRST_PANE_LOADED;
                case 19:
                    return WEB3_PANE_EVENT;
                case 21:
                    return LARGEST_CONTENTFUL_PAINT;
                case 22:
                    return CREDENTIALS_ACCORDION_TOGGLE;
                case 25:
                    return INCOME_WRAPPING_PARTNER_IFRAME_RENDERED;
                case 26:
                    return FINGERPRINT_DATA_COLLECTED;
                case 27:
                    return INCOME_WRAPPING_PARTNER_ERROR;
                case 28:
                    return TD_DATA_COLLECTED;
                case 29:
                    return WEBVIEW_FALLBACK_OPEN;
                case 30:
                    return WEBVIEW_FALLBACK_CANCEL;
                case 31:
                    return WEBVIEW_FALLBACK_OAUTH_POPUP_OPEN;
                case 32:
                    return INCOME_WRAPPING_PARTNER_METADATA;
                case 33:
                    return PAYROLL_SEARCH_PANE;
                case 34:
                    return CREDENTIALS_PANE;
                case 35:
                    return SUCCESS_PANE;
                case 36:
                    return COMPLETED_PANE;
                case 37:
                    return INCOME_WRAPPING_UNSPECIFIED_INTERACTION;
                case 38:
                    return WEBVIEW_FALLBACK_EMIT_PRE_COMPLETION_RESULT;
                case 39:
                    return ENROLLMENT_PHONE_NUMBER_CHANGE;
                case 40:
                    return PASSKEY_RESULT;
                case 41:
                    return FIRST_PANE_LOADED;
                case 42:
                    return PASSKEY_EVENT;
                case 43:
                    return CLIENT_LOGO_LOADED;
                case 45:
                    return LINK_SDK_OPEN;
                case 46:
                    return ENROLLMENT_EMAIL_CHANGE;
                case 47:
                    return PANE_AUTO_SUBMITTED;
                case 48:
                    return CLOSE_MODAL;
                case 49:
                    return OPEN_MODAL;
                case 50:
                    return HOSTED_LINK_SECURITY_MODAL_EXIT;
                case 51:
                    return ENROLLMENT_OTP_CHANGE;
            }
        }

        public int getNumber() {
            return this.f2105a;
        }

        @Deprecated
        public static EnumC6177b valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$c */
    public enum EnumC6178c implements Internal.EnumLite {
        NULLABLE_BOOL_UNKNOWN(0),
        NULLABLE_BOOL_UNDEFINED(1),
        NULLABLE_BOOL_TRUE(2),
        NULLABLE_BOOL_FALSE(3),
        UNRECOGNIZED(-1);

        public static final int NULLABLE_BOOL_FALSE_VALUE = 3;
        public static final int NULLABLE_BOOL_TRUE_VALUE = 2;
        public static final int NULLABLE_BOOL_UNDEFINED_VALUE = 1;
        public static final int NULLABLE_BOOL_UNKNOWN_VALUE = 0;

        /* renamed from: b */
        public static final a f2106b = new a();

        /* renamed from: a */
        public final int f2108a;

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$c$a */
        public class a implements Internal.EnumLiteMap<EnumC6178c> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6178c.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$c$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2109a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6178c.forNumber(i) != null;
            }
        }

        EnumC6178c(int i) {
            this.f2108a = i;
        }

        public static EnumC6178c forNumber(int i) {
            if (i == 0) {
                return NULLABLE_BOOL_UNKNOWN;
            }
            if (i == 1) {
                return NULLABLE_BOOL_UNDEFINED;
            }
            if (i == 2) {
                return NULLABLE_BOOL_TRUE;
            }
            if (i != 3) {
                return null;
            }
            return NULLABLE_BOOL_FALSE;
        }

        public static Internal.EnumLiteMap<EnumC6178c> internalGetValueMap() {
            return f2106b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2109a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2108a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC6178c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent = new ClientEventOuterClass$ClientEvent();
        DEFAULT_INSTANCE = clientEventOuterClass$ClientEvent;
        GeneratedMessageLite.registerDefaultInstance(ClientEventOuterClass$ClientEvent.class, clientEventOuterClass$ClientEvent);
    }

    private ClientEventOuterClass$ClientEvent() {
    }

    private void clearActionOverride() {
        if (this.dataCase_ == 1) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearActivateExperiment() {
        if (this.dataCase_ == 5) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearBack() {
        if (this.dataCase_ == 2) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearClearSearch() {
        if (this.dataCase_ == 14) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearClientLogoLoaded() {
        if (this.dataCase_ == 43) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearClientOpenDelay() {
        if (this.dataCase_ == 3) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearClientPublishedAt() {
        this.clientPublishedAt_ = null;
        this.bitField0_ &= -2;
    }

    private void clearCloseModal() {
        if (this.dataCase_ == 48) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearCompletedPane() {
        if (this.dataCase_ == 36) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearCredentialsAccordionToggle() {
        if (this.dataCase_ == 22) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearCredentialsPane() {
        if (this.dataCase_ == 34) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearData() {
        this.dataCase_ = 0;
        this.data_ = null;
    }

    private void clearDocumentLoaded() {
        if (this.dataCase_ == 17) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearEnrollmentEmailChange() {
        if (this.dataCase_ == 46) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearEnrollmentOtpChange() {
        if (this.dataCase_ == 51) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearEnrollmentPhoneNumberChange() {
        if (this.dataCase_ == 39) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearFingerprintDataCollected() {
        if (this.dataCase_ == 26) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearFirstPaneLoaded() {
        if (this.dataCase_ == 41) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearFocusSearch() {
        if (this.dataCase_ == 15) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearHostedLinkSecurityModalExit() {
        if (this.dataCase_ == 50) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearIncomeWrappingPartnerError() {
        if (this.dataCase_ == 27) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearIncomeWrappingPartnerIframeRendered() {
        if (this.dataCase_ == 25) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearIncomeWrappingPartnerMetadata() {
        if (this.dataCase_ == 32) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearIncomeWrappingUnspecifiedInteraction() {
        if (this.dataCase_ == 37) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearLargestContentfulPaint() {
        if (this.dataCase_ == 21) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearLinkSdkOpen() {
        if (this.dataCase_ == 45) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearNoNetworkConnection() {
        if (this.dataCase_ == 9) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearOauthInterstitial() {
        if (this.dataCase_ == 7) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearOauthLink() {
        if (this.dataCase_ == 12) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearOpenModal() {
        if (this.dataCase_ == 49) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearPaneAppeared() {
        if (this.dataCase_ == 11) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearPaneAutoSubmitted() {
        if (this.dataCase_ == 47) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearPasskeyEvent() {
        if (this.dataCase_ == 42) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearPasskeyResult() {
        if (this.dataCase_ == 40) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearPayrollSearchPane() {
        if (this.dataCase_ == 33) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearSearchSuccess() {
        if (this.dataCase_ == 13) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearSecureInputToggle() {
        if (this.dataCase_ == 6) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearSessionExpired() {
        if (this.dataCase_ == 10) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearSuccessPane() {
        if (this.dataCase_ == 35) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearTdDataCollected() {
        if (this.dataCase_ == 28) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearTrackEventWithOptimizely() {
        if (this.dataCase_ == 16) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearWeb3PaneEvent() {
        if (this.dataCase_ == 19) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearWebviewFallbackCancel() {
        if (this.dataCase_ == 30) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearWebviewFallbackEmitPreCompletionResult() {
        if (this.dataCase_ == 38) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearWebviewFallbackOauthPopupOpen() {
        if (this.dataCase_ == 31) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearWebviewFallbackOpen() {
        if (this.dataCase_ == 29) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearWebviewFirstPaneLoaded() {
        if (this.dataCase_ == 18) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    private void clearWorkflowSessionId() {
        this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
    }

    public static ClientEventOuterClass$ClientEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeActionOverride(ActionOverride actionOverride) {
        actionOverride.getClass();
        if (this.dataCase_ != 1 || this.data_ == ActionOverride.getDefaultInstance()) {
            this.data_ = actionOverride;
        } else {
            this.data_ = ActionOverride.newBuilder((ActionOverride) this.data_).mergeFrom((ActionOverride.C6086a) actionOverride).buildPartial();
        }
        this.dataCase_ = 1;
    }

    private void mergeActivateExperiment(ActivateExperiment activateExperiment) {
        activateExperiment.getClass();
        if (this.dataCase_ != 5 || this.data_ == ActivateExperiment.getDefaultInstance()) {
            this.data_ = activateExperiment;
        } else {
            this.data_ = ActivateExperiment.newBuilder((ActivateExperiment) this.data_).mergeFrom((ActivateExperiment.C6087a) activateExperiment).buildPartial();
        }
        this.dataCase_ = 5;
    }

    private void mergeBack(Back back) {
        back.getClass();
        if (this.dataCase_ != 2 || this.data_ == Back.getDefaultInstance()) {
            this.data_ = back;
        } else {
            this.data_ = Back.newBuilder((Back) this.data_).mergeFrom((Back.C6088a) back).buildPartial();
        }
        this.dataCase_ = 2;
    }

    private void mergeClearSearch(ClearSearch clearSearch) {
        clearSearch.getClass();
        if (this.dataCase_ != 14 || this.data_ == ClearSearch.getDefaultInstance()) {
            this.data_ = clearSearch;
        } else {
            this.data_ = ClearSearch.newBuilder((ClearSearch) this.data_).mergeFrom((ClearSearch.C6091a) clearSearch).buildPartial();
        }
        this.dataCase_ = 14;
    }

    private void mergeClientLogoLoaded(ClientEventOuterClass$Performance.ResourceTiming resourceTiming) {
        resourceTiming.getClass();
        if (this.dataCase_ != 43 || this.data_ == ClientEventOuterClass$Performance.ResourceTiming.getDefaultInstance()) {
            this.data_ = resourceTiming;
        } else {
            this.data_ = ClientEventOuterClass$Performance.ResourceTiming.newBuilder((ClientEventOuterClass$Performance.ResourceTiming) this.data_).mergeFrom((ClientEventOuterClass$Performance.ResourceTiming.C6180a) resourceTiming).buildPartial();
        }
        this.dataCase_ = 43;
    }

    private void mergeClientOpenDelay(ClientOpenDelay clientOpenDelay) {
        clientOpenDelay.getClass();
        if (this.dataCase_ != 3 || this.data_ == ClientOpenDelay.getDefaultInstance()) {
            this.data_ = clientOpenDelay;
        } else {
            this.data_ = ClientOpenDelay.newBuilder((ClientOpenDelay) this.data_).mergeFrom((ClientOpenDelay.C6092a) clientOpenDelay).buildPartial();
        }
        this.dataCase_ = 3;
    }

    private void mergeClientPublishedAt(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.clientPublishedAt_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.clientPublishedAt_ = timestamp;
        } else {
            this.clientPublishedAt_ = Timestamp.newBuilder(this.clientPublishedAt_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeCloseModal(CloseModal closeModal) {
        closeModal.getClass();
        if (this.dataCase_ != 48 || this.data_ == CloseModal.getDefaultInstance()) {
            this.data_ = closeModal;
        } else {
            this.data_ = CloseModal.newBuilder((CloseModal) this.data_).mergeFrom((CloseModal.C6093a) closeModal).buildPartial();
        }
        this.dataCase_ = 48;
    }

    private void mergeCompletedPane(CompletedPane completedPane) {
        completedPane.getClass();
        if (this.dataCase_ != 36 || this.data_ == CompletedPane.getDefaultInstance()) {
            this.data_ = completedPane;
        } else {
            this.data_ = CompletedPane.newBuilder((CompletedPane) this.data_).mergeFrom((CompletedPane.C6094a) completedPane).buildPartial();
        }
        this.dataCase_ = 36;
    }

    private void mergeCredentialsAccordionToggle(CredentialsAccordionToggle credentialsAccordionToggle) {
        credentialsAccordionToggle.getClass();
        if (this.dataCase_ != 22 || this.data_ == CredentialsAccordionToggle.getDefaultInstance()) {
            this.data_ = credentialsAccordionToggle;
        } else {
            this.data_ = CredentialsAccordionToggle.newBuilder((CredentialsAccordionToggle) this.data_).mergeFrom((CredentialsAccordionToggle.C6095a) credentialsAccordionToggle).buildPartial();
        }
        this.dataCase_ = 22;
    }

    private void mergeCredentialsPane(CredentialsPane credentialsPane) {
        credentialsPane.getClass();
        if (this.dataCase_ != 34 || this.data_ == CredentialsPane.getDefaultInstance()) {
            this.data_ = credentialsPane;
        } else {
            this.data_ = CredentialsPane.newBuilder((CredentialsPane) this.data_).mergeFrom((CredentialsPane.C6096a) credentialsPane).buildPartial();
        }
        this.dataCase_ = 34;
    }

    private void mergeDocumentLoaded(DocumentLoaded documentLoaded) {
        documentLoaded.getClass();
        if (this.dataCase_ != 17 || this.data_ == DocumentLoaded.getDefaultInstance()) {
            this.data_ = documentLoaded;
        } else {
            this.data_ = DocumentLoaded.newBuilder((DocumentLoaded) this.data_).mergeFrom((DocumentLoaded.C6097a) documentLoaded).buildPartial();
        }
        this.dataCase_ = 17;
    }

    private void mergeEnrollmentEmailChange(EnrollmentEmailChange enrollmentEmailChange) {
        enrollmentEmailChange.getClass();
        if (this.dataCase_ != 46 || this.data_ == EnrollmentEmailChange.getDefaultInstance()) {
            this.data_ = enrollmentEmailChange;
        } else {
            this.data_ = EnrollmentEmailChange.newBuilder((EnrollmentEmailChange) this.data_).mergeFrom((EnrollmentEmailChange.C6098a) enrollmentEmailChange).buildPartial();
        }
        this.dataCase_ = 46;
    }

    private void mergeEnrollmentOtpChange(EnrollmentOTPChange enrollmentOTPChange) {
        enrollmentOTPChange.getClass();
        if (this.dataCase_ != 51 || this.data_ == EnrollmentOTPChange.getDefaultInstance()) {
            this.data_ = enrollmentOTPChange;
        } else {
            this.data_ = EnrollmentOTPChange.newBuilder((EnrollmentOTPChange) this.data_).mergeFrom((EnrollmentOTPChange.C6099a) enrollmentOTPChange).buildPartial();
        }
        this.dataCase_ = 51;
    }

    private void mergeEnrollmentPhoneNumberChange(EnrollmentPhoneNumberChange enrollmentPhoneNumberChange) {
        enrollmentPhoneNumberChange.getClass();
        if (this.dataCase_ != 39 || this.data_ == EnrollmentPhoneNumberChange.getDefaultInstance()) {
            this.data_ = enrollmentPhoneNumberChange;
        } else {
            this.data_ = EnrollmentPhoneNumberChange.newBuilder((EnrollmentPhoneNumberChange) this.data_).mergeFrom((EnrollmentPhoneNumberChange.C6100a) enrollmentPhoneNumberChange).buildPartial();
        }
        this.dataCase_ = 39;
    }

    private void mergeFingerprintDataCollected(FingerprintDataCollected fingerprintDataCollected) {
        fingerprintDataCollected.getClass();
        if (this.dataCase_ != 26 || this.data_ == FingerprintDataCollected.getDefaultInstance()) {
            this.data_ = fingerprintDataCollected;
        } else {
            this.data_ = FingerprintDataCollected.newBuilder((FingerprintDataCollected) this.data_).mergeFrom((FingerprintDataCollected.C6101a) fingerprintDataCollected).buildPartial();
        }
        this.dataCase_ = 26;
    }

    private void mergeFirstPaneLoaded(FirstPaneLoaded firstPaneLoaded) {
        firstPaneLoaded.getClass();
        if (this.dataCase_ != 41 || this.data_ == FirstPaneLoaded.getDefaultInstance()) {
            this.data_ = firstPaneLoaded;
        } else {
            this.data_ = FirstPaneLoaded.newBuilder((FirstPaneLoaded) this.data_).mergeFrom((FirstPaneLoaded.C6102a) firstPaneLoaded).buildPartial();
        }
        this.dataCase_ = 41;
    }

    private void mergeFocusSearch(FocusSearch focusSearch) {
        focusSearch.getClass();
        if (this.dataCase_ != 15 || this.data_ == FocusSearch.getDefaultInstance()) {
            this.data_ = focusSearch;
        } else {
            this.data_ = FocusSearch.newBuilder((FocusSearch) this.data_).mergeFrom((FocusSearch.C6104a) focusSearch).buildPartial();
        }
        this.dataCase_ = 15;
    }

    private void mergeHostedLinkSecurityModalExit(HostedLinkSecurityModalExit hostedLinkSecurityModalExit) {
        hostedLinkSecurityModalExit.getClass();
        if (this.dataCase_ != 50 || this.data_ == HostedLinkSecurityModalExit.getDefaultInstance()) {
            this.data_ = hostedLinkSecurityModalExit;
        } else {
            this.data_ = HostedLinkSecurityModalExit.newBuilder((HostedLinkSecurityModalExit) this.data_).mergeFrom((HostedLinkSecurityModalExit.C6105a) hostedLinkSecurityModalExit).buildPartial();
        }
        this.dataCase_ = 50;
    }

    private void mergeIncomeWrappingPartnerError(IncomeWrappingPartnerError incomeWrappingPartnerError) {
        incomeWrappingPartnerError.getClass();
        if (this.dataCase_ != 27 || this.data_ == IncomeWrappingPartnerError.getDefaultInstance()) {
            this.data_ = incomeWrappingPartnerError;
        } else {
            this.data_ = IncomeWrappingPartnerError.newBuilder((IncomeWrappingPartnerError) this.data_).mergeFrom((IncomeWrappingPartnerError.C6107a) incomeWrappingPartnerError).buildPartial();
        }
        this.dataCase_ = 27;
    }

    private void mergeIncomeWrappingPartnerIframeRendered(IncomeWrappingPartnerIFrameRendered incomeWrappingPartnerIFrameRendered) {
        incomeWrappingPartnerIFrameRendered.getClass();
        if (this.dataCase_ != 25 || this.data_ == IncomeWrappingPartnerIFrameRendered.getDefaultInstance()) {
            this.data_ = incomeWrappingPartnerIFrameRendered;
        } else {
            this.data_ = IncomeWrappingPartnerIFrameRendered.newBuilder((IncomeWrappingPartnerIFrameRendered) this.data_).mergeFrom((IncomeWrappingPartnerIFrameRendered.C6108a) incomeWrappingPartnerIFrameRendered).buildPartial();
        }
        this.dataCase_ = 25;
    }

    private void mergeIncomeWrappingPartnerMetadata(IncomeWrappingPartnerMetadata incomeWrappingPartnerMetadata) {
        incomeWrappingPartnerMetadata.getClass();
        if (this.dataCase_ != 32 || this.data_ == IncomeWrappingPartnerMetadata.getDefaultInstance()) {
            this.data_ = incomeWrappingPartnerMetadata;
        } else {
            this.data_ = IncomeWrappingPartnerMetadata.newBuilder((IncomeWrappingPartnerMetadata) this.data_).mergeFrom((IncomeWrappingPartnerMetadata.C6109a) incomeWrappingPartnerMetadata).buildPartial();
        }
        this.dataCase_ = 32;
    }

    private void mergeIncomeWrappingUnspecifiedInteraction(IncomeWrappingUnspecifiedInteraction incomeWrappingUnspecifiedInteraction) {
        incomeWrappingUnspecifiedInteraction.getClass();
        if (this.dataCase_ != 37 || this.data_ == IncomeWrappingUnspecifiedInteraction.getDefaultInstance()) {
            this.data_ = incomeWrappingUnspecifiedInteraction;
        } else {
            this.data_ = IncomeWrappingUnspecifiedInteraction.newBuilder((IncomeWrappingUnspecifiedInteraction) this.data_).mergeFrom((IncomeWrappingUnspecifiedInteraction.C6110a) incomeWrappingUnspecifiedInteraction).buildPartial();
        }
        this.dataCase_ = 37;
    }

    private void mergeLargestContentfulPaint(LargestContentfulPaint largestContentfulPaint) {
        largestContentfulPaint.getClass();
        if (this.dataCase_ != 21 || this.data_ == LargestContentfulPaint.getDefaultInstance()) {
            this.data_ = largestContentfulPaint;
        } else {
            this.data_ = LargestContentfulPaint.newBuilder((LargestContentfulPaint) this.data_).mergeFrom((LargestContentfulPaint.C6111a) largestContentfulPaint).buildPartial();
        }
        this.dataCase_ = 21;
    }

    private void mergeLinkSdkOpen(LinkSdkOpen linkSdkOpen) {
        linkSdkOpen.getClass();
        if (this.dataCase_ != 45 || this.data_ == LinkSdkOpen.getDefaultInstance()) {
            this.data_ = linkSdkOpen;
        } else {
            this.data_ = LinkSdkOpen.newBuilder((LinkSdkOpen) this.data_).mergeFrom((LinkSdkOpen.C6112a) linkSdkOpen).buildPartial();
        }
        this.dataCase_ = 45;
    }

    private void mergeNoNetworkConnection(NoNetworkConnection noNetworkConnection) {
        noNetworkConnection.getClass();
        if (this.dataCase_ != 9 || this.data_ == NoNetworkConnection.getDefaultInstance()) {
            this.data_ = noNetworkConnection;
        } else {
            this.data_ = NoNetworkConnection.newBuilder((NoNetworkConnection) this.data_).mergeFrom((NoNetworkConnection.C6113a) noNetworkConnection).buildPartial();
        }
        this.dataCase_ = 9;
    }

    private void mergeOauthInterstitial(OAuthInterstitial oAuthInterstitial) {
        oAuthInterstitial.getClass();
        if (this.dataCase_ != 7 || this.data_ == OAuthInterstitial.getDefaultInstance()) {
            this.data_ = oAuthInterstitial;
        } else {
            this.data_ = OAuthInterstitial.newBuilder((OAuthInterstitial) this.data_).mergeFrom((OAuthInterstitial.C6118a) oAuthInterstitial).buildPartial();
        }
        this.dataCase_ = 7;
    }

    private void mergeOauthLink(OAuthLink oAuthLink) {
        oAuthLink.getClass();
        if (this.dataCase_ != 12 || this.data_ == OAuthLink.getDefaultInstance()) {
            this.data_ = oAuthLink;
        } else {
            this.data_ = OAuthLink.newBuilder((OAuthLink) this.data_).mergeFrom((OAuthLink.C6138a) oAuthLink).buildPartial();
        }
        this.dataCase_ = 12;
    }

    private void mergeOpenModal(OpenModal openModal) {
        openModal.getClass();
        if (this.dataCase_ != 49 || this.data_ == OpenModal.getDefaultInstance()) {
            this.data_ = openModal;
        } else {
            this.data_ = OpenModal.newBuilder((OpenModal) this.data_).mergeFrom((OpenModal.C6140a) openModal).buildPartial();
        }
        this.dataCase_ = 49;
    }

    private void mergePaneAppeared(PaneAppeared paneAppeared) {
        paneAppeared.getClass();
        if (this.dataCase_ != 11 || this.data_ == PaneAppeared.getDefaultInstance()) {
            this.data_ = paneAppeared;
        } else {
            this.data_ = PaneAppeared.newBuilder((PaneAppeared) this.data_).mergeFrom((PaneAppeared.C6141a) paneAppeared).buildPartial();
        }
        this.dataCase_ = 11;
    }

    private void mergePaneAutoSubmitted(PaneAutoSubmitted paneAutoSubmitted) {
        paneAutoSubmitted.getClass();
        if (this.dataCase_ != 47 || this.data_ == PaneAutoSubmitted.getDefaultInstance()) {
            this.data_ = paneAutoSubmitted;
        } else {
            this.data_ = PaneAutoSubmitted.newBuilder((PaneAutoSubmitted) this.data_).mergeFrom((PaneAutoSubmitted.C6142a) paneAutoSubmitted).buildPartial();
        }
        this.dataCase_ = 47;
    }

    private void mergePasskeyEvent(PasskeyEvent passkeyEvent) {
        passkeyEvent.getClass();
        if (this.dataCase_ != 42 || this.data_ == PasskeyEvent.getDefaultInstance()) {
            this.data_ = passkeyEvent;
        } else {
            this.data_ = PasskeyEvent.newBuilder((PasskeyEvent) this.data_).mergeFrom((PasskeyEvent.C6149a) passkeyEvent).buildPartial();
        }
        this.dataCase_ = 42;
    }

    private void mergePasskeyResult(PasskeyResult passkeyResult) {
        passkeyResult.getClass();
        if (this.dataCase_ != 40 || this.data_ == PasskeyResult.getDefaultInstance()) {
            this.data_ = passkeyResult;
        } else {
            this.data_ = PasskeyResult.newBuilder((PasskeyResult) this.data_).mergeFrom((PasskeyResult.C6151a) passkeyResult).buildPartial();
        }
        this.dataCase_ = 40;
    }

    private void mergePayrollSearchPane(PayrollSearchPane payrollSearchPane) {
        payrollSearchPane.getClass();
        if (this.dataCase_ != 33 || this.data_ == PayrollSearchPane.getDefaultInstance()) {
            this.data_ = payrollSearchPane;
        } else {
            this.data_ = PayrollSearchPane.newBuilder((PayrollSearchPane) this.data_).mergeFrom((PayrollSearchPane.C6152a) payrollSearchPane).buildPartial();
        }
        this.dataCase_ = 33;
    }

    private void mergeSearchSuccess(SearchSuccess searchSuccess) {
        searchSuccess.getClass();
        if (this.dataCase_ != 13 || this.data_ == SearchSuccess.getDefaultInstance()) {
            this.data_ = searchSuccess;
        } else {
            this.data_ = SearchSuccess.newBuilder((SearchSuccess) this.data_).mergeFrom((SearchSuccess.C6154a) searchSuccess).buildPartial();
        }
        this.dataCase_ = 13;
    }

    private void mergeSecureInputToggle(SecureInputToggle secureInputToggle) {
        secureInputToggle.getClass();
        if (this.dataCase_ != 6 || this.data_ == SecureInputToggle.getDefaultInstance()) {
            this.data_ = secureInputToggle;
        } else {
            this.data_ = SecureInputToggle.newBuilder((SecureInputToggle) this.data_).mergeFrom((SecureInputToggle.C6156a) secureInputToggle).buildPartial();
        }
        this.dataCase_ = 6;
    }

    private void mergeSessionExpired(SessionExpired sessionExpired) {
        sessionExpired.getClass();
        if (this.dataCase_ != 10 || this.data_ == SessionExpired.getDefaultInstance()) {
            this.data_ = sessionExpired;
        } else {
            this.data_ = SessionExpired.newBuilder((SessionExpired) this.data_).mergeFrom((SessionExpired.C6157a) sessionExpired).buildPartial();
        }
        this.dataCase_ = 10;
    }

    private void mergeSuccessPane(SuccessPane successPane) {
        successPane.getClass();
        if (this.dataCase_ != 35 || this.data_ == SuccessPane.getDefaultInstance()) {
            this.data_ = successPane;
        } else {
            this.data_ = SuccessPane.newBuilder((SuccessPane) this.data_).mergeFrom((SuccessPane.C6158a) successPane).buildPartial();
        }
        this.dataCase_ = 35;
    }

    private void mergeTdDataCollected(TDDataCollected tDDataCollected) {
        tDDataCollected.getClass();
        if (this.dataCase_ != 28 || this.data_ == TDDataCollected.getDefaultInstance()) {
            this.data_ = tDDataCollected;
        } else {
            this.data_ = TDDataCollected.newBuilder((TDDataCollected) this.data_).mergeFrom((TDDataCollected.C6159a) tDDataCollected).buildPartial();
        }
        this.dataCase_ = 28;
    }

    private void mergeTrackEventWithOptimizely(TrackEventWithOptimizely trackEventWithOptimizely) {
        trackEventWithOptimizely.getClass();
        if (this.dataCase_ != 16 || this.data_ == TrackEventWithOptimizely.getDefaultInstance()) {
            this.data_ = trackEventWithOptimizely;
        } else {
            this.data_ = TrackEventWithOptimizely.newBuilder((TrackEventWithOptimizely) this.data_).mergeFrom((TrackEventWithOptimizely.C6160a) trackEventWithOptimizely).buildPartial();
        }
        this.dataCase_ = 16;
    }

    private void mergeWeb3PaneEvent(Web3PaneEvent web3PaneEvent) {
        web3PaneEvent.getClass();
        if (this.dataCase_ != 19 || this.data_ == Web3PaneEvent.getDefaultInstance()) {
            this.data_ = web3PaneEvent;
        } else {
            this.data_ = Web3PaneEvent.newBuilder((Web3PaneEvent) this.data_).mergeFrom((Web3PaneEvent.C6167a) web3PaneEvent).buildPartial();
        }
        this.dataCase_ = 19;
    }

    private void mergeWebviewFallbackCancel(WebviewFallbackCancel webviewFallbackCancel) {
        webviewFallbackCancel.getClass();
        if (this.dataCase_ != 30 || this.data_ == WebviewFallbackCancel.getDefaultInstance()) {
            this.data_ = webviewFallbackCancel;
        } else {
            this.data_ = WebviewFallbackCancel.newBuilder((WebviewFallbackCancel) this.data_).mergeFrom((WebviewFallbackCancel.C6168a) webviewFallbackCancel).buildPartial();
        }
        this.dataCase_ = 30;
    }

    private void mergeWebviewFallbackEmitPreCompletionResult(WebviewFallbackEmitPreCompletionResult webviewFallbackEmitPreCompletionResult) {
        webviewFallbackEmitPreCompletionResult.getClass();
        if (this.dataCase_ != 38 || this.data_ == WebviewFallbackEmitPreCompletionResult.getDefaultInstance()) {
            this.data_ = webviewFallbackEmitPreCompletionResult;
        } else {
            this.data_ = WebviewFallbackEmitPreCompletionResult.newBuilder((WebviewFallbackEmitPreCompletionResult) this.data_).mergeFrom((WebviewFallbackEmitPreCompletionResult.C6170a) webviewFallbackEmitPreCompletionResult).buildPartial();
        }
        this.dataCase_ = 38;
    }

    private void mergeWebviewFallbackOauthPopupOpen(WebviewFallbackOAuthPopupOpen webviewFallbackOAuthPopupOpen) {
        webviewFallbackOAuthPopupOpen.getClass();
        if (this.dataCase_ != 31 || this.data_ == WebviewFallbackOAuthPopupOpen.getDefaultInstance()) {
            this.data_ = webviewFallbackOAuthPopupOpen;
        } else {
            this.data_ = WebviewFallbackOAuthPopupOpen.newBuilder((WebviewFallbackOAuthPopupOpen) this.data_).mergeFrom((WebviewFallbackOAuthPopupOpen.C6171a) webviewFallbackOAuthPopupOpen).buildPartial();
        }
        this.dataCase_ = 31;
    }

    private void mergeWebviewFallbackOpen(WebviewFallbackOpen webviewFallbackOpen) {
        webviewFallbackOpen.getClass();
        if (this.dataCase_ != 29 || this.data_ == WebviewFallbackOpen.getDefaultInstance()) {
            this.data_ = webviewFallbackOpen;
        } else {
            this.data_ = WebviewFallbackOpen.newBuilder((WebviewFallbackOpen) this.data_).mergeFrom((WebviewFallbackOpen.C6173a) webviewFallbackOpen).buildPartial();
        }
        this.dataCase_ = 29;
    }

    private void mergeWebviewFirstPaneLoaded(WebviewFirstPaneLoaded webviewFirstPaneLoaded) {
        webviewFirstPaneLoaded.getClass();
        if (this.dataCase_ != 18 || this.data_ == WebviewFirstPaneLoaded.getDefaultInstance()) {
            this.data_ = webviewFirstPaneLoaded;
        } else {
            this.data_ = WebviewFirstPaneLoaded.newBuilder((WebviewFirstPaneLoaded) this.data_).mergeFrom((WebviewFirstPaneLoaded.C6174a) webviewFirstPaneLoaded).buildPartial();
        }
        this.dataCase_ = 18;
    }

    public static C6176a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ClientEventOuterClass$ClientEvent parseDelimitedFrom(InputStream inputStream) {
        return (ClientEventOuterClass$ClientEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientEventOuterClass$ClientEvent parseFrom(ByteBuffer byteBuffer) {
        return (ClientEventOuterClass$ClientEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ClientEventOuterClass$ClientEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setActionOverride(ActionOverride actionOverride) {
        actionOverride.getClass();
        this.data_ = actionOverride;
        this.dataCase_ = 1;
    }

    private void setActivateExperiment(ActivateExperiment activateExperiment) {
        activateExperiment.getClass();
        this.data_ = activateExperiment;
        this.dataCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBack(Back back) {
        back.getClass();
        this.data_ = back;
        this.dataCase_ = 2;
    }

    private void setClearSearch(ClearSearch clearSearch) {
        clearSearch.getClass();
        this.data_ = clearSearch;
        this.dataCase_ = 14;
    }

    private void setClientLogoLoaded(ClientEventOuterClass$Performance.ResourceTiming resourceTiming) {
        resourceTiming.getClass();
        this.data_ = resourceTiming;
        this.dataCase_ = 43;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientOpenDelay(ClientOpenDelay clientOpenDelay) {
        clientOpenDelay.getClass();
        this.data_ = clientOpenDelay;
        this.dataCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientPublishedAt(Timestamp timestamp) {
        timestamp.getClass();
        this.clientPublishedAt_ = timestamp;
        this.bitField0_ |= 1;
    }

    private void setCloseModal(CloseModal closeModal) {
        closeModal.getClass();
        this.data_ = closeModal;
        this.dataCase_ = 48;
    }

    private void setCompletedPane(CompletedPane completedPane) {
        completedPane.getClass();
        this.data_ = completedPane;
        this.dataCase_ = 36;
    }

    private void setCredentialsAccordionToggle(CredentialsAccordionToggle credentialsAccordionToggle) {
        credentialsAccordionToggle.getClass();
        this.data_ = credentialsAccordionToggle;
        this.dataCase_ = 22;
    }

    private void setCredentialsPane(CredentialsPane credentialsPane) {
        credentialsPane.getClass();
        this.data_ = credentialsPane;
        this.dataCase_ = 34;
    }

    private void setDocumentLoaded(DocumentLoaded documentLoaded) {
        documentLoaded.getClass();
        this.data_ = documentLoaded;
        this.dataCase_ = 17;
    }

    private void setEnrollmentEmailChange(EnrollmentEmailChange enrollmentEmailChange) {
        enrollmentEmailChange.getClass();
        this.data_ = enrollmentEmailChange;
        this.dataCase_ = 46;
    }

    private void setEnrollmentOtpChange(EnrollmentOTPChange enrollmentOTPChange) {
        enrollmentOTPChange.getClass();
        this.data_ = enrollmentOTPChange;
        this.dataCase_ = 51;
    }

    private void setEnrollmentPhoneNumberChange(EnrollmentPhoneNumberChange enrollmentPhoneNumberChange) {
        enrollmentPhoneNumberChange.getClass();
        this.data_ = enrollmentPhoneNumberChange;
        this.dataCase_ = 39;
    }

    private void setFingerprintDataCollected(FingerprintDataCollected fingerprintDataCollected) {
        fingerprintDataCollected.getClass();
        this.data_ = fingerprintDataCollected;
        this.dataCase_ = 26;
    }

    private void setFirstPaneLoaded(FirstPaneLoaded firstPaneLoaded) {
        firstPaneLoaded.getClass();
        this.data_ = firstPaneLoaded;
        this.dataCase_ = 41;
    }

    private void setFocusSearch(FocusSearch focusSearch) {
        focusSearch.getClass();
        this.data_ = focusSearch;
        this.dataCase_ = 15;
    }

    private void setHostedLinkSecurityModalExit(HostedLinkSecurityModalExit hostedLinkSecurityModalExit) {
        hostedLinkSecurityModalExit.getClass();
        this.data_ = hostedLinkSecurityModalExit;
        this.dataCase_ = 50;
    }

    private void setIncomeWrappingPartnerError(IncomeWrappingPartnerError incomeWrappingPartnerError) {
        incomeWrappingPartnerError.getClass();
        this.data_ = incomeWrappingPartnerError;
        this.dataCase_ = 27;
    }

    private void setIncomeWrappingPartnerIframeRendered(IncomeWrappingPartnerIFrameRendered incomeWrappingPartnerIFrameRendered) {
        incomeWrappingPartnerIFrameRendered.getClass();
        this.data_ = incomeWrappingPartnerIFrameRendered;
        this.dataCase_ = 25;
    }

    private void setIncomeWrappingPartnerMetadata(IncomeWrappingPartnerMetadata incomeWrappingPartnerMetadata) {
        incomeWrappingPartnerMetadata.getClass();
        this.data_ = incomeWrappingPartnerMetadata;
        this.dataCase_ = 32;
    }

    private void setIncomeWrappingUnspecifiedInteraction(IncomeWrappingUnspecifiedInteraction incomeWrappingUnspecifiedInteraction) {
        incomeWrappingUnspecifiedInteraction.getClass();
        this.data_ = incomeWrappingUnspecifiedInteraction;
        this.dataCase_ = 37;
    }

    private void setLargestContentfulPaint(LargestContentfulPaint largestContentfulPaint) {
        largestContentfulPaint.getClass();
        this.data_ = largestContentfulPaint;
        this.dataCase_ = 21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkSdkOpen(LinkSdkOpen linkSdkOpen) {
        linkSdkOpen.getClass();
        this.data_ = linkSdkOpen;
        this.dataCase_ = 45;
    }

    private void setNoNetworkConnection(NoNetworkConnection noNetworkConnection) {
        noNetworkConnection.getClass();
        this.data_ = noNetworkConnection;
        this.dataCase_ = 9;
    }

    private void setOauthInterstitial(OAuthInterstitial oAuthInterstitial) {
        oAuthInterstitial.getClass();
        this.data_ = oAuthInterstitial;
        this.dataCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOauthLink(OAuthLink oAuthLink) {
        oAuthLink.getClass();
        this.data_ = oAuthLink;
        this.dataCase_ = 12;
    }

    private void setOpenModal(OpenModal openModal) {
        openModal.getClass();
        this.data_ = openModal;
        this.dataCase_ = 49;
    }

    private void setPaneAppeared(PaneAppeared paneAppeared) {
        paneAppeared.getClass();
        this.data_ = paneAppeared;
        this.dataCase_ = 11;
    }

    private void setPaneAutoSubmitted(PaneAutoSubmitted paneAutoSubmitted) {
        paneAutoSubmitted.getClass();
        this.data_ = paneAutoSubmitted;
        this.dataCase_ = 47;
    }

    private void setPasskeyEvent(PasskeyEvent passkeyEvent) {
        passkeyEvent.getClass();
        this.data_ = passkeyEvent;
        this.dataCase_ = 42;
    }

    private void setPasskeyResult(PasskeyResult passkeyResult) {
        passkeyResult.getClass();
        this.data_ = passkeyResult;
        this.dataCase_ = 40;
    }

    private void setPayrollSearchPane(PayrollSearchPane payrollSearchPane) {
        payrollSearchPane.getClass();
        this.data_ = payrollSearchPane;
        this.dataCase_ = 33;
    }

    private void setSearchSuccess(SearchSuccess searchSuccess) {
        searchSuccess.getClass();
        this.data_ = searchSuccess;
        this.dataCase_ = 13;
    }

    private void setSecureInputToggle(SecureInputToggle secureInputToggle) {
        secureInputToggle.getClass();
        this.data_ = secureInputToggle;
        this.dataCase_ = 6;
    }

    private void setSessionExpired(SessionExpired sessionExpired) {
        sessionExpired.getClass();
        this.data_ = sessionExpired;
        this.dataCase_ = 10;
    }

    private void setSuccessPane(SuccessPane successPane) {
        successPane.getClass();
        this.data_ = successPane;
        this.dataCase_ = 35;
    }

    private void setTdDataCollected(TDDataCollected tDDataCollected) {
        tDDataCollected.getClass();
        this.data_ = tDDataCollected;
        this.dataCase_ = 28;
    }

    private void setTrackEventWithOptimizely(TrackEventWithOptimizely trackEventWithOptimizely) {
        trackEventWithOptimizely.getClass();
        this.data_ = trackEventWithOptimizely;
        this.dataCase_ = 16;
    }

    private void setWeb3PaneEvent(Web3PaneEvent web3PaneEvent) {
        web3PaneEvent.getClass();
        this.data_ = web3PaneEvent;
        this.dataCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebviewFallbackCancel(WebviewFallbackCancel webviewFallbackCancel) {
        webviewFallbackCancel.getClass();
        this.data_ = webviewFallbackCancel;
        this.dataCase_ = 30;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebviewFallbackEmitPreCompletionResult(WebviewFallbackEmitPreCompletionResult webviewFallbackEmitPreCompletionResult) {
        webviewFallbackEmitPreCompletionResult.getClass();
        this.data_ = webviewFallbackEmitPreCompletionResult;
        this.dataCase_ = 38;
    }

    private void setWebviewFallbackOauthPopupOpen(WebviewFallbackOAuthPopupOpen webviewFallbackOAuthPopupOpen) {
        webviewFallbackOAuthPopupOpen.getClass();
        this.data_ = webviewFallbackOAuthPopupOpen;
        this.dataCase_ = 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebviewFallbackOpen(WebviewFallbackOpen webviewFallbackOpen) {
        webviewFallbackOpen.getClass();
        this.data_ = webviewFallbackOpen;
        this.dataCase_ = 29;
    }

    private void setWebviewFirstPaneLoaded(WebviewFirstPaneLoaded webviewFirstPaneLoaded) {
        webviewFirstPaneLoaded.getClass();
        this.data_ = webviewFirstPaneLoaded;
        this.dataCase_ = 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWorkflowSessionId(String str) {
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
        switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
            case 1:
                return new ClientEventOuterClass$ClientEvent();
            case 2:
                return new C6176a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000/\u0001\u0001\u00013/\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004Ȉ\u0005<\u0000\u0006<\u0000\u0007<\u0000\bဉ\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0015<\u0000\u0016<\u0000\u0019<\u0000\u001a<\u0000\u001b<\u0000\u001c<\u0000\u001d<\u0000\u001e<\u0000\u001f<\u0000 <\u0000!<\u0000\"<\u0000#<\u0000$<\u0000%<\u0000&<\u0000'<\u0000(<\u0000)<\u0000*<\u0000+<\u0000-<\u0000.<\u0000/<\u00000<\u00001<\u00002<\u00003<\u0000", new Object[]{"data_", "dataCase_", "bitField0_", ActionOverride.class, Back.class, ClientOpenDelay.class, "workflowSessionId_", ActivateExperiment.class, SecureInputToggle.class, OAuthInterstitial.class, "clientPublishedAt_", NoNetworkConnection.class, SessionExpired.class, PaneAppeared.class, OAuthLink.class, SearchSuccess.class, ClearSearch.class, FocusSearch.class, TrackEventWithOptimizely.class, DocumentLoaded.class, WebviewFirstPaneLoaded.class, Web3PaneEvent.class, LargestContentfulPaint.class, CredentialsAccordionToggle.class, IncomeWrappingPartnerIFrameRendered.class, FingerprintDataCollected.class, IncomeWrappingPartnerError.class, TDDataCollected.class, WebviewFallbackOpen.class, WebviewFallbackCancel.class, WebviewFallbackOAuthPopupOpen.class, IncomeWrappingPartnerMetadata.class, PayrollSearchPane.class, CredentialsPane.class, SuccessPane.class, CompletedPane.class, IncomeWrappingUnspecifiedInteraction.class, WebviewFallbackEmitPreCompletionResult.class, EnrollmentPhoneNumberChange.class, PasskeyResult.class, FirstPaneLoaded.class, PasskeyEvent.class, ClientEventOuterClass$Performance.ResourceTiming.class, LinkSdkOpen.class, EnrollmentEmailChange.class, PaneAutoSubmitted.class, CloseModal.class, OpenModal.class, HostedLinkSecurityModalExit.class, EnrollmentOTPChange.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ClientEventOuterClass$ClientEvent> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ClientEventOuterClass$ClientEvent.class) {
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

    public ActionOverride getActionOverride() {
        return this.dataCase_ == 1 ? (ActionOverride) this.data_ : ActionOverride.getDefaultInstance();
    }

    public ActivateExperiment getActivateExperiment() {
        return this.dataCase_ == 5 ? (ActivateExperiment) this.data_ : ActivateExperiment.getDefaultInstance();
    }

    public Back getBack() {
        return this.dataCase_ == 2 ? (Back) this.data_ : Back.getDefaultInstance();
    }

    public ClearSearch getClearSearch() {
        return this.dataCase_ == 14 ? (ClearSearch) this.data_ : ClearSearch.getDefaultInstance();
    }

    public ClientEventOuterClass$Performance.ResourceTiming getClientLogoLoaded() {
        return this.dataCase_ == 43 ? (ClientEventOuterClass$Performance.ResourceTiming) this.data_ : ClientEventOuterClass$Performance.ResourceTiming.getDefaultInstance();
    }

    public ClientOpenDelay getClientOpenDelay() {
        return this.dataCase_ == 3 ? (ClientOpenDelay) this.data_ : ClientOpenDelay.getDefaultInstance();
    }

    public Timestamp getClientPublishedAt() {
        Timestamp timestamp = this.clientPublishedAt_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public CloseModal getCloseModal() {
        return this.dataCase_ == 48 ? (CloseModal) this.data_ : CloseModal.getDefaultInstance();
    }

    public CompletedPane getCompletedPane() {
        return this.dataCase_ == 36 ? (CompletedPane) this.data_ : CompletedPane.getDefaultInstance();
    }

    public CredentialsAccordionToggle getCredentialsAccordionToggle() {
        return this.dataCase_ == 22 ? (CredentialsAccordionToggle) this.data_ : CredentialsAccordionToggle.getDefaultInstance();
    }

    public CredentialsPane getCredentialsPane() {
        return this.dataCase_ == 34 ? (CredentialsPane) this.data_ : CredentialsPane.getDefaultInstance();
    }

    public EnumC6177b getDataCase() {
        return EnumC6177b.forNumber(this.dataCase_);
    }

    public DocumentLoaded getDocumentLoaded() {
        return this.dataCase_ == 17 ? (DocumentLoaded) this.data_ : DocumentLoaded.getDefaultInstance();
    }

    public EnrollmentEmailChange getEnrollmentEmailChange() {
        return this.dataCase_ == 46 ? (EnrollmentEmailChange) this.data_ : EnrollmentEmailChange.getDefaultInstance();
    }

    public EnrollmentOTPChange getEnrollmentOtpChange() {
        return this.dataCase_ == 51 ? (EnrollmentOTPChange) this.data_ : EnrollmentOTPChange.getDefaultInstance();
    }

    public EnrollmentPhoneNumberChange getEnrollmentPhoneNumberChange() {
        return this.dataCase_ == 39 ? (EnrollmentPhoneNumberChange) this.data_ : EnrollmentPhoneNumberChange.getDefaultInstance();
    }

    public FingerprintDataCollected getFingerprintDataCollected() {
        return this.dataCase_ == 26 ? (FingerprintDataCollected) this.data_ : FingerprintDataCollected.getDefaultInstance();
    }

    public FirstPaneLoaded getFirstPaneLoaded() {
        return this.dataCase_ == 41 ? (FirstPaneLoaded) this.data_ : FirstPaneLoaded.getDefaultInstance();
    }

    public FocusSearch getFocusSearch() {
        return this.dataCase_ == 15 ? (FocusSearch) this.data_ : FocusSearch.getDefaultInstance();
    }

    public HostedLinkSecurityModalExit getHostedLinkSecurityModalExit() {
        return this.dataCase_ == 50 ? (HostedLinkSecurityModalExit) this.data_ : HostedLinkSecurityModalExit.getDefaultInstance();
    }

    public IncomeWrappingPartnerError getIncomeWrappingPartnerError() {
        return this.dataCase_ == 27 ? (IncomeWrappingPartnerError) this.data_ : IncomeWrappingPartnerError.getDefaultInstance();
    }

    public IncomeWrappingPartnerIFrameRendered getIncomeWrappingPartnerIframeRendered() {
        return this.dataCase_ == 25 ? (IncomeWrappingPartnerIFrameRendered) this.data_ : IncomeWrappingPartnerIFrameRendered.getDefaultInstance();
    }

    public IncomeWrappingPartnerMetadata getIncomeWrappingPartnerMetadata() {
        return this.dataCase_ == 32 ? (IncomeWrappingPartnerMetadata) this.data_ : IncomeWrappingPartnerMetadata.getDefaultInstance();
    }

    public IncomeWrappingUnspecifiedInteraction getIncomeWrappingUnspecifiedInteraction() {
        return this.dataCase_ == 37 ? (IncomeWrappingUnspecifiedInteraction) this.data_ : IncomeWrappingUnspecifiedInteraction.getDefaultInstance();
    }

    public LargestContentfulPaint getLargestContentfulPaint() {
        return this.dataCase_ == 21 ? (LargestContentfulPaint) this.data_ : LargestContentfulPaint.getDefaultInstance();
    }

    public LinkSdkOpen getLinkSdkOpen() {
        return this.dataCase_ == 45 ? (LinkSdkOpen) this.data_ : LinkSdkOpen.getDefaultInstance();
    }

    public NoNetworkConnection getNoNetworkConnection() {
        return this.dataCase_ == 9 ? (NoNetworkConnection) this.data_ : NoNetworkConnection.getDefaultInstance();
    }

    public OAuthInterstitial getOauthInterstitial() {
        return this.dataCase_ == 7 ? (OAuthInterstitial) this.data_ : OAuthInterstitial.getDefaultInstance();
    }

    public OAuthLink getOauthLink() {
        return this.dataCase_ == 12 ? (OAuthLink) this.data_ : OAuthLink.getDefaultInstance();
    }

    public OpenModal getOpenModal() {
        return this.dataCase_ == 49 ? (OpenModal) this.data_ : OpenModal.getDefaultInstance();
    }

    public PaneAppeared getPaneAppeared() {
        return this.dataCase_ == 11 ? (PaneAppeared) this.data_ : PaneAppeared.getDefaultInstance();
    }

    public PaneAutoSubmitted getPaneAutoSubmitted() {
        return this.dataCase_ == 47 ? (PaneAutoSubmitted) this.data_ : PaneAutoSubmitted.getDefaultInstance();
    }

    public PasskeyEvent getPasskeyEvent() {
        return this.dataCase_ == 42 ? (PasskeyEvent) this.data_ : PasskeyEvent.getDefaultInstance();
    }

    public PasskeyResult getPasskeyResult() {
        return this.dataCase_ == 40 ? (PasskeyResult) this.data_ : PasskeyResult.getDefaultInstance();
    }

    public PayrollSearchPane getPayrollSearchPane() {
        return this.dataCase_ == 33 ? (PayrollSearchPane) this.data_ : PayrollSearchPane.getDefaultInstance();
    }

    public SearchSuccess getSearchSuccess() {
        return this.dataCase_ == 13 ? (SearchSuccess) this.data_ : SearchSuccess.getDefaultInstance();
    }

    public SecureInputToggle getSecureInputToggle() {
        return this.dataCase_ == 6 ? (SecureInputToggle) this.data_ : SecureInputToggle.getDefaultInstance();
    }

    public SessionExpired getSessionExpired() {
        return this.dataCase_ == 10 ? (SessionExpired) this.data_ : SessionExpired.getDefaultInstance();
    }

    public SuccessPane getSuccessPane() {
        return this.dataCase_ == 35 ? (SuccessPane) this.data_ : SuccessPane.getDefaultInstance();
    }

    public TDDataCollected getTdDataCollected() {
        return this.dataCase_ == 28 ? (TDDataCollected) this.data_ : TDDataCollected.getDefaultInstance();
    }

    public TrackEventWithOptimizely getTrackEventWithOptimizely() {
        return this.dataCase_ == 16 ? (TrackEventWithOptimizely) this.data_ : TrackEventWithOptimizely.getDefaultInstance();
    }

    public Web3PaneEvent getWeb3PaneEvent() {
        return this.dataCase_ == 19 ? (Web3PaneEvent) this.data_ : Web3PaneEvent.getDefaultInstance();
    }

    public WebviewFallbackCancel getWebviewFallbackCancel() {
        return this.dataCase_ == 30 ? (WebviewFallbackCancel) this.data_ : WebviewFallbackCancel.getDefaultInstance();
    }

    public WebviewFallbackEmitPreCompletionResult getWebviewFallbackEmitPreCompletionResult() {
        return this.dataCase_ == 38 ? (WebviewFallbackEmitPreCompletionResult) this.data_ : WebviewFallbackEmitPreCompletionResult.getDefaultInstance();
    }

    public WebviewFallbackOAuthPopupOpen getWebviewFallbackOauthPopupOpen() {
        return this.dataCase_ == 31 ? (WebviewFallbackOAuthPopupOpen) this.data_ : WebviewFallbackOAuthPopupOpen.getDefaultInstance();
    }

    public WebviewFallbackOpen getWebviewFallbackOpen() {
        return this.dataCase_ == 29 ? (WebviewFallbackOpen) this.data_ : WebviewFallbackOpen.getDefaultInstance();
    }

    public WebviewFirstPaneLoaded getWebviewFirstPaneLoaded() {
        return this.dataCase_ == 18 ? (WebviewFirstPaneLoaded) this.data_ : WebviewFirstPaneLoaded.getDefaultInstance();
    }

    public String getWorkflowSessionId() {
        return this.workflowSessionId_;
    }

    public ByteString getWorkflowSessionIdBytes() {
        return ByteString.copyFromUtf8(this.workflowSessionId_);
    }

    public boolean hasActionOverride() {
        return this.dataCase_ == 1;
    }

    public boolean hasActivateExperiment() {
        return this.dataCase_ == 5;
    }

    public boolean hasBack() {
        return this.dataCase_ == 2;
    }

    public boolean hasClearSearch() {
        return this.dataCase_ == 14;
    }

    public boolean hasClientLogoLoaded() {
        return this.dataCase_ == 43;
    }

    public boolean hasClientOpenDelay() {
        return this.dataCase_ == 3;
    }

    public boolean hasClientPublishedAt() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCloseModal() {
        return this.dataCase_ == 48;
    }

    public boolean hasCompletedPane() {
        return this.dataCase_ == 36;
    }

    public boolean hasCredentialsAccordionToggle() {
        return this.dataCase_ == 22;
    }

    public boolean hasCredentialsPane() {
        return this.dataCase_ == 34;
    }

    public boolean hasDocumentLoaded() {
        return this.dataCase_ == 17;
    }

    public boolean hasEnrollmentEmailChange() {
        return this.dataCase_ == 46;
    }

    public boolean hasEnrollmentOtpChange() {
        return this.dataCase_ == 51;
    }

    public boolean hasEnrollmentPhoneNumberChange() {
        return this.dataCase_ == 39;
    }

    public boolean hasFingerprintDataCollected() {
        return this.dataCase_ == 26;
    }

    public boolean hasFirstPaneLoaded() {
        return this.dataCase_ == 41;
    }

    public boolean hasFocusSearch() {
        return this.dataCase_ == 15;
    }

    public boolean hasHostedLinkSecurityModalExit() {
        return this.dataCase_ == 50;
    }

    public boolean hasIncomeWrappingPartnerError() {
        return this.dataCase_ == 27;
    }

    public boolean hasIncomeWrappingPartnerIframeRendered() {
        return this.dataCase_ == 25;
    }

    public boolean hasIncomeWrappingPartnerMetadata() {
        return this.dataCase_ == 32;
    }

    public boolean hasIncomeWrappingUnspecifiedInteraction() {
        return this.dataCase_ == 37;
    }

    public boolean hasLargestContentfulPaint() {
        return this.dataCase_ == 21;
    }

    public boolean hasLinkSdkOpen() {
        return this.dataCase_ == 45;
    }

    public boolean hasNoNetworkConnection() {
        return this.dataCase_ == 9;
    }

    public boolean hasOauthInterstitial() {
        return this.dataCase_ == 7;
    }

    public boolean hasOauthLink() {
        return this.dataCase_ == 12;
    }

    public boolean hasOpenModal() {
        return this.dataCase_ == 49;
    }

    public boolean hasPaneAppeared() {
        return this.dataCase_ == 11;
    }

    public boolean hasPaneAutoSubmitted() {
        return this.dataCase_ == 47;
    }

    public boolean hasPasskeyEvent() {
        return this.dataCase_ == 42;
    }

    public boolean hasPasskeyResult() {
        return this.dataCase_ == 40;
    }

    public boolean hasPayrollSearchPane() {
        return this.dataCase_ == 33;
    }

    public boolean hasSearchSuccess() {
        return this.dataCase_ == 13;
    }

    public boolean hasSecureInputToggle() {
        return this.dataCase_ == 6;
    }

    public boolean hasSessionExpired() {
        return this.dataCase_ == 10;
    }

    public boolean hasSuccessPane() {
        return this.dataCase_ == 35;
    }

    public boolean hasTdDataCollected() {
        return this.dataCase_ == 28;
    }

    public boolean hasTrackEventWithOptimizely() {
        return this.dataCase_ == 16;
    }

    public boolean hasWeb3PaneEvent() {
        return this.dataCase_ == 19;
    }

    public boolean hasWebviewFallbackCancel() {
        return this.dataCase_ == 30;
    }

    public boolean hasWebviewFallbackEmitPreCompletionResult() {
        return this.dataCase_ == 38;
    }

    public boolean hasWebviewFallbackOauthPopupOpen() {
        return this.dataCase_ == 31;
    }

    public boolean hasWebviewFallbackOpen() {
        return this.dataCase_ == 29;
    }

    public boolean hasWebviewFirstPaneLoaded() {
        return this.dataCase_ == 18;
    }

    /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$a */
    public static final class C6176a extends GeneratedMessageLite.Builder<ClientEventOuterClass$ClientEvent, C6176a> implements InterfaceC6257c {
        public C6176a() {
            super(ClientEventOuterClass$ClientEvent.DEFAULT_INSTANCE);
        }

        /* renamed from: a */
        public final C6176a m1400a(Back.C6088a c6088a) {
            copyOnWrite();
            ((ClientEventOuterClass$ClientEvent) this.instance).setBack(c6088a.build());
            return this;
        }

        /* renamed from: a */
        public final C6176a m1401a(ClientOpenDelay.C6092a c6092a) {
            copyOnWrite();
            ((ClientEventOuterClass$ClientEvent) this.instance).setClientOpenDelay(c6092a.build());
            return this;
        }

        /* renamed from: a */
        public final C6176a m1403a(OAuthLink.C6138a c6138a) {
            copyOnWrite();
            ((ClientEventOuterClass$ClientEvent) this.instance).setOauthLink(c6138a.build());
            return this;
        }

        /* renamed from: a */
        public final C6176a m1406a(WebviewFallbackOpen webviewFallbackOpen) {
            copyOnWrite();
            ((ClientEventOuterClass$ClientEvent) this.instance).setWebviewFallbackOpen(webviewFallbackOpen);
            return this;
        }

        /* renamed from: a */
        public final C6176a m1404a(WebviewFallbackCancel webviewFallbackCancel) {
            copyOnWrite();
            ((ClientEventOuterClass$ClientEvent) this.instance).setWebviewFallbackCancel(webviewFallbackCancel);
            return this;
        }

        /* renamed from: a */
        public final C6176a m1405a(WebviewFallbackEmitPreCompletionResult webviewFallbackEmitPreCompletionResult) {
            copyOnWrite();
            ((ClientEventOuterClass$ClientEvent) this.instance).setWebviewFallbackEmitPreCompletionResult(webviewFallbackEmitPreCompletionResult);
            return this;
        }

        /* renamed from: a */
        public final C6176a m1402a(LinkSdkOpen.C6112a c6112a) {
            copyOnWrite();
            ((ClientEventOuterClass$ClientEvent) this.instance).setLinkSdkOpen(c6112a.build());
            return this;
        }

        /* renamed from: a */
        public final C6176a m1407a(String str) {
            copyOnWrite();
            ((ClientEventOuterClass$ClientEvent) this.instance).setWorkflowSessionId(str);
            return this;
        }

        /* renamed from: a */
        public final C6176a m1399a(Timestamp.Builder builder) {
            copyOnWrite();
            ((ClientEventOuterClass$ClientEvent) this.instance).setClientPublishedAt(builder.build());
            return this;
        }
    }

    public static C6176a newBuilder(ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent) {
        return DEFAULT_INSTANCE.createBuilder(clientEventOuterClass$ClientEvent);
    }

    public static ClientEventOuterClass$ClientEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientEventOuterClass$ClientEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ClientEventOuterClass$ClientEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientEventOuterClass$ClientEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ClientEventOuterClass$ClientEvent parseFrom(ByteString byteString) {
        return (ClientEventOuterClass$ClientEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ClientEventOuterClass$ClientEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientEventOuterClass$ClientEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ClientEventOuterClass$ClientEvent parseFrom(byte[] bArr) {
        return (ClientEventOuterClass$ClientEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ClientEventOuterClass$ClientEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientEventOuterClass$ClientEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ClientEventOuterClass$ClientEvent parseFrom(InputStream inputStream) {
        return (ClientEventOuterClass$ClientEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientEventOuterClass$ClientEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientEventOuterClass$ClientEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ClientEventOuterClass$ClientEvent parseFrom(CodedInputStream codedInputStream) {
        return (ClientEventOuterClass$ClientEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ClientEventOuterClass$ClientEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientEventOuterClass$ClientEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
