package com.robinhood.android.chart.blackwidowadvancedchart.duxo;

import black_widow.contracts.mobile_app_chart.proto.p024v1.HapticStyleDto;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvanceChartEvent.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/HapticEvent;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartEvent;", ResourceTypes.STYLE, "Lblack_widow/contracts/mobile_app_chart/proto/v1/HapticStyleDto;", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/HapticStyleDto;)V", "getStyle", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/HapticStyleDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HapticEvent implements AdvanceChartEvent {
    public static final int $stable = 0;
    private final HapticStyleDto style;

    public static /* synthetic */ HapticEvent copy$default(HapticEvent hapticEvent, HapticStyleDto hapticStyleDto, int i, Object obj) {
        if ((i & 1) != 0) {
            hapticStyleDto = hapticEvent.style;
        }
        return hapticEvent.copy(hapticStyleDto);
    }

    /* renamed from: component1, reason: from getter */
    public final HapticStyleDto getStyle() {
        return this.style;
    }

    public final HapticEvent copy(HapticStyleDto style) {
        Intrinsics.checkNotNullParameter(style, "style");
        return new HapticEvent(style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HapticEvent) && this.style == ((HapticEvent) other).style;
    }

    public int hashCode() {
        return this.style.hashCode();
    }

    public String toString() {
        return "HapticEvent(style=" + this.style + ")";
    }

    public HapticEvent(HapticStyleDto style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.style = style;
    }

    public final HapticStyleDto getStyle() {
        return this.style;
    }
}
