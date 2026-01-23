package com.robinhood.android.trade.equity.symbol;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderWithSymbolActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.symbol.ComposableSingletons$EquityOrderWithSymbolActivityKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class EquityOrderWithSymbolActivity2 {
    public static final EquityOrderWithSymbolActivity2 INSTANCE = new EquityOrderWithSymbolActivity2();

    /* renamed from: lambda$-574037299, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9270lambda$574037299 = ComposableLambda3.composableLambdaInstance(-574037299, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.equity.symbol.ComposableSingletons$EquityOrderWithSymbolActivityKt$lambda$-574037299$1
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
                ComposerKt.traceEventStart(-574037299, i, -1, "com.robinhood.android.trade.equity.symbol.ComposableSingletons$EquityOrderWithSymbolActivityKt.lambda$-574037299.<anonymous> (EquityOrderWithSymbolActivity.kt:53)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Spacer2.Spacer(Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null), composer, 0);
            BoxKt.Box(LocalShowPlaceholder.withBentoPlaceholder$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2002Dp.m7995constructorimpl(300)), false, null, 3, null), composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-624029091, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9271lambda$624029091 = ComposableLambda3.composableLambdaInstance(-624029091, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.equity.symbol.ComposableSingletons$EquityOrderWithSymbolActivityKt$lambda$-624029091$1
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
                ComposerKt.traceEventStart(-624029091, i, -1, "com.robinhood.android.trade.equity.symbol.ComposableSingletons$EquityOrderWithSymbolActivityKt.lambda$-624029091.<anonymous> (EquityOrderWithSymbolActivity.kt:47)");
            }
            LocalShowPlaceholder.Loadable(true, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composer, 6, 0), null, EquityOrderWithSymbolActivity2.INSTANCE.m19267getLambda$574037299$feature_trade_equity_externalDebug(), composer, 3078, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-574037299$feature_trade_equity_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m19267getLambda$574037299$feature_trade_equity_externalDebug() {
        return f9270lambda$574037299;
    }

    /* renamed from: getLambda$-624029091$feature_trade_equity_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m19268getLambda$624029091$feature_trade_equity_externalDebug() {
        return f9271lambda$624029091;
    }
}
