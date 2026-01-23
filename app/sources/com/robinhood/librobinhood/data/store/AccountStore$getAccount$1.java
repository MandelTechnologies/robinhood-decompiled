package com.robinhood.librobinhood.data.store;

import com.robinhood.android.account.api.AccountApi;
import com.robinhood.models.api.ApiAccount;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AccountStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiAccount;", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountStore$getAccount$1", m3645f = "AccountStore.kt", m3646l = {82}, m3647m = "invokeSuspend")
/* loaded from: classes20.dex */
final class AccountStore$getAccount$1 extends ContinuationImpl7 implements Function2<String, Continuation<? super ApiAccount>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AccountStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountStore$getAccount$1(AccountStore accountStore, Continuation<? super AccountStore$getAccount$1> continuation) {
        super(2, continuation);
        this.this$0 = accountStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountStore$getAccount$1 accountStore$getAccount$1 = new AccountStore$getAccount$1(this.this$0, continuation);
        accountStore$getAccount$1.L$0 = obj;
        return accountStore$getAccount$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super ApiAccount> continuation) {
        return ((AccountStore$getAccount$1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        String str = (String) this.L$0;
        AccountApi accountApi = this.this$0.accountApi;
        this.label = 1;
        Object account = accountApi.getAccount(str, this);
        return account == coroutine_suspended ? coroutine_suspended : account;
    }
}
