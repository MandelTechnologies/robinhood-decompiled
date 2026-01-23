package com.robinhood.android.portfolio.pnlhub.p216ui;

import androidx.compose.foundation.lazy.LazyListState;
import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.portfolio.pnl.p215ui.UiProfitAndLossTradeGroup;
import com.robinhood.android.portfolio.pnlhub.PnlHubViewState;
import com.robinhood.android.portfolio.pnlhub.ProfitAndLossTradeListState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Yield;

/* compiled from: PnlHubComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.ui.PnlHubComposableKt$PnlHubComposable$5$1$1$1", m3645f = "PnlHubComposable.kt", m3646l = {342, 344}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.portfolio.pnlhub.ui.PnlHubComposableKt$PnlHubComposable$5$1$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class PnlHubComposable9 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ Function2<String, List<? extends AssetClass>, Unit> $onScroll;
    final /* synthetic */ PnlHubViewState $viewState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PnlHubComposable9(PnlHubViewState pnlHubViewState, LazyListState lazyListState, int i, Function2<? super String, ? super List<? extends AssetClass>, Unit> function2, Continuation<? super PnlHubComposable9> continuation) {
        super(2, continuation);
        this.$viewState = pnlHubViewState;
        this.$listState = lazyListState;
        this.$index = i;
        this.$onScroll = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PnlHubComposable9(this.$viewState, this.$listState, this.$index, this.$onScroll, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PnlHubComposable9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (androidx.compose.foundation.lazy.LazyListState.animateScrollToItem$default(r4, r5, 0, r7, 2, null) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PnlHubComposable9 pnlHubComposable9;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0 || i == 1) {
            ResultKt.throwOnFailure(obj);
            while (true) {
                if (((ProfitAndLossTradeListState.Grouped) ((PnlHubViewState.Ready) this.$viewState).getTradeListState()).getShowDebouncedLoadingSpinner()) {
                    this.label = 1;
                    if (Yield.yield(this) == coroutine_suspended) {
                        break;
                    }
                } else {
                    LazyListState lazyListState = this.$listState;
                    int i2 = this.$index;
                    this.label = 2;
                    pnlHubComposable9 = this;
                }
            }
            return coroutine_suspended;
        }
        if (i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        pnlHubComposable9 = this;
        UiProfitAndLossTradeGroup uiProfitAndLossTradeGroup = ((ProfitAndLossTradeListState.Grouped) ((PnlHubViewState.Ready) pnlHubComposable9.$viewState).getTradeListState()).getTradeGroups().get(pnlHubComposable9.$index);
        pnlHubComposable9.$onScroll.invoke(uiProfitAndLossTradeGroup.getId(), uiProfitAndLossTradeGroup.getAssetClasses());
        return Unit.INSTANCE;
    }
}
