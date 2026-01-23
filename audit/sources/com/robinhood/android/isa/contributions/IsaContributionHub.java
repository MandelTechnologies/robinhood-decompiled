package com.robinhood.android.isa.contributions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: IsaContributionHub.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.isa.contributions.ComposableSingletons$IsaContributionHubKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class IsaContributionHub {
    public static final IsaContributionHub INSTANCE = new IsaContributionHub();

    /* renamed from: lambda$-901338902, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9085lambda$901338902 = ComposableLambda3.composableLambdaInstance(-901338902, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.isa.contributions.ComposableSingletons$IsaContributionHubKt$lambda$-901338902$1
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
                ComposerKt.traceEventStart(-901338902, i, -1, "com.robinhood.android.isa.contributions.ComposableSingletons$IsaContributionHubKt.lambda$-901338902.<anonymous> (IsaContributionHub.kt:98)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-901338902$lib_isa_contributions_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15713getLambda$901338902$lib_isa_contributions_externalDebug() {
        return f9085lambda$901338902;
    }
}
