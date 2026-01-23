package com.robinhood.android;

import com.robinhood.adjust.AdjustManagedSdk;
import com.robinhood.android.gdpr.GdprManagedSdk;
import com.robinhood.android.util.login.UserLifecycleListener;
import com.robinhood.referral.branch.BranchManagedSdk;
import com.robinhood.shared.common.singular.SingularManagedSdk;
import com.robinhood.userleap.UserLeapManagedSdk;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseAppModule.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J>\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/BaseAppModule;", "", "<init>", "()V", "provideUserLifecycleListener", "Lcom/robinhood/android/util/login/UserLifecycleListener;", "provideTemporalFormatterUserLifecycleListener", "listener", "Lcom/robinhood/android/TemporalFormatterLifecycleListener;", "provideGdprManagedSdks", "", "Lcom/robinhood/android/gdpr/GdprManagedSdk;", "adjustManagedSdk", "Lcom/robinhood/adjust/AdjustManagedSdk;", "branchManagedSdk", "Lcom/robinhood/referral/branch/BranchManagedSdk;", "userLeapManagedSdk", "Lcom/robinhood/userleap/UserLeapManagedSdk;", "firebaseAnalyticsSdk", "Lcom/robinhood/android/FirebaseAnalyticsManagedSdk;", "singularManagedSdk", "Lcom/robinhood/shared/common/singular/SingularManagedSdk;", "bitdriftCaptureManagedSdk", "Lcom/robinhood/android/BitdriftCaptureManagedSdk;", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class BaseAppModule {
    public static final BaseAppModule INSTANCE = new BaseAppModule();

    public final UserLifecycleListener provideTemporalFormatterUserLifecycleListener(TemporalFormatterLifecycleListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        return listener;
    }

    private BaseAppModule() {
    }

    public final UserLifecycleListener provideUserLifecycleListener() {
        return AppObjectGraph.INSTANCE;
    }

    public final Set<GdprManagedSdk> provideGdprManagedSdks(AdjustManagedSdk adjustManagedSdk, BranchManagedSdk branchManagedSdk, UserLeapManagedSdk userLeapManagedSdk, FirebaseAnalyticsManagedSdk firebaseAnalyticsSdk, SingularManagedSdk singularManagedSdk, BitdriftCaptureManagedSdk bitdriftCaptureManagedSdk) {
        Intrinsics.checkNotNullParameter(adjustManagedSdk, "adjustManagedSdk");
        Intrinsics.checkNotNullParameter(branchManagedSdk, "branchManagedSdk");
        Intrinsics.checkNotNullParameter(userLeapManagedSdk, "userLeapManagedSdk");
        Intrinsics.checkNotNullParameter(firebaseAnalyticsSdk, "firebaseAnalyticsSdk");
        Intrinsics.checkNotNullParameter(singularManagedSdk, "singularManagedSdk");
        Intrinsics.checkNotNullParameter(bitdriftCaptureManagedSdk, "bitdriftCaptureManagedSdk");
        return SetsKt.setOf((Object[]) new GdprManagedSdk[]{adjustManagedSdk, branchManagedSdk, userLeapManagedSdk, firebaseAnalyticsSdk, singularManagedSdk, bitdriftCaptureManagedSdk});
    }
}
