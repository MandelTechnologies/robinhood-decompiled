package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class AuthorizationNoticeOuterClass$ClientMeasurement extends GeneratedMessageLite<AuthorizationNoticeOuterClass$ClientMeasurement, C6952a> implements MessageLiteOrBuilder {
    private static final AuthorizationNoticeOuterClass$ClientMeasurement DEFAULT_INSTANCE;
    public static final int DEVICE_METADATA_FIELD_NUMBER = 2;
    private static volatile Parser<AuthorizationNoticeOuterClass$ClientMeasurement> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private Configuration$DeviceMetadata deviceMetadata_;
    private String version_ = "";

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement$a */
    public static final class C6952a extends GeneratedMessageLite.Builder<AuthorizationNoticeOuterClass$ClientMeasurement, C6952a> implements MessageLiteOrBuilder {
        public C6952a() {
            super(AuthorizationNoticeOuterClass$ClientMeasurement.DEFAULT_INSTANCE);
        }
    }

    static {
        AuthorizationNoticeOuterClass$ClientMeasurement authorizationNoticeOuterClass$ClientMeasurement = new AuthorizationNoticeOuterClass$ClientMeasurement();
        DEFAULT_INSTANCE = authorizationNoticeOuterClass$ClientMeasurement;
        GeneratedMessageLite.registerDefaultInstance(AuthorizationNoticeOuterClass$ClientMeasurement.class, authorizationNoticeOuterClass$ClientMeasurement);
    }

    private AuthorizationNoticeOuterClass$ClientMeasurement() {
    }

    private void clearDeviceMetadata() {
        this.deviceMetadata_ = null;
        this.bitField0_ &= -2;
    }

    private void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    public static AuthorizationNoticeOuterClass$ClientMeasurement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeDeviceMetadata(Configuration$DeviceMetadata configuration$DeviceMetadata) {
        configuration$DeviceMetadata.getClass();
        Configuration$DeviceMetadata configuration$DeviceMetadata2 = this.deviceMetadata_;
        if (configuration$DeviceMetadata2 == null || configuration$DeviceMetadata2 == Configuration$DeviceMetadata.getDefaultInstance()) {
            this.deviceMetadata_ = configuration$DeviceMetadata;
        } else {
            this.deviceMetadata_ = Configuration$DeviceMetadata.newBuilder(this.deviceMetadata_).mergeFrom((Configuration$DeviceMetadata.C6960a) configuration$DeviceMetadata).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C6952a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AuthorizationNoticeOuterClass$ClientMeasurement parseDelimitedFrom(InputStream inputStream) {
        return (AuthorizationNoticeOuterClass$ClientMeasurement) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthorizationNoticeOuterClass$ClientMeasurement parseFrom(ByteBuffer byteBuffer) {
        return (AuthorizationNoticeOuterClass$ClientMeasurement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<AuthorizationNoticeOuterClass$ClientMeasurement> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDeviceMetadata(Configuration$DeviceMetadata configuration$DeviceMetadata) {
        configuration$DeviceMetadata.getClass();
        this.deviceMetadata_ = configuration$DeviceMetadata;
        this.bitField0_ |= 1;
    }

    private void setVersion(String str) {
        str.getClass();
        this.version_ = str;
    }

    private void setVersionBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.version_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7021a.f2648a[methodToInvoke.ordinal()]) {
            case 1:
                return new AuthorizationNoticeOuterClass$ClientMeasurement();
            case 2:
                return new C6952a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "version_", "deviceMetadata_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AuthorizationNoticeOuterClass$ClientMeasurement> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (AuthorizationNoticeOuterClass$ClientMeasurement.class) {
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

    public Configuration$DeviceMetadata getDeviceMetadata() {
        Configuration$DeviceMetadata configuration$DeviceMetadata = this.deviceMetadata_;
        return configuration$DeviceMetadata == null ? Configuration$DeviceMetadata.getDefaultInstance() : configuration$DeviceMetadata;
    }

    public String getVersion() {
        return this.version_;
    }

    public ByteString getVersionBytes() {
        return ByteString.copyFromUtf8(this.version_);
    }

    public boolean hasDeviceMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6952a newBuilder(AuthorizationNoticeOuterClass$ClientMeasurement authorizationNoticeOuterClass$ClientMeasurement) {
        return DEFAULT_INSTANCE.createBuilder(authorizationNoticeOuterClass$ClientMeasurement);
    }

    public static AuthorizationNoticeOuterClass$ClientMeasurement parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthorizationNoticeOuterClass$ClientMeasurement) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AuthorizationNoticeOuterClass$ClientMeasurement parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthorizationNoticeOuterClass$ClientMeasurement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AuthorizationNoticeOuterClass$ClientMeasurement parseFrom(ByteString byteString) {
        return (AuthorizationNoticeOuterClass$ClientMeasurement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AuthorizationNoticeOuterClass$ClientMeasurement parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthorizationNoticeOuterClass$ClientMeasurement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AuthorizationNoticeOuterClass$ClientMeasurement parseFrom(byte[] bArr) {
        return (AuthorizationNoticeOuterClass$ClientMeasurement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AuthorizationNoticeOuterClass$ClientMeasurement parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthorizationNoticeOuterClass$ClientMeasurement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AuthorizationNoticeOuterClass$ClientMeasurement parseFrom(InputStream inputStream) {
        return (AuthorizationNoticeOuterClass$ClientMeasurement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthorizationNoticeOuterClass$ClientMeasurement parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthorizationNoticeOuterClass$ClientMeasurement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AuthorizationNoticeOuterClass$ClientMeasurement parseFrom(CodedInputStream codedInputStream) {
        return (AuthorizationNoticeOuterClass$ClientMeasurement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AuthorizationNoticeOuterClass$ClientMeasurement parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthorizationNoticeOuterClass$ClientMeasurement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
