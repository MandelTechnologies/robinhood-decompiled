package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.librobinhood.data.store.bonfire.ListDisclosuresStore;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.dao.bonfire.ListDisclosureDao;
import com.robinhood.models.p320db.bonfire.ListDisclosure;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: ListDisclosuresStore.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/ListDisclosuresStore;", "Lcom/robinhood/store/Store;", "bonfireApi", "Lcom/robinhood/api/retrofit/BonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/bonfire/ListDisclosureDao;", "<init>", "(Lcom/robinhood/api/retrofit/BonfireApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/bonfire/ListDisclosureDao;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/bonfire/ListDisclosuresStore$ListDisclosureRequest;", "Lcom/robinhood/models/db/bonfire/ListDisclosure;", "query", "Lcom/robinhood/android/moria/db/Query;", "stream", "Lio/reactivex/Observable;", "listId", "Ljava/util/UUID;", "ownerType", "Lcom/robinhood/models/api/ApiCuratedList$OwnerType;", "ListDisclosureRequest", "lib-store-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class ListDisclosuresStore extends Store {
    private final ListDisclosureDao dao;
    private final Endpoint<ListDisclosureRequest, ListDisclosure> endpoint;
    private final Query<ListDisclosureRequest, ListDisclosure> query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListDisclosuresStore(BonfireApi bonfireApi, StoreBundle storeBundle, ListDisclosureDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.dao = dao;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new ListDisclosuresStore2(bonfireApi, null), getLogoutKillswitch(), new ListDisclosuresStore3(dao), storeBundle.getClock(), null, 16, null);
        this.query = Store.create$default(this, Query.INSTANCE, "queryListDisclosure", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.ListDisclosuresStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListDisclosuresStore.query$lambda$0(this.f$0, (ListDisclosuresStore.ListDisclosureRequest) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.ListDisclosuresStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListDisclosuresStore.query$lambda$1(this.f$0, (ListDisclosuresStore.ListDisclosureRequest) obj);
            }
        }, false, 8, null);
    }

    /* compiled from: ListDisclosuresStore.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/ListDisclosuresStore$ListDisclosureRequest;", "", "listId", "Ljava/util/UUID;", "ownerType", "Lcom/robinhood/models/api/ApiCuratedList$OwnerType;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/api/ApiCuratedList$OwnerType;)V", "getListId", "()Ljava/util/UUID;", "getOwnerType", "()Lcom/robinhood/models/api/ApiCuratedList$OwnerType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ListDisclosureRequest {
        private final UUID listId;
        private final ApiCuratedList.OwnerType ownerType;

        public static /* synthetic */ ListDisclosureRequest copy$default(ListDisclosureRequest listDisclosureRequest, UUID uuid, ApiCuratedList.OwnerType ownerType, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = listDisclosureRequest.listId;
            }
            if ((i & 2) != 0) {
                ownerType = listDisclosureRequest.ownerType;
            }
            return listDisclosureRequest.copy(uuid, ownerType);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getListId() {
            return this.listId;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiCuratedList.OwnerType getOwnerType() {
            return this.ownerType;
        }

        public final ListDisclosureRequest copy(UUID listId, ApiCuratedList.OwnerType ownerType) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(ownerType, "ownerType");
            return new ListDisclosureRequest(listId, ownerType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ListDisclosureRequest)) {
                return false;
            }
            ListDisclosureRequest listDisclosureRequest = (ListDisclosureRequest) other;
            return Intrinsics.areEqual(this.listId, listDisclosureRequest.listId) && this.ownerType == listDisclosureRequest.ownerType;
        }

        public int hashCode() {
            return (this.listId.hashCode() * 31) + this.ownerType.hashCode();
        }

        public String toString() {
            return "ListDisclosureRequest(listId=" + this.listId + ", ownerType=" + this.ownerType + ")";
        }

        public ListDisclosureRequest(UUID listId, ApiCuratedList.OwnerType ownerType) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(ownerType, "ownerType");
            this.listId = listId;
            this.ownerType = ownerType;
        }

        public final UUID getListId() {
            return this.listId;
        }

        public final ApiCuratedList.OwnerType getOwnerType() {
            return this.ownerType;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object endpoint$insert(ListDisclosureDao listDisclosureDao, ListDisclosure listDisclosure, Continuation continuation) {
        listDisclosureDao.insert(listDisclosure);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(ListDisclosuresStore listDisclosuresStore, ListDisclosureRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return Endpoint.DefaultImpls.poll$default(listDisclosuresStore.endpoint, request, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(ListDisclosuresStore listDisclosuresStore, ListDisclosureRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return listDisclosuresStore.dao.getInstrumentDisclosure(request.getListId());
    }

    public final Observable<ListDisclosure> stream(UUID listId, ApiCuratedList.OwnerType ownerType) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(ownerType, "ownerType");
        return this.query.asObservable(new ListDisclosureRequest(listId, ownerType));
    }
}
