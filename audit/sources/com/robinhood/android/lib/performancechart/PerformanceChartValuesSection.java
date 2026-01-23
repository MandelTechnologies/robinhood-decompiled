package com.robinhood.android.lib.performancechart;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt;
import com.robinhood.android.charts.cursor.CursorData;
import com.robinhood.android.charts.cursor.CursorDataConfig;
import com.robinhood.android.charts.cursor.CursorRowModifiers;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.lib.performancechart.PerformanceChartStateProvider3;
import com.robinhood.android.models.portfolio.PerformanceChartModel;
import com.robinhood.android.sdui.chartgroup.SduiCursorData2;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.PriceChartData;
import com.robinhood.models.serverdriven.experimental.extensions.Format2;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PerformanceChartValuesSection.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a¦\u0001\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u000620\u0010\u0011\u001a,\u0012\u0004\u0012\u00020\u000b\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122#\b\u0002\u0010\u0015\u001a\u001d\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0018H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001b\u001a\u00020\u00148\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f²\u0006\f\u0010\u001e\u001a\u00020\u001d8\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/lib/performancechart/PerformanceChartViewState$Ready;", "state", "Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "displayCursorData", "", "hasBenchmarks", "Lkotlin/Function0;", "", "onEducationFocus", "onBigNumberClicked", "Lkotlin/Function2;", "Landroidx/compose/foundation/layout/RowScope;", "Lcom/robinhood/models/util/Money;", "Lkotlin/ParameterName;", "name", "usdAmount", "Lkotlin/ExtensionFunctionType;", "fxTooltipContent", "Landroidx/compose/ui/Modifier;", "modifier", "", "trailingChartValuesContent", "PerformanceChartValuesSection", "(Lcom/robinhood/android/lib/performancechart/PerformanceChartViewState$Ready;Lcom/robinhood/models/serverdriven/experimental/api/CursorData;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function4;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/charts/cursor/CursorData$SubDisplayText;", "boldMain", "(Lcom/robinhood/android/charts/cursor/CursorData$SubDisplayText;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/cursor/CursorData$SubDisplayText;", "PERFORMANCE_CHART_PRIVACY_IDENTIFIER", "Ljava/lang/String;", "Lcom/robinhood/android/charts/cursor/CursorRowModifiers$ChartEducationTour;", "rowModifiers", "lib-performance-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartValuesSectionKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class PerformanceChartValuesSection {
    public static final String PERFORMANCE_CHART_PRIVACY_IDENTIFIER = "portfolio-has-chart-privacy-toggle";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PerformanceChartValuesSection$lambda$5(PerformanceChartStateProvider3.Ready ready, CursorData cursorData, boolean z, Function0 function0, Function0 function02, Function4 function4, Modifier modifier, Function4 function42, int i, int i2, Composer composer, int i3) {
        PerformanceChartValuesSection(ready, cursorData, z, function0, function02, function4, modifier, function42, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PerformanceChartValuesSection(final PerformanceChartStateProvider3.Ready state, final CursorData cursorData, final boolean z, final Function0<Unit> onEducationFocus, Function0<Unit> onBigNumberClicked, final Function4<? super Row5, ? super Money, ? super Composer, ? super Integer, Unit> function4, Modifier modifier, Function4<? super Row5, ? super String, ? super Composer, ? super Integer, Unit> function42, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Function4<? super Row5, ? super String, ? super Composer, ? super Integer, Unit> function43;
        Object objRememberedValue;
        Composer.Companion companion;
        int i5;
        final EventLogger eventLogger;
        final Function4<? super Row5, ? super String, ? super Composer, ? super Integer, Unit> function44;
        final PerformanceChartModel performanceChartModel;
        Modifier modifier3;
        com.robinhood.android.charts.cursor.CursorData cursorData2;
        final Screen screen;
        com.robinhood.android.charts.cursor.CursorData composableModel;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final Function0<Unit> function0;
        Composer composer2;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEducationFocus, "onEducationFocus");
        Intrinsics.checkNotNullParameter(onBigNumberClicked, "onBigNumberClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-664950985);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(cursorData) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onEducationFocus) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBigNumberClicked) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function4) ? 131072 : 65536;
        }
        int i6 = i2 & 64;
        if (i6 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 == 0) {
                i3 |= 12582912;
                function43 = function42;
            } else {
                function43 = function42;
                if ((i & 12582912) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function43) ? 8388608 : 4194304;
                }
            }
            if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (i4 != 0) {
                    function43 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-664950985, i3, -1, "com.robinhood.android.lib.performancechart.PerformanceChartValuesSection (PerformanceChartValuesSection.kt:40)");
                }
                EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                Screen screen2 = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                PerformanceChartModel chartModel = state.getChartModel();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue != companion.getEmpty()) {
                    i5 = i3;
                    modifier3 = modifier5;
                    performanceChartModel = chartModel;
                    eventLogger = current;
                    function44 = function43;
                    screen = screen2;
                    cursorData2 = null;
                    objRememberedValue = SnapshotState3.mutableStateOf$default(new CursorRowModifiers.ChartEducationTour(onEducationFocus, null, null, null, 14, null), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    i5 = i3;
                    eventLogger = current;
                    function44 = function43;
                    performanceChartModel = chartModel;
                    modifier3 = modifier5;
                    cursorData2 = null;
                    screen = screen2;
                }
                SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(932256170);
                composableModel = cursorData != null ? cursorData2 : SduiCursorData2.toComposableModel(cursorData, composerStartRestartGroup, (i5 >> 3) & 14);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(932256990);
                com.robinhood.android.charts.cursor.CursorData cursorDataCopy$default = cursorData2;
                if (composableModel != null) {
                    CursorData.SubDisplayText secondaryValue = composableModel.getSecondaryValue();
                    composerStartRestartGroup.startReplaceGroup(932259169);
                    CursorData.SubDisplayText subDisplayTextBoldMain = secondaryValue == null ? cursorData2 : boldMain(secondaryValue, composerStartRestartGroup, CursorData.SubDisplayText.$stable);
                    composerStartRestartGroup.endReplaceGroup();
                    CursorData.SubDisplayText tertiaryValue = composableModel.getTertiaryValue();
                    composerStartRestartGroup.startReplaceGroup(932261057);
                    Object objBoldMain = cursorData2;
                    if (tertiaryValue != null) {
                        objBoldMain = boldMain(tertiaryValue, composerStartRestartGroup, CursorData.SubDisplayText.$stable);
                    }
                    CursorData.SubDisplayText subDisplayText = objBoldMain;
                    composerStartRestartGroup.endReplaceGroup();
                    cursorDataCopy$default = com.robinhood.android.charts.cursor.CursorData.copy$default(composableModel, null, null, subDisplayTextBoldMain, subDisplayText, null, null, 51, null);
                }
                composerStartRestartGroup.endReplaceGroup();
                CursorRowModifiers.ChartEducationTour chartEducationTourPerformanceChartValuesSection$lambda$1 = PerformanceChartValuesSection$lambda$1(snapshotState);
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1387103433, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartValuesSectionKt.PerformanceChartValuesSection.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                        invoke(row5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(final Row5 ChartCursorDataHeaderSection, Composer composer3, int i7) {
                        Row5 row5;
                        PriceChartData price_chart_data;
                        com.robinhood.models.serverdriven.experimental.api.Money dollar_value;
                        Intrinsics.checkNotNullParameter(ChartCursorDataHeaderSection, "$this$ChartCursorDataHeaderSection");
                        if ((i7 & 6) == 0) {
                            i7 |= composer3.changed(ChartCursorDataHeaderSection) ? 4 : 2;
                        }
                        if ((i7 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1387103433, i7, -1, "com.robinhood.android.lib.performancechart.PerformanceChartValuesSection.<anonymous> (PerformanceChartValuesSection.kt:58)");
                        }
                        composer3.startReplaceGroup(1566538250);
                        if (state.getShowFxTooltipButton() && function4 != null) {
                            com.robinhood.models.serverdriven.experimental.api.CursorData defaultDisplay = performanceChartModel.getDefaultDisplay();
                            final Money money = (defaultDisplay == null || (price_chart_data = defaultDisplay.getPrice_chart_data()) == null || (dollar_value = price_chart_data.getDollar_value()) == null) ? null : Format2.toMoney(dollar_value);
                            UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor("portfolio-value", null, null, null, null, null, 62, null);
                            final Function4<Row5, Money, Composer, Integer, Unit> function45 = function4;
                            AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(1360449091, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartValuesSectionKt.PerformanceChartValuesSection.2.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i8) {
                                    if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1360449091, i8, -1, "com.robinhood.android.lib.performancechart.PerformanceChartValuesSection.<anonymous>.<anonymous> (PerformanceChartValuesSection.kt:65)");
                                    }
                                    function45.invoke(ChartCursorDataHeaderSection, money, composer4, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 48);
                        }
                        composer3.endReplaceGroup();
                        if (function44 != null) {
                            composer3.startReplaceGroup(1566554622);
                            if (state.getMarketValuesType() == null) {
                                row5 = ChartCursorDataHeaderSection;
                                Spacer2.Spacer(Row5.weight$default(row5, Modifier.INSTANCE, 1.0f, false, 2, null), composer3, 0);
                            } else {
                                row5 = ChartCursorDataHeaderSection;
                            }
                            composer3.endReplaceGroup();
                            function44.invoke(row5, state.getActiveSpan(), composer3, Integer.valueOf(i7 & 14));
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = composerStartRestartGroup.changedInstance(state) | composerStartRestartGroup.changedInstance(eventLogger) | composerStartRestartGroup.changedInstance(screen) | ((i5 & 57344) == 16384);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    function0 = onBigNumberClicked;
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartValuesSectionKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PerformanceChartValuesSection.PerformanceChartValuesSection$lambda$4$lambda$3(state, eventLogger, screen, function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    function0 = onBigNumberClicked;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier6 = modifier3;
                composer2 = composerStartRestartGroup;
                ChartCursorDataHeaderKt.ChartCursorDataHeaderSection(cursorDataCopy$default, modifier6, chartEducationTourPerformanceChartValuesSection$lambda$1, composableLambdaRememberComposableLambda, null, (Function0) objRememberedValue2, new CursorDataConfig(!z, false, state.getChartModel().isPrivacyEnabled(), false, false, false, 34, null), performanceChartModel.getDisplayCurrency().getServerValue(), state.getShowDisplayCurrencyLabel(), composer2, com.robinhood.android.charts.cursor.CursorData.$stable | 27648 | ((i5 >> 15) & 112) | (CursorRowModifiers.ChartEducationTour.$stable << 6) | (CursorDataConfig.$stable << 18), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function43 = function44;
                modifier4 = modifier6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function0 = onBigNumberClicked;
                modifier4 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartValuesSectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PerformanceChartValuesSection.PerformanceChartValuesSection$lambda$5(state, cursorData, z, onEducationFocus, function0, function4, modifier4, function43, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
            if (i6 == 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            Screen screen22 = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
            PerformanceChartModel chartModel2 = state.getChartModel();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue != companion.getEmpty()) {
            }
            SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(932256170);
            if (cursorData != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(932256990);
            com.robinhood.android.charts.cursor.CursorData cursorDataCopy$default2 = cursorData2;
            if (composableModel != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            CursorRowModifiers.ChartEducationTour chartEducationTourPerformanceChartValuesSection$lambda$12 = PerformanceChartValuesSection$lambda$1(snapshotState2);
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1387103433, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartValuesSectionKt.PerformanceChartValuesSection.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                    invoke(row5, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(final Row5 ChartCursorDataHeaderSection, Composer composer3, int i7) {
                    Row5 row5;
                    PriceChartData price_chart_data;
                    com.robinhood.models.serverdriven.experimental.api.Money dollar_value;
                    Intrinsics.checkNotNullParameter(ChartCursorDataHeaderSection, "$this$ChartCursorDataHeaderSection");
                    if ((i7 & 6) == 0) {
                        i7 |= composer3.changed(ChartCursorDataHeaderSection) ? 4 : 2;
                    }
                    if ((i7 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1387103433, i7, -1, "com.robinhood.android.lib.performancechart.PerformanceChartValuesSection.<anonymous> (PerformanceChartValuesSection.kt:58)");
                    }
                    composer3.startReplaceGroup(1566538250);
                    if (state.getShowFxTooltipButton() && function4 != null) {
                        com.robinhood.models.serverdriven.experimental.api.CursorData defaultDisplay = performanceChartModel.getDefaultDisplay();
                        final Money money = (defaultDisplay == null || (price_chart_data = defaultDisplay.getPrice_chart_data()) == null || (dollar_value = price_chart_data.getDollar_value()) == null) ? null : Format2.toMoney(dollar_value);
                        UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor("portfolio-value", null, null, null, null, null, 62, null);
                        final Function4<? super Row5, ? super Money, ? super Composer, ? super Integer, Unit> function45 = function4;
                        AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(1360449091, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartValuesSectionKt.PerformanceChartValuesSection.2.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i8) {
                                if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1360449091, i8, -1, "com.robinhood.android.lib.performancechart.PerformanceChartValuesSection.<anonymous>.<anonymous> (PerformanceChartValuesSection.kt:65)");
                                }
                                function45.invoke(ChartCursorDataHeaderSection, money, composer4, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 48);
                    }
                    composer3.endReplaceGroup();
                    if (function44 != null) {
                        composer3.startReplaceGroup(1566554622);
                        if (state.getMarketValuesType() == null) {
                            row5 = ChartCursorDataHeaderSection;
                            Spacer2.Spacer(Row5.weight$default(row5, Modifier.INSTANCE, 1.0f, false, 2, null), composer3, 0);
                        } else {
                            row5 = ChartCursorDataHeaderSection;
                        }
                        composer3.endReplaceGroup();
                        function44.invoke(row5, state.getActiveSpan(), composer3, Integer.valueOf(i7 & 14));
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            zChangedInstance = composerStartRestartGroup.changedInstance(state) | composerStartRestartGroup.changedInstance(eventLogger) | composerStartRestartGroup.changedInstance(screen) | ((i5 & 57344) == 16384);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
                function0 = onBigNumberClicked;
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartValuesSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PerformanceChartValuesSection.PerformanceChartValuesSection$lambda$4$lambda$3(state, eventLogger, screen, function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier62 = modifier3;
                composer2 = composerStartRestartGroup;
                ChartCursorDataHeaderKt.ChartCursorDataHeaderSection(cursorDataCopy$default2, modifier62, chartEducationTourPerformanceChartValuesSection$lambda$12, composableLambdaRememberComposableLambda2, null, (Function0) objRememberedValue2, new CursorDataConfig(!z, false, state.getChartModel().isPrivacyEnabled(), false, false, false, 34, null), performanceChartModel.getDisplayCurrency().getServerValue(), state.getShowDisplayCurrencyLabel(), composer2, com.robinhood.android.charts.cursor.CursorData.$stable | 27648 | ((i5 >> 15) & 112) | (CursorRowModifiers.ChartEducationTour.$stable << 6) | (CursorDataConfig.$stable << 18), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                function43 = function44;
                modifier4 = modifier62;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PerformanceChartValuesSection$lambda$4$lambda$3(PerformanceChartStateProvider3.Ready ready, EventLogger eventLogger, Screen screen, Function0 function0) {
        UserInteractionEventData.Action action;
        if (ready.getChartModel().isPrivacyEnabled()) {
            action = UserInteractionEventData.Action.TOGGLE_OFF;
        } else {
            action = UserInteractionEventData.Action.TOGGLE_ON;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, new Component(Component.ComponentType.TOGGLE, PERFORMANCE_CHART_PRIVACY_IDENTIFIER, null, 4, null), null, null, false, 56, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final CursorRowModifiers.ChartEducationTour PerformanceChartValuesSection$lambda$1(SnapshotState<CursorRowModifiers.ChartEducationTour> snapshotState) {
        return snapshotState.getValue();
    }

    private static final CursorData.SubDisplayText boldMain(CursorData.SubDisplayText subDisplayText, Composer composer, int i) {
        composer.startReplaceGroup(-249338080);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-249338080, i, -1, "com.robinhood.android.lib.performancechart.boldMain (PerformanceChartValuesSection.kt:107)");
        }
        composer.startReplaceGroup(904277086);
        CursorData.IconDisplayText main = subDisplayText.getMain();
        TextStyle style = main.getStyle();
        composer.startReplaceGroup(904278759);
        if (style == null) {
            style = ((Styles) composer.consume(Styles2.getLocalStyles())).getText(composer, 0).getStyle();
        }
        composer.endReplaceGroup();
        CursorData.IconDisplayText iconDisplayTextM11999copyiJQMabo$default = CursorData.IconDisplayText.m11999copyiJQMabo$default(main, null, 0L, null, null, TextStyle.m7655copyp1EtxEg$default(style, 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), 15, null);
        composer.endReplaceGroup();
        CursorData.SubDisplayText subDisplayTextCopy$default = CursorData.SubDisplayText.copy$default(subDisplayText, iconDisplayTextM11999copyiJQMabo$default, null, null, 6, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return subDisplayTextCopy$default;
    }
}
