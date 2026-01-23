package com.robinhood.android.redesign.feature.accounttab;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.SnapshotState;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorFragmentKiller;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: AccountSelectorComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$5$1", m3645f = "AccountSelectorComposable.kt", m3646l = {465, 470}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class AccountSelectorComposableKt$AccountSelectorComposable$5$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ImmutableList<AccountTabInfo.Account> $accountTabInfo;
    final /* synthetic */ FragmentManager $fragmentManager;
    final /* synthetic */ SnapshotState<AccountTabInfo> $lastSelectedTabInfoBeforeReorder$delegate;
    final /* synthetic */ SnapshotState<Boolean> $needsFragmentReset$delegate;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ SnapshotState<Boolean> $showReorderBottomSheet$delegate;
    final /* synthetic */ ImmutableMap<String, Integer> $tabInfoIndexMap;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSelectorComposableKt$AccountSelectorComposable$5$1(ImmutableList<AccountTabInfo.Account> immutableList, FragmentManager fragmentManager, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, SnapshotState<AccountTabInfo> snapshotState3, ImmutableMap<String, Integer> immutableMap, PagerState pagerState, Continuation<? super AccountSelectorComposableKt$AccountSelectorComposable$5$1> continuation) {
        super(2, continuation);
        this.$accountTabInfo = immutableList;
        this.$fragmentManager = fragmentManager;
        this.$showReorderBottomSheet$delegate = snapshotState;
        this.$needsFragmentReset$delegate = snapshotState2;
        this.$lastSelectedTabInfoBeforeReorder$delegate = snapshotState3;
        this.$tabInfoIndexMap = immutableMap;
        this.$pagerState = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountSelectorComposableKt$AccountSelectorComposable$5$1(this.$accountTabInfo, this.$fragmentManager, this.$showReorderBottomSheet$delegate, this.$needsFragmentReset$delegate, this.$lastSelectedTabInfoBeforeReorder$delegate, this.$tabInfoIndexMap, this.$pagerState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountSelectorComposableKt$AccountSelectorComposable$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (androidx.compose.foundation.pager.PagerState.scrollToPage$default(r3, r4, 0.0f, r6, 2, null) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String id;
        AccountSelectorComposableKt$AccountSelectorComposable$5$1 accountSelectorComposableKt$AccountSelectorComposable$5$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!AccountSelectorComposableKt.AccountSelectorComposable$lambda$47(this.$showReorderBottomSheet$delegate) && AccountSelectorComposableKt.AccountSelectorComposable$lambda$50(this.$needsFragmentReset$delegate)) {
                AccountSelectorFragmentKiller.killAllFragments(this.$accountTabInfo, this.$fragmentManager);
                this.label = 1;
                if (DelayKt.delay(100L, this) == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            accountSelectorComposableKt$AccountSelectorComposable$5$1 = this;
            AccountSelectorComposableKt.AccountSelectorComposable$lambda$51(accountSelectorComposableKt$AccountSelectorComposable$5$1.$needsFragmentReset$delegate, false);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        AccountTabInfo accountTabInfoAccountSelectorComposable$lambda$53 = AccountSelectorComposableKt.AccountSelectorComposable$lambda$53(this.$lastSelectedTabInfoBeforeReorder$delegate);
        if (accountTabInfoAccountSelectorComposable$lambda$53 == null || (id = accountTabInfoAccountSelectorComposable$lambda$53.getId()) == null) {
            accountSelectorComposableKt$AccountSelectorComposable$5$1 = this;
            AccountSelectorComposableKt.AccountSelectorComposable$lambda$51(accountSelectorComposableKt$AccountSelectorComposable$5$1.$needsFragmentReset$delegate, false);
        } else {
            ImmutableMap<String, Integer> immutableMap = this.$tabInfoIndexMap;
            PagerState pagerState = this.$pagerState;
            Integer num = immutableMap.get(id);
            if (num != null) {
                int iIntValue = num.intValue();
                this.label = 2;
                accountSelectorComposableKt$AccountSelectorComposable$5$1 = this;
            }
            AccountSelectorComposableKt.AccountSelectorComposable$lambda$51(accountSelectorComposableKt$AccountSelectorComposable$5$1.$needsFragmentReset$delegate, false);
        }
        return Unit.INSTANCE;
    }
}
