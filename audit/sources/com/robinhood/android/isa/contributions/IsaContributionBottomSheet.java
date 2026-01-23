package com.robinhood.android.isa.contributions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: IsaContributionBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.isa.contributions.ComposableSingletons$IsaContributionBottomSheetKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class IsaContributionBottomSheet {
    public static final IsaContributionBottomSheet INSTANCE = new IsaContributionBottomSheet();

    /* renamed from: lambda$-999996742, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9084lambda$999996742 = ComposableLambda3.composableLambdaInstance(-999996742, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.isa.contributions.ComposableSingletons$IsaContributionBottomSheetKt$lambda$-999996742$1
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
                ComposerKt.traceEventStart(-999996742, i, -1, "com.robinhood.android.isa.contributions.ComposableSingletons$IsaContributionBottomSheetKt.lambda$-999996742.<anonymous> (IsaContributionBottomSheet.kt:83)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            IsaContributionBottomSheet4.m15714IsaContributionRowStartIconKlgxPg(bentoTheme.getColors(composer, i2).m21456getPositive0d7_KjU(), bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1257848497 = ComposableLambda3.composableLambdaInstance(1257848497, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.isa.contributions.ComposableSingletons$IsaContributionBottomSheetKt$lambda$1257848497$1
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
                ComposerKt.traceEventStart(1257848497, i, -1, "com.robinhood.android.isa.contributions.ComposableSingletons$IsaContributionBottomSheetKt.lambda$1257848497.<anonymous> (IsaContributionBottomSheet.kt:94)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            IsaContributionBottomSheet4.m15714IsaContributionRowStartIconKlgxPg(bentoTheme.getColors(composer, i2).m21372getBg20d7_KjU(), bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-999996742$lib_isa_contributions_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15712getLambda$999996742$lib_isa_contributions_externalDebug() {
        return f9084lambda$999996742;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1257848497$lib_isa_contributions_externalDebug() {
        return lambda$1257848497;
    }
}
