package com.robinhood.android.futures.trade.extensions;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* compiled from: LazyListStates.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010\u0007\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\u0002¨\u0006\t"}, m3636d2 = {"centerAtIndex", "", "Landroidx/compose/foundation/lazy/LazyListState;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "animate", "", "(Landroidx/compose/foundation/lazy/LazyListState;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCenterIndex", "feature-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.trade.extensions.LazyListStatesKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class LazyListStates {
    public static final Object centerAtIndex(LazyListState lazyListState, int i, boolean z, Continuation<? super Unit> continuation) {
        int i2 = -MathKt.roundToInt((((int) (lazyListState.getLayoutInfo().mo5206getViewportSizeYbymL2g() & 4294967295L)) / 2.0f) - ((((LazyListItemInfo) CollectionsKt.firstOrNull((List) lazyListState.getLayoutInfo().getVisibleItemsInfo())) != null ? r0.getSize() : 0) / 2.0f));
        if (i2 == 0) {
            return Unit.INSTANCE;
        }
        if (z) {
            Object objAnimateScrollToItem = lazyListState.animateScrollToItem(i, i2, continuation);
            return objAnimateScrollToItem == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateScrollToItem : Unit.INSTANCE;
        }
        Object objScrollToItem = lazyListState.scrollToItem(i, i2, continuation);
        return objScrollToItem == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScrollToItem : Unit.INSTANCE;
    }

    public static final int getCenterIndex(LazyListState lazyListState) {
        LazyListItemInfo lazyListItemInfo;
        Intrinsics.checkNotNullParameter(lazyListState, "<this>");
        List<LazyListItemInfo> visibleItemsInfo = lazyListState.getLayoutInfo().getVisibleItemsInfo();
        LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) CollectionsKt.firstOrNull((List) visibleItemsInfo);
        if (lazyListItemInfo2 == null || (lazyListItemInfo = (LazyListItemInfo) CollectionsKt.lastOrNull((List) visibleItemsInfo)) == null) {
            return 0;
        }
        return lazyListItemInfo2.getIndex() + ((lazyListItemInfo.getIndex() - lazyListItemInfo2.getIndex()) / 2);
    }
}
