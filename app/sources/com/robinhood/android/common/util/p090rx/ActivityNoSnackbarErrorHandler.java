package com.robinhood.android.common.util.p090rx;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActivityNoSnackbarErrorHandler.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/util/rx/ActivityNoSnackbarErrorHandler;", "T", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "showShortError", "", "message", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ActivityNoSnackbarErrorHandler<T> extends ActivityErrorHandler<T> {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityNoSnackbarErrorHandler(Activity activity) {
        super(activity, false, 0, null, 14, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.robinhood.android.common.util.p090rx.ActivityErrorHandler, com.robinhood.android.common.util.p090rx.ContextErrorHandler
    protected void showShortError(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        showLongError(message);
    }
}
