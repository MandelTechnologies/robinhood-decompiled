package com.robinhood.shared.rewards.history;

import android.content.res.Resources;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.common.strings.RewardsKt;
import com.robinhood.models.api.ApiRewards2;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.p320db.RewardData;
import com.robinhood.models.p320db.StockReward;
import com.robinhood.models.p320db.bonfire.WithholdingAmount;
import com.robinhood.models.p355ui.UiCashRewardItem;
import com.robinhood.models.p355ui.UiReferralStockRewardItem;
import com.robinhood.models.p355ui.UiRewards3;
import com.robinhood.models.p355ui.UiStandaloneStockRewardItem;
import com.robinhood.models.util.Money;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.RewardItemTransaction;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StockRewardItemFormatter.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u0018\u0010\u0014\u001a\u00020\b*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u00020\b*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/rewards/history/StockRewardItemFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/RewardItemTransaction;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "hasCompletedExceptionally", "", "transaction", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "getPrimaryText", "", "getAmountText", "withholding", "Lcom/robinhood/models/db/bonfire/WithholdingAmount;", "getMetadataSecondaryText", "getLineItems", "", "isEuDepositMatchReward", "(Lcom/robinhood/shared/models/history/RewardItemTransaction;)Z", "isGoldNetworkFeeRefund", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class StockRewardItemFormatter extends AbstractMinervaTransactionFormatter<RewardItemTransaction> {
    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems */
    public /* bridge */ /* synthetic */ List mo25632getLineItems(MinervaTransaction minervaTransaction) {
        return (List) getLineItems((RewardItemTransaction) minervaTransaction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StockRewardItemFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public boolean hasCompletedExceptionally(RewardItemTransaction transaction) {
        ApiRewards2.State state;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        RewardData reward = transaction.getEvent().getReward();
        if (reward == null || (state = reward.getState()) == null) {
            return false;
        }
        return Intrinsics.areEqual(state.getIsSuccessful(), Boolean.FALSE);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(RewardItemTransaction transaction) {
        ApiRewards2.State state;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        RewardData reward = transaction.getEvent().getReward();
        if (reward == null || (state = reward.getState()) == null) {
            return null;
        }
        Boolean isSuccessful = state.getIsSuccessful();
        if (Intrinsics.areEqual(isSuccessful, Boolean.TRUE)) {
            return null;
        }
        if (isSuccessful == null) {
            return new TransactionSummary.Badge(getString(RewardsKt.getLabelResId(state)), TransactionSummary.Tint.FOREGROUND_2, false, 4, null);
        }
        if (!Intrinsics.areEqual(isSuccessful, Boolean.FALSE)) {
            throw new NoWhenBranchMatchedException();
        }
        return new TransactionSummary.Badge(getString(RewardsKt.getLabelResId(state)), TransactionSummary.Tint.NEGATIVE, false, 4, null);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(RewardItemTransaction transaction) {
        String description;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        UiRewards3 event = transaction.getEvent();
        if (event instanceof UiReferralStockRewardItem) {
            UiReferralStockRewardItem uiReferralStockRewardItem = (UiReferralStockRewardItem) event;
            StockReward reward = uiReferralStockRewardItem.getReward();
            return (reward == null || (description = reward.getDescription()) == null) ? uiReferralStockRewardItem.getReferral().getDescription() : description;
        }
        if (event instanceof UiStandaloneStockRewardItem) {
            return ((UiStandaloneStockRewardItem) event).getReward().getDescription();
        }
        if (event instanceof UiCashRewardItem) {
            return ((UiCashRewardItem) event).getReward().getDescription();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getAmountText(RewardItemTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (isEuDepositMatchReward(transaction) || isGoldNetworkFeeRefund(transaction)) {
            UiRewards3 event = transaction.getEvent();
            Intrinsics.checkNotNull(event, "null cannot be cast to non-null type com.robinhood.models.ui.UiStandaloneStockRewardItem");
            UiStandaloneStockRewardItem uiStandaloneStockRewardItem = (UiStandaloneStockRewardItem) event;
            Currency assetCurrency = uiStandaloneStockRewardItem.getAssetCurrency();
            BigDecimal rewardQuantity = uiStandaloneStockRewardItem.getReward().getRewardQuantity();
            if (assetCurrency != null && rewardQuantity != null) {
                return "+" + CurrencyDefinitions.formatCurrency$default(assetCurrency, rewardQuantity, false, false, null, 0, null, null, false, false, false, false, 2046, null);
            }
            return super.getAmountText((StockRewardItemFormatter) transaction);
        }
        return super.getAmountText((StockRewardItemFormatter) transaction);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getAmountText(RewardItemTransaction transaction, WithholdingAmount withholding) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (isEuDepositMatchReward(transaction) || isGoldNetworkFeeRefund(transaction)) {
            return getAmountText(transaction);
        }
        return super.getAmountText((StockRewardItemFormatter) transaction, withholding);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getMetadataSecondaryText(RewardItemTransaction transaction) {
        BigDecimal decimalValue;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (isEuDepositMatchReward(transaction) || isGoldNetworkFeeRefund(transaction)) {
            UiRewards3 event = transaction.getEvent();
            Intrinsics.checkNotNull(event, "null cannot be cast to non-null type com.robinhood.models.ui.UiStandaloneStockRewardItem");
            UiStandaloneStockRewardItem uiStandaloneStockRewardItem = (UiStandaloneStockRewardItem) event;
            Currency quoteCurrency = uiStandaloneStockRewardItem.getQuoteCurrency();
            Money costBasisInMoney = uiStandaloneStockRewardItem.getReward().getCostBasisInMoney();
            Integer numValueOf = null;
            if (costBasisInMoney == null || (decimalValue = costBasisInMoney.getDecimalValue()) == null) {
                Money costBasis = uiStandaloneStockRewardItem.getReward().getCostBasis();
                decimalValue = costBasis != null ? costBasis.getDecimalValue() : null;
            }
            if (quoteCurrency != null && decimalValue != null) {
                if (decimalValue.abs().compareTo(BigDecimal.ONE) < 0) {
                    Currency assetCurrency = uiStandaloneStockRewardItem.getAssetCurrency();
                    numValueOf = Integer.valueOf(assetCurrency != null ? assetCurrency.getDecimalScale() : 8);
                }
                return getResources().getString(C39616R.string.crypto_deposit_match_reward_meta_secondary_text, CurrencyDefinitions.formatCurrency$default(quoteCurrency, decimalValue, false, false, null, 0, numValueOf, null, false, false, false, false, 2014, null));
            }
            return super.getMetadataSecondaryText((StockRewardItemFormatter) transaction);
        }
        return super.getMetadataSecondaryText((StockRewardItemFormatter) transaction);
    }

    public Void getLineItems(RewardItemTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        throw new UnsupportedOperationException("Rewards currently have their own history detail");
    }

    private final boolean isEuDepositMatchReward(RewardItemTransaction rewardItemTransaction) {
        RewardData reward = rewardItemTransaction.getEvent().getReward();
        if (!(reward instanceof StockReward)) {
            return false;
        }
        StockReward stockReward = (StockReward) reward;
        return stockReward.getType() == ApiRewards2.RewardType.CRYPTO && stockReward.getTriggerSource() == ApiRewards2.TriggerSource.CRYPTO_EU_DEPOSIT_MATCH && (rewardItemTransaction.getEvent() instanceof UiStandaloneStockRewardItem);
    }

    private final boolean isGoldNetworkFeeRefund(RewardItemTransaction rewardItemTransaction) {
        RewardData reward = rewardItemTransaction.getEvent().getReward();
        return (reward instanceof StockReward) && ((StockReward) reward).getTriggerSource() == ApiRewards2.TriggerSource.CRYPTO_FEE_GOLD_DEPOSIT && (rewardItemTransaction.getEvent() instanceof UiStandaloneStockRewardItem);
    }
}
