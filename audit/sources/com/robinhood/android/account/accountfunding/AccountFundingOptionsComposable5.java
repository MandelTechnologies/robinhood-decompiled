package com.robinhood.android.account.accountfunding;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AccountFundingOptionsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.account.accountfunding.ComposableSingletons$AccountFundingOptionsComposableKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AccountFundingOptionsComposable5 {
    public static final AccountFundingOptionsComposable5 INSTANCE = new AccountFundingOptionsComposable5();

    /* renamed from: lambda$-1765793712, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8616lambda$1765793712 = ComposableLambda3.composableLambdaInstance(-1765793712, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.account.accountfunding.ComposableSingletons$AccountFundingOptionsComposableKt$lambda$-1765793712$1
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
                ComposerKt.traceEventStart(-1765793712, i, -1, "com.robinhood.android.account.accountfunding.ComposableSingletons$AccountFundingOptionsComposableKt.lambda$-1765793712.<anonymous> (AccountFundingOptionsComposable.kt:34)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1765793712$feature_account_funding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10785getLambda$1765793712$feature_account_funding_externalDebug() {
        return f8616lambda$1765793712;
    }
}
