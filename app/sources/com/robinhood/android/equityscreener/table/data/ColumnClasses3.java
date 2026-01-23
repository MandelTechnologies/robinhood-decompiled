package com.robinhood.android.equityscreener.table.data;

import com.robinhood.equityscreener.models.api.ColumnAlignment;
import com.robinhood.equityscreener.models.p294db.ScreenerTableColumn;
import com.robinhood.equityscreener.models.p294db.ScreenerTableRow;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ColumnClasses.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H&J\b\u0010\r\u001a\u00020\tH&J\u0018\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/table/data/LocalColumn;", "", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "getCell", "Lcom/robinhood/android/equityscreener/table/data/ScreenerCell;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "instrumentId", "getHeaderCell", "rowData", "Lcom/robinhood/equityscreener/models/db/ScreenerTableRow;", "toScreenerTableColumn", "Lcom/robinhood/equityscreener/models/db/ScreenerTableColumn;", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityscreener.table.data.LocalColumn, reason: use source file name */
/* loaded from: classes3.dex */
public abstract class ColumnClasses3 {
    public static final int $stable = 0;

    public abstract CellClasses getCell(int index, String instrumentId);

    public abstract CellClasses getHeaderCell();

    public abstract String getId();

    public final CellClasses getCell(int index, ScreenerTableRow rowData) {
        Intrinsics.checkNotNullParameter(rowData, "rowData");
        if (index == 0) {
            return getHeaderCell();
        }
        if (StringsKt.isBlank(rowData.getInstrumentId())) {
            return null;
        }
        return getCell(index, rowData.getInstrumentId());
    }

    public final ScreenerTableColumn toScreenerTableColumn() {
        return new ScreenerTableColumn(getId(), ColumnAlignment.CENTER, false, null, null, null);
    }
}
