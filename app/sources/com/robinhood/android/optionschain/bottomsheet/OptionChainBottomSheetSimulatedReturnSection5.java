package com.robinhood.android.optionschain.bottomsheet;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
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
import com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnErrorState;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDataState4;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedChartLaunchMode;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartDataState2;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState3;
import com.robinhood.android.options.lib.simulatedreturn.header.OptionsSimulatedChartHeaderState;
import com.robinhood.android.options.lib.simulatedreturn.header.OptionsSimulatedReturnProfitLossHeader;
import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSlider;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderLaunchMode;
import com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetSimulatedReturnSection4;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
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

/* compiled from: OptionChainBottomSheetSimulatedReturnSection.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\u001aO\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010²\u0006\f\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u008a\u008e\u0002²\u0006\f\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002"}, m3636d2 = {"OptionChainBottomSheetSimulatedReturnSection", "", "viewState", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetSimulatedChartSectionState;", "isFullyExpanded", "", "isBottomSheetHiddenOrNull", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "onChartErrorStateUpdated", "Lkotlin/Function1;", "Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;", "modifier", "Landroidx/compose/ui/Modifier;", "OptionChainBottomSheetSimulatedReturnSection-fWhpE4E", "(Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetSimulatedChartSectionState;ZZJLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-options-chain_externalDebug", "sliderPosition", "", "chartErrorState"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetSimulatedReturnSectionKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionChainBottomSheetSimulatedReturnSection5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionChainBottomSheetSimulatedReturnSection_fWhpE4E$lambda$20(OptionChainBottomSheetSimulatedReturnSection4 optionChainBottomSheetSimulatedReturnSection4, boolean z, boolean z2, long j, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m17169OptionChainBottomSheetSimulatedReturnSectionfWhpE4E(optionChainBottomSheetSimulatedReturnSection4, z, z2, j, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0172  */
    /* renamed from: OptionChainBottomSheetSimulatedReturnSection-fWhpE4E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17169OptionChainBottomSheetSimulatedReturnSectionfWhpE4E(final OptionChainBottomSheetSimulatedReturnSection4 viewState, final boolean z, final boolean z2, final long j, final Function1<? super OptionsSimulatedReturnErrorState, Unit> onChartErrorStateUpdated, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        final SnapshotState snapshotState;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        SnapshotState snapshotState2;
        final SnapshotState snapshotState3;
        int i4;
        SnapshotState snapshotState4;
        Composer composer2;
        Composer composer3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onChartErrorStateUpdated, "onChartErrorStateUpdated");
        Composer composerStartRestartGroup = composer.startRestartGroup(-215614976);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            z3 = z2;
        } else {
            z3 = z2;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onChartErrorStateUpdated) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-215614976, i3, -1, "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetSimulatedReturnSection (OptionChainBottomSheetSimulatedReturnSection.kt:41)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SnapshotState snapshotState5 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                Modifier modifier4 = modifier3;
                if (OptionChainBottomSheetSimulatedReturnSection_fWhpE4E$lambda$4(snapshotState) != null) {
                    modifierFillMaxWidth$default = SizeKt.m5156height3ABfNKs(modifierFillMaxWidth$default, C2002Dp.m7995constructorimpl(z ? 400 : 300));
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                int i6 = i3;
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                if (viewState instanceof OptionChainBottomSheetSimulatedReturnSection4.PnlChart) {
                    snapshotState2 = snapshotState5;
                    if (!(viewState instanceof OptionChainBottomSheetSimulatedReturnSection4.SimulatedReturn)) {
                        composerStartRestartGroup.startReplaceGroup(1870420483);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-2144796899);
                    OptionChainBottomSheetSimulatedReturnSection4.SimulatedReturn simulatedReturn = (OptionChainBottomSheetSimulatedReturnSection4.SimulatedReturn) viewState;
                    String accountNumber = simulatedReturn.getAccountNumber();
                    OptionsSimulatedReturnChartViewState3 optionsSimulatedReturnChartViewState3 = OptionsSimulatedReturnChartViewState3.DOLLAR;
                    OptionsSimulatedReturnLoggingState loggingState = simulatedReturn.getLoggingState();
                    OptionSimulatedChartBundle optionSimulatedChartBundle = OptionSimulatedChartBundle3.toOptionSimulatedChartBundle(simulatedReturn.getOptionOrderBundle());
                    OptionsSimulatedReturnChartDataState2 simulatedReturnChartLaunchMode = simulatedReturn.getSimulatedReturnChartLaunchMode();
                    Double dOptionChainBottomSheetSimulatedReturnSection_fWhpE4E$lambda$1 = OptionChainBottomSheetSimulatedReturnSection_fWhpE4E$lambda$1(snapshotState2);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetSimulatedReturnSectionKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return OptionChainBottomSheetSimulatedReturnSection5.m2318x6db5126f((Double) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    Function1 function1 = (Function1) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean z4 = (i6 & 57344) == 16384;
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (z4 || objRememberedValue4 == companion.getEmpty()) {
                        snapshotState3 = snapshotState;
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetSimulatedReturnSectionKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return OptionChainBottomSheetSimulatedReturnSection5.m2319x977e77f3(onChartErrorStateUpdated, snapshotState3, (OptionsSimulatedReturnErrorState) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        snapshotState3 = snapshotState;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    i4 = 1;
                    snapshotState4 = snapshotState3;
                    composer2 = composerStartRestartGroup;
                    OptionsSimulatedReturnChartKt.OptionsSimulatedReturnChart(new OptionsSimulatedChartLaunchMode.SimulatedReturn(accountNumber, null, optionsSimulatedReturnChartViewState3, loggingState, optionSimulatedChartBundle, simulatedReturnChartLaunchMode, dOptionChainBottomSheetSimulatedReturnSection_fWhpE4E$lambda$1, true, z2, z, function1, (Function1) objRememberedValue4, ComposableLambda3.rememberComposableLambda(956705405, true, new Function3<OptionsSimulatedChartHeaderState, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetSimulatedReturnSectionKt$OptionChainBottomSheetSimulatedReturnSection$2$6
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(OptionsSimulatedChartHeaderState optionsSimulatedChartHeaderState, Composer composer4, Integer num) {
                            invoke(optionsSimulatedChartHeaderState, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(OptionsSimulatedChartHeaderState headerState, Composer composer4, int i7) {
                            Intrinsics.checkNotNullParameter(headerState, "headerState");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(956705405, i7, -1, "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetSimulatedReturnSection.<anonymous>.<anonymous> (OptionChainBottomSheetSimulatedReturnSection.kt:103)");
                            }
                            OptionsSimulatedReturnProfitLossHeader.OptionsSimulatedReturnProfitLossHeader(headerState, z, null, composer4, i7 & 14, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), OptionChainBottomSheetSimulatedReturnSection.INSTANCE.getLambda$1376735753$feature_options_chain_externalDebug()), Column5.weight$default(column6, Modifier.INSTANCE, 1.0f, false, 2, null), composer2, OptionsSimulatedChartLaunchMode.SimulatedReturn.$stable, 0);
                    composer2.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-2146468884);
                    OptionChainBottomSheetSimulatedReturnSection4.PnlChart pnlChart = (OptionChainBottomSheetSimulatedReturnSection4.PnlChart) viewState;
                    String accountNumber2 = pnlChart.getAccountNumber();
                    OptionsSimulatedReturnLoggingState loggingState2 = pnlChart.getLoggingState();
                    Double dOptionChainBottomSheetSimulatedReturnSection_fWhpE4E$lambda$12 = OptionChainBottomSheetSimulatedReturnSection_fWhpE4E$lambda$1(snapshotState5);
                    OptionsProfitAndLossChartDataState4.PreTrade preTrade = new OptionsProfitAndLossChartDataState4.PreTrade(pnlChart.getDefaultPricingSetting());
                    OptionSimulatedChartBundle optionSimulatedChartBundle2 = OptionSimulatedChartBundle3.toOptionSimulatedChartBundle(pnlChart.getOptionOrderBundle());
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new Function1() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetSimulatedReturnSectionKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return OptionChainBottomSheetSimulatedReturnSection5.m2322xd46de7db((Double) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    Function1 function12 = (Function1) objRememberedValue5;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean z5 = (i6 & 57344) == 16384;
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (z5 || objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new Function1() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetSimulatedReturnSectionKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return OptionChainBottomSheetSimulatedReturnSection5.m2317x75cdcbcc(onChartErrorStateUpdated, snapshotState, (OptionsSimulatedReturnErrorState) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    snapshotState4 = snapshotState;
                    snapshotState2 = snapshotState5;
                    OptionsSimulatedReturnChartKt.OptionsSimulatedReturnChart(new OptionsSimulatedChartLaunchMode.ProfitAndLoss(accountNumber2, loggingState2, dOptionChainBottomSheetSimulatedReturnSection_fWhpE4E$lambda$12, true, z3, z, preTrade, optionSimulatedChartBundle2, function12, (Function1) objRememberedValue6, ComposableLambda3.rememberComposableLambda(1801522966, true, new Function3<OptionsSimulatedChartHeaderState, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetSimulatedReturnSectionKt$OptionChainBottomSheetSimulatedReturnSection$2$3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(OptionsSimulatedChartHeaderState optionsSimulatedChartHeaderState, Composer composer4, Integer num) {
                            invoke(optionsSimulatedChartHeaderState, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(OptionsSimulatedChartHeaderState headerState, Composer composer4, int i7) {
                            Intrinsics.checkNotNullParameter(headerState, "headerState");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1801522966, i7, -1, "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetSimulatedReturnSection.<anonymous>.<anonymous> (OptionChainBottomSheetSimulatedReturnSection.kt:71)");
                            }
                            OptionsSimulatedReturnProfitLossHeader.OptionsSimulatedReturnProfitLossHeader(headerState, z, null, composer4, i7 & 14, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), OptionChainBottomSheetSimulatedReturnSection.INSTANCE.getLambda$1868999074$feature_options_chain_externalDebug()), Column5.weight$default(column6, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, OptionsSimulatedChartLaunchMode.ProfitAndLoss.$stable, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    i4 = 1;
                }
                composer2.startReplaceGroup(1870527191);
                if (OptionChainBottomSheetSimulatedReturnSection_fWhpE4E$lambda$4(snapshotState4) != null) {
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(OffsetKt.m5125offsetVpY3zN4$default(companion3, 0.0f, C2002Dp.m7995constructorimpl(-bentoTheme.getSpacing(composer2, i7).m21593getSmallD9Ej5fM()), i4, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i7).m21593getSmallD9Ej5fM(), 7, null);
                    OptionsSimulatedReturnSliderLaunchMode simulatedReturnSliderLaunchMode = viewState.getSimulatedReturnSliderLaunchMode();
                    OptionsSimulatedReturnLoggingState loggingState3 = viewState.getLoggingState();
                    composer2.startReplaceGroup(5004770);
                    Object objRememberedValue7 = composer2.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        final SnapshotState snapshotState6 = snapshotState2;
                        objRememberedValue7 = new Function1() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetSimulatedReturnSectionKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return OptionChainBottomSheetSimulatedReturnSection5.m2320xc147dd77(snapshotState6, ((Double) obj).doubleValue());
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    Function1 function13 = (Function1) objRememberedValue7;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(1849434622);
                    Object objRememberedValue8 = composer2.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = new Function0() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetSimulatedReturnSectionKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue8);
                    }
                    composer2.endReplaceGroup();
                    Composer composer4 = composer2;
                    OptionsSimulatedReturnSlider.m16968OptionsSimulatedReturnSliderHzv_svQ(simulatedReturnSliderLaunchMode, null, loggingState3, true, j, function13, modifierM5146paddingqDBjuR0$default, false, z2, (Function0) objRememberedValue8, composer4, 805506096 | OptionsSimulatedReturnSliderLaunchMode.$stable | (OptionsSimulatedReturnLoggingState.$stable << 6) | ((i6 << 3) & 57344) | ((i6 << 18) & 234881024), 128);
                    composer3 = composer4;
                    if (z) {
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer3, i7).m21373getBg30d7_KjU(), 0.0f, composer3, 0, 5);
                    }
                } else {
                    composer3 = composer2;
                }
                composer3.endReplaceGroup();
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier5 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetSimulatedReturnSectionKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionChainBottomSheetSimulatedReturnSection5.OptionChainBottomSheetSimulatedReturnSection_fWhpE4E$lambda$20(viewState, z, z2, j, onChartErrorStateUpdated, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            SnapshotState snapshotState52 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            Modifier modifier42 = modifier3;
            if (OptionChainBottomSheetSimulatedReturnSection_fWhpE4E$lambda$4(snapshotState) != null) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            int i62 = i3;
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                if (viewState instanceof OptionChainBottomSheetSimulatedReturnSection4.PnlChart) {
                }
                composer2.startReplaceGroup(1870527191);
                if (OptionChainBottomSheetSimulatedReturnSection_fWhpE4E$lambda$4(snapshotState4) != null) {
                }
                composer3.endReplaceGroup();
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionChainBottomSheetSimulatedReturnSection_fWhpE4E$lambda$19$lambda$8$lambda$7 */
    public static final Unit m2322xd46de7db(Double d) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionChainBottomSheetSimulatedReturnSection_fWhpE4E$lambda$19$lambda$10$lambda$9 */
    public static final Unit m2317x75cdcbcc(Function1 function1, SnapshotState snapshotState, OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState) {
        snapshotState.setValue(optionsSimulatedReturnErrorState);
        function1.invoke(optionsSimulatedReturnErrorState);
        return Unit.INSTANCE;
    }

    private static final Double OptionChainBottomSheetSimulatedReturnSection_fWhpE4E$lambda$1(SnapshotState<Double> snapshotState) {
        return snapshotState.getValue();
    }

    private static final OptionsSimulatedReturnErrorState OptionChainBottomSheetSimulatedReturnSection_fWhpE4E$lambda$4(SnapshotState<OptionsSimulatedReturnErrorState> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionChainBottomSheetSimulatedReturnSection_fWhpE4E$lambda$19$lambda$12$lambda$11 */
    public static final Unit m2318x6db5126f(Double d) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionChainBottomSheetSimulatedReturnSection_fWhpE4E$lambda$19$lambda$14$lambda$13 */
    public static final Unit m2319x977e77f3(Function1 function1, SnapshotState snapshotState, OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState) {
        snapshotState.setValue(optionsSimulatedReturnErrorState);
        function1.invoke(optionsSimulatedReturnErrorState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionChainBottomSheetSimulatedReturnSection_fWhpE4E$lambda$19$lambda$16$lambda$15 */
    public static final Unit m2320xc147dd77(SnapshotState snapshotState, double d) {
        snapshotState.setValue(Double.valueOf(d));
        return Unit.INSTANCE;
    }
}
