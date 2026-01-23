package com.robinhood.android.onedaycharts;

import com.robinhood.models.onedaycharts.api.InstrumentType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OneDayMiniChartDetails.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/onedaycharts/OneDayMiniChartDetails;", "", "metadataId", "Ljava/util/UUID;", "instrumentType", "Lcom/robinhood/models/onedaycharts/api/InstrumentType;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/onedaycharts/api/InstrumentType;)V", "getMetadataId", "()Ljava/util/UUID;", "getInstrumentType", "()Lcom/robinhood/models/onedaycharts/api/InstrumentType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-one-day-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OneDayMiniChartDetails {
    public static final int $stable = 8;
    private final InstrumentType instrumentType;
    private final UUID metadataId;

    public static /* synthetic */ OneDayMiniChartDetails copy$default(OneDayMiniChartDetails oneDayMiniChartDetails, UUID uuid, InstrumentType instrumentType, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = oneDayMiniChartDetails.metadataId;
        }
        if ((i & 2) != 0) {
            instrumentType = oneDayMiniChartDetails.instrumentType;
        }
        return oneDayMiniChartDetails.copy(uuid, instrumentType);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getMetadataId() {
        return this.metadataId;
    }

    /* renamed from: component2, reason: from getter */
    public final InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public final OneDayMiniChartDetails copy(UUID metadataId, InstrumentType instrumentType) {
        Intrinsics.checkNotNullParameter(metadataId, "metadataId");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        return new OneDayMiniChartDetails(metadataId, instrumentType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneDayMiniChartDetails)) {
            return false;
        }
        OneDayMiniChartDetails oneDayMiniChartDetails = (OneDayMiniChartDetails) other;
        return Intrinsics.areEqual(this.metadataId, oneDayMiniChartDetails.metadataId) && this.instrumentType == oneDayMiniChartDetails.instrumentType;
    }

    public int hashCode() {
        return (this.metadataId.hashCode() * 31) + this.instrumentType.hashCode();
    }

    public String toString() {
        return "OneDayMiniChartDetails(metadataId=" + this.metadataId + ", instrumentType=" + this.instrumentType + ")";
    }

    public OneDayMiniChartDetails(UUID metadataId, InstrumentType instrumentType) {
        Intrinsics.checkNotNullParameter(metadataId, "metadataId");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        this.metadataId = metadataId;
        this.instrumentType = instrumentType;
    }

    public final UUID getMetadataId() {
        return this.metadataId;
    }

    public final InstrumentType getInstrumentType() {
        return this.instrumentType;
    }
}
