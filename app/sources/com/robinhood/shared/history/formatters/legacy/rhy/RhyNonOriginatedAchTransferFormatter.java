package com.robinhood.shared.history.formatters.legacy.rhy;

import android.content.res.Resources;
import android.text.Spanned;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionLineItem;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.models.util.Money;
import com.robinhood.shared.history.formatters.legacy.C39006R;
import com.robinhood.shared.models.history.RhyNonOriginatedAchTransaction;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import com.robinhood.transfers.api.TransferState;
import com.robinhood.transfers.gold.ApiGoldDepositBoostTransferDetail;
import com.robinhood.transfers.history.C41787R;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import io.noties.markwon.Markwon;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhyNonOriginatedAchTransferFormatter.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/rhy/RhyNonOriginatedAchTransferFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/RhyNonOriginatedAchTransaction;", "resources", "Landroid/content/res/Resources;", "markwon", "Lio/noties/markwon/Markwon;", "<init>", "(Landroid/content/res/Resources;Lio/noties/markwon/Markwon;)V", "hasCompletedExceptionally", "", "transaction", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "getPrimaryText", "", "getLineItems", "", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "getMetadataSecondaryText", "getMetadataSecondaryTextIcon", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class RhyNonOriginatedAchTransferFormatter extends AbstractMinervaTransactionFormatter<RhyNonOriginatedAchTransaction> {
    private final Markwon markwon;

    /* compiled from: RhyNonOriginatedAchTransferFormatter.kt */
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
    public RhyNonOriginatedAchTransferFormatter(Resources resources, Markwon markwon) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        this.markwon = markwon;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public boolean hasCompletedExceptionally(RhyNonOriginatedAchTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return Intrinsics.areEqual(transaction.getEvent().getState().getIsSuccessful(), Boolean.FALSE);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(RhyNonOriginatedAchTransaction transaction) {
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

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(RhyNonOriginatedAchTransaction transaction) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        ApiPaymentTransferDetails details = transaction.getEvent().getDetails();
        Intrinsics.checkNotNull(details, "null cannot be cast to non-null type com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiNonOriginatedAchTransfer");
        ApiPaymentTransferDetails.ApiNonOriginatedAchTransfer apiNonOriginatedAchTransfer = (ApiPaymentTransferDetails.ApiNonOriginatedAchTransfer) details;
        PaymentTransfer.TransferAccountInfo receivingTransferAccountInfo = transaction.getEvent().getReceivingTransferAccountInfo();
        String accountNameInline = receivingTransferAccountInfo != null ? receivingTransferAccountInfo.getAccountNameInline() : null;
        if (accountNameInline != null) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[transaction.getEvent().getAdjustment().getDirection().ordinal()];
            if (i3 == 1) {
                i2 = C41787R.string.minerva_transfer_description_noa_credit_with_receiver;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = C41787R.string.minerva_transfer_description_noa_debit_with_receiver;
            }
            return getString(i2, apiNonOriginatedAchTransfer.getLabel(), apiNonOriginatedAchTransfer.getOriginator_name(), accountNameInline);
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[transaction.getEvent().getAdjustment().getDirection().ordinal()];
        if (i4 == 1) {
            i = C41787R.string.minerva_transfer_description_noa_credit;
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C41787R.string.minerva_transfer_description_noa_debit;
        }
        return getString(i, apiNonOriginatedAchTransfer.getLabel(), apiNonOriginatedAchTransfer.getOriginator_name());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0153  */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.robinhood.android.common.history.ui.format.TransactionLineItem] */
    /* JADX WARN: Type inference failed for: r8v7, types: [com.robinhood.android.common.history.ui.format.TransactionLineItem] */
    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<TransactionLineItem> mo25632getLineItems(RhyNonOriginatedAchTransaction transaction) throws Resources.NotFoundException {
        String originator_name;
        String accountNameInline;
        String str;
        ApiGoldDepositBoostTransferDetail gold_deposit_boost;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        ApiPaymentTransferDetails details = transaction.getEvent().getDetails();
        Intrinsics.checkNotNull(details, "null cannot be cast to non-null type com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiNonOriginatedAchTransfer");
        ApiPaymentTransferDetails.ApiNonOriginatedAchTransfer apiNonOriginatedAchTransfer = (ApiPaymentTransferDetails.ApiNonOriginatedAchTransfer) details;
        String string2 = getString(C39006R.string.transaction_line_item_title_amount);
        String string3 = transaction.getEvent().getAmount().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        TransactionLineItem transactionLineItem = new TransactionLineItem(string2, string3, null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        String string4 = getString(C39006R.string.transaction_line_item_title_from);
        Money.Direction direction = apiNonOriginatedAchTransfer.getDirection();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[direction.ordinal()];
        String originator_name2 = "";
        if (i == 1) {
            originator_name = apiNonOriginatedAchTransfer.getOriginator_name();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            PaymentTransfer.TransferAccountInfo receivingTransferAccountInfo = transaction.getEvent().getReceivingTransferAccountInfo();
            if (receivingTransferAccountInfo == null || (originator_name = receivingTransferAccountInfo.getAccountNameInline()) == null) {
                originator_name = "";
            }
        }
        TransactionLineItem transactionLineItem2 = new TransactionLineItem(string4, originator_name, null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        String string5 = getString(C39006R.string.transaction_line_item_title_to);
        int i2 = iArr[apiNonOriginatedAchTransfer.getDirection().ordinal()];
        if (i2 == 1) {
            PaymentTransfer.TransferAccountInfo receivingTransferAccountInfo2 = transaction.getEvent().getReceivingTransferAccountInfo();
            if (receivingTransferAccountInfo2 != null && (accountNameInline = receivingTransferAccountInfo2.getAccountNameInline()) != null) {
                str = accountNameInline;
            }
            TransactionLineItem transactionLineItem3 = new TransactionLineItem(string5, str, null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
            Money clawback_amount = apiNonOriginatedAchTransfer.getClawback_amount();
            TransactionLineItem transactionLineItem4 = clawback_amount == null ? new TransactionLineItem(getString(C39006R.string.acats_clawback_label), Money.format$default(clawback_amount, null, false, null, false, 0, null, false, null, false, false, 1023, null), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null) : null;
            TransactionLineItem transactionLineItem5 = new TransactionLineItem(getString(C39006R.string.transaction_line_item_title_status), getString(UtilsKt.getLabelResId(transaction.getEvent().getState())), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
            TransactionLineItem transactionLineItem6 = new TransactionLineItem(getString(C41787R.string.minerva_rhy_transfer_expected_availability), LocalDateFormatter.MEDIUM.format(apiNonOriginatedAchTransfer.getGrant_date()), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
            gold_deposit_boost = apiNonOriginatedAchTransfer.getGold_deposit_boost();
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
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        originator_name2 = apiNonOriginatedAchTransfer.getOriginator_name();
        str = originator_name2;
        TransactionLineItem transactionLineItem32 = new TransactionLineItem(string5, str, null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        Money clawback_amount2 = apiNonOriginatedAchTransfer.getClawback_amount();
        if (clawback_amount2 == null) {
        }
        TransactionLineItem transactionLineItem52 = new TransactionLineItem(getString(C39006R.string.transaction_line_item_title_status), getString(UtilsKt.getLabelResId(transaction.getEvent().getState())), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        TransactionLineItem transactionLineItem62 = new TransactionLineItem(getString(C41787R.string.minerva_rhy_transfer_expected_availability), LocalDateFormatter.MEDIUM.format(apiNonOriginatedAchTransfer.getGrant_date()), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        gold_deposit_boost = apiNonOriginatedAchTransfer.getGold_deposit_boost();
        if (gold_deposit_boost != null) {
        }
        return CollectionsKt.listOfNotNull((Object[]) new TransactionLineItem[]{transactionLineItem, transactionLineItem2, transactionLineItem32, transactionLineItem4, transactionLineItem52, transactionLineItem62, transactionLineItem});
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getMetadataSecondaryText(RhyNonOriginatedAchTransaction transaction) {
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
        return badge_text != null ? badge_text : super.getMetadataSecondaryText((RhyNonOriginatedAchTransferFormatter) transaction);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Icon getMetadataSecondaryTextIcon(RhyNonOriginatedAchTransaction transaction) {
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
