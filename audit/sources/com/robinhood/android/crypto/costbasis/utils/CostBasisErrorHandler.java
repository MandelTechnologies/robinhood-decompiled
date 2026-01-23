package com.robinhood.android.crypto.costbasis.utils;

import android.app.Activity;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.C13997R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CostBasisErrorHandler.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/utils/CostBasisErrorHandler;", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CostBasisErrorHandler extends ActivityErrorHandler<Object> {
    public static final int $stable = ActivityErrorHandler.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CostBasisErrorHandler(Activity activity) {
        super(activity, true, 0, Integer.valueOf(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome), 4, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
