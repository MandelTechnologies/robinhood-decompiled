package com.robinhood.android.equitydetail.p123ui.position;

import com.robinhood.android.portfolio.pnl.UnrealizedProfitAndLossData;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PositionSectionDataState.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010.\u001a\u00020\u000fHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u00101\u001a\u00020\u000fHÆ\u0003J{\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000fHÆ\u0001J\u0013\u00103\u001a\u00020\u000f2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0013\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/position/PositionSectionDataState;", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "accountNumber", "", "unifiedAccountV2", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "position", "Lcom/robinhood/models/db/Position;", "quote", "Lcom/robinhood/models/db/Quote;", "instrumentId", "Ljava/util/UUID;", "profitAndLossRetirementExperimentEnabled", "", "showAverageCostRetirementTooltip", "unrealizedProfitAndLossData", "Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossData;", "subzeroExperimentEnabled", "<init>", "(Lcom/robinhood/models/db/Instrument;Ljava/lang/String;Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;Lcom/robinhood/models/db/Position;Lcom/robinhood/models/db/Quote;Ljava/util/UUID;ZZLcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossData;Z)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getAccountNumber", "()Ljava/lang/String;", "getUnifiedAccountV2", "()Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "getPosition", "()Lcom/robinhood/models/db/Position;", "getQuote", "()Lcom/robinhood/models/db/Quote;", "getInstrumentId", "()Ljava/util/UUID;", "getProfitAndLossRetirementExperimentEnabled", "()Z", "getShowAverageCostRetirementTooltip", "getUnrealizedProfitAndLossData", "()Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossData;", "getSubzeroExperimentEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PositionSectionDataState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final Instrument instrument;
    private final UUID instrumentId;
    private final Position position;
    private final boolean profitAndLossRetirementExperimentEnabled;
    private final Quote quote;
    private final boolean showAverageCostRetirementTooltip;
    private final boolean subzeroExperimentEnabled;
    private final UnifiedAccountV2 unifiedAccountV2;
    private final UnrealizedProfitAndLossData unrealizedProfitAndLossData;

    public PositionSectionDataState() {
        this(null, null, null, null, null, null, false, false, null, false, 1023, null);
    }

    public static /* synthetic */ PositionSectionDataState copy$default(PositionSectionDataState positionSectionDataState, Instrument instrument, String str, UnifiedAccountV2 unifiedAccountV2, Position position, Quote quote, UUID uuid, boolean z, boolean z2, UnrealizedProfitAndLossData unrealizedProfitAndLossData, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            instrument = positionSectionDataState.instrument;
        }
        if ((i & 2) != 0) {
            str = positionSectionDataState.accountNumber;
        }
        if ((i & 4) != 0) {
            unifiedAccountV2 = positionSectionDataState.unifiedAccountV2;
        }
        if ((i & 8) != 0) {
            position = positionSectionDataState.position;
        }
        if ((i & 16) != 0) {
            quote = positionSectionDataState.quote;
        }
        if ((i & 32) != 0) {
            uuid = positionSectionDataState.instrumentId;
        }
        if ((i & 64) != 0) {
            z = positionSectionDataState.profitAndLossRetirementExperimentEnabled;
        }
        if ((i & 128) != 0) {
            z2 = positionSectionDataState.showAverageCostRetirementTooltip;
        }
        if ((i & 256) != 0) {
            unrealizedProfitAndLossData = positionSectionDataState.unrealizedProfitAndLossData;
        }
        if ((i & 512) != 0) {
            z3 = positionSectionDataState.subzeroExperimentEnabled;
        }
        UnrealizedProfitAndLossData unrealizedProfitAndLossData2 = unrealizedProfitAndLossData;
        boolean z4 = z3;
        boolean z5 = z;
        boolean z6 = z2;
        Quote quote2 = quote;
        UUID uuid2 = uuid;
        return positionSectionDataState.copy(instrument, str, unifiedAccountV2, position, quote2, uuid2, z5, z6, unrealizedProfitAndLossData2, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getSubzeroExperimentEnabled() {
        return this.subzeroExperimentEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final UnifiedAccountV2 getUnifiedAccountV2() {
        return this.unifiedAccountV2;
    }

    /* renamed from: component4, reason: from getter */
    public final Position getPosition() {
        return this.position;
    }

    /* renamed from: component5, reason: from getter */
    public final Quote getQuote() {
        return this.quote;
    }

    /* renamed from: component6, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getProfitAndLossRetirementExperimentEnabled() {
        return this.profitAndLossRetirementExperimentEnabled;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowAverageCostRetirementTooltip() {
        return this.showAverageCostRetirementTooltip;
    }

    /* renamed from: component9, reason: from getter */
    public final UnrealizedProfitAndLossData getUnrealizedProfitAndLossData() {
        return this.unrealizedProfitAndLossData;
    }

    public final PositionSectionDataState copy(Instrument instrument, String accountNumber, UnifiedAccountV2 unifiedAccountV2, Position position, Quote quote, UUID instrumentId, boolean profitAndLossRetirementExperimentEnabled, boolean showAverageCostRetirementTooltip, UnrealizedProfitAndLossData unrealizedProfitAndLossData, boolean subzeroExperimentEnabled) {
        return new PositionSectionDataState(instrument, accountNumber, unifiedAccountV2, position, quote, instrumentId, profitAndLossRetirementExperimentEnabled, showAverageCostRetirementTooltip, unrealizedProfitAndLossData, subzeroExperimentEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositionSectionDataState)) {
            return false;
        }
        PositionSectionDataState positionSectionDataState = (PositionSectionDataState) other;
        return Intrinsics.areEqual(this.instrument, positionSectionDataState.instrument) && Intrinsics.areEqual(this.accountNumber, positionSectionDataState.accountNumber) && Intrinsics.areEqual(this.unifiedAccountV2, positionSectionDataState.unifiedAccountV2) && Intrinsics.areEqual(this.position, positionSectionDataState.position) && Intrinsics.areEqual(this.quote, positionSectionDataState.quote) && Intrinsics.areEqual(this.instrumentId, positionSectionDataState.instrumentId) && this.profitAndLossRetirementExperimentEnabled == positionSectionDataState.profitAndLossRetirementExperimentEnabled && this.showAverageCostRetirementTooltip == positionSectionDataState.showAverageCostRetirementTooltip && Intrinsics.areEqual(this.unrealizedProfitAndLossData, positionSectionDataState.unrealizedProfitAndLossData) && this.subzeroExperimentEnabled == positionSectionDataState.subzeroExperimentEnabled;
    }

    public int hashCode() {
        Instrument instrument = this.instrument;
        int iHashCode = (instrument == null ? 0 : instrument.hashCode()) * 31;
        String str = this.accountNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccountV2;
        int iHashCode3 = (iHashCode2 + (unifiedAccountV2 == null ? 0 : unifiedAccountV2.hashCode())) * 31;
        Position position = this.position;
        int iHashCode4 = (iHashCode3 + (position == null ? 0 : position.hashCode())) * 31;
        Quote quote = this.quote;
        int iHashCode5 = (iHashCode4 + (quote == null ? 0 : quote.hashCode())) * 31;
        UUID uuid = this.instrumentId;
        int iHashCode6 = (((((iHashCode5 + (uuid == null ? 0 : uuid.hashCode())) * 31) + Boolean.hashCode(this.profitAndLossRetirementExperimentEnabled)) * 31) + Boolean.hashCode(this.showAverageCostRetirementTooltip)) * 31;
        UnrealizedProfitAndLossData unrealizedProfitAndLossData = this.unrealizedProfitAndLossData;
        return ((iHashCode6 + (unrealizedProfitAndLossData != null ? unrealizedProfitAndLossData.hashCode() : 0)) * 31) + Boolean.hashCode(this.subzeroExperimentEnabled);
    }

    public String toString() {
        return "PositionSectionDataState(instrument=" + this.instrument + ", accountNumber=" + this.accountNumber + ", unifiedAccountV2=" + this.unifiedAccountV2 + ", position=" + this.position + ", quote=" + this.quote + ", instrumentId=" + this.instrumentId + ", profitAndLossRetirementExperimentEnabled=" + this.profitAndLossRetirementExperimentEnabled + ", showAverageCostRetirementTooltip=" + this.showAverageCostRetirementTooltip + ", unrealizedProfitAndLossData=" + this.unrealizedProfitAndLossData + ", subzeroExperimentEnabled=" + this.subzeroExperimentEnabled + ")";
    }

    public PositionSectionDataState(Instrument instrument, String str, UnifiedAccountV2 unifiedAccountV2, Position position, Quote quote, UUID uuid, boolean z, boolean z2, UnrealizedProfitAndLossData unrealizedProfitAndLossData, boolean z3) {
        this.instrument = instrument;
        this.accountNumber = str;
        this.unifiedAccountV2 = unifiedAccountV2;
        this.position = position;
        this.quote = quote;
        this.instrumentId = uuid;
        this.profitAndLossRetirementExperimentEnabled = z;
        this.showAverageCostRetirementTooltip = z2;
        this.unrealizedProfitAndLossData = unrealizedProfitAndLossData;
        this.subzeroExperimentEnabled = z3;
    }

    public /* synthetic */ PositionSectionDataState(Instrument instrument, String str, UnifiedAccountV2 unifiedAccountV2, Position position, Quote quote, UUID uuid, boolean z, boolean z2, UnrealizedProfitAndLossData unrealizedProfitAndLossData, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : instrument, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : unifiedAccountV2, (i & 8) != 0 ? null : position, (i & 16) != 0 ? null : quote, (i & 32) != 0 ? null : uuid, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? null : unrealizedProfitAndLossData, (i & 512) != 0 ? false : z3);
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final UnifiedAccountV2 getUnifiedAccountV2() {
        return this.unifiedAccountV2;
    }

    public final Position getPosition() {
        return this.position;
    }

    public final Quote getQuote() {
        return this.quote;
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final boolean getProfitAndLossRetirementExperimentEnabled() {
        return this.profitAndLossRetirementExperimentEnabled;
    }

    public final boolean getShowAverageCostRetirementTooltip() {
        return this.showAverageCostRetirementTooltip;
    }

    public final UnrealizedProfitAndLossData getUnrealizedProfitAndLossData() {
        return this.unrealizedProfitAndLossData;
    }

    public final boolean getSubzeroExperimentEnabled() {
        return this.subzeroExperimentEnabled;
    }
}
