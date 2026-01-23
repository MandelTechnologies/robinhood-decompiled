package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets;

import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import black_widow.contracts.mobile_app_chart.proto.p024v1.ChartSettingDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.ChartSettingSectionDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TemplateDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks;
import com.robinhood.android.chart.blackwidowadvancedchart.SettingsBottomSheetState;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheetKt;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ChartSettingsBottomSheetKt;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.SettingsBottomSheet;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.tradeamount.TradeAmountBottomSheet6;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.CreateTemplateBottomSheet3;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.SelectTemplateBottomSheetKt;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderViewState;
import com.robinhood.android.chart.blackwidowadvancedchart.models.AddIndicator;
import com.robinhood.android.chart.blackwidowadvancedchart.models.AutoSendRenew;
import com.robinhood.android.chart.blackwidowadvancedchart.models.BottomSheet;
import com.robinhood.android.chart.blackwidowadvancedchart.models.ChartSettings;
import com.robinhood.android.chart.blackwidowadvancedchart.models.CreateTemplate;
import com.robinhood.android.chart.blackwidowadvancedchart.models.EditNumberOfShares;
import com.robinhood.android.chart.blackwidowadvancedchart.models.EditTemplate;
import com.robinhood.android.chart.blackwidowadvancedchart.models.EquityTimeInForce;
import com.robinhood.android.chart.blackwidowadvancedchart.models.EquityTradingSession;
import com.robinhood.android.chart.blackwidowadvancedchart.models.IdentiAgreement;
import com.robinhood.android.chart.blackwidowadvancedchart.models.NestedChartSettings;
import com.robinhood.android.chart.blackwidowadvancedchart.models.NestedSettingsBottomSheet;
import com.robinhood.android.chart.blackwidowadvancedchart.models.SelectTemplate;
import com.robinhood.android.chart.blackwidowadvancedchart.models.YAxisSettings;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.Logging4;
import com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderViewState;
import com.robinhood.android.chart.equityadvancedchart.MacEquityOrderState;
import com.robinhood.android.chart.equityadvancedchart.bottomsheets.EquityTimeInForceBottomSheet;
import com.robinhood.android.chart.equityadvancedchart.bottomsheets.EquityTradingHoursBottomSheet;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.equities.equitytrade.EquityInstrumentBuyingPower;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState4;
import com.robinhood.shared.trading.tradecomponentscompose.bottomsheets.AutoSendRenewBottomSheet;
import com.robinhood.shared.trading.tradecomponentscompose.input.AccountBuyingPowerDisplay2;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ChartBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ay\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0001¢\u0006\u0002\u0010\u0019\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u000bX\u008a\u0084\u0002"}, m3636d2 = {"AUTO_SEND_RENEW_BOTTOM_SHEET", "", "ChartBottomSheet", "", "screenState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/BottomSheet;", "orderViewState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartOrderViewState;", "settingsBottomSheetState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/SettingsBottomSheetState;", "yAxisSection", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSectionDto;", "chartUrl", "selectedTemplate", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TemplateDto;", "availableTemplates", "Lkotlinx/collections/immutable/ImmutableList;", "chartCallbacks", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvanceChartCallbacks;", "orderCallbacks", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/IAdvanceChartOrderDuxo;", "showQuantityLabel", "", "sheetState", "Landroidx/compose/material3/SheetState;", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/models/BottomSheet;Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartOrderViewState;Lcom/robinhood/android/chart/blackwidowadvancedchart/SettingsBottomSheetState;Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSectionDto;Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/TemplateDto;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvanceChartCallbacks;Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/IAdvanceChartOrderDuxo;ZLandroidx/compose/material3/SheetState;Landroidx/compose/runtime/Composer;III)V", "feature-black-widow-advanced-chart_externalDebug", "nestedSectionState"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ChartBottomSheetKt {
    public static final String AUTO_SEND_RENEW_BOTTOM_SHEET = "AutoSendRenewBottomSheet";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartBottomSheet$lambda$2(BottomSheet bottomSheet, AdvanceChartOrderViewState advanceChartOrderViewState, SettingsBottomSheetState settingsBottomSheetState, ChartSettingSectionDto chartSettingSectionDto, String str, TemplateDto templateDto, ImmutableList immutableList, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, AdvanceChartOrderDuxo4 advanceChartOrderDuxo4, boolean z, SheetState sheetState, int i, int i2, int i3, Composer composer, int i4) {
        ChartBottomSheet(bottomSheet, advanceChartOrderViewState, settingsBottomSheetState, chartSettingSectionDto, str, templateDto, immutableList, blackWidowAdvanceChartCallbacks, advanceChartOrderDuxo4, z, sheetState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChartBottomSheet(final BottomSheet screenState, final AdvanceChartOrderViewState advanceChartOrderViewState, final SettingsBottomSheetState settingsBottomSheetState, final ChartSettingSectionDto chartSettingSectionDto, final String str, final TemplateDto templateDto, final ImmutableList<TemplateDto> immutableList, final BlackWidowAdvanceChartCallbacks chartCallbacks, final AdvanceChartOrderDuxo4 orderCallbacks, final boolean z, SheetState sheetState, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        AdvanceChartOrderViewState advanceChartOrderViewState2;
        SettingsBottomSheetState settingsBottomSheetState2;
        ChartSettingSectionDto chartSettingSectionDto2;
        String str2;
        TemplateDto templateDto2;
        ImmutableList<TemplateDto> immutableList2;
        int i5;
        SheetState sheetStateRememberModalBottomSheetState;
        int i6;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer2;
        final SheetState sheetState2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(screenState, "screenState");
        Intrinsics.checkNotNullParameter(chartCallbacks, "chartCallbacks");
        Intrinsics.checkNotNullParameter(orderCallbacks, "orderCallbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1935366932);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(screenState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                advanceChartOrderViewState2 = advanceChartOrderViewState;
                i4 |= composerStartRestartGroup.changedInstance(advanceChartOrderViewState2) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    settingsBottomSheetState2 = settingsBottomSheetState;
                    i4 |= composerStartRestartGroup.changedInstance(settingsBottomSheetState2) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        chartSettingSectionDto2 = chartSettingSectionDto;
                        i4 |= composerStartRestartGroup.changedInstance(chartSettingSectionDto2) ? 2048 : 1024;
                    }
                    if ((i3 & 16) == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            str2 = str;
                            i4 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
                        }
                        if ((i3 & 32) != 0) {
                            i4 |= 196608;
                        } else {
                            if ((i & 196608) == 0) {
                                templateDto2 = templateDto;
                                i4 |= composerStartRestartGroup.changedInstance(templateDto2) ? 131072 : 65536;
                            }
                            if ((i3 & 64) == 0) {
                                i4 |= 1572864;
                            } else {
                                if ((i & 1572864) == 0) {
                                    immutableList2 = immutableList;
                                    i4 |= composerStartRestartGroup.changedInstance(immutableList2) ? 1048576 : 524288;
                                }
                                if ((i3 & 128) != 0) {
                                    i4 |= 12582912;
                                } else if ((i & 12582912) == 0) {
                                    i4 |= (i & 16777216) == 0 ? composerStartRestartGroup.changed(chartCallbacks) : composerStartRestartGroup.changedInstance(chartCallbacks) ? 8388608 : 4194304;
                                }
                                if ((i3 & 256) != 0) {
                                    i4 |= 100663296;
                                } else if ((i & 100663296) == 0) {
                                    i4 |= composerStartRestartGroup.changedInstance(orderCallbacks) ? 67108864 : 33554432;
                                }
                                if ((i3 & 512) == 0) {
                                    if ((i & 805306368) == 0) {
                                        i4 |= composerStartRestartGroup.changed(z) ? 536870912 : 268435456;
                                    }
                                    if ((i2 & 6) != 0) {
                                        i5 = i2 | (((i3 & 1024) == 0 && composerStartRestartGroup.changed(sheetState)) ? 4 : 2);
                                    } else {
                                        i5 = i2;
                                    }
                                    if ((i4 & 306783379) == 306783378 || (i5 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                                        composerStartRestartGroup.startDefaults();
                                        if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            if ((i3 & 1024) != 0) {
                                                i5 &= -15;
                                            }
                                        } else {
                                            if ((i3 & 1024) == 0) {
                                                int i7 = i5 & (-15);
                                                sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(screenState.getSkipPartialState(), null, composerStartRestartGroup, 0, 2);
                                                i6 = i7;
                                            }
                                            composerStartRestartGroup.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1935366932, i4, i6, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheet (ChartBottomSheet.kt:72)");
                                            }
                                            EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                                            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                                            Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE);
                                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                                            int i8 = i6;
                                            zChangedInstance = ((i4 & 29360128) == 8388608 || ((i4 & 16777216) != 0 && composerStartRestartGroup.changedInstance(chartCallbacks))) | composerStartRestartGroup.changedInstance(screenState);
                                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                                            if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheetKt$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return ChartBottomSheetKt.ChartBottomSheet$lambda$1$lambda$0(screenState, chartCallbacks);
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            composer2 = composerStartRestartGroup;
                                            SheetState sheetState3 = sheetStateRememberModalBottomSheetState;
                                            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue, modifierStatusBarsPadding, false, sheetState3, null, 0L, ComposableLambda3.rememberComposableLambda(1469094661, true, new C106842(screenState, advanceChartOrderViewState2, chartCallbacks, orderCallbacks, settingsBottomSheetState2, str2, templateDto2, immutableList2, chartSettingSectionDto2, current, userInteractionEventDescriptor, z), composerStartRestartGroup, 54), composer2, ((i8 << 9) & 7168) | 1572864, 52);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            sheetState2 = sheetState3;
                                        }
                                        i6 = i5;
                                        sheetStateRememberModalBottomSheetState = sheetState;
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                                        UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                                        Modifier modifierStatusBarsPadding2 = WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE);
                                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                                        int i82 = i6;
                                        if ((i4 & 29360128) == 8388608) {
                                            zChangedInstance = ((i4 & 29360128) == 8388608 || ((i4 & 16777216) != 0 && composerStartRestartGroup.changedInstance(chartCallbacks))) | composerStartRestartGroup.changedInstance(screenState);
                                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                                            if (!zChangedInstance) {
                                                objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheetKt$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return ChartBottomSheetKt.ChartBottomSheet$lambda$1$lambda$0(screenState, chartCallbacks);
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                                composerStartRestartGroup.endReplaceGroup();
                                                composer2 = composerStartRestartGroup;
                                                SheetState sheetState32 = sheetStateRememberModalBottomSheetState;
                                                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue, modifierStatusBarsPadding2, false, sheetState32, null, 0L, ComposableLambda3.rememberComposableLambda(1469094661, true, new C106842(screenState, advanceChartOrderViewState2, chartCallbacks, orderCallbacks, settingsBottomSheetState2, str2, templateDto2, immutableList2, chartSettingSectionDto2, current2, userInteractionEventDescriptor2, z), composerStartRestartGroup, 54), composer2, ((i82 << 9) & 7168) | 1572864, 52);
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                sheetState2 = sheetState32;
                                            }
                                        }
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        sheetState2 = sheetState;
                                        composer2 = composerStartRestartGroup;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheetKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return ChartBottomSheetKt.ChartBottomSheet$lambda$2(screenState, advanceChartOrderViewState, settingsBottomSheetState, chartSettingSectionDto, str, templateDto, immutableList, chartCallbacks, orderCallbacks, z, sheetState2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i4 |= 805306368;
                                if ((i2 & 6) != 0) {
                                }
                                if ((i4 & 306783379) == 306783378) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) == 0) {
                                        if ((i3 & 1024) == 0) {
                                            i6 = i5;
                                            sheetStateRememberModalBottomSheetState = sheetState;
                                        }
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        EventLogger current22 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                                        UserInteractionEventDescriptor userInteractionEventDescriptor22 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                                        Modifier modifierStatusBarsPadding22 = WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE);
                                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                                        int i822 = i6;
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            immutableList2 = immutableList;
                            if ((i3 & 128) != 0) {
                            }
                            if ((i3 & 256) != 0) {
                            }
                            if ((i3 & 512) == 0) {
                            }
                            if ((i2 & 6) != 0) {
                            }
                            if ((i4 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        templateDto2 = templateDto;
                        if ((i3 & 64) == 0) {
                        }
                        immutableList2 = immutableList;
                        if ((i3 & 128) != 0) {
                        }
                        if ((i3 & 256) != 0) {
                        }
                        if ((i3 & 512) == 0) {
                        }
                        if ((i2 & 6) != 0) {
                        }
                        if ((i4 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    str2 = str;
                    if ((i3 & 32) != 0) {
                    }
                    templateDto2 = templateDto;
                    if ((i3 & 64) == 0) {
                    }
                    immutableList2 = immutableList;
                    if ((i3 & 128) != 0) {
                    }
                    if ((i3 & 256) != 0) {
                    }
                    if ((i3 & 512) == 0) {
                    }
                    if ((i2 & 6) != 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                chartSettingSectionDto2 = chartSettingSectionDto;
                if ((i3 & 16) == 0) {
                }
                str2 = str;
                if ((i3 & 32) != 0) {
                }
                templateDto2 = templateDto;
                if ((i3 & 64) == 0) {
                }
                immutableList2 = immutableList;
                if ((i3 & 128) != 0) {
                }
                if ((i3 & 256) != 0) {
                }
                if ((i3 & 512) == 0) {
                }
                if ((i2 & 6) != 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            settingsBottomSheetState2 = settingsBottomSheetState;
            if ((i3 & 8) != 0) {
            }
            chartSettingSectionDto2 = chartSettingSectionDto;
            if ((i3 & 16) == 0) {
            }
            str2 = str;
            if ((i3 & 32) != 0) {
            }
            templateDto2 = templateDto;
            if ((i3 & 64) == 0) {
            }
            immutableList2 = immutableList;
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) == 0) {
            }
            if ((i2 & 6) != 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        advanceChartOrderViewState2 = advanceChartOrderViewState;
        if ((i3 & 4) == 0) {
        }
        settingsBottomSheetState2 = settingsBottomSheetState;
        if ((i3 & 8) != 0) {
        }
        chartSettingSectionDto2 = chartSettingSectionDto;
        if ((i3 & 16) == 0) {
        }
        str2 = str;
        if ((i3 & 32) != 0) {
        }
        templateDto2 = templateDto;
        if ((i3 & 64) == 0) {
        }
        immutableList2 = immutableList;
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartBottomSheet$lambda$1$lambda$0(BottomSheet bottomSheet, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks) {
        BottomSheet parentBottomSheet = bottomSheet.getParentBottomSheet();
        if (parentBottomSheet != null) {
            blackWidowAdvanceChartCallbacks.setScreenState(parentBottomSheet, true);
        } else {
            BlackWidowAdvanceChartCallbacks.DefaultImpls.advanceScreenState$default(blackWidowAdvanceChartCallbacks, null, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: ChartBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheetKt$ChartBottomSheet$2 */
    static final class C106842 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ ImmutableList<TemplateDto> $availableTemplates;
        final /* synthetic */ BlackWidowAdvanceChartCallbacks $chartCallbacks;
        final /* synthetic */ String $chartUrl;
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ AdvanceChartOrderDuxo4 $orderCallbacks;
        final /* synthetic */ AdvanceChartOrderViewState $orderViewState;
        final /* synthetic */ BottomSheet $screenState;
        final /* synthetic */ TemplateDto $selectedTemplate;
        final /* synthetic */ SettingsBottomSheetState $settingsBottomSheetState;
        final /* synthetic */ boolean $showQuantityLabel;
        final /* synthetic */ ChartSettingSectionDto $yAxisSection;

        C106842(BottomSheet bottomSheet, AdvanceChartOrderViewState advanceChartOrderViewState, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, AdvanceChartOrderDuxo4 advanceChartOrderDuxo4, SettingsBottomSheetState settingsBottomSheetState, String str, TemplateDto templateDto, ImmutableList<TemplateDto> immutableList, ChartSettingSectionDto chartSettingSectionDto, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, boolean z) {
            this.$screenState = bottomSheet;
            this.$orderViewState = advanceChartOrderViewState;
            this.$chartCallbacks = blackWidowAdvanceChartCallbacks;
            this.$orderCallbacks = advanceChartOrderDuxo4;
            this.$settingsBottomSheetState = settingsBottomSheetState;
            this.$chartUrl = str;
            this.$selectedTemplate = templateDto;
            this.$availableTemplates = immutableList;
            this.$yAxisSection = chartSettingSectionDto;
            this.$eventLogger = eventLogger;
            this.$eventDescriptor = userInteractionEventDescriptor;
            this.$showQuantityLabel = z;
        }

        private static final ChartSettingSectionDto invoke$lambda$44(SnapshotState4<ChartSettingSectionDto> snapshotState4) {
            return snapshotState4.getValue();
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(final RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            int i2;
            int i3;
            InstrumentOrderState instrumentOrderState;
            Composer composer2 = composer;
            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
            if ((i & 6) == 0) {
                i2 = i | ((i & 8) == 0 ? composer2.changed(RhModalBottomSheet) : composer2.changedInstance(RhModalBottomSheet) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1469094661, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheet.<anonymous> (ChartBottomSheet.kt:87)");
            }
            BottomSheet bottomSheet = this.$screenState;
            if (bottomSheet instanceof ChartSettings) {
                composer2.startReplaceGroup(82377826);
                AdvanceChartOrderViewState advanceChartOrderViewState = this.$orderViewState;
                InstrumentOrderState instrumentOrderState2 = advanceChartOrderViewState != null ? advanceChartOrderViewState.getInstrumentOrderState() : null;
                Object obj = this.$chartCallbacks;
                composer2.startReplaceGroup(5004770);
                boolean zChangedInstance = composer2.changedInstance(obj);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new ChartBottomSheetKt$ChartBottomSheet$2$1$1(obj);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                KFunction kFunction = (KFunction) objRememberedValue;
                composer2.endReplaceGroup();
                Object obj2 = this.$orderCallbacks;
                composer2.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer2.changedInstance(obj2);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new ChartBottomSheetKt$ChartBottomSheet$2$2$1(obj2);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                KFunction kFunction2 = (KFunction) objRememberedValue2;
                composer2.endReplaceGroup();
                SettingsBottomSheetState settingsBottomSheetState = this.$settingsBottomSheetState;
                String str = this.$chartUrl;
                composer2.startReplaceGroup(-1633490746);
                boolean zChangedInstance3 = composer2.changedInstance(this.$chartCallbacks) | ((i2 & 14) == 4 || ((i2 & 8) != 0 && composer2.changedInstance(RhModalBottomSheet)));
                final BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks = this.$chartCallbacks;
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheetKt$ChartBottomSheet$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return ChartBottomSheetKt.C106842.invoke$lambda$3$lambda$2(blackWidowAdvanceChartCallbacks, RhModalBottomSheet, (BottomSheet) obj3);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceGroup();
                ChartSettingsBottomSheetKt.ChartSettingsBottomSheet(settingsBottomSheetState, instrumentOrderState2, str, (Function1) objRememberedValue3, (Function1) kFunction, (Function1) kFunction2, composer2, 0);
                composer2.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
            } else if (bottomSheet instanceof CreateTemplate) {
                composer2.startReplaceGroup(82915614);
                boolean firstTemplate = ((CreateTemplate) this.$screenState).getFirstTemplate();
                composer2.startReplaceGroup(-1746271574);
                int i4 = i2 & 14;
                boolean zChangedInstance4 = composer2.changedInstance(this.$chartCallbacks) | composer2.changedInstance(this.$screenState) | (i4 == 4 || ((i2 & 8) != 0 && composer2.changedInstance(RhModalBottomSheet)));
                final BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks2 = this.$chartCallbacks;
                final BottomSheet bottomSheet2 = this.$screenState;
                Object objRememberedValue4 = composer2.rememberedValue();
                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheetKt$ChartBottomSheet$2$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return ChartBottomSheetKt.C106842.invoke$lambda$5$lambda$4(blackWidowAdvanceChartCallbacks2, bottomSheet2, RhModalBottomSheet, (String) obj3);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                Function1 function1 = (Function1) objRememberedValue4;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(5004770);
                boolean z = i4 == 4 || ((i2 & 8) != 0 && composer2.changedInstance(RhModalBottomSheet));
                Object objRememberedValue5 = composer2.rememberedValue();
                if (z || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheetKt$ChartBottomSheet$2$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChartBottomSheetKt.C106842.invoke$lambda$7$lambda$6(RhModalBottomSheet);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue5);
                }
                composer2.endReplaceGroup();
                CreateTemplateBottomSheet3.CreateTemplateBottomSheet(null, firstTemplate, function1, (Function0) objRememberedValue5, null, composer2, 6, 16);
                composer2.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
            } else if (bottomSheet instanceof EditTemplate) {
                composer2.startReplaceGroup(83451201);
                TemplateDto templateDto = ((EditTemplate) this.$screenState).getTemplateDto();
                composer2.startReplaceGroup(-1746271574);
                int i5 = i2 & 14;
                boolean zChangedInstance5 = composer2.changedInstance(this.$chartCallbacks) | composer2.changedInstance(this.$screenState) | (i5 == 4 || ((i2 & 8) != 0 && composer2.changedInstance(RhModalBottomSheet)));
                final BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks3 = this.$chartCallbacks;
                final BottomSheet bottomSheet3 = this.$screenState;
                Object objRememberedValue6 = composer2.rememberedValue();
                if (zChangedInstance5 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheetKt$ChartBottomSheet$2$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return ChartBottomSheetKt.C106842.invoke$lambda$9$lambda$8(blackWidowAdvanceChartCallbacks3, bottomSheet3, RhModalBottomSheet, (String) obj3);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue6);
                }
                Function1 function12 = (Function1) objRememberedValue6;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(5004770);
                boolean z2 = i5 == 4 || ((i2 & 8) != 0 && composer2.changedInstance(RhModalBottomSheet));
                Object objRememberedValue7 = composer2.rememberedValue();
                if (z2 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheetKt$ChartBottomSheet$2$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChartBottomSheetKt.C106842.invoke$lambda$11$lambda$10(RhModalBottomSheet);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                composer2.endReplaceGroup();
                CreateTemplateBottomSheet3.CreateTemplateBottomSheet(templateDto, false, function12, (Function0) objRememberedValue7, null, composer2, 48, 16);
                composer2.endReplaceGroup();
                Unit unit3 = Unit.INSTANCE;
            } else if (bottomSheet instanceof SelectTemplate) {
                composer2.startReplaceGroup(83885821);
                Object obj3 = this.$chartCallbacks;
                composer2.startReplaceGroup(5004770);
                boolean zChangedInstance6 = composer2.changedInstance(obj3);
                Object objRememberedValue8 = composer2.rememberedValue();
                if (zChangedInstance6 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue8 = new ChartBottomSheetKt$ChartBottomSheet$2$8$1(obj3);
                    composer2.updateRememberedValue(objRememberedValue8);
                }
                KFunction kFunction3 = (KFunction) objRememberedValue8;
                composer2.endReplaceGroup();
                Object obj4 = this.$chartCallbacks;
                composer2.startReplaceGroup(5004770);
                boolean zChangedInstance7 = composer2.changedInstance(obj4);
                Object objRememberedValue9 = composer2.rememberedValue();
                if (zChangedInstance7 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue9 = new ChartBottomSheetKt$ChartBottomSheet$2$9$1(obj4);
                    composer2.updateRememberedValue(objRememberedValue9);
                }
                KFunction kFunction4 = (KFunction) objRememberedValue9;
                composer2.endReplaceGroup();
                TemplateDto templateDto2 = this.$selectedTemplate;
                ImmutableList<TemplateDto> immutableList = this.$availableTemplates;
                Function1 function13 = (Function1) kFunction3;
                composer2.startReplaceGroup(5004770);
                boolean zChangedInstance8 = composer2.changedInstance(this.$chartCallbacks);
                final BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks4 = this.$chartCallbacks;
                Object objRememberedValue10 = composer2.rememberedValue();
                if (zChangedInstance8 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue10 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheetKt$ChartBottomSheet$2$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            return ChartBottomSheetKt.C106842.invoke$lambda$15$lambda$14(blackWidowAdvanceChartCallbacks4, (TemplateDto) obj5);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue10);
                }
                Function1 function14 = (Function1) objRememberedValue10;
                composer2.endReplaceGroup();
                Function1 function15 = (Function1) kFunction4;
                composer2.startReplaceGroup(5004770);
                boolean zChangedInstance9 = composer2.changedInstance(this.$chartCallbacks);
                final BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks5 = this.$chartCallbacks;
                Object objRememberedValue11 = composer2.rememberedValue();
                if (zChangedInstance9 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue11 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheetKt$ChartBottomSheet$2$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChartBottomSheetKt.C106842.invoke$lambda$17$lambda$16(blackWidowAdvanceChartCallbacks5);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue11);
                }
                Function0 function0 = (Function0) objRememberedValue11;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(5004770);
                boolean z3 = (i2 & 14) == 4 || ((i2 & 8) != 0 && composer2.changedInstance(RhModalBottomSheet));
                Object objRememberedValue12 = composer2.rememberedValue();
                if (z3 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue12 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheetKt$ChartBottomSheet$2$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChartBottomSheetKt.C106842.invoke$lambda$19$lambda$18(RhModalBottomSheet);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue12);
                }
                composer2.endReplaceGroup();
                SelectTemplateBottomSheetKt.SelectTemplateBottomSheet(templateDto2, immutableList, function13, function14, function15, function0, (Function0) objRememberedValue12, null, composer2, 0, 128);
                composer2.endReplaceGroup();
                Unit unit4 = Unit.INSTANCE;
            } else if (bottomSheet instanceof EditNumberOfShares) {
                composer2.startReplaceGroup(85089520);
                AdvanceChartOrderViewState advanceChartOrderViewState2 = this.$orderViewState;
                final InstrumentOrderState instrumentOrderState3 = advanceChartOrderViewState2 != null ? advanceChartOrderViewState2.getInstrumentOrderState() : null;
                if (instrumentOrderState3 != null) {
                    AdvanceChartOrderViewState advanceChartOrderViewState3 = this.$orderViewState;
                    Object obj5 = this.$orderCallbacks;
                    boolean z4 = this.$showQuantityLabel;
                    InstrumentOrderState4 orderTradeAmount = instrumentOrderState3.getOrderTradeAmount();
                    boolean allowFractional = advanceChartOrderViewState3.getAllowFractional();
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance10 = composer2.changedInstance(obj5);
                    Object objRememberedValue13 = composer2.rememberedValue();
                    if (zChangedInstance10 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue13 = new ChartBottomSheetKt$ChartBottomSheet$2$13$1$1(obj5);
                        composer2.updateRememberedValue(objRememberedValue13);
                    }
                    KFunction kFunction5 = (KFunction) objRememberedValue13;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(5004770);
                    boolean z5 = (i2 & 14) == 4 || ((i2 & 8) != 0 && composer2.changedInstance(RhModalBottomSheet));
                    Object objRememberedValue14 = composer2.rememberedValue();
                    if (z5 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue14 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheetKt$ChartBottomSheet$2$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChartBottomSheetKt.C106842.invoke$lambda$23$lambda$22$lambda$21(RhModalBottomSheet);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue14);
                    }
                    composer2.endReplaceGroup();
                    TradeAmountBottomSheet6.TradeAmountBottomSheet(orderTradeAmount, z4, allowFractional, (Function0) objRememberedValue14, ComposableLambda3.rememberComposableLambda(-1106620043, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheetKt$ChartBottomSheet$2$13$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            EquityInstrumentBuyingPower orderBuyingPower;
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1106620043, i6, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheet.<anonymous>.<anonymous>.<anonymous> (ChartBottomSheet.kt:161)");
                            }
                            InstrumentOrderState instrumentOrderState4 = instrumentOrderState3;
                            Money buyingPowerAmount = null;
                            MacEquityOrderState macEquityOrderState = instrumentOrderState4 instanceof MacEquityOrderState ? (MacEquityOrderState) instrumentOrderState4 : null;
                            if (macEquityOrderState != null && (orderBuyingPower = macEquityOrderState.getOrderBuyingPower()) != null) {
                                buyingPowerAmount = orderBuyingPower.getBuyingPowerAmount();
                            }
                            Money money = buyingPowerAmount;
                            if (money != null) {
                                if (macEquityOrderState.getShortingEnabled()) {
                                    composer3.startReplaceGroup(851593979);
                                    AccountBuyingPowerDisplay2.ShortingAccountBuyingPowerDisplay(StringResources6.getTextAsString(AccountDisplayNames.getDisplayName(((MacEquityOrderState) instrumentOrderState3).getAccount()).getShort().getTitle(), composer3, StringResource.$stable), money, macEquityOrderState.getOrderBuyingPower().getShortBuyingPower(), null, composer3, 0, 8);
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(852026956);
                                    AccountBuyingPowerDisplay2.AccountBuyingPowerDisplay(StringResources6.getTextAsString(AccountDisplayNames.getDisplayName(((MacEquityOrderState) instrumentOrderState3).getAccount()).getShort().getTitle(), composer3, StringResource.$stable), money, null, composer3, 0, 4);
                                    composer3.endReplaceGroup();
                                }
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), (Function1) kFunction5, null, composer, 24576, 64);
                    composer2 = composer;
                    Unit unit5 = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
            } else if (bottomSheet instanceof YAxisSettings) {
                composer2.startReplaceGroup(86741138);
                ChartSettingSectionDto chartSettingSectionDto = this.$yAxisSection;
                if (chartSettingSectionDto != null) {
                    BottomSheet bottomSheet4 = this.$screenState;
                    final BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks6 = this.$chartCallbacks;
                    Object obj6 = this.$orderCallbacks;
                    AdvanceChartOrderViewState advanceChartOrderViewState4 = this.$orderViewState;
                    String title = chartSettingSectionDto.getTitle();
                    ImmutableList immutableList2 = extensions2.toImmutableList(chartSettingSectionDto.getSettings());
                    YAxisSettings yAxisSettings = (YAxisSettings) bottomSheet4;
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance11 = composer2.changedInstance(blackWidowAdvanceChartCallbacks6);
                    Object objRememberedValue15 = composer2.rememberedValue();
                    if (zChangedInstance11 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue15 = new ChartBottomSheetKt$ChartBottomSheet$2$14$1$1(blackWidowAdvanceChartCallbacks6);
                        composer2.updateRememberedValue(objRememberedValue15);
                    }
                    KFunction kFunction6 = (KFunction) objRememberedValue15;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance12 = composer2.changedInstance(obj6);
                    Object objRememberedValue16 = composer2.rememberedValue();
                    if (zChangedInstance12 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue16 = new ChartBottomSheetKt$ChartBottomSheet$2$14$2$1(obj6);
                        composer2.updateRememberedValue(objRememberedValue16);
                    }
                    KFunction kFunction7 = (KFunction) objRememberedValue16;
                    composer2.endReplaceGroup();
                    if (advanceChartOrderViewState4 != null) {
                        i3 = i2;
                        instrumentOrderState = advanceChartOrderViewState4.getInstrumentOrderState();
                    } else {
                        i3 = i2;
                        instrumentOrderState = null;
                    }
                    composer2.startReplaceGroup(5004770);
                    int i6 = i3 & 14;
                    boolean z6 = i6 == 4 || ((i3 & 8) != 0 && composer2.changedInstance(RhModalBottomSheet));
                    Object objRememberedValue17 = composer2.rememberedValue();
                    if (z6 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue17 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheetKt$ChartBottomSheet$2$$ExternalSyntheticLambda17
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChartBottomSheetKt.C106842.invoke$lambda$30$lambda$27$lambda$26(RhModalBottomSheet);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue17);
                    }
                    Function0 function02 = (Function0) objRememberedValue17;
                    composer2.endReplaceGroup();
                    Function1 function16 = (Function1) kFunction6;
                    Function1 function17 = (Function1) kFunction7;
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance13 = composer2.changedInstance(blackWidowAdvanceChartCallbacks6) | (i6 == 4 || ((i3 & 8) != 0 && composer2.changedInstance(RhModalBottomSheet)));
                    Object objRememberedValue18 = composer2.rememberedValue();
                    if (zChangedInstance13 || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue18 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheetKt$ChartBottomSheet$2$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                return ChartBottomSheetKt.C106842.invoke$lambda$30$lambda$29$lambda$28(blackWidowAdvanceChartCallbacks6, RhModalBottomSheet, (NestedSettingsBottomSheet) obj7);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue18);
                    }
                    composer2.endReplaceGroup();
                    SettingsBottomSheet.SettingsBottomSheet(title, immutableList2, yAxisSettings, function02, function16, function17, (Function1) objRememberedValue18, instrumentOrderState, composer2, YAxisSettings.$stable << 6);
                    Unit unit6 = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
            } else {
                int i7 = i2;
                if (bottomSheet instanceof AutoSendRenew) {
                    composer2.startReplaceGroup(87551199);
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, Logging4.updateEventDescriptor$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new Component(Component.ComponentType.BOTTOM_SHEET, ChartBottomSheetKt.AUTO_SEND_RENEW_BOTTOM_SHEET, null, 4, null), null, null, null, null, null, 0.0d, false, null, null, null, null, 0.0d, null, null, 32766, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                    composer2.startReplaceGroup(-1224400529);
                    int i8 = i7 & 14;
                    boolean zChangedInstance14 = composer2.changedInstance(this.$eventLogger) | composer2.changedInstance(this.$eventDescriptor) | composer2.changedInstance(this.$chartCallbacks) | composer2.changedInstance(this.$screenState) | (i8 == 4 || ((i7 & 8) != 0 && composer2.changedInstance(RhModalBottomSheet)));
                    final EventLogger eventLogger = this.$eventLogger;
                    final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
                    final BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks7 = this.$chartCallbacks;
                    final BottomSheet bottomSheet5 = this.$screenState;
                    Object objRememberedValue19 = composer2.rememberedValue();
                    if (zChangedInstance14 || objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                        Object obj7 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheetKt$ChartBottomSheet$2$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChartBottomSheetKt.C106842.invoke$lambda$32$lambda$31(eventLogger, userInteractionEventDescriptor, blackWidowAdvanceChartCallbacks7, bottomSheet5, RhModalBottomSheet);
                            }
                        };
                        composer2.updateRememberedValue(obj7);
                        objRememberedValue19 = obj7;
                    }
                    Function0 function03 = (Function0) objRememberedValue19;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-1746271574);
                    boolean zChangedInstance15 = composer2.changedInstance(this.$eventLogger) | composer2.changedInstance(this.$eventDescriptor) | (i8 == 4 || ((i7 & 8) != 0 && composer2.changedInstance(RhModalBottomSheet)));
                    final EventLogger eventLogger2 = this.$eventLogger;
                    final UserInteractionEventDescriptor userInteractionEventDescriptor2 = this.$eventDescriptor;
                    Object objRememberedValue20 = composer2.rememberedValue();
                    if (zChangedInstance15 || objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue20 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheetKt$ChartBottomSheet$2$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChartBottomSheetKt.C106842.invoke$lambda$34$lambda$33(eventLogger2, userInteractionEventDescriptor2, RhModalBottomSheet);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue20);
                    }
                    composer2.endReplaceGroup();
                    AutoSendRenewBottomSheet.AutoSendRenewBottomSheet(function03, (Function0) objRememberedValue20, modifierAutoLogEvents$default, composer2, 0, 0);
                    composer2.endReplaceGroup();
                    Unit unit7 = Unit.INSTANCE;
                } else {
                    if (!(bottomSheet instanceof NestedSettingsBottomSheet)) {
                        composer2.startReplaceGroup(-1244260653);
                        composer2.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer2.startReplaceGroup(89502990);
                    NestedSettingsBottomSheet nestedSettingsBottomSheet = (NestedSettingsBottomSheet) this.$screenState;
                    if (nestedSettingsBottomSheet instanceof EquityTimeInForce) {
                        composer2.startReplaceGroup(89512538);
                        AdvanceChartOrderViewState advanceChartOrderViewState5 = this.$orderViewState;
                        if (advanceChartOrderViewState5 instanceof EquityAdvanceChartOrderViewState) {
                            MacEquityOrderState instrumentOrderState4 = ((EquityAdvanceChartOrderViewState) advanceChartOrderViewState5).getInstrumentOrderState();
                            if (instrumentOrderState4 == null) {
                                composer2.endReplaceGroup();
                                composer2.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            String accountNumber = instrumentOrderState4.getAccount().getAccountNumber();
                            UUID id = instrumentOrderState4.getInstrument().getId();
                            composer2.startReplaceGroup(5004770);
                            boolean z7 = (i7 & 14) == 4 || ((i7 & 8) != 0 && composer2.changedInstance(RhModalBottomSheet));
                            Object objRememberedValue21 = composer2.rememberedValue();
                            if (z7 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue21 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheetKt$ChartBottomSheet$2$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ChartBottomSheetKt.C106842.invoke$lambda$36$lambda$35(RhModalBottomSheet);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue21);
                            }
                            composer2.endReplaceGroup();
                            EquityTimeInForceBottomSheet.EquityTimeInForceBottomSheet(accountNumber, id, (Function0) objRememberedValue21, null, composer2, 0, 8);
                        }
                        composer2.endReplaceGroup();
                    } else if (nestedSettingsBottomSheet instanceof EquityTradingSession) {
                        composer2.startReplaceGroup(90230777);
                        AdvanceChartOrderViewState advanceChartOrderViewState6 = this.$orderViewState;
                        if (advanceChartOrderViewState6 instanceof EquityAdvanceChartOrderViewState) {
                            MacEquityOrderState instrumentOrderState5 = ((EquityAdvanceChartOrderViewState) advanceChartOrderViewState6).getInstrumentOrderState();
                            if (instrumentOrderState5 == null) {
                                composer2.endReplaceGroup();
                                composer2.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            UUID id2 = instrumentOrderState5.getInstrument().getId();
                            String accountNumber2 = instrumentOrderState5.getAccount().getAccountNumber();
                            composer2.startReplaceGroup(5004770);
                            boolean z8 = (i7 & 14) == 4 || ((i7 & 8) != 0 && composer2.changedInstance(RhModalBottomSheet));
                            Object objRememberedValue22 = composer2.rememberedValue();
                            if (z8 || objRememberedValue22 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue22 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheetKt$ChartBottomSheet$2$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ChartBottomSheetKt.C106842.invoke$lambda$38$lambda$37(RhModalBottomSheet);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue22);
                            }
                            composer2.endReplaceGroup();
                            EquityTradingHoursBottomSheet.EquityTradingHoursBottomSheet(id2, accountNumber2, (Function0) objRememberedValue22, null, composer2, 0, 8);
                        }
                        composer2.endReplaceGroup();
                    } else {
                        if (!(nestedSettingsBottomSheet instanceof NestedChartSettings)) {
                            composer2.startReplaceGroup(-1244038252);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(90973289);
                        Object section = ((NestedChartSettings) this.$screenState).getSection();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChanged = composer2.changed(section) | composer2.changed(this.$settingsBottomSheetState);
                        final SettingsBottomSheetState settingsBottomSheetState2 = this.$settingsBottomSheetState;
                        final BottomSheet bottomSheet6 = this.$screenState;
                        Object objRememberedValue23 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue23 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue23 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheetKt$ChartBottomSheet$2$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ChartBottomSheetKt.C106842.invoke$lambda$43$lambda$42(settingsBottomSheetState2, bottomSheet6);
                                }
                            });
                            composer2.updateRememberedValue(objRememberedValue23);
                        }
                        SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue23;
                        composer2.endReplaceGroup();
                        String title2 = invoke$lambda$44(snapshotState4).getTitle();
                        ImmutableList immutableList3 = extensions2.toImmutableList(invoke$lambda$44(snapshotState4).getSettings());
                        NestedChartSettings nestedChartSettings = (NestedChartSettings) this.$screenState;
                        Object obj8 = this.$chartCallbacks;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance16 = composer2.changedInstance(obj8);
                        Object objRememberedValue24 = composer2.rememberedValue();
                        if (zChangedInstance16 || objRememberedValue24 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue24 = new ChartBottomSheetKt$ChartBottomSheet$2$19$1(obj8);
                            composer2.updateRememberedValue(objRememberedValue24);
                        }
                        KFunction kFunction8 = (KFunction) objRememberedValue24;
                        composer2.endReplaceGroup();
                        Object obj9 = this.$orderCallbacks;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance17 = composer2.changedInstance(obj9);
                        Object objRememberedValue25 = composer2.rememberedValue();
                        if (zChangedInstance17 || objRememberedValue25 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue25 = new ChartBottomSheetKt$ChartBottomSheet$2$20$1(obj9);
                            composer2.updateRememberedValue(objRememberedValue25);
                        }
                        KFunction kFunction9 = (KFunction) objRememberedValue25;
                        composer2.endReplaceGroup();
                        AdvanceChartOrderViewState advanceChartOrderViewState7 = this.$orderViewState;
                        InstrumentOrderState instrumentOrderState6 = advanceChartOrderViewState7 != null ? advanceChartOrderViewState7.getInstrumentOrderState() : null;
                        composer2.startReplaceGroup(5004770);
                        int i9 = i7 & 14;
                        boolean z9 = i9 == 4 || ((i7 & 8) != 0 && composer2.changedInstance(RhModalBottomSheet));
                        Object objRememberedValue26 = composer2.rememberedValue();
                        if (z9 || objRememberedValue26 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue26 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheetKt$ChartBottomSheet$2$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ChartBottomSheetKt.C106842.invoke$lambda$48$lambda$47(RhModalBottomSheet);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue26);
                        }
                        Function0 function04 = (Function0) objRememberedValue26;
                        composer2.endReplaceGroup();
                        Function1 function18 = (Function1) kFunction8;
                        Function1 function19 = (Function1) kFunction9;
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance18 = composer2.changedInstance(this.$chartCallbacks) | (i9 == 4 || ((i7 & 8) != 0 && composer2.changedInstance(RhModalBottomSheet)));
                        final BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks8 = this.$chartCallbacks;
                        Object objRememberedValue27 = composer2.rememberedValue();
                        if (zChangedInstance18 || objRememberedValue27 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue27 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheetKt$ChartBottomSheet$2$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj10) {
                                    return ChartBottomSheetKt.C106842.invoke$lambda$50$lambda$49(blackWidowAdvanceChartCallbacks8, RhModalBottomSheet, (NestedSettingsBottomSheet) obj10);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue27);
                        }
                        composer2.endReplaceGroup();
                        SettingsBottomSheet.SettingsBottomSheet(title2, immutableList3, nestedChartSettings, function04, function18, function19, (Function1) objRememberedValue27, instrumentOrderState6, composer2, NestedChartSettings.$stable << 6);
                        composer2.endReplaceGroup();
                    }
                    composer2.endReplaceGroup();
                    Unit unit8 = Unit.INSTANCE;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, RhModalBottomSheet5 rhModalBottomSheet5, BottomSheet it) {
            Intrinsics.checkNotNullParameter(it, "it");
            blackWidowAdvanceChartCallbacks.setScreenState(it, false);
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(RhModalBottomSheet5 rhModalBottomSheet5) {
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, BottomSheet bottomSheet, RhModalBottomSheet5 rhModalBottomSheet5, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            blackWidowAdvanceChartCallbacks.createTemplate(it);
            if (((CreateTemplate) bottomSheet).getAddIndicatorsAfter()) {
                blackWidowAdvanceChartCallbacks.setScreenState(AddIndicator.INSTANCE, false);
            }
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$10(RhModalBottomSheet5 rhModalBottomSheet5) {
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8(BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, BottomSheet bottomSheet, RhModalBottomSheet5 rhModalBottomSheet5, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            blackWidowAdvanceChartCallbacks.renameTemplate(it, ((EditTemplate) bottomSheet).getTemplateDto());
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$19$lambda$18(RhModalBottomSheet5 rhModalBottomSheet5) {
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$15$lambda$14(BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, TemplateDto it) {
            Intrinsics.checkNotNullParameter(it, "it");
            blackWidowAdvanceChartCallbacks.setScreenState(new EditTemplate(it, false, new SelectTemplate(false, null, 3, null), 2, null), true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$17$lambda$16(BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks) {
            blackWidowAdvanceChartCallbacks.setScreenState(new CreateTemplate(true, false, false, new SelectTemplate(false, null, 3, null), 4, null), true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$23$lambda$22$lambda$21(RhModalBottomSheet5 rhModalBottomSheet5) {
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$30$lambda$29$lambda$28(BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, RhModalBottomSheet5 rhModalBottomSheet5, NestedSettingsBottomSheet it) {
            Intrinsics.checkNotNullParameter(it, "it");
            blackWidowAdvanceChartCallbacks.setScreenState(it, false);
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$30$lambda$27$lambda$26(RhModalBottomSheet5 rhModalBottomSheet5) {
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$32$lambda$31(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, BottomSheet bottomSheet, RhModalBottomSheet5 rhModalBottomSheet5) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.CONTINUE_BUTTON, ChartBottomSheetKt.AUTO_SEND_RENEW_BOTTOM_SHEET, null, 4, null), null, userInteractionEventDescriptor.getContext(), false, 41, null);
            blackWidowAdvanceChartCallbacks.setScreenState(new IdentiAgreement(((AutoSendRenew) bottomSheet).getIdentiAgreementType(), false, false), false);
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$34$lambda$33(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, RhModalBottomSheet5 rhModalBottomSheet5) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.CANCEL_BUTTON, ChartBottomSheetKt.AUTO_SEND_RENEW_BOTTOM_SHEET, null, 4, null), null, userInteractionEventDescriptor.getContext(), false, 41, null);
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$36$lambda$35(RhModalBottomSheet5 rhModalBottomSheet5) {
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$38$lambda$37(RhModalBottomSheet5 rhModalBottomSheet5) {
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ChartSettingSectionDto invoke$lambda$43$lambda$42(SettingsBottomSheetState settingsBottomSheetState, BottomSheet bottomSheet) {
            ImmutableList<ChartSettingSectionDto> chartSettingSections;
            Object next;
            if (settingsBottomSheetState != null && (chartSettingSections = settingsBottomSheetState.getChartSettingSections()) != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<ChartSettingSectionDto> it = chartSettingSections.iterator();
                while (it.hasNext()) {
                    Iterator<T> it2 = it.next().getSettings().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        ChartSettingSectionDto nested_section = ((ChartSettingDto) next).getNested_section();
                        if (Intrinsics.areEqual(nested_section != null ? nested_section.getTitle() : null, ((NestedChartSettings) bottomSheet).getSection().getTitle())) {
                            break;
                        }
                    }
                    ChartSettingDto chartSettingDto = (ChartSettingDto) next;
                    ChartSettingSectionDto nested_section2 = chartSettingDto != null ? chartSettingDto.getNested_section() : null;
                    if (nested_section2 != null) {
                        arrayList.add(nested_section2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add((ChartSettingSectionDto) it3.next());
                }
                ChartSettingSectionDto chartSettingSectionDto = (ChartSettingSectionDto) CollectionsKt.firstOrNull((List) arrayList2);
                if (chartSettingSectionDto != null) {
                    return chartSettingSectionDto;
                }
            }
            return ((NestedChartSettings) bottomSheet).getSection();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$50$lambda$49(BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, RhModalBottomSheet5 rhModalBottomSheet5, NestedSettingsBottomSheet it) {
            Intrinsics.checkNotNullParameter(it, "it");
            blackWidowAdvanceChartCallbacks.setScreenState(it, false);
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$48$lambda$47(RhModalBottomSheet5 rhModalBottomSheet5) {
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }
    }
}
