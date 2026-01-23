package com.robinhood.android.equityscreener.table;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotState4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.PrimitiveRanges2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EquityScreenerTableFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equityscreener.table.EquityScreenerTableFragment$ComposeContent$1$1", m3645f = "EquityScreenerTableFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EquityScreenerTableFragment$ComposeContent$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PrimitiveRanges2 $toolbarHeightRange;
    final /* synthetic */ ScreenerToolbar6 $toolbarState;
    final /* synthetic */ LazyListState $verticalScrollState;
    final /* synthetic */ SnapshotState4<EquityScreenerTableViewState> $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityScreenerTableFragment$ComposeContent$1$1(LazyListState lazyListState, ScreenerToolbar6 screenerToolbar6, PrimitiveRanges2 primitiveRanges2, SnapshotState4<EquityScreenerTableViewState> snapshotState4, Continuation<? super EquityScreenerTableFragment$ComposeContent$1$1> continuation) {
        super(2, continuation);
        this.$verticalScrollState = lazyListState;
        this.$toolbarState = screenerToolbar6;
        this.$toolbarHeightRange = primitiveRanges2;
        this.$viewState$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EquityScreenerTableFragment$ComposeContent$1$1(this.$verticalScrollState, this.$toolbarState, this.$toolbarHeightRange, this.$viewState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EquityScreenerTableFragment$ComposeContent$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            boolean z = ((this.$verticalScrollState.getFirstVisibleItemIndex() == 0 && this.$verticalScrollState.getFirstVisibleItemScrollOffset() == 0) || this.$toolbarState.getProgress() == 0.0f) ? false : true;
            if (!EquityScreenerTableFragment.ComposeContent$lambda$0(this.$viewState$delegate).isScanResultsEmpty() && !EquityScreenerTableFragment.ComposeContent$lambda$0(this.$viewState$delegate).isScanResultsLoading() && z) {
                this.$toolbarState.setScrollOffset(this.$toolbarHeightRange.getLast());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
