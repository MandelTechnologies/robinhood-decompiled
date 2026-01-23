package com.robinhood.android.equitytradeladder.settingsbottomsheet;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.OnPlacedModifier3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.equities.tradesettings.equity.p119ts.EquityTradingSessionBottomSheetKt;
import com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceBottomSheet7;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore4;
import com.robinhood.android.equitytradeladder.EquityTradeLadderViewState;
import com.robinhood.android.equitytradeladder.LadderScreenState;
import com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderBottomSheet;
import com.robinhood.android.equitytradeladder.settingsbottomsheet.quantityselector.QuantityNumPadSelector4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.trading.tradecomponentscompose.bottomsheets.AutoSendIsOnBottomSheet;
import com.robinhood.shared.trading.tradecomponentscompose.bottomsheets.AutoSendRenewBottomSheet;
import com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantity;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LadderBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a½\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\t2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00030\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0001¢\u0006\u0002\u0010\u0019\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"AUTO_SEND_RENEW_IDENTIFIER", "", "LadderBottomSheet", "", "screenState", "Lcom/robinhood/android/equitytradeladder/LadderScreenState$BottomSheet;", "ladderViewState", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState;", "setScreenState", "Lkotlin/Function2;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "", "advanceScreenState", "Lkotlin/Function1;", "onAutoSendToggled", "onLadderEducationCtaClick", "Lkotlin/Function0;", "onQuantityUpdated", "Ljava/math/BigDecimal;", "onQuantitySelectorDismiss", "onQuantityInputModeChanged", "Lcom/robinhood/shared/trading/tradecomponentscompose/input/TradeQuantityInputMode;", "onNuxSeen", "sheetState", "Landroidx/compose/material3/SheetState;", "(Lcom/robinhood/android/equitytradeladder/LadderScreenState$BottomSheet;Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SheetState;Landroidx/compose/runtime/Composer;III)V", "feature-equity-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderBottomSheetKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class LadderBottomSheet {
    private static final String AUTO_SEND_RENEW_IDENTIFIER = "EquitiesAutoSendDisclosure";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderBottomSheet$lambda$2(LadderScreenState.BottomSheet bottomSheet, EquityTradeLadderViewState equityTradeLadderViewState, Function2 function2, Function1 function1, Function1 function12, Function0 function0, Function1 function13, Function0 function02, Function1 function14, Function0 function03, SheetState sheetState, int i, int i2, int i3, Composer composer, int i4) {
        LadderBottomSheet(bottomSheet, equityTradeLadderViewState, function2, function1, function12, function0, function13, function02, function14, function03, sheetState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LadderBottomSheet(final LadderScreenState.BottomSheet screenState, final EquityTradeLadderViewState ladderViewState, final Function2<? super LadderScreenState, ? super Boolean, Unit> setScreenState, final Function1<? super LadderScreenState, Unit> advanceScreenState, final Function1<? super Boolean, Unit> onAutoSendToggled, final Function0<Unit> onLadderEducationCtaClick, final Function1<? super BigDecimal, Unit> onQuantityUpdated, final Function0<Unit> onQuantitySelectorDismiss, final Function1<? super TradeQuantity, Unit> onQuantityInputModeChanged, final Function0<Unit> onNuxSeen, SheetState sheetState, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        SheetState sheetStateRememberModalBottomSheetState;
        boolean z;
        Object objRememberedValue;
        Composer composer2;
        final SheetState sheetState2;
        Intrinsics.checkNotNullParameter(screenState, "screenState");
        Intrinsics.checkNotNullParameter(ladderViewState, "ladderViewState");
        Intrinsics.checkNotNullParameter(setScreenState, "setScreenState");
        Intrinsics.checkNotNullParameter(advanceScreenState, "advanceScreenState");
        Intrinsics.checkNotNullParameter(onAutoSendToggled, "onAutoSendToggled");
        Intrinsics.checkNotNullParameter(onLadderEducationCtaClick, "onLadderEducationCtaClick");
        Intrinsics.checkNotNullParameter(onQuantityUpdated, "onQuantityUpdated");
        Intrinsics.checkNotNullParameter(onQuantitySelectorDismiss, "onQuantitySelectorDismiss");
        Intrinsics.checkNotNullParameter(onQuantityInputModeChanged, "onQuantityInputModeChanged");
        Intrinsics.checkNotNullParameter(onNuxSeen, "onNuxSeen");
        Composer composerStartRestartGroup = composer.startRestartGroup(809745827);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = ((i & 8) == 0 ? composerStartRestartGroup.changed(screenState) : composerStartRestartGroup.changedInstance(screenState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(ladderViewState) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(setScreenState) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(advanceScreenState) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onAutoSendToggled) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onLadderEducationCtaClick) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onQuantityUpdated) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onQuantitySelectorDismiss) ? 8388608 : 4194304;
        }
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onQuantityInputModeChanged) ? 67108864 : 33554432;
        }
        if ((i3 & 512) != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onNuxSeen) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (((i3 & 1024) == 0 && composerStartRestartGroup.changed(sheetState)) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i4 & 306783379) != 306783378 || (i5 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 1024) != 0) {
                    i5 &= -15;
                }
            } else {
                if ((i3 & 1024) != 0) {
                    i5 &= -15;
                    sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(screenState.getSkipPartialState(), null, composerStartRestartGroup, 0, 2);
                }
                int i6 = i5;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(809745827, i4, i6, "com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderBottomSheet (LadderBottomSheet.kt:47)");
                }
                EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                z = ((i4 & 896) != 256) | ((i4 & 14) != 4 || ((i4 & 8) != 0 && composerStartRestartGroup.changedInstance(screenState))) | ((i4 & 7168) != 2048);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderBottomSheetKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LadderBottomSheet.LadderBottomSheet$lambda$1$lambda$0(screenState, setScreenState, advanceScreenState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                SheetState sheetState3 = sheetStateRememberModalBottomSheetState;
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue, modifierStatusBarsPadding, false, sheetState3, null, 0L, ComposableLambda3.rememberComposableLambda(-1276956502, true, new C159842(screenState, ladderViewState, onQuantityUpdated, onQuantitySelectorDismiss, onQuantityInputModeChanged, onNuxSeen, setScreenState, current, userInteractionEventDescriptor, onAutoSendToggled, onLadderEducationCtaClick), composerStartRestartGroup, 54), composer2, ((i6 << 9) & 7168) | 1572864, 52);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                sheetState2 = sheetState3;
            }
            sheetStateRememberModalBottomSheetState = sheetState;
            int i62 = i5;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Modifier modifierStatusBarsPadding2 = WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            if ((i4 & 14) != 4) {
                z = ((i4 & 896) != 256) | ((i4 & 14) != 4 || ((i4 & 8) != 0 && composerStartRestartGroup.changedInstance(screenState))) | ((i4 & 7168) != 2048);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderBottomSheetKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LadderBottomSheet.LadderBottomSheet$lambda$1$lambda$0(screenState, setScreenState, advanceScreenState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    SheetState sheetState32 = sheetStateRememberModalBottomSheetState;
                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue, modifierStatusBarsPadding2, false, sheetState32, null, 0L, ComposableLambda3.rememberComposableLambda(-1276956502, true, new C159842(screenState, ladderViewState, onQuantityUpdated, onQuantitySelectorDismiss, onQuantityInputModeChanged, onNuxSeen, setScreenState, current2, userInteractionEventDescriptor2, onAutoSendToggled, onLadderEducationCtaClick), composerStartRestartGroup, 54), composer2, ((i62 << 9) & 7168) | 1572864, 52);
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderBottomSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderBottomSheet.LadderBottomSheet$lambda$2(screenState, ladderViewState, setScreenState, advanceScreenState, onAutoSendToggled, onLadderEducationCtaClick, onQuantityUpdated, onQuantitySelectorDismiss, onQuantityInputModeChanged, onNuxSeen, sheetState2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderBottomSheet$lambda$1$lambda$0(LadderScreenState.BottomSheet bottomSheet, Function2 function2, Function1 function1) {
        LadderScreenState parentScreenState = bottomSheet.getParentScreenState();
        if (parentScreenState != null) {
            function2.invoke(parentScreenState, Boolean.TRUE);
        } else {
            function1.invoke(null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: LadderBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderBottomSheetKt$LadderBottomSheet$2 */
    static final class C159842 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ EquityTradeLadderViewState $ladderViewState;
        final /* synthetic */ Function1<Boolean, Unit> $onAutoSendToggled;
        final /* synthetic */ Function0<Unit> $onLadderEducationCtaClick;
        final /* synthetic */ Function0<Unit> $onNuxSeen;
        final /* synthetic */ Function1<TradeQuantity, Unit> $onQuantityInputModeChanged;
        final /* synthetic */ Function0<Unit> $onQuantitySelectorDismiss;
        final /* synthetic */ Function1<BigDecimal, Unit> $onQuantityUpdated;
        final /* synthetic */ LadderScreenState.BottomSheet $screenState;
        final /* synthetic */ Function2<LadderScreenState, Boolean, Unit> $setScreenState;

        /* JADX WARN: Multi-variable type inference failed */
        C159842(LadderScreenState.BottomSheet bottomSheet, EquityTradeLadderViewState equityTradeLadderViewState, Function1<? super BigDecimal, Unit> function1, Function0<Unit> function0, Function1<? super TradeQuantity, Unit> function12, Function0<Unit> function02, Function2<? super LadderScreenState, ? super Boolean, Unit> function2, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function1<? super Boolean, Unit> function13, Function0<Unit> function03) {
            this.$screenState = bottomSheet;
            this.$ladderViewState = equityTradeLadderViewState;
            this.$onQuantityUpdated = function1;
            this.$onQuantitySelectorDismiss = function0;
            this.$onQuantityInputModeChanged = function12;
            this.$onNuxSeen = function02;
            this.$setScreenState = function2;
            this.$eventLogger = eventLogger;
            this.$eventDescriptor = userInteractionEventDescriptor;
            this.$onAutoSendToggled = function13;
            this.$onLadderEducationCtaClick = function03;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(final RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            int i2;
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
                ComposerKt.traceEventStart(-1276956502, i2, -1, "com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderBottomSheet.<anonymous> (LadderBottomSheet.kt:62)");
            }
            LadderScreenState.BottomSheet bottomSheet = this.$screenState;
            if (bottomSheet instanceof LadderScreenState.BottomSheet.QuantitySelector) {
                composer2.startReplaceGroup(-1285661143);
                EquityTradeLadderViewState.BottomBarData bottomBarData = this.$ladderViewState.getBottomBarData();
                EquityTradeLadderViewState.BottomBarData.MarketOrderData marketOrderData = bottomBarData instanceof EquityTradeLadderViewState.BottomBarData.MarketOrderData ? (EquityTradeLadderViewState.BottomBarData.MarketOrderData) bottomBarData : null;
                if (marketOrderData != null) {
                    BigDecimal quantity = marketOrderData.getQuantity();
                    int i3 = i2;
                    StringResource buyingPowerDisplay = marketOrderData.getBuyingPowerDisplay();
                    TradeQuantity quantityInputMode = marketOrderData.getQuantityInputMode();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m5146paddingqDBjuR0$default(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer2, i4).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i4).m21593getSmallD9Ej5fM(), 7, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BOTTOM_SHEET, "EQUITIES_LADDER_QUANTITY_SELECTOR", null, 4, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                    composer2.startReplaceGroup(5004770);
                    boolean zChanged = composer2.changed(this.$onQuantityUpdated);
                    final Function1<BigDecimal, Unit> function1 = this.$onQuantityUpdated;
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderBottomSheetKt$LadderBottomSheet$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LadderBottomSheet.C159842.invoke$lambda$1$lambda$0(function1, (BigDecimal) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function12 = (Function1) objRememberedValue;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChanged2 = composer2.changed(this.$onQuantitySelectorDismiss) | ((i3 & 14) == 4 || ((i3 & 8) != 0 && composer2.changedInstance(RhModalBottomSheet)));
                    final Function0<Unit> function0 = this.$onQuantitySelectorDismiss;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderBottomSheetKt$LadderBottomSheet$2$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LadderBottomSheet.C159842.invoke$lambda$3$lambda$2(function0, RhModalBottomSheet);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    Function0 function02 = (Function0) objRememberedValue2;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(5004770);
                    boolean zChanged3 = composer2.changed(this.$onQuantityInputModeChanged);
                    final Function1<TradeQuantity, Unit> function13 = this.$onQuantityInputModeChanged;
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderBottomSheetKt$LadderBottomSheet$2$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LadderBottomSheet.C159842.invoke$lambda$5$lambda$4(function13, (TradeQuantity) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceGroup();
                    QuantityNumPadSelector4.QuantityNumPadSelector(quantity, buyingPowerDisplay, false, function12, function02, modifierAutoLogEvents$default, quantityInputMode, (Function1) objRememberedValue3, composer2, (StringResource.$stable << 3) | 384, 0);
                    composer2 = composer2;
                }
                composer2.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
            } else {
                int i5 = i2;
                if (bottomSheet instanceof LadderScreenState.BottomSheet.LadderSettings) {
                    composer2.startReplaceGroup(-1283891074);
                    EquityTradeLadderViewState.SettingsBottomSheetData settingsBottomSheetData = this.$ladderViewState.getSettingsBottomSheetData();
                    if (settingsBottomSheetData != null) {
                        Function1<Boolean, Unit> function14 = this.$onAutoSendToggled;
                        final Function0<Unit> function03 = this.$onLadderEducationCtaClick;
                        final Function2<LadderScreenState, Boolean, Unit> function2 = this.$setScreenState;
                        boolean zAreEqual = Intrinsics.areEqual(settingsBottomSheetData.getAutoSend(), Boolean.TRUE);
                        boolean autoSendLoading = settingsBottomSheetData.getAutoSendLoading();
                        boolean hideAutoSendToggle = settingsBottomSheetData.getHideAutoSendToggle();
                        StringResource stocksAndEtfTitle = settingsBottomSheetData.getStocksAndEtfTitle();
                        composer2.startReplaceGroup(-1633490746);
                        int i6 = i5 & 14;
                        boolean zChanged4 = composer2.changed(function03) | (i6 == 4 || ((i5 & 8) != 0 && composer2.changedInstance(RhModalBottomSheet)));
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderBottomSheetKt$LadderBottomSheet$2$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return LadderBottomSheet.C159842.invoke$lambda$12$lambda$7$lambda$6(function03, RhModalBottomSheet);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        Function0 function04 = (Function0) objRememberedValue4;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChanged5 = composer2.changed(function2) | (i6 == 4 || ((i5 & 8) != 0 && composer2.changedInstance(RhModalBottomSheet)));
                        Object objRememberedValue5 = composer2.rememberedValue();
                        if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function1() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderBottomSheetKt$LadderBottomSheet$2$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return LadderBottomSheet.C159842.invoke$lambda$12$lambda$9$lambda$8(function2, RhModalBottomSheet, (LadderScreenState.BottomSheet.NestedSettingsBottomSheet) obj);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue5);
                        }
                        Function1 function15 = (Function1) objRememberedValue5;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(5004770);
                        boolean z = i6 == 4 || ((i5 & 8) != 0 && composer2.changedInstance(RhModalBottomSheet));
                        Object objRememberedValue6 = composer2.rememberedValue();
                        if (z || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function0() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderBottomSheetKt$LadderBottomSheet$2$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return LadderBottomSheet.C159842.invoke$lambda$12$lambda$11$lambda$10(RhModalBottomSheet);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue6);
                        }
                        composer2.endReplaceGroup();
                        LadderSettingsBottomSheetKt.LadderSettingsBottomSheetComposable(zAreEqual, autoSendLoading, hideAutoSendToggle, function14, stocksAndEtfTitle, function04, function15, (Function0) objRememberedValue6, composer2, StringResource.$stable << 12);
                        composer2 = composer2;
                        Unit unit2 = Unit.INSTANCE;
                    }
                    composer2.endReplaceGroup();
                } else if (bottomSheet instanceof LadderScreenState.BottomSheet.AutoSendIsOn) {
                    composer2.startReplaceGroup(-1282862959);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    composer2.startReplaceGroup(5004770);
                    boolean zChanged6 = composer2.changed(this.$onNuxSeen);
                    final Function0<Unit> function05 = this.$onNuxSeen;
                    Object objRememberedValue7 = composer2.rememberedValue();
                    if (zChanged6 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new Function1() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderBottomSheetKt$LadderBottomSheet$2$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LadderBottomSheet.C159842.invoke$lambda$14$lambda$13(function05, (LayoutCoordinates) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierOnPlaced = OnPlacedModifier3.onPlaced(companion2, (Function1) objRememberedValue7);
                    composer2.startReplaceGroup(-1633490746);
                    int i7 = i5 & 14;
                    boolean zChanged7 = composer2.changed(this.$setScreenState) | (i7 == 4 || ((i5 & 8) != 0 && composer2.changedInstance(RhModalBottomSheet)));
                    final Function2<LadderScreenState, Boolean, Unit> function22 = this.$setScreenState;
                    Object objRememberedValue8 = composer2.rememberedValue();
                    if (zChanged7 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new Function0() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderBottomSheetKt$LadderBottomSheet$2$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LadderBottomSheet.C159842.invoke$lambda$16$lambda$15(function22, RhModalBottomSheet);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue8);
                    }
                    Function0 function06 = (Function0) objRememberedValue8;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(5004770);
                    boolean z2 = i7 == 4 || ((i5 & 8) != 0 && composer2.changedInstance(RhModalBottomSheet));
                    Object objRememberedValue9 = composer2.rememberedValue();
                    if (z2 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new Function0() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderBottomSheetKt$LadderBottomSheet$2$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LadderBottomSheet.C159842.invoke$lambda$18$lambda$17(RhModalBottomSheet);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue9);
                    }
                    composer2.endReplaceGroup();
                    AutoSendIsOnBottomSheet.AutoSendIsOnBottomSheet(function06, (Function0) objRememberedValue9, modifierOnPlaced, composer2, 0, 0);
                    composer2.endReplaceGroup();
                    Unit unit3 = Unit.INSTANCE;
                } else if (bottomSheet instanceof LadderScreenState.BottomSheet.AutoSendRenew) {
                    composer2.startReplaceGroup(-1282185206);
                    Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BOTTOM_SHEET, LadderBottomSheet.AUTO_SEND_RENEW_IDENTIFIER, null, 4, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                    composer2.startReplaceGroup(-1224400529);
                    int i8 = i5 & 14;
                    boolean zChangedInstance = composer2.changedInstance(this.$eventLogger) | composer2.changedInstance(this.$eventDescriptor) | composer2.changed(this.$setScreenState) | (i8 == 4 || ((i5 & 8) != 0 && composer2.changedInstance(RhModalBottomSheet)));
                    final EventLogger eventLogger = this.$eventLogger;
                    final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
                    final Function2<LadderScreenState, Boolean, Unit> function23 = this.$setScreenState;
                    Object objRememberedValue10 = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new Function0() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderBottomSheetKt$LadderBottomSheet$2$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LadderBottomSheet.C159842.invoke$lambda$20$lambda$19(eventLogger, userInteractionEventDescriptor, function23, RhModalBottomSheet);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue10);
                    }
                    Function0 function07 = (Function0) objRememberedValue10;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-1746271574);
                    boolean zChangedInstance2 = composer2.changedInstance(this.$eventLogger) | composer2.changedInstance(this.$eventDescriptor) | (i8 == 4 || ((i5 & 8) != 0 && composer2.changedInstance(RhModalBottomSheet)));
                    final EventLogger eventLogger2 = this.$eventLogger;
                    final UserInteractionEventDescriptor userInteractionEventDescriptor2 = this.$eventDescriptor;
                    Object objRememberedValue11 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue11 = new Function0() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderBottomSheetKt$LadderBottomSheet$2$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LadderBottomSheet.C159842.invoke$lambda$22$lambda$21(eventLogger2, userInteractionEventDescriptor2, RhModalBottomSheet);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue11);
                    }
                    composer2.endReplaceGroup();
                    AutoSendRenewBottomSheet.AutoSendRenewBottomSheet(function07, (Function0) objRememberedValue11, modifierAutoLogEvents$default2, composer2, 0, 0);
                    composer2.endReplaceGroup();
                    Unit unit4 = Unit.INSTANCE;
                } else {
                    if (!(bottomSheet instanceof LadderScreenState.BottomSheet.NestedSettingsBottomSheet)) {
                        composer2.startReplaceGroup(1205456577);
                        composer2.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer2.startReplaceGroup(-1280354997);
                    LadderScreenState.BottomSheet.NestedSettingsBottomSheet nestedSettingsBottomSheet = (LadderScreenState.BottomSheet.NestedSettingsBottomSheet) this.$screenState;
                    if (nestedSettingsBottomSheet instanceof LadderScreenState.BottomSheet.NestedSettingsBottomSheet.EquityTimeInForce) {
                        composer2.startReplaceGroup(-1280261873);
                        EquityTradeLadderViewState.SettingsBottomSheetData settingsBottomSheetData2 = this.$ladderViewState.getSettingsBottomSheetData();
                        if (settingsBottomSheetData2 != null) {
                            String accountNumber = settingsBottomSheetData2.getAccount().getAccountNumber();
                            TradeSettingsStore4 tradeSettingsStore4 = TradeSettingsStore4.LADDER;
                            UUID id = settingsBottomSheetData2.getInstrument().getId();
                            composer2.startReplaceGroup(5004770);
                            boolean z3 = (i5 & 14) == 4 || ((i5 & 8) != 0 && composer2.changedInstance(RhModalBottomSheet));
                            Object objRememberedValue12 = composer2.rememberedValue();
                            if (z3 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue12 = new Function0() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderBottomSheetKt$LadderBottomSheet$2$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return LadderBottomSheet.C159842.invoke$lambda$25$lambda$24$lambda$23(RhModalBottomSheet);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue12);
                            }
                            composer2.endReplaceGroup();
                            EquityTimeInForceBottomSheet7.EquityTimeInForceBottomSheet(accountNumber, tradeSettingsStore4, id, (Function0) objRememberedValue12, ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BOTTOM_SHEET, "EQUITIES_LADDER_TIF_SHEET_BOTTOM_SHEET", null, 4, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), null, composer, 48, 32);
                            composer2 = composer;
                            Unit unit5 = Unit.INSTANCE;
                        }
                        composer2.endReplaceGroup();
                    } else {
                        if (!(nestedSettingsBottomSheet instanceof LadderScreenState.BottomSheet.NestedSettingsBottomSheet.EquityTradingSession)) {
                            composer2.startReplaceGroup(1205624759);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(-1279005784);
                        EquityTradeLadderViewState.SettingsBottomSheetData settingsBottomSheetData3 = this.$ladderViewState.getSettingsBottomSheetData();
                        if (settingsBottomSheetData3 != null) {
                            String accountNumber2 = settingsBottomSheetData3.getAccount().getAccountNumber();
                            TradeSettingsStore4 tradeSettingsStore42 = TradeSettingsStore4.LADDER;
                            UUID id2 = settingsBottomSheetData3.getInstrument().getId();
                            Modifier modifierAutoLogEvents$default3 = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BOTTOM_SHEET, "EQUITIES_LADDER_TRADING_SHEET_BOTTOM_SHEET", null, 4, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                            composer2.startReplaceGroup(5004770);
                            boolean z4 = (i5 & 14) == 4 || ((i5 & 8) != 0 && composer2.changedInstance(RhModalBottomSheet));
                            Object objRememberedValue13 = composer2.rememberedValue();
                            if (z4 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue13 = new Function0() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderBottomSheetKt$LadderBottomSheet$2$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return LadderBottomSheet.C159842.invoke$lambda$28$lambda$27$lambda$26(RhModalBottomSheet);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue13);
                            }
                            composer2.endReplaceGroup();
                            EquityTradingSessionBottomSheetKt.EquityTradingSessionBottomSheet(tradeSettingsStore42, id2, accountNumber2, (Function0) objRememberedValue13, modifierAutoLogEvents$default3, null, composer2, 6, 32);
                            composer2 = composer2;
                            Unit unit6 = Unit.INSTANCE;
                        }
                        composer2.endReplaceGroup();
                    }
                    composer2.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, BigDecimal it) {
            Intrinsics.checkNotNullParameter(it, "it");
            function1.invoke(it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(Function0 function0, RhModalBottomSheet5 rhModalBottomSheet5) {
            function0.invoke();
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(Function1 function1, TradeQuantity it) {
            Intrinsics.checkNotNullParameter(it, "it");
            function1.invoke(it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$12$lambda$9$lambda$8(Function2 function2, RhModalBottomSheet5 rhModalBottomSheet5, LadderScreenState.BottomSheet.NestedSettingsBottomSheet it) {
            Intrinsics.checkNotNullParameter(it, "it");
            function2.invoke(it, Boolean.FALSE);
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$12$lambda$7$lambda$6(Function0 function0, RhModalBottomSheet5 rhModalBottomSheet5) {
            function0.invoke();
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$12$lambda$11$lambda$10(RhModalBottomSheet5 rhModalBottomSheet5) {
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$14$lambda$13(Function0 function0, LayoutCoordinates it) {
            Intrinsics.checkNotNullParameter(it, "it");
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$16$lambda$15(Function2 function2, RhModalBottomSheet5 rhModalBottomSheet5) {
            function2.invoke(new LadderScreenState.SlideUp.IdentiAgreement(null, false, false, null, 9, null), Boolean.FALSE);
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$18$lambda$17(RhModalBottomSheet5 rhModalBottomSheet5) {
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$20$lambda$19(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function2 function2, RhModalBottomSheet5 rhModalBottomSheet5) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.CONTINUE_BUTTON, LadderBottomSheet.AUTO_SEND_RENEW_IDENTIFIER, null, 4, null), null, userInteractionEventDescriptor.getContext(), false, 41, null);
            function2.invoke(new LadderScreenState.SlideUp.IdentiAgreement(null, false, false, null, 9, null), Boolean.FALSE);
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$22$lambda$21(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, RhModalBottomSheet5 rhModalBottomSheet5) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.CANCEL_BUTTON, LadderBottomSheet.AUTO_SEND_RENEW_IDENTIFIER, null, 4, null), null, userInteractionEventDescriptor.getContext(), false, 41, null);
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$25$lambda$24$lambda$23(RhModalBottomSheet5 rhModalBottomSheet5) {
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$28$lambda$27$lambda$26(RhModalBottomSheet5 rhModalBottomSheet5) {
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }
    }
}
