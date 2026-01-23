package com.robinhood.android.generic.table.layout;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Overscroll4;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.generic.table.DisplayDetails;
import com.robinhood.android.generic.table.GenericCell;
import com.robinhood.android.generic.table.GenericChildRow;
import com.robinhood.android.generic.table.GenericRow;
import com.robinhood.android.generic.table.GenericTableData;
import com.robinhood.android.generic.table.MeasureContent;
import com.robinhood.android.generic.table.Row7;
import com.robinhood.android.generic.table.StickyColumn;
import com.robinhood.android.generic.table.TableScreenFillSettings;
import com.robinhood.android.generic.table.UtilsKt;
import com.robinhood.android.generic.table.layout.GenericTableLayoutContent;
import com.robinhood.android.generic.table.layout.GenericTableLayoutKt;
import com.robinhood.compose.bento.theme.BentoTheme2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GenericTableLayout.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\u001aD\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002"}, m3636d2 = {"GenericTableLayout", "", "modifier", "Landroidx/compose/ui/Modifier;", "verticalScrollState", "Landroidx/compose/foundation/lazy/LazyListState;", "tableScreenFillSettings", "Lcom/robinhood/android/generic/table/TableScreenFillSettings;", "tableContent", "Lkotlin/Function1;", "Lcom/robinhood/android/generic/table/layout/GenericTableLayoutScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Lcom/robinhood/android/generic/table/TableScreenFillSettings;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "GenericTableLayoutPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-generic-table_externalDebug", "layoutKey", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GenericTableLayoutKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericTableLayout$lambda$15(Modifier modifier, LazyListState lazyListState, TableScreenFillSettings tableScreenFillSettings, Function1 function1, int i, int i2, Composer composer, int i3) {
        GenericTableLayout(modifier, lazyListState, tableScreenFillSettings, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericTableLayoutPreview$lambda$16(int i, Composer composer, int i2) {
        GenericTableLayoutPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void GenericTableLayout(Modifier modifier, LazyListState lazyListState, TableScreenFillSettings tableScreenFillSettings, final Function1<? super GenericTableLayoutScope, Unit> tableContent, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        LazyListState lazyListState2;
        LazyListState lazyListStateRememberLazyListState;
        Modifier modifier3;
        LazyListState lazyListState3;
        final Modifier modifier4;
        final LazyListState lazyListState4;
        final TableScreenFillSettings tableScreenFillSettings2 = tableScreenFillSettings;
        Intrinsics.checkNotNullParameter(tableContent, "tableContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(515956344);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListState2 = lazyListState;
                int i5 = composerStartRestartGroup.changed(lazyListState2) ? 32 : 16;
                i3 |= i5;
            } else {
                lazyListState2 = lazyListState;
            }
            i3 |= i5;
        } else {
            lazyListState2 = lazyListState;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(tableScreenFillSettings2) : composerStartRestartGroup.changedInstance(tableScreenFillSettings2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(tableContent) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier4 = modifier2;
            lazyListState4 = lazyListState2;
        } else {
            composerStartRestartGroup.startDefaults();
            int i7 = 0;
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier modifier5 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i6 != 0) {
                    tableScreenFillSettings2 = TableScreenFillSettings.Default.INSTANCE;
                }
                modifier3 = modifier5;
                lazyListState3 = lazyListStateRememberLazyListState;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                modifier3 = modifier2;
                lazyListState3 = lazyListState2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(515956344, i3, -1, "com.robinhood.android.generic.table.layout.GenericTableLayout (GenericTableLayout.kt:56)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (i3 & 7168) == 2048;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new GenericTableLayoutScope2();
                tableContent.invoke(objRememberedValue);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final GenericTableLayoutScope2 genericTableLayoutScope2 = (GenericTableLayoutScope2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Object objKeySet = genericTableLayoutScope2.getTables().keySet();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(objKeySet);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.generic.table.layout.GenericTableLayoutKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GenericTableLayoutKt.GenericTableLayout$lambda$3$lambda$2(genericTableLayoutScope2);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Object[] objArr = new Object[0];
            Saver<SnapshotStateMap<String, TableSizing>, List<Tuples3<String, List<Float>, Float>>> tableSizingSaver = Saver6.getTableSizingSaver();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.generic.table.layout.GenericTableLayoutKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SnapshotStateKt.mutableStateMapOf();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotStateMap snapshotStateMap = (SnapshotStateMap) RememberSaveable.m6426rememberSaveable(objArr, (Saver) tableSizingSaver, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 3072, 4);
            String strGenericTableLayout$lambda$4 = GenericTableLayout$lambda$4(snapshotState4);
            Saver<Map<String, ScrollState>, List<Tuples2<String, Integer>>> horizontalScrollStateSaver = Saver6.getHorizontalScrollStateSaver();
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged2 = composerStartRestartGroup.changed(genericTableLayoutScope2);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.generic.table.layout.GenericTableLayoutKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GenericTableLayoutKt.GenericTableLayout$lambda$9$lambda$8(genericTableLayoutScope2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            Map map = (Map) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) horizontalScrollStateSaver, strGenericTableLayout$lambda$4, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
            String strGenericTableLayout$lambda$42 = GenericTableLayout$lambda$4(snapshotState4);
            Saver<SnapshotStateMap<String, Boolean>, List<Tuples2<String, Boolean>>> expandedStateSaver = Saver6.getExpandedStateSaver();
            Object[] objArr3 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged3 = composerStartRestartGroup.changed(genericTableLayoutScope2);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.generic.table.layout.GenericTableLayoutKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GenericTableLayoutKt.GenericTableLayout$lambda$13$lambda$12(genericTableLayoutScope2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) RememberSaveable.m6426rememberSaveable(objArr3, (Saver) expandedStateSaver, strGenericTableLayout$lambda$42, (Function0) objRememberedValue5, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.startReplaceGroup(1912851125);
            Iterator<T> it = genericTableLayoutScope2.getTables().values().iterator();
            while (it.hasNext()) {
                final GenericTableLayoutContent.Table table = (GenericTableLayoutContent.Table) it.next();
                MeasureContent.MeasureItemsForSize(table.getTableData(), (ScrollState) map.getOrDefault(table.getTableId(), new ScrollState(i7)), ComposableLambda3.rememberComposableLambda(-532253773, true, new Function6<?, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit>() { // from class: com.robinhood.android.generic.table.layout.GenericTableLayoutKt$GenericTableLayout$1$1
                    @Override // kotlin.jvm.functions.Function6
                    public /* bridge */ /* synthetic */ Unit invoke(Object obj, C2002Dp c2002Dp, C2002Dp c2002Dp2, DisplayDetails displayDetails, Composer composer2, Integer num) {
                        m14994invokeC8IHX40((GenericCell) obj, c2002Dp, c2002Dp2, displayDetails, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke-C8IHX40, reason: not valid java name */
                    public final void m14994invokeC8IHX40(GenericCell cell, C2002Dp c2002Dp, C2002Dp c2002Dp2, DisplayDetails displayDetails, Composer composer2, int i8) {
                        int i9;
                        Intrinsics.checkNotNullParameter(cell, "cell");
                        Intrinsics.checkNotNullParameter(displayDetails, "displayDetails");
                        if ((i8 & 6) == 0) {
                            i9 = ((i8 & 8) == 0 ? composer2.changed(cell) : composer2.changedInstance(cell) ? 4 : 2) | i8;
                        } else {
                            i9 = i8;
                        }
                        if ((i8 & 48) == 0) {
                            i9 |= composer2.changed(c2002Dp) ? 32 : 16;
                        }
                        if ((i8 & 384) == 0) {
                            i9 |= composer2.changed(c2002Dp2) ? 256 : 128;
                        }
                        if ((i8 & 3072) == 0) {
                            i9 |= composer2.changed(displayDetails) ? 2048 : 1024;
                        }
                        if ((i9 & 9363) == 9362 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-532253773, i9, -1, "com.robinhood.android.generic.table.layout.GenericTableLayout.<anonymous>.<anonymous> (GenericTableLayout.kt:94)");
                        }
                        table.getDisplayCell().invoke(cell, c2002Dp, c2002Dp2, displayDetails, composer2, Integer.valueOf(i9 & 8190));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1008917597, true, new Function4<List<? extends C2002Dp>, C2002Dp, Composer, Integer, Unit>() { // from class: com.robinhood.android.generic.table.layout.GenericTableLayoutKt$GenericTableLayout$1$2
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends C2002Dp> list, C2002Dp c2002Dp, Composer composer2, Integer num) {
                        m14995invokeziNgDLE(list, c2002Dp.getValue(), composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke-ziNgDLE, reason: not valid java name */
                    public final void m14995invokeziNgDLE(List<C2002Dp> widths, float f, Composer composer2, int i8) {
                        Intrinsics.checkNotNullParameter(widths, "widths");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1008917597, i8, -1, "com.robinhood.android.generic.table.layout.GenericTableLayout.<anonymous>.<anonymous> (GenericTableLayout.kt:97)");
                        }
                        snapshotStateMap.put(table.getTableId(), new TableSizing(extensions2.toImmutableList(UtilsKt.adjustColumnWidthsToFillScreen((int) ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composer2.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32)), widths, tableScreenFillSettings2)), f, null));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 3456);
                i7 = 0;
            }
            composerStartRestartGroup.endReplaceGroup();
            CompositionLocal3.CompositionLocalProvider(Overscroll4.getLocalOverscrollFactory().provides(null), ComposableLambda3.rememberComposableLambda(986571192, true, new C177032(modifier3, lazyListState3, genericTableLayoutScope2, snapshotStateMap, map, snapshotStateMap2), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            lazyListState4 = lazyListState3;
        }
        final TableScreenFillSettings tableScreenFillSettings3 = tableScreenFillSettings2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.generic.table.layout.GenericTableLayoutKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GenericTableLayoutKt.GenericTableLayout$lambda$15(modifier4, lazyListState4, tableScreenFillSettings3, tableContent, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GenericTableLayout$lambda$3$lambda$2(GenericTableLayoutScope2 genericTableLayoutScope2) {
        return CollectionsKt.sorted(genericTableLayoutScope2.getTables().keySet()).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map GenericTableLayout$lambda$9$lambda$8(GenericTableLayoutScope2 genericTableLayoutScope2) {
        Set<String> setKeySet = genericTableLayoutScope2.getTables().keySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setKeySet, 10)), 16));
        for (Object obj : setKeySet) {
            linkedHashMap.put(obj, new ScrollState(0));
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotStateMap GenericTableLayout$lambda$13$lambda$12(GenericTableLayoutScope2 genericTableLayoutScope2) {
        SnapshotStateMap snapshotStateMapMutableStateMapOf = SnapshotStateKt.mutableStateMapOf();
        Set<String> setKeySet = genericTableLayoutScope2.getTables().keySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setKeySet, 10)), 16));
        for (Object obj : setKeySet) {
            linkedHashMap.put(obj, Boolean.FALSE);
        }
        snapshotStateMapMutableStateMapOf.putAll(linkedHashMap);
        return snapshotStateMapMutableStateMapOf;
    }

    private static final String GenericTableLayout$lambda$4(SnapshotState4<String> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: GenericTableLayout.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.generic.table.layout.GenericTableLayoutKt$GenericTableLayout$2 */
    static final class C177032 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotStateMap<String, Boolean> $expandedState;
        final /* synthetic */ Map<String, ScrollState> $horizontalScrollStates;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ GenericTableLayoutScope2 $tableLayoutScopeImpl;
        final /* synthetic */ SnapshotStateMap<String, TableSizing> $tableSizes;
        final /* synthetic */ LazyListState $verticalScrollState;

        C177032(Modifier modifier, LazyListState lazyListState, GenericTableLayoutScope2 genericTableLayoutScope2, SnapshotStateMap<String, TableSizing> snapshotStateMap, Map<String, ScrollState> map, SnapshotStateMap<String, Boolean> snapshotStateMap2) {
            this.$modifier = modifier;
            this.$verticalScrollState = lazyListState;
            this.$tableLayoutScopeImpl = genericTableLayoutScope2;
            this.$tableSizes = snapshotStateMap;
            this.$horizontalScrollStates = map;
            this.$expandedState = snapshotStateMap2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(986571192, i, -1, "com.robinhood.android.generic.table.layout.GenericTableLayout.<anonymous> (GenericTableLayout.kt:115)");
            }
            Modifier modifier = this.$modifier;
            LazyListState lazyListState = this.$verticalScrollState;
            composer.startReplaceGroup(-1224400529);
            boolean zChanged = composer.changed(this.$tableLayoutScopeImpl) | composer.changed(this.$tableSizes) | composer.changedInstance(this.$horizontalScrollStates) | composer.changed(this.$expandedState);
            final GenericTableLayoutScope2 genericTableLayoutScope2 = this.$tableLayoutScopeImpl;
            final SnapshotStateMap<String, TableSizing> snapshotStateMap = this.$tableSizes;
            final Map<String, ScrollState> map = this.$horizontalScrollStates;
            final SnapshotStateMap<String, Boolean> snapshotStateMap2 = this.$expandedState;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.generic.table.layout.GenericTableLayoutKt$GenericTableLayout$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GenericTableLayoutKt.C177032.invoke$lambda$10$lambda$9(genericTableLayoutScope2, snapshotStateMap, map, snapshotStateMap2, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifier, lazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$9(GenericTableLayoutScope2 genericTableLayoutScope2, SnapshotStateMap snapshotStateMap, Map map, final SnapshotStateMap snapshotStateMap2, LazyListScope lazyListScope) {
            GenericRow genericRow;
            List cells;
            LazyListScope LazyColumn = lazyListScope;
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            for (final GenericTableLayoutContent genericTableLayoutContent : genericTableLayoutScope2.getContent()) {
                if (genericTableLayoutContent instanceof GenericTableLayoutContent.Item) {
                    LazyListScope.item$default(LazyColumn, ((GenericTableLayoutContent.Item) genericTableLayoutContent).getKey(), null, ComposableLambda3.composableLambdaInstance(-1695525366, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.generic.table.layout.GenericTableLayoutKt$GenericTableLayout$2$1$1$1$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                            invoke(lazyItemScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope item, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(item, "$this$item");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1695525366, i, -1, "com.robinhood.android.generic.table.layout.GenericTableLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GenericTableLayout.kt:120)");
                            }
                            ((GenericTableLayoutContent.Item) genericTableLayoutContent).getDisplay().invoke(composer, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 2, null);
                } else {
                    if (!(genericTableLayoutContent instanceof GenericTableLayoutContent.Table)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    final GenericTableLayoutContent.Table table = (GenericTableLayoutContent.Table) genericTableLayoutContent;
                    final TableSizing tableSizing = (TableSizing) snapshotStateMap.get(table.getTableId());
                    GenericTableData tableData = table.getTableData();
                    final ScrollState scrollState = (ScrollState) map.get(table.getTableId());
                    final Boolean bool = (Boolean) snapshotStateMap2.get(table.getTableId());
                    ImmutableList rows = tableData.getRows();
                    int iIntValue = (table.getDisplayLimit() != null && tableData.getRows().size() >= table.getDisplayLimit().intValue()) ? table.getDisplayLimit().intValue() : tableData.getRows().size();
                    final List listTake = CollectionsKt.take(rows, iIntValue);
                    if (tableSizing != null && tableSizing.getValid() && scrollState != null && tableData.getValidTable() && bool != null && tableSizing.getColumnWidths().size() == tableData.getHeaders().size() && (genericRow = (GenericRow) CollectionsKt.firstOrNull((List) tableData.getRows())) != null && (cells = genericRow.getCells()) != null && tableSizing.getColumnWidths().size() == cells.size()) {
                        C2002Dp c2002DpM14991getOverrideHeaderHeightlTKBWiU = table.m14991getOverrideHeaderHeightlTKBWiU();
                        float value = c2002DpM14991getOverrideHeaderHeightlTKBWiU != null ? c2002DpM14991getOverrideHeaderHeightlTKBWiU.getValue() : tableSizing.m15005getRowHeightD9Ej5fM();
                        String str = "header-" + table.getTableId();
                        ComposableLambda composableLambdaComposableLambdaInstance = ComposableLambda3.composableLambdaInstance(-798198586, true, new GenericTableLayoutKt$GenericTableLayout$2$1$1$1$2$1(tableSizing, value, table, tableData, scrollState, bool, snapshotStateMap2));
                        LazyColumn = lazyListScope;
                        LazyListScope.stickyHeader$default(LazyColumn, str, null, composableLambdaComposableLambdaInstance, 2, null);
                        final Function2 function2 = new Function2() { // from class: com.robinhood.android.generic.table.layout.GenericTableLayoutKt$GenericTableLayout$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return GenericTableLayoutKt.C177032.invoke$lambda$10$lambda$9$lambda$8$lambda$7$lambda$0(table, ((Integer) obj).intValue(), (GenericRow) obj2);
                            }
                        };
                        LazyColumn.items(listTake.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.generic.table.layout.GenericTableLayoutKt$GenericTableLayout$2$invoke$lambda$10$lambda$9$lambda$8$lambda$7$$inlined$itemsIndexed$default$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                return invoke(num.intValue());
                            }

                            public final Object invoke(int i) {
                                return function2.invoke(Integer.valueOf(i), listTake.get(i));
                            }
                        }, new Function1<Integer, Object>() { // from class: com.robinhood.android.generic.table.layout.GenericTableLayoutKt$GenericTableLayout$2$invoke$lambda$10$lambda$9$lambda$8$lambda$7$$inlined$itemsIndexed$default$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                return invoke(num.intValue());
                            }

                            public final Object invoke(int i) {
                                listTake.get(i);
                                return null;
                            }
                        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.generic.table.layout.GenericTableLayoutKt$GenericTableLayout$2$invoke$lambda$10$lambda$9$lambda$8$lambda$7$$inlined$itemsIndexed$default$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(4);
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                                int i3;
                                Modifier modifier;
                                if ((i2 & 6) == 0) {
                                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                                } else {
                                    i3 = i2;
                                }
                                if ((i2 & 48) == 0) {
                                    i3 |= composer.changed(i) ? 32 : 16;
                                }
                                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                                }
                                Object obj = listTake.get(i);
                                int i4 = i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
                                final GenericRow genericRow2 = (GenericRow) obj;
                                composer.startReplaceGroup(1819127558);
                                ImmutableList immutableList = extensions2.toImmutableList(genericRow2.getChildRows());
                                Intrinsics.checkNotNull(immutableList, "null cannot be cast to non-null type kotlinx.collections.immutable.ImmutableList<com.robinhood.android.generic.table.GenericChildRow<com.robinhood.android.generic.table.GenericCell>>");
                                ImmutableList<C2002Dp> columnWidths = tableSizing.getColumnWidths();
                                float fM15005getRowHeightD9Ej5fM = tableSizing.m15005getRowHeightD9Ej5fM();
                                Function6<GenericCell, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit> displayCell = table.getDisplayCell();
                                ImmutableList immutableList2 = extensions2.toImmutableList(genericRow2.getCells());
                                boolean rowExpanded = genericRow2.getRowExpanded();
                                composer.startReplaceGroup(-1049657759);
                                Modifier modifierZIndex = ZIndexModifier2.zIndex(Modifier.INSTANCE, 0.0f);
                                if (table.getAnimateItemPlacement()) {
                                    modifierZIndex = LazyItemScope.animateItem$default(lazyItemScope, modifierZIndex, null, null, null, 7, null);
                                }
                                Modifier modifier2 = modifierZIndex;
                                final Function1<GenericRow<?>, Unit> onRowClicked = table.getOnRowClicked();
                                if (onRowClicked != null) {
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zChanged = composer.changed(onRowClicked) | composer.changedInstance(genericRow2);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.generic.table.layout.GenericTableLayoutKt$GenericTableLayout$2$1$1$1$2$3$2$1$1
                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                onRowClicked.invoke(genericRow2);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier2, false, null, null, (Function0) objRememberedValue, 7, null);
                                    modifier = modifierM4893clickableXHw0xAI$default == null ? modifier2 : modifierM4893clickableXHw0xAI$default;
                                }
                                composer.endReplaceGroup();
                                StickyColumn stickyColumnDetails = table.getStickyColumnDetails();
                                ScrollState scrollState2 = scrollState;
                                boolean zBooleanValue = bool.booleanValue();
                                composer.startReplaceGroup(-1746271574);
                                boolean zChanged2 = composer.changed(snapshotStateMap2) | composer.changedInstance(table) | composer.changed(bool);
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    final SnapshotStateMap snapshotStateMap3 = snapshotStateMap2;
                                    final GenericTableLayoutContent.Table table2 = table;
                                    final Boolean bool2 = bool;
                                    objRememberedValue2 = new Function0<Unit>() { // from class: com.robinhood.android.generic.table.layout.GenericTableLayoutKt$GenericTableLayout$2$1$1$1$2$3$3$1
                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            snapshotStateMap3.put(table2.getTableId(), Boolean.valueOf(!bool2.booleanValue()));
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                Function0 function0 = (Function0) objRememberedValue2;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(table);
                                Object objRememberedValue3 = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    final GenericTableLayoutContent.Table table3 = table;
                                    objRememberedValue3 = new Function1<GenericChildRow<?>, Unit>() { // from class: com.robinhood.android.generic.table.layout.GenericTableLayoutKt$GenericTableLayout$2$1$1$1$2$3$4$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(GenericChildRow<?> genericChildRow) {
                                            invoke2(genericChildRow);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(GenericChildRow<?> childRow) {
                                            Intrinsics.checkNotNullParameter(childRow, "childRow");
                                            Function1<GenericChildRow<?>, Unit> onChildRowClicked = table3.getOnChildRowClicked();
                                            if (onChildRowClicked != null) {
                                                onChildRowClicked.invoke(childRow);
                                            }
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue3);
                                }
                                composer.endReplaceGroup();
                                Row7.m14975GenericTableRowuS7v9H0(i, columnWidths, fM15005getRowHeightD9Ej5fM, displayCell, immutableList2, stickyColumnDetails, scrollState2, zBooleanValue, function0, modifier, immutableList, rowExpanded, (Function1) objRememberedValue3, composer, (i4 >> 3) & 14, 0, 0);
                                composer.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                    }
                }
                LazyColumn = lazyListScope;
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invoke$lambda$10$lambda$9$lambda$8$lambda$7$lambda$0(GenericTableLayoutContent.Table table, int i, GenericRow row) {
            Intrinsics.checkNotNullParameter(row, "row");
            return table.getTableId() + row.getKey();
        }
    }

    private static final void GenericTableLayoutPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1734362413);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1734362413, i, -1, "com.robinhood.android.generic.table.layout.GenericTableLayoutPreview (GenericTableLayout.kt:203)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$GenericTableLayoutKt.INSTANCE.m14982getLambda$1786518299$lib_generic_table_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.generic.table.layout.GenericTableLayoutKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GenericTableLayoutKt.GenericTableLayoutPreview$lambda$16(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
