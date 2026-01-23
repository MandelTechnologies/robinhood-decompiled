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
public final class OauthInitializationOptions$MobileSdkUrlOpenMessage extends GeneratedMessageLite<OauthInitializationOptions$MobileSdkUrlOpenMessage, C6992a> implements MessageLiteOrBuilder {
    public static final int ANDROID_PARTIAL_CUSTOM_TAB_SCREEN_HEIGHT_PIXELS_FIELD_NUMBER = 3;
    public static final int ANDROID_URL_OPEN_BEHAVIOR_FIELD_NUMBER = 2;
    public static final int CLOSE_URI_FIELD_NUMBER = 4;
    private static final OauthInitializationOptions$MobileSdkUrlOpenMessage DEFAULT_INSTANCE;
    public static final int IOS_URL_OPEN_BEHAVIOR_FIELD_NUMBER = 1;
    private static volatile Parser<OauthInitializationOptions$MobileSdkUrlOpenMessage> PARSER;
    private int androidPartialCustomTabScreenHeightPixels_;
    private int androidUrlOpenBehavior_;
    private String closeUri_ = "";
    private int iosUrlOpenBehavior_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage$a */
    public static final class C6992a extends GeneratedMessageLite.Builder<OauthInitializationOptions$MobileSdkUrlOpenMessage, C6992a> implements MessageLiteOrBuilder {
        public C6992a() {
            super(OauthInitializationOptions$MobileSdkUrlOpenMessage.DEFAULT_INSTANCE);
        }
    }

    static {
        OauthInitializationOptions$MobileSdkUrlOpenMessage oauthInitializationOptions$MobileSdkUrlOpenMessage = new OauthInitializationOptions$MobileSdkUrlOpenMessage();
        DEFAULT_INSTANCE = oauthInitializationOptions$MobileSdkUrlOpenMessage;
        GeneratedMessageLite.registerDefaultInstance(OauthInitializationOptions$MobileSdkUrlOpenMessage.class, oauthInitializationOptions$MobileSdkUrlOpenMessage);
    }

    private OauthInitializationOptions$MobileSdkUrlOpenMessage() {
    }

    private void clearAndroidPartialCustomTabScreenHeightPixels() {
        this.androidPartialCustomTabScreenHeightPixels_ = 0;
    }

    private void clearAndroidUrlOpenBehavior() {
        this.androidUrlOpenBehavior_ = 0;
    }

    private void clearCloseUri() {
        this.closeUri_ = getDefaultInstance().getCloseUri();
    }

    private void clearIosUrlOpenBehavior() {
        this.iosUrlOpenBehavior_ = 0;
    }

    public static OauthInitializationOptions$MobileSdkUrlOpenMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6992a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OauthInitializationOptions$MobileSdkUrlOpenMessage parseDelimitedFrom(InputStream inputStream) {
        return (OauthInitializationOptions$MobileSdkUrlOpenMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(ByteBuffer byteBuffer) {
        return (OauthInitializationOptions$MobileSdkUrlOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OauthInitializationOptions$MobileSdkUrlOpenMessage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAndroidPartialCustomTabScreenHeightPixels(int i) {
        this.androidPartialCustomTabScreenHeightPixels_ = i;
    }

    private void setAndroidUrlOpenBehavior(EnumC7033m enumC7033m) {
        this.androidUrlOpenBehavior_ = enumC7033m.getNumber();
    }

    private void setAndroidUrlOpenBehaviorValue(int i) {
        this.androidUrlOpenBehavior_ = i;
    }

    private void setCloseUri(String str) {
        str.getClass();
        this.closeUri_ = str;
    }

    private void setCloseUriBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.closeUri_ = byteString.toStringUtf8();
    }

    private void setIosUrlOpenBehavior(EnumC7035o enumC7035o) {
        this.iosUrlOpenBehavior_ = enumC7035o.getNumber();
    }

    private void setIosUrlOpenBehaviorValue(int i) {
        this.iosUrlOpenBehavior_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7032l.f2680a[methodToInvoke.ordinal()]) {
            case 1:
                return new OauthInitializationOptions$MobileSdkUrlOpenMessage();
            case 2:
                return new C6992a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ", new Object[]{"iosUrlOpenBehavior_", "androidUrlOpenBehavior_", "androidPartialCustomTabScreenHeightPixels_", "closeUri_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OauthInitializationOptions$MobileSdkUrlOpenMessage> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (OauthInitializationOptions$MobileSdkUrlOpenMessage.class) {
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

    public int getAndroidPartialCustomTabScreenHeightPixels() {
        return this.androidPartialCustomTabScreenHeightPixels_;
    }

    public EnumC7033m getAndroidUrlOpenBehavior() {
        EnumC7033m enumC7033mForNumber = EnumC7033m.forNumber(this.androidUrlOpenBehavior_);
        return enumC7033mForNumber == null ? EnumC7033m.UNRECOGNIZED : enumC7033mForNumber;
    }

    public int getAndroidUrlOpenBehaviorValue() {
        return this.androidUrlOpenBehavior_;
    }

    public String getCloseUri() {
        return this.closeUri_;
    }

    public ByteString getCloseUriBytes() {
        return ByteString.copyFromUtf8(this.closeUri_);
    }

    public EnumC7035o getIosUrlOpenBehavior() {
        EnumC7035o enumC7035oForNumber = EnumC7035o.forNumber(this.iosUrlOpenBehavior_);
        return enumC7035oForNumber == null ? EnumC7035o.UNRECOGNIZED : enumC7035oForNumber;
    }

    public int getIosUrlOpenBehaviorValue() {
        return this.iosUrlOpenBehavior_;
    }

    public static C6992a newBuilder(OauthInitializationOptions$MobileSdkUrlOpenMessage oauthInitializationOptions$MobileSdkUrlOpenMessage) {
        return DEFAULT_INSTANCE.createBuilder(oauthInitializationOptions$MobileSdkUrlOpenMessage);
    }

    public static OauthInitializationOptions$MobileSdkUrlOpenMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (OauthInitializationOptions$MobileSdkUrlOpenMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (OauthInitializationOptions$MobileSdkUrlOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(ByteString byteString) {
        return (OauthInitializationOptions$MobileSdkUrlOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (OauthInitializationOptions$MobileSdkUrlOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(byte[] bArr) {
        return (OauthInitializationOptions$MobileSdkUrlOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (OauthInitializationOptions$MobileSdkUrlOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(InputStream inputStream) {
        return (OauthInitializationOptions$MobileSdkUrlOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (OauthInitializationOptions$MobileSdkUrlOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(CodedInputStream codedInputStream) {
        return (OauthInitializationOptions$MobileSdkUrlOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (OauthInitializationOptions$MobileSdkUrlOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
