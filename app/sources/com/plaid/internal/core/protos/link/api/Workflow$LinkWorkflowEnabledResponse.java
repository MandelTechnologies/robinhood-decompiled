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
public final class Workflow$LinkWorkflowEnabledResponse extends GeneratedMessageLite<Workflow$LinkWorkflowEnabledResponse, C6195a> implements MessageLiteOrBuilder {
    private static final Workflow$LinkWorkflowEnabledResponse DEFAULT_INSTANCE;
    public static final int IS_ENABLED_FIELD_NUMBER = 1;
    public static final int IS_TD_PARALLEL_FETCH_VARIATION_FIELD_NUMBER = 8;
    public static final int LAMBDA_VIEWER_REQUEST_DATA_FIELD_NUMBER = 5;
    private static volatile Parser<Workflow$LinkWorkflowEnabledResponse> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 2;
    public static final int VARIATION_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean isEnabled_;
    private boolean isTdParallelFetchVariation_;
    private LambdaViewerRequestData lambdaViewerRequestData_;
    private String requestId_ = "";
    private String variation_ = "";

    public static final class LambdaViewerRequestData extends GeneratedMessageLite<LambdaViewerRequestData, C6194a> implements MessageLiteOrBuilder {
        public static final int CONTENT_SECURITY_POLICY_FRAME_ANCESTORS_FIELD_NUMBER = 1;
        private static final LambdaViewerRequestData DEFAULT_INSTANCE;
        private static volatile Parser<LambdaViewerRequestData> PARSER;
        private String contentSecurityPolicyFrameAncestors_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse$LambdaViewerRequestData$a */
        public static final class C6194a extends GeneratedMessageLite.Builder<LambdaViewerRequestData, C6194a> implements MessageLiteOrBuilder {
            public C6194a() {
                super(LambdaViewerRequestData.DEFAULT_INSTANCE);
            }
        }

        static {
            LambdaViewerRequestData lambdaViewerRequestData = new LambdaViewerRequestData();
            DEFAULT_INSTANCE = lambdaViewerRequestData;
            GeneratedMessageLite.registerDefaultInstance(LambdaViewerRequestData.class, lambdaViewerRequestData);
        }

        private LambdaViewerRequestData() {
        }

        private void clearContentSecurityPolicyFrameAncestors() {
            this.contentSecurityPolicyFrameAncestors_ = getDefaultInstance().getContentSecurityPolicyFrameAncestors();
        }

        public static LambdaViewerRequestData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6194a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static LambdaViewerRequestData parseDelimitedFrom(InputStream inputStream) {
            return (LambdaViewerRequestData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LambdaViewerRequestData parseFrom(ByteBuffer byteBuffer) {
            return (LambdaViewerRequestData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<LambdaViewerRequestData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setContentSecurityPolicyFrameAncestors(String str) {
            str.getClass();
            this.contentSecurityPolicyFrameAncestors_ = str;
        }

        private void setContentSecurityPolicyFrameAncestorsBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.contentSecurityPolicyFrameAncestors_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                case 1:
                    return new LambdaViewerRequestData();
                case 2:
                    return new C6194a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"contentSecurityPolicyFrameAncestors_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<LambdaViewerRequestData> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (LambdaViewerRequestData.class) {
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

        public String getContentSecurityPolicyFrameAncestors() {
            return this.contentSecurityPolicyFrameAncestors_;
        }

        public ByteString getContentSecurityPolicyFrameAncestorsBytes() {
            return ByteString.copyFromUtf8(this.contentSecurityPolicyFrameAncestors_);
        }

        public static C6194a newBuilder(LambdaViewerRequestData lambdaViewerRequestData) {
            return DEFAULT_INSTANCE.createBuilder(lambdaViewerRequestData);
        }

        public static LambdaViewerRequestData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LambdaViewerRequestData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LambdaViewerRequestData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (LambdaViewerRequestData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static LambdaViewerRequestData parseFrom(ByteString byteString) {
            return (LambdaViewerRequestData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static LambdaViewerRequestData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (LambdaViewerRequestData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static LambdaViewerRequestData parseFrom(byte[] bArr) {
            return (LambdaViewerRequestData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LambdaViewerRequestData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (LambdaViewerRequestData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static LambdaViewerRequestData parseFrom(InputStream inputStream) {
            return (LambdaViewerRequestData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LambdaViewerRequestData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LambdaViewerRequestData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LambdaViewerRequestData parseFrom(CodedInputStream codedInputStream) {
            return (LambdaViewerRequestData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static LambdaViewerRequestData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LambdaViewerRequestData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledResponse$a */
    public static final class C6195a extends GeneratedMessageLite.Builder<Workflow$LinkWorkflowEnabledResponse, C6195a> implements MessageLiteOrBuilder {
        public C6195a() {
            super(Workflow$LinkWorkflowEnabledResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        Workflow$LinkWorkflowEnabledResponse workflow$LinkWorkflowEnabledResponse = new Workflow$LinkWorkflowEnabledResponse();
        DEFAULT_INSTANCE = workflow$LinkWorkflowEnabledResponse;
        GeneratedMessageLite.registerDefaultInstance(Workflow$LinkWorkflowEnabledResponse.class, workflow$LinkWorkflowEnabledResponse);
    }

    private Workflow$LinkWorkflowEnabledResponse() {
    }

    private void clearIsEnabled() {
        this.isEnabled_ = false;
    }

    private void clearIsTdParallelFetchVariation() {
        this.isTdParallelFetchVariation_ = false;
    }

    private void clearLambdaViewerRequestData() {
        this.lambdaViewerRequestData_ = null;
        this.bitField0_ &= -2;
    }

    private void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    private void clearVariation() {
        this.variation_ = getDefaultInstance().getVariation();
    }

    public static Workflow$LinkWorkflowEnabledResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeLambdaViewerRequestData(LambdaViewerRequestData lambdaViewerRequestData) {
        lambdaViewerRequestData.getClass();
        LambdaViewerRequestData lambdaViewerRequestData2 = this.lambdaViewerRequestData_;
        if (lambdaViewerRequestData2 == null || lambdaViewerRequestData2 == LambdaViewerRequestData.getDefaultInstance()) {
            this.lambdaViewerRequestData_ = lambdaViewerRequestData;
        } else {
            this.lambdaViewerRequestData_ = LambdaViewerRequestData.newBuilder(this.lambdaViewerRequestData_).mergeFrom((LambdaViewerRequestData.C6194a) lambdaViewerRequestData).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C6195a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Workflow$LinkWorkflowEnabledResponse parseDelimitedFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowEnabledResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowEnabledResponse parseFrom(ByteBuffer byteBuffer) {
        return (Workflow$LinkWorkflowEnabledResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Workflow$LinkWorkflowEnabledResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setIsEnabled(boolean z) {
        this.isEnabled_ = z;
    }

    private void setIsTdParallelFetchVariation(boolean z) {
        this.isTdParallelFetchVariation_ = z;
    }

    private void setLambdaViewerRequestData(LambdaViewerRequestData lambdaViewerRequestData) {
        lambdaViewerRequestData.getClass();
        this.lambdaViewerRequestData_ = lambdaViewerRequestData;
        this.bitField0_ |= 1;
    }

    private void setRequestId(String str) {
        str.getClass();
        this.requestId_ = str;
    }

    private void setRequestIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.requestId_ = byteString.toStringUtf8();
    }

    private void setVariation(String str) {
        str.getClass();
        this.variation_ = str;
    }

    private void setVariationBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.variation_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
            case 1:
                return new Workflow$LinkWorkflowEnabledResponse();
            case 2:
                return new C6195a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001\u0007\u0002Ȉ\u0004Ȉ\u0005ဉ\u0000\b\u0007", new Object[]{"bitField0_", "isEnabled_", "requestId_", "variation_", "lambdaViewerRequestData_", "isTdParallelFetchVariation_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Workflow$LinkWorkflowEnabledResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Workflow$LinkWorkflowEnabledResponse.class) {
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

    public boolean getIsEnabled() {
        return this.isEnabled_;
    }

    public boolean getIsTdParallelFetchVariation() {
        return this.isTdParallelFetchVariation_;
    }

    public LambdaViewerRequestData getLambdaViewerRequestData() {
        LambdaViewerRequestData lambdaViewerRequestData = this.lambdaViewerRequestData_;
        return lambdaViewerRequestData == null ? LambdaViewerRequestData.getDefaultInstance() : lambdaViewerRequestData;
    }

    public String getRequestId() {
        return this.requestId_;
    }

    public ByteString getRequestIdBytes() {
        return ByteString.copyFromUtf8(this.requestId_);
    }

    public String getVariation() {
        return this.variation_;
    }

    public ByteString getVariationBytes() {
        return ByteString.copyFromUtf8(this.variation_);
    }

    public boolean hasLambdaViewerRequestData() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6195a newBuilder(Workflow$LinkWorkflowEnabledResponse workflow$LinkWorkflowEnabledResponse) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowEnabledResponse);
    }

    public static Workflow$LinkWorkflowEnabledResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEnabledResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEnabledResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEnabledResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEnabledResponse parseFrom(ByteString byteString) {
        return (Workflow$LinkWorkflowEnabledResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Workflow$LinkWorkflowEnabledResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEnabledResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEnabledResponse parseFrom(byte[] bArr) {
        return (Workflow$LinkWorkflowEnabledResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Workflow$LinkWorkflowEnabledResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEnabledResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEnabledResponse parseFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowEnabledResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowEnabledResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEnabledResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEnabledResponse parseFrom(CodedInputStream codedInputStream) {
        return (Workflow$LinkWorkflowEnabledResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Workflow$LinkWorkflowEnabledResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEnabledResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
