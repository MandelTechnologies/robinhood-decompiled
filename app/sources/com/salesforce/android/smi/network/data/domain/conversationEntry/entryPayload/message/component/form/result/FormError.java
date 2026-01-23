package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.form.result;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FormError.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0018B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/result/FormError;", "", "errorType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/result/FormError$ErrorType;", "errorMessage", "", "errorCode", "<init>", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/result/FormError$ErrorType;Ljava/lang/String;Ljava/lang/String;)V", "getErrorType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/result/FormError$ErrorType;", "getErrorMessage", "()Ljava/lang/String;", "getErrorCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ErrorType", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FormError {
    private final String errorCode;
    private final String errorMessage;
    private final ErrorType errorType;

    public static /* synthetic */ FormError copy$default(FormError formError, ErrorType errorType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            errorType = formError.errorType;
        }
        if ((i & 2) != 0) {
            str = formError.errorMessage;
        }
        if ((i & 4) != 0) {
            str2 = formError.errorCode;
        }
        return formError.copy(errorType, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final ErrorType getErrorType() {
        return this.errorType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component3, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    public final FormError copy(ErrorType errorType, String errorMessage, String errorCode) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new FormError(errorType, errorMessage, errorCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormError)) {
            return false;
        }
        FormError formError = (FormError) other;
        return this.errorType == formError.errorType && Intrinsics.areEqual(this.errorMessage, formError.errorMessage) && Intrinsics.areEqual(this.errorCode, formError.errorCode);
    }

    public int hashCode() {
        int iHashCode = ((this.errorType.hashCode() * 31) + this.errorMessage.hashCode()) * 31;
        String str = this.errorCode;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FormError(errorType=" + this.errorType + ", errorMessage=" + this.errorMessage + ", errorCode=" + this.errorCode + ")";
    }

    public FormError(ErrorType errorType, String errorMessage, String str) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.errorType = errorType;
        this.errorMessage = errorMessage;
        this.errorCode = str;
    }

    public /* synthetic */ FormError(ErrorType errorType, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(errorType, str, (i & 4) != 0 ? null : str2);
    }

    public final ErrorType getErrorType() {
        return this.errorType;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FormError.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/result/FormError$ErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "InvalidFormResponse", "FormRequestExpired", "ApiResultErrorCode", "InternalServerError", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class ErrorType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ErrorType[] $VALUES;
        public static final ErrorType InvalidFormResponse = new ErrorType("InvalidFormResponse", 0);
        public static final ErrorType FormRequestExpired = new ErrorType("FormRequestExpired", 1);
        public static final ErrorType ApiResultErrorCode = new ErrorType("ApiResultErrorCode", 2);
        public static final ErrorType InternalServerError = new ErrorType("InternalServerError", 3);

        private static final /* synthetic */ ErrorType[] $values() {
            return new ErrorType[]{InvalidFormResponse, FormRequestExpired, ApiResultErrorCode, InternalServerError};
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
