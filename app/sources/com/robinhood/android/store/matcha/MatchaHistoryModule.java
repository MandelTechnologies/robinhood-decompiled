package com.robinhood.android.store.matcha;

import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.history.HistoryLoaderV2;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader2;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaHistoryModule.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/store/matcha/MatchaHistoryModule;", "", "<init>", "()V", "provideMatchaIncentivesHistoryLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoaderV2;", "matchaIncentivesStore", "Lcom/robinhood/android/store/matcha/MatchaIncentivesStore;", "provideMatchaIncentivesHistoryTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "provideMatchaTransferHistoryLoaderCallbacks", "matchaTransferStore", "Lcom/robinhood/android/store/matcha/MatchaTransferStore;", "provideMatchaTransferHistoryTransactionLoader", "lib-store-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class MatchaHistoryModule {
    public static final MatchaHistoryModule INSTANCE = new MatchaHistoryModule();

    private MatchaHistoryModule() {
    }

    public final HistoryLoaderV2 provideMatchaIncentivesHistoryLoaderCallbacks(MatchaIncentivesStore matchaIncentivesStore) {
        Intrinsics.checkNotNullParameter(matchaIncentivesStore, "matchaIncentivesStore");
        return new HistoryLoaderV2(matchaIncentivesStore.getHistoryLoaderCallbacks(), SetsKt.setOf(AppType.TRADER));
    }

    @HistoryTransactionLoader2(HistoryTransactionType.MATCHA_INCENTIVE)
    public final HistoryTransactionLoader provideMatchaIncentivesHistoryTransactionLoader(MatchaIncentivesStore matchaIncentivesStore) {
        Intrinsics.checkNotNullParameter(matchaIncentivesStore, "matchaIncentivesStore");
        return matchaIncentivesStore.getTransactionLoader();
    }

    public final HistoryLoaderV2 provideMatchaTransferHistoryLoaderCallbacks(MatchaTransferStore matchaTransferStore) {
        Intrinsics.checkNotNullParameter(matchaTransferStore, "matchaTransferStore");
        return new HistoryLoaderV2(matchaTransferStore.getHistoryLoaderCallbacks(), SetsKt.setOf(AppType.TRADER));
    }

    @HistoryTransactionLoader2(HistoryTransactionType.MATCHA_TRANSFER)
    public final HistoryTransactionLoader provideMatchaTransferHistoryTransactionLoader(MatchaTransferStore matchaTransferStore) {
        Intrinsics.checkNotNullParameter(matchaTransferStore, "matchaTransferStore");
        return matchaTransferStore.getTransactionLoader();
    }
}
