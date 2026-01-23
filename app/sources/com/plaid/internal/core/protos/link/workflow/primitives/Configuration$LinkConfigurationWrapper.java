package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Configuration$LinkConfigurationWrapper extends GeneratedMessageLite<Configuration$LinkConfigurationWrapper, C6980a> implements MessageLiteOrBuilder {
    private static final Configuration$LinkConfigurationWrapper DEFAULT_INSTANCE;
    public static final int LINK_CONFIGURATION_FIELD_NUMBER = 1;
    private static volatile Parser<Configuration$LinkConfigurationWrapper> PARSER;
    private int bitField0_;
    private Configuration$LinkConfiguration linkConfiguration_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper$a */
    public static final class C6980a extends GeneratedMessageLite.Builder<Configuration$LinkConfigurationWrapper, C6980a> implements MessageLiteOrBuilder {
        public C6980a() {
            super(Configuration$LinkConfigurationWrapper.DEFAULT_INSTANCE);
        }
    }

    static {
        Configuration$LinkConfigurationWrapper configuration$LinkConfigurationWrapper = new Configuration$LinkConfigurationWrapper();
        DEFAULT_INSTANCE = configuration$LinkConfigurationWrapper;
        GeneratedMessageLite.registerDefaultInstance(Configuration$LinkConfigurationWrapper.class, configuration$LinkConfigurationWrapper);
    }

    private Configuration$LinkConfigurationWrapper() {
    }

    private void clearLinkConfiguration() {
        this.linkConfiguration_ = null;
        this.bitField0_ &= -2;
    }

    public static Configuration$LinkConfigurationWrapper getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeLinkConfiguration(Configuration$LinkConfiguration configuration$LinkConfiguration) {
        configuration$LinkConfiguration.getClass();
        Configuration$LinkConfiguration configuration$LinkConfiguration2 = this.linkConfiguration_;
        if (configuration$LinkConfiguration2 == null || configuration$LinkConfiguration2 == Configuration$LinkConfiguration.getDefaultInstance()) {
            this.linkConfiguration_ = configuration$LinkConfiguration;
        } else {
            this.linkConfiguration_ = Configuration$LinkConfiguration.newBuilder(this.linkConfiguration_).mergeFrom((Configuration$LinkConfiguration.C6979b) configuration$LinkConfiguration).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C6980a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$LinkConfigurationWrapper parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$LinkConfigurationWrapper) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$LinkConfigurationWrapper parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$LinkConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$LinkConfigurationWrapper> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setLinkConfiguration(Configuration$LinkConfiguration configuration$LinkConfiguration) {
        configuration$LinkConfiguration.getClass();
        this.linkConfiguration_ = configuration$LinkConfiguration;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7025e.f2658a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$LinkConfigurationWrapper();
            case 2:
                return new C6980a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "linkConfiguration_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$LinkConfigurationWrapper> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Configuration$LinkConfigurationWrapper.class) {
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

    public Configuration$LinkConfiguration getLinkConfiguration() {
        Configuration$LinkConfiguration configuration$LinkConfiguration = this.linkConfiguration_;
        return configuration$LinkConfiguration == null ? Configuration$LinkConfiguration.getDefaultInstance() : configuration$LinkConfiguration;
    }

    public boolean hasLinkConfiguration() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6980a newBuilder(Configuration$LinkConfigurationWrapper configuration$LinkConfigurationWrapper) {
        return DEFAULT_INSTANCE.createBuilder(configuration$LinkConfigurationWrapper);
    }

    public static Configuration$LinkConfigurationWrapper parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkConfigurationWrapper) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$LinkConfigurationWrapper parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$LinkConfigurationWrapper parseFrom(ByteString byteString) {
        return (Configuration$LinkConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Configuration$LinkConfigurationWrapper parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$LinkConfigurationWrapper parseFrom(byte[] bArr) {
        return (Configuration$LinkConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$LinkConfigurationWrapper parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$LinkConfigurationWrapper parseFrom(InputStream inputStream) {
        return (Configuration$LinkConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$LinkConfigurationWrapper parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$LinkConfigurationWrapper parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$LinkConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$LinkConfigurationWrapper parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
