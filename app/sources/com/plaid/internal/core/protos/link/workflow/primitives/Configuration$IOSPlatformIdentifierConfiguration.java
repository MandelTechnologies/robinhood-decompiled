package com.plaid.internal.core.protos.link.workflow.primitives;

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
public final class Configuration$IOSPlatformIdentifierConfiguration extends GeneratedMessageLite<Configuration$IOSPlatformIdentifierConfiguration, C6975a> implements MessageLiteOrBuilder {
    private static final Configuration$IOSPlatformIdentifierConfiguration DEFAULT_INSTANCE;
    public static final int IOS_VENDOR_IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile Parser<Configuration$IOSPlatformIdentifierConfiguration> PARSER;
    private String iosVendorIdentifier_ = "";

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$IOSPlatformIdentifierConfiguration$a */
    public static final class C6975a extends GeneratedMessageLite.Builder<Configuration$IOSPlatformIdentifierConfiguration, C6975a> implements MessageLiteOrBuilder {
        public C6975a() {
            super(Configuration$IOSPlatformIdentifierConfiguration.DEFAULT_INSTANCE);
        }
    }

    static {
        Configuration$IOSPlatformIdentifierConfiguration configuration$IOSPlatformIdentifierConfiguration = new Configuration$IOSPlatformIdentifierConfiguration();
        DEFAULT_INSTANCE = configuration$IOSPlatformIdentifierConfiguration;
        GeneratedMessageLite.registerDefaultInstance(Configuration$IOSPlatformIdentifierConfiguration.class, configuration$IOSPlatformIdentifierConfiguration);
    }

    private Configuration$IOSPlatformIdentifierConfiguration() {
    }

    private void clearIosVendorIdentifier() {
        this.iosVendorIdentifier_ = getDefaultInstance().getIosVendorIdentifier();
    }

    public static Configuration$IOSPlatformIdentifierConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6975a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$IOSPlatformIdentifierConfiguration parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$IOSPlatformIdentifierConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$IOSPlatformIdentifierConfiguration parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$IOSPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$IOSPlatformIdentifierConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setIosVendorIdentifier(String str) {
        str.getClass();
        this.iosVendorIdentifier_ = str;
    }

    private void setIosVendorIdentifierBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.iosVendorIdentifier_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7025e.f2658a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$IOSPlatformIdentifierConfiguration();
            case 2:
                return new C6975a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"iosVendorIdentifier_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$IOSPlatformIdentifierConfiguration> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Configuration$IOSPlatformIdentifierConfiguration.class) {
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

    public String getIosVendorIdentifier() {
        return this.iosVendorIdentifier_;
    }

    public ByteString getIosVendorIdentifierBytes() {
        return ByteString.copyFromUtf8(this.iosVendorIdentifier_);
    }

    public static C6975a newBuilder(Configuration$IOSPlatformIdentifierConfiguration configuration$IOSPlatformIdentifierConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(configuration$IOSPlatformIdentifierConfiguration);
    }

    public static Configuration$IOSPlatformIdentifierConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$IOSPlatformIdentifierConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$IOSPlatformIdentifierConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$IOSPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$IOSPlatformIdentifierConfiguration parseFrom(ByteString byteString) {
        return (Configuration$IOSPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Configuration$IOSPlatformIdentifierConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$IOSPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$IOSPlatformIdentifierConfiguration parseFrom(byte[] bArr) {
        return (Configuration$IOSPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$IOSPlatformIdentifierConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$IOSPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$IOSPlatformIdentifierConfiguration parseFrom(InputStream inputStream) {
        return (Configuration$IOSPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$IOSPlatformIdentifierConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$IOSPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$IOSPlatformIdentifierConfiguration parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$IOSPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$IOSPlatformIdentifierConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$IOSPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
