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
public final class SilentNetworkAuth$LinkSNATwilioFinishRequest extends GeneratedMessageLite<SilentNetworkAuth$LinkSNATwilioFinishRequest, C6186a> implements MessageLiteOrBuilder {
    private static final SilentNetworkAuth$LinkSNATwilioFinishRequest DEFAULT_INSTANCE;
    private static volatile Parser<SilentNetworkAuth$LinkSNATwilioFinishRequest> PARSER = null;
    public static final int VERIFICATION_ID_FIELD_NUMBER = 1;
    private String verificationId_ = "";

    /* renamed from: com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest$a */
    public static final class C6186a extends GeneratedMessageLite.Builder<SilentNetworkAuth$LinkSNATwilioFinishRequest, C6186a> implements MessageLiteOrBuilder {
        public C6186a() {
            super(SilentNetworkAuth$LinkSNATwilioFinishRequest.DEFAULT_INSTANCE);
        }

        /* renamed from: a */
        public final C6186a m1410a(String str) {
            copyOnWrite();
            ((SilentNetworkAuth$LinkSNATwilioFinishRequest) this.instance).setVerificationId(str);
            return this;
        }
    }

    static {
        SilentNetworkAuth$LinkSNATwilioFinishRequest silentNetworkAuth$LinkSNATwilioFinishRequest = new SilentNetworkAuth$LinkSNATwilioFinishRequest();
        DEFAULT_INSTANCE = silentNetworkAuth$LinkSNATwilioFinishRequest;
        GeneratedMessageLite.registerDefaultInstance(SilentNetworkAuth$LinkSNATwilioFinishRequest.class, silentNetworkAuth$LinkSNATwilioFinishRequest);
    }

    private SilentNetworkAuth$LinkSNATwilioFinishRequest() {
    }

    private void clearVerificationId() {
        this.verificationId_ = getDefaultInstance().getVerificationId();
    }

    public static SilentNetworkAuth$LinkSNATwilioFinishRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6186a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SilentNetworkAuth$LinkSNATwilioFinishRequest parseDelimitedFrom(InputStream inputStream) {
        return (SilentNetworkAuth$LinkSNATwilioFinishRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SilentNetworkAuth$LinkSNATwilioFinishRequest parseFrom(ByteBuffer byteBuffer) {
        return (SilentNetworkAuth$LinkSNATwilioFinishRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SilentNetworkAuth$LinkSNATwilioFinishRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerificationId(String str) {
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
                return new SilentNetworkAuth$LinkSNATwilioFinishRequest();
            case 2:
                return new C6186a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"verificationId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SilentNetworkAuth$LinkSNATwilioFinishRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (SilentNetworkAuth$LinkSNATwilioFinishRequest.class) {
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

    public String getVerificationId() {
        return this.verificationId_;
    }

    public ByteString getVerificationIdBytes() {
        return ByteString.copyFromUtf8(this.verificationId_);
    }

    public static C6186a newBuilder(SilentNetworkAuth$LinkSNATwilioFinishRequest silentNetworkAuth$LinkSNATwilioFinishRequest) {
        return DEFAULT_INSTANCE.createBuilder(silentNetworkAuth$LinkSNATwilioFinishRequest);
    }

    public static SilentNetworkAuth$LinkSNATwilioFinishRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNATwilioFinishRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNATwilioFinishRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNATwilioFinishRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNATwilioFinishRequest parseFrom(ByteString byteString) {
        return (SilentNetworkAuth$LinkSNATwilioFinishRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SilentNetworkAuth$LinkSNATwilioFinishRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNATwilioFinishRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNATwilioFinishRequest parseFrom(byte[] bArr) {
        return (SilentNetworkAuth$LinkSNATwilioFinishRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SilentNetworkAuth$LinkSNATwilioFinishRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNATwilioFinishRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNATwilioFinishRequest parseFrom(InputStream inputStream) {
        return (SilentNetworkAuth$LinkSNATwilioFinishRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SilentNetworkAuth$LinkSNATwilioFinishRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNATwilioFinishRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNATwilioFinishRequest parseFrom(CodedInputStream codedInputStream) {
        return (SilentNetworkAuth$LinkSNATwilioFinishRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SilentNetworkAuth$LinkSNATwilioFinishRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNATwilioFinishRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
