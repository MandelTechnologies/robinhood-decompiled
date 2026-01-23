package com.robinhood.android.equitytradeladder.bottombar;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.equities.equitytrade.EquityTradeButtonState;
import com.robinhood.android.equitytradeladder.EquityTradeLadderViewState;
import com.robinhood.android.equitytradeladder.trade.NbboAlertBuilder4;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.nbbo.models.p359db.NbboSummary;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.EquityOrderContext;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.LadderMarketOrderFormStyle;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.LadderStyle;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.LadderStyleKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.PreviewLadderBentoTheme2;
import com.robinhood.shared.trading.tradecomponentscompose.traderow.GenericTradeRow;
import com.robinhood.shared.trading.tradecomponentscompose.traderow.TradeButtonState;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rosetta.order.OrderType;
import rosetta.order.Side;

/* compiled from: EquityTradeLadderBottomBar.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u001aW\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001aW\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u0010\u001a7\u0010\u0011\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0018\"\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"EquityTradeLadderBottomBar", "", "state", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$BottomBarData;", "onQuantitySelectorClick", "Lkotlin/Function0;", "onMarketBuyClick", "onMarketSellClick", "onNbboRefreshClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$BottomBarData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", EquityTradeLadderBottomBarKt.EQUITIES_LADDER_MARKET_ORDER_BUTTON_IDENTIFIER, "", "MarketOrderBottomBar", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$BottomBarData$MarketOrderData;", "(Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$BottomBarData$MarketOrderData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "NbboBottomBar", "nbboSummary", "Lcom/robinhood/nbbo/models/db/NbboSummary;", "nbboLoading", "", "(Lcom/robinhood/nbbo/models/db/NbboSummary;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewMarketOrderForm_enabled", "(Landroidx/compose/runtime/Composer;I)V", "PreviewMarketOrderForm_disabledLoading", "PreviewMarketOrderBuyFormWithNbbo", "PreviewMarketOrderSellFormWithNbbo", "PreviewNbboSummary", "feature-equity-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EquityTradeLadderBottomBarKt {
    private static final String EQUITIES_LADDER_MARKET_ORDER_BUTTON_IDENTIFIER = "EQUITIES_LADDER_MARKET_ORDER_BUTTON_IDENTIFIER";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTradeLadderBottomBar$lambda$0(EquityTradeLadderViewState.BottomBarData bottomBarData, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EquityTradeLadderBottomBar(bottomBarData, function0, function02, function03, function04, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarketOrderBottomBar$lambda$2(EquityTradeLadderViewState.BottomBarData.MarketOrderData marketOrderData, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MarketOrderBottomBar(marketOrderData, function0, function02, function03, function04, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NbboBottomBar$lambda$5(NbboSummary nbboSummary, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        NbboBottomBar(nbboSummary, z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewMarketOrderBuyFormWithNbbo$lambda$8(int i, Composer composer, int i2) {
        PreviewMarketOrderBuyFormWithNbbo(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewMarketOrderForm_disabledLoading$lambda$7(int i, Composer composer, int i2) {
        PreviewMarketOrderForm_disabledLoading(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewMarketOrderForm_enabled$lambda$6(int i, Composer composer, int i2) {
        PreviewMarketOrderForm_enabled(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewMarketOrderSellFormWithNbbo$lambda$9(int i, Composer composer, int i2) {
        PreviewMarketOrderSellFormWithNbbo(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewNbboSummary$lambda$10(int i, Composer composer, int i2) {
        PreviewNbboSummary(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EquityTradeLadderBottomBar(final EquityTradeLadderViewState.BottomBarData state, final Function0<Unit> onQuantitySelectorClick, final Function0<Unit> onMarketBuyClick, final Function0<Unit> onMarketSellClick, final Function0<Unit> onNbboRefreshClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onQuantitySelectorClick, "onQuantitySelectorClick");
        Intrinsics.checkNotNullParameter(onMarketBuyClick, "onMarketBuyClick");
        Intrinsics.checkNotNullParameter(onMarketSellClick, "onMarketSellClick");
        Intrinsics.checkNotNullParameter(onNbboRefreshClick, "onNbboRefreshClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1611627202);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onQuantitySelectorClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onMarketBuyClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onMarketSellClick) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onNbboRefreshClick) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1611627202, i3, -1, "com.robinhood.android.equitytradeladder.bottombar.EquityTradeLadderBottomBar (EquityTradeLadderBottomBar.kt:65)");
                }
                if (!(state instanceof EquityTradeLadderViewState.BottomBarData.MarketOrderData)) {
                    composerStartRestartGroup.startReplaceGroup(1453807357);
                    MarketOrderBottomBar((EquityTradeLadderViewState.BottomBarData.MarketOrderData) state, onQuantitySelectorClick, onMarketBuyClick, onMarketSellClick, onNbboRefreshClick, modifier4, composerStartRestartGroup, i3 & 524272, 0);
                    modifier3 = modifier4;
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    modifier3 = modifier4;
                    if (!(state instanceof EquityTradeLadderViewState.BottomBarData.NbboData)) {
                        composerStartRestartGroup.startReplaceGroup(1709462647);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(1454225392);
                    EquityTradeLadderViewState.BottomBarData.NbboData nbboData = (EquityTradeLadderViewState.BottomBarData.NbboData) state;
                    NbboBottomBar(nbboData.getNbboSummary(), nbboData.getNbboLoading(), onNbboRefreshClick, modifier3, composerStartRestartGroup, (i3 >> 6) & 8064, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.bottombar.EquityTradeLadderBottomBarKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EquityTradeLadderBottomBarKt.EquityTradeLadderBottomBar$lambda$0(state, onQuantitySelectorClick, onMarketBuyClick, onMarketSellClick, onNbboRefreshClick, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!(state instanceof EquityTradeLadderViewState.BottomBarData.MarketOrderData)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void MarketOrderBottomBar(final EquityTradeLadderViewState.BottomBarData.MarketOrderData marketOrderData, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final Function0<Unit> function04, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function05;
        Function0<Unit> function06;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        float f;
        Modifier.Companion companion;
        final Modifier modifier3;
        Context context;
        Context contextCopy$default;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-286922747);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(marketOrderData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function05 = function03;
                    i3 |= composerStartRestartGroup.changedInstance(function05) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                    function06 = function04;
                } else {
                    function06 = function04;
                    if ((i & 24576) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function06) ? 16384 : 8192;
                    }
                }
                i4 = i2 & 32;
                if (i4 == 0) {
                    if ((196608 & i) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-286922747, i3, -1, "com.robinhood.android.equitytradeladder.bottombar.MarketOrderBottomBar (EquityTradeLadderBottomBar.kt:99)");
                        }
                        boolean z = !marketOrderData.getShowLoadingOnMarketBuyButton() || marketOrderData.getShowLoadingOnMarketSellButton();
                        float fM21717getMinHeightD9Ej5fM = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButton(composerStartRestartGroup, 0).getSecondary().m21717getMinHeightD9Ej5fM();
                        EquityTradeButtonState buyButtonState = marketOrderData.getBuyButtonState();
                        EquityTradeButtonState sellButtonState = marketOrderData.getSellButtonState();
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        int i5 = i3;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(1094680195);
                        if (marketOrderData.getShowNbbo()) {
                            f = fM21717getMinHeightD9Ej5fM;
                            companion = companion2;
                        } else {
                            f = fM21717getMinHeightD9Ej5fM;
                            companion = companion2;
                            NbboBottomBar(marketOrderData.getNbboSummary(), marketOrderData.getNbboLoading(), function06, modifier4, composerStartRestartGroup, (i5 >> 6) & 8064, 0);
                        }
                        modifier3 = modifier4;
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM());
                        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        Context context2 = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getContext();
                        Context contextCopy$default2 = context2 == null ? Context.copy$default(context2, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new EquityOrderContext(null, null, Side.BUY, OrderType.MARKET, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048563, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -536870913, -1, -1, -1, 16383, null) : null;
                        Component.ComponentType componentType = Component.ComponentType.BUTTON;
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, contextCopy$default2, new Component(componentType, EQUITIES_LADDER_MARKET_ORDER_BUTTON_IDENTIFIER, null, 4, null), null, 39, null), true, false, false, true, false, null, 108, null);
                        Modifier.Companion companion4 = companion;
                        StringResource text = buyButtonState.getText();
                        int i7 = StringResource.$stable;
                        String textAsString = StringResources6.getTextAsString(text, composerStartRestartGroup, i7);
                        LadderMarketOrderFormStyle marketOrderForm = ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getMarketOrderForm();
                        boolean enabled = buyButtonState.getEnabled();
                        com.robinhood.shared.tradeladder.p398ui.ladder.models.Side side = com.robinhood.shared.tradeladder.p398ui.ladder.models.Side.START;
                        long jM26238textColorXeAY9LY = marketOrderForm.m26238textColorXeAY9LY(enabled, side, buyButtonState.getConfirm());
                        long jM26228backgroundColorXeAY9LY = ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getMarketOrderForm().m26228backgroundColorXeAY9LY(buyButtonState.getEnabled(), side, buyButtonState.getConfirm());
                        composerStartRestartGroup.startReplaceGroup(1094741122);
                        long jM6725getTransparent0d7_KjU = !buyButtonState.getConfirm() ? Color.INSTANCE.m6725getTransparent0d7_KjU() : ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getMarketOrderForm().m26234getButtonNonLoadingBorderColor0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                        TradeButtonState tradeButtonState = new TradeButtonState(textAsString, jM26238textColorXeAY9LY, jM6725getTransparent0d7_KjU, jM26228backgroundColorXeAY9LY, marketOrderData.getShowLoadingOnMarketBuyButton(), buyButtonState.getHide(), buyButtonState.getEnabled(), buyButtonState.getClickThrough(), function02, null);
                        UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        context = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getContext();
                        if (context == null) {
                            contextCopy$default = Context.copy$default(context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new EquityOrderContext(null, null, marketOrderData.isShorting() ? Side.SELL_SHORT : Side.SELL, OrderType.MARKET, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048563, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -536870913, -1, -1, -1, 16383, null);
                        } else {
                            contextCopy$default = null;
                        }
                        Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(companion4, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, null, contextCopy$default, new Component(componentType, EQUITIES_LADDER_MARKET_ORDER_BUTTON_IDENTIFIER, null, 4, null), null, 39, null), true, false, false, true, false, null, 108, null);
                        String textAsString2 = StringResources6.getTextAsString(sellButtonState.getText(), composerStartRestartGroup, i7);
                        LadderMarketOrderFormStyle marketOrderForm2 = ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getMarketOrderForm();
                        boolean enabled2 = sellButtonState.getEnabled();
                        com.robinhood.shared.tradeladder.p398ui.ladder.models.Side side2 = com.robinhood.shared.tradeladder.p398ui.ladder.models.Side.END;
                        long jM26238textColorXeAY9LY2 = marketOrderForm2.m26238textColorXeAY9LY(enabled2, side2, sellButtonState.getConfirm());
                        long jM26228backgroundColorXeAY9LY2 = ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getMarketOrderForm().m26228backgroundColorXeAY9LY(sellButtonState.getEnabled(), side2, sellButtonState.getConfirm());
                        composerStartRestartGroup.startReplaceGroup(1094874595);
                        long jM6725getTransparent0d7_KjU2 = !sellButtonState.getConfirm() ? Color.INSTANCE.m6725getTransparent0d7_KjU() : ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getMarketOrderForm().m26234getButtonNonLoadingBorderColor0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                        TradeButtonState tradeButtonState2 = new TradeButtonState(textAsString2, jM26238textColorXeAY9LY2, jM6725getTransparent0d7_KjU2, jM26228backgroundColorXeAY9LY2, marketOrderData.getShowLoadingOnMarketSellButton(), sellButtonState.getHide(), sellButtonState.getEnabled(), sellButtonState.getClickThrough(), function05, null);
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-276548813, true, new EquityTradeLadderBottomBarKt$MarketOrderBottomBar$1$1(f, z, function0, marketOrderData), composerStartRestartGroup, 54);
                        int i8 = TradeButtonState.$stable;
                        GenericTradeRow.GenericTradeRow(tradeButtonState, tradeButtonState2, composableLambdaRememberComposableLambda, modifierM5142padding3ABfNKs, modifierAutoLogEvents$default, modifierAutoLogEvents$default2, composerStartRestartGroup, i8 | 384 | (i8 << 3), 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.bottombar.EquityTradeLadderBottomBarKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return EquityTradeLadderBottomBarKt.MarketOrderBottomBar$lambda$2(marketOrderData, function0, function02, function03, function04, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                modifier2 = modifier;
                if ((74899 & i3) == 74898) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (marketOrderData.getShowLoadingOnMarketBuyButton()) {
                        float fM21717getMinHeightD9Ej5fM2 = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButton(composerStartRestartGroup, 0).getSecondary().m21717getMinHeightD9Ej5fM();
                        EquityTradeButtonState buyButtonState2 = marketOrderData.getBuyButtonState();
                        EquityTradeButtonState sellButtonState2 = marketOrderData.getSellButtonState();
                        Modifier.Companion companion22 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion22);
                        ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                        int i52 = i3;
                        Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                            Column6 column62 = Column6.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(1094680195);
                            if (marketOrderData.getShowNbbo()) {
                            }
                            modifier3 = modifier4;
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i62 = BentoTheme.$stable;
                            Modifier modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default2, bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), null, 2, null), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM());
                            UserInteractionEventDescriptor userInteractionEventDescriptor3 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                            Context context22 = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getContext();
                            if (context22 == null) {
                            }
                            Component.ComponentType componentType2 = Component.ComponentType.BUTTON;
                            Modifier modifierAutoLogEvents$default3 = ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor3, null, null, null, contextCopy$default2, new Component(componentType2, EQUITIES_LADDER_MARKET_ORDER_BUTTON_IDENTIFIER, null, 4, null), null, 39, null), true, false, false, true, false, null, 108, null);
                            Modifier.Companion companion42 = companion;
                            StringResource text2 = buyButtonState2.getText();
                            int i72 = StringResource.$stable;
                            String textAsString3 = StringResources6.getTextAsString(text2, composerStartRestartGroup, i72);
                            LadderMarketOrderFormStyle marketOrderForm3 = ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getMarketOrderForm();
                            boolean enabled3 = buyButtonState2.getEnabled();
                            com.robinhood.shared.tradeladder.p398ui.ladder.models.Side side3 = com.robinhood.shared.tradeladder.p398ui.ladder.models.Side.START;
                            long jM26238textColorXeAY9LY3 = marketOrderForm3.m26238textColorXeAY9LY(enabled3, side3, buyButtonState2.getConfirm());
                            long jM26228backgroundColorXeAY9LY3 = ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getMarketOrderForm().m26228backgroundColorXeAY9LY(buyButtonState2.getEnabled(), side3, buyButtonState2.getConfirm());
                            composerStartRestartGroup.startReplaceGroup(1094741122);
                            if (!buyButtonState2.getConfirm()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            TradeButtonState tradeButtonState3 = new TradeButtonState(textAsString3, jM26238textColorXeAY9LY3, jM6725getTransparent0d7_KjU, jM26228backgroundColorXeAY9LY3, marketOrderData.getShowLoadingOnMarketBuyButton(), buyButtonState2.getHide(), buyButtonState2.getEnabled(), buyButtonState2.getClickThrough(), function02, null);
                            UserInteractionEventDescriptor userInteractionEventDescriptor22 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                            context = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getContext();
                            if (context == null) {
                            }
                            Modifier modifierAutoLogEvents$default22 = ModifiersKt.autoLogEvents$default(companion42, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor22, null, null, null, contextCopy$default, new Component(componentType2, EQUITIES_LADDER_MARKET_ORDER_BUTTON_IDENTIFIER, null, 4, null), null, 39, null), true, false, false, true, false, null, 108, null);
                            String textAsString22 = StringResources6.getTextAsString(sellButtonState2.getText(), composerStartRestartGroup, i72);
                            LadderMarketOrderFormStyle marketOrderForm22 = ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getMarketOrderForm();
                            boolean enabled22 = sellButtonState2.getEnabled();
                            com.robinhood.shared.tradeladder.p398ui.ladder.models.Side side22 = com.robinhood.shared.tradeladder.p398ui.ladder.models.Side.END;
                            long jM26238textColorXeAY9LY22 = marketOrderForm22.m26238textColorXeAY9LY(enabled22, side22, sellButtonState2.getConfirm());
                            long jM26228backgroundColorXeAY9LY22 = ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getMarketOrderForm().m26228backgroundColorXeAY9LY(sellButtonState2.getEnabled(), side22, sellButtonState2.getConfirm());
                            composerStartRestartGroup.startReplaceGroup(1094874595);
                            if (!sellButtonState2.getConfirm()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            TradeButtonState tradeButtonState22 = new TradeButtonState(textAsString22, jM26238textColorXeAY9LY22, jM6725getTransparent0d7_KjU2, jM26228backgroundColorXeAY9LY22, marketOrderData.getShowLoadingOnMarketSellButton(), sellButtonState2.getHide(), sellButtonState2.getEnabled(), sellButtonState2.getClickThrough(), function05, null);
                            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-276548813, true, new EquityTradeLadderBottomBarKt$MarketOrderBottomBar$1$1(f, z, function0, marketOrderData), composerStartRestartGroup, 54);
                            int i82 = TradeButtonState.$stable;
                            GenericTradeRow.GenericTradeRow(tradeButtonState3, tradeButtonState22, composableLambdaRememberComposableLambda2, modifierM5142padding3ABfNKs2, modifierAutoLogEvents$default3, modifierAutoLogEvents$default22, composerStartRestartGroup, i82 | 384 | (i82 << 3), 0);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function05 = function03;
            if ((i2 & 16) != 0) {
            }
            i4 = i2 & 32;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 8) == 0) {
        }
        function05 = function03;
        if ((i2 & 16) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void NbboBottomBar(final NbboSummary nbboSummary, final boolean z, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1655417425);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(nbboSummary) ? 4 : 2) | i;
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
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1655417425, i3, -1, "com.robinhood.android.equitytradeladder.bottombar.NbboBottomBar (EquityTradeLadderBottomBar.kt:255)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 7, null), bentoTheme.getColors(composerStartRestartGroup, i5).m21372getBg20d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                Modifier modifier5 = modifier4;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(modifier5, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null), 0.0f, composerStartRestartGroup, 0, 1);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getCenter(), companion2.getCenterVertically(), composerStartRestartGroup, 54);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                int i6 = i3 & 14;
                int i7 = i3 >> 3;
                BentoText2.m20748BentoTextQnj7Zds(NbboAlertBuilder4.nbboAlertContent(nbboSummary, function0, composerStartRestartGroup, i6 | (i7 & 112)), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, NbboAlertBuilder4.nbboInlineContent(z, composerStartRestartGroup, i7 & 14), null, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 6074);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.bottombar.EquityTradeLadderBottomBarKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EquityTradeLadderBottomBarKt.NbboBottomBar$lambda$5(nbboSummary, z, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion22 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion4);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 7, null), bentoTheme2.getColors(composerStartRestartGroup, i52).m21372getBg20d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                Modifier modifier52 = modifier4;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(modifier52, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null), 0.0f, composerStartRestartGroup, 0, 1);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getCenter(), companion22.getCenterVertically(), composerStartRestartGroup, 54);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    int i62 = i3 & 14;
                    int i72 = i3 >> 3;
                    BentoText2.m20748BentoTextQnj7Zds(NbboAlertBuilder4.nbboAlertContent(nbboSummary, function0, composerStartRestartGroup, i62 | (i72 & 112)), null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, NbboAlertBuilder4.nbboInlineContent(z, composerStartRestartGroup, i72 & 14), null, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 0, 0, 6074);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void PreviewMarketOrderForm_enabled(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1032585900);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1032585900, i, -1, "com.robinhood.android.equitytradeladder.bottombar.PreviewMarketOrderForm_enabled (EquityTradeLadderBottomBar.kt:287)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(true, ComposableSingletons$EquityTradeLadderBottomBarKt.INSTANCE.m14045getLambda$1346829227$feature_equity_trade_ladder_externalDebug(), composerStartRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.bottombar.EquityTradeLadderBottomBarKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityTradeLadderBottomBarKt.PreviewMarketOrderForm_enabled$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewMarketOrderForm_disabledLoading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1948625259);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1948625259, i, -1, "com.robinhood.android.equitytradeladder.bottombar.PreviewMarketOrderForm_disabledLoading (EquityTradeLadderBottomBar.kt:330)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(false, ComposableSingletons$EquityTradeLadderBottomBarKt.INSTANCE.m14048getLambda$680735594$feature_equity_trade_ladder_externalDebug(), composerStartRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.bottombar.EquityTradeLadderBottomBarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityTradeLadderBottomBarKt.PreviewMarketOrderForm_disabledLoading$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewMarketOrderBuyFormWithNbbo(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-415131655);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-415131655, i, -1, "com.robinhood.android.equitytradeladder.bottombar.PreviewMarketOrderBuyFormWithNbbo (EquityTradeLadderBottomBar.kt:381)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(true, ComposableSingletons$EquityTradeLadderBottomBarKt.INSTANCE.getLambda$990618968$feature_equity_trade_ladder_externalDebug(), composerStartRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.bottombar.EquityTradeLadderBottomBarKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityTradeLadderBottomBarKt.PreviewMarketOrderBuyFormWithNbbo$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewMarketOrderSellFormWithNbbo(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(971290877);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(971290877, i, -1, "com.robinhood.android.equitytradeladder.bottombar.PreviewMarketOrderSellFormWithNbbo (EquityTradeLadderBottomBar.kt:454)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(true, ComposableSingletons$EquityTradeLadderBottomBarKt.INSTANCE.getLambda$1599887230$feature_equity_trade_ladder_externalDebug(), composerStartRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.bottombar.EquityTradeLadderBottomBarKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityTradeLadderBottomBarKt.PreviewMarketOrderSellFormWithNbbo$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewNbboSummary(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1262757977);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1262757977, i, -1, "com.robinhood.android.equitytradeladder.bottombar.PreviewNbboSummary (EquityTradeLadderBottomBar.kt:524)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(true, ComposableSingletons$EquityTradeLadderBottomBarKt.INSTANCE.getLambda$1243256872$feature_equity_trade_ladder_externalDebug(), composerStartRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.bottombar.EquityTradeLadderBottomBarKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityTradeLadderBottomBarKt.PreviewNbboSummary$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
