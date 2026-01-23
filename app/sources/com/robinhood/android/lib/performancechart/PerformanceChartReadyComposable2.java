package com.robinhood.android.lib.performancechart;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.lib.performancechart.PerformanceChartStateProvider3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PerformanceChartReadyComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$PerformanceChartReadyComposable$1$1", m3645f = "PerformanceChartReadyComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$PerformanceChartReadyComposable$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class PerformanceChartReadyComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Component $eventComponent;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ Screen $eventScreen;
    final /* synthetic */ PerformanceChartStateProvider3.Ready $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerformanceChartReadyComposable2(EventLogger eventLogger, Screen screen, Component component, PerformanceChartStateProvider3.Ready ready, Continuation<? super PerformanceChartReadyComposable2> continuation) {
        super(2, continuation);
        this.$eventLogger = eventLogger;
        this.$eventScreen = screen;
        this.$eventComponent = component;
        this.$state = ready;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PerformanceChartReadyComposable2(this.$eventLogger, this.$eventScreen, this.$eventComponent, this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PerformanceChartReadyComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        EventLogger.DefaultImpls.logAppear$default(this.$eventLogger, null, this.$eventScreen, this.$eventComponent, null, PerformanceChartReadyComposable.chartContext(this.$state.getActiveSpan(), this.$state), 9, null);
        return Unit.INSTANCE;
    }
}
