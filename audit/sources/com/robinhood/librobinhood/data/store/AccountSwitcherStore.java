package com.robinhood.librobinhood.data.store;

import account_aggregation.service.p005v1.AccountAggregationService;
import com.robinhood.android.account.libaccountswitcher.p059db.AccountSwitcherDao;
import com.robinhood.android.account.modelsaccountswitcher.AccountSwitcher;
import com.robinhood.android.account.modelsaccountswitcher.AccountSwitcherRequest;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.store.AsyncResult;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;

/* compiled from: AccountSwitcherStore.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AccountSwitcherStore;", "Lcom/robinhood/store/Store;", "Laccount_aggregation/service/v1/AccountAggregationService;", "accountAggregationService", "Lcom/robinhood/android/account/libaccountswitcher/db/AccountSwitcherDao;", "dao", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Laccount_aggregation/service/v1/AccountAggregationService;Lcom/robinhood/android/account/libaccountswitcher/db/AccountSwitcherDao;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)V", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherRequest;", "accountSwitcherRequest", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcher;", "forceFetchAccountSwitcher", "(Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherRequest;)Lkotlinx/coroutines/flow/Flow;", "Laccount_aggregation/service/v1/AccountAggregationService;", "Lcom/robinhood/android/account/libaccountswitcher/db/AccountSwitcherDao;", "Lj$/time/Clock;", "Lcom/robinhood/android/moria/network/Endpoint;", "accountSwitcherEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/moria/db/Query;", "accountSwitcherQuery", "Lcom/robinhood/android/moria/db/Query;", "getAccountSwitcherQuery", "()Lcom/robinhood/android/moria/db/Query;", "lib-store-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class AccountSwitcherStore extends Store {
    private final AccountAggregationService accountAggregationService;
    private final Endpoint<AccountSwitcherRequest, AccountSwitcher> accountSwitcherEndpoint;
    private final Query<AccountSwitcherRequest, AccountSwitcher> accountSwitcherQuery;
    private final Clock clock;
    private final AccountSwitcherDao dao;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSwitcherStore(AccountAggregationService accountAggregationService, AccountSwitcherDao dao, Clock clock, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountAggregationService, "accountAggregationService");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountAggregationService = accountAggregationService;
        this.dao = dao;
        this.clock = clock;
        this.accountSwitcherEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new AccountSwitcherStore2(this, null), getLogoutKillswitch(), new AccountSwitcherStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.accountSwitcherQuery = Store.create$default(this, Query.INSTANCE, "accountSwitcherQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountSwitcherStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountSwitcherStore.accountSwitcherQuery$lambda$0(this.f$0, (AccountSwitcherRequest) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountSwitcherStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountSwitcherStore.accountSwitcherQuery$lambda$1(this.f$0, (AccountSwitcherRequest) obj);
            }
        }, false, 8, null);
    }

    public final Query<AccountSwitcherRequest, AccountSwitcher> getAccountSwitcherQuery() {
        return this.accountSwitcherQuery;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow accountSwitcherQuery$lambda$0(AccountSwitcherStore accountSwitcherStore, AccountSwitcherRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return Endpoint.DefaultImpls.poll$default(accountSwitcherStore.accountSwitcherEndpoint, request, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow accountSwitcherQuery$lambda$1(AccountSwitcherStore accountSwitcherStore, AccountSwitcherRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return accountSwitcherStore.dao.getAccountSwitcher(request.getAssetId(), request.getLocation());
    }

    /* compiled from: AccountSwitcherStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcher;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountSwitcherStore$forceFetchAccountSwitcher$1", m3645f = "AccountSwitcherStore.kt", m3646l = {57, 59, 60, 62}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.AccountSwitcherStore$forceFetchAccountSwitcher$1 */
    static final class C335251 extends ContinuationImpl7 implements Function2<FlowCollector<? super AsyncResult<? extends AccountSwitcher>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ AccountSwitcherRequest $accountSwitcherRequest;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C335251(AccountSwitcherRequest accountSwitcherRequest, Continuation<? super C335251> continuation) {
            super(2, continuation);
            this.$accountSwitcherRequest = accountSwitcherRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C335251 c335251 = AccountSwitcherStore.this.new C335251(this.$accountSwitcherRequest, continuation);
            c335251.L$0 = obj;
            return c335251;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super AsyncResult<? extends AccountSwitcher>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super AsyncResult<AccountSwitcher>>) flowCollector, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super AsyncResult<AccountSwitcher>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C335251) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(1:(1:(4:(1:(1:8)(2:9|10))(3:11|50|12)|13|44|45)(6:16|52|17|18|54|32))(1:22))(3:23|(1:25)|43)|46|26|27|48|28|(3:31|54|32)|43|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
        
            if (r4.emit(r0, r11) != r1) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
        
            r3 = r12;
            r12 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x008f, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0090, code lost:
        
            r8 = r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
        
            if (r3.emit(r0, r11) == r1) goto L43;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            C335251 c335251;
            FlowCollector flowCollector2;
            Exception exc;
            FlowCollector flowCollector3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                AsyncResult.Loading loading = AsyncResult.Loading.INSTANCE;
                this.L$0 = flowCollector;
                this.label = 1;
                if (flowCollector.emit(loading, this) == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                flowCollector = flowCollector4;
            } else if (i == 2) {
                flowCollector3 = (FlowCollector) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    c335251 = this;
                } catch (Exception e) {
                    exc = e;
                    c335251 = this;
                    flowCollector2 = flowCollector3;
                    AsyncResult.Failure failure = new AsyncResult.Failure(exc);
                    c335251.L$0 = null;
                    c335251.label = 4;
                }
                try {
                    AsyncResult.Success success = new AsyncResult.Success((AccountSwitcher) obj);
                    c335251.L$0 = flowCollector3;
                    c335251.label = 3;
                } catch (Exception e2) {
                    exc = e2;
                    flowCollector2 = flowCollector3;
                    AsyncResult.Failure failure2 = new AsyncResult.Failure(exc);
                    c335251.L$0 = null;
                    c335251.label = 4;
                }
            } else {
                if (i == 3) {
                    flowCollector2 = (FlowCollector) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e3) {
                        exc = e3;
                        c335251 = this;
                        AsyncResult.Failure failure22 = new AsyncResult.Failure(exc);
                        c335251.L$0 = null;
                        c335251.label = 4;
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            Endpoint endpoint = AccountSwitcherStore.this.accountSwitcherEndpoint;
            AccountSwitcherRequest accountSwitcherRequest = this.$accountSwitcherRequest;
            this.L$0 = flowCollector;
            this.label = 2;
            c335251 = this;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, accountSwitcherRequest, null, c335251, 2, null);
            if (objForceFetch$default != coroutine_suspended) {
                flowCollector3 = flowCollector;
                obj = objForceFetch$default;
                AsyncResult.Success success2 = new AsyncResult.Success((AccountSwitcher) obj);
                c335251.L$0 = flowCollector3;
                c335251.label = 3;
            }
            return coroutine_suspended;
        }
    }

    public final Flow<AsyncResult<AccountSwitcher>> forceFetchAccountSwitcher(AccountSwitcherRequest accountSwitcherRequest) {
        Intrinsics.checkNotNullParameter(accountSwitcherRequest, "accountSwitcherRequest");
        return FlowKt.flowOn(FlowKt.flow(new C335251(accountSwitcherRequest, null)), Dispatchers.getIO());
    }
}
