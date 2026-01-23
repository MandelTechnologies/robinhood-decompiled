package com.robinhood.utils.compose.reorderable;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.utils.compose.extensions.LazyListScope2;
import com.robinhood.utils.compose.extensions.LazyListScope3;
import com.robinhood.utils.compose.reorderable.ReorderableSectionData;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ReorderableLazyListScopeImplV2.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ¢\u0003\u0010%\u001a\u00020\u0019\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000e\u001a\u00020\r26\u0010\u0015\u001a2\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\r0\u000f28\u0010\u0017\u001a4\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000f2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001828\u0010\u001d\u001a4\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000f26\u0010\u001e\u001a2\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00190\u000f2\u0080\u0001\u0010$\u001a|\u0012\u0004\u0012\u00020 \u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(!\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00190\u001f¢\u0006\u0002\b#H\u0002¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b+\u0010,J\u0087\u0003\u00103\u001a\u00020\u0019\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000e\u001a\u00020\r26\u0010\u0015\u001a2\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\r0\u000f28\u0010\u0017\u001a4\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000f2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001828\u0010\u001d\u001a4\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000f26\u0010\u001e\u001a2\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00190\u000f2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2V\u00102\u001aR\u0012\u0004\u0012\u00020 \u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110-¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u001900¢\u0006\u0002\b#H\u0016¢\u0006\u0004\b3\u00104JÑ\u0001\u0010?\u001a\u00020\u0019\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u001052\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2<\u00109\u001a8\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(7\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(8\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\u000f2\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010<26\u0010>\u001a2\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020-0\u000f2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-H\u0016¢\u0006\u0004\b?\u0010@J.\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\rHÖ\u0001¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\bE\u0010FJ\u001a\u0010H\u001a\u00020-2\b\u0010G\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\bH\u0010IJ3\u0010\u0014\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0017\u0010K\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00190J¢\u0006\u0002\b#H\u0097\u0001¢\u0006\u0004\b\u0014\u0010LJ=\u0010\u0014\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0017\u0010K\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00190J¢\u0006\u0002\b#H\u0096\u0001¢\u0006\u0004\b\u0014\u0010MJ\u0090\u0001\u0010\f\u001a\u00020\u00192\u0006\u0010N\u001a\u00020\u00102#\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0016\u0018\u00010J2#\u0010\u0017\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00160J2,\u00102\u001a(\u0012\u0004\u0012\u00020 \u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00190\u000f¢\u0006\u0002\b#H\u0096\u0001¢\u0006\u0004\b\f\u0010OJk\u0010\f\u001a\u00020\u00192\u0006\u0010N\u001a\u00020\u00102#\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0016\u0018\u00010J2,\u00102\u001a(\u0012\u0004\u0012\u00020 \u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00190\u000f¢\u0006\u0002\b#H\u0097\u0001¢\u0006\u0004\b\f\u0010PJ=\u0010Q\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0017\u0010K\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00190J¢\u0006\u0002\b#H\u0097\u0001¢\u0006\u0004\bQ\u0010MJC\u0010Q\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u001d\u0010K\u001a\u0019\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00190\u000f¢\u0006\u0002\b#H\u0096\u0001¢\u0006\u0004\bQ\u0010RR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010SR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010TR\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010UR\u0016\u0010V\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006X"}, m3636d2 = {"Lcom/robinhood/utils/compose/reorderable/ReorderableLazyListScopeImplV2;", "Lcom/robinhood/utils/compose/reorderable/ReorderableLazyListScopeV2;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lcom/robinhood/utils/compose/reorderable/DragStateV2;", "dragState", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "haptics", "lazyListScope", "<init>", "(Lcom/robinhood/utils/compose/reorderable/DragStateV2;Landroidx/compose/ui/hapticfeedback/HapticFeedback;Landroidx/compose/foundation/lazy/LazyListScope;)V", "T", "", "items", "", "keyPrefix", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "key", "", "contentType", "Lkotlin/Function0;", "", "onDragStart", "startIndex", "targetIndex", "onDragUpdate", "onDragFinish", "Lkotlin/Function6;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "groupId", "itemKey", "Lkotlin/ExtensionFunctionType;", "reorderableItem", "reorderableItemsIndexed", "(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function8;)V", "component1", "()Lcom/robinhood/utils/compose/reorderable/DragStateV2;", "component2", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "component3", "()Landroidx/compose/foundation/lazy/LazyListScope;", "", "animateDisplacementOffsets", "animateItemPlacement", "Lkotlin/Function4;", "isDragItem", "itemContent", "reorderableItems", "(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZLkotlin/jvm/functions/Function6;)V", "S", "headerItems", "headerIndex", "headerItem", "sectionItems", "Lcom/robinhood/utils/compose/reorderable/ReorderableSectionData$HeaderCallData;", "headerItemData", "Lcom/robinhood/utils/compose/reorderable/ReorderableSectionData$SectionItemData;", "sectionItemData", "initialSectionExpandedState", "reorderableSectionItems", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;Lcom/robinhood/utils/compose/reorderable/ReorderableSectionData$HeaderCallData;Lcom/robinhood/utils/compose/reorderable/ReorderableSectionData$SectionItemData;Lkotlin/jvm/functions/Function2;ZZ)V", "copy", "(Lcom/robinhood/utils/compose/reorderable/DragStateV2;Landroidx/compose/ui/hapticfeedback/HapticFeedback;Landroidx/compose/foundation/lazy/LazyListScope;)Lcom/robinhood/utils/compose/reorderable/ReorderableLazyListScopeImplV2;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/Function1;", "content", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "count", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "stickyHeader", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function4;)V", "Lcom/robinhood/utils/compose/reorderable/DragStateV2;", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "Landroidx/compose/foundation/lazy/LazyListScope;", "groupIdCounter", "I", "lib-utils-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class ReorderableLazyListScopeImplV2 implements ReorderableLazyListScopeV2, LazyListScope {
    public static final int $stable = 8;
    private final DragStateV2 dragState;
    private int groupIdCounter;
    private final HapticFeedback haptics;
    private final LazyListScope lazyListScope;

    /* renamed from: component1, reason: from getter */
    private final DragStateV2 getDragState() {
        return this.dragState;
    }

    /* renamed from: component2, reason: from getter */
    private final HapticFeedback getHaptics() {
        return this.haptics;
    }

    /* renamed from: component3, reason: from getter */
    private final LazyListScope getLazyListScope() {
        return this.lazyListScope;
    }

    public static /* synthetic */ ReorderableLazyListScopeImplV2 copy$default(ReorderableLazyListScopeImplV2 reorderableLazyListScopeImplV2, DragStateV2 dragStateV2, HapticFeedback hapticFeedback, LazyListScope lazyListScope, int i, Object obj) {
        if ((i & 1) != 0) {
            dragStateV2 = reorderableLazyListScopeImplV2.dragState;
        }
        if ((i & 2) != 0) {
            hapticFeedback = reorderableLazyListScopeImplV2.haptics;
        }
        if ((i & 4) != 0) {
            lazyListScope = reorderableLazyListScopeImplV2.lazyListScope;
        }
        return reorderableLazyListScopeImplV2.copy(dragStateV2, hapticFeedback, lazyListScope);
    }

    public final ReorderableLazyListScopeImplV2 copy(DragStateV2 dragState, HapticFeedback haptics, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(dragState, "dragState");
        Intrinsics.checkNotNullParameter(haptics, "haptics");
        Intrinsics.checkNotNullParameter(lazyListScope, "lazyListScope");
        return new ReorderableLazyListScopeImplV2(dragState, haptics, lazyListScope);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReorderableLazyListScopeImplV2)) {
            return false;
        }
        ReorderableLazyListScopeImplV2 reorderableLazyListScopeImplV2 = (ReorderableLazyListScopeImplV2) other;
        return Intrinsics.areEqual(this.dragState, reorderableLazyListScopeImplV2.dragState) && Intrinsics.areEqual(this.haptics, reorderableLazyListScopeImplV2.haptics) && Intrinsics.areEqual(this.lazyListScope, reorderableLazyListScopeImplV2.lazyListScope);
    }

    public int hashCode() {
        return (((this.dragState.hashCode() * 31) + this.haptics.hashCode()) * 31) + this.lazyListScope.hashCode();
    }

    @Override // com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeV2, com.robinhood.utils.compose.reorderable.ReorderableLazyListScope, androidx.compose.foundation.lazy.LazyListScope
    public void item(Object key, Object contentType, Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.lazyListScope.item(key, contentType, content);
    }

    @Override // com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeV2, com.robinhood.utils.compose.reorderable.ReorderableLazyListScope, androidx.compose.foundation.lazy.LazyListScope
    @Deprecated
    public /* synthetic */ void item(Object key, Function3 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.lazyListScope.item(key, content);
    }

    @Override // com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeV2, com.robinhood.utils.compose.reorderable.ReorderableLazyListScope, androidx.compose.foundation.lazy.LazyListScope
    public void items(int count, Function1<? super Integer, ? extends Object> key, Function1<? super Integer, ? extends Object> contentType, Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        this.lazyListScope.items(count, key, contentType, itemContent);
    }

    @Override // com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeV2, com.robinhood.utils.compose.reorderable.ReorderableLazyListScope, androidx.compose.foundation.lazy.LazyListScope
    @Deprecated
    public /* synthetic */ void items(int count, Function1 key, Function4 itemContent) {
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        this.lazyListScope.items(count, key, itemContent);
    }

    @Override // com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeV2, com.robinhood.utils.compose.reorderable.ReorderableLazyListScope, androidx.compose.foundation.lazy.LazyListScope
    @Deprecated
    public /* synthetic */ void stickyHeader(Object key, Object contentType, Function3 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.lazyListScope.stickyHeader(key, contentType, content);
    }

    @Override // com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeV2, com.robinhood.utils.compose.reorderable.ReorderableLazyListScope, androidx.compose.foundation.lazy.LazyListScope
    public void stickyHeader(Object key, Object contentType, Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.lazyListScope.stickyHeader(key, contentType, content);
    }

    public String toString() {
        return "ReorderableLazyListScopeImplV2(dragState=" + this.dragState + ", haptics=" + this.haptics + ", lazyListScope=" + this.lazyListScope + ")";
    }

    public ReorderableLazyListScopeImplV2(DragStateV2 dragState, HapticFeedback haptics, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(dragState, "dragState");
        Intrinsics.checkNotNullParameter(haptics, "haptics");
        Intrinsics.checkNotNullParameter(lazyListScope, "lazyListScope");
        this.dragState = dragState;
        this.haptics = haptics;
        this.lazyListScope = lazyListScope;
    }

    @Override // com.robinhood.utils.compose.reorderable.ReorderableLazyListScope
    public <T> void reorderableItems(List<? extends T> items, String keyPrefix, Function2<? super Integer, ? super T, String> key, Function2<? super Integer, ? super T, ? extends Object> contentType, Function0<Unit> onDragStart, Function2<? super Integer, ? super Integer, Unit> onDragUpdate, Function2<? super Integer, ? super Integer, Unit> onDragFinish, final boolean animateDisplacementOffsets, final boolean animateItemPlacement, final Function6<? super LazyItemScope, ? super T, ? super Integer, ? super Boolean, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(keyPrefix, "keyPrefix");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(onDragFinish, "onDragFinish");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        reorderableItemsIndexed(items, keyPrefix, key, contentType, onDragStart, onDragUpdate, onDragFinish, ComposableLambda3.composableLambdaInstance(1843551594, true, new Function8<LazyItemScope, DragStateV2, Integer, T, Object, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2.reorderableItems.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function8
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, DragStateV2 dragStateV2, Integer num, Object obj, Object obj2, Integer num2, Composer composer, Integer num3) {
                invoke(lazyItemScope, dragStateV2, num.intValue(), (int) obj, obj2, num2.intValue(), composer, num3.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier] */
            public final void invoke(final LazyItemScope reorderableItemsIndexed, DragStateV2 dragState, int i, final T t, Object itemKey, final int i2, Composer composer, int i3) {
                Intrinsics.checkNotNullParameter(reorderableItemsIndexed, "$this$reorderableItemsIndexed");
                Intrinsics.checkNotNullParameter(dragState, "dragState");
                Intrinsics.checkNotNullParameter(itemKey, "itemKey");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1843551594, i3, -1, "com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2.reorderableItems.<anonymous> (ReorderableLazyListScopeImplV2.kt:73)");
                }
                boolean z = animateDisplacementOffsets;
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier.Companion companionAnimateItem$default = LazyItemScope.animateItem$default(reorderableItemsIndexed, companion, null, null, null, 7, null);
                if (!animateItemPlacement) {
                    companionAnimateItem$default = null;
                }
                if (companionAnimateItem$default != null) {
                    companion = companionAnimateItem$default;
                }
                final Function6<LazyItemScope, T, Integer, Boolean, Composer, Integer, Unit> function6 = itemContent;
                ReorderableLazyListScopeImplV2Kt.DraggableItemWrapperV2(i2, i, itemKey, dragState, z, companion, ComposableLambda3.rememberComposableLambda(-1630582402, true, new Function4<Boolean, Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2.reorderableItems.1.2
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Boolean bool2, Composer composer2, Integer num) {
                        invoke(bool.booleanValue(), bool2.booleanValue(), composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z2, boolean z3, Composer composer2, int i4) {
                        if ((i4 & 6) == 0) {
                            i4 |= composer2.changed(z2) ? 4 : 2;
                        }
                        if ((i4 & 131) == 130 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1630582402, i4, -1, "com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2.reorderableItems.<anonymous>.<anonymous> (ReorderableLazyListScopeImplV2.kt:83)");
                        }
                        function6.invoke(reorderableItemsIndexed, t, Integer.valueOf(i2), Boolean.valueOf(z2), composer2, Integer.valueOf((i4 << 9) & 7168));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 3) & 112) | ((i3 >> 6) & 896) | ((i3 << 6) & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    @Override // com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeV2
    public <T, S> void reorderableSectionItems(List<? extends T> headerItems, final Function2<? super Integer, ? super T, ? extends List<? extends S>> sectionItems, final ReorderableSectionData.HeaderCallData<T> headerItemData, final ReorderableSectionData.SectionItemData<T, S> sectionItemData, final Function2<? super Integer, ? super T, Boolean> initialSectionExpandedState, final boolean animateDisplacementOffsets, final boolean animateItemPlacement) {
        Intrinsics.checkNotNullParameter(headerItems, "headerItems");
        Intrinsics.checkNotNullParameter(sectionItems, "sectionItems");
        Intrinsics.checkNotNullParameter(headerItemData, "headerItemData");
        Intrinsics.checkNotNullParameter(sectionItemData, "sectionItemData");
        Intrinsics.checkNotNullParameter(initialSectionExpandedState, "initialSectionExpandedState");
        reorderableItemsIndexed(headerItems, headerItemData.getKeyPrefix(), headerItemData.getItemKey(), headerItemData.getContentType(), headerItemData.getOnDragStart(), headerItemData.getOnDragUpdate(), headerItemData.getOnDragFinish(), ComposableLambda3.composableLambdaInstance(1997525382, true, new Function8<LazyItemScope, DragStateV2, Integer, T, Object, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2.reorderableSectionItems.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function8
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, DragStateV2 dragStateV2, Integer num, Object obj, Object obj2, Integer num2, Composer composer, Integer num3) {
                invoke(lazyItemScope, dragStateV2, num.intValue(), (int) obj, obj2, num2.intValue(), composer, num3.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope reorderableItemsIndexed, DragStateV2 dragState, int i, T t, Object headerKey, int i2, Composer composer, int i3) {
                Intrinsics.checkNotNullParameter(reorderableItemsIndexed, "$this$reorderableItemsIndexed");
                Intrinsics.checkNotNullParameter(dragState, "dragState");
                Intrinsics.checkNotNullParameter(headerKey, "headerKey");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1997525382, i3, -1, "com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2.reorderableSectionItems.<anonymous> (ReorderableLazyListScopeImplV2.kt:106)");
                }
                composer.startReplaceGroup(5004770);
                boolean z = (((i3 & 7168) ^ 3072) > 2048 && composer.changed(t)) || (i3 & 3072) == 2048;
                Function2<Integer, T, List<S>> function2 = sectionItems;
                Object objRememberedValue = composer.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = (List) function2.invoke(Integer.valueOf(i2), t);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                boolean itemsConsistentSize = sectionItemData.getItemsConsistentSize();
                Function2 contentType = sectionItemData.getContentType();
                ImmutableList immutableList = extensions2.toImmutableList((List) objRememberedValue);
                String keyPrefix = sectionItemData.getKeyPrefix();
                Function2 itemKey = sectionItemData.getItemKey();
                Function8<LazyItemScope, T, Integer, Boolean, Boolean, Function1<? super Boolean, Unit>, Composer, Integer, Unit> itemContent = headerItemData.getItemContent();
                Function8 itemContent2 = sectionItemData.getItemContent();
                Function0<Unit> onDragStart = sectionItemData.getOnDragStart();
                ReorderableLazyListScopeImplV2Kt.m26627DraggableSectionItemBn9xFrM(reorderableItemsIndexed, itemsConsistentSize, contentType, t, immutableList, keyPrefix, itemKey, sectionItemData.m26640getReorderDebounceDelayUwyO8pc(), i2, i, headerKey, dragState, animateDisplacementOffsets, animateItemPlacement, initialSectionExpandedState, sectionItemData.getOnReorder(), onDragStart, sectionItemData.getOnDragFinish(), itemContent, itemContent2, this.dragState, null, composer, (i3 & 7182) | ((i3 << 9) & 234881024) | ((i3 << 21) & 1879048192), ((i3 >> 12) & 14) | (i3 & 112), 0, 1048576);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    private final <T> void reorderableItemsIndexed(final List<? extends T> items, String keyPrefix, Function2<? super Integer, ? super T, String> key, Function2<? super Integer, ? super T, ? extends Object> contentType, final Function0<Unit> onDragStart, final Function2<? super Integer, ? super Integer, Unit> onDragUpdate, final Function2<? super Integer, ? super Integer, Unit> onDragFinish, final Function8<? super LazyItemScope, ? super DragStateV2, ? super Integer, ? super T, Object, ? super Integer, ? super Composer, ? super Integer, Unit> reorderableItem) {
        final DragStateV2 dragStateV2 = this.dragState;
        final HapticFeedback hapticFeedback = this.haptics;
        final int i = this.groupIdCounter;
        this.groupIdCounter = i + 1;
        final LazyListScope3 lazyListScope3 = new LazyListScope3(keyPrefix, key);
        items(items.size(), new LazyListScope2.C418452(lazyListScope3, items), new LazyListScope2.C418463(contentType, items), ComposableLambda3.composableLambdaInstance(1694499883, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2$reorderableItemsIndexed$$inlined$itemsIndexedWithPrefix$1
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope items2, final int i2, Composer composer, int i3) {
                int i4;
                Intrinsics.checkNotNullParameter(items2, "$this$items");
                if ((i3 & 6) == 0) {
                    i4 = i3 | (composer.changed(items2) ? 4 : 2);
                } else {
                    i4 = i3;
                }
                if ((i3 & 48) == 0) {
                    i4 |= composer.changed(i2) ? 32 : 16;
                }
                int i5 = i4;
                if ((i5 & 147) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1694499883, i5, -1, "com.robinhood.utils.compose.extensions.itemsIndexedWithPrefix.<anonymous> (LazyListScope.kt:31)");
                }
                Object obj = items.get(i2);
                Object objInvoke = lazyListScope3.invoke(Integer.valueOf(i2), items.get(i2));
                int i6 = i5 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
                final String str = (String) objInvoke;
                composer.startReplaceGroup(947461261);
                Integer numValueOf = Integer.valueOf(i);
                Integer numValueOf2 = Integer.valueOf(i2);
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance = ((((i5 & 112) ^ 48) > 32 && composer.changed(i2)) || (i5 & 48) == 32) | composer.changedInstance(dragStateV2) | composer.changed(str) | composer.changed(i);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final DragStateV2 dragStateV22 = dragStateV2;
                    final int i7 = i;
                    objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2$reorderableItemsIndexed$1$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                            dragStateV22.registerItem(str, i7, i2);
                            final DragStateV2 dragStateV23 = dragStateV22;
                            final String str2 = str;
                            return new DisposableEffectResult() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2$reorderableItemsIndexed$1$1$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    dragStateV23.removeItem(str2);
                                }
                            };
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                EffectsKt.DisposableEffect(str, numValueOf, numValueOf2, (Function1) objRememberedValue, composer, (i6 << 3) & 896);
                Unit unit = Unit.INSTANCE;
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance2 = composer.changedInstance(dragStateV2) | composer.changed(i) | composer.changedInstance(items) | composer.changed(onDragStart) | composer.changedInstance(hapticFeedback) | composer.changed(onDragUpdate) | composer.changed(onDragFinish);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object reorderableLazyListScopeImplV2$reorderableItemsIndexed$1$2$1 = new ReorderableLazyListScopeImplV2$reorderableItemsIndexed$1$2$1(dragStateV2, i, items, onDragStart, hapticFeedback, onDragUpdate, onDragFinish, null);
                    composer.updateRememberedValue(reorderableLazyListScopeImplV2$reorderableItemsIndexed$1$2$1);
                    objRememberedValue2 = reorderableLazyListScopeImplV2$reorderableItemsIndexed$1$2$1;
                }
                composer.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 6);
                reorderableItem.invoke(items2, dragStateV2, Integer.valueOf(i), obj, str, Integer.valueOf(i2), composer, Integer.valueOf((i5 & 14) | ((i6 << 12) & 458752)));
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }
}
