package com.robinhood.android.account.p060ui;

import com.robinhood.models.p320db.Account;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AccountOverviewDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/ui/AccountOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$2$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes24.dex */
final class AccountOverviewDuxo$onResume$2$1 extends ContinuationImpl7 implements Function2<AccountOverviewDataState, Continuation<? super AccountOverviewDataState>, Object> {
    final /* synthetic */ Account $account;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountOverviewDuxo$onResume$2$1(Account account, Continuation<? super AccountOverviewDuxo$onResume$2$1> continuation) {
        super(2, continuation);
        this.$account = account;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountOverviewDuxo$onResume$2$1 accountOverviewDuxo$onResume$2$1 = new AccountOverviewDuxo$onResume$2$1(this.$account, continuation);
        accountOverviewDuxo$onResume$2$1.L$0 = obj;
        return accountOverviewDuxo$onResume$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccountOverviewDataState accountOverviewDataState, Continuation<? super AccountOverviewDataState> continuation) {
        return ((AccountOverviewDuxo$onResume$2$1) create(accountOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AccountOverviewDataState.copy$default((AccountOverviewDataState) this.L$0, this.$account, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, false, false, false, false, null, null, null, false, null, null, null, null, false, null, null, false, -2, 7, null);
    }
}
