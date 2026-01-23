package com.robinhood.android.equityscreener.table.data;

import com.robinhood.equityscreener.models.p294db.ScreenerTableRow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CellClasses.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/table/data/ScreenerTableItemCell;", "Lcom/robinhood/android/equityscreener/table/data/ScreenerCell;", "screenerTableItem", "Lcom/robinhood/equityscreener/models/db/ScreenerTableRow$ScreenerTableItem;", "<init>", "(Lcom/robinhood/equityscreener/models/db/ScreenerTableRow$ScreenerTableItem;)V", "getScreenerTableItem", "()Lcom/robinhood/equityscreener/models/db/ScreenerTableRow$ScreenerTableItem;", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityscreener.table.data.ScreenerTableItemCell, reason: use source file name */
/* loaded from: classes3.dex */
public class CellClasses5 implements CellClasses {
    public static final int $stable = 8;
    private final ScreenerTableRow.ScreenerTableItem screenerTableItem;

    public CellClasses5(ScreenerTableRow.ScreenerTableItem screenerTableItem) {
        Intrinsics.checkNotNullParameter(screenerTableItem, "screenerTableItem");
        this.screenerTableItem = screenerTableItem;
    }

    public final ScreenerTableRow.ScreenerTableItem getScreenerTableItem() {
        return this.screenerTableItem;
    }
}
