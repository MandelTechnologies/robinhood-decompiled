package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.lib.api.directipo.DirectIpoApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.directipo.models.api.ApiDirectIpoOrderEntryIntro;
import com.robinhood.directipo.models.p292db.DirectIpoOrderEntryIntro;
import com.robinhood.models.dao.bonfire.DirectIpoOrderEntryIntroDao;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: DirectIpoOrderEntryIntroStore.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u0013\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/DirectIpoOrderEntryIntroStore;", "Lcom/robinhood/store/Store;", "api", "Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/bonfire/DirectIpoOrderEntryIntroDao;", "<init>", "(Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/bonfire/DirectIpoOrderEntryIntroDao;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderEntryIntro;", "query", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/directipo/models/db/DirectIpoOrderEntryIntro;", "stream", "Lio/reactivex/Observable;", "instrumentId", "lib-store-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class DirectIpoOrderEntryIntroStore extends Store {
    private final DirectIpoApi api;
    private final DirectIpoOrderEntryIntroDao dao;
    private final Endpoint<UUID, ApiDirectIpoOrderEntryIntro> endpoint;
    private final Query<UUID, DirectIpoOrderEntryIntro> query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectIpoOrderEntryIntroStore(DirectIpoApi api, StoreBundle storeBundle, DirectIpoOrderEntryIntroDao dao) {
        super(storeBundle, DirectIpoOrderEntryIntro.INSTANCE);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.api = api;
        this.dao = dao;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new DirectIpoOrderEntryIntroStore2(api), getLogoutKillswitch(), new DirectIpoOrderEntryIntroStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.query = Store.create$default(this, Query.INSTANCE, "queryDirectIpoOrderEntryIntro", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.DirectIpoOrderEntryIntroStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOrderEntryIntroStore.query$lambda$0(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.DirectIpoOrderEntryIntroStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOrderEntryIntroStore.query$lambda$1(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(DirectIpoOrderEntryIntroStore directIpoOrderEntryIntroStore, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return Endpoint.DefaultImpls.poll$default(directIpoOrderEntryIntroStore.endpoint, instrumentId, DirectIpoOrderEntryIntro.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(DirectIpoOrderEntryIntroStore directIpoOrderEntryIntroStore, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return directIpoOrderEntryIntroStore.dao.getOrderEntryIntro(instrumentId);
    }

    public final Observable<DirectIpoOrderEntryIntro> stream(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return this.query.asObservable(instrumentId);
    }
}
