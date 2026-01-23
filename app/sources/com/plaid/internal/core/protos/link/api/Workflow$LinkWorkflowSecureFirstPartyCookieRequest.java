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
public final class Workflow$LinkWorkflowSecureFirstPartyCookieRequest extends GeneratedMessageLite<Workflow$LinkWorkflowSecureFirstPartyCookieRequest, C6222a> implements MessageLiteOrBuilder {
    public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 1;
    private static final Workflow$LinkWorkflowSecureFirstPartyCookieRequest DEFAULT_INSTANCE;
    private static volatile Parser<Workflow$LinkWorkflowSecureFirstPartyCookieRequest> PARSER = null;
    public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 2;
    private String continuationToken_ = "";
    private String workflowSessionId_ = "";

    /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSecureFirstPartyCookieRequest$a */
    public static final class C6222a extends GeneratedMessageLite.Builder<Workflow$LinkWorkflowSecureFirstPartyCookieRequest, C6222a> implements MessageLiteOrBuilder {
        public C6222a() {
            super(Workflow$LinkWorkflowSecureFirstPartyCookieRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        Workflow$LinkWorkflowSecureFirstPartyCookieRequest workflow$LinkWorkflowSecureFirstPartyCookieRequest = new Workflow$LinkWorkflowSecureFirstPartyCookieRequest();
        DEFAULT_INSTANCE = workflow$LinkWorkflowSecureFirstPartyCookieRequest;
        GeneratedMessageLite.registerDefaultInstance(Workflow$LinkWorkflowSecureFirstPartyCookieRequest.class, workflow$LinkWorkflowSecureFirstPartyCookieRequest);
    }

    private Workflow$LinkWorkflowSecureFirstPartyCookieRequest() {
    }

    private void clearContinuationToken() {
        this.continuationToken_ = getDefaultInstance().getContinuationToken();
    }

    private void clearWorkflowSessionId() {
        this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
    }

    public static Workflow$LinkWorkflowSecureFirstPartyCookieRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6222a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Workflow$LinkWorkflowSecureFirstPartyCookieRequest parseDelimitedFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowSecureFirstPartyCookieRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowSecureFirstPartyCookieRequest parseFrom(ByteBuffer byteBuffer) {
        return (Workflow$LinkWorkflowSecureFirstPartyCookieRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Workflow$LinkWorkflowSecureFirstPartyCookieRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setContinuationToken(String str) {
        str.getClass();
        this.continuationToken_ = str;
    }

    private void setContinuationTokenBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.continuationToken_ = byteString.toStringUtf8();
    }

    private void setWorkflowSessionId(String str) {
        str.getClass();
        this.workflowSessionId_ = str;
    }

    private void setWorkflowSessionIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.workflowSessionId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
            case 1:
                return new Workflow$LinkWorkflowSecureFirstPartyCookieRequest();
            case 2:
                return new C6222a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"continuationToken_", "workflowSessionId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Workflow$LinkWorkflowSecureFirstPartyCookieRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Workflow$LinkWorkflowSecureFirstPartyCookieRequest.class) {
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

    public String getContinuationToken() {
        return this.continuationToken_;
    }

    public ByteString getContinuationTokenBytes() {
        return ByteString.copyFromUtf8(this.continuationToken_);
    }

    public String getWorkflowSessionId() {
        return this.workflowSessionId_;
    }

    public ByteString getWorkflowSessionIdBytes() {
        return ByteString.copyFromUtf8(this.workflowSessionId_);
    }

    public static C6222a newBuilder(Workflow$LinkWorkflowSecureFirstPartyCookieRequest workflow$LinkWorkflowSecureFirstPartyCookieRequest) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowSecureFirstPartyCookieRequest);
    }

    public static Workflow$LinkWorkflowSecureFirstPartyCookieRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSecureFirstPartyCookieRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowSecureFirstPartyCookieRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSecureFirstPartyCookieRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowSecureFirstPartyCookieRequest parseFrom(ByteString byteString) {
        return (Workflow$LinkWorkflowSecureFirstPartyCookieRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Workflow$LinkWorkflowSecureFirstPartyCookieRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSecureFirstPartyCookieRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowSecureFirstPartyCookieRequest parseFrom(byte[] bArr) {
        return (Workflow$LinkWorkflowSecureFirstPartyCookieRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Workflow$LinkWorkflowSecureFirstPartyCookieRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSecureFirstPartyCookieRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowSecureFirstPartyCookieRequest parseFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowSecureFirstPartyCookieRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowSecureFirstPartyCookieRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSecureFirstPartyCookieRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowSecureFirstPartyCookieRequest parseFrom(CodedInputStream codedInputStream) {
        return (Workflow$LinkWorkflowSecureFirstPartyCookieRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Workflow$LinkWorkflowSecureFirstPartyCookieRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSecureFirstPartyCookieRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
