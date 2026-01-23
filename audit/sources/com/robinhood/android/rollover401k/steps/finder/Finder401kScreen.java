package com.robinhood.android.rollover401k.steps.finder;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.models.retirement.p194db.NoResultsViewModel;
import com.robinhood.android.models.retirement.p194db.Retirement401kFinderResult;
import com.robinhood.android.models.retirement.p194db.Retirement401kFinderResultsViewmodel;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Finder401kScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rollover401k.steps.finder.ComposableSingletons$Finder401kScreenKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class Finder401kScreen {
    public static final Finder401kScreen INSTANCE = new Finder401kScreen();

    /* renamed from: lambda$-1217614292, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9236lambda$1217614292 = ComposableLambda3.composableLambdaInstance(-1217614292, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.finder.ComposableSingletons$Finder401kScreenKt$lambda$-1217614292$1
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
                ComposerKt.traceEventStart(-1217614292, i, -1, "com.robinhood.android.rollover401k.steps.finder.ComposableSingletons$Finder401kScreenKt.lambda$-1217614292.<anonymous> (Finder401kScreen.kt:63)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1383405845 = ComposableLambda3.composableLambdaInstance(1383405845, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.finder.ComposableSingletons$Finder401kScreenKt$lambda$1383405845$1
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
                ComposerKt.traceEventStart(1383405845, i, -1, "com.robinhood.android.rollover401k.steps.finder.ComposableSingletons$Finder401kScreenKt.lambda$1383405845.<anonymous> (Finder401kScreen.kt:236)");
            }
            Finder401kScreen8.FinderResults(new Retirement401kFinderResultsViewmodel(0, "title string", "subtitle string", "button text", CollectionsKt.listOf(new Retirement401kFinderResult("Test", "", "", "Connect to see details", null)), new NoResultsViewModel("", "text", "", ""), 1, null), new Finder401kScreen7() { // from class: com.robinhood.android.rollover401k.steps.finder.ComposableSingletons$Finder401kScreenKt$lambda$1383405845$1.1
                @Override // com.robinhood.android.rollover401k.steps.finder.Finder401kScreen7
                public void onInstitutionSelected(String plaidInstitutionId, String name) {
                    Intrinsics.checkNotNullParameter(name, "name");
                }

                @Override // com.robinhood.android.rollover401k.steps.finder.Finder401kScreen7
                public void onNoResultsCtaTapped() {
                }
            }, null, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-762813302, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9237lambda$762813302 = ComposableLambda3.composableLambdaInstance(-762813302, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.finder.ComposableSingletons$Finder401kScreenKt$lambda$-762813302$1
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
                ComposerKt.traceEventStart(-762813302, i, -1, "com.robinhood.android.rollover401k.steps.finder.ComposableSingletons$Finder401kScreenKt.lambda$-762813302.<anonymous> (Finder401kScreen.kt:235)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(Finder401kScreen.INSTANCE.getLambda$1383405845$feature_rollover_401k_externalDebug(), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1307771604 = ComposableLambda3.composableLambdaInstance(1307771604, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.finder.ComposableSingletons$Finder401kScreenKt$lambda$1307771604$1
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
                ComposerKt.traceEventStart(1307771604, i, -1, "com.robinhood.android.rollover401k.steps.finder.ComposableSingletons$Finder401kScreenKt.lambda$1307771604.<anonymous> (Finder401kScreen.kt:273)");
            }
            Finder401kScreen8.NoFinderResults(new NoResultsViewModel("", "We didnt find any results", "But you can continue to explore other ways to save for retirement with Robinhood.", "Search again"), new Finder401kScreen7() { // from class: com.robinhood.android.rollover401k.steps.finder.ComposableSingletons$Finder401kScreenKt$lambda$1307771604$1.1
                @Override // com.robinhood.android.rollover401k.steps.finder.Finder401kScreen7
                public void onInstitutionSelected(String plaidInstitutionId, String name) {
                    Intrinsics.checkNotNullParameter(name, "name");
                }

                @Override // com.robinhood.android.rollover401k.steps.finder.Finder401kScreen7
                public void onNoResultsCtaTapped() {
                }
            }, null, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$375473417 = ComposableLambda3.composableLambdaInstance(375473417, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.finder.ComposableSingletons$Finder401kScreenKt$lambda$375473417$1
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
                ComposerKt.traceEventStart(375473417, i, -1, "com.robinhood.android.rollover401k.steps.finder.ComposableSingletons$Finder401kScreenKt.lambda$375473417.<anonymous> (Finder401kScreen.kt:272)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(Finder401kScreen.INSTANCE.getLambda$1307771604$feature_rollover_401k_externalDebug(), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1217614292$feature_rollover_401k_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m18441getLambda$1217614292$feature_rollover_401k_externalDebug() {
        return f9236lambda$1217614292;
    }

    /* renamed from: getLambda$-762813302$feature_rollover_401k_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m18442getLambda$762813302$feature_rollover_401k_externalDebug() {
        return f9237lambda$762813302;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1307771604$feature_rollover_401k_externalDebug() {
        return lambda$1307771604;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1383405845$feature_rollover_401k_externalDebug() {
        return lambda$1383405845;
    }

    public final Function2<Composer, Integer, Unit> getLambda$375473417$feature_rollover_401k_externalDebug() {
        return lambda$375473417;
    }
}
