package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.PaginatedEndpointKt;
import com.robinhood.api.rhy.RhyBonfireApi;
import com.robinhood.models.api.bonfire.ApiPaycheckV2;
import com.robinhood.models.dao.PaycheckV2Dao;
import com.robinhood.models.p320db.bonfire.PaycheckV2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import io.reactivex.Observable;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;

/* compiled from: PaycheckStore.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u001cJ\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u001cJ\u0010\u0010\u001e\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u0018J\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u001c2\u0006\u0010!\u001a\u00020\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00180\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/PaycheckStore;", "Lcom/robinhood/store/Store;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "bonfireApi", "Lcom/robinhood/api/rhy/RhyBonfireApi;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "paycheckDaoV2", "Lcom/robinhood/models/dao/PaycheckV2Dao;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/api/rhy/RhyBonfireApi;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/PaycheckV2Dao;)V", "rhsPaycheckEndpointV2", "Lcom/robinhood/api/PaginatedEndpoint;", "", "Lcom/robinhood/models/api/bonfire/ApiPaycheckV2;", "rhyPaycheckEndpointV2", "paychecksV2", "Lcom/robinhood/android/moria/db/Query;", "", "Lcom/robinhood/models/db/bonfire/PaycheckV2;", "hasPaychecksV2", "", "paycheckByReceivedAchTransferIdV2", "Ljava/util/UUID;", "getPaychecks", "Lio/reactivex/Observable;", "getHasPaychecks", "refresh", "force", "getPaycheckByReceivedAchTransferId", "receivedAchTransferId", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class PaycheckStore extends Store {
    private final AccountProvider accountProvider;
    private final RhyBonfireApi bonfireApi;
    private final Query<Unit, Boolean> hasPaychecksV2;
    private final Query<UUID, PaycheckV2> paycheckByReceivedAchTransferIdV2;
    private final PaycheckV2Dao paycheckDaoV2;
    private final Query<Unit, List<PaycheckV2>> paychecksV2;
    private final PaginatedEndpoint<Unit, ApiPaycheckV2> rhsPaycheckEndpointV2;
    private final RhyAccountStore rhyAccountStore;
    private final PaginatedEndpoint<Unit, ApiPaycheckV2> rhyPaycheckEndpointV2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaycheckStore(AccountProvider accountProvider, RhyBonfireApi bonfireApi, RhyAccountStore rhyAccountStore, StoreBundle storeBundle, PaycheckV2Dao paycheckDaoV2) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(paycheckDaoV2, "paycheckDaoV2");
        this.accountProvider = accountProvider;
        this.bonfireApi = bonfireApi;
        this.rhyAccountStore = rhyAccountStore;
        this.paycheckDaoV2 = paycheckDaoV2;
        PaginatedEndpoint.Companion companion = PaginatedEndpoint.INSTANCE;
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        Clock clock = storeBundle.getClock();
        PaycheckV2.Companion companion2 = PaycheckV2.INSTANCE;
        this.rhsPaycheckEndpointV2 = companion.create(new PaycheckStore2(this, null), logoutKillswitch, new PaycheckStore3(this, null), clock, new DefaultStaleDecider(companion2.getNormalStaleTimeout(), storeBundle.getClock()));
        this.rhyPaycheckEndpointV2 = companion.create(new PaycheckStore4(this, null), getLogoutKillswitch(), new PaycheckStore5(this, null), storeBundle.getClock(), new DefaultStaleDecider(companion2.getNormalStaleTimeout(), storeBundle.getClock()));
        Query.Companion companion3 = Query.INSTANCE;
        this.paychecksV2 = Store.create$default(this, companion3, "getPaychecks", CollectionsKt.listOf((Object[]) new PollEach[]{new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaycheckStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckStore.paychecksV2$lambda$0(this.f$0, (Unit) obj);
            }
        }), new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaycheckStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckStore.paychecksV2$lambda$1(this.f$0, (Unit) obj);
            }
        })}), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaycheckStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckStore.paychecksV2$lambda$2(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.hasPaychecksV2 = Store.create$default(this, companion3, "getHasPaychecks", CollectionsKt.listOf((Object[]) new PollEach[]{new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaycheckStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckStore.hasPaychecksV2$lambda$3(this.f$0, (Unit) obj);
            }
        }), new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaycheckStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckStore.hasPaychecksV2$lambda$4(this.f$0, (Unit) obj);
            }
        })}), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaycheckStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckStore.hasPaychecksV2$lambda$5(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.paycheckByReceivedAchTransferIdV2 = Store.create$default(this, companion3, "paychecksByReceivedAchTransferId", CollectionsKt.listOf((Object[]) new PollEach[]{new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaycheckStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckStore.paycheckByReceivedAchTransferIdV2$lambda$6(this.f$0, (UUID) obj);
            }
        }), new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaycheckStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckStore.paycheckByReceivedAchTransferIdV2$lambda$7(this.f$0, (UUID) obj);
            }
        })}), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.PaycheckStore$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckStore.paycheckByReceivedAchTransferIdV2$lambda$8(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow paychecksV2$lambda$0(PaycheckStore paycheckStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return PaginatedEndpointKt.pollAllPages(paycheckStore.rhyPaycheckEndpointV2, PaycheckV2.INSTANCE.getNormalStaleTimeout());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow paychecksV2$lambda$1(PaycheckStore paycheckStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return PaginatedEndpointKt.pollAllPages(paycheckStore.rhsPaycheckEndpointV2, PaycheckV2.INSTANCE.getNormalStaleTimeout());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow paychecksV2$lambda$2(PaycheckStore paycheckStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return paycheckStore.paycheckDaoV2.getPaychecks();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow hasPaychecksV2$lambda$3(PaycheckStore paycheckStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return PaginatedEndpointKt.pollAllPages(paycheckStore.rhyPaycheckEndpointV2, PaycheckV2.INSTANCE.getNormalStaleTimeout());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow hasPaychecksV2$lambda$4(PaycheckStore paycheckStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return PaginatedEndpointKt.pollAllPages(paycheckStore.rhsPaycheckEndpointV2, PaycheckV2.INSTANCE.getNormalStaleTimeout());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow hasPaychecksV2$lambda$5(PaycheckStore paycheckStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FlowKt.filterNotNull(paycheckStore.paycheckDaoV2.getHasPaychecks());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow paycheckByReceivedAchTransferIdV2$lambda$6(PaycheckStore paycheckStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return PaginatedEndpointKt.pollAllPages(paycheckStore.rhyPaycheckEndpointV2, PaycheckV2.INSTANCE.getNormalStaleTimeout());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow paycheckByReceivedAchTransferIdV2$lambda$7(PaycheckStore paycheckStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return PaginatedEndpointKt.pollAllPages(paycheckStore.rhsPaycheckEndpointV2, PaycheckV2.INSTANCE.getNormalStaleTimeout());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow paycheckByReceivedAchTransferIdV2$lambda$8(PaycheckStore paycheckStore, UUID receivedAchTransferId) {
        Intrinsics.checkNotNullParameter(receivedAchTransferId, "receivedAchTransferId");
        return FlowKt.filterNotNull(paycheckStore.paycheckDaoV2.getPaycheckByReceivedAchTransferId(receivedAchTransferId));
    }

    public final Observable<List<PaycheckV2>> getPaychecks() {
        return this.paychecksV2.asObservable(Unit.INSTANCE);
    }

    public final Observable<Boolean> getHasPaychecks() {
        return this.hasPaychecksV2.asObservable(Unit.INSTANCE);
    }

    public static /* synthetic */ void refresh$default(PaycheckStore paycheckStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        paycheckStore.refresh(z);
    }

    public final void refresh(boolean force) {
        PaginatedEndpointKt.refreshAllPages(this.rhsPaycheckEndpointV2, force);
        PaginatedEndpointKt.refreshAllPages(this.rhyPaycheckEndpointV2, force);
    }

    public final Observable<PaycheckV2> getPaycheckByReceivedAchTransferId(UUID receivedAchTransferId) {
        Intrinsics.checkNotNullParameter(receivedAchTransferId, "receivedAchTransferId");
        return this.paycheckByReceivedAchTransferIdV2.asObservable(receivedAchTransferId);
    }
}
