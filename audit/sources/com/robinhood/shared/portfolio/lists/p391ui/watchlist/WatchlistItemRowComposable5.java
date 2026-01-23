package com.robinhood.shared.portfolio.lists.p391ui.watchlist;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.swipetodismiss.SwipeToDismiss2;
import com.robinhood.android.swipetodismiss.SwipeToDismiss3;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListDuxo7;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WatchlistItemRowComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.watchlist.WatchlistItemRowComposableKt$WatchListItemComposable$2$1", m3645f = "WatchlistItemRowComposable.kt", m3646l = {131}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.portfolio.lists.ui.watchlist.WatchlistItemRowComposableKt$WatchListItemComposable$2$1, reason: use source file name */
/* loaded from: classes6.dex */
final class WatchlistItemRowComposable5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CuratedListState.Loaded $curatedListState;
    final /* synthetic */ SwipeToDismiss2 $dismissState;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ Screen $screen;
    final /* synthetic */ CuratedListDuxo7.WatchlistItem $watchlist;
    final /* synthetic */ WatchlistItemRow $watchlistItem;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WatchlistItemRowComposable5(SwipeToDismiss2 swipeToDismiss2, CuratedListState.Loaded loaded, CuratedListDuxo7.WatchlistItem watchlistItem, WatchlistItemRow watchlistItemRow, EventLogger eventLogger, Screen screen, Continuation<? super WatchlistItemRowComposable5> continuation) {
        super(2, continuation);
        this.$dismissState = swipeToDismiss2;
        this.$curatedListState = loaded;
        this.$watchlist = watchlistItem;
        this.$watchlistItem = watchlistItemRow;
        this.$eventLogger = eventLogger;
        this.$screen = screen;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchlistItemRowComposable5(this.$dismissState, this.$curatedListState, this.$watchlist, this.$watchlistItem, this.$eventLogger, this.$screen, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchlistItemRowComposable5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$dismissState.getCurrentValue() == SwipeToDismiss3.DismissedToStart && !this.$dismissState.isAnimationRunning()) {
                this.$curatedListState.getOnWatchListItemRemoved().invoke(this.$watchlist.getId(), this.$watchlistItem.getCuratedListItem());
            }
            if (this.$dismissState.getCurrentValue() == SwipeToDismiss3.DismissedToEnd && !this.$dismissState.isAnimationRunning()) {
                SwipeToDismiss2 swipeToDismiss2 = this.$dismissState;
                this.label = 1;
                if (swipeToDismiss2.reset(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$curatedListState.getOnSwipe().invoke();
        WatchlistItemRowComposable3.logWatchlistSwipeCompleted(this.$eventLogger, this.$screen, this.$watchlistItem, this.$curatedListState.getAccountNumber());
        this.$curatedListState.getOnWatchListItemBuy().invoke(this.$watchlistItem.getCuratedListItem());
        return Unit.INSTANCE;
    }
}
