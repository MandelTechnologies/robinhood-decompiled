package com.robinhood.shared.tradeladder.p398ui.ladder;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: GenericLadder.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$GenericLadderComposable$1$1", m3645f = "GenericLadder.kt", m3646l = {87}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes12.dex */
final class GenericLadderKt$GenericLadderComposable$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LadderState.LadderData $ladderData;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ SnapshotState<BigDecimal> $maxVisibleAskQuantity$delegate;
    final /* synthetic */ SnapshotState<BigDecimal> $maxVisibleBidQuantity$delegate;
    final /* synthetic */ SnapshotState<BigDecimal> $minVisibleAskQuantity$delegate;
    final /* synthetic */ SnapshotState<BigDecimal> $minVisibleBidQuantity$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GenericLadderKt$GenericLadderComposable$1$1(LazyListState lazyListState, LadderState.LadderData ladderData, SnapshotState<BigDecimal> snapshotState, SnapshotState<BigDecimal> snapshotState2, SnapshotState<BigDecimal> snapshotState3, SnapshotState<BigDecimal> snapshotState4, Continuation<? super GenericLadderKt$GenericLadderComposable$1$1> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$ladderData = ladderData;
        this.$minVisibleAskQuantity$delegate = snapshotState;
        this.$maxVisibleAskQuantity$delegate = snapshotState2;
        this.$minVisibleBidQuantity$delegate = snapshotState3;
        this.$maxVisibleBidQuantity$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenericLadderKt$GenericLadderComposable$1$1(this.$listState, this.$ladderData, this.$minVisibleAskQuantity$delegate, this.$maxVisibleAskQuantity$delegate, this.$minVisibleBidQuantity$delegate, this.$maxVisibleBidQuantity$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GenericLadderKt$GenericLadderComposable$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyListState lazyListState = this.$listState;
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$GenericLadderComposable$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GenericLadderKt$GenericLadderComposable$1$1.invokeSuspend$lambda$1(lazyListState);
                }
            }));
            final LadderState.LadderData ladderData = this.$ladderData;
            final SnapshotState<BigDecimal> snapshotState = this.$minVisibleAskQuantity$delegate;
            final SnapshotState<BigDecimal> snapshotState2 = this.$maxVisibleAskQuantity$delegate;
            final SnapshotState<BigDecimal> snapshotState3 = this.$minVisibleBidQuantity$delegate;
            final SnapshotState<BigDecimal> snapshotState4 = this.$maxVisibleBidQuantity$delegate;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$GenericLadderComposable$1$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List<Integer>) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(List<Integer> list, Continuation<? super Unit> continuation) {
                    BigDecimal quantity;
                    BigDecimal quantity2;
                    Iterator<Integer> it = list.iterator();
                    BigDecimal bigDecimal = null;
                    BigDecimal bigDecimal2 = null;
                    BigDecimal bigDecimal3 = null;
                    BigDecimal bigDecimal4 = null;
                    while (it.hasNext()) {
                        int iIntValue = it.next().intValue();
                        LadderState.LadderData.QuantityBar quantityBar = ladderData.getVisibleAskQuantityBars().get(boxing.boxInt(iIntValue));
                        if (quantityBar != null && (quantity2 = quantityBar.getQuantity()) != null) {
                            if (bigDecimal == null || quantity2.compareTo(bigDecimal) < 0) {
                                bigDecimal = quantity2;
                            }
                            if (bigDecimal2 == null || quantity2.compareTo(bigDecimal2) > 0) {
                                bigDecimal2 = quantity2;
                            }
                        }
                        LadderState.LadderData.QuantityBar quantityBar2 = ladderData.getVisibleBidQuantityBars().get(boxing.boxInt(iIntValue));
                        if (quantityBar2 != null && (quantity = quantityBar2.getQuantity()) != null) {
                            if (bigDecimal3 == null || quantity.compareTo(bigDecimal3) < 0) {
                                bigDecimal3 = quantity;
                            }
                            if (bigDecimal4 == null || quantity.compareTo(bigDecimal4) > 0) {
                                bigDecimal4 = quantity;
                            }
                        }
                    }
                    SnapshotState<BigDecimal> snapshotState5 = snapshotState;
                    if (bigDecimal == null) {
                        bigDecimal = BigDecimal.ZERO;
                    }
                    snapshotState5.setValue(bigDecimal);
                    SnapshotState<BigDecimal> snapshotState6 = snapshotState2;
                    if (bigDecimal2 == null) {
                        bigDecimal2 = BigDecimal.ZERO;
                    }
                    snapshotState6.setValue(bigDecimal2);
                    SnapshotState<BigDecimal> snapshotState7 = snapshotState3;
                    if (bigDecimal3 == null) {
                        bigDecimal3 = BigDecimal.ZERO;
                    }
                    snapshotState7.setValue(bigDecimal3);
                    SnapshotState<BigDecimal> snapshotState8 = snapshotState4;
                    if (bigDecimal4 == null) {
                        bigDecimal4 = BigDecimal.ZERO;
                    }
                    snapshotState8.setValue(bigDecimal4);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invokeSuspend$lambda$1(LazyListState lazyListState) {
        List<LazyListItemInfo> visibleItemsInfo = lazyListState.getLayoutInfo().getVisibleItemsInfo();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(visibleItemsInfo, 10));
        Iterator<T> it = visibleItemsInfo.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((LazyListItemInfo) it.next()).getIndex()));
        }
        return arrayList;
    }
}
