package com.robinhood.android.chart.blackwidowadvancedchart;

import black_widow.contracts.mobile_app_chart.proto.p024v1.SetChartInstrumentDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnLoadAction.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/SetInstrument;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/OnLoadAction;", "instrument", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;)V", "getInstrument", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SetInstrument implements OnLoadAction {
    public static final int $stable = 8;
    private final SetChartInstrumentDto.InstrumentDto instrument;

    public static /* synthetic */ SetInstrument copy$default(SetInstrument setInstrument, SetChartInstrumentDto.InstrumentDto instrumentDto, int i, Object obj) {
        if ((i & 1) != 0) {
            instrumentDto = setInstrument.instrument;
        }
        return setInstrument.copy(instrumentDto);
    }

    /* renamed from: component1, reason: from getter */
    public final SetChartInstrumentDto.InstrumentDto getInstrument() {
        return this.instrument;
    }

    public final SetInstrument copy(SetChartInstrumentDto.InstrumentDto instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        return new SetInstrument(instrument);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SetInstrument) && Intrinsics.areEqual(this.instrument, ((SetInstrument) other).instrument);
    }

    public int hashCode() {
        return this.instrument.hashCode();
    }

    public String toString() {
        return "SetInstrument(instrument=" + this.instrument + ")";
    }

    public SetInstrument(SetChartInstrumentDto.InstrumentDto instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.instrument = instrument;
    }

    public final SetChartInstrumentDto.InstrumentDto getInstrument() {
        return this.instrument;
    }
}
