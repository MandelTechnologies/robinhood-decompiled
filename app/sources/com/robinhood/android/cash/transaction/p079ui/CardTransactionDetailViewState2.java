package com.robinhood.android.cash.transaction.p079ui;

import com.robinhood.models.p320db.mcduckling.CardTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardTransactionDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/CardActionEvent;", "", "<init>", "()V", "AddFundsPromptEvent", "ForcePostPromptEvent", "Lcom/robinhood/android/cash/transaction/ui/CardActionEvent$AddFundsPromptEvent;", "Lcom/robinhood/android/cash/transaction/ui/CardActionEvent$ForcePostPromptEvent;", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.transaction.ui.CardActionEvent, reason: use source file name */
/* loaded from: classes7.dex */
public abstract class CardTransactionDetailViewState2 {
    public static final int $stable = 0;

    public /* synthetic */ CardTransactionDetailViewState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: CardTransactionDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/CardActionEvent$AddFundsPromptEvent;", "Lcom/robinhood/android/cash/transaction/ui/CardActionEvent;", "<init>", "()V", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.transaction.ui.CardActionEvent$AddFundsPromptEvent */
    public static final class AddFundsPromptEvent extends CardTransactionDetailViewState2 {
        public static final int $stable = 0;
        public static final AddFundsPromptEvent INSTANCE = new AddFundsPromptEvent();

        private AddFundsPromptEvent() {
            super(null);
        }
    }

    private CardTransactionDetailViewState2() {
    }

    /* compiled from: CardTransactionDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/CardActionEvent$ForcePostPromptEvent;", "Lcom/robinhood/android/cash/transaction/ui/CardActionEvent;", "cardTransaction", "Lcom/robinhood/models/db/mcduckling/CardTransaction;", "<init>", "(Lcom/robinhood/models/db/mcduckling/CardTransaction;)V", "getCardTransaction", "()Lcom/robinhood/models/db/mcduckling/CardTransaction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.transaction.ui.CardActionEvent$ForcePostPromptEvent, reason: from toString */
    public static final /* data */ class ForcePostPromptEvent extends CardTransactionDetailViewState2 {
        public static final int $stable = 8;
        private final CardTransaction cardTransaction;

        public static /* synthetic */ ForcePostPromptEvent copy$default(ForcePostPromptEvent forcePostPromptEvent, CardTransaction cardTransaction, int i, Object obj) {
            if ((i & 1) != 0) {
                cardTransaction = forcePostPromptEvent.cardTransaction;
            }
            return forcePostPromptEvent.copy(cardTransaction);
        }

        /* renamed from: component1, reason: from getter */
        public final CardTransaction getCardTransaction() {
            return this.cardTransaction;
        }

        public final ForcePostPromptEvent copy(CardTransaction cardTransaction) {
            Intrinsics.checkNotNullParameter(cardTransaction, "cardTransaction");
            return new ForcePostPromptEvent(cardTransaction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ForcePostPromptEvent) && Intrinsics.areEqual(this.cardTransaction, ((ForcePostPromptEvent) other).cardTransaction);
        }

        public int hashCode() {
            return this.cardTransaction.hashCode();
        }

        public String toString() {
            return "ForcePostPromptEvent(cardTransaction=" + this.cardTransaction + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForcePostPromptEvent(CardTransaction cardTransaction) {
            super(null);
            Intrinsics.checkNotNullParameter(cardTransaction, "cardTransaction");
            this.cardTransaction = cardTransaction;
        }

        public final CardTransaction getCardTransaction() {
            return this.cardTransaction;
        }
    }
}
