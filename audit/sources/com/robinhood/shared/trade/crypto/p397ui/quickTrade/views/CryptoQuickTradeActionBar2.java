package com.robinhood.shared.trade.crypto.p397ui.quickTrade.views;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
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
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoQuickTradeActionBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.views.ComposableSingletons$CryptoQuickTradeActionBarKt$lambda$-999152444$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoQuickTradeActionBar2 implements Function2<Composer, Integer, Unit> {
    public static final CryptoQuickTradeActionBar2 INSTANCE = new CryptoQuickTradeActionBar2();

    CryptoQuickTradeActionBar2() {
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-999152444, i, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.ComposableSingletons$CryptoQuickTradeActionBarKt.lambda$-999152444.<anonymous> (CryptoQuickTradeActionBar.kt:184)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null), 0.0f, C2002Dp.m7995constructorimpl(12), 1, null), 0.0f, composer, 0, 1);
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        ActionViewState.SellAll sellAll = ActionViewState.SellAll.INSTANCE;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            objRememberedValue = new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.ComposableSingletons$CryptoQuickTradeActionBarKt$lambda$-999152444$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoQuickTradeActionBar2.invoke$lambda$12$lambda$1$lambda$0((ActionViewState) obj, ((Integer) obj2).intValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CryptoQuickTradeActionBar4.CryptoQuickTradeActionBar(sellAll, (Function2) objRememberedValue, null, composer, 54, 4);
        ActionViewState.BuyMax buyMax = ActionViewState.BuyMax.INSTANCE;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.ComposableSingletons$CryptoQuickTradeActionBarKt$lambda$-999152444$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoQuickTradeActionBar2.invoke$lambda$12$lambda$3$lambda$2((ActionViewState) obj, ((Integer) obj2).intValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        CryptoQuickTradeActionBar4.CryptoQuickTradeActionBar(buyMax, (Function2) objRememberedValue2, null, composer, 54, 4);
        ActionViewState.Submit submit = new ActionViewState.Submit(true);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion3.getEmpty()) {
            objRememberedValue3 = new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.ComposableSingletons$CryptoQuickTradeActionBarKt$lambda$-999152444$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoQuickTradeActionBar2.invoke$lambda$12$lambda$5$lambda$4((ActionViewState) obj, ((Integer) obj2).intValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        CryptoQuickTradeActionBar4.CryptoQuickTradeActionBar(submit, (Function2) objRememberedValue3, null, composer, 48, 4);
        ActionViewState.SwipeToSubmit swipeToSubmit = new ActionViewState.SwipeToSubmit(true);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion3.getEmpty()) {
            objRememberedValue4 = new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.ComposableSingletons$CryptoQuickTradeActionBarKt$lambda$-999152444$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoQuickTradeActionBar2.invoke$lambda$12$lambda$7$lambda$6((ActionViewState) obj, ((Integer) obj2).intValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        CryptoQuickTradeActionBar4.CryptoQuickTradeActionBar(swipeToSubmit, (Function2) objRememberedValue4, null, composer, 48, 4);
        ActionViewState.QuickTrades quickTrades = new ActionViewState.QuickTrades(CollectionsKt.listOf((Object[]) new ActionViewState.QuickTrade.SellAll[]{new ActionViewState.QuickTrade.SellAll(0), new ActionViewState.QuickTrade.SellAll(1), new ActionViewState.QuickTrade.SellAll(2)}), false, 2, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion3.getEmpty()) {
            objRememberedValue5 = new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.ComposableSingletons$CryptoQuickTradeActionBarKt$lambda$-999152444$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoQuickTradeActionBar2.invoke$lambda$12$lambda$9$lambda$8((ActionViewState) obj, ((Integer) obj2).intValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        CryptoQuickTradeActionBar4.CryptoQuickTradeActionBar(quickTrades, (Function2) objRememberedValue5, null, composer, 48, 4);
        ActionViewState.QuickTrades quickTrades2 = new ActionViewState.QuickTrades(CollectionsKt.listOf((Object[]) new ActionViewState.QuickTrade.BuyMax[]{new ActionViewState.QuickTrade.BuyMax(0), new ActionViewState.QuickTrade.BuyMax(1), new ActionViewState.QuickTrade.BuyMax(2), new ActionViewState.QuickTrade.BuyMax(3)}), true);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion3.getEmpty()) {
            objRememberedValue6 = new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.ComposableSingletons$CryptoQuickTradeActionBarKt$lambda$-999152444$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoQuickTradeActionBar2.invoke$lambda$12$lambda$11$lambda$10((ActionViewState) obj, ((Integer) obj2).intValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue6);
        }
        composer.endReplaceGroup();
        CryptoQuickTradeActionBar4.CryptoQuickTradeActionBar(quickTrades2, (Function2) objRememberedValue6, null, composer, 48, 4);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$1$lambda$0(ActionViewState actionViewState, int i) {
        Intrinsics.checkNotNullParameter(actionViewState, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$3$lambda$2(ActionViewState actionViewState, int i) {
        Intrinsics.checkNotNullParameter(actionViewState, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$5$lambda$4(ActionViewState actionViewState, int i) {
        Intrinsics.checkNotNullParameter(actionViewState, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$7$lambda$6(ActionViewState actionViewState, int i) {
        Intrinsics.checkNotNullParameter(actionViewState, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$9$lambda$8(ActionViewState actionViewState, int i) {
        Intrinsics.checkNotNullParameter(actionViewState, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11$lambda$10(ActionViewState actionViewState, int i) {
        Intrinsics.checkNotNullParameter(actionViewState, "<unused var>");
        return Unit.INSTANCE;
    }
}
