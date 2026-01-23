package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Configuration$WebPlatformIdentifierConfiguration extends GeneratedMessageLite<Configuration$WebPlatformIdentifierConfiguration, C6989a> implements MessageLiteOrBuilder {
    private static final Configuration$WebPlatformIdentifierConfiguration DEFAULT_INSTANCE;
    private static volatile Parser<Configuration$WebPlatformIdentifierConfiguration> PARSER;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebPlatformIdentifierConfiguration$a */
    public static final class C6989a extends GeneratedMessageLite.Builder<Configuration$WebPlatformIdentifierConfiguration, C6989a> implements MessageLiteOrBuilder {
        public C6989a() {
            super(Configuration$WebPlatformIdentifierConfiguration.DEFAULT_INSTANCE);
        }
    }

    static {
        Configuration$WebPlatformIdentifierConfiguration configuration$WebPlatformIdentifierConfiguration = new Configuration$WebPlatformIdentifierConfiguration();
        DEFAULT_INSTANCE = configuration$WebPlatformIdentifierConfiguration;
        GeneratedMessageLite.registerDefaultInstance(Configuration$WebPlatformIdentifierConfiguration.class, configuration$WebPlatformIdentifierConfiguration);
    }

    private Configuration$WebPlatformIdentifierConfiguration() {
    }

    public static Configuration$WebPlatformIdentifierConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6989a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$WebPlatformIdentifierConfiguration parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$WebPlatformIdentifierConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$WebPlatformIdentifierConfiguration parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$WebPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$WebPlatformIdentifierConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7025e.f2658a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$WebPlatformIdentifierConfiguration();
            case 2:
                return new C6989a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$WebPlatformIdentifierConfiguration> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Configuration$WebPlatformIdentifierConfiguration.class) {
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

    public static C6989a newBuilder(Configuration$WebPlatformIdentifierConfiguration configuration$WebPlatformIdentifierConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(configuration$WebPlatformIdentifierConfiguration);
    }

    public static Configuration$WebPlatformIdentifierConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$WebPlatformIdentifierConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$WebPlatformIdentifierConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$WebPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$WebPlatformIdentifierConfiguration parseFrom(ByteString byteString) {
        return (Configuration$WebPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Configuration$WebPlatformIdentifierConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$WebPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$WebPlatformIdentifierConfiguration parseFrom(byte[] bArr) {
        return (Configuration$WebPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$WebPlatformIdentifierConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$WebPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$WebPlatformIdentifierConfiguration parseFrom(InputStream inputStream) {
        return (Configuration$WebPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$WebPlatformIdentifierConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$WebPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$WebPlatformIdentifierConfiguration parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$WebPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$WebPlatformIdentifierConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$WebPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
