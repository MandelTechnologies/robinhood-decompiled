package com.robinhood.librobinhood.data.store;

import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.history.HistoryLoaderV2;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader2;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyRewardHistoryModule.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RhyRewardHistoryModule;", "", "<init>", "()V", "provideRoundupHistoryLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoaderV2;", "rhyRewardStore", "Lcom/robinhood/librobinhood/data/store/RhyRewardStore;", "provideRoundupHistoryTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "provideMerchantRewardHistoryLoaderCallbacks", "provideMerchantRewardHistoryTransactionLoader", "lib-store-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RhyRewardHistoryModule {
    public static final RhyRewardHistoryModule INSTANCE = new RhyRewardHistoryModule();

    private RhyRewardHistoryModule() {
    }

    public final HistoryLoaderV2 provideRoundupHistoryLoaderCallbacks(RhyRewardStore rhyRewardStore) {
        Intrinsics.checkNotNullParameter(rhyRewardStore, "rhyRewardStore");
        return new HistoryLoaderV2(rhyRewardStore.getRoundupHistoryLoaderCallbacks(), SetsKt.setOf(AppType.TRADER));
    }

    @HistoryTransactionLoader2(HistoryTransactionType.ROUNDUP_REWARD)
    public final HistoryTransactionLoader provideRoundupHistoryTransactionLoader(RhyRewardStore rhyRewardStore) {
        Intrinsics.checkNotNullParameter(rhyRewardStore, "rhyRewardStore");
        return rhyRewardStore.getRoundUpHistoryTransactionLoader();
    }

    public final HistoryLoaderV2 provideMerchantRewardHistoryLoaderCallbacks(RhyRewardStore rhyRewardStore) {
        Intrinsics.checkNotNullParameter(rhyRewardStore, "rhyRewardStore");
        return new HistoryLoaderV2(rhyRewardStore.getMerchantHistoryLoaderCallbacks(), SetsKt.setOf(AppType.TRADER));
    }

    @HistoryTransactionLoader2(HistoryTransactionType.MERCHANT_REWARD)
    public final HistoryTransactionLoader provideMerchantRewardHistoryTransactionLoader(RhyRewardStore rhyRewardStore) {
        Intrinsics.checkNotNullParameter(rhyRewardStore, "rhyRewardStore");
        return rhyRewardStore.getMerchantHistoryTransactionLoader();
    }
}
