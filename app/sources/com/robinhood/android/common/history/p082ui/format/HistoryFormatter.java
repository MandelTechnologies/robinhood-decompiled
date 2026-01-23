package com.robinhood.android.common.history.p082ui.format;

import com.robinhood.shared.models.history.MinervaTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryTransactionFormatter.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/format/HistoryFormatter;", "", "formatter", "Lcom/robinhood/android/common/history/ui/format/HistoryTransactionFormatter;", "Lcom/robinhood/shared/models/history/MinervaTransaction;", "<init>", "(Lcom/robinhood/android/common/history/ui/format/HistoryTransactionFormatter;)V", "getFormatter", "()Lcom/robinhood/android/common/history/ui/format/HistoryTransactionFormatter;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HistoryFormatter {
    public static final int $stable = 8;
    private final HistoryTransactionFormatter<MinervaTransaction> formatter;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HistoryFormatter copy$default(HistoryFormatter historyFormatter, HistoryTransactionFormatter historyTransactionFormatter, int i, Object obj) {
        if ((i & 1) != 0) {
            historyTransactionFormatter = historyFormatter.formatter;
        }
        return historyFormatter.copy(historyTransactionFormatter);
    }

    public final HistoryTransactionFormatter<MinervaTransaction> component1() {
        return this.formatter;
    }

    public final HistoryFormatter copy(HistoryTransactionFormatter<? super MinervaTransaction> formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new HistoryFormatter(formatter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HistoryFormatter) && Intrinsics.areEqual(this.formatter, ((HistoryFormatter) other).formatter);
    }

    public int hashCode() {
        return this.formatter.hashCode();
    }

    public String toString() {
        return "HistoryFormatter(formatter=" + this.formatter + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HistoryFormatter(HistoryTransactionFormatter<? super MinervaTransaction> formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        this.formatter = formatter;
    }

    public final HistoryTransactionFormatter<MinervaTransaction> getFormatter() {
        return this.formatter;
    }
}
