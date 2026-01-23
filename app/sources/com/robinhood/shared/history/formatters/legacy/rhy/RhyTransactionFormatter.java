package com.robinhood.shared.history.formatters.legacy.rhy;

import android.content.res.Resources;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionLineItem;
import com.robinhood.models.p320db.bonfire.InnerRhyTransaction;
import com.robinhood.shared.history.formatters.legacy.C39006R;
import com.robinhood.shared.models.history.RhyHistoryTransaction;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyTransactionFormatter.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/rhy/RhyTransactionFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/RhyHistoryTransaction;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "getPrimaryText", "", "transaction", "getLineItems", "", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class RhyTransactionFormatter extends AbstractMinervaTransactionFormatter<RhyHistoryTransaction> {

    /* compiled from: RhyTransactionFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HistoryTransactionType.values().length];
            try {
                iArr[HistoryTransactionType.TAX_WITHHOLDING_FEDERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HistoryTransactionType.TAX_WITHHOLDING_STATE_CALIFORNIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HistoryTransactionType.TAX_WITHHOLDING_STATE_MAINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HistoryTransactionType.TAX_WITHHOLDING_STATE_VERMONT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HistoryTransactionType.TAX_WITHHOLDING_NRA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_FEDERAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_STATE_CALIFORNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_STATE_MAINE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_STATE_VERMONT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_NRA.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[HistoryTransactionType.TAX_WITHHOLDING_MANUAL_ADJUSTMENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_MANUAL_ADJUSTMENT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[HistoryTransactionType.ADJUSTMENT_CREDIT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[HistoryTransactionType.ADJUSTMENT_DEBIT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_ADR_FEE_CREDIT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_GOLD_FEE_CREDIT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_MARGIN_INTEREST_CREDIT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_NEGATIVE_EQUITY_REPAYMENT_DEBIT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_NEGATIVE_EQUITY_WRITEOFF.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_REFERRAL_CREDIT.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_REVERSED_ACH_CREDIT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_WRITEOFF.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_CX_GOODWILL_CREDIT.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_ACAT_FEE_CREDIT.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_OTHER.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_INCOMING_ACAT_FEE_REIMBURSEMENT.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_SETTLEMENT_AGREEMENT_TAXABLE.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_SETTLEMENT_AGREEMENT_NON_TAXABLE.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_OTHER_TAXABLE.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_OTHER_NON_TAXABLE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_CASH_BACK_OFFERS_CREDIT.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_MERCHANT_OFFERS_CREDIT.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[HistoryTransactionType.AUTOPOST_P2P_REFERRAL_CREDIT.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[HistoryTransactionType.CASH_BALANCE_TRANSFER.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[HistoryTransactionType.CASH_BALANCE_TRANSFER_TAXABLE.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[HistoryTransactionType.CASH_BALANCE_TRANSFER_NON_TAXABLE.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[HistoryTransactionType.FEE.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[HistoryTransactionType.WIRE.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyTransactionFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(RhyHistoryTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        switch (WhenMappings.$EnumSwitchMapping$0[transaction.getEvent().getTransactionType().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                InnerRhyTransaction originalTaxIncurringTransaction = transaction.getEvent().getOriginalTaxIncurringTransaction();
                String description = originalTaxIncurringTransaction != null ? originalTaxIncurringTransaction.getDescription() : null;
                if (description == null) {
                    return getString(C39006R.string.history_rhy_tax_withholding);
                }
                return getString(C39006R.string.history_rhy_tax_withholding_with_original, description);
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
                return getString(C39006R.string.history_rhy_adjustment);
            case 34:
            case 35:
            case 36:
                return getString(C39006R.string.history_rhy_cash_balance_transfer);
            case 37:
                return getString(C39006R.string.history_rhy_fee);
            case 38:
                return getString(C39006R.string.history_rhy_wire);
            default:
                throw new IllegalStateException(("Unknown transaction type: " + transaction.getEvent().getTransactionType() + " for RHY transaction").toString());
        }
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems, reason: merged with bridge method [inline-methods] */
    public List<TransactionLineItem> mo25632getLineItems(RhyHistoryTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        throw new UnsupportedOperationException("RHY transactions have their own history detail page");
    }
}
