package com.robinhood.android.cortex.digest.asset.splash;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetDigestSplashComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$AssetDigestSplashComposableKt {
    public static final ComposableSingletons$AssetDigestSplashComposableKt INSTANCE = new ComposableSingletons$AssetDigestSplashComposableKt();

    /* renamed from: lambda$-1568775950, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8739lambda$1568775950 = ComposableLambda3.composableLambdaInstance(-1568775950, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.splash.ComposableSingletons$AssetDigestSplashComposableKt$lambda$-1568775950$1
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
                ComposerKt.traceEventStart(-1568775950, i, -1, "com.robinhood.android.cortex.digest.asset.splash.ComposableSingletons$AssetDigestSplashComposableKt.lambda$-1568775950.<anonymous> (AssetDigestSplashComposable.kt:94)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function4<BoxScope, Float, Composer, Integer, Unit> lambda$212895615 = ComposableLambda3.composableLambdaInstance(212895615, false, new Function4<BoxScope, Float, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.splash.ComposableSingletons$AssetDigestSplashComposableKt$lambda$212895615$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Float f, Composer composer, Integer num) {
            invoke(boxScope, f.floatValue(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope CortexDigestSplashAnimation, float f, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(CortexDigestSplashAnimation, "$this$CortexDigestSplashAnimation");
            if ((i & 48) == 0) {
                i |= composer.changed(f) ? 32 : 16;
            }
            if ((i & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(212895615, i, -1, "com.robinhood.android.cortex.digest.asset.splash.ComposableSingletons$AssetDigestSplashComposableKt.lambda$212895615.<anonymous> (AssetDigestSplashComposable.kt:341)");
            }
            LoadingScreenComposablesKt.PromoLoadingScreenComposable(Alpha.alpha(Modifier.INSTANCE, f), 1, composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-272049634, reason: not valid java name */
    private static Function4<BoxScope, Float, Composer, Integer, Unit> f8740lambda$272049634 = ComposableLambda3.composableLambdaInstance(-272049634, false, new Function4<BoxScope, Float, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.splash.ComposableSingletons$AssetDigestSplashComposableKt$lambda$-272049634$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Float f, Composer composer, Integer num) {
            invoke(boxScope, f.floatValue(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope CortexDigestSplashAnimation, float f, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(CortexDigestSplashAnimation, "$this$CortexDigestSplashAnimation");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(CortexDigestSplashAnimation) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= composer.changed(f) ? 32 : 16;
            }
            if ((i2 & 147) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-272049634, i2, -1, "com.robinhood.android.cortex.digest.asset.splash.ComposableSingletons$AssetDigestSplashComposableKt.lambda$-272049634.<anonymous> (AssetDigestSplashComposable.kt:348)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Alpha.alpha(Modifier.INSTANCE, f), 0.0f, 1, null);
            Brush.Companion companion = Brush.INSTANCE;
            Tuples2 tuples2M3642to = Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU()));
            Float fValueOf = Float.valueOf(0.25f);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12072R.string.digest_onboarding_splash_sample_output, composer, 0), CortexDigestSplashAnimation.align(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(Background3.background$default(modifierFillMaxWidth$default, Brush.Companion.m6683verticalGradient8A3gB4$default(companion, new Tuples2[]{tuples2M3642to, Tuples4.m3642to(fValueOf, Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU())), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 5, null), Alignment.INSTANCE.getBottomCenter()), Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextS(), composer, 0, 0, 8120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-414010447, reason: not valid java name */
    private static Function3<PaddingValues, Composer, Integer, Unit> f8741lambda$414010447 = ComposableLambda3.composableLambdaInstance(-414010447, false, C12068x5143b75a.INSTANCE);

    /* renamed from: lambda$-823047518, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8742lambda$823047518 = ComposableLambda3.composableLambdaInstance(-823047518, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.splash.ComposableSingletons$AssetDigestSplashComposableKt$lambda$-823047518$1
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
                ComposerKt.traceEventStart(-823047518, i, -1, "com.robinhood.android.cortex.digest.asset.splash.ComposableSingletons$AssetDigestSplashComposableKt.lambda$-823047518.<anonymous> (AssetDigestSplashComposable.kt:379)");
            }
            ScaffoldKt.m5939ScaffoldTvnljyQ(null, null, null, null, null, 0, 0L, 0L, null, ComposableSingletons$AssetDigestSplashComposableKt.INSTANCE.m1861xa5c22a41(), composer, 805306368, 511);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$280146775 = ComposableLambda3.composableLambdaInstance(280146775, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.splash.ComposableSingletons$AssetDigestSplashComposableKt$lambda$280146775$1
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
                ComposerKt.traceEventStart(280146775, i, -1, "com.robinhood.android.cortex.digest.asset.splash.ComposableSingletons$AssetDigestSplashComposableKt.lambda$280146775.<anonymous> (AssetDigestSplashComposable.kt:378)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableSingletons$AssetDigestSplashComposableKt.INSTANCE.m1862xd22620fe(), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1150216289, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8738lambda$1150216289 = ComposableLambda3.composableLambdaInstance(-1150216289, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.splash.ComposableSingletons$AssetDigestSplashComposableKt$lambda$-1150216289$1
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
                ComposerKt.traceEventStart(-1150216289, i, -1, "com.robinhood.android.cortex.digest.asset.splash.ComposableSingletons$AssetDigestSplashComposableKt.lambda$-1150216289.<anonymous> (AssetDigestSplashComposable.kt:377)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$AssetDigestSplashComposableKt.INSTANCE.getLambda$280146775$lib_cortex_digest_asset_splash_externalDebug(), composer, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1150216289$lib_cortex_digest_asset_splash_externalDebug */
    public final Function2<Composer, Integer, Unit> m1858x807f161d() {
        return f8738lambda$1150216289;
    }

    /* renamed from: getLambda$-1568775950$lib_cortex_digest_asset_splash_externalDebug */
    public final Function2<Composer, Integer, Unit> m1859x8ffc744f() {
        return f8739lambda$1568775950;
    }

    /* renamed from: getLambda$-272049634$lib_cortex_digest_asset_splash_externalDebug */
    public final Function4<BoxScope, Float, Composer, Integer, Unit> m1860x7c1f251() {
        return f8740lambda$272049634;
    }

    /* renamed from: getLambda$-414010447$lib_cortex_digest_asset_splash_externalDebug */
    public final Function3<PaddingValues, Composer, Integer, Unit> m1861xa5c22a41() {
        return f8741lambda$414010447;
    }

    /* renamed from: getLambda$-823047518$lib_cortex_digest_asset_splash_externalDebug */
    public final Function2<Composer, Integer, Unit> m1862xd22620fe() {
        return f8742lambda$823047518;
    }

    public final Function4<BoxScope, Float, Composer, Integer, Unit> getLambda$212895615$lib_cortex_digest_asset_splash_externalDebug() {
        return lambda$212895615;
    }

    public final Function2<Composer, Integer, Unit> getLambda$280146775$lib_cortex_digest_asset_splash_externalDebug() {
        return lambda$280146775;
    }
}
