package com.robinhood.android.advisory.portfolio.restrictstocks;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.SnackbarData;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.advisory.portfolio.C9151R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: RestrictStocksScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$RestrictStocksScreenKt {
    public static final ComposableSingletons$RestrictStocksScreenKt INSTANCE = new ComposableSingletons$RestrictStocksScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$585664303 = ComposableLambda3.composableLambdaInstance(585664303, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.ComposableSingletons$RestrictStocksScreenKt$lambda$585664303$1
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
                ComposerKt.traceEventStart(585664303, i, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.ComposableSingletons$RestrictStocksScreenKt.lambda$585664303.<anonymous> (RestrictStocksScreen.kt:106)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<SnackbarData, Composer, Integer, Unit> lambda$502192397 = ComposableLambda3.composableLambdaInstance(502192397, false, new Function3<SnackbarData, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.ComposableSingletons$RestrictStocksScreenKt$lambda$502192397$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SnackbarData snackbarData, Composer composer, Integer num) {
            invoke(snackbarData, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(SnackbarData data, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(data, "data");
            if ((i & 6) == 0) {
                i |= composer.changed(data) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(502192397, i, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.ComposableSingletons$RestrictStocksScreenKt.lambda$502192397.<anonymous> (RestrictStocksScreen.kt:91)");
            }
            String message = data.getVisuals().getMessage();
            String actionLabel = data.getVisuals().getActionLabel();
            if (actionLabel == null) {
                actionLabel = "";
            }
            String str = actionLabel;
            composer.startReplaceGroup(5004770);
            boolean z = (i & 14) == 4;
            Object objRememberedValue = composer.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C9174x8cddff2f(data);
                composer.updateRememberedValue(objRememberedValue);
            }
            KFunction kFunction = (KFunction) objRememberedValue;
            composer.endReplaceGroup();
            RestrictStocksComponents3.CustomSnackBar(message, null, str.length() == 0, str, (Function0) kFunction, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-845546849, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8645lambda$845546849 = ComposableLambda3.composableLambdaInstance(-845546849, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.ComposableSingletons$RestrictStocksScreenKt$lambda$-845546849$1
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
                ComposerKt.traceEventStart(-845546849, i, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.ComposableSingletons$RestrictStocksScreenKt.lambda$-845546849.<anonymous> (RestrictStocksScreen.kt:406)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-191240033, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8644lambda$191240033 = ComposableLambda3.composableLambdaInstance(-191240033, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.ComposableSingletons$RestrictStocksScreenKt$lambda$-191240033$1
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
                ComposerKt.traceEventStart(-191240033, i, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.ComposableSingletons$RestrictStocksScreenKt.lambda$-191240033.<anonymous> (RestrictStocksScreen.kt:411)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C9151R.string.asset_in_portfolio_section_title, composer, 0);
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8184);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-191240033$feature_advisory_portfolio_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m11162getLambda$191240033$feature_advisory_portfolio_externalDebug() {
        return f8644lambda$191240033;
    }

    /* renamed from: getLambda$-845546849$feature_advisory_portfolio_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m11163getLambda$845546849$feature_advisory_portfolio_externalDebug() {
        return f8645lambda$845546849;
    }

    public final Function3<SnackbarData, Composer, Integer, Unit> getLambda$502192397$feature_advisory_portfolio_externalDebug() {
        return lambda$502192397;
    }

    public final Function2<Composer, Integer, Unit> getLambda$585664303$feature_advisory_portfolio_externalDebug() {
        return lambda$585664303;
    }
}
