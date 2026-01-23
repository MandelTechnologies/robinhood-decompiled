package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.TradingButtonsRowKt;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.TradeRowState;
import com.robinhood.android.chart.blackwidowadvancedchart.models.BwTradeSide;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState4;
import com.robinhood.shared.trading.orderstate.Quantity;
import com.robinhood.shared.trading.tradecomponentscompose.traderow.GenericTradeRow;
import com.robinhood.shared.trading.tradecomponentscompose.traderow.TradeButton2;
import com.robinhood.shared.trading.tradecomponentscompose.traderow.TradeButtonState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TradingButtonsRow.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u001a}\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0015X\u008a\u008e\u0002"}, m3636d2 = {"TradingButtonsRow", "", "tradeRowState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/TradeRowState;", "instrumentTradeAmount", "Lcom/robinhood/shared/trading/orderstate/InstrumentTradeAmount;", "onEditNumberOfShares", "Lkotlin/Function0;", "onTrade", "Lkotlin/Function2;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/BwTradeSide;", "Lkotlin/coroutines/Continuation;", "", "onConfirmed", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/TradeRowState;Lcom/robinhood/shared/trading/orderstate/InstrumentTradeAmount;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BwEquityTradingRowPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-black-widow-advanced-chart_externalDebug", "animateBuyButton", "", "animateSellButton"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class TradingButtonsRowKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BwEquityTradingRowPreview$lambda$11(int i, Composer composer, int i2) {
        BwEquityTradingRowPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingButtonsRow$lambda$10(TradeRowState tradeRowState, InstrumentOrderState4 instrumentOrderState4, Function0 function0, Function2 function2, Function2 function22, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TradingButtonsRow(tradeRowState, instrumentOrderState4, function0, function2, function22, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TradingButtonsRow(final TradeRowState tradeRowState, final InstrumentOrderState4 instrumentTradeAmount, final Function0<Unit> onEditNumberOfShares, final Function2<? super BwTradeSide, ? super Continuation<? super Unit>, ? extends Object> onTrade, final Function2<? super BwTradeSide, ? super Continuation<? super Unit>, ? extends Object> onConfirmed, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Object objRememberedValue;
        Composer.Companion companion;
        int i5;
        long jM21456getPositive0d7_KjU;
        long jM6725getTransparent0d7_KjU;
        final HapticFeedback hapticFeedback;
        int i6;
        int i7;
        long jM21452getNegative0d7_KjU;
        long jM6725getTransparent0d7_KjU2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(tradeRowState, "tradeRowState");
        Intrinsics.checkNotNullParameter(instrumentTradeAmount, "instrumentTradeAmount");
        Intrinsics.checkNotNullParameter(onEditNumberOfShares, "onEditNumberOfShares");
        Intrinsics.checkNotNullParameter(onTrade, "onTrade");
        Intrinsics.checkNotNullParameter(onConfirmed, "onConfirmed");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1840596324);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(tradeRowState) : composerStartRestartGroup.changedInstance(tradeRowState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(instrumentTradeAmount) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onEditNumberOfShares) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTrade) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onConfirmed) ? 16384 : 8192;
        }
        int i8 = i2 & 32;
        if (i8 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i4 = i3;
            if ((74899 & i4) == 74898 || !composerStartRestartGroup.getSkipping()) {
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1840596324, i4, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.TradingButtonsRow (TradingButtonsRow.kt:47)");
                }
                HapticFeedback hapticFeedback2 = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                if (instrumentTradeAmount instanceof Quantity) {
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                StringResource buyButtonText = tradeRowState.getBuyButtonText();
                int i9 = StringResource.$stable;
                String string2 = StringResource2.getString(buyButtonText, composerStartRestartGroup, i9);
                if (tradeRowState.getBuyEnabled()) {
                    i5 = i9;
                    if (tradeRowState.getConfirmBuy()) {
                        composerStartRestartGroup.startReplaceGroup(713487998);
                        jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(713489700);
                        jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21456getPositive0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                } else {
                    composerStartRestartGroup.startReplaceGroup(713485631);
                    i5 = i9;
                    jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.startReplaceGroup(713491974);
                long jM6725getTransparent0d7_KjU3 = tradeRowState.getConfirmBuy() ? Color.INSTANCE.m6725getTransparent0d7_KjU() : BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
                if (!tradeRowState.getBuyEnabled()) {
                    composerStartRestartGroup.startReplaceGroup(713501022);
                    jM6725getTransparent0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (tradeRowState.getConfirmBuy()) {
                    composerStartRestartGroup.startReplaceGroup(713503364);
                    jM6725getTransparent0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21456getPositive0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(713504871);
                    composerStartRestartGroup.endReplaceGroup();
                    jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
                }
                boolean zTradingButtonsRow$lambda$1 = TradingButtonsRow$lambda$1(snapshotState);
                boolean hideBuySellButtons = tradeRowState.getHideBuySellButtons();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                int i10 = i4 & 14;
                boolean z = false;
                boolean zChangedInstance = (i10 == 4 || ((i4 & 8) != 0 && composerStartRestartGroup.changedInstance(tradeRowState))) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(hapticFeedback2) | composerStartRestartGroup.changedInstance(onConfirmed) | composerStartRestartGroup.changedInstance(onTrade);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                    hapticFeedback = hapticFeedback2;
                    i6 = -1224400529;
                    i7 = i5;
                    Function0 function0 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.TradingButtonsRowKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TradingButtonsRowKt.TradingButtonsRow$lambda$7$lambda$6(coroutineScope, hapticFeedback, tradeRowState, onConfirmed, onTrade, snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function0);
                    objRememberedValue4 = function0;
                } else {
                    i7 = i5;
                    hapticFeedback = hapticFeedback2;
                    i6 = -1224400529;
                }
                composerStartRestartGroup.endReplaceGroup();
                TradeButtonState tradeButtonState = new TradeButtonState(string2, jM21456getPositive0d7_KjU, jM6725getTransparent0d7_KjU3, jM6725getTransparent0d7_KjU, zTradingButtonsRow$lambda$1, hideBuySellButtons, true, false, (Function0) objRememberedValue4, null);
                String string3 = StringResource2.getString(tradeRowState.getSellButtonText(), composerStartRestartGroup, i7);
                if (!tradeRowState.getSellEnabled()) {
                    composerStartRestartGroup.startReplaceGroup(713539583);
                    jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (tradeRowState.getConfirmSell()) {
                    composerStartRestartGroup.startReplaceGroup(713541982);
                    jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(713543684);
                    jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21452getNegative0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                long j = jM21452getNegative0d7_KjU;
                composerStartRestartGroup.startReplaceGroup(713545959);
                long jM6725getTransparent0d7_KjU4 = tradeRowState.getConfirmSell() ? Color.INSTANCE.m6725getTransparent0d7_KjU() : BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
                if (!tradeRowState.getSellEnabled()) {
                    composerStartRestartGroup.startReplaceGroup(713555070);
                    jM6725getTransparent0d7_KjU2 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (tradeRowState.getConfirmSell()) {
                    composerStartRestartGroup.startReplaceGroup(713557444);
                    jM6725getTransparent0d7_KjU2 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21452getNegative0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(713558951);
                    composerStartRestartGroup.endReplaceGroup();
                    jM6725getTransparent0d7_KjU2 = Color.INSTANCE.m6725getTransparent0d7_KjU();
                }
                long j2 = jM6725getTransparent0d7_KjU2;
                boolean zTradingButtonsRow$lambda$4 = TradingButtonsRow$lambda$4(snapshotState2);
                boolean hideBuySellButtons2 = tradeRowState.getHideBuySellButtons();
                composerStartRestartGroup.startReplaceGroup(i6);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(hapticFeedback);
                if (i10 == 4 || ((i4 & 8) != 0 && composerStartRestartGroup.changedInstance(tradeRowState))) {
                    z = true;
                }
                boolean zChangedInstance3 = zChangedInstance2 | z | composerStartRestartGroup.changedInstance(onConfirmed) | composerStartRestartGroup.changedInstance(onTrade);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue5 == companion.getEmpty()) {
                    Function0 function02 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.TradingButtonsRowKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TradingButtonsRowKt.TradingButtonsRow$lambda$9$lambda$8(coroutineScope, hapticFeedback, tradeRowState, onConfirmed, onTrade, snapshotState2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function02);
                    objRememberedValue5 = function02;
                }
                composerStartRestartGroup.endReplaceGroup();
                TradeButtonState tradeButtonState2 = new TradeButtonState(string3, j, jM6725getTransparent0d7_KjU4, j2, zTradingButtonsRow$lambda$4, hideBuySellButtons2, true, false, (Function0) objRememberedValue5, null);
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1323458484, true, new C106833(tradeRowState, hapticFeedback, onEditNumberOfShares), composerStartRestartGroup, 54);
                int i11 = TradeButtonState.$stable;
                int i12 = (i11 << 3) | i11 | 384 | ((i4 >> 6) & 7168);
                composer2 = composerStartRestartGroup;
                Modifier modifier4 = modifier2;
                GenericTradeRow.GenericTradeRow(tradeButtonState, tradeButtonState2, composableLambdaRememberComposableLambda, modifier4, null, null, composer2, i12, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.TradingButtonsRowKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TradingButtonsRowKt.TradingButtonsRow$lambda$10(tradeRowState, instrumentTradeAmount, onEditNumberOfShares, onTrade, onConfirmed, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        i4 = i3;
        if ((74899 & i4) == 74898) {
            if (i8 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            HapticFeedback hapticFeedback22 = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
            if (instrumentTradeAmount instanceof Quantity) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TradingButtonsRow$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TradingButtonsRow$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: TradingButtonsRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.TradingButtonsRowKt$TradingButtonsRow$3 */
    static final class C106833 implements Function3<Row5, Composer, Integer, Unit> {
        final /* synthetic */ HapticFeedback $hapticFeedback;
        final /* synthetic */ Function0<Unit> $onEditNumberOfShares;
        final /* synthetic */ TradeRowState $tradeRowState;

        C106833(TradeRowState tradeRowState, HapticFeedback hapticFeedback, Function0<Unit> function0) {
            this.$tradeRowState = tradeRowState;
            this.$hapticFeedback = hapticFeedback;
            this.$onEditNumberOfShares = function0;
        }

        public final void invoke(Row5 GenericTradeRow, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(GenericTradeRow, "$this$GenericTradeRow");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(GenericTradeRow) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1323458484, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.TradingButtonsRow.<anonymous> (TradingButtonsRow.kt:124)");
            }
            Alignment center = Alignment.INSTANCE.getCenter();
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierClip = Clip.clip(BorderKt.m4876borderxT4_qwU(SizeKt.m5156height3ABfNKs(Row5.weight$default(GenericTradeRow, PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 0.0f, 2, null), 1.0f, false, 2, null), ((Styles) composer.consume(Styles2.getLocalStyles())).getButton(composer, 0).getSecondary().m21717getMinHeightD9Ej5fM()), C2002Dp.m7995constructorimpl((float) 0.5d), bentoTheme.getColors(composer, i3).m21427getFg30d7_KjU(), TradeButton2.getLadderButtonShape()), TradeButton2.getLadderButtonShape());
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(this.$tradeRowState) | composer.changedInstance(this.$hapticFeedback) | composer.changed(this.$onEditNumberOfShares);
            final TradeRowState tradeRowState = this.$tradeRowState;
            final HapticFeedback hapticFeedback = this.$hapticFeedback;
            final Function0<Unit> function0 = this.$onEditNumberOfShares;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.TradingButtonsRowKt$TradingButtonsRow$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TradingButtonsRowKt.C106833.invoke$lambda$1$lambda$0(tradeRowState, hapticFeedback, function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierClip, false, null, null, (Function0) objRememberedValue, 7, null);
            TradeRowState tradeRowState2 = this.$tradeRowState;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4893clickableXHw0xAI$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(StringResource2.getString(tradeRowState2.getTradeAmountString(), composer, StringResource.$stable), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 1, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 805330944, 0, 7662);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(TradeRowState tradeRowState, HapticFeedback hapticFeedback, Function0 function0) {
            if (tradeRowState.getSellEnabled() || tradeRowState.getBuyEnabled()) {
                hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingButtonsRow$lambda$7$lambda$6(CoroutineScope coroutineScope, HapticFeedback hapticFeedback, TradeRowState tradeRowState, Function2 function2, Function2 function22, SnapshotState snapshotState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new TradingButtonsRowKt$TradingButtonsRow$1$1$1(hapticFeedback, tradeRowState, function2, function22, snapshotState, null), 3, null);
        return Unit.INSTANCE;
    }

    private static final boolean TradingButtonsRow$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean TradingButtonsRow$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingButtonsRow$lambda$9$lambda$8(CoroutineScope coroutineScope, HapticFeedback hapticFeedback, TradeRowState tradeRowState, Function2 function2, Function2 function22, SnapshotState snapshotState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new TradingButtonsRowKt$TradingButtonsRow$2$1$1(hapticFeedback, tradeRowState, function2, function22, snapshotState, null), 3, null);
        return Unit.INSTANCE;
    }

    private static final void BwEquityTradingRowPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-204053270);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-204053270, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.BwEquityTradingRowPreview (TradingButtonsRow.kt:159)");
            }
            BentoTheme2.BentoTheme(Boolean.TRUE, null, null, null, null, null, null, null, ComposableSingletons$TradingButtonsRowKt.INSTANCE.m1753x59cdd967(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.TradingButtonsRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradingButtonsRowKt.BwEquityTradingRowPreview$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
