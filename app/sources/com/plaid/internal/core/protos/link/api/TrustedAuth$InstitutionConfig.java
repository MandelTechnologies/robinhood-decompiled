package com.plaid.internal.core.protos.link.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class TrustedAuth$InstitutionConfig extends GeneratedMessageLite<TrustedAuth$InstitutionConfig, C6189a> implements MessageLiteOrBuilder {
    private static final TrustedAuth$InstitutionConfig DEFAULT_INSTANCE;
    public static final int INSTITUTION_ID_FIELD_NUMBER = 1;
    private static volatile Parser<TrustedAuth$InstitutionConfig> PARSER = null;
    public static final int PASSWORD_LABEL_FIELD_NUMBER = 6;
    public static final int RENDERED_INSTITUTION_FIELD_NUMBER = 8;
    public static final int RESET_PASSWORD_BUTTON_URL_FIELD_NUMBER = 7;
    public static final int USERNAME_LABEL_FIELD_NUMBER = 5;
    private int bitField0_;
    private Common$RenderedInstitution renderedInstitution_;
    private String institutionId_ = "";
    private String usernameLabel_ = "";
    private String passwordLabel_ = "";
    private String resetPasswordButtonUrl_ = "";

    /* renamed from: com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig$a */
    public static final class C6189a extends GeneratedMessageLite.Builder<TrustedAuth$InstitutionConfig, C6189a> implements MessageLiteOrBuilder {
        public C6189a() {
            super(TrustedAuth$InstitutionConfig.DEFAULT_INSTANCE);
        }
    }

    static {
        TrustedAuth$InstitutionConfig trustedAuth$InstitutionConfig = new TrustedAuth$InstitutionConfig();
        DEFAULT_INSTANCE = trustedAuth$InstitutionConfig;
        GeneratedMessageLite.registerDefaultInstance(TrustedAuth$InstitutionConfig.class, trustedAuth$InstitutionConfig);
    }

    private TrustedAuth$InstitutionConfig() {
    }

    private void clearInstitutionId() {
        this.institutionId_ = getDefaultInstance().getInstitutionId();
    }

    private void clearPasswordLabel() {
        this.passwordLabel_ = getDefaultInstance().getPasswordLabel();
    }

    private void clearRenderedInstitution() {
        this.renderedInstitution_ = null;
        this.bitField0_ &= -2;
    }

    private void clearResetPasswordButtonUrl() {
        this.resetPasswordButtonUrl_ = getDefaultInstance().getResetPasswordButtonUrl();
    }

    private void clearUsernameLabel() {
        this.usernameLabel_ = getDefaultInstance().getUsernameLabel();
    }

    public static TrustedAuth$InstitutionConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeRenderedInstitution(Common$RenderedInstitution common$RenderedInstitution) {
        common$RenderedInstitution.getClass();
        Common$RenderedInstitution common$RenderedInstitution2 = this.renderedInstitution_;
        if (common$RenderedInstitution2 == null || common$RenderedInstitution2 == Common$RenderedInstitution.getDefaultInstance()) {
            this.renderedInstitution_ = common$RenderedInstitution;
        } else {
            this.renderedInstitution_ = Common$RenderedInstitution.newBuilder(this.renderedInstitution_).mergeFrom((Common$RenderedInstitution.C6476a) common$RenderedInstitution).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C6189a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TrustedAuth$InstitutionConfig parseDelimitedFrom(InputStream inputStream) {
        return (TrustedAuth$InstitutionConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrustedAuth$InstitutionConfig parseFrom(ByteBuffer byteBuffer) {
        return (TrustedAuth$InstitutionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TrustedAuth$InstitutionConfig> parser() {
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

    private void setPasswordLabel(String str) {
        str.getClass();
        this.passwordLabel_ = str;
    }

    private void setPasswordLabelBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.passwordLabel_ = byteString.toStringUtf8();
    }

    private void setRenderedInstitution(Common$RenderedInstitution common$RenderedInstitution) {
        common$RenderedInstitution.getClass();
        this.renderedInstitution_ = common$RenderedInstitution;
        this.bitField0_ |= 1;
    }

    private void setResetPasswordButtonUrl(String str) {
        str.getClass();
        this.resetPasswordButtonUrl_ = str;
    }

    private void setResetPasswordButtonUrlBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.resetPasswordButtonUrl_ = byteString.toStringUtf8();
    }

    private void setUsernameLabel(String str) {
        str.getClass();
        this.usernameLabel_ = str;
    }

    private void setUsernameLabelBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.usernameLabel_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6259e.f2146a[methodToInvoke.ordinal()]) {
            case 1:
                return new TrustedAuth$InstitutionConfig();
            case 2:
                return new C6189a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bဉ\u0000", new Object[]{"bitField0_", "institutionId_", "usernameLabel_", "passwordLabel_", "resetPasswordButtonUrl_", "renderedInstitution_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TrustedAuth$InstitutionConfig> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (TrustedAuth$InstitutionConfig.class) {
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

    public String getPasswordLabel() {
        return this.passwordLabel_;
    }

    public ByteString getPasswordLabelBytes() {
        return ByteString.copyFromUtf8(this.passwordLabel_);
    }

    public Common$RenderedInstitution getRenderedInstitution() {
        Common$RenderedInstitution common$RenderedInstitution = this.renderedInstitution_;
        return common$RenderedInstitution == null ? Common$RenderedInstitution.getDefaultInstance() : common$RenderedInstitution;
    }

    public String getResetPasswordButtonUrl() {
        return this.resetPasswordButtonUrl_;
    }

    public ByteString getResetPasswordButtonUrlBytes() {
        return ByteString.copyFromUtf8(this.resetPasswordButtonUrl_);
    }

    public String getUsernameLabel() {
        return this.usernameLabel_;
    }

    public ByteString getUsernameLabelBytes() {
        return ByteString.copyFromUtf8(this.usernameLabel_);
    }

    public boolean hasRenderedInstitution() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6189a newBuilder(TrustedAuth$InstitutionConfig trustedAuth$InstitutionConfig) {
        return DEFAULT_INSTANCE.createBuilder(trustedAuth$InstitutionConfig);
    }

    public static TrustedAuth$InstitutionConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TrustedAuth$InstitutionConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TrustedAuth$InstitutionConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (TrustedAuth$InstitutionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TrustedAuth$InstitutionConfig parseFrom(ByteString byteString) {
        return (TrustedAuth$InstitutionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TrustedAuth$InstitutionConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TrustedAuth$InstitutionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TrustedAuth$InstitutionConfig parseFrom(byte[] bArr) {
        return (TrustedAuth$InstitutionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TrustedAuth$InstitutionConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TrustedAuth$InstitutionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TrustedAuth$InstitutionConfig parseFrom(InputStream inputStream) {
        return (TrustedAuth$InstitutionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrustedAuth$InstitutionConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TrustedAuth$InstitutionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TrustedAuth$InstitutionConfig parseFrom(CodedInputStream codedInputStream) {
        return (TrustedAuth$InstitutionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TrustedAuth$InstitutionConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TrustedAuth$InstitutionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
