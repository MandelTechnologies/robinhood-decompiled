package com.twilio.util;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.Enums4;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: ErrorInfo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000212B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\bB'\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nBG\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014B7\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0002\u0010\u0015J\t\u0010\u001e\u001a\u00020\rHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J;\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\b\u0010(\u001a\u00020\u0005H\u0016J&\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/HÁ\u0001¢\u0006\u0002\b0R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017¨\u00063"}, m3636d2 = {"Lcom/twilio/util/ErrorInfo;", "", "errorCode", "", "errorMessage", "", "(ILjava/lang/String;)V", "errorStatus", "(IILjava/lang/String;)V", "errorDescription", "(IILjava/lang/String;Ljava/lang/String;)V", "seen1", "reason", "Lcom/twilio/util/ErrorReason;", "status", "code", "message", "description", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/twilio/util/ErrorReason;IILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/twilio/util/ErrorReason;IILjava/lang/String;Ljava/lang/String;)V", "getCode", "()I", "getDescription", "()Ljava/lang/String;", "getMessage", "getReason", "()Lcom/twilio/util/ErrorReason;", "getStatus", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$shared_public_release", "$serializer", "Companion", "shared-public_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes11.dex */
public final /* data */ class ErrorInfo {
    private static final int CLIENT_ERROR = 0;
    private final int code;
    private final String description;
    private final String message;
    private final TwilioException2 reason;
    private final int status;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {Enums4.createSimpleEnumSerializer("com.twilio.util.ErrorReason", TwilioException2.values()), null, null, null, null};
    private static final int CANNOT_GET_MESSAGE_BY_INDEX = -4;
    private static final int MISMATCHING_TOKEN_UPDATE = -5;
    private static final int CONVERSATION_NOT_SYNCHRONIZED = -6;
    private static final int CONVERSATION_NOT_FOUND = -8;
    private static final int UNSUPPORTED_EMAIL_BODY_CONTENT_TYPE = -9;
    private static final int UNSUPPORTED_EMAIL_HISTORY_CONTENT_TYPE = -10;
    private static final int TOO_MANY_ATTACHMENTS = -11;
    private static final int MEDIA_UPLOAD_ERROR = -12;

    public ErrorInfo() {
        this((TwilioException2) null, 0, 0, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ErrorInfo copy$default(ErrorInfo errorInfo, TwilioException2 twilioException2, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            twilioException2 = errorInfo.reason;
        }
        if ((i3 & 2) != 0) {
            i = errorInfo.status;
        }
        if ((i3 & 4) != 0) {
            i2 = errorInfo.code;
        }
        if ((i3 & 8) != 0) {
            str = errorInfo.message;
        }
        if ((i3 & 16) != 0) {
            str2 = errorInfo.description;
        }
        String str3 = str2;
        int i4 = i2;
        return errorInfo.copy(twilioException2, i, i4, str, str3);
    }

    public static final int getCANNOT_GET_MESSAGE_BY_INDEX() {
        return INSTANCE.getCANNOT_GET_MESSAGE_BY_INDEX();
    }

    public static final int getCLIENT_ERROR() {
        return INSTANCE.getCLIENT_ERROR();
    }

    public static final int getCONVERSATION_NOT_FOUND() {
        return INSTANCE.getCONVERSATION_NOT_FOUND();
    }

    public static final int getCONVERSATION_NOT_SYNCHRONIZED() {
        return INSTANCE.getCONVERSATION_NOT_SYNCHRONIZED();
    }

    public static final int getMEDIA_UPLOAD_ERROR() {
        return INSTANCE.getMEDIA_UPLOAD_ERROR();
    }

    public static final int getMISMATCHING_TOKEN_UPDATE() {
        return INSTANCE.getMISMATCHING_TOKEN_UPDATE();
    }

    public static final int getTOO_MANY_ATTACHMENTS() {
        return INSTANCE.getTOO_MANY_ATTACHMENTS();
    }

    public static final int getUNSUPPORTED_EMAIL_BODY_CONTENT_TYPE() {
        return INSTANCE.getUNSUPPORTED_EMAIL_BODY_CONTENT_TYPE();
    }

    public static final int getUNSUPPORTED_EMAIL_HISTORY_CONTENT_TYPE() {
        return INSTANCE.getUNSUPPORTED_EMAIL_HISTORY_CONTENT_TYPE();
    }

    /* renamed from: component1, reason: from getter */
    public final TwilioException2 getReason() {
        return this.reason;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final ErrorInfo copy(TwilioException2 reason, int status, int code, String message, String description) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(description, "description");
        return new ErrorInfo(reason, status, code, message, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorInfo)) {
            return false;
        }
        ErrorInfo errorInfo = (ErrorInfo) other;
        return this.reason == errorInfo.reason && this.status == errorInfo.status && this.code == errorInfo.code && Intrinsics.areEqual(this.message, errorInfo.message) && Intrinsics.areEqual(this.description, errorInfo.description);
    }

    public int hashCode() {
        return (((((((this.reason.hashCode() * 31) + Integer.hashCode(this.status)) * 31) + Integer.hashCode(this.code)) * 31) + this.message.hashCode()) * 31) + this.description.hashCode();
    }

    @Deprecated
    public /* synthetic */ ErrorInfo(int i, TwilioException2 twilioException2, int i2, int i3, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.reason = (i & 1) == 0 ? TwilioException2.Unknown : twilioException2;
        if ((i & 2) == 0) {
            this.status = 0;
        } else {
            this.status = i2;
        }
        if ((i & 4) == 0) {
            this.code = 0;
        } else {
            this.code = i3;
        }
        if ((i & 8) == 0) {
            this.message = "";
        } else {
            this.message = str;
        }
        if ((i & 16) == 0) {
            this.description = "";
        } else {
            this.description = str2;
        }
    }

    public ErrorInfo(TwilioException2 reason, int i, int i2, String message, String description) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(description, "description");
        this.reason = reason;
        this.status = i;
        this.code = i2;
        this.message = message;
        this.description = description;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$shared_public_release(ErrorInfo self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.reason != TwilioException2.Unknown) {
            output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.reason);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.status != 0) {
            output.encodeIntElement(serialDesc, 1, self.status);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.code != 0) {
            output.encodeIntElement(serialDesc, 2, self.code);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual(self.message, "")) {
            output.encodeStringElement(serialDesc, 3, self.message);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && Intrinsics.areEqual(self.description, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 4, self.description);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ ErrorInfo(com.twilio.util.TwilioException2 r2, int r3, int r4, java.lang.String r5, java.lang.String r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            com.twilio.util.ErrorReason r2 = com.twilio.util.TwilioException2.Unknown
        L6:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lc
            r3 = r0
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L11
            r4 = r0
        L11:
            r8 = r7 & 8
            java.lang.String r0 = ""
            if (r8 == 0) goto L18
            r5 = r0
        L18:
            r7 = r7 & 16
            if (r7 == 0) goto L23
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L29
        L23:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L29:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.twilio.util.ErrorInfo.<init>(com.twilio.util.ErrorReason, int, int, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final TwilioException2 getReason() {
        return this.reason;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getDescription() {
        return this.description;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ErrorInfo(int i, String errorMessage) {
        this(TwilioException2.Unknown, CLIENT_ERROR, i, errorMessage, (String) null, 16, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ErrorInfo(int i, int i2, String errorMessage) {
        this(TwilioException2.Unknown, i, i2, errorMessage, (String) null, 16, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ErrorInfo(int i, int i2, String errorMessage, String errorDescription) {
        this(TwilioException2.Unknown, i, i2, errorMessage, errorDescription);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
    }

    public String toString() {
        return this.reason.getDescription() + ' ' + this.status + ':' + this.code + ' ' + this.message + ' ' + this.description;
    }

    /* compiled from: ErrorInfo.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!HÆ\u0001R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007R\u001c\u0010\u000e\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0007R\u001c\u0010\u0011\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0007R\u001c\u0010\u0014\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0007R\u001c\u0010\u0017\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u0007R\u001c\u0010\u001a\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u0007R\u001c\u0010\u001d\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u0007¨\u0006#"}, m3636d2 = {"Lcom/twilio/util/ErrorInfo$Companion;", "", "()V", "CANNOT_GET_MESSAGE_BY_INDEX", "", "getCANNOT_GET_MESSAGE_BY_INDEX$annotations", "getCANNOT_GET_MESSAGE_BY_INDEX", "()I", "CLIENT_ERROR", "getCLIENT_ERROR$annotations", "getCLIENT_ERROR", "CONVERSATION_NOT_FOUND", "getCONVERSATION_NOT_FOUND$annotations", "getCONVERSATION_NOT_FOUND", "CONVERSATION_NOT_SYNCHRONIZED", "getCONVERSATION_NOT_SYNCHRONIZED$annotations", "getCONVERSATION_NOT_SYNCHRONIZED", "MEDIA_UPLOAD_ERROR", "getMEDIA_UPLOAD_ERROR$annotations", "getMEDIA_UPLOAD_ERROR", "MISMATCHING_TOKEN_UPDATE", "getMISMATCHING_TOKEN_UPDATE$annotations", "getMISMATCHING_TOKEN_UPDATE", "TOO_MANY_ATTACHMENTS", "getTOO_MANY_ATTACHMENTS$annotations", "getTOO_MANY_ATTACHMENTS", "UNSUPPORTED_EMAIL_BODY_CONTENT_TYPE", "getUNSUPPORTED_EMAIL_BODY_CONTENT_TYPE$annotations", "getUNSUPPORTED_EMAIL_BODY_CONTENT_TYPE", "UNSUPPORTED_EMAIL_HISTORY_CONTENT_TYPE", "getUNSUPPORTED_EMAIL_HISTORY_CONTENT_TYPE$annotations", "getUNSUPPORTED_EMAIL_HISTORY_CONTENT_TYPE", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/twilio/util/ErrorInfo;", "shared-public_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getCANNOT_GET_MESSAGE_BY_INDEX$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getCLIENT_ERROR$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getCONVERSATION_NOT_FOUND$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getCONVERSATION_NOT_SYNCHRONIZED$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getMEDIA_UPLOAD_ERROR$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getMISMATCHING_TOKEN_UPDATE$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getTOO_MANY_ATTACHMENTS$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getUNSUPPORTED_EMAIL_BODY_CONTENT_TYPE$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getUNSUPPORTED_EMAIL_HISTORY_CONTENT_TYPE$annotations() {
        }

        private Companion() {
        }

        public final KSerializer<ErrorInfo> serializer() {
            return ErrorInfo2.INSTANCE;
        }

        public final int getCLIENT_ERROR() {
            return ErrorInfo.CLIENT_ERROR;
        }

        public final int getCANNOT_GET_MESSAGE_BY_INDEX() {
            return ErrorInfo.CANNOT_GET_MESSAGE_BY_INDEX;
        }

        public final int getMISMATCHING_TOKEN_UPDATE() {
            return ErrorInfo.MISMATCHING_TOKEN_UPDATE;
        }

        public final int getCONVERSATION_NOT_SYNCHRONIZED() {
            return ErrorInfo.CONVERSATION_NOT_SYNCHRONIZED;
        }

        public final int getCONVERSATION_NOT_FOUND() {
            return ErrorInfo.CONVERSATION_NOT_FOUND;
        }

        public final int getUNSUPPORTED_EMAIL_BODY_CONTENT_TYPE() {
            return ErrorInfo.UNSUPPORTED_EMAIL_BODY_CONTENT_TYPE;
        }

        public final int getUNSUPPORTED_EMAIL_HISTORY_CONTENT_TYPE() {
            return ErrorInfo.UNSUPPORTED_EMAIL_HISTORY_CONTENT_TYPE;
        }

        public final int getTOO_MANY_ATTACHMENTS() {
            return ErrorInfo.TOO_MANY_ATTACHMENTS;
        }

        public final int getMEDIA_UPLOAD_ERROR() {
            return ErrorInfo.MEDIA_UPLOAD_ERROR;
        }
    }
}
