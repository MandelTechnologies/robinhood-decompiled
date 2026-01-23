package com.robinhood.android.crypto.tab.p093ui.discover;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHomeDiscoverExperimentComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$CryptoHomeDiscoverExperimentComposableKt {
    public static final ComposableSingletons$CryptoHomeDiscoverExperimentComposableKt INSTANCE = new ComposableSingletons$CryptoHomeDiscoverExperimentComposableKt();

    /* renamed from: lambda$-266174567, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8838lambda$266174567 = ComposableLambda3.composableLambdaInstance(-266174567, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.discover.ComposableSingletons$CryptoHomeDiscoverExperimentComposableKt$lambda$-266174567$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-266174567, i, -1, "com.robinhood.android.crypto.tab.ui.discover.ComposableSingletons$CryptoHomeDiscoverExperimentComposableKt.lambda$-266174567.<anonymous> (CryptoHomeDiscoverExperimentComposable.kt:336)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
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
            Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(companion, 0.5f);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw("Explore crypto", PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 4, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 6, 0, 8188);
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), composer, 0);
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24), "", bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(24)), null, false, composer, BentoIcon4.Size24.$stable | 3120, 48);
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

    /* renamed from: lambda$-164465143, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8837lambda$164465143 = ComposableLambda3.composableLambdaInstance(-164465143, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.discover.ComposableSingletons$CryptoHomeDiscoverExperimentComposableKt$lambda$-164465143$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-164465143, i, -1, "com.robinhood.android.crypto.tab.ui.discover.ComposableSingletons$CryptoHomeDiscoverExperimentComposableKt.lambda$-164465143.<anonymous> (CryptoHomeDiscoverExperimentComposable.kt:329)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer, 0);
            LocalShowPlaceholder.Loadable(true, TestTag3.testTag(companion, "TEST_TAG_DISCOVER_ITEM_LOADING"), null, ComposableSingletons$CryptoHomeDiscoverExperimentComposableKt.INSTANCE.m13003getLambda$266174567$feature_crypto_tab_externalDebug(), composer, 3126, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-96696624, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8840lambda$96696624 = ComposableLambda3.composableLambdaInstance(-96696624, false, C13075x123371d8.INSTANCE);

    /* renamed from: lambda$-1138187968, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8835lambda$1138187968 = ComposableLambda3.composableLambdaInstance(-1138187968, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.discover.ComposableSingletons$CryptoHomeDiscoverExperimentComposableKt$lambda$-1138187968$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1138187968, i, -1, "com.robinhood.android.crypto.tab.ui.discover.ComposableSingletons$CryptoHomeDiscoverExperimentComposableKt.lambda$-1138187968.<anonymous> (CryptoHomeDiscoverExperimentComposable.kt:362)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, ComposableSingletons$CryptoHomeDiscoverExperimentComposableKt.INSTANCE.m13005getLambda$96696624$feature_crypto_tab_externalDebug(), composer, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-570722607, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8839lambda$570722607 = ComposableLambda3.composableLambdaInstance(-570722607, false, C13074xb15efe78.INSTANCE);

    /* renamed from: lambda$-1612213951, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8836lambda$1612213951 = ComposableLambda3.composableLambdaInstance(-1612213951, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.discover.ComposableSingletons$CryptoHomeDiscoverExperimentComposableKt$lambda$-1612213951$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1612213951, i, -1, "com.robinhood.android.crypto.tab.ui.discover.ComposableSingletons$CryptoHomeDiscoverExperimentComposableKt.lambda$-1612213951.<anonymous> (CryptoHomeDiscoverExperimentComposable.kt:384)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, ComposableSingletons$CryptoHomeDiscoverExperimentComposableKt.INSTANCE.m13004getLambda$570722607$feature_crypto_tab_externalDebug(), composer, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$506469147 = ComposableLambda3.composableLambdaInstance(506469147, false, C13076xb9280aa1.INSTANCE);

    /* renamed from: getLambda$-1138187968$feature_crypto_tab_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m13000getLambda$1138187968$feature_crypto_tab_externalDebug() {
        return f8835lambda$1138187968;
    }

    /* renamed from: getLambda$-1612213951$feature_crypto_tab_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m13001getLambda$1612213951$feature_crypto_tab_externalDebug() {
        return f8836lambda$1612213951;
    }

    /* renamed from: getLambda$-164465143$feature_crypto_tab_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m13002getLambda$164465143$feature_crypto_tab_externalDebug() {
        return f8837lambda$164465143;
    }

    /* renamed from: getLambda$-266174567$feature_crypto_tab_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13003getLambda$266174567$feature_crypto_tab_externalDebug() {
        return f8838lambda$266174567;
    }

    /* renamed from: getLambda$-570722607$feature_crypto_tab_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13004getLambda$570722607$feature_crypto_tab_externalDebug() {
        return f8839lambda$570722607;
    }

    /* renamed from: getLambda$-96696624$feature_crypto_tab_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13005getLambda$96696624$feature_crypto_tab_externalDebug() {
        return f8840lambda$96696624;
    }

    public final Function2<Composer, Integer, Unit> getLambda$506469147$feature_crypto_tab_externalDebug() {
        return lambda$506469147;
    }
}
