package com.robinhood.android.portfolio.pnlhub.p216ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.charts.ModifiersKt;
import com.robinhood.android.charts.candlestick.CandlestickLegendChart;
import com.robinhood.android.charts.candlestick.UtilKt;
import com.robinhood.android.charts.cursor.CursorRowModifiers;
import com.robinhood.android.charts.model.LegendItem;
import com.robinhood.android.charts.model.LegendItemSuffix;
import com.robinhood.android.charts.models.p080db.PageWithChart;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.sdui.chartgroup.SduiCursorData2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.ChartFill;
import com.robinhood.models.serverdriven.experimental.api.ChartLegendItem;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.DisplayText;
import com.robinhood.models.serverdriven.experimental.api.IconDisplayText;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.Point;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.models.serverdriven.experimental.api.SubDisplayText;
import com.robinhood.models.serverdriven.experimental.api.TextStyle;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.channels.Channel;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PnlHubChartKt$PnlHubChart$$inlined$ConstraintLayout$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ PageWithChart $chart$inlined;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ EventLogger $eventLogger$inlined;
    final /* synthetic */ SnapshotIntState2 $graphHeaderHeight$delegate$inlined;
    final /* synthetic */ Function0 $onChartHeaderSecondaryTextTrailingIconClick$inlined;
    final /* synthetic */ Point $primaryScrubPoint$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState $selectedPoint$delegate$inlined;
    final /* synthetic */ boolean $showChartHeaderSecondaryTextTrailingIcon$inlined;
    final /* synthetic */ boolean $showDisplayCurrencyLabel$inlined;
    final /* synthetic */ boolean $showPlaceholder$inlined;
    final /* synthetic */ SnapshotState $start;
    final /* synthetic */ UserInteractionEventDescriptor $userInteractionEventDescriptor$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PnlHubChartKt$PnlHubChart$$inlined$ConstraintLayout$1(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, Point point, PageWithChart pageWithChart, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, boolean z, SnapshotIntState2 snapshotIntState2, boolean z2, boolean z3, Function0 function0, SnapshotState snapshotState4) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$primaryScrubPoint$inlined = point;
        this.$chart$inlined = pageWithChart;
        this.$userInteractionEventDescriptor$inlined = userInteractionEventDescriptor;
        this.$eventLogger$inlined = eventLogger;
        this.$showPlaceholder$inlined = z;
        this.$graphHeaderHeight$delegate$inlined = snapshotIntState2;
        this.$showChartHeaderSecondaryTextTrailingIcon$inlined = z2;
        this.$showDisplayCurrencyLabel$inlined = z3;
        this.$onChartHeaderSecondaryTextTrailingIconClick$inlined = function0;
        this.$selectedPoint$delegate$inlined = snapshotState4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02fe  */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42, types: [com.robinhood.models.serverdriven.experimental.api.CursorData] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [androidx.compose.ui.graphics.Color] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [com.robinhood.android.charts.model.LegendItemSuffix] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1, types: [com.robinhood.models.serverdriven.experimental.api.DisplayText] */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r36v0 */
    /* JADX WARN: Type inference failed for: r36v1, types: [com.robinhood.models.serverdriven.experimental.api.SubDisplayText] */
    /* JADX WARN: Type inference failed for: r36v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.jvm.functions.Function3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        int i2;
        Object obj;
        float f;
        int i3;
        Object obj2;
        ?? legendItemSuffix;
        Map<String, List<ChartLegendItem>> legendData;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope43;
        int i4;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope44;
        char c;
        float f2;
        ImmutableList3 immutableList3PersistentListOf;
        ImmutableList3 immutableList3PersistentListOf2;
        List<Line> lines;
        List<ChartFill> fills;
        ?? r1;
        char c2;
        Object objRememberComposableLambda;
        Object defaultDisplay;
        SubDisplayText secondary_value;
        DisplayText primary_value;
        Composer composer2 = composer;
        int i5 = 2;
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
        ConstraintLayoutScope constraintLayoutScope = this.$scope;
        composer2.startReplaceGroup(604384773);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
        composer2.startReplaceGroup(-950333765);
        Point point = this.$primaryScrubPoint$inlined;
        int i6 = 0;
        Object obj3 = null;
        if (point == null) {
            f = 0.0f;
            i3 = 0;
            i2 = 2;
            obj = null;
        } else {
            PageWithChart pageWithChart = this.$chart$inlined;
            List<ChartLegendItem> legendList = (pageWithChart == null || (legendData = pageWithChart.getLegendData()) == null) ? null : UtilKt.getLegendList(legendData, point);
            composer2.startReplaceGroup(-950331667);
            if (legendList == null) {
                f = 0.0f;
                i3 = 0;
                i2 = 2;
                obj = null;
            } else {
                Modifier.Companion companion = Modifier.INSTANCE;
                composer2.startReplaceGroup(1849434622);
                Object objRememberedValue = composer2.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = PnlHubChartKt$PnlHubChart$2$1$1$1$1.INSTANCE;
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5155defaultMinSizeVpY3zN4$default(constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue), 0.0f, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(this.$graphHeaderHeight$delegate$inlined.getIntValue()), 1, null), BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                composer2.startReplaceGroup(1705440348);
                List<ChartLegendItem> list = legendList;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (ChartLegendItem chartLegendItem : list) {
                    ThemedColor color = chartLegendItem.getColor();
                    int i7 = i5;
                    composer2.startReplaceGroup(1705443308);
                    ?? composeColor = color == null ? obj3 : SduiColors2.toComposeColor(color, composer2, i6);
                    composer2.endReplaceGroup();
                    String title = chartLegendItem.getTitle();
                    Color composeColor2 = SduiColors2.toComposeColor(chartLegendItem.getValue_color(), composer2, i6);
                    Intrinsics.checkNotNull(composeColor2);
                    long value = composeColor2.getValue();
                    String value2 = chartLegendItem.getValue();
                    DisplayText value_suffix = chartLegendItem.getValue_suffix();
                    composer2.startReplaceGroup(1705452833);
                    if (value_suffix == null) {
                        obj2 = obj3;
                        legendItemSuffix = obj2;
                    } else {
                        String value3 = value_suffix.getValue();
                        Color composeColor3 = SduiColors2.toComposeColor(value_suffix.getColor(), composer2, i6);
                        TextStyle text_style = value_suffix.getText_style();
                        composer2.startReplaceGroup(593172105);
                        androidx.compose.p011ui.text.TextStyle composeTextStyle = text_style == null ? null : com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt.getComposeTextStyle(text_style, composer2, 0);
                        composer2.endReplaceGroup();
                        obj2 = null;
                        legendItemSuffix = new LegendItemSuffix(value3, composeColor3, composeTextStyle, null);
                    }
                    composer2.endReplaceGroup();
                    arrayList.add(new LegendItem(chartLegendItem.getId(), composeColor, title, value2, value, legendItemSuffix, null));
                    obj3 = obj2;
                    i5 = i7;
                    i6 = 0;
                }
                i2 = i5;
                composer2.endReplaceGroup();
                obj = obj3;
                f = 0.0f;
                i3 = 0;
                CandlestickLegendChart.CandlestickLegendChart(modifierM5144paddingVpY3zN4$default, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM(), arrayList, 1, composer2, 3072, 0);
                obj3 = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
        }
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(-950331690);
        if (obj3 == null) {
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composer2.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer2.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = PnlHubChartKt$PnlHubChart$2$2$1$1.INSTANCE;
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceGroup();
            Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue2);
            composer2.startReplaceGroup(5004770);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (objRememberedValue3 == companion3.getEmpty()) {
                objRememberedValue3 = new PnlHubChartKt$PnlHubChart$2$2$2$1(this.$graphHeaderHeight$delegate$inlined);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceGroup();
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierConstrainAs, (Function1) objRememberedValue3);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, i3);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, i3);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierOnGloballyPositioned);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, f, 1, obj);
            PageWithChart pageWithChart2 = this.$chart$inlined;
            if (pageWithChart2 != null) {
                RichText title2 = pageWithChart2.getTitle();
                if (title2 == null) {
                    defaultDisplay = pageWithChart2.getDefaultDisplay();
                    r1 = defaultDisplay;
                } else {
                    CursorData defaultDisplay2 = pageWithChart2.getDefaultDisplay();
                    if (defaultDisplay2 != null) {
                        CursorData defaultDisplay3 = pageWithChart2.getDefaultDisplay();
                        ?? Copy$default = (defaultDisplay3 == null || (primary_value = defaultDisplay3.getPrimary_value()) == null) ? obj : DisplayText.copy$default(primary_value, title2.getText(), null, null, 6, null);
                        CursorData defaultDisplay4 = pageWithChart2.getDefaultDisplay();
                        defaultDisplay = CursorData.copy$default(defaultDisplay2, null, null, null, null, Copy$default, (defaultDisplay4 == null || (secondary_value = defaultDisplay4.getSecondary_value()) == null) ? obj : SubDisplayText.copy$default(secondary_value, IconDisplayText.copy$default(secondary_value.getMain(), "", null, null, null, 10, null), null, null, null, 14, null), null, null, null, null, 975, null);
                    } else {
                        defaultDisplay = obj;
                    }
                    if (defaultDisplay == null) {
                    }
                    r1 = defaultDisplay;
                }
            } else {
                r1 = obj;
            }
            composer2.startReplaceGroup(-58991283);
            if (this.$showChartHeaderSecondaryTextTrailingIcon$inlined) {
                c2 = 1;
                objRememberComposableLambda = ComposableLambda3.rememberComposableLambda(822159271, true, new PnlHubChartKt$PnlHubChart$2$2$3$2(this.$onChartHeaderSecondaryTextTrailingIconClick$inlined), composer2, 54);
            } else {
                c2 = 1;
                objRememberComposableLambda = obj;
            }
            composer2.endReplaceGroup();
            c = c2;
            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component2;
            constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component5;
            constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component1;
            f2 = f;
            constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component4;
            i4 = 0;
            SduiCursorData2.SduiCursorDataHeader(r1, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, CursorRowModifiers.Default.INSTANCE, null, objRememberComposableLambda, false, this.$showPlaceholder$inlined, false, this.$showDisplayCurrencyLabel$inlined, composer, CursorRowModifiers.Default.$stable << 6, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
            composer2 = composer;
            composer2.endNode();
        } else {
            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component2;
            constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component4;
            constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component5;
            i4 = i3;
            constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component1;
            c = 1;
            f2 = f;
        }
        composer2.endReplaceGroup();
        ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr = new ConstraintLayoutBaseScope6[3];
        constraintLayoutBaseScope6Arr[i4] = constraintLayoutBaseScope44;
        constraintLayoutBaseScope6Arr[c] = constraintLayoutBaseScope4;
        constraintLayoutBaseScope6Arr[i2] = constraintLayoutBaseScope4Component3;
        ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorM8136createBottomBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope, constraintLayoutBaseScope6Arr, f2, i2, null);
        Modifier.Companion companion5 = Modifier.INSTANCE;
        composer2.startReplaceGroup(5004770);
        boolean zChanged = composer2.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
        Object objRememberedValue4 = composer2.rememberedValue();
        if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = new PnlHubChartKt$PnlHubChart$2$3$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
            composer2.updateRememberedValue(objRememberedValue4);
        }
        composer2.endReplaceGroup();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope45 = constraintLayoutBaseScope42;
        SduiCursorData2.SduiLabelTrack(constraintLayoutScope.constrainAs(companion5, constraintLayoutBaseScope45, (Function1) objRememberedValue4), this.$primaryScrubPoint$inlined, composer2, i4, i4);
        Modifier modifierFullWidthChartSize = ModifiersKt.fullWidthChartSize(companion5);
        composer2.startReplaceGroup(5004770);
        boolean zChanged2 = composer2.changed(constraintLayoutBaseScope45);
        Object objRememberedValue5 = composer2.rememberedValue();
        if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue5 = new PnlHubChartKt$PnlHubChart$2$4$1(constraintLayoutBaseScope45);
            composer2.updateRememberedValue(objRememberedValue5);
        }
        composer2.endReplaceGroup();
        Modifier modifierConstrainAs2 = constraintLayoutScope.constrainAs(modifierFullWidthChartSize, constraintLayoutBaseScope43, (Function1) objRememberedValue5);
        composer2.startReplaceGroup(1849434622);
        Object objRememberedValue6 = composer2.rememberedValue();
        Composer.Companion companion6 = Composer.INSTANCE;
        if (objRememberedValue6 == companion6.getEmpty()) {
            objRememberedValue6 = PnlHubChartKt$PnlHubChart$2$5$1.INSTANCE;
            composer2.updateRememberedValue(objRememberedValue6);
        }
        SduiActionHandler sduiActionHandler = (SduiActionHandler) objRememberedValue6;
        composer2.endReplaceGroup();
        PageWithChart pageWithChart3 = this.$chart$inlined;
        if (pageWithChart3 == null || (fills = pageWithChart3.getFills()) == null || (immutableList3PersistentListOf = extensions2.toPersistentList(fills)) == null) {
            immutableList3PersistentListOf = extensions2.persistentListOf();
        }
        PageWithChart pageWithChart4 = this.$chart$inlined;
        if (pageWithChart4 == null || (lines = pageWithChart4.getLines()) == null || (immutableList3PersistentListOf2 = extensions2.toPersistentList(lines)) == null) {
            immutableList3PersistentListOf2 = extensions2.persistentListOf();
        }
        composer2.startReplaceGroup(-1746271574);
        boolean zChangedInstance = composer2.changedInstance(this.$userInteractionEventDescriptor$inlined) | composer2.changedInstance(this.$eventLogger$inlined);
        Object objRememberedValue7 = composer2.rememberedValue();
        if (zChangedInstance || objRememberedValue7 == companion6.getEmpty()) {
            objRememberedValue7 = new PnlHubChartKt$PnlHubChart$2$6$1(this.$userInteractionEventDescriptor$inlined, this.$eventLogger$inlined, this.$selectedPoint$delegate$inlined);
            composer2.updateRememberedValue(objRememberedValue7);
        }
        Function1 function1 = (Function1) objRememberedValue7;
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(5004770);
        Object objRememberedValue8 = composer2.rememberedValue();
        if (objRememberedValue8 == companion6.getEmpty()) {
            objRememberedValue8 = new PnlHubChartKt$PnlHubChart$2$7$1(this.$selectedPoint$delegate$inlined);
            composer2.updateRememberedValue(objRememberedValue8);
        }
        composer2.endReplaceGroup();
        Composer composer3 = composer2;
        PnlHubSegmentedLineChart.PnlHubSegmentedLineChart(immutableList3PersistentListOf, immutableList3PersistentListOf2, sduiActionHandler, function1, (Function0) objRememberedValue8, this.$showPlaceholder$inlined, modifierConstrainAs2, composer3, 24576, 0);
        composer3.endReplaceGroup();
        boolean zChangedInstance2 = composer3.changedInstance(this.$scope) | composer3.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final SnapshotState snapshotState = this.$start;
        final SnapshotState snapshotState2 = this.$end;
        final Channel channel = this.$channel;
        Object objRememberedValue9 = composer3.rememberedValue();
        if (zChangedInstance2 || objRememberedValue9 == companion6.getEmpty()) {
            objRememberedValue9 = new Function0<Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubChartKt$PnlHubChart$$inlined$ConstraintLayout$1.1
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
                    if (snapshotState.getValue() == null || snapshotState2.getValue() == null) {
                        snapshotState.setValue(constraintSet3);
                        snapshotState2.setValue(snapshotState.getValue());
                    } else {
                        channel.mo8337trySendJP2dKIU(constraintSet3);
                    }
                }
            };
            composer3.updateRememberedValue(objRememberedValue9);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue9, composer3, i4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
