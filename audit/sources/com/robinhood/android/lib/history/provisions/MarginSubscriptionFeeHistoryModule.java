package com.robinhood.android.lib.history.provisions;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.lib.store.margin.MarginSubscriptionFeeStore;
import com.robinhood.models.p320db.MarginSubscriptionFee;
import com.robinhood.models.p320db.MarginSubscriptionFeeRefund;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryLoaderV2;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader2;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginSubscriptionFeeHistoryModule.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/history/provisions/MarginSubscriptionFeeHistoryModule;", "", "<init>", "()V", "provideFeeRefundHistoryLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoaderV2;", PlaceTypes.STORE, "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionFeeStore;", "provideFeeRefundHistoryTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "provideFeeHistoryLoaderCallbacks", "provideFeeHistoryTransactionLoader", "lib-history-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MarginSubscriptionFeeHistoryModule {
    public static final MarginSubscriptionFeeHistoryModule INSTANCE = new MarginSubscriptionFeeHistoryModule();

    private MarginSubscriptionFeeHistoryModule() {
    }

    public final HistoryLoaderV2 provideFeeRefundHistoryLoaderCallbacks(MarginSubscriptionFeeStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        HistoryLoader.Callbacks<MarginSubscriptionFeeRefund> refundsHistoryLoaderCallback = store.getRefundsHistoryLoaderCallback();
        Intrinsics.checkNotNull(refundsHistoryLoaderCallback, "null cannot be cast to non-null type com.robinhood.shared.history.HistoryLoader.Callbacks<com.robinhood.shared.models.history.shared.HistoryEvent>");
        return new HistoryLoaderV2(refundsHistoryLoaderCallback, SetsKt.setOf(AppType.TRADER));
    }

    @HistoryTransactionLoader2(HistoryTransactionType.MARGIN_SUBSCRIPTION_FEE_REFUND)
    public final HistoryTransactionLoader provideFeeRefundHistoryTransactionLoader(MarginSubscriptionFeeStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return store.getRefundsTransactionLoader();
    }

    public final HistoryLoaderV2 provideFeeHistoryLoaderCallbacks(MarginSubscriptionFeeStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        HistoryLoader.Callbacks<MarginSubscriptionFee> feesHistoryLoaderCallback = store.getFeesHistoryLoaderCallback();
        Intrinsics.checkNotNull(feesHistoryLoaderCallback, "null cannot be cast to non-null type com.robinhood.shared.history.HistoryLoader.Callbacks<com.robinhood.shared.models.history.shared.HistoryEvent>");
        return new HistoryLoaderV2(feesHistoryLoaderCallback, SetsKt.setOf(AppType.TRADER));
    }

    @HistoryTransactionLoader2(HistoryTransactionType.MARGIN_SUBSCRIPTION_FEE)
    public final HistoryTransactionLoader provideFeeHistoryTransactionLoader(MarginSubscriptionFeeStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return store.getFeesTransactionLoader();
    }
}
