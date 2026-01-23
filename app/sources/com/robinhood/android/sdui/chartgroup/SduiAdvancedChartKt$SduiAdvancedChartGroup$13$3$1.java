package com.robinhood.android.sdui.chartgroup;

import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.runtime.SnapshotState4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SduiAdvancedChart.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$SduiAdvancedChartGroup$13$3$1", m3645f = "SduiAdvancedChart.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class SduiAdvancedChartKt$SduiAdvancedChartGroup$13$3$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HapticFeedback $haptic;
    final /* synthetic */ SnapshotState4<ScrubState> $scrubState$delegate;
    final /* synthetic */ AdvancedChartGroupState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SduiAdvancedChartKt$SduiAdvancedChartGroup$13$3$1(AdvancedChartGroupState advancedChartGroupState, HapticFeedback hapticFeedback, SnapshotState4<ScrubState> snapshotState4, Continuation<? super SduiAdvancedChartKt$SduiAdvancedChartGroup$13$3$1> continuation) {
        super(2, continuation);
        this.$state = advancedChartGroupState;
        this.$haptic = hapticFeedback;
        this.$scrubState$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SduiAdvancedChartKt$SduiAdvancedChartGroup$13$3$1(this.$state, this.$haptic, this.$scrubState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SduiAdvancedChartKt$SduiAdvancedChartGroup$13$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ScrubState scrubStateSduiAdvancedChartGroup$lambda$49 = SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$49(this.$scrubState$delegate);
            if ((scrubStateSduiAdvancedChartGroup$lambda$49 != null ? scrubStateSduiAdvancedChartGroup$lambda$49.getSnapX() : null) != null && this.$state.getScrubConfig().getHapticFeedbackEnabled()) {
                this.$haptic.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
