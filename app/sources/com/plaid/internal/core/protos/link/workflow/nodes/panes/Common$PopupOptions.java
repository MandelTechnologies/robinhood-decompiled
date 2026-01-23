package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.primitives.EnumC7034n;
import com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$PopupOptions extends GeneratedMessageLite<Common$PopupOptions, C6466a> implements MessageLiteOrBuilder {
    private static final Common$PopupOptions DEFAULT_INSTANCE;
    public static final int IOS_SDK_POPUP_BEHAVIOR_FIELD_NUMBER = 1;
    public static final int MOBILE_SDK_URL_OPEN_MESSAGE_FIELD_NUMBER = 2;
    private static volatile Parser<Common$PopupOptions> PARSER;
    private int bitField0_;
    private int iosSdkPopupBehavior_;
    private OauthInitializationOptions$MobileSdkUrlOpenMessage mobileSdkUrlOpenMessage_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions$a */
    public static final class C6466a extends GeneratedMessageLite.Builder<Common$PopupOptions, C6466a> implements MessageLiteOrBuilder {
        public C6466a() {
            super(Common$PopupOptions.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$PopupOptions common$PopupOptions = new Common$PopupOptions();
        DEFAULT_INSTANCE = common$PopupOptions;
        GeneratedMessageLite.registerDefaultInstance(Common$PopupOptions.class, common$PopupOptions);
    }

    private Common$PopupOptions() {
    }

    private void clearIosSdkPopupBehavior() {
        this.iosSdkPopupBehavior_ = 0;
    }

    private void clearMobileSdkUrlOpenMessage() {
        this.mobileSdkUrlOpenMessage_ = null;
        this.bitField0_ &= -2;
    }

    public static Common$PopupOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeMobileSdkUrlOpenMessage(OauthInitializationOptions$MobileSdkUrlOpenMessage oauthInitializationOptions$MobileSdkUrlOpenMessage) {
        oauthInitializationOptions$MobileSdkUrlOpenMessage.getClass();
        OauthInitializationOptions$MobileSdkUrlOpenMessage oauthInitializationOptions$MobileSdkUrlOpenMessage2 = this.mobileSdkUrlOpenMessage_;
        if (oauthInitializationOptions$MobileSdkUrlOpenMessage2 == null || oauthInitializationOptions$MobileSdkUrlOpenMessage2 == OauthInitializationOptions$MobileSdkUrlOpenMessage.getDefaultInstance()) {
            this.mobileSdkUrlOpenMessage_ = oauthInitializationOptions$MobileSdkUrlOpenMessage;
        } else {
            this.mobileSdkUrlOpenMessage_ = OauthInitializationOptions$MobileSdkUrlOpenMessage.newBuilder(this.mobileSdkUrlOpenMessage_).mergeFrom((OauthInitializationOptions$MobileSdkUrlOpenMessage.C6992a) oauthInitializationOptions$MobileSdkUrlOpenMessage).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C6466a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$PopupOptions parseDelimitedFrom(InputStream inputStream) {
        return (Common$PopupOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$PopupOptions parseFrom(ByteBuffer byteBuffer) {
        return (Common$PopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$PopupOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setIosSdkPopupBehavior(EnumC7034n enumC7034n) {
        this.iosSdkPopupBehavior_ = enumC7034n.getNumber();
    }

    private void setIosSdkPopupBehaviorValue(int i) {
        this.iosSdkPopupBehavior_ = i;
    }

    private void setMobileSdkUrlOpenMessage(OauthInitializationOptions$MobileSdkUrlOpenMessage oauthInitializationOptions$MobileSdkUrlOpenMessage) {
        oauthInitializationOptions$MobileSdkUrlOpenMessage.getClass();
        this.mobileSdkUrlOpenMessage_ = oauthInitializationOptions$MobileSdkUrlOpenMessage;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$PopupOptions();
            case 2:
                return new C6466a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "iosSdkPopupBehavior_", "mobileSdkUrlOpenMessage_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$PopupOptions> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$PopupOptions.class) {
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

    public EnumC7034n getIosSdkPopupBehavior() {
        EnumC7034n enumC7034nForNumber = EnumC7034n.forNumber(this.iosSdkPopupBehavior_);
        return enumC7034nForNumber == null ? EnumC7034n.UNRECOGNIZED : enumC7034nForNumber;
    }

    public int getIosSdkPopupBehaviorValue() {
        return this.iosSdkPopupBehavior_;
    }

    public OauthInitializationOptions$MobileSdkUrlOpenMessage getMobileSdkUrlOpenMessage() {
        OauthInitializationOptions$MobileSdkUrlOpenMessage oauthInitializationOptions$MobileSdkUrlOpenMessage = this.mobileSdkUrlOpenMessage_;
        return oauthInitializationOptions$MobileSdkUrlOpenMessage == null ? OauthInitializationOptions$MobileSdkUrlOpenMessage.getDefaultInstance() : oauthInitializationOptions$MobileSdkUrlOpenMessage;
    }

    public boolean hasMobileSdkUrlOpenMessage() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6466a newBuilder(Common$PopupOptions common$PopupOptions) {
        return DEFAULT_INSTANCE.createBuilder(common$PopupOptions);
    }

    public static Common$PopupOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PopupOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$PopupOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$PopupOptions parseFrom(ByteString byteString) {
        return (Common$PopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$PopupOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$PopupOptions parseFrom(byte[] bArr) {
        return (Common$PopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$PopupOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$PopupOptions parseFrom(InputStream inputStream) {
        return (Common$PopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$PopupOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$PopupOptions parseFrom(CodedInputStream codedInputStream) {
        return (Common$PopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$PopupOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
