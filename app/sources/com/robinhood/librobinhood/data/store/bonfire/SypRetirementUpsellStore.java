package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.rhy.RhyBonfireApi;
import com.robinhood.models.api.bonfire.rhy.ApiSypRetirementUpsellDetails;
import com.robinhood.models.dao.SypRetirementUpsellDetailsDao;
import com.robinhood.models.p320db.bonfire.SypRetirementUpsellDetails;
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

/* compiled from: SypRetirementUpsellStore.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/SypRetirementUpsellStore;", "Lcom/robinhood/store/Store;", "rhyBonfireApi", "Lcom/robinhood/api/rhy/RhyBonfireApi;", "dao", "Lcom/robinhood/models/dao/SypRetirementUpsellDetailsDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/rhy/RhyBonfireApi;Lcom/robinhood/models/dao/SypRetirementUpsellDetailsDao;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/bonfire/rhy/ApiSypRetirementUpsellDetails;", "query", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/db/bonfire/SypRetirementUpsellDetails;", "stream", "Lkotlinx/coroutines/flow/Flow;", "refresh", "Lkotlinx/coroutines/Job;", "force", "", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class SypRetirementUpsellStore extends Store {
    private final SypRetirementUpsellDetailsDao dao;
    private final Endpoint<Unit, ApiSypRetirementUpsellDetails> endpoint;
    private final Query<Unit, SypRetirementUpsellDetails> query;
    private final RhyBonfireApi rhyBonfireApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SypRetirementUpsellStore(RhyBonfireApi rhyBonfireApi, SypRetirementUpsellDetailsDao dao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(rhyBonfireApi, "rhyBonfireApi");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.rhyBonfireApi = rhyBonfireApi;
        this.dao = dao;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new SypRetirementUpsellStore2(this, null), getLogoutKillswitch(), new SypRetirementUpsellStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.query = Store.create$default(this, Query.INSTANCE, "streamSypRetirementUpsellDetails", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.SypRetirementUpsellStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SypRetirementUpsellStore.query$lambda$0(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.SypRetirementUpsellStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SypRetirementUpsellStore.query$lambda$1(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(SypRetirementUpsellStore sypRetirementUpsellStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(sypRetirementUpsellStore.endpoint, Unit.INSTANCE, SypRetirementUpsellDetails.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(SypRetirementUpsellStore sypRetirementUpsellStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return sypRetirementUpsellStore.dao.getDetails();
    }

    public final Flow<SypRetirementUpsellDetails> stream() {
        return Context7.buffer$default(RxConvert.asFlow(this.query.asObservable(Unit.INSTANCE)), Integer.MAX_VALUE, null, 2, null);
    }

    public final Job refresh(boolean force) {
        return Endpoint.DefaultImpls.refresh$default(this.endpoint, Unit.INSTANCE, force, null, 4, null);
    }
}
