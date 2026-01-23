package com.robinhood.shared.crypto.p375ui.feeTiers;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
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
import com.robinhood.rosetta.eventlogging.CryptoFeeTierStatusContext;
import com.robinhood.shared.crypto.p375ui.feeTiers.CryptoFeeTierSummary;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoFeeTierSummaryComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.ui.feeTiers.ComposableSingletons$CryptoFeeTierSummaryComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoFeeTierSummaryComposable {
    public static final CryptoFeeTierSummaryComposable INSTANCE = new CryptoFeeTierSummaryComposable();

    /* renamed from: lambda$-982506410, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9439lambda$982506410 = ComposableLambda3.composableLambdaInstance(-982506410, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.feeTiers.ComposableSingletons$CryptoFeeTierSummaryComposableKt$lambda$-982506410$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-982506410, i, -1, "com.robinhood.shared.crypto.ui.feeTiers.ComposableSingletons$CryptoFeeTierSummaryComposableKt.lambda$-982506410.<anonymous> (CryptoFeeTierSummaryComposable.kt:213)");
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
            Column6 column6 = Column6.INSTANCE;
            CryptoFeeTierSummaryComposable3.CryptoFeeTierSummaryComposable(new CryptoFeeTierSummary.LowestFee("0.10%", new CryptoFeeTierStatusContext(0.0d, 0.0d, 0.0d, 0.0d, null, 31, null)), composer, 0);
            StringResource.Companion companion3 = StringResource.INSTANCE;
            CryptoFeeTierSummaryComposable3.CryptoFeeTierSummaryComposable(new CryptoFeeTierSummary.HasNextTier(new CryptoFeeTierSummary.HasNextTier.FeeTier("0.20%", "$1,000.00", companion3.invoke("current tier - description text")), new CryptoFeeTierSummary.HasNextTier.FeeTier("0.10%", "$4,999,000.00", companion3.invoke("next tier - description text")), new CryptoFeeTierStatusContext(0.0d, 0.0d, 0.0d, 0.0d, null, 31, null)), composer, 0);
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
    });

    /* renamed from: getLambda$-982506410$lib_crypto_ui_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25225getLambda$982506410$lib_crypto_ui_externalDebug() {
        return f9439lambda$982506410;
    }
}
