package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.api.portfolio.PortfolioApi;
import com.robinhood.android.models.portfolio.AccountMarketValues;
import com.robinhood.android.models.portfolio.AccountMarketValues2;
import com.robinhood.android.models.portfolio.api.AccountMarketValuesType;
import com.robinhood.android.models.portfolio.api.ApiAccountMarketValues;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.AccountMarketValuesStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AccountMarketValuesStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/portfolio/AccountMarketValues;", "it", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/AccountMarketValuesStore$AccountMarketValuesRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.AccountMarketValuesStore$valuesEndpoint$2", m3645f = "AccountMarketValuesStore.kt", m3646l = {31}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.AccountMarketValuesStore$valuesEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class AccountMarketValuesStore3 extends ContinuationImpl7 implements Function2<AccountMarketValuesStore.AccountMarketValuesRequest, Continuation<? super AccountMarketValues>, Object> {
    final /* synthetic */ PortfolioApi $portfolioApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountMarketValuesStore3(PortfolioApi portfolioApi, Continuation<? super AccountMarketValuesStore3> continuation) {
        super(2, continuation);
        this.$portfolioApi = portfolioApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountMarketValuesStore3 accountMarketValuesStore3 = new AccountMarketValuesStore3(this.$portfolioApi, continuation);
        accountMarketValuesStore3.L$0 = obj;
        return accountMarketValuesStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccountMarketValuesStore.AccountMarketValuesRequest accountMarketValuesRequest, Continuation<? super AccountMarketValues> continuation) {
        return ((AccountMarketValuesStore3) create(accountMarketValuesRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AccountMarketValuesStore.AccountMarketValuesRequest accountMarketValuesRequest = (AccountMarketValuesStore.AccountMarketValuesRequest) this.L$0;
            PortfolioApi portfolioApi = this.$portfolioApi;
            String accountNumber = accountMarketValuesRequest.getAccountNumber();
            AccountMarketValuesType type2 = accountMarketValuesRequest.getType();
            String displaySpan = accountMarketValuesRequest.getDisplaySpan();
            this.label = 1;
            obj = portfolioApi.getAccountMarketValues(accountNumber, type2, displaySpan, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return AccountMarketValues2.toDbModel((ApiAccountMarketValues) obj);
    }
}
