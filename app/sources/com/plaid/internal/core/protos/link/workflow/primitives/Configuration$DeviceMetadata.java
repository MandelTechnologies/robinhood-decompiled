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
public final class Configuration$DeviceMetadata extends GeneratedMessageLite<Configuration$DeviceMetadata, C6960a> implements MessageLiteOrBuilder {
    public static final int BROWSER_METADATA_FIELD_NUMBER = 8;
    public static final int COUNTRY_CODE_FIELD_NUMBER = 6;
    private static final Configuration$DeviceMetadata DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 7;
    public static final int LOCALE_FIELD_NUMBER = 5;
    public static final int MANUFACTURER_FIELD_NUMBER = 1;
    public static final int MODEL_FIELD_NUMBER = 2;
    public static final int NETWORK_METADATA_FIELD_NUMBER = 13;
    public static final int OS_FIELD_NUMBER = 3;
    public static final int OS_VERSION_FIELD_NUMBER = 4;
    private static volatile Parser<Configuration$DeviceMetadata> PARSER = null;
    public static final int SCREEN_HEIGHT_FIELD_NUMBER = 9;
    public static final int SCREEN_WIDTH_FIELD_NUMBER = 10;
    public static final int VIEWPORT_HEIGHT_FIELD_NUMBER = 11;
    public static final int VIEWPORT_WIDTH_FIELD_NUMBER = 12;
    private int bitField0_;
    private BrowserMetadata browserMetadata_;
    private NetworkMetadata networkMetadata_;
    private int screenHeight_;
    private int screenWidth_;
    private int viewportHeight_;
    private int viewportWidth_;
    private String manufacturer_ = "";
    private String model_ = "";
    private String os_ = "";
    private String osVersion_ = "";
    private String locale_ = "";
    private String countryCode_ = "";
    private String languageCode_ = "";

    public static final class BrowserMetadata extends GeneratedMessageLite<BrowserMetadata, C6958a> implements MessageLiteOrBuilder {
        public static final int BROWSER_NAME_FIELD_NUMBER = 1;
        public static final int BROWSER_VERSION_FIELD_NUMBER = 2;
        private static final BrowserMetadata DEFAULT_INSTANCE;
        public static final int IS_CONDITIONAL_MEDIATION_AVAILABLE_FIELD_NUMBER = 8;
        public static final int IS_PROGRESSIVE_WEB_APP_FIELD_NUMBER = 10;
        public static final int IS_SECURE_CONTEXT_FIELD_NUMBER = 6;
        public static final int IS_USER_VERIFYING_PLATFORM_AUTHENTICATOR_AVAILABLE_FIELD_NUMBER = 7;
        private static volatile Parser<BrowserMetadata> PARSER = null;
        public static final int PREFERS_DARK_MODE_FIELD_NUMBER = 11;
        public static final int REFERRER_ORIGIN_FIELD_NUMBER = 9;
        public static final int RENDERING_ENGINE_NAME_FIELD_NUMBER = 3;
        public static final int RENDERING_ENGINE_VERSION_FIELD_NUMBER = 4;
        public static final int USER_AGENT_FIELD_NUMBER = 5;
        private int isConditionalMediationAvailable_;
        private boolean isProgressiveWebApp_;
        private int isSecureContext_;
        private int isUserVerifyingPlatformAuthenticatorAvailable_;
        private int prefersDarkMode_;
        private String browserName_ = "";
        private String browserVersion_ = "";
        private String renderingEngineName_ = "";
        private String renderingEngineVersion_ = "";
        private String userAgent_ = "";
        private String referrerOrigin_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata$BrowserMetadata$a */
        public static final class C6958a extends GeneratedMessageLite.Builder<BrowserMetadata, C6958a> implements MessageLiteOrBuilder {
            public C6958a() {
                super(BrowserMetadata.DEFAULT_INSTANCE);
            }
        }

        static {
            BrowserMetadata browserMetadata = new BrowserMetadata();
            DEFAULT_INSTANCE = browserMetadata;
            GeneratedMessageLite.registerDefaultInstance(BrowserMetadata.class, browserMetadata);
        }

        private BrowserMetadata() {
        }

        private void clearBrowserName() {
            this.browserName_ = getDefaultInstance().getBrowserName();
        }

        private void clearBrowserVersion() {
            this.browserVersion_ = getDefaultInstance().getBrowserVersion();
        }

        private void clearIsConditionalMediationAvailable() {
            this.isConditionalMediationAvailable_ = 0;
        }

        private void clearIsProgressiveWebApp() {
            this.isProgressiveWebApp_ = false;
        }

        private void clearIsSecureContext() {
            this.isSecureContext_ = 0;
        }

        private void clearIsUserVerifyingPlatformAuthenticatorAvailable() {
            this.isUserVerifyingPlatformAuthenticatorAvailable_ = 0;
        }

        private void clearPrefersDarkMode() {
            this.prefersDarkMode_ = 0;
        }

        private void clearReferrerOrigin() {
            this.referrerOrigin_ = getDefaultInstance().getReferrerOrigin();
        }

        private void clearRenderingEngineName() {
            this.renderingEngineName_ = getDefaultInstance().getRenderingEngineName();
        }

        private void clearRenderingEngineVersion() {
            this.renderingEngineVersion_ = getDefaultInstance().getRenderingEngineVersion();
        }

        private void clearUserAgent() {
            this.userAgent_ = getDefaultInstance().getUserAgent();
        }

        public static BrowserMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6958a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BrowserMetadata parseDelimitedFrom(InputStream inputStream) {
            return (BrowserMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BrowserMetadata parseFrom(ByteBuffer byteBuffer) {
            return (BrowserMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<BrowserMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setBrowserName(String str) {
            str.getClass();
            this.browserName_ = str;
        }

        private void setBrowserNameBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.browserName_ = byteString.toStringUtf8();
        }

        private void setBrowserVersion(String str) {
            str.getClass();
            this.browserVersion_ = str;
        }

        private void setBrowserVersionBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.browserVersion_ = byteString.toStringUtf8();
        }

        private void setIsConditionalMediationAvailable(EnumC7030j enumC7030j) {
            this.isConditionalMediationAvailable_ = enumC7030j.getNumber();
        }

        private void setIsConditionalMediationAvailableValue(int i) {
            this.isConditionalMediationAvailable_ = i;
        }

        private void setIsProgressiveWebApp(boolean z) {
            this.isProgressiveWebApp_ = z;
        }

        private void setIsSecureContext(EnumC7030j enumC7030j) {
            this.isSecureContext_ = enumC7030j.getNumber();
        }

        private void setIsSecureContextValue(int i) {
            this.isSecureContext_ = i;
        }

        private void setIsUserVerifyingPlatformAuthenticatorAvailable(EnumC7030j enumC7030j) {
            this.isUserVerifyingPlatformAuthenticatorAvailable_ = enumC7030j.getNumber();
        }

        private void setIsUserVerifyingPlatformAuthenticatorAvailableValue(int i) {
            this.isUserVerifyingPlatformAuthenticatorAvailable_ = i;
        }

        private void setPrefersDarkMode(EnumC7030j enumC7030j) {
            this.prefersDarkMode_ = enumC7030j.getNumber();
        }

        private void setPrefersDarkModeValue(int i) {
            this.prefersDarkMode_ = i;
        }

        private void setReferrerOrigin(String str) {
            str.getClass();
            this.referrerOrigin_ = str;
        }

        private void setReferrerOriginBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.referrerOrigin_ = byteString.toStringUtf8();
        }

        private void setRenderingEngineName(String str) {
            str.getClass();
            this.renderingEngineName_ = str;
        }

        private void setRenderingEngineNameBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.renderingEngineName_ = byteString.toStringUtf8();
        }

        private void setRenderingEngineVersion(String str) {
            str.getClass();
            this.renderingEngineVersion_ = str;
        }

        private void setRenderingEngineVersionBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.renderingEngineVersion_ = byteString.toStringUtf8();
        }

        private void setUserAgent(String str) {
            str.getClass();
            this.userAgent_ = str;
        }

        private void setUserAgentBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.userAgent_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C7025e.f2658a[methodToInvoke.ordinal()]) {
                case 1:
                    return new BrowserMetadata();
                case 2:
                    return new C6958a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\f\u0007\f\b\f\tȈ\n\u0007\u000b\f", new Object[]{"browserName_", "browserVersion_", "renderingEngineName_", "renderingEngineVersion_", "userAgent_", "isSecureContext_", "isUserVerifyingPlatformAuthenticatorAvailable_", "isConditionalMediationAvailable_", "referrerOrigin_", "isProgressiveWebApp_", "prefersDarkMode_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<BrowserMetadata> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (BrowserMetadata.class) {
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

        public String getBrowserName() {
            return this.browserName_;
        }

        public ByteString getBrowserNameBytes() {
            return ByteString.copyFromUtf8(this.browserName_);
        }

        public String getBrowserVersion() {
            return this.browserVersion_;
        }

        public ByteString getBrowserVersionBytes() {
            return ByteString.copyFromUtf8(this.browserVersion_);
        }

        public EnumC7030j getIsConditionalMediationAvailable() {
            EnumC7030j enumC7030jForNumber = EnumC7030j.forNumber(this.isConditionalMediationAvailable_);
            return enumC7030jForNumber == null ? EnumC7030j.UNRECOGNIZED : enumC7030jForNumber;
        }

        public int getIsConditionalMediationAvailableValue() {
            return this.isConditionalMediationAvailable_;
        }

        public boolean getIsProgressiveWebApp() {
            return this.isProgressiveWebApp_;
        }

        public EnumC7030j getIsSecureContext() {
            EnumC7030j enumC7030jForNumber = EnumC7030j.forNumber(this.isSecureContext_);
            return enumC7030jForNumber == null ? EnumC7030j.UNRECOGNIZED : enumC7030jForNumber;
        }

        public int getIsSecureContextValue() {
            return this.isSecureContext_;
        }

        public EnumC7030j getIsUserVerifyingPlatformAuthenticatorAvailable() {
            EnumC7030j enumC7030jForNumber = EnumC7030j.forNumber(this.isUserVerifyingPlatformAuthenticatorAvailable_);
            return enumC7030jForNumber == null ? EnumC7030j.UNRECOGNIZED : enumC7030jForNumber;
        }

        public int getIsUserVerifyingPlatformAuthenticatorAvailableValue() {
            return this.isUserVerifyingPlatformAuthenticatorAvailable_;
        }

        public EnumC7030j getPrefersDarkMode() {
            EnumC7030j enumC7030jForNumber = EnumC7030j.forNumber(this.prefersDarkMode_);
            return enumC7030jForNumber == null ? EnumC7030j.UNRECOGNIZED : enumC7030jForNumber;
        }

        public int getPrefersDarkModeValue() {
            return this.prefersDarkMode_;
        }

        public String getReferrerOrigin() {
            return this.referrerOrigin_;
        }

        public ByteString getReferrerOriginBytes() {
            return ByteString.copyFromUtf8(this.referrerOrigin_);
        }

        public String getRenderingEngineName() {
            return this.renderingEngineName_;
        }

        public ByteString getRenderingEngineNameBytes() {
            return ByteString.copyFromUtf8(this.renderingEngineName_);
        }

        public String getRenderingEngineVersion() {
            return this.renderingEngineVersion_;
        }

        public ByteString getRenderingEngineVersionBytes() {
            return ByteString.copyFromUtf8(this.renderingEngineVersion_);
        }

        public String getUserAgent() {
            return this.userAgent_;
        }

        public ByteString getUserAgentBytes() {
            return ByteString.copyFromUtf8(this.userAgent_);
        }

        public static C6958a newBuilder(BrowserMetadata browserMetadata) {
            return DEFAULT_INSTANCE.createBuilder(browserMetadata);
        }

        public static BrowserMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BrowserMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BrowserMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (BrowserMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BrowserMetadata parseFrom(ByteString byteString) {
            return (BrowserMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BrowserMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (BrowserMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BrowserMetadata parseFrom(byte[] bArr) {
            return (BrowserMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BrowserMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (BrowserMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BrowserMetadata parseFrom(InputStream inputStream) {
            return (BrowserMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BrowserMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BrowserMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BrowserMetadata parseFrom(CodedInputStream codedInputStream) {
            return (BrowserMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BrowserMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BrowserMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class NetworkMetadata extends GeneratedMessageLite<NetworkMetadata, C6959a> implements MessageLiteOrBuilder {
        private static final NetworkMetadata DEFAULT_INSTANCE;
        public static final int DOWNLINK_FIELD_NUMBER = 2;
        public static final int EFFECTIVE_TYPE_FIELD_NUMBER = 3;
        private static volatile Parser<NetworkMetadata> PARSER = null;
        public static final int RTT_FIELD_NUMBER = 1;
        private float downlink_;
        private String effectiveType_ = "";
        private int rtt_;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata$NetworkMetadata$a */
        public static final class C6959a extends GeneratedMessageLite.Builder<NetworkMetadata, C6959a> implements MessageLiteOrBuilder {
            public C6959a() {
                super(NetworkMetadata.DEFAULT_INSTANCE);
            }
        }

        static {
            NetworkMetadata networkMetadata = new NetworkMetadata();
            DEFAULT_INSTANCE = networkMetadata;
            GeneratedMessageLite.registerDefaultInstance(NetworkMetadata.class, networkMetadata);
        }

        private NetworkMetadata() {
        }

        private void clearDownlink() {
            this.downlink_ = 0.0f;
        }

        private void clearEffectiveType() {
            this.effectiveType_ = getDefaultInstance().getEffectiveType();
        }

        private void clearRtt() {
            this.rtt_ = 0;
        }

        public static NetworkMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6959a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NetworkMetadata parseDelimitedFrom(InputStream inputStream) {
            return (NetworkMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NetworkMetadata parseFrom(ByteBuffer byteBuffer) {
            return (NetworkMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NetworkMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDownlink(float f) {
            this.downlink_ = f;
        }

        private void setEffectiveType(String str) {
            str.getClass();
            this.effectiveType_ = str;
        }

        private void setEffectiveTypeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.effectiveType_ = byteString.toStringUtf8();
        }

        private void setRtt(int i) {
            this.rtt_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C7025e.f2658a[methodToInvoke.ordinal()]) {
                case 1:
                    return new NetworkMetadata();
                case 2:
                    return new C6959a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u0001\u0003Ȉ", new Object[]{"rtt_", "downlink_", "effectiveType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<NetworkMetadata> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (NetworkMetadata.class) {
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

        public float getDownlink() {
            return this.downlink_;
        }

        public String getEffectiveType() {
            return this.effectiveType_;
        }

        public ByteString getEffectiveTypeBytes() {
            return ByteString.copyFromUtf8(this.effectiveType_);
        }

        public int getRtt() {
            return this.rtt_;
        }

        public static C6959a newBuilder(NetworkMetadata networkMetadata) {
            return DEFAULT_INSTANCE.createBuilder(networkMetadata);
        }

        public static NetworkMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NetworkMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NetworkMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (NetworkMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NetworkMetadata parseFrom(ByteString byteString) {
            return (NetworkMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NetworkMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (NetworkMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NetworkMetadata parseFrom(byte[] bArr) {
            return (NetworkMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NetworkMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (NetworkMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NetworkMetadata parseFrom(InputStream inputStream) {
            return (NetworkMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NetworkMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NetworkMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NetworkMetadata parseFrom(CodedInputStream codedInputStream) {
            return (NetworkMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NetworkMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NetworkMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    static {
        Configuration$DeviceMetadata configuration$DeviceMetadata = new Configuration$DeviceMetadata();
        DEFAULT_INSTANCE = configuration$DeviceMetadata;
        GeneratedMessageLite.registerDefaultInstance(Configuration$DeviceMetadata.class, configuration$DeviceMetadata);
    }

    private Configuration$DeviceMetadata() {
    }

    private void clearBrowserMetadata() {
        this.browserMetadata_ = null;
        this.bitField0_ &= -2;
    }

    private void clearCountryCode() {
        this.countryCode_ = getDefaultInstance().getCountryCode();
    }

    private void clearLanguageCode() {
        this.languageCode_ = getDefaultInstance().getLanguageCode();
    }

    private void clearLocale() {
        this.locale_ = getDefaultInstance().getLocale();
    }

    private void clearManufacturer() {
        this.manufacturer_ = getDefaultInstance().getManufacturer();
    }

    private void clearModel() {
        this.model_ = getDefaultInstance().getModel();
    }

    private void clearNetworkMetadata() {
        this.networkMetadata_ = null;
        this.bitField0_ &= -3;
    }

    private void clearOs() {
        this.os_ = getDefaultInstance().getOs();
    }

    private void clearOsVersion() {
        this.osVersion_ = getDefaultInstance().getOsVersion();
    }

    private void clearScreenHeight() {
        this.screenHeight_ = 0;
    }

    private void clearScreenWidth() {
        this.screenWidth_ = 0;
    }

    private void clearViewportHeight() {
        this.viewportHeight_ = 0;
    }

    private void clearViewportWidth() {
        this.viewportWidth_ = 0;
    }

    public static Configuration$DeviceMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeBrowserMetadata(BrowserMetadata browserMetadata) {
        browserMetadata.getClass();
        BrowserMetadata browserMetadata2 = this.browserMetadata_;
        if (browserMetadata2 == null || browserMetadata2 == BrowserMetadata.getDefaultInstance()) {
            this.browserMetadata_ = browserMetadata;
        } else {
            this.browserMetadata_ = BrowserMetadata.newBuilder(this.browserMetadata_).mergeFrom((BrowserMetadata.C6958a) browserMetadata).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeNetworkMetadata(NetworkMetadata networkMetadata) {
        networkMetadata.getClass();
        NetworkMetadata networkMetadata2 = this.networkMetadata_;
        if (networkMetadata2 == null || networkMetadata2 == NetworkMetadata.getDefaultInstance()) {
            this.networkMetadata_ = networkMetadata;
        } else {
            this.networkMetadata_ = NetworkMetadata.newBuilder(this.networkMetadata_).mergeFrom((NetworkMetadata.C6959a) networkMetadata).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static C6960a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$DeviceMetadata parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$DeviceMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$DeviceMetadata parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$DeviceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$DeviceMetadata> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setBrowserMetadata(BrowserMetadata browserMetadata) {
        browserMetadata.getClass();
        this.browserMetadata_ = browserMetadata;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryCode(String str) {
        str.getClass();
        this.countryCode_ = str;
    }

    private void setCountryCodeBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.countryCode_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageCode(String str) {
        str.getClass();
        this.languageCode_ = str;
    }

    private void setLanguageCodeBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.languageCode_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocale(String str) {
        str.getClass();
        this.locale_ = str;
    }

    private void setLocaleBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.locale_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManufacturer(String str) {
        str.getClass();
        this.manufacturer_ = str;
    }

    private void setManufacturerBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.manufacturer_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModel(String str) {
        str.getClass();
        this.model_ = str;
    }

    private void setModelBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.model_ = byteString.toStringUtf8();
    }

    private void setNetworkMetadata(NetworkMetadata networkMetadata) {
        networkMetadata.getClass();
        this.networkMetadata_ = networkMetadata;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOs(String str) {
        str.getClass();
        this.os_ = str;
    }

    private void setOsBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.os_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersion(String str) {
        str.getClass();
        this.osVersion_ = str;
    }

    private void setOsVersionBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.osVersion_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenHeight(int i) {
        this.screenHeight_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenWidth(int i) {
        this.screenWidth_ = i;
    }

    private void setViewportHeight(int i) {
        this.viewportHeight_ = i;
    }

    private void setViewportWidth(int i) {
        this.viewportWidth_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7025e.f2658a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$DeviceMetadata();
            case 2:
                return new C6960a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bဉ\u0000\t\u000b\n\u000b\u000b\u000b\f\u000b\rဉ\u0001", new Object[]{"bitField0_", "manufacturer_", "model_", "os_", "osVersion_", "locale_", "countryCode_", "languageCode_", "browserMetadata_", "screenHeight_", "screenWidth_", "viewportHeight_", "viewportWidth_", "networkMetadata_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$DeviceMetadata> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Configuration$DeviceMetadata.class) {
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

    public BrowserMetadata getBrowserMetadata() {
        BrowserMetadata browserMetadata = this.browserMetadata_;
        return browserMetadata == null ? BrowserMetadata.getDefaultInstance() : browserMetadata;
    }

    public String getCountryCode() {
        return this.countryCode_;
    }

    public ByteString getCountryCodeBytes() {
        return ByteString.copyFromUtf8(this.countryCode_);
    }

    public String getLanguageCode() {
        return this.languageCode_;
    }

    public ByteString getLanguageCodeBytes() {
        return ByteString.copyFromUtf8(this.languageCode_);
    }

    public String getLocale() {
        return this.locale_;
    }

    public ByteString getLocaleBytes() {
        return ByteString.copyFromUtf8(this.locale_);
    }

    public String getManufacturer() {
        return this.manufacturer_;
    }

    public ByteString getManufacturerBytes() {
        return ByteString.copyFromUtf8(this.manufacturer_);
    }

    public String getModel() {
        return this.model_;
    }

    public ByteString getModelBytes() {
        return ByteString.copyFromUtf8(this.model_);
    }

    public NetworkMetadata getNetworkMetadata() {
        NetworkMetadata networkMetadata = this.networkMetadata_;
        return networkMetadata == null ? NetworkMetadata.getDefaultInstance() : networkMetadata;
    }

    public String getOs() {
        return this.os_;
    }

    public ByteString getOsBytes() {
        return ByteString.copyFromUtf8(this.os_);
    }

    public String getOsVersion() {
        return this.osVersion_;
    }

    public ByteString getOsVersionBytes() {
        return ByteString.copyFromUtf8(this.osVersion_);
    }

    public int getScreenHeight() {
        return this.screenHeight_;
    }

    public int getScreenWidth() {
        return this.screenWidth_;
    }

    public int getViewportHeight() {
        return this.viewportHeight_;
    }

    public int getViewportWidth() {
        return this.viewportWidth_;
    }

    public boolean hasBrowserMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasNetworkMetadata() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata$a */
    public static final class C6960a extends GeneratedMessageLite.Builder<Configuration$DeviceMetadata, C6960a> implements MessageLiteOrBuilder {
        public C6960a() {
            super(Configuration$DeviceMetadata.DEFAULT_INSTANCE);
        }

        /* renamed from: a */
        public final void m1451a(String str) {
            copyOnWrite();
            ((Configuration$DeviceMetadata) this.instance).setCountryCode(str);
        }

        /* renamed from: b */
        public final void m1453b(String str) {
            copyOnWrite();
            ((Configuration$DeviceMetadata) this.instance).setLanguageCode(str);
        }

        /* renamed from: c */
        public final void m1454c(String str) {
            copyOnWrite();
            ((Configuration$DeviceMetadata) this.instance).setLocale(str);
        }

        /* renamed from: d */
        public final void m1455d(String str) {
            copyOnWrite();
            ((Configuration$DeviceMetadata) this.instance).setManufacturer(str);
        }

        /* renamed from: e */
        public final void m1456e(String str) {
            copyOnWrite();
            ((Configuration$DeviceMetadata) this.instance).setModel(str);
        }

        /* renamed from: f */
        public final void m1457f(String str) {
            copyOnWrite();
            ((Configuration$DeviceMetadata) this.instance).setOs(str);
        }

        /* renamed from: g */
        public final void m1458g(String str) {
            copyOnWrite();
            ((Configuration$DeviceMetadata) this.instance).setOsVersion(str);
        }

        /* renamed from: a */
        public final void m1450a(int i) {
            copyOnWrite();
            ((Configuration$DeviceMetadata) this.instance).setScreenHeight(i);
        }

        /* renamed from: b */
        public final void m1452b(int i) {
            copyOnWrite();
            ((Configuration$DeviceMetadata) this.instance).setScreenWidth(i);
        }
    }

    public static C6960a newBuilder(Configuration$DeviceMetadata configuration$DeviceMetadata) {
        return DEFAULT_INSTANCE.createBuilder(configuration$DeviceMetadata);
    }

    public static Configuration$DeviceMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$DeviceMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$DeviceMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$DeviceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$DeviceMetadata parseFrom(ByteString byteString) {
        return (Configuration$DeviceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Configuration$DeviceMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$DeviceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$DeviceMetadata parseFrom(byte[] bArr) {
        return (Configuration$DeviceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$DeviceMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$DeviceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$DeviceMetadata parseFrom(InputStream inputStream) {
        return (Configuration$DeviceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$DeviceMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$DeviceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$DeviceMetadata parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$DeviceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$DeviceMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$DeviceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
