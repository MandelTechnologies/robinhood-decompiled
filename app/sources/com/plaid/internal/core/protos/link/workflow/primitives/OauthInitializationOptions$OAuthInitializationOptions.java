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
public final class OauthInitializationOptions$OAuthInitializationOptions extends GeneratedMessageLite<OauthInitializationOptions$OAuthInitializationOptions, C6993a> implements MessageLiteOrBuilder {
    private static final OauthInitializationOptions$OAuthInitializationOptions DEFAULT_INSTANCE;
    public static final int IOS_SDK_POPUP_BEHAVIOR_FIELD_NUMBER = 3;
    public static final int OAUTH_OPEN_METHOD_FIELD_NUMBER = 2;
    private static volatile Parser<OauthInitializationOptions$OAuthInitializationOptions> PARSER;
    private int iosSdkPopupBehavior_;
    private String oauthOpenMethod_ = "";

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions$a */
    public static final class C6993a extends GeneratedMessageLite.Builder<OauthInitializationOptions$OAuthInitializationOptions, C6993a> implements MessageLiteOrBuilder {
        public C6993a() {
            super(OauthInitializationOptions$OAuthInitializationOptions.DEFAULT_INSTANCE);
        }
    }

    static {
        OauthInitializationOptions$OAuthInitializationOptions oauthInitializationOptions$OAuthInitializationOptions = new OauthInitializationOptions$OAuthInitializationOptions();
        DEFAULT_INSTANCE = oauthInitializationOptions$OAuthInitializationOptions;
        GeneratedMessageLite.registerDefaultInstance(OauthInitializationOptions$OAuthInitializationOptions.class, oauthInitializationOptions$OAuthInitializationOptions);
    }

    private OauthInitializationOptions$OAuthInitializationOptions() {
    }

    private void clearIosSdkPopupBehavior() {
        this.iosSdkPopupBehavior_ = 0;
    }

    private void clearOauthOpenMethod() {
        this.oauthOpenMethod_ = getDefaultInstance().getOauthOpenMethod();
    }

    public static OauthInitializationOptions$OAuthInitializationOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6993a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OauthInitializationOptions$OAuthInitializationOptions parseDelimitedFrom(InputStream inputStream) {
        return (OauthInitializationOptions$OAuthInitializationOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OauthInitializationOptions$OAuthInitializationOptions parseFrom(ByteBuffer byteBuffer) {
        return (OauthInitializationOptions$OAuthInitializationOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OauthInitializationOptions$OAuthInitializationOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setIosSdkPopupBehavior(EnumC7034n enumC7034n) {
        this.iosSdkPopupBehavior_ = enumC7034n.getNumber();
    }

    private void setIosSdkPopupBehaviorValue(int i) {
        this.iosSdkPopupBehavior_ = i;
    }

    private void setOauthOpenMethod(String str) {
        str.getClass();
        this.oauthOpenMethod_ = str;
    }

    private void setOauthOpenMethodBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.oauthOpenMethod_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7032l.f2680a[methodToInvoke.ordinal()]) {
            case 1:
                return new OauthInitializationOptions$OAuthInitializationOptions();
            case 2:
                return new C6993a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\f", new Object[]{"oauthOpenMethod_", "iosSdkPopupBehavior_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OauthInitializationOptions$OAuthInitializationOptions> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (OauthInitializationOptions$OAuthInitializationOptions.class) {
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

    public String getOauthOpenMethod() {
        return this.oauthOpenMethod_;
    }

    public ByteString getOauthOpenMethodBytes() {
        return ByteString.copyFromUtf8(this.oauthOpenMethod_);
    }

    public static C6993a newBuilder(OauthInitializationOptions$OAuthInitializationOptions oauthInitializationOptions$OAuthInitializationOptions) {
        return DEFAULT_INSTANCE.createBuilder(oauthInitializationOptions$OAuthInitializationOptions);
    }

    public static OauthInitializationOptions$OAuthInitializationOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (OauthInitializationOptions$OAuthInitializationOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OauthInitializationOptions$OAuthInitializationOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (OauthInitializationOptions$OAuthInitializationOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OauthInitializationOptions$OAuthInitializationOptions parseFrom(ByteString byteString) {
        return (OauthInitializationOptions$OAuthInitializationOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OauthInitializationOptions$OAuthInitializationOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (OauthInitializationOptions$OAuthInitializationOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OauthInitializationOptions$OAuthInitializationOptions parseFrom(byte[] bArr) {
        return (OauthInitializationOptions$OAuthInitializationOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OauthInitializationOptions$OAuthInitializationOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (OauthInitializationOptions$OAuthInitializationOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OauthInitializationOptions$OAuthInitializationOptions parseFrom(InputStream inputStream) {
        return (OauthInitializationOptions$OAuthInitializationOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OauthInitializationOptions$OAuthInitializationOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (OauthInitializationOptions$OAuthInitializationOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OauthInitializationOptions$OAuthInitializationOptions parseFrom(CodedInputStream codedInputStream) {
        return (OauthInitializationOptions$OAuthInitializationOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OauthInitializationOptions$OAuthInitializationOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (OauthInitializationOptions$OAuthInitializationOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
