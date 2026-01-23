package com.robinhood.shared.tradeladder.p398ui.ladder.gestures;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.shared.tradeladder.p398ui.ladder.extensions.LazyListStates2;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LadderGestureAwareLazyColumn.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$2$1$1", m3645f = "LadderGestureAwareLazyColumn.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$2$1$1 */
/* loaded from: classes12.dex */
final class C40963x670a1043 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<BigDecimal> $centerPriceBeforeZoom$delegate;
    final /* synthetic */ SnapshotState<Boolean> $currentScaleIsFromTheDuxo$delegate;
    final /* synthetic */ LadderState.LadderData $ladderData;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ Function2<Integer, Integer, Unit> $onZoomScaleChanged;
    final /* synthetic */ SnapshotIntState2 $targetZoomScale$delegate;
    final /* synthetic */ SnapshotState4<Integer> $zoomScale$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C40963x670a1043(LazyListState lazyListState, LadderState.LadderData ladderData, Function2<? super Integer, ? super Integer, Unit> function2, SnapshotState<Boolean> snapshotState, SnapshotState4<Integer> snapshotState4, SnapshotIntState2 snapshotIntState2, SnapshotState<BigDecimal> snapshotState2, Continuation<? super C40963x670a1043> continuation) {
        super(2, continuation);
        this.$lazyListState = lazyListState;
        this.$ladderData = ladderData;
        this.$onZoomScaleChanged = function2;
        this.$currentScaleIsFromTheDuxo$delegate = snapshotState;
        this.$zoomScale$delegate = snapshotState4;
        this.$targetZoomScale$delegate = snapshotIntState2;
        this.$centerPriceBeforeZoom$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C40963x670a1043(this.$lazyListState, this.$ladderData, this.$onZoomScaleChanged, this.$currentScaleIsFromTheDuxo$delegate, this.$zoomScale$delegate, this.$targetZoomScale$delegate, this.$centerPriceBeforeZoom$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C40963x670a1043) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$64$lambda$41(this.$currentScaleIsFromTheDuxo$delegate)) {
                LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$64$lambda$42(this.$currentScaleIsFromTheDuxo$delegate, false);
            } else {
                this.$targetZoomScale$delegate.setIntValue(LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$64$lambda$39(this.$zoomScale$delegate));
                int centerIndex = LazyListStates2.getCenterIndex(this.$lazyListState);
                BigDecimal price = this.$ladderData.getLadderPriceLevels().getPrice(centerIndex);
                if (LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$64$lambda$44(this.$centerPriceBeforeZoom$delegate) == null) {
                    this.$centerPriceBeforeZoom$delegate.setValue(price);
                }
                this.$onZoomScaleChanged.invoke(boxing.boxInt(LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$64$lambda$39(this.$zoomScale$delegate)), boxing.boxInt(centerIndex));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
