package com.robinhood.shared.cards.p371v3;

import com.robinhood.shared.cards.NotificationCard;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CardStackDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/cards/v3/CardStackDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.cards.v3.CardStackDuxo$onStart$1$1", m3645f = "CardStackDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.cards.v3.CardStackDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes26.dex */
final class CardStackDuxo3 extends ContinuationImpl7 implements Function2<CardStackDataState, Continuation<? super CardStackDataState>, Object> {
    final /* synthetic */ NotificationCard.Stack $newStack;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardStackDuxo3(NotificationCard.Stack stack, Continuation<? super CardStackDuxo3> continuation) {
        super(2, continuation);
        this.$newStack = stack;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CardStackDuxo3 cardStackDuxo3 = new CardStackDuxo3(this.$newStack, continuation);
        cardStackDuxo3.L$0 = obj;
        return cardStackDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CardStackDataState cardStackDataState, Continuation<? super CardStackDataState> continuation) {
        return ((CardStackDuxo3) create(cardStackDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CardStackDataState cardStackDataState = (CardStackDataState) this.L$0;
        return CardStackDataState.copy$default(cardStackDataState, null, null, null, this.$newStack, !Intrinsics.areEqual(this.$newStack, cardStackDataState.getCards$lib_cards_externalDebug()) ? extensions2.persistentSetOf() : cardStackDataState.getDismissedCards$lib_cards_externalDebug(), 7, null);
    }
}
