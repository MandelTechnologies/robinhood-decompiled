package com.robinhood.android.optionsupgrade.rhsg;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhsgCarTestQuestionnaireFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.rhsg.ComposableSingletons$RhsgCarTestQuestionnaireFragmentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class RhsgCarTestQuestionnaireFragment2 {
    public static final RhsgCarTestQuestionnaireFragment2 INSTANCE = new RhsgCarTestQuestionnaireFragment2();
    private static Function2<Composer, Integer, Unit> lambda$360446832 = ComposableLambda3.composableLambdaInstance(360446832, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.rhsg.ComposableSingletons$RhsgCarTestQuestionnaireFragmentKt$lambda$360446832$1
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
                ComposerKt.traceEventStart(360446832, i, -1, "com.robinhood.android.optionsupgrade.rhsg.ComposableSingletons$RhsgCarTestQuestionnaireFragmentKt.lambda$360446832.<anonymous> (RhsgCarTestQuestionnaireFragment.kt:91)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1828448125 = ComposableLambda3.composableLambdaInstance(1828448125, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.rhsg.ComposableSingletons$RhsgCarTestQuestionnaireFragmentKt$lambda$1828448125$1
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
                ComposerKt.traceEventStart(1828448125, i, -1, "com.robinhood.android.optionsupgrade.rhsg.ComposableSingletons$RhsgCarTestQuestionnaireFragmentKt.lambda$1828448125.<anonymous> (RhsgCarTestQuestionnaireFragment.kt:90)");
            }
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(RhsgCarTestQuestionnaireFragment2.INSTANCE.getLambda$360446832$feature_options_upgrade_externalDebug(), null, null, null, null, false, false, null, null, 0L, null, composer, 6, 0, 2046);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<PaddingValues, Composer, Integer, Unit> lambda$960654418 = ComposableLambda3.composableLambdaInstance(960654418, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.rhsg.ComposableSingletons$RhsgCarTestQuestionnaireFragmentKt$lambda$960654418$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i |= composer.changed(paddingValues) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(960654418, i, -1, "com.robinhood.android.optionsupgrade.rhsg.ComposableSingletons$RhsgCarTestQuestionnaireFragmentKt.lambda$960654418.<anonymous> (RhsgCarTestQuestionnaireFragment.kt:95)");
            }
            LoadingScreenComposablesKt.GenericLoadingScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), false, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1828448125$feature_options_upgrade_externalDebug() {
        return lambda$1828448125;
    }

    public final Function2<Composer, Integer, Unit> getLambda$360446832$feature_options_upgrade_externalDebug() {
        return lambda$360446832;
    }

    public final Function3<PaddingValues, Composer, Integer, Unit> getLambda$960654418$feature_options_upgrade_externalDebug() {
        return lambda$960654418;
    }
}
