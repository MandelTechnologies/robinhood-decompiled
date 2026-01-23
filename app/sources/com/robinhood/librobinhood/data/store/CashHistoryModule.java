package com.robinhood.librobinhood.data.store;

import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader2;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CashHistoryModule.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CashHistoryModule;", "", "<init>", "()V", "providePendingCardTransactionHistoryTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "cardTransactionHistoryStore", "Lcom/robinhood/librobinhood/data/store/CardTransactionHistoryStore;", "provideSettledCardTransactionHistoryTransactionLoader", "provideDeclinedCardTransactionHistoryTransactionLoader", "provideCheckPaymentHistoryTransactionLoader", "checkPaymentStore", "Lcom/robinhood/librobinhood/data/store/CheckPaymentStore;", "provideDisputeTransactionHistoryTransactionLoader", "disputeHistoryStore", "Lcom/robinhood/librobinhood/data/store/DisputeHistoryStore;", "lib-store-cash_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CashHistoryModule {
    public static final CashHistoryModule INSTANCE = new CashHistoryModule();

    private CashHistoryModule() {
    }

    @HistoryTransactionLoader2(HistoryTransactionType.PENDING_CARD_TRANSACTION)
    public final HistoryTransactionLoader providePendingCardTransactionHistoryTransactionLoader(CardTransactionHistoryStore cardTransactionHistoryStore) {
        Intrinsics.checkNotNullParameter(cardTransactionHistoryStore, "cardTransactionHistoryStore");
        return cardTransactionHistoryStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.SETTLED_CARD_TRANSACTION)
    public final HistoryTransactionLoader provideSettledCardTransactionHistoryTransactionLoader(CardTransactionHistoryStore cardTransactionHistoryStore) {
        Intrinsics.checkNotNullParameter(cardTransactionHistoryStore, "cardTransactionHistoryStore");
        return cardTransactionHistoryStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.DECLINED_CARD_TRANSACTION)
    public final HistoryTransactionLoader provideDeclinedCardTransactionHistoryTransactionLoader(CardTransactionHistoryStore cardTransactionHistoryStore) {
        Intrinsics.checkNotNullParameter(cardTransactionHistoryStore, "cardTransactionHistoryStore");
        return cardTransactionHistoryStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.CHECK_PAYMENT)
    public final HistoryTransactionLoader provideCheckPaymentHistoryTransactionLoader(CheckPaymentStore checkPaymentStore) {
        Intrinsics.checkNotNullParameter(checkPaymentStore, "checkPaymentStore");
        return checkPaymentStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.DISPUTE)
    public final HistoryTransactionLoader provideDisputeTransactionHistoryTransactionLoader(DisputeHistoryStore disputeHistoryStore) {
        Intrinsics.checkNotNullParameter(disputeHistoryStore, "disputeHistoryStore");
        return disputeHistoryStore.getTransactionLoader();
    }
}
