package com.robinhood.android.portfolio.performanceChartSettings;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PerformanceChartSettingsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsDuxo$onResume$3$1", m3645f = "PerformanceChartSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsDuxo$onResume$3$1, reason: use source file name */
/* loaded from: classes11.dex */
final class PerformanceChartSettingsDuxo4 extends ContinuationImpl7 implements Function2<PerformanceChartSettingsDataState, Continuation<? super PerformanceChartSettingsDataState>, Object> {
    final /* synthetic */ boolean $isEnabled;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerformanceChartSettingsDuxo4(boolean z, Continuation<? super PerformanceChartSettingsDuxo4> continuation) {
        super(2, continuation);
        this.$isEnabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PerformanceChartSettingsDuxo4 performanceChartSettingsDuxo4 = new PerformanceChartSettingsDuxo4(this.$isEnabled, continuation);
        performanceChartSettingsDuxo4.L$0 = obj;
        return performanceChartSettingsDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PerformanceChartSettingsDataState performanceChartSettingsDataState, Continuation<? super PerformanceChartSettingsDataState> continuation) {
        return ((PerformanceChartSettingsDuxo4) create(performanceChartSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return PerformanceChartSettingsDataState.copy$default((PerformanceChartSettingsDataState) this.L$0, null, false, false, false, this.$isEnabled, false, 47, null);
    }
}
