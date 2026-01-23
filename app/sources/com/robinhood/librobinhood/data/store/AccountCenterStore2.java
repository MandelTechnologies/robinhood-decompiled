package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.accountcenter.AccountCenterApi;
import com.robinhood.android.models.accountcenter.api.ApiAccountCenterPage;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import retrofit2.Response;

/* compiled from: AccountCenterStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/android/models/accountcenter/api/ApiAccountCenterPage;", "currency", "Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountCenterStore$getEndpoint$1", m3645f = "AccountCenterStore.kt", m3646l = {31}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.AccountCenterStore$getEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class AccountCenterStore2 extends ContinuationImpl7 implements Function2<DisplayCurrency, Continuation<? super Response<ApiAccountCenterPage>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AccountCenterStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountCenterStore2(AccountCenterStore accountCenterStore, Continuation<? super AccountCenterStore2> continuation) {
        super(2, continuation);
        this.this$0 = accountCenterStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountCenterStore2 accountCenterStore2 = new AccountCenterStore2(this.this$0, continuation);
        accountCenterStore2.L$0 = obj;
        return accountCenterStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DisplayCurrency displayCurrency, Continuation<? super Response<ApiAccountCenterPage>> continuation) {
        return ((AccountCenterStore2) create(displayCurrency, continuation)).invokeSuspend(Unit.INSTANCE);
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
        DisplayCurrency displayCurrency = (DisplayCurrency) this.L$0;
        AccountCenterApi accountCenterApi = this.this$0.bonfireApi;
        this.label = 1;
        Object accountCenterPageResponse = accountCenterApi.getAccountCenterPageResponse(displayCurrency, this);
        return accountCenterPageResponse == coroutine_suspended ? coroutine_suspended : accountCenterPageResponse;
    }
}
