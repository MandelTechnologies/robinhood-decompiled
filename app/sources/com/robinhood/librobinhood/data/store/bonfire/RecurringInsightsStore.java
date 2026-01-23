package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.recurring.retrofit.RecurringApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.models.p320db.bonfire.RecurringInsightsPageResponse;
import com.robinhood.recurring.models.dao.RecurringInsightsDao;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringInsightsStore.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/RecurringInsightsStore;", "Lcom/robinhood/store/Store;", "recurringApi", "Lcom/robinhood/android/api/recurring/retrofit/RecurringApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/recurring/models/dao/RecurringInsightsDao;", "<init>", "(Lcom/robinhood/android/api/recurring/retrofit/RecurringApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/recurring/models/dao/RecurringInsightsDao;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/models/db/bonfire/RecurringInsightsPageResponse;", "streamRecurringInsightsPageResponse", "Lcom/robinhood/android/moria/db/Query;", "getStreamRecurringInsightsPageResponse", "()Lcom/robinhood/android/moria/db/Query;", "refresh", "", "scheduleId", "force", "", "lib-store-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RecurringInsightsStore extends Store {
    private final RecurringInsightsDao dao;
    private final Endpoint<UUID, RecurringInsightsPageResponse> endpoint;
    private final RecurringApi recurringApi;
    private final Query<UUID, RecurringInsightsPageResponse> streamRecurringInsightsPageResponse;

    /* JADX WARN: Illegal instructions before constructor call */
    public RecurringInsightsStore(RecurringApi recurringApi, StoreBundle storeBundle, RecurringInsightsDao dao) {
        Intrinsics.checkNotNullParameter(recurringApi, "recurringApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        RecurringInsightsPageResponse.Companion companion = RecurringInsightsPageResponse.INSTANCE;
        super(storeBundle, companion);
        this.recurringApi = recurringApi;
        this.dao = dao;
        this.endpoint = Endpoint.INSTANCE.create(new RecurringInsightsStore2(this, null), getLogoutKillswitch(), new RecurringInsightsStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(companion.getNormalStaleTimeout(), storeBundle.getClock()));
        this.streamRecurringInsightsPageResponse = Store.create$default(this, Query.INSTANCE, "recurringInsightsPageResponse", CollectionsKt.emptyList(), new RecurringInsightsStore4(dao), false, 8, null);
    }

    public final Query<UUID, RecurringInsightsPageResponse> getStreamRecurringInsightsPageResponse() {
        return this.streamRecurringInsightsPageResponse;
    }

    public static /* synthetic */ void refresh$default(RecurringInsightsStore recurringInsightsStore, UUID uuid, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        recurringInsightsStore.refresh(uuid, z);
    }

    public final void refresh(UUID scheduleId, boolean force) {
        Intrinsics.checkNotNullParameter(scheduleId, "scheduleId");
        Endpoint.DefaultImpls.refresh$default(this.endpoint, scheduleId, force, null, 4, null);
    }
}
