package com.robinhood.librobinhood.data.store;

import com.robinhood.librobinhood.data.store.bff.PaymentIntentStore;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.history.HistoryLoaderV2;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader2;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentIntentHistoryModule.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/PaymentIntentHistoryModule;", "", "<init>", "()V", "provideSgBankTransferHistoryTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "paymentIntentStore", "Lcom/robinhood/librobinhood/data/store/bff/PaymentIntentStore;", "provideI18nWireHistoryTransactionLoader", "providePaymentIntentHistoryLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoaderV2;", "lib-store-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class PaymentIntentHistoryModule {
    public static final PaymentIntentHistoryModule INSTANCE = new PaymentIntentHistoryModule();

    private PaymentIntentHistoryModule() {
    }

    @HistoryTransactionLoader2(HistoryTransactionType.SG_BANK_TRANSFER)
    public final HistoryTransactionLoader provideSgBankTransferHistoryTransactionLoader(PaymentIntentStore paymentIntentStore) {
        Intrinsics.checkNotNullParameter(paymentIntentStore, "paymentIntentStore");
        return paymentIntentStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.I18N_WIRE)
    public final HistoryTransactionLoader provideI18nWireHistoryTransactionLoader(PaymentIntentStore paymentIntentStore) {
        Intrinsics.checkNotNullParameter(paymentIntentStore, "paymentIntentStore");
        return paymentIntentStore.getTransactionLoader();
    }

    public final HistoryLoaderV2 providePaymentIntentHistoryLoaderCallbacks(PaymentIntentStore paymentIntentStore) {
        Intrinsics.checkNotNullParameter(paymentIntentStore, "paymentIntentStore");
        return new HistoryLoaderV2(paymentIntentStore.getHistoryLoaderCallbacks(), SetsKt.setOf((Object[]) new AppType[]{AppType.TRADER, AppType.RHC}));
    }
}
