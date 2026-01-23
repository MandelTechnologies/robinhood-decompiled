package com.robinhood.android.equitytradeladder.topbar;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.equitytradeladder.EquityTradeLadderViewState;
import com.robinhood.android.equitytradeladder.topbar.EquityTradeLadderTopBar3;
import com.robinhood.android.equitytradeladder.trade.NbboAlertBuilder4;
import com.robinhood.android.linking.LinkingGroupColors2;
import com.robinhood.android.linking.MobileLinkingColorComposable3;
import com.robinhood.android.linking.MobileLinkingData;
import com.robinhood.shared.tradeladder.p398ui.ladder.GenericLadderTopBarKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.PreviewLadderBentoTheme2;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.topbar.ActionsContent;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.topbar.DayPnlInfo;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.topbar.DetailContent6;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.topbar.FlattenAlertContent;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.topbar.NavigationContent3;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.topbar.TitleContent;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.topbar.TitleContentState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EquityTradeLadderTopBar.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u009b\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"EquityTradeLadderTopBar", "", "topBarData", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$TopBarData;", "onNbboRefreshClick", "Lkotlin/Function0;", "onNavigationClicked", "onSettingsClicked", "onFlattenClicked", "onPnlClick", "onOpenOrdersClicked", "showNextPostTradeFtuxTooltipState", "dismissFtuxTooltip", "modifier", "Landroidx/compose/ui/Modifier;", "mobileLinkingData", "Lcom/robinhood/android/linking/MobileLinkingData;", "(Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$TopBarData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/linking/MobileLinkingData;Landroidx/compose/runtime/Composer;III)V", "PreviewLadderTopBar", "(Landroidx/compose/runtime/Composer;I)V", "feature-equity-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitytradeladder.topbar.EquityTradeLadderTopBarKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityTradeLadderTopBar3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTradeLadderTopBar$lambda$0(EquityTradeLadderViewState.TopBarData topBarData, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, Function0 function08, Modifier modifier, MobileLinkingData mobileLinkingData, int i, int i2, int i3, Composer composer, int i4) {
        EquityTradeLadderTopBar(topBarData, function0, function02, function03, function04, function05, function06, function07, function08, modifier, mobileLinkingData, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLadderTopBar$lambda$1(int i, Composer composer, int i2) {
        PreviewLadderTopBar(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EquityTradeLadderTopBar(final EquityTradeLadderViewState.TopBarData topBarData, final Function0<Unit> onNbboRefreshClick, final Function0<Unit> onNavigationClicked, final Function0<Unit> onSettingsClicked, final Function0<Unit> onFlattenClicked, final Function0<Unit> onPnlClick, final Function0<Unit> onOpenOrdersClicked, final Function0<Unit> showNextPostTradeFtuxTooltipState, final Function0<Unit> dismissFtuxTooltip, Modifier modifier, MobileLinkingData mobileLinkingData, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        Composer composer2;
        final MobileLinkingData mobileLinkingData2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(topBarData, "topBarData");
        Intrinsics.checkNotNullParameter(onNbboRefreshClick, "onNbboRefreshClick");
        Intrinsics.checkNotNullParameter(onNavigationClicked, "onNavigationClicked");
        Intrinsics.checkNotNullParameter(onSettingsClicked, "onSettingsClicked");
        Intrinsics.checkNotNullParameter(onFlattenClicked, "onFlattenClicked");
        Intrinsics.checkNotNullParameter(onPnlClick, "onPnlClick");
        Intrinsics.checkNotNullParameter(onOpenOrdersClicked, "onOpenOrdersClicked");
        Intrinsics.checkNotNullParameter(showNextPostTradeFtuxTooltipState, "showNextPostTradeFtuxTooltipState");
        Intrinsics.checkNotNullParameter(dismissFtuxTooltip, "dismissFtuxTooltip");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1270257756);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(topBarData) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onNbboRefreshClick) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onNavigationClicked) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onSettingsClicked) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onFlattenClicked) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onPnlClick) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onOpenOrdersClicked) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(showNextPostTradeFtuxTooltipState) ? 8388608 : 4194304;
        }
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(dismissFtuxTooltip) ? 67108864 : 33554432;
        }
        int i7 = i3 & 512;
        if (i7 != 0) {
            i4 |= 805306368;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 805306368) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier2) ? 536870912 : 268435456;
            }
        }
        int i8 = i3 & 1024;
        if (i8 != 0) {
            i6 = i2 | 6;
        } else {
            if ((i2 & 6) != 0) {
                i5 = i2;
                if ((i4 & 306783379) == 306783378 || (i5 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    MobileLinkingData mobileLinkingData3 = i8 == 0 ? null : mobileLinkingData;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1270257756, i4, i5, "com.robinhood.android.equitytradeladder.topbar.EquityTradeLadderTopBar (EquityTradeLadderTopBar.kt:40)");
                    }
                    composer2 = composerStartRestartGroup;
                    GenericLadderTopBarKt.GenericLadderTopBar(ComposableLambda3.rememberComposableLambda(-1196890064, true, new C160131(onNavigationClicked, mobileLinkingData3), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(148864143, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitytradeladder.topbar.EquityTradeLadderTopBarKt.EquityTradeLadderTopBar.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i9) {
                            if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(148864143, i9, -1, "com.robinhood.android.equitytradeladder.topbar.EquityTradeLadderTopBar.<anonymous> (EquityTradeLadderTopBar.kt:58)");
                            }
                            TitleContent.TitleContent(topBarData.getTitleContentState(), null, composer3, TitleContentState.$stable, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1494618350, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitytradeladder.topbar.EquityTradeLadderTopBarKt.EquityTradeLadderTopBar.3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i9) {
                            if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1494618350, i9, -1, "com.robinhood.android.equitytradeladder.topbar.EquityTradeLadderTopBar.<anonymous> (EquityTradeLadderTopBar.kt:61)");
                            }
                            ActionsContent.ActionsContent(topBarData.getFlattenData().isFlattenButtonVisible(), topBarData.getFlattenData().isFlattenButtonEnabled(), topBarData.getFlattenData().isFlattenLoading(), new FlattenAlertContent(NbboAlertBuilder4.nbboFlattenAlertContent(topBarData.getFlattenData().getNbboSummary(), onNbboRefreshClick, composer3, 0), NbboAlertBuilder4.nbboInlineContent(topBarData.getFlattenData().getNbboLoading(), composer3, 0)), onSettingsClicked, onFlattenClicked, topBarData.getShowFtuxTooltip(), topBarData.getFlattenData().getShowFlattenOrdersTooltip(), showNextPostTradeFtuxTooltipState, dismissFtuxTooltip, null, composer3, FlattenAlertContent.$stable << 9, 0, 1024);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), modifier4, ComposableLambda3.rememberComposableLambda(-108840532, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitytradeladder.topbar.EquityTradeLadderTopBarKt.EquityTradeLadderTopBar.4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i9) {
                            if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-108840532, i9, -1, "com.robinhood.android.equitytradeladder.topbar.EquityTradeLadderTopBar.<anonymous> (EquityTradeLadderTopBar.kt:83)");
                            }
                            DetailContent6.DetailContent(topBarData.getDayPL(), topBarData.getOpenPL(), topBarData.getHasPosition(), topBarData.getPositionsDisplay(), Integer.valueOf(topBarData.getPendingOrderQuantity()), topBarData.getPendingOrderClickable(), topBarData.getShowPnlPriceSwitcherTooltip(), topBarData.getDayPnlInfo(), onPnlClick, onOpenOrdersClicked, showNextPostTradeFtuxTooltipState, null, composer3, (StringResource.$stable << 9) | (DayPnlInfo.$stable << 21), 0, 2048);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, ((i4 >> 18) & 7168) | 25014, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mobileLinkingData2 = mobileLinkingData3;
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    mobileLinkingData2 = mobileLinkingData;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.topbar.EquityTradeLadderTopBarKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EquityTradeLadderTopBar3.EquityTradeLadderTopBar$lambda$0(topBarData, onNbboRefreshClick, onNavigationClicked, onSettingsClicked, onFlattenClicked, onPnlClick, onOpenOrdersClicked, showNextPostTradeFtuxTooltipState, dismissFtuxTooltip, modifier3, mobileLinkingData2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i6 = i2 | ((i2 & 8) == 0 ? composerStartRestartGroup.changed(mobileLinkingData) : composerStartRestartGroup.changedInstance(mobileLinkingData) ? 4 : 2);
        }
        i5 = i6;
        if ((i4 & 306783379) == 306783378) {
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = composerStartRestartGroup;
            GenericLadderTopBarKt.GenericLadderTopBar(ComposableLambda3.rememberComposableLambda(-1196890064, true, new C160131(onNavigationClicked, mobileLinkingData3), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(148864143, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitytradeladder.topbar.EquityTradeLadderTopBarKt.EquityTradeLadderTopBar.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i9) {
                    if ((i9 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(148864143, i9, -1, "com.robinhood.android.equitytradeladder.topbar.EquityTradeLadderTopBar.<anonymous> (EquityTradeLadderTopBar.kt:58)");
                    }
                    TitleContent.TitleContent(topBarData.getTitleContentState(), null, composer3, TitleContentState.$stable, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1494618350, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitytradeladder.topbar.EquityTradeLadderTopBarKt.EquityTradeLadderTopBar.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i9) {
                    if ((i9 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1494618350, i9, -1, "com.robinhood.android.equitytradeladder.topbar.EquityTradeLadderTopBar.<anonymous> (EquityTradeLadderTopBar.kt:61)");
                    }
                    ActionsContent.ActionsContent(topBarData.getFlattenData().isFlattenButtonVisible(), topBarData.getFlattenData().isFlattenButtonEnabled(), topBarData.getFlattenData().isFlattenLoading(), new FlattenAlertContent(NbboAlertBuilder4.nbboFlattenAlertContent(topBarData.getFlattenData().getNbboSummary(), onNbboRefreshClick, composer3, 0), NbboAlertBuilder4.nbboInlineContent(topBarData.getFlattenData().getNbboLoading(), composer3, 0)), onSettingsClicked, onFlattenClicked, topBarData.getShowFtuxTooltip(), topBarData.getFlattenData().getShowFlattenOrdersTooltip(), showNextPostTradeFtuxTooltipState, dismissFtuxTooltip, null, composer3, FlattenAlertContent.$stable << 9, 0, 1024);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), modifier4, ComposableLambda3.rememberComposableLambda(-108840532, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitytradeladder.topbar.EquityTradeLadderTopBarKt.EquityTradeLadderTopBar.4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i9) {
                    if ((i9 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-108840532, i9, -1, "com.robinhood.android.equitytradeladder.topbar.EquityTradeLadderTopBar.<anonymous> (EquityTradeLadderTopBar.kt:83)");
                    }
                    DetailContent6.DetailContent(topBarData.getDayPL(), topBarData.getOpenPL(), topBarData.getHasPosition(), topBarData.getPositionsDisplay(), Integer.valueOf(topBarData.getPendingOrderQuantity()), topBarData.getPendingOrderClickable(), topBarData.getShowPnlPriceSwitcherTooltip(), topBarData.getDayPnlInfo(), onPnlClick, onOpenOrdersClicked, showNextPostTradeFtuxTooltipState, null, composer3, (StringResource.$stable << 9) | (DayPnlInfo.$stable << 21), 0, 2048);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, ((i4 >> 18) & 7168) | 25014, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            mobileLinkingData2 = mobileLinkingData3;
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: EquityTradeLadderTopBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitytradeladder.topbar.EquityTradeLadderTopBarKt$EquityTradeLadderTopBar$1 */
    static final class C160131 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ MobileLinkingData $mobileLinkingData;
        final /* synthetic */ Function0<Unit> $onNavigationClicked;

        C160131(Function0<Unit> function0, MobileLinkingData mobileLinkingData) {
            this.$onNavigationClicked = function0;
            this.$mobileLinkingData = mobileLinkingData;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$1$lambda$0(MobileLinkingData mobileLinkingData) {
            mobileLinkingData.getCallbacks().openSelectGroupSheet();
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1196890064, i, -1, "com.robinhood.android.equitytradeladder.topbar.EquityTradeLadderTopBar.<anonymous> (EquityTradeLadderTopBar.kt:44)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Function0<Unit> function0 = this.$onNavigationClicked;
            final MobileLinkingData mobileLinkingData = this.$mobileLinkingData;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            NavigationContent3.NavigationContent(function0, null, false, composer, 0, 6);
            composer.startReplaceGroup(1950191410);
            if (mobileLinkingData != null) {
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(10)), composer, 6);
                long composeColor = LinkingGroupColors2.toComposeColor(mobileLinkingData.getLinkingGroup().getColor(), composer, 0);
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(mobileLinkingData);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equitytradeladder.topbar.EquityTradeLadderTopBarKt$EquityTradeLadderTopBar$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EquityTradeLadderTopBar3.C160131.invoke$lambda$3$lambda$2$lambda$1$lambda$0(mobileLinkingData);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                MobileLinkingColorComposable3.m16071MobileLinkingColorComposableKTwxG1Y(composeColor, ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null), null, composer, 0, 4);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    private static final void PreviewLadderTopBar(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1082652906);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1082652906, i, -1, "com.robinhood.android.equitytradeladder.topbar.PreviewLadderTopBar (EquityTradeLadderTopBar.kt:102)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(false, EquityTradeLadderTopBar.INSTANCE.getLambda$1101081545$feature_equity_trade_ladder_externalDebug(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.topbar.EquityTradeLadderTopBarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityTradeLadderTopBar3.PreviewLadderTopBar$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
