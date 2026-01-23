package io.bitdrift.capture.common;

import com.robinhood.models.api.ErrorResponse;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;

/* compiled from: ErrorHandler.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, m3636d2 = {"Lio/bitdrift/capture/common/ErrorHandler;", "", "handleError", "", ErrorResponse.DETAIL, "", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "", "platform_jvm_common-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface ErrorHandler {
    void handleError(String detail, Throwable e);

    /* compiled from: ErrorHandler.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void handleError$default(ErrorHandler errorHandler, String str, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleError");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            errorHandler.handleError(str, th);
        }
    }
}
