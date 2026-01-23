package com.robinhood.android.portfolio.pnlhub.p216ui;

import androidx.compose.foundation.lazy.LazyListState;
import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.portfolio.pnl.p215ui.UiProfitAndLossTradeGroup;
import com.robinhood.android.portfolio.pnlhub.PnlHubViewState;
import com.robinhood.android.portfolio.pnlhub.ProfitAndLossTradeListState;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PnlHubComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.ui.PnlHubComposableKt$PnlHubComposable$5$1", m3645f = "PnlHubComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.pnlhub.ui.PnlHubComposableKt$PnlHubComposable$5$1, reason: use source file name */
/* loaded from: classes11.dex */
final class PnlHubComposable8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ Function2<String, List<? extends AssetClass>, Unit> $onScroll;
    final /* synthetic */ PnlHubViewState $viewState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PnlHubComposable8(PnlHubViewState pnlHubViewState, CoroutineScope coroutineScope, LazyListState lazyListState, Function2<? super String, ? super List<? extends AssetClass>, Unit> function2, Continuation<? super PnlHubComposable8> continuation) {
        super(2, continuation);
        this.$viewState = pnlHubViewState;
        this.$coroutineScope = coroutineScope;
        this.$listState = lazyListState;
        this.$onScroll = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PnlHubComposable8(this.$viewState, this.$coroutineScope, this.$listState, this.$onScroll, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PnlHubComposable8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String scrollToSymbol = ((PnlHubViewState.Ready) this.$viewState).getScrollToSymbol();
        if (scrollToSymbol != null) {
            PnlHubViewState pnlHubViewState = this.$viewState;
            CoroutineScope coroutineScope = this.$coroutineScope;
            LazyListState lazyListState = this.$listState;
            Function2<String, List<? extends AssetClass>, Unit> function2 = this.$onScroll;
            PnlHubViewState.Ready ready = (PnlHubViewState.Ready) pnlHubViewState;
            if (ready.getTradeListState() instanceof ProfitAndLossTradeListState.Grouped) {
                Iterator<UiProfitAndLossTradeGroup> it = ((ProfitAndLossTradeListState.Grouped) ready.getTradeListState()).getTradeGroups().iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (Intrinsics.areEqual(it.next().getDisplayName(), scrollToSymbol)) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PnlHubComposable9(pnlHubViewState, lazyListState, i, function2, null), 3, null);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
