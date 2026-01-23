package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.HeaderData;
import com.robinhood.models.api.bonfire.ApiStockDetail;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/SimilarInstrumentsV2Data;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "instrumentUuid", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInstrumentUuid", "()Ljava/util/UUID;", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "headerData", "Lcom/robinhood/android/equitydetail/ui/HeaderData$FromResource;", "getHeaderData", "()Lcom/robinhood/android/equitydetail/ui/HeaderData$FromResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SimilarInstrumentsV2Data extends DetailData {
    public static final int $stable = 8;
    private final HeaderData.FromResource headerData;
    private final UUID instrumentUuid;
    private final ApiStockDetail.Section section;

    public static /* synthetic */ SimilarInstrumentsV2Data copy$default(SimilarInstrumentsV2Data similarInstrumentsV2Data, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = similarInstrumentsV2Data.instrumentUuid;
        }
        return similarInstrumentsV2Data.copy(uuid);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrumentUuid() {
        return this.instrumentUuid;
    }

    public final SimilarInstrumentsV2Data copy(UUID instrumentUuid) {
        Intrinsics.checkNotNullParameter(instrumentUuid, "instrumentUuid");
        return new SimilarInstrumentsV2Data(instrumentUuid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SimilarInstrumentsV2Data) && Intrinsics.areEqual(this.instrumentUuid, ((SimilarInstrumentsV2Data) other).instrumentUuid);
    }

    public int hashCode() {
        return this.instrumentUuid.hashCode();
    }

    public String toString() {
        return "SimilarInstrumentsV2Data(instrumentUuid=" + this.instrumentUuid + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimilarInstrumentsV2Data(UUID instrumentUuid) {
        super(null);
        Intrinsics.checkNotNullParameter(instrumentUuid, "instrumentUuid");
        this.instrumentUuid = instrumentUuid;
        this.section = ApiStockDetail.Section.PEOPLE_ALSO_OWNED;
        this.headerData = new HeaderData.FromResource(C15314R.string.instrument_detail_similar_instruments, getSection(), null, 4, null);
    }

    public final UUID getInstrumentUuid() {
        return this.instrumentUuid;
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
