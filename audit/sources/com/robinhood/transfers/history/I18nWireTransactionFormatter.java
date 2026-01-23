package com.robinhood.transfers.history;

import android.content.res.Resources;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionLineItem;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.models.p320db.bff.PaymentIntent;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentDetailsV2;
import com.robinhood.models.util.Money;
import com.robinhood.shared.models.history.I18nWireTransaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: I18nWireTransactionFormatter.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/transfers/history/I18nWireTransactionFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/I18nWireTransaction;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "getPrimaryText", "", "transaction", "getAmountText", "", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "getLineItems", "", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class I18nWireTransactionFormatter extends AbstractMinervaTransactionFormatter<I18nWireTransaction> {

    /* compiled from: I18nWireTransactionFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentIntent.Direction.values().length];
            try {
                iArr[PaymentIntent.Direction.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentIntent.Direction.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I18nWireTransactionFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public String getPrimaryText(I18nWireTransaction transaction) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        PaymentInstrumentDetailsV2 details = transaction.getPaymentInstrument().getDetails();
        PaymentInstrumentDetailsV2.I18nBankAccount i18nBankAccount = details instanceof PaymentInstrumentDetailsV2.I18nBankAccount ? (PaymentInstrumentDetailsV2.I18nBankAccount) details : null;
        String bankName = i18nBankAccount != null ? i18nBankAccount.getBankName() : null;
        if (bankName == null || bankName.length() == 0) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[transaction.getEvent().getDirection().ordinal()];
            if (i3 == 1) {
                i = C41787R.string.wire_deposit_title;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C41787R.string.wire_withdrawal_title;
            }
            return getString(i);
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[transaction.getEvent().getDirection().ordinal()];
        if (i4 == 1) {
            i2 = C41787R.string.wire_deposit_from_title;
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = C41787R.string.wire_withdrawal_to_title;
        }
        return getString(i2, i18nBankAccount != null ? i18nBankAccount.getBankName() : null);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getAmountText(I18nWireTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return Money.Adjustment.format$default(transaction.getEvent().getAdjustment(), false, null, 3, null);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(I18nWireTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        PaymentIntent.State state = transaction.getEvent().getState();
        Integer badgeTextRes = PaymentIntents.getBadgeTextRes(state);
        if (badgeTextRes != null) {
            return new TransactionSummary.Badge(getString(badgeTextRes.intValue()), PaymentIntents.getBadgeTint(state), false, 4, null);
        }
        return null;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems, reason: merged with bridge method [inline-methods] */
    public List<TransactionLineItem> mo25632getLineItems(I18nWireTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        throw new UnsupportedOperationException();
    }
}
