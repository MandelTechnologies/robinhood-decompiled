package com.robinhood.android.investmentstracker.composables.components;

import android.os.Build;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Blur;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentPerformanceGraphDataDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerScrubPointDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerScrubPointMetadataDto;
import bff_money_movement.service.p019v1.Point2DDto;
import com.robinhood.android.charts.ModifiersKt;
import com.robinhood.android.charts.Placeholders2;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.charts.models.p080db.SpanOption;
import com.robinhood.android.charts.overlay.Overlays;
import com.robinhood.android.charts.segmented.SegmentedLine;
import com.robinhood.android.charts.segmented.SegmentedLineChart;
import com.robinhood.android.charts.util.StaleState2;
import com.robinhood.android.investmentstracker.InvestmentsTrackerNativeAction;
import com.robinhood.android.investmentstracker.extensions.GraphExtensions;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerPerformanceChartViewModel;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.sdui.chartgroup.SduiCursorData2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.DisplayText;
import com.robinhood.models.serverdriven.experimental.api.PerformanceChartAction;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: InvestmentsTrackerPerformanceChart.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a]\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00060\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u0016*\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0002¨\u0006\u0019²\u0006\f\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u008a\u008e\u0002²\u0006\f\u0010\u001b\u001a\u0004\u0018\u00010\u0016X\u008a\u008e\u0002"}, m3636d2 = {"getClosestPointForScrub", "Lbff_money_movement/service/v1/InvestmentsTrackerScrubPointDto;", "", "targetPoint", "Lcom/robinhood/android/charts/model/Point;", "InvestmentsTrackerPerformanceChart", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerPerformanceChartViewModel;", "chartActionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/PerformanceChartAction;", "nativeActionHandler", "Lkotlin/Function2;", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerNativeAction;", "", "onScrub", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerPerformanceChartViewModel;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "toLabelTrackPoint", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "text", "", "feature-investments-tracker_externalDebug", "scrubPointState", "labelTrackPoint"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChartKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestmentsTrackerPerformanceChart3 {

    /* compiled from: InvestmentsTrackerPerformanceChart.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChartKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.f5855UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentsTrackerPerformanceChart$lambda$18(InvestmentsTrackerPerformanceChartViewModel investmentsTrackerPerformanceChartViewModel, SduiActionHandler sduiActionHandler, Function2 function2, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InvestmentsTrackerPerformanceChart(investmentsTrackerPerformanceChartViewModel, sduiActionHandler, function2, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final InvestmentsTrackerScrubPointDto getClosestPointForScrub(List<InvestmentsTrackerScrubPointDto> list, Point point) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            Point2DDto point2 = ((InvestmentsTrackerScrubPointDto) next).getPoint();
            if (point2 == null) {
                throw new NullPointerException("Unexpected point value received " + point2);
            }
            double dAbs = Math.abs(point2.getX() - (point != null ? point.getX() : 0.0f)) + Math.abs(point2.getY() - (point != null ? point.getY() : 0.0f));
            do {
                Object next2 = it.next();
                Point2DDto point3 = ((InvestmentsTrackerScrubPointDto) next2).getPoint();
                if (point3 == null) {
                    throw new NullPointerException("Unexpected point value received " + point3);
                }
                double dAbs2 = Math.abs(point3.getX() - (point != null ? point.getX() : 0.0f)) + Math.abs(point3.getY() - (point != null ? point.getY() : 0.0f));
                if (Double.compare(dAbs, dAbs2) > 0) {
                    next = next2;
                    dAbs = dAbs2;
                }
            } while (it.hasNext());
        }
        return (InvestmentsTrackerScrubPointDto) next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0154  */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3, types: [androidx.compose.animation.core.AnimationSpec] */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.ArrayList, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InvestmentsTrackerPerformanceChart(final InvestmentsTrackerPerformanceChartViewModel item, final SduiActionHandler<? super PerformanceChartAction> chartActionHandler, final Function2<? super InvestmentsTrackerNativeAction, Object, Unit> nativeActionHandler, final Function1<? super InvestmentsTrackerScrubPointDto, Unit> onScrub, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        List<SegmentedLine> listEmptyList;
        Modifier modifier3;
        Easing easing;
        Easing easing2;
        SnapshotState snapshotState;
        Modifier modifier4;
        int i4;
        final SnapshotState snapshotState2;
        final int i5;
        List<SegmentedLine> lines;
        Modifier modifier5;
        int i6;
        BentoTheme4 bentoTheme4;
        final Modifier modifier6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(chartActionHandler, "chartActionHandler");
        Intrinsics.checkNotNullParameter(nativeActionHandler, "nativeActionHandler");
        Intrinsics.checkNotNullParameter(onScrub, "onScrub");
        Composer composerStartRestartGroup = composer.startRestartGroup(279784072);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(item) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(nativeActionHandler) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onScrub) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9347) == 9346 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier7 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(279784072, i3, -1, "com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChart (InvestmentsTrackerPerformanceChart.kt:70)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier7);
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
                if (item.getDetails() != null) {
                    composerStartRestartGroup.startReplaceGroup(-424631043);
                    Placeholders2.ChartPlaceholder(Blur.m6449blurF8QBwvs$default(ModifiersKt.fullWidthChartSize(Modifier.INSTANCE), C2002Dp.m7995constructorimpl(10), null, 2, null), false, composerStartRestartGroup, 0, 2);
                    composerStartRestartGroup.endReplaceGroup();
                    modifier4 = modifier7;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-424350276);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objRememberedValue == companion2.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    SnapshotState snapshotState3 = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion2.getEmpty()) {
                        objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final SnapshotState snapshotState4 = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    InvestmentsTrackerComponentPerformanceGraphDataDto primary_graph_data = item.getDetails().getPrimary_graph_data();
                    if (primary_graph_data == null || (listEmptyList = GraphExtensions.getLines(primary_graph_data)) == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    List mutableList = CollectionsKt.toMutableList((Collection) listEmptyList);
                    List list = mutableList;
                    CollectionsKt.addAll(list, GraphExtensions.getVerticalLines(item.getDetails().getRule_marks()));
                    CollectionsKt.addAll(list, GraphExtensions.getHorizontalLines(item.getDetails().getRule_marks()));
                    Iterator<InvestmentsTrackerComponentPerformanceGraphDataDto> it = item.getDetails().getDynamic_graph_data().iterator();
                    while (it.hasNext()) {
                        CollectionsKt.addAll(list, GraphExtensions.getLines(it.next()));
                    }
                    SduiCursorData2.SduiLabelTrack(null, InvestmentsTrackerPerformanceChart$lambda$17$lambda$5(snapshotState4), composerStartRestartGroup, 0, 1);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ?? arrayList = new ArrayList();
                    InvestmentsTrackerComponentPerformanceGraphDataDto primary_graph_data2 = item.getDetails().getPrimary_graph_data();
                    if (primary_graph_data2 == null || (lines = GraphExtensions.getLines(primary_graph_data2)) == null) {
                        modifier3 = modifier7;
                        easing = null;
                    } else {
                        Iterator it2 = lines.iterator();
                        while (it2.hasNext()) {
                            Iterator it3 = ((SegmentedLine) it2.next()).getSegments().iterator();
                            while (it3.hasNext()) {
                                for (Point point : ((SegmentedLine.Segment) it3.next()).getPoints()) {
                                    if (arrayList.contains(point)) {
                                        modifier5 = modifier7;
                                    } else {
                                        modifier5 = modifier7;
                                        arrayList.add(Point.copy$default(point, 0.0f, 1 - point.getY(), 1, null));
                                    }
                                    modifier7 = modifier5;
                                }
                            }
                        }
                        modifier3 = modifier7;
                        easing = null;
                        Unit unit = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.startReplaceGroup(-1747446498);
                    if (Build.VERSION.SDK_INT < 33 || !item.getCanShowGradient()) {
                        easing2 = easing;
                        snapshotState = snapshotState3;
                        modifier4 = modifier3;
                        i4 = 0;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            final int i8 = 3000;
                            i5 = 0;
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChartKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return InvestmentsTrackerPerformanceChart3.m2132x71c17a54(i8, i5, (AnimatedContentTransitionScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            i5 = 0;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        modifier4 = modifier3;
                        i4 = i5;
                        snapshotState = snapshotState3;
                        easing2 = easing;
                        AnimatedContentKt.AnimatedContent(arrayList, null, (Function1) objRememberedValue3, null, null, null, InvestmentsTrackerPerformanceChart.INSTANCE.getLambda$1858825410$feature_investments_tracker_externalDebug(), composerStartRestartGroup, 1573248, 58);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierFullWidthChartSize = ModifiersKt.fullWidthChartSize(Clip.clipToBounds(Modifier.INSTANCE));
                    ImmutableList3 persistentList = extensions2.toPersistentList(mutableList);
                    ImmutableList3<Overlays> horizontalOverlays = GraphExtensions.getHorizontalOverlays(item.getDetails().getRule_marks(), item.getSecurityFilter());
                    ?? Tween$default = item.getAnimateFirstTimeShow() ? AnimationSpecKt.tween$default((int) TimeUnit.SECONDS.toMillis(2L), i4 == true ? 1 : 0, easing2, 6, easing2) : easing2;
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    int i9 = i3 & 7168;
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(item) | (i9 == 2048 ? true : i4 == true ? 1 : 0);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        snapshotState2 = snapshotState;
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChartKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return InvestmentsTrackerPerformanceChart3.m2133x9b8adfd8(item, onScrub, snapshotState2, snapshotState4, (Point) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        snapshotState2 = snapshotState;
                    }
                    Function1 function1 = (Function1) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    if (i9 == 2048) {
                        i4 = 1;
                    }
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (i4 != 0 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChartKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InvestmentsTrackerPerformanceChart3.m2134xc554455c(onScrub, snapshotState2, snapshotState4);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    SegmentedLineChart.SegmentedLineChart(persistentList, modifierFullWidthChartSize, null, null, horizontalOverlays, null, function1, (Function0) objRememberedValue5, null, false, Tween$default, composerStartRestartGroup, SegmentedLine.$stable | (Overlays.$stable << 12), 0, 812);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                }
                i6 = WhenMappings.$EnumSwitchMapping$0[(!item.getUsePositiveSpanTheme() ? Direction.f5855UP : Direction.DOWN).ordinal()];
                if (i6 != 1) {
                    bentoTheme4 = BentoTheme4.POSITIVE;
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bentoTheme4 = BentoTheme4.NEGATIVE;
                }
                BentoThemeOverlays.DirectionThemeOverlay(bentoTheme4, ComposableLambda3.rememberComposableLambda(2111826712, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChartKt$InvestmentsTrackerPerformanceChart$1$2

                    /* compiled from: InvestmentsTrackerPerformanceChart.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChartKt$InvestmentsTrackerPerformanceChart$1$2$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ InvestmentsTrackerPerformanceChartViewModel $item;
                        final /* synthetic */ Function2<InvestmentsTrackerNativeAction, Object, Unit> $nativeActionHandler;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(InvestmentsTrackerPerformanceChartViewModel investmentsTrackerPerformanceChartViewModel, Function2<? super InvestmentsTrackerNativeAction, Object, Unit> function2) {
                            this.$item = investmentsTrackerPerformanceChartViewModel;
                            this.$nativeActionHandler = function2;
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
                                ComposerKt.traceEventStart(1338649578, i, -1, "com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChart.<anonymous>.<anonymous>.<anonymous> (InvestmentsTrackerPerformanceChart.kt:172)");
                            }
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                            ImmutableList<SpanOption> spans = this.$item.getSpans();
                            SpanOption activeSpan = this.$item.getActiveSpan();
                            String queryValue = activeSpan != null ? activeSpan.getQueryValue() : null;
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(this.$nativeActionHandler);
                            final Function2<InvestmentsTrackerNativeAction, Object, Unit> function2 = this.$nativeActionHandler;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006f: CONSTRUCTOR (r6v1 'objRememberedValue' java.lang.Object) = 
                                      (r5v0 'function2' kotlin.jvm.functions.Function2<com.robinhood.android.investmentstracker.InvestmentsTrackerNativeAction, java.lang.Object, kotlin.Unit> A[DONT_INLINE])
                                     A[MD:(kotlin.jvm.functions.Function2):void (m)] (LINE:177) call: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChartKt$InvestmentsTrackerPerformanceChart$1$2$1$$ExternalSyntheticLambda0.<init>(kotlin.jvm.functions.Function2):void type: CONSTRUCTOR in method: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChartKt$InvestmentsTrackerPerformanceChart$1$2.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes10.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChartKt$InvestmentsTrackerPerformanceChart$1$2$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 25 more
                                    */
                                /*
                                    this = this;
                                    r0 = r16
                                    r8 = r17
                                    r1 = r18
                                    r2 = r1 & 3
                                    r3 = 2
                                    if (r2 != r3) goto L16
                                    boolean r2 = r8.getSkipping()
                                    if (r2 != 0) goto L12
                                    goto L16
                                L12:
                                    r8.skipToGroupEnd()
                                    return
                                L16:
                                    boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                    if (r2 == 0) goto L25
                                    r2 = -1
                                    java.lang.String r3 = "com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChart.<anonymous>.<anonymous>.<anonymous> (InvestmentsTrackerPerformanceChart.kt:172)"
                                    r4 = 1338649578(0x4fca2bea, float:6.7837512E9)
                                    androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
                                L25:
                                    androidx.compose.ui.Modifier$Companion r9 = androidx.compose.p011ui.Modifier.INSTANCE
                                    com.robinhood.compose.bento.theme.BentoTheme r1 = com.robinhood.compose.bento.theme.BentoTheme.INSTANCE
                                    int r2 = com.robinhood.compose.bento.theme.BentoTheme.$stable
                                    com.robinhood.compose.bento.theme.BentoSpacing r1 = r1.getSpacing(r8, r2)
                                    float r11 = r1.m21593getSmallD9Ej5fM()
                                    r14 = 13
                                    r15 = 0
                                    r10 = 0
                                    r12 = 0
                                    r13 = 0
                                    androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(r9, r10, r11, r12, r13, r14, r15)
                                    com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerPerformanceChartViewModel r1 = r0.$item
                                    kotlinx.collections.immutable.ImmutableList r1 = r1.getSpans()
                                    com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerPerformanceChartViewModel r2 = r0.$item
                                    com.robinhood.android.charts.models.db.SpanOption r2 = r2.getActiveSpan()
                                    if (r2 == 0) goto L50
                                    java.lang.String r2 = r2.getQueryValue()
                                    goto L51
                                L50:
                                    r2 = 0
                                L51:
                                    r3 = 5004770(0x4c5de2, float:7.013177E-39)
                                    r8.startReplaceGroup(r3)
                                    kotlin.jvm.functions.Function2<com.robinhood.android.investmentstracker.InvestmentsTrackerNativeAction, java.lang.Object, kotlin.Unit> r3 = r0.$nativeActionHandler
                                    boolean r3 = r8.changed(r3)
                                    kotlin.jvm.functions.Function2<com.robinhood.android.investmentstracker.InvestmentsTrackerNativeAction, java.lang.Object, kotlin.Unit> r5 = r0.$nativeActionHandler
                                    java.lang.Object r6 = r8.rememberedValue()
                                    if (r3 != 0) goto L6d
                                    androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.INSTANCE
                                    java.lang.Object r3 = r3.getEmpty()
                                    if (r6 != r3) goto L75
                                L6d:
                                    com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChartKt$InvestmentsTrackerPerformanceChart$1$2$1$$ExternalSyntheticLambda0 r6 = new com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChartKt$InvestmentsTrackerPerformanceChart$1$2$1$$ExternalSyntheticLambda0
                                    r6.<init>(r5)
                                    r8.updateRememberedValue(r6)
                                L75:
                                    r3 = r6
                                    kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
                                    r8.endReplaceGroup()
                                    r9 = 0
                                    r10 = 112(0x70, float:1.57E-43)
                                    r5 = 0
                                    r6 = 0
                                    r7 = 0
                                    com.robinhood.android.charts.span.SpanOptionsDynamicSelector.SpanOptionsDynamicSelector(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                                    boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                    if (r1 == 0) goto L8d
                                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                                L8d:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChart4.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(Function2 function2, String it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                function2.invoke(InvestmentsTrackerNativeAction.SPAN_SELECTED, it);
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i10) {
                            if ((i10 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2111826712, i10, -1, "com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChart.<anonymous>.<anonymous> (InvestmentsTrackerPerformanceChart.kt:171)");
                            }
                            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(StaleState2.m12177orStaleek8zF_U(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21368getAccent0d7_KjU(), composer2, 0), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(1338649578, true, new AnonymousClass1(item, nativeActionHandler), composer2, 54), composer2, 805306368, 510);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier6 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier6 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChartKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return InvestmentsTrackerPerformanceChart3.InvestmentsTrackerPerformanceChart$lambda$18(item, chartActionHandler, nativeActionHandler, onScrub, modifier6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            modifier2 = modifier;
            if ((i3 & 9347) == 9346) {
                if (i7 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier7);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion5.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    if (item.getDetails() != null) {
                    }
                    i6 = WhenMappings.$EnumSwitchMapping$0[(!item.getUsePositiveSpanTheme() ? Direction.f5855UP : Direction.DOWN).ordinal()];
                    if (i6 != 1) {
                    }
                    BentoThemeOverlays.DirectionThemeOverlay(bentoTheme4, ComposableLambda3.rememberComposableLambda(2111826712, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChartKt$InvestmentsTrackerPerformanceChart$1$2

                        /* compiled from: InvestmentsTrackerPerformanceChart.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChartKt$InvestmentsTrackerPerformanceChart$1$2$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ InvestmentsTrackerPerformanceChartViewModel $item;
                            final /* synthetic */ Function2<InvestmentsTrackerNativeAction, Object, Unit> $nativeActionHandler;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass1(InvestmentsTrackerPerformanceChartViewModel investmentsTrackerPerformanceChartViewModel, Function2<? super InvestmentsTrackerNativeAction, Object, Unit> function2) {
                                this.$item = investmentsTrackerPerformanceChartViewModel;
                                this.$nativeActionHandler = function2;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006f: CONSTRUCTOR (r6v1 'objRememberedValue' java.lang.Object) = 
                                  (r5v0 'function2' kotlin.jvm.functions.Function2<com.robinhood.android.investmentstracker.InvestmentsTrackerNativeAction, java.lang.Object, kotlin.Unit> A[DONT_INLINE])
                                 A[MD:(kotlin.jvm.functions.Function2):void (m)] (LINE:177) call: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChartKt$InvestmentsTrackerPerformanceChart$1$2$1$$ExternalSyntheticLambda0.<init>(kotlin.jvm.functions.Function2):void type: CONSTRUCTOR in method: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChartKt$InvestmentsTrackerPerformanceChart$1$2.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes10.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChartKt$InvestmentsTrackerPerformanceChart$1$2$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 20 more
                                */
                            public final void invoke(androidx.compose.runtime.Composer r17, int r18) {
                                /*
                                    r16 = this;
                                    r0 = r16
                                    r8 = r17
                                    r1 = r18
                                    r2 = r1 & 3
                                    r3 = 2
                                    if (r2 != r3) goto L16
                                    boolean r2 = r8.getSkipping()
                                    if (r2 != 0) goto L12
                                    goto L16
                                L12:
                                    r8.skipToGroupEnd()
                                    return
                                L16:
                                    boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                    if (r2 == 0) goto L25
                                    r2 = -1
                                    java.lang.String r3 = "com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChart.<anonymous>.<anonymous>.<anonymous> (InvestmentsTrackerPerformanceChart.kt:172)"
                                    r4 = 1338649578(0x4fca2bea, float:6.7837512E9)
                                    androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
                                L25:
                                    androidx.compose.ui.Modifier$Companion r9 = androidx.compose.p011ui.Modifier.INSTANCE
                                    com.robinhood.compose.bento.theme.BentoTheme r1 = com.robinhood.compose.bento.theme.BentoTheme.INSTANCE
                                    int r2 = com.robinhood.compose.bento.theme.BentoTheme.$stable
                                    com.robinhood.compose.bento.theme.BentoSpacing r1 = r1.getSpacing(r8, r2)
                                    float r11 = r1.m21593getSmallD9Ej5fM()
                                    r14 = 13
                                    r15 = 0
                                    r10 = 0
                                    r12 = 0
                                    r13 = 0
                                    androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(r9, r10, r11, r12, r13, r14, r15)
                                    com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerPerformanceChartViewModel r1 = r0.$item
                                    kotlinx.collections.immutable.ImmutableList r1 = r1.getSpans()
                                    com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerPerformanceChartViewModel r2 = r0.$item
                                    com.robinhood.android.charts.models.db.SpanOption r2 = r2.getActiveSpan()
                                    if (r2 == 0) goto L50
                                    java.lang.String r2 = r2.getQueryValue()
                                    goto L51
                                L50:
                                    r2 = 0
                                L51:
                                    r3 = 5004770(0x4c5de2, float:7.013177E-39)
                                    r8.startReplaceGroup(r3)
                                    kotlin.jvm.functions.Function2<com.robinhood.android.investmentstracker.InvestmentsTrackerNativeAction, java.lang.Object, kotlin.Unit> r3 = r0.$nativeActionHandler
                                    boolean r3 = r8.changed(r3)
                                    kotlin.jvm.functions.Function2<com.robinhood.android.investmentstracker.InvestmentsTrackerNativeAction, java.lang.Object, kotlin.Unit> r5 = r0.$nativeActionHandler
                                    java.lang.Object r6 = r8.rememberedValue()
                                    if (r3 != 0) goto L6d
                                    androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.INSTANCE
                                    java.lang.Object r3 = r3.getEmpty()
                                    if (r6 != r3) goto L75
                                L6d:
                                    com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChartKt$InvestmentsTrackerPerformanceChart$1$2$1$$ExternalSyntheticLambda0 r6 = new com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChartKt$InvestmentsTrackerPerformanceChart$1$2$1$$ExternalSyntheticLambda0
                                    r6.<init>(r5)
                                    r8.updateRememberedValue(r6)
                                L75:
                                    r3 = r6
                                    kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
                                    r8.endReplaceGroup()
                                    r9 = 0
                                    r10 = 112(0x70, float:1.57E-43)
                                    r5 = 0
                                    r6 = 0
                                    r7 = 0
                                    com.robinhood.android.charts.span.SpanOptionsDynamicSelector.SpanOptionsDynamicSelector(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                                    boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                    if (r1 == 0) goto L8d
                                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                                L8d:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChart4.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(Function2 function2, String it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                function2.invoke(InvestmentsTrackerNativeAction.SPAN_SELECTED, it);
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i10) {
                            if ((i10 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2111826712, i10, -1, "com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChart.<anonymous>.<anonymous> (InvestmentsTrackerPerformanceChart.kt:171)");
                            }
                            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(StaleState2.m12177orStaleek8zF_U(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21368getAccent0d7_KjU(), composer2, 0), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(1338649578, true, new AnonymousClass1(item, nativeActionHandler), composer2, 54), composer2, 805306368, 510);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier6 = modifier4;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }

        private static final Point InvestmentsTrackerPerformanceChart$lambda$17$lambda$2(SnapshotState<Point> snapshotState) {
            return snapshotState.getValue();
        }

        private static final com.robinhood.models.serverdriven.experimental.api.Point InvestmentsTrackerPerformanceChart$lambda$17$lambda$5(SnapshotState<com.robinhood.models.serverdriven.experimental.api.Point> snapshotState) {
            return snapshotState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: InvestmentsTrackerPerformanceChart$lambda$17$lambda$16$lambda$11$lambda$10 */
        public static final ContentTransform m2132x71c17a54(int i, int i2, AnimatedContentTransitionScope AnimatedContent) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(i, i2, null, 4, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(i, i2, null, 4, null), 0.0f, 2, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: InvestmentsTrackerPerformanceChart$lambda$17$lambda$16$lambda$13$lambda$12 */
        public static final Unit m2133x9b8adfd8(InvestmentsTrackerPerformanceChartViewModel investmentsTrackerPerformanceChartViewModel, Function1 function1, SnapshotState snapshotState, SnapshotState snapshotState2, Point it) {
            Intrinsics.checkNotNullParameter(it, "it");
            snapshotState.setValue(it);
            InvestmentsTrackerScrubPointMetadataDto metadata = getClosestPointForScrub(investmentsTrackerPerformanceChartViewModel.getDetails().getScrub_points(), InvestmentsTrackerPerformanceChart$lambda$17$lambda$2(snapshotState)).getMetadata();
            String time_text = metadata != null ? metadata.getTime_text() : null;
            if (time_text == null) {
                snapshotState2.setValue(null);
            } else {
                snapshotState2.setValue(toLabelTrackPoint(it, time_text));
            }
            function1.invoke(getClosestPointForScrub(investmentsTrackerPerformanceChartViewModel.getDetails().getScrub_points(), InvestmentsTrackerPerformanceChart$lambda$17$lambda$2(snapshotState)));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: InvestmentsTrackerPerformanceChart$lambda$17$lambda$16$lambda$15$lambda$14 */
        public static final Unit m2134xc554455c(Function1 function1, SnapshotState snapshotState, SnapshotState snapshotState2) {
            snapshotState.setValue(null);
            snapshotState2.setValue(null);
            function1.invoke(null);
            return Unit.INSTANCE;
        }

        private static final com.robinhood.models.serverdriven.experimental.api.Point toLabelTrackPoint(Point point, String str) {
            float x = point.getX();
            float y = point.getY();
            Color color = Color.f5853FG;
            return new com.robinhood.models.serverdriven.experimental.api.Point(x, y, new CursorData(new DisplayText(str, new ThemedColor(color, color), null, 4, null), null, null, null, null, null, null, null, null, null, 1022, null));
        }
    }
