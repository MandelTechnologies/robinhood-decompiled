package com.robinhood.android.crypto.settings.feeTiers;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoSettingsFeeTierStatusComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.settings.feeTiers.ComposableSingletons$CryptoSettingsFeeTierStatusComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoSettingsFeeTierStatusComposable {
    public static final CryptoSettingsFeeTierStatusComposable INSTANCE = new CryptoSettingsFeeTierStatusComposable();

    /* renamed from: lambda$-224415691, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8826lambda$224415691 = ComposableLambda3.composableLambdaInstance(-224415691, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.settings.feeTiers.ComposableSingletons$CryptoSettingsFeeTierStatusComposableKt$lambda$-224415691$1
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
                ComposerKt.traceEventStart(-224415691, i, -1, "com.robinhood.android.crypto.settings.feeTiers.ComposableSingletons$CryptoSettingsFeeTierStatusComposableKt.lambda$-224415691.<anonymous> (CryptoSettingsFeeTierStatusComposable.kt:146)");
            }
            CryptoSettingsFeeTierStatusComposable4.DisabledState(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1543527299, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8825lambda$1543527299 = ComposableLambda3.composableLambdaInstance(-1543527299, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.settings.feeTiers.ComposableSingletons$CryptoSettingsFeeTierStatusComposableKt$lambda$-1543527299$1
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
                ComposerKt.traceEventStart(-1543527299, i, -1, "com.robinhood.android.crypto.settings.feeTiers.ComposableSingletons$CryptoSettingsFeeTierStatusComposableKt.lambda$-1543527299.<anonymous> (CryptoSettingsFeeTierStatusComposable.kt:145)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoSettingsFeeTierStatusComposable.INSTANCE.m12981getLambda$224415691$feature_crypto_settings_externalDebug(), composer, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1543527299$feature_crypto_settings_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12980getLambda$1543527299$feature_crypto_settings_externalDebug() {
        return f8825lambda$1543527299;
    }

    /* renamed from: getLambda$-224415691$feature_crypto_settings_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12981getLambda$224415691$feature_crypto_settings_externalDebug() {
        return f8826lambda$224415691;
    }
}
