package com.robinhood.android.options.statistics;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
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
import com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnErrorState;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDataState4;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedChartLaunchMode;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartDataState2;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState3;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnPreTradeChartError;
import com.robinhood.android.options.lib.simulatedreturn.info.OptionsSimulatedReturnInfoFooterComposable;
import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSlider;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderLaunchMode;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p355ui.OptionChainSettingsPnlChartType;
import com.robinhood.models.p355ui.OptionOrderBundle;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionStatisticsSimulatedReturnComposable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\f\u0010\n\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002²\u0006\f\u0010\f\u001a\u0004\u0018\u00010\rX\u008a\u008e\u0002"}, m3636d2 = {"OptionStatisticsSimulatedReturnComposable", "", "viewState", "Lcom/robinhood/android/options/statistics/OptionStatisticsViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "inComposableTest", "", "(Lcom/robinhood/android/options/statistics/OptionStatisticsViewState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "feature-lib-options-statistics_externalDebug", "sliderPosition", "", "chartErrorState", "Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.statistics.OptionStatisticsSimulatedReturnComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionStatisticsSimulatedReturnComposable4 {

    /* compiled from: OptionStatisticsSimulatedReturnComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsSimulatedReturnComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionChainSettingsPnlChartType.values().length];
            try {
                iArr[OptionChainSettingsPnlChartType.BY_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChainSettingsPnlChartType.OVER_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionStatisticsSimulatedReturnComposable$lambda$0(OptionStatisticsViewState optionStatisticsViewState, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        OptionStatisticsSimulatedReturnComposable(optionStatisticsViewState, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionStatisticsSimulatedReturnComposable$lambda$21(OptionStatisticsViewState optionStatisticsViewState, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        OptionStatisticsSimulatedReturnComposable(optionStatisticsViewState, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionStatisticsSimulatedReturnComposable(final OptionStatisticsViewState viewState, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composer2;
        final Modifier modifier4;
        Object obj;
        int i5;
        float f;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1295567270);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier4 = modifier2;
                    z3 = z2;
                } else {
                    modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    boolean z4 = i4 == 0 ? false : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1295567270, i3, -1, "com.robinhood.android.options.statistics.OptionStatisticsSimulatedReturnComposable (OptionStatisticsSimulatedReturnComposable.kt:32)");
                    }
                    if (viewState.getAccountNumber() != null || viewState.getPnlChartType() == null || viewState.getSimulatedReturnSliderLaunchMode() == null) {
                        final Modifier modifier5 = modifier3;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            final boolean z5 = z4;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.statistics.OptionStatisticsSimulatedReturnComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    return OptionStatisticsSimulatedReturnComposable4.OptionStatisticsSimulatedReturnComposable$lambda$0(viewState, modifier5, z5, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierClipToBounds = Clip.clipToBounds(TestTag3.testTag(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), OptionStatisticsComposable.TEST_TAG_SIMULATED_RETURN_PAGE));
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierClipToBounds);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    final Column6 column6 = Column6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1006899716);
                    if (!z4) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        OptionOrderBundle optionOrderBundleForChart = viewState.getOptionOrderBundleForChart();
                        composerStartRestartGroup.startReplaceGroup(1006904675);
                        if (optionOrderBundleForChart != null) {
                            OptionChainSettingsPnlChartType pnlChartType = viewState.getPnlChartType();
                            int i7 = pnlChartType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[pnlChartType.ordinal()];
                            if (i7 == 1) {
                                composerStartRestartGroup.startReplaceGroup(-1275133394);
                                String accountNumber = viewState.getAccountNumber();
                                OptionsSimulatedReturnLoggingState simulatedReturnLoggingState = viewState.getSimulatedReturnLoggingState();
                                Double dOptionStatisticsSimulatedReturnComposable$lambda$2 = OptionStatisticsSimulatedReturnComposable$lambda$2(snapshotState);
                                OptionsProfitAndLossChartDataState4.PreTrade preTrade = new OptionsProfitAndLossChartDataState4.PreTrade(viewState.getDefaultPricingSetting());
                                OptionSimulatedChartBundle optionSimulatedChartBundle = OptionSimulatedChartBundle3.toOptionSimulatedChartBundle(optionOrderBundleForChart);
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 == companion.getEmpty()) {
                                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.options.statistics.OptionStatisticsSimulatedReturnComposableKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            return OptionStatisticsSimulatedReturnComposable4.m2283xc7aefaf8((Double) obj2);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                Function1 function1 = (Function1) objRememberedValue3;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.options.statistics.OptionStatisticsSimulatedReturnComposableKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            return OptionStatisticsSimulatedReturnComposable4.m2280xeaaf1c4f(snapshotState2, (OptionsSimulatedReturnErrorState) obj2);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                OptionsSimulatedReturnChartKt.OptionsSimulatedReturnChart(new OptionsSimulatedChartLaunchMode.ProfitAndLoss(accountNumber, simulatedReturnLoggingState, dOptionStatisticsSimulatedReturnComposable$lambda$2, true, false, true, preTrade, optionSimulatedChartBundle, function1, (Function1) objRememberedValue4, OptionStatisticsSimulatedReturnComposable.INSTANCE.m2279x4d9de665(), ComposableLambda3.rememberComposableLambda(-915328089, true, new Function3<OptionsSimulatedReturnErrorState, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.statistics.OptionStatisticsSimulatedReturnComposableKt$OptionStatisticsSimulatedReturnComposable$2$1$3
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState, Composer composer3, Integer num) {
                                        invoke(optionsSimulatedReturnErrorState, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(OptionsSimulatedReturnErrorState it, Composer composer3, int i8) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        if ((i8 & 17) == 16 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-915328089, i8, -1, "com.robinhood.android.options.statistics.OptionStatisticsSimulatedReturnComposable.<anonymous>.<anonymous>.<anonymous> (OptionStatisticsSimulatedReturnComposable.kt:71)");
                                        }
                                        OptionsSimulatedReturnPreTradeChartError.OptionsSimulatedReturnPreTradeChartError(Column5.weight$default(column6, Modifier.INSTANCE, 1.0f, false, 2, null), composer3, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), 16, null), Column5.weight$default(column6, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, OptionsSimulatedChartLaunchMode.ProfitAndLoss.$stable, 0);
                                composerStartRestartGroup.endReplaceGroup();
                                Unit unit = Unit.INSTANCE;
                                composerStartRestartGroup.endReplaceGroup();
                                if (OptionStatisticsSimulatedReturnComposable$lambda$20$lambda$5(snapshotState2) == null) {
                                }
                                composer2.endReplaceGroup();
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, i5, obj);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                OptionsSimulatedReturnInfoFooterComposable.OptionsSimulatedReturnInfoFooterComposable(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21591getLargeD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), 0.0f, 8, null), false, composer2, 0, 2);
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z3 = z4;
                            } else {
                                if (i7 != 2) {
                                    composerStartRestartGroup.startReplaceGroup(-733871239);
                                    composerStartRestartGroup.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composerStartRestartGroup.startReplaceGroup(-1273446529);
                                String accountNumber2 = viewState.getAccountNumber();
                                OptionsSimulatedReturnChartViewState3 optionsSimulatedReturnChartViewState3 = OptionsSimulatedReturnChartViewState3.DOLLAR;
                                OptionsSimulatedReturnLoggingState simulatedReturnLoggingState2 = viewState.getSimulatedReturnLoggingState();
                                OptionSimulatedChartBundle optionSimulatedChartBundle2 = OptionSimulatedChartBundle3.toOptionSimulatedChartBundle(optionOrderBundleForChart);
                                OptionsSimulatedReturnChartDataState2 simulatedReturnChartLaunchMode = viewState.getSimulatedReturnChartLaunchMode();
                                Double dOptionStatisticsSimulatedReturnComposable$lambda$22 = OptionStatisticsSimulatedReturnComposable$lambda$2(snapshotState);
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue5 == companion.getEmpty()) {
                                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.options.statistics.OptionStatisticsSimulatedReturnComposableKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            return OptionStatisticsSimulatedReturnComposable4.m2281x94fdd24c((Double) obj2);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                }
                                Function1 function12 = (Function1) objRememberedValue5;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue6 == companion.getEmpty()) {
                                    objRememberedValue6 = new Function1() { // from class: com.robinhood.android.options.statistics.OptionStatisticsSimulatedReturnComposableKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            return OptionStatisticsSimulatedReturnComposable4.m2282xbec737d0(snapshotState2, (OptionsSimulatedReturnErrorState) obj2);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                OptionsSimulatedReturnChartKt.OptionsSimulatedReturnChart(new OptionsSimulatedChartLaunchMode.SimulatedReturn(accountNumber2, null, optionsSimulatedReturnChartViewState3, simulatedReturnLoggingState2, optionSimulatedChartBundle2, simulatedReturnChartLaunchMode, dOptionStatisticsSimulatedReturnComposable$lambda$22, true, false, true, function12, (Function1) objRememberedValue6, OptionStatisticsSimulatedReturnComposable.INSTANCE.m2278x1a85e3ee(), ComposableLambda3.rememberComposableLambda(-1122774944, true, new Function3<OptionsSimulatedReturnErrorState, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.statistics.OptionStatisticsSimulatedReturnComposableKt$OptionStatisticsSimulatedReturnComposable$2$1$6
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState, Composer composer3, Integer num) {
                                        invoke(optionsSimulatedReturnErrorState, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(OptionsSimulatedReturnErrorState it, Composer composer3, int i9) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        if ((i9 & 17) == 16 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1122774944, i9, -1, "com.robinhood.android.options.statistics.OptionStatisticsSimulatedReturnComposable.<anonymous>.<anonymous>.<anonymous> (OptionStatisticsSimulatedReturnComposable.kt:100)");
                                        }
                                        OptionsSimulatedReturnPreTradeChartError.OptionsSimulatedReturnPreTradeChartError(Column5.weight$default(column6, Modifier.INSTANCE, 1.0f, false, 2, null), composer3, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), 256, null), Column5.weight$default(column6, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, OptionsSimulatedChartLaunchMode.SimulatedReturn.$stable, 0);
                                composerStartRestartGroup.endReplaceGroup();
                                Unit unit2 = Unit.INSTANCE;
                                composerStartRestartGroup.endReplaceGroup();
                                if (OptionStatisticsSimulatedReturnComposable$lambda$20$lambda$5(snapshotState2) == null) {
                                    OptionsSimulatedReturnSliderLaunchMode simulatedReturnSliderLaunchMode = viewState.getSimulatedReturnSliderLaunchMode();
                                    OptionsSimulatedReturnLoggingState simulatedReturnLoggingState3 = viewState.getSimulatedReturnLoggingState();
                                    long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue7 == companion.getEmpty()) {
                                        objRememberedValue7 = new Function1() { // from class: com.robinhood.android.options.statistics.OptionStatisticsSimulatedReturnComposableKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                return OptionStatisticsSimulatedReturnComposable4.m2284x4f9e1b19(snapshotState, ((Double) obj2).doubleValue());
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                    }
                                    Function1 function13 = (Function1) objRememberedValue7;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue8 == companion.getEmpty()) {
                                        objRememberedValue8 = new Function0() { // from class: com.robinhood.android.options.statistics.OptionStatisticsSimulatedReturnComposableKt$$ExternalSyntheticLambda6
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    modifier4 = modifier3;
                                    obj = null;
                                    i5 = 1;
                                    f = 0.0f;
                                    OptionsSimulatedReturnSlider.m16968OptionsSimulatedReturnSliderHzv_svQ(simulatedReturnSliderLaunchMode, null, simulatedReturnLoggingState3, true, jM21371getBg0d7_KjU, function13, null, false, false, (Function0) objRememberedValue8, composerStartRestartGroup, 805506096 | OptionsSimulatedReturnSliderLaunchMode.$stable | (OptionsSimulatedReturnLoggingState.$stable << 6), 448);
                                    composer2 = composerStartRestartGroup;
                                } else {
                                    composer2 = composerStartRestartGroup;
                                    modifier4 = modifier3;
                                    obj = null;
                                    i5 = 1;
                                    f = 0.0f;
                                }
                                composer2.endReplaceGroup();
                                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, i5, obj);
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i82 = BentoTheme.$stable;
                                OptionsSimulatedReturnInfoFooterComposable.OptionsSimulatedReturnInfoFooterComposable(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, bentoTheme2.getSpacing(composer2, i82).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i82).m21591getLargeD9Ej5fM(), bentoTheme2.getSpacing(composer2, i82).m21592getMediumD9Ej5fM(), 0.0f, 8, null), false, composer2, 0, 2);
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z3 = z4;
                            }
                        } else {
                            composerStartRestartGroup.endReplaceGroup();
                            if (OptionStatisticsSimulatedReturnComposable$lambda$20$lambda$5(snapshotState2) == null) {
                            }
                            composer2.endReplaceGroup();
                            Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, i5, obj);
                            BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                            int i822 = BentoTheme.$stable;
                            OptionsSimulatedReturnInfoFooterComposable.OptionsSimulatedReturnInfoFooterComposable(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default22, bentoTheme22.getSpacing(composer2, i822).m21592getMediumD9Ej5fM(), bentoTheme22.getSpacing(composer2, i822).m21591getLargeD9Ej5fM(), bentoTheme22.getSpacing(composer2, i822).m21592getMediumD9Ej5fM(), 0.0f, 8, null), false, composer2, 0, 2);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z3 = z4;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 != null) {
                    scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.options.statistics.OptionStatisticsSimulatedReturnComposableKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return OptionStatisticsSimulatedReturnComposable4.OptionStatisticsSimulatedReturnComposable$lambda$21(viewState, modifier4, z3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            z2 = z;
            if ((i3 & 147) == 146) {
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (viewState.getAccountNumber() != null) {
                }
                final Modifier modifier52 = modifier3;
                if (ComposerKt.isTraceInProgress()) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i3 & 147) == 146) {
        }
        scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionStatisticsSimulatedReturnComposable$lambda$20$lambda$15$lambda$8$lambda$7 */
    public static final Unit m2283xc7aefaf8(Double d) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionStatisticsSimulatedReturnComposable$lambda$20$lambda$15$lambda$10$lambda$9 */
    public static final Unit m2280xeaaf1c4f(SnapshotState snapshotState, OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState) {
        snapshotState.setValue(optionsSimulatedReturnErrorState);
        return Unit.INSTANCE;
    }

    private static final Double OptionStatisticsSimulatedReturnComposable$lambda$2(SnapshotState<Double> snapshotState) {
        return snapshotState.getValue();
    }

    private static final OptionsSimulatedReturnErrorState OptionStatisticsSimulatedReturnComposable$lambda$20$lambda$5(SnapshotState<OptionsSimulatedReturnErrorState> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionStatisticsSimulatedReturnComposable$lambda$20$lambda$15$lambda$12$lambda$11 */
    public static final Unit m2281x94fdd24c(Double d) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionStatisticsSimulatedReturnComposable$lambda$20$lambda$15$lambda$14$lambda$13 */
    public static final Unit m2282xbec737d0(SnapshotState snapshotState, OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState) {
        snapshotState.setValue(optionsSimulatedReturnErrorState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionStatisticsSimulatedReturnComposable$lambda$20$lambda$17$lambda$16 */
    public static final Unit m2284x4f9e1b19(SnapshotState snapshotState, double d) {
        snapshotState.setValue(Double.valueOf(d));
        return Unit.INSTANCE;
    }
}
