package com.robinhood.android.dashboard.sweep;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore;
import com.robinhood.models.api.bonfire.ApiSweepSplash;
import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DashboardSweepSectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/dashboard/sweep/DashboardSweepSectionDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/dashboard/sweep/DashboardSweepSectionDataState;", "Lcom/robinhood/android/dashboard/sweep/DashboardSweepSectionViewState;", "sweepEnrollmentStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "bind", "Lio/reactivex/disposables/Disposable;", "accountNumber", "", "lib-dashboard-sweep_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class DashboardSweepSectionDuxo extends BaseDuxo<DashboardSweepSectionDataState, DashboardSweepSectionViewState> {
    public static final int $stable = 8;
    private final SweepEnrollmentStore sweepEnrollmentStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardSweepSectionDuxo(SweepEnrollmentStore sweepEnrollmentStore, DuxoBundle duxoBundle) {
        super(new DashboardSweepSectionDataState(null, 1, null), DashboardSweepSectionDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.sweepEnrollmentStore = sweepEnrollmentStore;
    }

    public final Disposable bind(String accountNumber) {
        return LifecycleHost.DefaultImpls.bind$default(this, this.sweepEnrollmentStore.streamSweepSplashObservable(accountNumber), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.dashboard.sweep.DashboardSweepSectionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DashboardSweepSectionDuxo.bind$lambda$0(this.f$0, (ApiSweepSplash) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(DashboardSweepSectionDuxo dashboardSweepSectionDuxo, ApiSweepSplash sweepSplash) {
        Intrinsics.checkNotNullParameter(sweepSplash, "sweepSplash");
        dashboardSweepSectionDuxo.applyMutation(new DashboardSweepSectionDuxo2(sweepSplash, null));
        return Unit.INSTANCE;
    }
}
