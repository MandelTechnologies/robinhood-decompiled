package com.robinhood.android.equitydetail.p123ui.position;

import com.robinhood.android.equitydetail.p123ui.component.SdpDataRow3;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: PositionSectionViewState.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\\\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u000eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/position/PositionSectionViewState;", "", "unifiedAccountV2", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "dataRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowState;", "showAverageCostTooltip", "", "instrumentId", "Ljava/util/UUID;", "instrument", "Lcom/robinhood/models/db/Instrument;", "accountNumber", "", "<init>", "(Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/Boolean;Ljava/util/UUID;Lcom/robinhood/models/db/Instrument;Ljava/lang/String;)V", "getUnifiedAccountV2", "()Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "getDataRows", "()Lkotlinx/collections/immutable/ImmutableList;", "getShowAverageCostTooltip", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getInstrumentId", "()Ljava/util/UUID;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/Boolean;Ljava/util/UUID;Lcom/robinhood/models/db/Instrument;Ljava/lang/String;)Lcom/robinhood/android/equitydetail/ui/position/PositionSectionViewState;", "equals", "other", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PositionSectionViewState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final ImmutableList<SdpDataRow3> dataRows;
    private final Instrument instrument;
    private final UUID instrumentId;
    private final Boolean showAverageCostTooltip;
    private final UnifiedAccountV2 unifiedAccountV2;

    public PositionSectionViewState() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ PositionSectionViewState copy$default(PositionSectionViewState positionSectionViewState, UnifiedAccountV2 unifiedAccountV2, ImmutableList immutableList, Boolean bool, UUID uuid, Instrument instrument, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            unifiedAccountV2 = positionSectionViewState.unifiedAccountV2;
        }
        if ((i & 2) != 0) {
            immutableList = positionSectionViewState.dataRows;
        }
        if ((i & 4) != 0) {
            bool = positionSectionViewState.showAverageCostTooltip;
        }
        if ((i & 8) != 0) {
            uuid = positionSectionViewState.instrumentId;
        }
        if ((i & 16) != 0) {
            instrument = positionSectionViewState.instrument;
        }
        if ((i & 32) != 0) {
            str = positionSectionViewState.accountNumber;
        }
        Instrument instrument2 = instrument;
        String str2 = str;
        return positionSectionViewState.copy(unifiedAccountV2, immutableList, bool, uuid, instrument2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final UnifiedAccountV2 getUnifiedAccountV2() {
        return this.unifiedAccountV2;
    }

    public final ImmutableList<SdpDataRow3> component2() {
        return this.dataRows;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getShowAverageCostTooltip() {
        return this.showAverageCostTooltip;
    }

    /* renamed from: component4, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component5, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final PositionSectionViewState copy(UnifiedAccountV2 unifiedAccountV2, ImmutableList<? extends SdpDataRow3> dataRows, Boolean showAverageCostTooltip, UUID instrumentId, Instrument instrument, String accountNumber) {
        return new PositionSectionViewState(unifiedAccountV2, dataRows, showAverageCostTooltip, instrumentId, instrument, accountNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositionSectionViewState)) {
            return false;
        }
        PositionSectionViewState positionSectionViewState = (PositionSectionViewState) other;
        return Intrinsics.areEqual(this.unifiedAccountV2, positionSectionViewState.unifiedAccountV2) && Intrinsics.areEqual(this.dataRows, positionSectionViewState.dataRows) && Intrinsics.areEqual(this.showAverageCostTooltip, positionSectionViewState.showAverageCostTooltip) && Intrinsics.areEqual(this.instrumentId, positionSectionViewState.instrumentId) && Intrinsics.areEqual(this.instrument, positionSectionViewState.instrument) && Intrinsics.areEqual(this.accountNumber, positionSectionViewState.accountNumber);
    }

    public int hashCode() {
        UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccountV2;
        int iHashCode = (unifiedAccountV2 == null ? 0 : unifiedAccountV2.hashCode()) * 31;
        ImmutableList<SdpDataRow3> immutableList = this.dataRows;
        int iHashCode2 = (iHashCode + (immutableList == null ? 0 : immutableList.hashCode())) * 31;
        Boolean bool = this.showAverageCostTooltip;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        UUID uuid = this.instrumentId;
        int iHashCode4 = (iHashCode3 + (uuid == null ? 0 : uuid.hashCode())) * 31;
        Instrument instrument = this.instrument;
        int iHashCode5 = (iHashCode4 + (instrument == null ? 0 : instrument.hashCode())) * 31;
        String str = this.accountNumber;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "PositionSectionViewState(unifiedAccountV2=" + this.unifiedAccountV2 + ", dataRows=" + this.dataRows + ", showAverageCostTooltip=" + this.showAverageCostTooltip + ", instrumentId=" + this.instrumentId + ", instrument=" + this.instrument + ", accountNumber=" + this.accountNumber + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PositionSectionViewState(UnifiedAccountV2 unifiedAccountV2, ImmutableList<? extends SdpDataRow3> immutableList, Boolean bool, UUID uuid, Instrument instrument, String str) {
        this.unifiedAccountV2 = unifiedAccountV2;
        this.dataRows = immutableList;
        this.showAverageCostTooltip = bool;
        this.instrumentId = uuid;
        this.instrument = instrument;
        this.accountNumber = str;
    }

    public /* synthetic */ PositionSectionViewState(UnifiedAccountV2 unifiedAccountV2, ImmutableList immutableList, Boolean bool, UUID uuid, Instrument instrument, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : unifiedAccountV2, (i & 2) != 0 ? null : immutableList, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : uuid, (i & 16) != 0 ? null : instrument, (i & 32) != 0 ? null : str);
    }

    public final UnifiedAccountV2 getUnifiedAccountV2() {
        return this.unifiedAccountV2;
    }

    public final ImmutableList<SdpDataRow3> getDataRows() {
        return this.dataRows;
    }

    public final Boolean getShowAverageCostTooltip() {
        return this.showAverageCostTooltip;
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }
}
