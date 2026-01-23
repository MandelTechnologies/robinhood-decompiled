package com.plaid.internal.core.protos.webauthn;

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
public final class Webauthn$PublicKeyCredential extends GeneratedMessageLite<Webauthn$PublicKeyCredential, C7044a> implements MessageLiteOrBuilder {
    public static final int ASSERTION_RESPONSE_FIELD_NUMBER = 4;
    public static final int ATTESTATION_RESPONSE_FIELD_NUMBER = 3;
    public static final int AUTHENTICATOR_ATTACHMENT_FIELD_NUMBER = 6;
    private static final Webauthn$PublicKeyCredential DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<Webauthn$PublicKeyCredential> PARSER = null;
    public static final int RAW_ID_FIELD_NUMBER = 2;
    public static final int TRANSPORTS_FIELD_NUMBER = 7;
    public static final int TYPE_FIELD_NUMBER = 5;
    private Object response_;
    private int responseCase_ = 0;
    private String id_ = "";
    private ByteString rawId_ = ByteString.EMPTY;
    private String type_ = "";
    private String authenticatorAttachment_ = "";
    private Internal.ProtobufList<String> transports_ = GeneratedMessageLite.emptyProtobufList();

    public static final class AuthenticatorAssertionResponse extends GeneratedMessageLite<AuthenticatorAssertionResponse, C7042a> implements MessageLiteOrBuilder {
        public static final int AUTHENTICATOR_DATA_FIELD_NUMBER = 1;
        public static final int CLIENT_DATA_JSON_FIELD_NUMBER = 2;
        private static final AuthenticatorAssertionResponse DEFAULT_INSTANCE;
        private static volatile Parser<AuthenticatorAssertionResponse> PARSER = null;
        public static final int SIGNATURE_FIELD_NUMBER = 3;
        public static final int USER_HANDLE_FIELD_NUMBER = 4;
        private ByteString authenticatorData_;
        private ByteString clientDataJson_;
        private ByteString signature_;
        private ByteString userHandle_;

        /* renamed from: com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential$AuthenticatorAssertionResponse$a */
        public static final class C7042a extends GeneratedMessageLite.Builder<AuthenticatorAssertionResponse, C7042a> implements MessageLiteOrBuilder {
            public C7042a() {
                super(AuthenticatorAssertionResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            AuthenticatorAssertionResponse authenticatorAssertionResponse = new AuthenticatorAssertionResponse();
            DEFAULT_INSTANCE = authenticatorAssertionResponse;
            GeneratedMessageLite.registerDefaultInstance(AuthenticatorAssertionResponse.class, authenticatorAssertionResponse);
        }

        private AuthenticatorAssertionResponse() {
            ByteString byteString = ByteString.EMPTY;
            this.authenticatorData_ = byteString;
            this.clientDataJson_ = byteString;
            this.signature_ = byteString;
            this.userHandle_ = byteString;
        }

        private void clearAuthenticatorData() {
            this.authenticatorData_ = getDefaultInstance().getAuthenticatorData();
        }

        private void clearClientDataJson() {
            this.clientDataJson_ = getDefaultInstance().getClientDataJson();
        }

        private void clearSignature() {
            this.signature_ = getDefaultInstance().getSignature();
        }

        private void clearUserHandle() {
            this.userHandle_ = getDefaultInstance().getUserHandle();
        }

        public static AuthenticatorAssertionResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C7042a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AuthenticatorAssertionResponse parseDelimitedFrom(InputStream inputStream) {
            return (AuthenticatorAssertionResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AuthenticatorAssertionResponse parseFrom(ByteBuffer byteBuffer) {
            return (AuthenticatorAssertionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AuthenticatorAssertionResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAuthenticatorData(ByteString byteString) {
            byteString.getClass();
            this.authenticatorData_ = byteString;
        }

        private void setClientDataJson(ByteString byteString) {
            byteString.getClass();
            this.clientDataJson_ = byteString;
        }

        private void setSignature(ByteString byteString) {
            byteString.getClass();
            this.signature_ = byteString;
        }

        private void setUserHandle(ByteString byteString) {
            byteString.getClass();
            this.userHandle_ = byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C7050a.f2710a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AuthenticatorAssertionResponse();
                case 2:
                    return new C7042a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n\u0004\n", new Object[]{"authenticatorData_", "clientDataJson_", "signature_", "userHandle_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AuthenticatorAssertionResponse> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (AuthenticatorAssertionResponse.class) {
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

        public ByteString getAuthenticatorData() {
            return this.authenticatorData_;
        }

        public ByteString getClientDataJson() {
            return this.clientDataJson_;
        }

        public ByteString getSignature() {
            return this.signature_;
        }

        public ByteString getUserHandle() {
            return this.userHandle_;
        }

        public static C7042a newBuilder(AuthenticatorAssertionResponse authenticatorAssertionResponse) {
            return DEFAULT_INSTANCE.createBuilder(authenticatorAssertionResponse);
        }

        public static AuthenticatorAssertionResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AuthenticatorAssertionResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AuthenticatorAssertionResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (AuthenticatorAssertionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AuthenticatorAssertionResponse parseFrom(ByteString byteString) {
            return (AuthenticatorAssertionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AuthenticatorAssertionResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (AuthenticatorAssertionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AuthenticatorAssertionResponse parseFrom(byte[] bArr) {
            return (AuthenticatorAssertionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AuthenticatorAssertionResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (AuthenticatorAssertionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AuthenticatorAssertionResponse parseFrom(InputStream inputStream) {
            return (AuthenticatorAssertionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AuthenticatorAssertionResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AuthenticatorAssertionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AuthenticatorAssertionResponse parseFrom(CodedInputStream codedInputStream) {
            return (AuthenticatorAssertionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AuthenticatorAssertionResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AuthenticatorAssertionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AuthenticatorAttestationResponse extends GeneratedMessageLite<AuthenticatorAttestationResponse, C7043a> implements MessageLiteOrBuilder {
        public static final int ATTESTATION_OBJECT_FIELD_NUMBER = 1;
        public static final int CLIENT_DATA_JSON_FIELD_NUMBER = 2;
        private static final AuthenticatorAttestationResponse DEFAULT_INSTANCE;
        private static volatile Parser<AuthenticatorAttestationResponse> PARSER;
        private ByteString attestationObject_;
        private ByteString clientDataJson_;

        /* renamed from: com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential$AuthenticatorAttestationResponse$a */
        public static final class C7043a extends GeneratedMessageLite.Builder<AuthenticatorAttestationResponse, C7043a> implements MessageLiteOrBuilder {
            public C7043a() {
                super(AuthenticatorAttestationResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            AuthenticatorAttestationResponse authenticatorAttestationResponse = new AuthenticatorAttestationResponse();
            DEFAULT_INSTANCE = authenticatorAttestationResponse;
            GeneratedMessageLite.registerDefaultInstance(AuthenticatorAttestationResponse.class, authenticatorAttestationResponse);
        }

        private AuthenticatorAttestationResponse() {
            ByteString byteString = ByteString.EMPTY;
            this.attestationObject_ = byteString;
            this.clientDataJson_ = byteString;
        }

        private void clearAttestationObject() {
            this.attestationObject_ = getDefaultInstance().getAttestationObject();
        }

        private void clearClientDataJson() {
            this.clientDataJson_ = getDefaultInstance().getClientDataJson();
        }

        public static AuthenticatorAttestationResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C7043a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AuthenticatorAttestationResponse parseDelimitedFrom(InputStream inputStream) {
            return (AuthenticatorAttestationResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AuthenticatorAttestationResponse parseFrom(ByteBuffer byteBuffer) {
            return (AuthenticatorAttestationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AuthenticatorAttestationResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAttestationObject(ByteString byteString) {
            byteString.getClass();
            this.attestationObject_ = byteString;
        }

        private void setClientDataJson(ByteString byteString) {
            byteString.getClass();
            this.clientDataJson_ = byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C7050a.f2710a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AuthenticatorAttestationResponse();
                case 2:
                    return new C7043a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"attestationObject_", "clientDataJson_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AuthenticatorAttestationResponse> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (AuthenticatorAttestationResponse.class) {
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

        public ByteString getAttestationObject() {
            return this.attestationObject_;
        }

        public ByteString getClientDataJson() {
            return this.clientDataJson_;
        }

        public static C7043a newBuilder(AuthenticatorAttestationResponse authenticatorAttestationResponse) {
            return DEFAULT_INSTANCE.createBuilder(authenticatorAttestationResponse);
        }

        public static AuthenticatorAttestationResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AuthenticatorAttestationResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AuthenticatorAttestationResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (AuthenticatorAttestationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AuthenticatorAttestationResponse parseFrom(ByteString byteString) {
            return (AuthenticatorAttestationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AuthenticatorAttestationResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (AuthenticatorAttestationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AuthenticatorAttestationResponse parseFrom(byte[] bArr) {
            return (AuthenticatorAttestationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AuthenticatorAttestationResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (AuthenticatorAttestationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AuthenticatorAttestationResponse parseFrom(InputStream inputStream) {
            return (AuthenticatorAttestationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AuthenticatorAttestationResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AuthenticatorAttestationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AuthenticatorAttestationResponse parseFrom(CodedInputStream codedInputStream) {
            return (AuthenticatorAttestationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AuthenticatorAttestationResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AuthenticatorAttestationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential$a */
    public static final class C7044a extends GeneratedMessageLite.Builder<Webauthn$PublicKeyCredential, C7044a> implements MessageLiteOrBuilder {
        public C7044a() {
            super(Webauthn$PublicKeyCredential.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.webauthn.Webauthn$PublicKeyCredential$b */
    public enum EnumC7045b {
        ATTESTATION_RESPONSE(3),
        ASSERTION_RESPONSE(4),
        RESPONSE_NOT_SET(0);


        /* renamed from: a */
        public final int f2707a;

        EnumC7045b(int i) {
            this.f2707a = i;
        }

        public static EnumC7045b forNumber(int i) {
            if (i == 0) {
                return RESPONSE_NOT_SET;
            }
            if (i == 3) {
                return ATTESTATION_RESPONSE;
            }
            if (i != 4) {
                return null;
            }
            return ASSERTION_RESPONSE;
        }

        public int getNumber() {
            return this.f2707a;
        }

        @Deprecated
        public static EnumC7045b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Webauthn$PublicKeyCredential webauthn$PublicKeyCredential = new Webauthn$PublicKeyCredential();
        DEFAULT_INSTANCE = webauthn$PublicKeyCredential;
        GeneratedMessageLite.registerDefaultInstance(Webauthn$PublicKeyCredential.class, webauthn$PublicKeyCredential);
    }

    private Webauthn$PublicKeyCredential() {
    }

    private void addAllTransports(Iterable<String> iterable) {
        ensureTransportsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.transports_);
    }

    private void addTransports(String str) {
        str.getClass();
        ensureTransportsIsMutable();
        this.transports_.add(str);
    }

    private void addTransportsBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureTransportsIsMutable();
        this.transports_.add(byteString.toStringUtf8());
    }

    private void clearAssertionResponse() {
        if (this.responseCase_ == 4) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    private void clearAttestationResponse() {
        if (this.responseCase_ == 3) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    private void clearAuthenticatorAttachment() {
        this.authenticatorAttachment_ = getDefaultInstance().getAuthenticatorAttachment();
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearRawId() {
        this.rawId_ = getDefaultInstance().getRawId();
    }

    private void clearResponse() {
        this.responseCase_ = 0;
        this.response_ = null;
    }

    private void clearTransports() {
        this.transports_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    private void ensureTransportsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.transports_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.transports_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Webauthn$PublicKeyCredential getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAssertionResponse(AuthenticatorAssertionResponse authenticatorAssertionResponse) {
        authenticatorAssertionResponse.getClass();
        if (this.responseCase_ != 4 || this.response_ == AuthenticatorAssertionResponse.getDefaultInstance()) {
            this.response_ = authenticatorAssertionResponse;
        } else {
            this.response_ = AuthenticatorAssertionResponse.newBuilder((AuthenticatorAssertionResponse) this.response_).mergeFrom((AuthenticatorAssertionResponse.C7042a) authenticatorAssertionResponse).buildPartial();
        }
        this.responseCase_ = 4;
    }

    private void mergeAttestationResponse(AuthenticatorAttestationResponse authenticatorAttestationResponse) {
        authenticatorAttestationResponse.getClass();
        if (this.responseCase_ != 3 || this.response_ == AuthenticatorAttestationResponse.getDefaultInstance()) {
            this.response_ = authenticatorAttestationResponse;
        } else {
            this.response_ = AuthenticatorAttestationResponse.newBuilder((AuthenticatorAttestationResponse) this.response_).mergeFrom((AuthenticatorAttestationResponse.C7043a) authenticatorAttestationResponse).buildPartial();
        }
        this.responseCase_ = 3;
    }

    public static C7044a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Webauthn$PublicKeyCredential parseDelimitedFrom(InputStream inputStream) {
        return (Webauthn$PublicKeyCredential) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Webauthn$PublicKeyCredential parseFrom(ByteBuffer byteBuffer) {
        return (Webauthn$PublicKeyCredential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Webauthn$PublicKeyCredential> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAssertionResponse(AuthenticatorAssertionResponse authenticatorAssertionResponse) {
        authenticatorAssertionResponse.getClass();
        this.response_ = authenticatorAssertionResponse;
        this.responseCase_ = 4;
    }

    private void setAttestationResponse(AuthenticatorAttestationResponse authenticatorAttestationResponse) {
        authenticatorAttestationResponse.getClass();
        this.response_ = authenticatorAttestationResponse;
        this.responseCase_ = 3;
    }

    private void setAuthenticatorAttachment(String str) {
        str.getClass();
        this.authenticatorAttachment_ = str;
    }

    private void setAuthenticatorAttachmentBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.authenticatorAttachment_ = byteString.toStringUtf8();
    }

    private void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    private void setIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setRawId(ByteString byteString) {
        byteString.getClass();
        this.rawId_ = byteString;
    }

    private void setTransports(int i, String str) {
        str.getClass();
        ensureTransportsIsMutable();
        this.transports_.set(i, str);
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
        switch (C7050a.f2710a[methodToInvoke.ordinal()]) {
            case 1:
                return new Webauthn$PublicKeyCredential();
            case 2:
                return new C7044a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002\n\u0003<\u0000\u0004<\u0000\u0005Ȉ\u0006Ȉ\u0007Ț", new Object[]{"response_", "responseCase_", "id_", "rawId_", AuthenticatorAttestationResponse.class, AuthenticatorAssertionResponse.class, "type_", "authenticatorAttachment_", "transports_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Webauthn$PublicKeyCredential> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Webauthn$PublicKeyCredential.class) {
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

    public AuthenticatorAssertionResponse getAssertionResponse() {
        return this.responseCase_ == 4 ? (AuthenticatorAssertionResponse) this.response_ : AuthenticatorAssertionResponse.getDefaultInstance();
    }

    public AuthenticatorAttestationResponse getAttestationResponse() {
        return this.responseCase_ == 3 ? (AuthenticatorAttestationResponse) this.response_ : AuthenticatorAttestationResponse.getDefaultInstance();
    }

    public String getAuthenticatorAttachment() {
        return this.authenticatorAttachment_;
    }

    public ByteString getAuthenticatorAttachmentBytes() {
        return ByteString.copyFromUtf8(this.authenticatorAttachment_);
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public ByteString getRawId() {
        return this.rawId_;
    }

    public EnumC7045b getResponseCase() {
        return EnumC7045b.forNumber(this.responseCase_);
    }

    public String getTransports(int i) {
        return this.transports_.get(i);
    }

    public ByteString getTransportsBytes(int i) {
        return ByteString.copyFromUtf8(this.transports_.get(i));
    }

    public int getTransportsCount() {
        return this.transports_.size();
    }

    public List<String> getTransportsList() {
        return this.transports_;
    }

    public String getType() {
        return this.type_;
    }

    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }

    public boolean hasAssertionResponse() {
        return this.responseCase_ == 4;
    }

    public boolean hasAttestationResponse() {
        return this.responseCase_ == 3;
    }

    public static C7044a newBuilder(Webauthn$PublicKeyCredential webauthn$PublicKeyCredential) {
        return DEFAULT_INSTANCE.createBuilder(webauthn$PublicKeyCredential);
    }

    public static Webauthn$PublicKeyCredential parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Webauthn$PublicKeyCredential) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Webauthn$PublicKeyCredential parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Webauthn$PublicKeyCredential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Webauthn$PublicKeyCredential parseFrom(ByteString byteString) {
        return (Webauthn$PublicKeyCredential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Webauthn$PublicKeyCredential parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Webauthn$PublicKeyCredential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Webauthn$PublicKeyCredential parseFrom(byte[] bArr) {
        return (Webauthn$PublicKeyCredential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Webauthn$PublicKeyCredential parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Webauthn$PublicKeyCredential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Webauthn$PublicKeyCredential parseFrom(InputStream inputStream) {
        return (Webauthn$PublicKeyCredential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Webauthn$PublicKeyCredential parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Webauthn$PublicKeyCredential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Webauthn$PublicKeyCredential parseFrom(CodedInputStream codedInputStream) {
        return (Webauthn$PublicKeyCredential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Webauthn$PublicKeyCredential parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Webauthn$PublicKeyCredential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
