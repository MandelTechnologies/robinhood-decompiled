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
public final class Configuration$AndroidPlatformIdentifierConfiguration extends GeneratedMessageLite<Configuration$AndroidPlatformIdentifierConfiguration, C6956a> implements MessageLiteOrBuilder {
    public static final int ANDROID_GSF_ID_FIELD_NUMBER = 2;
    public static final int ANDROID_ID_FIELD_NUMBER = 1;
    private static final Configuration$AndroidPlatformIdentifierConfiguration DEFAULT_INSTANCE;
    private static volatile Parser<Configuration$AndroidPlatformIdentifierConfiguration> PARSER;
    private String androidId_ = "";
    private String androidGsfId_ = "";

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration$a */
    public static final class C6956a extends GeneratedMessageLite.Builder<Configuration$AndroidPlatformIdentifierConfiguration, C6956a> implements MessageLiteOrBuilder {
        public C6956a() {
            super(Configuration$AndroidPlatformIdentifierConfiguration.DEFAULT_INSTANCE);
        }

        /* renamed from: a */
        public final C6956a m1447a(String str) {
            copyOnWrite();
            ((Configuration$AndroidPlatformIdentifierConfiguration) this.instance).setAndroidId(str);
            return this;
        }
    }

    static {
        Configuration$AndroidPlatformIdentifierConfiguration configuration$AndroidPlatformIdentifierConfiguration = new Configuration$AndroidPlatformIdentifierConfiguration();
        DEFAULT_INSTANCE = configuration$AndroidPlatformIdentifierConfiguration;
        GeneratedMessageLite.registerDefaultInstance(Configuration$AndroidPlatformIdentifierConfiguration.class, configuration$AndroidPlatformIdentifierConfiguration);
    }

    private Configuration$AndroidPlatformIdentifierConfiguration() {
    }

    private void clearAndroidGsfId() {
        this.androidGsfId_ = getDefaultInstance().getAndroidGsfId();
    }

    private void clearAndroidId() {
        this.androidId_ = getDefaultInstance().getAndroidId();
    }

    public static Configuration$AndroidPlatformIdentifierConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6956a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$AndroidPlatformIdentifierConfiguration parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$AndroidPlatformIdentifierConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$AndroidPlatformIdentifierConfiguration parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$AndroidPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$AndroidPlatformIdentifierConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAndroidGsfId(String str) {
        str.getClass();
        this.androidGsfId_ = str;
    }

    private void setAndroidGsfIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.androidGsfId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidId(String str) {
        str.getClass();
        this.androidId_ = str;
    }

    private void setAndroidIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.androidId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7025e.f2658a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$AndroidPlatformIdentifierConfiguration();
            case 2:
                return new C6956a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"androidId_", "androidGsfId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$AndroidPlatformIdentifierConfiguration> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Configuration$AndroidPlatformIdentifierConfiguration.class) {
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

    public String getAndroidGsfId() {
        return this.androidGsfId_;
    }

    public ByteString getAndroidGsfIdBytes() {
        return ByteString.copyFromUtf8(this.androidGsfId_);
    }

    public String getAndroidId() {
        return this.androidId_;
    }

    public ByteString getAndroidIdBytes() {
        return ByteString.copyFromUtf8(this.androidId_);
    }

    public static C6956a newBuilder(Configuration$AndroidPlatformIdentifierConfiguration configuration$AndroidPlatformIdentifierConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(configuration$AndroidPlatformIdentifierConfiguration);
    }

    public static Configuration$AndroidPlatformIdentifierConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$AndroidPlatformIdentifierConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$AndroidPlatformIdentifierConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$AndroidPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$AndroidPlatformIdentifierConfiguration parseFrom(ByteString byteString) {
        return (Configuration$AndroidPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Configuration$AndroidPlatformIdentifierConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$AndroidPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$AndroidPlatformIdentifierConfiguration parseFrom(byte[] bArr) {
        return (Configuration$AndroidPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$AndroidPlatformIdentifierConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$AndroidPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$AndroidPlatformIdentifierConfiguration parseFrom(InputStream inputStream) {
        return (Configuration$AndroidPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$AndroidPlatformIdentifierConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$AndroidPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$AndroidPlatformIdentifierConfiguration parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$AndroidPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$AndroidPlatformIdentifierConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$AndroidPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
