package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.rhy.RhyBonfireApi;
import com.robinhood.models.dao.CashCushionDetailsDao;
import com.robinhood.models.p320db.bonfire.CashCushionDetails;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: CashCushionDetailsStore.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/CashCushionDetailsStore;", "Lcom/robinhood/store/Store;", "rhyBonfireApi", "Lcom/robinhood/api/rhy/RhyBonfireApi;", "dao", "Lcom/robinhood/models/dao/CashCushionDetailsDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/rhy/RhyBonfireApi;Lcom/robinhood/models/dao/CashCushionDetailsDao;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "query", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/db/bonfire/CashCushionDetails;", "stream", "Lkotlinx/coroutines/flow/Flow;", "refresh", "Lkotlinx/coroutines/Job;", "force", "", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CashCushionDetailsStore extends Store {
    private final CashCushionDetailsDao dao;
    private final Endpoint<Unit, UIComponent<GenericAction>> endpoint;
    private final Query<Unit, CashCushionDetails> query;
    private final RhyBonfireApi rhyBonfireApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashCushionDetailsStore(RhyBonfireApi rhyBonfireApi, CashCushionDetailsDao dao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(rhyBonfireApi, "rhyBonfireApi");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.rhyBonfireApi = rhyBonfireApi;
        this.dao = dao;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new CashCushionDetailsStore2(this, null), getLogoutKillswitch(), new CashCushionDetailsStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.query = Store.create$default(this, Query.INSTANCE, "streamCashCushionDetails", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.CashCushionDetailsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CashCushionDetailsStore.query$lambda$0(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.CashCushionDetailsStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CashCushionDetailsStore.query$lambda$1(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(CashCushionDetailsStore cashCushionDetailsStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(cashCushionDetailsStore.endpoint, Unit.INSTANCE, CashCushionDetails.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(CashCushionDetailsStore cashCushionDetailsStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return cashCushionDetailsStore.dao.getDetails();
    }

    public final Flow<CashCushionDetails> stream() {
        return Context7.buffer$default(RxConvert.asFlow(this.query.asObservable(Unit.INSTANCE)), Integer.MAX_VALUE, null, 2, null);
    }

    public final Job refresh(boolean force) {
        return Endpoint.DefaultImpls.refresh$default(this.endpoint, Unit.INSTANCE, force, null, 4, null);
    }
}
