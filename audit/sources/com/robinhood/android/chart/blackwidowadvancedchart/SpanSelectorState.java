package com.robinhood.android.chart.blackwidowadvancedchart;

import black_widow.contracts.mobile_app_chart.proto.p024v1.TimeSpanDto;
import com.robinhood.android.charts.span.UnifiedSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: BlackWidowAdvancedChartViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/SpanSelectorState;", "", "unifiedSpans", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/charts/span/UnifiedSpan;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TimeSpanDto;", "selectedSpan", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lblack_widow/contracts/mobile_app_chart/proto/v1/TimeSpanDto;)V", "getUnifiedSpans", "()Lkotlinx/collections/immutable/ImmutableList;", "getSelectedSpan", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/TimeSpanDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SpanSelectorState {
    public static final int $stable = 8;
    private final TimeSpanDto selectedSpan;
    private final ImmutableList<UnifiedSpan<TimeSpanDto>> unifiedSpans;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpanSelectorState copy$default(SpanSelectorState spanSelectorState, ImmutableList immutableList, TimeSpanDto timeSpanDto, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = spanSelectorState.unifiedSpans;
        }
        if ((i & 2) != 0) {
            timeSpanDto = spanSelectorState.selectedSpan;
        }
        return spanSelectorState.copy(immutableList, timeSpanDto);
    }

    public final ImmutableList<UnifiedSpan<TimeSpanDto>> component1() {
        return this.unifiedSpans;
    }

    /* renamed from: component2, reason: from getter */
    public final TimeSpanDto getSelectedSpan() {
        return this.selectedSpan;
    }

    public final SpanSelectorState copy(ImmutableList<UnifiedSpan<TimeSpanDto>> unifiedSpans, TimeSpanDto selectedSpan) {
        Intrinsics.checkNotNullParameter(unifiedSpans, "unifiedSpans");
        Intrinsics.checkNotNullParameter(selectedSpan, "selectedSpan");
        return new SpanSelectorState(unifiedSpans, selectedSpan);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpanSelectorState)) {
            return false;
        }
        SpanSelectorState spanSelectorState = (SpanSelectorState) other;
        return Intrinsics.areEqual(this.unifiedSpans, spanSelectorState.unifiedSpans) && Intrinsics.areEqual(this.selectedSpan, spanSelectorState.selectedSpan);
    }

    public int hashCode() {
        return (this.unifiedSpans.hashCode() * 31) + this.selectedSpan.hashCode();
    }

    public String toString() {
        return "SpanSelectorState(unifiedSpans=" + this.unifiedSpans + ", selectedSpan=" + this.selectedSpan + ")";
    }

    public SpanSelectorState(ImmutableList<UnifiedSpan<TimeSpanDto>> unifiedSpans, TimeSpanDto selectedSpan) {
        Intrinsics.checkNotNullParameter(unifiedSpans, "unifiedSpans");
        Intrinsics.checkNotNullParameter(selectedSpan, "selectedSpan");
        this.unifiedSpans = unifiedSpans;
        this.selectedSpan = selectedSpan;
    }

    public final ImmutableList<UnifiedSpan<TimeSpanDto>> getUnifiedSpans() {
        return this.unifiedSpans;
    }

    public final TimeSpanDto getSelectedSpan() {
        return this.selectedSpan;
    }
}
