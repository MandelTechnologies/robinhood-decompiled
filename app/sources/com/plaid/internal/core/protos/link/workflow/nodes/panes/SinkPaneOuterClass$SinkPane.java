package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.StringValue;
import com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class SinkPaneOuterClass$SinkPane extends GeneratedMessageLite<SinkPaneOuterClass$SinkPane, C6824a> implements MessageLiteOrBuilder {
    private static final SinkPaneOuterClass$SinkPane DEFAULT_INSTANCE;
    private static volatile Parser<SinkPaneOuterClass$SinkPane> PARSER;

    public static final class Actions extends GeneratedMessageLite<Actions, C6821a> implements MessageLiteOrBuilder {
        private static final Actions DEFAULT_INSTANCE;
        private static volatile Parser<Actions> PARSER;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane$Actions$a */
        public static final class C6821a extends GeneratedMessageLite.Builder<Actions, C6821a> implements MessageLiteOrBuilder {
            public C6821a() {
                super(Actions.DEFAULT_INSTANCE);
            }
        }

        static {
            Actions actions = new Actions();
            DEFAULT_INSTANCE = actions;
            GeneratedMessageLite.registerDefaultInstance(Actions.class, actions);
        }

        private Actions() {
        }

        public static Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6821a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Actions parseDelimitedFrom(InputStream inputStream) {
            return (Actions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Actions parseFrom(ByteBuffer byteBuffer) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Actions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6940u0.f2607a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Actions();
                case 2:
                    return new C6821a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Actions> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Actions.class) {
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

        public static C6821a newBuilder(Actions actions) {
            return DEFAULT_INSTANCE.createBuilder(actions);
        }

        public static Actions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Actions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Actions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Actions parseFrom(ByteString byteString) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Actions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Actions parseFrom(byte[] bArr) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Actions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Actions parseFrom(InputStream inputStream) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Actions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Actions parseFrom(CodedInputStream codedInputStream) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Actions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Rendering extends GeneratedMessageLite<Rendering, C6823a> implements MessageLiteOrBuilder {
        private static final Rendering DEFAULT_INSTANCE;
        public static final int ERROR_JSON_FIELD_NUMBER = 3;
        public static final int EVENTS_FIELD_NUMBER = 5;
        public static final int HOSTED_LINK_COMPLETION_REDIRECT_URI_FIELD_NUMBER = 14;
        public static final int METADATA_JSON_FIELD_NUMBER = 4;
        public static final int OMIT_KNOWN_NULL_FIELDS_FIELD_NUMBER = 8;
        private static volatile Parser<Rendering> PARSER = null;
        public static final int PUBLIC_TOKEN_FIELD_NUMBER = 2;
        public static final int REDIRECT_URI_FIELD_NUMBER = 13;
        public static final int RESULT_FIELD_NUMBER = 1;
        public static final int WEBVIEW_REDIRECT_URI_FIELD_NUMBER = 6;
        private int bitField0_;
        private Events events_;
        private StringValue hostedLinkCompletionRedirectUri_;
        private boolean omitKnownNullFields_;
        private StringValue redirectUri_;
        private SdkResult$SDKResult result_;
        private String publicToken_ = "";
        private String errorJson_ = "";
        private String metadataJson_ = "";
        private String webviewRedirectUri_ = "";

        public static final class Events extends GeneratedMessageLite<Events, C6822a> implements MessageLiteOrBuilder {
            private static final Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            private static volatile Parser<Events> PARSER;
            private Internal.ProtobufList<Common$SDKEvent> onAppear_ = GeneratedMessageLite.emptyProtobufList();

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane$Rendering$Events$a */
            public static final class C6822a extends GeneratedMessageLite.Builder<Events, C6822a> implements MessageLiteOrBuilder {
                public C6822a() {
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

            public static C6822a newBuilder() {
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
                switch (C6940u0.f2607a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Events();
                    case 2:
                        return new C6822a();
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

            public static C6822a newBuilder(Events events) {
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

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane$Rendering$a */
        public static final class C6823a extends GeneratedMessageLite.Builder<Rendering, C6823a> implements MessageLiteOrBuilder {
            public C6823a() {
                super(Rendering.DEFAULT_INSTANCE);
            }
        }

        static {
            Rendering rendering = new Rendering();
            DEFAULT_INSTANCE = rendering;
            GeneratedMessageLite.registerDefaultInstance(Rendering.class, rendering);
        }

        private Rendering() {
        }

        private void clearErrorJson() {
            this.errorJson_ = getDefaultInstance().getErrorJson();
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -3;
        }

        private void clearHostedLinkCompletionRedirectUri() {
            this.hostedLinkCompletionRedirectUri_ = null;
            this.bitField0_ &= -9;
        }

        private void clearMetadataJson() {
            this.metadataJson_ = getDefaultInstance().getMetadataJson();
        }

        private void clearOmitKnownNullFields() {
            this.omitKnownNullFields_ = false;
        }

        private void clearPublicToken() {
            this.publicToken_ = getDefaultInstance().getPublicToken();
        }

        private void clearRedirectUri() {
            this.redirectUri_ = null;
            this.bitField0_ &= -5;
        }

        private void clearResult() {
            this.result_ = null;
            this.bitField0_ &= -2;
        }

        private void clearWebviewRedirectUri() {
            this.webviewRedirectUri_ = getDefaultInstance().getWebviewRedirectUri();
        }

        public static Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeEvents(Events events) {
            events.getClass();
            Events events2 = this.events_;
            if (events2 == null || events2 == Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = Events.newBuilder(this.events_).mergeFrom((Events.C6822a) events).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeHostedLinkCompletionRedirectUri(StringValue stringValue) {
            stringValue.getClass();
            StringValue stringValue2 = this.hostedLinkCompletionRedirectUri_;
            if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                this.hostedLinkCompletionRedirectUri_ = stringValue;
            } else {
                this.hostedLinkCompletionRedirectUri_ = StringValue.newBuilder(this.hostedLinkCompletionRedirectUri_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        private void mergeRedirectUri(StringValue stringValue) {
            stringValue.getClass();
            StringValue stringValue2 = this.redirectUri_;
            if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                this.redirectUri_ = stringValue;
            } else {
                this.redirectUri_ = StringValue.newBuilder(this.redirectUri_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        private void mergeResult(SdkResult$SDKResult sdkResult$SDKResult) {
            sdkResult$SDKResult.getClass();
            SdkResult$SDKResult sdkResult$SDKResult2 = this.result_;
            if (sdkResult$SDKResult2 == null || sdkResult$SDKResult2 == SdkResult$SDKResult.getDefaultInstance()) {
                this.result_ = sdkResult$SDKResult;
            } else {
                this.result_ = SdkResult$SDKResult.newBuilder(this.result_).mergeFrom((SdkResult$SDKResult.C7016a) sdkResult$SDKResult).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static C6823a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Rendering parseDelimitedFrom(InputStream inputStream) {
            return (Rendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Rendering parseFrom(ByteBuffer byteBuffer) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Rendering> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setErrorJson(String str) {
            str.getClass();
            this.errorJson_ = str;
        }

        private void setErrorJsonBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.errorJson_ = byteString.toStringUtf8();
        }

        private void setEvents(Events events) {
            events.getClass();
            this.events_ = events;
            this.bitField0_ |= 2;
        }

        private void setHostedLinkCompletionRedirectUri(StringValue stringValue) {
            stringValue.getClass();
            this.hostedLinkCompletionRedirectUri_ = stringValue;
            this.bitField0_ |= 8;
        }

        private void setMetadataJson(String str) {
            str.getClass();
            this.metadataJson_ = str;
        }

        private void setMetadataJsonBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.metadataJson_ = byteString.toStringUtf8();
        }

        private void setOmitKnownNullFields(boolean z) {
            this.omitKnownNullFields_ = z;
        }

        private void setPublicToken(String str) {
            str.getClass();
            this.publicToken_ = str;
        }

        private void setPublicTokenBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.publicToken_ = byteString.toStringUtf8();
        }

        private void setRedirectUri(StringValue stringValue) {
            stringValue.getClass();
            this.redirectUri_ = stringValue;
            this.bitField0_ |= 4;
        }

        private void setResult(SdkResult$SDKResult sdkResult$SDKResult) {
            sdkResult$SDKResult.getClass();
            this.result_ = sdkResult$SDKResult;
            this.bitField0_ |= 1;
        }

        private void setWebviewRedirectUri(String str) {
            str.getClass();
            this.webviewRedirectUri_ = str;
        }

        private void setWebviewRedirectUriBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.webviewRedirectUri_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6940u0.f2607a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new C6823a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\u000e\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005ဉ\u0001\u0006Ȉ\b\u0007\rဉ\u0002\u000eဉ\u0003", new Object[]{"bitField0_", "result_", "publicToken_", "errorJson_", "metadataJson_", "events_", "webviewRedirectUri_", "omitKnownNullFields_", "redirectUri_", "hostedLinkCompletionRedirectUri_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Rendering> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Rendering.class) {
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

        public String getErrorJson() {
            return this.errorJson_;
        }

        public ByteString getErrorJsonBytes() {
            return ByteString.copyFromUtf8(this.errorJson_);
        }

        public Events getEvents() {
            Events events = this.events_;
            return events == null ? Events.getDefaultInstance() : events;
        }

        public StringValue getHostedLinkCompletionRedirectUri() {
            StringValue stringValue = this.hostedLinkCompletionRedirectUri_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        public String getMetadataJson() {
            return this.metadataJson_;
        }

        public ByteString getMetadataJsonBytes() {
            return ByteString.copyFromUtf8(this.metadataJson_);
        }

        public boolean getOmitKnownNullFields() {
            return this.omitKnownNullFields_;
        }

        public String getPublicToken() {
            return this.publicToken_;
        }

        public ByteString getPublicTokenBytes() {
            return ByteString.copyFromUtf8(this.publicToken_);
        }

        public StringValue getRedirectUri() {
            StringValue stringValue = this.redirectUri_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        public SdkResult$SDKResult getResult() {
            SdkResult$SDKResult sdkResult$SDKResult = this.result_;
            return sdkResult$SDKResult == null ? SdkResult$SDKResult.getDefaultInstance() : sdkResult$SDKResult;
        }

        public String getWebviewRedirectUri() {
            return this.webviewRedirectUri_;
        }

        public ByteString getWebviewRedirectUriBytes() {
            return ByteString.copyFromUtf8(this.webviewRedirectUri_);
        }

        public boolean hasEvents() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasHostedLinkCompletionRedirectUri() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasRedirectUri() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasResult() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C6823a newBuilder(Rendering rendering) {
            return DEFAULT_INSTANCE.createBuilder(rendering);
        }

        public static Rendering parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Rendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Rendering parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Rendering parseFrom(ByteString byteString) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Rendering parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Rendering parseFrom(byte[] bArr) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Rendering parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Rendering parseFrom(InputStream inputStream) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Rendering parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Rendering parseFrom(CodedInputStream codedInputStream) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Rendering parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane$a */
    public static final class C6824a extends GeneratedMessageLite.Builder<SinkPaneOuterClass$SinkPane, C6824a> implements MessageLiteOrBuilder {
        public C6824a() {
            super(SinkPaneOuterClass$SinkPane.DEFAULT_INSTANCE);
        }
    }

    static {
        SinkPaneOuterClass$SinkPane sinkPaneOuterClass$SinkPane = new SinkPaneOuterClass$SinkPane();
        DEFAULT_INSTANCE = sinkPaneOuterClass$SinkPane;
        GeneratedMessageLite.registerDefaultInstance(SinkPaneOuterClass$SinkPane.class, sinkPaneOuterClass$SinkPane);
    }

    private SinkPaneOuterClass$SinkPane() {
    }

    public static SinkPaneOuterClass$SinkPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6824a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SinkPaneOuterClass$SinkPane parseDelimitedFrom(InputStream inputStream) {
        return (SinkPaneOuterClass$SinkPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SinkPaneOuterClass$SinkPane parseFrom(ByteBuffer byteBuffer) {
        return (SinkPaneOuterClass$SinkPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SinkPaneOuterClass$SinkPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6940u0.f2607a[methodToInvoke.ordinal()]) {
            case 1:
                return new SinkPaneOuterClass$SinkPane();
            case 2:
                return new C6824a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SinkPaneOuterClass$SinkPane> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (SinkPaneOuterClass$SinkPane.class) {
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

    public static C6824a newBuilder(SinkPaneOuterClass$SinkPane sinkPaneOuterClass$SinkPane) {
        return DEFAULT_INSTANCE.createBuilder(sinkPaneOuterClass$SinkPane);
    }

    public static SinkPaneOuterClass$SinkPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SinkPaneOuterClass$SinkPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SinkPaneOuterClass$SinkPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SinkPaneOuterClass$SinkPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SinkPaneOuterClass$SinkPane parseFrom(ByteString byteString) {
        return (SinkPaneOuterClass$SinkPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SinkPaneOuterClass$SinkPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (SinkPaneOuterClass$SinkPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SinkPaneOuterClass$SinkPane parseFrom(byte[] bArr) {
        return (SinkPaneOuterClass$SinkPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SinkPaneOuterClass$SinkPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (SinkPaneOuterClass$SinkPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SinkPaneOuterClass$SinkPane parseFrom(InputStream inputStream) {
        return (SinkPaneOuterClass$SinkPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SinkPaneOuterClass$SinkPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SinkPaneOuterClass$SinkPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SinkPaneOuterClass$SinkPane parseFrom(CodedInputStream codedInputStream) {
        return (SinkPaneOuterClass$SinkPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SinkPaneOuterClass$SinkPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SinkPaneOuterClass$SinkPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
