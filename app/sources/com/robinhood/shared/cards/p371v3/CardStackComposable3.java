package com.robinhood.shared.cards.p371v3;

import com.plaid.internal.EnumC7081g;
import com.robinhood.shared.cards.compose.NotificationCardComposable4;
import com.robinhood.shared.cards.compose.SwipeableStackState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: CardStackComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.cards.v3.CardStackComposableKt$CardStackComposable$1$1$1$3$1$1$1$1", m3645f = "CardStackComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.cards.v3.CardStackComposableKt$CardStackComposable$1$1$1$3$1$1$1$1, reason: use source file name */
/* loaded from: classes26.dex */
final class CardStackComposable3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ NotificationCardComposable4 $card;
    final /* synthetic */ CardStackDuxo $duxo;
    final /* synthetic */ SwipeableStackState<NotificationCardComposable4> $swipeableStackState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardStackComposable3(CardStackDuxo cardStackDuxo, NotificationCardComposable4 notificationCardComposable4, SwipeableStackState<NotificationCardComposable4> swipeableStackState, Continuation<? super CardStackComposable3> continuation) {
        super(2, continuation);
        this.$duxo = cardStackDuxo;
        this.$card = notificationCardComposable4;
        this.$swipeableStackState = swipeableStackState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardStackComposable3(this.$duxo, this.$card, this.$swipeableStackState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CardStackComposable3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$duxo.dismissCard(this.$card, this.$swipeableStackState.getDismissedItems());
        return Unit.INSTANCE;
    }
}
