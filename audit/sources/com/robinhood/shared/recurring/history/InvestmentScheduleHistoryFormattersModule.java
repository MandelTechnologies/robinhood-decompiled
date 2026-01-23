package com.robinhood.shared.recurring.history;

import com.robinhood.android.common.history.p082ui.format.HistoryFormatter;
import com.robinhood.android.common.history.p082ui.format.HistoryFormatterKey;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentScheduleHistoryFormattersModule.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000bH\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000bH\u0007J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000bH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/recurring/history/InvestmentScheduleHistoryFormattersModule;", "", "<init>", "()V", "provideInvestmentScheduleFormatter", "Lcom/robinhood/android/common/history/ui/format/HistoryFormatter;", "formatter", "Lcom/robinhood/shared/recurring/history/InvestmentScheduleFormatter;", "provideInvestmentScheduleWithAccountTypeFormatter", "Lcom/robinhood/shared/recurring/history/InvestmentScheduleWithAccountTypeFormatter;", "provideInvestmentScheduleEventWithAchFormatter", "Lcom/robinhood/shared/recurring/history/InvestmentScheduleEventFormatter;", "provideInvestmentScheduleEventWithBuyingPowerFormatter", "provideCryptoInvestmentScheduleWithBuyingPowerFormatter", "provideCryptoInvestmentScheduleWithAchFormatter", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class InvestmentScheduleHistoryFormattersModule {
    public static final InvestmentScheduleHistoryFormattersModule INSTANCE = new InvestmentScheduleHistoryFormattersModule();

    private InvestmentScheduleHistoryFormattersModule() {
    }

    @HistoryFormatterKey(HistoryTransactionType.INVESTMENT_SCHEDULE)
    public final HistoryFormatter provideInvestmentScheduleFormatter(InvestmentScheduleFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }

    @HistoryFormatterKey(HistoryTransactionType.INVESTMENT_SCHEDULE_WITH_ACCOUNT_TYPE)
    public final HistoryFormatter provideInvestmentScheduleWithAccountTypeFormatter(InvestmentScheduleWithAccountTypeFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }

    @HistoryFormatterKey(HistoryTransactionType.INVESTMENT_SCHEDULE_EVENT_WITH_ACH)
    public final HistoryFormatter provideInvestmentScheduleEventWithAchFormatter(InvestmentScheduleEventFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }

    @HistoryFormatterKey(HistoryTransactionType.INVESTMENT_SCHEDULE_EVENT_WITH_BUYING_POWER)
    public final HistoryFormatter provideInvestmentScheduleEventWithBuyingPowerFormatter(InvestmentScheduleEventFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }

    @HistoryFormatterKey(HistoryTransactionType.CRYPTO_INVESTMENT_SCHEDULE_WITH_BUYING_POWER)
    public final HistoryFormatter provideCryptoInvestmentScheduleWithBuyingPowerFormatter(InvestmentScheduleEventFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }

    @HistoryFormatterKey(HistoryTransactionType.CRYPTO_INVESTMENT_SCHEDULE_WITH_ACH)
    public final HistoryFormatter provideCryptoInvestmentScheduleWithAchFormatter(InvestmentScheduleEventFormatter formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }
}
