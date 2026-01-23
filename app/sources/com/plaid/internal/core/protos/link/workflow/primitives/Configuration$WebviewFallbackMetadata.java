package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Configuration$WebviewFallbackMetadata extends GeneratedMessageLite<Configuration$WebviewFallbackMetadata, C6990a> implements MessageLiteOrBuilder {
    public static final int ANDROID_SMS_VERIFICATION_API_TYPE_FIELD_NUMBER = 9;
    public static final int CHANNEL_ID_FIELD_NUMBER = 6;
    private static final Configuration$WebviewFallbackMetadata DEFAULT_INSTANCE;
    public static final int DEVICE_METADATA_FIELD_NUMBER = 2;
    public static final int MOST_RECENT_WORKFLOW_SESSION_ID_FIELD_NUMBER = 8;
    private static volatile Parser<Configuration$WebviewFallbackMetadata> PARSER = null;
    public static final int PLATFORM_IDENTIFIER_CONFIGURATION_FIELD_NUMBER = 7;
    public static final int RESOLVER_NAME_FIELD_NUMBER = 1;
    public static final int SDK_METADATA_FIELD_NUMBER = 3;
    public static final int WEBVIEW_FALLBACK_MODE_FIELD_NUMBER = 4;
    public static final int WEBVIEW_REQUEST_COUNT_FIELD_NUMBER = 5;
    private int androidSmsVerificationApiType_;
    private int bitField0_;
    private Configuration$DeviceMetadata deviceMetadata_;
    private Configuration$PlatformIdentifierConfiguration platformIdentifierConfiguration_;
    private Configuration$SDKMetadata sdkMetadata_;
    private int webviewRequestCount_;
    private String resolverName_ = "";
    private String webviewFallbackMode_ = "";
    private String channelId_ = "";
    private String mostRecentWorkflowSessionId_ = "";

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata$a */
    public static final class C6990a extends GeneratedMessageLite.Builder<Configuration$WebviewFallbackMetadata, C6990a> implements MessageLiteOrBuilder {
        public C6990a() {
            super(Configuration$WebviewFallbackMetadata.DEFAULT_INSTANCE);
        }
    }

    static {
        Configuration$WebviewFallbackMetadata configuration$WebviewFallbackMetadata = new Configuration$WebviewFallbackMetadata();
        DEFAULT_INSTANCE = configuration$WebviewFallbackMetadata;
        GeneratedMessageLite.registerDefaultInstance(Configuration$WebviewFallbackMetadata.class, configuration$WebviewFallbackMetadata);
    }

    private Configuration$WebviewFallbackMetadata() {
    }

    private void clearAndroidSmsVerificationApiType() {
        this.androidSmsVerificationApiType_ = 0;
    }

    private void clearChannelId() {
        this.channelId_ = getDefaultInstance().getChannelId();
    }

    private void clearDeviceMetadata() {
        this.deviceMetadata_ = null;
        this.bitField0_ &= -2;
    }

    private void clearMostRecentWorkflowSessionId() {
        this.mostRecentWorkflowSessionId_ = getDefaultInstance().getMostRecentWorkflowSessionId();
    }

    private void clearPlatformIdentifierConfiguration() {
        this.platformIdentifierConfiguration_ = null;
        this.bitField0_ &= -5;
    }

    private void clearResolverName() {
        this.resolverName_ = getDefaultInstance().getResolverName();
    }

    private void clearSdkMetadata() {
        this.sdkMetadata_ = null;
        this.bitField0_ &= -3;
    }

    private void clearWebviewFallbackMode() {
        this.webviewFallbackMode_ = getDefaultInstance().getWebviewFallbackMode();
    }

    private void clearWebviewRequestCount() {
        this.webviewRequestCount_ = 0;
    }

    public static Configuration$WebviewFallbackMetadata getDefaultInstance() {
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

    private void mergePlatformIdentifierConfiguration(Configuration$PlatformIdentifierConfiguration configuration$PlatformIdentifierConfiguration) {
        configuration$PlatformIdentifierConfiguration.getClass();
        Configuration$PlatformIdentifierConfiguration configuration$PlatformIdentifierConfiguration2 = this.platformIdentifierConfiguration_;
        if (configuration$PlatformIdentifierConfiguration2 == null || configuration$PlatformIdentifierConfiguration2 == Configuration$PlatformIdentifierConfiguration.getDefaultInstance()) {
            this.platformIdentifierConfiguration_ = configuration$PlatformIdentifierConfiguration;
        } else {
            this.platformIdentifierConfiguration_ = Configuration$PlatformIdentifierConfiguration.newBuilder(this.platformIdentifierConfiguration_).mergeFrom((Configuration$PlatformIdentifierConfiguration.C6982a) configuration$PlatformIdentifierConfiguration).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    private void mergeSdkMetadata(Configuration$SDKMetadata configuration$SDKMetadata) {
        configuration$SDKMetadata.getClass();
        Configuration$SDKMetadata configuration$SDKMetadata2 = this.sdkMetadata_;
        if (configuration$SDKMetadata2 == null || configuration$SDKMetadata2 == Configuration$SDKMetadata.getDefaultInstance()) {
            this.sdkMetadata_ = configuration$SDKMetadata;
        } else {
            this.sdkMetadata_ = Configuration$SDKMetadata.newBuilder(this.sdkMetadata_).mergeFrom((Configuration$SDKMetadata.C6985a) configuration$SDKMetadata).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static C6990a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$WebviewFallbackMetadata parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$WebviewFallbackMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$WebviewFallbackMetadata parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$WebviewFallbackMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$WebviewFallbackMetadata> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAndroidSmsVerificationApiType(EnumC7026f enumC7026f) {
        this.androidSmsVerificationApiType_ = enumC7026f.getNumber();
    }

    private void setAndroidSmsVerificationApiTypeValue(int i) {
        this.androidSmsVerificationApiType_ = i;
    }

    private void setChannelId(String str) {
        str.getClass();
        this.channelId_ = str;
    }

    private void setChannelIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.channelId_ = byteString.toStringUtf8();
    }

    private void setDeviceMetadata(Configuration$DeviceMetadata configuration$DeviceMetadata) {
        configuration$DeviceMetadata.getClass();
        this.deviceMetadata_ = configuration$DeviceMetadata;
        this.bitField0_ |= 1;
    }

    private void setMostRecentWorkflowSessionId(String str) {
        str.getClass();
        this.mostRecentWorkflowSessionId_ = str;
    }

    private void setMostRecentWorkflowSessionIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.mostRecentWorkflowSessionId_ = byteString.toStringUtf8();
    }

    private void setPlatformIdentifierConfiguration(Configuration$PlatformIdentifierConfiguration configuration$PlatformIdentifierConfiguration) {
        configuration$PlatformIdentifierConfiguration.getClass();
        this.platformIdentifierConfiguration_ = configuration$PlatformIdentifierConfiguration;
        this.bitField0_ |= 4;
    }

    private void setResolverName(String str) {
        str.getClass();
        this.resolverName_ = str;
    }

    private void setResolverNameBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.resolverName_ = byteString.toStringUtf8();
    }

    private void setSdkMetadata(Configuration$SDKMetadata configuration$SDKMetadata) {
        configuration$SDKMetadata.getClass();
        this.sdkMetadata_ = configuration$SDKMetadata;
        this.bitField0_ |= 2;
    }

    private void setWebviewFallbackMode(String str) {
        str.getClass();
        this.webviewFallbackMode_ = str;
    }

    private void setWebviewFallbackModeBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.webviewFallbackMode_ = byteString.toStringUtf8();
    }

    private void setWebviewRequestCount(int i) {
        this.webviewRequestCount_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7025e.f2658a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$WebviewFallbackMetadata();
            case 2:
                return new C6990a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004Ȉ\u0005\u0004\u0006Ȉ\u0007ဉ\u0002\bȈ\t\f", new Object[]{"bitField0_", "resolverName_", "deviceMetadata_", "sdkMetadata_", "webviewFallbackMode_", "webviewRequestCount_", "channelId_", "platformIdentifierConfiguration_", "mostRecentWorkflowSessionId_", "androidSmsVerificationApiType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$WebviewFallbackMetadata> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Configuration$WebviewFallbackMetadata.class) {
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

    public EnumC7026f getAndroidSmsVerificationApiType() {
        EnumC7026f enumC7026fForNumber = EnumC7026f.forNumber(this.androidSmsVerificationApiType_);
        return enumC7026fForNumber == null ? EnumC7026f.UNRECOGNIZED : enumC7026fForNumber;
    }

    public int getAndroidSmsVerificationApiTypeValue() {
        return this.androidSmsVerificationApiType_;
    }

    public String getChannelId() {
        return this.channelId_;
    }

    public ByteString getChannelIdBytes() {
        return ByteString.copyFromUtf8(this.channelId_);
    }

    public Configuration$DeviceMetadata getDeviceMetadata() {
        Configuration$DeviceMetadata configuration$DeviceMetadata = this.deviceMetadata_;
        return configuration$DeviceMetadata == null ? Configuration$DeviceMetadata.getDefaultInstance() : configuration$DeviceMetadata;
    }

    public String getMostRecentWorkflowSessionId() {
        return this.mostRecentWorkflowSessionId_;
    }

    public ByteString getMostRecentWorkflowSessionIdBytes() {
        return ByteString.copyFromUtf8(this.mostRecentWorkflowSessionId_);
    }

    public Configuration$PlatformIdentifierConfiguration getPlatformIdentifierConfiguration() {
        Configuration$PlatformIdentifierConfiguration configuration$PlatformIdentifierConfiguration = this.platformIdentifierConfiguration_;
        return configuration$PlatformIdentifierConfiguration == null ? Configuration$PlatformIdentifierConfiguration.getDefaultInstance() : configuration$PlatformIdentifierConfiguration;
    }

    public String getResolverName() {
        return this.resolverName_;
    }

    public ByteString getResolverNameBytes() {
        return ByteString.copyFromUtf8(this.resolverName_);
    }

    public Configuration$SDKMetadata getSdkMetadata() {
        Configuration$SDKMetadata configuration$SDKMetadata = this.sdkMetadata_;
        return configuration$SDKMetadata == null ? Configuration$SDKMetadata.getDefaultInstance() : configuration$SDKMetadata;
    }

    public String getWebviewFallbackMode() {
        return this.webviewFallbackMode_;
    }

    public ByteString getWebviewFallbackModeBytes() {
        return ByteString.copyFromUtf8(this.webviewFallbackMode_);
    }

    public int getWebviewRequestCount() {
        return this.webviewRequestCount_;
    }

    public boolean hasDeviceMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPlatformIdentifierConfiguration() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSdkMetadata() {
        return (this.bitField0_ & 2) != 0;
    }

    public static C6990a newBuilder(Configuration$WebviewFallbackMetadata configuration$WebviewFallbackMetadata) {
        return DEFAULT_INSTANCE.createBuilder(configuration$WebviewFallbackMetadata);
    }

    public static Configuration$WebviewFallbackMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$WebviewFallbackMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$WebviewFallbackMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$WebviewFallbackMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$WebviewFallbackMetadata parseFrom(ByteString byteString) {
        return (Configuration$WebviewFallbackMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Configuration$WebviewFallbackMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$WebviewFallbackMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$WebviewFallbackMetadata parseFrom(byte[] bArr) {
        return (Configuration$WebviewFallbackMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$WebviewFallbackMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$WebviewFallbackMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$WebviewFallbackMetadata parseFrom(InputStream inputStream) {
        return (Configuration$WebviewFallbackMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$WebviewFallbackMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$WebviewFallbackMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$WebviewFallbackMetadata parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$WebviewFallbackMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$WebviewFallbackMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$WebviewFallbackMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
