package com.robinhood.utils.compose.reorderable;

import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.RippleKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.layout.SubcomposeLayoutKt;
import androidx.compose.p011ui.layout.SubcomposeMeasureScope;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.Job;

/* compiled from: ReorderableLazyListScopeImplV2.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a¿\u0005\u00107\u001a\u00020$\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u000328\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00052\u0006\u0010\r\u001a\u00028\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u001026\u0010\u0012\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00100\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u000326\u0010\u001c\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00030\u00052Q\u0010\"\u001aM\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00010\u001e¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!0\u001d2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#2\u008d\u0001\u0010-\u001a\u0088\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b((\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b()\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020$0*¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020$0'¢\u0006\u0002\b,2\u0080\u0001\u00101\u001a|\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(.\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(/\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(0\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b((\u0012\u0004\u0012\u00020$0'¢\u0006\u0002\b,2\u0006\u00102\u001a\u00020\u00182\b\b\u0002\u00104\u001a\u000203H\u0003¢\u0006\u0004\b5\u00106\u001ay\u0010;\u001a\u00020$2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u00104\u001a\u00020326\u0010:\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b((\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020$0\u0005H\u0003¢\u0006\u0004\b;\u0010<\u001a1\u0010@\u001a\u00020$2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020$0#2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020$0*H\u0003¢\u0006\u0004\b@\u0010A¨\u0006G²\u0006\u000e\u0010C\u001a\u00020B8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010D\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\f\u0010F\u001a\u00020E8\nX\u008a\u0084\u0002"}, m3636d2 = {"T", "S", "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "sectionItemsConsistentSize", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "", "sectionContentType", "headerItem", "Lkotlinx/collections/immutable/ImmutableList;", "sectionItems", "", "sectionItemKeyPrefix", "sectionItemKey", "Lkotlin/time/Duration;", "sectionReorderDebounceDelay", "headerIndex", "groupId", "headerKey", "Lcom/robinhood/utils/compose/reorderable/DragStateV2;", "dragState", "animateDisplacementOffsets", "animateItemPlacement", "initialSectionExpandedState", "Lkotlin/Function3;", "", "reorderedItems", "delay", "Lkotlinx/coroutines/Job;", "sectionOnReorder", "Lkotlin/Function0;", "", "sectionOnDragStart", "sectionOnDragFinish", "Lkotlin/Function6;", "isDragItem", "expanded", "Lkotlin/Function1;", "setExpanded", "Lkotlin/ExtensionFunctionType;", "headerItemContent", "parentItem", AnalyticsStrings.BUTTON_EARNINGS_PREVIEW, "sectionItemIndex", "sectionItemContent", "parentDragState", "Landroidx/compose/ui/Modifier;", "modifier", "DraggableSectionItem-Bn9xFrM", "(Landroidx/compose/foundation/lazy/LazyItemScope;ZLkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Lkotlin/jvm/functions/Function2;JIILjava/lang/Object;Lcom/robinhood/utils/compose/reorderable/DragStateV2;ZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function8;Lkotlin/jvm/functions/Function8;Lcom/robinhood/utils/compose/reorderable/DragStateV2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;IIII)V", "DraggableSectionItem", "key", "isDragGroup", "itemContent", "DraggableItemWrapperV2", "(IILjava/lang/Object;Lcom/robinhood/utils/compose/reorderable/DragStateV2;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "contentToMeasure", "Landroidx/compose/ui/unit/Dp;", "contentToDisplay", "SubCompose", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "", "sectionHeight", "sectionExpanded", "Landroidx/compose/ui/unit/IntOffset;", "animatedOffset", "lib-utils-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ReorderableLazyListScopeImplV2Kt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DraggableItemWrapperV2$lambda$20(int i, int i2, Object obj, DragStateV2 dragStateV2, boolean z, Modifier modifier, Function4 function4, int i3, int i4, Composer composer, int i5) {
        DraggableItemWrapperV2(i, i2, obj, dragStateV2, z, modifier, function4, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DraggableSectionItem_Bn9xFrM$lambda$11(LazyItemScope lazyItemScope, boolean z, Function2 function2, Object obj, ImmutableList immutableList, String str, Function2 function22, long j, int i, int i2, Object obj2, DragStateV2 dragStateV2, boolean z2, boolean z3, Function2 function23, Function3 function3, Function0 function0, Function0 function02, Function8 function8, Function8 function82, DragStateV2 dragStateV22, Modifier modifier, int i3, int i4, int i5, int i6, Composer composer, int i7) {
        m26627DraggableSectionItemBn9xFrM(lazyItemScope, z, function2, obj, immutableList, str, function22, j, i, i2, obj2, dragStateV2, z2, z3, function23, function3, function0, function02, function8, function82, dragStateV22, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), RecomposeScopeImpl4.updateChangedFlags(i4), RecomposeScopeImpl4.updateChangedFlags(i5), i6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubCompose$lambda$27(Function2 function2, Function3 function3, int i, Composer composer, int i2) {
        SubCompose(function2, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final long DraggableItemWrapperV2$lambda$16(SnapshotState4<IntOffset> snapshotState4) {
        return snapshotState4.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DraggableSectionItem_Bn9xFrM$lambda$8(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:299:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0127  */
    /* renamed from: DraggableSectionItem-Bn9xFrM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T, S> void m26627DraggableSectionItemBn9xFrM(final LazyItemScope lazyItemScope, final boolean z, final Function2<? super Integer, ? super S, ? extends Object> function2, final T t, final ImmutableList<? extends S> immutableList, final String str, final Function2<? super Integer, ? super S, String> function22, final long j, final int i, final int i2, final Object obj, final DragStateV2 dragStateV2, final boolean z2, final boolean z3, final Function2<? super Integer, ? super T, Boolean> function23, final Function3<? super T, ? super List<? extends S>, ? super Duration, ? extends Job> function3, final Function0<Unit> function0, final Function0<Unit> function02, final Function8<? super LazyItemScope, ? super T, ? super Integer, ? super Boolean, ? super Boolean, ? super Function1<? super Boolean, Unit>, ? super Composer, ? super Integer, Unit> function8, final Function8<? super LazyItemScope, ? super T, ? super S, ? super Boolean, ? super Integer, ? super Boolean, ? super Composer, ? super Integer, Unit> function82, final DragStateV2 dragStateV22, Modifier modifier, Composer composer, final int i3, final int i4, final int i5, final int i6) {
        LazyItemScope lazyItemScope2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean z4;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1906442203);
        if ((Integer.MIN_VALUE & i6) != 0) {
            i7 = i3 | 6;
            lazyItemScope2 = lazyItemScope;
        } else if ((i3 & 6) == 0) {
            lazyItemScope2 = lazyItemScope;
            i7 = (composerStartRestartGroup.changed(lazyItemScope2) ? 4 : 2) | i3;
        } else {
            lazyItemScope2 = lazyItemScope;
            i7 = i3;
        }
        if ((i6 & 1) != 0) {
            i7 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i7 |= composerStartRestartGroup.changed(z) ? 32 : 16;
            }
            if ((i6 & 2) == 0) {
                i7 |= 384;
            } else {
                if ((i3 & 384) == 0) {
                    i7 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
                }
                if ((i6 & 4) != 0) {
                    i7 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    i7 |= (i3 & 4096) == 0 ? composerStartRestartGroup.changed(t) : composerStartRestartGroup.changedInstance(t) ? 2048 : 1024;
                }
                if ((i6 & 8) != 0) {
                    i7 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    i7 |= (32768 & i3) == 0 ? composerStartRestartGroup.changed(immutableList) : composerStartRestartGroup.changedInstance(immutableList) ? 16384 : 8192;
                }
                if ((i6 & 16) != 0) {
                    i7 |= 196608;
                } else {
                    if ((i3 & 196608) == 0) {
                        i8 = 131072;
                        i7 |= composerStartRestartGroup.changed(str) ? 131072 : 65536;
                    }
                    if ((i6 & 32) == 0) {
                        i7 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i7 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                    }
                    if ((i6 & 64) == 0) {
                        i7 |= 12582912;
                    } else {
                        if ((i3 & 12582912) == 0) {
                            i9 = i7 | (composerStartRestartGroup.changed(j) ? 8388608 : 4194304);
                        }
                        if ((i6 & 128) != 0) {
                            i9 |= 100663296;
                        } else {
                            if ((i3 & 100663296) == 0) {
                                i9 |= composerStartRestartGroup.changed(i) ? 67108864 : 33554432;
                            }
                            if ((i6 & 256) == 0) {
                                i9 |= 805306368;
                            } else {
                                if ((i3 & 805306368) == 0) {
                                    i9 |= composerStartRestartGroup.changed(i2) ? 536870912 : 268435456;
                                }
                                i10 = i9;
                                if ((i6 & 512) != 0) {
                                    i11 = i4 | 6;
                                } else if ((i4 & 6) == 0) {
                                    i11 = i4 | (composerStartRestartGroup.changedInstance(obj) ? 4 : 2);
                                } else {
                                    i11 = i4;
                                }
                                if ((i6 & 1024) != 0) {
                                    i11 |= 48;
                                } else if ((i4 & 48) == 0) {
                                    i11 |= composerStartRestartGroup.changedInstance(dragStateV2) ? 32 : 16;
                                }
                                int i14 = i11;
                                if ((i6 & 2048) != 0) {
                                    i14 |= 384;
                                } else {
                                    if ((i4 & 384) == 0) {
                                        i14 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                                    }
                                    if ((i6 & 4096) == 0) {
                                        i14 |= 3072;
                                    } else if ((i4 & 3072) == 0) {
                                        i14 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                                    }
                                    if ((i6 & 8192) == 0) {
                                        i14 |= 24576;
                                    } else if ((i4 & 24576) == 0) {
                                        i14 |= composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192;
                                    }
                                    if ((i6 & 16384) == 0) {
                                        i14 |= 196608;
                                    } else if ((i4 & 196608) == 0) {
                                        i14 |= composerStartRestartGroup.changedInstance(function3) ? i8 : 65536;
                                    }
                                    if ((32768 & i6) != 0) {
                                        if ((i4 & 1572864) == 0) {
                                            i14 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
                                        }
                                        if ((i6 & 65536) != 0) {
                                            i14 |= 12582912;
                                        } else if ((i4 & 12582912) == 0) {
                                            i14 |= composerStartRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
                                        }
                                        if ((i6 & i8) != 0) {
                                            i14 |= 100663296;
                                        } else if ((i4 & 100663296) == 0) {
                                            i14 |= composerStartRestartGroup.changedInstance(function8) ? 67108864 : 33554432;
                                        }
                                        if ((i6 & 262144) != 0) {
                                            i14 |= 805306368;
                                        } else if ((i4 & 805306368) == 0) {
                                            i14 |= composerStartRestartGroup.changedInstance(function82) ? 536870912 : 268435456;
                                        }
                                        if ((i6 & 524288) != 0) {
                                            i12 = i5 | 6;
                                        } else if ((i5 & 6) == 0) {
                                            i12 = i5 | (composerStartRestartGroup.changedInstance(dragStateV22) ? 4 : 2);
                                        } else {
                                            i12 = i5;
                                        }
                                        i13 = i6 & 1048576;
                                        if (i13 != 0) {
                                            i12 |= 48;
                                        } else if ((i5 & 48) == 0) {
                                            i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
                                        }
                                        if ((i10 & 306783379) == 306783378 && (306783379 & i14) == 306783378 && (i12 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            modifier2 = modifier;
                                        } else {
                                            Modifier modifier3 = i13 == 0 ? Modifier.INSTANCE : modifier;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1906442203, i10, i14, "com.robinhood.utils.compose.reorderable.DraggableSectionItem (ReorderableLazyListScopeImplV2.kt:224)");
                                            }
                                            Object[] objArr = new Object[0];
                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                                            companion = Composer.INSTANCE;
                                            if (objRememberedValue == companion.getEmpty()) {
                                                objRememberedValue = new Function0() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2Kt$$ExternalSyntheticLambda5
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return ReorderableLazyListScopeImplV2Kt.DraggableSectionItem_Bn9xFrM$lambda$1$lambda$0();
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            int i15 = i8;
                                            SnapshotFloatState2 snapshotFloatState2 = (SnapshotFloatState2) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                                            ImmutableList immutableList2 = extensions2.toImmutableList(immutableList);
                                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                                            z4 = ((458752 & i14) != i15) | ((i10 & 7168) != 2048 || ((i10 & 4096) != 0 && composerStartRestartGroup.changedInstance(t)));
                                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                            if (!z4 || objRememberedValue2 == companion.getEmpty()) {
                                                objRememberedValue2 = new Function2() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2Kt$$ExternalSyntheticLambda6
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj2, Object obj3) {
                                                        return ReorderableLazyListScopeImplV2Kt.DraggableSectionItem_Bn9xFrM$lambda$5$lambda$4(function3, t, (List) obj2, (Duration) obj3);
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            int i16 = i14 >> 9;
                                            ReorderableListState reorderableListStateM26636rememberReorderableListStateKVH2U2I = ReorderableListStateKt.m26636rememberReorderableListStateKVH2U2I(immutableList2, (Function2) objRememberedValue2, j, function0, function02, composerStartRestartGroup, ((i10 >> 15) & 896) | (i16 & 7168) | (i16 & 57344), 0);
                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue3 == companion.getEmpty()) {
                                                objRememberedValue3 = InteractionSource2.MutableInteractionSource();
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                            }
                                            InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue3;
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue4 == companion.getEmpty()) {
                                                objRememberedValue4 = SnapshotState3.mutableStateOf$default(function23.invoke(Integer.valueOf(i), t), null, 2, null);
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                            }
                                            SnapshotState snapshotState = (SnapshotState) objRememberedValue4;
                                            composerStartRestartGroup.endReplaceGroup();
                                            Modifier modifierIndication = IndicationKt.indication(modifier3, interactionSource3, RippleKt.m5624rippleH2RKhps$default(true, 0.0f, 0L, 6, null));
                                            if ((z3 || dragStateV2.getDragItem$lib_utils_compose_externalDebug() == null) ? false : true) {
                                                modifierIndication = LazyItemScope.animateItem$default(lazyItemScope2, modifierIndication, null, null, null, 7, null);
                                            }
                                            Modifier modifier4 = modifier3;
                                            int i17 = i10 >> 24;
                                            int i18 = i14 << 6;
                                            DraggableItemWrapperV2(i, i2, obj, dragStateV2, z2, modifierIndication, ComposableLambda3.rememberComposableLambda(-2044630545, true, new ReorderableLazyListScopeImplV2Kt$DraggableSectionItem$2(immutableList, z, function82, lazyItemScope, t, i10, snapshotFloatState2, function8, i, snapshotState, dragStateV22, reorderableListStateM26636rememberReorderableListStateKVH2U2I, str, function22, function2, interactionSource3), composerStartRestartGroup, 54), composerStartRestartGroup, (i17 & 112) | (i17 & 14) | 1572864 | (i18 & 896) | (i18 & 7168) | (i18 & 57344), 0);
                                            composerStartRestartGroup = composerStartRestartGroup;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            modifier2 = modifier4;
                                        }
                                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                        if (scopeUpdateScopeEndRestartGroup != null) {
                                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2Kt$$ExternalSyntheticLambda7
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj2, Object obj3) {
                                                    return ReorderableLazyListScopeImplV2Kt.DraggableSectionItem_Bn9xFrM$lambda$11(lazyItemScope, z, function2, t, immutableList, str, function22, j, i, i2, obj, dragStateV2, z2, z3, function23, function3, function0, function02, function8, function82, dragStateV22, modifier2, i3, i4, i5, i6, (Composer) obj2, ((Integer) obj3).intValue());
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i14 |= 1572864;
                                    if ((i6 & 65536) != 0) {
                                    }
                                    if ((i6 & i8) != 0) {
                                    }
                                    if ((i6 & 262144) != 0) {
                                    }
                                    if ((i6 & 524288) != 0) {
                                    }
                                    i13 = i6 & 1048576;
                                    if (i13 != 0) {
                                    }
                                    if ((i10 & 306783379) == 306783378) {
                                        if (i13 == 0) {
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        Object[] objArr2 = new Object[0];
                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        companion = Composer.INSTANCE;
                                        if (objRememberedValue == companion.getEmpty()) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        int i152 = i8;
                                        SnapshotFloatState2 snapshotFloatState22 = (SnapshotFloatState2) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                                        ImmutableList immutableList22 = extensions2.toImmutableList(immutableList);
                                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                                        if ((i10 & 7168) != 2048) {
                                            z4 = ((458752 & i14) != i152) | ((i10 & 7168) != 2048 || ((i10 & 4096) != 0 && composerStartRestartGroup.changedInstance(t)));
                                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                            if (!z4) {
                                                objRememberedValue2 = new Function2() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2Kt$$ExternalSyntheticLambda6
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj2, Object obj3) {
                                                        return ReorderableLazyListScopeImplV2Kt.DraggableSectionItem_Bn9xFrM$lambda$5$lambda$4(function3, t, (List) obj2, (Duration) obj3);
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                                composerStartRestartGroup.endReplaceGroup();
                                                int i162 = i14 >> 9;
                                                ReorderableListState reorderableListStateM26636rememberReorderableListStateKVH2U2I2 = ReorderableListStateKt.m26636rememberReorderableListStateKVH2U2I(immutableList22, (Function2) objRememberedValue2, j, function0, function02, composerStartRestartGroup, ((i10 >> 15) & 896) | (i162 & 7168) | (i162 & 57344), 0);
                                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                                if (objRememberedValue3 == companion.getEmpty()) {
                                                }
                                                InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue3;
                                                composerStartRestartGroup.endReplaceGroup();
                                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                                if (objRememberedValue4 == companion.getEmpty()) {
                                                }
                                                SnapshotState snapshotState2 = (SnapshotState) objRememberedValue4;
                                                composerStartRestartGroup.endReplaceGroup();
                                                Modifier modifierIndication2 = IndicationKt.indication(modifier3, interactionSource32, RippleKt.m5624rippleH2RKhps$default(true, 0.0f, 0L, 6, null));
                                                if (z3) {
                                                    if ((z3 || dragStateV2.getDragItem$lib_utils_compose_externalDebug() == null) ? false : true) {
                                                    }
                                                    Modifier modifier42 = modifier3;
                                                    int i172 = i10 >> 24;
                                                    int i182 = i14 << 6;
                                                    DraggableItemWrapperV2(i, i2, obj, dragStateV2, z2, modifierIndication2, ComposableLambda3.rememberComposableLambda(-2044630545, true, new ReorderableLazyListScopeImplV2Kt$DraggableSectionItem$2(immutableList, z, function82, lazyItemScope, t, i10, snapshotFloatState22, function8, i, snapshotState2, dragStateV22, reorderableListStateM26636rememberReorderableListStateKVH2U2I2, str, function22, function2, interactionSource32), composerStartRestartGroup, 54), composerStartRestartGroup, (i172 & 112) | (i172 & 14) | 1572864 | (i182 & 896) | (i182 & 7168) | (i182 & 57344), 0);
                                                    composerStartRestartGroup = composerStartRestartGroup;
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    modifier2 = modifier42;
                                                }
                                            }
                                        }
                                    }
                                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup != null) {
                                    }
                                }
                                if ((i6 & 4096) == 0) {
                                }
                                if ((i6 & 8192) == 0) {
                                }
                                if ((i6 & 16384) == 0) {
                                }
                                if ((32768 & i6) != 0) {
                                }
                                if ((i6 & 65536) != 0) {
                                }
                                if ((i6 & i8) != 0) {
                                }
                                if ((i6 & 262144) != 0) {
                                }
                                if ((i6 & 524288) != 0) {
                                }
                                i13 = i6 & 1048576;
                                if (i13 != 0) {
                                }
                                if ((i10 & 306783379) == 306783378) {
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                }
                            }
                            i10 = i9;
                            if ((i6 & 512) != 0) {
                            }
                            if ((i6 & 1024) != 0) {
                            }
                            int i142 = i11;
                            if ((i6 & 2048) != 0) {
                            }
                            if ((i6 & 4096) == 0) {
                            }
                            if ((i6 & 8192) == 0) {
                            }
                            if ((i6 & 16384) == 0) {
                            }
                            if ((32768 & i6) != 0) {
                            }
                            if ((i6 & 65536) != 0) {
                            }
                            if ((i6 & i8) != 0) {
                            }
                            if ((i6 & 262144) != 0) {
                            }
                            if ((i6 & 524288) != 0) {
                            }
                            i13 = i6 & 1048576;
                            if (i13 != 0) {
                            }
                            if ((i10 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        if ((i6 & 256) == 0) {
                        }
                        i10 = i9;
                        if ((i6 & 512) != 0) {
                        }
                        if ((i6 & 1024) != 0) {
                        }
                        int i1422 = i11;
                        if ((i6 & 2048) != 0) {
                        }
                        if ((i6 & 4096) == 0) {
                        }
                        if ((i6 & 8192) == 0) {
                        }
                        if ((i6 & 16384) == 0) {
                        }
                        if ((32768 & i6) != 0) {
                        }
                        if ((i6 & 65536) != 0) {
                        }
                        if ((i6 & i8) != 0) {
                        }
                        if ((i6 & 262144) != 0) {
                        }
                        if ((i6 & 524288) != 0) {
                        }
                        i13 = i6 & 1048576;
                        if (i13 != 0) {
                        }
                        if ((i10 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i9 = i7;
                    if ((i6 & 128) != 0) {
                    }
                    if ((i6 & 256) == 0) {
                    }
                    i10 = i9;
                    if ((i6 & 512) != 0) {
                    }
                    if ((i6 & 1024) != 0) {
                    }
                    int i14222 = i11;
                    if ((i6 & 2048) != 0) {
                    }
                    if ((i6 & 4096) == 0) {
                    }
                    if ((i6 & 8192) == 0) {
                    }
                    if ((i6 & 16384) == 0) {
                    }
                    if ((32768 & i6) != 0) {
                    }
                    if ((i6 & 65536) != 0) {
                    }
                    if ((i6 & i8) != 0) {
                    }
                    if ((i6 & 262144) != 0) {
                    }
                    if ((i6 & 524288) != 0) {
                    }
                    i13 = i6 & 1048576;
                    if (i13 != 0) {
                    }
                    if ((i10 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i8 = 131072;
                if ((i6 & 32) == 0) {
                }
                if ((i6 & 64) == 0) {
                }
                i9 = i7;
                if ((i6 & 128) != 0) {
                }
                if ((i6 & 256) == 0) {
                }
                i10 = i9;
                if ((i6 & 512) != 0) {
                }
                if ((i6 & 1024) != 0) {
                }
                int i142222 = i11;
                if ((i6 & 2048) != 0) {
                }
                if ((i6 & 4096) == 0) {
                }
                if ((i6 & 8192) == 0) {
                }
                if ((i6 & 16384) == 0) {
                }
                if ((32768 & i6) != 0) {
                }
                if ((i6 & 65536) != 0) {
                }
                if ((i6 & i8) != 0) {
                }
                if ((i6 & 262144) != 0) {
                }
                if ((i6 & 524288) != 0) {
                }
                i13 = i6 & 1048576;
                if (i13 != 0) {
                }
                if ((i10 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i6 & 4) != 0) {
            }
            if ((i6 & 8) != 0) {
            }
            if ((i6 & 16) != 0) {
            }
            i8 = 131072;
            if ((i6 & 32) == 0) {
            }
            if ((i6 & 64) == 0) {
            }
            i9 = i7;
            if ((i6 & 128) != 0) {
            }
            if ((i6 & 256) == 0) {
            }
            i10 = i9;
            if ((i6 & 512) != 0) {
            }
            if ((i6 & 1024) != 0) {
            }
            int i1422222 = i11;
            if ((i6 & 2048) != 0) {
            }
            if ((i6 & 4096) == 0) {
            }
            if ((i6 & 8192) == 0) {
            }
            if ((i6 & 16384) == 0) {
            }
            if ((32768 & i6) != 0) {
            }
            if ((i6 & 65536) != 0) {
            }
            if ((i6 & i8) != 0) {
            }
            if ((i6 & 262144) != 0) {
            }
            if ((i6 & 524288) != 0) {
            }
            i13 = i6 & 1048576;
            if (i13 != 0) {
            }
            if ((i10 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i6 & 2) == 0) {
        }
        if ((i6 & 4) != 0) {
        }
        if ((i6 & 8) != 0) {
        }
        if ((i6 & 16) != 0) {
        }
        i8 = 131072;
        if ((i6 & 32) == 0) {
        }
        if ((i6 & 64) == 0) {
        }
        i9 = i7;
        if ((i6 & 128) != 0) {
        }
        if ((i6 & 256) == 0) {
        }
        i10 = i9;
        if ((i6 & 512) != 0) {
        }
        if ((i6 & 1024) != 0) {
        }
        int i14222222 = i11;
        if ((i6 & 2048) != 0) {
        }
        if ((i6 & 4096) == 0) {
        }
        if ((i6 & 8192) == 0) {
        }
        if ((i6 & 16384) == 0) {
        }
        if ((32768 & i6) != 0) {
        }
        if ((i6 & 65536) != 0) {
        }
        if ((i6 & i8) != 0) {
        }
        if ((i6 & 262144) != 0) {
        }
        if ((i6 & 524288) != 0) {
        }
        i13 = i6 & 1048576;
        if (i13 != 0) {
        }
        if ((i10 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotFloatState2 DraggableSectionItem_Bn9xFrM$lambda$1$lambda$0() {
        return SnapshotFloatState3.mutableFloatStateOf(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job DraggableSectionItem_Bn9xFrM$lambda$5$lambda$4(Function3 function3, Object obj, List reorderedItems, Duration duration) {
        Intrinsics.checkNotNullParameter(reorderedItems, "reorderedItems");
        return (Job) function3.invoke(obj, reorderedItems, duration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DraggableSectionItem_Bn9xFrM$lambda$9(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DraggableItemWrapperV2(final int i, final int i2, final Object obj, final DragStateV2 dragStateV2, final boolean z, Modifier modifier, final Function4<? super Boolean, ? super Boolean, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        boolean zChanged;
        Object objRememberedValue;
        boolean zBooleanValue;
        boolean zChanged2;
        Object objRememberedValue2;
        long jM8047getZeronOccac;
        final long jDraggableItemWrapperV2$lambda$16;
        SnapshotState4<IntOffset> snapshotState4M4813animateIntOffsetAsStateHyPO7BM;
        boolean zChanged3;
        Object objRememberedValue3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1774946204);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(obj) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(dragStateV2) ? 2048 : 1024;
        }
        if ((i4 & 16) != 0) {
            i5 |= 24576;
        } else if ((i3 & 24576) == 0) {
            i5 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        int i6 = i4 & 32;
        if (i6 == 0) {
            if ((196608 & i3) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((i4 & 64) == 0) {
                i5 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                i5 |= composerStartRestartGroup.changedInstance(function4) ? 1048576 : 524288;
            }
            if ((599187 & i5) != 599186 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1774946204, i5, -1, "com.robinhood.utils.compose.reorderable.DraggableItemWrapperV2 (ReorderableLazyListScopeImplV2.kt:314)");
                }
                DraggableItem dragItem$lib_utils_compose_externalDebug = dragStateV2.getDragItem$lib_utils_compose_externalDebug();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(dragItem$lib_utils_compose_externalDebug);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    DraggableItem dragItem$lib_utils_compose_externalDebug2 = dragStateV2.getDragItem$lib_utils_compose_externalDebug();
                    objRememberedValue = Boolean.valueOf(dragItem$lib_utils_compose_externalDebug2 == null && dragItem$lib_utils_compose_externalDebug2.getGroupId() == i2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Boolean bool = (Boolean) objRememberedValue;
                zBooleanValue = bool.booleanValue();
                composerStartRestartGroup.endReplaceGroup();
                DraggableItem dragItem$lib_utils_compose_externalDebug3 = dragStateV2.getDragItem$lib_utils_compose_externalDebug();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged2 = composerStartRestartGroup.changed(dragItem$lib_utils_compose_externalDebug3);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    DraggableItem dragItem$lib_utils_compose_externalDebug4 = dragStateV2.getDragItem$lib_utils_compose_externalDebug();
                    objRememberedValue2 = Boolean.valueOf(dragItem$lib_utils_compose_externalDebug4 == null && dragItem$lib_utils_compose_externalDebug4.getGroupId() == i2 && dragItem$lib_utils_compose_externalDebug4.getIndexInGroup() == i);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Boolean bool2 = (Boolean) objRememberedValue2;
                boolean zBooleanValue2 = bool2.booleanValue();
                composerStartRestartGroup.endReplaceGroup();
                if (!zBooleanValue) {
                    jM8047getZeronOccac = dragStateV2.m26614calculateTargetOffsetiSbpLlY(i2, i);
                } else {
                    jM8047getZeronOccac = IntOffset.INSTANCE.m8047getZeronOccac();
                }
                Modifier modifier5 = modifier4;
                jDraggableItemWrapperV2$lambda$16 = jM8047getZeronOccac;
                snapshotState4M4813animateIntOffsetAsStateHyPO7BM = AnimateAsState.m4813animateIntOffsetAsStateHyPO7BM(jDraggableItemWrapperV2$lambda$16, null, obj + " offset", null, composerStartRestartGroup, 0, 10);
                if (z && zBooleanValue && !zBooleanValue2) {
                    jDraggableItemWrapperV2$lambda$16 = DraggableItemWrapperV2$lambda$16(snapshotState4M4813animateIntOffsetAsStateHyPO7BM);
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged3 = composerStartRestartGroup.changed(jDraggableItemWrapperV2$lambda$16);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2Kt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return ReorderableLazyListScopeImplV2Kt.DraggableItemWrapperV2$lambda$18$lambda$17(jDraggableItemWrapperV2$lambda$16, (Density) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierZIndex = ZIndexModifier2.zIndex(OffsetKt.offset(modifier5, (Function1) objRememberedValue3), !zBooleanValue2 ? 1.0f : 0.0f);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierZIndex);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function4.invoke(bool2, bool, composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 896));
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2Kt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return ReorderableLazyListScopeImplV2Kt.DraggableItemWrapperV2$lambda$20(i, i2, obj, dragStateV2, z, modifier3, function4, i3, i4, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 196608;
        modifier2 = modifier;
        if ((i4 & 64) == 0) {
        }
        if ((599187 & i5) != 599186) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            DraggableItem dragItem$lib_utils_compose_externalDebug5 = dragStateV2.getDragItem$lib_utils_compose_externalDebug();
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(dragItem$lib_utils_compose_externalDebug5);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                DraggableItem dragItem$lib_utils_compose_externalDebug22 = dragStateV2.getDragItem$lib_utils_compose_externalDebug();
                if (dragItem$lib_utils_compose_externalDebug22 == null) {
                    objRememberedValue = Boolean.valueOf(dragItem$lib_utils_compose_externalDebug22 == null && dragItem$lib_utils_compose_externalDebug22.getGroupId() == i2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    Boolean bool3 = (Boolean) objRememberedValue;
                    zBooleanValue = bool3.booleanValue();
                    composerStartRestartGroup.endReplaceGroup();
                    DraggableItem dragItem$lib_utils_compose_externalDebug32 = dragStateV2.getDragItem$lib_utils_compose_externalDebug();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged2 = composerStartRestartGroup.changed(dragItem$lib_utils_compose_externalDebug32);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2) {
                        DraggableItem dragItem$lib_utils_compose_externalDebug42 = dragStateV2.getDragItem$lib_utils_compose_externalDebug();
                        if (dragItem$lib_utils_compose_externalDebug42 == null) {
                            objRememberedValue2 = Boolean.valueOf(dragItem$lib_utils_compose_externalDebug42 == null && dragItem$lib_utils_compose_externalDebug42.getGroupId() == i2 && dragItem$lib_utils_compose_externalDebug42.getIndexInGroup() == i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            Boolean bool22 = (Boolean) objRememberedValue2;
                            boolean zBooleanValue22 = bool22.booleanValue();
                            composerStartRestartGroup.endReplaceGroup();
                            if (!zBooleanValue) {
                            }
                            Modifier modifier52 = modifier4;
                            jDraggableItemWrapperV2$lambda$16 = jM8047getZeronOccac;
                            snapshotState4M4813animateIntOffsetAsStateHyPO7BM = AnimateAsState.m4813animateIntOffsetAsStateHyPO7BM(jDraggableItemWrapperV2$lambda$16, null, obj + " offset", null, composerStartRestartGroup, 0, 10);
                            if (z) {
                                jDraggableItemWrapperV2$lambda$16 = DraggableItemWrapperV2$lambda$16(snapshotState4M4813animateIntOffsetAsStateHyPO7BM);
                            }
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            zChanged3 = composerStartRestartGroup.changed(jDraggableItemWrapperV2$lambda$16);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged3) {
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2Kt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return ReorderableLazyListScopeImplV2Kt.DraggableItemWrapperV2$lambda$18$lambda$17(jDraggableItemWrapperV2$lambda$16, (Density) obj2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierZIndex2 = ZIndexModifier2.zIndex(OffsetKt.offset(modifier52, (Function1) objRememberedValue3), !zBooleanValue22 ? 1.0f : 0.0f);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierZIndex2);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting()) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    function4.invoke(bool22, bool3, composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 896));
                                    composerStartRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier52;
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset DraggableItemWrapperV2$lambda$18$lambda$17(long j, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m8030boximpl(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SubCompose(final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super C2002Dp, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1897284181);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1897284181, i2, -1, "com.robinhood.utils.compose.reorderable.SubCompose (ReorderableLazyListScopeImplV2.kt:347)");
            }
            final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChanged = ((i2 & 112) == 32) | ((i2 & 14) == 4) | composerStartRestartGroup.changed(density);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2Kt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ReorderableLazyListScopeImplV2Kt.SubCompose$lambda$26$lambda$25(function2, function3, density, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) objRememberedValue, composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2Kt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReorderableLazyListScopeImplV2Kt.SubCompose$lambda$27(function2, function3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult SubCompose$lambda$26$lambda$25(Function2 function2, final Function3 function3, final Density density, final SubcomposeMeasureScope SubcomposeLayout, final Constraints constraints) {
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        List<Measurable> listSubcompose = SubcomposeLayout.subcompose(SlotsEnum.MAIN, function2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubcompose, 10));
        Iterator<T> it = listSubcompose.iterator();
        while (it.hasNext()) {
            arrayList.add(((Measurable) it.next()).mo7239measureBRTryo0(constraints.getValue()));
        }
        Iterator it2 = arrayList.iterator();
        final int height = 0;
        while (it2.hasNext()) {
            height += ((Placeable) it2.next()).getHeight();
        }
        return MeasureScope.layout$default(SubcomposeLayout, 0, 0, null, new Function1() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2Kt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReorderableLazyListScopeImplV2Kt.SubCompose$lambda$26$lambda$25$lambda$24(SubcomposeLayout, function3, density, height, constraints, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubCompose$lambda$26$lambda$25$lambda$24(SubcomposeMeasureScope subcomposeMeasureScope, final Function3 function3, final Density density, final int i, Constraints constraints, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Iterator<T> it = subcomposeMeasureScope.subcompose(SlotsEnum.DEPENDENT, ComposableLambda3.composableLambdaInstance(-898394742, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2Kt$SubCompose$1$1$1$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i2) {
                if ((i2 & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-898394742, i2, -1, "com.robinhood.utils.compose.reorderable.SubCompose.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReorderableLazyListScopeImplV2.kt:360)");
                }
                function3.invoke(C2002Dp.m7993boximpl(density.mo5013toDpu2uoSUM(i)), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        })).iterator();
        while (it.hasNext()) {
            Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it.next()).mo7239measureBRTryo0(constraints.getValue()), 0, 0, 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}
