package com.robinhood.android.crypto.tab.p093ui.discover.leaf;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoExploreFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.tab.ui.discover.leaf.ComposableSingletons$CryptoExploreFragmentKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoExploreFragment2 {
    public static final CryptoExploreFragment2 INSTANCE = new CryptoExploreFragment2();
    private static Function2<Composer, Integer, Unit> lambda$1394771943 = ComposableLambda3.composableLambdaInstance(1394771943, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.ComposableSingletons$CryptoExploreFragmentKt$lambda$1394771943$1
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
                ComposerKt.traceEventStart(1394771943, i, -1, "com.robinhood.android.crypto.tab.ui.discover.leaf.ComposableSingletons$CryptoExploreFragmentKt.lambda$1394771943.<anonymous> (CryptoExploreFragment.kt:38)");
            }
            CryptoExploreComposableKt.CryptoExploreComposable(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$2063789615 = ComposableLambda3.composableLambdaInstance(2063789615, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.ComposableSingletons$CryptoExploreFragmentKt$lambda$2063789615$1
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
                ComposerKt.traceEventStart(2063789615, i, -1, "com.robinhood.android.crypto.tab.ui.discover.leaf.ComposableSingletons$CryptoExploreFragmentKt.lambda$2063789615.<anonymous> (CryptoExploreFragment.kt:37)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, CryptoExploreFragment2.INSTANCE.getLambda$1394771943$feature_crypto_tab_externalDebug(), composer, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1394771943$feature_crypto_tab_externalDebug() {
        return lambda$1394771943;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2063789615$feature_crypto_tab_externalDebug() {
        return lambda$2063789615;
    }
}
