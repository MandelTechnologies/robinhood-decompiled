package com.robinhood.android.cash.transaction.p079ui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.librobinhood.data.store.CardTransactionStore;
import com.robinhood.models.p320db.mcduckling.DeclinedCardTransaction;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CardTransactionDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$onDenyTransaction$markFraudulentCompletable$1", m3645f = "CardTransactionDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$onDenyTransaction$markFraudulentCompletable$1, reason: use source file name */
/* loaded from: classes7.dex */
final class CardTransactionDetailDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DeclinedCardTransaction $cardTransaction;
    int label;
    final /* synthetic */ CardTransactionDetailDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardTransactionDetailDuxo2(CardTransactionDetailDuxo cardTransactionDetailDuxo, DeclinedCardTransaction declinedCardTransaction, Continuation<? super CardTransactionDetailDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = cardTransactionDetailDuxo;
        this.$cardTransaction = declinedCardTransaction;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardTransactionDetailDuxo2(this.this$0, this.$cardTransaction, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CardTransactionDetailDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CardTransactionStore cardTransactionStore = this.this$0.cardTransactionStore;
            UUID id = this.$cardTransaction.getId();
            this.label = 1;
            if (cardTransactionStore.markFraudulent(id, this) == coroutine_suspended) {
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
