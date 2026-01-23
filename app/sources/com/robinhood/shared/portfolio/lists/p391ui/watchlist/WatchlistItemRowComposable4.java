package com.robinhood.shared.portfolio.lists.p391ui.watchlist;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.swipetodismiss.SwipeToDismiss;
import com.robinhood.android.swipetodismiss.SwipeToDismiss2;
import com.robinhood.rosetta.eventlogging.Screen;
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
@DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.watchlist.WatchlistItemRowComposableKt$WatchListItemComposable$1$1", m3645f = "WatchlistItemRowComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.portfolio.lists.ui.watchlist.WatchlistItemRowComposableKt$WatchListItemComposable$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class WatchlistItemRowComposable4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CuratedListState.Loaded $curatedListState;
    final /* synthetic */ SwipeToDismiss2 $dismissState;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ Screen $screen;
    final /* synthetic */ WatchlistItemRow $watchlistItem;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WatchlistItemRowComposable4(SwipeToDismiss2 swipeToDismiss2, EventLogger eventLogger, Screen screen, WatchlistItemRow watchlistItemRow, CuratedListState.Loaded loaded, Continuation<? super WatchlistItemRowComposable4> continuation) {
        super(2, continuation);
        this.$dismissState = swipeToDismiss2;
        this.$eventLogger = eventLogger;
        this.$screen = screen;
        this.$watchlistItem = watchlistItemRow;
        this.$curatedListState = loaded;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchlistItemRowComposable4(this.$dismissState, this.$eventLogger, this.$screen, this.$watchlistItem, this.$curatedListState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchlistItemRowComposable4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SwipeToDismiss dismissDirection = this.$dismissState.getDismissDirection();
        if (dismissDirection == null) {
            return Unit.INSTANCE;
        }
        if (dismissDirection == SwipeToDismiss.StartToEnd) {
            WatchlistItemRowComposable3.logWatchlistSwipeStart(this.$eventLogger, this.$screen, this.$watchlistItem, this.$curatedListState.getAccountNumber());
        }
        return Unit.INSTANCE;
    }
}
