package com.robinhood.shared.trade.crypto.p397ui.quickTrade.views;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransition4;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoQuickTradeActionBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.views.ComposableSingletons$CryptoQuickTradeActionBarKt$lambda$1167353950$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoQuickTradeActionBar3 implements Function2<Composer, Integer, Unit> {
    public static final CryptoQuickTradeActionBar3 INSTANCE = new CryptoQuickTradeActionBar3();

    CryptoQuickTradeActionBar3() {
    }

    private static final float invoke$lambda$0(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1167353950, i, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.ComposableSingletons$CryptoQuickTradeActionBarKt.lambda$1167353950.<anonymous> (CryptoQuickTradeActionBar.kt:241)");
        }
        ActionViewState submit = invoke$lambda$0(InfiniteTransition4.animateFloat(InfiniteTransition4.rememberInfiniteTransition("cursor", composer, 6, 0), 0.0f, 1.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1000, 0, Easing3.getLinearEasing(), 2, null), RepeatMode.Reverse, 0L, 4, null), "phase", composer, (InfiniteTransition.$stable | 25008) | (InfiniteRepeatableSpec.$stable << 9), 0)) < 0.5f ? ActionViewState.SellAll.INSTANCE : new ActionViewState.Submit(true);
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null), 0.0f, C2002Dp.m7995constructorimpl(12), 1, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
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
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.ComposableSingletons$CryptoQuickTradeActionBarKt$lambda$1167353950$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoQuickTradeActionBar3.invoke$lambda$3$lambda$2$lambda$1((ActionViewState) obj, ((Integer) obj2).intValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CryptoQuickTradeActionBar4.CryptoQuickTradeActionBar(submit, (Function2) objRememberedValue, null, composer, 48, 4);
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
    public static final Unit invoke$lambda$3$lambda$2$lambda$1(ActionViewState actionViewState, int i) {
        Intrinsics.checkNotNullParameter(actionViewState, "<unused var>");
        return Unit.INSTANCE;
    }
}
