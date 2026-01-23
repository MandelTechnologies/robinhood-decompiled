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
public final class SilentNetworkAuth$LinkSNAProveFinishRequest extends GeneratedMessageLite<SilentNetworkAuth$LinkSNAProveFinishRequest, C6182a> implements MessageLiteOrBuilder {
    private static final SilentNetworkAuth$LinkSNAProveFinishRequest DEFAULT_INSTANCE;
    private static volatile Parser<SilentNetworkAuth$LinkSNAProveFinishRequest> PARSER = null;
    public static final int VERIFICATION_FINGERPRINT_FIELD_NUMBER = 2;
    public static final int VERIFICATION_ID_FIELD_NUMBER = 1;
    private String verificationId_ = "";
    private String verificationFingerprint_ = "";

    /* renamed from: com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishRequest$a */
    public static final class C6182a extends GeneratedMessageLite.Builder<SilentNetworkAuth$LinkSNAProveFinishRequest, C6182a> implements MessageLiteOrBuilder {
        public C6182a() {
            super(SilentNetworkAuth$LinkSNAProveFinishRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        SilentNetworkAuth$LinkSNAProveFinishRequest silentNetworkAuth$LinkSNAProveFinishRequest = new SilentNetworkAuth$LinkSNAProveFinishRequest();
        DEFAULT_INSTANCE = silentNetworkAuth$LinkSNAProveFinishRequest;
        GeneratedMessageLite.registerDefaultInstance(SilentNetworkAuth$LinkSNAProveFinishRequest.class, silentNetworkAuth$LinkSNAProveFinishRequest);
    }

    private SilentNetworkAuth$LinkSNAProveFinishRequest() {
    }

    private void clearVerificationFingerprint() {
        this.verificationFingerprint_ = getDefaultInstance().getVerificationFingerprint();
    }

    private void clearVerificationId() {
        this.verificationId_ = getDefaultInstance().getVerificationId();
    }

    public static SilentNetworkAuth$LinkSNAProveFinishRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6182a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SilentNetworkAuth$LinkSNAProveFinishRequest parseDelimitedFrom(InputStream inputStream) {
        return (SilentNetworkAuth$LinkSNAProveFinishRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SilentNetworkAuth$LinkSNAProveFinishRequest parseFrom(ByteBuffer byteBuffer) {
        return (SilentNetworkAuth$LinkSNAProveFinishRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SilentNetworkAuth$LinkSNAProveFinishRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setVerificationFingerprint(String str) {
        str.getClass();
        this.verificationFingerprint_ = str;
    }

    private void setVerificationFingerprintBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.verificationFingerprint_ = byteString.toStringUtf8();
    }

    private void setVerificationId(String str) {
        str.getClass();
        this.verificationId_ = str;
    }

    private void setVerificationIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.verificationId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6258d.f2145a[methodToInvoke.ordinal()]) {
            case 1:
                return new SilentNetworkAuth$LinkSNAProveFinishRequest();
            case 2:
                return new C6182a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"verificationId_", "verificationFingerprint_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SilentNetworkAuth$LinkSNAProveFinishRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (SilentNetworkAuth$LinkSNAProveFinishRequest.class) {
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

    public String getVerificationFingerprint() {
        return this.verificationFingerprint_;
    }

    public ByteString getVerificationFingerprintBytes() {
        return ByteString.copyFromUtf8(this.verificationFingerprint_);
    }

    public String getVerificationId() {
        return this.verificationId_;
    }

    public ByteString getVerificationIdBytes() {
        return ByteString.copyFromUtf8(this.verificationId_);
    }

    public static C6182a newBuilder(SilentNetworkAuth$LinkSNAProveFinishRequest silentNetworkAuth$LinkSNAProveFinishRequest) {
        return DEFAULT_INSTANCE.createBuilder(silentNetworkAuth$LinkSNAProveFinishRequest);
    }

    public static SilentNetworkAuth$LinkSNAProveFinishRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNAProveFinishRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNAProveFinishRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNAProveFinishRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNAProveFinishRequest parseFrom(ByteString byteString) {
        return (SilentNetworkAuth$LinkSNAProveFinishRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SilentNetworkAuth$LinkSNAProveFinishRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNAProveFinishRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNAProveFinishRequest parseFrom(byte[] bArr) {
        return (SilentNetworkAuth$LinkSNAProveFinishRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SilentNetworkAuth$LinkSNAProveFinishRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNAProveFinishRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNAProveFinishRequest parseFrom(InputStream inputStream) {
        return (SilentNetworkAuth$LinkSNAProveFinishRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SilentNetworkAuth$LinkSNAProveFinishRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNAProveFinishRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNAProveFinishRequest parseFrom(CodedInputStream codedInputStream) {
        return (SilentNetworkAuth$LinkSNAProveFinishRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SilentNetworkAuth$LinkSNAProveFinishRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNAProveFinishRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
