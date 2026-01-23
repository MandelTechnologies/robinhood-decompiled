package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$IOSPlatformIdentifierConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebPlatformIdentifierConfiguration;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Configuration$PlatformIdentifierConfiguration extends GeneratedMessageLite<Configuration$PlatformIdentifierConfiguration, C6982a> implements MessageLiteOrBuilder {
    public static final int ANDROID_PLATFORM_IDENTIFIER_CONFIGURATION_FIELD_NUMBER = 2;
    private static final Configuration$PlatformIdentifierConfiguration DEFAULT_INSTANCE;
    public static final int IOS_PLATFORM_IDENTIFIER_CONFIGURATION_FIELD_NUMBER = 3;
    private static volatile Parser<Configuration$PlatformIdentifierConfiguration> PARSER = null;
    public static final int WEB_PLATFORM_IDENTIFIER_CONFIGURATION_FIELD_NUMBER = 1;
    private int platformConfigurationCase_ = 0;
    private Object platformConfiguration_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration$a */
    public static final class C6982a extends GeneratedMessageLite.Builder<Configuration$PlatformIdentifierConfiguration, C6982a> implements MessageLiteOrBuilder {
        public C6982a() {
            super(Configuration$PlatformIdentifierConfiguration.DEFAULT_INSTANCE);
        }

        /* renamed from: a */
        public final C6982a m1478a(Configuration$AndroidPlatformIdentifierConfiguration configuration$AndroidPlatformIdentifierConfiguration) {
            copyOnWrite();
            ((Configuration$PlatformIdentifierConfiguration) this.instance).setAndroidPlatformIdentifierConfiguration(configuration$AndroidPlatformIdentifierConfiguration);
            return this;
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration$b */
    public enum EnumC6983b {
        WEB_PLATFORM_IDENTIFIER_CONFIGURATION(1),
        ANDROID_PLATFORM_IDENTIFIER_CONFIGURATION(2),
        IOS_PLATFORM_IDENTIFIER_CONFIGURATION(3),
        PLATFORMCONFIGURATION_NOT_SET(0);


        /* renamed from: a */
        public final int f2631a;

        EnumC6983b(int i) {
            this.f2631a = i;
        }

        public static EnumC6983b forNumber(int i) {
            if (i == 0) {
                return PLATFORMCONFIGURATION_NOT_SET;
            }
            if (i == 1) {
                return WEB_PLATFORM_IDENTIFIER_CONFIGURATION;
            }
            if (i == 2) {
                return ANDROID_PLATFORM_IDENTIFIER_CONFIGURATION;
            }
            if (i != 3) {
                return null;
            }
            return IOS_PLATFORM_IDENTIFIER_CONFIGURATION;
        }

        public int getNumber() {
            return this.f2631a;
        }

        @Deprecated
        public static EnumC6983b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Configuration$PlatformIdentifierConfiguration configuration$PlatformIdentifierConfiguration = new Configuration$PlatformIdentifierConfiguration();
        DEFAULT_INSTANCE = configuration$PlatformIdentifierConfiguration;
        GeneratedMessageLite.registerDefaultInstance(Configuration$PlatformIdentifierConfiguration.class, configuration$PlatformIdentifierConfiguration);
    }

    private Configuration$PlatformIdentifierConfiguration() {
    }

    private void clearAndroidPlatformIdentifierConfiguration() {
        if (this.platformConfigurationCase_ == 2) {
            this.platformConfigurationCase_ = 0;
            this.platformConfiguration_ = null;
        }
    }

    private void clearIosPlatformIdentifierConfiguration() {
        if (this.platformConfigurationCase_ == 3) {
            this.platformConfigurationCase_ = 0;
            this.platformConfiguration_ = null;
        }
    }

    private void clearPlatformConfiguration() {
        this.platformConfigurationCase_ = 0;
        this.platformConfiguration_ = null;
    }

    private void clearWebPlatformIdentifierConfiguration() {
        if (this.platformConfigurationCase_ == 1) {
            this.platformConfigurationCase_ = 0;
            this.platformConfiguration_ = null;
        }
    }

    public static Configuration$PlatformIdentifierConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAndroidPlatformIdentifierConfiguration(Configuration$AndroidPlatformIdentifierConfiguration configuration$AndroidPlatformIdentifierConfiguration) {
        configuration$AndroidPlatformIdentifierConfiguration.getClass();
        if (this.platformConfigurationCase_ != 2 || this.platformConfiguration_ == Configuration$AndroidPlatformIdentifierConfiguration.getDefaultInstance()) {
            this.platformConfiguration_ = configuration$AndroidPlatformIdentifierConfiguration;
        } else {
            this.platformConfiguration_ = Configuration$AndroidPlatformIdentifierConfiguration.newBuilder((Configuration$AndroidPlatformIdentifierConfiguration) this.platformConfiguration_).mergeFrom((Configuration$AndroidPlatformIdentifierConfiguration.C6956a) configuration$AndroidPlatformIdentifierConfiguration).buildPartial();
        }
        this.platformConfigurationCase_ = 2;
    }

    private void mergeIosPlatformIdentifierConfiguration(Configuration$IOSPlatformIdentifierConfiguration configuration$IOSPlatformIdentifierConfiguration) {
        configuration$IOSPlatformIdentifierConfiguration.getClass();
        if (this.platformConfigurationCase_ != 3 || this.platformConfiguration_ == Configuration$IOSPlatformIdentifierConfiguration.getDefaultInstance()) {
            this.platformConfiguration_ = configuration$IOSPlatformIdentifierConfiguration;
        } else {
            this.platformConfiguration_ = Configuration$IOSPlatformIdentifierConfiguration.newBuilder((Configuration$IOSPlatformIdentifierConfiguration) this.platformConfiguration_).mergeFrom((Configuration$IOSPlatformIdentifierConfiguration.C6975a) configuration$IOSPlatformIdentifierConfiguration).buildPartial();
        }
        this.platformConfigurationCase_ = 3;
    }

    private void mergeWebPlatformIdentifierConfiguration(Configuration$WebPlatformIdentifierConfiguration configuration$WebPlatformIdentifierConfiguration) {
        configuration$WebPlatformIdentifierConfiguration.getClass();
        if (this.platformConfigurationCase_ != 1 || this.platformConfiguration_ == Configuration$WebPlatformIdentifierConfiguration.getDefaultInstance()) {
            this.platformConfiguration_ = configuration$WebPlatformIdentifierConfiguration;
        } else {
            this.platformConfiguration_ = Configuration$WebPlatformIdentifierConfiguration.newBuilder((Configuration$WebPlatformIdentifierConfiguration) this.platformConfiguration_).mergeFrom((Configuration$WebPlatformIdentifierConfiguration.C6989a) configuration$WebPlatformIdentifierConfiguration).buildPartial();
        }
        this.platformConfigurationCase_ = 1;
    }

    public static C6982a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$PlatformIdentifierConfiguration parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$PlatformIdentifierConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$PlatformIdentifierConfiguration parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$PlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$PlatformIdentifierConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidPlatformIdentifierConfiguration(Configuration$AndroidPlatformIdentifierConfiguration configuration$AndroidPlatformIdentifierConfiguration) {
        configuration$AndroidPlatformIdentifierConfiguration.getClass();
        this.platformConfiguration_ = configuration$AndroidPlatformIdentifierConfiguration;
        this.platformConfigurationCase_ = 2;
    }

    private void setIosPlatformIdentifierConfiguration(Configuration$IOSPlatformIdentifierConfiguration configuration$IOSPlatformIdentifierConfiguration) {
        configuration$IOSPlatformIdentifierConfiguration.getClass();
        this.platformConfiguration_ = configuration$IOSPlatformIdentifierConfiguration;
        this.platformConfigurationCase_ = 3;
    }

    private void setWebPlatformIdentifierConfiguration(Configuration$WebPlatformIdentifierConfiguration configuration$WebPlatformIdentifierConfiguration) {
        configuration$WebPlatformIdentifierConfiguration.getClass();
        this.platformConfiguration_ = configuration$WebPlatformIdentifierConfiguration;
        this.platformConfigurationCase_ = 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7025e.f2658a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$PlatformIdentifierConfiguration();
            case 2:
                return new C6982a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"platformConfiguration_", "platformConfigurationCase_", Configuration$WebPlatformIdentifierConfiguration.class, Configuration$AndroidPlatformIdentifierConfiguration.class, Configuration$IOSPlatformIdentifierConfiguration.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$PlatformIdentifierConfiguration> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Configuration$PlatformIdentifierConfiguration.class) {
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

    public Configuration$AndroidPlatformIdentifierConfiguration getAndroidPlatformIdentifierConfiguration() {
        return this.platformConfigurationCase_ == 2 ? (Configuration$AndroidPlatformIdentifierConfiguration) this.platformConfiguration_ : Configuration$AndroidPlatformIdentifierConfiguration.getDefaultInstance();
    }

    public Configuration$IOSPlatformIdentifierConfiguration getIosPlatformIdentifierConfiguration() {
        return this.platformConfigurationCase_ == 3 ? (Configuration$IOSPlatformIdentifierConfiguration) this.platformConfiguration_ : Configuration$IOSPlatformIdentifierConfiguration.getDefaultInstance();
    }

    public EnumC6983b getPlatformConfigurationCase() {
        return EnumC6983b.forNumber(this.platformConfigurationCase_);
    }

    public Configuration$WebPlatformIdentifierConfiguration getWebPlatformIdentifierConfiguration() {
        return this.platformConfigurationCase_ == 1 ? (Configuration$WebPlatformIdentifierConfiguration) this.platformConfiguration_ : Configuration$WebPlatformIdentifierConfiguration.getDefaultInstance();
    }

    public boolean hasAndroidPlatformIdentifierConfiguration() {
        return this.platformConfigurationCase_ == 2;
    }

    public boolean hasIosPlatformIdentifierConfiguration() {
        return this.platformConfigurationCase_ == 3;
    }

    public boolean hasWebPlatformIdentifierConfiguration() {
        return this.platformConfigurationCase_ == 1;
    }

    public static C6982a newBuilder(Configuration$PlatformIdentifierConfiguration configuration$PlatformIdentifierConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(configuration$PlatformIdentifierConfiguration);
    }

    public static Configuration$PlatformIdentifierConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$PlatformIdentifierConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$PlatformIdentifierConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$PlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$PlatformIdentifierConfiguration parseFrom(ByteString byteString) {
        return (Configuration$PlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Configuration$PlatformIdentifierConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$PlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$PlatformIdentifierConfiguration parseFrom(byte[] bArr) {
        return (Configuration$PlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$PlatformIdentifierConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$PlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$PlatformIdentifierConfiguration parseFrom(InputStream inputStream) {
        return (Configuration$PlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$PlatformIdentifierConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$PlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$PlatformIdentifierConfiguration parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$PlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$PlatformIdentifierConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$PlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
