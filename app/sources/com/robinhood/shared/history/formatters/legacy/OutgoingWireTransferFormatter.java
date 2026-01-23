package com.robinhood.shared.history.formatters.legacy;

import android.content.res.Resources;
import android.text.Spanned;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.strings.C8179R;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionLineItem;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentDetailsV2;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentV2;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.shared.history.formatters.legacy.rhy.UtilsKt;
import com.robinhood.shared.history.formatters.legacy.transfers.CancelSummaryBadgeManager;
import com.robinhood.shared.models.history.OutgoingWireTransaction;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import com.robinhood.transfers.api.TransferState;
import com.robinhood.transfers.gold.ApiGoldDepositBoostTransferDetail;
import com.robinhood.transfers.history.C41787R;
import com.robinhood.utils.Either2;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.money.Currencies;
import io.noties.markwon.Markwon;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: OutgoingWireTransferFormatter.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u0002H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/OutgoingWireTransferFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/OutgoingWireTransaction;", "resources", "Landroid/content/res/Resources;", "cancelSummaryBadgeManager", "Lcom/robinhood/shared/history/formatters/legacy/transfers/CancelSummaryBadgeManager;", "markwon", "Lio/noties/markwon/Markwon;", "<init>", "(Landroid/content/res/Resources;Lcom/robinhood/shared/history/formatters/legacy/transfers/CancelSummaryBadgeManager;Lio/noties/markwon/Markwon;)V", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "transaction", "getPrimaryText", "", "getMetadataSecondaryText", "getMetadataSecondaryTextIcon", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;", "getLineItems", "", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "getAccountDetails", "", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class OutgoingWireTransferFormatter extends AbstractMinervaTransactionFormatter<OutgoingWireTransaction> {
    private final CancelSummaryBadgeManager cancelSummaryBadgeManager;
    private final Markwon markwon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutgoingWireTransferFormatter(Resources resources, CancelSummaryBadgeManager cancelSummaryBadgeManager, Markwon markwon) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(cancelSummaryBadgeManager, "cancelSummaryBadgeManager");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        this.cancelSummaryBadgeManager = cancelSummaryBadgeManager;
        this.markwon = markwon;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(OutgoingWireTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        TransferState state = transaction.getEvent().getState();
        if (this.cancelSummaryBadgeManager.shouldShowCancelSummaryBadge(Either2.asRight(transaction.getEvent()))) {
            return new TransactionSummary.Badge(getString(C11048R.string.general_label_cancel), TransactionSummary.Tint.NEGATIVE, true);
        }
        Boolean isSuccessful = state.getIsSuccessful();
        if (isSuccessful == null) {
            return new TransactionSummary.Badge(getString(UtilsKt.getLabelResId(transaction.getEvent().getState())), TransactionSummary.Tint.FOREGROUND_2, false, 4, null);
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
    public CharSequence getPrimaryText(OutgoingWireTransaction transaction) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        String string2 = getResources().getString(C39006R.string.history_outgoing_wire_transfer_title, getAccountDetails(transaction));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getMetadataSecondaryText(OutgoingWireTransaction transaction) {
        ApiGoldDepositBoostTransferDetail gold_deposit_boost;
        String badge_text;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        ApiPaymentTransferDetails details = transaction.getEvent().getDetails();
        ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer apiGoldDepositBoostTransfer = details instanceof ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer ? (ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer) details : null;
        return (apiGoldDepositBoostTransfer == null || (gold_deposit_boost = apiGoldDepositBoostTransfer.getGold_deposit_boost()) == null || (badge_text = gold_deposit_boost.getBadge_text()) == null) ? super.getMetadataSecondaryText((OutgoingWireTransferFormatter) transaction) : badge_text;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Icon getMetadataSecondaryTextIcon(OutgoingWireTransaction transaction) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.robinhood.android.common.history.ui.format.TransactionLineItem] */
    /* JADX WARN: Type inference failed for: r9v9, types: [com.robinhood.android.common.history.ui.format.TransactionLineItem] */
    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems, reason: merged with bridge method [inline-methods] */
    public List<TransactionLineItem> mo25632getLineItems(OutgoingWireTransaction transaction) throws Resources.NotFoundException {
        ApiGoldDepositBoostTransferDetail gold_deposit_boost;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        PaymentTransfer event = transaction.getEvent();
        TransactionLineItem transactionLineItem = new TransactionLineItem(getString(C39006R.string.transaction_line_item_title_status), getString(UtilsKt.getLabelResId(event.getState())), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        TransactionLineItem transactionLineItem2 = new TransactionLineItem(getString(C39006R.string.transaction_line_item_title_from), getString(C8179R.string.account_type_individual), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        TransactionLineItem transactionLineItem3 = new TransactionLineItem(getString(C39006R.string.transaction_line_item_title_to), getAccountDetails(transaction), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        String string2 = getString(C39006R.string.transaction_line_item_title_amount);
        BigDecimal amount = event.getAmount();
        Currency currency = Currencies.USD;
        TransactionLineItem transactionLineItem4 = new TransactionLineItem(string2, Money.format$default(Money3.toMoney(amount, currency), null, false, null, false, 0, null, false, null, false, false, 1023, null), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        TransactionLineItem transactionLineItem5 = new TransactionLineItem(getString(C39006R.string.history_rhy_fee), Money.format$default(Money3.toMoney(event.getServiceFee(), currency), null, false, null, false, 0, null, false, null, false, false, 1023, null), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        String string3 = getString(C41787R.string.minerva_rhy_transfer_initiated);
        Instant initiatedAt = event.getInitiatedAt();
        InstantFormatter instantFormatter = InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE;
        TransactionLineItem transactionLineItem6 = new TransactionLineItem(string3, instantFormatter.format((InstantFormatter) initiatedAt), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        Instant updatedAt = event.getUpdatedAt();
        TransactionLineItem transactionLineItem7 = updatedAt != null ? new TransactionLineItem(getString(C39006R.string.transaction_line_item_title_last_updated), instantFormatter.format((InstantFormatter) updatedAt), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null) : null;
        ApiPaymentTransferDetails details = event.getDetails();
        ApiPaymentTransferDetails.ApiOutgoingWireTransfer apiOutgoingWireTransfer = details instanceof ApiPaymentTransferDetails.ApiOutgoingWireTransfer ? (ApiPaymentTransferDetails.ApiOutgoingWireTransfer) details : null;
        if (apiOutgoingWireTransfer != null && (gold_deposit_boost = apiOutgoingWireTransfer.getGold_deposit_boost()) != null) {
            String amount_title = gold_deposit_boost.getAmount_title();
            String amount_text = gold_deposit_boost.getAmount_text();
            if (amount_title != null && amount_text != null) {
                String detail_text = gold_deposit_boost.getDetail_text();
                Spanned markdown = detail_text != null ? this.markwon.toMarkdown(detail_text) : null;
                ServerToBentoAssetMapper2 icon_asset = gold_deposit_boost.getIcon_asset();
                transactionLineItem = new TransactionLineItem(amount_title, amount_text, markdown, null, false, null, icon_asset != null ? Integer.valueOf(icon_asset.getResourceId()) : null, TransactionSummary.Tint.SOL_LIGHT, 56, null);
            }
        }
        return CollectionsKt.listOfNotNull((Object[]) new TransactionLineItem[]{transactionLineItem, transactionLineItem2, transactionLineItem3, transactionLineItem4, transactionLineItem5, transactionLineItem6, transactionLineItem7, transactionLineItem});
    }

    private final String getAccountDetails(OutgoingWireTransaction transaction) {
        String str;
        PaymentInstrumentV2 transferAccount = transaction.getTransferAccount();
        PaymentInstrumentDetailsV2 details = transferAccount != null ? transferAccount.getDetails() : null;
        if (details instanceof PaymentInstrumentDetailsV2.OutgoingWireAccount) {
            PaymentInstrumentDetailsV2.OutgoingWireAccount outgoingWireAccount = (PaymentInstrumentDetailsV2.OutgoingWireAccount) details;
            String bankName = outgoingWireAccount.getBankName();
            str = bankName.length() > 0 ? bankName : null;
            return str == null ? outgoingWireAccount.getAccountNumberLastFour() : str;
        }
        if (details instanceof PaymentInstrumentDetailsV2.BankAccount) {
            PaymentInstrumentDetailsV2.BankAccount bankAccount = (PaymentInstrumentDetailsV2.BankAccount) details;
            String bankAccountNickname = bankAccount.getBankAccountNickname();
            str = bankAccountNickname == null || bankAccountNickname.length() == 0 ? null : bankAccountNickname;
            return str == null ? bankAccount.getBankAccountNumberLastFour() : str;
        }
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Outgoing Wire Bank Details Not Found"), false, null, 6, null);
        return "";
    }
}
