package com.robinhood.utils.compose.reorderable;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeV2;
import com.robinhood.utils.compose.reorderable.ReorderableSectionData;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* compiled from: ReorderableLazyColumn.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JÐ\u0001\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00072<\u0010\b\u001a8\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00070\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u001228\b\u0002\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00150\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0015H&¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/utils/compose/reorderable/ReorderableLazyListScopeV2;", "Lcom/robinhood/utils/compose/reorderable/ReorderableLazyListScope;", "reorderableSectionItems", "", "T", "S", "headerItems", "", "sectionItems", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "headerIndex", "headerItem", "headerItemData", "Lcom/robinhood/utils/compose/reorderable/ReorderableSectionData$HeaderCallData;", "sectionItemData", "Lcom/robinhood/utils/compose/reorderable/ReorderableSectionData$SectionItemData;", "initialSectionExpandedState", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "animateDisplacementOffsets", "animateItemPlacement", "lib-utils-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface ReorderableLazyListScopeV2 extends ReorderableLazyListScope {
    @Override // com.robinhood.utils.compose.reorderable.ReorderableLazyListScope, androidx.compose.foundation.lazy.LazyListScope
    /* bridge */ /* synthetic */ default void item(Object obj, Object obj2, Function3 function3) {
        super.item(obj, obj2, function3);
    }

    @Override // com.robinhood.utils.compose.reorderable.ReorderableLazyListScope, androidx.compose.foundation.lazy.LazyListScope
    @Deprecated
    /* bridge */ /* synthetic */ default void item(Object obj, Function3 function3) {
        super.item(obj, function3);
    }

    @Override // com.robinhood.utils.compose.reorderable.ReorderableLazyListScope, androidx.compose.foundation.lazy.LazyListScope
    /* bridge */ /* synthetic */ default void items(int i, Function1 function1, Function1 function12, Function4 function4) {
        super.items(i, function1, function12, function4);
    }

    @Override // com.robinhood.utils.compose.reorderable.ReorderableLazyListScope, androidx.compose.foundation.lazy.LazyListScope
    @Deprecated
    /* bridge */ /* synthetic */ default void items(int i, Function1 function1, Function4 function4) {
        super.items(i, function1, function4);
    }

    <T, S> void reorderableSectionItems(List<? extends T> headerItems, Function2<? super Integer, ? super T, ? extends List<? extends S>> sectionItems, ReorderableSectionData.HeaderCallData<T> headerItemData, ReorderableSectionData.SectionItemData<T, S> sectionItemData, Function2<? super Integer, ? super T, Boolean> initialSectionExpandedState, boolean animateDisplacementOffsets, boolean animateItemPlacement);

    @Override // com.robinhood.utils.compose.reorderable.ReorderableLazyListScope, androidx.compose.foundation.lazy.LazyListScope
    @Deprecated
    /* bridge */ /* synthetic */ default void stickyHeader(Object obj, Object obj2, Function3 function3) {
        super.stickyHeader(obj, obj2, function3);
    }

    @Override // com.robinhood.utils.compose.reorderable.ReorderableLazyListScope, androidx.compose.foundation.lazy.LazyListScope
    /* bridge */ /* synthetic */ default void stickyHeader(Object obj, Object obj2, Function4 function4) {
        super.stickyHeader(obj, obj2, (Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit>) function4);
    }

    /* compiled from: ReorderableLazyColumn.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean reorderableSectionItems$lambda$0(int i, Object obj) {
            return false;
        }

        public static /* synthetic */ void reorderableSectionItems$default(ReorderableLazyListScopeV2 reorderableLazyListScopeV2, List list, Function2 function2, ReorderableSectionData.HeaderCallData headerCallData, ReorderableSectionData.SectionItemData sectionItemData, Function2 function22, boolean z, boolean z2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reorderableSectionItems");
            }
            if ((i & 16) != 0) {
                function22 = new Function2() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeV2$DefaultImpls$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return Boolean.valueOf(ReorderableLazyListScopeV2.DefaultImpls.reorderableSectionItems$lambda$0(((Integer) obj2).intValue(), obj3));
                    }
                };
            }
            Function2 function23 = function22;
            if ((i & 32) != 0) {
                z = true;
            }
            reorderableLazyListScopeV2.reorderableSectionItems(list, function2, headerCallData, sectionItemData, function23, z, (i & 64) != 0 ? false : z2);
        }
    }
}
