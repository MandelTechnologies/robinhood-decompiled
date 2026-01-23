package com.robinhood.android.equities.shortinterest;

import com.robinhood.android.trading.contracts.EquitiesSubzeroSiChart;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.contracts.equity_short_interest.proto.p488v1.StreamShortInterestSectionResponseDto;

/* compiled from: ShortInterestSectionDataState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/equities/shortinterest/ShortInterestSectionDataState;", "", "instrumentId", "Ljava/util/UUID;", "section", "Lmicrogram/contracts/equity_short_interest/proto/v1/StreamShortInterestSectionResponseDto;", "variant", "Lcom/robinhood/android/trading/contracts/EquitiesSubzeroSiChart$Variant;", "<init>", "(Ljava/util/UUID;Lmicrogram/contracts/equity_short_interest/proto/v1/StreamShortInterestSectionResponseDto;Lcom/robinhood/android/trading/contracts/EquitiesSubzeroSiChart$Variant;)V", "getInstrumentId", "()Ljava/util/UUID;", "getSection", "()Lmicrogram/contracts/equity_short_interest/proto/v1/StreamShortInterestSectionResponseDto;", "getVariant", "()Lcom/robinhood/android/trading/contracts/EquitiesSubzeroSiChart$Variant;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-short-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShortInterestSectionDataState {
    public static final int $stable = 8;
    private final UUID instrumentId;
    private final StreamShortInterestSectionResponseDto section;
    private final EquitiesSubzeroSiChart.Variant variant;

    public ShortInterestSectionDataState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ShortInterestSectionDataState copy$default(ShortInterestSectionDataState shortInterestSectionDataState, UUID uuid, StreamShortInterestSectionResponseDto streamShortInterestSectionResponseDto, EquitiesSubzeroSiChart.Variant variant, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = shortInterestSectionDataState.instrumentId;
        }
        if ((i & 2) != 0) {
            streamShortInterestSectionResponseDto = shortInterestSectionDataState.section;
        }
        if ((i & 4) != 0) {
            variant = shortInterestSectionDataState.variant;
        }
        return shortInterestSectionDataState.copy(uuid, streamShortInterestSectionResponseDto, variant);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final StreamShortInterestSectionResponseDto getSection() {
        return this.section;
    }

    /* renamed from: component3, reason: from getter */
    public final EquitiesSubzeroSiChart.Variant getVariant() {
        return this.variant;
    }

    public final ShortInterestSectionDataState copy(UUID instrumentId, StreamShortInterestSectionResponseDto section, EquitiesSubzeroSiChart.Variant variant) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        return new ShortInterestSectionDataState(instrumentId, section, variant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShortInterestSectionDataState)) {
            return false;
        }
        ShortInterestSectionDataState shortInterestSectionDataState = (ShortInterestSectionDataState) other;
        return Intrinsics.areEqual(this.instrumentId, shortInterestSectionDataState.instrumentId) && Intrinsics.areEqual(this.section, shortInterestSectionDataState.section) && this.variant == shortInterestSectionDataState.variant;
    }

    public int hashCode() {
        UUID uuid = this.instrumentId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        StreamShortInterestSectionResponseDto streamShortInterestSectionResponseDto = this.section;
        return ((iHashCode + (streamShortInterestSectionResponseDto != null ? streamShortInterestSectionResponseDto.hashCode() : 0)) * 31) + this.variant.hashCode();
    }

    public String toString() {
        return "ShortInterestSectionDataState(instrumentId=" + this.instrumentId + ", section=" + this.section + ", variant=" + this.variant + ")";
    }

    public ShortInterestSectionDataState(UUID uuid, StreamShortInterestSectionResponseDto streamShortInterestSectionResponseDto, EquitiesSubzeroSiChart.Variant variant) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.instrumentId = uuid;
        this.section = streamShortInterestSectionResponseDto;
        this.variant = variant;
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final StreamShortInterestSectionResponseDto getSection() {
        return this.section;
    }

    public /* synthetic */ ShortInterestSectionDataState(UUID uuid, StreamShortInterestSectionResponseDto streamShortInterestSectionResponseDto, EquitiesSubzeroSiChart.Variant variant, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : streamShortInterestSectionResponseDto, (i & 4) != 0 ? EquitiesSubzeroSiChart.Variant.CONTROL : variant);
    }

    public final EquitiesSubzeroSiChart.Variant getVariant() {
        return this.variant;
    }
}
