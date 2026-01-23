package com.robinhood.android.sdui.chartgroup;

import androidx.compose.foundation.lazy.grid.LazyGridSpan;
import androidx.compose.foundation.lazy.grid.LazyGridSpan2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: LazyGridDsl.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m3636d2 = {"T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "", "it", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
/* renamed from: com.robinhood.android.sdui.chartgroup.ChartLegendKt$ProtoLegendRow$lambda$14$lambda$13$lambda$12$$inlined$items$default$3 */
/* loaded from: classes5.dex */
public final class C27871x155c742d extends Lambda implements Function2<LazyGridSpan2, Integer, LazyGridSpan> {
    final /* synthetic */ List $items;
    final /* synthetic */ Function2 $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27871x155c742d(Function2 function2, List list) {
        super(2);
        this.$span = function2;
        this.$items = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ LazyGridSpan invoke(LazyGridSpan2 lazyGridSpan2, Integer num) {
        return LazyGridSpan.m5218boximpl(m18526invoke_orMbw(lazyGridSpan2, num.intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m18526invoke_orMbw(LazyGridSpan2 lazyGridSpan2, int i) {
        return ((LazyGridSpan) this.$span.invoke(lazyGridSpan2, this.$items.get(i))).getPackedValue();
    }
}
