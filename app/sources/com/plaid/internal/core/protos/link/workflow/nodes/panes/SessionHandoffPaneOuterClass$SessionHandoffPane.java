package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class SessionHandoffPaneOuterClass$SessionHandoffPane extends GeneratedMessageLite<SessionHandoffPaneOuterClass$SessionHandoffPane, C6820a> implements MessageLiteOrBuilder {
    private static final SessionHandoffPaneOuterClass$SessionHandoffPane DEFAULT_INSTANCE;
    private static volatile Parser<SessionHandoffPaneOuterClass$SessionHandoffPane> PARSER;

    public static final class Actions extends GeneratedMessageLite<Actions, C6817b> implements MessageLiteOrBuilder {
        public static final int CONTINUE_FIELD_NUMBER = 1;
        private static final Actions DEFAULT_INSTANCE;
        private static volatile Parser<Actions> PARSER;
        private int actionCase_ = 0;
        private Object action_;

        public static final class ContinueAction extends GeneratedMessageLite<ContinueAction, C6815a> implements MessageLiteOrBuilder {
            private static final ContinueAction DEFAULT_INSTANCE;
            private static volatile Parser<ContinueAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane$Actions$ContinueAction$a */
            public static final class C6815a extends GeneratedMessageLite.Builder<ContinueAction, C6815a> implements MessageLiteOrBuilder {
                public C6815a() {
                    super(ContinueAction.DEFAULT_INSTANCE);
                }
            }

            static {
                ContinueAction continueAction = new ContinueAction();
                DEFAULT_INSTANCE = continueAction;
                GeneratedMessageLite.registerDefaultInstance(ContinueAction.class, continueAction);
            }

            private ContinueAction() {
            }

            public static ContinueAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6815a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ContinueAction parseDelimitedFrom(InputStream inputStream) {
                return (ContinueAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ContinueAction parseFrom(ByteBuffer byteBuffer) {
                return (ContinueAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ContinueAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6938t0.f2602a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ContinueAction();
                    case 2:
                        return new C6815a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ContinueAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ContinueAction.class) {
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

            public static C6815a newBuilder(ContinueAction continueAction) {
                return DEFAULT_INSTANCE.createBuilder(continueAction);
            }

            public static ContinueAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ContinueAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ContinueAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ContinueAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ContinueAction parseFrom(ByteString byteString) {
                return (ContinueAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ContinueAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ContinueAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ContinueAction parseFrom(byte[] bArr) {
                return (ContinueAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ContinueAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ContinueAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ContinueAction parseFrom(InputStream inputStream) {
                return (ContinueAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ContinueAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ContinueAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ContinueAction parseFrom(CodedInputStream codedInputStream) {
                return (ContinueAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ContinueAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ContinueAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane$Actions$a */
        public enum EnumC6816a {
            CONTINUE(1),
            ACTION_NOT_SET(0);


            /* renamed from: a */
            public final int f2476a;

            EnumC6816a(int i) {
                this.f2476a = i;
            }

            public static EnumC6816a forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i != 1) {
                    return null;
                }
                return CONTINUE;
            }

            public int getNumber() {
                return this.f2476a;
            }

            @Deprecated
            public static EnumC6816a valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane$Actions$b */
        public static final class C6817b extends GeneratedMessageLite.Builder<Actions, C6817b> implements MessageLiteOrBuilder {
            public C6817b() {
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

        private void clearAction() {
            this.actionCase_ = 0;
            this.action_ = null;
        }

        private void clearContinue() {
            if (this.actionCase_ == 1) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeContinue(ContinueAction continueAction) {
            continueAction.getClass();
            if (this.actionCase_ != 1 || this.action_ == ContinueAction.getDefaultInstance()) {
                this.action_ = continueAction;
            } else {
                this.action_ = ContinueAction.newBuilder((ContinueAction) this.action_).mergeFrom((ContinueAction.C6815a) continueAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        public static C6817b newBuilder() {
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

        private void setContinue(ContinueAction continueAction) {
            continueAction.getClass();
            this.action_ = continueAction;
            this.actionCase_ = 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6938t0.f2602a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Actions();
                case 2:
                    return new C6817b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"action_", "actionCase_", ContinueAction.class});
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

        public EnumC6816a getActionCase() {
            return EnumC6816a.forNumber(this.actionCase_);
        }

        public ContinueAction getContinue() {
            return this.actionCase_ == 1 ? (ContinueAction) this.action_ : ContinueAction.getDefaultInstance();
        }

        public boolean hasContinue() {
            return this.actionCase_ == 1;
        }

        public static C6817b newBuilder(Actions actions) {
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

    public static final class Rendering extends GeneratedMessageLite<Rendering, C6819a> implements MessageLiteOrBuilder {
        public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 4;
        private static final Rendering DEFAULT_INSTANCE;
        public static final int EVENTS_FIELD_NUMBER = 5;
        public static final int MODE_FIELD_NUMBER = 1;
        private static volatile Parser<Rendering> PARSER = null;
        public static final int WEBVIEW_FALLBACK_FIELD_NUMBER = 2;
        public static final int WEBVIEW_REDIRECT_URI_FIELD_NUMBER = 3;
        private int bitField0_;
        private Events events_;
        private int mode_;
        private Common$WebviewFallback webviewFallback_;
        private String webviewRedirectUri_ = "";
        private String continuationToken_ = "";

        public static final class Events extends GeneratedMessageLite<Events, C6818a> implements MessageLiteOrBuilder {
            private static final Events DEFAULT_INSTANCE;
            private static volatile Parser<Events> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane$Rendering$Events$a */
            public static final class C6818a extends GeneratedMessageLite.Builder<Events, C6818a> implements MessageLiteOrBuilder {
                public C6818a() {
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

            public static Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6818a newBuilder() {
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

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6938t0.f2602a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Events();
                    case 2:
                        return new C6818a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
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

            public static C6818a newBuilder(Events events) {
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

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane$Rendering$a */
        public static final class C6819a extends GeneratedMessageLite.Builder<Rendering, C6819a> implements MessageLiteOrBuilder {
            public C6819a() {
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

        private void clearContinuationToken() {
            this.continuationToken_ = getDefaultInstance().getContinuationToken();
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -3;
        }

        private void clearMode() {
            this.mode_ = 0;
        }

        private void clearWebviewFallback() {
            this.webviewFallback_ = null;
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
                this.events_ = Events.newBuilder(this.events_).mergeFrom((Events.C6818a) events).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeWebviewFallback(Common$WebviewFallback common$WebviewFallback) {
            common$WebviewFallback.getClass();
            Common$WebviewFallback common$WebviewFallback2 = this.webviewFallback_;
            if (common$WebviewFallback2 == null || common$WebviewFallback2 == Common$WebviewFallback.getDefaultInstance()) {
                this.webviewFallback_ = common$WebviewFallback;
            } else {
                this.webviewFallback_ = Common$WebviewFallback.newBuilder(this.webviewFallback_).mergeFrom((Common$WebviewFallback.C6552a) common$WebviewFallback).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static C6819a newBuilder() {
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

        private void setContinuationToken(String str) {
            str.getClass();
            this.continuationToken_ = str;
        }

        private void setContinuationTokenBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.continuationToken_ = byteString.toStringUtf8();
        }

        private void setEvents(Events events) {
            events.getClass();
            this.events_ = events;
            this.bitField0_ |= 2;
        }

        private void setMode(EnumC6902b0 enumC6902b0) {
            this.mode_ = enumC6902b0.getNumber();
        }

        private void setModeValue(int i) {
            this.mode_ = i;
        }

        private void setWebviewFallback(Common$WebviewFallback common$WebviewFallback) {
            common$WebviewFallback.getClass();
            this.webviewFallback_ = common$WebviewFallback;
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
            switch (C6938t0.f2602a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new C6819a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003Ȉ\u0004Ȉ\u0005ဉ\u0001", new Object[]{"bitField0_", "mode_", "webviewFallback_", "webviewRedirectUri_", "continuationToken_", "events_"});
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

        public String getContinuationToken() {
            return this.continuationToken_;
        }

        public ByteString getContinuationTokenBytes() {
            return ByteString.copyFromUtf8(this.continuationToken_);
        }

        public Events getEvents() {
            Events events = this.events_;
            return events == null ? Events.getDefaultInstance() : events;
        }

        public EnumC6902b0 getMode() {
            EnumC6902b0 enumC6902b0ForNumber = EnumC6902b0.forNumber(this.mode_);
            return enumC6902b0ForNumber == null ? EnumC6902b0.UNRECOGNIZED : enumC6902b0ForNumber;
        }

        public int getModeValue() {
            return this.mode_;
        }

        public Common$WebviewFallback getWebviewFallback() {
            Common$WebviewFallback common$WebviewFallback = this.webviewFallback_;
            return common$WebviewFallback == null ? Common$WebviewFallback.getDefaultInstance() : common$WebviewFallback;
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

        public boolean hasWebviewFallback() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C6819a newBuilder(Rendering rendering) {
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

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane$a */
    public static final class C6820a extends GeneratedMessageLite.Builder<SessionHandoffPaneOuterClass$SessionHandoffPane, C6820a> implements MessageLiteOrBuilder {
        public C6820a() {
            super(SessionHandoffPaneOuterClass$SessionHandoffPane.DEFAULT_INSTANCE);
        }
    }

    static {
        SessionHandoffPaneOuterClass$SessionHandoffPane sessionHandoffPaneOuterClass$SessionHandoffPane = new SessionHandoffPaneOuterClass$SessionHandoffPane();
        DEFAULT_INSTANCE = sessionHandoffPaneOuterClass$SessionHandoffPane;
        GeneratedMessageLite.registerDefaultInstance(SessionHandoffPaneOuterClass$SessionHandoffPane.class, sessionHandoffPaneOuterClass$SessionHandoffPane);
    }

    private SessionHandoffPaneOuterClass$SessionHandoffPane() {
    }

    public static SessionHandoffPaneOuterClass$SessionHandoffPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6820a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SessionHandoffPaneOuterClass$SessionHandoffPane parseDelimitedFrom(InputStream inputStream) {
        return (SessionHandoffPaneOuterClass$SessionHandoffPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SessionHandoffPaneOuterClass$SessionHandoffPane parseFrom(ByteBuffer byteBuffer) {
        return (SessionHandoffPaneOuterClass$SessionHandoffPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SessionHandoffPaneOuterClass$SessionHandoffPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6938t0.f2602a[methodToInvoke.ordinal()]) {
            case 1:
                return new SessionHandoffPaneOuterClass$SessionHandoffPane();
            case 2:
                return new C6820a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SessionHandoffPaneOuterClass$SessionHandoffPane> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (SessionHandoffPaneOuterClass$SessionHandoffPane.class) {
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

    public static C6820a newBuilder(SessionHandoffPaneOuterClass$SessionHandoffPane sessionHandoffPaneOuterClass$SessionHandoffPane) {
        return DEFAULT_INSTANCE.createBuilder(sessionHandoffPaneOuterClass$SessionHandoffPane);
    }

    public static SessionHandoffPaneOuterClass$SessionHandoffPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SessionHandoffPaneOuterClass$SessionHandoffPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SessionHandoffPaneOuterClass$SessionHandoffPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SessionHandoffPaneOuterClass$SessionHandoffPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SessionHandoffPaneOuterClass$SessionHandoffPane parseFrom(ByteString byteString) {
        return (SessionHandoffPaneOuterClass$SessionHandoffPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SessionHandoffPaneOuterClass$SessionHandoffPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (SessionHandoffPaneOuterClass$SessionHandoffPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SessionHandoffPaneOuterClass$SessionHandoffPane parseFrom(byte[] bArr) {
        return (SessionHandoffPaneOuterClass$SessionHandoffPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SessionHandoffPaneOuterClass$SessionHandoffPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (SessionHandoffPaneOuterClass$SessionHandoffPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SessionHandoffPaneOuterClass$SessionHandoffPane parseFrom(InputStream inputStream) {
        return (SessionHandoffPaneOuterClass$SessionHandoffPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SessionHandoffPaneOuterClass$SessionHandoffPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SessionHandoffPaneOuterClass$SessionHandoffPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SessionHandoffPaneOuterClass$SessionHandoffPane parseFrom(CodedInputStream codedInputStream) {
        return (SessionHandoffPaneOuterClass$SessionHandoffPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SessionHandoffPaneOuterClass$SessionHandoffPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SessionHandoffPaneOuterClass$SessionHandoffPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
