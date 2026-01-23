package com.robinhood.android.tradingtrends.p264ui.chartSection;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: TradingTrendsChartSection.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a{\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2:\b\u0002\u0010\n\u001a4\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\f\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u008e\u0002"}, m3636d2 = {"TradingTrendsChartSection", "", "instrumentId", "", "viewState", "Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "onTradingTrendsTypeSelected", "Lkotlin/Function1;", "expandTradingTrendsDetails", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "selectedType", "(Ljava/lang/String;Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "lib-trading-trends_externalDebug", "scrubState", "Lcom/robinhood/android/sdui/chartgroup/ScrubState;", "ignoreFirstNull", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TradingTrendsChartSection {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingTrendsChartSection$lambda$0(String str, TradingTrendsChartSectionState3 tradingTrendsChartSectionState3, Modifier modifier, Function1 function1, Function2 function2, int i, int i2, Composer composer, int i3) {
        TradingTrendsChartSection(str, tradingTrendsChartSectionState3, modifier, function1, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingTrendsChartSection$lambda$18(String str, TradingTrendsChartSectionState3 tradingTrendsChartSectionState3, Modifier modifier, Function1 function1, Function2 function2, int i, int i2, Composer composer, int i3) {
        TradingTrendsChartSection(str, tradingTrendsChartSectionState3, modifier, function1, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TradingTrendsChartSection(final String instrumentId, final TradingTrendsChartSectionState3 viewState, Modifier modifier, Function1<? super String, Unit> function1, Function2<? super String, ? super String, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super String, Unit> function12;
        int i5;
        Function2<? super String, ? super String, Unit> function22;
        final SnapshotState snapshotState;
        Function2<? super String, ? super String, Unit> function23;
        Function1<? super String, Unit> function13;
        Composer composer2;
        final Function2<? super String, ? super String, Unit> function24;
        Composer composer3;
        final Function1<? super String, Unit> function14;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1030559583);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(instrumentId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function12 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        function22 = function2;
                        i3 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            function12 = null;
                        }
                        if (i5 != 0) {
                            function22 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1030559583, i3, -1, "com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSection (TradingTrendsChartSection.kt:53)");
                        }
                        if (!Intrinsics.areEqual(viewState, TradingTrendsChartSectionState3.Disabled.INSTANCE)) {
                            composerStartRestartGroup.startReplaceGroup(-973914309);
                            composerStartRestartGroup.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup2 != null) {
                                final Modifier modifier5 = modifier4;
                                final Function1<? super String, Unit> function15 = function12;
                                final Function2<? super String, ? super String, Unit> function25 = function22;
                                scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return TradingTrendsChartSection.TradingTrendsChartSection$lambda$0(instrumentId, viewState, modifier5, function15, function25, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        Modifier modifier6 = modifier4;
                        final Function1<? super String, Unit> function16 = function12;
                        final Function2<? super String, ? super String, Unit> function26 = function22;
                        if (viewState instanceof TradingTrendsChartSectionState3.Loading) {
                            composerStartRestartGroup.startReplaceGroup(1769701867);
                            TradingTrendsChartSectionPlaceholder.TradingTrendsChartSectionPlaceholder(((TradingTrendsChartSectionState3.Loading) viewState).isDetailPage(), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier6, 0.0f, composerStartRestartGroup, (i3 >> 6) & 14, 1), composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            function23 = function26;
                            function13 = function16;
                            composer2 = composerStartRestartGroup;
                        } else {
                            if (!(viewState instanceof TradingTrendsChartSectionState3.Ready)) {
                                composerStartRestartGroup.startReplaceGroup(1769704317);
                                composerStartRestartGroup.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composerStartRestartGroup.startReplaceGroup(1769716897);
                            composerStartRestartGroup.startReplaceGroup(-1003410150);
                            composerStartRestartGroup.startReplaceGroup(212064437);
                            composerStartRestartGroup.endReplaceGroup();
                            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = new Measurer2(density);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            final Measurer2 measurer2 = (Measurer2) objRememberedValue;
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new ConstraintLayoutScope();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            final ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
                            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == companion.getEmpty()) {
                                objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue5;
                            boolean zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                            final int i7 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                            boolean zChanged = zChangedInstance | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                                objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionKt$TradingTrendsChartSection$$inlined$ConstraintLayout$2
                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i8);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i8);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i8);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i8);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    /* renamed from: measure-3p2s80s */
                                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        snapshotState3.getValue();
                                        long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i7);
                                        snapshotState2.getValue();
                                        int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                        int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                        final Measurer2 measurer22 = measurer2;
                                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionKt$TradingTrendsChartSection$$inlined$ConstraintLayout$2.1
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
                                snapshotState = snapshotState2;
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            } else {
                                snapshotState = snapshotState2;
                            }
                            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue6;
                            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue7 == companion.getEmpty()) {
                                objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionKt$TradingTrendsChartSection$$inlined$ConstraintLayout$3
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
                                        snapshotState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                        constraintSetForInlineDsl.setKnownDirty(true);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                            }
                            final Function0 function0 = (Function0) objRememberedValue7;
                            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
                            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                                objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionKt$TradingTrendsChartSection$$inlined$ConstraintLayout$4
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
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                            }
                            Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifier6, false, (Function1) objRememberedValue8, 1, null);
                            Function2<Composer, Integer, Unit> function27 = new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionKt$TradingTrendsChartSection$$inlined$ConstraintLayout$5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i8) {
                                    int i9;
                                    ConstraintLayoutScope constraintLayoutScope2;
                                    int i10;
                                    float f;
                                    int i11;
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
                                    Map<String, List<ChartLegendItem>> legend_data;
                                    Set<String> setKeySet;
                                    Float fValueOf;
                                    Composer composer5 = composer4;
                                    if ((i8 & 3) == 2 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1200550679, i8, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                    }
                                    snapshotState3.setValue(Unit.INSTANCE);
                                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                    constraintLayoutScope.reset();
                                    ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope;
                                    composer5.startReplaceGroup(-1758494511);
                                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope3.createRefs();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                                    String str = instrumentId;
                                    TradingTrendsChartSectionState3.Ready ready = (TradingTrendsChartSectionState3.Ready) viewState;
                                    Function1 function17 = function16;
                                    Function2 function28 = function26;
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    composer5.startReplaceGroup(1849434622);
                                    Object objRememberedValue9 = composer5.rememberedValue();
                                    Composer.Companion companion3 = Composer.INSTANCE;
                                    if (objRememberedValue9 == companion3.getEmpty()) {
                                        objRememberedValue9 = TradingTrendsChartSection2.INSTANCE;
                                        composer5.updateRememberedValue(objRememberedValue9);
                                    }
                                    composer5.endReplaceGroup();
                                    TradingTrendsChartSectionTopContent.TradingTrendsChartSectionTopContent(str, ready, function17, function28, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(constraintLayoutScope3.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue9), 0.0f, composer5, 0, 1), composer5, 0, 0);
                                    composer5.startReplaceGroup(-610893268);
                                    if (((TradingTrendsChartSectionState3.Ready) viewState).getChart() != null) {
                                        composer5.startReplaceGroup(1849434622);
                                        Object objRememberedValue10 = composer5.rememberedValue();
                                        if (objRememberedValue10 == companion3.getEmpty()) {
                                            objRememberedValue10 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                                            composer5.updateRememberedValue(objRememberedValue10);
                                        }
                                        SnapshotState snapshotState4 = (SnapshotState) objRememberedValue10;
                                        composer5.endReplaceGroup();
                                        composer5.startReplaceGroup(5004770);
                                        boolean zChanged2 = composer5.changed(constraintLayoutBaseScope4Component1);
                                        Object objRememberedValue11 = composer5.rememberedValue();
                                        if (zChanged2 || objRememberedValue11 == companion3.getEmpty()) {
                                            objRememberedValue11 = new TradingTrendsChartSection3(constraintLayoutBaseScope4Component1);
                                            composer5.updateRememberedValue(objRememberedValue11);
                                        }
                                        composer5.endReplaceGroup();
                                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(ModifiersKt.autoLogEvents$default(constraintLayoutScope3.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue11), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer5.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.TRADING_TRENDS_CHART, null, null, 6, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), 0.0f, composer5, 0, 1);
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                        if (composer5.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer5.startReusableNode();
                                        if (composer5.getInserting()) {
                                            composer5.createNode(constructor);
                                        } else {
                                            composer5.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer5.startReplaceGroup(1849434622);
                                        Object objRememberedValue12 = composer5.rememberedValue();
                                        if (objRememberedValue12 == companion3.getEmpty()) {
                                            objRememberedValue12 = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                                            composer5.updateRememberedValue(objRememberedValue12);
                                        }
                                        SnapshotState snapshotState5 = (SnapshotState) objRememberedValue12;
                                        composer5.endReplaceGroup();
                                        ChartGroup<GenericAction> chart = ((TradingTrendsChartSectionState3.Ready) viewState).getChart();
                                        composer5.startReplaceGroup(5004770);
                                        boolean zChanged3 = composer5.changed(chart);
                                        Object objRememberedValue13 = composer5.rememberedValue();
                                        if (zChanged3 || objRememberedValue13 == companion3.getEmpty()) {
                                            Chart chart2 = (Chart) CollectionsKt.firstOrNull((List) ((TradingTrendsChartSectionState3.Ready) viewState).getChart().getCharts());
                                            if (chart2 == null || (legend_data = chart2.getLegend_data()) == null || (setKeySet = legend_data.keySet()) == null) {
                                                objRememberedValue13 = null;
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
                                                objRememberedValue13 = extensions2.toImmutableList(arrayList);
                                            }
                                            composer5.updateRememberedValue(objRememberedValue13);
                                        }
                                        ImmutableList immutableList = (ImmutableList) objRememberedValue13;
                                        composer5.endReplaceGroup();
                                        EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer5, AutoLoggingCompositionLocals4.$stable);
                                        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer5.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                                        ChartGroup<GenericAction> chart3 = ((TradingTrendsChartSectionState3.Ready) viewState).getChart();
                                        AdvancedChartGroupState advancedChartGroupState = new AdvancedChartGroupState(new AxisConfig(0.0f, 0.0f, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), false, YAxisLocation.START, false, null, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, null), new ScrubConfig(false, false, null, false, false, false, true, immutableList, false, EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, null), AdvancedChartGroupState5.NONE, 0, true, 8, null);
                                        Modifier.Companion companion5 = Modifier.INSTANCE;
                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                                        composer5.startReplaceGroup(-1224400529);
                                        boolean zChangedInstance3 = composer5.changedInstance(userInteractionEventDescriptor) | composer5.changedInstance(current);
                                        Object objRememberedValue14 = composer5.rememberedValue();
                                        if (zChangedInstance3 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue14 = new TradingTrendsChartSection4(userInteractionEventDescriptor, current, snapshotState4, snapshotState5);
                                            composer5.updateRememberedValue(objRememberedValue14);
                                        }
                                        composer5.endReplaceGroup();
                                        i11 = 5004770;
                                        i9 = helpersHashCode;
                                        constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component2;
                                        SduiAdvancedChartKt.SduiAdvancedChartGroup(chart3, modifierFillMaxWidth$default, null, advancedChartGroupState, null, null, (Function1) objRememberedValue14, null, null, composer4, (AdvancedChartGroupState.$stable << 9) | 48, 436);
                                        composer4.endNode();
                                        ChartGroup<GenericAction> chart4 = ((TradingTrendsChartSectionState3.Ready) viewState).getChart();
                                        ScrubState scrubStateTradingTrendsChartSection$lambda$17$lambda$3 = TradingTrendsChartSection.TradingTrendsChartSection$lambda$17$lambda$3(snapshotState4);
                                        composer4.startReplaceGroup(5004770);
                                        boolean zChanged4 = composer4.changed(constraintLayoutBaseScope4);
                                        Object objRememberedValue15 = composer4.rememberedValue();
                                        if (zChanged4 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue15 = new TradingTrendsChartSection5(constraintLayoutBaseScope4);
                                            composer4.updateRememberedValue(objRememberedValue15);
                                        }
                                        composer4.endReplaceGroup();
                                        constraintLayoutScope2 = constraintLayoutScope3;
                                        Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion5, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue15);
                                        i10 = 1;
                                        f = 0.0f;
                                        TradingTrendsChartCursorTrack.TradingTrendsChartCursorTrack(chart4, scrubStateTradingTrendsChartSection$lambda$17$lambda$3, SizeKt.fillMaxWidth$default(modifierConstrainAs, 0.0f, 1, null), composer4, ScrubState.$stable << 3, 0);
                                        composer5 = composer4;
                                    } else {
                                        i9 = helpersHashCode;
                                        constraintLayoutScope2 = constraintLayoutScope3;
                                        i10 = 1;
                                        f = 0.0f;
                                        i11 = 5004770;
                                        constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component2;
                                    }
                                    composer5.endReplaceGroup();
                                    String insightsPanelText = ((TradingTrendsChartSectionState3.Ready) viewState).getData().getInsightsPanelText();
                                    composer5.startReplaceGroup(-610710544);
                                    if (insightsPanelText != null) {
                                        String sourceText = ((TradingTrendsChartSectionState3.Ready) viewState).getData().getSourceText();
                                        String str2 = instrumentId;
                                        composer5.startReplaceGroup(-1746271574);
                                        boolean zChanged5 = composer5.changed(function26) | composer5.changed(instrumentId) | composer5.changedInstance(viewState);
                                        Object objRememberedValue16 = composer5.rememberedValue();
                                        if (zChanged5 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue16 = new TradingTrendsChartSection6(function26, instrumentId, viewState);
                                            composer5.updateRememberedValue(objRememberedValue16);
                                        }
                                        Function0 function02 = (Function0) objRememberedValue16;
                                        composer5.endReplaceGroup();
                                        Modifier.Companion companion6 = Modifier.INSTANCE;
                                        composer5.startReplaceGroup(i11);
                                        boolean zChanged6 = composer5.changed(constraintLayoutBaseScope4);
                                        Object objRememberedValue17 = composer5.rememberedValue();
                                        if (zChanged6 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue17 = new TradingTrendsChartSection7(constraintLayoutBaseScope4);
                                            composer5.updateRememberedValue(objRememberedValue17);
                                        }
                                        composer5.endReplaceGroup();
                                        TradingTrendsInsightPanel.TradingTrendsInsightPanel(insightsPanelText, sourceText, str2, function02, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(constraintLayoutScope2.constrainAs(companion6, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue17), f, composer5, 0, i10), composer5, 0, 0);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    composer5.endReplaceGroup();
                                    composer5.endReplaceGroup();
                                    if (constraintLayoutScope.getHelpersHashCode() != i9) {
                                        EffectsKt.SideEffect(function0, composer5, 6);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            };
                            function23 = function26;
                            function13 = function16;
                            composer2 = composerStartRestartGroup;
                            LayoutKt.MultiMeasureLayout(modifierSemantics$default, ComposableLambda3.rememberComposableLambda(1200550679, true, function27, composerStartRestartGroup, 54), measurePolicy, composer2, 48, 0);
                            composer2.endReplaceGroup();
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function24 = function23;
                        composer3 = composer2;
                        function14 = function13;
                        modifier3 = modifier6;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        composer3 = composerStartRestartGroup;
                        function14 = function12;
                        function24 = function22;
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TradingTrendsChartSection.TradingTrendsChartSection$lambda$18(instrumentId, viewState, modifier3, function14, function24, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                function22 = function2;
                if ((i3 & 9363) == 9362) {
                    if (i6 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (!Intrinsics.areEqual(viewState, TradingTrendsChartSectionState3.Disabled.INSTANCE)) {
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function12 = function1;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            function22 = function2;
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function12 = function1;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        function22 = function2;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TradingTrendsChartSection$lambda$17$lambda$12$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScrubState TradingTrendsChartSection$lambda$17$lambda$3(SnapshotState<ScrubState> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TradingTrendsChartSection$lambda$17$lambda$12$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }
}
