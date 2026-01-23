package com.robinhood.android.crypto.tab.p093ui.rewards.card;

import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.models.util.Money;
import com.robinhood.shared.rewards.models.p394db.RewardValueEarned;
import com.robinhood.shared.rewards.models.p394db.RewardsSummary;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHomeRewardsCardDataState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/rewards/card/CryptoHomeRewardsCardDataState;", "", "rewardsSummary", "Lcom/robinhood/shared/rewards/models/db/RewardsSummary;", "<init>", "(Lcom/robinhood/shared/rewards/models/db/RewardsSummary;)V", "getRewardsSummary", "()Lcom/robinhood/shared/rewards/models/db/RewardsSummary;", "totalEarned", "", "getTotalEarned", "()Ljava/lang/String;", "currencyFormatterLocale", "Lcom/robinhood/g11n/CurrencyFormatterLocale;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoHomeRewardsCardDataState {
    public static final int $stable = 8;
    private final CurrencyFormatterLocale currencyFormatterLocale;
    private final RewardsSummary rewardsSummary;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoHomeRewardsCardDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CryptoHomeRewardsCardDataState copy$default(CryptoHomeRewardsCardDataState cryptoHomeRewardsCardDataState, RewardsSummary rewardsSummary, int i, Object obj) {
        if ((i & 1) != 0) {
            rewardsSummary = cryptoHomeRewardsCardDataState.rewardsSummary;
        }
        return cryptoHomeRewardsCardDataState.copy(rewardsSummary);
    }

    /* renamed from: component1, reason: from getter */
    public final RewardsSummary getRewardsSummary() {
        return this.rewardsSummary;
    }

    public final CryptoHomeRewardsCardDataState copy(RewardsSummary rewardsSummary) {
        return new CryptoHomeRewardsCardDataState(rewardsSummary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CryptoHomeRewardsCardDataState) && Intrinsics.areEqual(this.rewardsSummary, ((CryptoHomeRewardsCardDataState) other).rewardsSummary);
    }

    public int hashCode() {
        RewardsSummary rewardsSummary = this.rewardsSummary;
        if (rewardsSummary == null) {
            return 0;
        }
        return rewardsSummary.hashCode();
    }

    public String toString() {
        return "CryptoHomeRewardsCardDataState(rewardsSummary=" + this.rewardsSummary + ")";
    }

    public CryptoHomeRewardsCardDataState(RewardsSummary rewardsSummary) {
        this.rewardsSummary = rewardsSummary;
        this.currencyFormatterLocale = CurrencyFormatterLocale.INSTANCE.getInstance();
    }

    public /* synthetic */ CryptoHomeRewardsCardDataState(RewardsSummary rewardsSummary, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : rewardsSummary);
    }

    public final RewardsSummary getRewardsSummary() {
        return this.rewardsSummary;
    }

    public final String getTotalEarned() {
        RewardValueEarned rewardValueEarned;
        Money crypto2;
        RewardsSummary rewardsSummary = this.rewardsSummary;
        if (rewardsSummary == null || (rewardValueEarned = rewardsSummary.getRewardValueEarned()) == null || (crypto2 = rewardValueEarned.getCrypto()) == null) {
            return null;
        }
        return Money.format$default(crypto2, this.currencyFormatterLocale.getCryptoLocale(), false, null, false, 0, null, false, null, false, false, 1022, null);
    }
}
