package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings;

import android.content.Context;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import black_widow.contracts.mobile_app_chart.proto.p024v1.ChartLayerDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.ChartSettingDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.ChartSettingLayerGroupValue;
import black_widow.contracts.mobile_app_chart.proto.p024v1.ChartSettingMultiSelectGroupValue;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetChartSetting;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.chart.blackwidowadvancedchart.models.BottomSheet;
import com.robinhood.android.chart.blackwidowadvancedchart.models.EquityTimeInForce;
import com.robinhood.android.chart.blackwidowadvancedchart.models.EquityTradingSession;
import com.robinhood.android.chart.blackwidowadvancedchart.models.NestedChartSettings;
import com.robinhood.android.chart.blackwidowadvancedchart.models.NestedSettingsBottomSheet;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.HapticEvents;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.Logging4;
import com.robinhood.android.chart.equityadvancedchart.MacEquityOrderState;
import com.robinhood.android.chart.equityadvancedchart.bottomsheets.EquityTradeSettings7;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.LegendAdvancedChartsContext;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: DisplayChartSetting.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001ac\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\rH\u0001¢\u0006\u0002\u0010\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"CHART_SETTINGS_BOTTOM_SHEET_TIME_IN_FORCE", "", "CHART_SETTINGS_BOTTOM_SHEET", "CHART_SETTINGS_BOTTOM_SHEET_NESTED_SECTION", "DisplayChartSetting", "", "chartSettings", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto;", "parentBottomSheet", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/BottomSheet;", "instrumentOrderState", "Lcom/robinhood/shared/trading/orderstate/InstrumentOrderState;", "onShowNestedBottomSheet", "Lkotlin/Function1;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/NestedSettingsBottomSheet;", "onSetChartSetting", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartSetting;", "onAutoSendToggled", "", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto;Lcom/robinhood/android/chart/blackwidowadvancedchart/models/BottomSheet;Lcom/robinhood/shared/trading/orderstate/InstrumentOrderState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.DisplayChartSettingKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class DisplayChartSetting {
    private static final String CHART_SETTINGS_BOTTOM_SHEET = "ChartSettingsBottomSheet";
    private static final String CHART_SETTINGS_BOTTOM_SHEET_NESTED_SECTION = "ChartSettingsBottomSheetNestedSection";
    private static final String CHART_SETTINGS_BOTTOM_SHEET_TIME_IN_FORCE = "ChartSettingsBottomSheetTimeInForce";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplayChartSetting$lambda$19(ChartSettingDto chartSettingDto, BottomSheet bottomSheet, InstrumentOrderState instrumentOrderState, Function1 function1, Function1 function12, Function1 function13, int i, Composer composer, int i2) {
        DisplayChartSetting(chartSettingDto, bottomSheet, instrumentOrderState, function1, function12, function13, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void DisplayChartSetting(final ChartSettingDto chartSettings, final BottomSheet parentBottomSheet, final InstrumentOrderState instrumentOrderState, final Function1<? super NestedSettingsBottomSheet, Unit> onShowNestedBottomSheet, final Function1<? super SetChartSetting, Unit> onSetChartSetting, final Function1<? super Boolean, Unit> onAutoSendToggled, Composer composer, final int i) {
        int i2;
        final BottomSheet bottomSheet;
        Intrinsics.checkNotNullParameter(chartSettings, "chartSettings");
        Intrinsics.checkNotNullParameter(parentBottomSheet, "parentBottomSheet");
        Intrinsics.checkNotNullParameter(onShowNestedBottomSheet, "onShowNestedBottomSheet");
        Intrinsics.checkNotNullParameter(onSetChartSetting, "onSetChartSetting");
        Intrinsics.checkNotNullParameter(onAutoSendToggled, "onAutoSendToggled");
        Composer composerStartRestartGroup = composer.startRestartGroup(-966798639);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(chartSettings) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(parentBottomSheet) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(instrumentOrderState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onShowNestedBottomSheet) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSetChartSetting) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onAutoSendToggled) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-966798639, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.DisplayChartSetting (DisplayChartSetting.kt:42)");
            }
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            HapticFeedback hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final ChartSettingDto.ValueDto value = chartSettings.getValue();
            if (value instanceof ChartSettingDto.ValueDto.LayerGroup) {
                composerStartRestartGroup.startReplaceGroup(153105508);
                ChartSettingDto.ValueDto.LayerGroup layerGroup = (ChartSettingDto.ValueDto.LayerGroup) value;
                List<ChartLayerDto> layers = layerGroup.getValue().getLayers();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChanged = composerStartRestartGroup.changed(layers);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = extensions2.toImmutableList(layerGroup.getValue().getLayers());
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ImmutableList immutableList = (ImmutableList) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(chartSettings) | composerStartRestartGroup.changedInstance(context) | ((i2 & 57344) == 16384);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Function2 function2 = new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.DisplayChartSettingKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return DisplayChartSetting.DisplayChartSetting$lambda$2$lambda$1(current, userInteractionEventDescriptor, chartSettings, context, onSetChartSetting, (String) obj, ((Boolean) obj2).booleanValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function2);
                    objRememberedValue2 = function2;
                }
                composerStartRestartGroup.endReplaceGroup();
                LayerGroupRow5.LayerGroupRow(immutableList, (Function2) objRememberedValue2, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
            } else {
                int i3 = i2;
                if (value instanceof ChartSettingDto.ValueDto.BooleanValue) {
                    composerStartRestartGroup.startReplaceGroup(154526672);
                    String label = chartSettings.getLabel();
                    boolean value2 = ((ChartSettingDto.ValueDto.BooleanValue) value).getValue();
                    boolean zIs_enabled = chartSettings.is_enabled();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(chartSettings) | composerStartRestartGroup.changedInstance(context) | ((i3 & 57344) == 16384);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        Function1 function1 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.DisplayChartSettingKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return DisplayChartSetting.DisplayChartSetting$lambda$4$lambda$3(current, userInteractionEventDescriptor, chartSettings, context, onSetChartSetting, ((Boolean) obj).booleanValue());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function1);
                        objRememberedValue3 = function1;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ChartToggleSettingRow.ChartToggleSettingRow(label, value2, (Function1) objRememberedValue3, zIs_enabled, null, composerStartRestartGroup, 0, 16);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                    Unit unit2 = Unit.INSTANCE;
                } else {
                    final Context context2 = context;
                    if (value instanceof ChartSettingDto.ValueDto.ChartType) {
                        composerStartRestartGroup.startReplaceGroup(155625963);
                        ChartSettingDto.ValueDto.ChartType chartType = (ChartSettingDto.ValueDto.ChartType) value;
                        String selected_type_value = chartType.getValue().getSelected_type_value();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = extensions2.toImmutableList(chartType.getValue().getTypes());
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        ImmutableList immutableList2 = (ImmutableList) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(chartSettings) | composerStartRestartGroup.changedInstance(context2) | ((i3 & 57344) == 16384);
                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue5 == companion.getEmpty()) {
                            Function1 function12 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.DisplayChartSettingKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return DisplayChartSetting.DisplayChartSetting$lambda$7$lambda$6(current, userInteractionEventDescriptor, chartSettings, context2, onSetChartSetting, (String) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function12);
                            objRememberedValue5 = function12;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ChartTypeRow.ChartTypeRow(selected_type_value, immutableList2, (Function1) objRememberedValue5, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        Unit unit3 = Unit.INSTANCE;
                    } else if (value instanceof ChartSettingDto.ValueDto.NestedSection) {
                        composerStartRestartGroup.startReplaceGroup(156736724);
                        String label2 = chartSettings.getLabel();
                        boolean zIs_enabled2 = chartSettings.is_enabled();
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(chartSettings) | composerStartRestartGroup.changedInstance(context2) | ((i3 & 7168) == 2048) | composerStartRestartGroup.changedInstance(value) | composerStartRestartGroup.changedInstance(parentBottomSheet);
                        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            Function0 function0 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.DisplayChartSettingKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return DisplayChartSetting.DisplayChartSetting$lambda$9$lambda$8(current, userInteractionEventDescriptor, chartSettings, context2, onShowNestedBottomSheet, value, parentBottomSheet);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function0);
                            objRememberedValue6 = function0;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        NestedSection4.NestedSection(label2, (Function0) objRememberedValue6, zIs_enabled2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        Unit unit4 = Unit.INSTANCE;
                    } else if (value instanceof ChartSettingDto.ValueDto.RadioGroup) {
                        composerStartRestartGroup.startReplaceGroup(157928581);
                        ChartSettingDto.ValueDto.RadioGroup radioGroup = (ChartSettingDto.ValueDto.RadioGroup) value;
                        String title = radioGroup.getValue().getTitle();
                        String selected_value = radioGroup.getValue().getSelected_value();
                        ImmutableList immutableList3 = extensions2.toImmutableList(radioGroup.getValue().getOptions());
                        boolean zIs_enabled3 = chartSettings.is_enabled();
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(chartSettings) | composerStartRestartGroup.changedInstance(context2) | ((i3 & 57344) == 16384);
                        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance5 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            Function1 function13 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.DisplayChartSettingKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return DisplayChartSetting.DisplayChartSetting$lambda$11$lambda$10(current, userInteractionEventDescriptor, chartSettings, context2, onSetChartSetting, (String) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function13);
                            objRememberedValue7 = function13;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        RadioSelectionGroup3.RadioSelectionGroup(title, selected_value, immutableList3, zIs_enabled3, (Function1) objRememberedValue7, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        Unit unit5 = Unit.INSTANCE;
                    } else if (value instanceof ChartSettingDto.ValueDto.MultiSelectGroup) {
                        composerStartRestartGroup.startReplaceGroup(159152740);
                        ChartSettingDto.ValueDto.MultiSelectGroup multiSelectGroup = (ChartSettingDto.ValueDto.MultiSelectGroup) value;
                        String title2 = multiSelectGroup.getValue().getTitle();
                        ImmutableList immutableList4 = extensions2.toImmutableList(multiSelectGroup.getValue().getSelected_values());
                        ImmutableList immutableList5 = extensions2.toImmutableList(multiSelectGroup.getValue().getOptions());
                        boolean zIs_enabled4 = chartSettings.is_enabled();
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        boolean zChangedInstance6 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(chartSettings) | composerStartRestartGroup.changedInstance(context2) | ((i3 & 57344) == 16384);
                        Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance6 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            Function2 function22 = new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.DisplayChartSettingKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return DisplayChartSetting.DisplayChartSetting$lambda$13$lambda$12(current, userInteractionEventDescriptor, chartSettings, context2, onSetChartSetting, (String) obj, ((Boolean) obj2).booleanValue());
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function22);
                            objRememberedValue8 = function22;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        MultiSelectGroup4.MultiSelectGroup(title2, immutableList4, immutableList5, zIs_enabled4, (Function2) objRememberedValue8, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        Unit unit6 = Unit.INSTANCE;
                    } else if (Intrinsics.areEqual(value, ChartSettingDto.ValueDto.TradingSection.INSTANCE)) {
                        composerStartRestartGroup.startReplaceGroup(160765112);
                        if (instrumentOrderState != null) {
                            composerStartRestartGroup.startReplaceGroup(-1380285142);
                            if (instrumentOrderState instanceof MacEquityOrderState) {
                                MacEquityOrderState macEquityOrderState = (MacEquityOrderState) instrumentOrderState;
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(394064794, true, new DisplayChartSetting2(instrumentOrderState, hapticFeedback, onAutoSendToggled), composerStartRestartGroup, 54);
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                int i4 = i3 & 7168;
                                boolean zChangedInstance7 = (i4 == 2048) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(context2) | composerStartRestartGroup.changedInstance(parentBottomSheet);
                                Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance7 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                    bottomSheet = parentBottomSheet;
                                    Function0 function02 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.DisplayChartSettingKt$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return DisplayChartSetting.DisplayChartSetting$lambda$18$lambda$15$lambda$14(current, userInteractionEventDescriptor, context2, onShowNestedBottomSheet, bottomSheet);
                                        }
                                    };
                                    context2 = context2;
                                    composerStartRestartGroup.updateRememberedValue(function02);
                                    objRememberedValue9 = function02;
                                } else {
                                    bottomSheet = parentBottomSheet;
                                }
                                Function0 function03 = (Function0) objRememberedValue9;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                boolean zChangedInstance8 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(context2) | (i4 == 2048) | composerStartRestartGroup.changedInstance(bottomSheet);
                                Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance8 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                    final Context context3 = context2;
                                    Function0 function04 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.DisplayChartSettingKt$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return DisplayChartSetting.DisplayChartSetting$lambda$18$lambda$17$lambda$16(current, userInteractionEventDescriptor, context3, onShowNestedBottomSheet, bottomSheet);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(function04);
                                    objRememberedValue10 = function04;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                EquityTradeSettings7.EquityTradeSettings(macEquityOrderState, composableLambdaRememberComposableLambda, function03, (Function0) objRememberedValue10, null, composerStartRestartGroup, MacEquityOrderState.$stable | 48, 16);
                                composerStartRestartGroup = composerStartRestartGroup;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Unit unit7 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(162991346);
                        composerStartRestartGroup.endReplaceGroup();
                        Unit unit8 = Unit.INSTANCE;
                    }
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.DisplayChartSettingKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DisplayChartSetting.DisplayChartSetting$lambda$19(chartSettings, parentBottomSheet, instrumentOrderState, onShowNestedBottomSheet, onSetChartSetting, onAutoSendToggled, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplayChartSetting$lambda$2$lambda$1(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, ChartSettingDto chartSettingDto, Context context, Function1 function1, String value, boolean z) {
        Intrinsics.checkNotNullParameter(value, "value");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.PILL, CHART_SETTINGS_BOTTOM_SHEET, null, 4, null), null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor, null, null, null, null, null, null, 0.0d, false, null, null, null, new LegendAdvancedChartsContext.ChartSettings(chartSettingDto.getKey(), value, z, null, 8, null), 0.0d, null, null, 30719, null).getContext(), false, 41, null);
        HapticEvents.mediumHapticEvent(context);
        function1.invoke(new SetChartSetting(chartSettingDto.getKey(), null, null, null, null, new ChartSettingLayerGroupValue(value, z, null, 4, null), null, 94, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplayChartSetting$lambda$4$lambda$3(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, ChartSettingDto chartSettingDto, Context context, Function1 function1, boolean z) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.TOGGLE, CHART_SETTINGS_BOTTOM_SHEET, null, 4, null), null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor, null, null, null, null, null, null, 0.0d, false, null, null, null, new LegendAdvancedChartsContext.ChartSettings(chartSettingDto.getKey(), null, z, null, 10, null), 0.0d, null, null, 30719, null).getContext(), false, 41, null);
        HapticEvents.mediumHapticEvent(context);
        function1.invoke(new SetChartSetting(chartSettingDto.getKey(), Boolean.valueOf(z), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplayChartSetting$lambda$7$lambda$6(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, ChartSettingDto chartSettingDto, Context context, Function1 function1, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.BUTTON, CHART_SETTINGS_BOTTOM_SHEET, null, 4, null), null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor, null, null, null, null, null, null, 0.0d, false, null, null, null, new LegendAdvancedChartsContext.ChartSettings(chartSettingDto.getKey(), it, false, null, 12, null), 0.0d, null, null, 30719, null).getContext(), false, 41, null);
        HapticEvents.mediumHapticEvent(context);
        function1.invoke(new SetChartSetting(chartSettingDto.getKey(), null, it, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplayChartSetting$lambda$9$lambda$8(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, ChartSettingDto chartSettingDto, Context context, Function1 function1, ChartSettingDto.ValueDto valueDto, BottomSheet bottomSheet) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.ROW, CHART_SETTINGS_BOTTOM_SHEET_NESTED_SECTION, null, 4, null), null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor, null, null, null, null, null, null, 0.0d, false, null, null, null, new LegendAdvancedChartsContext.ChartSettings(chartSettingDto.getLabel(), null, false, null, 14, null), 0.0d, null, null, 30719, null).getContext(), false, 41, null);
        HapticEvents.mediumHapticEvent(context);
        function1.invoke(new NestedChartSettings(((ChartSettingDto.ValueDto.NestedSection) valueDto).getValue(), false, bottomSheet, 2, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplayChartSetting$lambda$11$lambda$10(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, ChartSettingDto chartSettingDto, Context context, Function1 function1, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.RADIO_BUTTON, CHART_SETTINGS_BOTTOM_SHEET, null, 4, null), null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor, null, null, null, null, null, null, 0.0d, false, null, null, null, new LegendAdvancedChartsContext.ChartSettings(chartSettingDto.getKey(), it, false, null, 12, null), 0.0d, null, null, 30719, null).getContext(), false, 41, null);
        HapticEvents.mediumHapticEvent(context);
        function1.invoke(new SetChartSetting(chartSettingDto.getKey(), null, null, it, null, null, null, 118, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplayChartSetting$lambda$13$lambda$12(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, ChartSettingDto chartSettingDto, Context context, Function1 function1, String option, boolean z) {
        Intrinsics.checkNotNullParameter(option, "option");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.MENU_ITEM, CHART_SETTINGS_BOTTOM_SHEET, null, 4, null), null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor, null, null, null, null, null, null, 0.0d, false, null, null, null, new LegendAdvancedChartsContext.ChartSettings(chartSettingDto.getKey(), option, z, null, 8, null), 0.0d, null, null, 30719, null).getContext(), false, 41, null);
        HapticEvents.mediumHapticEvent(context);
        function1.invoke(new SetChartSetting(chartSettingDto.getKey(), null, null, null, new ChartSettingMultiSelectGroupValue(option, z, null, 4, null), null, null, 110, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplayChartSetting$lambda$18$lambda$15$lambda$14(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Context context, Function1 function1, BottomSheet bottomSheet) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.ROW, "ChartSettingsBottomSheetTradingSession", null, 4, null), null, userInteractionEventDescriptor.getContext(), false, 41, null);
        HapticEvents.mediumHapticEvent(context);
        function1.invoke(new EquityTradingSession(false, bottomSheet, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplayChartSetting$lambda$18$lambda$17$lambda$16(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Context context, Function1 function1, BottomSheet bottomSheet) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.ROW, CHART_SETTINGS_BOTTOM_SHEET_TIME_IN_FORCE, null, 4, null), null, userInteractionEventDescriptor.getContext(), false, 41, null);
        HapticEvents.mediumHapticEvent(context);
        function1.invoke(new EquityTimeInForce(false, bottomSheet, 1, null));
        return Unit.INSTANCE;
    }
}
