package com.robinhood.android.equitydetail.p123ui.similarinstruments;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SimilarInstrumentsV2CardDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0014JV\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\t\u0010\u0014¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2CardViewState;", "", "parentInstrumentUuid", "Ljava/util/UUID;", "instrumentUuid", "instrumentName", "", "instrumentSymbol", "instrumentPercentChangeText", "isInstrumentPercentChangePositive", "", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getParentInstrumentUuid", "()Ljava/util/UUID;", "getInstrumentUuid", "getInstrumentName", "()Ljava/lang/String;", "getInstrumentSymbol", "getInstrumentPercentChangeText", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2CardViewState;", "equals", "other", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SimilarInstrumentsV2CardViewState {
    public static final int $stable = 8;
    private final String instrumentName;
    private final String instrumentPercentChangeText;
    private final String instrumentSymbol;
    private final UUID instrumentUuid;
    private final Boolean isInstrumentPercentChangePositive;
    private final UUID parentInstrumentUuid;

    public static /* synthetic */ SimilarInstrumentsV2CardViewState copy$default(SimilarInstrumentsV2CardViewState similarInstrumentsV2CardViewState, UUID uuid, UUID uuid2, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = similarInstrumentsV2CardViewState.parentInstrumentUuid;
        }
        if ((i & 2) != 0) {
            uuid2 = similarInstrumentsV2CardViewState.instrumentUuid;
        }
        if ((i & 4) != 0) {
            str = similarInstrumentsV2CardViewState.instrumentName;
        }
        if ((i & 8) != 0) {
            str2 = similarInstrumentsV2CardViewState.instrumentSymbol;
        }
        if ((i & 16) != 0) {
            str3 = similarInstrumentsV2CardViewState.instrumentPercentChangeText;
        }
        if ((i & 32) != 0) {
            bool = similarInstrumentsV2CardViewState.isInstrumentPercentChangePositive;
        }
        String str4 = str3;
        Boolean bool2 = bool;
        return similarInstrumentsV2CardViewState.copy(uuid, uuid2, str, str2, str4, bool2);
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
    public final String getInstrumentPercentChangeText() {
        return this.instrumentPercentChangeText;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsInstrumentPercentChangePositive() {
        return this.isInstrumentPercentChangePositive;
    }

    public final SimilarInstrumentsV2CardViewState copy(UUID parentInstrumentUuid, UUID instrumentUuid, String instrumentName, String instrumentSymbol, String instrumentPercentChangeText, Boolean isInstrumentPercentChangePositive) {
        return new SimilarInstrumentsV2CardViewState(parentInstrumentUuid, instrumentUuid, instrumentName, instrumentSymbol, instrumentPercentChangeText, isInstrumentPercentChangePositive);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimilarInstrumentsV2CardViewState)) {
            return false;
        }
        SimilarInstrumentsV2CardViewState similarInstrumentsV2CardViewState = (SimilarInstrumentsV2CardViewState) other;
        return Intrinsics.areEqual(this.parentInstrumentUuid, similarInstrumentsV2CardViewState.parentInstrumentUuid) && Intrinsics.areEqual(this.instrumentUuid, similarInstrumentsV2CardViewState.instrumentUuid) && Intrinsics.areEqual(this.instrumentName, similarInstrumentsV2CardViewState.instrumentName) && Intrinsics.areEqual(this.instrumentSymbol, similarInstrumentsV2CardViewState.instrumentSymbol) && Intrinsics.areEqual(this.instrumentPercentChangeText, similarInstrumentsV2CardViewState.instrumentPercentChangeText) && Intrinsics.areEqual(this.isInstrumentPercentChangePositive, similarInstrumentsV2CardViewState.isInstrumentPercentChangePositive);
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
        String str3 = this.instrumentPercentChangeText;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isInstrumentPercentChangePositive;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "SimilarInstrumentsV2CardViewState(parentInstrumentUuid=" + this.parentInstrumentUuid + ", instrumentUuid=" + this.instrumentUuid + ", instrumentName=" + this.instrumentName + ", instrumentSymbol=" + this.instrumentSymbol + ", instrumentPercentChangeText=" + this.instrumentPercentChangeText + ", isInstrumentPercentChangePositive=" + this.isInstrumentPercentChangePositive + ")";
    }

    public SimilarInstrumentsV2CardViewState(UUID uuid, UUID uuid2, String str, String str2, String str3, Boolean bool) {
        this.parentInstrumentUuid = uuid;
        this.instrumentUuid = uuid2;
        this.instrumentName = str;
        this.instrumentSymbol = str2;
        this.instrumentPercentChangeText = str3;
        this.isInstrumentPercentChangePositive = bool;
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

    public final String getInstrumentPercentChangeText() {
        return this.instrumentPercentChangeText;
    }

    public final Boolean isInstrumentPercentChangePositive() {
        return this.isInstrumentPercentChangePositive;
    }
}
