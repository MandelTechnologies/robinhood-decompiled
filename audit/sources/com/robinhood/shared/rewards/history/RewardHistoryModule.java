package com.robinhood.shared.rewards.history;

import com.robinhood.android.common.history.p082ui.format.HistoryFormatter;
import com.robinhood.android.common.history.p082ui.format.HistoryFormatterKey;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardHistoryModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/rewards/history/RewardHistoryModule;", "", "<init>", "()V", "provideStockRewardsHistoryFormatter", "Lcom/robinhood/android/common/history/ui/format/HistoryFormatter;", "formatter", "Lcom/robinhood/shared/rewards/history/StockRewardItemFormatter;", "provideCashRewardsHistoryFormatter", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class RewardHistoryModule {
    public static final RewardHistoryModule INSTANCE = new RewardHistoryModule();

    private RewardHistoryModule() {
    }

    @HistoryFormatterKey(HistoryTransactionType.STOCK_REWARD_ITEM)
    public final HistoryFormatter provideStockRewardsHistoryFormatter(StockRewardItemFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }

    @HistoryFormatterKey(HistoryTransactionType.CASH_REWARD_ITEM)
    public final HistoryFormatter provideCashRewardsHistoryFormatter(StockRewardItemFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }
}
