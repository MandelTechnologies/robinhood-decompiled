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
public final class Workflow$LinkWorkflowSecureFirstPartyCookieResponse extends GeneratedMessageLite<Workflow$LinkWorkflowSecureFirstPartyCookieResponse, C6223a> implements MessageLiteOrBuilder {
    private static final Workflow$LinkWorkflowSecureFirstPartyCookieResponse DEFAULT_INSTANCE;
    private static volatile Parser<Workflow$LinkWorkflowSecureFirstPartyCookieResponse> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    private String requestId_ = "";

    /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSecureFirstPartyCookieResponse$a */
    public static final class C6223a extends GeneratedMessageLite.Builder<Workflow$LinkWorkflowSecureFirstPartyCookieResponse, C6223a> implements MessageLiteOrBuilder {
        public C6223a() {
            super(Workflow$LinkWorkflowSecureFirstPartyCookieResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        Workflow$LinkWorkflowSecureFirstPartyCookieResponse workflow$LinkWorkflowSecureFirstPartyCookieResponse = new Workflow$LinkWorkflowSecureFirstPartyCookieResponse();
        DEFAULT_INSTANCE = workflow$LinkWorkflowSecureFirstPartyCookieResponse;
        GeneratedMessageLite.registerDefaultInstance(Workflow$LinkWorkflowSecureFirstPartyCookieResponse.class, workflow$LinkWorkflowSecureFirstPartyCookieResponse);
    }

    private Workflow$LinkWorkflowSecureFirstPartyCookieResponse() {
    }

    private void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    public static Workflow$LinkWorkflowSecureFirstPartyCookieResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6223a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Workflow$LinkWorkflowSecureFirstPartyCookieResponse parseDelimitedFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowSecureFirstPartyCookieResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowSecureFirstPartyCookieResponse parseFrom(ByteBuffer byteBuffer) {
        return (Workflow$LinkWorkflowSecureFirstPartyCookieResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Workflow$LinkWorkflowSecureFirstPartyCookieResponse> parser() {
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
                return new Workflow$LinkWorkflowSecureFirstPartyCookieResponse();
            case 2:
                return new C6223a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"requestId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Workflow$LinkWorkflowSecureFirstPartyCookieResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Workflow$LinkWorkflowSecureFirstPartyCookieResponse.class) {
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

    public static C6223a newBuilder(Workflow$LinkWorkflowSecureFirstPartyCookieResponse workflow$LinkWorkflowSecureFirstPartyCookieResponse) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowSecureFirstPartyCookieResponse);
    }

    public static Workflow$LinkWorkflowSecureFirstPartyCookieResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSecureFirstPartyCookieResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowSecureFirstPartyCookieResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSecureFirstPartyCookieResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowSecureFirstPartyCookieResponse parseFrom(ByteString byteString) {
        return (Workflow$LinkWorkflowSecureFirstPartyCookieResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Workflow$LinkWorkflowSecureFirstPartyCookieResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSecureFirstPartyCookieResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowSecureFirstPartyCookieResponse parseFrom(byte[] bArr) {
        return (Workflow$LinkWorkflowSecureFirstPartyCookieResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Workflow$LinkWorkflowSecureFirstPartyCookieResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSecureFirstPartyCookieResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowSecureFirstPartyCookieResponse parseFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowSecureFirstPartyCookieResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowSecureFirstPartyCookieResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSecureFirstPartyCookieResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowSecureFirstPartyCookieResponse parseFrom(CodedInputStream codedInputStream) {
        return (Workflow$LinkWorkflowSecureFirstPartyCookieResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Workflow$LinkWorkflowSecureFirstPartyCookieResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSecureFirstPartyCookieResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
