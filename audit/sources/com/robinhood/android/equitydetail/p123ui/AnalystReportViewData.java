package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.models.api.bonfire.ApiStockDetail;
import com.robinhood.models.p320db.AnalystOverview;
import com.robinhood.models.p320db.Instrument;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/AnalystReportViewData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "instrument", "Lcom/robinhood/models/db/Instrument;", "analystOverview", "Lcom/robinhood/models/db/AnalystOverview;", "<init>", "(Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/AnalystOverview;)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getAnalystOverview", "()Lcom/robinhood/models/db/AnalystOverview;", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "headerData", "Lcom/robinhood/android/equitydetail/ui/GoldHeaderData;", "getHeaderData", "()Lcom/robinhood/android/equitydetail/ui/GoldHeaderData;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AnalystReportViewData extends DetailData {
    public static final int $stable = 8;
    private final AnalystOverview analystOverview;
    private final GoldHeaderData headerData;
    private final Instrument instrument;
    private final ApiStockDetail.Section section;

    public static /* synthetic */ AnalystReportViewData copy$default(AnalystReportViewData analystReportViewData, Instrument instrument, AnalystOverview analystOverview, int i, Object obj) {
        if ((i & 1) != 0) {
            instrument = analystReportViewData.instrument;
        }
        if ((i & 2) != 0) {
            analystOverview = analystReportViewData.analystOverview;
        }
        return analystReportViewData.copy(instrument, analystOverview);
    }

    /* renamed from: component1, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component2, reason: from getter */
    public final AnalystOverview getAnalystOverview() {
        return this.analystOverview;
    }

    public final AnalystReportViewData copy(Instrument instrument, AnalystOverview analystOverview) {
        Intrinsics.checkNotNullParameter(analystOverview, "analystOverview");
        return new AnalystReportViewData(instrument, analystOverview);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalystReportViewData)) {
            return false;
        }
        AnalystReportViewData analystReportViewData = (AnalystReportViewData) other;
        return Intrinsics.areEqual(this.instrument, analystReportViewData.instrument) && Intrinsics.areEqual(this.analystOverview, analystReportViewData.analystOverview);
    }

    public int hashCode() {
        Instrument instrument = this.instrument;
        return ((instrument == null ? 0 : instrument.hashCode()) * 31) + this.analystOverview.hashCode();
    }

    public String toString() {
        return "AnalystReportViewData(instrument=" + this.instrument + ", analystOverview=" + this.analystOverview + ")";
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final AnalystOverview getAnalystOverview() {
        return this.analystOverview;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalystReportViewData(Instrument instrument, AnalystOverview analystOverview) {
        super(null);
        Intrinsics.checkNotNullParameter(analystOverview, "analystOverview");
        this.instrument = instrument;
        this.analystOverview = analystOverview;
        this.section = ApiStockDetail.Section.RESEARCH_REPORT;
        this.headerData = new GoldHeaderData(C15314R.string.instrument_detail_analyst_report_label, getSection());
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public ApiStockDetail.Section getSection() {
        return this.section;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public GoldHeaderData getHeaderData() {
        return this.headerData;
    }
}
