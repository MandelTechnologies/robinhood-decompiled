package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import black_widow.contracts.mobile_app_chart.proto.p024v1.ChartSettingDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetChartSetting;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheet3;
import com.robinhood.android.chart.blackwidowadvancedchart.models.BottomSheet;
import com.robinhood.android.chart.blackwidowadvancedchart.models.NestedSettingsBottomSheet;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: SettingsBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u007f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"SettingsBottomSheet", "", "title", "", "settings", "Lkotlinx/collections/immutable/ImmutableList;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingDto;", "parentBottomSheet", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/BottomSheet;", "onDone", "Lkotlin/Function0;", "onSetChartSetting", "Lkotlin/Function1;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartSetting;", "onAutoSendToggled", "", "onShowNestedBottomSheet", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/NestedSettingsBottomSheet;", "instrumentOrderState", "Lcom/robinhood/shared/trading/orderstate/InstrumentOrderState;", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/chart/blackwidowadvancedchart/models/BottomSheet;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/robinhood/shared/trading/orderstate/InstrumentOrderState;Landroidx/compose/runtime/Composer;I)V", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.SettingsBottomSheetKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class SettingsBottomSheet {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SettingsBottomSheet$lambda$0(String str, ImmutableList immutableList, BottomSheet bottomSheet, Function0 function0, Function1 function1, Function1 function12, Function1 function13, InstrumentOrderState instrumentOrderState, int i, Composer composer, int i2) {
        SettingsBottomSheet(str, immutableList, bottomSheet, function0, function1, function12, function13, instrumentOrderState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SettingsBottomSheet(final String title, final ImmutableList<ChartSettingDto> settings, final BottomSheet parentBottomSheet, final Function0<Unit> onDone, final Function1<? super SetChartSetting, Unit> onSetChartSetting, final Function1<? super Boolean, Unit> onAutoSendToggled, final Function1<? super NestedSettingsBottomSheet, Unit> onShowNestedBottomSheet, final InstrumentOrderState instrumentOrderState, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(parentBottomSheet, "parentBottomSheet");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        Intrinsics.checkNotNullParameter(onSetChartSetting, "onSetChartSetting");
        Intrinsics.checkNotNullParameter(onAutoSendToggled, "onAutoSendToggled");
        Intrinsics.checkNotNullParameter(onShowNestedBottomSheet, "onShowNestedBottomSheet");
        Composer composerStartRestartGroup = composer.startRestartGroup(550783789);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(settings) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(parentBottomSheet) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDone) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSetChartSetting) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onAutoSendToggled) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onShowNestedBottomSheet) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(instrumentOrderState) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(550783789, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.SettingsBottomSheet (SettingsBottomSheet.kt:26)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1010897154, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.SettingsBottomSheetKt.SettingsBottomSheet.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1010897154, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.SettingsBottomSheet.<anonymous> (SettingsBottomSheet.kt:28)");
                    }
                    String str = title;
                    Function0<Unit> function0 = onDone;
                    final ImmutableList<ChartSettingDto> immutableList = settings;
                    final BottomSheet bottomSheet = parentBottomSheet;
                    final InstrumentOrderState instrumentOrderState2 = instrumentOrderState;
                    final Function1<NestedSettingsBottomSheet, Unit> function1 = onShowNestedBottomSheet;
                    final Function1<SetChartSetting, Unit> function12 = onSetChartSetting;
                    final Function1<Boolean, Unit> function13 = onAutoSendToggled;
                    SelectionBottomSheet3.SelectionBottomSheetLayout(true, str, function0, ComposableLambda3.rememberComposableLambda(2100527264, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.SettingsBottomSheetKt.SettingsBottomSheet.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2100527264, i4, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.SettingsBottomSheet.<anonymous>.<anonymous> (SettingsBottomSheet.kt:33)");
                            }
                            ImmutableList<ChartSettingDto> immutableList2 = immutableList;
                            BottomSheet bottomSheet2 = bottomSheet;
                            InstrumentOrderState instrumentOrderState3 = instrumentOrderState2;
                            Function1<NestedSettingsBottomSheet, Unit> function14 = function1;
                            Function1<SetChartSetting, Unit> function15 = function12;
                            Function1<Boolean, Unit> function16 = function13;
                            for (ChartSettingDto chartSettingDto : immutableList2) {
                                composer3.startReplaceGroup(-27925966);
                                if ((chartSettingDto.getValue() instanceof ChartSettingDto.ValueDto.MultiSelectGroup) || (chartSettingDto.getValue() instanceof ChartSettingDto.ValueDto.RadioGroup)) {
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer3, 0);
                                }
                                composer3.endReplaceGroup();
                                DisplayChartSetting.DisplayChartSetting(chartSettingDto, bottomSheet2, instrumentOrderState3, function14, function15, function16, composer3, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), null, null, composer2, 3078, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.SettingsBottomSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsBottomSheet.SettingsBottomSheet$lambda$0(title, settings, parentBottomSheet, onDone, onSetChartSetting, onAutoSendToggled, onShowNestedBottomSheet, instrumentOrderState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
