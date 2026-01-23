package com.robinhood.android.dashboard.sweep;

import com.robinhood.models.api.bonfire.ApiSweepSplash;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DashboardSweepSectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/sweep/DashboardSweepSectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.dashboard.sweep.DashboardSweepSectionDuxo$bind$1$1", m3645f = "DashboardSweepSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.dashboard.sweep.DashboardSweepSectionDuxo$bind$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class DashboardSweepSectionDuxo2 extends ContinuationImpl7 implements Function2<DashboardSweepSectionDataState, Continuation<? super DashboardSweepSectionDataState>, Object> {
    final /* synthetic */ ApiSweepSplash $sweepSplash;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DashboardSweepSectionDuxo2(ApiSweepSplash apiSweepSplash, Continuation<? super DashboardSweepSectionDuxo2> continuation) {
        super(2, continuation);
        this.$sweepSplash = apiSweepSplash;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DashboardSweepSectionDuxo2 dashboardSweepSectionDuxo2 = new DashboardSweepSectionDuxo2(this.$sweepSplash, continuation);
        dashboardSweepSectionDuxo2.L$0 = obj;
        return dashboardSweepSectionDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DashboardSweepSectionDataState dashboardSweepSectionDataState, Continuation<? super DashboardSweepSectionDataState> continuation) {
        return ((DashboardSweepSectionDuxo2) create(dashboardSweepSectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((DashboardSweepSectionDataState) this.L$0).copy(this.$sweepSplash);
    }
}
