package com.robinhood.shared.history.formatters.legacy;

import com.robinhood.android.common.history.p082ui.format.AggregatedHistoryTransactionFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryFormattersLegacyModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/HistoryFormattersLegacyModule;", "", "<init>", "()V", "provideAggregatedHistoryTransactionFormatter", "Lcom/robinhood/android/common/history/ui/format/AggregatedHistoryTransactionFormatter;", "minervaTransactionFormatters", "Lcom/robinhood/shared/history/formatters/legacy/MinervaTransactionFormatters;", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class HistoryFormattersLegacyModule {
    public static final HistoryFormattersLegacyModule INSTANCE = new HistoryFormattersLegacyModule();

    public final AggregatedHistoryTransactionFormatter provideAggregatedHistoryTransactionFormatter(MinervaTransactionFormatters minervaTransactionFormatters) {
        Intrinsics.checkNotNullParameter(minervaTransactionFormatters, "minervaTransactionFormatters");
        return minervaTransactionFormatters;
    }

    private HistoryFormattersLegacyModule() {
    }
}
