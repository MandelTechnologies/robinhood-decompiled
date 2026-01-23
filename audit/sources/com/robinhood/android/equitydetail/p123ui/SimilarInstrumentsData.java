package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.HeaderData;
import com.robinhood.models.api.bonfire.ApiStockDetail;
import com.robinhood.models.p320db.Instrument;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/SimilarInstrumentsData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "instrument", "Lcom/robinhood/models/db/Instrument;", "similarInstrumentIds", "", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/models/db/Instrument;Ljava/util/List;)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getSimilarInstrumentIds", "()Ljava/util/List;", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "headerData", "Lcom/robinhood/android/equitydetail/ui/HeaderData$FromResource;", "getHeaderData", "()Lcom/robinhood/android/equitydetail/ui/HeaderData$FromResource;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SimilarInstrumentsData extends DetailData {
    public static final int $stable = 8;
    private final HeaderData.FromResource headerData;
    private final Instrument instrument;
    private final ApiStockDetail.Section section;
    private final List<UUID> similarInstrumentIds;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SimilarInstrumentsData copy$default(SimilarInstrumentsData similarInstrumentsData, Instrument instrument, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            instrument = similarInstrumentsData.instrument;
        }
        if ((i & 2) != 0) {
            list = similarInstrumentsData.similarInstrumentIds;
        }
        return similarInstrumentsData.copy(instrument, list);
    }

    /* renamed from: component1, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final List<UUID> component2() {
        return this.similarInstrumentIds;
    }

    public final SimilarInstrumentsData copy(Instrument instrument, List<UUID> similarInstrumentIds) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(similarInstrumentIds, "similarInstrumentIds");
        return new SimilarInstrumentsData(instrument, similarInstrumentIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimilarInstrumentsData)) {
            return false;
        }
        SimilarInstrumentsData similarInstrumentsData = (SimilarInstrumentsData) other;
        return Intrinsics.areEqual(this.instrument, similarInstrumentsData.instrument) && Intrinsics.areEqual(this.similarInstrumentIds, similarInstrumentsData.similarInstrumentIds);
    }

    public int hashCode() {
        return (this.instrument.hashCode() * 31) + this.similarInstrumentIds.hashCode();
    }

    public String toString() {
        return "SimilarInstrumentsData(instrument=" + this.instrument + ", similarInstrumentIds=" + this.similarInstrumentIds + ")";
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final List<UUID> getSimilarInstrumentIds() {
        return this.similarInstrumentIds;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimilarInstrumentsData(Instrument instrument, List<UUID> similarInstrumentIds) {
        super(null);
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(similarInstrumentIds, "similarInstrumentIds");
        this.instrument = instrument;
        this.similarInstrumentIds = similarInstrumentIds;
        this.section = ApiStockDetail.Section.PEOPLE_ALSO_OWNED;
        this.headerData = new HeaderData.FromResource(C15314R.string.instrument_detail_similar_instruments, getSection(), null, 4, null);
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public ApiStockDetail.Section getSection() {
        return this.section;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public HeaderData.FromResource getHeaderData() {
        return this.headerData;
    }
}
