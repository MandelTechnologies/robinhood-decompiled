package com.plaid.internal.core.protos.link.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class SilentNetworkAuth$LinkSNATwilioFinishResponse extends GeneratedMessageLite<SilentNetworkAuth$LinkSNATwilioFinishResponse, C6187a> implements MessageLiteOrBuilder {
    private static final SilentNetworkAuth$LinkSNATwilioFinishResponse DEFAULT_INSTANCE;
    private static volatile Parser<SilentNetworkAuth$LinkSNATwilioFinishResponse> PARSER;

    /* renamed from: com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishResponse$a */
    public static final class C6187a extends GeneratedMessageLite.Builder<SilentNetworkAuth$LinkSNATwilioFinishResponse, C6187a> implements MessageLiteOrBuilder {
        public C6187a() {
            super(SilentNetworkAuth$LinkSNATwilioFinishResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        SilentNetworkAuth$LinkSNATwilioFinishResponse silentNetworkAuth$LinkSNATwilioFinishResponse = new SilentNetworkAuth$LinkSNATwilioFinishResponse();
        DEFAULT_INSTANCE = silentNetworkAuth$LinkSNATwilioFinishResponse;
        GeneratedMessageLite.registerDefaultInstance(SilentNetworkAuth$LinkSNATwilioFinishResponse.class, silentNetworkAuth$LinkSNATwilioFinishResponse);
    }

    private SilentNetworkAuth$LinkSNATwilioFinishResponse() {
    }

    public static SilentNetworkAuth$LinkSNATwilioFinishResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6187a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SilentNetworkAuth$LinkSNATwilioFinishResponse parseDelimitedFrom(InputStream inputStream) {
        return (SilentNetworkAuth$LinkSNATwilioFinishResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SilentNetworkAuth$LinkSNATwilioFinishResponse parseFrom(ByteBuffer byteBuffer) {
        return (SilentNetworkAuth$LinkSNATwilioFinishResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SilentNetworkAuth$LinkSNATwilioFinishResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6258d.f2145a[methodToInvoke.ordinal()]) {
            case 1:
                return new SilentNetworkAuth$LinkSNATwilioFinishResponse();
            case 2:
                return new C6187a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SilentNetworkAuth$LinkSNATwilioFinishResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (SilentNetworkAuth$LinkSNATwilioFinishResponse.class) {
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

    public static C6187a newBuilder(SilentNetworkAuth$LinkSNATwilioFinishResponse silentNetworkAuth$LinkSNATwilioFinishResponse) {
        return DEFAULT_INSTANCE.createBuilder(silentNetworkAuth$LinkSNATwilioFinishResponse);
    }

    public static SilentNetworkAuth$LinkSNATwilioFinishResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNATwilioFinishResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNATwilioFinishResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNATwilioFinishResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNATwilioFinishResponse parseFrom(ByteString byteString) {
        return (SilentNetworkAuth$LinkSNATwilioFinishResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SilentNetworkAuth$LinkSNATwilioFinishResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNATwilioFinishResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNATwilioFinishResponse parseFrom(byte[] bArr) {
        return (SilentNetworkAuth$LinkSNATwilioFinishResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SilentNetworkAuth$LinkSNATwilioFinishResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNATwilioFinishResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNATwilioFinishResponse parseFrom(InputStream inputStream) {
        return (SilentNetworkAuth$LinkSNATwilioFinishResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SilentNetworkAuth$LinkSNATwilioFinishResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNATwilioFinishResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNATwilioFinishResponse parseFrom(CodedInputStream codedInputStream) {
        return (SilentNetworkAuth$LinkSNATwilioFinishResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SilentNetworkAuth$LinkSNATwilioFinishResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNATwilioFinishResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
