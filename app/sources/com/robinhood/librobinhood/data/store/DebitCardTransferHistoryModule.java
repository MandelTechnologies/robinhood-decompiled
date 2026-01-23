package com.robinhood.librobinhood.data.store;

import com.robinhood.librobinhood.data.store.bonfire.DebitCardTransferHistoryStore;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader2;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebitCardTransferHistoryModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/DebitCardTransferHistoryModule;", "", "<init>", "()V", "provideDebitCardTransferHistoryTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "debitCardTransferHistoryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DebitCardTransferHistoryStore;", "lib-store-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class DebitCardTransferHistoryModule {
    public static final DebitCardTransferHistoryModule INSTANCE = new DebitCardTransferHistoryModule();

    private DebitCardTransferHistoryModule() {
    }

    @HistoryTransactionLoader2(HistoryTransactionType.DEBIT_CARD_TRANSFER)
    public final HistoryTransactionLoader provideDebitCardTransferHistoryTransactionLoader(DebitCardTransferHistoryStore debitCardTransferHistoryStore) {
        Intrinsics.checkNotNullParameter(debitCardTransferHistoryStore, "debitCardTransferHistoryStore");
        return debitCardTransferHistoryStore.getTransactionLoader();
    }
}
