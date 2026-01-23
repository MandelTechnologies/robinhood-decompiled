package com.robinhood.shared.history.formatters.legacy.rhy;

import android.content.res.Resources;
import android.text.Spanned;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionLineItem;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.transfer.shared.AccountType;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.shared.history.formatters.legacy.C39006R;
import com.robinhood.shared.models.history.RhyInterEntityTransaction;
import com.robinhood.transfers.api.ApiPaycheckInvestmentInfo;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import com.robinhood.transfers.api.TransferPurpose;
import com.robinhood.transfers.api.TransferState;
import com.robinhood.transfers.gold.ApiGoldDepositBoostTransferDetail;
import com.robinhood.transfers.history.C41787R;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.money.Currencies;
import io.noties.markwon.Markwon;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhyInterEntityTransferFormatter.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0012\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/rhy/RhyInterEntityTransferFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/RhyInterEntityTransaction;", "resources", "Landroid/content/res/Resources;", "markwon", "Lio/noties/markwon/Markwon;", "<init>", "(Landroid/content/res/Resources;Lio/noties/markwon/Markwon;)V", "hasCompletedExceptionally", "", "transaction", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "getAmountText", "", "getMetadataSecondaryText", "getMetadataSecondaryTextIcon", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;", "getPrimaryText", "splitYourPaycheckPrimaryText", "paycheckInvestmentInfo", "Lcom/robinhood/transfers/api/ApiPaycheckInvestmentInfo;", "getLineItems", "", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class RhyInterEntityTransferFormatter extends AbstractMinervaTransactionFormatter<RhyInterEntityTransaction> {
    private final Markwon markwon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyInterEntityTransferFormatter(Resources resources, Markwon markwon) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        this.markwon = markwon;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public boolean hasCompletedExceptionally(RhyInterEntityTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return Intrinsics.areEqual(transaction.getEvent().getState().getIsSuccessful(), Boolean.FALSE);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(RhyInterEntityTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        TransferState state = transaction.getEvent().getState();
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

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getAmountText(RhyInterEntityTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return Money.format$default(Money3.toMoney(transaction.getEvent().getAmount(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getMetadataSecondaryText(RhyInterEntityTransaction transaction) {
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
        return badge_text != null ? badge_text : super.getMetadataSecondaryText((RhyInterEntityTransferFormatter) transaction);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Icon getMetadataSecondaryTextIcon(RhyInterEntityTransaction transaction) {
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

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(RhyInterEntityTransaction transaction) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        ApiPaymentTransferDetails details = transaction.getEvent().getDetails();
        Intrinsics.checkNotNull(details, "null cannot be cast to non-null type com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiInternalTransfer");
        ApiPaymentTransferDetails.ApiInternalTransfer apiInternalTransfer = (ApiPaymentTransferDetails.ApiInternalTransfer) details;
        PaymentTransfer.TransferAccountInfo originatingTransferAccountInfo = transaction.getEvent().getOriginatingTransferAccountInfo();
        String accountNameInline = originatingTransferAccountInfo != null ? originatingTransferAccountInfo.getAccountNameInline() : null;
        PaymentTransfer.TransferAccountInfo receivingTransferAccountInfo = transaction.getEvent().getReceivingTransferAccountInfo();
        String accountNameInline2 = receivingTransferAccountInfo != null ? receivingTransferAccountInfo.getAccountNameInline() : null;
        PaymentTransfer event = transaction.getEvent();
        if (!event.getIsOwner()) {
            String ownerName = transaction.getEvent().getOwnerName();
            if (ownerName == null) {
                ownerName = getString(C41787R.string.minerva_transfer_non_owner_name_fallback);
            }
            if (event.getOriginatingAccountType() == AccountType.RHS_JOINT_TENANCY_WITH_ROS) {
                accountNameInline2 = getString(C41787R.string.minerva_transfer_non_owner_label, ownerName, accountNameInline2);
            } else {
                accountNameInline = getString(C41787R.string.minerva_transfer_non_owner_label, ownerName, accountNameInline);
            }
        }
        if (accountNameInline == null || accountNameInline2 == null) {
            return getString(C41787R.string.minerva_transfer_description_inter_entity_unknown_account_type);
        }
        if (apiInternalTransfer.getPurpose() == TransferPurpose.SPLIT_YOUR_PAYCHECK) {
            return splitYourPaycheckPrimaryText(apiInternalTransfer.getPaycheck_investment_info());
        }
        return getString(C41787R.string.minerva_transfer_description_general, accountNameInline2, accountNameInline);
    }

    private final CharSequence splitYourPaycheckPrimaryText(ApiPaycheckInvestmentInfo paycheckInvestmentInfo) {
        String symbol = paycheckInvestmentInfo != null ? paycheckInvestmentInfo.getSymbol() : null;
        if (paycheckInvestmentInfo == null) {
            return getString(C41787R.string.minerva_transfer_description_inter_entity_syp);
        }
        if (paycheckInvestmentInfo.getAsset_type() == ApiAssetType.BROKERAGE_CASH) {
            return getString(C39006R.string.minerva_transfer_description_inter_entity_syp_brokerage_cash);
        }
        if (symbol != null) {
            return getString(C39006R.string.minerva_transfer_description_inter_entity_syp_investment, symbol);
        }
        return getString(C41787R.string.minerva_transfer_description_inter_entity_syp);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.robinhood.android.common.history.ui.format.TransactionLineItem] */
    /* JADX WARN: Type inference failed for: r9v4, types: [com.robinhood.android.common.history.ui.format.TransactionLineItem] */
    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems, reason: merged with bridge method [inline-methods] */
    public List<TransactionLineItem> mo25632getLineItems(RhyInterEntityTransaction transaction) {
        String accountNameTitle;
        String accountNameTitle2;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        ApiPaymentTransferDetails details = transaction.getEvent().getDetails();
        Intrinsics.checkNotNull(details, "null cannot be cast to non-null type com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiInternalTransfer");
        ApiPaymentTransferDetails.ApiInternalTransfer apiInternalTransfer = (ApiPaymentTransferDetails.ApiInternalTransfer) details;
        TransactionLineItem transactionLineItem = new TransactionLineItem(getString(C39006R.string.transaction_line_item_title_status), getString(UtilsKt.getLabelResId(transaction.getEvent().getState())), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        TransactionLineItem transactionLineItem2 = new TransactionLineItem(getString(C41787R.string.minerva_rhy_transfer_initiated), InstantFormatter.NATURAL_TIMESTAMP_IN_SYSTEM_ZONE.format((InstantFormatter) transaction.getEvent().getInitiatedAt()), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        PaymentTransfer.TransferAccountInfo originatingTransferAccountInfo = transaction.getEvent().getOriginatingTransferAccountInfo();
        TransactionLineItem transactionLineItem3 = (originatingTransferAccountInfo == null || (accountNameTitle2 = originatingTransferAccountInfo.getAccountNameTitle()) == null) ? null : new TransactionLineItem(getString(C39006R.string.transaction_line_item_title_from), accountNameTitle2, null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        PaymentTransfer.TransferAccountInfo receivingTransferAccountInfo = transaction.getEvent().getReceivingTransferAccountInfo();
        TransactionLineItem transactionLineItem4 = (receivingTransferAccountInfo == null || (accountNameTitle = receivingTransferAccountInfo.getAccountNameTitle()) == null) ? null : new TransactionLineItem(getString(C39006R.string.transaction_line_item_title_to), accountNameTitle, null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        Integer labelResId = UtilsKt.getLabelResId(apiInternalTransfer.getPurpose());
        TransactionLineItem transactionLineItem5 = labelResId != null ? new TransactionLineItem(getString(C41787R.string.minerva_rhy_transfer_reason), getString(labelResId.intValue()), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null) : null;
        Money clawback_amount = apiInternalTransfer.getClawback_amount();
        TransactionLineItem transactionLineItem6 = clawback_amount != null ? new TransactionLineItem(getString(C39006R.string.acats_clawback_label), Money.format$default(clawback_amount, null, false, null, false, 0, null, false, null, false, false, 1023, null), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null) : null;
        ApiGoldDepositBoostTransferDetail gold_deposit_boost = apiInternalTransfer.getGold_deposit_boost();
        if (gold_deposit_boost != null) {
            String amount_title = gold_deposit_boost.getAmount_title();
            String amount_text = gold_deposit_boost.getAmount_text();
            if (amount_title != null && amount_text != null) {
                String detail_text = gold_deposit_boost.getDetail_text();
                Spanned markdown = detail_text != null ? this.markwon.toMarkdown(detail_text) : null;
                ServerToBentoAssetMapper2 icon_asset = gold_deposit_boost.getIcon_asset();
                transactionLineItem = new TransactionLineItem(amount_title, amount_text, markdown, null, false, null, icon_asset != null ? Integer.valueOf(icon_asset.getResourceId()) : null, TransactionSummary.Tint.SOL_LIGHT, 56, null);
            }
        }
        return CollectionsKt.listOfNotNull((Object[]) new TransactionLineItem[]{transactionLineItem, transactionLineItem2, transactionLineItem3, transactionLineItem4, transactionLineItem5, transactionLineItem6, transactionLineItem});
    }
}
