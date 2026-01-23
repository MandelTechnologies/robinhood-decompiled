package com.robinhood.android.navigation.contracts;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import androidx.view.result.ActivityResultLauncher;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NavigationActivityResultContract.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001aC\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u0002H\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000b\u001a\u001b\u0010\f\u001a\u0004\u0018\u0001H\r\"\b\b\u0000\u0010\r*\u00020\u000e*\u00020\u000f¢\u0006\u0002\u0010\u0010\u001a\u001c\u0010\u0011\u001a\u00020\u0001*\u00020\u00122\u0006\u0010\f\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u001a%\u0010\u0011\u001a\u00020\u0001\"\f\b\u0000\u0010\r*\u00020\u000e*\u00020\u0015*\u00020\u00122\u0006\u0010\f\u001a\u0002H\r¢\u0006\u0002\u0010\u0016\u001a%\u0010\u0017\u001a\u00020\u0001\"\f\b\u0000\u0010\r*\u00020\u000e*\u00020\u0015*\u00020\u00122\u0006\u0010\f\u001a\u0002H\r¢\u0006\u0002\u0010\u0016\"\u000e\u0010\u0018\u001a\u00020\u0019X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"launch", "", "K", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "key", "performanceMetricSource", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "shouldClearTop", "", "(Landroidx/activity/result/ActivityResultLauncher;Lcom/robinhood/android/navigation/keys/IntentKey;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;Z)V", "result", "R", "Landroid/os/Parcelable;", "Landroid/content/Intent;", "(Landroid/content/Intent;)Landroid/os/Parcelable;", "finishWithResult", "Landroid/app/Activity;", "resultCode", "", "Lcom/robinhood/android/navigation/contracts/ActivityResult;", "(Landroid/app/Activity;Landroid/os/Parcelable;)V", "setResult", "EXTRA_NAVIGATION_CONTRACT_RESULT", "", "lib-navigation_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.navigation.contracts.NavigationActivityResultContractKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class NavigationActivityResultContract3 {
    private static final String EXTRA_NAVIGATION_CONTRACT_RESULT = "navigation_contract_result";

    public static /* synthetic */ void launch$default(ActivityResultLauncher activityResultLauncher, IntentKey intentKey, PerformanceMetricEventData.Source source, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            source = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        launch(activityResultLauncher, intentKey, source, z);
    }

    public static final <K extends IntentKey> void launch(ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<K>> activityResultLauncher, K key, PerformanceMetricEventData.Source source, boolean z) {
        Intrinsics.checkNotNullParameter(activityResultLauncher, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        activityResultLauncher.launch(new NavigationActivityResultContract.NavigationParams<>(key, source, z));
    }

    public static final <R extends Parcelable> R result(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return (R) intent.getParcelableExtra(EXTRA_NAVIGATION_CONTRACT_RESULT);
    }

    public static /* synthetic */ void finishWithResult$default(Activity activity, Parcelable parcelable, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        finishWithResult(activity, parcelable, i);
    }

    public static final void finishWithResult(Activity activity, Parcelable result, int i) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        activity.setResult(i, new Intent().putExtra(EXTRA_NAVIGATION_CONTRACT_RESULT, result));
        activity.finish();
    }

    public static final <R extends Parcelable & NavigationActivityResultContract2> void finishWithResult(Activity activity, R result) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        finishWithResult(activity, result, result.getResultCode());
    }

    public static final <R extends Parcelable & NavigationActivityResultContract2> void setResult(Activity activity, R result) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        activity.setResult(result.getResultCode(), new Intent().putExtra(EXTRA_NAVIGATION_CONTRACT_RESULT, result));
    }
}
