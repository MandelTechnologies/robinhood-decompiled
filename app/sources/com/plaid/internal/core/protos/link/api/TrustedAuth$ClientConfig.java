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
public final class TrustedAuth$ClientConfig extends GeneratedMessageLite<TrustedAuth$ClientConfig, C6188a> implements MessageLiteOrBuilder {
    public static final int CREDENTIAL_PANE_RESET_PASSWORD_COPY_FIELD_NUMBER = 3;
    public static final int CREDENTIAL_PANE_SUBMIT_BUTTON_COPY_FIELD_NUMBER = 1;
    public static final int CREDENTIAL_PANE_TITLE_COPY_FIELD_NUMBER = 2;
    private static final TrustedAuth$ClientConfig DEFAULT_INSTANCE;
    private static volatile Parser<TrustedAuth$ClientConfig> PARSER;
    private String credentialPaneSubmitButtonCopy_ = "";
    private String credentialPaneTitleCopy_ = "";
    private String credentialPaneResetPasswordCopy_ = "";

    /* renamed from: com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig$a */
    public static final class C6188a extends GeneratedMessageLite.Builder<TrustedAuth$ClientConfig, C6188a> implements MessageLiteOrBuilder {
        public C6188a() {
            super(TrustedAuth$ClientConfig.DEFAULT_INSTANCE);
        }
    }

    static {
        TrustedAuth$ClientConfig trustedAuth$ClientConfig = new TrustedAuth$ClientConfig();
        DEFAULT_INSTANCE = trustedAuth$ClientConfig;
        GeneratedMessageLite.registerDefaultInstance(TrustedAuth$ClientConfig.class, trustedAuth$ClientConfig);
    }

    private TrustedAuth$ClientConfig() {
    }

    private void clearCredentialPaneResetPasswordCopy() {
        this.credentialPaneResetPasswordCopy_ = getDefaultInstance().getCredentialPaneResetPasswordCopy();
    }

    private void clearCredentialPaneSubmitButtonCopy() {
        this.credentialPaneSubmitButtonCopy_ = getDefaultInstance().getCredentialPaneSubmitButtonCopy();
    }

    private void clearCredentialPaneTitleCopy() {
        this.credentialPaneTitleCopy_ = getDefaultInstance().getCredentialPaneTitleCopy();
    }

    public static TrustedAuth$ClientConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6188a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TrustedAuth$ClientConfig parseDelimitedFrom(InputStream inputStream) {
        return (TrustedAuth$ClientConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrustedAuth$ClientConfig parseFrom(ByteBuffer byteBuffer) {
        return (TrustedAuth$ClientConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TrustedAuth$ClientConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCredentialPaneResetPasswordCopy(String str) {
        str.getClass();
        this.credentialPaneResetPasswordCopy_ = str;
    }

    private void setCredentialPaneResetPasswordCopyBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.credentialPaneResetPasswordCopy_ = byteString.toStringUtf8();
    }

    private void setCredentialPaneSubmitButtonCopy(String str) {
        str.getClass();
        this.credentialPaneSubmitButtonCopy_ = str;
    }

    private void setCredentialPaneSubmitButtonCopyBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.credentialPaneSubmitButtonCopy_ = byteString.toStringUtf8();
    }

    private void setCredentialPaneTitleCopy(String str) {
        str.getClass();
        this.credentialPaneTitleCopy_ = str;
    }

    private void setCredentialPaneTitleCopyBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.credentialPaneTitleCopy_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6259e.f2146a[methodToInvoke.ordinal()]) {
            case 1:
                return new TrustedAuth$ClientConfig();
            case 2:
                return new C6188a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"credentialPaneSubmitButtonCopy_", "credentialPaneTitleCopy_", "credentialPaneResetPasswordCopy_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TrustedAuth$ClientConfig> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (TrustedAuth$ClientConfig.class) {
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

    public String getCredentialPaneResetPasswordCopy() {
        return this.credentialPaneResetPasswordCopy_;
    }

    public ByteString getCredentialPaneResetPasswordCopyBytes() {
        return ByteString.copyFromUtf8(this.credentialPaneResetPasswordCopy_);
    }

    public String getCredentialPaneSubmitButtonCopy() {
        return this.credentialPaneSubmitButtonCopy_;
    }

    public ByteString getCredentialPaneSubmitButtonCopyBytes() {
        return ByteString.copyFromUtf8(this.credentialPaneSubmitButtonCopy_);
    }

    public String getCredentialPaneTitleCopy() {
        return this.credentialPaneTitleCopy_;
    }

    public ByteString getCredentialPaneTitleCopyBytes() {
        return ByteString.copyFromUtf8(this.credentialPaneTitleCopy_);
    }

    public static C6188a newBuilder(TrustedAuth$ClientConfig trustedAuth$ClientConfig) {
        return DEFAULT_INSTANCE.createBuilder(trustedAuth$ClientConfig);
    }

    public static TrustedAuth$ClientConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TrustedAuth$ClientConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TrustedAuth$ClientConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (TrustedAuth$ClientConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TrustedAuth$ClientConfig parseFrom(ByteString byteString) {
        return (TrustedAuth$ClientConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TrustedAuth$ClientConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TrustedAuth$ClientConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TrustedAuth$ClientConfig parseFrom(byte[] bArr) {
        return (TrustedAuth$ClientConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TrustedAuth$ClientConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TrustedAuth$ClientConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TrustedAuth$ClientConfig parseFrom(InputStream inputStream) {
        return (TrustedAuth$ClientConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrustedAuth$ClientConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TrustedAuth$ClientConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TrustedAuth$ClientConfig parseFrom(CodedInputStream codedInputStream) {
        return (TrustedAuth$ClientConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TrustedAuth$ClientConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TrustedAuth$ClientConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
