package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Configuration$SDKMetadataWrapper extends GeneratedMessageLite<Configuration$SDKMetadataWrapper, C6987a> implements MessageLiteOrBuilder {
    private static final Configuration$SDKMetadataWrapper DEFAULT_INSTANCE;
    private static volatile Parser<Configuration$SDKMetadataWrapper> PARSER = null;
    public static final int SDK_METADATA_FIELD_NUMBER = 1;
    private int bitField0_;
    private Configuration$SDKMetadata sdkMetadata_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper$a */
    public static final class C6987a extends GeneratedMessageLite.Builder<Configuration$SDKMetadataWrapper, C6987a> implements MessageLiteOrBuilder {
        public C6987a() {
            super(Configuration$SDKMetadataWrapper.DEFAULT_INSTANCE);
        }
    }

    static {
        Configuration$SDKMetadataWrapper configuration$SDKMetadataWrapper = new Configuration$SDKMetadataWrapper();
        DEFAULT_INSTANCE = configuration$SDKMetadataWrapper;
        GeneratedMessageLite.registerDefaultInstance(Configuration$SDKMetadataWrapper.class, configuration$SDKMetadataWrapper);
    }

    private Configuration$SDKMetadataWrapper() {
    }

    private void clearSdkMetadata() {
        this.sdkMetadata_ = null;
        this.bitField0_ &= -2;
    }

    public static Configuration$SDKMetadataWrapper getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeSdkMetadata(Configuration$SDKMetadata configuration$SDKMetadata) {
        configuration$SDKMetadata.getClass();
        Configuration$SDKMetadata configuration$SDKMetadata2 = this.sdkMetadata_;
        if (configuration$SDKMetadata2 == null || configuration$SDKMetadata2 == Configuration$SDKMetadata.getDefaultInstance()) {
            this.sdkMetadata_ = configuration$SDKMetadata;
        } else {
            this.sdkMetadata_ = Configuration$SDKMetadata.newBuilder(this.sdkMetadata_).mergeFrom((Configuration$SDKMetadata.C6985a) configuration$SDKMetadata).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C6987a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$SDKMetadataWrapper parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$SDKMetadataWrapper) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$SDKMetadataWrapper parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$SDKMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$SDKMetadataWrapper> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setSdkMetadata(Configuration$SDKMetadata configuration$SDKMetadata) {
        configuration$SDKMetadata.getClass();
        this.sdkMetadata_ = configuration$SDKMetadata;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7025e.f2658a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$SDKMetadataWrapper();
            case 2:
                return new C6987a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "sdkMetadata_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$SDKMetadataWrapper> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Configuration$SDKMetadataWrapper.class) {
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

    public Configuration$SDKMetadata getSdkMetadata() {
        Configuration$SDKMetadata configuration$SDKMetadata = this.sdkMetadata_;
        return configuration$SDKMetadata == null ? Configuration$SDKMetadata.getDefaultInstance() : configuration$SDKMetadata;
    }

    public boolean hasSdkMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6987a newBuilder(Configuration$SDKMetadataWrapper configuration$SDKMetadataWrapper) {
        return DEFAULT_INSTANCE.createBuilder(configuration$SDKMetadataWrapper);
    }

    public static Configuration$SDKMetadataWrapper parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SDKMetadataWrapper) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$SDKMetadataWrapper parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SDKMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$SDKMetadataWrapper parseFrom(ByteString byteString) {
        return (Configuration$SDKMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Configuration$SDKMetadataWrapper parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SDKMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$SDKMetadataWrapper parseFrom(byte[] bArr) {
        return (Configuration$SDKMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$SDKMetadataWrapper parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SDKMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$SDKMetadataWrapper parseFrom(InputStream inputStream) {
        return (Configuration$SDKMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$SDKMetadataWrapper parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SDKMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$SDKMetadataWrapper parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$SDKMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$SDKMetadataWrapper parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SDKMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
