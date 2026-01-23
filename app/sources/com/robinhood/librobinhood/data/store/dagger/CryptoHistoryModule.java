package com.robinhood.librobinhood.data.store.dagger;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.librobinhood.data.store.CryptoGiftStore;
import com.robinhood.librobinhood.data.store.CryptoOrderStore;
import com.robinhood.librobinhood.data.store.CryptoStakingStore;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.models.crypto.p314db.staking.CryptoStakingHistoryItem;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryLoaderV2;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader2;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHistoryModule.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0018H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/dagger/CryptoHistoryModule;", "", "<init>", "()V", "provideCryptoOrderHistoryLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoaderV2;", "cryptoOrderStore", "Lcom/robinhood/librobinhood/data/store/CryptoOrderStore;", "provideCryptoOrderHistoryTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "provideCryptoMarketOrderHistoryTransactionLoader", "provideCryptoLimitOrderHistoryTransactionLoader", "provideCryptoStopLossOrderHistoryTransactionLoader", "provideCryptoStopLimitOrderHistoryTransactionLoader", "provideCryptoTransfersHistoryLoaderCallbacks", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "provideCryptoTransfersHistoryTransactionLoader", "provideCryptoGiftHistoryLoaderCallbacks", "cryptoGiftStore", "Lcom/robinhood/librobinhood/data/store/CryptoGiftStore;", "provideCryptoGiftHistoryTransactionLoader", "provideCryptoDemeterHistoryLoaderCallbacks", PlaceTypes.STORE, "Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;", "provideCryptoDemeterHistoryTransactionLoader", "cryptoStakingStore", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoHistoryModule {
    public static final CryptoHistoryModule INSTANCE = new CryptoHistoryModule();

    private CryptoHistoryModule() {
    }

    public final HistoryLoaderV2 provideCryptoOrderHistoryLoaderCallbacks(CryptoOrderStore cryptoOrderStore) {
        Intrinsics.checkNotNullParameter(cryptoOrderStore, "cryptoOrderStore");
        return new HistoryLoaderV2(cryptoOrderStore.getHistoryLoaderCallbacks(), SetsKt.setOf((Object[]) new AppType[]{AppType.TRADER, AppType.RHC}));
    }

    @HistoryTransactionLoader2(HistoryTransactionType.CRYPTO_ORDER)
    public final HistoryTransactionLoader provideCryptoOrderHistoryTransactionLoader(CryptoOrderStore cryptoOrderStore) {
        Intrinsics.checkNotNullParameter(cryptoOrderStore, "cryptoOrderStore");
        return cryptoOrderStore.getHistoryTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.CRYPTO_MARKET_ORDER)
    public final HistoryTransactionLoader provideCryptoMarketOrderHistoryTransactionLoader(CryptoOrderStore cryptoOrderStore) {
        Intrinsics.checkNotNullParameter(cryptoOrderStore, "cryptoOrderStore");
        return cryptoOrderStore.getHistoryTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.CRYPTO_LIMIT_ORDER)
    public final HistoryTransactionLoader provideCryptoLimitOrderHistoryTransactionLoader(CryptoOrderStore cryptoOrderStore) {
        Intrinsics.checkNotNullParameter(cryptoOrderStore, "cryptoOrderStore");
        return cryptoOrderStore.getHistoryTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.CRYPTO_STOP_LOSS_ORDER)
    public final HistoryTransactionLoader provideCryptoStopLossOrderHistoryTransactionLoader(CryptoOrderStore cryptoOrderStore) {
        Intrinsics.checkNotNullParameter(cryptoOrderStore, "cryptoOrderStore");
        return cryptoOrderStore.getHistoryTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.CRYPTO_STOP_LIMIT_ORDER)
    public final HistoryTransactionLoader provideCryptoStopLimitOrderHistoryTransactionLoader(CryptoOrderStore cryptoOrderStore) {
        Intrinsics.checkNotNullParameter(cryptoOrderStore, "cryptoOrderStore");
        return cryptoOrderStore.getHistoryTransactionLoader();
    }

    public final HistoryLoaderV2 provideCryptoTransfersHistoryLoaderCallbacks(CryptoTransfersStore cryptoTransfersStore) {
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        return new HistoryLoaderV2(cryptoTransfersStore.getHistoryLoaderCallbacks(), SetsKt.setOf((Object[]) new AppType[]{AppType.TRADER, AppType.RHC}));
    }

    @HistoryTransactionLoader2(HistoryTransactionType.CRYPTO_TRANSFER)
    public final HistoryTransactionLoader provideCryptoTransfersHistoryTransactionLoader(CryptoTransfersStore cryptoTransfersStore) {
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        return cryptoTransfersStore.getHistoryTransactionLoader();
    }

    public final HistoryLoaderV2 provideCryptoGiftHistoryLoaderCallbacks(CryptoGiftStore cryptoGiftStore) {
        Intrinsics.checkNotNullParameter(cryptoGiftStore, "cryptoGiftStore");
        return new HistoryLoaderV2(cryptoGiftStore.getHistoryLoaderCallbacks(), SetsKt.setOf((Object[]) new AppType[]{AppType.TRADER, AppType.RHC}));
    }

    @HistoryTransactionLoader2(HistoryTransactionType.CRYPTO_GIFT_ITEM)
    public final HistoryTransactionLoader provideCryptoGiftHistoryTransactionLoader(CryptoGiftStore cryptoGiftStore) {
        Intrinsics.checkNotNullParameter(cryptoGiftStore, "cryptoGiftStore");
        return cryptoGiftStore.getHistoryTransactionLoader();
    }

    public final HistoryLoaderV2 provideCryptoDemeterHistoryLoaderCallbacks(CryptoStakingStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        HistoryLoader.Callbacks<CryptoStakingHistoryItem> historyLoaderCallbacks = store.getHistoryLoaderCallbacks();
        Intrinsics.checkNotNull(historyLoaderCallbacks, "null cannot be cast to non-null type com.robinhood.shared.history.HistoryLoader.Callbacks<com.robinhood.shared.models.history.shared.HistoryEvent>");
        return new HistoryLoaderV2(historyLoaderCallbacks, SetsKt.setOf((Object[]) new AppType[]{AppType.TRADER, AppType.RHC}));
    }

    @HistoryTransactionLoader2(HistoryTransactionType.CRYPTO_STAKING)
    public final HistoryTransactionLoader provideCryptoDemeterHistoryTransactionLoader(CryptoStakingStore cryptoStakingStore) {
        Intrinsics.checkNotNullParameter(cryptoStakingStore, "cryptoStakingStore");
        return cryptoStakingStore.getHistoryTransactionLoader();
    }
}
