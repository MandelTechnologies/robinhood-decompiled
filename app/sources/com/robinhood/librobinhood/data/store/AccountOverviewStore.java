package com.robinhood.librobinhood.data.store;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.accountoverview.api.AccountOverviewApi;
import com.robinhood.android.models.accountoverview.api.ApiCardOrder;
import com.robinhood.android.models.accountoverview.api.ApiDayTradeCard;
import com.robinhood.android.models.accountoverview.api.ApiDayTradeCard2;
import com.robinhood.android.models.accountoverview.p184db.CardOrder;
import com.robinhood.android.models.accountoverview.p184db.DayTradeCard;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Duration;

/* compiled from: AccountOverviewStore.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\u0006\u0010\u0014\u001a\u00020\nJ\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00160\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AccountOverviewStore;", "Lcom/robinhood/store/Store;", "accountOverviewApi", "Lcom/robinhood/android/accountoverview/api/AccountOverviewApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/accountoverview/api/AccountOverviewApi;Lcom/robinhood/store/StoreBundle;)V", "cardOrderRelays", "", "", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/android/models/accountoverview/db/CardOrder;", "getCardOrderEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/models/accountoverview/api/ApiCardOrder;", "cardOrderQuery", "Lcom/robinhood/android/moria/db/Query;", "streamCardOrder", "Lio/reactivex/Observable;", "accountNumber", "getDayTradeCardEndpoint", "Lcom/robinhood/android/models/accountoverview/api/ApiDayTradeCard;", "getDayTradeCard", "Lcom/robinhood/android/models/accountoverview/db/DayTradeCard;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lib-store-account-overview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class AccountOverviewStore extends Store {
    private static final long POLLING_DURATION_SECONDS = 30;
    private final AccountOverviewApi accountOverviewApi;
    private final Query<String, CardOrder> cardOrderQuery;
    private final Map<String, BehaviorRelay<CardOrder>> cardOrderRelays;
    private final Endpoint<String, ApiCardOrder> getCardOrderEndpoint;
    private final Endpoint<String, ApiDayTradeCard> getDayTradeCardEndpoint;

    /* compiled from: AccountOverviewStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountOverviewStore", m3645f = "AccountOverviewStore.kt", m3646l = {66}, m3647m = "getDayTradeCard")
    /* renamed from: com.robinhood.librobinhood.data.store.AccountOverviewStore$getDayTradeCard$1 */
    static final class C334881 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C334881(Continuation<? super C334881> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountOverviewStore.this.getDayTradeCard(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountOverviewStore(AccountOverviewApi accountOverviewApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountOverviewApi, "accountOverviewApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountOverviewApi = accountOverviewApi;
        this.cardOrderRelays = new LinkedHashMap();
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.getCardOrderEndpoint = Endpoint.Companion.create$default(companion, new AccountOverviewStore2(this, null), getLogoutKillswitch(), new AccountOverviewStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.cardOrderQuery = Store.create$default(this, Query.INSTANCE, "cardOrderQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountOverviewStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewStore.cardOrderQuery$lambda$0(this.f$0, (String) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.AccountOverviewStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewStore.cardOrderQuery$lambda$2(this.f$0, (String) obj);
            }
        }, false, 8, null);
        this.getDayTradeCardEndpoint = Endpoint.Companion.create$default(companion, new AccountOverviewStore4(this, null), getLogoutKillswitch(), new AccountOverviewStore5(null), storeBundle.getClock(), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow cardOrderQuery$lambda$0(AccountOverviewStore accountOverviewStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Endpoint<String, ApiCardOrder> endpoint = accountOverviewStore.getCardOrderEndpoint;
        Duration durationOfSeconds = Duration.ofSeconds(30L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, accountNumber, durationOfSeconds, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow cardOrderQuery$lambda$2(AccountOverviewStore accountOverviewStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Map<String, BehaviorRelay<CardOrder>> map = accountOverviewStore.cardOrderRelays;
        BehaviorRelay<CardOrder> behaviorRelayCreate = map.get(accountNumber);
        if (behaviorRelayCreate == null) {
            behaviorRelayCreate = BehaviorRelay.create();
            Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
            map.put(accountNumber, behaviorRelayCreate);
        }
        return Context7.buffer$default(RxConvert.asFlow(behaviorRelayCreate), Integer.MAX_VALUE, null, 2, null);
    }

    public final Observable<CardOrder> streamCardOrder(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return this.cardOrderQuery.asObservable(accountNumber);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getDayTradeCard(String str, Continuation<? super DayTradeCard> continuation) {
        C334881 c334881;
        if (continuation instanceof C334881) {
            c334881 = (C334881) continuation;
            int i = c334881.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c334881.label = i - Integer.MIN_VALUE;
            } else {
                c334881 = new C334881(continuation);
            }
        }
        C334881 c3348812 = c334881;
        Object objForceFetch$default = c3348812.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3348812.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<String, ApiDayTradeCard> endpoint = this.getDayTradeCardEndpoint;
            c3348812.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, str, null, c3348812, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        return ApiDayTradeCard2.toDbModel((ApiDayTradeCard) objForceFetch$default);
    }
}
