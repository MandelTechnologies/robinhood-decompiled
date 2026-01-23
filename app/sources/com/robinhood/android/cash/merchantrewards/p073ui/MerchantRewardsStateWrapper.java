package com.robinhood.android.cash.merchantrewards.p073ui;

import com.robinhood.models.p320db.mcduckling.MerchantRewardUserState;
import com.robinhood.models.util.Money3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MerchantRewardsOverviewViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsStateWrapper;", "", "state", "Lcom/robinhood/models/db/mcduckling/MerchantRewardUserState;", "<init>", "(Lcom/robinhood/models/db/mcduckling/MerchantRewardUserState;)V", "getState", "()Lcom/robinhood/models/db/mcduckling/MerchantRewardUserState;", "hasRewards", "", "getHasRewards", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class MerchantRewardsStateWrapper {
    public static final int $stable = 8;
    private final MerchantRewardUserState state;

    /* JADX WARN: Multi-variable type inference failed */
    public MerchantRewardsStateWrapper() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MerchantRewardsStateWrapper copy$default(MerchantRewardsStateWrapper merchantRewardsStateWrapper, MerchantRewardUserState merchantRewardUserState, int i, Object obj) {
        if ((i & 1) != 0) {
            merchantRewardUserState = merchantRewardsStateWrapper.state;
        }
        return merchantRewardsStateWrapper.copy(merchantRewardUserState);
    }

    /* renamed from: component1, reason: from getter */
    public final MerchantRewardUserState getState() {
        return this.state;
    }

    public final MerchantRewardsStateWrapper copy(MerchantRewardUserState state) {
        return new MerchantRewardsStateWrapper(state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MerchantRewardsStateWrapper) && Intrinsics.areEqual(this.state, ((MerchantRewardsStateWrapper) other).state);
    }

    public int hashCode() {
        MerchantRewardUserState merchantRewardUserState = this.state;
        if (merchantRewardUserState == null) {
            return 0;
        }
        return merchantRewardUserState.hashCode();
    }

    public String toString() {
        return "MerchantRewardsStateWrapper(state=" + this.state + ")";
    }

    public MerchantRewardsStateWrapper(MerchantRewardUserState merchantRewardUserState) {
        this.state = merchantRewardUserState;
    }

    public /* synthetic */ MerchantRewardsStateWrapper(MerchantRewardUserState merchantRewardUserState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : merchantRewardUserState);
    }

    public final MerchantRewardUserState getState() {
        return this.state;
    }

    public final boolean getHasRewards() {
        MerchantRewardUserState merchantRewardUserState = this.state;
        return Money3.isPositive(merchantRewardUserState != null ? merchantRewardUserState.getTotalReward() : null);
    }
}
