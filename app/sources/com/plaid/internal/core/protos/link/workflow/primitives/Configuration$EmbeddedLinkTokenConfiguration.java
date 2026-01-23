package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Configuration$EmbeddedLinkTokenConfiguration extends GeneratedMessageLite<Configuration$EmbeddedLinkTokenConfiguration, C6968a> implements MessageLiteOrBuilder {
    private static final Configuration$EmbeddedLinkTokenConfiguration DEFAULT_INSTANCE;
    public static final int EMBEDDED_COMPONENT_CONFIGURATION_FIELD_NUMBER = 4;
    public static final int LINK_OPEN_ID_FIELD_NUMBER = 2;
    public static final int LINK_PERSISTENT_ID_FIELD_NUMBER = 3;
    public static final int LINK_TOKEN_FIELD_NUMBER = 1;
    private static volatile Parser<Configuration$EmbeddedLinkTokenConfiguration> PARSER = null;
    public static final int PLATFORM_IDENTIFIER_CONFIGURATION_FIELD_NUMBER = 5;
    private int bitField0_;
    private Configuration$EmbeddedComponentConfiguration embeddedComponentConfiguration_;
    private Configuration$PlatformIdentifierConfiguration platformIdentifierConfiguration_;
    private String linkToken_ = "";
    private String linkOpenId_ = "";
    private String linkPersistentId_ = "";

    static {
        Configuration$EmbeddedLinkTokenConfiguration configuration$EmbeddedLinkTokenConfiguration = new Configuration$EmbeddedLinkTokenConfiguration();
        DEFAULT_INSTANCE = configuration$EmbeddedLinkTokenConfiguration;
        GeneratedMessageLite.registerDefaultInstance(Configuration$EmbeddedLinkTokenConfiguration.class, configuration$EmbeddedLinkTokenConfiguration);
    }

    private Configuration$EmbeddedLinkTokenConfiguration() {
    }

    private void clearEmbeddedComponentConfiguration() {
        this.embeddedComponentConfiguration_ = null;
        this.bitField0_ &= -2;
    }

    private void clearLinkOpenId() {
        this.linkOpenId_ = getDefaultInstance().getLinkOpenId();
    }

    private void clearLinkPersistentId() {
        this.linkPersistentId_ = getDefaultInstance().getLinkPersistentId();
    }

    private void clearLinkToken() {
        this.linkToken_ = getDefaultInstance().getLinkToken();
    }

    private void clearPlatformIdentifierConfiguration() {
        this.platformIdentifierConfiguration_ = null;
        this.bitField0_ &= -3;
    }

    public static Configuration$EmbeddedLinkTokenConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeEmbeddedComponentConfiguration(Configuration$EmbeddedComponentConfiguration configuration$EmbeddedComponentConfiguration) {
        configuration$EmbeddedComponentConfiguration.getClass();
        Configuration$EmbeddedComponentConfiguration configuration$EmbeddedComponentConfiguration2 = this.embeddedComponentConfiguration_;
        if (configuration$EmbeddedComponentConfiguration2 == null || configuration$EmbeddedComponentConfiguration2 == Configuration$EmbeddedComponentConfiguration.getDefaultInstance()) {
            this.embeddedComponentConfiguration_ = configuration$EmbeddedComponentConfiguration;
        } else {
            this.embeddedComponentConfiguration_ = Configuration$EmbeddedComponentConfiguration.newBuilder(this.embeddedComponentConfiguration_).mergeFrom((Configuration$EmbeddedComponentConfiguration.C6966a) configuration$EmbeddedComponentConfiguration).buildPartial();
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
        this.bitField0_ |= 2;
    }

    public static C6968a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$EmbeddedLinkTokenConfiguration parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$EmbeddedLinkTokenConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$EmbeddedLinkTokenConfiguration parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$EmbeddedLinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$EmbeddedLinkTokenConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setEmbeddedComponentConfiguration(Configuration$EmbeddedComponentConfiguration configuration$EmbeddedComponentConfiguration) {
        configuration$EmbeddedComponentConfiguration.getClass();
        this.embeddedComponentConfiguration_ = configuration$EmbeddedComponentConfiguration;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkOpenId(String str) {
        str.getClass();
        this.linkOpenId_ = str;
    }

    private void setLinkOpenIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.linkOpenId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkPersistentId(String str) {
        str.getClass();
        this.linkPersistentId_ = str;
    }

    private void setLinkPersistentIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.linkPersistentId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkToken(String str) {
        str.getClass();
        this.linkToken_ = str;
    }

    private void setLinkTokenBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.linkToken_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatformIdentifierConfiguration(Configuration$PlatformIdentifierConfiguration configuration$PlatformIdentifierConfiguration) {
        configuration$PlatformIdentifierConfiguration.getClass();
        this.platformIdentifierConfiguration_ = configuration$PlatformIdentifierConfiguration;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7025e.f2658a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$EmbeddedLinkTokenConfiguration();
            case 2:
                return new C6968a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005ဉ\u0001", new Object[]{"bitField0_", "linkToken_", "linkOpenId_", "linkPersistentId_", "embeddedComponentConfiguration_", "platformIdentifierConfiguration_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$EmbeddedLinkTokenConfiguration> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Configuration$EmbeddedLinkTokenConfiguration.class) {
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

    public Configuration$EmbeddedComponentConfiguration getEmbeddedComponentConfiguration() {
        Configuration$EmbeddedComponentConfiguration configuration$EmbeddedComponentConfiguration = this.embeddedComponentConfiguration_;
        return configuration$EmbeddedComponentConfiguration == null ? Configuration$EmbeddedComponentConfiguration.getDefaultInstance() : configuration$EmbeddedComponentConfiguration;
    }

    public String getLinkOpenId() {
        return this.linkOpenId_;
    }

    public ByteString getLinkOpenIdBytes() {
        return ByteString.copyFromUtf8(this.linkOpenId_);
    }

    public String getLinkPersistentId() {
        return this.linkPersistentId_;
    }

    public ByteString getLinkPersistentIdBytes() {
        return ByteString.copyFromUtf8(this.linkPersistentId_);
    }

    public String getLinkToken() {
        return this.linkToken_;
    }

    public ByteString getLinkTokenBytes() {
        return ByteString.copyFromUtf8(this.linkToken_);
    }

    public Configuration$PlatformIdentifierConfiguration getPlatformIdentifierConfiguration() {
        Configuration$PlatformIdentifierConfiguration configuration$PlatformIdentifierConfiguration = this.platformIdentifierConfiguration_;
        return configuration$PlatformIdentifierConfiguration == null ? Configuration$PlatformIdentifierConfiguration.getDefaultInstance() : configuration$PlatformIdentifierConfiguration;
    }

    public boolean hasEmbeddedComponentConfiguration() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPlatformIdentifierConfiguration() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration$a */
    public static final class C6968a extends GeneratedMessageLite.Builder<Configuration$EmbeddedLinkTokenConfiguration, C6968a> implements MessageLiteOrBuilder {
        public C6968a() {
            super(Configuration$EmbeddedLinkTokenConfiguration.DEFAULT_INSTANCE);
        }

        /* renamed from: a */
        public final C6968a m1460a(String str) {
            copyOnWrite();
            ((Configuration$EmbeddedLinkTokenConfiguration) this.instance).setLinkOpenId(str);
            return this;
        }

        /* renamed from: b */
        public final C6968a m1461b(String str) {
            copyOnWrite();
            ((Configuration$EmbeddedLinkTokenConfiguration) this.instance).setLinkPersistentId(str);
            return this;
        }

        /* renamed from: c */
        public final C6968a m1462c(String str) {
            copyOnWrite();
            ((Configuration$EmbeddedLinkTokenConfiguration) this.instance).setLinkToken(str);
            return this;
        }

        /* renamed from: a */
        public final C6968a m1459a(Configuration$PlatformIdentifierConfiguration configuration$PlatformIdentifierConfiguration) {
            copyOnWrite();
            ((Configuration$EmbeddedLinkTokenConfiguration) this.instance).setPlatformIdentifierConfiguration(configuration$PlatformIdentifierConfiguration);
            return this;
        }
    }

    public static C6968a newBuilder(Configuration$EmbeddedLinkTokenConfiguration configuration$EmbeddedLinkTokenConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(configuration$EmbeddedLinkTokenConfiguration);
    }

    public static Configuration$EmbeddedLinkTokenConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedLinkTokenConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$EmbeddedLinkTokenConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedLinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$EmbeddedLinkTokenConfiguration parseFrom(ByteString byteString) {
        return (Configuration$EmbeddedLinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Configuration$EmbeddedLinkTokenConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedLinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$EmbeddedLinkTokenConfiguration parseFrom(byte[] bArr) {
        return (Configuration$EmbeddedLinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$EmbeddedLinkTokenConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedLinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$EmbeddedLinkTokenConfiguration parseFrom(InputStream inputStream) {
        return (Configuration$EmbeddedLinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$EmbeddedLinkTokenConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedLinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$EmbeddedLinkTokenConfiguration parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$EmbeddedLinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$EmbeddedLinkTokenConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedLinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
