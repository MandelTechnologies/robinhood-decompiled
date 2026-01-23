package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent;
import com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$LocalAction extends GeneratedMessageLite<Common$LocalAction, C6441b> implements InterfaceC6297B {
    public static final int ALSO_SUBMIT_ACTION_FIELD_NUMBER = 5;
    public static final int AUTHORIZE_FINANCEKIT_FIELD_NUMBER = 15;
    public static final int AUTOMATIC_HANDOFF_UNSUPPORTED_INSTITUTION_FIELD_NUMBER = 14;
    public static final int CALL_PHONE_NUMBER_FIELD_NUMBER = 3;
    public static final int CLOSE_LINK_FROM_HOSTED_LINK_SECURITY_MODAL_FIELD_NUMBER = 19;
    private static final Common$LocalAction DEFAULT_INSTANCE;
    public static final int EMBEDDED_SESSION_HANDOFF_FIELD_NUMBER = 22;
    public static final int EMIT_SDK_INTERNAL_EVENT_FIELD_NUMBER = 11;
    public static final int EVENT_METADATA_FIELD_NUMBER = 13;
    public static final int EXECUTE_RECAPTCHA_ENTERPRISE_FIELD_NUMBER = 9;
    public static final int FOCUS_INPUT_FIELD_NUMBER = 8;
    public static final int GO_BACK_FIELD_NUMBER = 7;
    public static final int HANDOFF_UNSUPPORTED_INSTITUTION_FIELD_NUMBER = 12;
    public static final int HIDE_MODAL_FIELD_NUMBER = 6;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAVIGATE_TO_URL_FIELD_NUMBER = 2;
    public static final int OOPWV_CLOSE_FIELD_NUMBER = 17;
    public static final int OOPWV_OPEN_FIELD_NUMBER = 16;
    private static volatile Parser<Common$LocalAction> PARSER = null;
    public static final int SDK_EVENT_FIELD_NUMBER = 10;
    public static final int SFPC_REQUEST_FIELD_NUMBER = 18;
    public static final int SHOW_MODAL_FIELD_NUMBER = 4;
    public static final int TRIGGER_ACTION_FIELD_NUMBER = 21;
    public static final int TRIGGER_HAPTIC_FIELD_NUMBER = 20;
    private Object action_;
    private boolean alsoSubmitAction_;
    private int bitField0_;
    private EventMetadata eventMetadata_;
    private Common$SDKEvent sdkEvent_;
    private int actionCase_ = 0;
    private String id_ = "";

    public static final class EmbeddedSessionHandoff extends GeneratedMessageLite<EmbeddedSessionHandoff, C6430a> implements MessageLiteOrBuilder {
        public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 2;
        private static final EmbeddedSessionHandoff DEFAULT_INSTANCE;
        private static volatile Parser<EmbeddedSessionHandoff> PARSER = null;
        public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 1;
        private String workflowSessionId_ = "";
        private String continuationToken_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction$EmbeddedSessionHandoff$a */
        public static final class C6430a extends GeneratedMessageLite.Builder<EmbeddedSessionHandoff, C6430a> implements MessageLiteOrBuilder {
            public C6430a() {
                super(EmbeddedSessionHandoff.DEFAULT_INSTANCE);
            }
        }

        static {
            EmbeddedSessionHandoff embeddedSessionHandoff = new EmbeddedSessionHandoff();
            DEFAULT_INSTANCE = embeddedSessionHandoff;
            GeneratedMessageLite.registerDefaultInstance(EmbeddedSessionHandoff.class, embeddedSessionHandoff);
        }

        private EmbeddedSessionHandoff() {
        }

        private void clearContinuationToken() {
            this.continuationToken_ = getDefaultInstance().getContinuationToken();
        }

        private void clearWorkflowSessionId() {
            this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
        }

        public static EmbeddedSessionHandoff getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6430a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static EmbeddedSessionHandoff parseDelimitedFrom(InputStream inputStream) {
            return (EmbeddedSessionHandoff) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EmbeddedSessionHandoff parseFrom(ByteBuffer byteBuffer) {
            return (EmbeddedSessionHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<EmbeddedSessionHandoff> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setContinuationToken(String str) {
            str.getClass();
            this.continuationToken_ = str;
        }

        private void setContinuationTokenBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.continuationToken_ = byteString.toStringUtf8();
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
            switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                case 1:
                    return new EmbeddedSessionHandoff();
                case 2:
                    return new C6430a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"workflowSessionId_", "continuationToken_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EmbeddedSessionHandoff> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (EmbeddedSessionHandoff.class) {
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

        public String getContinuationToken() {
            return this.continuationToken_;
        }

        public ByteString getContinuationTokenBytes() {
            return ByteString.copyFromUtf8(this.continuationToken_);
        }

        public String getWorkflowSessionId() {
            return this.workflowSessionId_;
        }

        public ByteString getWorkflowSessionIdBytes() {
            return ByteString.copyFromUtf8(this.workflowSessionId_);
        }

        public static C6430a newBuilder(EmbeddedSessionHandoff embeddedSessionHandoff) {
            return DEFAULT_INSTANCE.createBuilder(embeddedSessionHandoff);
        }

        public static EmbeddedSessionHandoff parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedSessionHandoff) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EmbeddedSessionHandoff parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedSessionHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EmbeddedSessionHandoff parseFrom(ByteString byteString) {
            return (EmbeddedSessionHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EmbeddedSessionHandoff parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedSessionHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static EmbeddedSessionHandoff parseFrom(byte[] bArr) {
            return (EmbeddedSessionHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EmbeddedSessionHandoff parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedSessionHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EmbeddedSessionHandoff parseFrom(InputStream inputStream) {
            return (EmbeddedSessionHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EmbeddedSessionHandoff parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedSessionHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EmbeddedSessionHandoff parseFrom(CodedInputStream codedInputStream) {
            return (EmbeddedSessionHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EmbeddedSessionHandoff parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedSessionHandoff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class EventMetadata extends GeneratedMessageLite<EventMetadata, C6431a> implements MessageLiteOrBuilder {
        private static final EventMetadata DEFAULT_INSTANCE;
        public static final int INSTITUTION_ID_FIELD_NUMBER = 1;
        private static volatile Parser<EventMetadata> PARSER;
        private String institutionId_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction$EventMetadata$a */
        public static final class C6431a extends GeneratedMessageLite.Builder<EventMetadata, C6431a> implements MessageLiteOrBuilder {
            public C6431a() {
                super(EventMetadata.DEFAULT_INSTANCE);
            }
        }

        static {
            EventMetadata eventMetadata = new EventMetadata();
            DEFAULT_INSTANCE = eventMetadata;
            GeneratedMessageLite.registerDefaultInstance(EventMetadata.class, eventMetadata);
        }

        private EventMetadata() {
        }

        private void clearInstitutionId() {
            this.institutionId_ = getDefaultInstance().getInstitutionId();
        }

        public static EventMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6431a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static EventMetadata parseDelimitedFrom(InputStream inputStream) {
            return (EventMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EventMetadata parseFrom(ByteBuffer byteBuffer) {
            return (EventMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<EventMetadata> parser() {
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
            switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                case 1:
                    return new EventMetadata();
                case 2:
                    return new C6431a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"institutionId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EventMetadata> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (EventMetadata.class) {
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

        public static C6431a newBuilder(EventMetadata eventMetadata) {
            return DEFAULT_INSTANCE.createBuilder(eventMetadata);
        }

        public static EventMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EventMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EventMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (EventMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EventMetadata parseFrom(ByteString byteString) {
            return (EventMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EventMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (EventMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static EventMetadata parseFrom(byte[] bArr) {
            return (EventMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EventMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (EventMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EventMetadata parseFrom(InputStream inputStream) {
            return (EventMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EventMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EventMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EventMetadata parseFrom(CodedInputStream codedInputStream) {
            return (EventMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EventMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EventMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OopwvClose extends GeneratedMessageLite<OopwvClose, C6432a> implements MessageLiteOrBuilder {
        private static final OopwvClose DEFAULT_INSTANCE;
        private static volatile Parser<OopwvClose> PARSER = null;
        public static final int URL_FIELD_NUMBER = 1;
        private String url_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction$OopwvClose$a */
        public static final class C6432a extends GeneratedMessageLite.Builder<OopwvClose, C6432a> implements MessageLiteOrBuilder {
            public C6432a() {
                super(OopwvClose.DEFAULT_INSTANCE);
            }
        }

        static {
            OopwvClose oopwvClose = new OopwvClose();
            DEFAULT_INSTANCE = oopwvClose;
            GeneratedMessageLite.registerDefaultInstance(OopwvClose.class, oopwvClose);
        }

        private OopwvClose() {
        }

        private void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        public static OopwvClose getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6432a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OopwvClose parseDelimitedFrom(InputStream inputStream) {
            return (OopwvClose) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OopwvClose parseFrom(ByteBuffer byteBuffer) {
            return (OopwvClose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<OopwvClose> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        private void setUrlBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                case 1:
                    return new OopwvClose();
                case 2:
                    return new C6432a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"url_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<OopwvClose> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (OopwvClose.class) {
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

        public String getUrl() {
            return this.url_;
        }

        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        public static C6432a newBuilder(OopwvClose oopwvClose) {
            return DEFAULT_INSTANCE.createBuilder(oopwvClose);
        }

        public static OopwvClose parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OopwvClose) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OopwvClose parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (OopwvClose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OopwvClose parseFrom(ByteString byteString) {
            return (OopwvClose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OopwvClose parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (OopwvClose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OopwvClose parseFrom(byte[] bArr) {
            return (OopwvClose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OopwvClose parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (OopwvClose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OopwvClose parseFrom(InputStream inputStream) {
            return (OopwvClose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OopwvClose parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OopwvClose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OopwvClose parseFrom(CodedInputStream codedInputStream) {
            return (OopwvClose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OopwvClose parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OopwvClose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OopwvOpen extends GeneratedMessageLite<OopwvOpen, C6436a> implements MessageLiteOrBuilder {
        public static final int ANDROID_CALLBACKS_FIELD_NUMBER = 6;
        private static final OopwvOpen DEFAULT_INSTANCE;
        public static final int IOS_CALLBACKS_FIELD_NUMBER = 5;
        public static final int LEGACY_EVENTS_CHANNEL_INFO_FIELD_NUMBER = 7;
        public static final int OPEN_MESSAGE_FIELD_NUMBER = 2;
        public static final int OPEN_URL_FIELD_NUMBER = 3;
        private static volatile Parser<OopwvOpen> PARSER;
        private int bitField0_;
        private LegacyEventsChannelInfo legacyEventsChannelInfo_;
        private OauthInitializationOptions$MobileSdkUrlOpenMessage openMessage_;
        private Object openTo_;
        private Object submitCallbacks_;
        private int openToCase_ = 0;
        private int submitCallbacksCase_ = 0;

        public static final class AndroidCallbacks extends GeneratedMessageLite<AndroidCallbacks, C6433a> implements MessageLiteOrBuilder {
            private static final AndroidCallbacks DEFAULT_INSTANCE;
            private static volatile Parser<AndroidCallbacks> PARSER = null;
            public static final int SUBMIT_OUTPUT_ON_CANCEL_FIELD_NUMBER = 2;
            public static final int SUBMIT_OUTPUT_ON_FINISH_FIELD_NUMBER = 1;
            private int bitField0_;
            private Any submitOutputOnCancel_;
            private Any submitOutputOnFinish_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction$OopwvOpen$AndroidCallbacks$a */
            public static final class C6433a extends GeneratedMessageLite.Builder<AndroidCallbacks, C6433a> implements MessageLiteOrBuilder {
                public C6433a() {
                    super(AndroidCallbacks.DEFAULT_INSTANCE);
                }
            }

            static {
                AndroidCallbacks androidCallbacks = new AndroidCallbacks();
                DEFAULT_INSTANCE = androidCallbacks;
                GeneratedMessageLite.registerDefaultInstance(AndroidCallbacks.class, androidCallbacks);
            }

            private AndroidCallbacks() {
            }

            private void clearSubmitOutputOnCancel() {
                this.submitOutputOnCancel_ = null;
                this.bitField0_ &= -3;
            }

            private void clearSubmitOutputOnFinish() {
                this.submitOutputOnFinish_ = null;
                this.bitField0_ &= -2;
            }

            public static AndroidCallbacks getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeSubmitOutputOnCancel(Any any) {
                any.getClass();
                Any any2 = this.submitOutputOnCancel_;
                if (any2 == null || any2 == Any.getDefaultInstance()) {
                    this.submitOutputOnCancel_ = any;
                } else {
                    this.submitOutputOnCancel_ = Any.newBuilder(this.submitOutputOnCancel_).mergeFrom((Any.Builder) any).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeSubmitOutputOnFinish(Any any) {
                any.getClass();
                Any any2 = this.submitOutputOnFinish_;
                if (any2 == null || any2 == Any.getDefaultInstance()) {
                    this.submitOutputOnFinish_ = any;
                } else {
                    this.submitOutputOnFinish_ = Any.newBuilder(this.submitOutputOnFinish_).mergeFrom((Any.Builder) any).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6433a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static AndroidCallbacks parseDelimitedFrom(InputStream inputStream) {
                return (AndroidCallbacks) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static AndroidCallbacks parseFrom(ByteBuffer byteBuffer) {
                return (AndroidCallbacks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<AndroidCallbacks> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setSubmitOutputOnCancel(Any any) {
                any.getClass();
                this.submitOutputOnCancel_ = any;
                this.bitField0_ |= 2;
            }

            private void setSubmitOutputOnFinish(Any any) {
                any.getClass();
                this.submitOutputOnFinish_ = any;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new AndroidCallbacks();
                    case 2:
                        return new C6433a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "submitOutputOnFinish_", "submitOutputOnCancel_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<AndroidCallbacks> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (AndroidCallbacks.class) {
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

            public Any getSubmitOutputOnCancel() {
                Any any = this.submitOutputOnCancel_;
                return any == null ? Any.getDefaultInstance() : any;
            }

            public Any getSubmitOutputOnFinish() {
                Any any = this.submitOutputOnFinish_;
                return any == null ? Any.getDefaultInstance() : any;
            }

            public boolean hasSubmitOutputOnCancel() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasSubmitOutputOnFinish() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6433a newBuilder(AndroidCallbacks androidCallbacks) {
                return DEFAULT_INSTANCE.createBuilder(androidCallbacks);
            }

            public static AndroidCallbacks parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (AndroidCallbacks) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static AndroidCallbacks parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (AndroidCallbacks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static AndroidCallbacks parseFrom(ByteString byteString) {
                return (AndroidCallbacks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static AndroidCallbacks parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (AndroidCallbacks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static AndroidCallbacks parseFrom(byte[] bArr) {
                return (AndroidCallbacks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static AndroidCallbacks parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (AndroidCallbacks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static AndroidCallbacks parseFrom(InputStream inputStream) {
                return (AndroidCallbacks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static AndroidCallbacks parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (AndroidCallbacks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static AndroidCallbacks parseFrom(CodedInputStream codedInputStream) {
                return (AndroidCallbacks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static AndroidCallbacks parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (AndroidCallbacks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class IosCallbacks extends GeneratedMessageLite<IosCallbacks, C6434a> implements MessageLiteOrBuilder {
            private static final IosCallbacks DEFAULT_INSTANCE;
            private static volatile Parser<IosCallbacks> PARSER = null;
            public static final int SUBMIT_OUTPUT_ON_CANCEL_FIELD_NUMBER = 3;
            public static final int SUBMIT_OUTPUT_ON_DECLINE_OPEN_SESSION_ONLY_FIELD_NUMBER = 2;
            public static final int SUBMIT_OUTPUT_ON_FINISH_FIELD_NUMBER = 1;
            private int bitField0_;
            private Any submitOutputOnCancel_;
            private Any submitOutputOnDeclineOpenSessionOnly_;
            private Any submitOutputOnFinish_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction$OopwvOpen$IosCallbacks$a */
            public static final class C6434a extends GeneratedMessageLite.Builder<IosCallbacks, C6434a> implements MessageLiteOrBuilder {
                public C6434a() {
                    super(IosCallbacks.DEFAULT_INSTANCE);
                }
            }

            static {
                IosCallbacks iosCallbacks = new IosCallbacks();
                DEFAULT_INSTANCE = iosCallbacks;
                GeneratedMessageLite.registerDefaultInstance(IosCallbacks.class, iosCallbacks);
            }

            private IosCallbacks() {
            }

            private void clearSubmitOutputOnCancel() {
                this.submitOutputOnCancel_ = null;
                this.bitField0_ &= -5;
            }

            private void clearSubmitOutputOnDeclineOpenSessionOnly() {
                this.submitOutputOnDeclineOpenSessionOnly_ = null;
                this.bitField0_ &= -3;
            }

            private void clearSubmitOutputOnFinish() {
                this.submitOutputOnFinish_ = null;
                this.bitField0_ &= -2;
            }

            public static IosCallbacks getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeSubmitOutputOnCancel(Any any) {
                any.getClass();
                Any any2 = this.submitOutputOnCancel_;
                if (any2 == null || any2 == Any.getDefaultInstance()) {
                    this.submitOutputOnCancel_ = any;
                } else {
                    this.submitOutputOnCancel_ = Any.newBuilder(this.submitOutputOnCancel_).mergeFrom((Any.Builder) any).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeSubmitOutputOnDeclineOpenSessionOnly(Any any) {
                any.getClass();
                Any any2 = this.submitOutputOnDeclineOpenSessionOnly_;
                if (any2 == null || any2 == Any.getDefaultInstance()) {
                    this.submitOutputOnDeclineOpenSessionOnly_ = any;
                } else {
                    this.submitOutputOnDeclineOpenSessionOnly_ = Any.newBuilder(this.submitOutputOnDeclineOpenSessionOnly_).mergeFrom((Any.Builder) any).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeSubmitOutputOnFinish(Any any) {
                any.getClass();
                Any any2 = this.submitOutputOnFinish_;
                if (any2 == null || any2 == Any.getDefaultInstance()) {
                    this.submitOutputOnFinish_ = any;
                } else {
                    this.submitOutputOnFinish_ = Any.newBuilder(this.submitOutputOnFinish_).mergeFrom((Any.Builder) any).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6434a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static IosCallbacks parseDelimitedFrom(InputStream inputStream) {
                return (IosCallbacks) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static IosCallbacks parseFrom(ByteBuffer byteBuffer) {
                return (IosCallbacks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<IosCallbacks> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setSubmitOutputOnCancel(Any any) {
                any.getClass();
                this.submitOutputOnCancel_ = any;
                this.bitField0_ |= 4;
            }

            private void setSubmitOutputOnDeclineOpenSessionOnly(Any any) {
                any.getClass();
                this.submitOutputOnDeclineOpenSessionOnly_ = any;
                this.bitField0_ |= 2;
            }

            private void setSubmitOutputOnFinish(Any any) {
                any.getClass();
                this.submitOutputOnFinish_ = any;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new IosCallbacks();
                    case 2:
                        return new C6434a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "submitOutputOnFinish_", "submitOutputOnDeclineOpenSessionOnly_", "submitOutputOnCancel_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<IosCallbacks> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (IosCallbacks.class) {
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

            public Any getSubmitOutputOnCancel() {
                Any any = this.submitOutputOnCancel_;
                return any == null ? Any.getDefaultInstance() : any;
            }

            public Any getSubmitOutputOnDeclineOpenSessionOnly() {
                Any any = this.submitOutputOnDeclineOpenSessionOnly_;
                return any == null ? Any.getDefaultInstance() : any;
            }

            public Any getSubmitOutputOnFinish() {
                Any any = this.submitOutputOnFinish_;
                return any == null ? Any.getDefaultInstance() : any;
            }

            public boolean hasSubmitOutputOnCancel() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasSubmitOutputOnDeclineOpenSessionOnly() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasSubmitOutputOnFinish() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6434a newBuilder(IosCallbacks iosCallbacks) {
                return DEFAULT_INSTANCE.createBuilder(iosCallbacks);
            }

            public static IosCallbacks parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (IosCallbacks) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static IosCallbacks parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (IosCallbacks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static IosCallbacks parseFrom(ByteString byteString) {
                return (IosCallbacks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static IosCallbacks parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (IosCallbacks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static IosCallbacks parseFrom(byte[] bArr) {
                return (IosCallbacks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static IosCallbacks parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (IosCallbacks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static IosCallbacks parseFrom(InputStream inputStream) {
                return (IosCallbacks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static IosCallbacks parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (IosCallbacks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static IosCallbacks parseFrom(CodedInputStream codedInputStream) {
                return (IosCallbacks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static IosCallbacks parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (IosCallbacks) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class LegacyEventsChannelInfo extends GeneratedMessageLite<LegacyEventsChannelInfo, C6435a> implements MessageLiteOrBuilder {
            public static final int CHANNEL_ID_FIELD_NUMBER = 1;
            public static final int CHANNEL_SECRET_FIELD_NUMBER = 2;
            private static final LegacyEventsChannelInfo DEFAULT_INSTANCE;
            private static volatile Parser<LegacyEventsChannelInfo> PARSER;
            private String channelId_ = "";
            private String channelSecret_ = "";

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction$OopwvOpen$LegacyEventsChannelInfo$a */
            public static final class C6435a extends GeneratedMessageLite.Builder<LegacyEventsChannelInfo, C6435a> implements MessageLiteOrBuilder {
                public C6435a() {
                    super(LegacyEventsChannelInfo.DEFAULT_INSTANCE);
                }
            }

            static {
                LegacyEventsChannelInfo legacyEventsChannelInfo = new LegacyEventsChannelInfo();
                DEFAULT_INSTANCE = legacyEventsChannelInfo;
                GeneratedMessageLite.registerDefaultInstance(LegacyEventsChannelInfo.class, legacyEventsChannelInfo);
            }

            private LegacyEventsChannelInfo() {
            }

            private void clearChannelId() {
                this.channelId_ = getDefaultInstance().getChannelId();
            }

            private void clearChannelSecret() {
                this.channelSecret_ = getDefaultInstance().getChannelSecret();
            }

            public static LegacyEventsChannelInfo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6435a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static LegacyEventsChannelInfo parseDelimitedFrom(InputStream inputStream) {
                return (LegacyEventsChannelInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LegacyEventsChannelInfo parseFrom(ByteBuffer byteBuffer) {
                return (LegacyEventsChannelInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<LegacyEventsChannelInfo> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setChannelId(String str) {
                str.getClass();
                this.channelId_ = str;
            }

            private void setChannelIdBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.channelId_ = byteString.toStringUtf8();
            }

            private void setChannelSecret(String str) {
                str.getClass();
                this.channelSecret_ = str;
            }

            private void setChannelSecretBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.channelSecret_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new LegacyEventsChannelInfo();
                    case 2:
                        return new C6435a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"channelId_", "channelSecret_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<LegacyEventsChannelInfo> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (LegacyEventsChannelInfo.class) {
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

            public String getChannelId() {
                return this.channelId_;
            }

            public ByteString getChannelIdBytes() {
                return ByteString.copyFromUtf8(this.channelId_);
            }

            public String getChannelSecret() {
                return this.channelSecret_;
            }

            public ByteString getChannelSecretBytes() {
                return ByteString.copyFromUtf8(this.channelSecret_);
            }

            public static C6435a newBuilder(LegacyEventsChannelInfo legacyEventsChannelInfo) {
                return DEFAULT_INSTANCE.createBuilder(legacyEventsChannelInfo);
            }

            public static LegacyEventsChannelInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LegacyEventsChannelInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LegacyEventsChannelInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (LegacyEventsChannelInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static LegacyEventsChannelInfo parseFrom(ByteString byteString) {
                return (LegacyEventsChannelInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static LegacyEventsChannelInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (LegacyEventsChannelInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static LegacyEventsChannelInfo parseFrom(byte[] bArr) {
                return (LegacyEventsChannelInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static LegacyEventsChannelInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (LegacyEventsChannelInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static LegacyEventsChannelInfo parseFrom(InputStream inputStream) {
                return (LegacyEventsChannelInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LegacyEventsChannelInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LegacyEventsChannelInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LegacyEventsChannelInfo parseFrom(CodedInputStream codedInputStream) {
                return (LegacyEventsChannelInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static LegacyEventsChannelInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LegacyEventsChannelInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction$OopwvOpen$a */
        public static final class C6436a extends GeneratedMessageLite.Builder<OopwvOpen, C6436a> implements MessageLiteOrBuilder {
            public C6436a() {
                super(OopwvOpen.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction$OopwvOpen$b */
        public enum EnumC6437b {
            OPEN_URL(3),
            OPENTO_NOT_SET(0);


            /* renamed from: a */
            public final int f2237a;

            EnumC6437b(int i) {
                this.f2237a = i;
            }

            public static EnumC6437b forNumber(int i) {
                if (i == 0) {
                    return OPENTO_NOT_SET;
                }
                if (i != 3) {
                    return null;
                }
                return OPEN_URL;
            }

            public int getNumber() {
                return this.f2237a;
            }

            @Deprecated
            public static EnumC6437b valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction$OopwvOpen$c */
        public enum EnumC6438c {
            IOS_CALLBACKS(5),
            ANDROID_CALLBACKS(6),
            SUBMITCALLBACKS_NOT_SET(0);


            /* renamed from: a */
            public final int f2239a;

            EnumC6438c(int i) {
                this.f2239a = i;
            }

            public static EnumC6438c forNumber(int i) {
                if (i == 0) {
                    return SUBMITCALLBACKS_NOT_SET;
                }
                if (i == 5) {
                    return IOS_CALLBACKS;
                }
                if (i != 6) {
                    return null;
                }
                return ANDROID_CALLBACKS;
            }

            public int getNumber() {
                return this.f2239a;
            }

            @Deprecated
            public static EnumC6438c valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            OopwvOpen oopwvOpen = new OopwvOpen();
            DEFAULT_INSTANCE = oopwvOpen;
            GeneratedMessageLite.registerDefaultInstance(OopwvOpen.class, oopwvOpen);
        }

        private OopwvOpen() {
        }

        private void clearAndroidCallbacks() {
            if (this.submitCallbacksCase_ == 6) {
                this.submitCallbacksCase_ = 0;
                this.submitCallbacks_ = null;
            }
        }

        private void clearIosCallbacks() {
            if (this.submitCallbacksCase_ == 5) {
                this.submitCallbacksCase_ = 0;
                this.submitCallbacks_ = null;
            }
        }

        private void clearLegacyEventsChannelInfo() {
            this.legacyEventsChannelInfo_ = null;
            this.bitField0_ &= -3;
        }

        private void clearOpenMessage() {
            this.openMessage_ = null;
            this.bitField0_ &= -2;
        }

        private void clearOpenTo() {
            this.openToCase_ = 0;
            this.openTo_ = null;
        }

        private void clearOpenUrl() {
            if (this.openToCase_ == 3) {
                this.openToCase_ = 0;
                this.openTo_ = null;
            }
        }

        private void clearSubmitCallbacks() {
            this.submitCallbacksCase_ = 0;
            this.submitCallbacks_ = null;
        }

        public static OopwvOpen getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeAndroidCallbacks(AndroidCallbacks androidCallbacks) {
            androidCallbacks.getClass();
            if (this.submitCallbacksCase_ != 6 || this.submitCallbacks_ == AndroidCallbacks.getDefaultInstance()) {
                this.submitCallbacks_ = androidCallbacks;
            } else {
                this.submitCallbacks_ = AndroidCallbacks.newBuilder((AndroidCallbacks) this.submitCallbacks_).mergeFrom((AndroidCallbacks.C6433a) androidCallbacks).buildPartial();
            }
            this.submitCallbacksCase_ = 6;
        }

        private void mergeIosCallbacks(IosCallbacks iosCallbacks) {
            iosCallbacks.getClass();
            if (this.submitCallbacksCase_ != 5 || this.submitCallbacks_ == IosCallbacks.getDefaultInstance()) {
                this.submitCallbacks_ = iosCallbacks;
            } else {
                this.submitCallbacks_ = IosCallbacks.newBuilder((IosCallbacks) this.submitCallbacks_).mergeFrom((IosCallbacks.C6434a) iosCallbacks).buildPartial();
            }
            this.submitCallbacksCase_ = 5;
        }

        private void mergeLegacyEventsChannelInfo(LegacyEventsChannelInfo legacyEventsChannelInfo) {
            legacyEventsChannelInfo.getClass();
            LegacyEventsChannelInfo legacyEventsChannelInfo2 = this.legacyEventsChannelInfo_;
            if (legacyEventsChannelInfo2 == null || legacyEventsChannelInfo2 == LegacyEventsChannelInfo.getDefaultInstance()) {
                this.legacyEventsChannelInfo_ = legacyEventsChannelInfo;
            } else {
                this.legacyEventsChannelInfo_ = LegacyEventsChannelInfo.newBuilder(this.legacyEventsChannelInfo_).mergeFrom((LegacyEventsChannelInfo.C6435a) legacyEventsChannelInfo).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeOpenMessage(OauthInitializationOptions$MobileSdkUrlOpenMessage oauthInitializationOptions$MobileSdkUrlOpenMessage) {
            oauthInitializationOptions$MobileSdkUrlOpenMessage.getClass();
            OauthInitializationOptions$MobileSdkUrlOpenMessage oauthInitializationOptions$MobileSdkUrlOpenMessage2 = this.openMessage_;
            if (oauthInitializationOptions$MobileSdkUrlOpenMessage2 == null || oauthInitializationOptions$MobileSdkUrlOpenMessage2 == OauthInitializationOptions$MobileSdkUrlOpenMessage.getDefaultInstance()) {
                this.openMessage_ = oauthInitializationOptions$MobileSdkUrlOpenMessage;
            } else {
                this.openMessage_ = OauthInitializationOptions$MobileSdkUrlOpenMessage.newBuilder(this.openMessage_).mergeFrom((OauthInitializationOptions$MobileSdkUrlOpenMessage.C6992a) oauthInitializationOptions$MobileSdkUrlOpenMessage).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static C6436a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OopwvOpen parseDelimitedFrom(InputStream inputStream) {
            return (OopwvOpen) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OopwvOpen parseFrom(ByteBuffer byteBuffer) {
            return (OopwvOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<OopwvOpen> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAndroidCallbacks(AndroidCallbacks androidCallbacks) {
            androidCallbacks.getClass();
            this.submitCallbacks_ = androidCallbacks;
            this.submitCallbacksCase_ = 6;
        }

        private void setIosCallbacks(IosCallbacks iosCallbacks) {
            iosCallbacks.getClass();
            this.submitCallbacks_ = iosCallbacks;
            this.submitCallbacksCase_ = 5;
        }

        private void setLegacyEventsChannelInfo(LegacyEventsChannelInfo legacyEventsChannelInfo) {
            legacyEventsChannelInfo.getClass();
            this.legacyEventsChannelInfo_ = legacyEventsChannelInfo;
            this.bitField0_ |= 2;
        }

        private void setOpenMessage(OauthInitializationOptions$MobileSdkUrlOpenMessage oauthInitializationOptions$MobileSdkUrlOpenMessage) {
            oauthInitializationOptions$MobileSdkUrlOpenMessage.getClass();
            this.openMessage_ = oauthInitializationOptions$MobileSdkUrlOpenMessage;
            this.bitField0_ |= 1;
        }

        private void setOpenUrl(String str) {
            str.getClass();
            this.openToCase_ = 3;
            this.openTo_ = str;
        }

        private void setOpenUrlBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.openTo_ = byteString.toStringUtf8();
            this.openToCase_ = 3;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                case 1:
                    return new OopwvOpen();
                case 2:
                    return new C6436a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0002\u0001\u0002\u0007\u0005\u0000\u0000\u0000\u0002ဉ\u0000\u0003Ȼ\u0000\u0005<\u0001\u0006<\u0001\u0007ဉ\u0001", new Object[]{"openTo_", "openToCase_", "submitCallbacks_", "submitCallbacksCase_", "bitField0_", "openMessage_", IosCallbacks.class, AndroidCallbacks.class, "legacyEventsChannelInfo_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<OopwvOpen> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (OopwvOpen.class) {
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

        public AndroidCallbacks getAndroidCallbacks() {
            return this.submitCallbacksCase_ == 6 ? (AndroidCallbacks) this.submitCallbacks_ : AndroidCallbacks.getDefaultInstance();
        }

        public IosCallbacks getIosCallbacks() {
            return this.submitCallbacksCase_ == 5 ? (IosCallbacks) this.submitCallbacks_ : IosCallbacks.getDefaultInstance();
        }

        public LegacyEventsChannelInfo getLegacyEventsChannelInfo() {
            LegacyEventsChannelInfo legacyEventsChannelInfo = this.legacyEventsChannelInfo_;
            return legacyEventsChannelInfo == null ? LegacyEventsChannelInfo.getDefaultInstance() : legacyEventsChannelInfo;
        }

        public OauthInitializationOptions$MobileSdkUrlOpenMessage getOpenMessage() {
            OauthInitializationOptions$MobileSdkUrlOpenMessage oauthInitializationOptions$MobileSdkUrlOpenMessage = this.openMessage_;
            return oauthInitializationOptions$MobileSdkUrlOpenMessage == null ? OauthInitializationOptions$MobileSdkUrlOpenMessage.getDefaultInstance() : oauthInitializationOptions$MobileSdkUrlOpenMessage;
        }

        public EnumC6437b getOpenToCase() {
            return EnumC6437b.forNumber(this.openToCase_);
        }

        public EnumC6438c getSubmitCallbacksCase() {
            return EnumC6438c.forNumber(this.submitCallbacksCase_);
        }

        public boolean hasAndroidCallbacks() {
            return this.submitCallbacksCase_ == 6;
        }

        public boolean hasIosCallbacks() {
            return this.submitCallbacksCase_ == 5;
        }

        public boolean hasLegacyEventsChannelInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasOpenMessage() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOpenUrl() {
            return this.openToCase_ == 3;
        }

        public static C6436a newBuilder(OopwvOpen oopwvOpen) {
            return DEFAULT_INSTANCE.createBuilder(oopwvOpen);
        }

        public static OopwvOpen parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OopwvOpen) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OopwvOpen parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (OopwvOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public String getOpenUrl() {
            return this.openToCase_ == 3 ? (String) this.openTo_ : "";
        }

        public ByteString getOpenUrlBytes() {
            return ByteString.copyFromUtf8(this.openToCase_ == 3 ? (String) this.openTo_ : "");
        }

        public static OopwvOpen parseFrom(ByteString byteString) {
            return (OopwvOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OopwvOpen parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (OopwvOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OopwvOpen parseFrom(byte[] bArr) {
            return (OopwvOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OopwvOpen parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (OopwvOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OopwvOpen parseFrom(InputStream inputStream) {
            return (OopwvOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OopwvOpen parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OopwvOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OopwvOpen parseFrom(CodedInputStream codedInputStream) {
            return (OopwvOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OopwvOpen parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OopwvOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SfpcRequest extends GeneratedMessageLite<SfpcRequest, C6439a> implements MessageLiteOrBuilder {
        public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 1;
        private static final SfpcRequest DEFAULT_INSTANCE;
        private static volatile Parser<SfpcRequest> PARSER;
        private String continuationToken_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction$SfpcRequest$a */
        public static final class C6439a extends GeneratedMessageLite.Builder<SfpcRequest, C6439a> implements MessageLiteOrBuilder {
            public C6439a() {
                super(SfpcRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            SfpcRequest sfpcRequest = new SfpcRequest();
            DEFAULT_INSTANCE = sfpcRequest;
            GeneratedMessageLite.registerDefaultInstance(SfpcRequest.class, sfpcRequest);
        }

        private SfpcRequest() {
        }

        private void clearContinuationToken() {
            this.continuationToken_ = getDefaultInstance().getContinuationToken();
        }

        public static SfpcRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6439a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SfpcRequest parseDelimitedFrom(InputStream inputStream) {
            return (SfpcRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SfpcRequest parseFrom(ByteBuffer byteBuffer) {
            return (SfpcRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SfpcRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setContinuationToken(String str) {
            str.getClass();
            this.continuationToken_ = str;
        }

        private void setContinuationTokenBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.continuationToken_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                case 1:
                    return new SfpcRequest();
                case 2:
                    return new C6439a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"continuationToken_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SfpcRequest> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SfpcRequest.class) {
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

        public String getContinuationToken() {
            return this.continuationToken_;
        }

        public ByteString getContinuationTokenBytes() {
            return ByteString.copyFromUtf8(this.continuationToken_);
        }

        public static C6439a newBuilder(SfpcRequest sfpcRequest) {
            return DEFAULT_INSTANCE.createBuilder(sfpcRequest);
        }

        public static SfpcRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SfpcRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SfpcRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SfpcRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SfpcRequest parseFrom(ByteString byteString) {
            return (SfpcRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SfpcRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SfpcRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SfpcRequest parseFrom(byte[] bArr) {
            return (SfpcRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SfpcRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SfpcRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SfpcRequest parseFrom(InputStream inputStream) {
            return (SfpcRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SfpcRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SfpcRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SfpcRequest parseFrom(CodedInputStream codedInputStream) {
            return (SfpcRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SfpcRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SfpcRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction$a */
    public enum EnumC6440a {
        NAVIGATE_TO_URL(2),
        CALL_PHONE_NUMBER(3),
        SHOW_MODAL(4),
        HIDE_MODAL(6),
        GO_BACK(7),
        FOCUS_INPUT(8),
        EXECUTE_RECAPTCHA_ENTERPRISE(9),
        EMIT_SDK_INTERNAL_EVENT(11),
        HANDOFF_UNSUPPORTED_INSTITUTION(12),
        AUTOMATIC_HANDOFF_UNSUPPORTED_INSTITUTION(14),
        AUTHORIZE_FINANCEKIT(15),
        OOPWV_OPEN(16),
        OOPWV_CLOSE(17),
        SFPC_REQUEST(18),
        CLOSE_LINK_FROM_HOSTED_LINK_SECURITY_MODAL(19),
        TRIGGER_ACTION(21),
        TRIGGER_HAPTIC(20),
        EMBEDDED_SESSION_HANDOFF(22),
        ACTION_NOT_SET(0);


        /* renamed from: a */
        public final int f2241a;

        EnumC6440a(int i) {
            this.f2241a = i;
        }

        public static EnumC6440a forNumber(int i) {
            switch (i) {
                case 0:
                    return ACTION_NOT_SET;
                case 1:
                case 5:
                case 10:
                case 13:
                default:
                    return null;
                case 2:
                    return NAVIGATE_TO_URL;
                case 3:
                    return CALL_PHONE_NUMBER;
                case 4:
                    return SHOW_MODAL;
                case 6:
                    return HIDE_MODAL;
                case 7:
                    return GO_BACK;
                case 8:
                    return FOCUS_INPUT;
                case 9:
                    return EXECUTE_RECAPTCHA_ENTERPRISE;
                case 11:
                    return EMIT_SDK_INTERNAL_EVENT;
                case 12:
                    return HANDOFF_UNSUPPORTED_INSTITUTION;
                case 14:
                    return AUTOMATIC_HANDOFF_UNSUPPORTED_INSTITUTION;
                case 15:
                    return AUTHORIZE_FINANCEKIT;
                case 16:
                    return OOPWV_OPEN;
                case 17:
                    return OOPWV_CLOSE;
                case 18:
                    return SFPC_REQUEST;
                case 19:
                    return CLOSE_LINK_FROM_HOSTED_LINK_SECURITY_MODAL;
                case 20:
                    return TRIGGER_HAPTIC;
                case 21:
                    return TRIGGER_ACTION;
                case 22:
                    return EMBEDDED_SESSION_HANDOFF;
            }
        }

        public int getNumber() {
            return this.f2241a;
        }

        @Deprecated
        public static EnumC6440a valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction$b */
    public static final class C6441b extends GeneratedMessageLite.Builder<Common$LocalAction, C6441b> implements InterfaceC6297B {
        public C6441b() {
            super(Common$LocalAction.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$LocalAction common$LocalAction = new Common$LocalAction();
        DEFAULT_INSTANCE = common$LocalAction;
        GeneratedMessageLite.registerDefaultInstance(Common$LocalAction.class, common$LocalAction);
    }

    private Common$LocalAction() {
    }

    private void clearAction() {
        this.actionCase_ = 0;
        this.action_ = null;
    }

    private void clearAlsoSubmitAction() {
        this.alsoSubmitAction_ = false;
    }

    private void clearAuthorizeFinancekit() {
        if (this.actionCase_ == 15) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearAutomaticHandoffUnsupportedInstitution() {
        if (this.actionCase_ == 14) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearCallPhoneNumber() {
        if (this.actionCase_ == 3) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearCloseLinkFromHostedLinkSecurityModal() {
        if (this.actionCase_ == 19) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearEmbeddedSessionHandoff() {
        if (this.actionCase_ == 22) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearEmitSdkInternalEvent() {
        if (this.actionCase_ == 11) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearEventMetadata() {
        this.eventMetadata_ = null;
        this.bitField0_ &= -2;
    }

    private void clearExecuteRecaptchaEnterprise() {
        if (this.actionCase_ == 9) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearFocusInput() {
        if (this.actionCase_ == 8) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearGoBack() {
        if (this.actionCase_ == 7) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearHandoffUnsupportedInstitution() {
        if (this.actionCase_ == 12) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearHideModal() {
        if (this.actionCase_ == 6) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearNavigateToUrl() {
        if (this.actionCase_ == 2) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearOopwvClose() {
        if (this.actionCase_ == 17) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearOopwvOpen() {
        if (this.actionCase_ == 16) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearSdkEvent() {
        this.sdkEvent_ = null;
        this.bitField0_ &= -3;
    }

    private void clearSfpcRequest() {
        if (this.actionCase_ == 18) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearShowModal() {
        if (this.actionCase_ == 4) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearTriggerAction() {
        if (this.actionCase_ == 21) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearTriggerHaptic() {
        if (this.actionCase_ == 20) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    public static Common$LocalAction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeEmbeddedSessionHandoff(EmbeddedSessionHandoff embeddedSessionHandoff) {
        embeddedSessionHandoff.getClass();
        if (this.actionCase_ != 22 || this.action_ == EmbeddedSessionHandoff.getDefaultInstance()) {
            this.action_ = embeddedSessionHandoff;
        } else {
            this.action_ = EmbeddedSessionHandoff.newBuilder((EmbeddedSessionHandoff) this.action_).mergeFrom((EmbeddedSessionHandoff.C6430a) embeddedSessionHandoff).buildPartial();
        }
        this.actionCase_ = 22;
    }

    private void mergeEmitSdkInternalEvent(Common$SDKInternalEvent common$SDKInternalEvent) {
        common$SDKInternalEvent.getClass();
        if (this.actionCase_ != 11 || this.action_ == Common$SDKInternalEvent.getDefaultInstance()) {
            this.action_ = common$SDKInternalEvent;
        } else {
            this.action_ = Common$SDKInternalEvent.newBuilder((Common$SDKInternalEvent) this.action_).mergeFrom((Common$SDKInternalEvent.C6490a) common$SDKInternalEvent).buildPartial();
        }
        this.actionCase_ = 11;
    }

    private void mergeEventMetadata(EventMetadata eventMetadata) {
        eventMetadata.getClass();
        EventMetadata eventMetadata2 = this.eventMetadata_;
        if (eventMetadata2 == null || eventMetadata2 == EventMetadata.getDefaultInstance()) {
            this.eventMetadata_ = eventMetadata;
        } else {
            this.eventMetadata_ = EventMetadata.newBuilder(this.eventMetadata_).mergeFrom((EventMetadata.C6431a) eventMetadata).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeOopwvClose(OopwvClose oopwvClose) {
        oopwvClose.getClass();
        if (this.actionCase_ != 17 || this.action_ == OopwvClose.getDefaultInstance()) {
            this.action_ = oopwvClose;
        } else {
            this.action_ = OopwvClose.newBuilder((OopwvClose) this.action_).mergeFrom((OopwvClose.C6432a) oopwvClose).buildPartial();
        }
        this.actionCase_ = 17;
    }

    private void mergeOopwvOpen(OopwvOpen oopwvOpen) {
        oopwvOpen.getClass();
        if (this.actionCase_ != 16 || this.action_ == OopwvOpen.getDefaultInstance()) {
            this.action_ = oopwvOpen;
        } else {
            this.action_ = OopwvOpen.newBuilder((OopwvOpen) this.action_).mergeFrom((OopwvOpen.C6436a) oopwvOpen).buildPartial();
        }
        this.actionCase_ = 16;
    }

    private void mergeSdkEvent(Common$SDKEvent common$SDKEvent) {
        common$SDKEvent.getClass();
        Common$SDKEvent common$SDKEvent2 = this.sdkEvent_;
        if (common$SDKEvent2 == null || common$SDKEvent2 == Common$SDKEvent.getDefaultInstance()) {
            this.sdkEvent_ = common$SDKEvent;
        } else {
            this.sdkEvent_ = Common$SDKEvent.newBuilder(this.sdkEvent_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeSfpcRequest(SfpcRequest sfpcRequest) {
        sfpcRequest.getClass();
        if (this.actionCase_ != 18 || this.action_ == SfpcRequest.getDefaultInstance()) {
            this.action_ = sfpcRequest;
        } else {
            this.action_ = SfpcRequest.newBuilder((SfpcRequest) this.action_).mergeFrom((SfpcRequest.C6439a) sfpcRequest).buildPartial();
        }
        this.actionCase_ = 18;
    }

    private void mergeShowModal(Common$Modal common$Modal) {
        common$Modal.getClass();
        if (this.actionCase_ != 4 || this.action_ == Common$Modal.getDefaultInstance()) {
            this.action_ = common$Modal;
        } else {
            this.action_ = Common$Modal.newBuilder((Common$Modal) this.action_).mergeFrom((Common$Modal.C6446a) common$Modal).buildPartial();
        }
        this.actionCase_ = 4;
    }

    private void mergeTriggerAction(Any any) {
        any.getClass();
        if (this.actionCase_ != 21 || this.action_ == Any.getDefaultInstance()) {
            this.action_ = any;
        } else {
            this.action_ = Any.newBuilder((Any) this.action_).mergeFrom((Any.Builder) any).buildPartial();
        }
        this.actionCase_ = 21;
    }

    public static C6441b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$LocalAction parseDelimitedFrom(InputStream inputStream) {
        return (Common$LocalAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$LocalAction parseFrom(ByteBuffer byteBuffer) {
        return (Common$LocalAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$LocalAction> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAlsoSubmitAction(boolean z) {
        this.alsoSubmitAction_ = z;
    }

    private void setAuthorizeFinancekit(boolean z) {
        this.actionCase_ = 15;
        this.action_ = Boolean.valueOf(z);
    }

    private void setAutomaticHandoffUnsupportedInstitution(String str) {
        str.getClass();
        this.actionCase_ = 14;
        this.action_ = str;
    }

    private void setAutomaticHandoffUnsupportedInstitutionBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.action_ = byteString.toStringUtf8();
        this.actionCase_ = 14;
    }

    private void setCallPhoneNumber(String str) {
        str.getClass();
        this.actionCase_ = 3;
        this.action_ = str;
    }

    private void setCallPhoneNumberBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.action_ = byteString.toStringUtf8();
        this.actionCase_ = 3;
    }

    private void setCloseLinkFromHostedLinkSecurityModal(boolean z) {
        this.actionCase_ = 19;
        this.action_ = Boolean.valueOf(z);
    }

    private void setEmbeddedSessionHandoff(EmbeddedSessionHandoff embeddedSessionHandoff) {
        embeddedSessionHandoff.getClass();
        this.action_ = embeddedSessionHandoff;
        this.actionCase_ = 22;
    }

    private void setEmitSdkInternalEvent(Common$SDKInternalEvent common$SDKInternalEvent) {
        common$SDKInternalEvent.getClass();
        this.action_ = common$SDKInternalEvent;
        this.actionCase_ = 11;
    }

    private void setEventMetadata(EventMetadata eventMetadata) {
        eventMetadata.getClass();
        this.eventMetadata_ = eventMetadata;
        this.bitField0_ |= 1;
    }

    private void setExecuteRecaptchaEnterprise(boolean z) {
        this.actionCase_ = 9;
        this.action_ = Boolean.valueOf(z);
    }

    private void setFocusInput(String str) {
        str.getClass();
        this.actionCase_ = 8;
        this.action_ = str;
    }

    private void setFocusInputBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.action_ = byteString.toStringUtf8();
        this.actionCase_ = 8;
    }

    private void setGoBack(boolean z) {
        this.actionCase_ = 7;
        this.action_ = Boolean.valueOf(z);
    }

    private void setHandoffUnsupportedInstitution(String str) {
        str.getClass();
        this.actionCase_ = 12;
        this.action_ = str;
    }

    private void setHandoffUnsupportedInstitutionBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.action_ = byteString.toStringUtf8();
        this.actionCase_ = 12;
    }

    private void setHideModal(boolean z) {
        this.actionCase_ = 6;
        this.action_ = Boolean.valueOf(z);
    }

    private void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    private void setIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setNavigateToUrl(String str) {
        str.getClass();
        this.actionCase_ = 2;
        this.action_ = str;
    }

    private void setNavigateToUrlBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.action_ = byteString.toStringUtf8();
        this.actionCase_ = 2;
    }

    private void setOopwvClose(OopwvClose oopwvClose) {
        oopwvClose.getClass();
        this.action_ = oopwvClose;
        this.actionCase_ = 17;
    }

    private void setOopwvOpen(OopwvOpen oopwvOpen) {
        oopwvOpen.getClass();
        this.action_ = oopwvOpen;
        this.actionCase_ = 16;
    }

    private void setSdkEvent(Common$SDKEvent common$SDKEvent) {
        common$SDKEvent.getClass();
        this.sdkEvent_ = common$SDKEvent;
        this.bitField0_ |= 2;
    }

    private void setSfpcRequest(SfpcRequest sfpcRequest) {
        sfpcRequest.getClass();
        this.action_ = sfpcRequest;
        this.actionCase_ = 18;
    }

    private void setShowModal(Common$Modal common$Modal) {
        common$Modal.getClass();
        this.action_ = common$Modal;
        this.actionCase_ = 4;
    }

    private void setTriggerAction(Any any) {
        any.getClass();
        this.action_ = any;
        this.actionCase_ = 21;
    }

    private void setTriggerHaptic(EnumC6949z enumC6949z) {
        this.action_ = Integer.valueOf(enumC6949z.getNumber());
        this.actionCase_ = 20;
    }

    private void setTriggerHapticValue(int i) {
        this.actionCase_ = 20;
        this.action_ = Integer.valueOf(i);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$LocalAction();
            case 2:
                return new C6441b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0016\u0001\u0001\u0001\u0016\u0016\u0000\u0000\u0000\u0001Ȉ\u0002Ȼ\u0000\u0003Ȼ\u0000\u0004<\u0000\u0005\u0007\u0006:\u0000\u0007:\u0000\bȻ\u0000\t:\u0000\nဉ\u0001\u000b<\u0000\fȻ\u0000\rဉ\u0000\u000eȻ\u0000\u000f:\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013:\u0000\u0014?\u0000\u0015<\u0000\u0016<\u0000", new Object[]{"action_", "actionCase_", "bitField0_", "id_", Common$Modal.class, "alsoSubmitAction_", "sdkEvent_", Common$SDKInternalEvent.class, "eventMetadata_", OopwvOpen.class, OopwvClose.class, SfpcRequest.class, Any.class, EmbeddedSessionHandoff.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$LocalAction> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$LocalAction.class) {
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

    public EnumC6440a getActionCase() {
        return EnumC6440a.forNumber(this.actionCase_);
    }

    public boolean getAlsoSubmitAction() {
        return this.alsoSubmitAction_;
    }

    public boolean getAuthorizeFinancekit() {
        if (this.actionCase_ == 15) {
            return ((Boolean) this.action_).booleanValue();
        }
        return false;
    }

    public boolean getCloseLinkFromHostedLinkSecurityModal() {
        if (this.actionCase_ == 19) {
            return ((Boolean) this.action_).booleanValue();
        }
        return false;
    }

    public EmbeddedSessionHandoff getEmbeddedSessionHandoff() {
        return this.actionCase_ == 22 ? (EmbeddedSessionHandoff) this.action_ : EmbeddedSessionHandoff.getDefaultInstance();
    }

    public Common$SDKInternalEvent getEmitSdkInternalEvent() {
        return this.actionCase_ == 11 ? (Common$SDKInternalEvent) this.action_ : Common$SDKInternalEvent.getDefaultInstance();
    }

    public EventMetadata getEventMetadata() {
        EventMetadata eventMetadata = this.eventMetadata_;
        return eventMetadata == null ? EventMetadata.getDefaultInstance() : eventMetadata;
    }

    public boolean getExecuteRecaptchaEnterprise() {
        if (this.actionCase_ == 9) {
            return ((Boolean) this.action_).booleanValue();
        }
        return false;
    }

    public boolean getGoBack() {
        if (this.actionCase_ == 7) {
            return ((Boolean) this.action_).booleanValue();
        }
        return false;
    }

    public boolean getHideModal() {
        if (this.actionCase_ == 6) {
            return ((Boolean) this.action_).booleanValue();
        }
        return false;
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public OopwvClose getOopwvClose() {
        return this.actionCase_ == 17 ? (OopwvClose) this.action_ : OopwvClose.getDefaultInstance();
    }

    public OopwvOpen getOopwvOpen() {
        return this.actionCase_ == 16 ? (OopwvOpen) this.action_ : OopwvOpen.getDefaultInstance();
    }

    public Common$SDKEvent getSdkEvent() {
        Common$SDKEvent common$SDKEvent = this.sdkEvent_;
        return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
    }

    public SfpcRequest getSfpcRequest() {
        return this.actionCase_ == 18 ? (SfpcRequest) this.action_ : SfpcRequest.getDefaultInstance();
    }

    public Common$Modal getShowModal() {
        return this.actionCase_ == 4 ? (Common$Modal) this.action_ : Common$Modal.getDefaultInstance();
    }

    public Any getTriggerAction() {
        return this.actionCase_ == 21 ? (Any) this.action_ : Any.getDefaultInstance();
    }

    public EnumC6949z getTriggerHaptic() {
        if (this.actionCase_ != 20) {
            return EnumC6949z.HAPTIC_TYPE_UNKNOWN;
        }
        EnumC6949z enumC6949zForNumber = EnumC6949z.forNumber(((Integer) this.action_).intValue());
        return enumC6949zForNumber == null ? EnumC6949z.UNRECOGNIZED : enumC6949zForNumber;
    }

    public int getTriggerHapticValue() {
        if (this.actionCase_ == 20) {
            return ((Integer) this.action_).intValue();
        }
        return 0;
    }

    public boolean hasAuthorizeFinancekit() {
        return this.actionCase_ == 15;
    }

    public boolean hasAutomaticHandoffUnsupportedInstitution() {
        return this.actionCase_ == 14;
    }

    public boolean hasCallPhoneNumber() {
        return this.actionCase_ == 3;
    }

    public boolean hasCloseLinkFromHostedLinkSecurityModal() {
        return this.actionCase_ == 19;
    }

    public boolean hasEmbeddedSessionHandoff() {
        return this.actionCase_ == 22;
    }

    public boolean hasEmitSdkInternalEvent() {
        return this.actionCase_ == 11;
    }

    public boolean hasEventMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasExecuteRecaptchaEnterprise() {
        return this.actionCase_ == 9;
    }

    public boolean hasFocusInput() {
        return this.actionCase_ == 8;
    }

    public boolean hasGoBack() {
        return this.actionCase_ == 7;
    }

    public boolean hasHandoffUnsupportedInstitution() {
        return this.actionCase_ == 12;
    }

    public boolean hasHideModal() {
        return this.actionCase_ == 6;
    }

    public boolean hasNavigateToUrl() {
        return this.actionCase_ == 2;
    }

    public boolean hasOopwvClose() {
        return this.actionCase_ == 17;
    }

    public boolean hasOopwvOpen() {
        return this.actionCase_ == 16;
    }

    public boolean hasSdkEvent() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSfpcRequest() {
        return this.actionCase_ == 18;
    }

    public boolean hasShowModal() {
        return this.actionCase_ == 4;
    }

    public boolean hasTriggerAction() {
        return this.actionCase_ == 21;
    }

    public boolean hasTriggerHaptic() {
        return this.actionCase_ == 20;
    }

    public static C6441b newBuilder(Common$LocalAction common$LocalAction) {
        return DEFAULT_INSTANCE.createBuilder(common$LocalAction);
    }

    public static Common$LocalAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$LocalAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$LocalAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$LocalAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public String getAutomaticHandoffUnsupportedInstitution() {
        return this.actionCase_ == 14 ? (String) this.action_ : "";
    }

    public ByteString getAutomaticHandoffUnsupportedInstitutionBytes() {
        return ByteString.copyFromUtf8(this.actionCase_ == 14 ? (String) this.action_ : "");
    }

    public String getCallPhoneNumber() {
        return this.actionCase_ == 3 ? (String) this.action_ : "";
    }

    public ByteString getCallPhoneNumberBytes() {
        return ByteString.copyFromUtf8(this.actionCase_ == 3 ? (String) this.action_ : "");
    }

    public String getFocusInput() {
        return this.actionCase_ == 8 ? (String) this.action_ : "";
    }

    public ByteString getFocusInputBytes() {
        return ByteString.copyFromUtf8(this.actionCase_ == 8 ? (String) this.action_ : "");
    }

    public String getHandoffUnsupportedInstitution() {
        return this.actionCase_ == 12 ? (String) this.action_ : "";
    }

    public ByteString getHandoffUnsupportedInstitutionBytes() {
        return ByteString.copyFromUtf8(this.actionCase_ == 12 ? (String) this.action_ : "");
    }

    public String getNavigateToUrl() {
        return this.actionCase_ == 2 ? (String) this.action_ : "";
    }

    public ByteString getNavigateToUrlBytes() {
        return ByteString.copyFromUtf8(this.actionCase_ == 2 ? (String) this.action_ : "");
    }

    public static Common$LocalAction parseFrom(ByteString byteString) {
        return (Common$LocalAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$LocalAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$LocalAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$LocalAction parseFrom(byte[] bArr) {
        return (Common$LocalAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$LocalAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$LocalAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$LocalAction parseFrom(InputStream inputStream) {
        return (Common$LocalAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$LocalAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$LocalAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$LocalAction parseFrom(CodedInputStream codedInputStream) {
        return (Common$LocalAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$LocalAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$LocalAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
