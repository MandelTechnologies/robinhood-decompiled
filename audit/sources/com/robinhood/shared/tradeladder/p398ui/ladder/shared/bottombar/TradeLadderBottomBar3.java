package com.robinhood.shared.tradeladder.p398ui.ladder.shared.bottombar;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.Side;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.bottombar.TradeLadderBottomBar5;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.bottombar.TradeLadderBottomBarState;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.p399ui.LadderQuantitySelectorButton;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.LadderMarketOrderFormStyle;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.LadderStyle;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.LadderStyleKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.PreviewLadderBentoTheme2;
import com.robinhood.shared.trading.tradecomponentscompose.traderow.GenericTradeRow;
import com.robinhood.shared.trading.tradecomponentscompose.traderow.TradeButtonState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TradeLadderBottomBar.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aW\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a!\u0010\f\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u000e\u001a\u0017\u0010\u000f\u001a\u00020\u00012\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"TradeLadderBottomBar", "", "state", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarState;", "onBuyClick", "Lkotlin/Function0;", "onSellClick", "onOpenQuantitySelector", "onCloseQuantitySelector", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HelperText", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarState$HelperTextState;", "(Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarState$HelperTextState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewTradeLadderBottomBar", "parameters", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarPreviewParameterProvider$Parameters;", "(Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/TradeLadderBottomBarPreviewParameterProvider$Parameters;Landroidx/compose/runtime/Composer;I)V", "lib-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderBottomBarKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class TradeLadderBottomBar3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelperText$lambda$6(TradeLadderBottomBarState.HelperTextState helperTextState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HelperText(helperTextState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewTradeLadderBottomBar$lambda$7(TradeLadderBottomBar5.Parameters parameters, int i, Composer composer, int i2) {
        PreviewTradeLadderBottomBar(parameters, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradeLadderBottomBar$lambda$3(TradeLadderBottomBarState tradeLadderBottomBarState, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TradeLadderBottomBar(tradeLadderBottomBarState, function0, function02, function03, function04, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TradeLadderBottomBar(TradeLadderBottomBarState state, final Function0<Unit> onBuyClick, final Function0<Unit> onSellClick, Function0<Unit> onOpenQuantitySelector, Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        TradeLadderBottomBarState.LadderTradeButtonState buyButtonState;
        long jM26234getButtonNonLoadingBorderColor0d7_KjU;
        TradeLadderBottomBarState.LadderTradeButtonState sellButtonState;
        long jM26234getButtonNonLoadingBorderColor0d7_KjU2;
        final TradeLadderBottomBarState tradeLadderBottomBarState;
        final Function0<Unit> function02;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Function0<Unit> onCloseQuantitySelector = function0;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onBuyClick, "onBuyClick");
        Intrinsics.checkNotNullParameter(onSellClick, "onSellClick");
        Intrinsics.checkNotNullParameter(onOpenQuantitySelector, "onOpenQuantitySelector");
        Intrinsics.checkNotNullParameter(onCloseQuantitySelector, "onCloseQuantitySelector");
        Composer composerStartRestartGroup = composer.startRestartGroup(1197928517);
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
            i3 |= composerStartRestartGroup.changedInstance(onBuyClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSellClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOpenQuantitySelector) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCloseQuantitySelector) ? 16384 : 8192;
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
                    ComposerKt.traceEventStart(1197928517, i3, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderBottomBar (TradeLadderBottomBar.kt:52)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                HelperText(state.getHelperTextState(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composerStartRestartGroup, 48, 0);
                LadderMarketOrderFormStyle marketOrderForm = ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getMarketOrderForm();
                composerStartRestartGroup.startReplaceGroup(-1542663643);
                buyButtonState = state.getBuyButtonState();
                StringResource text = buyButtonState.getText();
                int i5 = StringResource.$stable;
                String string2 = StringResource2.getString(text, composerStartRestartGroup, i5);
                boolean enabled = buyButtonState.getEnabled();
                Side side = Side.START;
                long jM26238textColorXeAY9LY = marketOrderForm.m26238textColorXeAY9LY(enabled, side, buyButtonState.isSubmitButton());
                long jM26228backgroundColorXeAY9LY = marketOrderForm.m26228backgroundColorXeAY9LY(buyButtonState.getEnabled(), side, buyButtonState.isSubmitButton());
                if (!buyButtonState.isSubmitButton()) {
                    jM26234getButtonNonLoadingBorderColor0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
                } else {
                    jM26234getButtonNonLoadingBorderColor0d7_KjU = marketOrderForm.m26234getButtonNonLoadingBorderColor0d7_KjU();
                }
                Modifier modifier5 = modifier4;
                TradeButtonState tradeButtonState = new TradeButtonState(string2, jM26238textColorXeAY9LY, jM26234getButtonNonLoadingBorderColor0d7_KjU, jM26228backgroundColorXeAY9LY, buyButtonState.getLoading(), state.isQuantitySelectorOpen(), buyButtonState.getEnabled(), buyButtonState.getClickThrough(), onBuyClick, null);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1542628521);
                sellButtonState = state.getSellButtonState();
                String string3 = StringResource2.getString(sellButtonState.getText(), composerStartRestartGroup, i5);
                boolean enabled2 = sellButtonState.getEnabled();
                Side side2 = Side.END;
                long jM26238textColorXeAY9LY2 = marketOrderForm.m26238textColorXeAY9LY(enabled2, side2, sellButtonState.isSubmitButton());
                long jM26228backgroundColorXeAY9LY2 = marketOrderForm.m26228backgroundColorXeAY9LY(sellButtonState.getEnabled(), side2, sellButtonState.isSubmitButton());
                composerStartRestartGroup.startReplaceGroup(-1542609718);
                if (!sellButtonState.isSubmitButton()) {
                    jM26234getButtonNonLoadingBorderColor0d7_KjU2 = Color.INSTANCE.m6725getTransparent0d7_KjU();
                } else {
                    jM26234getButtonNonLoadingBorderColor0d7_KjU2 = ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getMarketOrderForm().m26234getButtonNonLoadingBorderColor0d7_KjU();
                }
                composerStartRestartGroup.endReplaceGroup();
                TradeButtonState tradeButtonState2 = new TradeButtonState(string3, jM26238textColorXeAY9LY2, jM26234getButtonNonLoadingBorderColor0d7_KjU2, jM26228backgroundColorXeAY9LY2, sellButtonState.getLoading(), state.isQuantitySelectorOpen(), sellButtonState.getEnabled(), sellButtonState.getClickThrough(), onSellClick, null);
                composerStartRestartGroup.endReplaceGroup();
                tradeLadderBottomBarState = state;
                function02 = onOpenQuantitySelector;
                onCloseQuantitySelector = function0;
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1225986803, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderBottomBarKt$TradeLadderBottomBar$1$3
                    public final void invoke(Row5 GenericTradeRow, Composer composer3, int i6) {
                        int i7;
                        Intrinsics.checkNotNullParameter(GenericTradeRow, "$this$GenericTradeRow");
                        if ((i6 & 6) == 0) {
                            i7 = i6 | (composer3.changed(GenericTradeRow) ? 4 : 2);
                        } else {
                            i7 = i6;
                        }
                        if ((i7 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1225986803, i7, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderBottomBar.<anonymous>.<anonymous> (TradeLadderBottomBar.kt:112)");
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierWeight$default = Row5.weight$default(GenericTradeRow, companion2, 1.0f, false, 2, null);
                        TradeLadderBottomBarState tradeLadderBottomBarState2 = tradeLadderBottomBarState;
                        Function0<Unit> function03 = onCloseQuantitySelector;
                        Function0<Unit> function04 = function02;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer3.startReplaceGroup(-2078216219);
                        TradeLadderBottomBarState.QuantityButtonState quantityButtonState = tradeLadderBottomBarState2.getQuantityButtonState();
                        String string4 = StringResource2.getString(quantityButtonState.getText(), composer3, StringResource.$stable);
                        boolean enabled3 = quantityButtonState.getEnabled();
                        boolean zIsQuantitySelectorOpen = tradeLadderBottomBarState2.isQuantitySelectorOpen();
                        if (!tradeLadderBottomBarState2.isQuantitySelectorOpen()) {
                            function03 = function04;
                        }
                        LadderQuantitySelectorButton.LadderQuantitySelectorButton(string4, enabled3, zIsQuantitySelectorOpen, function03, PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 2, null), composer3, 0, 0);
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                        invoke(row5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54);
                int i6 = TradeButtonState.$stable;
                composer2 = composerStartRestartGroup;
                GenericTradeRow.GenericTradeRow(tradeButtonState, tradeButtonState2, composableLambdaRememberComposableLambda, null, null, null, composer2, i6 | 384 | (i6 << 3), 56);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function02 = onOpenQuantitySelector;
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
                tradeLadderBottomBarState = state;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final TradeLadderBottomBarState tradeLadderBottomBarState2 = tradeLadderBottomBarState;
                final Function0<Unit> function03 = onCloseQuantitySelector;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderBottomBarKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TradeLadderBottomBar3.TradeLadderBottomBar$lambda$3(tradeLadderBottomBarState2, onBuyClick, onSellClick, function02, function03, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                HelperText(state.getHelperTextState(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composerStartRestartGroup, 48, 0);
                LadderMarketOrderFormStyle marketOrderForm2 = ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getMarketOrderForm();
                composerStartRestartGroup.startReplaceGroup(-1542663643);
                buyButtonState = state.getBuyButtonState();
                StringResource text2 = buyButtonState.getText();
                int i52 = StringResource.$stable;
                String string22 = StringResource2.getString(text2, composerStartRestartGroup, i52);
                boolean enabled3 = buyButtonState.getEnabled();
                Side side3 = Side.START;
                long jM26238textColorXeAY9LY3 = marketOrderForm2.m26238textColorXeAY9LY(enabled3, side3, buyButtonState.isSubmitButton());
                long jM26228backgroundColorXeAY9LY3 = marketOrderForm2.m26228backgroundColorXeAY9LY(buyButtonState.getEnabled(), side3, buyButtonState.isSubmitButton());
                if (!buyButtonState.isSubmitButton()) {
                }
                Modifier modifier52 = modifier4;
                TradeButtonState tradeButtonState3 = new TradeButtonState(string22, jM26238textColorXeAY9LY3, jM26234getButtonNonLoadingBorderColor0d7_KjU, jM26228backgroundColorXeAY9LY3, buyButtonState.getLoading(), state.isQuantitySelectorOpen(), buyButtonState.getEnabled(), buyButtonState.getClickThrough(), onBuyClick, null);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1542628521);
                sellButtonState = state.getSellButtonState();
                String string32 = StringResource2.getString(sellButtonState.getText(), composerStartRestartGroup, i52);
                boolean enabled22 = sellButtonState.getEnabled();
                Side side22 = Side.END;
                long jM26238textColorXeAY9LY22 = marketOrderForm2.m26238textColorXeAY9LY(enabled22, side22, sellButtonState.isSubmitButton());
                long jM26228backgroundColorXeAY9LY22 = marketOrderForm2.m26228backgroundColorXeAY9LY(sellButtonState.getEnabled(), side22, sellButtonState.isSubmitButton());
                composerStartRestartGroup.startReplaceGroup(-1542609718);
                if (!sellButtonState.isSubmitButton()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                TradeButtonState tradeButtonState22 = new TradeButtonState(string32, jM26238textColorXeAY9LY22, jM26234getButtonNonLoadingBorderColor0d7_KjU2, jM26228backgroundColorXeAY9LY22, sellButtonState.getLoading(), state.isQuantitySelectorOpen(), sellButtonState.getEnabled(), sellButtonState.getClickThrough(), onSellClick, null);
                composerStartRestartGroup.endReplaceGroup();
                tradeLadderBottomBarState = state;
                function02 = onOpenQuantitySelector;
                onCloseQuantitySelector = function0;
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1225986803, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderBottomBarKt$TradeLadderBottomBar$1$3
                    public final void invoke(Row5 GenericTradeRow, Composer composer3, int i62) {
                        int i7;
                        Intrinsics.checkNotNullParameter(GenericTradeRow, "$this$GenericTradeRow");
                        if ((i62 & 6) == 0) {
                            i7 = i62 | (composer3.changed(GenericTradeRow) ? 4 : 2);
                        } else {
                            i7 = i62;
                        }
                        if ((i7 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1225986803, i7, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderBottomBar.<anonymous>.<anonymous> (TradeLadderBottomBar.kt:112)");
                        }
                        Modifier.Companion companion22 = Modifier.INSTANCE;
                        Modifier modifierWeight$default = Row5.weight$default(GenericTradeRow, companion22, 1.0f, false, 2, null);
                        TradeLadderBottomBarState tradeLadderBottomBarState22 = tradeLadderBottomBarState;
                        Function0<Unit> function032 = onCloseQuantitySelector;
                        Function0<Unit> function04 = function02;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor22 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor22);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer3.startReplaceGroup(-2078216219);
                        TradeLadderBottomBarState.QuantityButtonState quantityButtonState = tradeLadderBottomBarState22.getQuantityButtonState();
                        String string4 = StringResource2.getString(quantityButtonState.getText(), composer3, StringResource.$stable);
                        boolean enabled32 = quantityButtonState.getEnabled();
                        boolean zIsQuantitySelectorOpen = tradeLadderBottomBarState22.isQuantitySelectorOpen();
                        if (!tradeLadderBottomBarState22.isQuantitySelectorOpen()) {
                            function032 = function04;
                        }
                        LadderQuantitySelectorButton.LadderQuantitySelectorButton(string4, enabled32, zIsQuantitySelectorOpen, function032, PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 2, null), composer3, 0, 0);
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                        invoke(row5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54);
                int i62 = TradeButtonState.$stable;
                composer2 = composerStartRestartGroup;
                GenericTradeRow.GenericTradeRow(tradeButtonState3, tradeButtonState22, composableLambdaRememberComposableLambda2, null, null, null, composer2, i62 | 384 | (i62 << 3), 56);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void HelperText(TradeLadderBottomBarState.HelperTextState helperTextState, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final TradeLadderBottomBarState.HelperTextState helperTextState2;
        Composer composerStartRestartGroup = composer.startRestartGroup(661548629);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(helperTextState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            helperTextState2 = helperTextState;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(661548629, i3, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.HelperText (TradeLadderBottomBar.kt:138)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderBottomBarKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TradeLadderBottomBar3.HelperText$lambda$5$lambda$4((AnimatedContentTransitionScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            helperTextState2 = helperTextState;
            AnimatedContentKt.AnimatedContent(helperTextState2, modifierFillMaxWidth$default, (Function1) objRememberedValue, center, null, null, TradeLadderBottomBar.INSTANCE.getLambda$1953132102$lib_trade_ladder_externalDebug(), composerStartRestartGroup, (i3 & 14) | 1576320, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderBottomBarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradeLadderBottomBar3.HelperText$lambda$6(helperTextState2, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform HelperText$lambda$5$lambda$4(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
    }

    /* compiled from: TradeLadderBottomBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderBottomBarKt$PreviewTradeLadderBottomBar$1 */
    static final class C409811 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ TradeLadderBottomBar5.Parameters $parameters;

        C409811(TradeLadderBottomBar5.Parameters parameters) {
            this.$parameters = parameters;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1089753278, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.PreviewTradeLadderBottomBar.<anonymous> (TradeLadderBottomBar.kt:307)");
            }
            TradeLadderBottomBarState tradeLadderBottomBarState = new TradeLadderBottomBarState(new TradeLadderBottomBarState.LadderTradeButtonState(this.$parameters.getBuyIsSubmitButton() ? StringResource.INSTANCE.invoke("Submit") : StringResource.INSTANCE.invoke("Buy MKT"), this.$parameters.getBuyEnabled(), false, this.$parameters.getBuyLoading(), this.$parameters.getBuyIsSubmitButton()), new TradeLadderBottomBarState.LadderTradeButtonState(this.$parameters.getSellIsSubmitButton() ? StringResource.INSTANCE.invoke("Submit") : StringResource.INSTANCE.invoke("Sell MKT"), this.$parameters.getSellEnabled(), false, this.$parameters.getSellLoading(), this.$parameters.getSellIsSubmitButton()), new TradeLadderBottomBarState.QuantityButtonState(StringResource.INSTANCE.invoke("0.001 qty"), true), this.$parameters.getHelperTextState(), this.$parameters.isQuantitySelectorOpen());
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderBottomBarKt$PreviewTradeLadderBottomBar$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderBottomBarKt$PreviewTradeLadderBottomBar$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderBottomBarKt$PreviewTradeLadderBottomBar$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function0 function03 = (Function0) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderBottomBarKt$PreviewTradeLadderBottomBar$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            TradeLadderBottomBar3.TradeLadderBottomBar(tradeLadderBottomBarState, function0, function02, function03, (Function0) objRememberedValue4, modifierM4872backgroundbw27NRU$default, composer, StringResource.$stable | 28080, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final void PreviewTradeLadderBottomBar(final TradeLadderBottomBar5.Parameters parameters, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Composer composerStartRestartGroup = composer.startRestartGroup(-668855713);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(parameters) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-668855713, i2, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.PreviewTradeLadderBottomBar (TradeLadderBottomBar.kt:305)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(false, ComposableLambda3.rememberComposableLambda(1089753278, true, new C409811(parameters), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderBottomBarKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradeLadderBottomBar3.PreviewTradeLadderBottomBar$lambda$7(parameters, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
