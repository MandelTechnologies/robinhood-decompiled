package com.robinhood.shared.history.formatters.legacy.rhy;

import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.models.util.Money;
import com.robinhood.shared.history.formatters.legacy.transfers.CancelSummaryBadgeManager;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.RhyOriginatedAchTransaction;
import com.robinhood.transfers.api.AchTransferRhsState;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import com.robinhood.transfers.api.TransferState;
import com.robinhood.transfers.gold.ApiGoldDepositBoostTransferDetail;
import com.robinhood.transfers.history.C41787R;
import com.robinhood.utils.Either2;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyOriginatedAchTransferFormatter.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/rhy/RhyOriginatedAchTransferFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/RhyOriginatedAchTransaction;", "cancelSummaryBadgeManager", "Lcom/robinhood/shared/history/formatters/legacy/transfers/CancelSummaryBadgeManager;", "resources", "Landroid/content/res/Resources;", "<init>", "(Lcom/robinhood/shared/history/formatters/legacy/transfers/CancelSummaryBadgeManager;Landroid/content/res/Resources;)V", "hasCompletedExceptionally", "", "transaction", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "getPrimaryText", "", "getMetadataSecondaryText", "getMetadataSecondaryTextIcon", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;", "getLineItems", "", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class RhyOriginatedAchTransferFormatter extends AbstractMinervaTransactionFormatter<RhyOriginatedAchTransaction> {
    private final CancelSummaryBadgeManager cancelSummaryBadgeManager;

    /* compiled from: RhyOriginatedAchTransferFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Money.Direction.values().length];
            try {
                iArr[Money.Direction.CREDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Money.Direction.DEBIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems */
    public /* bridge */ /* synthetic */ List mo25632getLineItems(MinervaTransaction minervaTransaction) {
        return (List) getLineItems((RhyOriginatedAchTransaction) minervaTransaction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyOriginatedAchTransferFormatter(CancelSummaryBadgeManager cancelSummaryBadgeManager, Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(cancelSummaryBadgeManager, "cancelSummaryBadgeManager");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.cancelSummaryBadgeManager = cancelSummaryBadgeManager;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public boolean hasCompletedExceptionally(RhyOriginatedAchTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return Intrinsics.areEqual(transaction.getEvent().getState().getIsSuccessful(), Boolean.FALSE);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(RhyOriginatedAchTransaction transaction) throws Resources.NotFoundException {
        TransactionSummary.Tint tint;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (this.cancelSummaryBadgeManager.shouldShowCancelSummaryBadge(Either2.asRight(transaction.getEvent()))) {
            return new TransactionSummary.Badge(getString(C11048R.string.general_label_cancel), TransactionSummary.Tint.NEGATIVE, true);
        }
        TransferState state = transaction.getEvent().getState();
        ApiPaymentTransferDetails details = transaction.getEvent().getDetails();
        Intrinsics.checkNotNull(details, "null cannot be cast to non-null type com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiAchTransfer");
        ApiPaymentTransferDetails.ApiAchTransfer apiAchTransfer = (ApiPaymentTransferDetails.ApiAchTransfer) details;
        Boolean isSuccessful = state.getIsSuccessful();
        if (isSuccessful == null) {
            String string2 = getString(UtilsKt.getLabelResId(transaction.getEvent().getState()));
            if (apiAchTransfer.getRhs_state() == AchTransferRhsState.PENDING_CONFIRMATION) {
                tint = TransactionSummary.Tint.NEGATIVE;
            } else {
                tint = TransactionSummary.Tint.FOREGROUND_2;
            }
            return new TransactionSummary.Badge(string2, tint, false, 4, null);
        }
        if (Intrinsics.areEqual(isSuccessful, Boolean.FALSE)) {
            return new TransactionSummary.Badge(getString(UtilsKt.getLabelResId(state)), TransactionSummary.Tint.NEGATIVE, false, 4, null);
        }
        if (Intrinsics.areEqual(isSuccessful, Boolean.TRUE)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(RhyOriginatedAchTransaction transaction) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        String displayTitle = RhyOriginatedAchTransferFormatter2.getDisplayTitle(transaction, getResources());
        PaymentTransfer.TransferAccountInfo originatingTransferAccountInfo = transaction.getEvent().getOriginatingTransferAccountInfo();
        String accountNameInline = originatingTransferAccountInfo != null ? originatingTransferAccountInfo.getAccountNameInline() : null;
        if (accountNameInline != null) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[transaction.getEvent().getAdjustment().getDirection().ordinal()];
            if (i3 == 1) {
                i2 = C41787R.string.minerva_transfer_description_deposit_from_with_originator;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = C41787R.string.minerva_transfer_description_withdrawal_to_with_originator;
            }
            return getString(i2, displayTitle, accountNameInline);
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[transaction.getEvent().getAdjustment().getDirection().ordinal()];
        if (i4 == 1) {
            i = C41787R.string.minerva_transfer_description_deposit_from;
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C41787R.string.minerva_transfer_description_withdrawal_to;
        }
        return getString(i, displayTitle);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getMetadataSecondaryText(RhyOriginatedAchTransaction transaction) {
        ApiGoldDepositBoostTransferDetail gold_deposit_boost;
        Money.Adjustment debitAdjustment;
        Money.Adjustment debitAdjustment2;
        Money.Adjustment creditAdjustment;
        String str;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        ApiPaymentTransferDetails details = transaction.getEvent().getDetails();
        String badge_text = null;
        ApiPaymentTransferDetails.ApiAchTransfer apiAchTransfer = details instanceof ApiPaymentTransferDetails.ApiAchTransfer ? (ApiPaymentTransferDetails.ApiAchTransfer) details : null;
        if (apiAchTransfer == null) {
            return null;
        }
        Money enoki_amount = apiAchTransfer.getEnoki_amount();
        if (enoki_amount != null && (creditAdjustment = enoki_amount.toCreditAdjustment()) != null && (str = Money.Adjustment.format$default(creditAdjustment, false, null, 3, null)) != null) {
            return str;
        }
        Money enoki_removal_fee = apiAchTransfer.getEnoki_removal_fee();
        if (enoki_removal_fee != null && (debitAdjustment2 = enoki_removal_fee.toDebitAdjustment()) != null) {
            return Money.Adjustment.format$default(debitAdjustment2, false, null, 3, null);
        }
        Money clawback_amount = apiAchTransfer.getClawback_amount();
        String str2 = (clawback_amount == null || (debitAdjustment = clawback_amount.toDebitAdjustment()) == null) ? null : Money.Adjustment.format$default(debitAdjustment, false, null, 3, null);
        if (str2 != null) {
            return str2;
        }
        ApiPaymentTransferDetails details2 = transaction.getEvent().getDetails();
        ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer apiGoldDepositBoostTransfer = details2 instanceof ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer ? (ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer) details2 : null;
        if (apiGoldDepositBoostTransfer != null && (gold_deposit_boost = apiGoldDepositBoostTransfer.getGold_deposit_boost()) != null) {
            badge_text = gold_deposit_boost.getBadge_text();
        }
        return badge_text != null ? badge_text : super.getMetadataSecondaryText((RhyOriginatedAchTransferFormatter) transaction);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Icon getMetadataSecondaryTextIcon(RhyOriginatedAchTransaction transaction) {
        ApiGoldDepositBoostTransferDetail gold_deposit_boost;
        ServerToBentoAssetMapper2 icon_asset;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        ApiPaymentTransferDetails details = transaction.getEvent().getDetails();
        ApiPaymentTransferDetails.ApiAchTransfer apiAchTransfer = details instanceof ApiPaymentTransferDetails.ApiAchTransfer ? (ApiPaymentTransferDetails.ApiAchTransfer) details : null;
        if (apiAchTransfer == null) {
            return null;
        }
        if (apiAchTransfer.getEnoki_amount() != null) {
            return new TransactionSummary.Icon(ServerToBentoAssetMapper2.RETIREMENT_12, TransactionSummary.Tint.POSITIVE);
        }
        ApiGoldDepositBoostTransferDetail gold_deposit_boost2 = apiAchTransfer.getGold_deposit_boost();
        if ((gold_deposit_boost2 != null ? gold_deposit_boost2.getBadge_text() : null) == null || (gold_deposit_boost = apiAchTransfer.getGold_deposit_boost()) == null || (icon_asset = gold_deposit_boost.getIcon_asset()) == null) {
            return null;
        }
        return new TransactionSummary.Icon(icon_asset, TransactionSummary.Tint.SOL_LIGHT);
    }

    public Void getLineItems(RhyOriginatedAchTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        throw new UnsupportedOperationException("RhyOriginatedAchTransfers currently have their own history detail");
    }
}
