package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class HeadlessOAuthPaneOuterClass$HeadlessOAuthPane extends GeneratedMessageLite<HeadlessOAuthPaneOuterClass$HeadlessOAuthPane, C6638a> implements MessageLiteOrBuilder {
    private static final HeadlessOAuthPaneOuterClass$HeadlessOAuthPane DEFAULT_INSTANCE;
    private static volatile Parser<HeadlessOAuthPaneOuterClass$HeadlessOAuthPane> PARSER;

    public static final class Actions extends GeneratedMessageLite<Actions, C6635b> implements MessageLiteOrBuilder {
        private static final Actions DEFAULT_INSTANCE;
        private static volatile Parser<Actions> PARSER = null;
        public static final int SUBMIT_FIELD_NUMBER = 1;
        private int actionCase_ = 0;
        private Object action_;

        public static final class SubmitAction extends GeneratedMessageLite<SubmitAction, C6633a> implements MessageLiteOrBuilder {
            private static final SubmitAction DEFAULT_INSTANCE;
            public static final int OAUTH_STATE_ID_FIELD_NUMBER = 2;
            public static final int OAUTH_SUBMISSION_METHOD_FIELD_NUMBER = 3;
            private static volatile Parser<SubmitAction> PARSER = null;
            public static final int RESPONSE_REDIRECT_URI_FIELD_NUMBER = 1;
            private int oauthSubmissionMethod_;
            private String responseRedirectUri_ = "";
            private String oauthStateId_ = "";

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane$Actions$SubmitAction$a */
            public static final class C6633a extends GeneratedMessageLite.Builder<SubmitAction, C6633a> implements MessageLiteOrBuilder {
                public C6633a() {
                    super(SubmitAction.DEFAULT_INSTANCE);
                }

                /* renamed from: a */
                public final C6633a m1437a(String str) {
                    copyOnWrite();
                    ((SubmitAction) this.instance).setOauthStateId(str);
                    return this;
                }

                /* renamed from: b */
                public final C6633a m1438b(String str) {
                    copyOnWrite();
                    ((SubmitAction) this.instance).setResponseRedirectUri(str);
                    return this;
                }
            }

            static {
                SubmitAction submitAction = new SubmitAction();
                DEFAULT_INSTANCE = submitAction;
                GeneratedMessageLite.registerDefaultInstance(SubmitAction.class, submitAction);
            }

            private SubmitAction() {
            }

            private void clearOauthStateId() {
                this.oauthStateId_ = getDefaultInstance().getOauthStateId();
            }

            private void clearOauthSubmissionMethod() {
                this.oauthSubmissionMethod_ = 0;
            }

            private void clearResponseRedirectUri() {
                this.responseRedirectUri_ = getDefaultInstance().getResponseRedirectUri();
            }

            public static SubmitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6633a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static SubmitAction parseDelimitedFrom(InputStream inputStream) {
                return (SubmitAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SubmitAction parseFrom(ByteBuffer byteBuffer) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<SubmitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOauthStateId(String str) {
                str.getClass();
                this.oauthStateId_ = str;
            }

            private void setOauthStateIdBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.oauthStateId_ = byteString.toStringUtf8();
            }

            private void setOauthSubmissionMethod(EnumC6598F enumC6598F) {
                this.oauthSubmissionMethod_ = enumC6598F.getNumber();
            }

            private void setOauthSubmissionMethodValue(int i) {
                this.oauthSubmissionMethod_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setResponseRedirectUri(String str) {
                str.getClass();
                this.responseRedirectUri_ = str;
            }

            private void setResponseRedirectUriBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.responseRedirectUri_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6914h0.f2559a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SubmitAction();
                    case 2:
                        return new C6633a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"responseRedirectUri_", "oauthStateId_", "oauthSubmissionMethod_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<SubmitAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (SubmitAction.class) {
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

            public String getOauthStateId() {
                return this.oauthStateId_;
            }

            public ByteString getOauthStateIdBytes() {
                return ByteString.copyFromUtf8(this.oauthStateId_);
            }

            public EnumC6598F getOauthSubmissionMethod() {
                EnumC6598F enumC6598FForNumber = EnumC6598F.forNumber(this.oauthSubmissionMethod_);
                return enumC6598FForNumber == null ? EnumC6598F.UNRECOGNIZED : enumC6598FForNumber;
            }

            public int getOauthSubmissionMethodValue() {
                return this.oauthSubmissionMethod_;
            }

            public String getResponseRedirectUri() {
                return this.responseRedirectUri_;
            }

            public ByteString getResponseRedirectUriBytes() {
                return ByteString.copyFromUtf8(this.responseRedirectUri_);
            }

            public static C6633a newBuilder(SubmitAction submitAction) {
                return DEFAULT_INSTANCE.createBuilder(submitAction);
            }

            public static SubmitAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SubmitAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SubmitAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static SubmitAction parseFrom(ByteString byteString) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static SubmitAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static SubmitAction parseFrom(byte[] bArr) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static SubmitAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static SubmitAction parseFrom(InputStream inputStream) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SubmitAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SubmitAction parseFrom(CodedInputStream codedInputStream) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static SubmitAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane$Actions$a */
        public enum EnumC6634a {
            SUBMIT(1),
            ACTION_NOT_SET(0);


            /* renamed from: a */
            public final int f2381a;

            EnumC6634a(int i) {
                this.f2381a = i;
            }

            public static EnumC6634a forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i != 1) {
                    return null;
                }
                return SUBMIT;
            }

            public int getNumber() {
                return this.f2381a;
            }

            @Deprecated
            public static EnumC6634a valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane$Actions$b */
        public static final class C6635b extends GeneratedMessageLite.Builder<Actions, C6635b> implements MessageLiteOrBuilder {
            public C6635b() {
                super(Actions.DEFAULT_INSTANCE);
            }

            /* renamed from: a */
            public final C6635b m1439a(SubmitAction.C6633a c6633a) {
                copyOnWrite();
                ((Actions) this.instance).setSubmit(c6633a.build());
                return this;
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

        private void clearSubmit() {
            if (this.actionCase_ == 1) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeSubmit(SubmitAction submitAction) {
            submitAction.getClass();
            if (this.actionCase_ != 1 || this.action_ == SubmitAction.getDefaultInstance()) {
                this.action_ = submitAction;
            } else {
                this.action_ = SubmitAction.newBuilder((SubmitAction) this.action_).mergeFrom((SubmitAction.C6633a) submitAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        public static C6635b newBuilder() {
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubmit(SubmitAction submitAction) {
            submitAction.getClass();
            this.action_ = submitAction;
            this.actionCase_ = 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6914h0.f2559a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Actions();
                case 2:
                    return new C6635b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"action_", "actionCase_", SubmitAction.class});
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

        public EnumC6634a getActionCase() {
            return EnumC6634a.forNumber(this.actionCase_);
        }

        public SubmitAction getSubmit() {
            return this.actionCase_ == 1 ? (SubmitAction) this.action_ : SubmitAction.getDefaultInstance();
        }

        public boolean hasSubmit() {
            return this.actionCase_ == 1;
        }

        public static C6635b newBuilder(Actions actions) {
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

    public static final class Rendering extends GeneratedMessageLite<Rendering, C6637a> implements MessageLiteOrBuilder {
        private static final Rendering DEFAULT_INSTANCE;
        public static final int EVENTS_FIELD_NUMBER = 2;
        public static final int EXPECTED_OAUTH_URL_MATCHER_FIELD_NUMBER = 4;
        public static final int LOGIN_URI_FIELD_NUMBER = 1;
        public static final int OAUTH_STATE_ID_FIELD_NUMBER = 3;
        private static volatile Parser<Rendering> PARSER = null;
        public static final int POLLING_FIELD_NUMBER = 5;
        private int bitField0_;
        private Events events_;
        private Common$URLBehaviorConfiguration.Matcher expectedOauthUrlMatcher_;
        private String loginUri_ = "";
        private String oauthStateId_ = "";
        private Common$PollingOptions polling_;

        public static final class Events extends GeneratedMessageLite<Events, C6636a> implements MessageLiteOrBuilder {
            private static final Events DEFAULT_INSTANCE;
            public static final int ON_FAIL_REDIRECT_FIELD_NUMBER = 4;
            private static volatile Parser<Events> PARSER;
            private Internal.ProtobufList<Common$SDKEvent> onFailRedirect_ = GeneratedMessageLite.emptyProtobufList();

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane$Rendering$Events$a */
            public static final class C6636a extends GeneratedMessageLite.Builder<Events, C6636a> implements MessageLiteOrBuilder {
                public C6636a() {
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

            private void addAllOnFailRedirect(Iterable<? extends Common$SDKEvent> iterable) {
                ensureOnFailRedirectIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.onFailRedirect_);
            }

            private void addOnFailRedirect(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnFailRedirectIsMutable();
                this.onFailRedirect_.add(common$SDKEvent);
            }

            private void clearOnFailRedirect() {
                this.onFailRedirect_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureOnFailRedirectIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onFailRedirect_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onFailRedirect_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6636a newBuilder() {
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

            private void removeOnFailRedirect(int i) {
                ensureOnFailRedirectIsMutable();
                this.onFailRedirect_.remove(i);
            }

            private void setOnFailRedirect(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnFailRedirectIsMutable();
                this.onFailRedirect_.set(i, common$SDKEvent);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6914h0.f2559a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Events();
                    case 2:
                        return new C6636a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0001\u0000\u0004\u001b", new Object[]{"onFailRedirect_", Common$SDKEvent.class});
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

            public Common$SDKEvent getOnFailRedirect(int i) {
                return this.onFailRedirect_.get(i);
            }

            public int getOnFailRedirectCount() {
                return this.onFailRedirect_.size();
            }

            public List<Common$SDKEvent> getOnFailRedirectList() {
                return this.onFailRedirect_;
            }

            public InterfaceC6691M getOnFailRedirectOrBuilder(int i) {
                return this.onFailRedirect_.get(i);
            }

            public List<? extends InterfaceC6691M> getOnFailRedirectOrBuilderList() {
                return this.onFailRedirect_;
            }

            public static C6636a newBuilder(Events events) {
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

            private void addOnFailRedirect(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnFailRedirectIsMutable();
                this.onFailRedirect_.add(i, common$SDKEvent);
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

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane$Rendering$a */
        public static final class C6637a extends GeneratedMessageLite.Builder<Rendering, C6637a> implements MessageLiteOrBuilder {
            public C6637a() {
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

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -2;
        }

        private void clearExpectedOauthUrlMatcher() {
            this.expectedOauthUrlMatcher_ = null;
            this.bitField0_ &= -3;
        }

        private void clearLoginUri() {
            this.loginUri_ = getDefaultInstance().getLoginUri();
        }

        private void clearOauthStateId() {
            this.oauthStateId_ = getDefaultInstance().getOauthStateId();
        }

        private void clearPolling() {
            this.polling_ = null;
            this.bitField0_ &= -5;
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
                this.events_ = Events.newBuilder(this.events_).mergeFrom((Events.C6636a) events).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeExpectedOauthUrlMatcher(Common$URLBehaviorConfiguration.Matcher matcher) {
            matcher.getClass();
            Common$URLBehaviorConfiguration.Matcher matcher2 = this.expectedOauthUrlMatcher_;
            if (matcher2 == null || matcher2 == Common$URLBehaviorConfiguration.Matcher.getDefaultInstance()) {
                this.expectedOauthUrlMatcher_ = matcher;
            } else {
                this.expectedOauthUrlMatcher_ = Common$URLBehaviorConfiguration.Matcher.newBuilder(this.expectedOauthUrlMatcher_).mergeFrom((Common$URLBehaviorConfiguration.Matcher.C6546a) matcher).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergePolling(Common$PollingOptions common$PollingOptions) {
            common$PollingOptions.getClass();
            Common$PollingOptions common$PollingOptions2 = this.polling_;
            if (common$PollingOptions2 == null || common$PollingOptions2 == Common$PollingOptions.getDefaultInstance()) {
                this.polling_ = common$PollingOptions;
            } else {
                this.polling_ = Common$PollingOptions.newBuilder(this.polling_).mergeFrom((Common$PollingOptions.C6465a) common$PollingOptions).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static C6637a newBuilder() {
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

        private void setEvents(Events events) {
            events.getClass();
            this.events_ = events;
            this.bitField0_ |= 1;
        }

        private void setExpectedOauthUrlMatcher(Common$URLBehaviorConfiguration.Matcher matcher) {
            matcher.getClass();
            this.expectedOauthUrlMatcher_ = matcher;
            this.bitField0_ |= 2;
        }

        private void setLoginUri(String str) {
            str.getClass();
            this.loginUri_ = str;
        }

        private void setLoginUriBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.loginUri_ = byteString.toStringUtf8();
        }

        private void setOauthStateId(String str) {
            str.getClass();
            this.oauthStateId_ = str;
        }

        private void setOauthStateIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.oauthStateId_ = byteString.toStringUtf8();
        }

        private void setPolling(Common$PollingOptions common$PollingOptions) {
            common$PollingOptions.getClass();
            this.polling_ = common$PollingOptions;
            this.bitField0_ |= 4;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6914h0.f2559a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new C6637a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "loginUri_", "events_", "oauthStateId_", "expectedOauthUrlMatcher_", "polling_"});
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

        public Events getEvents() {
            Events events = this.events_;
            return events == null ? Events.getDefaultInstance() : events;
        }

        public Common$URLBehaviorConfiguration.Matcher getExpectedOauthUrlMatcher() {
            Common$URLBehaviorConfiguration.Matcher matcher = this.expectedOauthUrlMatcher_;
            return matcher == null ? Common$URLBehaviorConfiguration.Matcher.getDefaultInstance() : matcher;
        }

        public String getLoginUri() {
            return this.loginUri_;
        }

        public ByteString getLoginUriBytes() {
            return ByteString.copyFromUtf8(this.loginUri_);
        }

        public String getOauthStateId() {
            return this.oauthStateId_;
        }

        public ByteString getOauthStateIdBytes() {
            return ByteString.copyFromUtf8(this.oauthStateId_);
        }

        public Common$PollingOptions getPolling() {
            Common$PollingOptions common$PollingOptions = this.polling_;
            return common$PollingOptions == null ? Common$PollingOptions.getDefaultInstance() : common$PollingOptions;
        }

        public boolean hasEvents() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasExpectedOauthUrlMatcher() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasPolling() {
            return (this.bitField0_ & 4) != 0;
        }

        public static C6637a newBuilder(Rendering rendering) {
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

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane$a */
    public static final class C6638a extends GeneratedMessageLite.Builder<HeadlessOAuthPaneOuterClass$HeadlessOAuthPane, C6638a> implements MessageLiteOrBuilder {
        public C6638a() {
            super(HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.DEFAULT_INSTANCE);
        }
    }

    static {
        HeadlessOAuthPaneOuterClass$HeadlessOAuthPane headlessOAuthPaneOuterClass$HeadlessOAuthPane = new HeadlessOAuthPaneOuterClass$HeadlessOAuthPane();
        DEFAULT_INSTANCE = headlessOAuthPaneOuterClass$HeadlessOAuthPane;
        GeneratedMessageLite.registerDefaultInstance(HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.class, headlessOAuthPaneOuterClass$HeadlessOAuthPane);
    }

    private HeadlessOAuthPaneOuterClass$HeadlessOAuthPane() {
    }

    public static HeadlessOAuthPaneOuterClass$HeadlessOAuthPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6638a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static HeadlessOAuthPaneOuterClass$HeadlessOAuthPane parseDelimitedFrom(InputStream inputStream) {
        return (HeadlessOAuthPaneOuterClass$HeadlessOAuthPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HeadlessOAuthPaneOuterClass$HeadlessOAuthPane parseFrom(ByteBuffer byteBuffer) {
        return (HeadlessOAuthPaneOuterClass$HeadlessOAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<HeadlessOAuthPaneOuterClass$HeadlessOAuthPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6914h0.f2559a[methodToInvoke.ordinal()]) {
            case 1:
                return new HeadlessOAuthPaneOuterClass$HeadlessOAuthPane();
            case 2:
                return new C6638a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<HeadlessOAuthPaneOuterClass$HeadlessOAuthPane> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.class) {
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

    public static C6638a newBuilder(HeadlessOAuthPaneOuterClass$HeadlessOAuthPane headlessOAuthPaneOuterClass$HeadlessOAuthPane) {
        return DEFAULT_INSTANCE.createBuilder(headlessOAuthPaneOuterClass$HeadlessOAuthPane);
    }

    public static HeadlessOAuthPaneOuterClass$HeadlessOAuthPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (HeadlessOAuthPaneOuterClass$HeadlessOAuthPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HeadlessOAuthPaneOuterClass$HeadlessOAuthPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (HeadlessOAuthPaneOuterClass$HeadlessOAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static HeadlessOAuthPaneOuterClass$HeadlessOAuthPane parseFrom(ByteString byteString) {
        return (HeadlessOAuthPaneOuterClass$HeadlessOAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static HeadlessOAuthPaneOuterClass$HeadlessOAuthPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (HeadlessOAuthPaneOuterClass$HeadlessOAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static HeadlessOAuthPaneOuterClass$HeadlessOAuthPane parseFrom(byte[] bArr) {
        return (HeadlessOAuthPaneOuterClass$HeadlessOAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HeadlessOAuthPaneOuterClass$HeadlessOAuthPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (HeadlessOAuthPaneOuterClass$HeadlessOAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static HeadlessOAuthPaneOuterClass$HeadlessOAuthPane parseFrom(InputStream inputStream) {
        return (HeadlessOAuthPaneOuterClass$HeadlessOAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HeadlessOAuthPaneOuterClass$HeadlessOAuthPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (HeadlessOAuthPaneOuterClass$HeadlessOAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HeadlessOAuthPaneOuterClass$HeadlessOAuthPane parseFrom(CodedInputStream codedInputStream) {
        return (HeadlessOAuthPaneOuterClass$HeadlessOAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static HeadlessOAuthPaneOuterClass$HeadlessOAuthPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (HeadlessOAuthPaneOuterClass$HeadlessOAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
