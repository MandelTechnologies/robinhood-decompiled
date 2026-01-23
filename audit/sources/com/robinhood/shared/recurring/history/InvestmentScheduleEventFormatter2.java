package com.robinhood.shared.recurring.history;

import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.recurring.models.InvestmentScheduleEventState;
import com.robinhood.transfers.api.TransferState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentScheduleEventFormatter.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"transactionSummarySecondaryState", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$SecondarySummaryState;", "Lcom/robinhood/recurring/models/InvestmentScheduleEventState;", "getTransactionSummarySecondaryState", "(Lcom/robinhood/recurring/models/InvestmentScheduleEventState;)Lcom/robinhood/android/common/history/ui/format/TransactionSummary$SecondarySummaryState;", "Lcom/robinhood/transfers/api/TransferState;", "(Lcom/robinhood/transfers/api/TransferState;)Lcom/robinhood/android/common/history/ui/format/TransactionSummary$SecondarySummaryState;", "lib-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.recurring.history.InvestmentScheduleEventFormatterKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class InvestmentScheduleEventFormatter2 {

    /* compiled from: InvestmentScheduleEventFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.recurring.history.InvestmentScheduleEventFormatterKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InvestmentScheduleEventState.values().length];
            try {
                iArr[InvestmentScheduleEventState.CANCELLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InvestmentScheduleEventState.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InvestmentScheduleEventState.SKIPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InvestmentScheduleEventState.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InvestmentScheduleEventState.NEW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InvestmentScheduleEventState.PENDING_PRIMARY_TRADE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InvestmentScheduleEventState.PENDING_BACKUP_TRADE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[InvestmentScheduleEventState.COMPLETED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TransferState.values().length];
            try {
                iArr2[TransferState.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[TransferState.NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[TransferState.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final TransactionSummary.SecondarySummaryState getTransactionSummarySecondaryState(InvestmentScheduleEventState investmentScheduleEventState) {
        Intrinsics.checkNotNullParameter(investmentScheduleEventState, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[investmentScheduleEventState.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return TransactionSummary.SecondarySummaryState.ERROR;
            case 5:
            case 6:
            case 7:
                return TransactionSummary.SecondarySummaryState.PENDING;
            case 8:
                return TransactionSummary.SecondarySummaryState.COMPLETED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final TransactionSummary.SecondarySummaryState getTransactionSummarySecondaryState(TransferState transferState) {
        Intrinsics.checkNotNullParameter(transferState, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[transferState.ordinal()];
        if (i == 1 || i == 2) {
            return TransactionSummary.SecondarySummaryState.PENDING;
        }
        if (i == 3) {
            return TransactionSummary.SecondarySummaryState.COMPLETED;
        }
        return TransactionSummary.SecondarySummaryState.ERROR;
    }
}
