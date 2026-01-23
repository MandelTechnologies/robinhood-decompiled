package com.robinhood.shared.education.p377ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: EducationSeriesLessonsCarousel.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.education.ui.ComposableSingletons$EducationSeriesLessonsCarouselKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class EducationSeriesLessonsCarousel {
    public static final EducationSeriesLessonsCarousel INSTANCE = new EducationSeriesLessonsCarousel();

    /* renamed from: lambda$-171233948, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9451lambda$171233948 = ComposableLambda3.composableLambdaInstance(-171233948, false, EducationSeriesLessonsCarousel2.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$1295923228 = ComposableLambda3.composableLambdaInstance(1295923228, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.ui.ComposableSingletons$EducationSeriesLessonsCarouselKt$lambda$1295923228$1
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
                ComposerKt.traceEventStart(1295923228, i, -1, "com.robinhood.shared.education.ui.ComposableSingletons$EducationSeriesLessonsCarouselKt.lambda$1295923228.<anonymous> (EducationSeriesLessonsCarousel.kt:218)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, EducationSeriesLessonsCarousel.INSTANCE.m25341getLambda$171233948$lib_education_externalDebug(), composer, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-171233948$lib_education_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25341getLambda$171233948$lib_education_externalDebug() {
        return f9451lambda$171233948;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1295923228$lib_education_externalDebug() {
        return lambda$1295923228;
    }
}
