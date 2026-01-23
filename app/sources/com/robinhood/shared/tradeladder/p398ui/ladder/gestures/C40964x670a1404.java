package com.robinhood.shared.tradeladder.p398ui.ladder.gestures;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.shared.tradeladder.p398ui.ladder.extensions.LazyListStates2;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderPriceLevels;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LadderGestureAwareLazyColumn.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$2$2$1", m3645f = "LadderGestureAwareLazyColumn.kt", m3646l = {EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$2$2$1 */
/* loaded from: classes12.dex */
final class C40964x670a1404 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<BigDecimal> $centerPriceBeforeZoom$delegate;
    final /* synthetic */ LadderState.LadderData $ladderData;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ SnapshotIntState2 $targetZoomScale$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C40964x670a1404(LadderState.LadderData ladderData, LazyListState lazyListState, SnapshotState<BigDecimal> snapshotState, SnapshotIntState2 snapshotIntState2, Continuation<? super C40964x670a1404> continuation) {
        super(2, continuation);
        this.$ladderData = ladderData;
        this.$lazyListState = lazyListState;
        this.$centerPriceBeforeZoom$delegate = snapshotState;
        this.$targetZoomScale$delegate = snapshotIntState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C40964x670a1404(this.$ladderData, this.$lazyListState, this.$centerPriceBeforeZoom$delegate, this.$targetZoomScale$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C40964x670a1404) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BigDecimal bigDecimalLadderGestureAwareLazyColumn$lambda$64$lambda$44 = LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$64$lambda$44(this.$centerPriceBeforeZoom$delegate);
            if (bigDecimalLadderGestureAwareLazyColumn$lambda$64$lambda$44 != null && this.$ladderData.getLadderPriceLevels().getScale() == this.$targetZoomScale$delegate.getIntValue()) {
                int rowIndexFromPriceScaled$default = LadderPriceLevels.getRowIndexFromPriceScaled$default(this.$ladderData.getLadderPriceLevels(), bigDecimalLadderGestureAwareLazyColumn$lambda$64$lambda$44, null, 2, null);
                LazyListState lazyListState = this.$lazyListState;
                this.label = 1;
                if (LazyListStates2.centerAtIndex(lazyListState, rowIndexFromPriceScaled$default, false, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$centerPriceBeforeZoom$delegate.setValue(null);
        return Unit.INSTANCE;
    }
}
