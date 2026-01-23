package com.robinhood.android.equityscreener.table.data;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPower5;
import com.robinhood.equityscreener.models.p294db.ScreenerTableRow;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.serverdriven.experimental.api.TableColumnHeader;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ColumnClasses.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/table/data/WatchlistColumn;", "Lcom/robinhood/android/equityscreener/table/data/LocalColumn;", "isWatching", "Lkotlin/Function1;", "Ljava/util/UUID;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "()Lkotlin/jvm/functions/Function1;", "id", "", "getId", "()Ljava/lang/String;", "getHeaderCell", "Lcom/robinhood/android/equityscreener/table/data/ScreenerCell;", "getCell", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "instrumentId", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityscreener.table.data.WatchlistColumn, reason: use source file name */
/* loaded from: classes3.dex */
public final class ColumnClasses4 extends ColumnClasses3 {
    public static final int $stable = 0;
    private final String id;
    private final Function1<UUID, Boolean> isWatching;

    public final Function1<UUID, Boolean> isWatching() {
        return this.isWatching;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ColumnClasses4(Function1<? super UUID, Boolean> isWatching) {
        Intrinsics.checkNotNullParameter(isWatching, "isWatching");
        this.isWatching = isWatching;
        this.id = PortfolioBuyingPower5.IntentKeyEntryPoint;
    }

    @Override // com.robinhood.android.equityscreener.table.data.ColumnClasses3
    public String getId() {
        return this.id;
    }

    @Override // com.robinhood.android.equityscreener.table.data.ColumnClasses3
    public CellClasses getHeaderCell() {
        return new CellClasses5(new ScreenerTableRow.ScreenerTableItem(new TableColumnHeader("Watch", null, null, false, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, null)));
    }

    @Override // com.robinhood.android.equityscreener.table.data.ColumnClasses3
    public CellClasses getCell(int index, String instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        UUID uuidFromString = UUID.fromString(instrumentId);
        Intrinsics.checkNotNull(uuidFromString);
        return new CellClasses6(uuidFromString, this.isWatching.invoke(uuidFromString));
    }
}
