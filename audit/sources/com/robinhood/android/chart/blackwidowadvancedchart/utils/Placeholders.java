package com.robinhood.android.chart.blackwidowadvancedchart.utils;

import black_widow.contracts.mobile_app_chart.proto.p024v1.IntervalDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TimeSpanDto;
import com.robinhood.android.charts.span.UnifiedSpan;
import kotlin.Metadata;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: Placeholders.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u001d\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0005¨\u0006\t"}, m3636d2 = {"PLACEHOLDER_SPANS", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/charts/span/UnifiedSpan;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TimeSpanDto;", "getPLACEHOLDER_SPANS", "()Lkotlinx/collections/immutable/PersistentList;", "PLACEHOLDER_INTERVALS", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IntervalDto;", "getPLACEHOLDER_INTERVALS", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.utils.PlaceholdersKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class Placeholders {
    private static final ImmutableList3<UnifiedSpan<TimeSpanDto>> PLACEHOLDER_SPANS = extensions2.persistentListOf(new UnifiedSpan(new TimeSpanDto("XD", 0.0f, null, 6, null), "XD", false, false, null, null, 60, null), new UnifiedSpan(new TimeSpanDto("XW", 0.0f, null, 6, null), "XW", false, false, null, null, 60, null), new UnifiedSpan(new TimeSpanDto("XM", 0.0f, null, 6, null), "XM", false, false, null, null, 60, null), new UnifiedSpan(new TimeSpanDto("XXX", 0.0f, null, 6, null), "XXX", false, false, null, null, 60, null), new UnifiedSpan(new TimeSpanDto("XY", 0.0f, null, 6, null), "XY", false, false, null, null, 60, null));
    private static final ImmutableList3<IntervalDto> PLACEHOLDER_INTERVALS = extensions2.persistentListOf(new IntervalDto("XXX s", 0.0f, null, 6, null), new IntervalDto("X min", 0.0f, null, 6, null), new IntervalDto("XX min", 0.0f, null, 6, null), new IntervalDto("X h", 0.0f, null, 6, null), new IntervalDto("X w", 0.0f, null, 6, null));

    public static final ImmutableList3<UnifiedSpan<TimeSpanDto>> getPLACEHOLDER_SPANS() {
        return PLACEHOLDER_SPANS;
    }

    public static final ImmutableList3<IntervalDto> getPLACEHOLDER_INTERVALS() {
        return PLACEHOLDER_INTERVALS;
    }
}
