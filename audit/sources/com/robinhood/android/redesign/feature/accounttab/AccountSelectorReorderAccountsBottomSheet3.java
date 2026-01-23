package com.robinhood.android.redesign.feature.accounttab;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSelectorReorderAccountsBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.redesign.feature.accounttab.ComposableSingletons$AccountSelectorReorderAccountsBottomSheetKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class AccountSelectorReorderAccountsBottomSheet3 {
    public static final AccountSelectorReorderAccountsBottomSheet3 INSTANCE = new AccountSelectorReorderAccountsBottomSheet3();

    /* renamed from: lambda$-1957854472, reason: not valid java name */
    private static Function6<LazyItemScope, AccountTabInfo.Account, Integer, Boolean, Composer, Integer, Unit> f9192lambda$1957854472 = ComposableLambda3.composableLambdaInstance(-1957854472, false, new Function6<LazyItemScope, AccountTabInfo.Account, Integer, Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.android.redesign.feature.accounttab.ComposableSingletons$AccountSelectorReorderAccountsBottomSheetKt$lambda$-1957854472$1
        @Override // kotlin.jvm.functions.Function6
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, AccountTabInfo.Account account, Integer num, Boolean bool, Composer composer, Integer num2) {
            invoke(lazyItemScope, account, num.intValue(), bool.booleanValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope reorderableItems, AccountTabInfo.Account tab, int i, boolean z, Composer composer, int i2) {
            int i3;
            Intrinsics.checkNotNullParameter(reorderableItems, "$this$reorderableItems");
            Intrinsics.checkNotNullParameter(tab, "tab");
            if ((i2 & 48) == 0) {
                i3 = ((i2 & 64) == 0 ? composer.changed(tab) : composer.changedInstance(tab) ? 32 : 16) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 3072) == 0) {
                i3 |= composer.changed(z) ? 2048 : 1024;
            }
            if ((i3 & 9233) == 9232 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1957854472, i3, -1, "com.robinhood.android.redesign.feature.accounttab.ComposableSingletons$AccountSelectorReorderAccountsBottomSheetKt.lambda$-1957854472.<anonymous> (AccountSelectorReorderAccountsBottomSheet.kt:117)");
            }
            AccountSelectorReorderAccountsBottomSheet.ListItem(tab, z, false, composer, ((i3 >> 6) & 112) | AccountTabInfo.Account.$stable | 384 | ((i3 >> 3) & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1957854472$feature_account_selector_externalRelease, reason: not valid java name */
    public final Function6<LazyItemScope, AccountTabInfo.Account, Integer, Boolean, Composer, Integer, Unit> m17950getLambda$1957854472$feature_account_selector_externalRelease() {
        return f9192lambda$1957854472;
    }
}
