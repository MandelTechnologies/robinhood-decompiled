package com.robinhood.shared.rewards.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.shared.rewards.RewardsApi;
import com.robinhood.shared.rewards.models.api.ApiRewardsSummary;
import com.robinhood.shared.rewards.models.p394db.RewardsSummary;
import com.robinhood.shared.rewards.models.p394db.RewardsSummaryDao;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RewardsSummaryStore.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u00118\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/rewards/store/RewardsSummaryStore;", "Lcom/robinhood/store/Store;", "rewardsApi", "Lcom/robinhood/shared/rewards/RewardsApi;", "rewardsSummaryDao", "Lcom/robinhood/shared/rewards/models/db/RewardsSummaryDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/shared/rewards/RewardsApi;Lcom/robinhood/shared/rewards/models/db/RewardsSummaryDao;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/shared/rewards/models/api/ApiRewardsSummary;", "getEndpoint$annotations", "()V", "query", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/shared/rewards/models/db/RewardsSummary;", "getQuery$lib_store_rewards_externalDebug$annotations", "getQuery$lib_store_rewards_externalDebug", "()Lcom/robinhood/android/moria/db/Query;", "stream", "Lkotlinx/coroutines/flow/Flow;", "lib-store-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class RewardsSummaryStore extends Store {
    private final Endpoint<Unit, ApiRewardsSummary> endpoint;
    private final Query<Unit, RewardsSummary> query;
    private final RewardsApi rewardsApi;
    private final RewardsSummaryDao rewardsSummaryDao;

    private static /* synthetic */ void getEndpoint$annotations() {
    }

    public static /* synthetic */ void getQuery$lib_store_rewards_externalDebug$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsSummaryStore(RewardsApi rewardsApi, RewardsSummaryDao rewardsSummaryDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(rewardsApi, "rewardsApi");
        Intrinsics.checkNotNullParameter(rewardsSummaryDao, "rewardsSummaryDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.rewardsApi = rewardsApi;
        this.rewardsSummaryDao = rewardsSummaryDao;
        Endpoint<Unit, ApiRewardsSummary> endpointCreate$default = Endpoint.Companion.create$default(Endpoint.INSTANCE, new RewardsSummaryStore2(this, null), getLogoutKillswitch(), new RewardsSummaryStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.endpoint = endpointCreate$default;
        this.query = Store.create$default(this, Query.INSTANCE, "streamRewardsSummary", CollectionsKt.listOf(new PollEach(getStoreScope(), new RewardsSummaryStore4(endpointCreate$default))), new Function1() { // from class: com.robinhood.shared.rewards.store.RewardsSummaryStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsSummaryStore.query$lambda$0(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    public final Query<Unit, RewardsSummary> getQuery$lib_store_rewards_externalDebug() {
        return this.query;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(RewardsSummaryStore rewardsSummaryStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return rewardsSummaryStore.rewardsSummaryDao.get();
    }

    public final Flow<RewardsSummary> stream() {
        return this.query.asFlow(Unit.INSTANCE);
    }
}
