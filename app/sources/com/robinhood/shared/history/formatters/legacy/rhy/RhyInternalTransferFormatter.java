package com.robinhood.shared.history.formatters.legacy.rhy;

import android.content.res.Resources;
import android.text.Spanned;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionLineItem;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.transfer.shared.AccountType;
import com.robinhood.models.api.bonfire.rhy.ApiRhyTransferIraInfo;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.models.serverdriven.experimental.api.DataRowStacked;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.shared.history.formatters.legacy.C39006R;
import com.robinhood.shared.history.formatters.legacy.transfers.CancelSummaryBadgeManager;
import com.robinhood.shared.models.history.RhyInternalTransferTransaction;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import com.robinhood.transfers.api.Direction;
import com.robinhood.transfers.api.TransferPurpose;
import com.robinhood.transfers.api.TransferState;
import com.robinhood.transfers.gold.ApiGoldDepositBoostTransferDetail;
import com.robinhood.transfers.history.C41787R;
import com.robinhood.utils.Either2;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.money.Currencies;
import io.noties.markwon.Markwon;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhyInternalTransferFormatter.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\r\u001a\u00020\u0002H\u0016J4\u0010\u0019\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010 \u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a*\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R(\u0010$\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a*\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006&"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/rhy/RhyInternalTransferFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/RhyInternalTransferTransaction;", "cancelSummaryBadgeManager", "Lcom/robinhood/shared/history/formatters/legacy/transfers/CancelSummaryBadgeManager;", "resources", "Landroid/content/res/Resources;", "markwon", "Lio/noties/markwon/Markwon;", "<init>", "(Lcom/robinhood/shared/history/formatters/legacy/transfers/CancelSummaryBadgeManager;Landroid/content/res/Resources;Lio/noties/markwon/Markwon;)V", "hasCompletedExceptionally", "", "transaction", "getPrimaryText", "", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "getAmountText", "getLineItems", "", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "getMetadataSecondaryText", "getMetadataSecondaryTextIcon", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;", "accountLabels", "Lkotlin/Pair;", "", "direction", "Lcom/robinhood/transfers/api/Direction;", "originating", "receiving", "accountLabelsInline", "Lcom/robinhood/models/db/bonfire/PaymentTransfer;", "getAccountLabelsInline", "(Lcom/robinhood/models/db/bonfire/PaymentTransfer;)Lkotlin/Pair;", "accountLabelsTitled", "getAccountLabelsTitled", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class RhyInternalTransferFormatter extends AbstractMinervaTransactionFormatter<RhyInternalTransferTransaction> {
    private final CancelSummaryBadgeManager cancelSummaryBadgeManager;
    private final Markwon markwon;

    /* compiled from: RhyInternalTransferFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.PUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.PULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Direction.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyInternalTransferFormatter(CancelSummaryBadgeManager cancelSummaryBadgeManager, Resources resources, Markwon markwon) {
        super(resources);
        Intrinsics.checkNotNullParameter(cancelSummaryBadgeManager, "cancelSummaryBadgeManager");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        this.cancelSummaryBadgeManager = cancelSummaryBadgeManager;
        this.markwon = markwon;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public boolean hasCompletedExceptionally(RhyInternalTransferTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return Intrinsics.areEqual(transaction.getEvent().getState().getIsSuccessful(), Boolean.FALSE);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(RhyInternalTransferTransaction transaction) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Tuples2<String, String> accountLabelsInline = getAccountLabelsInline(transaction.getEvent());
        String strComponent1 = accountLabelsInline.component1();
        String strComponent2 = accountLabelsInline.component2();
        PaymentTransfer event = transaction.getEvent();
        if (!event.getIsOwner()) {
            String ownerName = transaction.getEvent().getOwnerName();
            if (ownerName == null) {
                ownerName = getString(C41787R.string.minerva_transfer_non_owner_name_fallback);
            }
            if (event.getOriginatingAccountType() == AccountType.RHS_JOINT_TENANCY_WITH_ROS) {
                strComponent2 = getString(C41787R.string.minerva_transfer_non_owner_label, ownerName, strComponent2);
            } else {
                strComponent1 = getString(C41787R.string.minerva_transfer_non_owner_label, ownerName, strComponent1);
            }
        }
        ApiPaymentTransferDetails details = transaction.getEvent().getDetails();
        if (strComponent1 == null || strComponent2 == null) {
            return getString(C41787R.string.minerva_transfer_description_inter_entity_unknown_account_type);
        }
        ApiPaymentTransferDetails.ApiInternalTransfer apiInternalTransfer = details instanceof ApiPaymentTransferDetails.ApiInternalTransfer ? (ApiPaymentTransferDetails.ApiInternalTransfer) details : null;
        if ((apiInternalTransfer != null ? apiInternalTransfer.getPurpose() : null) == TransferPurpose.CASHBACK_REDEMPTION_CC) {
            return getString(C39006R.string.minerva_credit_card_cash_back_primary_text, strComponent1);
        }
        return getString(C41787R.string.minerva_transfer_description_general, strComponent2, strComponent1);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(RhyInternalTransferTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (this.cancelSummaryBadgeManager.shouldShowCancelSummaryBadge(Either2.asRight(transaction.getEvent()))) {
            return new TransactionSummary.Badge(getString(C11048R.string.general_label_cancel), TransactionSummary.Tint.NEGATIVE, true);
        }
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
    public CharSequence getAmountText(RhyInternalTransferTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return Money.format$default(Money3.toMoney(transaction.getEvent().getAmount(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.robinhood.android.common.history.ui.format.TransactionLineItem] */
    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems, reason: merged with bridge method [inline-methods] */
    public List<TransactionLineItem> mo25632getLineItems(RhyInternalTransferTransaction transaction) {
        Collection collectionEmptyList;
        ApiGoldDepositBoostTransferDetail gold_deposit_boost;
        Money clawback_amount;
        TransferPurpose purpose;
        Integer labelResId;
        List<UIComponent<GenericAction>> rows;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Tuples2<String, String> accountLabelsTitled = getAccountLabelsTitled(transaction.getEvent());
        String strComponent1 = accountLabelsTitled.component1();
        String strComponent2 = accountLabelsTitled.component2();
        ApiPaymentTransferDetails details = transaction.getEvent().getDetails();
        ApiRhyTransferIraInfo iraTransferInfo = transaction.getIraTransferInfo();
        if (iraTransferInfo == null || (rows = iraTransferInfo.getRows()) == null) {
            collectionEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList<DataRowStacked> arrayList = new ArrayList();
            for (Object obj : rows) {
                if (obj instanceof DataRowStacked) {
                    arrayList.add(obj);
                }
            }
            collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (DataRowStacked dataRowStacked : arrayList) {
                collectionEmptyList.add(new TransactionLineItem(dataRowStacked.getLabel(), dataRowStacked.getValue(), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null));
            }
        }
        Collection collection = collectionEmptyList;
        TransactionLineItem transactionLineItem = new TransactionLineItem(getString(C39006R.string.transaction_line_item_title_status), getString(UtilsKt.getLabelResId(transaction.getEvent().getState())), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        TransactionLineItem transactionLineItem2 = new TransactionLineItem(getString(C41787R.string.minerva_rhy_transfer_initiated), InstantFormatter.NATURAL_TIMESTAMP_IN_SYSTEM_ZONE.format((InstantFormatter) transaction.getEvent().getInitiatedAt()), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        TransactionLineItem transactionLineItem3 = strComponent1 != null ? new TransactionLineItem(getString(C39006R.string.transaction_line_item_title_from), strComponent1, null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null) : null;
        TransactionLineItem transactionLineItem4 = strComponent2 != null ? new TransactionLineItem(getString(C39006R.string.transaction_line_item_title_to), strComponent2, null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null) : null;
        ApiPaymentTransferDetails details2 = transaction.getEvent().getDetails();
        ApiPaymentTransferDetails.ApiInternalTransfer apiInternalTransfer = details2 instanceof ApiPaymentTransferDetails.ApiInternalTransfer ? (ApiPaymentTransferDetails.ApiInternalTransfer) details2 : null;
        TransactionLineItem transactionLineItem5 = (apiInternalTransfer == null || (purpose = apiInternalTransfer.getPurpose()) == null || (labelResId = UtilsKt.getLabelResId(purpose)) == null) ? null : new TransactionLineItem(getString(C41787R.string.minerva_rhy_transfer_reason), getString(labelResId.intValue()), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        ApiPaymentTransferDetails.ApiClawbackTransfer apiClawbackTransfer = details instanceof ApiPaymentTransferDetails.ApiClawbackTransfer ? (ApiPaymentTransferDetails.ApiClawbackTransfer) details : null;
        List listPlus = CollectionsKt.plus((Collection) CollectionsKt.listOfNotNull((Object[]) new TransactionLineItem[]{transactionLineItem, transactionLineItem2, transactionLineItem3, transactionLineItem4, transactionLineItem5, (apiClawbackTransfer == null || (clawback_amount = apiClawbackTransfer.getClawback_amount()) == null) ? null : new TransactionLineItem(getString(C39006R.string.acats_clawback_label), Money.format$default(clawback_amount, null, false, null, false, 0, null, false, null, false, false, 1023, null), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null)}), (Iterable) collection);
        ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer apiGoldDepositBoostTransfer = details instanceof ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer ? (ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer) details : null;
        if (apiGoldDepositBoostTransfer != null && (gold_deposit_boost = apiGoldDepositBoostTransfer.getGold_deposit_boost()) != null) {
            String amount_title = gold_deposit_boost.getAmount_title();
            String amount_text = gold_deposit_boost.getAmount_text();
            if (amount_title != null && amount_text != null) {
                String detail_text = gold_deposit_boost.getDetail_text();
                Spanned markdown = detail_text != null ? this.markwon.toMarkdown(detail_text) : null;
                ServerToBentoAssetMapper2 icon_asset = gold_deposit_boost.getIcon_asset();
                transactionLineItem = new TransactionLineItem(amount_title, amount_text, markdown, null, false, null, icon_asset != null ? Integer.valueOf(icon_asset.getResourceId()) : null, TransactionSummary.Tint.SOL_LIGHT, 56, null);
            }
        }
        return CollectionsKt.plus((Collection) listPlus, (Iterable) CollectionsKt.listOfNotNull(transactionLineItem));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.robinhood.transfers.api.ApiPaymentTransferDetails$ApiSentTransfer] */
    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getMetadataSecondaryText(RhyInternalTransferTransaction transaction) {
        ApiGoldDepositBoostTransferDetail gold_deposit_boost;
        Money clawback_amount;
        Money.Adjustment debitAdjustment;
        Money enoki_removal_fee;
        Money.Adjustment debitAdjustment2;
        Money enoki_amount;
        Money.Adjustment creditAdjustment;
        String str;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        ApiPaymentTransferDetails details = transaction.getEvent().getDetails();
        ApiPaymentTransferDetails.ApiInternalTransfer apiInternalTransfer = details instanceof ApiPaymentTransferDetails.ApiSentTransfer ? (ApiPaymentTransferDetails.ApiSentTransfer) details : null;
        if (apiInternalTransfer == null) {
            ApiPaymentTransferDetails details2 = transaction.getEvent().getDetails();
            apiInternalTransfer = details2 instanceof ApiPaymentTransferDetails.ApiInternalTransfer ? (ApiPaymentTransferDetails.ApiInternalTransfer) details2 : null;
        }
        if (apiInternalTransfer != null && (enoki_amount = apiInternalTransfer.getEnoki_amount()) != null && (creditAdjustment = enoki_amount.toCreditAdjustment()) != null && (str = Money.Adjustment.format$default(creditAdjustment, false, null, 3, null)) != null) {
            return str;
        }
        if (apiInternalTransfer != null && (enoki_removal_fee = apiInternalTransfer.getEnoki_removal_fee()) != null && (debitAdjustment2 = enoki_removal_fee.toDebitAdjustment()) != null) {
            return Money.Adjustment.format$default(debitAdjustment2, false, null, 3, null);
        }
        String str2 = (apiInternalTransfer == null || (clawback_amount = apiInternalTransfer.getClawback_amount()) == null || (debitAdjustment = clawback_amount.toDebitAdjustment()) == null) ? null : Money.Adjustment.format$default(debitAdjustment, false, null, 3, null);
        if (str2 != null) {
            return str2;
        }
        if (apiInternalTransfer == null || (gold_deposit_boost = apiInternalTransfer.getGold_deposit_boost()) == null) {
            return null;
        }
        return gold_deposit_boost.getBadge_text();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.robinhood.transfers.api.ApiPaymentTransferDetails$ApiSentTransfer] */
    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Icon getMetadataSecondaryTextIcon(RhyInternalTransferTransaction transaction) {
        ApiGoldDepositBoostTransferDetail gold_deposit_boost;
        ServerToBentoAssetMapper2 icon_asset;
        ApiGoldDepositBoostTransferDetail gold_deposit_boost2;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        ApiPaymentTransferDetails details = transaction.getEvent().getDetails();
        ApiPaymentTransferDetails.ApiInternalTransfer apiInternalTransfer = details instanceof ApiPaymentTransferDetails.ApiSentTransfer ? (ApiPaymentTransferDetails.ApiSentTransfer) details : null;
        if (apiInternalTransfer == null) {
            ApiPaymentTransferDetails details2 = transaction.getEvent().getDetails();
            apiInternalTransfer = details2 instanceof ApiPaymentTransferDetails.ApiInternalTransfer ? (ApiPaymentTransferDetails.ApiInternalTransfer) details2 : null;
        }
        if ((apiInternalTransfer != null ? apiInternalTransfer.getEnoki_amount() : null) != null) {
            return new TransactionSummary.Icon(ServerToBentoAssetMapper2.RETIREMENT_12, TransactionSummary.Tint.POSITIVE);
        }
        if (((apiInternalTransfer == null || (gold_deposit_boost2 = apiInternalTransfer.getGold_deposit_boost()) == null) ? null : gold_deposit_boost2.getBadge_text()) == null || (gold_deposit_boost = apiInternalTransfer.getGold_deposit_boost()) == null || (icon_asset = gold_deposit_boost.getIcon_asset()) == null) {
            return null;
        }
        return new TransactionSummary.Icon(icon_asset, TransactionSummary.Tint.SOL_LIGHT);
    }

    private final Tuples2<String, String> accountLabels(Direction direction, String originating, String receiving) {
        int i = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == 1) {
            return Tuples4.m3642to(originating, receiving);
        }
        if (i == 2) {
            return Tuples4.m3642to(receiving, originating);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return Tuples4.m3642to(null, null);
    }

    private final Tuples2<String, String> getAccountLabelsInline(PaymentTransfer paymentTransfer) {
        PaymentTransfer.TransferAccountInfo originatingTransferAccountInfo = paymentTransfer.getOriginatingTransferAccountInfo();
        String accountNameInline = originatingTransferAccountInfo != null ? originatingTransferAccountInfo.getAccountNameInline() : null;
        PaymentTransfer.TransferAccountInfo receivingTransferAccountInfo = paymentTransfer.getReceivingTransferAccountInfo();
        return accountLabels(paymentTransfer.getDirection(), accountNameInline, receivingTransferAccountInfo != null ? receivingTransferAccountInfo.getAccountNameInline() : null);
    }

    private final Tuples2<String, String> getAccountLabelsTitled(PaymentTransfer paymentTransfer) {
        PaymentTransfer.TransferAccountInfo originatingTransferAccountInfo = paymentTransfer.getOriginatingTransferAccountInfo();
        String accountNameTitle = originatingTransferAccountInfo != null ? originatingTransferAccountInfo.getAccountNameTitle() : null;
        PaymentTransfer.TransferAccountInfo receivingTransferAccountInfo = paymentTransfer.getReceivingTransferAccountInfo();
        return accountLabels(paymentTransfer.getDirection(), accountNameTitle, receivingTransferAccountInfo != null ? receivingTransferAccountInfo.getAccountNameTitle() : null);
    }
}
