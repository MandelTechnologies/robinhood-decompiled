package com.robinhood.android.matchrateselection.matchagreements;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchAgreementsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matchrateselection.matchagreements.ComposableSingletons$MatchAgreementsFragmentKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MatchAgreementsFragment2 {
    public static final MatchAgreementsFragment2 INSTANCE = new MatchAgreementsFragment2();
    private static Function3<Modifier, Composer, Integer, Unit> lambda$1540493316 = ComposableLambda3.composableLambdaInstance(1540493316, false, new Function3<Modifier, Composer, Integer, Unit>() { // from class: com.robinhood.android.matchrateselection.matchagreements.ComposableSingletons$MatchAgreementsFragmentKt$lambda$1540493316$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
            invoke(modifier, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Modifier modifier, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(modifier, "modifier");
            if ((i & 6) == 0) {
                i |= composer.changed(modifier) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1540493316, i, -1, "com.robinhood.android.matchrateselection.matchagreements.ComposableSingletons$MatchAgreementsFragmentKt.lambda$1540493316.<anonymous> (MatchAgreementsFragment.kt:85)");
            }
            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(modifier, null, true, false, composer, (i & 14) | 3456, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<Modifier, Composer, Integer, Unit> getLambda$1540493316$feature_match_rate_selection_externalDebug() {
        return lambda$1540493316;
    }
}
