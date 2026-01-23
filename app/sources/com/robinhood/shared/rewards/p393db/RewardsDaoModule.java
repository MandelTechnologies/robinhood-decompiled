package com.robinhood.shared.rewards.p393db;

import com.robinhood.shared.rewards.models.p394db.RewardsSummaryDao;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsDaoModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/rewards/db/RewardsDaoModule;", "", "<init>", "()V", "provideRewardsSummaryDao", "Lcom/robinhood/shared/rewards/models/db/RewardsSummaryDao;", "rewardsDatabase", "Lcom/robinhood/shared/rewards/db/RewardsDatabase;", "lib-db-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class RewardsDaoModule {
    public static final RewardsDaoModule INSTANCE = new RewardsDaoModule();

    private RewardsDaoModule() {
    }

    public final RewardsSummaryDao provideRewardsSummaryDao(RewardsDatabase rewardsDatabase) {
        Intrinsics.checkNotNullParameter(rewardsDatabase, "rewardsDatabase");
        return rewardsDatabase.rewardsSummaryDao();
    }
}
