package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.dao.RetirementSypDao;
import com.robinhood.android.models.retirement.p194db.RetirementContributionsSummary;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RetirementContributionsSummaryStore.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementContributionsSummaryStore;", "Lcom/robinhood/store/Store;", "retirementApi", "Lcom/robinhood/android/api/retirement/RetirementApi;", "dao", "Lcom/robinhood/android/models/retirement/dao/RetirementSypDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/retirement/RetirementApi;Lcom/robinhood/android/models/retirement/dao/RetirementSypDao;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/android/models/retirement/db/RetirementContributionsSummary;", "query", "Lcom/robinhood/android/moria/db/Query;", "getQuery", "()Lcom/robinhood/android/moria/db/Query;", "refresh", "", "accountNumber", "force", "", "lib-store-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RetirementContributionsSummaryStore extends Store {
    private final RetirementSypDao dao;
    private final Endpoint<String, RetirementContributionsSummary> endpoint;
    private final Query<String, RetirementContributionsSummary> query;
    private final RetirementApi retirementApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetirementContributionsSummaryStore(RetirementApi retirementApi, RetirementSypDao dao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(retirementApi, "retirementApi");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.retirementApi = retirementApi;
        this.dao = dao;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new RetirementContributionsSummaryStore2(this, null), getLogoutKillswitch(), new RetirementContributionsSummaryStore3(dao), storeBundle.getClock(), null, 16, null);
        this.query = Store.create$default(this, Query.INSTANCE, "queryRetirementContributionsSummary", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementContributionsSummaryStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementContributionsSummaryStore.query$lambda$0(this.f$0, (String) obj);
            }
        })), new RetirementContributionsSummaryStore4(dao), false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object endpoint$insertContributionSummary(RetirementSypDao retirementSypDao, RetirementContributionsSummary retirementContributionsSummary, Continuation continuation) {
        retirementSypDao.insertContributionSummary(retirementContributionsSummary);
        return Unit.INSTANCE;
    }

    public final Query<String, RetirementContributionsSummary> getQuery() {
        return this.query;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(RetirementContributionsSummaryStore retirementContributionsSummaryStore, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(retirementContributionsSummaryStore.endpoint, it, null, null, 6, null);
    }

    public static /* synthetic */ void refresh$default(RetirementContributionsSummaryStore retirementContributionsSummaryStore, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        retirementContributionsSummaryStore.refresh(str, z);
    }

    public final void refresh(String accountNumber, boolean force) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Endpoint.DefaultImpls.refresh$default(this.endpoint, accountNumber, force, null, 4, null);
    }
}
