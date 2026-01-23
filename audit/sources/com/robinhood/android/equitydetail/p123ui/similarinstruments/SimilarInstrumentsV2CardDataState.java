package com.robinhood.android.equitydetail.p123ui.similarinstruments;

import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SimilarInstrumentsV2CardDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2CardDataState;", "", "parentInstrumentUuid", "Ljava/util/UUID;", "instrumentUuid", "instrumentName", "", "instrumentSymbol", "instrumentPercentChange", "Ljava/math/BigDecimal;", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getParentInstrumentUuid", "()Ljava/util/UUID;", "getInstrumentUuid", "getInstrumentName", "()Ljava/lang/String;", "getInstrumentSymbol", "getInstrumentPercentChange", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SimilarInstrumentsV2CardDataState {
    public static final int $stable = 8;
    private final String instrumentName;
    private final BigDecimal instrumentPercentChange;
    private final String instrumentSymbol;
    private final UUID instrumentUuid;
    private final UUID parentInstrumentUuid;

    public SimilarInstrumentsV2CardDataState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ SimilarInstrumentsV2CardDataState copy$default(SimilarInstrumentsV2CardDataState similarInstrumentsV2CardDataState, UUID uuid, UUID uuid2, String str, String str2, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = similarInstrumentsV2CardDataState.parentInstrumentUuid;
        }
        if ((i & 2) != 0) {
            uuid2 = similarInstrumentsV2CardDataState.instrumentUuid;
        }
        if ((i & 4) != 0) {
            str = similarInstrumentsV2CardDataState.instrumentName;
        }
        if ((i & 8) != 0) {
            str2 = similarInstrumentsV2CardDataState.instrumentSymbol;
        }
        if ((i & 16) != 0) {
            bigDecimal = similarInstrumentsV2CardDataState.instrumentPercentChange;
        }
        BigDecimal bigDecimal2 = bigDecimal;
        String str3 = str;
        return similarInstrumentsV2CardDataState.copy(uuid, uuid2, str3, str2, bigDecimal2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getParentInstrumentUuid() {
        return this.parentInstrumentUuid;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getInstrumentUuid() {
        return this.instrumentUuid;
    }

    /* renamed from: component3, reason: from getter */
    public final String getInstrumentName() {
        return this.instrumentName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getInstrumentSymbol() {
        return this.instrumentSymbol;
    }

    /* renamed from: component5, reason: from getter */
    public final BigDecimal getInstrumentPercentChange() {
        return this.instrumentPercentChange;
    }

    public final SimilarInstrumentsV2CardDataState copy(UUID parentInstrumentUuid, UUID instrumentUuid, String instrumentName, String instrumentSymbol, BigDecimal instrumentPercentChange) {
        return new SimilarInstrumentsV2CardDataState(parentInstrumentUuid, instrumentUuid, instrumentName, instrumentSymbol, instrumentPercentChange);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimilarInstrumentsV2CardDataState)) {
            return false;
        }
        SimilarInstrumentsV2CardDataState similarInstrumentsV2CardDataState = (SimilarInstrumentsV2CardDataState) other;
        return Intrinsics.areEqual(this.parentInstrumentUuid, similarInstrumentsV2CardDataState.parentInstrumentUuid) && Intrinsics.areEqual(this.instrumentUuid, similarInstrumentsV2CardDataState.instrumentUuid) && Intrinsics.areEqual(this.instrumentName, similarInstrumentsV2CardDataState.instrumentName) && Intrinsics.areEqual(this.instrumentSymbol, similarInstrumentsV2CardDataState.instrumentSymbol) && Intrinsics.areEqual(this.instrumentPercentChange, similarInstrumentsV2CardDataState.instrumentPercentChange);
    }

    public int hashCode() {
        UUID uuid = this.parentInstrumentUuid;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        UUID uuid2 = this.instrumentUuid;
        int iHashCode2 = (iHashCode + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        String str = this.instrumentName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.instrumentSymbol;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.instrumentPercentChange;
        return iHashCode4 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }

    public String toString() {
        return "SimilarInstrumentsV2CardDataState(parentInstrumentUuid=" + this.parentInstrumentUuid + ", instrumentUuid=" + this.instrumentUuid + ", instrumentName=" + this.instrumentName + ", instrumentSymbol=" + this.instrumentSymbol + ", instrumentPercentChange=" + this.instrumentPercentChange + ")";
    }

    public SimilarInstrumentsV2CardDataState(UUID uuid, UUID uuid2, String str, String str2, BigDecimal bigDecimal) {
        this.parentInstrumentUuid = uuid;
        this.instrumentUuid = uuid2;
        this.instrumentName = str;
        this.instrumentSymbol = str2;
        this.instrumentPercentChange = bigDecimal;
    }

    public /* synthetic */ SimilarInstrumentsV2CardDataState(UUID uuid, UUID uuid2, String str, String str2, BigDecimal bigDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : uuid2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : bigDecimal);
    }

    public final UUID getParentInstrumentUuid() {
        return this.parentInstrumentUuid;
    }

    public final UUID getInstrumentUuid() {
        return this.instrumentUuid;
    }

    public final String getInstrumentName() {
        return this.instrumentName;
    }

    public final String getInstrumentSymbol() {
        return this.instrumentSymbol;
    }

    public final BigDecimal getInstrumentPercentChange() {
        return this.instrumentPercentChange;
    }
}
