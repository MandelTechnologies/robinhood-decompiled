package com.robinhood.android.redesign.feature.accounttab;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AccountSelectorComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
final class AccountSelectorComposableKt$AccountSelectorComposable$15$2$2$6 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ ImmutableList<AccountTabInfo.Account> $accountTabInfo;
    final /* synthetic */ SnapshotState<Boolean> $allowHorizontalPaging$delegate;
    final /* synthetic */ FragmentManager $fragmentManager;
    final /* synthetic */ boolean $innerScrollActive;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ AccountSelectorTabNestedScrollConnection $tabScrollConnection;

    AccountSelectorComposableKt$AccountSelectorComposable$15$2$2$6(PagerState pagerState, ImmutableList<AccountTabInfo.Account> immutableList, boolean z, AccountSelectorTabNestedScrollConnection accountSelectorTabNestedScrollConnection, FragmentManager fragmentManager, SnapshotState<Boolean> snapshotState) {
        this.$pagerState = pagerState;
        this.$accountTabInfo = immutableList;
        this.$innerScrollActive = z;
        this.$tabScrollConnection = accountSelectorTabNestedScrollConnection;
        this.$fragmentManager = fragmentManager;
        this.$allowHorizontalPaging$delegate = snapshotState;
    }

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
            ComposerKt.traceEventStart(1489705540, i, -1, "com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccountSelectorComposable.kt:911)");
        }
        PagerState pagerState = this.$pagerState;
        ImmutableList<AccountTabInfo.Account> immutableList = this.$accountTabInfo;
        boolean z = this.$innerScrollActive;
        boolean zAccountSelectorComposable$lambda$15 = AccountSelectorComposableKt.AccountSelectorComposable$lambda$15(this.$allowHorizontalPaging$delegate);
        AccountSelectorTabNestedScrollConnection accountSelectorTabNestedScrollConnection = this.$tabScrollConnection;
        FragmentManager fragmentManager = this.$fragmentManager;
        composer.startReplaceGroup(5004770);
        final SnapshotState<Boolean> snapshotState = this.$allowHorizontalPaging$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$2$6$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountSelectorComposableKt$AccountSelectorComposable$15$2$2$6.invoke$lambda$1$lambda$0(snapshotState, ((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        AccountSelectorComposableKt.HorizontalPager(pagerState, immutableList, z, zAccountSelectorComposable$lambda$15, accountSelectorTabNestedScrollConnection, fragmentManager, (Function1) objRememberedValue, composer, (AccountTabInfo.Account.$stable << 3) | 1572864, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, boolean z) {
        AccountSelectorComposableKt.AccountSelectorComposable$lambda$16(snapshotState, z);
        return Unit.INSTANCE;
    }
}
