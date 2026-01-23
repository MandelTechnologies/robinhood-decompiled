package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.primitives.EnumC7026f;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class Common$WebviewFallback extends GeneratedMessageLite<Common$WebviewFallback, C6552a> implements MessageLiteOrBuilder {
    public static final int ANDROID_SMS_VERIFICATION_API_TYPE_FIELD_NUMBER = 11;
    public static final int CHANNEL_FROM_WEBVIEW_FIELD_NUMBER = 6;
    private static final Common$WebviewFallback DEFAULT_INSTANCE;
    public static final int MODE_FIELD_NUMBER = 1;
    private static volatile Parser<Common$WebviewFallback> PARSER = null;
    public static final int POPUP_BEHAVIOR_IOS_FIELD_NUMBER = 4;
    public static final int PREFERS_EPHEMERAL_FIELD_NUMBER = 7;
    public static final int SHOULD_EAGER_START_FIELD_NUMBER = 9;
    public static final int URL_BEHAVIOR_CONFIGURATIONS_FIELD_NUMBER = 3;
    public static final int URL_FIELD_NUMBER = 2;
    public static final int WEBVIEW_FALLBACK_BACKGROUND_FIELD_NUMBER = 8;
    public static final int WEBVIEW_FALLBACK_ID_FIELD_NUMBER = 5;
    public static final int WILL_USE_SDK_BRIDGE_OPEN_FLOW_FIELD_NUMBER = 10;
    private int androidSmsVerificationApiType_;
    private int bitField0_;
    private Channel channelFromWebview_;
    private int mode_;
    private int popupBehaviorIos_;
    private boolean prefersEphemeral_;
    private boolean shouldEagerStart_;
    private int webviewFallbackBackground_;
    private boolean willUseSdkBridgeOpenFlow_;
    private String url_ = "";
    private Internal.ProtobufList<Common$URLBehaviorConfiguration> urlBehaviorConfigurations_ = GeneratedMessageLite.emptyProtobufList();
    private String webviewFallbackId_ = "";

    public static final class Channel extends GeneratedMessageLite<Channel, C6551a> implements MessageLiteOrBuilder {
        private static final Channel DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile Parser<Channel> PARSER = null;
        public static final int POLLING_INTERVAL_MS_FIELD_NUMBER = 3;
        public static final int SECRET_FIELD_NUMBER = 2;
        private long pollingIntervalMs_;
        private String id_ = "";
        private String secret_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback$Channel$a */
        public static final class C6551a extends GeneratedMessageLite.Builder<Channel, C6551a> implements MessageLiteOrBuilder {
            public C6551a() {
                super(Channel.DEFAULT_INSTANCE);
            }
        }

        static {
            Channel channel = new Channel();
            DEFAULT_INSTANCE = channel;
            GeneratedMessageLite.registerDefaultInstance(Channel.class, channel);
        }

        private Channel() {
        }

        private void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        private void clearPollingIntervalMs() {
            this.pollingIntervalMs_ = 0L;
        }

        private void clearSecret() {
            this.secret_ = getDefaultInstance().getSecret();
        }

        public static Channel getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6551a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Channel parseDelimitedFrom(InputStream inputStream) {
            return (Channel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Channel parseFrom(ByteBuffer byteBuffer) {
            return (Channel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Channel> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        private void setIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        private void setPollingIntervalMs(long j) {
            this.pollingIntervalMs_ = j;
        }

        private void setSecret(String str) {
            str.getClass();
            this.secret_ = str;
        }

        private void setSecretBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.secret_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Channel();
                case 2:
                    return new C6551a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0003", new Object[]{"id_", "secret_", "pollingIntervalMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Channel> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Channel.class) {
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

        public String getId() {
            return this.id_;
        }

        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        public long getPollingIntervalMs() {
            return this.pollingIntervalMs_;
        }

        public String getSecret() {
            return this.secret_;
        }

        public ByteString getSecretBytes() {
            return ByteString.copyFromUtf8(this.secret_);
        }

        public static C6551a newBuilder(Channel channel) {
            return DEFAULT_INSTANCE.createBuilder(channel);
        }

        public static Channel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Channel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Channel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Channel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Channel parseFrom(ByteString byteString) {
            return (Channel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Channel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Channel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Channel parseFrom(byte[] bArr) {
            return (Channel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Channel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Channel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Channel parseFrom(InputStream inputStream) {
            return (Channel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Channel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Channel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Channel parseFrom(CodedInputStream codedInputStream) {
            return (Channel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Channel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Channel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback$a */
    public static final class C6552a extends GeneratedMessageLite.Builder<Common$WebviewFallback, C6552a> implements MessageLiteOrBuilder {
        public C6552a() {
            super(Common$WebviewFallback.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$WebviewFallback common$WebviewFallback = new Common$WebviewFallback();
        DEFAULT_INSTANCE = common$WebviewFallback;
        GeneratedMessageLite.registerDefaultInstance(Common$WebviewFallback.class, common$WebviewFallback);
    }

    private Common$WebviewFallback() {
    }

    private void addAllUrlBehaviorConfigurations(Iterable<? extends Common$URLBehaviorConfiguration> iterable) {
        ensureUrlBehaviorConfigurationsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.urlBehaviorConfigurations_);
    }

    private void addUrlBehaviorConfigurations(Common$URLBehaviorConfiguration common$URLBehaviorConfiguration) {
        common$URLBehaviorConfiguration.getClass();
        ensureUrlBehaviorConfigurationsIsMutable();
        this.urlBehaviorConfigurations_.add(common$URLBehaviorConfiguration);
    }

    private void clearAndroidSmsVerificationApiType() {
        this.androidSmsVerificationApiType_ = 0;
    }

    private void clearChannelFromWebview() {
        this.channelFromWebview_ = null;
        this.bitField0_ &= -2;
    }

    private void clearMode() {
        this.mode_ = 0;
    }

    private void clearPopupBehaviorIos() {
        this.popupBehaviorIos_ = 0;
    }

    private void clearPrefersEphemeral() {
        this.prefersEphemeral_ = false;
    }

    private void clearShouldEagerStart() {
        this.shouldEagerStart_ = false;
    }

    private void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    private void clearUrlBehaviorConfigurations() {
        this.urlBehaviorConfigurations_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearWebviewFallbackBackground() {
        this.webviewFallbackBackground_ = 0;
    }

    private void clearWebviewFallbackId() {
        this.webviewFallbackId_ = getDefaultInstance().getWebviewFallbackId();
    }

    private void clearWillUseSdkBridgeOpenFlow() {
        this.willUseSdkBridgeOpenFlow_ = false;
    }

    private void ensureUrlBehaviorConfigurationsIsMutable() {
        Internal.ProtobufList<Common$URLBehaviorConfiguration> protobufList = this.urlBehaviorConfigurations_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.urlBehaviorConfigurations_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Common$WebviewFallback getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeChannelFromWebview(Channel channel) {
        channel.getClass();
        Channel channel2 = this.channelFromWebview_;
        if (channel2 == null || channel2 == Channel.getDefaultInstance()) {
            this.channelFromWebview_ = channel;
        } else {
            this.channelFromWebview_ = Channel.newBuilder(this.channelFromWebview_).mergeFrom((Channel.C6551a) channel).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C6552a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$WebviewFallback parseDelimitedFrom(InputStream inputStream) {
        return (Common$WebviewFallback) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$WebviewFallback parseFrom(ByteBuffer byteBuffer) {
        return (Common$WebviewFallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$WebviewFallback> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeUrlBehaviorConfigurations(int i) {
        ensureUrlBehaviorConfigurationsIsMutable();
        this.urlBehaviorConfigurations_.remove(i);
    }

    private void setAndroidSmsVerificationApiType(EnumC7026f enumC7026f) {
        this.androidSmsVerificationApiType_ = enumC7026f.getNumber();
    }

    private void setAndroidSmsVerificationApiTypeValue(int i) {
        this.androidSmsVerificationApiType_ = i;
    }

    private void setChannelFromWebview(Channel channel) {
        channel.getClass();
        this.channelFromWebview_ = channel;
        this.bitField0_ |= 1;
    }

    private void setMode(EnumC6902b0 enumC6902b0) {
        this.mode_ = enumC6902b0.getNumber();
    }

    private void setModeValue(int i) {
        this.mode_ = i;
    }

    private void setPopupBehaviorIos(EnumC6900a0 enumC6900a0) {
        this.popupBehaviorIos_ = enumC6900a0.getNumber();
    }

    private void setPopupBehaviorIosValue(int i) {
        this.popupBehaviorIos_ = i;
    }

    private void setPrefersEphemeral(boolean z) {
        this.prefersEphemeral_ = z;
    }

    private void setShouldEagerStart(boolean z) {
        this.shouldEagerStart_ = z;
    }

    private void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    private void setUrlBehaviorConfigurations(int i, Common$URLBehaviorConfiguration common$URLBehaviorConfiguration) {
        common$URLBehaviorConfiguration.getClass();
        ensureUrlBehaviorConfigurationsIsMutable();
        this.urlBehaviorConfigurations_.set(i, common$URLBehaviorConfiguration);
    }

    private void setUrlBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.url_ = byteString.toStringUtf8();
    }

    private void setWebviewFallbackBackground(EnumC6898Z enumC6898Z) {
        this.webviewFallbackBackground_ = enumC6898Z.getNumber();
    }

    private void setWebviewFallbackBackgroundValue(int i) {
        this.webviewFallbackBackground_ = i;
    }

    private void setWebviewFallbackId(String str) {
        str.getClass();
        this.webviewFallbackId_ = str;
    }

    private void setWebviewFallbackIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.webviewFallbackId_ = byteString.toStringUtf8();
    }

    private void setWillUseSdkBridgeOpenFlow(boolean z) {
        this.willUseSdkBridgeOpenFlow_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$WebviewFallback();
            case 2:
                return new C6552a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003\u001b\u0004\f\u0005Ȉ\u0006ဉ\u0000\u0007\u0007\b\f\t\u0007\n\u0007\u000b\f", new Object[]{"bitField0_", "mode_", "url_", "urlBehaviorConfigurations_", Common$URLBehaviorConfiguration.class, "popupBehaviorIos_", "webviewFallbackId_", "channelFromWebview_", "prefersEphemeral_", "webviewFallbackBackground_", "shouldEagerStart_", "willUseSdkBridgeOpenFlow_", "androidSmsVerificationApiType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$WebviewFallback> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$WebviewFallback.class) {
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

    public Channel getChannelFromWebview() {
        Channel channel = this.channelFromWebview_;
        return channel == null ? Channel.getDefaultInstance() : channel;
    }

    public EnumC6902b0 getMode() {
        EnumC6902b0 enumC6902b0ForNumber = EnumC6902b0.forNumber(this.mode_);
        return enumC6902b0ForNumber == null ? EnumC6902b0.UNRECOGNIZED : enumC6902b0ForNumber;
    }

    public int getModeValue() {
        return this.mode_;
    }

    public EnumC6900a0 getPopupBehaviorIos() {
        EnumC6900a0 enumC6900a0ForNumber = EnumC6900a0.forNumber(this.popupBehaviorIos_);
        return enumC6900a0ForNumber == null ? EnumC6900a0.UNRECOGNIZED : enumC6900a0ForNumber;
    }

    public int getPopupBehaviorIosValue() {
        return this.popupBehaviorIos_;
    }

    public boolean getPrefersEphemeral() {
        return this.prefersEphemeral_;
    }

    public boolean getShouldEagerStart() {
        return this.shouldEagerStart_;
    }

    public String getUrl() {
        return this.url_;
    }

    public Common$URLBehaviorConfiguration getUrlBehaviorConfigurations(int i) {
        return this.urlBehaviorConfigurations_.get(i);
    }

    public int getUrlBehaviorConfigurationsCount() {
        return this.urlBehaviorConfigurations_.size();
    }

    public List<Common$URLBehaviorConfiguration> getUrlBehaviorConfigurationsList() {
        return this.urlBehaviorConfigurations_;
    }

    public InterfaceC6896X getUrlBehaviorConfigurationsOrBuilder(int i) {
        return this.urlBehaviorConfigurations_.get(i);
    }

    public List<? extends InterfaceC6896X> getUrlBehaviorConfigurationsOrBuilderList() {
        return this.urlBehaviorConfigurations_;
    }

    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public EnumC6898Z getWebviewFallbackBackground() {
        EnumC6898Z enumC6898ZForNumber = EnumC6898Z.forNumber(this.webviewFallbackBackground_);
        return enumC6898ZForNumber == null ? EnumC6898Z.UNRECOGNIZED : enumC6898ZForNumber;
    }

    public int getWebviewFallbackBackgroundValue() {
        return this.webviewFallbackBackground_;
    }

    public String getWebviewFallbackId() {
        return this.webviewFallbackId_;
    }

    public ByteString getWebviewFallbackIdBytes() {
        return ByteString.copyFromUtf8(this.webviewFallbackId_);
    }

    public boolean getWillUseSdkBridgeOpenFlow() {
        return this.willUseSdkBridgeOpenFlow_;
    }

    public boolean hasChannelFromWebview() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6552a newBuilder(Common$WebviewFallback common$WebviewFallback) {
        return DEFAULT_INSTANCE.createBuilder(common$WebviewFallback);
    }

    public static Common$WebviewFallback parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$WebviewFallback) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$WebviewFallback parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$WebviewFallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$WebviewFallback parseFrom(ByteString byteString) {
        return (Common$WebviewFallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addUrlBehaviorConfigurations(int i, Common$URLBehaviorConfiguration common$URLBehaviorConfiguration) {
        common$URLBehaviorConfiguration.getClass();
        ensureUrlBehaviorConfigurationsIsMutable();
        this.urlBehaviorConfigurations_.add(i, common$URLBehaviorConfiguration);
    }

    public static Common$WebviewFallback parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$WebviewFallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$WebviewFallback parseFrom(byte[] bArr) {
        return (Common$WebviewFallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$WebviewFallback parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$WebviewFallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$WebviewFallback parseFrom(InputStream inputStream) {
        return (Common$WebviewFallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$WebviewFallback parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$WebviewFallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$WebviewFallback parseFrom(CodedInputStream codedInputStream) {
        return (Common$WebviewFallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$WebviewFallback parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$WebviewFallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
