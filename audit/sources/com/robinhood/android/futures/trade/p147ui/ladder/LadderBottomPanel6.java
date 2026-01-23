package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.futures.analytics.LadderLoggingUtils;
import com.robinhood.android.futures.ladder.C17286R;
import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderViewState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.rosetta.eventlogging.FuturesOrderButtonContext;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LadderBottomPanel.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001aI\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001aq\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0017¨\u0006\u0019"}, m3636d2 = {"LadderBottomPanel", "", "bottomPanelData", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$BottomPanelData;", "onQuantitySelectorClicked", "Lkotlin/Function0;", "onMarketBuyClick", "onMarketSellClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$BottomPanelData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MarketOrderForm", "showMarketOrderBtns", "", "areMarketOrderBtnsEnabled", "quantity", "Ljava/math/BigDecimal;", "quantitySelectorOpen", "isBuyButtonLoading", "isSellButtonLoading", "onMoreClicked", "(ZZLjava/math/BigDecimal;ZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewMarketOrderForm_enabled", "(Landroidx/compose/runtime/Composer;I)V", "PreviewMarketOrderForm_disabledLoading", "feature-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.trade.ui.ladder.LadderBottomPanelKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class LadderBottomPanel6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderBottomPanel$lambda$0(FuturesLadderViewState.BottomPanelData bottomPanelData, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LadderBottomPanel(bottomPanelData, function0, function02, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarketOrderForm$lambda$5(boolean z, boolean z2, BigDecimal bigDecimal, boolean z3, boolean z4, boolean z5, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MarketOrderForm(z, z2, bigDecimal, z3, z4, z5, function0, function02, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
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

    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LadderBottomPanel(final FuturesLadderViewState.BottomPanelData bottomPanelData, final Function0<Unit> onQuantitySelectorClicked, final Function0<Unit> onMarketBuyClick, final Function0<Unit> onMarketSellClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(bottomPanelData, "bottomPanelData");
        Intrinsics.checkNotNullParameter(onQuantitySelectorClicked, "onQuantitySelectorClicked");
        Intrinsics.checkNotNullParameter(onMarketBuyClick, "onMarketBuyClick");
        Intrinsics.checkNotNullParameter(onMarketSellClick, "onMarketSellClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1862079484);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(bottomPanelData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onQuantitySelectorClicked) ? 32 : 16;
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
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1862079484, i3, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderBottomPanel (LadderBottomPanel.kt:45)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                MarketOrderForm(bottomPanelData.getShowMarketOrderBtns(), bottomPanelData.getAreMarketOrderBtnsEnabled(), bottomPanelData.getQuantityPanel().getQuantity(), bottomPanelData.getQuantityPanel().getQuantitySelectorOpen(), bottomPanelData.getShowLoadingOnMarketBuyButton(), bottomPanelData.getShowLoadingOnMarketSellButton(), onQuantitySelectorClicked, onMarketBuyClick, onMarketSellClick, PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, (i3 << 15) & 267911168, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderBottomPanelKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LadderBottomPanel6.LadderBottomPanel$lambda$0(bottomPanelData, onQuantitySelectorClicked, onMarketBuyClick, onMarketSellClick, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            MarketOrderForm(bottomPanelData.getShowMarketOrderBtns(), bottomPanelData.getAreMarketOrderBtnsEnabled(), bottomPanelData.getQuantityPanel().getQuantity(), bottomPanelData.getQuantityPanel().getQuantitySelectorOpen(), bottomPanelData.getShowLoadingOnMarketBuyButton(), bottomPanelData.getShowLoadingOnMarketSellButton(), onQuantitySelectorClicked, onMarketBuyClick, onMarketSellClick, PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default2, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), null, 2, null), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, (i3 << 15) & 267911168, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MarketOrderForm(final boolean z, final boolean z2, final BigDecimal bigDecimal, final boolean z3, final boolean z4, final boolean z5, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z6;
        Function0<Unit> function04;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i5;
        float f;
        int i6;
        float f2;
        Row6 row6;
        boolean z7;
        Object objRememberedValue;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int i7;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(348091949);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(bigDecimal) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    z6 = z4;
                    i3 |= composerStartRestartGroup.changed(z6) ? 16384 : 8192;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else {
                    if ((i & 196608) == 0) {
                        i3 |= composerStartRestartGroup.changed(z5) ? 131072 : 65536;
                    }
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
                    }
                    if ((i2 & 128) == 0) {
                        i3 |= 12582912;
                    } else {
                        if ((i & 12582912) == 0) {
                            function04 = function02;
                            i3 |= composerStartRestartGroup.changedInstance(function04) ? 8388608 : 4194304;
                        }
                        if ((i2 & 256) == 0) {
                            if ((i & 100663296) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(function03) ? 67108864 : 33554432;
                            }
                            i4 = i2 & 512;
                            if (i4 == 0) {
                                i3 |= 805306368;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                if ((i & 805306368) == 0) {
                                    i3 |= composerStartRestartGroup.changed(modifier2) ? 536870912 : 268435456;
                                }
                            }
                            if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(348091949, i3, -1, "com.robinhood.android.futures.trade.ui.ladder.MarketOrderForm (LadderBottomPanel.kt:75)");
                                }
                                float fM21717getMinHeightD9Ej5fM = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButton(composerStartRestartGroup, 0).getSecondary().m21717getMinHeightD9Ej5fM();
                                Alignment.Companion companion = Alignment.INSTANCE;
                                Alignment.Vertical centerVertically = companion.getCenterVertically();
                                int i8 = i3;
                                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), fM21717getMinHeightD9Ej5fM);
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs);
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
                                Modifier modifier5 = modifier4;
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Row6 row62 = Row6.INSTANCE;
                                if (z) {
                                    i5 = 57344;
                                    f = fM21717getMinHeightD9Ej5fM;
                                    i6 = i8;
                                    f2 = 0.0f;
                                    composerStartRestartGroup.startReplaceGroup(-535459237);
                                    row6 = row62;
                                    Spacer2.Spacer(Row5.weight$default(row62, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceGroup(-536352192);
                                    i5 = 57344;
                                    f = fM21717getMinHeightD9Ej5fM;
                                    f2 = 0.0f;
                                    i6 = i8;
                                    LadderButton.m14797LadderButtonOadGlvw(StringResources_androidKt.stringResource(C17286R.string.futures_market_buy_label, composerStartRestartGroup, 0), ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getMarketOrderForm().m14814buyTextColorvNxB06k(z2), z6, z2, function04, ModifiersKt.autoLogEvents$default(Row5.weight$default(row62, SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(0)), 1.0f, false, 2, null), LadderLoggingUtils.ladderMarketButtonDescriptor((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), FuturesOrderButtonContext.Side.BUY, z2), true, false, false, true, false, null, 108, null), composerStartRestartGroup, ((i8 >> 6) & 896) | ((i8 << 6) & 7168) | ((i8 >> 9) & 57344), 0);
                                    composerStartRestartGroup.endReplaceGroup();
                                    row6 = row62;
                                }
                                Alignment center = companion.getCenter();
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i9 = BentoTheme.$stable;
                                Modifier modifierClip = Clip.clip(BorderKt.m4876borderxT4_qwU(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM(), f2, 2, null), C2002Dp.m7995constructorimpl(90)), f), C2002Dp.m7995constructorimpl((float) 0.5d), ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getMarketOrderForm().m14817getButtonNonLoadingBorderColor0d7_KjU(), LadderButton.getLadderButtonShape()), LadderButton.getLadderButtonShape());
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                z7 = (3670016 & i6) != 1048576;
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!z7 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderBottomPanelKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return LadderBottomPanel6.MarketOrderForm$lambda$4$lambda$2$lambda$1(function0);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierClip, false, null, null, (Function0) objRememberedValue, 7, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
                                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.useNode();
                                } else {
                                    composerStartRestartGroup.createNode(constructor2);
                                }
                                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                if (z3) {
                                    i7 = 0;
                                    composerStartRestartGroup.startReplaceGroup(-1986353214);
                                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17286R.string.futures_order_quantity_label, new Object[]{Integer.valueOf(bigDecimal.intValue())}, composerStartRestartGroup, 0), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 1, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i9).getTextM(), composerStartRestartGroup, 805330944, 0, 7662);
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceGroup(-1986680357);
                                    i7 = 0;
                                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.CLOSE_24), StringResources_androidKt.stringResource(C17286R.string.futures_quantity_selector_close_btn, composerStartRestartGroup, 0), bentoTheme.getColors(composerStartRestartGroup, i9).m21425getFg0d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable, 56);
                                    composerStartRestartGroup.endReplaceGroup();
                                }
                                composerStartRestartGroup.endNode();
                                if (z) {
                                    composerStartRestartGroup.startReplaceGroup(-533197477);
                                    Spacer2.Spacer(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), composerStartRestartGroup, i7);
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceGroup(-534095237);
                                    LadderButton.m14797LadderButtonOadGlvw(StringResources_androidKt.stringResource(C17286R.string.futures_market_sell_label, composerStartRestartGroup, i7), ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getMarketOrderForm().m14818sellTextColorvNxB06k(z2), z5, z2, function03, ModifiersKt.autoLogEvents$default(Row5.weight$default(row6, SizeKt.m5174width3ABfNKs(companion3, C2002Dp.m7995constructorimpl(i7)), 1.0f, false, 2, null), LadderLoggingUtils.ladderMarketButtonDescriptor((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), FuturesOrderButtonContext.Side.SELL, z2), true, false, false, true, false, null, 108, null), composerStartRestartGroup, ((i6 >> 9) & 896) | ((i6 << 6) & 7168) | ((i6 >> 12) & i5), 0);
                                    composerStartRestartGroup.endReplaceGroup();
                                }
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier5;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderBottomPanelKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return LadderBottomPanel6.MarketOrderForm$lambda$5(z, z2, bigDecimal, z3, z4, z5, function0, function02, function03, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 100663296;
                        i4 = i2 & 512;
                        if (i4 == 0) {
                        }
                        if ((i3 & 306783379) == 306783378) {
                            if (i4 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            float fM21717getMinHeightD9Ej5fM2 = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButton(composerStartRestartGroup, 0).getSecondary().m21717getMinHeightD9Ej5fM();
                            Alignment.Companion companion4 = Alignment.INSTANCE;
                            Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                            int i82 = i3;
                            Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), fM21717getMinHeightD9Ej5fM2);
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs2);
                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Modifier modifier52 = modifier4;
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                                Row6 row622 = Row6.INSTANCE;
                                if (z) {
                                }
                                Alignment center2 = companion4.getCenter();
                                Modifier.Companion companion32 = Modifier.INSTANCE;
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i92 = BentoTheme.$stable;
                                Modifier modifierClip2 = Clip.clip(BorderKt.m4876borderxT4_qwU(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(PaddingKt.m5144paddingVpY3zN4$default(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i92).m21593getSmallD9Ej5fM(), f2, 2, null), C2002Dp.m7995constructorimpl(90)), f), C2002Dp.m7995constructorimpl((float) 0.5d), ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getMarketOrderForm().m14817getButtonNonLoadingBorderColor0d7_KjU(), LadderButton.getLadderButtonShape()), LadderButton.getLadderButtonShape());
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                if ((3670016 & i6) != 1048576) {
                                }
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!z7) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderBottomPanelKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return LadderBottomPanel6.MarketOrderForm$lambda$4$lambda$2$lambda$1(function0);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    composerStartRestartGroup.endReplaceGroup();
                                    Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifierClip2, false, null, null, (Function0) objRememberedValue, 7, null);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default2);
                                    Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl2.getInserting()) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                        if (z3) {
                                        }
                                        composerStartRestartGroup.endNode();
                                        if (z) {
                                        }
                                        composerStartRestartGroup.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        modifier3 = modifier52;
                                    }
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    function04 = function02;
                    if ((i2 & 256) == 0) {
                    }
                    i4 = i2 & 512;
                    if (i4 == 0) {
                    }
                    if ((i3 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                if ((i2 & 64) == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                function04 = function02;
                if ((i2 & 256) == 0) {
                }
                i4 = i2 & 512;
                if (i4 == 0) {
                }
                if ((i3 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z6 = z4;
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            function04 = function02;
            if ((i2 & 256) == 0) {
            }
            i4 = i2 & 512;
            if (i4 == 0) {
            }
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        z6 = z4;
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        function04 = function02;
        if ((i2 & 256) == 0) {
        }
        i4 = i2 & 512;
        if (i4 == 0) {
        }
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarketOrderForm$lambda$4$lambda$2$lambda$1(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void PreviewMarketOrderForm_enabled(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(121895253);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(121895253, i, -1, "com.robinhood.android.futures.trade.ui.ladder.PreviewMarketOrderForm_enabled (LadderBottomPanel.kt:165)");
            }
            PreviewLadderBentoTheme.PreviewLadderBentoTheme(true, LadderBottomPanel.INSTANCE.m14763getLambda$1598380876$feature_futures_trade_externalDebug(), composerStartRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderBottomPanelKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderBottomPanel6.PreviewMarketOrderForm_enabled$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewMarketOrderForm_disabledLoading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(631286388);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(631286388, i, -1, "com.robinhood.android.futures.trade.ui.ladder.PreviewMarketOrderForm_disabledLoading (LadderBottomPanel.kt:189)");
            }
            PreviewLadderBentoTheme.PreviewLadderBentoTheme(false, LadderBottomPanel.INSTANCE.m14762getLambda$1532918061$feature_futures_trade_externalDebug(), composerStartRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderBottomPanelKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderBottomPanel6.PreviewMarketOrderForm_disabledLoading$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
