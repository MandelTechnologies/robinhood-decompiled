package com.plaid.internal.core.protos.link.api;

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
public final class Workflow$LinkWorkflowEventResponse extends GeneratedMessageLite<Workflow$LinkWorkflowEventResponse, C6197a> implements MessageLiteOrBuilder {
    private static final Workflow$LinkWorkflowEventResponse DEFAULT_INSTANCE;
    private static volatile Parser<Workflow$LinkWorkflowEventResponse> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    private String requestId_ = "";

    /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventResponse$a */
    public static final class C6197a extends GeneratedMessageLite.Builder<Workflow$LinkWorkflowEventResponse, C6197a> implements MessageLiteOrBuilder {
        public C6197a() {
            super(Workflow$LinkWorkflowEventResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        Workflow$LinkWorkflowEventResponse workflow$LinkWorkflowEventResponse = new Workflow$LinkWorkflowEventResponse();
        DEFAULT_INSTANCE = workflow$LinkWorkflowEventResponse;
        GeneratedMessageLite.registerDefaultInstance(Workflow$LinkWorkflowEventResponse.class, workflow$LinkWorkflowEventResponse);
    }

    private Workflow$LinkWorkflowEventResponse() {
    }

    private void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    public static Workflow$LinkWorkflowEventResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6197a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Workflow$LinkWorkflowEventResponse parseDelimitedFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowEventResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowEventResponse parseFrom(ByteBuffer byteBuffer) {
        return (Workflow$LinkWorkflowEventResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Workflow$LinkWorkflowEventResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setRequestId(String str) {
        str.getClass();
        this.requestId_ = str;
    }

    private void setRequestIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.requestId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
            case 1:
                return new Workflow$LinkWorkflowEventResponse();
            case 2:
                return new C6197a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"requestId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Workflow$LinkWorkflowEventResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Workflow$LinkWorkflowEventResponse.class) {
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

    public String getRequestId() {
        return this.requestId_;
    }

    public ByteString getRequestIdBytes() {
        return ByteString.copyFromUtf8(this.requestId_);
    }

    public static C6197a newBuilder(Workflow$LinkWorkflowEventResponse workflow$LinkWorkflowEventResponse) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowEventResponse);
    }

    public static Workflow$LinkWorkflowEventResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEventResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEventResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEventResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEventResponse parseFrom(ByteString byteString) {
        return (Workflow$LinkWorkflowEventResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Workflow$LinkWorkflowEventResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEventResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEventResponse parseFrom(byte[] bArr) {
        return (Workflow$LinkWorkflowEventResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Workflow$LinkWorkflowEventResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEventResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEventResponse parseFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowEventResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowEventResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEventResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEventResponse parseFrom(CodedInputStream codedInputStream) {
        return (Workflow$LinkWorkflowEventResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Workflow$LinkWorkflowEventResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEventResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
