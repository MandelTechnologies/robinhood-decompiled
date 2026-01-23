package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsBonfireApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.models.api.ApiLateCloseAnnouncementCardFlag;
import com.robinhood.models.dao.OptionLateCloseAnnouncementFlagDao;
import com.robinhood.models.p320db.LateCloseAnnouncementCardFlag;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionLateCloseStore.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionLateCloseStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/OptionLateCloseAnnouncementFlagDao;", "optionsBonfireApi", "Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/OptionLateCloseAnnouncementFlagDao;Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;)V", "getAnnouncementCardFlag", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/models/api/ApiLateCloseAnnouncementCardFlag;", "recordAnnouncementCardDismissed", "Lcom/robinhood/android/moria/network/PostEndpoint;", "getRecordAnnouncementCardDismissed", "()Lcom/robinhood/android/moria/network/PostEndpoint;", "streamAnnouncementCardFlag", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/db/LateCloseAnnouncementCardFlag;", "getStreamAnnouncementCardFlag", "()Lcom/robinhood/android/moria/db/Query;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class OptionLateCloseStore extends Store {
    private final OptionLateCloseAnnouncementFlagDao dao;
    private final Endpoint<UUID, ApiLateCloseAnnouncementCardFlag> getAnnouncementCardFlag;
    private final OptionsBonfireApi optionsBonfireApi;
    private final PostEndpoint<UUID, ApiLateCloseAnnouncementCardFlag> recordAnnouncementCardDismissed;
    private final Query<UUID, LateCloseAnnouncementCardFlag> streamAnnouncementCardFlag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionLateCloseStore(StoreBundle storeBundle, OptionLateCloseAnnouncementFlagDao dao, OptionsBonfireApi optionsBonfireApi) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(optionsBonfireApi, "optionsBonfireApi");
        this.dao = dao;
        this.optionsBonfireApi = optionsBonfireApi;
        Endpoint<UUID, ApiLateCloseAnnouncementCardFlag> endpointCreate = Endpoint.INSTANCE.create(new OptionLateCloseStore2(this, null), getLogoutKillswitch(), new OptionLateCloseStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(Durations.INSTANCE.getONE_HOUR(), storeBundle.getClock()));
        this.getAnnouncementCardFlag = endpointCreate;
        this.recordAnnouncementCardDismissed = PostEndpoint.INSTANCE.create(new OptionLateCloseStore4(this, null), new OptionLateCloseStore5(this, null));
        this.streamAnnouncementCardFlag = Store.create$default(this, Query.INSTANCE, CollectionsKt.listOf(new RefreshEach(new OptionLateCloseStore6(endpointCreate))), new OptionLateCloseStore7(dao), false, 4, null);
    }

    public final PostEndpoint<UUID, ApiLateCloseAnnouncementCardFlag> getRecordAnnouncementCardDismissed() {
        return this.recordAnnouncementCardDismissed;
    }

    public final Query<UUID, LateCloseAnnouncementCardFlag> getStreamAnnouncementCardFlag() {
        return this.streamAnnouncementCardFlag;
    }
}
