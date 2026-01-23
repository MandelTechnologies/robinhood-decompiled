package com.robinhood.android.common.directdeposit;

import android.app.Activity;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Activities.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0006"}, m3636d2 = {"setSuccessfulDirectDepositResult", "", "Landroid/app/Activity;", "directDepositSource", "Lcom/robinhood/android/common/directdeposit/DirectDepositSource;", "finishWithSuccessfulDirectDeposits", "feature-lib-direct-deposit_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.directdeposit.ActivitiesKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class Activities {
    public static final void setSuccessfulDirectDepositResult(Activity activity, DirectDepositSource directDepositSource) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(directDepositSource, "directDepositSource");
        activity.setResult(-1, new Intent().putExtra(DirectDepositConstants.directDepositTypeResultKey, directDepositSource));
    }

    public static final void finishWithSuccessfulDirectDeposits(Activity activity, DirectDepositSource directDepositSource) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(directDepositSource, "directDepositSource");
        setSuccessfulDirectDepositResult(activity, directDepositSource);
        activity.finish();
    }
}
