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
public final class SilentNetworkAuth$LinkSNAProveStartRequest extends GeneratedMessageLite<SilentNetworkAuth$LinkSNAProveStartRequest, C6184a> implements MessageLiteOrBuilder {
    public static final int CELLULAR_DEVICE_IP_FIELD_NUMBER = 2;
    private static final SilentNetworkAuth$LinkSNAProveStartRequest DEFAULT_INSTANCE;
    private static volatile Parser<SilentNetworkAuth$LinkSNAProveStartRequest> PARSER = null;
    public static final int VERIFICATION_ID_FIELD_NUMBER = 1;
    private String verificationId_ = "";
    private String cellularDeviceIp_ = "";

    /* renamed from: com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest$a */
    public static final class C6184a extends GeneratedMessageLite.Builder<SilentNetworkAuth$LinkSNAProveStartRequest, C6184a> implements MessageLiteOrBuilder {
        public C6184a() {
            super(SilentNetworkAuth$LinkSNAProveStartRequest.DEFAULT_INSTANCE);
        }

        /* renamed from: a */
        public final C6184a m1408a(String str) {
            copyOnWrite();
            ((SilentNetworkAuth$LinkSNAProveStartRequest) this.instance).setCellularDeviceIp(str);
            return this;
        }

        /* renamed from: b */
        public final C6184a m1409b(String str) {
            copyOnWrite();
            ((SilentNetworkAuth$LinkSNAProveStartRequest) this.instance).setVerificationId(str);
            return this;
        }
    }

    static {
        SilentNetworkAuth$LinkSNAProveStartRequest silentNetworkAuth$LinkSNAProveStartRequest = new SilentNetworkAuth$LinkSNAProveStartRequest();
        DEFAULT_INSTANCE = silentNetworkAuth$LinkSNAProveStartRequest;
        GeneratedMessageLite.registerDefaultInstance(SilentNetworkAuth$LinkSNAProveStartRequest.class, silentNetworkAuth$LinkSNAProveStartRequest);
    }

    private SilentNetworkAuth$LinkSNAProveStartRequest() {
    }

    private void clearCellularDeviceIp() {
        this.cellularDeviceIp_ = getDefaultInstance().getCellularDeviceIp();
    }

    private void clearVerificationId() {
        this.verificationId_ = getDefaultInstance().getVerificationId();
    }

    public static SilentNetworkAuth$LinkSNAProveStartRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6184a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SilentNetworkAuth$LinkSNAProveStartRequest parseDelimitedFrom(InputStream inputStream) {
        return (SilentNetworkAuth$LinkSNAProveStartRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SilentNetworkAuth$LinkSNAProveStartRequest parseFrom(ByteBuffer byteBuffer) {
        return (SilentNetworkAuth$LinkSNAProveStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SilentNetworkAuth$LinkSNAProveStartRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCellularDeviceIp(String str) {
        str.getClass();
        this.cellularDeviceIp_ = str;
    }

    private void setCellularDeviceIpBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cellularDeviceIp_ = byteString.toStringUtf8();
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
                return new SilentNetworkAuth$LinkSNAProveStartRequest();
            case 2:
                return new C6184a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"verificationId_", "cellularDeviceIp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SilentNetworkAuth$LinkSNAProveStartRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (SilentNetworkAuth$LinkSNAProveStartRequest.class) {
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

    public String getCellularDeviceIp() {
        return this.cellularDeviceIp_;
    }

    public ByteString getCellularDeviceIpBytes() {
        return ByteString.copyFromUtf8(this.cellularDeviceIp_);
    }

    public String getVerificationId() {
        return this.verificationId_;
    }

    public ByteString getVerificationIdBytes() {
        return ByteString.copyFromUtf8(this.verificationId_);
    }

    public static C6184a newBuilder(SilentNetworkAuth$LinkSNAProveStartRequest silentNetworkAuth$LinkSNAProveStartRequest) {
        return DEFAULT_INSTANCE.createBuilder(silentNetworkAuth$LinkSNAProveStartRequest);
    }

    public static SilentNetworkAuth$LinkSNAProveStartRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNAProveStartRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNAProveStartRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNAProveStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNAProveStartRequest parseFrom(ByteString byteString) {
        return (SilentNetworkAuth$LinkSNAProveStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SilentNetworkAuth$LinkSNAProveStartRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNAProveStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNAProveStartRequest parseFrom(byte[] bArr) {
        return (SilentNetworkAuth$LinkSNAProveStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SilentNetworkAuth$LinkSNAProveStartRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNAProveStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNAProveStartRequest parseFrom(InputStream inputStream) {
        return (SilentNetworkAuth$LinkSNAProveStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SilentNetworkAuth$LinkSNAProveStartRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNAProveStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNAProveStartRequest parseFrom(CodedInputStream codedInputStream) {
        return (SilentNetworkAuth$LinkSNAProveStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SilentNetworkAuth$LinkSNAProveStartRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNAProveStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
