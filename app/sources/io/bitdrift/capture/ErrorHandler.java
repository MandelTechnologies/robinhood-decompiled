package io.bitdrift.capture;

import android.util.Log;
import com.robinhood.models.api.ErrorResponse;
import com.singular.sdk.internal.Constants;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorHandler.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, m3636d2 = {"Lio/bitdrift/capture/ErrorHandler;", "Lio/bitdrift/capture/common/ErrorHandler;", "()V", "handleError", "", ErrorResponse.DETAIL, "", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class ErrorHandler implements io.bitdrift.capture.common.ErrorHandler {
    public ErrorHandler() {
        CaptureJniLibrary.INSTANCE.load();
    }

    @Override // io.bitdrift.capture.common.ErrorHandler
    public void handleError(String detail, final Throwable e) {
        Intrinsics.checkNotNullParameter(detail, "detail");
        try {
            CaptureJniLibrary.INSTANCE.reportError('\'' + detail + "' failed: " + e, new CaptureJniLibrary2() { // from class: io.bitdrift.capture.ErrorHandler.handleError.1
                @Override // io.bitdrift.capture.CaptureJniLibrary2
                public String invoke() {
                    Throwable th = e;
                    if (th != null) {
                        return ExceptionsKt.stackTraceToString(th);
                    }
                    return null;
                }
            });
        } catch (Throwable th) {
            Log.w("capture", "failed to report error to bitdrift service: " + th.getClass().getName() + ": " + th.getMessage());
        }
    }
}
