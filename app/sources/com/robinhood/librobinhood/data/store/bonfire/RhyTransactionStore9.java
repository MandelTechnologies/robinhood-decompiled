package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyTransactionStore.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"gringottsTransactionTypes", "Ljava/util/EnumSet;", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "getGringottsTransactionTypes", "()Ljava/util/EnumSet;", "lib-store-rhy_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.RhyTransactionStoreKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class RhyTransactionStore9 {
    private static final EnumSet<HistoryTransactionType> gringottsTransactionTypes;

    public static final EnumSet<HistoryTransactionType> getGringottsTransactionTypes() {
        return gringottsTransactionTypes;
    }

    static {
        EnumSet<HistoryTransactionType> enumSetOf = EnumSet.of(HistoryTransactionType.TAX_WITHHOLDING_FEDERAL, HistoryTransactionType.TAX_WITHHOLDING_STATE_CALIFORNIA, HistoryTransactionType.TAX_WITHHOLDING_STATE_MAINE, HistoryTransactionType.TAX_WITHHOLDING_STATE_VERMONT, HistoryTransactionType.TAX_WITHHOLDING_NRA, HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_FEDERAL, HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_STATE_CALIFORNIA, HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_STATE_MAINE, HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_STATE_VERMONT, HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_NRA, HistoryTransactionType.TAX_WITHHOLDING_MANUAL_ADJUSTMENT, HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_MANUAL_ADJUSTMENT, HistoryTransactionType.ADJUSTMENT_CREDIT, HistoryTransactionType.ADJUSTMENT_DEBIT, HistoryTransactionType.AUTOPOST_ADR_FEE_CREDIT, HistoryTransactionType.AUTOPOST_GOLD_FEE_CREDIT, HistoryTransactionType.AUTOPOST_MARGIN_INTEREST_CREDIT, HistoryTransactionType.AUTOPOST_NEGATIVE_EQUITY_REPAYMENT_DEBIT, HistoryTransactionType.AUTOPOST_NEGATIVE_EQUITY_WRITEOFF, HistoryTransactionType.AUTOPOST_REFERRAL_CREDIT, HistoryTransactionType.AUTOPOST_REVERSED_ACH_CREDIT, HistoryTransactionType.AUTOPOST_WRITEOFF, HistoryTransactionType.AUTOPOST_CX_GOODWILL_CREDIT, HistoryTransactionType.AUTOPOST_ACAT_FEE_CREDIT, HistoryTransactionType.AUTOPOST_OTHER, HistoryTransactionType.AUTOPOST_INCOMING_ACAT_FEE_REIMBURSEMENT, HistoryTransactionType.AUTOPOST_SETTLEMENT_AGREEMENT_TAXABLE, HistoryTransactionType.AUTOPOST_SETTLEMENT_AGREEMENT_NON_TAXABLE, HistoryTransactionType.AUTOPOST_OTHER_TAXABLE, HistoryTransactionType.AUTOPOST_OTHER_NON_TAXABLE, HistoryTransactionType.AUTOPOST_CASH_BACK_OFFERS_CREDIT, HistoryTransactionType.AUTOPOST_MERCHANT_OFFERS_CREDIT, HistoryTransactionType.AUTOPOST_P2P_REFERRAL_CREDIT, HistoryTransactionType.CASH_BALANCE_TRANSFER, HistoryTransactionType.CASH_BALANCE_TRANSFER_TAXABLE, HistoryTransactionType.CASH_BALANCE_TRANSFER_NON_TAXABLE, HistoryTransactionType.FEE, HistoryTransactionType.WIRE);
        Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
        gringottsTransactionTypes = enumSetOf;
    }
}
