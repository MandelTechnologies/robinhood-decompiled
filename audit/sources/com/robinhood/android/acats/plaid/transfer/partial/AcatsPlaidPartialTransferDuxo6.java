package com.robinhood.android.acats.plaid.transfer.partial;

import com.robinhood.android.futures.charts.DisplaySpans;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AcatsPlaidPartialTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\tj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferSortKey;", "", "<init>", "(Ljava/lang/String;I)V", DisplaySpans.ALL, "CASH", "STOCKS_ETFS", "OPTIONS", "showEquityAssets", "", "showOptionAssets", "showCashAssets", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferSortKey, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsPlaidPartialTransferDuxo6 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AcatsPlaidPartialTransferDuxo6[] $VALUES;
    public static final AcatsPlaidPartialTransferDuxo6 ALL = new AcatsPlaidPartialTransferDuxo6(DisplaySpans.ALL, 0);
    public static final AcatsPlaidPartialTransferDuxo6 CASH = new AcatsPlaidPartialTransferDuxo6("CASH", 1);
    public static final AcatsPlaidPartialTransferDuxo6 STOCKS_ETFS = new AcatsPlaidPartialTransferDuxo6("STOCKS_ETFS", 2);
    public static final AcatsPlaidPartialTransferDuxo6 OPTIONS = new AcatsPlaidPartialTransferDuxo6("OPTIONS", 3);

    private static final /* synthetic */ AcatsPlaidPartialTransferDuxo6[] $values() {
        return new AcatsPlaidPartialTransferDuxo6[]{ALL, CASH, STOCKS_ETFS, OPTIONS};
    }

    public static EnumEntries<AcatsPlaidPartialTransferDuxo6> getEntries() {
        return $ENTRIES;
    }

    private AcatsPlaidPartialTransferDuxo6(String str, int i) {
    }

    static {
        AcatsPlaidPartialTransferDuxo6[] acatsPlaidPartialTransferDuxo6Arr$values = $values();
        $VALUES = acatsPlaidPartialTransferDuxo6Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(acatsPlaidPartialTransferDuxo6Arr$values);
    }

    public final boolean showEquityAssets() {
        return this == ALL || this == STOCKS_ETFS;
    }

    public final boolean showOptionAssets() {
        return this == ALL || this == OPTIONS;
    }

    public final boolean showCashAssets() {
        return this == ALL || this == CASH;
    }

    public static AcatsPlaidPartialTransferDuxo6 valueOf(String str) {
        return (AcatsPlaidPartialTransferDuxo6) Enum.valueOf(AcatsPlaidPartialTransferDuxo6.class, str);
    }

    public static AcatsPlaidPartialTransferDuxo6[] values() {
        return (AcatsPlaidPartialTransferDuxo6[]) $VALUES.clone();
    }
}
