package com.robinhood.android.redesign.feature.accounttab;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import java.util.Collection;
import java.util.List;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountSelectorReorderAccountsBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesign.feature.accounttab.AccountSelectorReorderAccountsBottomSheetKt$AccountSelectorReorderAccountsBottomSheet$reorderListState$1$1$1", m3645f = "AccountSelectorReorderAccountsBottomSheet.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.redesign.feature.accounttab.AccountSelectorReorderAccountsBottomSheetKt$AccountSelectorReorderAccountsBottomSheet$reorderListState$1$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class AccountSelectorReorderAccountsBottomSheet2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<AccountTabInfo.Account> $lockedAccounts;
    final /* synthetic */ List<AccountTabInfo.Account> $newTabs;
    final /* synthetic */ Function1<List<AccountTabInfo.Account>, Unit> $onOrderChanged;
    final /* synthetic */ SnapshotState<List<AccountTabInfo.Account>> $updatedOrder$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AccountSelectorReorderAccountsBottomSheet2(List<AccountTabInfo.Account> list, Function1<? super List<AccountTabInfo.Account>, Unit> function1, List<AccountTabInfo.Account> list2, SnapshotState<List<AccountTabInfo.Account>> snapshotState, Continuation<? super AccountSelectorReorderAccountsBottomSheet2> continuation) {
        super(2, continuation);
        this.$newTabs = list;
        this.$onOrderChanged = function1;
        this.$lockedAccounts = list2;
        this.$updatedOrder$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountSelectorReorderAccountsBottomSheet2(this.$newTabs, this.$onOrderChanged, this.$lockedAccounts, this.$updatedOrder$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountSelectorReorderAccountsBottomSheet2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$updatedOrder$delegate.setValue(this.$newTabs);
        this.$onOrderChanged.invoke(CollectionsKt.plus((Collection) this.$lockedAccounts, (Iterable) this.$newTabs));
        return Unit.INSTANCE;
    }
}
