package com.robinhood.android.futures.detail.p140ui.chart;

import android.os.Parcelable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.charts.ModifiersKt;
import com.robinhood.android.charts.Placeholders2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.sdui.chartgroup.SduiChartMappersKt;
import com.robinhood.android.sdui.chartgroup.SduiCursorData2;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.ChartFill;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.Point;
import com.robinhood.store.futures.ChartType;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FuturesDetailChart.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a_\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"FuturesDetailChart", "", "chart", "Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "Landroid/os/Parcelable;", "scrubbedPoint", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "chartType", "Lcom/robinhood/store/futures/ChartType;", "lineRevealAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "onChartScrubbed", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/Chart;Lcom/robinhood/models/serverdriven/experimental/api/Point;Lcom/robinhood/store/futures/ChartType;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-futures-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesDetailChart {

    /* compiled from: FuturesDetailChart.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChartType.values().length];
            try {
                iArr[ChartType.LINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChartType.CANDLESTICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesDetailChart$lambda$10(Chart chart, Point point, ChartType chartType, AnimationSpec animationSpec, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FuturesDetailChart(chart, point, chartType, animationSpec, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FuturesDetailChart(final Chart<? extends Parcelable> chart, final Point point, final ChartType chartType, final AnimationSpec<Float> animationSpec, final Function1<? super Point, Unit> onChartScrubbed, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier modifier3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        Intrinsics.checkNotNullParameter(onChartScrubbed, "onChartScrubbed");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1189421730);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(chart) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(point) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(chartType.ordinal()) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(animationSpec) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onChartScrubbed) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
                if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                } else {
                    Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1189421730, i3, -1, "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChart (FuturesDetailChart.kt:26)");
                    }
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor);
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    SduiCursorData2.SduiLabelTrack(null, point, composerStartRestartGroup, i3 & 112, 1);
                    if (chart == null) {
                        composerStartRestartGroup.startReplaceGroup(-1637873234);
                        int i5 = WhenMappings.$EnumSwitchMapping$0[chartType.ordinal()];
                        if (i5 == 1) {
                            Modifier modifier6 = modifier5;
                            composerStartRestartGroup.startReplaceGroup(-1637831229);
                            List<Line> lines = chart.getLines();
                            List<ChartFill> fills = chart.getFills();
                            List overlays = chart.getOverlays();
                            if (overlays == null) {
                                overlays = CollectionsKt.emptyList();
                            }
                            SduiActionHandler.NotImplemented notImplemented = SduiActionHandler.NotImplemented.INSTANCE;
                            Modifier modifierFullWidthChartSize = ModifiersKt.fullWidthChartSize(Modifier.INSTANCE);
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            int i6 = 57344 & i3;
                            boolean z = i6 == 16384;
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return FuturesDetailChart.FuturesDetailChart$lambda$9$lambda$1$lambda$0(onChartScrubbed, (List) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            Function1 function1 = (Function1) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            boolean z2 = i6 == 16384;
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return FuturesDetailChart.FuturesDetailChart$lambda$9$lambda$3$lambda$2(onChartScrubbed);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            Function0 function0 = (Function0) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            int i7 = ((i3 << 6) & 458752) | (SduiActionHandler.NotImplemented.$stable << 12);
                            composerStartRestartGroup.startReplaceGroup(977840936);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            modifier3 = modifier6;
                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1<com.robinhood.android.charts.model.Point, Unit>() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartKt$FuturesDetailChart$lambda$9$$inlined$SduiSegmentedLineChart$1
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(com.robinhood.android.charts.model.Point it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(com.robinhood.android.charts.model.Point point2) {
                                        invoke2(point2);
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            int i8 = i7 >> 6;
                            SduiChartMappersKt.SduiSegmentedLineChart(modifierFullWidthChartSize, fills, lines, overlays, notImplemented, (Function1) objRememberedValue3, function1, function0, false, true, animationSpec, 0.0f, Parcelable.class, composerStartRestartGroup, (65534 & i7) | (i8 & 458752) | (i8 & 3670016) | (i8 & 29360128) | ((i7 << 9) & 1879048192), (i7 >> 15) & 14, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endReplaceGroup();
                            Unit unit = Unit.INSTANCE;
                        } else {
                            if (i5 != 2) {
                                composerStartRestartGroup.startReplaceGroup(501355132);
                                composerStartRestartGroup.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composerStartRestartGroup.startReplaceGroup(-1637051362);
                            List<ChartFill> fills2 = chart.getFills();
                            Modifier modifier7 = modifier5;
                            List<Line> lines2 = chart.getLines();
                            Set<String> setKeySet = chart.getLegend_data().keySet();
                            LinkedHashSet linkedHashSet = setKeySet instanceof Collection ? new LinkedHashSet(setKeySet.size()) : new LinkedHashSet();
                            Iterator<T> it = setKeySet.iterator();
                            while (it.hasNext()) {
                                linkedHashSet.add(Float.valueOf(Float.parseFloat((String) it.next())));
                            }
                            Set setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
                            Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
                            SduiActionHandler.NotImplemented notImplemented2 = SduiActionHandler.NotImplemented.INSTANCE;
                            Modifier modifierFullWidthChartSize2 = ModifiersKt.fullWidthChartSize(Modifier.INSTANCE);
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            int i9 = i3 & 57344;
                            boolean z3 = i9 == 16384;
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (z3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return FuturesDetailChart.FuturesDetailChart$lambda$9$lambda$6$lambda$5(onChartScrubbed, (List) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            Function1 function12 = (Function1) objRememberedValue4;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            boolean z4 = i9 == 16384;
                            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (z4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return FuturesDetailChart.FuturesDetailChart$lambda$9$lambda$8$lambda$7(onChartScrubbed);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            SduiChartMappersKt.SduiCandlestickChart(modifierFullWidthChartSize2, fills2, lines2, setUnmodifiableSet, notImplemented2, false, function12, (Function0) objRememberedValue5, false, composerStartRestartGroup, SduiActionHandler.NotImplemented.$stable << 12, 288);
                            composerStartRestartGroup.endReplaceGroup();
                            Unit unit2 = Unit.INSTANCE;
                            modifier3 = modifier7;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        modifier3 = modifier5;
                        composerStartRestartGroup.startReplaceGroup(-1636388644);
                        Placeholders2.ChartPlaceholder(ModifiersKt.fullWidthChartSize(Modifier.INSTANCE), false, composerStartRestartGroup, 0, 2);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return FuturesDetailChart.FuturesDetailChart$lambda$10(chart, point, chartType, animationSpec, onChartScrubbed, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            modifier2 = modifier;
            if ((74899 & i3) == 74898) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    SduiCursorData2.SduiLabelTrack(null, point, composerStartRestartGroup, i3 & 112, 1);
                    if (chart == null) {
                    }
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesDetailChart$lambda$9$lambda$1$lambda$0(Function1 function1, List points) {
        Intrinsics.checkNotNullParameter(points, "points");
        function1.invoke(CollectionsKt.lastOrNull(points));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesDetailChart$lambda$9$lambda$3$lambda$2(Function1 function1) {
        function1.invoke(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesDetailChart$lambda$9$lambda$6$lambda$5(Function1 function1, List points) {
        Intrinsics.checkNotNullParameter(points, "points");
        function1.invoke(CollectionsKt.lastOrNull(points));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesDetailChart$lambda$9$lambda$8$lambda$7(Function1 function1) {
        function1.invoke(null);
        return Unit.INSTANCE;
    }
}
