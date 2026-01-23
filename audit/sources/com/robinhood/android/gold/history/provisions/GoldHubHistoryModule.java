package com.robinhood.android.gold.history.provisions;

import com.robinhood.android.gold.lib.hub.store.GoldHubStore;
import com.robinhood.models.gold.hub.GoldDepositBoostAdjustment;
import com.robinhood.models.gold.hub.GoldDepositBoostPayout;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryLoaderV2;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader2;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldHubHistoryModule.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gold/history/provisions/GoldHubHistoryModule;", "", "<init>", "()V", "provideGoldHubDepositBoostPayoutLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoaderV2;", "goldHubStore", "Lcom/robinhood/android/gold/lib/hub/store/GoldHubStore;", "provideGoldHubDepositBoostAdjustmentLoaderCallbacks", "provideGoldHubDepositBoostPayoutTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "provideGoldHubDepositBoostAdjustmentTransactionLoader", "lib-history-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldHubHistoryModule {
    public static final GoldHubHistoryModule INSTANCE = new GoldHubHistoryModule();

    private GoldHubHistoryModule() {
    }

    public final HistoryLoaderV2 provideGoldHubDepositBoostPayoutLoaderCallbacks(GoldHubStore goldHubStore) {
        Intrinsics.checkNotNullParameter(goldHubStore, "goldHubStore");
        HistoryLoader.Callbacks<GoldDepositBoostPayout> goldDepositBoostPayoutHistoryLoaderCallbacks = goldHubStore.getGoldDepositBoostPayoutHistoryLoaderCallbacks();
        Intrinsics.checkNotNull(goldDepositBoostPayoutHistoryLoaderCallbacks, "null cannot be cast to non-null type com.robinhood.shared.history.HistoryLoader.Callbacks<com.robinhood.shared.models.history.shared.HistoryEvent>");
        return new HistoryLoaderV2(goldDepositBoostPayoutHistoryLoaderCallbacks, SetsKt.setOf(AppType.TRADER));
    }

    public final HistoryLoaderV2 provideGoldHubDepositBoostAdjustmentLoaderCallbacks(GoldHubStore goldHubStore) {
        Intrinsics.checkNotNullParameter(goldHubStore, "goldHubStore");
        HistoryLoader.Callbacks<GoldDepositBoostAdjustment> goldDepositAdjustmentHistoryLoaderCallbacks = goldHubStore.getGoldDepositAdjustmentHistoryLoaderCallbacks();
        Intrinsics.checkNotNull(goldDepositAdjustmentHistoryLoaderCallbacks, "null cannot be cast to non-null type com.robinhood.shared.history.HistoryLoader.Callbacks<com.robinhood.shared.models.history.shared.HistoryEvent>");
        return new HistoryLoaderV2(goldDepositAdjustmentHistoryLoaderCallbacks, SetsKt.setOf(AppType.TRADER));
    }

    @HistoryTransactionLoader2(HistoryTransactionType.GOLD_DEPOSIT_BOOST_CREDIT)
    public final HistoryTransactionLoader provideGoldHubDepositBoostPayoutTransactionLoader(GoldHubStore goldHubStore) {
        Intrinsics.checkNotNullParameter(goldHubStore, "goldHubStore");
        return goldHubStore.getGoldDepositBoostPayoutTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.GOLD_DEPOSIT_BOOST_ADJUSTMENT)
    public final HistoryTransactionLoader provideGoldHubDepositBoostAdjustmentTransactionLoader(GoldHubStore goldHubStore) {
        Intrinsics.checkNotNullParameter(goldHubStore, "goldHubStore");
        return goldHubStore.getGoldDepositBoostAdjustmentTransactionLoader();
    }
}
