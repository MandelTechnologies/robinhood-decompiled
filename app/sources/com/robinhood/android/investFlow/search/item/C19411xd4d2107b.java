package com.robinhood.android.investFlow.search.item;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSpan2;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: LazyStaggeredGridDsl.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m3636d2 = {"T", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "invoke", "(I)Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
/* renamed from: com.robinhood.android.investFlow.search.item.DiscoveryChipsKt$InvestFlowChipGrid$lambda$2$lambda$1$$inlined$items$default$3 */
/* loaded from: classes10.dex */
final class C19411xd4d2107b extends Lambda implements Function1<Integer, LazyStaggeredGridSpan2> {
    final /* synthetic */ List $items;
    final /* synthetic */ Function1 $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19411xd4d2107b(Function1 function1, List list) {
        super(1);
        this.$span = function1;
        this.$items = list;
    }

    public final LazyStaggeredGridSpan2 invoke(int i) {
        return (LazyStaggeredGridSpan2) this.$span.invoke(this.$items.get(i));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ LazyStaggeredGridSpan2 invoke(Integer num) {
        return invoke(num.intValue());
    }
}
