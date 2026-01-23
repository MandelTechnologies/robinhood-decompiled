package com.robinhood.shared.history.formatters.legacy;

import android.content.res.Resources;
import android.text.Spanned;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.strings.C8179R;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionLineItem;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.shared.history.formatters.legacy.rhy.UtilsKt;
import com.robinhood.shared.models.history.IncomingWireTransaction;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import com.robinhood.transfers.api.TransferState;
import com.robinhood.transfers.gold.ApiGoldDepositBoostTransferDetail;
import com.robinhood.transfers.history.C41787R;
import com.robinhood.utils.datetime.format.InstantFormatter;
import io.noties.markwon.Markwon;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: IncomingWireTransferFormatter.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/IncomingWireTransferFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/IncomingWireTransaction;", "resources", "Landroid/content/res/Resources;", "markwon", "Lio/noties/markwon/Markwon;", "<init>", "(Landroid/content/res/Resources;Lio/noties/markwon/Markwon;)V", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "transaction", "getPrimaryText", "", "getLineItems", "", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "getMetadataSecondaryText", "getMetadataSecondaryTextIcon", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class IncomingWireTransferFormatter extends AbstractMinervaTransactionFormatter<IncomingWireTransaction> {
    private final Markwon markwon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncomingWireTransferFormatter(Resources resources, Markwon markwon) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        this.markwon = markwon;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(IncomingWireTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        TransferState state = transaction.getEvent().getState();
        Boolean isSuccessful = state.getIsSuccessful();
        if (isSuccessful == null) {
            return new TransactionSummary.Badge(getString(IncomingWireTransferFormatter2.getLabelResId(transaction)), TransactionSummary.Tint.FOREGROUND_2, false, 4, null);
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
    public CharSequence getPrimaryText(IncomingWireTransaction transaction) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        String string2 = getResources().getString(C39006R.string.history_incoming_wire_deposit_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems, reason: merged with bridge method [inline-methods] */
    public List<TransactionLineItem> mo25632getLineItems(IncomingWireTransaction transaction) throws Resources.NotFoundException {
        ApiGoldDepositBoostTransferDetail gold_deposit_boost;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        PaymentTransfer event = transaction.getEvent();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TransactionLineItem(getString(C39006R.string.transaction_line_item_title_status), getString(IncomingWireTransferFormatter2.getLabelResId(transaction)), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null));
        ApiPaymentTransferDetails details = event.getDetails();
        Intrinsics.checkNotNull(details, "null cannot be cast to non-null type com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiIncomingWireTransfer");
        String originating_bank_name = ((ApiPaymentTransferDetails.ApiIncomingWireTransfer) details).getOriginating_bank_name();
        if (originating_bank_name != null) {
            arrayList.add(new TransactionLineItem(getString(C39006R.string.transaction_line_item_title_from), originating_bank_name, null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null));
        }
        arrayList.add(new TransactionLineItem(getString(C39006R.string.transaction_line_item_title_to), getString(C8179R.string.account_type_individual), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null));
        String string2 = getString(C41787R.string.minerva_rhy_transfer_initiated);
        Instant initiatedAt = event.getInitiatedAt();
        InstantFormatter instantFormatter = InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE;
        arrayList.add(new TransactionLineItem(string2, instantFormatter.format((InstantFormatter) initiatedAt), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null));
        Instant updatedAt = event.getUpdatedAt();
        if (updatedAt != null) {
            arrayList.add(new TransactionLineItem(getString(C39006R.string.transaction_line_item_title_last_updated), instantFormatter.format((InstantFormatter) updatedAt), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null));
        }
        ApiPaymentTransferDetails details2 = event.getDetails();
        ApiPaymentTransferDetails.ApiIncomingWireTransfer apiIncomingWireTransfer = details2 instanceof ApiPaymentTransferDetails.ApiIncomingWireTransfer ? (ApiPaymentTransferDetails.ApiIncomingWireTransfer) details2 : null;
        if (apiIncomingWireTransfer != null && (gold_deposit_boost = apiIncomingWireTransfer.getGold_deposit_boost()) != null) {
            String amount_title = gold_deposit_boost.getAmount_title();
            String amount_text = gold_deposit_boost.getAmount_text();
            if (amount_title != null && amount_text != null) {
                String detail_text = gold_deposit_boost.getDetail_text();
                Spanned markdown = detail_text != null ? this.markwon.toMarkdown(detail_text) : null;
                ServerToBentoAssetMapper2 icon_asset = gold_deposit_boost.getIcon_asset();
                arrayList.add(new TransactionLineItem(amount_title, amount_text, markdown, null, false, null, icon_asset != null ? Integer.valueOf(icon_asset.getResourceId()) : null, TransactionSummary.Tint.SOL_LIGHT, 56, null));
            }
        }
        return arrayList;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getMetadataSecondaryText(IncomingWireTransaction transaction) {
        ApiGoldDepositBoostTransferDetail gold_deposit_boost;
        String badge_text;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        ApiPaymentTransferDetails details = transaction.getEvent().getDetails();
        ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer apiGoldDepositBoostTransfer = details instanceof ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer ? (ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer) details : null;
        return (apiGoldDepositBoostTransfer == null || (gold_deposit_boost = apiGoldDepositBoostTransfer.getGold_deposit_boost()) == null || (badge_text = gold_deposit_boost.getBadge_text()) == null) ? super.getMetadataSecondaryText((IncomingWireTransferFormatter) transaction) : badge_text;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Icon getMetadataSecondaryTextIcon(IncomingWireTransaction transaction) {
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
