package com.robinhood.android.dashboard.lib.chart;

import com.robinhood.models.home.component.DashboardComponent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DashboardChart.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.chart.DashboardChartKt$DashboardChart$2$1", m3645f = "DashboardChart.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.dashboard.lib.chart.DashboardChartKt$DashboardChart$2$1, reason: use source file name */
/* loaded from: classes2.dex */
final class DashboardChart6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DashboardChartDuxo $duxo;
    final /* synthetic */ DashboardComponent.Chart $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DashboardChart6(DashboardChartDuxo dashboardChartDuxo, DashboardComponent.Chart chart, Continuation<? super DashboardChart6> continuation) {
        super(2, continuation);
        this.$duxo = dashboardChartDuxo;
        this.$state = chart;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DashboardChart6(this.$duxo, this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DashboardChart6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$duxo.bind(this.$state.getDashboardType());
        return Unit.INSTANCE;
    }
}
