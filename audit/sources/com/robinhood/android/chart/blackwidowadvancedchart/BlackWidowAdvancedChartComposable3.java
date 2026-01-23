package com.robinhood.android.chart.blackwidowadvancedchart;

import androidx.compose.runtime.SnapshotState4;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BlackWidowAdvancedChartComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartComposableKt$BlackWidowAdvancedChartComposable$1$1$1$2$1", m3645f = "BlackWidowAdvancedChartComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartComposableKt$BlackWidowAdvancedChartComposable$1$1$1$2$1, reason: use source file name */
/* loaded from: classes7.dex */
final class BlackWidowAdvancedChartComposable3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<BlackWidowAdvancedChartViewState> $chartViewState$delegate;
    final /* synthetic */ UserInteractionEventDescriptor $eventData;
    final /* synthetic */ EventLogger $eventLogger;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlackWidowAdvancedChartComposable3(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, SnapshotState4<BlackWidowAdvancedChartViewState> snapshotState4, Continuation<? super BlackWidowAdvancedChartComposable3> continuation) {
        super(2, continuation);
        this.$eventLogger = eventLogger;
        this.$eventData = userInteractionEventDescriptor;
        this.$chartViewState$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BlackWidowAdvancedChartComposable3(this.$eventLogger, this.$eventData, this.$chartViewState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BlackWidowAdvancedChartComposable3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (BlackWidowAdvancedChartComposable.BlackWidowAdvancedChartComposable$lambda$0(this.$chartViewState$delegate).getLoadingComplete()) {
                EventLogger.DefaultImpls.logAppear$default(this.$eventLogger, null, this.$eventData.getScreen(), null, null, this.$eventData.getContext(), 13, null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
