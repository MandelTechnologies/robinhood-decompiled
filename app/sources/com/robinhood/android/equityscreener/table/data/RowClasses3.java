package com.robinhood.android.equityscreener.table.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RowClasses.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/table/data/ScreenerHeaderRow;", "Lcom/robinhood/android/equityscreener/table/data/ScreenerInstrumentRow;", "instrumentId", "", "cells", "", "Lcom/robinhood/android/equityscreener/table/data/ScreenerCell;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityscreener.table.data.ScreenerHeaderRow, reason: use source file name */
/* loaded from: classes3.dex */
public final class RowClasses3 extends RowClasses4 {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowClasses3(String instrumentId, List<? extends CellClasses> cells) {
        super(instrumentId, cells);
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(cells, "cells");
    }
}
