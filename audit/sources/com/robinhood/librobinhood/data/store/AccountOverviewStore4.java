package com.robinhood.librobinhood.data.store;

import com.robinhood.android.accountoverview.api.AccountOverviewApi;
import com.robinhood.android.models.accountoverview.api.ApiDayTradeCard;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AccountOverviewStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/accountoverview/api/ApiDayTradeCard;", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountOverviewStore$getDayTradeCardEndpoint$1", m3645f = "AccountOverviewStore.kt", m3646l = {59}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.AccountOverviewStore$getDayTradeCardEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class AccountOverviewStore4 extends ContinuationImpl7 implements Function2<String, Continuation<? super ApiDayTradeCard>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AccountOverviewStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountOverviewStore4(AccountOverviewStore accountOverviewStore, Continuation<? super AccountOverviewStore4> continuation) {
        super(2, continuation);
        this.this$0 = accountOverviewStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountOverviewStore4 accountOverviewStore4 = new AccountOverviewStore4(this.this$0, continuation);
        accountOverviewStore4.L$0 = obj;
        return accountOverviewStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super ApiDayTradeCard> continuation) {
        return ((AccountOverviewStore4) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
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
        AccountOverviewApi accountOverviewApi = this.this$0.accountOverviewApi;
        this.label = 1;
        Object dayTradeCard = accountOverviewApi.getDayTradeCard(str, this);
        return dayTradeCard == coroutine_suspended ? coroutine_suspended : dayTradeCard;
    }
}
