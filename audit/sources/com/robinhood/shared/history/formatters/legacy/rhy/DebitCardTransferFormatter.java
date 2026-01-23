package com.robinhood.shared.history.formatters.legacy.rhy;

import android.content.res.Resources;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionLineItem;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.models.util.Money;
import com.robinhood.shared.models.history.DebitCardTransaction;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import com.robinhood.transfers.api.DebitCardTransferState;
import com.robinhood.transfers.gold.ApiGoldDepositBoostTransferDetail;
import com.robinhood.transfers.history.C41787R;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebitCardTransferFormatter.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/rhy/DebitCardTransferFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/DebitCardTransaction;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "hasCompletedExceptionally", "", "transaction", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "getPrimaryText", "", "getMetadataSecondaryText", "getLineItems", "", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "getMetadataSecondaryTextIcon", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class DebitCardTransferFormatter extends AbstractMinervaTransactionFormatter<DebitCardTransaction> {

    /* compiled from: DebitCardTransferFormatter.kt */
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebitCardTransferFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public boolean hasCompletedExceptionally(DebitCardTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return Intrinsics.areEqual(transaction.getEvent().getState().getIsSuccessful(), Boolean.FALSE);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(DebitCardTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        ApiPaymentTransferDetails details = transaction.getEvent().getDetails();
        Intrinsics.checkNotNull(details, "null cannot be cast to non-null type com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiDebitCardTransfer");
        DebitCardTransferState state = ((ApiPaymentTransferDetails.ApiDebitCardTransfer) details).getState();
        Boolean isSuccessful = state.getIsSuccessful();
        if (isSuccessful == null) {
            return new TransactionSummary.Badge(getString(UtilsKt.getLabelResId(state)), TransactionSummary.Tint.FOREGROUND_2, false, 4, null);
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
    public CharSequence getPrimaryText(DebitCardTransaction transaction) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        String displayTitle = DebitCardTransferFormatter2.getDisplayTitle(transaction, getResources());
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
    public CharSequence getMetadataSecondaryText(DebitCardTransaction transaction) {
        ApiGoldDepositBoostTransferDetail gold_deposit_boost;
        Money.Adjustment debitAdjustment;
        String str;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Money clawbackAmount = transaction.getEvent().getClawbackAmount();
        String badge_text = null;
        if (clawbackAmount != null && (debitAdjustment = clawbackAmount.toDebitAdjustment()) != null && (str = Money.Adjustment.format$default(debitAdjustment, false, null, 3, null)) != null) {
            return str;
        }
        ApiPaymentTransferDetails details = transaction.getEvent().getDetails();
        ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer apiGoldDepositBoostTransfer = details instanceof ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer ? (ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer) details : null;
        if (apiGoldDepositBoostTransfer != null && (gold_deposit_boost = apiGoldDepositBoostTransfer.getGold_deposit_boost()) != null) {
            badge_text = gold_deposit_boost.getBadge_text();
        }
        return badge_text != null ? badge_text : super.getMetadataSecondaryText((DebitCardTransferFormatter) transaction);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems, reason: merged with bridge method [inline-methods] */
    public List<TransactionLineItem> mo25632getLineItems(DebitCardTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        throw new UnsupportedOperationException("DebitCardTransfers currently have their own history detail");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Icon getMetadataSecondaryTextIcon(DebitCardTransaction transaction) {
        ApiGoldDepositBoostTransferDetail gold_deposit_boost;
        ServerToBentoAssetMapper2 icon_asset;
        ApiGoldDepositBoostTransferDetail gold_deposit_boost2;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        ApiPaymentTransferDetails details = transaction.getEvent().getDetails();
        ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer apiGoldDepositBoostTransfer = details instanceof ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer ? (ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer) details : null;
        if (((apiGoldDepositBoostTransfer == null || (gold_deposit_boost2 = apiGoldDepositBoostTransfer.getGold_deposit_boost()) == null) ? null : gold_deposit_boost2.getBadge_text()) == null || (gold_deposit_boost = apiGoldDepositBoostTransfer.getGold_deposit_boost()) == null || (icon_asset = gold_deposit_boost.getIcon_asset()) == null) {
            return null;
        }
        return new TransactionSummary.Icon(icon_asset, TransactionSummary.Tint.SOL_LIGHT);
    }
}
