package com.robinhood.android.rewards.p240ui;

import com.robinhood.android.rewards.C27314R;
import com.robinhood.common.strings.RewardsKt;
import com.robinhood.models.api.ApiRewards2;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.p320db.CashReward;
import com.robinhood.models.p320db.RewardData;
import com.robinhood.models.p320db.StockReward;
import com.robinhood.models.p320db.bonfire.WithholdingAmount;
import com.robinhood.models.util.Money;
import com.robinhood.shared.history.contracts.RewardDetailFragmentKey;
import com.robinhood.utils.datetime.format.InstantFormatter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: RewardDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\r\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019J\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019J\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\b\u0010\u001e\u001a\u0004\u0018\u00010\u0019J\u0006\u0010\u001f\u001a\u00020 J\b\u0010!\u001a\u00020 H\u0002J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010'\u001a\u00020 2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0015HÖ\u0001J\t\u0010*\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/rewards/ui/RewardDetailViewState;", "", "args", "Lcom/robinhood/shared/history/contracts/RewardDetailFragmentKey;", "rewardData", "Lcom/robinhood/models/db/RewardData;", "backupWithholdingResponse", "Lcom/robinhood/models/db/bonfire/WithholdingAmount;", "assetCurrency", "Lcom/robinhood/models/crypto/db/Currency;", "<init>", "(Lcom/robinhood/shared/history/contracts/RewardDetailFragmentKey;Lcom/robinhood/models/db/RewardData;Lcom/robinhood/models/db/bonfire/WithholdingAmount;Lcom/robinhood/models/crypto/db/Currency;)V", "getArgs", "()Lcom/robinhood/shared/history/contracts/RewardDetailFragmentKey;", "getRewardData", "()Lcom/robinhood/models/db/RewardData;", "getBackupWithholdingResponse", "()Lcom/robinhood/models/db/bonfire/WithholdingAmount;", "getAssetCurrency", "()Lcom/robinhood/models/crypto/db/Currency;", "getHeader", "", "getLabelResId", "()Ljava/lang/Integer;", "getSubheader", "", "getRewardDescription", "getRewardCreatedAt", "getRewardValueMoney", "Lcom/robinhood/models/util/Money;", "getRewardValue", "isRewardClaimable", "", "isCryptoGoldReward", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "feature-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RewardDetailViewState {
    private final RewardDetailFragmentKey args;
    private final Currency assetCurrency;
    private final WithholdingAmount backupWithholdingResponse;
    private final RewardData rewardData;

    /* compiled from: RewardDetailViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RewardDetailFragmentKey.Type.values().length];
            try {
                iArr[RewardDetailFragmentKey.Type.STOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RewardDetailFragmentKey.Type.CASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ RewardDetailViewState copy$default(RewardDetailViewState rewardDetailViewState, RewardDetailFragmentKey rewardDetailFragmentKey, RewardData rewardData, WithholdingAmount withholdingAmount, Currency currency, int i, Object obj) {
        if ((i & 1) != 0) {
            rewardDetailFragmentKey = rewardDetailViewState.args;
        }
        if ((i & 2) != 0) {
            rewardData = rewardDetailViewState.rewardData;
        }
        if ((i & 4) != 0) {
            withholdingAmount = rewardDetailViewState.backupWithholdingResponse;
        }
        if ((i & 8) != 0) {
            currency = rewardDetailViewState.assetCurrency;
        }
        return rewardDetailViewState.copy(rewardDetailFragmentKey, rewardData, withholdingAmount, currency);
    }

    /* renamed from: component1, reason: from getter */
    public final RewardDetailFragmentKey getArgs() {
        return this.args;
    }

    /* renamed from: component2, reason: from getter */
    public final RewardData getRewardData() {
        return this.rewardData;
    }

    /* renamed from: component3, reason: from getter */
    public final WithholdingAmount getBackupWithholdingResponse() {
        return this.backupWithholdingResponse;
    }

    /* renamed from: component4, reason: from getter */
    public final Currency getAssetCurrency() {
        return this.assetCurrency;
    }

    public final RewardDetailViewState copy(RewardDetailFragmentKey args, RewardData rewardData, WithholdingAmount backupWithholdingResponse, Currency assetCurrency) {
        Intrinsics.checkNotNullParameter(args, "args");
        return new RewardDetailViewState(args, rewardData, backupWithholdingResponse, assetCurrency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardDetailViewState)) {
            return false;
        }
        RewardDetailViewState rewardDetailViewState = (RewardDetailViewState) other;
        return Intrinsics.areEqual(this.args, rewardDetailViewState.args) && Intrinsics.areEqual(this.rewardData, rewardDetailViewState.rewardData) && Intrinsics.areEqual(this.backupWithholdingResponse, rewardDetailViewState.backupWithholdingResponse) && Intrinsics.areEqual(this.assetCurrency, rewardDetailViewState.assetCurrency);
    }

    public int hashCode() {
        int iHashCode = this.args.hashCode() * 31;
        RewardData rewardData = this.rewardData;
        int iHashCode2 = (iHashCode + (rewardData == null ? 0 : rewardData.hashCode())) * 31;
        WithholdingAmount withholdingAmount = this.backupWithholdingResponse;
        int iHashCode3 = (iHashCode2 + (withholdingAmount == null ? 0 : withholdingAmount.hashCode())) * 31;
        Currency currency = this.assetCurrency;
        return iHashCode3 + (currency != null ? currency.hashCode() : 0);
    }

    public String toString() {
        return "RewardDetailViewState(args=" + this.args + ", rewardData=" + this.rewardData + ", backupWithholdingResponse=" + this.backupWithholdingResponse + ", assetCurrency=" + this.assetCurrency + ")";
    }

    public RewardDetailViewState(RewardDetailFragmentKey args, RewardData rewardData, WithholdingAmount withholdingAmount, Currency currency) {
        Intrinsics.checkNotNullParameter(args, "args");
        this.args = args;
        this.rewardData = rewardData;
        this.backupWithholdingResponse = withholdingAmount;
        this.assetCurrency = currency;
    }

    public /* synthetic */ RewardDetailViewState(RewardDetailFragmentKey rewardDetailFragmentKey, RewardData rewardData, WithholdingAmount withholdingAmount, Currency currency, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rewardDetailFragmentKey, (i & 2) != 0 ? null : rewardData, (i & 4) != 0 ? null : withholdingAmount, (i & 8) != 0 ? null : currency);
    }

    public final RewardDetailFragmentKey getArgs() {
        return this.args;
    }

    public final RewardData getRewardData() {
        return this.rewardData;
    }

    public final WithholdingAmount getBackupWithholdingResponse() {
        return this.backupWithholdingResponse;
    }

    public final Currency getAssetCurrency() {
        return this.assetCurrency;
    }

    public final int getHeader() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.args.getType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return C27314R.string.cash_reward_detail_toolbar_title;
        }
        if (isCryptoGoldReward()) {
            return C27314R.string.crypto_gold_reward_detail_toolbar_title;
        }
        RewardData rewardData = this.rewardData;
        StockReward stockReward = rewardData instanceof StockReward ? (StockReward) rewardData : null;
        if ((stockReward != null ? stockReward.getType() : null) == ApiRewards2.RewardType.CRYPTO) {
            return C27314R.string.gated_crypto_reward_detail_toolbar_title;
        }
        return C27314R.string.stock_reward_detail_toolbar_title;
    }

    public final Integer getLabelResId() {
        ApiRewards2.State state;
        RewardData rewardData = this.rewardData;
        if (rewardData == null || (state = rewardData.getState()) == null) {
            return null;
        }
        return Integer.valueOf(RewardsKt.getLabelResId(state));
    }

    public final String getSubheader() {
        RewardData rewardData = this.rewardData;
        if (rewardData == null) {
            return null;
        }
        if (rewardData instanceof StockReward) {
            return ((StockReward) rewardData).getDescription();
        }
        if (rewardData instanceof CashReward) {
            return ((CashReward) rewardData).getDescription();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getRewardDescription() {
        RewardData rewardData = this.rewardData;
        if (rewardData == null) {
            return null;
        }
        if (rewardData instanceof StockReward) {
            return ((StockReward) rewardData).getRewardDescription();
        }
        if (rewardData instanceof CashReward) {
            return ((CashReward) rewardData).getRewardDescription();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getRewardCreatedAt() {
        Instant createdAt;
        RewardData rewardData = this.rewardData;
        if (rewardData == null) {
            return null;
        }
        if (rewardData instanceof StockReward) {
            createdAt = ((StockReward) rewardData).getCreatedAt();
        } else {
            if (!(rewardData instanceof CashReward)) {
                throw new NoWhenBranchMatchedException();
            }
            createdAt = ((CashReward) rewardData).getCreatedAt();
        }
        return InstantFormatter.DATE_IN_SYSTEM_ZONE.format(createdAt);
    }

    public final Money getRewardValueMoney() {
        RewardData rewardData = this.rewardData;
        if (rewardData == null) {
            return null;
        }
        if (rewardData instanceof StockReward) {
            return ((StockReward) rewardData).getCostBasis();
        }
        if (rewardData instanceof CashReward) {
            return ((CashReward) rewardData).getCostBasis();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getRewardValue() {
        Money rewardValueMoney = getRewardValueMoney();
        if (!isCryptoGoldReward()) {
            if (rewardValueMoney != null) {
                return Money.format$default(rewardValueMoney, null, false, null, false, 0, null, false, null, false, false, 1023, null);
            }
            return null;
        }
        Currency currency = this.assetCurrency;
        int decimalScale = currency != null ? currency.getDecimalScale() : 8;
        if (rewardValueMoney != null) {
            return Money.format$default(rewardValueMoney, null, true, Integer.valueOf(decimalScale), false, 0, null, false, null, false, false, 1017, null);
        }
        return null;
    }

    public final boolean isRewardClaimable() {
        RewardData rewardData = this.rewardData;
        return rewardData != null && rewardData.getClaimDeeplink().length() > 0 && rewardData.getClaimable();
    }

    private final boolean isCryptoGoldReward() {
        RewardData rewardData = this.rewardData;
        StockReward stockReward = rewardData instanceof StockReward ? (StockReward) rewardData : null;
        ApiRewards2.TriggerSource triggerSource = stockReward != null ? stockReward.getTriggerSource() : null;
        return triggerSource == ApiRewards2.TriggerSource.CRYPTO_US_GOLD_DEPOSIT_MATCH || triggerSource == ApiRewards2.TriggerSource.CRYPTO_FEE_GOLD_DEPOSIT;
    }
}
