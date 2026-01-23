package com.robinhood.android.chart.blackwidowadvancedchart;

import com.robinhood.android.chart.blackwidowadvancedchart.models.SpanIntervalData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RealBwWebViewManager.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/SpanIntervalData;", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.RealBwWebViewManager$spanIntervalData$1", m3645f = "RealBwWebViewManager.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class RealBwWebViewManager$spanIntervalData$1 extends ContinuationImpl7 implements Function3<CoroutineScope, BwWebViewComponent, Continuation<? super Flow<? extends SpanIntervalData>>, Object> {
    /* synthetic */ Object L$0;
    int label;

    RealBwWebViewManager$spanIntervalData$1(Continuation<? super RealBwWebViewManager$spanIntervalData$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, BwWebViewComponent bwWebViewComponent, Continuation<? super Flow<? extends SpanIntervalData>> continuation) {
        return invoke2(coroutineScope, bwWebViewComponent, (Continuation<? super Flow<SpanIntervalData>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, BwWebViewComponent bwWebViewComponent, Continuation<? super Flow<SpanIntervalData>> continuation) {
        RealBwWebViewManager$spanIntervalData$1 realBwWebViewManager$spanIntervalData$1 = new RealBwWebViewManager$spanIntervalData$1(continuation);
        realBwWebViewManager$spanIntervalData$1.L$0 = bwWebViewComponent;
        return realBwWebViewManager$spanIntervalData$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((BwWebViewComponent) this.L$0).getSpanIntervalData();
    }
}
