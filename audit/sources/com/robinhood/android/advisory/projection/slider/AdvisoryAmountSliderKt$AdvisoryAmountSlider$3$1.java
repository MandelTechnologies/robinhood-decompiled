package com.robinhood.android.advisory.projection.slider;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AdvisoryAmountSlider.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt$AdvisoryAmountSlider$3$1", m3645f = "AdvisoryAmountSlider.kt", m3646l = {107}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class AdvisoryAmountSliderKt$AdvisoryAmountSlider$3$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $alreadyAligned$delegate;
    final /* synthetic */ ImmutableList<Money> $amountList;
    final /* synthetic */ LazyListState $listState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisoryAmountSliderKt$AdvisoryAmountSlider$3$1(LazyListState lazyListState, ImmutableList<Money> immutableList, SnapshotState<Boolean> snapshotState, Continuation<? super AdvisoryAmountSliderKt$AdvisoryAmountSlider$3$1> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$amountList = immutableList;
        this.$alreadyAligned$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvisoryAmountSliderKt$AdvisoryAmountSlider$3$1(this.$listState, this.$amountList, this.$alreadyAligned$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvisoryAmountSliderKt$AdvisoryAmountSlider$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$listState.isScrollInProgress()) {
                AdvisoryAmountSliderKt.AdvisoryAmountSlider_TN_CM5M$lambda$3(this.$alreadyAligned$delegate, false);
            }
            if (!this.$listState.isScrollInProgress() && !AdvisoryAmountSliderKt.AdvisoryAmountSlider_TN_CM5M$lambda$2(this.$alreadyAligned$delegate)) {
                LazyListState lazyListState = this.$listState;
                ImmutableList<Money> immutableList = this.$amountList;
                this.label = 1;
                if (AdvisoryAmountSliderKt.autoAlignToNearestTick(lazyListState, immutableList, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AdvisoryAmountSliderKt.AdvisoryAmountSlider_TN_CM5M$lambda$3(this.$alreadyAligned$delegate, true);
        return Unit.INSTANCE;
    }
}
