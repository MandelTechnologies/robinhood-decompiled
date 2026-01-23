package com.robinhood.android.options.p208ui.chart;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.robinhood.android.charts.Placeholders2;
import com.robinhood.android.charts.candlestick.CandlestickLegendChart;
import com.robinhood.android.charts.candlestick.UtilKt;
import com.robinhood.android.charts.cursor.CursorData;
import com.robinhood.android.charts.cursor.CursorRowModifiers;
import com.robinhood.android.charts.model.LegendItem;
import com.robinhood.android.charts.models.p080db.OptionHistoricalChartData;
import com.robinhood.android.charts.span.DisplaySpanDynamicSelector;
import com.robinhood.android.charts.span.SpanSelectorTrailingButton;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.options.chart.OptionHistoricalChartHelper;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.options.p208ui.chart.OptionHistoricalChartKt;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageBodyState2;
import com.robinhood.android.sdui.chartgroup.SduiChartMappersKt;
import com.robinhood.android.sdui.chartgroup.SduiCursorData2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.ChartFill;
import com.robinhood.models.serverdriven.experimental.api.ChartLegendItem;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.Point;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.utils.Either;
import com.robinhood.utils.Either2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.channels.Channel;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.ui.chart.OptionHistoricalChartKt$OptionHistoricalChart$$inlined$ConstraintLayout$1 */
/* loaded from: classes11.dex */
public final class C23803x54101e90 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SduiActionHandler $actionHandler$inlined;
    final /* synthetic */ DisplaySpan $activeDisplaySpan$inlined;
    final /* synthetic */ Channel $channel;
    final /* synthetic */ ChartType $chartType$inlined;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ ImmutableList $displaySpans$inlined;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ SnapshotIntState2 $graphHeaderHeight$delegate$inlined;
    final /* synthetic */ OptionHistoricalChartData $historicalChartData$inlined;
    final /* synthetic */ Function1 $onCandlestickSwitchClicked$inlined;
    final /* synthetic */ Function1 $onLateCloseInfoClicked$inlined;
    final /* synthetic */ Function1 $onShowAllHoursToggled$inlined;
    final /* synthetic */ Function1 $onSpanChanged$inlined;
    final /* synthetic */ Function1 $onUnderlyingInfoClicked$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ Chart $sduiChart$inlined;
    final /* synthetic */ SnapshotState $selectedPoint$delegate$inlined;
    final /* synthetic */ SnapshotState $start;
    final /* synthetic */ OptionsDetailPageBodyState2.Chart $state$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23803x54101e90(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, ChartType chartType, Chart chart, OptionHistoricalChartData optionHistoricalChartData, OptionsDetailPageBodyState2.Chart chart2, DisplaySpan displaySpan, Function1 function1, Function1 function12, SduiActionHandler sduiActionHandler, Function1 function13, ImmutableList immutableList, Function1 function14, SnapshotState snapshotState4, SnapshotIntState2 snapshotIntState2, Function1 function15) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$chartType$inlined = chartType;
        this.$sduiChart$inlined = chart;
        this.$historicalChartData$inlined = optionHistoricalChartData;
        this.$state$inlined = chart2;
        this.$activeDisplaySpan$inlined = displaySpan;
        this.$onUnderlyingInfoClicked$inlined = function1;
        this.$onLateCloseInfoClicked$inlined = function12;
        this.$actionHandler$inlined = sduiActionHandler;
        this.$onCandlestickSwitchClicked$inlined = function13;
        this.$displaySpans$inlined = immutableList;
        this.$onSpanChanged$inlined = function14;
        this.$selectedPoint$delegate$inlined = snapshotState4;
        this.$graphHeaderHeight$delegate$inlined = snapshotIntState2;
        this.$onShowAllHoursToggled$inlined = function15;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
        CursorData cursorDataCopy$default;
        int i2;
        AnnotatedString underlyingValueInfo;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope43;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope44;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope45;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope46;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope47;
        List<ChartLegendItem> legendList;
        int i3;
        Map<String, List<ChartLegendItem>> legend_data;
        List<Line> listEmptyList;
        List<ChartFill> listEmptyList2;
        List<UIComponent<GenericAction>> listEmptyList3;
        boolean z;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope48;
        int i4;
        int i5;
        ConstraintLayoutScope constraintLayoutScope;
        boolean z2;
        ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorM8136createBottomBarrier3ABfNKs$default;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState snapshotState;
        Composer.Companion companion2;
        int i6;
        SpanSelectorTrailingButton spanSelectorTrailingButton;
        boolean zChanged;
        Object objRememberedValue2;
        boolean zChangedInstance;
        final ConstraintLayoutScope constraintLayoutScope2;
        final SnapshotState snapshotState2;
        final SnapshotState snapshotState3;
        final Channel channel;
        Object objRememberedValue3;
        Set setEmptySet;
        Object objRememberedValue4;
        Composer.Companion companion3;
        Object objRememberedValue5;
        Map<String, List<ChartLegendItem>> legend_data2;
        Set<String> setKeySet;
        Composer composer2 = composer;
        if ((i & 3) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-74958949, i, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:371)");
        }
        this.$contentTracker.setValue(Unit.INSTANCE);
        if (this.$compositionSource.getValue() == CompositionSource.Unknown) {
            this.$compositionSource.setValue(CompositionSource.Content);
        }
        this.$scope.reset();
        ConstraintLayoutScope constraintLayoutScope3 = this.$scope;
        composer2.startReplaceGroup(40408563);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope3.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component7 = constrainedLayoutReferencesCreateRefs.component7();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component8 = constrainedLayoutReferencesCreateRefs.component8();
        ChartType chartType = this.$chartType$inlined;
        if (chartType == ChartType.EMPTY) {
            composer2.startReplaceGroup(-2076906157);
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            composer2.startReplaceGroup(1849434622);
            Object objRememberedValue6 = composer2.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = OptionHistoricalChartKt$OptionHistoricalChart$1$1$1.INSTANCE;
                composer2.updateRememberedValue(objRememberedValue6);
            }
            composer2.endReplaceGroup();
            OptionHistoricalChartHeader.OptionHistoricalChartHeaderPlaceholder(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(constraintLayoutScope3.constrainAs(modifierM5146paddingqDBjuR0$default, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue6), 0.0f, 1, null), composer2, 0);
            composer2.endReplaceGroup();
            constraintLayoutBaseScope46 = constraintLayoutBaseScope4Component3;
            constraintLayoutBaseScope47 = constraintLayoutBaseScope4Component4;
            constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component5;
            constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component6;
            constraintLayoutBaseScope45 = constraintLayoutBaseScope4Component7;
            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component1;
            i2 = 0;
            constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component8;
        } else if (chartType != ChartType.CANDLESTICK || OptionHistoricalChartKt.OptionHistoricalChart$lambda$1(this.$selectedPoint$delegate$inlined) == null) {
            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component1;
            constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component8;
            composer2.startReplaceGroup(42276870);
            Point pointOptionHistoricalChart$lambda$1 = OptionHistoricalChartKt.OptionHistoricalChart$lambda$1(this.$selectedPoint$delegate$inlined);
            com.robinhood.models.serverdriven.experimental.api.CursorData cursor_data = pointOptionHistoricalChart$lambda$1 != null ? pointOptionHistoricalChart$lambda$1.getCursor_data() : null;
            composer2.startReplaceGroup(-2076846541);
            CursorData composableModel = cursor_data == null ? null : SduiCursorData2.toComposableModel(cursor_data, composer2, 0);
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-2076847329);
            if (composableModel == null) {
                OptionHistoricalChartData optionHistoricalChartData = this.$historicalChartData$inlined;
                com.robinhood.models.serverdriven.experimental.api.CursorData defaultDisplay = optionHistoricalChartData != null ? optionHistoricalChartData.getDefaultDisplay() : null;
                composableModel = defaultDisplay == null ? null : SduiCursorData2.toComposableModel(defaultDisplay, composer2, 0);
            }
            CursorData cursorData = composableModel;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-2076839556);
            if (cursorData == null) {
                cursorDataCopy$default = null;
            } else {
                CursorData.DisplayText primaryValue = cursorData.getPrimaryValue();
                cursorDataCopy$default = CursorData.copy$default(cursorData, null, primaryValue == null ? null : CursorData.DisplayText.m11995copybw27NRU$default(primaryValue, null, 0L, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getDisplayCapsuleMedium(), 3, null), null, null, null, null, 61, null);
            }
            composer2.endReplaceGroup();
            Modifier.Companion companion4 = Modifier.INSTANCE;
            composer2.startReplaceGroup(1849434622);
            Object objRememberedValue7 = composer2.rememberedValue();
            Composer.Companion companion5 = Composer.INSTANCE;
            if (objRememberedValue7 == companion5.getEmpty()) {
                objRememberedValue7 = OptionHistoricalChartKt$OptionHistoricalChart$1$3$1.INSTANCE;
                composer2.updateRememberedValue(objRememberedValue7);
            }
            composer2.endReplaceGroup();
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(constraintLayoutScope3.constrainAs(companion4, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue7), 0.0f, 1, null);
            composer2.startReplaceGroup(5004770);
            Object objRememberedValue8 = composer2.rememberedValue();
            if (objRememberedValue8 == companion5.getEmpty()) {
                objRememberedValue8 = new OptionHistoricalChartKt$OptionHistoricalChart$1$4$1(this.$graphHeaderHeight$delegate$inlined);
                composer2.updateRememberedValue(objRememberedValue8);
            }
            composer2.endReplaceGroup();
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, (Function1) objRememberedValue8);
            if (this.$state$inlined.getShowCurrencySymbol()) {
                composer2.startReplaceGroup(43199957);
                i2 = 0;
                underlyingValueInfo = OptionHistoricalChartHelper.getUnderlyingPriceInfo(this.$activeDisplaySpan$inlined, this.$state$inlined.getUnderlyingHistorical(), this.$state$inlined.getUnderlyingQuote(), this.$state$inlined.getUnderlyingSymbol(), composer2, 0);
                composer2.endReplaceGroup();
            } else {
                i2 = 0;
                composer2.startReplaceGroup(43567741);
                underlyingValueInfo = OptionHistoricalChartHelper.getUnderlyingValueInfo(this.$activeDisplaySpan$inlined, this.$state$inlined.getIndexCloseValue(), this.$state$inlined.getIndexHistoricals(), this.$state$inlined.getIndexValue(), composer2, 0);
                composer2.endReplaceGroup();
            }
            AnnotatedString annotatedString = underlyingValueInfo;
            composer2.startReplaceGroup(-1633490746);
            boolean zChanged2 = composer2.changed(this.$onUnderlyingInfoClicked$inlined) | composer2.changedInstance(this.$state$inlined);
            Object objRememberedValue9 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue9 == companion5.getEmpty()) {
                objRememberedValue9 = new OptionHistoricalChartKt$OptionHistoricalChart$1$5$1(this.$onUnderlyingInfoClicked$inlined, this.$state$inlined);
                composer2.updateRememberedValue(objRememberedValue9);
            }
            Function0 function0 = (Function0) objRememberedValue9;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-1633490746);
            boolean zChanged3 = composer2.changed(this.$onLateCloseInfoClicked$inlined) | composer2.changedInstance(this.$state$inlined);
            Object objRememberedValue10 = composer2.rememberedValue();
            if (zChanged3 || objRememberedValue10 == companion5.getEmpty()) {
                objRememberedValue10 = new OptionHistoricalChartKt$OptionHistoricalChart$1$6$1(this.$onLateCloseInfoClicked$inlined, this.$state$inlined);
                composer2.updateRememberedValue(objRememberedValue10);
            }
            composer2.endReplaceGroup();
            constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component5;
            constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component6;
            constraintLayoutBaseScope45 = constraintLayoutBaseScope4Component7;
            constraintLayoutBaseScope46 = constraintLayoutBaseScope4Component3;
            constraintLayoutBaseScope47 = constraintLayoutBaseScope4Component4;
            OptionHistoricalChartHeader.OptionHistoricalChartHeader(modifierOnGloballyPositioned, annotatedString, function0, (Function0) objRememberedValue10, this.$state$inlined.getDisplayName(), this.$state$inlined.isLateCloseOptionChain(), cursorDataCopy$default, this.$state$inlined.getTertiaryValueTooltip(), this.$state$inlined.getDisplayCurrencyCode(), this.$state$inlined.getShowDisplayCurrencyLabel(), composer2, (CursorData.$stable << 18) | (CursorRowModifiers.TertiaryValueTooltip.$stable << 21));
            composer2 = composer2;
            composer2.endReplaceGroup();
        } else {
            composer2.startReplaceGroup(40992044);
            Chart chart = this.$sduiChart$inlined;
            if (chart == null || (legend_data = chart.getLegend_data()) == null) {
                legendList = null;
            } else {
                Point pointOptionHistoricalChart$lambda$12 = OptionHistoricalChartKt.OptionHistoricalChart$lambda$1(this.$selectedPoint$delegate$inlined);
                Intrinsics.checkNotNull(pointOptionHistoricalChart$lambda$12);
                legendList = UtilKt.getLegendList(legend_data, pointOptionHistoricalChart$lambda$12);
            }
            if (legendList == null) {
                constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component1;
                i3 = 0;
                constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component8;
            } else {
                Modifier.Companion companion6 = Modifier.INSTANCE;
                composer2.startReplaceGroup(1849434622);
                Object objRememberedValue11 = composer2.rememberedValue();
                if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue11 = OptionHistoricalChartKt$OptionHistoricalChart$1$2$1$1.INSTANCE;
                    composer2.updateRememberedValue(objRememberedValue11);
                }
                composer2.endReplaceGroup();
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(SizeKt.m5155defaultMinSizeVpY3zN4$default(constraintLayoutScope3.constrainAs(companion6, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue11), 0.0f, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(this.$graphHeaderHeight$delegate$inlined.getIntValue()), 1, null), 0.0f, 1, null);
                composer2.startReplaceGroup(-2076867497);
                List<ChartLegendItem> list = legendList;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (ChartLegendItem chartLegendItem : list) {
                    ThemedColor color = chartLegendItem.getColor();
                    composer2.startReplaceGroup(-2076863920);
                    Color composeColor = color == null ? null : SduiColors2.toComposeColor(color, composer2, 0);
                    composer2.endReplaceGroup();
                    String title = chartLegendItem.getTitle();
                    Color composeColor2 = SduiColors2.toComposeColor(chartLegendItem.getValue_color(), composer2, 0);
                    Intrinsics.checkNotNull(composeColor2);
                    arrayList.add(new LegendItem(chartLegendItem.getId(), composeColor, title, chartLegendItem.getValue(), composeColor2.getValue(), null, 32, null));
                }
                i3 = 0;
                composer2.endReplaceGroup();
                constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component1;
                constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component8;
                CandlestickLegendChart.CandlestickLegendChart(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM(), arrayList, 0, composer2, 0, 8);
                Unit unit = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            constraintLayoutBaseScope46 = constraintLayoutBaseScope4Component3;
            constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component5;
            constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component6;
            constraintLayoutBaseScope45 = constraintLayoutBaseScope4Component7;
            i2 = i3;
            constraintLayoutBaseScope47 = constraintLayoutBaseScope4Component4;
        }
        int i7 = 3;
        ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr = new ConstraintLayoutBaseScope6[3];
        constraintLayoutBaseScope6Arr[i2] = constraintLayoutBaseScope4;
        constraintLayoutBaseScope6Arr[1] = constraintLayoutBaseScope4Component2;
        constraintLayoutBaseScope6Arr[2] = constraintLayoutBaseScope46;
        ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorM8136createBottomBarrier3ABfNKs$default2 = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope3, constraintLayoutBaseScope6Arr, 0.0f, 2, null);
        Modifier.Companion companion7 = Modifier.INSTANCE;
        composer2.startReplaceGroup(5004770);
        boolean zChanged4 = composer2.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default2);
        Object objRememberedValue12 = composer2.rememberedValue();
        if (zChanged4 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue12 = new OptionHistoricalChartKt$OptionHistoricalChart$1$7$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default2);
            composer2.updateRememberedValue(objRememberedValue12);
        }
        composer2.endReplaceGroup();
        int i8 = i2;
        SduiCursorData2.SduiLabelTrack(constraintLayoutScope3.constrainAs(companion7, constraintLayoutBaseScope47, (Function1) objRememberedValue12), OptionHistoricalChartKt.OptionHistoricalChart$lambda$1(this.$selectedPoint$delegate$inlined), composer2, i8, i8);
        Chart chart2 = this.$sduiChart$inlined;
        if (chart2 == null || (listEmptyList = chart2.getLines()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        Chart chart3 = this.$sduiChart$inlined;
        if (chart3 == null || (listEmptyList2 = chart3.getFills()) == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        OptionHistoricalChartData optionHistoricalChartData2 = this.$historicalChartData$inlined;
        if (optionHistoricalChartData2 == null || (listEmptyList3 = optionHistoricalChartData2.getOverlays()) == null) {
            listEmptyList3 = CollectionsKt.emptyList();
        }
        int i9 = OptionHistoricalChartKt.WhenMappings.$EnumSwitchMapping$0[this.$chartType$inlined.ordinal()];
        if (i9 == 1) {
            z = true;
            constraintLayoutBaseScope48 = constraintLayoutBaseScope42;
            List<Line> list2 = listEmptyList;
            composer2.startReplaceGroup(45087423);
            Modifier modifier = OptionHistoricalChartKt.chartModifier;
            composer2.startReplaceGroup(5004770);
            boolean zChanged5 = composer2.changed(constraintLayoutBaseScope47);
            Object objRememberedValue13 = composer2.rememberedValue();
            if (zChanged5 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue13 = new OptionHistoricalChartKt$OptionHistoricalChart$1$8$1(constraintLayoutBaseScope47);
                composer2.updateRememberedValue(objRememberedValue13);
            }
            composer2.endReplaceGroup();
            ConstraintLayoutBaseScope4 constraintLayoutBaseScope49 = constraintLayoutBaseScope44;
            Modifier modifierConstrainAs = constraintLayoutScope3.constrainAs(modifier, constraintLayoutBaseScope49, (Function1) objRememberedValue13);
            composer2.startReplaceGroup(5004770);
            Object objRememberedValue14 = composer2.rememberedValue();
            Composer.Companion companion8 = Composer.INSTANCE;
            if (objRememberedValue14 == companion8.getEmpty()) {
                objRememberedValue14 = new OptionHistoricalChartKt$OptionHistoricalChart$1$9$1(this.$selectedPoint$delegate$inlined);
                composer2.updateRememberedValue(objRememberedValue14);
            }
            Function1 function1 = (Function1) objRememberedValue14;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(5004770);
            Object objRememberedValue15 = composer2.rememberedValue();
            if (objRememberedValue15 == companion8.getEmpty()) {
                objRememberedValue15 = new OptionHistoricalChartKt$OptionHistoricalChart$1$10$1(this.$selectedPoint$delegate$inlined);
                composer2.updateRememberedValue(objRememberedValue15);
            }
            Function0 function02 = (Function0) objRememberedValue15;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(977840936);
            constraintLayoutBaseScope44 = constraintLayoutBaseScope49;
            List listEmptyList4 = CollectionsKt.emptyList();
            composer2.startReplaceGroup(1849434622);
            Object objRememberedValue16 = composer2.rememberedValue();
            if (objRememberedValue16 == companion8.getEmpty()) {
                objRememberedValue16 = C23808xa3965ebd.INSTANCE;
                composer2.updateRememberedValue(objRememberedValue16);
            }
            composer2.endReplaceGroup();
            i4 = 0;
            i5 = 2;
            constraintLayoutScope = constraintLayoutScope3;
            SduiChartMappersKt.SduiSegmentedLineChart(modifierConstrainAs, listEmptyList4, list2, listEmptyList3, this.$actionHandler$inlined, (Function1) objRememberedValue16, function1, function02, false, true, null, 0.0f, GenericAction.class, composer, 14155776, 0, 0);
            composer2 = composer;
            composer2.endReplaceGroup();
            composer2.endReplaceGroup();
        } else {
            if (i9 != 2) {
                if (i9 != 3) {
                    composer2.startReplaceGroup(-2076755917);
                    composer2.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer2.startReplaceGroup(46607539);
                Modifier modifier2 = OptionHistoricalChartKt.chartModifier;
                composer2.startReplaceGroup(5004770);
                boolean zChanged6 = composer2.changed(constraintLayoutBaseScope47);
                Object objRememberedValue17 = composer2.rememberedValue();
                if (zChanged6 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue17 = new OptionHistoricalChartKt$OptionHistoricalChart$1$15$1(constraintLayoutBaseScope47);
                    composer2.updateRememberedValue(objRememberedValue17);
                }
                composer2.endReplaceGroup();
                Placeholders2.ChartPlaceholder(constraintLayoutScope3.constrainAs(modifier2, constraintLayoutBaseScope42, (Function1) objRememberedValue17), false, composer2, 0, 2);
                composer2.endReplaceGroup();
                i4 = 0;
                i5 = 2;
                z2 = 1;
                constraintLayoutScope = constraintLayoutScope3;
                constraintLayoutBaseScope48 = constraintLayoutBaseScope42;
                ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr2 = new ConstraintLayoutBaseScope6[i7];
                constraintLayoutBaseScope6Arr2[i4] = constraintLayoutBaseScope44;
                constraintLayoutBaseScope6Arr2[z2] = constraintLayoutBaseScope43;
                constraintLayoutBaseScope6Arr2[i5] = constraintLayoutBaseScope48;
                ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope;
                horizontalAnchorM8136createBottomBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope4, constraintLayoutBaseScope6Arr2, 0.0f, i5, null);
                composer2.startReplaceGroup(1849434622);
                objRememberedValue = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, i5, null);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(-2076690612);
                if (!OptionHistoricalChartKt.OptionHistoricalChart$lambda$31$lambda$25(snapshotState) || this.$chartType$inlined == ChartType.EMPTY) {
                    companion2 = companion;
                    i6 = 5004770;
                } else {
                    composer2.startReplaceGroup(5004770);
                    Object objRememberedValue18 = composer2.rememberedValue();
                    if (objRememberedValue18 == companion.getEmpty()) {
                        objRememberedValue18 = new OptionHistoricalChartKt$OptionHistoricalChart$1$16$1(snapshotState);
                        composer2.updateRememberedValue(objRememberedValue18);
                    }
                    composer2.endReplaceGroup();
                    companion2 = companion;
                    i6 = 5004770;
                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue18, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(1969465492, z2, new OptionHistoricalChartKt$OptionHistoricalChart$1$17(this.$chartType$inlined, this.$state$inlined, this.$onCandlestickSwitchClicked$inlined, this.$onShowAllHoursToggled$inlined), composer2, 54), composer, 1572870, 62);
                    composer2 = composer;
                }
                composer2.endReplaceGroup();
                if (this.$state$inlined.isOptionsExtendedHoursEnabled()) {
                    composer2.startReplaceGroup(48114077);
                    Either.Left leftAsLeft = Either2.asLeft(new BentoIcon4.Size16(ServerToBentoAssetMapper2.SETTINGS_16));
                    String strStringResource = StringResources_androidKt.stringResource(C11048R.string.chart_options_display_toggle, composer2, i4);
                    composer2.startReplaceGroup(i6);
                    Object objRememberedValue19 = composer2.rememberedValue();
                    if (objRememberedValue19 == companion2.getEmpty()) {
                        objRememberedValue19 = new C23809x2c9aecbc(snapshotState);
                        composer2.updateRememberedValue(objRememberedValue19);
                    }
                    composer2.endReplaceGroup();
                    SpanSelectorTrailingButton spanSelectorTrailingButton2 = new SpanSelectorTrailingButton(leftAsLeft, strStringResource, (Function0) objRememberedValue19);
                    composer2.endReplaceGroup();
                    spanSelectorTrailingButton = spanSelectorTrailingButton2;
                } else {
                    composer2.startReplaceGroup(48418745);
                    Either.Left leftAsLeft2 = Either2.asLeft(this.$chartType$inlined == ChartType.LINE ? new BentoIcon4.Size16(ServerToBentoAssetMapper2.CHART_CANDLESTICKS_16) : new BentoIcon4.Size16(ServerToBentoAssetMapper2.CHART_LINE_16));
                    String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.chart_options_display_toggle, composer2, 0);
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChanged7 = composer2.changed(this.$onCandlestickSwitchClicked$inlined) | composer2.changedInstance(this.$historicalChartData$inlined);
                    Object objRememberedValue20 = composer2.rememberedValue();
                    if (zChanged7 || objRememberedValue20 == companion2.getEmpty()) {
                        objRememberedValue20 = new C23810x2c9af07d(this.$onCandlestickSwitchClicked$inlined, this.$historicalChartData$inlined);
                        composer2.updateRememberedValue(objRememberedValue20);
                    }
                    composer2.endReplaceGroup();
                    SpanSelectorTrailingButton spanSelectorTrailingButton3 = new SpanSelectorTrailingButton(leftAsLeft2, strStringResource2, (Function0) objRememberedValue20);
                    composer2.endReplaceGroup();
                    spanSelectorTrailingButton = spanSelectorTrailingButton3;
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                composer2.startReplaceGroup(i6);
                zChanged = composer2.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
                    objRememberedValue2 = new OptionHistoricalChartKt$OptionHistoricalChart$1$18$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                DisplaySpanDynamicSelector.DisplaySpanDynamicSelector(this.$displaySpans$inlined, this.$activeDisplaySpan$inlined, constraintLayoutScope4.constrainAs(modifierFillMaxWidth$default, constraintLayoutBaseScope45, (Function1) objRememberedValue2), null, this.$onSpanChanged$inlined, spanSelectorTrailingButton, false, null, composer, SpanSelectorTrailingButton.$stable << 15, 200);
                composer.endReplaceGroup();
                zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
                constraintLayoutScope2 = this.$scope;
                snapshotState2 = this.$start;
                snapshotState3 = this.$end;
                channel = this.$channel;
                objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == companion2.getEmpty()) {
                    objRememberedValue3 = new Function0<Unit>() { // from class: com.robinhood.android.options.ui.chart.OptionHistoricalChartKt$OptionHistoricalChart$$inlined$ConstraintLayout$1.1
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
                            ConstraintSet3 constraintSet3 = new ConstraintSet3(constraintLayoutScope2.getContainerObject().mo8187clone());
                            if (snapshotState2.getValue() == null || snapshotState3.getValue() == null) {
                                snapshotState2.setValue(constraintSet3);
                                snapshotState3.setValue(snapshotState2.getValue());
                            } else {
                                channel.mo8337trySendJP2dKIU(constraintSet3);
                            }
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                EffectsKt.SideEffect((Function0) objRememberedValue3, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer2.startReplaceGroup(45829284);
            Modifier modifier3 = OptionHistoricalChartKt.chartModifier;
            composer2.startReplaceGroup(5004770);
            boolean zChanged8 = composer2.changed(constraintLayoutBaseScope47);
            Object objRememberedValue21 = composer2.rememberedValue();
            if (zChanged8 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue21 = new OptionHistoricalChartKt$OptionHistoricalChart$1$11$1(constraintLayoutBaseScope47);
                composer2.updateRememberedValue(objRememberedValue21);
            }
            composer2.endReplaceGroup();
            ConstraintLayoutBaseScope4 constraintLayoutBaseScope410 = constraintLayoutBaseScope43;
            Modifier modifierConstrainAs2 = constraintLayoutScope3.constrainAs(modifier3, constraintLayoutBaseScope410, (Function1) objRememberedValue21);
            Chart chart4 = this.$sduiChart$inlined;
            if (chart4 == null || (legend_data2 = chart4.getLegend_data()) == null || (setKeySet = legend_data2.keySet()) == null) {
                setEmptySet = SetsKt.emptySet();
                SduiActionHandler sduiActionHandler = this.$actionHandler$inlined;
                composer2.startReplaceGroup(5004770);
                objRememberedValue4 = composer2.rememberedValue();
                companion3 = Composer.INSTANCE;
                if (objRememberedValue4 == companion3.getEmpty()) {
                    objRememberedValue4 = new OptionHistoricalChartKt$OptionHistoricalChart$1$13$1(this.$selectedPoint$delegate$inlined);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                Function1 function12 = (Function1) objRememberedValue4;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(5004770);
                objRememberedValue5 = composer2.rememberedValue();
                if (objRememberedValue5 == companion3.getEmpty()) {
                    objRememberedValue5 = new OptionHistoricalChartKt$OptionHistoricalChart$1$14$1(this.$selectedPoint$delegate$inlined);
                    composer2.updateRememberedValue(objRememberedValue5);
                }
                composer2.endReplaceGroup();
                z = true;
                constraintLayoutBaseScope48 = constraintLayoutBaseScope42;
                SduiChartMappersKt.SduiCandlestickChart(modifierConstrainAs2, listEmptyList2, listEmptyList, setEmptySet, sduiActionHandler, false, function12, (Function0) objRememberedValue5, false, composer, 14155776, 288);
                composer2 = composer;
                composer2.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
                constraintLayoutBaseScope43 = constraintLayoutBaseScope410;
                constraintLayoutScope = constraintLayoutScope3;
                i4 = 0;
                i5 = 2;
            } else {
                Set<String> set = setKeySet;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Float.valueOf(Float.parseFloat((String) it.next())));
                }
                setEmptySet = CollectionsKt.toSet(arrayList2);
                if (setEmptySet == null) {
                }
                SduiActionHandler sduiActionHandler2 = this.$actionHandler$inlined;
                composer2.startReplaceGroup(5004770);
                objRememberedValue4 = composer2.rememberedValue();
                companion3 = Composer.INSTANCE;
                if (objRememberedValue4 == companion3.getEmpty()) {
                }
                Function1 function122 = (Function1) objRememberedValue4;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(5004770);
                objRememberedValue5 = composer2.rememberedValue();
                if (objRememberedValue5 == companion3.getEmpty()) {
                }
                composer2.endReplaceGroup();
                z = true;
                constraintLayoutBaseScope48 = constraintLayoutBaseScope42;
                SduiChartMappersKt.SduiCandlestickChart(modifierConstrainAs2, listEmptyList2, listEmptyList, setEmptySet, sduiActionHandler2, false, function122, (Function0) objRememberedValue5, false, composer, 14155776, 288);
                composer2 = composer;
                composer2.endReplaceGroup();
                Unit unit22 = Unit.INSTANCE;
                constraintLayoutBaseScope43 = constraintLayoutBaseScope410;
                constraintLayoutScope = constraintLayoutScope3;
                i4 = 0;
                i5 = 2;
            }
            ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr22 = new ConstraintLayoutBaseScope6[i7];
            constraintLayoutBaseScope6Arr22[i4] = constraintLayoutBaseScope44;
            constraintLayoutBaseScope6Arr22[z2] = constraintLayoutBaseScope43;
            constraintLayoutBaseScope6Arr22[i5] = constraintLayoutBaseScope48;
            ConstraintLayoutScope constraintLayoutScope42 = constraintLayoutScope;
            horizontalAnchorM8136createBottomBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope42, constraintLayoutBaseScope6Arr22, 0.0f, i5, null);
            composer2.startReplaceGroup(1849434622);
            objRememberedValue = composer2.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-2076690612);
            if (OptionHistoricalChartKt.OptionHistoricalChart$lambda$31$lambda$25(snapshotState)) {
                companion2 = companion;
                i6 = 5004770;
            }
            composer2.endReplaceGroup();
            if (this.$state$inlined.isOptionsExtendedHoursEnabled()) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            composer2.startReplaceGroup(i6);
            zChanged = composer2.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
            objRememberedValue2 = composer2.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new OptionHistoricalChartKt$OptionHistoricalChart$1$18$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceGroup();
            DisplaySpanDynamicSelector.DisplaySpanDynamicSelector(this.$displaySpans$inlined, this.$activeDisplaySpan$inlined, constraintLayoutScope42.constrainAs(modifierFillMaxWidth$default2, constraintLayoutBaseScope45, (Function1) objRememberedValue2), null, this.$onSpanChanged$inlined, spanSelectorTrailingButton, false, null, composer, SpanSelectorTrailingButton.$stable << 15, 200);
            composer.endReplaceGroup();
            zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
            constraintLayoutScope2 = this.$scope;
            snapshotState2 = this.$start;
            snapshotState3 = this.$end;
            channel = this.$channel;
            objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance) {
                objRememberedValue3 = new Function0<Unit>() { // from class: com.robinhood.android.options.ui.chart.OptionHistoricalChartKt$OptionHistoricalChart$$inlined$ConstraintLayout$1.1
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
                        ConstraintSet3 constraintSet3 = new ConstraintSet3(constraintLayoutScope2.getContainerObject().mo8187clone());
                        if (snapshotState2.getValue() == null || snapshotState3.getValue() == null) {
                            snapshotState2.setValue(constraintSet3);
                            snapshotState3.setValue(snapshotState2.getValue());
                        } else {
                            channel.mo8337trySendJP2dKIU(constraintSet3);
                        }
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.SideEffect((Function0) objRememberedValue3, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        i7 = 3;
        z2 = z;
        ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr222 = new ConstraintLayoutBaseScope6[i7];
        constraintLayoutBaseScope6Arr222[i4] = constraintLayoutBaseScope44;
        constraintLayoutBaseScope6Arr222[z2] = constraintLayoutBaseScope43;
        constraintLayoutBaseScope6Arr222[i5] = constraintLayoutBaseScope48;
        ConstraintLayoutScope constraintLayoutScope422 = constraintLayoutScope;
        horizontalAnchorM8136createBottomBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope422, constraintLayoutBaseScope6Arr222, 0.0f, i5, null);
        composer2.startReplaceGroup(1849434622);
        objRememberedValue = composer2.rememberedValue();
        companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
        }
        snapshotState = (SnapshotState) objRememberedValue;
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(-2076690612);
        if (OptionHistoricalChartKt.OptionHistoricalChart$lambda$31$lambda$25(snapshotState)) {
        }
        composer2.endReplaceGroup();
        if (this.$state$inlined.isOptionsExtendedHoursEnabled()) {
        }
        Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        composer2.startReplaceGroup(i6);
        zChanged = composer2.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
        objRememberedValue2 = composer2.rememberedValue();
        if (zChanged) {
        }
        composer2.endReplaceGroup();
        DisplaySpanDynamicSelector.DisplaySpanDynamicSelector(this.$displaySpans$inlined, this.$activeDisplaySpan$inlined, constraintLayoutScope422.constrainAs(modifierFillMaxWidth$default22, constraintLayoutBaseScope45, (Function1) objRememberedValue2), null, this.$onSpanChanged$inlined, spanSelectorTrailingButton, false, null, composer, SpanSelectorTrailingButton.$stable << 15, 200);
        composer.endReplaceGroup();
        zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        constraintLayoutScope2 = this.$scope;
        snapshotState2 = this.$start;
        snapshotState3 = this.$end;
        channel = this.$channel;
        objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance) {
        }
        EffectsKt.SideEffect((Function0) objRememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
    }
}
