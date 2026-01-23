package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.android.educationtour.EducationTourElementIds;
import com.robinhood.android.educationtour.interfaces.EducationTourViewData;
import com.robinhood.models.api.bonfire.ApiStockDetail;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/EducationTourTickerSymbolData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "Lcom/robinhood/android/educationtour/interfaces/EducationTourViewData;", "tickerSymbol", "", "showTickerSymbol", "", "<init>", "(Ljava/lang/String;Z)V", "getTickerSymbol", "()Ljava/lang/String;", "getShowTickerSymbol", "()Z", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "elementIds", "", "getElementIds", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EducationTourTickerSymbolData extends DetailData implements EducationTourViewData {
    public static final int $stable = 8;
    private final List<String> elementIds;
    private final ApiStockDetail.Section section;
    private final boolean showTickerSymbol;
    private final String tickerSymbol;

    public static /* synthetic */ EducationTourTickerSymbolData copy$default(EducationTourTickerSymbolData educationTourTickerSymbolData, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = educationTourTickerSymbolData.tickerSymbol;
        }
        if ((i & 2) != 0) {
            z = educationTourTickerSymbolData.showTickerSymbol;
        }
        return educationTourTickerSymbolData.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTickerSymbol() {
        return this.tickerSymbol;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowTickerSymbol() {
        return this.showTickerSymbol;
    }

    public final EducationTourTickerSymbolData copy(String tickerSymbol, boolean showTickerSymbol) {
        Intrinsics.checkNotNullParameter(tickerSymbol, "tickerSymbol");
        return new EducationTourTickerSymbolData(tickerSymbol, showTickerSymbol);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EducationTourTickerSymbolData)) {
            return false;
        }
        EducationTourTickerSymbolData educationTourTickerSymbolData = (EducationTourTickerSymbolData) other;
        return Intrinsics.areEqual(this.tickerSymbol, educationTourTickerSymbolData.tickerSymbol) && this.showTickerSymbol == educationTourTickerSymbolData.showTickerSymbol;
    }

    public int hashCode() {
        return (this.tickerSymbol.hashCode() * 31) + Boolean.hashCode(this.showTickerSymbol);
    }

    public String toString() {
        return "EducationTourTickerSymbolData(tickerSymbol=" + this.tickerSymbol + ", showTickerSymbol=" + this.showTickerSymbol + ")";
    }

    public final String getTickerSymbol() {
        return this.tickerSymbol;
    }

    public final boolean getShowTickerSymbol() {
        return this.showTickerSymbol;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationTourTickerSymbolData(String tickerSymbol, boolean z) {
        super(null);
        Intrinsics.checkNotNullParameter(tickerSymbol, "tickerSymbol");
        this.tickerSymbol = tickerSymbol;
        this.showTickerSymbol = z;
        this.section = ApiStockDetail.Section.EDUCATION_TOUR_TICKER_SYMBOL;
        this.elementIds = CollectionsKt.mutableListOf(EducationTourElementIds.TICKER_SYMBOL_ELEMENT_ID);
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public ApiStockDetail.Section getSection() {
        return this.section;
    }

    @Override // com.robinhood.android.educationtour.interfaces.EducationTourViewData
    public List<String> getElementIds() {
        return this.elementIds;
    }
}
