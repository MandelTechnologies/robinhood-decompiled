package com.robinhood.crypto.perpetuals.toasts;

import android.content.Context;
import android.widget.Toast;
import com.robinhood.crypto.perpetuals.C33018R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerpetualToasts.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0006"}, m3636d2 = {"showUpdateSuccessToast", "", "context", "Landroid/content/Context;", "showUpdateFailedToast", "showCancellationRequestToast", "lib-perpetuals_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.crypto.perpetuals.toasts.PerpetualToastsKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class PerpetualToasts {
    public static final void showUpdateSuccessToast(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Toast.makeText(context, C33018R.string.position_updated_toast, 0).show();
    }

    public static final void showUpdateFailedToast(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Toast.makeText(context, C33018R.string.position_update_failed_toast, 0).show();
    }

    public static final void showCancellationRequestToast(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Toast.makeText(context, C33018R.string.order_cancellation_request_toast, 0).show();
    }
}
