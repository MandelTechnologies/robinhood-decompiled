package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.api.portfolio.PortfolioApi;
import com.robinhood.android.models.portfolio.AccountMarketValuesLive;
import com.robinhood.android.models.portfolio.AccountMarketValuesLive2;
import com.robinhood.android.models.portfolio.api.ApiAccountMarketValuesLive;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.AccountMarketValuesLiveStore;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AccountMarketValuesLiveStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/portfolio/AccountMarketValuesLive;", "request", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/AccountMarketValuesLiveStore$AccountMarketValuesLiveRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.AccountMarketValuesLiveStore$liveValuesEndpoint$1", m3645f = "AccountMarketValuesLiveStore.kt", m3646l = {30}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.AccountMarketValuesLiveStore$liveValuesEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class AccountMarketValuesLiveStore2 extends ContinuationImpl7 implements Function2<AccountMarketValuesLiveStore.AccountMarketValuesLiveRequest, Continuation<? super AccountMarketValuesLive>, Object> {
    final /* synthetic */ PortfolioApi $portfolioApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountMarketValuesLiveStore2(PortfolioApi portfolioApi, Continuation<? super AccountMarketValuesLiveStore2> continuation) {
        super(2, continuation);
        this.$portfolioApi = portfolioApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountMarketValuesLiveStore2 accountMarketValuesLiveStore2 = new AccountMarketValuesLiveStore2(this.$portfolioApi, continuation);
        accountMarketValuesLiveStore2.L$0 = obj;
        return accountMarketValuesLiveStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccountMarketValuesLiveStore.AccountMarketValuesLiveRequest accountMarketValuesLiveRequest, Continuation<? super AccountMarketValuesLive> continuation) {
        return ((AccountMarketValuesLiveStore2) create(accountMarketValuesLiveRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AccountMarketValuesLiveStore.AccountMarketValuesLiveRequest accountMarketValuesLiveRequest = (AccountMarketValuesLiveStore.AccountMarketValuesLiveRequest) this.L$0;
            PortfolioApi portfolioApi = this.$portfolioApi;
            String accountNumber = accountMarketValuesLiveRequest.getAccountNumber();
            DisplayCurrency displayCurrency = accountMarketValuesLiveRequest.getDisplayCurrency();
            this.label = 1;
            obj = portfolioApi.accountMarketValuesLive(accountNumber, displayCurrency, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return AccountMarketValuesLive2.toDbModel((ApiAccountMarketValuesLive) obj);
    }
}
