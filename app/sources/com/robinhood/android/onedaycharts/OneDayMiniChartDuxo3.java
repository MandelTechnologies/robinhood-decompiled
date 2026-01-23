package com.robinhood.android.onedaycharts;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OneDayMiniChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onedaycharts/OneDayMiniChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.onedaycharts.OneDayMiniChartDuxo$bind$3$1", m3645f = "OneDayMiniChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.onedaycharts.OneDayMiniChartDuxo$bind$3$1, reason: use source file name */
/* loaded from: classes10.dex */
final class OneDayMiniChartDuxo3 extends ContinuationImpl7 implements Function2<OneDayMiniChartDataState, Continuation<? super OneDayMiniChartDataState>, Object> {
    int label;

    OneDayMiniChartDuxo3(Continuation<? super OneDayMiniChartDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneDayMiniChartDuxo3(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OneDayMiniChartDataState oneDayMiniChartDataState, Continuation<? super OneDayMiniChartDataState> continuation) {
        return ((OneDayMiniChartDuxo3) create(oneDayMiniChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new OneDayMiniChartDataState(null, null, null, 7, null);
    }
}
