package com.robinhood.librobinhood.data.store;

import com.robinhood.android.models.accountcenter.api.ApiAccountCenterPage;
import com.robinhood.models.accountcenter.p301db.entity.AccountCenterPage2;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import retrofit2.Response;

/* compiled from: AccountCenterStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, m3636d2 = {"<anonymous>", "", "currency", "Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "response", "Lretrofit2/Response;", "Lcom/robinhood/android/models/accountcenter/api/ApiAccountCenterPage;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountCenterStore$getEndpoint$2", m3645f = "AccountCenterStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.AccountCenterStore$getEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class AccountCenterStore3 extends ContinuationImpl7 implements Function3<DisplayCurrency, Response<ApiAccountCenterPage>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AccountCenterStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountCenterStore3(AccountCenterStore accountCenterStore, Continuation<? super AccountCenterStore3> continuation) {
        super(3, continuation);
        this.this$0 = accountCenterStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(DisplayCurrency displayCurrency, Response<ApiAccountCenterPage> response, Continuation<? super Unit> continuation) {
        AccountCenterStore3 accountCenterStore3 = new AccountCenterStore3(this.this$0, continuation);
        accountCenterStore3.L$0 = displayCurrency;
        accountCenterStore3.L$1 = response;
        return accountCenterStore3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        DisplayCurrency displayCurrency = (DisplayCurrency) this.L$0;
        ApiAccountCenterPage apiAccountCenterPage = (ApiAccountCenterPage) ((Response) this.L$1).body();
        if (apiAccountCenterPage != null) {
            this.this$0.accountCenterPageDao.insert(AccountCenterPage2.toDbModel(apiAccountCenterPage, displayCurrency));
        }
        return Unit.INSTANCE;
    }
}
