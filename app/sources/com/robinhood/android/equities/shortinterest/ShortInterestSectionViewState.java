package com.robinhood.android.equities.shortinterest;

import com.robinhood.android.trading.contracts.EquitiesSubzeroSiChart;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import microgram.contracts.equity_short_interest.proto.p488v1.StreamShortInterestSectionResponseDto;

/* compiled from: ShortInterestSectionViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equities/shortinterest/ShortInterestSectionViewState;", "", "Disabled", "Ready", "Lcom/robinhood/android/equities/shortinterest/ShortInterestSectionViewState$Disabled;", "Lcom/robinhood/android/equities/shortinterest/ShortInterestSectionViewState$Ready;", "lib-short-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface ShortInterestSectionViewState {

    /* compiled from: ShortInterestSectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equities/shortinterest/ShortInterestSectionViewState$Disabled;", "Lcom/robinhood/android/equities/shortinterest/ShortInterestSectionViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-short-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Disabled implements ShortInterestSectionViewState {
        public static final int $stable = 0;
        public static final Disabled INSTANCE = new Disabled();

        public boolean equals(Object other) {
            return this == other || (other instanceof Disabled);
        }

        public int hashCode() {
            return -470540676;
        }

        public String toString() {
            return "Disabled";
        }

        private Disabled() {
        }
    }

    /* compiled from: ShortInterestSectionViewState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/equities/shortinterest/ShortInterestSectionViewState$Ready;", "Lcom/robinhood/android/equities/shortinterest/ShortInterestSectionViewState;", "instrumentId", "Ljava/util/UUID;", "section", "Lmicrogram/contracts/equity_short_interest/proto/v1/StreamShortInterestSectionResponseDto;", "variant", "Lcom/robinhood/android/trading/contracts/EquitiesSubzeroSiChart$Variant;", "<init>", "(Ljava/util/UUID;Lmicrogram/contracts/equity_short_interest/proto/v1/StreamShortInterestSectionResponseDto;Lcom/robinhood/android/trading/contracts/EquitiesSubzeroSiChart$Variant;)V", "getInstrumentId", "()Ljava/util/UUID;", "getSection", "()Lmicrogram/contracts/equity_short_interest/proto/v1/StreamShortInterestSectionResponseDto;", "getVariant", "()Lcom/robinhood/android/trading/contracts/EquitiesSubzeroSiChart$Variant;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-short-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ready implements ShortInterestSectionViewState {
        public static final int $stable = 8;
        private final UUID instrumentId;
        private final StreamShortInterestSectionResponseDto section;
        private final EquitiesSubzeroSiChart.Variant variant;

        public static /* synthetic */ Ready copy$default(Ready ready, UUID uuid, StreamShortInterestSectionResponseDto streamShortInterestSectionResponseDto, EquitiesSubzeroSiChart.Variant variant, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = ready.instrumentId;
            }
            if ((i & 2) != 0) {
                streamShortInterestSectionResponseDto = ready.section;
            }
            if ((i & 4) != 0) {
                variant = ready.variant;
            }
            return ready.copy(uuid, streamShortInterestSectionResponseDto, variant);
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

        public final Ready copy(UUID instrumentId, StreamShortInterestSectionResponseDto section, EquitiesSubzeroSiChart.Variant variant) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(section, "section");
            Intrinsics.checkNotNullParameter(variant, "variant");
            return new Ready(instrumentId, section, variant);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) other;
            return Intrinsics.areEqual(this.instrumentId, ready.instrumentId) && Intrinsics.areEqual(this.section, ready.section) && this.variant == ready.variant;
        }

        public int hashCode() {
            return (((this.instrumentId.hashCode() * 31) + this.section.hashCode()) * 31) + this.variant.hashCode();
        }

        public String toString() {
            return "Ready(instrumentId=" + this.instrumentId + ", section=" + this.section + ", variant=" + this.variant + ")";
        }

        public Ready(UUID instrumentId, StreamShortInterestSectionResponseDto section, EquitiesSubzeroSiChart.Variant variant) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(section, "section");
            Intrinsics.checkNotNullParameter(variant, "variant");
            this.instrumentId = instrumentId;
            this.section = section;
            this.variant = variant;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final StreamShortInterestSectionResponseDto getSection() {
            return this.section;
        }

        public final EquitiesSubzeroSiChart.Variant getVariant() {
            return this.variant;
        }
    }
}
