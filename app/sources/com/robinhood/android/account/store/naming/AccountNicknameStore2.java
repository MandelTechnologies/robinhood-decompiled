package com.robinhood.android.account.store.naming;

import com.robinhood.android.account.api.AccountApi;
import com.robinhood.android.account.store.naming.AccountNicknameStore;
import com.robinhood.models.api.ApiAccount;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AccountNicknameStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiAccount;", "params", "Lcom/robinhood/android/account/store/naming/AccountNicknameStore$SetNicknameParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.account.store.naming.AccountNicknameStore$updateNicknameEndpoint$1", m3645f = "AccountNicknameStore.kt", m3646l = {31}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.account.store.naming.AccountNicknameStore$updateNicknameEndpoint$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AccountNicknameStore2 extends ContinuationImpl7 implements Function2<AccountNicknameStore.SetNicknameParams, Continuation<? super ApiAccount>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AccountNicknameStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountNicknameStore2(AccountNicknameStore accountNicknameStore, Continuation<? super AccountNicknameStore2> continuation) {
        super(2, continuation);
        this.this$0 = accountNicknameStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountNicknameStore2 accountNicknameStore2 = new AccountNicknameStore2(this.this$0, continuation);
        accountNicknameStore2.L$0 = obj;
        return accountNicknameStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccountNicknameStore.SetNicknameParams setNicknameParams, Continuation<? super ApiAccount> continuation) {
        return ((AccountNicknameStore2) create(setNicknameParams, continuation)).invokeSuspend(Unit.INSTANCE);
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
        AccountNicknameStore.SetNicknameParams setNicknameParams = (AccountNicknameStore.SetNicknameParams) this.L$0;
        AccountApi accountApi = this.this$0.accountApi;
        String accountNumber = setNicknameParams.getAccountNumber();
        ApiAccount.NicknameRequest nicknameRequest = new ApiAccount.NicknameRequest(setNicknameParams.getNickname());
        this.label = 1;
        Object nickname = accountApi.setNickname(accountNumber, nicknameRequest, this);
        return nickname == coroutine_suspended ? coroutine_suspended : nickname;
    }
}
