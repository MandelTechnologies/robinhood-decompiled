package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$RedirectOptions extends GeneratedMessageLite<Common$RedirectOptions, C6470a> implements MessageLiteOrBuilder {
    private static final Common$RedirectOptions DEFAULT_INSTANCE;
    private static volatile Parser<Common$RedirectOptions> PARSER;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RedirectOptions$a */
    public static final class C6470a extends GeneratedMessageLite.Builder<Common$RedirectOptions, C6470a> implements MessageLiteOrBuilder {
        public C6470a() {
            super(Common$RedirectOptions.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$RedirectOptions common$RedirectOptions = new Common$RedirectOptions();
        DEFAULT_INSTANCE = common$RedirectOptions;
        GeneratedMessageLite.registerDefaultInstance(Common$RedirectOptions.class, common$RedirectOptions);
    }

    private Common$RedirectOptions() {
    }

    public static Common$RedirectOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6470a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$RedirectOptions parseDelimitedFrom(InputStream inputStream) {
        return (Common$RedirectOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$RedirectOptions parseFrom(ByteString byteString) {
        return (Common$RedirectOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$RedirectOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$RedirectOptions();
            case 2:
                return new C6470a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$RedirectOptions> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$RedirectOptions.class) {
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

    public static C6470a newBuilder(Common$RedirectOptions common$RedirectOptions) {
        return DEFAULT_INSTANCE.createBuilder(common$RedirectOptions);
    }

    public static Common$RedirectOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RedirectOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$RedirectOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RedirectOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$RedirectOptions parseFrom(CodedInputStream codedInputStream) {
        return (Common$RedirectOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$RedirectOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RedirectOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$RedirectOptions parseFrom(InputStream inputStream) {
        return (Common$RedirectOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$RedirectOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RedirectOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$RedirectOptions parseFrom(ByteBuffer byteBuffer) {
        return (Common$RedirectOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$RedirectOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RedirectOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$RedirectOptions parseFrom(byte[] bArr) {
        return (Common$RedirectOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$RedirectOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RedirectOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
