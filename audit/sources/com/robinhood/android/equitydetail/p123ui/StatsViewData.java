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
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/StatsViewData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "Lcom/robinhood/android/educationtour/interfaces/EducationTourViewData;", "instrument", "Lcom/robinhood/models/db/Instrument;", "<init>", "(Lcom/robinhood/models/db/Instrument;)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "elementIds", "", "", "getElementIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StatsViewData extends DetailData implements EducationTourViewData {
    public static final int $stable = 8;
    private final List<String> elementIds;
    private final Instrument instrument;
    private final ApiStockDetail.Section section;

    public static /* synthetic */ StatsViewData copy$default(StatsViewData statsViewData, Instrument instrument, int i, Object obj) {
        if ((i & 1) != 0) {
            instrument = statsViewData.instrument;
        }
        return statsViewData.copy(instrument);
    }

    /* renamed from: component1, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final StatsViewData copy(Instrument instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        return new StatsViewData(instrument);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StatsViewData) && Intrinsics.areEqual(this.instrument, ((StatsViewData) other).instrument);
    }

    public int hashCode() {
        return this.instrument.hashCode();
    }

    public String toString() {
        return "StatsViewData(instrument=" + this.instrument + ")";
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsViewData(Instrument instrument) {
        super(null);
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.instrument = instrument;
        this.section = ApiStockDetail.Section.STATS;
        this.elementIds = CollectionsKt.mutableListOf(EducationTourElementIds.STATS_OPEN_ELEMENT_ID, EducationTourElementIds.STATS_HIGH_ELEMENT_ID, EducationTourElementIds.STATS_LOW_ELEMENT_ID, EducationTourElementIds.STATS_52_WEEK_HIGH_ELEMENT_ID, EducationTourElementIds.STATS_52_WEEK_LOW_ELEMENT_ID, EducationTourElementIds.STATS_VOLUME_ELEMENT_ID, EducationTourElementIds.STATS_OVERNIGHT_VOLUME_ELEMENT_ID, EducationTourElementIds.STATS_AVERAGE_VOLUME_ELEMENT_ID, EducationTourElementIds.STATS_MARKET_CAP_ELEMENT_ID, EducationTourElementIds.STATS_PRICE_EARNINGS_RATIO_ELEMENT_ID, EducationTourElementIds.STATS_DIVIDEND_YIELD_ELEMENT_ID, EducationTourElementIds.STATS_AUM_ELEMENT_ID, EducationTourElementIds.STATS_30_DAY_YIELD_ELEMENT_ID, EducationTourElementIds.STATS_EXPENSE_RATIO_ELEMENT_ID);
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
