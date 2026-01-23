package com.robinhood.android.charts.candlestick;

import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.charts.model.Point;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CandlestickChart.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.charts.candlestick.CandlestickChartKt$CandlestickChart$5$1", m3645f = "CandlestickChart.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.charts.candlestick.CandlestickChartKt$CandlestickChart$5$1, reason: use source file name */
/* loaded from: classes7.dex */
final class CandlestickChart2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<Point> $containedScrubPoint$delegate;
    final /* synthetic */ HapticFeedback $haptic;
    final /* synthetic */ SnapshotState<Point> $mostRecentPoint$delegate;
    final /* synthetic */ Function1<Point, Unit> $onScrub;
    final /* synthetic */ SnapshotState<Boolean> $performedHaptic$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CandlestickChart2(HapticFeedback hapticFeedback, Function1<? super Point, Unit> function1, SnapshotState4<Point> snapshotState4, SnapshotState<Boolean> snapshotState, SnapshotState<Point> snapshotState2, Continuation<? super CandlestickChart2> continuation) {
        super(2, continuation);
        this.$haptic = hapticFeedback;
        this.$onScrub = function1;
        this.$containedScrubPoint$delegate = snapshotState4;
        this.$performedHaptic$delegate = snapshotState;
        this.$mostRecentPoint$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CandlestickChart2(this.$haptic, this.$onScrub, this.$containedScrubPoint$delegate, this.$performedHaptic$delegate, this.$mostRecentPoint$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CandlestickChart2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (CandlestickChart.CandlestickChart$lambda$10(this.$containedScrubPoint$delegate) != null && !CandlestickChart.CandlestickChart$lambda$15(this.$performedHaptic$delegate)) {
                CandlestickChart.CandlestickChart$lambda$16(this.$performedHaptic$delegate, true);
                this.$haptic.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
            }
            SnapshotState<Point> snapshotState = this.$mostRecentPoint$delegate;
            Point pointCandlestickChart$lambda$10 = CandlestickChart.CandlestickChart$lambda$10(this.$containedScrubPoint$delegate);
            if (pointCandlestickChart$lambda$10 == null) {
                pointCandlestickChart$lambda$10 = CandlestickChart.CandlestickChart$lambda$12(this.$mostRecentPoint$delegate);
            }
            snapshotState.setValue(pointCandlestickChart$lambda$10);
            Point pointCandlestickChart$lambda$12 = CandlestickChart.CandlestickChart$lambda$12(this.$mostRecentPoint$delegate);
            if (pointCandlestickChart$lambda$12 != null) {
                this.$onScrub.invoke(pointCandlestickChart$lambda$12);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
