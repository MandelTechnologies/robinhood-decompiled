package com.robinhood.utils.compose.reorderable;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;

/* compiled from: ReorderableLazyColumn.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0091\u0003\u0010\u001f\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u000526\u0010\r\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00050\u00072:\b\u0002\u0010\u000f\u001a4\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00072\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102:\b\u0002\u0010\u0015\u001a4\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000726\u0010\u0016\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00110\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172V\u0010\u001e\u001aR\u0012\u0004\u0012\u00020\u001b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u001dH&¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m3636d2 = {"Lcom/robinhood/utils/compose/reorderable/ReorderableLazyListScope;", "Landroidx/compose/foundation/lazy/LazyListScope;", "T", "", "items", "", "keyPrefix", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "key", "", "contentType", "Lkotlin/Function0;", "", "onDragStart", "startIndex", "targetIndex", "onDragUpdate", "onDragFinish", "", "animateDisplacementOffsets", "animateItemPlacement", "Lkotlin/Function4;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "isDragItem", "Lkotlin/ExtensionFunctionType;", "itemContent", "reorderableItems", "(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZLkotlin/jvm/functions/Function6;)V", "lib-utils-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface ReorderableLazyListScope extends LazyListScope {
    @Override // androidx.compose.foundation.lazy.LazyListScope
    /* bridge */ /* synthetic */ default void item(Object obj, Object obj2, Function3 function3) {
        super.item(obj, obj2, function3);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    @Deprecated
    /* bridge */ /* synthetic */ default void item(Object obj, Function3 function3) {
        super.item(obj, function3);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    /* bridge */ /* synthetic */ default void items(int i, Function1 function1, Function1 function12, Function4 function4) {
        super.items(i, function1, function12, function4);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    @Deprecated
    /* bridge */ /* synthetic */ default void items(int i, Function1 function1, Function4 function4) {
        super.items(i, function1, function4);
    }

    <T> void reorderableItems(List<? extends T> items, String keyPrefix, Function2<? super Integer, ? super T, String> key, Function2<? super Integer, ? super T, ? extends Object> contentType, Function0<Unit> onDragStart, Function2<? super Integer, ? super Integer, Unit> onDragUpdate, Function2<? super Integer, ? super Integer, Unit> onDragFinish, boolean animateDisplacementOffsets, boolean animateItemPlacement, Function6<? super LazyItemScope, ? super T, ? super Integer, ? super Boolean, ? super Composer, ? super Integer, Unit> itemContent);

    @Override // androidx.compose.foundation.lazy.LazyListScope
    @Deprecated
    /* bridge */ /* synthetic */ default void stickyHeader(Object obj, Object obj2, Function3 function3) {
        super.stickyHeader(obj, obj2, function3);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    /* bridge */ /* synthetic */ default void stickyHeader(Object obj, Object obj2, Function4 function4) {
        super.stickyHeader(obj, obj2, (Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit>) function4);
    }

    /* compiled from: ReorderableLazyColumn.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void reorderableItems$default(ReorderableLazyListScope reorderableLazyListScope, List list, String str, Function2 function2, Function2 function22, Function0 function0, Function2 function23, Function2 function24, boolean z, boolean z2, Function6 function6, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reorderableItems");
            }
            reorderableLazyListScope.reorderableItems(list, str, function2, (i & 8) != 0 ? new Function2() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyListScope.reorderableItems.1
                public final Void invoke(int i2, Object obj2) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            } : function22, (i & 16) != 0 ? null : function0, (i & 32) != 0 ? null : function23, function24, (i & 128) != 0 ? true : z, (i & 256) != 0 ? false : z2, function6);
        }
    }
}
