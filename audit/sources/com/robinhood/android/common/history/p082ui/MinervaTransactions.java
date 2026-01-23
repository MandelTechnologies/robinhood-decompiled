package com.robinhood.android.common.history.p082ui;

import com.robinhood.models.util.Money;
import com.robinhood.shared.models.history.CashRewardItemTransaction;
import com.robinhood.shared.models.history.DividendTransaction;
import com.robinhood.shared.models.history.EquityOrderTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.OptionOrderTransaction;
import com.robinhood.shared.models.history.RewardItemTransaction;
import com.robinhood.shared.models.history.StockRewardItemTransaction;
import com.robinhood.shared.models.history.SweepTransaction;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MinervaTransactions.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u0007"}, m3636d2 = {"getBackupWithholdingParams", "Lkotlin/Pair;", "", "", "Ljava/util/UUID;", "Lcom/robinhood/shared/models/history/MinervaTransaction;", "individualAccountNumber", "lib-history-row_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.history.ui.MinervaTransactionsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class MinervaTransactions {
    public static final Tuples2<String, List<UUID>> getBackupWithholdingParams(MinervaTransaction minervaTransaction, String individualAccountNumber) {
        Intrinsics.checkNotNullParameter(minervaTransaction, "<this>");
        Intrinsics.checkNotNullParameter(individualAccountNumber, "individualAccountNumber");
        if (minervaTransaction instanceof DividendTransaction) {
            DividendTransaction dividendTransaction = (DividendTransaction) minervaTransaction;
            return new Tuples2<>(dividendTransaction.getEvent().getDividend().getAccountNumber(), CollectionsKt.listOf(dividendTransaction.getEvent().getDividend().getCashDividendId()));
        }
        if (minervaTransaction instanceof EquityOrderTransaction) {
            EquityOrderTransaction equityOrderTransaction = (EquityOrderTransaction) minervaTransaction;
            return new Tuples2<>(equityOrderTransaction.getEvent().getAccountNumber(), equityOrderTransaction.getEvent().getExecutionIds());
        }
        if (minervaTransaction instanceof OptionOrderTransaction) {
            return new Tuples2<>(individualAccountNumber, ((OptionOrderTransaction) minervaTransaction).getEvent().getExecutionIds());
        }
        if ((minervaTransaction instanceof CashRewardItemTransaction) || (minervaTransaction instanceof StockRewardItemTransaction)) {
            return new Tuples2<>(individualAccountNumber, CollectionsKt.listOf(((RewardItemTransaction) minervaTransaction).getEvent().getId()));
        }
        if (minervaTransaction instanceof SweepTransaction) {
            SweepTransaction sweepTransaction = (SweepTransaction) minervaTransaction;
            if (sweepTransaction.getEvent().getDirection() == Money.Direction.CREDIT) {
                return new Tuples2<>(individualAccountNumber, CollectionsKt.listOf(sweepTransaction.getEvent().getId()));
            }
        }
        return null;
    }
}
