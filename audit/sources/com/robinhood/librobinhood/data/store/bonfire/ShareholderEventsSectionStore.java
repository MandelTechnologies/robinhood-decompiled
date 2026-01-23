package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.shareholderx.ShareholderXApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.models.dao.bonfire.ShareholderEventsSectionDao;
import com.robinhood.shareholderx.models.api.ApiShareholderEventsSection;
import com.robinhood.shareholderx.models.p401db.ShareholderEventsSection;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: ShareholderEventsSectionStore.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/ShareholderEventsSectionStore;", "Lcom/robinhood/store/Store;", "shareholderXApi", "Lcom/robinhood/android/api/shareholderx/ShareholderXApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/bonfire/ShareholderEventsSectionDao;", "<init>", "(Lcom/robinhood/android/api/shareholderx/ShareholderXApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/bonfire/ShareholderEventsSectionDao;)V", "eventsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/shareholderx/models/api/ApiShareholderEventsSection;", "streamEventsSection", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/shareholderx/models/db/ShareholderEventsSection;", "getStreamEventsSection", "()Lcom/robinhood/android/moria/db/Query;", "lib-store-shareholderx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class ShareholderEventsSectionStore extends Store {
    private final ShareholderEventsSectionDao dao;
    private final Endpoint<UUID, ApiShareholderEventsSection> eventsEndpoint;
    private final ShareholderXApi shareholderXApi;
    private final Query<UUID, ShareholderEventsSection> streamEventsSection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareholderEventsSectionStore(ShareholderXApi shareholderXApi, StoreBundle storeBundle, ShareholderEventsSectionDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(shareholderXApi, "shareholderXApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.shareholderXApi = shareholderXApi;
        this.dao = dao;
        this.eventsEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new ShareholderEventsSectionStore2(shareholderXApi), getLogoutKillswitch(), new ShareholderEventsSectionStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.streamEventsSection = Store.create$default(this, Query.INSTANCE, CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.ShareholderEventsSectionStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShareholderEventsSectionStore.streamEventsSection$lambda$0(this.f$0, (UUID) obj);
            }
        })), new ShareholderEventsSectionStore4(dao), false, 4, null);
    }

    public final Query<UUID, ShareholderEventsSection> getStreamEventsSection() {
        return this.streamEventsSection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamEventsSection$lambda$0(ShareholderEventsSectionStore shareholderEventsSectionStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(shareholderEventsSectionStore.eventsEndpoint, it, Durations.INSTANCE.getONE_DAY(), null, 4, null);
    }
}
