package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.shareholderx.ShareholderXApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.models.dao.bonfire.ShareholderEventsPageDao;
import com.robinhood.shareholderx.models.api.ApiShareholderEventsPage;
import com.robinhood.shareholderx.models.p401db.ShareholderEventsPage;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: ShareholderEventsPageStore.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/ShareholderEventsPageStore;", "Lcom/robinhood/store/Store;", "shareholderXApi", "Lcom/robinhood/android/api/shareholderx/ShareholderXApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/bonfire/ShareholderEventsPageDao;", "<init>", "(Lcom/robinhood/android/api/shareholderx/ShareholderXApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/bonfire/ShareholderEventsPageDao;)V", "eventsPageEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/bonfire/ShareholderEventsPageStore$EventsPageParams;", "Lcom/robinhood/shareholderx/models/api/ApiShareholderEventsPage;", "streamEventsPage", "Lcom/robinhood/android/moria/db/Query;", "Ljava/util/UUID;", "Lcom/robinhood/shareholderx/models/db/ShareholderEventsPage;", "getStreamEventsPage", "()Lcom/robinhood/android/moria/db/Query;", "filterEventsPage", "", "instrumentId", "filter", "", "EventsPageParams", "lib-store-shareholderx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class ShareholderEventsPageStore extends Store {
    private final ShareholderEventsPageDao dao;
    private final Endpoint<EventsPageParams, ApiShareholderEventsPage> eventsPageEndpoint;
    private final ShareholderXApi shareholderXApi;
    private final Query<UUID, ShareholderEventsPage> streamEventsPage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareholderEventsPageStore(ShareholderXApi shareholderXApi, StoreBundle storeBundle, ShareholderEventsPageDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(shareholderXApi, "shareholderXApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.shareholderXApi = shareholderXApi;
        this.dao = dao;
        this.eventsPageEndpoint = Endpoint.Companion.createWithParams$default(Endpoint.INSTANCE, new ShareholderEventsPageStore2(this, null), getLogoutKillswitch(), new ShareholderEventsPageStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.streamEventsPage = Store.create$default(this, Query.INSTANCE, "streamEventsPage", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.ShareholderEventsPageStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShareholderEventsPageStore.streamEventsPage$lambda$0(this.f$0, (UUID) obj);
            }
        })), new ShareholderEventsPageStore4(dao), false, 8, null);
    }

    /* compiled from: ShareholderEventsPageStore.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/ShareholderEventsPageStore$EventsPageParams;", "", "instrumentId", "Ljava/util/UUID;", "filter", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getInstrumentId", "()Ljava/util/UUID;", "getFilter", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-shareholderx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EventsPageParams {
        private final String filter;
        private final UUID instrumentId;

        public static /* synthetic */ EventsPageParams copy$default(EventsPageParams eventsPageParams, UUID uuid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = eventsPageParams.instrumentId;
            }
            if ((i & 2) != 0) {
                str = eventsPageParams.filter;
            }
            return eventsPageParams.copy(uuid, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFilter() {
            return this.filter;
        }

        public final EventsPageParams copy(UUID instrumentId, String filter) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            return new EventsPageParams(instrumentId, filter);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EventsPageParams)) {
                return false;
            }
            EventsPageParams eventsPageParams = (EventsPageParams) other;
            return Intrinsics.areEqual(this.instrumentId, eventsPageParams.instrumentId) && Intrinsics.areEqual(this.filter, eventsPageParams.filter);
        }

        public int hashCode() {
            int iHashCode = this.instrumentId.hashCode() * 31;
            String str = this.filter;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "EventsPageParams(instrumentId=" + this.instrumentId + ", filter=" + this.filter + ")";
        }

        public EventsPageParams(UUID instrumentId, String str) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.instrumentId = instrumentId;
            this.filter = str;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final String getFilter() {
            return this.filter;
        }
    }

    public final Query<UUID, ShareholderEventsPage> getStreamEventsPage() {
        return this.streamEventsPage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job streamEventsPage$lambda$0(ShareholderEventsPageStore shareholderEventsPageStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.refresh$default(shareholderEventsPageStore.eventsPageEndpoint, new EventsPageParams(it, null), false, null, 6, null);
    }

    public final void filterEventsPage(UUID instrumentId, String filter) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(filter, "filter");
        Endpoint.DefaultImpls.refresh$default(this.eventsPageEndpoint, new EventsPageParams(instrumentId, filter), false, null, 6, null);
    }
}
