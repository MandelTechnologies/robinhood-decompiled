package com.robinhood.android.equityscreener.table.data;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ColumnClasses.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/table/data/IndexColumn;", "Lcom/robinhood/android/equityscreener/table/data/LocalColumn;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getCell", "Lcom/robinhood/android/equityscreener/table/data/ScreenerCell;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "instrumentId", "getHeaderCell", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityscreener.table.data.IndexColumn, reason: use source file name */
/* loaded from: classes3.dex */
public final class ColumnClasses2 extends ColumnClasses3 {
    public static final int $stable = 0;
    private final String id;

    @Override // com.robinhood.android.equityscreener.table.data.ColumnClasses3
    public String getId() {
        return this.id;
    }

    public ColumnClasses2(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
    }

    @Override // com.robinhood.android.equityscreener.table.data.ColumnClasses3
    public CellClasses getCell(int index, String instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return new CellClasses3(index);
    }

    @Override // com.robinhood.android.equityscreener.table.data.ColumnClasses3
    public CellClasses getHeaderCell() {
        return new CellClasses2(ServerToBentoAssetMapper2.EDIT_SURFACE_24);
    }
}
