package com.robinhood.android.tradingtrends.p264ui.chartSection;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.Logger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.sdui.chartgroup.AdvancedChartGroupState;
import com.robinhood.android.sdui.chartgroup.AdvancedChartGroupState5;
import com.robinhood.android.sdui.chartgroup.AxisConfig;
import com.robinhood.android.sdui.chartgroup.ScrubConfig;
import com.robinhood.android.sdui.chartgroup.ScrubState;
import com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt;
import com.robinhood.android.sdui.chartgroup.YAxisLocation;
import com.robinhood.android.tradingtrends.p264ui.chartSection.TradingTrendsChartSectionState3;
import com.robinhood.android.tradingtrends.p264ui.chartSection.chart.TradingTrendsChartCursorTrack;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.ChartGroup;
import com.robinhood.models.serverdriven.experimental.api.ChartLegendItem;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.rosetta.eventlogging.Component;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.channels.Channel;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@SourceDebugExtension
/* renamed from: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionKt$TradingTrendsChartSection$$inlined$ConstraintLayout$1 */
/* loaded from: classes9.dex */
public final class C29982x84b1028e extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ Function2 $expandTradingTrendsDetails$inlined;
    final /* synthetic */ String $instrumentId$inlined;
    final /* synthetic */ Function1 $onTradingTrendsTypeSelected$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState $start;
    final /* synthetic */ TradingTrendsChartSectionState3 $viewState$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29982x84b1028e(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, String str, TradingTrendsChartSectionState3 tradingTrendsChartSectionState3, Function1 function1, Function2 function2) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$instrumentId$inlined = str;
        this.$viewState$inlined = tradingTrendsChartSectionState3;
        this.$onTradingTrendsTypeSelected$inlined = function1;
        this.$expandTradingTrendsDetails$inlined = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
        ConstraintLayoutScope constraintLayoutScope;
        int i2;
        float f;
        int i3;
        int i4;
        Map<String, List<ChartLegendItem>> legend_data;
        Set<String> setKeySet;
        Float fValueOf;
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
        ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        composer2.startReplaceGroup(-1758494511);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
        String str = this.$instrumentId$inlined;
        TradingTrendsChartSectionState3.Ready ready = (TradingTrendsChartSectionState3.Ready) this.$viewState$inlined;
        Function1 function1 = this.$onTradingTrendsTypeSelected$inlined;
        Function2 function2 = this.$expandTradingTrendsDetails$inlined;
        Modifier.Companion companion = Modifier.INSTANCE;
        composer2.startReplaceGroup(1849434622);
        Object objRememberedValue = composer2.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = TradingTrendsChartSection2.INSTANCE;
            composer2.updateRememberedValue(objRememberedValue);
        }
        composer2.endReplaceGroup();
        TradingTrendsChartSectionTopContent.TradingTrendsChartSectionTopContent(str, ready, function1, function2, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(constraintLayoutScope2.constrainAs(companion, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue), 0.0f, composer2, 0, 1), composer2, 0, 0);
        composer2.startReplaceGroup(-610893268);
        if (((TradingTrendsChartSectionState3.Ready) this.$viewState$inlined).getChart() != null) {
            composer2.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(5004770);
            boolean zChanged = composer2.changed(constraintLayoutBaseScope4Component1);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChanged || objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new TradingTrendsChartSection3(constraintLayoutBaseScope4Component1);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceGroup();
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(ModifiersKt.autoLogEvents$default(constraintLayoutScope2.constrainAs(companion, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue3), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.TRADING_TRENDS_CHART, null, null, 6, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), 0.0f, composer2, 0, 1);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (objRememberedValue4 == companion2.getEmpty()) {
                objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            SnapshotState snapshotState2 = (SnapshotState) objRememberedValue4;
            composer2.endReplaceGroup();
            ChartGroup<GenericAction> chart = ((TradingTrendsChartSectionState3.Ready) this.$viewState$inlined).getChart();
            composer2.startReplaceGroup(5004770);
            boolean zChanged2 = composer2.changed(chart);
            Object objRememberedValue5 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue5 == companion2.getEmpty()) {
                Chart chart2 = (Chart) CollectionsKt.firstOrNull((List) ((TradingTrendsChartSectionState3.Ready) this.$viewState$inlined).getChart().getCharts());
                if (chart2 == null || (legend_data = chart2.getLegend_data()) == null || (setKeySet = legend_data.keySet()) == null) {
                    objRememberedValue5 = null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = setKeySet.iterator();
                    while (it.hasNext()) {
                        try {
                            fValueOf = Float.valueOf(Float.parseFloat((String) it.next()));
                        } catch (NumberFormatException e) {
                            Logger.INSTANCE.mo1682e(e, "Failed to x-axis snap points", new Object[0]);
                            fValueOf = null;
                        }
                        if (fValueOf != null) {
                            arrayList.add(fValueOf);
                        }
                    }
                    objRememberedValue5 = extensions2.toImmutableList(arrayList);
                }
                composer2.updateRememberedValue(objRememberedValue5);
            }
            ImmutableList immutableList = (ImmutableList) objRememberedValue5;
            composer2.endReplaceGroup();
            EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            ChartGroup<GenericAction> chart3 = ((TradingTrendsChartSectionState3.Ready) this.$viewState$inlined).getChart();
            AdvancedChartGroupState advancedChartGroupState = new AdvancedChartGroupState(new AxisConfig(0.0f, 0.0f, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), false, YAxisLocation.START, false, null, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, null), new ScrubConfig(false, false, null, false, false, false, true, immutableList, false, EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, null), AdvancedChartGroupState5.NONE, 0, true, 8, null);
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
            composer2.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer2.changedInstance(userInteractionEventDescriptor) | composer2.changedInstance(current);
            Object objRememberedValue6 = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new TradingTrendsChartSection4(userInteractionEventDescriptor, current, snapshotState, snapshotState2);
                composer2.updateRememberedValue(objRememberedValue6);
            }
            composer2.endReplaceGroup();
            i3 = 5004770;
            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component4;
            SduiAdvancedChartKt.SduiAdvancedChartGroup(chart3, modifierFillMaxWidth$default, null, advancedChartGroupState, null, null, (Function1) objRememberedValue6, null, null, composer, (AdvancedChartGroupState.$stable << 9) | 48, 436);
            composer.endNode();
            ChartGroup<GenericAction> chart4 = ((TradingTrendsChartSectionState3.Ready) this.$viewState$inlined).getChart();
            ScrubState scrubStateTradingTrendsChartSection$lambda$17$lambda$3 = TradingTrendsChartSection.TradingTrendsChartSection$lambda$17$lambda$3(snapshotState);
            composer.startReplaceGroup(5004770);
            boolean zChanged3 = composer.changed(constraintLayoutBaseScope4Component2);
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new TradingTrendsChartSection5(constraintLayoutBaseScope4Component2);
                composer.updateRememberedValue(objRememberedValue7);
            }
            composer.endReplaceGroup();
            constraintLayoutScope = constraintLayoutScope2;
            i2 = 1;
            f = 0.0f;
            TradingTrendsChartCursorTrack.TradingTrendsChartCursorTrack(chart4, scrubStateTradingTrendsChartSection$lambda$17$lambda$3, SizeKt.fillMaxWidth$default(constraintLayoutScope.constrainAs(companion4, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue7), 0.0f, 1, null), composer, ScrubState.$stable << 3, 0);
            composer2 = composer;
        } else {
            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component4;
            constraintLayoutScope = constraintLayoutScope2;
            i2 = 1;
            f = 0.0f;
            i3 = 5004770;
        }
        composer2.endReplaceGroup();
        String insightsPanelText = ((TradingTrendsChartSectionState3.Ready) this.$viewState$inlined).getData().getInsightsPanelText();
        composer2.startReplaceGroup(-610710544);
        if (insightsPanelText == null) {
            i4 = 0;
        } else {
            String sourceText = ((TradingTrendsChartSectionState3.Ready) this.$viewState$inlined).getData().getSourceText();
            String str2 = this.$instrumentId$inlined;
            composer2.startReplaceGroup(-1746271574);
            boolean zChanged4 = composer2.changed(this.$expandTradingTrendsDetails$inlined) | composer2.changed(this.$instrumentId$inlined) | composer2.changedInstance(this.$viewState$inlined);
            Object objRememberedValue8 = composer2.rememberedValue();
            if (zChanged4 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = new TradingTrendsChartSection6(this.$expandTradingTrendsDetails$inlined, this.$instrumentId$inlined, this.$viewState$inlined);
                composer2.updateRememberedValue(objRememberedValue8);
            }
            Function0 function0 = (Function0) objRememberedValue8;
            composer2.endReplaceGroup();
            Modifier.Companion companion5 = Modifier.INSTANCE;
            composer2.startReplaceGroup(i3);
            boolean zChanged5 = composer2.changed(constraintLayoutBaseScope4Component2);
            Object objRememberedValue9 = composer2.rememberedValue();
            if (zChanged5 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = new TradingTrendsChartSection7(constraintLayoutBaseScope4Component2);
                composer2.updateRememberedValue(objRememberedValue9);
            }
            composer2.endReplaceGroup();
            i4 = 0;
            TradingTrendsInsightPanel.TradingTrendsInsightPanel(insightsPanelText, sourceText, str2, function0, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(constraintLayoutScope.constrainAs(companion5, constraintLayoutBaseScope4, (Function1) objRememberedValue9), f, composer2, 0, i2), composer2, 0, 0);
            Unit unit = Unit.INSTANCE;
        }
        composer2.endReplaceGroup();
        composer2.endReplaceGroup();
        boolean zChangedInstance2 = composer2.changedInstance(this.$scope) | composer2.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope3 = this.$scope;
        final SnapshotState snapshotState3 = this.$start;
        final SnapshotState snapshotState4 = this.$end;
        final Channel channel = this.$channel;
        Object objRememberedValue10 = composer2.rememberedValue();
        if (zChangedInstance2 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue10 = new Function0<Unit>() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionKt$TradingTrendsChartSection$$inlined$ConstraintLayout$1.1
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
                    ConstraintSet3 constraintSet3 = new ConstraintSet3(constraintLayoutScope3.getContainerObject().mo8187clone());
                    if (snapshotState3.getValue() == null || snapshotState4.getValue() == null) {
                        snapshotState3.setValue(constraintSet3);
                        snapshotState4.setValue(snapshotState3.getValue());
                    } else {
                        channel.mo8337trySendJP2dKIU(constraintSet3);
                    }
                }
            };
            composer2.updateRememberedValue(objRememberedValue10);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue10, composer2, i4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
