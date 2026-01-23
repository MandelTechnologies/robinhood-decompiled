package com.robinhood.shared.tradeladder.p398ui.ladder;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.material3.SnackbarData;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GenericLadder.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$GenericLadderKt {
    public static final ComposableSingletons$GenericLadderKt INSTANCE = new ComposableSingletons$GenericLadderKt();

    /* renamed from: lambda$-121226975, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9503lambda$121226975 = ComposableLambda3.composableLambdaInstance(-121226975, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.ComposableSingletons$GenericLadderKt$lambda$-121226975$1
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
                ComposerKt.traceEventStart(-121226975, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.ComposableSingletons$GenericLadderKt.lambda$-121226975.<anonymous> (GenericLadder.kt:321)");
            }
            GenericLadderKt.ZoomToast(StringResource.INSTANCE.invoke("$1.00"), Modifier.INSTANCE, composer, StringResource.$stable | 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<SnackbarData, Composer, Integer, Unit> lambda$1257548220 = ComposableLambda3.composableLambdaInstance(1257548220, false, new Function3<SnackbarData, Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.ComposableSingletons$GenericLadderKt$lambda$1257548220$1
        public final void invoke(SnackbarData it, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(it) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1257548220, i2, -1, "com.robinhood.shared.tradeladder.ui.ladder.ComposableSingletons$GenericLadderKt.lambda$1257548220.<anonymous> (GenericLadder.kt:397)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer, 0);
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
            BentoText2.m20747BentoText38GnDrw(it.getVisuals().getMessage(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SnackbarData snackbarData, Composer composer, Integer num) {
            invoke(snackbarData, composer, num.intValue());
            return Unit.INSTANCE;
        }
    });

    /* renamed from: getLambda$-121226975$lib_trade_ladder_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m26061getLambda$121226975$lib_trade_ladder_externalDebug() {
        return f9503lambda$121226975;
    }

    public final Function3<SnackbarData, Composer, Integer, Unit> getLambda$1257548220$lib_trade_ladder_externalDebug() {
        return lambda$1257548220;
    }
}
