package com.robinhood.advisory.history;

import com.robinhood.android.common.history.p082ui.format.HistoryFormatter;
import com.robinhood.android.common.history.p082ui.format.HistoryFormatterKey;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryHistoryFormattersModule.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tH\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/advisory/history/AdvisoryHistoryFormattersModule;", "", "<init>", "()V", "provideAdvisorTradeHistoryFormatter", "Lcom/robinhood/android/common/history/ui/format/HistoryFormatter;", "formater", "Lcom/robinhood/advisory/history/AdvisorTradeFormatter;", "provideAdvisoryFeeHistoryFormatter", "Lcom/robinhood/advisory/history/AdvisoryFeeFormatter;", "lib-advisory-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AdvisoryHistoryFormattersModule {
    public static final AdvisoryHistoryFormattersModule INSTANCE = new AdvisoryHistoryFormattersModule();

    private AdvisoryHistoryFormattersModule() {
    }

    @HistoryFormatterKey(HistoryTransactionType.ADVISOR_TRADE)
    public final HistoryFormatter provideAdvisorTradeHistoryFormatter(AdvisorTradeFormatter formater) {
        Intrinsics.checkNotNullParameter(formater, "formater");
        return new HistoryFormatter(formater);
    }

    @HistoryFormatterKey(HistoryTransactionType.ADVISORY_FEE)
    public final HistoryFormatter provideAdvisoryFeeHistoryFormatter(AdvisoryFeeFormatter formater) {
        Intrinsics.checkNotNullParameter(formater, "formater");
        return new HistoryFormatter(formater);
    }
}
