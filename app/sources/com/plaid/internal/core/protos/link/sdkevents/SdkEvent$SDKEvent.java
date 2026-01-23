package com.plaid.internal.core.protos.link.sdkevents;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class SdkEvent$SDKEvent extends GeneratedMessageLite<SdkEvent$SDKEvent, C6271a> implements InterfaceC6275b {
    private static final SdkEvent$SDKEvent DEFAULT_INSTANCE;
    public static final int DELAY_MS_FIELD_NUMBER = 4;
    public static final int EVENT_NAME_FIELD_NUMBER = 1;
    public static final int METADATA_FIELD_NUMBER = 2;
    private static volatile Parser<SdkEvent$SDKEvent> PARSER = null;
    public static final int QUEUE_BEHAVIOR_FIELD_NUMBER = 5;
    public static final int WEBVIEW_REDIRECT_URI_FIELD_NUMBER = 3;
    private int bitField0_;
    private Metadata metadata_;
    private Object triggerBehavior_;
    private int triggerBehaviorCase_ = 0;
    private String eventName_ = "";
    private String webviewRedirectUri_ = "";

    public static final class Metadata extends GeneratedMessageLite<Metadata, C6270a> implements MessageLiteOrBuilder {
        public static final int ACCOUNT_NUMBER_MASK_FIELD_NUMBER = 17;
        public static final int BRAND_NAME_FIELD_NUMBER = 14;
        private static final Metadata DEFAULT_INSTANCE;
        public static final int ERROR_CODE_FIELD_NUMBER = 1;
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
        public static final int ERROR_TYPE_FIELD_NUMBER = 3;
        public static final int EXIT_STATUS_FIELD_NUMBER = 4;
        public static final int INSTITUTION_ID_FIELD_NUMBER = 5;
        public static final int INSTITUTION_NAME_FIELD_NUMBER = 6;
        public static final int INSTITUTION_SEARCH_QUERY_FIELD_NUMBER = 7;
        public static final int IS_UPDATE_MODE_FIELD_NUMBER = 19;
        public static final int LINK_SESSION_ID_FIELD_NUMBER = 9;
        public static final int MATCH_REASON_FIELD_NUMBER = 15;
        public static final int MFA_TYPE_FIELD_NUMBER = 10;
        private static volatile Parser<Metadata> PARSER = null;
        public static final int REQUEST_ID_FIELD_NUMBER = 8;
        public static final int ROUTING_NUMBER_FIELD_NUMBER = 16;
        public static final int SELECTION_FIELD_NUMBER = 13;
        public static final int TIMESTAMP_FIELD_NUMBER = 12;
        public static final int VIEW_NAME_FIELD_NUMBER = 11;
        public static final int VIEW_VARIANT_FIELD_NUMBER = 18;
        private String errorCode_ = "";
        private String errorMessage_ = "";
        private String errorType_ = "";
        private String exitStatus_ = "";
        private String institutionId_ = "";
        private String institutionName_ = "";
        private String institutionSearchQuery_ = "";
        private String requestId_ = "";
        private String linkSessionId_ = "";
        private String mfaType_ = "";
        private String viewName_ = "";
        private String timestamp_ = "";
        private String selection_ = "";
        private String brandName_ = "";
        private String matchReason_ = "";
        private String routingNumber_ = "";
        private String accountNumberMask_ = "";
        private String viewVariant_ = "";
        private String isUpdateMode_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent$Metadata$a */
        public static final class C6270a extends GeneratedMessageLite.Builder<Metadata, C6270a> implements MessageLiteOrBuilder {
            public C6270a() {
                super(Metadata.DEFAULT_INSTANCE);
            }
        }

        static {
            Metadata metadata = new Metadata();
            DEFAULT_INSTANCE = metadata;
            GeneratedMessageLite.registerDefaultInstance(Metadata.class, metadata);
        }

        private Metadata() {
        }

        private void clearAccountNumberMask() {
            this.accountNumberMask_ = getDefaultInstance().getAccountNumberMask();
        }

        private void clearBrandName() {
            this.brandName_ = getDefaultInstance().getBrandName();
        }

        private void clearErrorCode() {
            this.errorCode_ = getDefaultInstance().getErrorCode();
        }

        private void clearErrorMessage() {
            this.errorMessage_ = getDefaultInstance().getErrorMessage();
        }

        private void clearErrorType() {
            this.errorType_ = getDefaultInstance().getErrorType();
        }

        private void clearExitStatus() {
            this.exitStatus_ = getDefaultInstance().getExitStatus();
        }

        private void clearInstitutionId() {
            this.institutionId_ = getDefaultInstance().getInstitutionId();
        }

        private void clearInstitutionName() {
            this.institutionName_ = getDefaultInstance().getInstitutionName();
        }

        private void clearInstitutionSearchQuery() {
            this.institutionSearchQuery_ = getDefaultInstance().getInstitutionSearchQuery();
        }

        private void clearIsUpdateMode() {
            this.isUpdateMode_ = getDefaultInstance().getIsUpdateMode();
        }

        private void clearLinkSessionId() {
            this.linkSessionId_ = getDefaultInstance().getLinkSessionId();
        }

        private void clearMatchReason() {
            this.matchReason_ = getDefaultInstance().getMatchReason();
        }

        private void clearMfaType() {
            this.mfaType_ = getDefaultInstance().getMfaType();
        }

        private void clearRequestId() {
            this.requestId_ = getDefaultInstance().getRequestId();
        }

        private void clearRoutingNumber() {
            this.routingNumber_ = getDefaultInstance().getRoutingNumber();
        }

        private void clearSelection() {
            this.selection_ = getDefaultInstance().getSelection();
        }

        private void clearTimestamp() {
            this.timestamp_ = getDefaultInstance().getTimestamp();
        }

        private void clearViewName() {
            this.viewName_ = getDefaultInstance().getViewName();
        }

        private void clearViewVariant() {
            this.viewVariant_ = getDefaultInstance().getViewVariant();
        }

        public static Metadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6270a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Metadata parseDelimitedFrom(InputStream inputStream) {
            return (Metadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Metadata parseFrom(ByteBuffer byteBuffer) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Metadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAccountNumberMask(String str) {
            str.getClass();
            this.accountNumberMask_ = str;
        }

        private void setAccountNumberMaskBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.accountNumberMask_ = byteString.toStringUtf8();
        }

        private void setBrandName(String str) {
            str.getClass();
            this.brandName_ = str;
        }

        private void setBrandNameBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.brandName_ = byteString.toStringUtf8();
        }

        private void setErrorCode(String str) {
            str.getClass();
            this.errorCode_ = str;
        }

        private void setErrorCodeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.errorCode_ = byteString.toStringUtf8();
        }

        private void setErrorMessage(String str) {
            str.getClass();
            this.errorMessage_ = str;
        }

        private void setErrorMessageBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.errorMessage_ = byteString.toStringUtf8();
        }

        private void setErrorType(String str) {
            str.getClass();
            this.errorType_ = str;
        }

        private void setErrorTypeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.errorType_ = byteString.toStringUtf8();
        }

        private void setExitStatus(String str) {
            str.getClass();
            this.exitStatus_ = str;
        }

        private void setExitStatusBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.exitStatus_ = byteString.toStringUtf8();
        }

        private void setInstitutionId(String str) {
            str.getClass();
            this.institutionId_ = str;
        }

        private void setInstitutionIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.institutionId_ = byteString.toStringUtf8();
        }

        private void setInstitutionName(String str) {
            str.getClass();
            this.institutionName_ = str;
        }

        private void setInstitutionNameBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.institutionName_ = byteString.toStringUtf8();
        }

        private void setInstitutionSearchQuery(String str) {
            str.getClass();
            this.institutionSearchQuery_ = str;
        }

        private void setInstitutionSearchQueryBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.institutionSearchQuery_ = byteString.toStringUtf8();
        }

        private void setIsUpdateMode(String str) {
            str.getClass();
            this.isUpdateMode_ = str;
        }

        private void setIsUpdateModeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.isUpdateMode_ = byteString.toStringUtf8();
        }

        private void setLinkSessionId(String str) {
            str.getClass();
            this.linkSessionId_ = str;
        }

        private void setLinkSessionIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.linkSessionId_ = byteString.toStringUtf8();
        }

        private void setMatchReason(String str) {
            str.getClass();
            this.matchReason_ = str;
        }

        private void setMatchReasonBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.matchReason_ = byteString.toStringUtf8();
        }

        private void setMfaType(String str) {
            str.getClass();
            this.mfaType_ = str;
        }

        private void setMfaTypeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.mfaType_ = byteString.toStringUtf8();
        }

        private void setRequestId(String str) {
            str.getClass();
            this.requestId_ = str;
        }

        private void setRequestIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.requestId_ = byteString.toStringUtf8();
        }

        private void setRoutingNumber(String str) {
            str.getClass();
            this.routingNumber_ = str;
        }

        private void setRoutingNumberBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.routingNumber_ = byteString.toStringUtf8();
        }

        private void setSelection(String str) {
            str.getClass();
            this.selection_ = str;
        }

        private void setSelectionBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.selection_ = byteString.toStringUtf8();
        }

        private void setTimestamp(String str) {
            str.getClass();
            this.timestamp_ = str;
        }

        private void setTimestampBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.timestamp_ = byteString.toStringUtf8();
        }

        private void setViewName(String str) {
            str.getClass();
            this.viewName_ = str;
        }

        private void setViewNameBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.viewName_ = byteString.toStringUtf8();
        }

        private void setViewVariant(String str) {
            str.getClass();
            this.viewVariant_ = str;
        }

        private void setViewVariantBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.viewVariant_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6274a.f2163a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Metadata();
                case 2:
                    return new C6270a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0013\u0000\u0000\u0001\u0013\u0013\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ", new Object[]{"errorCode_", "errorMessage_", "errorType_", "exitStatus_", "institutionId_", "institutionName_", "institutionSearchQuery_", "requestId_", "linkSessionId_", "mfaType_", "viewName_", "timestamp_", "selection_", "brandName_", "matchReason_", "routingNumber_", "accountNumberMask_", "viewVariant_", "isUpdateMode_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Metadata> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Metadata.class) {
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

        public String getAccountNumberMask() {
            return this.accountNumberMask_;
        }

        public ByteString getAccountNumberMaskBytes() {
            return ByteString.copyFromUtf8(this.accountNumberMask_);
        }

        public String getBrandName() {
            return this.brandName_;
        }

        public ByteString getBrandNameBytes() {
            return ByteString.copyFromUtf8(this.brandName_);
        }

        public String getErrorCode() {
            return this.errorCode_;
        }

        public ByteString getErrorCodeBytes() {
            return ByteString.copyFromUtf8(this.errorCode_);
        }

        public String getErrorMessage() {
            return this.errorMessage_;
        }

        public ByteString getErrorMessageBytes() {
            return ByteString.copyFromUtf8(this.errorMessage_);
        }

        public String getErrorType() {
            return this.errorType_;
        }

        public ByteString getErrorTypeBytes() {
            return ByteString.copyFromUtf8(this.errorType_);
        }

        public String getExitStatus() {
            return this.exitStatus_;
        }

        public ByteString getExitStatusBytes() {
            return ByteString.copyFromUtf8(this.exitStatus_);
        }

        public String getInstitutionId() {
            return this.institutionId_;
        }

        public ByteString getInstitutionIdBytes() {
            return ByteString.copyFromUtf8(this.institutionId_);
        }

        public String getInstitutionName() {
            return this.institutionName_;
        }

        public ByteString getInstitutionNameBytes() {
            return ByteString.copyFromUtf8(this.institutionName_);
        }

        public String getInstitutionSearchQuery() {
            return this.institutionSearchQuery_;
        }

        public ByteString getInstitutionSearchQueryBytes() {
            return ByteString.copyFromUtf8(this.institutionSearchQuery_);
        }

        public String getIsUpdateMode() {
            return this.isUpdateMode_;
        }

        public ByteString getIsUpdateModeBytes() {
            return ByteString.copyFromUtf8(this.isUpdateMode_);
        }

        public String getLinkSessionId() {
            return this.linkSessionId_;
        }

        public ByteString getLinkSessionIdBytes() {
            return ByteString.copyFromUtf8(this.linkSessionId_);
        }

        public String getMatchReason() {
            return this.matchReason_;
        }

        public ByteString getMatchReasonBytes() {
            return ByteString.copyFromUtf8(this.matchReason_);
        }

        public String getMfaType() {
            return this.mfaType_;
        }

        public ByteString getMfaTypeBytes() {
            return ByteString.copyFromUtf8(this.mfaType_);
        }

        public String getRequestId() {
            return this.requestId_;
        }

        public ByteString getRequestIdBytes() {
            return ByteString.copyFromUtf8(this.requestId_);
        }

        public String getRoutingNumber() {
            return this.routingNumber_;
        }

        public ByteString getRoutingNumberBytes() {
            return ByteString.copyFromUtf8(this.routingNumber_);
        }

        public String getSelection() {
            return this.selection_;
        }

        public ByteString getSelectionBytes() {
            return ByteString.copyFromUtf8(this.selection_);
        }

        public String getTimestamp() {
            return this.timestamp_;
        }

        public ByteString getTimestampBytes() {
            return ByteString.copyFromUtf8(this.timestamp_);
        }

        public String getViewName() {
            return this.viewName_;
        }

        public ByteString getViewNameBytes() {
            return ByteString.copyFromUtf8(this.viewName_);
        }

        public String getViewVariant() {
            return this.viewVariant_;
        }

        public ByteString getViewVariantBytes() {
            return ByteString.copyFromUtf8(this.viewVariant_);
        }

        public static C6270a newBuilder(Metadata metadata) {
            return DEFAULT_INSTANCE.createBuilder(metadata);
        }

        public static Metadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Metadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Metadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Metadata parseFrom(ByteString byteString) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Metadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Metadata parseFrom(byte[] bArr) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Metadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Metadata parseFrom(InputStream inputStream) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Metadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Metadata parseFrom(CodedInputStream codedInputStream) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Metadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent$a */
    public static final class C6271a extends GeneratedMessageLite.Builder<SdkEvent$SDKEvent, C6271a> implements InterfaceC6275b {
        public C6271a() {
            super(SdkEvent$SDKEvent.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent$b */
    public enum EnumC6272b implements Internal.EnumLite {
        QUEUE_BEHAVIOR_UNKNOWN(0),
        QUEUE_BEHAVIOR_NO_ENQUEUE(1),
        QUEUE_BEHAVIOR_ENQUEUE(2),
        QUEUE_BEHAVIOR_ENQUEUE_AND_FLUSH(3),
        UNRECOGNIZED(-1);

        public static final int QUEUE_BEHAVIOR_ENQUEUE_AND_FLUSH_VALUE = 3;
        public static final int QUEUE_BEHAVIOR_ENQUEUE_VALUE = 2;
        public static final int QUEUE_BEHAVIOR_NO_ENQUEUE_VALUE = 1;
        public static final int QUEUE_BEHAVIOR_UNKNOWN_VALUE = 0;

        /* renamed from: b */
        public static final a f2157b = new a();

        /* renamed from: a */
        public final int f2159a;

        /* renamed from: com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent$b$a */
        public class a implements Internal.EnumLiteMap<EnumC6272b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6272b.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent$b$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2160a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6272b.forNumber(i) != null;
            }
        }

        EnumC6272b(int i) {
            this.f2159a = i;
        }

        public static EnumC6272b forNumber(int i) {
            if (i == 0) {
                return QUEUE_BEHAVIOR_UNKNOWN;
            }
            if (i == 1) {
                return QUEUE_BEHAVIOR_NO_ENQUEUE;
            }
            if (i == 2) {
                return QUEUE_BEHAVIOR_ENQUEUE;
            }
            if (i != 3) {
                return null;
            }
            return QUEUE_BEHAVIOR_ENQUEUE_AND_FLUSH;
        }

        public static Internal.EnumLiteMap<EnumC6272b> internalGetValueMap() {
            return f2157b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2160a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2159a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC6272b valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent$c */
    public enum EnumC6273c {
        DELAY_MS(4),
        QUEUE_BEHAVIOR(5),
        TRIGGERBEHAVIOR_NOT_SET(0);


        /* renamed from: a */
        public final int f2162a;

        EnumC6273c(int i) {
            this.f2162a = i;
        }

        public static EnumC6273c forNumber(int i) {
            if (i == 0) {
                return TRIGGERBEHAVIOR_NOT_SET;
            }
            if (i == 4) {
                return DELAY_MS;
            }
            if (i != 5) {
                return null;
            }
            return QUEUE_BEHAVIOR;
        }

        public int getNumber() {
            return this.f2162a;
        }

        @Deprecated
        public static EnumC6273c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        SdkEvent$SDKEvent sdkEvent$SDKEvent = new SdkEvent$SDKEvent();
        DEFAULT_INSTANCE = sdkEvent$SDKEvent;
        GeneratedMessageLite.registerDefaultInstance(SdkEvent$SDKEvent.class, sdkEvent$SDKEvent);
    }

    private SdkEvent$SDKEvent() {
    }

    private void clearDelayMs() {
        if (this.triggerBehaviorCase_ == 4) {
            this.triggerBehaviorCase_ = 0;
            this.triggerBehavior_ = null;
        }
    }

    private void clearEventName() {
        this.eventName_ = getDefaultInstance().getEventName();
    }

    private void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -2;
    }

    private void clearQueueBehavior() {
        if (this.triggerBehaviorCase_ == 5) {
            this.triggerBehaviorCase_ = 0;
            this.triggerBehavior_ = null;
        }
    }

    private void clearTriggerBehavior() {
        this.triggerBehaviorCase_ = 0;
        this.triggerBehavior_ = null;
    }

    private void clearWebviewRedirectUri() {
        this.webviewRedirectUri_ = getDefaultInstance().getWebviewRedirectUri();
    }

    public static SdkEvent$SDKEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeMetadata(Metadata metadata) {
        metadata.getClass();
        Metadata metadata2 = this.metadata_;
        if (metadata2 == null || metadata2 == Metadata.getDefaultInstance()) {
            this.metadata_ = metadata;
        } else {
            this.metadata_ = Metadata.newBuilder(this.metadata_).mergeFrom((Metadata.C6270a) metadata).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C6271a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SdkEvent$SDKEvent parseDelimitedFrom(InputStream inputStream) {
        return (SdkEvent$SDKEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SdkEvent$SDKEvent parseFrom(ByteBuffer byteBuffer) {
        return (SdkEvent$SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SdkEvent$SDKEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDelayMs(int i) {
        this.triggerBehaviorCase_ = 4;
        this.triggerBehavior_ = Integer.valueOf(i);
    }

    private void setEventName(String str) {
        str.getClass();
        this.eventName_ = str;
    }

    private void setEventNameBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.eventName_ = byteString.toStringUtf8();
    }

    private void setMetadata(Metadata metadata) {
        metadata.getClass();
        this.metadata_ = metadata;
        this.bitField0_ |= 1;
    }

    private void setQueueBehavior(EnumC6272b enumC6272b) {
        this.triggerBehavior_ = Integer.valueOf(enumC6272b.getNumber());
        this.triggerBehaviorCase_ = 5;
    }

    private void setQueueBehaviorValue(int i) {
        this.triggerBehaviorCase_ = 5;
        this.triggerBehavior_ = Integer.valueOf(i);
    }

    private void setWebviewRedirectUri(String str) {
        str.getClass();
        this.webviewRedirectUri_ = str;
    }

    private void setWebviewRedirectUriBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.webviewRedirectUri_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6274a.f2163a[methodToInvoke.ordinal()]) {
            case 1:
                return new SdkEvent$SDKEvent();
            case 2:
                return new C6271a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u00047\u0000\u0005?\u0000", new Object[]{"triggerBehavior_", "triggerBehaviorCase_", "bitField0_", "eventName_", "metadata_", "webviewRedirectUri_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SdkEvent$SDKEvent> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (SdkEvent$SDKEvent.class) {
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

    public int getDelayMs() {
        if (this.triggerBehaviorCase_ == 4) {
            return ((Integer) this.triggerBehavior_).intValue();
        }
        return 0;
    }

    public String getEventName() {
        return this.eventName_;
    }

    public ByteString getEventNameBytes() {
        return ByteString.copyFromUtf8(this.eventName_);
    }

    public Metadata getMetadata() {
        Metadata metadata = this.metadata_;
        return metadata == null ? Metadata.getDefaultInstance() : metadata;
    }

    public EnumC6272b getQueueBehavior() {
        if (this.triggerBehaviorCase_ != 5) {
            return EnumC6272b.QUEUE_BEHAVIOR_UNKNOWN;
        }
        EnumC6272b enumC6272bForNumber = EnumC6272b.forNumber(((Integer) this.triggerBehavior_).intValue());
        return enumC6272bForNumber == null ? EnumC6272b.UNRECOGNIZED : enumC6272bForNumber;
    }

    public int getQueueBehaviorValue() {
        if (this.triggerBehaviorCase_ == 5) {
            return ((Integer) this.triggerBehavior_).intValue();
        }
        return 0;
    }

    public EnumC6273c getTriggerBehaviorCase() {
        return EnumC6273c.forNumber(this.triggerBehaviorCase_);
    }

    public String getWebviewRedirectUri() {
        return this.webviewRedirectUri_;
    }

    public ByteString getWebviewRedirectUriBytes() {
        return ByteString.copyFromUtf8(this.webviewRedirectUri_);
    }

    public boolean hasDelayMs() {
        return this.triggerBehaviorCase_ == 4;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasQueueBehavior() {
        return this.triggerBehaviorCase_ == 5;
    }

    public static C6271a newBuilder(SdkEvent$SDKEvent sdkEvent$SDKEvent) {
        return DEFAULT_INSTANCE.createBuilder(sdkEvent$SDKEvent);
    }

    public static SdkEvent$SDKEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkEvent$SDKEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SdkEvent$SDKEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkEvent$SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SdkEvent$SDKEvent parseFrom(ByteString byteString) {
        return (SdkEvent$SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SdkEvent$SDKEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkEvent$SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SdkEvent$SDKEvent parseFrom(byte[] bArr) {
        return (SdkEvent$SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SdkEvent$SDKEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkEvent$SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SdkEvent$SDKEvent parseFrom(InputStream inputStream) {
        return (SdkEvent$SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SdkEvent$SDKEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkEvent$SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SdkEvent$SDKEvent parseFrom(CodedInputStream codedInputStream) {
        return (SdkEvent$SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SdkEvent$SDKEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkEvent$SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
