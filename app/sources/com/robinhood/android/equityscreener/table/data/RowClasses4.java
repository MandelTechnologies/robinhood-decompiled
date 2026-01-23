package com.robinhood.android.equityscreener.table.data;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RowClasses.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/table/data/ScreenerInstrumentRow;", "Lcom/robinhood/android/equityscreener/table/data/LocalRow;", "instrumentId", "", "cells", "", "Lcom/robinhood/android/equityscreener/table/data/ScreenerCell;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getInstrumentId", "()Ljava/lang/String;", "getCells", "()Ljava/util/List;", "getRowNameCell", "Lcom/robinhood/android/equityscreener/table/data/ScreenerInstrumentNameCell;", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityscreener.table.data.ScreenerInstrumentRow, reason: use source file name */
/* loaded from: classes3.dex */
public class RowClasses4 implements RowClasses2 {
    public static final int $stable = 8;
    private final List<CellClasses> cells;
    private final String instrumentId;

    /* JADX WARN: Multi-variable type inference failed */
    public RowClasses4(String instrumentId, List<? extends CellClasses> cells) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.instrumentId = instrumentId;
        this.cells = cells;
    }

    public final String getInstrumentId() {
        return this.instrumentId;
    }

    public final List<CellClasses> getCells() {
        return this.cells;
    }

    public final CellClasses4 getRowNameCell() {
        Object next;
        Iterator<T> it = this.cells.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((CellClasses) next) instanceof CellClasses4) {
                break;
            }
        }
        if (next instanceof CellClasses4) {
            return (CellClasses4) next;
        }
        return null;
    }
}
