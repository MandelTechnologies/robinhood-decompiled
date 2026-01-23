package com.robinhood.android.indexes.detail.components.chart;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.charts.ModifiersKt;
import com.robinhood.android.charts.models.p080db.IndexHistoricalChartData;
import com.robinhood.android.charts.models.p080db.IndexHistoricalChartModel;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Point;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: IndexHistoricalChart.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\t\u001a\u000e\u0010\n\u001a\u00020\u000b*\u0004\u0018\u00010\u000bH\u0002\"\u000e\u0010\f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0013\u001a\u00020\u0014¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\f\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u008e\u0002"}, m3636d2 = {"IndexHistoricalChart", "", "duxo", "Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartDuxo;", "modifier", "Landroidx/compose/ui/Modifier;", "onPageDirectionUpdated", "Lkotlin/Function1;", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "(Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartDuxo;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "adjustPrimaryValueFormat", "", "chartModifier", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "indexDefaultSpans", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "indexHistoricalChartTitleFontSize", "Landroidx/compose/ui/unit/TextUnit;", "getIndexHistoricalChartTitleFontSize", "()J", "J", "feature-index-detail-page_externalDebug", "viewState", "Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartViewState;", "selectedPoint", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "graphHeaderHeight", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class IndexHistoricalChartKt {
    private static final Modifier chartModifier = PaddingKt.m5144paddingVpY3zN4$default(ModifiersKt.fullWidthChartSize(Modifier.INSTANCE), 0.0f, C2002Dp.m7995constructorimpl(8), 1, null);
    private static final SduiActionHandler<GenericAction> actionHandler = new SduiActionHandler() { // from class: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartKt$actionHandler$1
        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
        /* renamed from: handle, reason: merged with bridge method [inline-methods] */
        public final boolean mo15941handle(GenericAction it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return true;
        }
    };
    private static final ImmutableList3<DisplaySpan> indexDefaultSpans = extensions2.persistentListOf(DisplaySpan.DAY, DisplaySpan.WEEK, DisplaySpan.MONTH, DisplaySpan.f93673MONTH, DisplaySpan.YTD, DisplaySpan.YEAR, DisplaySpan.f93695YEAR, DisplaySpan.ALL);
    private static final long indexHistoricalChartTitleFontSize = TextUnit2.getSp(32);

    /* compiled from: IndexHistoricalChart.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
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
            try {
                iArr[ChartType.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IndexHistoricalChart$lambda$30(IndexHistoricalChartDuxo indexHistoricalChartDuxo, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        IndexHistoricalChart(indexHistoricalChartDuxo, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ IndexHistoricalChartViewState access$IndexHistoricalChart$lambda$0(SnapshotState4 snapshotState4) {
        return IndexHistoricalChart$lambda$0(snapshotState4);
    }

    public static final /* synthetic */ Point access$IndexHistoricalChart$lambda$2(SnapshotState snapshotState) {
        return IndexHistoricalChart$lambda$2(snapshotState);
    }

    public static final /* synthetic */ int access$IndexHistoricalChart$lambda$5(SnapshotIntState2 snapshotIntState2) {
        return snapshotIntState2.getIntValue();
    }

    public static final /* synthetic */ String access$adjustPrimaryValueFormat(String str) {
        return adjustPrimaryValueFormat(str);
    }

    public static final /* synthetic */ SduiActionHandler access$getActionHandler$p() {
        return actionHandler;
    }

    public static final /* synthetic */ Modifier access$getChartModifier$p() {
        return chartModifier;
    }

    public static final /* synthetic */ ImmutableList3 access$getIndexDefaultSpans$p() {
        return indexDefaultSpans;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IndexHistoricalChart(final IndexHistoricalChartDuxo duxo, Modifier modifier, final Function1<? super Direction, Unit> onPageDirectionUpdated, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        boolean zChanged;
        Object objRememberedValue3;
        Object objRememberedValue4;
        final Measurer2 measurer2;
        Object objRememberedValue5;
        Object objRememberedValue6;
        final SnapshotState snapshotState;
        Object objRememberedValue7;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        Object objRememberedValue8;
        final SnapshotState snapshotState2;
        boolean zChangedInstance;
        Object objRememberedValue9;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl2;
        final SnapshotState snapshotState3;
        Object objRememberedValue10;
        boolean zChangedInstance2;
        Object objRememberedValue11;
        Composer composer2;
        final Modifier modifier3;
        IndexHistoricalChartData chartData;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(onPageDirectionUpdated, "onPageDirectionUpdated");
        Composer composerStartRestartGroup = composer.startRestartGroup(-314433341);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(duxo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onPageDirectionUpdated) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-314433341, i4, -1, "com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChart (IndexHistoricalChart.kt:57)");
                }
                final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState4 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                IndexHistoricalChartModel historicalChart = IndexHistoricalChart$lambda$0(snapshotState4CollectAsStateWithLifecycle).getHistoricalChart();
                final IndexHistoricalChartData chartData2 = historicalChart == null ? historicalChart.getChartData() : null;
                Chart<GenericAction> chart = chartData2 == null ? chartData2.getChart() : null;
                final DisplaySpan activeDisplaySpan = IndexHistoricalChart$lambda$0(snapshotState4CollectAsStateWithLifecycle).getActiveDisplaySpan();
                ChartType chartType = (chartData2 != null || IndexHistoricalChart$lambda$0(snapshotState4CollectAsStateWithLifecycle).getDisplayName() == null) ? ChartType.EMPTY : chartData2.getShowCandlesticks() ? ChartType.CANDLESTICK : ChartType.LINE;
                IndexHistoricalChartModel historicalChart2 = IndexHistoricalChart$lambda$0(snapshotState4CollectAsStateWithLifecycle).getHistoricalChart();
                Direction pageDirection = (historicalChart2 != null || (chartData = historicalChart2.getChartData()) == null) ? null : chartData.getPageDirection();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = ((i4 & 896) != 256) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new IndexHistoricalChartKt$IndexHistoricalChart$1$1(onPageDirectionUpdated, snapshotState4CollectAsStateWithLifecycle, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(pageDirection, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1003410150);
                composerStartRestartGroup.startReplaceGroup(212064437);
                composerStartRestartGroup.endReplaceGroup();
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Measurer2(density);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                measurer2 = (Measurer2) objRememberedValue4;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new ConstraintLayoutScope();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue5;
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                snapshotState = (SnapshotState) objRememberedValue6;
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue7;
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                snapshotState2 = (SnapshotState) objRememberedValue8;
                zChangedInstance = composerStartRestartGroup.changedInstance(measurer2) | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue9 == companion.getEmpty()) {
                    final int i6 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                    objRememberedValue9 = new MeasurePolicy() { // from class: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartKt$IndexHistoricalChart$$inlined$ConstraintLayout$2
                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                            return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i7);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                            return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i7);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                            return super.minIntrinsicHeight(intrinsicMeasureScope, list, i7);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                            return super.minIntrinsicWidth(intrinsicMeasureScope, list, i7);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        /* renamed from: measure-3p2s80s */
                        public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                            final LinkedHashMap linkedHashMap = new LinkedHashMap();
                            snapshotState2.getValue();
                            long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i6);
                            snapshotState.getValue();
                            int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                            int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                            final Measurer2 measurer22 = measurer2;
                            return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartKt$IndexHistoricalChart$$inlined$ConstraintLayout$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Placeable.PlacementScope placementScope) {
                                    measurer22.performLayout(placementScope, list, linkedHashMap);
                                }
                            }, 4, null);
                        }
                    };
                    constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                    snapshotState3 = snapshotState;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                } else {
                    constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                    snapshotState3 = snapshotState;
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue9;
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue10 == companion.getEmpty()) {
                    objRememberedValue10 = new Function0<Unit>() { // from class: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartKt$IndexHistoricalChart$$inlined$ConstraintLayout$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            snapshotState3.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                            constraintSetForInlineDsl2.setKnownDirty(true);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                final Function0 function0 = (Function0) objRememberedValue10;
                zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue11 == companion.getEmpty()) {
                    objRememberedValue11 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartKt$IndexHistoricalChart$$inlined$ConstraintLayout$4
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                final Chart<GenericAction> chart2 = chart;
                final ChartType chartType2 = chartType;
                LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifier4, false, (Function1) objRememberedValue11, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartKt$IndexHistoricalChart$$inlined$ConstraintLayout$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws NumberFormatException {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /*  JADX ERROR: Type inference failed
                        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
                        */
                    public final void invoke(androidx.compose.runtime.Composer r67, int r68) throws java.lang.NumberFormatException {
                        /*
                            Method dump skipped, instructions count: 2042
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.indexes.detail.components.chart.C18830x6a46e2ac.invoke(androidx.compose.runtime.Composer, int):void");
                    }
                }, composerStartRestartGroup, 54), measurePolicy, composerStartRestartGroup, 48, 0);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IndexHistoricalChartKt.IndexHistoricalChart$lambda$30(duxo, modifier3, onPageDirectionUpdated, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        i4 = i3;
        if ((i4 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotState snapshotState42 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            IndexHistoricalChartModel historicalChart3 = IndexHistoricalChart$lambda$0(snapshotState4CollectAsStateWithLifecycle).getHistoricalChart();
            if (historicalChart3 == null) {
            }
            if (chartData2 == null) {
            }
            final DisplaySpan activeDisplaySpan2 = IndexHistoricalChart$lambda$0(snapshotState4CollectAsStateWithLifecycle).getActiveDisplaySpan();
            if (chartData2 != null) {
                IndexHistoricalChartModel historicalChart22 = IndexHistoricalChart$lambda$0(snapshotState4CollectAsStateWithLifecycle).getHistoricalChart();
                if (historicalChart22 != null) {
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged = ((i4 & 896) != 256) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue3 = new IndexHistoricalChartKt$IndexHistoricalChart$1$1(onPageDirectionUpdated, snapshotState4CollectAsStateWithLifecycle, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(pageDirection, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(-1003410150);
                        composerStartRestartGroup.startReplaceGroup(212064437);
                        composerStartRestartGroup.endReplaceGroup();
                        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                        }
                        measurer2 = (Measurer2) objRememberedValue4;
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                        }
                        final ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) objRememberedValue5;
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                        }
                        snapshotState = (SnapshotState) objRememberedValue6;
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == companion.getEmpty()) {
                        }
                        constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue7;
                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue8 == companion.getEmpty()) {
                        }
                        snapshotState2 = (SnapshotState) objRememberedValue8;
                        zChangedInstance = composerStartRestartGroup.changedInstance(measurer2) | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                        objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance) {
                            final int i62 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                            objRememberedValue9 = new MeasurePolicy() { // from class: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartKt$IndexHistoricalChart$$inlined$ConstraintLayout$2
                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                                    return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i7);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                                    return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i7);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                                    return super.minIntrinsicHeight(intrinsicMeasureScope, list, i7);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                                    return super.minIntrinsicWidth(intrinsicMeasureScope, list, i7);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                /* renamed from: measure-3p2s80s */
                                public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List list, long j) {
                                    final Map linkedHashMap = new LinkedHashMap();
                                    snapshotState2.getValue();
                                    long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i62);
                                    snapshotState.getValue();
                                    int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                    int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                    final Measurer2 measurer22 = measurer2;
                                    return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartKt$IndexHistoricalChart$$inlined$ConstraintLayout$2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                            invoke2(placementScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Placeable.PlacementScope placementScope) {
                                            measurer22.performLayout(placementScope, list, linkedHashMap);
                                        }
                                    }, 4, null);
                                }
                            };
                            constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                            snapshotState3 = snapshotState;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                            MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue9;
                            objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue10 == companion.getEmpty()) {
                            }
                            final Function0 function02 = (Function0) objRememberedValue10;
                            zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
                            objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance2) {
                                objRememberedValue11 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartKt$IndexHistoricalChart$$inlined$ConstraintLayout$4
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                                final Chart chart22 = chart;
                                final ChartType chartType22 = chartType;
                                LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifier4, false, (Function1) objRememberedValue11, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartKt$IndexHistoricalChart$$inlined$ConstraintLayout$5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws NumberFormatException {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /*  JADX ERROR: Type inference failed
                                        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                                        */
                                    public final void invoke(androidx.compose.runtime.Composer r67, int r68) throws java.lang.NumberFormatException {
                                        /*
                                            Method dump skipped, instructions count: 2042
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.indexes.detail.components.chart.C18830x6a46e2ac.invoke(androidx.compose.runtime.Composer, int):void");
                                    }
                                }, composerStartRestartGroup, 54), measurePolicy2, composerStartRestartGroup, 48, 0);
                                composer2 = composerStartRestartGroup;
                                composer2.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier4;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IndexHistoricalChartViewState IndexHistoricalChart$lambda$0(SnapshotState4<IndexHistoricalChartViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point IndexHistoricalChart$lambda$2(SnapshotState<Point> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String adjustPrimaryValueFormat(String str) {
        try {
            return Formats.getValueFormat().format(new BigDecimal(str));
        } catch (Throwable unused) {
            return str == null ? "" : str;
        }
    }

    public static final long getIndexHistoricalChartTitleFontSize() {
        return indexHistoricalChartTitleFontSize;
    }
}
