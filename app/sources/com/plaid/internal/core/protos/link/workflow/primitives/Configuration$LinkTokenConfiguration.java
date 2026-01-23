package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class Configuration$LinkTokenConfiguration extends GeneratedMessageLite<Configuration$LinkTokenConfiguration, C6981a> implements MessageLiteOrBuilder {
    private static final Configuration$LinkTokenConfiguration DEFAULT_INSTANCE;
    public static final int EMBEDDED_OPEN_LINK_CONFIGURATION_FIELD_NUMBER = 20;
    public static final int EMBEDDED_WORKFLOW_SESSION_ID_FIELD_NUMBER = 19;
    public static final int ENABLE_ACCOUNT_SELECT_FIELD_NUMBER = 18;
    public static final int INSTITUTION_ID_FIELD_NUMBER = 4;
    public static final int LINK_OPEN_ID_FIELD_NUMBER = 2;
    public static final int LINK_PERSISTENT_ID_FIELD_NUMBER = 3;
    public static final int LINK_TOKEN_FIELD_NUMBER = 1;
    private static volatile Parser<Configuration$LinkTokenConfiguration> PARSER = null;
    public static final int PLATFORM_IDENTIFIER_CONFIGURATION_FIELD_NUMBER = 22;
    public static final int SDK_USAGE_METADATA_FIELD_NUMBER = 21;
    public static final int WEB3_VALID_CHAINS_FIELD_NUMBER = 6;
    public static final int WEBVIEW_FALLBACK_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private Configuration$EmbeddedOpenLinkConfiguration embeddedOpenLinkConfiguration_;
    private boolean enableAccountSelect_;
    private Configuration$PlatformIdentifierConfiguration platformIdentifierConfiguration_;
    private Configuration$SdkUsageMetadata sdkUsageMetadata_;
    private String linkToken_ = "";
    private String linkOpenId_ = "";
    private String linkPersistentId_ = "";
    private String institutionId_ = "";
    private String webviewFallbackId_ = "";
    private String embeddedWorkflowSessionId_ = "";
    private Internal.ProtobufList<String> web3ValidChains_ = GeneratedMessageLite.emptyProtobufList();

    static {
        Configuration$LinkTokenConfiguration configuration$LinkTokenConfiguration = new Configuration$LinkTokenConfiguration();
        DEFAULT_INSTANCE = configuration$LinkTokenConfiguration;
        GeneratedMessageLite.registerDefaultInstance(Configuration$LinkTokenConfiguration.class, configuration$LinkTokenConfiguration);
    }

    private Configuration$LinkTokenConfiguration() {
    }

    private void addAllWeb3ValidChains(Iterable<String> iterable) {
        ensureWeb3ValidChainsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.web3ValidChains_);
    }

    private void addWeb3ValidChains(String str) {
        str.getClass();
        ensureWeb3ValidChainsIsMutable();
        this.web3ValidChains_.add(str);
    }

    private void addWeb3ValidChainsBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureWeb3ValidChainsIsMutable();
        this.web3ValidChains_.add(byteString.toStringUtf8());
    }

    private void clearEmbeddedOpenLinkConfiguration() {
        this.embeddedOpenLinkConfiguration_ = null;
        this.bitField0_ &= -2;
    }

    private void clearEmbeddedWorkflowSessionId() {
        this.embeddedWorkflowSessionId_ = getDefaultInstance().getEmbeddedWorkflowSessionId();
    }

    private void clearEnableAccountSelect() {
        this.enableAccountSelect_ = false;
    }

    private void clearInstitutionId() {
        this.institutionId_ = getDefaultInstance().getInstitutionId();
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
        this.bitField0_ &= -5;
    }

    private void clearSdkUsageMetadata() {
        this.sdkUsageMetadata_ = null;
        this.bitField0_ &= -3;
    }

    private void clearWeb3ValidChains() {
        this.web3ValidChains_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearWebviewFallbackId() {
        this.webviewFallbackId_ = getDefaultInstance().getWebviewFallbackId();
    }

    private void ensureWeb3ValidChainsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.web3ValidChains_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.web3ValidChains_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Configuration$LinkTokenConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeEmbeddedOpenLinkConfiguration(Configuration$EmbeddedOpenLinkConfiguration configuration$EmbeddedOpenLinkConfiguration) {
        configuration$EmbeddedOpenLinkConfiguration.getClass();
        Configuration$EmbeddedOpenLinkConfiguration configuration$EmbeddedOpenLinkConfiguration2 = this.embeddedOpenLinkConfiguration_;
        if (configuration$EmbeddedOpenLinkConfiguration2 == null || configuration$EmbeddedOpenLinkConfiguration2 == Configuration$EmbeddedOpenLinkConfiguration.getDefaultInstance()) {
            this.embeddedOpenLinkConfiguration_ = configuration$EmbeddedOpenLinkConfiguration;
        } else {
            this.embeddedOpenLinkConfiguration_ = Configuration$EmbeddedOpenLinkConfiguration.newBuilder(this.embeddedOpenLinkConfiguration_).mergeFrom((Configuration$EmbeddedOpenLinkConfiguration.C6973a) configuration$EmbeddedOpenLinkConfiguration).buildPartial();
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

    private void mergeSdkUsageMetadata(Configuration$SdkUsageMetadata configuration$SdkUsageMetadata) {
        configuration$SdkUsageMetadata.getClass();
        Configuration$SdkUsageMetadata configuration$SdkUsageMetadata2 = this.sdkUsageMetadata_;
        if (configuration$SdkUsageMetadata2 == null || configuration$SdkUsageMetadata2 == Configuration$SdkUsageMetadata.getDefaultInstance()) {
            this.sdkUsageMetadata_ = configuration$SdkUsageMetadata;
        } else {
            this.sdkUsageMetadata_ = Configuration$SdkUsageMetadata.newBuilder(this.sdkUsageMetadata_).mergeFrom((Configuration$SdkUsageMetadata.C6988a) configuration$SdkUsageMetadata).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static C6981a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$LinkTokenConfiguration parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$LinkTokenConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$LinkTokenConfiguration parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$LinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$LinkTokenConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmbeddedOpenLinkConfiguration(Configuration$EmbeddedOpenLinkConfiguration configuration$EmbeddedOpenLinkConfiguration) {
        configuration$EmbeddedOpenLinkConfiguration.getClass();
        this.embeddedOpenLinkConfiguration_ = configuration$EmbeddedOpenLinkConfiguration;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmbeddedWorkflowSessionId(String str) {
        str.getClass();
        this.embeddedWorkflowSessionId_ = str;
    }

    private void setEmbeddedWorkflowSessionIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.embeddedWorkflowSessionId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnableAccountSelect(boolean z) {
        this.enableAccountSelect_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionId(String str) {
        str.getClass();
        this.institutionId_ = str;
    }

    private void setInstitutionIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.institutionId_ = byteString.toStringUtf8();
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
        this.bitField0_ |= 4;
    }

    private void setSdkUsageMetadata(Configuration$SdkUsageMetadata configuration$SdkUsageMetadata) {
        configuration$SdkUsageMetadata.getClass();
        this.sdkUsageMetadata_ = configuration$SdkUsageMetadata;
        this.bitField0_ |= 2;
    }

    private void setWeb3ValidChains(int i, String str) {
        str.getClass();
        ensureWeb3ValidChainsIsMutable();
        this.web3ValidChains_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebviewFallbackId(String str) {
        str.getClass();
        this.webviewFallbackId_ = str;
    }

    private void setWebviewFallbackIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.webviewFallbackId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7025e.f2658a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$LinkTokenConfiguration();
            case 2:
                return new C6981a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u0016\u000b\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ț\u0012\u0007\u0013Ȉ\u0014ဉ\u0000\u0015ဉ\u0001\u0016ဉ\u0002", new Object[]{"bitField0_", "linkToken_", "linkOpenId_", "linkPersistentId_", "institutionId_", "webviewFallbackId_", "web3ValidChains_", "enableAccountSelect_", "embeddedWorkflowSessionId_", "embeddedOpenLinkConfiguration_", "sdkUsageMetadata_", "platformIdentifierConfiguration_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$LinkTokenConfiguration> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Configuration$LinkTokenConfiguration.class) {
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

    public Configuration$EmbeddedOpenLinkConfiguration getEmbeddedOpenLinkConfiguration() {
        Configuration$EmbeddedOpenLinkConfiguration configuration$EmbeddedOpenLinkConfiguration = this.embeddedOpenLinkConfiguration_;
        return configuration$EmbeddedOpenLinkConfiguration == null ? Configuration$EmbeddedOpenLinkConfiguration.getDefaultInstance() : configuration$EmbeddedOpenLinkConfiguration;
    }

    public String getEmbeddedWorkflowSessionId() {
        return this.embeddedWorkflowSessionId_;
    }

    public ByteString getEmbeddedWorkflowSessionIdBytes() {
        return ByteString.copyFromUtf8(this.embeddedWorkflowSessionId_);
    }

    public boolean getEnableAccountSelect() {
        return this.enableAccountSelect_;
    }

    public String getInstitutionId() {
        return this.institutionId_;
    }

    public ByteString getInstitutionIdBytes() {
        return ByteString.copyFromUtf8(this.institutionId_);
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

    public Configuration$SdkUsageMetadata getSdkUsageMetadata() {
        Configuration$SdkUsageMetadata configuration$SdkUsageMetadata = this.sdkUsageMetadata_;
        return configuration$SdkUsageMetadata == null ? Configuration$SdkUsageMetadata.getDefaultInstance() : configuration$SdkUsageMetadata;
    }

    public String getWeb3ValidChains(int i) {
        return this.web3ValidChains_.get(i);
    }

    public ByteString getWeb3ValidChainsBytes(int i) {
        return ByteString.copyFromUtf8(this.web3ValidChains_.get(i));
    }

    public int getWeb3ValidChainsCount() {
        return this.web3ValidChains_.size();
    }

    public List<String> getWeb3ValidChainsList() {
        return this.web3ValidChains_;
    }

    public String getWebviewFallbackId() {
        return this.webviewFallbackId_;
    }

    public ByteString getWebviewFallbackIdBytes() {
        return ByteString.copyFromUtf8(this.webviewFallbackId_);
    }

    public boolean hasEmbeddedOpenLinkConfiguration() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPlatformIdentifierConfiguration() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSdkUsageMetadata() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration$a */
    public static final class C6981a extends GeneratedMessageLite.Builder<Configuration$LinkTokenConfiguration, C6981a> implements MessageLiteOrBuilder {
        public C6981a() {
            super(Configuration$LinkTokenConfiguration.DEFAULT_INSTANCE);
        }

        /* renamed from: a */
        public final C6981a m1470a(String str) {
            copyOnWrite();
            ((Configuration$LinkTokenConfiguration) this.instance).setEmbeddedWorkflowSessionId(str);
            return this;
        }

        /* renamed from: b */
        public final C6981a m1473b(String str) {
            copyOnWrite();
            ((Configuration$LinkTokenConfiguration) this.instance).setInstitutionId(str);
            return this;
        }

        /* renamed from: c */
        public final C6981a m1474c(String str) {
            copyOnWrite();
            ((Configuration$LinkTokenConfiguration) this.instance).setLinkOpenId(str);
            return this;
        }

        /* renamed from: d */
        public final C6981a m1475d(String str) {
            copyOnWrite();
            ((Configuration$LinkTokenConfiguration) this.instance).setLinkPersistentId(str);
            return this;
        }

        /* renamed from: e */
        public final C6981a m1476e(String str) {
            copyOnWrite();
            ((Configuration$LinkTokenConfiguration) this.instance).setLinkToken(str);
            return this;
        }

        /* renamed from: f */
        public final C6981a m1477f(String str) {
            copyOnWrite();
            ((Configuration$LinkTokenConfiguration) this.instance).setWebviewFallbackId(str);
            return this;
        }

        /* renamed from: a */
        public final void m1472a(Configuration$EmbeddedOpenLinkConfiguration configuration$EmbeddedOpenLinkConfiguration) {
            copyOnWrite();
            ((Configuration$LinkTokenConfiguration) this.instance).setEmbeddedOpenLinkConfiguration(configuration$EmbeddedOpenLinkConfiguration);
        }

        /* renamed from: a */
        public final C6981a m1471a(boolean z) {
            copyOnWrite();
            ((Configuration$LinkTokenConfiguration) this.instance).setEnableAccountSelect(z);
            return this;
        }

        /* renamed from: a */
        public final C6981a m1469a(Configuration$PlatformIdentifierConfiguration configuration$PlatformIdentifierConfiguration) {
            copyOnWrite();
            ((Configuration$LinkTokenConfiguration) this.instance).setPlatformIdentifierConfiguration(configuration$PlatformIdentifierConfiguration);
            return this;
        }
    }

    public static C6981a newBuilder(Configuration$LinkTokenConfiguration configuration$LinkTokenConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(configuration$LinkTokenConfiguration);
    }

    public static Configuration$LinkTokenConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkTokenConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$LinkTokenConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$LinkTokenConfiguration parseFrom(ByteString byteString) {
        return (Configuration$LinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Configuration$LinkTokenConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$LinkTokenConfiguration parseFrom(byte[] bArr) {
        return (Configuration$LinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$LinkTokenConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$LinkTokenConfiguration parseFrom(InputStream inputStream) {
        return (Configuration$LinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$LinkTokenConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$LinkTokenConfiguration parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$LinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$LinkTokenConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
