package com.robinhood.librobinhood.data.store.bonfire;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.models.api.bonfire.withdrawablecash.ApiWithdrawableAmountBreakdown;
import com.robinhood.models.api.bonfire.withdrawablecash.ApiWithdrawableCashOverview;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Duration;

/* compiled from: WithdrawableAmountBreakdownStore.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u000f0\u000f0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000f0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00120\u00120\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00120\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006!"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/WithdrawableAmountBreakdownStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/api/retrofit/BonfireApi;", "bonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "transfersBonfireApi", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/api/retrofit/BonfireApi;Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/store/StoreBundle;)V", "j$/time/Duration", "interval", "Lio/reactivex/Observable;", "Lcom/robinhood/models/api/bonfire/withdrawablecash/ApiWithdrawableAmountBreakdown;", "poll", "(Lj$/time/Duration;)Lio/reactivex/Observable;", "Lcom/robinhood/models/api/bonfire/withdrawablecash/ApiWithdrawableCashOverview;", "pollWithdrawableCashOverview", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/api/retrofit/BonfireApi;", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "kotlin.jvm.PlatformType", "relay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/android/moria/network/Endpoint;", "", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "withdrawableCashOverviewRelay", "withdrawableCashOverviewEndpoint", "lib-store-ach-relationship_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class WithdrawableAmountBreakdownStore extends Store {
    private final AccountProvider accountProvider;
    private final BonfireApi bonfireApi;
    private final Endpoint<Unit, ApiWithdrawableAmountBreakdown> endpoint;
    private final BehaviorRelay<ApiWithdrawableAmountBreakdown> relay;
    private final TransfersBonfireApi transfersBonfireApi;
    private final Endpoint<Unit, ApiWithdrawableCashOverview> withdrawableCashOverviewEndpoint;
    private final BehaviorRelay<ApiWithdrawableCashOverview> withdrawableCashOverviewRelay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawableAmountBreakdownStore(AccountProvider accountProvider, BonfireApi bonfireApi, TransfersBonfireApi transfersBonfireApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountProvider = accountProvider;
        this.bonfireApi = bonfireApi;
        this.transfersBonfireApi = transfersBonfireApi;
        BehaviorRelay<ApiWithdrawableAmountBreakdown> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.relay = behaviorRelayCreate;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.endpoint = Endpoint.Companion.create$default(companion, new WithdrawableAmountBreakdownStore2(this, null), getLogoutKillswitch(), new WithdrawableAmountBreakdownStore3(behaviorRelayCreate), storeBundle.getClock(), null, 16, null);
        BehaviorRelay<ApiWithdrawableCashOverview> behaviorRelayCreate2 = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate2, "create(...)");
        this.withdrawableCashOverviewRelay = behaviorRelayCreate2;
        this.withdrawableCashOverviewEndpoint = Endpoint.Companion.create$default(companion, new WithdrawableAmountBreakdownStore4(this, null), getLogoutKillswitch(), new WithdrawableAmountBreakdownStore5(behaviorRelayCreate2), storeBundle.getClock(), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object endpoint$accept(BehaviorRelay behaviorRelay, ApiWithdrawableAmountBreakdown apiWithdrawableAmountBreakdown, Continuation continuation) {
        behaviorRelay.accept(apiWithdrawableAmountBreakdown);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Observable poll$default(WithdrawableAmountBreakdownStore withdrawableAmountBreakdownStore, Duration duration, int i, Object obj) {
        if ((i & 1) != 0) {
            duration = Duration.ofSeconds(30L);
        }
        return withdrawableAmountBreakdownStore.poll(duration);
    }

    public final Observable<ApiWithdrawableAmountBreakdown> poll(final Duration interval) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        return Store.create$default(this, Query.INSTANCE, "queryWithdrawableAmountBreakdown", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.WithdrawableAmountBreakdownStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WithdrawableAmountBreakdownStore.poll$lambda$0(this.f$0, interval, obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.WithdrawableAmountBreakdownStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WithdrawableAmountBreakdownStore.poll$lambda$1(this.f$0, obj);
            }
        }, false, 8, null).asObservable(interval);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow poll$lambda$0(WithdrawableAmountBreakdownStore withdrawableAmountBreakdownStore, Duration duration, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(withdrawableAmountBreakdownStore.endpoint, Unit.INSTANCE, duration, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow poll$lambda$1(WithdrawableAmountBreakdownStore withdrawableAmountBreakdownStore, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Context7.buffer$default(RxConvert.asFlow(withdrawableAmountBreakdownStore.relay), Integer.MAX_VALUE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object withdrawableCashOverviewEndpoint$accept$2(BehaviorRelay behaviorRelay, ApiWithdrawableCashOverview apiWithdrawableCashOverview, Continuation continuation) {
        behaviorRelay.accept(apiWithdrawableCashOverview);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Observable pollWithdrawableCashOverview$default(WithdrawableAmountBreakdownStore withdrawableAmountBreakdownStore, Duration duration, int i, Object obj) {
        if ((i & 1) != 0) {
            duration = Duration.ofSeconds(30L);
        }
        return withdrawableAmountBreakdownStore.pollWithdrawableCashOverview(duration);
    }

    public final Observable<ApiWithdrawableCashOverview> pollWithdrawableCashOverview(final Duration interval) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        return Store.create$default(this, Query.INSTANCE, "queryWithdrawableCashOverview", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.WithdrawableAmountBreakdownStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WithdrawableAmountBreakdownStore.pollWithdrawableCashOverview$lambda$3(this.f$0, interval, obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.WithdrawableAmountBreakdownStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WithdrawableAmountBreakdownStore.pollWithdrawableCashOverview$lambda$4(this.f$0, obj);
            }
        }, false, 8, null).asObservable(interval);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow pollWithdrawableCashOverview$lambda$3(WithdrawableAmountBreakdownStore withdrawableAmountBreakdownStore, Duration duration, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(withdrawableAmountBreakdownStore.withdrawableCashOverviewEndpoint, Unit.INSTANCE, duration, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow pollWithdrawableCashOverview$lambda$4(WithdrawableAmountBreakdownStore withdrawableAmountBreakdownStore, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Context7.buffer$default(RxConvert.asFlow(withdrawableAmountBreakdownStore.withdrawableCashOverviewRelay), Integer.MAX_VALUE, null, 2, null);
    }
}
