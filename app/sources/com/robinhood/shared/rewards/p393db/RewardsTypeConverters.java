package com.robinhood.shared.rewards.p393db;

import com.robinhood.database.InjectedTypeConverter;
import com.robinhood.shared.rewards.models.p394db.RewardValueEarned;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RewardsTypeConverters.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0007R!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/rewards/db/RewardsTypeConverters;", "Lcom/robinhood/database/InjectedTypeConverter;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lcom/robinhood/utils/moshi/LazyMoshi;)V", "rewardValueEarnedAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/shared/rewards/models/db/RewardValueEarned;", "getRewardValueEarnedAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "rewardValueEarnedAdapter$delegate", "Lkotlin/Lazy;", "stringToRewardValueEarned", "json", "", "rewardValueEarnedToString", "model", "lib-db-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class RewardsTypeConverters implements InjectedTypeConverter {

    /* renamed from: rewardValueEarnedAdapter$delegate, reason: from kotlin metadata */
    private final Lazy rewardValueEarnedAdapter;

    public RewardsTypeConverters(final LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.rewardValueEarnedAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.rewards.db.RewardsTypeConverters$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RewardsTypeConverters.rewardValueEarnedAdapter_delegate$lambda$0(moshi);
            }
        });
    }

    private final JsonAdapter<RewardValueEarned> getRewardValueEarnedAdapter() {
        return (JsonAdapter) this.rewardValueEarnedAdapter.getValue();
    }

    public final RewardValueEarned stringToRewardValueEarned(String json) {
        if (json != null) {
            return getRewardValueEarnedAdapter().fromJson(json);
        }
        return null;
    }

    public final String rewardValueEarnedToString(RewardValueEarned model) {
        if (model != null) {
            return getRewardValueEarnedAdapter().toJson(model);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAdapter rewardValueEarnedAdapter_delegate$lambda$0(LazyMoshi lazyMoshi) {
        Types types = Types.INSTANCE;
        return lazyMoshi.adapter(new TypeToken<RewardValueEarned>() { // from class: com.robinhood.shared.rewards.db.RewardsTypeConverters$rewardValueEarnedAdapter_delegate$lambda$0$$inlined$getAdapter$1
        }.getType());
    }
}
