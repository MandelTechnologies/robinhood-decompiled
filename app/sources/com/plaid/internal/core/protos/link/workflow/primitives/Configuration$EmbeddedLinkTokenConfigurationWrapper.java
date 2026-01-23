package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Configuration$EmbeddedLinkTokenConfigurationWrapper extends GeneratedMessageLite<Configuration$EmbeddedLinkTokenConfigurationWrapper, C6969a> implements MessageLiteOrBuilder {
    private static final Configuration$EmbeddedLinkTokenConfigurationWrapper DEFAULT_INSTANCE;
    public static final int EMBEDDED_LINK_TOKEN_CONFIGURATION_FIELD_NUMBER = 1;
    private static volatile Parser<Configuration$EmbeddedLinkTokenConfigurationWrapper> PARSER;
    private int bitField0_;
    private Configuration$EmbeddedLinkTokenConfiguration embeddedLinkTokenConfiguration_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper$a */
    public static final class C6969a extends GeneratedMessageLite.Builder<Configuration$EmbeddedLinkTokenConfigurationWrapper, C6969a> implements MessageLiteOrBuilder {
        public C6969a() {
            super(Configuration$EmbeddedLinkTokenConfigurationWrapper.DEFAULT_INSTANCE);
        }
    }

    static {
        Configuration$EmbeddedLinkTokenConfigurationWrapper configuration$EmbeddedLinkTokenConfigurationWrapper = new Configuration$EmbeddedLinkTokenConfigurationWrapper();
        DEFAULT_INSTANCE = configuration$EmbeddedLinkTokenConfigurationWrapper;
        GeneratedMessageLite.registerDefaultInstance(Configuration$EmbeddedLinkTokenConfigurationWrapper.class, configuration$EmbeddedLinkTokenConfigurationWrapper);
    }

    private Configuration$EmbeddedLinkTokenConfigurationWrapper() {
    }

    private void clearEmbeddedLinkTokenConfiguration() {
        this.embeddedLinkTokenConfiguration_ = null;
        this.bitField0_ &= -2;
    }

    public static Configuration$EmbeddedLinkTokenConfigurationWrapper getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeEmbeddedLinkTokenConfiguration(Configuration$EmbeddedLinkTokenConfiguration configuration$EmbeddedLinkTokenConfiguration) {
        configuration$EmbeddedLinkTokenConfiguration.getClass();
        Configuration$EmbeddedLinkTokenConfiguration configuration$EmbeddedLinkTokenConfiguration2 = this.embeddedLinkTokenConfiguration_;
        if (configuration$EmbeddedLinkTokenConfiguration2 == null || configuration$EmbeddedLinkTokenConfiguration2 == Configuration$EmbeddedLinkTokenConfiguration.getDefaultInstance()) {
            this.embeddedLinkTokenConfiguration_ = configuration$EmbeddedLinkTokenConfiguration;
        } else {
            this.embeddedLinkTokenConfiguration_ = Configuration$EmbeddedLinkTokenConfiguration.newBuilder(this.embeddedLinkTokenConfiguration_).mergeFrom((Configuration$EmbeddedLinkTokenConfiguration.C6968a) configuration$EmbeddedLinkTokenConfiguration).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C6969a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$EmbeddedLinkTokenConfigurationWrapper parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$EmbeddedLinkTokenConfigurationWrapper) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$EmbeddedLinkTokenConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$EmbeddedLinkTokenConfigurationWrapper> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setEmbeddedLinkTokenConfiguration(Configuration$EmbeddedLinkTokenConfiguration configuration$EmbeddedLinkTokenConfiguration) {
        configuration$EmbeddedLinkTokenConfiguration.getClass();
        this.embeddedLinkTokenConfiguration_ = configuration$EmbeddedLinkTokenConfiguration;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7025e.f2658a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$EmbeddedLinkTokenConfigurationWrapper();
            case 2:
                return new C6969a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "embeddedLinkTokenConfiguration_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$EmbeddedLinkTokenConfigurationWrapper> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Configuration$EmbeddedLinkTokenConfigurationWrapper.class) {
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

    public Configuration$EmbeddedLinkTokenConfiguration getEmbeddedLinkTokenConfiguration() {
        Configuration$EmbeddedLinkTokenConfiguration configuration$EmbeddedLinkTokenConfiguration = this.embeddedLinkTokenConfiguration_;
        return configuration$EmbeddedLinkTokenConfiguration == null ? Configuration$EmbeddedLinkTokenConfiguration.getDefaultInstance() : configuration$EmbeddedLinkTokenConfiguration;
    }

    public boolean hasEmbeddedLinkTokenConfiguration() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6969a newBuilder(Configuration$EmbeddedLinkTokenConfigurationWrapper configuration$EmbeddedLinkTokenConfigurationWrapper) {
        return DEFAULT_INSTANCE.createBuilder(configuration$EmbeddedLinkTokenConfigurationWrapper);
    }

    public static Configuration$EmbeddedLinkTokenConfigurationWrapper parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedLinkTokenConfigurationWrapper) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedLinkTokenConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(ByteString byteString) {
        return (Configuration$EmbeddedLinkTokenConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedLinkTokenConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(byte[] bArr) {
        return (Configuration$EmbeddedLinkTokenConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedLinkTokenConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(InputStream inputStream) {
        return (Configuration$EmbeddedLinkTokenConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedLinkTokenConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$EmbeddedLinkTokenConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedLinkTokenConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
