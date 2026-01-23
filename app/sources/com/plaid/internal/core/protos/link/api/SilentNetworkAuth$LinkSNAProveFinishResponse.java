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
public final class SilentNetworkAuth$LinkSNAProveFinishResponse extends GeneratedMessageLite<SilentNetworkAuth$LinkSNAProveFinishResponse, C6183a> implements MessageLiteOrBuilder {
    private static final SilentNetworkAuth$LinkSNAProveFinishResponse DEFAULT_INSTANCE;
    private static volatile Parser<SilentNetworkAuth$LinkSNAProveFinishResponse> PARSER;

    /* renamed from: com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse$a */
    public static final class C6183a extends GeneratedMessageLite.Builder<SilentNetworkAuth$LinkSNAProveFinishResponse, C6183a> implements MessageLiteOrBuilder {
        public C6183a() {
            super(SilentNetworkAuth$LinkSNAProveFinishResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        SilentNetworkAuth$LinkSNAProveFinishResponse silentNetworkAuth$LinkSNAProveFinishResponse = new SilentNetworkAuth$LinkSNAProveFinishResponse();
        DEFAULT_INSTANCE = silentNetworkAuth$LinkSNAProveFinishResponse;
        GeneratedMessageLite.registerDefaultInstance(SilentNetworkAuth$LinkSNAProveFinishResponse.class, silentNetworkAuth$LinkSNAProveFinishResponse);
    }

    private SilentNetworkAuth$LinkSNAProveFinishResponse() {
    }

    public static SilentNetworkAuth$LinkSNAProveFinishResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6183a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SilentNetworkAuth$LinkSNAProveFinishResponse parseDelimitedFrom(InputStream inputStream) {
        return (SilentNetworkAuth$LinkSNAProveFinishResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SilentNetworkAuth$LinkSNAProveFinishResponse parseFrom(ByteBuffer byteBuffer) {
        return (SilentNetworkAuth$LinkSNAProveFinishResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SilentNetworkAuth$LinkSNAProveFinishResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6258d.f2145a[methodToInvoke.ordinal()]) {
            case 1:
                return new SilentNetworkAuth$LinkSNAProveFinishResponse();
            case 2:
                return new C6183a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SilentNetworkAuth$LinkSNAProveFinishResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (SilentNetworkAuth$LinkSNAProveFinishResponse.class) {
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

    public static C6183a newBuilder(SilentNetworkAuth$LinkSNAProveFinishResponse silentNetworkAuth$LinkSNAProveFinishResponse) {
        return DEFAULT_INSTANCE.createBuilder(silentNetworkAuth$LinkSNAProveFinishResponse);
    }

    public static SilentNetworkAuth$LinkSNAProveFinishResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNAProveFinishResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNAProveFinishResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNAProveFinishResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNAProveFinishResponse parseFrom(ByteString byteString) {
        return (SilentNetworkAuth$LinkSNAProveFinishResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SilentNetworkAuth$LinkSNAProveFinishResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNAProveFinishResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNAProveFinishResponse parseFrom(byte[] bArr) {
        return (SilentNetworkAuth$LinkSNAProveFinishResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SilentNetworkAuth$LinkSNAProveFinishResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNAProveFinishResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNAProveFinishResponse parseFrom(InputStream inputStream) {
        return (SilentNetworkAuth$LinkSNAProveFinishResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SilentNetworkAuth$LinkSNAProveFinishResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNAProveFinishResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNAProveFinishResponse parseFrom(CodedInputStream codedInputStream) {
        return (SilentNetworkAuth$LinkSNAProveFinishResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SilentNetworkAuth$LinkSNAProveFinishResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNAProveFinishResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
