package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentAdvancedChartStore.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003JU\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001J\u0013\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018¨\u0006("}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAdvancedChartRequest;", "", "instrumentId", "Ljava/util/UUID;", "displaySpan", "", "interval", "technicalIndicators", "", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "hideExtendedHours", "", "showCandlesticks", "showGridlines", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZ)V", "getInstrumentId", "()Ljava/util/UUID;", "getDisplaySpan", "()Ljava/lang/String;", "getInterval", "getTechnicalIndicators", "()Ljava/util/List;", "getHideExtendedHours", "()Z", "getShowCandlesticks", "getShowGridlines", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class InstrumentAdvancedChartRequest {
    private final String displaySpan;
    private final boolean hideExtendedHours;
    private final UUID instrumentId;
    private final String interval;
    private final boolean showCandlesticks;
    private final boolean showGridlines;
    private final List<ApiTechnicalIndicator> technicalIndicators;

    public static /* synthetic */ InstrumentAdvancedChartRequest copy$default(InstrumentAdvancedChartRequest instrumentAdvancedChartRequest, UUID uuid, String str, String str2, List list, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = instrumentAdvancedChartRequest.instrumentId;
        }
        if ((i & 2) != 0) {
            str = instrumentAdvancedChartRequest.displaySpan;
        }
        if ((i & 4) != 0) {
            str2 = instrumentAdvancedChartRequest.interval;
        }
        if ((i & 8) != 0) {
            list = instrumentAdvancedChartRequest.technicalIndicators;
        }
        if ((i & 16) != 0) {
            z = instrumentAdvancedChartRequest.hideExtendedHours;
        }
        if ((i & 32) != 0) {
            z2 = instrumentAdvancedChartRequest.showCandlesticks;
        }
        if ((i & 64) != 0) {
            z3 = instrumentAdvancedChartRequest.showGridlines;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        boolean z6 = z;
        String str3 = str2;
        return instrumentAdvancedChartRequest.copy(uuid, str, str3, list, z6, z4, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisplaySpan() {
        return this.displaySpan;
    }

    /* renamed from: component3, reason: from getter */
    public final String getInterval() {
        return this.interval;
    }

    public final List<ApiTechnicalIndicator> component4() {
        return this.technicalIndicators;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHideExtendedHours() {
        return this.hideExtendedHours;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowCandlesticks() {
        return this.showCandlesticks;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowGridlines() {
        return this.showGridlines;
    }

    public final InstrumentAdvancedChartRequest copy(UUID instrumentId, String displaySpan, String interval, List<? extends ApiTechnicalIndicator> technicalIndicators, boolean hideExtendedHours, boolean showCandlesticks, boolean showGridlines) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(displaySpan, "displaySpan");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(technicalIndicators, "technicalIndicators");
        return new InstrumentAdvancedChartRequest(instrumentId, displaySpan, interval, technicalIndicators, hideExtendedHours, showCandlesticks, showGridlines);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstrumentAdvancedChartRequest)) {
            return false;
        }
        InstrumentAdvancedChartRequest instrumentAdvancedChartRequest = (InstrumentAdvancedChartRequest) other;
        return Intrinsics.areEqual(this.instrumentId, instrumentAdvancedChartRequest.instrumentId) && Intrinsics.areEqual(this.displaySpan, instrumentAdvancedChartRequest.displaySpan) && Intrinsics.areEqual(this.interval, instrumentAdvancedChartRequest.interval) && Intrinsics.areEqual(this.technicalIndicators, instrumentAdvancedChartRequest.technicalIndicators) && this.hideExtendedHours == instrumentAdvancedChartRequest.hideExtendedHours && this.showCandlesticks == instrumentAdvancedChartRequest.showCandlesticks && this.showGridlines == instrumentAdvancedChartRequest.showGridlines;
    }

    public int hashCode() {
        return (((((((((((this.instrumentId.hashCode() * 31) + this.displaySpan.hashCode()) * 31) + this.interval.hashCode()) * 31) + this.technicalIndicators.hashCode()) * 31) + Boolean.hashCode(this.hideExtendedHours)) * 31) + Boolean.hashCode(this.showCandlesticks)) * 31) + Boolean.hashCode(this.showGridlines);
    }

    public String toString() {
        return "InstrumentAdvancedChartRequest(instrumentId=" + this.instrumentId + ", displaySpan=" + this.displaySpan + ", interval=" + this.interval + ", technicalIndicators=" + this.technicalIndicators + ", hideExtendedHours=" + this.hideExtendedHours + ", showCandlesticks=" + this.showCandlesticks + ", showGridlines=" + this.showGridlines + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InstrumentAdvancedChartRequest(UUID instrumentId, String displaySpan, String interval, List<? extends ApiTechnicalIndicator> technicalIndicators, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(displaySpan, "displaySpan");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(technicalIndicators, "technicalIndicators");
        this.instrumentId = instrumentId;
        this.displaySpan = displaySpan;
        this.interval = interval;
        this.technicalIndicators = technicalIndicators;
        this.hideExtendedHours = z;
        this.showCandlesticks = z2;
        this.showGridlines = z3;
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final String getDisplaySpan() {
        return this.displaySpan;
    }

    public final String getInterval() {
        return this.interval;
    }

    public final List<ApiTechnicalIndicator> getTechnicalIndicators() {
        return this.technicalIndicators;
    }

    public final boolean getHideExtendedHours() {
        return this.hideExtendedHours;
    }

    public final boolean getShowCandlesticks() {
        return this.showCandlesticks;
    }

    public final boolean getShowGridlines() {
        return this.showGridlines;
    }
}
