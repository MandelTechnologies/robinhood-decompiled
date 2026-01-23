package com.robinhood.android.redesign.feature.accounttab;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountSelectorComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$2$1", m3645f = "AccountSelectorComposable.kt", m3646l = {420, 422}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class AccountSelectorComposableKt$AccountSelectorComposable$2$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ImmutableList<AccountTabInfo.Account> $accountTabInfo;
    final /* synthetic */ boolean $accountsLoading;
    final /* synthetic */ SnapshotState<String> $defaultSelectedTabId$delegate;
    final /* synthetic */ SnapshotState<Boolean> $hasRestoredPreviouslySelectedTab$delegate;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ ImmutableMap<String, Integer> $tabInfoIndexMap;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSelectorComposableKt$AccountSelectorComposable$2$1(boolean z, ImmutableMap<String, Integer> immutableMap, PagerState pagerState, ImmutableList<AccountTabInfo.Account> immutableList, SnapshotState<String> snapshotState, SnapshotState<Boolean> snapshotState2, Continuation<? super AccountSelectorComposableKt$AccountSelectorComposable$2$1> continuation) {
        super(2, continuation);
        this.$accountsLoading = z;
        this.$tabInfoIndexMap = immutableMap;
        this.$pagerState = pagerState;
        this.$accountTabInfo = immutableList;
        this.$defaultSelectedTabId$delegate = snapshotState;
        this.$hasRestoredPreviouslySelectedTab$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountSelectorComposableKt$AccountSelectorComposable$2$1(this.$accountsLoading, this.$tabInfoIndexMap, this.$pagerState, this.$accountTabInfo, this.$defaultSelectedTabId$delegate, this.$hasRestoredPreviouslySelectedTab$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountSelectorComposableKt$AccountSelectorComposable$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (androidx.compose.foundation.pager.PagerState.scrollToPage$default(r4, r5, 0.0f, r7, 2, null) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (androidx.compose.foundation.pager.PagerState.scrollToPage$default(r4, 0, 0.0f, r7, 2, null) == r0) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AccountSelectorComposableKt$AccountSelectorComposable$2$1 accountSelectorComposableKt$AccountSelectorComposable$2$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (AccountSelectorComposableKt.AccountSelectorComposable$lambda$23(this.$defaultSelectedTabId$delegate) != null && !AccountSelectorComposableKt.AccountSelectorComposable$lambda$35(this.$hasRestoredPreviouslySelectedTab$delegate) && !this.$accountsLoading && !this.$tabInfoIndexMap.isEmpty()) {
                Integer num = this.$tabInfoIndexMap.get(AccountSelectorComposableKt.AccountSelectorComposable$lambda$23(this.$defaultSelectedTabId$delegate));
                int iIntValue = num != null ? num.intValue() : -1;
                if (iIntValue >= 0) {
                    PagerState pagerState = this.$pagerState;
                    this.label = 1;
                    accountSelectorComposableKt$AccountSelectorComposable$2$1 = this;
                } else {
                    accountSelectorComposableKt$AccountSelectorComposable$2$1 = this;
                    PagerState pagerState2 = accountSelectorComposableKt$AccountSelectorComposable$2$1.$pagerState;
                    accountSelectorComposableKt$AccountSelectorComposable$2$1.label = 2;
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (i == 1) {
            ResultKt.throwOnFailure(obj);
            accountSelectorComposableKt$AccountSelectorComposable$2$1 = this;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            accountSelectorComposableKt$AccountSelectorComposable$2$1 = this;
            SnapshotState<String> snapshotState = accountSelectorComposableKt$AccountSelectorComposable$2$1.$defaultSelectedTabId$delegate;
            AccountTabInfo.Account account = (AccountTabInfo.Account) CollectionsKt.firstOrNull((List) accountSelectorComposableKt$AccountSelectorComposable$2$1.$accountTabInfo);
            snapshotState.setValue(account != null ? account.getId() : null);
        }
        AccountSelectorComposableKt.AccountSelectorComposable$lambda$36(accountSelectorComposableKt$AccountSelectorComposable$2$1.$hasRestoredPreviouslySelectedTab$delegate, true);
        return Unit.INSTANCE;
    }
}
