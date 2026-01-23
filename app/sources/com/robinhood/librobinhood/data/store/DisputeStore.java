package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.models.api.minerva.ApiDispute;
import com.robinhood.models.dao.DisputeDao;
import com.robinhood.models.p320db.mcduckling.Dispute;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: DisputeStore.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0010\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/DisputeStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/DisputeDao;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/DisputeDao;Lcom/robinhood/api/retrofit/Minerva;)V", "getDisputeEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/models/api/minerva/ApiDispute;", "refresh", "", "id", "force", "", "stream", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/mcduckling/Dispute;", "lib-store-cash_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class DisputeStore extends Store {
    private final DisputeDao dao;
    private final Endpoint<UUID, ApiDispute> getDisputeEndpoint;
    private final Minerva minerva;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisputeStore(StoreBundle storeBundle, DisputeDao dao, Minerva minerva) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(minerva, "minerva");
        this.dao = dao;
        this.minerva = minerva;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        DisputeStore2 disputeStore2 = new DisputeStore2(this, null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        DisputeStore3 disputeStore3 = new DisputeStore3(dao);
        Clock clock = storeBundle.getClock();
        Duration durationOfMinutes = Duration.ofMinutes(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        this.getDisputeEndpoint = companion.create(disputeStore2, logoutKillswitch, disputeStore3, clock, new DefaultStaleDecider(durationOfMinutes, storeBundle.getClock()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getDisputeEndpoint$insert(DisputeDao disputeDao, ApiDispute apiDispute, Continuation continuation) {
        disputeDao.insert(apiDispute);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void refresh$default(DisputeStore disputeStore, UUID uuid, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        disputeStore.refresh(uuid, z);
    }

    public final void refresh(UUID id, boolean force) {
        Intrinsics.checkNotNullParameter(id, "id");
        Endpoint.DefaultImpls.refresh$default(this.getDisputeEndpoint, id, force, null, 4, null);
    }

    public final Flow<Dispute> stream(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return FlowKt.filterNotNull(this.dao.get(id));
    }
}
