package com.robinhood.android.crypto.tab.p093ui.discover;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.crypto.tab.C13013R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHomeDiscoverComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.tab.ui.discover.ComposableSingletons$CryptoHomeDiscoverComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoHomeDiscoverComposable {
    public static final CryptoHomeDiscoverComposable INSTANCE = new CryptoHomeDiscoverComposable();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1345278523 = ComposableLambda3.composableLambdaInstance(1345278523, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.discover.ComposableSingletons$CryptoHomeDiscoverComposableKt$lambda$1345278523$1
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
                ComposerKt.traceEventStart(1345278523, i, -1, "com.robinhood.android.crypto.tab.ui.discover.ComposableSingletons$CryptoHomeDiscoverComposableKt.lambda$1345278523.<anonymous> (CryptoHomeDiscoverComposable.kt:54)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1024995214, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8834lambda$1024995214 = ComposableLambda3.composableLambdaInstance(-1024995214, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.discover.ComposableSingletons$CryptoHomeDiscoverComposableKt$lambda$-1024995214$1
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
                ComposerKt.traceEventStart(-1024995214, i, -1, "com.robinhood.android.crypto.tab.ui.discover.ComposableSingletons$CryptoHomeDiscoverComposableKt.lambda$-1024995214.<anonymous> (CryptoHomeDiscoverComposable.kt:58)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C13013R.string.crypto_home_discover, composer, 0), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), composer, 6, 0), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1024995214$feature_crypto_tab_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12999getLambda$1024995214$feature_crypto_tab_externalDebug() {
        return f8834lambda$1024995214;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1345278523$feature_crypto_tab_externalDebug() {
        return lambda$1345278523;
    }
}
