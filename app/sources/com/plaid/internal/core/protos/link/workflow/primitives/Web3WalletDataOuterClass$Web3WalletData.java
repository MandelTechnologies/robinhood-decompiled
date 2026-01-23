package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes24.dex */
public final class Web3WalletDataOuterClass$Web3WalletData extends GeneratedMessageLite<Web3WalletDataOuterClass$Web3WalletData, C7020b> implements MessageLiteOrBuilder {
    public static final int ANDROID_APP_INSTALL_URL_FIELD_NUMBER = 8;
    public static final int BROWSER_APP_INSTALL_URL_FIELD_NUMBER = 12;
    public static final int CHROME_PLUGIN_INSTALL_URL_FIELD_NUMBER = 13;
    private static final Web3WalletDataOuterClass$Web3WalletData DEFAULT_INSTANCE;
    public static final int DISPLAY_URL_FIELD_NUMBER = 4;
    public static final int EDGE_PLUGIN_INSTALL_URL_FIELD_NUMBER = 16;
    public static final int FIREFOX_PLUGIN_INSTALL_URL_FIELD_NUMBER = 14;
    public static final int IOS_APP_INSTALL_URL_FIELD_NUMBER = 7;
    public static final int LINUX_APP_INSTALL_URL_FIELD_NUMBER = 11;
    public static final int LOGO_FIELD_NUMBER = 6;
    public static final int MAC_APP_INSTALL_URL_FIELD_NUMBER = 9;
    private static volatile Parser<Web3WalletDataOuterClass$Web3WalletData> PARSER = null;
    public static final int SAFARI_PLUGIN_INSTALL_URL_FIELD_NUMBER = 15;
    public static final int SHORT_DISPLAY_NAME_FIELD_NUMBER = 3;
    public static final int SOLANA_PLUGIN_ID_FIELD_NUMBER = 25;
    public static final int WALLET_BRAND_ID_FIELD_NUMBER = 17;
    public static final int WALLET_CONNECT_V1_FIELD_NUMBER = 24;
    public static final int WEB3_WALLET_CONNECTION_PROTOCOLS_FIELD_NUMBER = 1;
    public static final int WINDOWS_APP_INSTALL_URL_FIELD_NUMBER = 10;
    private static final Internal.ListAdapter.Converter<Integer, EnumC7041u> web3WalletConnectionProtocols_converter_ = new C7019a();
    private int bitField0_;
    private WalletConnectV1 walletConnectV1_;
    private int web3WalletConnectionProtocolsMemoizedSerializedSize;
    private String walletBrandId_ = "";
    private ByteString logo_ = ByteString.EMPTY;
    private String shortDisplayName_ = "";
    private String displayUrl_ = "";
    private Internal.IntList web3WalletConnectionProtocols_ = GeneratedMessageLite.emptyIntList();
    private String iosAppInstallUrl_ = "";
    private String androidAppInstallUrl_ = "";
    private String macAppInstallUrl_ = "";
    private String windowsAppInstallUrl_ = "";
    private String linuxAppInstallUrl_ = "";
    private String browserAppInstallUrl_ = "";
    private String chromePluginInstallUrl_ = "";
    private String firefoxPluginInstallUrl_ = "";
    private String safariPluginInstallUrl_ = "";
    private String edgePluginInstallUrl_ = "";
    private String solanaPluginId_ = "";

    public static final class WalletConnectV1 extends GeneratedMessageLite<WalletConnectV1, C7018a> implements MessageLiteOrBuilder {
        public static final int ANDROID_CONNECTION_PREFIX_FIELD_NUMBER = 1;
        private static final WalletConnectV1 DEFAULT_INSTANCE;
        public static final int DESKTOP_CONNECTION_PREFIX_FIELD_NUMBER = 3;
        public static final int IOS_CONNECTION_PREFIX_FIELD_NUMBER = 2;
        private static volatile Parser<WalletConnectV1> PARSER = null;
        public static final int QR_CODE_PREFIX_FIELD_NUMBER = 4;
        private String androidConnectionPrefix_ = "";
        private String iosConnectionPrefix_ = "";
        private String desktopConnectionPrefix_ = "";
        private String qrCodePrefix_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData$WalletConnectV1$a */
        public static final class C7018a extends GeneratedMessageLite.Builder<WalletConnectV1, C7018a> implements MessageLiteOrBuilder {
            public C7018a() {
                super(WalletConnectV1.DEFAULT_INSTANCE);
            }
        }

        static {
            WalletConnectV1 walletConnectV1 = new WalletConnectV1();
            DEFAULT_INSTANCE = walletConnectV1;
            GeneratedMessageLite.registerDefaultInstance(WalletConnectV1.class, walletConnectV1);
        }

        private WalletConnectV1() {
        }

        private void clearAndroidConnectionPrefix() {
            this.androidConnectionPrefix_ = getDefaultInstance().getAndroidConnectionPrefix();
        }

        private void clearDesktopConnectionPrefix() {
            this.desktopConnectionPrefix_ = getDefaultInstance().getDesktopConnectionPrefix();
        }

        private void clearIosConnectionPrefix() {
            this.iosConnectionPrefix_ = getDefaultInstance().getIosConnectionPrefix();
        }

        private void clearQrCodePrefix() {
            this.qrCodePrefix_ = getDefaultInstance().getQrCodePrefix();
        }

        public static WalletConnectV1 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C7018a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static WalletConnectV1 parseDelimitedFrom(InputStream inputStream) {
            return (WalletConnectV1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WalletConnectV1 parseFrom(ByteBuffer byteBuffer) {
            return (WalletConnectV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<WalletConnectV1> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAndroidConnectionPrefix(String str) {
            str.getClass();
            this.androidConnectionPrefix_ = str;
        }

        private void setAndroidConnectionPrefixBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.androidConnectionPrefix_ = byteString.toStringUtf8();
        }

        private void setDesktopConnectionPrefix(String str) {
            str.getClass();
            this.desktopConnectionPrefix_ = str;
        }

        private void setDesktopConnectionPrefixBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.desktopConnectionPrefix_ = byteString.toStringUtf8();
        }

        private void setIosConnectionPrefix(String str) {
            str.getClass();
            this.iosConnectionPrefix_ = str;
        }

        private void setIosConnectionPrefixBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.iosConnectionPrefix_ = byteString.toStringUtf8();
        }

        private void setQrCodePrefix(String str) {
            str.getClass();
            this.qrCodePrefix_ = str;
        }

        private void setQrCodePrefixBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.qrCodePrefix_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C7040t.f2701a[methodToInvoke.ordinal()]) {
                case 1:
                    return new WalletConnectV1();
                case 2:
                    return new C7018a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"androidConnectionPrefix_", "iosConnectionPrefix_", "desktopConnectionPrefix_", "qrCodePrefix_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<WalletConnectV1> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (WalletConnectV1.class) {
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

        public String getAndroidConnectionPrefix() {
            return this.androidConnectionPrefix_;
        }

        public ByteString getAndroidConnectionPrefixBytes() {
            return ByteString.copyFromUtf8(this.androidConnectionPrefix_);
        }

        public String getDesktopConnectionPrefix() {
            return this.desktopConnectionPrefix_;
        }

        public ByteString getDesktopConnectionPrefixBytes() {
            return ByteString.copyFromUtf8(this.desktopConnectionPrefix_);
        }

        public String getIosConnectionPrefix() {
            return this.iosConnectionPrefix_;
        }

        public ByteString getIosConnectionPrefixBytes() {
            return ByteString.copyFromUtf8(this.iosConnectionPrefix_);
        }

        public String getQrCodePrefix() {
            return this.qrCodePrefix_;
        }

        public ByteString getQrCodePrefixBytes() {
            return ByteString.copyFromUtf8(this.qrCodePrefix_);
        }

        public static C7018a newBuilder(WalletConnectV1 walletConnectV1) {
            return DEFAULT_INSTANCE.createBuilder(walletConnectV1);
        }

        public static WalletConnectV1 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WalletConnectV1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WalletConnectV1 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (WalletConnectV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static WalletConnectV1 parseFrom(ByteString byteString) {
            return (WalletConnectV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static WalletConnectV1 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (WalletConnectV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static WalletConnectV1 parseFrom(byte[] bArr) {
            return (WalletConnectV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WalletConnectV1 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (WalletConnectV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static WalletConnectV1 parseFrom(InputStream inputStream) {
            return (WalletConnectV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WalletConnectV1 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WalletConnectV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WalletConnectV1 parseFrom(CodedInputStream codedInputStream) {
            return (WalletConnectV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static WalletConnectV1 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WalletConnectV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData$a */
    public class C7019a implements Internal.ListAdapter.Converter<Integer, EnumC7041u> {
        @Override // com.google.protobuf.Internal.ListAdapter.Converter
        public final EnumC7041u convert(Integer num) {
            EnumC7041u enumC7041uForNumber = EnumC7041u.forNumber(num.intValue());
            return enumC7041uForNumber == null ? EnumC7041u.UNRECOGNIZED : enumC7041uForNumber;
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Web3WalletDataOuterClass$Web3WalletData$b */
    public static final class C7020b extends GeneratedMessageLite.Builder<Web3WalletDataOuterClass$Web3WalletData, C7020b> implements MessageLiteOrBuilder {
        public C7020b() {
            super(Web3WalletDataOuterClass$Web3WalletData.DEFAULT_INSTANCE);
        }
    }

    static {
        Web3WalletDataOuterClass$Web3WalletData web3WalletDataOuterClass$Web3WalletData = new Web3WalletDataOuterClass$Web3WalletData();
        DEFAULT_INSTANCE = web3WalletDataOuterClass$Web3WalletData;
        GeneratedMessageLite.registerDefaultInstance(Web3WalletDataOuterClass$Web3WalletData.class, web3WalletDataOuterClass$Web3WalletData);
    }

    private Web3WalletDataOuterClass$Web3WalletData() {
    }

    private void addAllWeb3WalletConnectionProtocols(Iterable<? extends EnumC7041u> iterable) {
        ensureWeb3WalletConnectionProtocolsIsMutable();
        Iterator<? extends EnumC7041u> it = iterable.iterator();
        while (it.hasNext()) {
            this.web3WalletConnectionProtocols_.addInt(it.next().getNumber());
        }
    }

    private void addAllWeb3WalletConnectionProtocolsValue(Iterable<Integer> iterable) {
        ensureWeb3WalletConnectionProtocolsIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.web3WalletConnectionProtocols_.addInt(it.next().intValue());
        }
    }

    private void addWeb3WalletConnectionProtocols(EnumC7041u enumC7041u) {
        enumC7041u.getClass();
        ensureWeb3WalletConnectionProtocolsIsMutable();
        this.web3WalletConnectionProtocols_.addInt(enumC7041u.getNumber());
    }

    private void addWeb3WalletConnectionProtocolsValue(int i) {
        ensureWeb3WalletConnectionProtocolsIsMutable();
        this.web3WalletConnectionProtocols_.addInt(i);
    }

    private void clearAndroidAppInstallUrl() {
        this.androidAppInstallUrl_ = getDefaultInstance().getAndroidAppInstallUrl();
    }

    private void clearBrowserAppInstallUrl() {
        this.browserAppInstallUrl_ = getDefaultInstance().getBrowserAppInstallUrl();
    }

    private void clearChromePluginInstallUrl() {
        this.chromePluginInstallUrl_ = getDefaultInstance().getChromePluginInstallUrl();
    }

    private void clearDisplayUrl() {
        this.displayUrl_ = getDefaultInstance().getDisplayUrl();
    }

    private void clearEdgePluginInstallUrl() {
        this.edgePluginInstallUrl_ = getDefaultInstance().getEdgePluginInstallUrl();
    }

    private void clearFirefoxPluginInstallUrl() {
        this.firefoxPluginInstallUrl_ = getDefaultInstance().getFirefoxPluginInstallUrl();
    }

    private void clearIosAppInstallUrl() {
        this.iosAppInstallUrl_ = getDefaultInstance().getIosAppInstallUrl();
    }

    private void clearLinuxAppInstallUrl() {
        this.linuxAppInstallUrl_ = getDefaultInstance().getLinuxAppInstallUrl();
    }

    private void clearLogo() {
        this.logo_ = getDefaultInstance().getLogo();
    }

    private void clearMacAppInstallUrl() {
        this.macAppInstallUrl_ = getDefaultInstance().getMacAppInstallUrl();
    }

    private void clearSafariPluginInstallUrl() {
        this.safariPluginInstallUrl_ = getDefaultInstance().getSafariPluginInstallUrl();
    }

    private void clearShortDisplayName() {
        this.shortDisplayName_ = getDefaultInstance().getShortDisplayName();
    }

    private void clearSolanaPluginId() {
        this.solanaPluginId_ = getDefaultInstance().getSolanaPluginId();
    }

    private void clearWalletBrandId() {
        this.walletBrandId_ = getDefaultInstance().getWalletBrandId();
    }

    private void clearWalletConnectV1() {
        this.walletConnectV1_ = null;
        this.bitField0_ &= -2;
    }

    private void clearWeb3WalletConnectionProtocols() {
        this.web3WalletConnectionProtocols_ = GeneratedMessageLite.emptyIntList();
    }

    private void clearWindowsAppInstallUrl() {
        this.windowsAppInstallUrl_ = getDefaultInstance().getWindowsAppInstallUrl();
    }

    private void ensureWeb3WalletConnectionProtocolsIsMutable() {
        Internal.IntList intList = this.web3WalletConnectionProtocols_;
        if (intList.isModifiable()) {
            return;
        }
        this.web3WalletConnectionProtocols_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static Web3WalletDataOuterClass$Web3WalletData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeWalletConnectV1(WalletConnectV1 walletConnectV1) {
        walletConnectV1.getClass();
        WalletConnectV1 walletConnectV12 = this.walletConnectV1_;
        if (walletConnectV12 == null || walletConnectV12 == WalletConnectV1.getDefaultInstance()) {
            this.walletConnectV1_ = walletConnectV1;
        } else {
            this.walletConnectV1_ = WalletConnectV1.newBuilder(this.walletConnectV1_).mergeFrom((WalletConnectV1.C7018a) walletConnectV1).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C7020b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Web3WalletDataOuterClass$Web3WalletData parseDelimitedFrom(InputStream inputStream) {
        return (Web3WalletDataOuterClass$Web3WalletData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Web3WalletDataOuterClass$Web3WalletData parseFrom(ByteBuffer byteBuffer) {
        return (Web3WalletDataOuterClass$Web3WalletData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Web3WalletDataOuterClass$Web3WalletData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAndroidAppInstallUrl(String str) {
        str.getClass();
        this.androidAppInstallUrl_ = str;
    }

    private void setAndroidAppInstallUrlBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.androidAppInstallUrl_ = byteString.toStringUtf8();
    }

    private void setBrowserAppInstallUrl(String str) {
        str.getClass();
        this.browserAppInstallUrl_ = str;
    }

    private void setBrowserAppInstallUrlBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.browserAppInstallUrl_ = byteString.toStringUtf8();
    }

    private void setChromePluginInstallUrl(String str) {
        str.getClass();
        this.chromePluginInstallUrl_ = str;
    }

    private void setChromePluginInstallUrlBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.chromePluginInstallUrl_ = byteString.toStringUtf8();
    }

    private void setDisplayUrl(String str) {
        str.getClass();
        this.displayUrl_ = str;
    }

    private void setDisplayUrlBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.displayUrl_ = byteString.toStringUtf8();
    }

    private void setEdgePluginInstallUrl(String str) {
        str.getClass();
        this.edgePluginInstallUrl_ = str;
    }

    private void setEdgePluginInstallUrlBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.edgePluginInstallUrl_ = byteString.toStringUtf8();
    }

    private void setFirefoxPluginInstallUrl(String str) {
        str.getClass();
        this.firefoxPluginInstallUrl_ = str;
    }

    private void setFirefoxPluginInstallUrlBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.firefoxPluginInstallUrl_ = byteString.toStringUtf8();
    }

    private void setIosAppInstallUrl(String str) {
        str.getClass();
        this.iosAppInstallUrl_ = str;
    }

    private void setIosAppInstallUrlBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.iosAppInstallUrl_ = byteString.toStringUtf8();
    }

    private void setLinuxAppInstallUrl(String str) {
        str.getClass();
        this.linuxAppInstallUrl_ = str;
    }

    private void setLinuxAppInstallUrlBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.linuxAppInstallUrl_ = byteString.toStringUtf8();
    }

    private void setLogo(ByteString byteString) {
        byteString.getClass();
        this.logo_ = byteString;
    }

    private void setMacAppInstallUrl(String str) {
        str.getClass();
        this.macAppInstallUrl_ = str;
    }

    private void setMacAppInstallUrlBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.macAppInstallUrl_ = byteString.toStringUtf8();
    }

    private void setSafariPluginInstallUrl(String str) {
        str.getClass();
        this.safariPluginInstallUrl_ = str;
    }

    private void setSafariPluginInstallUrlBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.safariPluginInstallUrl_ = byteString.toStringUtf8();
    }

    private void setShortDisplayName(String str) {
        str.getClass();
        this.shortDisplayName_ = str;
    }

    private void setShortDisplayNameBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.shortDisplayName_ = byteString.toStringUtf8();
    }

    private void setSolanaPluginId(String str) {
        str.getClass();
        this.solanaPluginId_ = str;
    }

    private void setSolanaPluginIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.solanaPluginId_ = byteString.toStringUtf8();
    }

    private void setWalletBrandId(String str) {
        str.getClass();
        this.walletBrandId_ = str;
    }

    private void setWalletBrandIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.walletBrandId_ = byteString.toStringUtf8();
    }

    private void setWalletConnectV1(WalletConnectV1 walletConnectV1) {
        walletConnectV1.getClass();
        this.walletConnectV1_ = walletConnectV1;
        this.bitField0_ |= 1;
    }

    private void setWeb3WalletConnectionProtocols(int i, EnumC7041u enumC7041u) {
        enumC7041u.getClass();
        ensureWeb3WalletConnectionProtocolsIsMutable();
        this.web3WalletConnectionProtocols_.setInt(i, enumC7041u.getNumber());
    }

    private void setWeb3WalletConnectionProtocolsValue(int i, int i2) {
        ensureWeb3WalletConnectionProtocolsIsMutable();
        this.web3WalletConnectionProtocols_.setInt(i, i2);
    }

    private void setWindowsAppInstallUrl(String str) {
        str.getClass();
        this.windowsAppInstallUrl_ = str;
    }

    private void setWindowsAppInstallUrlBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.windowsAppInstallUrl_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7040t.f2701a[methodToInvoke.ordinal()]) {
            case 1:
                return new Web3WalletDataOuterClass$Web3WalletData();
            case 2:
                return new C7020b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0001\u0001\u0019\u0011\u0000\u0001\u0000\u0001,\u0003Ȉ\u0004Ȉ\u0006\n\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0018ဉ\u0000\u0019Ȉ", new Object[]{"bitField0_", "web3WalletConnectionProtocols_", "shortDisplayName_", "displayUrl_", "logo_", "iosAppInstallUrl_", "androidAppInstallUrl_", "macAppInstallUrl_", "windowsAppInstallUrl_", "linuxAppInstallUrl_", "browserAppInstallUrl_", "chromePluginInstallUrl_", "firefoxPluginInstallUrl_", "safariPluginInstallUrl_", "edgePluginInstallUrl_", "walletBrandId_", "walletConnectV1_", "solanaPluginId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Web3WalletDataOuterClass$Web3WalletData> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Web3WalletDataOuterClass$Web3WalletData.class) {
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

    public String getAndroidAppInstallUrl() {
        return this.androidAppInstallUrl_;
    }

    public ByteString getAndroidAppInstallUrlBytes() {
        return ByteString.copyFromUtf8(this.androidAppInstallUrl_);
    }

    public String getBrowserAppInstallUrl() {
        return this.browserAppInstallUrl_;
    }

    public ByteString getBrowserAppInstallUrlBytes() {
        return ByteString.copyFromUtf8(this.browserAppInstallUrl_);
    }

    public String getChromePluginInstallUrl() {
        return this.chromePluginInstallUrl_;
    }

    public ByteString getChromePluginInstallUrlBytes() {
        return ByteString.copyFromUtf8(this.chromePluginInstallUrl_);
    }

    public String getDisplayUrl() {
        return this.displayUrl_;
    }

    public ByteString getDisplayUrlBytes() {
        return ByteString.copyFromUtf8(this.displayUrl_);
    }

    public String getEdgePluginInstallUrl() {
        return this.edgePluginInstallUrl_;
    }

    public ByteString getEdgePluginInstallUrlBytes() {
        return ByteString.copyFromUtf8(this.edgePluginInstallUrl_);
    }

    public String getFirefoxPluginInstallUrl() {
        return this.firefoxPluginInstallUrl_;
    }

    public ByteString getFirefoxPluginInstallUrlBytes() {
        return ByteString.copyFromUtf8(this.firefoxPluginInstallUrl_);
    }

    public String getIosAppInstallUrl() {
        return this.iosAppInstallUrl_;
    }

    public ByteString getIosAppInstallUrlBytes() {
        return ByteString.copyFromUtf8(this.iosAppInstallUrl_);
    }

    public String getLinuxAppInstallUrl() {
        return this.linuxAppInstallUrl_;
    }

    public ByteString getLinuxAppInstallUrlBytes() {
        return ByteString.copyFromUtf8(this.linuxAppInstallUrl_);
    }

    public ByteString getLogo() {
        return this.logo_;
    }

    public String getMacAppInstallUrl() {
        return this.macAppInstallUrl_;
    }

    public ByteString getMacAppInstallUrlBytes() {
        return ByteString.copyFromUtf8(this.macAppInstallUrl_);
    }

    public String getSafariPluginInstallUrl() {
        return this.safariPluginInstallUrl_;
    }

    public ByteString getSafariPluginInstallUrlBytes() {
        return ByteString.copyFromUtf8(this.safariPluginInstallUrl_);
    }

    public String getShortDisplayName() {
        return this.shortDisplayName_;
    }

    public ByteString getShortDisplayNameBytes() {
        return ByteString.copyFromUtf8(this.shortDisplayName_);
    }

    public String getSolanaPluginId() {
        return this.solanaPluginId_;
    }

    public ByteString getSolanaPluginIdBytes() {
        return ByteString.copyFromUtf8(this.solanaPluginId_);
    }

    public String getWalletBrandId() {
        return this.walletBrandId_;
    }

    public ByteString getWalletBrandIdBytes() {
        return ByteString.copyFromUtf8(this.walletBrandId_);
    }

    public WalletConnectV1 getWalletConnectV1() {
        WalletConnectV1 walletConnectV1 = this.walletConnectV1_;
        return walletConnectV1 == null ? WalletConnectV1.getDefaultInstance() : walletConnectV1;
    }

    public EnumC7041u getWeb3WalletConnectionProtocols(int i) {
        EnumC7041u enumC7041uForNumber = EnumC7041u.forNumber(this.web3WalletConnectionProtocols_.getInt(i));
        return enumC7041uForNumber == null ? EnumC7041u.UNRECOGNIZED : enumC7041uForNumber;
    }

    public int getWeb3WalletConnectionProtocolsCount() {
        return this.web3WalletConnectionProtocols_.size();
    }

    public List<EnumC7041u> getWeb3WalletConnectionProtocolsList() {
        return new Internal.ListAdapter(this.web3WalletConnectionProtocols_, web3WalletConnectionProtocols_converter_);
    }

    public int getWeb3WalletConnectionProtocolsValue(int i) {
        return this.web3WalletConnectionProtocols_.getInt(i);
    }

    public List<Integer> getWeb3WalletConnectionProtocolsValueList() {
        return this.web3WalletConnectionProtocols_;
    }

    public String getWindowsAppInstallUrl() {
        return this.windowsAppInstallUrl_;
    }

    public ByteString getWindowsAppInstallUrlBytes() {
        return ByteString.copyFromUtf8(this.windowsAppInstallUrl_);
    }

    public boolean hasWalletConnectV1() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C7020b newBuilder(Web3WalletDataOuterClass$Web3WalletData web3WalletDataOuterClass$Web3WalletData) {
        return DEFAULT_INSTANCE.createBuilder(web3WalletDataOuterClass$Web3WalletData);
    }

    public static Web3WalletDataOuterClass$Web3WalletData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Web3WalletDataOuterClass$Web3WalletData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Web3WalletDataOuterClass$Web3WalletData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Web3WalletDataOuterClass$Web3WalletData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Web3WalletDataOuterClass$Web3WalletData parseFrom(ByteString byteString) {
        return (Web3WalletDataOuterClass$Web3WalletData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Web3WalletDataOuterClass$Web3WalletData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Web3WalletDataOuterClass$Web3WalletData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Web3WalletDataOuterClass$Web3WalletData parseFrom(byte[] bArr) {
        return (Web3WalletDataOuterClass$Web3WalletData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Web3WalletDataOuterClass$Web3WalletData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Web3WalletDataOuterClass$Web3WalletData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Web3WalletDataOuterClass$Web3WalletData parseFrom(InputStream inputStream) {
        return (Web3WalletDataOuterClass$Web3WalletData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Web3WalletDataOuterClass$Web3WalletData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Web3WalletDataOuterClass$Web3WalletData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Web3WalletDataOuterClass$Web3WalletData parseFrom(CodedInputStream codedInputStream) {
        return (Web3WalletDataOuterClass$Web3WalletData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Web3WalletDataOuterClass$Web3WalletData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Web3WalletDataOuterClass$Web3WalletData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
