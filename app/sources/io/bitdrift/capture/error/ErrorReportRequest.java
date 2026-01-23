package io.bitdrift.capture.error;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: ErrorReporterService.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lio/bitdrift/capture/error/ErrorReportRequest;", "", "", "message", ErrorBundle.DETAIL_ENTRY, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "getDetails", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ErrorReportRequest {

    @SerializedName(ErrorBundle.DETAIL_ENTRY)
    private final String details;

    @SerializedName("message")
    private final String message;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorReportRequest)) {
            return false;
        }
        ErrorReportRequest errorReportRequest = (ErrorReportRequest) other;
        return Intrinsics.areEqual(this.message, errorReportRequest.message) && Intrinsics.areEqual(this.details, errorReportRequest.details);
    }

    public int hashCode() {
        int iHashCode = this.message.hashCode() * 31;
        String str = this.details;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ErrorReportRequest(message=" + this.message + ", details=" + this.details + ')';
    }

    public ErrorReportRequest(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
        this.details = str;
    }
}
