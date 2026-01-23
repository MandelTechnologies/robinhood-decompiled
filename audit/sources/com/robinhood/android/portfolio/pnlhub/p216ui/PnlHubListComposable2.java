package com.robinhood.android.portfolio.pnlhub.p216ui;

import androidx.paging.compose.LazyPagingItems;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p479j$.time.Instant;

/* compiled from: PnlHubListComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt$RefreshTradeItemsEffect$2$1$job$1", m3645f = "PnlHubListComposable.kt", m3646l = {486}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt$RefreshTradeItemsEffect$2$1$job$1, reason: use source file name */
/* loaded from: classes11.dex */
final class PnlHubListComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<Boolean> $refreshTradeItemsFlow;
    final /* synthetic */ LazyPagingItems<ProfitAndLossTradeItem> $tradeItems;
    final /* synthetic */ Function1<Instant, Unit> $updateTradeItemsLastRefreshedTimestamp;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PnlHubListComposable2(Flow<Boolean> flow, LazyPagingItems<ProfitAndLossTradeItem> lazyPagingItems, Function1<? super Instant, Unit> function1, Continuation<? super PnlHubListComposable2> continuation) {
        super(2, continuation);
        this.$refreshTradeItemsFlow = flow;
        this.$tradeItems = lazyPagingItems;
        this.$updateTradeItemsLastRefreshedTimestamp = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PnlHubListComposable2(this.$refreshTradeItemsFlow, this.$tradeItems, this.$updateTradeItemsLastRefreshedTimestamp, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PnlHubListComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<Boolean> flow = this.$refreshTradeItemsFlow;
            final LazyPagingItems<ProfitAndLossTradeItem> lazyPagingItems = this.$tradeItems;
            final Function1<Instant, Unit> function1 = this.$updateTradeItemsLastRefreshedTimestamp;
            FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt$RefreshTradeItemsEffect$2$1$job$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                }

                public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                    if (z) {
                        lazyPagingItems.refresh();
                        Function1<Instant, Unit> function12 = function1;
                        Instant instantNow = Instant.now();
                        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
                        function12.invoke(instantNow);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flow.collect(flowCollector, this) == coroutine_suspended) {
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
