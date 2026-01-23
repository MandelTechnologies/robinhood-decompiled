package com.robinhood.android.lib.performancechart;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.charts.cursor.CursorData;
import com.robinhood.android.charts.cursor.SubDisplayText2;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.models.portfolio.PerformanceChartBenchmarkV2;
import com.robinhood.android.sdui.chartgroup.SduiCursorData2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.Segment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.ImmutableMap3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BenchmarkCursorsRow.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aI\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"BenchmarkCursorsRow", "", "activeBenchmarks", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/models/portfolio/PerformanceChartBenchmarkV2;", "lines", "Lcom/robinhood/models/serverdriven/experimental/api/Line;", "scrubPointState", "Lcom/robinhood/android/charts/model/Point;", "modifier", "Landroidx/compose/ui/Modifier;", "horizontalPadding", "Landroidx/compose/ui/unit/Dp;", "BenchmarkCursorsRow-FJfuzF0", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/charts/model/Point;Landroidx/compose/ui/Modifier;FLandroidx/compose/runtime/Composer;II)V", "lib-performance-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.performancechart.BenchmarkCursorsRowKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class BenchmarkCursorsRow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkCursorsRow_FJfuzF0$lambda$14(ImmutableList immutableList, ImmutableList immutableList2, Point point, Modifier modifier, float f, int i, int i2, Composer composer, int i3) {
        m15840BenchmarkCursorsRowFJfuzF0(immutableList, immutableList2, point, modifier, f, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0136 A[LOOP:3: B:86:0x0130->B:88:0x0136, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0182 A[LOOP:2: B:95:0x017c->B:97:0x0182, LOOP_END] */
    /* renamed from: BenchmarkCursorsRow-FJfuzF0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15840BenchmarkCursorsRowFJfuzF0(final ImmutableList<PerformanceChartBenchmarkV2> activeBenchmarks, final ImmutableList<Line> lines, final Point point, Modifier modifier, float f, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        float f2;
        int i4;
        final float value;
        Modifier modifier3;
        boolean zChanged;
        Object objRememberedValue;
        ImmutableMap3 immutableMap3;
        boolean zChanged2;
        Object objRememberedValue2;
        boolean zChanged3;
        Object objRememberedValue3;
        Iterator it;
        Iterator it2;
        com.robinhood.models.serverdriven.experimental.api.Point closestHorizontalPoint;
        List<Segment> segments;
        Segment segment;
        List<com.robinhood.models.serverdriven.experimental.api.Point> points;
        final ImmutableList immutableList;
        boolean zChangedInstance;
        Object objRememberedValue4;
        Composer composer2;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(activeBenchmarks, "activeBenchmarks");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Composer composerStartRestartGroup = composer.startRestartGroup(1668502622);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(activeBenchmarks) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(lines) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(point) : composerStartRestartGroup.changedInstance(point) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    f2 = f;
                    int i6 = composerStartRestartGroup.changed(f2) ? 16384 : 8192;
                    i3 |= i6;
                } else {
                    f2 = f;
                }
                i3 |= i6;
            } else {
                f2 = f;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i5 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 16) == 0) {
                        Modifier modifier5 = modifier2;
                        i4 = i3 & (-57345);
                        value = ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue();
                        modifier3 = modifier5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1668502622, i4, -1, "com.robinhood.android.lib.performancechart.BenchmarkCursorsRow (BenchmarkCursorsRow.kt:35)");
                    }
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(activeBenchmarks);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(activeBenchmarks, 10)), 16));
                        for (PerformanceChartBenchmarkV2 performanceChartBenchmarkV2 : activeBenchmarks) {
                            linkedHashMap.put(performanceChartBenchmarkV2.getId(), performanceChartBenchmarkV2);
                        }
                        objRememberedValue = extensions2.toPersistentMap(linkedHashMap);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    immutableMap3 = (ImmutableMap3) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged2 = composerStartRestartGroup.changed(lines);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(lines, 10)), 16));
                        for (Line line : lines) {
                            linkedHashMap2.put(line.getIdentifier(), line);
                        }
                        objRememberedValue2 = extensions2.toImmutableMap(linkedHashMap2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    ImmutableMap immutableMap = (ImmutableMap) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChanged3 = composerStartRestartGroup.changed(immutableMap3) | composerStartRestartGroup.changed(immutableMap) | ((i4 & 896) != 256 || ((i4 & 512) != 0 && composerStartRestartGroup.changed(point)));
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        Iterable iterableKeySet = immutableMap3.keySet();
                        ArrayList arrayList = new ArrayList();
                        it = iterableKeySet.iterator();
                        while (it.hasNext()) {
                            Line line2 = (Line) immutableMap.get((String) it.next());
                            if (line2 == null || (closestHorizontalPoint = PerformanceChartReadyComposable.getClosestHorizontalPoint(line2, point)) == null) {
                                closestHorizontalPoint = (line2 == null || (segments = line2.getSegments()) == null || (segment = (Segment) CollectionsKt.last((List) segments)) == null || (points = segment.getPoints()) == null) ? null : (com.robinhood.models.serverdriven.experimental.api.Point) CollectionsKt.last((List) points);
                            }
                            if (closestHorizontalPoint != null) {
                                arrayList.add(closestHorizontalPoint);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            CursorData cursor_data = ((com.robinhood.models.serverdriven.experimental.api.Point) it2.next()).getCursor_data();
                            if (cursor_data != null) {
                                arrayList2.add(cursor_data);
                            }
                        }
                        objRememberedValue3 = extensions2.toImmutableList(arrayList2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    immutableList = (ImmutableList) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance = composerStartRestartGroup.changedInstance(immutableList) | ((((57344 & i4) ^ 24576) <= 16384 && composerStartRestartGroup.changed(value)) || (i4 & 24576) == 16384);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.lib.performancechart.BenchmarkCursorsRowKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return BenchmarkCursorsRow.BenchmarkCursorsRow_FJfuzF0$lambda$13$lambda$12(immutableList, value, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    LazyDslKt.LazyRow(modifier3, null, null, false, null, null, null, false, null, (Function1) objRememberedValue4, composer2, (i4 >> 9) & 14, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                }
                modifier3 = modifier2;
                i4 = i3;
                value = f2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(activeBenchmarks);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(activeBenchmarks, 10)), 16));
                    while (r11.hasNext()) {
                    }
                    objRememberedValue = extensions2.toPersistentMap(linkedHashMap3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    immutableMap3 = (ImmutableMap3) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged2 = composerStartRestartGroup.changed(lines);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2) {
                        LinkedHashMap linkedHashMap22 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(lines, 10)), 16));
                        while (r0.hasNext()) {
                        }
                        objRememberedValue2 = extensions2.toImmutableMap(linkedHashMap22);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        ImmutableMap immutableMap2 = (ImmutableMap) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        if ((i4 & 896) != 256) {
                            zChanged3 = composerStartRestartGroup.changed(immutableMap3) | composerStartRestartGroup.changed(immutableMap2) | ((i4 & 896) != 256 || ((i4 & 512) != 0 && composerStartRestartGroup.changed(point)));
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged3) {
                                Iterable iterableKeySet2 = immutableMap3.keySet();
                                ArrayList arrayList3 = new ArrayList();
                                it = iterableKeySet2.iterator();
                                while (it.hasNext()) {
                                }
                                ArrayList arrayList22 = new ArrayList();
                                it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                }
                                objRememberedValue3 = extensions2.toImmutableList(arrayList22);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                immutableList = (ImmutableList) objRememberedValue3;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                if (((57344 & i4) ^ 24576) <= 16384) {
                                    zChangedInstance = composerStartRestartGroup.changedInstance(immutableList) | ((((57344 & i4) ^ 24576) <= 16384 && composerStartRestartGroup.changed(value)) || (i4 & 24576) == 16384);
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance) {
                                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.lib.performancechart.BenchmarkCursorsRowKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return BenchmarkCursorsRow.BenchmarkCursorsRow_FJfuzF0$lambda$13$lambda$12(immutableList, value, (LazyListScope) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        composerStartRestartGroup.endReplaceGroup();
                                        composer2 = composerStartRestartGroup;
                                        LazyDslKt.LazyRow(modifier3, null, null, false, null, null, null, false, null, (Function1) objRememberedValue4, composer2, (i4 >> 9) & 14, 510);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        modifier4 = modifier3;
                                    }
                                } else {
                                    zChangedInstance = composerStartRestartGroup.changedInstance(immutableList) | ((((57344 & i4) ^ 24576) <= 16384 && composerStartRestartGroup.changed(value)) || (i4 & 24576) == 16384);
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance) {
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier4 = modifier2;
                value = f2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.performancechart.BenchmarkCursorsRowKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BenchmarkCursorsRow.BenchmarkCursorsRow_FJfuzF0$lambda$14(activeBenchmarks, lines, point, modifier4, value, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                }
                if ((i2 & 16) == 0) {
                    modifier3 = modifier2;
                    i4 = i3;
                    value = f2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(activeBenchmarks);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkCursorsRow_FJfuzF0$lambda$13$lambda$12(final ImmutableList immutableList, final float f, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        LazyListScope.item$default(LazyRow, null, null, ComposableLambda3.composableLambdaInstance(1405340891, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.performancechart.BenchmarkCursorsRowKt$BenchmarkCursorsRow$1$1$1
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
                    ComposerKt.traceEventStart(1405340891, i, -1, "com.robinhood.android.lib.performancechart.BenchmarkCursorsRow.<anonymous>.<anonymous>.<anonymous> (BenchmarkCursorsRow.kt:55)");
                }
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, f), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        LazyRow.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.lib.performancechart.BenchmarkCursorsRowKt$BenchmarkCursorsRow_FJfuzF0$lambda$13$lambda$12$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                immutableList.get(i);
                return null;
            }
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.performancechart.BenchmarkCursorsRowKt$BenchmarkCursorsRow_FJfuzF0$lambda$13$lambda$12$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                float fM7995constructorimpl;
                CursorData.DisplayText displayTextM11995copybw27NRU$default;
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
                com.robinhood.models.serverdriven.experimental.api.CursorData cursorData = (com.robinhood.models.serverdriven.experimental.api.CursorData) immutableList.get(i);
                composer.startReplaceGroup(1485760921);
                CursorData.SubDisplayText secondaryValue = SduiCursorData2.toComposableModel(cursorData, composer, 0).getSecondaryValue();
                composer.startReplaceGroup(-1614638757);
                if (secondaryValue != null) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composer.startReplaceGroup(-1614635126);
                    if (i <= 0) {
                        fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
                    } else {
                        fM7995constructorimpl = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM();
                    }
                    float f2 = fM7995constructorimpl;
                    composer.endReplaceGroup();
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, f2, 0.0f, 0.0f, 0.0f, 14, null);
                    composer.startReplaceGroup(-1614631226);
                    composer.startReplaceGroup(-1614629282);
                    CursorData.IconDisplayText main = secondaryValue.getMain();
                    TextStyle style = main.getStyle();
                    composer.startReplaceGroup(-1614626624);
                    if (style == null) {
                        style = ((Styles) composer.consume(Styles2.getLocalStyles())).getText(composer, 0).getStyle();
                    }
                    TextStyle textStyle = style;
                    composer.endReplaceGroup();
                    FontWeight.Companion companion2 = FontWeight.INSTANCE;
                    CursorData.IconDisplayText iconDisplayTextM11999copyiJQMabo$default = CursorData.IconDisplayText.m11999copyiJQMabo$default(main, null, 0L, null, null, TextStyle.m7655copyp1EtxEg$default(textStyle, 0L, 0L, companion2.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), 15, null);
                    composer.endReplaceGroup();
                    CursorData.DisplayText description = secondaryValue.getDescription();
                    composer.startReplaceGroup(-1614620053);
                    if (description == null) {
                        displayTextM11995copybw27NRU$default = null;
                    } else {
                        long jM12002getColor0d7_KjU = secondaryValue.getMain().m12002getColor0d7_KjU();
                        TextStyle style2 = description.getStyle();
                        composer.startReplaceGroup(-1505325870);
                        if (style2 == null) {
                            style2 = ((Styles) composer.consume(Styles2.getLocalStyles())).getText(composer, 0).getStyle();
                        }
                        composer.endReplaceGroup();
                        displayTextM11995copybw27NRU$default = CursorData.DisplayText.m11995copybw27NRU$default(description, null, jM12002getColor0d7_KjU, TextStyle.m7655copyp1EtxEg$default(style2, 0L, 0L, companion2.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), 1, null);
                    }
                    CursorData.DisplayText displayText = displayTextM11995copybw27NRU$default;
                    composer.endReplaceGroup();
                    CursorData.SubDisplayText subDisplayTextCopy$default = CursorData.SubDisplayText.copy$default(secondaryValue, iconDisplayTextM11999copyiJQMabo$default, displayText, null, 4, null);
                    composer.endReplaceGroup();
                    SubDisplayText2.SubDisplayText(modifierM5146paddingqDBjuR0$default, subDisplayTextCopy$default, composer, CursorData.SubDisplayText.$stable << 3, 0);
                }
                composer.endReplaceGroup();
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        LazyListScope.item$default(LazyRow, null, null, ComposableLambda3.composableLambdaInstance(-1249113340, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.performancechart.BenchmarkCursorsRowKt$BenchmarkCursorsRow$1$1$3
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
                    ComposerKt.traceEventStart(-1249113340, i, -1, "com.robinhood.android.lib.performancechart.BenchmarkCursorsRow.<anonymous>.<anonymous>.<anonymous> (BenchmarkCursorsRow.kt:79)");
                }
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, f), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        return Unit.INSTANCE;
    }
}
