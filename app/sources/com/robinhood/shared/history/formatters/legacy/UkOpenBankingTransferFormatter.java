package com.robinhood.shared.history.formatters.legacy;

import android.content.res.Resources;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.ach.format.C8331R;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionLineItem;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentV2;
import com.robinhood.shared.history.formatters.legacy.rhy.UtilsKt;
import com.robinhood.shared.models.history.UkOpenBankingTransferTransaction;
import com.robinhood.transfers.api.Direction;
import com.robinhood.transfers.api.TransferState;
import com.robinhood.transfers.history.C41787R;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.ZonedDateTimeFormatter;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.ZonedDateTime;

/* compiled from: UkOpenBankingTransferFormatter.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/UkOpenBankingTransferFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/UkOpenBankingTransferTransaction;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "getPrimaryText", "", "transaction", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "getLineItems", "", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class UkOpenBankingTransferFormatter extends AbstractMinervaTransactionFormatter<UkOpenBankingTransferTransaction> {

    /* compiled from: UkOpenBankingTransferFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.PULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.PUSH.ordinal()] = 2;
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
    public UkOpenBankingTransferFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public String getPrimaryText(UkOpenBankingTransferTransaction transaction) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        PaymentInstrumentV2 paymentInstrument = transaction.getPaymentInstrument();
        String displayName = paymentInstrument != null ? UkOpenBankingTransferFormatter2.getDisplayName(paymentInstrument) : null;
        if (displayName != null) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[transaction.getEvent().getDirection().ordinal()];
            if (i3 == 1) {
                i2 = C41787R.string.minerva_transfer_description_deposit_from;
            } else if (i3 == 2) {
                i2 = C41787R.string.minerva_transfer_description_withdrawal_to;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = C11048R.string.general_label_unknown;
            }
            return getString(i2, displayName);
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[transaction.getEvent().getDirection().ordinal()];
        if (i4 == 1) {
            i = C8331R.string.transfer_deposit_label;
        } else if (i4 == 2) {
            i = C8331R.string.transfer_withdrawal_label;
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = C11048R.string.general_label_unknown;
        }
        return getString(i);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(UkOpenBankingTransferTransaction transaction) {
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
        return new TransactionSummary.Badge(getString(UtilsKt.getLabelResId(transaction.getEvent().getState())), TransactionSummary.Tint.FOREGROUND_2, false, 4, null);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems, reason: merged with bridge method [inline-methods] */
    public List<TransactionLineItem> mo25632getLineItems(UkOpenBankingTransferTransaction transaction) throws Resources.NotFoundException {
        int i;
        TransactionLineItem transactionLineItem;
        List listListOfNotNull;
        int i2;
        TransactionLineItem transactionLineItem2;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        PaymentInstrumentV2 paymentInstrument = transaction.getPaymentInstrument();
        String displayName = paymentInstrument != null ? UkOpenBankingTransferFormatter2.getDisplayName(paymentInstrument) : null;
        PaymentTransfer.TransferAccountInfo originatingTransferAccountInfo = transaction.getEvent().getOriginatingTransferAccountInfo();
        String accountNameTitle = originatingTransferAccountInfo != null ? originatingTransferAccountInfo.getAccountNameTitle() : null;
        int i3 = WhenMappings.$EnumSwitchMapping$0[transaction.getEvent().getDirection().ordinal()];
        if (i3 == 1) {
            String str = accountNameTitle;
            TransactionLineItem transactionLineItem3 = displayName != null ? new TransactionLineItem(getString(C11048R.string.general_label_from), displayName, null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null) : null;
            if (str != null) {
                i = 1;
                transactionLineItem = new TransactionLineItem(getString(C11048R.string.general_label_to), str, null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
            } else {
                i = 1;
                transactionLineItem = null;
            }
            listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new TransactionLineItem[]{transactionLineItem3, transactionLineItem});
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Unknown direction for UkOpenBankingTransfer!");
            }
            TransactionLineItem transactionLineItem4 = accountNameTitle != null ? new TransactionLineItem(getString(C11048R.string.general_label_from), accountNameTitle, null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null) : null;
            if (displayName != null) {
                i2 = 1;
                transactionLineItem2 = new TransactionLineItem(getString(C11048R.string.general_label_to), displayName, null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
            } else {
                i2 = 1;
                transactionLineItem2 = null;
            }
            listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new TransactionLineItem[]{transactionLineItem4, transactionLineItem2});
            i = i2;
        }
        List listPlus = CollectionsKt.plus((Collection) CollectionsKt.listOf(new TransactionLineItem(getString(C39006R.string.transaction_line_item_title_status), getString(UtilsKt.getLabelResId(transaction.getEvent().getState())), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null)), (Iterable) listListOfNotNull);
        String string2 = getString(C41787R.string.minerva_rhy_transfer_initiated);
        ZonedDateTime zonedDateTime$default = Instants.toZonedDateTime$default(transaction.getEvent().getCreatedAt(), null, i, null);
        ZonedDateTimeFormatter zonedDateTimeFormatter = ZonedDateTimeFormatter.LONG_DATE_TIME_WITH_ZONE;
        TransactionLineItem transactionLineItem5 = new TransactionLineItem(string2, zonedDateTimeFormatter.format((ZonedDateTimeFormatter) zonedDateTime$default), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        Instant updatedAt = transaction.getEvent().getUpdatedAt();
        return CollectionsKt.plus((Collection) listPlus, (Iterable) CollectionsKt.listOfNotNull((Object[]) new TransactionLineItem[]{transactionLineItem5, updatedAt != null ? new TransactionLineItem(getString(C39006R.string.transaction_line_item_title_last_updated), zonedDateTimeFormatter.format((ZonedDateTimeFormatter) Instants.toZonedDateTime$default(updatedAt, null, i, null)), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null) : null}));
    }
}
