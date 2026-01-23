package com.robinhood.shared.crypto.history;

import android.content.res.Resources;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionLineItem;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.models.util.Money;
import com.robinhood.shared.models.history.SepaCreditTransaction;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import com.robinhood.transfers.api.TransferState;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SepaCreditFormatter.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/SepaCreditFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/SepaCreditTransaction;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "getPrimaryText", "", "transaction", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "getLineItems", "", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class SepaCreditFormatter extends AbstractMinervaTransactionFormatter<SepaCreditTransaction> {

    /* compiled from: SepaCreditFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[TransferState.values().length];
            try {
                iArr2[TransferState.PAUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TransferState.NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TransferState.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TransferState.PENDING_CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[TransferState.READY.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[TransferState.PREPROCESSING.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[TransferState.CANCELLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[TransferState.FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[TransferState.REJECTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[TransferState.REVERSED.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[TransferState.COMPLETED.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[TransferState.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SepaCreditFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(SepaCreditTransaction transaction) throws Resources.NotFoundException {
        String string2;
        String string3;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        ApiPaymentTransferDetails details = transaction.getEvent().getDetails();
        ApiPaymentTransferDetails.ApiSepaCredit apiSepaCredit = details instanceof ApiPaymentTransferDetails.ApiSepaCredit ? (ApiPaymentTransferDetails.ApiSepaCredit) details : null;
        String displayBankDetails = apiSepaCredit != null ? apiSepaCredit.getDisplayBankDetails() : null;
        int i = WhenMappings.$EnumSwitchMapping$0[transaction.getEvent().getAdjustment().getDirection().ordinal()];
        if (i == 1) {
            if (displayBankDetails != null) {
                string2 = getResources().getString(C37690R.string.sepa_credit_primary_text_deposit, displayBankDetails);
            } else {
                string2 = getResources().getString(C37690R.string.sepa_credit_primary_text_deposit_no_iban);
            }
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (displayBankDetails != null) {
            string3 = getResources().getString(C37690R.string.sepa_credit_primary_text_withdrawal, displayBankDetails);
        } else {
            string3 = getResources().getString(C37690R.string.sepa_credit_primary_text_withdrawal_no_iban);
        }
        Intrinsics.checkNotNull(string3);
        return string3;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(SepaCreditTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        switch (WhenMappings.$EnumSwitchMapping$1[transaction.getEvent().getState().ordinal()]) {
            case 1:
                return new TransactionSummary.Badge(getString(C37690R.string.sepa_credit_secondary_text_state_paused), TransactionSummary.Tint.FOREGROUND_2, false, 4, null);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new TransactionSummary.Badge(getString(C37690R.string.sepa_credit_secondary_text_state_pending), TransactionSummary.Tint.FOREGROUND_2, false, 4, null);
            case 7:
            case 8:
            case 9:
                return new TransactionSummary.Badge(getString(C37690R.string.sepa_credit_secondary_text_state_failed), TransactionSummary.Tint.NEGATIVE, false, 4, null);
            case 10:
                return new TransactionSummary.Badge(getString(C37690R.string.sepa_credit_secondary_text_state_reversed), TransactionSummary.Tint.NEGATIVE, false, 4, null);
            case 11:
            case 12:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems, reason: merged with bridge method [inline-methods] */
    public List<TransactionLineItem> mo25632getLineItems(SepaCreditTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        throw new UnsupportedOperationException("Sepa Credit transactions have their own history detail page");
    }
}
