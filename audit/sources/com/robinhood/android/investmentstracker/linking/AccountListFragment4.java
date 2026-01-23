package com.robinhood.android.investmentstracker.linking;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerAddAccountItem4;
import com.robinhood.android.investmentstracker.linking.models.AccountListViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountListFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investmentstracker.linking.AccountListFragment$ComposeContent$1$1$2$1$1$2, reason: use source file name */
/* loaded from: classes10.dex */
final class AccountListFragment4 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState4<AccountListViewState> $viewState$delegate;
    final /* synthetic */ AccountListFragment this$0;

    AccountListFragment4(AccountListFragment accountListFragment, SnapshotState4<AccountListViewState> snapshotState4) {
        this.this$0 = accountListFragment;
        this.$viewState$delegate = snapshotState4;
    }

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
            ComposerKt.traceEventStart(1745344640, i, -1, "com.robinhood.android.investmentstracker.linking.AccountListFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccountListFragment.kt:186)");
        }
        AccountListViewState accountListViewStateComposeContent$lambda$0 = AccountListFragment.ComposeContent$lambda$0(this.$viewState$delegate);
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.this$0);
        final AccountListFragment accountListFragment = this.this$0;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.investmentstracker.linking.AccountListFragment$ComposeContent$1$1$2$1$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountListFragment4.invoke$lambda$1$lambda$0(accountListFragment);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        InvestmentsTrackerAddAccountItem4.InvestmentsTrackerAddAccountItem(accountListViewStateComposeContent$lambda$0, (Function0) objRememberedValue, null, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(AccountListFragment accountListFragment) {
        accountListFragment.getDuxo().startPlaidWithChecks();
        return Unit.INSTANCE;
    }
}
