package com.robinhood.shared.crypto.acats;

import android.app.Activity;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.C13997R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MigrationErrorHandler.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/MigrationErrorHandler;", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "showErrorDialog", "", "message", "", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class MigrationErrorHandler extends ActivityErrorHandler<Object> {
    public static final int $stable = ActivityErrorHandler.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MigrationErrorHandler(Activity activity) {
        super(activity, true, 0, Integer.valueOf(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome), 4, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public final void showErrorDialog(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        super.showLongError(message);
    }
}
