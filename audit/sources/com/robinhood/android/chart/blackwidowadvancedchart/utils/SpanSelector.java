package com.robinhood.android.chart.blackwidowadvancedchart.utils;

import black_widow.contracts.mobile_app_chart.proto.p024v1.TimeSpanDto;
import com.robinhood.android.charts.span.UnifiedSpan;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SpanSelector.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u001a\u001c\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0004¨\u0006\u0005"}, m3636d2 = {"toUnifiedSpans", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/charts/span/UnifiedSpan;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TimeSpanDto;", "", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.utils.SpanSelectorKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class SpanSelector {
    public static final ImmutableList<UnifiedSpan<TimeSpanDto>> toUnifiedSpans(List<TimeSpanDto> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<TimeSpanDto> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (TimeSpanDto timeSpanDto : list2) {
            arrayList.add(new UnifiedSpan(timeSpanDto, timeSpanDto.getLabel(), false, false, null, null, 32, null));
        }
        return extensions2.toImmutableList(arrayList);
    }
}
