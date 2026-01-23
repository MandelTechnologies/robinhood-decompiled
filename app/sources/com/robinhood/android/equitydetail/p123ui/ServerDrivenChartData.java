package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.android.educationtour.EducationTourElementIds;
import com.robinhood.android.educationtour.interfaces.EducationTourViewData;
import com.robinhood.models.api.bonfire.ApiStockDetail;
import com.robinhood.models.p320db.Instrument;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J!\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/ServerDrivenChartData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "Lcom/robinhood/android/educationtour/interfaces/EducationTourViewData;", "accountNumber", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/db/Instrument;)V", "getAccountNumber", "()Ljava/lang/String;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "elementIds", "", "getElementIds", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServerDrivenChartData extends DetailData implements EducationTourViewData {
    public static final int $stable = 8;
    private final String accountNumber;
    private final List<String> elementIds;
    private final Instrument instrument;
    private final ApiStockDetail.Section section;

    public static /* synthetic */ ServerDrivenChartData copy$default(ServerDrivenChartData serverDrivenChartData, String str, Instrument instrument, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serverDrivenChartData.accountNumber;
        }
        if ((i & 2) != 0) {
            instrument = serverDrivenChartData.instrument;
        }
        return serverDrivenChartData.copy(str, instrument);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final ServerDrivenChartData copy(String accountNumber, Instrument instrument) {
        return new ServerDrivenChartData(accountNumber, instrument);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerDrivenChartData)) {
            return false;
        }
        ServerDrivenChartData serverDrivenChartData = (ServerDrivenChartData) other;
        return Intrinsics.areEqual(this.accountNumber, serverDrivenChartData.accountNumber) && Intrinsics.areEqual(this.instrument, serverDrivenChartData.instrument);
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Instrument instrument = this.instrument;
        return iHashCode + (instrument != null ? instrument.hashCode() : 0);
    }

    public String toString() {
        return "ServerDrivenChartData(accountNumber=" + this.accountNumber + ", instrument=" + this.instrument + ")";
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public ServerDrivenChartData(String str, Instrument instrument) {
        super(null);
        this.accountNumber = str;
        this.instrument = instrument;
        this.section = ApiStockDetail.Section.CHART;
        this.elementIds = CollectionsKt.mutableListOf(EducationTourElementIds.MARKET_PRICE_ELEMENT_ID, EducationTourElementIds.PRICE_CHART_PRICE_CHANGE_ELEMENT_ID, EducationTourElementIds.PRICE_CHART_GRAPH_ELEMENT_ID, EducationTourElementIds.PRICE_CHART_ONE_DAY_ELEMENT_ID, EducationTourElementIds.PRICE_CHART_ONE_WEEK_ELEMENT_ID, EducationTourElementIds.PRICE_CHART_ONE_MONTH_ELEMENT_ID, EducationTourElementIds.PRICE_CHART_THREE_MONTHS_ELEMENT_ID, EducationTourElementIds.PRICE_CHART_YEAR_TO_DATE, EducationTourElementIds.PRICE_CHART_ONE_YEAR_ELEMENT_ID, EducationTourElementIds.PRICE_CHART_FIVE_YEARS_ELEMENT_ID, EducationTourElementIds.PRICE_CHART_ALL_ELEMENT_ID, EducationTourElementIds.PRICE_CHART_MODE_ELEMENT_ID, EducationTourElementIds.PRICE_CHART_SETTINGS_ELEMENT_ID);
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
