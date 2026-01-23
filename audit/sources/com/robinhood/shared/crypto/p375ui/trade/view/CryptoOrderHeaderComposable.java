package com.robinhood.shared.crypto.p375ui.trade.view;

import androidx.compose.foundation.Background3;
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
import com.robinhood.android.apitestdata.models.ApiCreateUserRequest;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderHeaderComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.ui.trade.view.ComposableSingletons$CryptoOrderHeaderComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoOrderHeaderComposable {
    public static final CryptoOrderHeaderComposable INSTANCE = new CryptoOrderHeaderComposable();

    /* renamed from: lambda$-905988759, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9448lambda$905988759 = ComposableLambda3.composableLambdaInstance(-905988759, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.trade.view.ComposableSingletons$CryptoOrderHeaderComposableKt$lambda$-905988759$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-905988759, i, -1, "com.robinhood.shared.crypto.ui.trade.view.ComposableSingletons$CryptoOrderHeaderComposableKt.lambda$-905988759.<anonymous> (CryptoOrderHeaderComposable.kt:122)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.Absolute.INSTANCE.m5092spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM()), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
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
            CryptoOrderHeaderComposable4.CryptoOrderHeaderComposable(new CryptoOrderHeaderState(OrderSide.SELL, ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, StringResource.INSTANCE.invoke("4.634844 ETH available"), null, false, 16, null), null, null, composer, 0, 6);
            CryptoOrderHeaderComposable4.CryptoOrderHeaderComposable(new CryptoOrderHeaderState(OrderSide.BUY, null, null, null, false, 16, null), null, null, composer, 0, 6);
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

    /* renamed from: lambda$-178967007, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9447lambda$178967007 = ComposableLambda3.composableLambdaInstance(-178967007, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.trade.view.ComposableSingletons$CryptoOrderHeaderComposableKt$lambda$-178967007$1
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
                ComposerKt.traceEventStart(-178967007, i, -1, "com.robinhood.shared.crypto.ui.trade.view.ComposableSingletons$CryptoOrderHeaderComposableKt.lambda$-178967007.<anonymous> (CryptoOrderHeaderComposable.kt:121)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoOrderHeaderComposable.INSTANCE.m25269getLambda$905988759$lib_crypto_ui_externalDebug(), composer, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-178967007$lib_crypto_ui_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25268getLambda$178967007$lib_crypto_ui_externalDebug() {
        return f9447lambda$178967007;
    }

    /* renamed from: getLambda$-905988759$lib_crypto_ui_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25269getLambda$905988759$lib_crypto_ui_externalDebug() {
        return f9448lambda$905988759;
    }
}
