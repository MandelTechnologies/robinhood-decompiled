package com.plaid.internal.core.protos.webauthn;

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
public final class Webauthn$WebAuthnOptions extends GeneratedMessageLite<Webauthn$WebAuthnOptions, C7048a> implements MessageLiteOrBuilder {
    public static final int AUTHENTICATE_OPTIONS_FIELD_NUMBER = 2;
    public static final int CREATE_OPTIONS_FIELD_NUMBER = 1;
    private static final Webauthn$WebAuthnOptions DEFAULT_INSTANCE;
    private static volatile Parser<Webauthn$WebAuthnOptions> PARSER;
    private int optionsCase_ = 0;
    private Object options_;

    public static final class AuthenticateOptions extends GeneratedMessageLite<AuthenticateOptions, C7046a> implements MessageLiteOrBuilder {
        public static final int ATTESTATION_FIELD_NUMBER = 2;
        public static final int CHALLENGE_FIELD_NUMBER = 1;
        private static final AuthenticateOptions DEFAULT_INSTANCE;
        private static volatile Parser<AuthenticateOptions> PARSER = null;
        public static final int TIMEOUT_FIELD_NUMBER = 3;
        private int timeout_;
        private String challenge_ = "";
        private String attestation_ = "";

        /* renamed from: com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions$AuthenticateOptions$a */
        public static final class C7046a extends GeneratedMessageLite.Builder<AuthenticateOptions, C7046a> implements MessageLiteOrBuilder {
            public C7046a() {
                super(AuthenticateOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            AuthenticateOptions authenticateOptions = new AuthenticateOptions();
            DEFAULT_INSTANCE = authenticateOptions;
            GeneratedMessageLite.registerDefaultInstance(AuthenticateOptions.class, authenticateOptions);
        }

        private AuthenticateOptions() {
        }

        private void clearAttestation() {
            this.attestation_ = getDefaultInstance().getAttestation();
        }

        private void clearChallenge() {
            this.challenge_ = getDefaultInstance().getChallenge();
        }

        private void clearTimeout() {
            this.timeout_ = 0;
        }

        public static AuthenticateOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C7046a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AuthenticateOptions parseDelimitedFrom(InputStream inputStream) {
            return (AuthenticateOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AuthenticateOptions parseFrom(ByteBuffer byteBuffer) {
            return (AuthenticateOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AuthenticateOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAttestation(String str) {
            str.getClass();
            this.attestation_ = str;
        }

        private void setAttestationBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.attestation_ = byteString.toStringUtf8();
        }

        private void setChallenge(String str) {
            str.getClass();
            this.challenge_ = str;
        }

        private void setChallengeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.challenge_ = byteString.toStringUtf8();
        }

        private void setTimeout(int i) {
            this.timeout_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C7050a.f2710a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AuthenticateOptions();
                case 2:
                    return new C7046a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004", new Object[]{"challenge_", "attestation_", "timeout_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AuthenticateOptions> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (AuthenticateOptions.class) {
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

        public String getAttestation() {
            return this.attestation_;
        }

        public ByteString getAttestationBytes() {
            return ByteString.copyFromUtf8(this.attestation_);
        }

        public String getChallenge() {
            return this.challenge_;
        }

        public ByteString getChallengeBytes() {
            return ByteString.copyFromUtf8(this.challenge_);
        }

        public int getTimeout() {
            return this.timeout_;
        }

        public static C7046a newBuilder(AuthenticateOptions authenticateOptions) {
            return DEFAULT_INSTANCE.createBuilder(authenticateOptions);
        }

        public static AuthenticateOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AuthenticateOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AuthenticateOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (AuthenticateOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AuthenticateOptions parseFrom(ByteString byteString) {
            return (AuthenticateOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AuthenticateOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (AuthenticateOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AuthenticateOptions parseFrom(byte[] bArr) {
            return (AuthenticateOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AuthenticateOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (AuthenticateOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AuthenticateOptions parseFrom(InputStream inputStream) {
            return (AuthenticateOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AuthenticateOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AuthenticateOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AuthenticateOptions parseFrom(CodedInputStream codedInputStream) {
            return (AuthenticateOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AuthenticateOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AuthenticateOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CreateOptions extends GeneratedMessageLite<CreateOptions, C7047a> implements MessageLiteOrBuilder {
        public static final int ATTESTATION_FIELD_NUMBER = 4;
        public static final int AUTHENTICATOR_ATTACHMENT_FIELD_NUMBER = 5;
        public static final int CHALLENGE_FIELD_NUMBER = 1;
        private static final CreateOptions DEFAULT_INSTANCE;
        private static volatile Parser<CreateOptions> PARSER = null;
        public static final int PASSKEY_USER_ID_FIELD_NUMBER = 2;
        public static final int RESIDENT_KEY_FIELD_NUMBER = 6;
        public static final int TIMEOUT_FIELD_NUMBER = 7;
        public static final int USERNAME_FIELD_NUMBER = 3;
        private int timeout_;
        private String challenge_ = "";
        private String passkeyUserId_ = "";
        private String username_ = "";
        private String attestation_ = "";
        private String authenticatorAttachment_ = "";
        private String residentKey_ = "";

        /* renamed from: com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions$CreateOptions$a */
        public static final class C7047a extends GeneratedMessageLite.Builder<CreateOptions, C7047a> implements MessageLiteOrBuilder {
            public C7047a() {
                super(CreateOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            CreateOptions createOptions = new CreateOptions();
            DEFAULT_INSTANCE = createOptions;
            GeneratedMessageLite.registerDefaultInstance(CreateOptions.class, createOptions);
        }

        private CreateOptions() {
        }

        private void clearAttestation() {
            this.attestation_ = getDefaultInstance().getAttestation();
        }

        private void clearAuthenticatorAttachment() {
            this.authenticatorAttachment_ = getDefaultInstance().getAuthenticatorAttachment();
        }

        private void clearChallenge() {
            this.challenge_ = getDefaultInstance().getChallenge();
        }

        private void clearPasskeyUserId() {
            this.passkeyUserId_ = getDefaultInstance().getPasskeyUserId();
        }

        private void clearResidentKey() {
            this.residentKey_ = getDefaultInstance().getResidentKey();
        }

        private void clearTimeout() {
            this.timeout_ = 0;
        }

        private void clearUsername() {
            this.username_ = getDefaultInstance().getUsername();
        }

        public static CreateOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C7047a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CreateOptions parseDelimitedFrom(InputStream inputStream) {
            return (CreateOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CreateOptions parseFrom(ByteBuffer byteBuffer) {
            return (CreateOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CreateOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAttestation(String str) {
            str.getClass();
            this.attestation_ = str;
        }

        private void setAttestationBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.attestation_ = byteString.toStringUtf8();
        }

        private void setAuthenticatorAttachment(String str) {
            str.getClass();
            this.authenticatorAttachment_ = str;
        }

        private void setAuthenticatorAttachmentBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.authenticatorAttachment_ = byteString.toStringUtf8();
        }

        private void setChallenge(String str) {
            str.getClass();
            this.challenge_ = str;
        }

        private void setChallengeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.challenge_ = byteString.toStringUtf8();
        }

        private void setPasskeyUserId(String str) {
            str.getClass();
            this.passkeyUserId_ = str;
        }

        private void setPasskeyUserIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.passkeyUserId_ = byteString.toStringUtf8();
        }

        private void setResidentKey(String str) {
            str.getClass();
            this.residentKey_ = str;
        }

        private void setResidentKeyBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.residentKey_ = byteString.toStringUtf8();
        }

        private void setTimeout(int i) {
            this.timeout_ = i;
        }

        private void setUsername(String str) {
            str.getClass();
            this.username_ = str;
        }

        private void setUsernameBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.username_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C7050a.f2710a[methodToInvoke.ordinal()]) {
                case 1:
                    return new CreateOptions();
                case 2:
                    return new C7047a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\u0004", new Object[]{"challenge_", "passkeyUserId_", "username_", "attestation_", "authenticatorAttachment_", "residentKey_", "timeout_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CreateOptions> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (CreateOptions.class) {
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

        public String getAttestation() {
            return this.attestation_;
        }

        public ByteString getAttestationBytes() {
            return ByteString.copyFromUtf8(this.attestation_);
        }

        public String getAuthenticatorAttachment() {
            return this.authenticatorAttachment_;
        }

        public ByteString getAuthenticatorAttachmentBytes() {
            return ByteString.copyFromUtf8(this.authenticatorAttachment_);
        }

        public String getChallenge() {
            return this.challenge_;
        }

        public ByteString getChallengeBytes() {
            return ByteString.copyFromUtf8(this.challenge_);
        }

        public String getPasskeyUserId() {
            return this.passkeyUserId_;
        }

        public ByteString getPasskeyUserIdBytes() {
            return ByteString.copyFromUtf8(this.passkeyUserId_);
        }

        public String getResidentKey() {
            return this.residentKey_;
        }

        public ByteString getResidentKeyBytes() {
            return ByteString.copyFromUtf8(this.residentKey_);
        }

        public int getTimeout() {
            return this.timeout_;
        }

        public String getUsername() {
            return this.username_;
        }

        public ByteString getUsernameBytes() {
            return ByteString.copyFromUtf8(this.username_);
        }

        public static C7047a newBuilder(CreateOptions createOptions) {
            return DEFAULT_INSTANCE.createBuilder(createOptions);
        }

        public static CreateOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CreateOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CreateOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (CreateOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CreateOptions parseFrom(ByteString byteString) {
            return (CreateOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CreateOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CreateOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CreateOptions parseFrom(byte[] bArr) {
            return (CreateOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CreateOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CreateOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CreateOptions parseFrom(InputStream inputStream) {
            return (CreateOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CreateOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CreateOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CreateOptions parseFrom(CodedInputStream codedInputStream) {
            return (CreateOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CreateOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CreateOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions$a */
    public static final class C7048a extends GeneratedMessageLite.Builder<Webauthn$WebAuthnOptions, C7048a> implements MessageLiteOrBuilder {
        public C7048a() {
            super(Webauthn$WebAuthnOptions.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.webauthn.Webauthn$WebAuthnOptions$b */
    public enum EnumC7049b {
        CREATE_OPTIONS(1),
        AUTHENTICATE_OPTIONS(2),
        OPTIONS_NOT_SET(0);


        /* renamed from: a */
        public final int f2709a;

        EnumC7049b(int i) {
            this.f2709a = i;
        }

        public static EnumC7049b forNumber(int i) {
            if (i == 0) {
                return OPTIONS_NOT_SET;
            }
            if (i == 1) {
                return CREATE_OPTIONS;
            }
            if (i != 2) {
                return null;
            }
            return AUTHENTICATE_OPTIONS;
        }

        public int getNumber() {
            return this.f2709a;
        }

        @Deprecated
        public static EnumC7049b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Webauthn$WebAuthnOptions webauthn$WebAuthnOptions = new Webauthn$WebAuthnOptions();
        DEFAULT_INSTANCE = webauthn$WebAuthnOptions;
        GeneratedMessageLite.registerDefaultInstance(Webauthn$WebAuthnOptions.class, webauthn$WebAuthnOptions);
    }

    private Webauthn$WebAuthnOptions() {
    }

    private void clearAuthenticateOptions() {
        if (this.optionsCase_ == 2) {
            this.optionsCase_ = 0;
            this.options_ = null;
        }
    }

    private void clearCreateOptions() {
        if (this.optionsCase_ == 1) {
            this.optionsCase_ = 0;
            this.options_ = null;
        }
    }

    private void clearOptions() {
        this.optionsCase_ = 0;
        this.options_ = null;
    }

    public static Webauthn$WebAuthnOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAuthenticateOptions(AuthenticateOptions authenticateOptions) {
        authenticateOptions.getClass();
        if (this.optionsCase_ != 2 || this.options_ == AuthenticateOptions.getDefaultInstance()) {
            this.options_ = authenticateOptions;
        } else {
            this.options_ = AuthenticateOptions.newBuilder((AuthenticateOptions) this.options_).mergeFrom((AuthenticateOptions.C7046a) authenticateOptions).buildPartial();
        }
        this.optionsCase_ = 2;
    }

    private void mergeCreateOptions(CreateOptions createOptions) {
        createOptions.getClass();
        if (this.optionsCase_ != 1 || this.options_ == CreateOptions.getDefaultInstance()) {
            this.options_ = createOptions;
        } else {
            this.options_ = CreateOptions.newBuilder((CreateOptions) this.options_).mergeFrom((CreateOptions.C7047a) createOptions).buildPartial();
        }
        this.optionsCase_ = 1;
    }

    public static C7048a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Webauthn$WebAuthnOptions parseDelimitedFrom(InputStream inputStream) {
        return (Webauthn$WebAuthnOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Webauthn$WebAuthnOptions parseFrom(ByteBuffer byteBuffer) {
        return (Webauthn$WebAuthnOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Webauthn$WebAuthnOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAuthenticateOptions(AuthenticateOptions authenticateOptions) {
        authenticateOptions.getClass();
        this.options_ = authenticateOptions;
        this.optionsCase_ = 2;
    }

    private void setCreateOptions(CreateOptions createOptions) {
        createOptions.getClass();
        this.options_ = createOptions;
        this.optionsCase_ = 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7050a.f2710a[methodToInvoke.ordinal()]) {
            case 1:
                return new Webauthn$WebAuthnOptions();
            case 2:
                return new C7048a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"options_", "optionsCase_", CreateOptions.class, AuthenticateOptions.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Webauthn$WebAuthnOptions> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Webauthn$WebAuthnOptions.class) {
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

    public AuthenticateOptions getAuthenticateOptions() {
        return this.optionsCase_ == 2 ? (AuthenticateOptions) this.options_ : AuthenticateOptions.getDefaultInstance();
    }

    public CreateOptions getCreateOptions() {
        return this.optionsCase_ == 1 ? (CreateOptions) this.options_ : CreateOptions.getDefaultInstance();
    }

    public EnumC7049b getOptionsCase() {
        return EnumC7049b.forNumber(this.optionsCase_);
    }

    public boolean hasAuthenticateOptions() {
        return this.optionsCase_ == 2;
    }

    public boolean hasCreateOptions() {
        return this.optionsCase_ == 1;
    }

    public static C7048a newBuilder(Webauthn$WebAuthnOptions webauthn$WebAuthnOptions) {
        return DEFAULT_INSTANCE.createBuilder(webauthn$WebAuthnOptions);
    }

    public static Webauthn$WebAuthnOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Webauthn$WebAuthnOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Webauthn$WebAuthnOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Webauthn$WebAuthnOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Webauthn$WebAuthnOptions parseFrom(ByteString byteString) {
        return (Webauthn$WebAuthnOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Webauthn$WebAuthnOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Webauthn$WebAuthnOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Webauthn$WebAuthnOptions parseFrom(byte[] bArr) {
        return (Webauthn$WebAuthnOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Webauthn$WebAuthnOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Webauthn$WebAuthnOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Webauthn$WebAuthnOptions parseFrom(InputStream inputStream) {
        return (Webauthn$WebAuthnOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Webauthn$WebAuthnOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Webauthn$WebAuthnOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Webauthn$WebAuthnOptions parseFrom(CodedInputStream codedInputStream) {
        return (Webauthn$WebAuthnOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Webauthn$WebAuthnOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Webauthn$WebAuthnOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
