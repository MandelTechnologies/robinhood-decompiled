package com.robinhood.android.individualaccounts.onboarding.outro;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AccountConfirmedScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.individualaccounts.onboarding.outro.ComposableSingletons$AccountConfirmedScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class AccountConfirmedScreen3 {
    public static final AccountConfirmedScreen3 INSTANCE = new AccountConfirmedScreen3();

    /* renamed from: lambda$-924172884, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9033lambda$924172884 = ComposableLambda3.composableLambdaInstance(-924172884, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.ComposableSingletons$AccountConfirmedScreenKt$lambda$-924172884$1
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
                ComposerKt.traceEventStart(-924172884, i, -1, "com.robinhood.android.individualaccounts.onboarding.outro.ComposableSingletons$AccountConfirmedScreenKt.lambda$-924172884.<anonymous> (AccountConfirmedScreen.kt:69)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-924172884$feature_individual_account_onboarding_externalDebug */
    public final Function2<Composer, Integer, Unit> m2061x613338c() {
        return f9033lambda$924172884;
    }
}
