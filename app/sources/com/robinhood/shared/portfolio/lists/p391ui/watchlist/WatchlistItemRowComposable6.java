package com.robinhood.shared.portfolio.lists.p391ui.watchlist;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.portfolio.position.SwipeAnimationPreview;
import com.robinhood.android.common.portfolio.position.SwipeRow3;
import com.robinhood.android.swipetodismiss.SwipeToDismiss2;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListState;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.logging.TimberLogger;
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
@DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.watchlist.WatchlistItemRowComposableKt$WatchListItemComposable$3$1", m3645f = "WatchlistItemRowComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.portfolio.lists.ui.watchlist.WatchlistItemRowComposableKt$WatchListItemComposable$3$1, reason: use source file name */
/* loaded from: classes6.dex */
final class WatchlistItemRowComposable6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CuratedListState.Loaded $curatedListState;
    final /* synthetic */ SwipeToDismiss2 $dismissState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WatchlistItemRowComposable6(CuratedListState.Loaded loaded, SwipeToDismiss2 swipeToDismiss2, Continuation<? super WatchlistItemRowComposable6> continuation) {
        super(2, continuation);
        this.$curatedListState = loaded;
        this.$dismissState = swipeToDismiss2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchlistItemRowComposable6(this.$curatedListState, this.$dismissState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchlistItemRowComposable6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        UiEvent<?> event;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SwipeAnimationPreview swipeAnimationPreview = this.$curatedListState.getSwipeAnimationPreview();
            if (swipeAnimationPreview != null && (event = swipeAnimationPreview.getEvent()) != null && !event.getConsumed()) {
                UiEvent<?> event2 = this.$curatedListState.getSwipeAnimationPreview().getEvent();
                if (event2 != null) {
                    event2.consume();
                }
                SwipeToDismiss2 swipeToDismiss2 = this.$dismissState;
                this.label = 1;
                if (SwipeRow3.runSwipeAnimationPreview(swipeToDismiss2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        TimberLogger.INSTANCE.mo1679d("WatchListItemComposable: Swipe animation preview completed", new Object[0]);
        this.$curatedListState.getSwipeAnimationPreview().getOnAnimationComplete().invoke();
        return Unit.INSTANCE;
    }
}
