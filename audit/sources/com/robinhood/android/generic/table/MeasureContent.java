package com.robinhood.android.generic.table;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MeasureContent.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\u001aµ\u0001\u0010\u0014\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042d\u0010\u0010\u001a`\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u00062\u001e\u0010\u0013\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0095\u0001\u0010\u0016\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042d\u0010\u0010\u001a`\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u0006H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/generic/table/GenericCell;", "T", "Lcom/robinhood/android/generic/table/GenericTableData;", "table", "Landroidx/compose/foundation/ScrollState;", "horizontalScrollState", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "cell", "Landroidx/compose/ui/unit/Dp;", "height", "width", "Lcom/robinhood/android/generic/table/DisplayDetails;", "displayDetails", "", "displayCell", "Lkotlin/Function2;", "", "onItemsMeasured", "MeasureItemsForSize", "(Lcom/robinhood/android/generic/table/GenericTableData;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function6;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "GenericTableMeasureItemSizes", "(Lcom/robinhood/android/generic/table/GenericTableData;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function6;Landroidx/compose/runtime/Composer;I)V", "lib-generic-table_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.generic.table.MeasureContentKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class MeasureContent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericTableMeasureItemSizes$lambda$5(GenericTableData genericTableData, ScrollState scrollState, Function6 function6, int i, Composer composer, int i2) {
        GenericTableMeasureItemSizes(genericTableData, scrollState, function6, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MeasureItemsForSize$lambda$0(GenericTableData genericTableData, ScrollState scrollState, Function6 function6, Function4 function4, int i, Composer composer, int i2) {
        MeasureItemsForSize(genericTableData, scrollState, function6, function4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final <T extends GenericCell> void MeasureItemsForSize(final GenericTableData<T> table, final ScrollState horizontalScrollState, final Function6<? super T, ? super C2002Dp, ? super C2002Dp, ? super DisplayDetails, ? super Composer, ? super Integer, Unit> displayCell, final Function4<? super List<C2002Dp>, ? super C2002Dp, ? super Composer, ? super Integer, Unit> onItemsMeasured, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(horizontalScrollState, "horizontalScrollState");
        Intrinsics.checkNotNullParameter(displayCell, "displayCell");
        Intrinsics.checkNotNullParameter(onItemsMeasured, "onItemsMeasured");
        Composer composerStartRestartGroup = composer.startRestartGroup(396819141);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(table) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(horizontalScrollState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(displayCell) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onItemsMeasured) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(396819141, i2, -1, "com.robinhood.android.generic.table.MeasureItemsForSize (MeasureContent.kt:15)");
            }
            UtilsKt.m14981SubComposeBJOXQ(null, ComposableLambda3.rememberComposableLambda(756288773, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.generic.table.MeasureContentKt.MeasureItemsForSize.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(756288773, i3, -1, "com.robinhood.android.generic.table.MeasureItemsForSize.<anonymous> (MeasureContent.kt:19)");
                    }
                    MeasureContent.GenericTableMeasureItemSizes(table, horizontalScrollState, displayCell, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), onItemsMeasured, composerStartRestartGroup, ((i2 >> 3) & 896) | 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.generic.table.MeasureContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MeasureContent.MeasureItemsForSize$lambda$0(table, horizontalScrollState, displayCell, onItemsMeasured, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    public static final <T extends GenericCell> void GenericTableMeasureItemSizes(final GenericTableData<T> genericTableData, ScrollState scrollState, Function6<? super T, ? super C2002Dp, ? super C2002Dp, ? super DisplayDetails, ? super Composer, ? super Integer, Unit> function6, Composer composer, final int i) {
        final ScrollState scrollState2;
        Composer composer2;
        final Function6<? super T, ? super C2002Dp, ? super C2002Dp, ? super DisplayDetails, ? super Composer, ? super Integer, Unit> function62;
        ScrollState scrollState3;
        Function6<? super T, ? super C2002Dp, ? super C2002Dp, ? super DisplayDetails, ? super Composer, ? super Integer, Unit> function63;
        Composer composer3;
        ScrollState scrollState4 = scrollState;
        Function6<? super T, ? super C2002Dp, ? super C2002Dp, ? super DisplayDetails, ? super Composer, ? super Integer, Unit> function64 = function6;
        Composer composerStartRestartGroup = composer.startRestartGroup(835797208);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(genericTableData) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(scrollState4) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function64) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(835797208, i3, -1, "com.robinhood.android.generic.table.GenericTableMeasureItemSizes (MeasureContent.kt:30)");
            }
            if (genericTableData.getValidTable()) {
                ?? r12 = 0;
                int i4 = 0;
                for (T t : genericTableData.getHeaders()) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    T t2 = t;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.generic.table.MeasureContentKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MeasureContent.GenericTableMeasureItemSizes$lambda$4$lambda$2$lambda$1((SemanticsPropertyReceiver) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierClearAndSetSemantics = SemanticsModifier6.clearAndSetSemantics(companion, (Function1) objRememberedValue);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r12);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, r12);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierClearAndSetSemantics);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    int i6 = i4;
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i7 = (57344 & (i3 << 6)) | 432;
                    Composer composer4 = composerStartRestartGroup;
                    function6.invoke(t2, null, null, new DisplayDetails(0, i6, true, false, scrollState4), composer4, Integer.valueOf(i7));
                    ColumnWidthMeasure<T> columnWidthMeasure = genericTableData.getCellsForColumnWidthEstimate().get(i6);
                    function6.invoke(columnWidthMeasure.getParentCell(), null, null, new DisplayDetails(columnWidthMeasure.getParentRowIndex(), i6, true, false, scrollState), composer4, Integer.valueOf(i7));
                    composer4.startReplaceGroup(-807159622);
                    if (columnWidthMeasure.getChildCell() == null || columnWidthMeasure.getChildRowIndex() == null) {
                        scrollState3 = scrollState;
                        function63 = function6;
                        composer3 = composer4;
                    } else {
                        GenericCell childCell = columnWidthMeasure.getChildCell();
                        DisplayDetails displayDetails = new DisplayDetails(columnWidthMeasure.getChildRowIndex().intValue(), i6, true, false, scrollState);
                        scrollState3 = scrollState;
                        composer3 = composer4;
                        function63 = function6;
                        function63.invoke(childCell, null, null, displayDetails, composer3, Integer.valueOf(i7));
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    ScrollState scrollState5 = scrollState3;
                    composerStartRestartGroup = composer3;
                    scrollState4 = scrollState5;
                    function64 = function63;
                    i4 = i5;
                    r12 = 0;
                }
            }
            Composer composer5 = composerStartRestartGroup;
            scrollState2 = scrollState4;
            composer2 = composer5;
            function62 = function64;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            scrollState2 = scrollState4;
            composer2 = composerStartRestartGroup;
            function62 = function64;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.generic.table.MeasureContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MeasureContent.GenericTableMeasureItemSizes$lambda$5(genericTableData, scrollState2, function62, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericTableMeasureItemSizes$lambda$4$lambda$2$lambda$1(SemanticsPropertyReceiver clearAndSetSemantics) {
        Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
        return Unit.INSTANCE;
    }
}
