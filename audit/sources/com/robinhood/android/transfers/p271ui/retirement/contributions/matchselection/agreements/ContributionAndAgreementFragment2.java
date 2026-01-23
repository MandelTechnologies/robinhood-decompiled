package com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.agreements;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContributionAndAgreementFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ComposableSingletons$ContributionAndAgreementFragmentKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ContributionAndAgreementFragment2 {
    public static final ContributionAndAgreementFragment2 INSTANCE = new ContributionAndAgreementFragment2();

    /* renamed from: lambda$-560629241, reason: not valid java name */
    private static Function3<Modifier, Composer, Integer, Unit> f9294lambda$560629241 = ComposableLambda3.composableLambdaInstance(-560629241, false, new Function3<Modifier, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ComposableSingletons$ContributionAndAgreementFragmentKt$lambda$-560629241$1
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
                ComposerKt.traceEventStart(-560629241, i, -1, "com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ComposableSingletons$ContributionAndAgreementFragmentKt.lambda$-560629241.<anonymous> (ContributionAndAgreementFragment.kt:121)");
            }
            LoadingScreenComposablesKt.ListLoadingScreenComposable(modifier, true, false, 2, composer, (i & 14) | 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-560629241$feature_transfers_externalRelease, reason: not valid java name */
    public final Function3<Modifier, Composer, Integer, Unit> m19944getLambda$560629241$feature_transfers_externalRelease() {
        return f9294lambda$560629241;
    }
}
