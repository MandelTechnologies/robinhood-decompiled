package com.robinhood.android.equitydetail.p123ui;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/EquityEventUpdatesViewData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "instrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInstrumentId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EquityEventUpdatesViewData extends DetailData {
    public static final int $stable = 8;
    private final UUID instrumentId;

    public static /* synthetic */ EquityEventUpdatesViewData copy$default(EquityEventUpdatesViewData equityEventUpdatesViewData, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = equityEventUpdatesViewData.instrumentId;
        }
        return equityEventUpdatesViewData.copy(uuid);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final EquityEventUpdatesViewData copy(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return new EquityEventUpdatesViewData(instrumentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EquityEventUpdatesViewData) && Intrinsics.areEqual(this.instrumentId, ((EquityEventUpdatesViewData) other).instrumentId);
    }

    public int hashCode() {
        return this.instrumentId.hashCode();
    }

    public String toString() {
        return "EquityEventUpdatesViewData(instrumentId=" + this.instrumentId + ")";
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityEventUpdatesViewData(UUID instrumentId) {
        super(null);
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        this.instrumentId = instrumentId;
    }
}
