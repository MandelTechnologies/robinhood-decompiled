package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: NetworkError.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00102\u00060\u0001j\u0002`\u0002:\u0006\u000b\f\r\u000e\u000f\u0010B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0005\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "code", "", "<init>", "(Ljava/lang/String;I)V", "getCode", "()I", "PreconditionFailedError", "UnsupportedFileTypeError", "FileSizeLimitError", "ExpectationFailedError", "GeneralError", "Companion", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkError$ExpectationFailedError;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkError$FileSizeLimitError;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkError$GeneralError;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkError$PreconditionFailedError;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkError$UnsupportedFileTypeError;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class NetworkError extends Exception {
    private static final int BYTES_IN_KB = 1024;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String DEFAULT_ERROR_MESSAGE = "Unknown error occurred.";
    private static final int DEFAULT_FILE_SIZE_LIMIT = 5;
    private static final String FILE_SIZE_LIMIT_DELIMITER_END = ">";
    private static final String FILE_SIZE_LIMIT_DELIMITER_START = "<";
    private final int code;

    public /* synthetic */ NetworkError(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    /* compiled from: NetworkError.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkError$PreconditionFailedError;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkError;", "message", "", "<init>", "(Ljava/lang/String;)V", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class PreconditionFailedError extends NetworkError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PreconditionFailedError(String message) {
            super(message, NetworkErrorCode.PreconditionFailedError.getCode(), null);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    private NetworkError(String str, int i) {
        super(str);
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }

    /* compiled from: NetworkError.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkError$UnsupportedFileTypeError;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkError;", "message", "", "<init>", "(Ljava/lang/String;)V", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class UnsupportedFileTypeError extends NetworkError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnsupportedFileTypeError(String message) {
            super(message, NetworkErrorCode.UnsupportedFileTypeError.getCode(), null);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    /* compiled from: NetworkError.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkError$FileSizeLimitError;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkError;", "message", "", "fileSizeLimit", "", "<init>", "(Ljava/lang/String;I)V", "getFileSizeLimit", "()I", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class FileSizeLimitError extends NetworkError {
        private final int fileSizeLimit;

        public /* synthetic */ FileSizeLimitError(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? NetworkError.INSTANCE.parseFileSizeLimit(str) : i);
        }

        public final int getFileSizeLimit() {
            return this.fileSizeLimit;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileSizeLimitError(String message, int i) {
            super(message, NetworkErrorCode.FileSizeLimitError.getCode(), null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.fileSizeLimit = i;
        }
    }

    /* compiled from: NetworkError.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkError$ExpectationFailedError;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkError;", "message", "", "<init>", "(Ljava/lang/String;)V", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class ExpectationFailedError extends NetworkError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExpectationFailedError(String message) {
            super(message, NetworkErrorCode.ExpectationFailedError.getCode(), null);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    /* compiled from: NetworkError.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkError$GeneralError;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkError;", "message", "", "<init>", "(Ljava/lang/String;)V", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class GeneralError extends NetworkError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GeneralError(String message) {
            super(message, NetworkErrorCode.GeneralError.getCode(), null);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    /* compiled from: NetworkError.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkError$Companion;", "", "<init>", "()V", "fromCode", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkError;", "message", "", "code", "", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkError;", "parseFileSizeLimit", "DEFAULT_FILE_SIZE_LIMIT", "FILE_SIZE_LIMIT_DELIMITER_START", "FILE_SIZE_LIMIT_DELIMITER_END", "BYTES_IN_KB", "DEFAULT_ERROR_MESSAGE", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NetworkError fromCode(String message, Integer code) {
            if (message == null) {
                message = NetworkError.DEFAULT_ERROR_MESSAGE;
            }
            int code2 = NetworkErrorCode.PreconditionFailedError.getCode();
            if (code != null && code.intValue() == code2) {
                return new PreconditionFailedError(message);
            }
            int code3 = NetworkErrorCode.UnsupportedFileTypeError.getCode();
            if (code != null && code.intValue() == code3) {
                return new UnsupportedFileTypeError(message);
            }
            int code4 = NetworkErrorCode.FileSizeLimitError.getCode();
            if (code != null && code.intValue() == code4) {
                return new FileSizeLimitError(message, 0, 2, null);
            }
            return (code != null && code.intValue() == NetworkErrorCode.ExpectationFailedError.getCode()) ? new ExpectationFailedError(message) : new GeneralError(message);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int parseFileSizeLimit(String message) {
            Integer intOrNull;
            if (message == null) {
                return 5;
            }
            try {
                String strSubstring = message.substring(StringsKt.indexOf$default((CharSequence) message, NetworkError.FILE_SIZE_LIMIT_DELIMITER_START, 0, false, 6, (Object) null) + 1, StringsKt.indexOf$default((CharSequence) message, NetworkError.FILE_SIZE_LIMIT_DELIMITER_END, 0, false, 6, (Object) null));
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                if (strSubstring == null || (intOrNull = StringsKt.toIntOrNull(strSubstring)) == null) {
                    return 5;
                }
                int iIntValue = intOrNull.intValue();
                int i = iIntValue / 1048576;
                return ((iIntValue ^ 1048576) >= 0 || 1048576 * i == iIntValue) ? i : i - 1;
            } catch (Exception unused) {
                return 5;
            }
        }
    }
}
