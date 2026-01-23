package com.robinhood.android.redesign.feature.accounttab;

import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.redesign.accounttab.duxo.AccountSelectorViewState;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountSelectorComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$2$7$1", m3645f = "AccountSelectorComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class AccountSelectorComposableKt$AccountSelectorComposable$15$2$2$7$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AccountTabDuxo $accountTabDuxo;
    final /* synthetic */ FragmentManager $fragmentManager;
    final /* synthetic */ SnapshotState<AccountTabInfo> $lastSelectedTabInfoBeforeReorder$delegate;
    final /* synthetic */ SnapshotState<Boolean> $needsFragmentReset$delegate;
    final /* synthetic */ SnapshotState<AccountTabInfo> $selectedTabInfo$delegate;
    final /* synthetic */ SnapshotState<Boolean> $showReorderBottomSheet$delegate;
    final /* synthetic */ SnapshotState4<AccountSelectorViewState> $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSelectorComposableKt$AccountSelectorComposable$15$2$2$7$1(FragmentManager fragmentManager, SnapshotState<Boolean> snapshotState, SnapshotState<AccountTabInfo> snapshotState2, SnapshotState<AccountTabInfo> snapshotState3, SnapshotState4<AccountSelectorViewState> snapshotState4, AccountTabDuxo accountTabDuxo, SnapshotState<Boolean> snapshotState5, Continuation<? super AccountSelectorComposableKt$AccountSelectorComposable$15$2$2$7$1> continuation) {
        super(2, continuation);
        this.$fragmentManager = fragmentManager;
        this.$showReorderBottomSheet$delegate = snapshotState;
        this.$selectedTabInfo$delegate = snapshotState2;
        this.$lastSelectedTabInfoBeforeReorder$delegate = snapshotState3;
        this.$viewState$delegate = snapshotState4;
        this.$accountTabDuxo = accountTabDuxo;
        this.$needsFragmentReset$delegate = snapshotState5;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountSelectorComposableKt$AccountSelectorComposable$15$2$2$7$1(this.$fragmentManager, this.$showReorderBottomSheet$delegate, this.$selectedTabInfo$delegate, this.$lastSelectedTabInfoBeforeReorder$delegate, this.$viewState$delegate, this.$accountTabDuxo, this.$needsFragmentReset$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountSelectorComposableKt$AccountSelectorComposable$15$2$2$7$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (AccountSelectorComposableKt.AccountSelectorComposable$lambda$47(this.$showReorderBottomSheet$delegate)) {
                this.$lastSelectedTabInfoBeforeReorder$delegate.setValue(AccountSelectorComposableKt.AccountSelectorComposable$lambda$26(this.$selectedTabInfo$delegate));
                if (this.$fragmentManager.findFragmentByTag(AccountSelectorComposableKt.ACCOUNT_SELECTOR_REORDER_BOTTOM_SHEET) == null) {
                    AccountSelectorReorderBottomSheetFragment accountSelectorReorderBottomSheetFragment = new AccountSelectorReorderBottomSheetFragment();
                    SnapshotState4<AccountSelectorViewState> snapshotState4 = this.$viewState$delegate;
                    final AccountTabDuxo accountTabDuxo = this.$accountTabDuxo;
                    final SnapshotState<Boolean> snapshotState = this.$needsFragmentReset$delegate;
                    final SnapshotState<Boolean> snapshotState2 = this.$showReorderBottomSheet$delegate;
                    accountSelectorReorderBottomSheetFragment.provideData(AccountSelectorComposableKt.AccountSelectorComposable$lambda$0(snapshotState4).getAccountTabs(), new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$2$7$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AccountSelectorComposableKt$AccountSelectorComposable$15$2$2$7$1.invokeSuspend$lambda$2$lambda$0(accountTabDuxo, snapshotState, (List) obj2);
                        }
                    }, new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$2$7$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountSelectorComposableKt$AccountSelectorComposable$15$2$2$7$1.invokeSuspend$lambda$2$lambda$1(snapshotState2);
                        }
                    });
                    accountSelectorReorderBottomSheetFragment.show(this.$fragmentManager, AccountSelectorComposableKt.ACCOUNT_SELECTOR_REORDER_BOTTOM_SHEET);
                }
            } else {
                Fragment fragmentFindFragmentByTag = this.$fragmentManager.findFragmentByTag(AccountSelectorComposableKt.ACCOUNT_SELECTOR_REORDER_BOTTOM_SHEET);
                if (fragmentFindFragmentByTag instanceof AccountSelectorReorderBottomSheetFragment) {
                    ((AccountSelectorReorderBottomSheetFragment) fragmentFindFragmentByTag).dismiss();
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$0(AccountTabDuxo accountTabDuxo, SnapshotState snapshotState, List list) {
        AccountSelectorComposableKt.AccountSelectorComposable$lambda$51(snapshotState, true);
        accountTabDuxo.onAccountTabsReordered(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$1(SnapshotState snapshotState) {
        AccountSelectorComposableKt.AccountSelectorComposable$lambda$48(snapshotState, false);
        return Unit.INSTANCE;
    }
}
