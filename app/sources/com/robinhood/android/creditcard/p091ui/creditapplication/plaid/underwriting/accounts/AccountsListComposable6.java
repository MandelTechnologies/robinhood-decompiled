package com.robinhood.android.creditcard.p091ui.creditapplication.plaid.underwriting.accounts;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountsListComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.ComposableSingletons$AccountsListComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class AccountsListComposable6 {
    public static final AccountsListComposable6 INSTANCE = new AccountsListComposable6();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1447768532 = ComposableLambda3.composableLambdaInstance(1447768532, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.ComposableSingletons$AccountsListComposableKt$lambda$1447768532$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1447768532, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.ComposableSingletons$AccountsListComposableKt.lambda$1447768532.<anonymous> (AccountsListComposable.kt:46)");
            }
            AccountListHeaderComposable.AccountListHeader(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1447768532$feature_credit_card_externalDebug() {
        return lambda$1447768532;
    }
}
