package com.robinhood.android.lib.performancechart;

import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.lib.performancechart.PerformanceChartStateProvider3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PerformanceChartComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.performancechart.PerformanceChartComposableKt$PerformanceChartComposable$2$1", m3645f = "PerformanceChartComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartComposableKt$PerformanceChartComposable$2$1, reason: use source file name */
/* loaded from: classes8.dex */
final class PerformanceChartComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onChartLoaded;
    final /* synthetic */ SnapshotState4<PerformanceChartStateProvider3> $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PerformanceChartComposable2(Function0<Unit> function0, SnapshotState4<? extends PerformanceChartStateProvider3> snapshotState4, Continuation<? super PerformanceChartComposable2> continuation) {
        super(2, continuation);
        this.$onChartLoaded = function0;
        this.$viewState$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PerformanceChartComposable2(this.$onChartLoaded, this.$viewState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PerformanceChartComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Function0<Unit> function0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if ((PerformanceChartComposable.PerformanceChartComposable$lambda$0(this.$viewState$delegate) instanceof PerformanceChartStateProvider3.Ready) && (function0 = this.$onChartLoaded) != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
