package com.withpersona.sdk2.inquiry.internal.network;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorRequest.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;", "", "errorType", "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$ErrorType;", "debugDescription", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$ErrorType;Ljava/lang/Object;)V", "getErrorType", "()Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$ErrorType;", "getDebugDescription", "()Ljava/lang/Object;", "ErrorType", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class ErrorRequest {
    private final Object debugDescription;
    private final ErrorType errorType;

    public ErrorRequest(ErrorType errorType, Object obj) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        this.errorType = errorType;
        this.debugDescription = obj;
    }

    public final ErrorType getErrorType() {
        return this.errorType;
    }

    public final Object getDebugDescription() {
        return this.debugDescription;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ErrorRequest.kt */
    @JsonClass(generateAdapter = false)
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$ErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "Camera", "Network", "Permissions", "Nfc", "Other", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class ErrorType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ErrorType[] $VALUES;

        @Json(name = "camera")
        public static final ErrorType Camera = new ErrorType("Camera", 0);

        @Json(name = "network")
        public static final ErrorType Network = new ErrorType("Network", 1);

        @Json(name = "permissions")
        public static final ErrorType Permissions = new ErrorType("Permissions", 2);

        @Json(name = "nfc")
        public static final ErrorType Nfc = new ErrorType("Nfc", 3);

        @Json(name = "other")
        public static final ErrorType Other = new ErrorType("Other", 4);

        private static final /* synthetic */ ErrorType[] $values() {
            return new ErrorType[]{Camera, Network, Permissions, Nfc, Other};
        }

        public static EnumEntries<ErrorType> getEntries() {
            return $ENTRIES;
        }

        private ErrorType(String str, int i) {
        }

        static {
            ErrorType[] errorTypeArr$values = $values();
            $VALUES = errorTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(errorTypeArr$values);
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }
    }
}
