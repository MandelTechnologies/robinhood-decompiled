package com.robinhood.android.redesign.feature.accounttab;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import com.robinhood.android.redesign.accounttab.scrollstate.AccountSelectorScrollable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountSelectorComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$6$1", m3645f = "AccountSelectorComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class AccountSelectorComposableKt$AccountSelectorComposable$6$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AccountTabDuxo $accountTabDuxo;
    final /* synthetic */ ImmutableList<AccountTabInfo.Account> $accountTabInfo;
    final /* synthetic */ boolean $accountsLoading;
    final /* synthetic */ SnapshotState<Boolean> $forceDarkMode$delegate;
    final /* synthetic */ Function1<String, Unit> $onCurrentTabChanged;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ ImmutableMap<String, AccountSelectorScrollable> $scrollableStateCache;
    final /* synthetic */ SnapshotState<AccountTabInfo> $selectedTabInfo$delegate;
    final /* synthetic */ SnapshotState<AccountSelectorScrollable> $selectedTabScrollableState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AccountSelectorComposableKt$AccountSelectorComposable$6$1(PagerState pagerState, ImmutableList<AccountTabInfo.Account> immutableList, boolean z, ImmutableMap<String, ? extends AccountSelectorScrollable> immutableMap, AccountTabDuxo accountTabDuxo, Function1<? super String, Unit> function1, SnapshotState<AccountTabInfo> snapshotState, SnapshotState<AccountSelectorScrollable> snapshotState2, SnapshotState<Boolean> snapshotState3, Continuation<? super AccountSelectorComposableKt$AccountSelectorComposable$6$1> continuation) {
        super(2, continuation);
        this.$pagerState = pagerState;
        this.$accountTabInfo = immutableList;
        this.$accountsLoading = z;
        this.$scrollableStateCache = immutableMap;
        this.$accountTabDuxo = accountTabDuxo;
        this.$onCurrentTabChanged = function1;
        this.$selectedTabInfo$delegate = snapshotState;
        this.$selectedTabScrollableState$delegate = snapshotState2;
        this.$forceDarkMode$delegate = snapshotState3;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountSelectorComposableKt$AccountSelectorComposable$6$1(this.$pagerState, this.$accountTabInfo, this.$accountsLoading, this.$scrollableStateCache, this.$accountTabDuxo, this.$onCurrentTabChanged, this.$selectedTabInfo$delegate, this.$selectedTabScrollableState$delegate, this.$forceDarkMode$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountSelectorComposableKt$AccountSelectorComposable$6$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$pagerState.getCurrentPage() < 0 || this.$pagerState.getCurrentPage() >= this.$accountTabInfo.size() || this.$accountsLoading) {
            return Unit.INSTANCE;
        }
        AccountTabInfo.Account account = (AccountTabInfo.Account) CollectionsKt.getOrNull(this.$accountTabInfo, this.$pagerState.getCurrentPage());
        if (account == null) {
            return Unit.INSTANCE;
        }
        this.$selectedTabInfo$delegate.setValue(account);
        this.$selectedTabScrollableState$delegate.setValue(this.$scrollableStateCache.get(account.getId()));
        AccountSelectorComposableKt.AccountSelectorComposable$lambda$33(this.$forceDarkMode$delegate, account.getForceDarkMode());
        AccountTabDuxo accountTabDuxo = this.$accountTabDuxo;
        AccountTabInfo accountTabInfoAccountSelectorComposable$lambda$26 = AccountSelectorComposableKt.AccountSelectorComposable$lambda$26(this.$selectedTabInfo$delegate);
        accountTabDuxo.saveSelectedTabId(accountTabInfoAccountSelectorComposable$lambda$26 != null ? accountTabInfoAccountSelectorComposable$lambda$26.getId() : null);
        Function1<String, Unit> function1 = this.$onCurrentTabChanged;
        if (function1 != null) {
            AccountTabInfo accountTabInfoAccountSelectorComposable$lambda$262 = AccountSelectorComposableKt.AccountSelectorComposable$lambda$26(this.$selectedTabInfo$delegate);
            function1.invoke(accountTabInfoAccountSelectorComposable$lambda$262 != null ? accountTabInfoAccountSelectorComposable$lambda$262.getId() : null);
        }
        return Unit.INSTANCE;
    }
}
