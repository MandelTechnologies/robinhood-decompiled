package com.plaid.internal.core.protos.link.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class Workflow$LinkWorkflowPollResponse extends GeneratedMessageLite<Workflow$LinkWorkflowPollResponse, C6212a> implements MessageLiteOrBuilder {
    private static final Workflow$LinkWorkflowPollResponse DEFAULT_INSTANCE;
    public static final int EMBEDDED_LINK_UPDATE_AVAILABLE_FIELD_NUMBER = 6;
    public static final int OAUTH_REDIRECT_COMPLETE_FIELD_NUMBER = 3;
    private static volatile Parser<Workflow$LinkWorkflowPollResponse> PARSER = null;
    public static final int PASSKEY_CHALLENGE_GET_FIELD_NUMBER = 7;
    public static final int PASSKEY_REDIRECT_COMPLETE_FIELD_NUMBER = 5;
    public static final int REQUEST_ID_FIELD_NUMBER = 2;
    public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 1;
    private Object response_;
    private int responseCase_ = 0;
    private String workflowSessionId_ = "";
    private String requestId_ = "";

    public static final class EmbeddedLinkUpdateAvailable extends GeneratedMessageLite<EmbeddedLinkUpdateAvailable, C6208a> implements MessageLiteOrBuilder {
        private static final EmbeddedLinkUpdateAvailable DEFAULT_INSTANCE;
        private static volatile Parser<EmbeddedLinkUpdateAvailable> PARSER = null;
        public static final int UPDATE_AVAILABLE_FIELD_NUMBER = 1;
        private boolean updateAvailable_;

        /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse$EmbeddedLinkUpdateAvailable$a */
        public static final class C6208a extends GeneratedMessageLite.Builder<EmbeddedLinkUpdateAvailable, C6208a> implements MessageLiteOrBuilder {
            public C6208a() {
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

        private void clearUpdateAvailable() {
            this.updateAvailable_ = false;
        }

        public static EmbeddedLinkUpdateAvailable getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6208a newBuilder() {
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

        private void setUpdateAvailable(boolean z) {
            this.updateAvailable_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                case 1:
                    return new EmbeddedLinkUpdateAvailable();
                case 2:
                    return new C6208a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"updateAvailable_"});
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

        public boolean getUpdateAvailable() {
            return this.updateAvailable_;
        }

        public static C6208a newBuilder(EmbeddedLinkUpdateAvailable embeddedLinkUpdateAvailable) {
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

    public static final class OAuthRedirectComplete extends GeneratedMessageLite<OAuthRedirectComplete, C6209a> implements MessageLiteOrBuilder {
        private static final OAuthRedirectComplete DEFAULT_INSTANCE;
        public static final int IS_COMPLETE_FIELD_NUMBER = 1;
        private static volatile Parser<OAuthRedirectComplete> PARSER;
        private boolean isComplete_;

        /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse$OAuthRedirectComplete$a */
        public static final class C6209a extends GeneratedMessageLite.Builder<OAuthRedirectComplete, C6209a> implements MessageLiteOrBuilder {
            public C6209a() {
                super(OAuthRedirectComplete.DEFAULT_INSTANCE);
            }
        }

        static {
            OAuthRedirectComplete oAuthRedirectComplete = new OAuthRedirectComplete();
            DEFAULT_INSTANCE = oAuthRedirectComplete;
            GeneratedMessageLite.registerDefaultInstance(OAuthRedirectComplete.class, oAuthRedirectComplete);
        }

        private OAuthRedirectComplete() {
        }

        private void clearIsComplete() {
            this.isComplete_ = false;
        }

        public static OAuthRedirectComplete getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6209a newBuilder() {
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

        private void setIsComplete(boolean z) {
            this.isComplete_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                case 1:
                    return new OAuthRedirectComplete();
                case 2:
                    return new C6209a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"isComplete_"});
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

        public boolean getIsComplete() {
            return this.isComplete_;
        }

        public static C6209a newBuilder(OAuthRedirectComplete oAuthRedirectComplete) {
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

    public static final class PasskeyChallengeGet extends GeneratedMessageLite<PasskeyChallengeGet, C6210a> implements MessageLiteOrBuilder {
        public static final int CHALLENGE_FIELD_NUMBER = 1;
        public static final int CREDENTIAL_IDS_FIELD_NUMBER = 2;
        private static final PasskeyChallengeGet DEFAULT_INSTANCE;
        public static final int IS_IN_AUTH_CLAWBACK_FIELD_NUMBER = 3;
        private static volatile Parser<PasskeyChallengeGet> PARSER;
        private String challenge_ = "";
        private Internal.ProtobufList<String> credentialIds_ = GeneratedMessageLite.emptyProtobufList();
        private boolean isInAuthClawback_;

        /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse$PasskeyChallengeGet$a */
        public static final class C6210a extends GeneratedMessageLite.Builder<PasskeyChallengeGet, C6210a> implements MessageLiteOrBuilder {
            public C6210a() {
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

        private void addAllCredentialIds(Iterable<String> iterable) {
            ensureCredentialIdsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.credentialIds_);
        }

        private void addCredentialIds(String str) {
            str.getClass();
            ensureCredentialIdsIsMutable();
            this.credentialIds_.add(str);
        }

        private void addCredentialIdsBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureCredentialIdsIsMutable();
            this.credentialIds_.add(byteString.toStringUtf8());
        }

        private void clearChallenge() {
            this.challenge_ = getDefaultInstance().getChallenge();
        }

        private void clearCredentialIds() {
            this.credentialIds_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearIsInAuthClawback() {
            this.isInAuthClawback_ = false;
        }

        private void ensureCredentialIdsIsMutable() {
            Internal.ProtobufList<String> protobufList = this.credentialIds_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.credentialIds_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static PasskeyChallengeGet getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6210a newBuilder() {
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

        private void setChallenge(String str) {
            str.getClass();
            this.challenge_ = str;
        }

        private void setChallengeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.challenge_ = byteString.toStringUtf8();
        }

        private void setCredentialIds(int i, String str) {
            str.getClass();
            ensureCredentialIdsIsMutable();
            this.credentialIds_.set(i, str);
        }

        private void setIsInAuthClawback(boolean z) {
            this.isInAuthClawback_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                case 1:
                    return new PasskeyChallengeGet();
                case 2:
                    return new C6210a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003\u0007", new Object[]{"challenge_", "credentialIds_", "isInAuthClawback_"});
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

        public String getChallenge() {
            return this.challenge_;
        }

        public ByteString getChallengeBytes() {
            return ByteString.copyFromUtf8(this.challenge_);
        }

        public String getCredentialIds(int i) {
            return this.credentialIds_.get(i);
        }

        public ByteString getCredentialIdsBytes(int i) {
            return ByteString.copyFromUtf8(this.credentialIds_.get(i));
        }

        public int getCredentialIdsCount() {
            return this.credentialIds_.size();
        }

        public List<String> getCredentialIdsList() {
            return this.credentialIds_;
        }

        public boolean getIsInAuthClawback() {
            return this.isInAuthClawback_;
        }

        public static C6210a newBuilder(PasskeyChallengeGet passkeyChallengeGet) {
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

    public static final class PasskeyRedirectComplete extends GeneratedMessageLite<PasskeyRedirectComplete, C6211a> implements MessageLiteOrBuilder {
        private static final PasskeyRedirectComplete DEFAULT_INSTANCE;
        public static final int IS_COMPLETE_FIELD_NUMBER = 1;
        private static volatile Parser<PasskeyRedirectComplete> PARSER;
        private boolean isComplete_;

        /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse$PasskeyRedirectComplete$a */
        public static final class C6211a extends GeneratedMessageLite.Builder<PasskeyRedirectComplete, C6211a> implements MessageLiteOrBuilder {
            public C6211a() {
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

        private void clearIsComplete() {
            this.isComplete_ = false;
        }

        public static PasskeyRedirectComplete getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6211a newBuilder() {
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

        private void setIsComplete(boolean z) {
            this.isComplete_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                case 1:
                    return new PasskeyRedirectComplete();
                case 2:
                    return new C6211a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"isComplete_"});
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

        public boolean getIsComplete() {
            return this.isComplete_;
        }

        public static C6211a newBuilder(PasskeyRedirectComplete passkeyRedirectComplete) {
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

    /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse$a */
    public static final class C6212a extends GeneratedMessageLite.Builder<Workflow$LinkWorkflowPollResponse, C6212a> implements MessageLiteOrBuilder {
        public C6212a() {
            super(Workflow$LinkWorkflowPollResponse.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse$b */
    public enum EnumC6213b {
        OAUTH_REDIRECT_COMPLETE(3),
        PASSKEY_REDIRECT_COMPLETE(5),
        EMBEDDED_LINK_UPDATE_AVAILABLE(6),
        PASSKEY_CHALLENGE_GET(7),
        RESPONSE_NOT_SET(0);


        /* renamed from: a */
        public final int f2115a;

        EnumC6213b(int i) {
            this.f2115a = i;
        }

        public static EnumC6213b forNumber(int i) {
            if (i == 0) {
                return RESPONSE_NOT_SET;
            }
            if (i == 3) {
                return OAUTH_REDIRECT_COMPLETE;
            }
            if (i == 5) {
                return PASSKEY_REDIRECT_COMPLETE;
            }
            if (i == 6) {
                return EMBEDDED_LINK_UPDATE_AVAILABLE;
            }
            if (i != 7) {
                return null;
            }
            return PASSKEY_CHALLENGE_GET;
        }

        public int getNumber() {
            return this.f2115a;
        }

        @Deprecated
        public static EnumC6213b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Workflow$LinkWorkflowPollResponse workflow$LinkWorkflowPollResponse = new Workflow$LinkWorkflowPollResponse();
        DEFAULT_INSTANCE = workflow$LinkWorkflowPollResponse;
        GeneratedMessageLite.registerDefaultInstance(Workflow$LinkWorkflowPollResponse.class, workflow$LinkWorkflowPollResponse);
    }

    private Workflow$LinkWorkflowPollResponse() {
    }

    private void clearEmbeddedLinkUpdateAvailable() {
        if (this.responseCase_ == 6) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    private void clearOauthRedirectComplete() {
        if (this.responseCase_ == 3) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    private void clearPasskeyChallengeGet() {
        if (this.responseCase_ == 7) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    private void clearPasskeyRedirectComplete() {
        if (this.responseCase_ == 5) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    private void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    private void clearResponse() {
        this.responseCase_ = 0;
        this.response_ = null;
    }

    private void clearWorkflowSessionId() {
        this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
    }

    public static Workflow$LinkWorkflowPollResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeEmbeddedLinkUpdateAvailable(EmbeddedLinkUpdateAvailable embeddedLinkUpdateAvailable) {
        embeddedLinkUpdateAvailable.getClass();
        if (this.responseCase_ != 6 || this.response_ == EmbeddedLinkUpdateAvailable.getDefaultInstance()) {
            this.response_ = embeddedLinkUpdateAvailable;
        } else {
            this.response_ = EmbeddedLinkUpdateAvailable.newBuilder((EmbeddedLinkUpdateAvailable) this.response_).mergeFrom((EmbeddedLinkUpdateAvailable.C6208a) embeddedLinkUpdateAvailable).buildPartial();
        }
        this.responseCase_ = 6;
    }

    private void mergeOauthRedirectComplete(OAuthRedirectComplete oAuthRedirectComplete) {
        oAuthRedirectComplete.getClass();
        if (this.responseCase_ != 3 || this.response_ == OAuthRedirectComplete.getDefaultInstance()) {
            this.response_ = oAuthRedirectComplete;
        } else {
            this.response_ = OAuthRedirectComplete.newBuilder((OAuthRedirectComplete) this.response_).mergeFrom((OAuthRedirectComplete.C6209a) oAuthRedirectComplete).buildPartial();
        }
        this.responseCase_ = 3;
    }

    private void mergePasskeyChallengeGet(PasskeyChallengeGet passkeyChallengeGet) {
        passkeyChallengeGet.getClass();
        if (this.responseCase_ != 7 || this.response_ == PasskeyChallengeGet.getDefaultInstance()) {
            this.response_ = passkeyChallengeGet;
        } else {
            this.response_ = PasskeyChallengeGet.newBuilder((PasskeyChallengeGet) this.response_).mergeFrom((PasskeyChallengeGet.C6210a) passkeyChallengeGet).buildPartial();
        }
        this.responseCase_ = 7;
    }

    private void mergePasskeyRedirectComplete(PasskeyRedirectComplete passkeyRedirectComplete) {
        passkeyRedirectComplete.getClass();
        if (this.responseCase_ != 5 || this.response_ == PasskeyRedirectComplete.getDefaultInstance()) {
            this.response_ = passkeyRedirectComplete;
        } else {
            this.response_ = PasskeyRedirectComplete.newBuilder((PasskeyRedirectComplete) this.response_).mergeFrom((PasskeyRedirectComplete.C6211a) passkeyRedirectComplete).buildPartial();
        }
        this.responseCase_ = 5;
    }

    public static C6212a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Workflow$LinkWorkflowPollResponse parseDelimitedFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowPollResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowPollResponse parseFrom(ByteBuffer byteBuffer) {
        return (Workflow$LinkWorkflowPollResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Workflow$LinkWorkflowPollResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setEmbeddedLinkUpdateAvailable(EmbeddedLinkUpdateAvailable embeddedLinkUpdateAvailable) {
        embeddedLinkUpdateAvailable.getClass();
        this.response_ = embeddedLinkUpdateAvailable;
        this.responseCase_ = 6;
    }

    private void setOauthRedirectComplete(OAuthRedirectComplete oAuthRedirectComplete) {
        oAuthRedirectComplete.getClass();
        this.response_ = oAuthRedirectComplete;
        this.responseCase_ = 3;
    }

    private void setPasskeyChallengeGet(PasskeyChallengeGet passkeyChallengeGet) {
        passkeyChallengeGet.getClass();
        this.response_ = passkeyChallengeGet;
        this.responseCase_ = 7;
    }

    private void setPasskeyRedirectComplete(PasskeyRedirectComplete passkeyRedirectComplete) {
        passkeyRedirectComplete.getClass();
        this.response_ = passkeyRedirectComplete;
        this.responseCase_ = 5;
    }

    private void setRequestId(String str) {
        str.getClass();
        this.requestId_ = str;
    }

    private void setRequestIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.requestId_ = byteString.toStringUtf8();
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
                return new Workflow$LinkWorkflowPollResponse();
            case 2:
                return new C6212a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"response_", "responseCase_", "workflowSessionId_", "requestId_", OAuthRedirectComplete.class, PasskeyRedirectComplete.class, EmbeddedLinkUpdateAvailable.class, PasskeyChallengeGet.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Workflow$LinkWorkflowPollResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Workflow$LinkWorkflowPollResponse.class) {
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

    public EmbeddedLinkUpdateAvailable getEmbeddedLinkUpdateAvailable() {
        return this.responseCase_ == 6 ? (EmbeddedLinkUpdateAvailable) this.response_ : EmbeddedLinkUpdateAvailable.getDefaultInstance();
    }

    public OAuthRedirectComplete getOauthRedirectComplete() {
        return this.responseCase_ == 3 ? (OAuthRedirectComplete) this.response_ : OAuthRedirectComplete.getDefaultInstance();
    }

    public PasskeyChallengeGet getPasskeyChallengeGet() {
        return this.responseCase_ == 7 ? (PasskeyChallengeGet) this.response_ : PasskeyChallengeGet.getDefaultInstance();
    }

    public PasskeyRedirectComplete getPasskeyRedirectComplete() {
        return this.responseCase_ == 5 ? (PasskeyRedirectComplete) this.response_ : PasskeyRedirectComplete.getDefaultInstance();
    }

    public String getRequestId() {
        return this.requestId_;
    }

    public ByteString getRequestIdBytes() {
        return ByteString.copyFromUtf8(this.requestId_);
    }

    public EnumC6213b getResponseCase() {
        return EnumC6213b.forNumber(this.responseCase_);
    }

    public String getWorkflowSessionId() {
        return this.workflowSessionId_;
    }

    public ByteString getWorkflowSessionIdBytes() {
        return ByteString.copyFromUtf8(this.workflowSessionId_);
    }

    public boolean hasEmbeddedLinkUpdateAvailable() {
        return this.responseCase_ == 6;
    }

    public boolean hasOauthRedirectComplete() {
        return this.responseCase_ == 3;
    }

    public boolean hasPasskeyChallengeGet() {
        return this.responseCase_ == 7;
    }

    public boolean hasPasskeyRedirectComplete() {
        return this.responseCase_ == 5;
    }

    public static C6212a newBuilder(Workflow$LinkWorkflowPollResponse workflow$LinkWorkflowPollResponse) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowPollResponse);
    }

    public static Workflow$LinkWorkflowPollResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPollResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPollResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPollResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPollResponse parseFrom(ByteString byteString) {
        return (Workflow$LinkWorkflowPollResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Workflow$LinkWorkflowPollResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPollResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPollResponse parseFrom(byte[] bArr) {
        return (Workflow$LinkWorkflowPollResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Workflow$LinkWorkflowPollResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPollResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPollResponse parseFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowPollResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowPollResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPollResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPollResponse parseFrom(CodedInputStream codedInputStream) {
        return (Workflow$LinkWorkflowPollResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Workflow$LinkWorkflowPollResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPollResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
