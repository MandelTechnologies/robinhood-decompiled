package com.robinhood.android.rollover401k.steps.unsupported;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.models.retirement.p194db.UnsupportedInstitutionRow;
import com.robinhood.android.models.retirement.p194db.UnsupportedInstitutionViewModel;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: UnsupportedInstitutionScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rollover401k.steps.unsupported.ComposableSingletons$UnsupportedInstitutionScreenKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class UnsupportedInstitutionScreen {
    public static final UnsupportedInstitutionScreen INSTANCE = new UnsupportedInstitutionScreen();
    private static Function2<Composer, Integer, Unit> lambda$1356656298 = ComposableLambda3.composableLambdaInstance(1356656298, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.unsupported.ComposableSingletons$UnsupportedInstitutionScreenKt$lambda$1356656298$1
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
                ComposerKt.traceEventStart(1356656298, i, -1, "com.robinhood.android.rollover401k.steps.unsupported.ComposableSingletons$UnsupportedInstitutionScreenKt.lambda$1356656298.<anonymous> (UnsupportedInstitutionScreen.kt:47)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1021793066, reason: not valid java name */
    private static Function3<BentoAppBarScope, Composer, Integer, Unit> f9239lambda$1021793066 = ComposableLambda3.composableLambdaInstance(-1021793066, false, UnsupportedInstitutionScreen2.INSTANCE);

    /* renamed from: lambda$-162121161, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9240lambda$162121161 = ComposableLambda3.composableLambdaInstance(-162121161, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.unsupported.ComposableSingletons$UnsupportedInstitutionScreenKt$lambda$-162121161$1
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
                ComposerKt.traceEventStart(-162121161, i, -1, "com.robinhood.android.rollover401k.steps.unsupported.ComposableSingletons$UnsupportedInstitutionScreenKt.lambda$-162121161.<anonymous> (UnsupportedInstitutionScreen.kt:46)");
            }
            UnsupportedInstitutionScreen unsupportedInstitutionScreen = UnsupportedInstitutionScreen.INSTANCE;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(unsupportedInstitutionScreen.getLambda$1356656298$feature_rollover_401k_externalDebug(), null, unsupportedInstitutionScreen.m18453getLambda$1021793066$feature_rollover_401k_externalDebug(), null, null, false, false, null, null, 0L, null, composer, 390, 0, 2042);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-2091837190, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9241lambda$2091837190 = ComposableLambda3.composableLambdaInstance(-2091837190, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.unsupported.ComposableSingletons$UnsupportedInstitutionScreenKt$lambda$-2091837190$1
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
                ComposerKt.traceEventStart(-2091837190, i, -1, "com.robinhood.android.rollover401k.steps.unsupported.ComposableSingletons$UnsupportedInstitutionScreenKt.lambda$-2091837190.<anonymous> (UnsupportedInstitutionScreen.kt:126)");
            }
            UnsupportedInstitutionScreen7.UnsupportedInstitutionScreen(new UnsupportedInstitutionViewModel("We don't support this provider yet", "We're always adding more 401(k) providers. In the meantime, here's what you can do.", CollectionsKt.listOf((Object[]) new UnsupportedInstitutionRow[]{new UnsupportedInstitutionRow("Request your provider", "Let us know who you'd like us to support next and we'll do our best to add them."), new UnsupportedInstitutionRow("Start a rollover with a check", "You can still roll over by requesting a check from your provider.")}), "Manually enter details", ""), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$865684527 = ComposableLambda3.composableLambdaInstance(865684527, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.unsupported.ComposableSingletons$UnsupportedInstitutionScreenKt$lambda$865684527$1
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
                ComposerKt.traceEventStart(865684527, i, -1, "com.robinhood.android.rollover401k.steps.unsupported.ComposableSingletons$UnsupportedInstitutionScreenKt.lambda$865684527.<anonymous> (UnsupportedInstitutionScreen.kt:125)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(UnsupportedInstitutionScreen.INSTANCE.m18455getLambda$2091837190$feature_rollover_401k_externalDebug(), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1021793066$feature_rollover_401k_externalDebug, reason: not valid java name */
    public final Function3<BentoAppBarScope, Composer, Integer, Unit> m18453getLambda$1021793066$feature_rollover_401k_externalDebug() {
        return f9239lambda$1021793066;
    }

    /* renamed from: getLambda$-162121161$feature_rollover_401k_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m18454getLambda$162121161$feature_rollover_401k_externalDebug() {
        return f9240lambda$162121161;
    }

    /* renamed from: getLambda$-2091837190$feature_rollover_401k_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m18455getLambda$2091837190$feature_rollover_401k_externalDebug() {
        return f9241lambda$2091837190;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1356656298$feature_rollover_401k_externalDebug() {
        return lambda$1356656298;
    }

    public final Function2<Composer, Integer, Unit> getLambda$865684527$feature_rollover_401k_externalDebug() {
        return lambda$865684527;
    }
}
