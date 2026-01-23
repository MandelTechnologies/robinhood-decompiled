package com.robinhood.android.advisory.projection.slider;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotStateKt;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: AdvisoryAmountSlider.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt$AdvisoryAmountSlider$4$1", m3645f = "AdvisoryAmountSlider.kt", m3646l = {114}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class AdvisoryAmountSliderKt$AdvisoryAmountSlider$4$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HapticFeedback $hapticFeedback;
    final /* synthetic */ SnapshotIntState2 $lastAlignedLineIndex$delegate;
    final /* synthetic */ float $lineSpacingPx;
    final /* synthetic */ LazyListState $listState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisoryAmountSliderKt$AdvisoryAmountSlider$4$1(LazyListState lazyListState, float f, HapticFeedback hapticFeedback, SnapshotIntState2 snapshotIntState2, Continuation<? super AdvisoryAmountSliderKt$AdvisoryAmountSlider$4$1> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$lineSpacingPx = f;
        this.$hapticFeedback = hapticFeedback;
        this.$lastAlignedLineIndex$delegate = snapshotIntState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvisoryAmountSliderKt$AdvisoryAmountSlider$4$1(this.$listState, this.$lineSpacingPx, this.$hapticFeedback, this.$lastAlignedLineIndex$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvisoryAmountSliderKt$AdvisoryAmountSlider$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyListState lazyListState = this.$listState;
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt$AdvisoryAmountSlider$4$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Integer.valueOf(lazyListState.getFirstVisibleItemScrollOffset());
                }
            });
            final LazyListState lazyListState2 = this.$listState;
            final float f = this.$lineSpacingPx;
            final HapticFeedback hapticFeedback = this.$hapticFeedback;
            final SnapshotIntState2 snapshotIntState2 = this.$lastAlignedLineIndex$delegate;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt$AdvisoryAmountSlider$4$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                }

                public final Object emit(int i2, Continuation<? super Unit> continuation) {
                    int firstVisibleItemIndex = (lazyListState2.getFirstVisibleItemIndex() * 5) + ((int) (i2 / f));
                    if (firstVisibleItemIndex != snapshotIntState2.getIntValue()) {
                        snapshotIntState2.setIntValue(firstVisibleItemIndex);
                        hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowSnapshotFlow.collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
