package com.robinhood.shared.history.formatters.legacy.transfers;

import android.content.res.Resources;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionLineItem;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.api.bonfire.rhy.ApiRhyTransferIraInfo;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.models.serverdriven.experimental.api.DataRowStacked;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.util.Money;
import com.robinhood.shared.history.formatters.legacy.C39006R;
import com.robinhood.shared.history.formatters.legacy.rhy.UtilsKt;
import com.robinhood.shared.models.history.RolloverAchTransferTransaction;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import com.robinhood.transfers.api.TransferState;
import com.robinhood.transfers.history.C41787R;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.LocalDate;

/* compiled from: RolloverAchTransferFormatter.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/transfers/RolloverAchTransferFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/RolloverAchTransferTransaction;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "transaction", "getPrimaryText", "", "getLineItems", "", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "getMetadataSecondaryText", "getMetadataSecondaryTextIcon", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class RolloverAchTransferFormatter extends AbstractMinervaTransactionFormatter<RolloverAchTransferTransaction> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RolloverAchTransferFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(RolloverAchTransferTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        TransferState state = transaction.getEvent().getState();
        Boolean isSuccessful = state.getIsSuccessful();
        if (Intrinsics.areEqual(isSuccessful, Boolean.TRUE)) {
            return null;
        }
        if (Intrinsics.areEqual(isSuccessful, Boolean.FALSE)) {
            return new TransactionSummary.Badge(getString(UtilsKt.getLabelResId(state)), TransactionSummary.Tint.NEGATIVE, false, 4, null);
        }
        if (isSuccessful != null) {
            throw new NoWhenBranchMatchedException();
        }
        return new TransactionSummary.Badge(getString(UtilsKt.getLabelResId(state)), TransactionSummary.Tint.FOREGROUND_2, false, 4, null);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(RolloverAchTransferTransaction transaction) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        PaymentTransfer.TransferAccountInfo receivingTransferAccountInfo = transaction.getEvent().getReceivingTransferAccountInfo();
        String string2 = getResources().getString(C39006R.string.minerva_transfer_description_rollover_to, receivingTransferAccountInfo != null ? receivingTransferAccountInfo.getAccountNameInline() : null);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems, reason: merged with bridge method [inline-methods] */
    public List<TransactionLineItem> mo25632getLineItems(RolloverAchTransferTransaction transaction) throws Resources.NotFoundException {
        Collection collectionEmptyList;
        List<UIComponent<GenericAction>> rows;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        PaymentTransfer event = transaction.getEvent();
        ApiPaymentTransferDetails details = event.getDetails();
        Intrinsics.checkNotNull(details, "null cannot be cast to non-null type com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiRolloverAchTransfer");
        ApiPaymentTransferDetails.ApiRolloverAchTransfer apiRolloverAchTransfer = (ApiPaymentTransferDetails.ApiRolloverAchTransfer) details;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TransactionLineItem(getString(C39006R.string.transaction_line_item_title_status), getString(UtilsKt.getLabelResId(event.getState())), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null));
        PaymentTransfer.TransferAccountInfo receivingTransferAccountInfo = event.getReceivingTransferAccountInfo();
        String accountNameTitle = receivingTransferAccountInfo != null ? receivingTransferAccountInfo.getAccountNameTitle() : null;
        if (accountNameTitle != null) {
            arrayList.add(new TransactionLineItem(getString(C39006R.string.transaction_line_item_title_to), accountNameTitle, null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null));
        }
        ApiRhyTransferIraInfo iraTransferInfo = transaction.getIraTransferInfo();
        if (iraTransferInfo == null || (rows = iraTransferInfo.getRows()) == null) {
            collectionEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList<DataRowStacked> arrayList2 = new ArrayList();
            for (Object obj : rows) {
                if (obj instanceof DataRowStacked) {
                    arrayList2.add(obj);
                }
            }
            collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (DataRowStacked dataRowStacked : arrayList2) {
                collectionEmptyList.add(new TransactionLineItem(dataRowStacked.getLabel(), dataRowStacked.getValue(), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null));
            }
        }
        arrayList.addAll(collectionEmptyList);
        String string2 = getString(C41787R.string.minerva_rhy_transfer_initiated);
        Instant initiatedAt = event.getInitiatedAt();
        InstantFormatter instantFormatter = InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE;
        arrayList.add(new TransactionLineItem(string2, instantFormatter.format((InstantFormatter) initiatedAt), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null));
        LocalDate limitation_release_date = apiRolloverAchTransfer.getLimitation_release_date();
        if (limitation_release_date != null) {
            arrayList.add(new TransactionLineItem(getString(C41787R.string.minerva_rhy_transfer_available), LocalDateFormatter.MEDIUM.format((LocalDateFormatter) limitation_release_date), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null));
        }
        Instant updatedAt = event.getUpdatedAt();
        if (updatedAt != null) {
            arrayList.add(new TransactionLineItem(getString(C39006R.string.transaction_line_item_title_last_updated), instantFormatter.format((InstantFormatter) updatedAt), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null));
        }
        return arrayList;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getMetadataSecondaryText(RolloverAchTransferTransaction transaction) {
        Money.Adjustment debitAdjustment;
        Money.Adjustment creditAdjustment;
        String str;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        ApiPaymentTransferDetails details = transaction.getEvent().getDetails();
        ApiPaymentTransferDetails.ApiEnokiTransfer apiEnokiTransfer = details instanceof ApiPaymentTransferDetails.ApiEnokiTransfer ? (ApiPaymentTransferDetails.ApiEnokiTransfer) details : null;
        if (apiEnokiTransfer == null) {
            return null;
        }
        Money enoki_amount = apiEnokiTransfer.getEnoki_amount();
        if (enoki_amount != null && (creditAdjustment = enoki_amount.toCreditAdjustment()) != null && (str = Money.Adjustment.format$default(creditAdjustment, false, null, 3, null)) != null) {
            return str;
        }
        Money enoki_removal_fee = apiEnokiTransfer.getEnoki_removal_fee();
        return (enoki_removal_fee == null || (debitAdjustment = enoki_removal_fee.toDebitAdjustment()) == null) ? super.getMetadataSecondaryText((RolloverAchTransferFormatter) transaction) : Money.Adjustment.format$default(debitAdjustment, false, null, 3, null);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Icon getMetadataSecondaryTextIcon(RolloverAchTransferTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        ApiPaymentTransferDetails details = transaction.getEvent().getDetails();
        ApiPaymentTransferDetails.ApiEnokiTransfer apiEnokiTransfer = details instanceof ApiPaymentTransferDetails.ApiEnokiTransfer ? (ApiPaymentTransferDetails.ApiEnokiTransfer) details : null;
        if ((apiEnokiTransfer != null ? apiEnokiTransfer.getEnoki_amount() : null) != null) {
            return new TransactionSummary.Icon(ServerToBentoAssetMapper2.RETIREMENT_12, TransactionSummary.Tint.POSITIVE);
        }
        return null;
    }
}
