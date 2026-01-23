package com.robinhood.android.crypto.settings;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.history.p082ui.HistoryRowsKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.shared.history.contracts.AllHistoryFragmentKey;
import com.robinhood.shared.iac.infobanner.InfoBannerComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoSettingsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$CryptoSettingsComposableKt {
    public static final ComposableSingletons$CryptoSettingsComposableKt INSTANCE = new ComposableSingletons$CryptoSettingsComposableKt();
    private static Function2<Composer, Integer, Unit> lambda$389839135 = ComposableLambda3.composableLambdaInstance(389839135, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.settings.ComposableSingletons$CryptoSettingsComposableKt$lambda$389839135$1
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
                ComposerKt.traceEventStart(389839135, i, -1, "com.robinhood.android.crypto.settings.ComposableSingletons$CryptoSettingsComposableKt.lambda$389839135.<anonymous> (CryptoSettingsComposable.kt:102)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C13000R.string.crypto_settings_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$496196648 = ComposableLambda3.composableLambdaInstance(496196648, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.settings.ComposableSingletons$CryptoSettingsComposableKt$lambda$496196648$1
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
                ComposerKt.traceEventStart(496196648, i, -1, "com.robinhood.android.crypto.settings.ComposableSingletons$CryptoSettingsComposableKt.lambda$496196648.<anonymous> (CryptoSettingsComposable.kt:196)");
            }
            InfoBannerComponent.InfoBannerComponent(null, IacInfoBannerLocation.INFO_BANNER_CRYPTO_SETTINGS_BELOW_HISTORY_SECTION_TITLE, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 7, null), null, null, null, null, null, null, null, null, null, null, composer, 54, 0, 8184);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-523676891, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8824lambda$523676891 = ComposableLambda3.composableLambdaInstance(-523676891, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.settings.ComposableSingletons$CryptoSettingsComposableKt$lambda$-523676891$1
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
                ComposerKt.traceEventStart(-523676891, i, -1, "com.robinhood.android.crypto.settings.ComposableSingletons$CryptoSettingsComposableKt.lambda$-523676891.<anonymous> (CryptoSettingsComposable.kt:206)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$2055691814 = ComposableLambda3.composableLambdaInstance(2055691814, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.settings.ComposableSingletons$CryptoSettingsComposableKt$lambda$2055691814$1
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
                ComposerKt.traceEventStart(2055691814, i, -1, "com.robinhood.android.crypto.settings.ComposableSingletons$CryptoSettingsComposableKt.lambda$2055691814.<anonymous> (CryptoSettingsComposable.kt:208)");
            }
            AllHistoryFragmentKey.Filter filter = AllHistoryFragmentKey.Filter.CRYPTO_TRANSFERS;
            HistoryRowsKt.DefaultHistoryFooter(null, null, new AllHistoryFragmentKey(SetsKt.setOf((Object[]) new AllHistoryFragmentKey.Filter[]{filter, AllHistoryFragmentKey.Filter.CRYPTO_STAKING}), null, null, null, true, filter, false, false, EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE, null), composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-523676891$feature_crypto_settings_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12972getLambda$523676891$feature_crypto_settings_externalDebug() {
        return f8824lambda$523676891;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2055691814$feature_crypto_settings_externalDebug() {
        return lambda$2055691814;
    }

    public final Function2<Composer, Integer, Unit> getLambda$389839135$feature_crypto_settings_externalDebug() {
        return lambda$389839135;
    }

    public final Function2<Composer, Integer, Unit> getLambda$496196648$feature_crypto_settings_externalDebug() {
        return lambda$496196648;
    }
}
