package com.robinhood.android.navigation.contracts;

import androidx.view.result.ActivityResultLauncher;
import com.robinhood.android.navigation.contracts.NavigationFragmentResultContract;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NavigationFragmentResultContract.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aM\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u0002H\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"launch", "", "K", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationFragmentResultContract$FragmentNavigationParams;", "key", "performanceMetricSource", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "shouldClearTop", "", "showInTab", "(Landroidx/activity/result/ActivityResultLauncher;Lcom/robinhood/android/navigation/keys/FragmentKey;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;ZZ)V", "lib-navigation_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.navigation.contracts.NavigationFragmentResultContractKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class NavigationFragmentResultContract2 {
    public static /* synthetic */ void launch$default(ActivityResultLauncher activityResultLauncher, FragmentKey fragmentKey, PerformanceMetricEventData.Source source, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            source = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        launch(activityResultLauncher, fragmentKey, source, z, z2);
    }

    public static final <K extends FragmentKey> void launch(ActivityResultLauncher<NavigationFragmentResultContract.FragmentNavigationParams<K>> activityResultLauncher, K key, PerformanceMetricEventData.Source source, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(activityResultLauncher, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        activityResultLauncher.launch(new NavigationFragmentResultContract.FragmentNavigationParams<>(key, source, z, z2));
    }
}
