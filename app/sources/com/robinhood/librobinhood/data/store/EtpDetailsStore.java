package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.models.dao.EtpDetailsDao;
import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: EtpDetailsStore.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/EtpDetailsStore;", "Lcom/robinhood/store/Store;", "bonfire", "Lcom/robinhood/api/retrofit/BonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/EtpDetailsDao;", "<init>", "(Lcom/robinhood/api/retrofit/BonfireApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/EtpDetailsDao;)V", "etpDetailsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/models/db/EtpDetails;", "streamEtpDetails", "Lcom/robinhood/android/moria/db/Query;", "getStreamEtpDetails", "()Lcom/robinhood/android/moria/db/Query;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class EtpDetailsStore extends Store {
    private final BonfireApi bonfire;
    private final EtpDetailsDao dao;
    private final Endpoint<UUID, EtpDetails> etpDetailsEndpoint;
    private final Query<UUID, EtpDetails> streamEtpDetails;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EtpDetailsStore(BonfireApi bonfire2, StoreBundle storeBundle, EtpDetailsDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(bonfire2, "bonfire");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.bonfire = bonfire2;
        this.dao = dao;
        this.etpDetailsEndpoint = Endpoint.INSTANCE.create(new EtpDetailsStore2(this, null), getLogoutKillswitch(), new EtpDetailsStore3(dao), storeBundle.getClock(), new DefaultStaleDecider(EtpDetails.INSTANCE.getNormalStaleTimeout(), storeBundle.getClock()));
        this.streamEtpDetails = Store.create$default(this, Query.INSTANCE, CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.EtpDetailsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EtpDetailsStore.streamEtpDetails$lambda$0(this.f$0, (UUID) obj);
            }
        })), new EtpDetailsStore4(dao), false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object etpDetailsEndpoint$insert(EtpDetailsDao etpDetailsDao, EtpDetails etpDetails, Continuation continuation) {
        etpDetailsDao.insert((EtpDetailsDao) etpDetails);
        return Unit.INSTANCE;
    }

    public final Query<UUID, EtpDetails> getStreamEtpDetails() {
        return this.streamEtpDetails;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamEtpDetails$lambda$0(EtpDetailsStore etpDetailsStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(etpDetailsStore.etpDetailsEndpoint, it, EtpDetails.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }
}
