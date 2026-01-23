package com.plaid.internal.core.protos.link.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Workflow$LinkWorkflowPollRequest extends GeneratedMessageLite<Workflow$LinkWorkflowPollRequest, C6206a> implements MessageLiteOrBuilder {
    public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 6;
    private static final Workflow$LinkWorkflowPollRequest DEFAULT_INSTANCE;
    public static final int EMBEDDED_LINK_UPDATE_AVAILABLE_FIELD_NUMBER = 5;
    public static final int OAUTH_REDIRECT_COMPLETE_FIELD_NUMBER = 2;
    private static volatile Parser<Workflow$LinkWorkflowPollRequest> PARSER = null;
    public static final int PASSKEY_CHALLENGE_GET_FIELD_NUMBER = 7;
    public static final int PASSKEY_REDIRECT_COMPLETE_FIELD_NUMBER = 4;
    public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 1;
    private Object poll_;
    private int pollCase_ = 0;
    private String workflowSessionId_ = "";
    private String continuationToken_ = "";

    public static final class EmbeddedLinkUpdateAvailable extends GeneratedMessageLite<EmbeddedLinkUpdateAvailable, C6202a> implements MessageLiteOrBuilder {
        private static final EmbeddedLinkUpdateAvailable DEFAULT_INSTANCE;
        private static volatile Parser<EmbeddedLinkUpdateAvailable> PARSER;

        /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest$EmbeddedLinkUpdateAvailable$a */
        public static final class C6202a extends GeneratedMessageLite.Builder<EmbeddedLinkUpdateAvailable, C6202a> implements MessageLiteOrBuilder {
            public C6202a() {
                super(EmbeddedLinkUpdateAvailable.DEFAULT_INSTANCE);
            }
        }

        static {
            EmbeddedLinkUpdateAvailable embeddedLinkUpdateAvailable = new EmbeddedLinkUpdateAvailable();
            DEFAULT_INSTANCE = embeddedLinkUpdateAvailable;
            GeneratedMessageLite.registerDefaultInstance(EmbeddedLinkUpdateAvailable.class, embeddedLinkUpdateAvailable);
        }

        private EmbeddedLinkUpdateAvailable() {
        }

        public static EmbeddedLinkUpdateAvailable getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6202a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static EmbeddedLinkUpdateAvailable parseDelimitedFrom(InputStream inputStream) {
            return (EmbeddedLinkUpdateAvailable) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EmbeddedLinkUpdateAvailable parseFrom(ByteBuffer byteBuffer) {
            return (EmbeddedLinkUpdateAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<EmbeddedLinkUpdateAvailable> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                case 1:
                    return new EmbeddedLinkUpdateAvailable();
                case 2:
                    return new C6202a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EmbeddedLinkUpdateAvailable> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (EmbeddedLinkUpdateAvailable.class) {
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

        public static C6202a newBuilder(EmbeddedLinkUpdateAvailable embeddedLinkUpdateAvailable) {
            return DEFAULT_INSTANCE.createBuilder(embeddedLinkUpdateAvailable);
        }

        public static EmbeddedLinkUpdateAvailable parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedLinkUpdateAvailable) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EmbeddedLinkUpdateAvailable parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedLinkUpdateAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EmbeddedLinkUpdateAvailable parseFrom(ByteString byteString) {
            return (EmbeddedLinkUpdateAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EmbeddedLinkUpdateAvailable parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedLinkUpdateAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static EmbeddedLinkUpdateAvailable parseFrom(byte[] bArr) {
            return (EmbeddedLinkUpdateAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EmbeddedLinkUpdateAvailable parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedLinkUpdateAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EmbeddedLinkUpdateAvailable parseFrom(InputStream inputStream) {
            return (EmbeddedLinkUpdateAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EmbeddedLinkUpdateAvailable parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedLinkUpdateAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EmbeddedLinkUpdateAvailable parseFrom(CodedInputStream codedInputStream) {
            return (EmbeddedLinkUpdateAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EmbeddedLinkUpdateAvailable parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedLinkUpdateAvailable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OAuthRedirectComplete extends GeneratedMessageLite<OAuthRedirectComplete, C6203a> implements MessageLiteOrBuilder {
        private static final OAuthRedirectComplete DEFAULT_INSTANCE;
        public static final int OAUTH_STATE_ID_FIELD_NUMBER = 1;
        private static volatile Parser<OAuthRedirectComplete> PARSER;
        private String oauthStateId_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest$OAuthRedirectComplete$a */
        public static final class C6203a extends GeneratedMessageLite.Builder<OAuthRedirectComplete, C6203a> implements MessageLiteOrBuilder {
            public C6203a() {
                super(OAuthRedirectComplete.DEFAULT_INSTANCE);
            }

            /* renamed from: a */
            public final C6203a m1418a(String str) {
                copyOnWrite();
                ((OAuthRedirectComplete) this.instance).setOauthStateId(str);
                return this;
            }
        }

        static {
            OAuthRedirectComplete oAuthRedirectComplete = new OAuthRedirectComplete();
            DEFAULT_INSTANCE = oAuthRedirectComplete;
            GeneratedMessageLite.registerDefaultInstance(OAuthRedirectComplete.class, oAuthRedirectComplete);
        }

        private OAuthRedirectComplete() {
        }

        private void clearOauthStateId() {
            this.oauthStateId_ = getDefaultInstance().getOauthStateId();
        }

        public static OAuthRedirectComplete getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6203a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OAuthRedirectComplete parseDelimitedFrom(InputStream inputStream) {
            return (OAuthRedirectComplete) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OAuthRedirectComplete parseFrom(ByteBuffer byteBuffer) {
            return (OAuthRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<OAuthRedirectComplete> parser() {
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                case 1:
                    return new OAuthRedirectComplete();
                case 2:
                    return new C6203a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"oauthStateId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<OAuthRedirectComplete> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (OAuthRedirectComplete.class) {
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

        public static C6203a newBuilder(OAuthRedirectComplete oAuthRedirectComplete) {
            return DEFAULT_INSTANCE.createBuilder(oAuthRedirectComplete);
        }

        public static OAuthRedirectComplete parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthRedirectComplete) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OAuthRedirectComplete parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OAuthRedirectComplete parseFrom(ByteString byteString) {
            return (OAuthRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OAuthRedirectComplete parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OAuthRedirectComplete parseFrom(byte[] bArr) {
            return (OAuthRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OAuthRedirectComplete parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OAuthRedirectComplete parseFrom(InputStream inputStream) {
            return (OAuthRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OAuthRedirectComplete parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OAuthRedirectComplete parseFrom(CodedInputStream codedInputStream) {
            return (OAuthRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OAuthRedirectComplete parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PasskeyChallengeGet extends GeneratedMessageLite<PasskeyChallengeGet, C6204a> implements MessageLiteOrBuilder {
        private static final PasskeyChallengeGet DEFAULT_INSTANCE;
        private static volatile Parser<PasskeyChallengeGet> PARSER = null;
        public static final int PHONE_NUMBER_FIELD_NUMBER = 1;
        private String phoneNumber_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest$PasskeyChallengeGet$a */
        public static final class C6204a extends GeneratedMessageLite.Builder<PasskeyChallengeGet, C6204a> implements MessageLiteOrBuilder {
            public C6204a() {
                super(PasskeyChallengeGet.DEFAULT_INSTANCE);
            }
        }

        static {
            PasskeyChallengeGet passkeyChallengeGet = new PasskeyChallengeGet();
            DEFAULT_INSTANCE = passkeyChallengeGet;
            GeneratedMessageLite.registerDefaultInstance(PasskeyChallengeGet.class, passkeyChallengeGet);
        }

        private PasskeyChallengeGet() {
        }

        private void clearPhoneNumber() {
            this.phoneNumber_ = getDefaultInstance().getPhoneNumber();
        }

        public static PasskeyChallengeGet getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6204a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PasskeyChallengeGet parseDelimitedFrom(InputStream inputStream) {
            return (PasskeyChallengeGet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PasskeyChallengeGet parseFrom(ByteBuffer byteBuffer) {
            return (PasskeyChallengeGet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<PasskeyChallengeGet> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setPhoneNumber(String str) {
            str.getClass();
            this.phoneNumber_ = str;
        }

        private void setPhoneNumberBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.phoneNumber_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                case 1:
                    return new PasskeyChallengeGet();
                case 2:
                    return new C6204a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"phoneNumber_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PasskeyChallengeGet> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (PasskeyChallengeGet.class) {
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

        public String getPhoneNumber() {
            return this.phoneNumber_;
        }

        public ByteString getPhoneNumberBytes() {
            return ByteString.copyFromUtf8(this.phoneNumber_);
        }

        public static C6204a newBuilder(PasskeyChallengeGet passkeyChallengeGet) {
            return DEFAULT_INSTANCE.createBuilder(passkeyChallengeGet);
        }

        public static PasskeyChallengeGet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PasskeyChallengeGet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PasskeyChallengeGet parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (PasskeyChallengeGet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PasskeyChallengeGet parseFrom(ByteString byteString) {
            return (PasskeyChallengeGet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PasskeyChallengeGet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (PasskeyChallengeGet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PasskeyChallengeGet parseFrom(byte[] bArr) {
            return (PasskeyChallengeGet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PasskeyChallengeGet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (PasskeyChallengeGet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PasskeyChallengeGet parseFrom(InputStream inputStream) {
            return (PasskeyChallengeGet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PasskeyChallengeGet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PasskeyChallengeGet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PasskeyChallengeGet parseFrom(CodedInputStream codedInputStream) {
            return (PasskeyChallengeGet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PasskeyChallengeGet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PasskeyChallengeGet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PasskeyRedirectComplete extends GeneratedMessageLite<PasskeyRedirectComplete, C6205a> implements MessageLiteOrBuilder {
        private static final PasskeyRedirectComplete DEFAULT_INSTANCE;
        private static volatile Parser<PasskeyRedirectComplete> PARSER;

        /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest$PasskeyRedirectComplete$a */
        public static final class C6205a extends GeneratedMessageLite.Builder<PasskeyRedirectComplete, C6205a> implements MessageLiteOrBuilder {
            public C6205a() {
                super(PasskeyRedirectComplete.DEFAULT_INSTANCE);
            }
        }

        static {
            PasskeyRedirectComplete passkeyRedirectComplete = new PasskeyRedirectComplete();
            DEFAULT_INSTANCE = passkeyRedirectComplete;
            GeneratedMessageLite.registerDefaultInstance(PasskeyRedirectComplete.class, passkeyRedirectComplete);
        }

        private PasskeyRedirectComplete() {
        }

        public static PasskeyRedirectComplete getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6205a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PasskeyRedirectComplete parseDelimitedFrom(InputStream inputStream) {
            return (PasskeyRedirectComplete) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PasskeyRedirectComplete parseFrom(ByteBuffer byteBuffer) {
            return (PasskeyRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<PasskeyRedirectComplete> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                case 1:
                    return new PasskeyRedirectComplete();
                case 2:
                    return new C6205a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PasskeyRedirectComplete> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (PasskeyRedirectComplete.class) {
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

        public static C6205a newBuilder(PasskeyRedirectComplete passkeyRedirectComplete) {
            return DEFAULT_INSTANCE.createBuilder(passkeyRedirectComplete);
        }

        public static PasskeyRedirectComplete parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PasskeyRedirectComplete) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PasskeyRedirectComplete parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (PasskeyRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PasskeyRedirectComplete parseFrom(ByteString byteString) {
            return (PasskeyRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PasskeyRedirectComplete parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (PasskeyRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PasskeyRedirectComplete parseFrom(byte[] bArr) {
            return (PasskeyRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PasskeyRedirectComplete parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (PasskeyRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PasskeyRedirectComplete parseFrom(InputStream inputStream) {
            return (PasskeyRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PasskeyRedirectComplete parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PasskeyRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PasskeyRedirectComplete parseFrom(CodedInputStream codedInputStream) {
            return (PasskeyRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PasskeyRedirectComplete parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PasskeyRedirectComplete) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest$b */
    public enum EnumC6207b {
        OAUTH_REDIRECT_COMPLETE(2),
        PASSKEY_REDIRECT_COMPLETE(4),
        EMBEDDED_LINK_UPDATE_AVAILABLE(5),
        PASSKEY_CHALLENGE_GET(7),
        POLL_NOT_SET(0);


        /* renamed from: a */
        public final int f2113a;

        EnumC6207b(int i) {
            this.f2113a = i;
        }

        public static EnumC6207b forNumber(int i) {
            if (i == 0) {
                return POLL_NOT_SET;
            }
            if (i == 2) {
                return OAUTH_REDIRECT_COMPLETE;
            }
            if (i == 7) {
                return PASSKEY_CHALLENGE_GET;
            }
            if (i == 4) {
                return PASSKEY_REDIRECT_COMPLETE;
            }
            if (i != 5) {
                return null;
            }
            return EMBEDDED_LINK_UPDATE_AVAILABLE;
        }

        public int getNumber() {
            return this.f2113a;
        }

        @Deprecated
        public static EnumC6207b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Workflow$LinkWorkflowPollRequest workflow$LinkWorkflowPollRequest = new Workflow$LinkWorkflowPollRequest();
        DEFAULT_INSTANCE = workflow$LinkWorkflowPollRequest;
        GeneratedMessageLite.registerDefaultInstance(Workflow$LinkWorkflowPollRequest.class, workflow$LinkWorkflowPollRequest);
    }

    private Workflow$LinkWorkflowPollRequest() {
    }

    private void clearContinuationToken() {
        this.continuationToken_ = getDefaultInstance().getContinuationToken();
    }

    private void clearEmbeddedLinkUpdateAvailable() {
        if (this.pollCase_ == 5) {
            this.pollCase_ = 0;
            this.poll_ = null;
        }
    }

    private void clearOauthRedirectComplete() {
        if (this.pollCase_ == 2) {
            this.pollCase_ = 0;
            this.poll_ = null;
        }
    }

    private void clearPasskeyChallengeGet() {
        if (this.pollCase_ == 7) {
            this.pollCase_ = 0;
            this.poll_ = null;
        }
    }

    private void clearPasskeyRedirectComplete() {
        if (this.pollCase_ == 4) {
            this.pollCase_ = 0;
            this.poll_ = null;
        }
    }

    private void clearPoll() {
        this.pollCase_ = 0;
        this.poll_ = null;
    }

    private void clearWorkflowSessionId() {
        this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
    }

    public static Workflow$LinkWorkflowPollRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeEmbeddedLinkUpdateAvailable(EmbeddedLinkUpdateAvailable embeddedLinkUpdateAvailable) {
        embeddedLinkUpdateAvailable.getClass();
        if (this.pollCase_ != 5 || this.poll_ == EmbeddedLinkUpdateAvailable.getDefaultInstance()) {
            this.poll_ = embeddedLinkUpdateAvailable;
        } else {
            this.poll_ = EmbeddedLinkUpdateAvailable.newBuilder((EmbeddedLinkUpdateAvailable) this.poll_).mergeFrom((EmbeddedLinkUpdateAvailable.C6202a) embeddedLinkUpdateAvailable).buildPartial();
        }
        this.pollCase_ = 5;
    }

    private void mergeOauthRedirectComplete(OAuthRedirectComplete oAuthRedirectComplete) {
        oAuthRedirectComplete.getClass();
        if (this.pollCase_ != 2 || this.poll_ == OAuthRedirectComplete.getDefaultInstance()) {
            this.poll_ = oAuthRedirectComplete;
        } else {
            this.poll_ = OAuthRedirectComplete.newBuilder((OAuthRedirectComplete) this.poll_).mergeFrom((OAuthRedirectComplete.C6203a) oAuthRedirectComplete).buildPartial();
        }
        this.pollCase_ = 2;
    }

    private void mergePasskeyChallengeGet(PasskeyChallengeGet passkeyChallengeGet) {
        passkeyChallengeGet.getClass();
        if (this.pollCase_ != 7 || this.poll_ == PasskeyChallengeGet.getDefaultInstance()) {
            this.poll_ = passkeyChallengeGet;
        } else {
            this.poll_ = PasskeyChallengeGet.newBuilder((PasskeyChallengeGet) this.poll_).mergeFrom((PasskeyChallengeGet.C6204a) passkeyChallengeGet).buildPartial();
        }
        this.pollCase_ = 7;
    }

    private void mergePasskeyRedirectComplete(PasskeyRedirectComplete passkeyRedirectComplete) {
        passkeyRedirectComplete.getClass();
        if (this.pollCase_ != 4 || this.poll_ == PasskeyRedirectComplete.getDefaultInstance()) {
            this.poll_ = passkeyRedirectComplete;
        } else {
            this.poll_ = PasskeyRedirectComplete.newBuilder((PasskeyRedirectComplete) this.poll_).mergeFrom((PasskeyRedirectComplete.C6205a) passkeyRedirectComplete).buildPartial();
        }
        this.pollCase_ = 4;
    }

    public static C6206a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Workflow$LinkWorkflowPollRequest parseDelimitedFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowPollRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowPollRequest parseFrom(ByteBuffer byteBuffer) {
        return (Workflow$LinkWorkflowPollRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Workflow$LinkWorkflowPollRequest> parser() {
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

    private void setEmbeddedLinkUpdateAvailable(EmbeddedLinkUpdateAvailable embeddedLinkUpdateAvailable) {
        embeddedLinkUpdateAvailable.getClass();
        this.poll_ = embeddedLinkUpdateAvailable;
        this.pollCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOauthRedirectComplete(OAuthRedirectComplete oAuthRedirectComplete) {
        oAuthRedirectComplete.getClass();
        this.poll_ = oAuthRedirectComplete;
        this.pollCase_ = 2;
    }

    private void setPasskeyChallengeGet(PasskeyChallengeGet passkeyChallengeGet) {
        passkeyChallengeGet.getClass();
        this.poll_ = passkeyChallengeGet;
        this.pollCase_ = 7;
    }

    private void setPasskeyRedirectComplete(PasskeyRedirectComplete passkeyRedirectComplete) {
        passkeyRedirectComplete.getClass();
        this.poll_ = passkeyRedirectComplete;
        this.pollCase_ = 4;
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
        switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
            case 1:
                return new Workflow$LinkWorkflowPollRequest();
            case 2:
                return new C6206a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0004<\u0000\u0005<\u0000\u0006Ȉ\u0007<\u0000", new Object[]{"poll_", "pollCase_", "workflowSessionId_", OAuthRedirectComplete.class, PasskeyRedirectComplete.class, EmbeddedLinkUpdateAvailable.class, "continuationToken_", PasskeyChallengeGet.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Workflow$LinkWorkflowPollRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Workflow$LinkWorkflowPollRequest.class) {
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

    public EmbeddedLinkUpdateAvailable getEmbeddedLinkUpdateAvailable() {
        return this.pollCase_ == 5 ? (EmbeddedLinkUpdateAvailable) this.poll_ : EmbeddedLinkUpdateAvailable.getDefaultInstance();
    }

    public OAuthRedirectComplete getOauthRedirectComplete() {
        return this.pollCase_ == 2 ? (OAuthRedirectComplete) this.poll_ : OAuthRedirectComplete.getDefaultInstance();
    }

    public PasskeyChallengeGet getPasskeyChallengeGet() {
        return this.pollCase_ == 7 ? (PasskeyChallengeGet) this.poll_ : PasskeyChallengeGet.getDefaultInstance();
    }

    public PasskeyRedirectComplete getPasskeyRedirectComplete() {
        return this.pollCase_ == 4 ? (PasskeyRedirectComplete) this.poll_ : PasskeyRedirectComplete.getDefaultInstance();
    }

    public EnumC6207b getPollCase() {
        return EnumC6207b.forNumber(this.pollCase_);
    }

    public String getWorkflowSessionId() {
        return this.workflowSessionId_;
    }

    public ByteString getWorkflowSessionIdBytes() {
        return ByteString.copyFromUtf8(this.workflowSessionId_);
    }

    public boolean hasEmbeddedLinkUpdateAvailable() {
        return this.pollCase_ == 5;
    }

    public boolean hasOauthRedirectComplete() {
        return this.pollCase_ == 2;
    }

    public boolean hasPasskeyChallengeGet() {
        return this.pollCase_ == 7;
    }

    public boolean hasPasskeyRedirectComplete() {
        return this.pollCase_ == 4;
    }

    /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest$a */
    public static final class C6206a extends GeneratedMessageLite.Builder<Workflow$LinkWorkflowPollRequest, C6206a> implements MessageLiteOrBuilder {
        public C6206a() {
            super(Workflow$LinkWorkflowPollRequest.DEFAULT_INSTANCE);
        }

        /* renamed from: a */
        public final C6206a m1420a(String str) {
            copyOnWrite();
            ((Workflow$LinkWorkflowPollRequest) this.instance).setWorkflowSessionId(str);
            return this;
        }

        /* renamed from: a */
        public final C6206a m1419a(OAuthRedirectComplete oAuthRedirectComplete) {
            copyOnWrite();
            ((Workflow$LinkWorkflowPollRequest) this.instance).setOauthRedirectComplete(oAuthRedirectComplete);
            return this;
        }
    }

    public static C6206a newBuilder(Workflow$LinkWorkflowPollRequest workflow$LinkWorkflowPollRequest) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowPollRequest);
    }

    public static Workflow$LinkWorkflowPollRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPollRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPollRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPollRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPollRequest parseFrom(ByteString byteString) {
        return (Workflow$LinkWorkflowPollRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Workflow$LinkWorkflowPollRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPollRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPollRequest parseFrom(byte[] bArr) {
        return (Workflow$LinkWorkflowPollRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Workflow$LinkWorkflowPollRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPollRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPollRequest parseFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowPollRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowPollRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPollRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPollRequest parseFrom(CodedInputStream codedInputStream) {
        return (Workflow$LinkWorkflowPollRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Workflow$LinkWorkflowPollRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPollRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
