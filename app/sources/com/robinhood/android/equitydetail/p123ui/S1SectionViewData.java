package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.models.api.bonfire.ApiStockDetail;
import com.robinhood.models.p320db.bonfire.StockDetailS1Section;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/S1SectionViewData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "instrumentId", "Ljava/util/UUID;", "s1Section", "Lcom/robinhood/models/db/bonfire/StockDetailS1Section;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/db/bonfire/StockDetailS1Section;)V", "getInstrumentId", "()Ljava/util/UUID;", "getS1Section", "()Lcom/robinhood/models/db/bonfire/StockDetailS1Section;", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class S1SectionViewData extends DetailData {
    public static final int $stable = 8;
    private final UUID instrumentId;
    private final StockDetailS1Section s1Section;
    private final ApiStockDetail.Section section;

    public static /* synthetic */ S1SectionViewData copy$default(S1SectionViewData s1SectionViewData, UUID uuid, StockDetailS1Section stockDetailS1Section, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = s1SectionViewData.instrumentId;
        }
        if ((i & 2) != 0) {
            stockDetailS1Section = s1SectionViewData.s1Section;
        }
        return s1SectionViewData.copy(uuid, stockDetailS1Section);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final StockDetailS1Section getS1Section() {
        return this.s1Section;
    }

    public final S1SectionViewData copy(UUID instrumentId, StockDetailS1Section s1Section) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(s1Section, "s1Section");
        return new S1SectionViewData(instrumentId, s1Section);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof S1SectionViewData)) {
            return false;
        }
        S1SectionViewData s1SectionViewData = (S1SectionViewData) other;
        return Intrinsics.areEqual(this.instrumentId, s1SectionViewData.instrumentId) && Intrinsics.areEqual(this.s1Section, s1SectionViewData.s1Section);
    }

    public int hashCode() {
        return (this.instrumentId.hashCode() * 31) + this.s1Section.hashCode();
    }

    public String toString() {
        return "S1SectionViewData(instrumentId=" + this.instrumentId + ", s1Section=" + this.s1Section + ")";
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final StockDetailS1Section getS1Section() {
        return this.s1Section;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S1SectionViewData(UUID instrumentId, StockDetailS1Section s1Section) {
        super(null);
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(s1Section, "s1Section");
        this.instrumentId = instrumentId;
        this.s1Section = s1Section;
        this.section = ApiStockDetail.Section.f5493S1;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public ApiStockDetail.Section getSection() {
        return this.section;
    }
}
