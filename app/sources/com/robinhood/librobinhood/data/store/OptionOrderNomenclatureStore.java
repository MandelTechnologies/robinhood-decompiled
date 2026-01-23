package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsBonfireApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.models.api.ApiOptionOrderDetailScreen;
import com.robinhood.models.dao.OptionOrderDetailScreenDao;
import com.robinhood.models.p320db.OptionOrderDetailScreen;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderNomenclatureStore.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionOrderNomenclatureStore;", "Lcom/robinhood/store/Store;", "dao", "Lcom/robinhood/models/dao/OptionOrderDetailScreenDao;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionsBonfireApi", "Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/models/dao/OptionOrderDetailScreenDao;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;Lcom/robinhood/store/StoreBundle;)V", "isInNomenclatureExperiment", "Lio/reactivex/Observable;", "", "getOptionOrderDetailScreen", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/models/api/ApiOptionOrderDetailScreen;", "streamOptionOrderDetailScreen", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/db/OptionOrderDetailScreen;", "getStreamOptionOrderDetailScreen", "()Lcom/robinhood/android/moria/db/Query;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class OptionOrderNomenclatureStore extends Store {
    private final OptionOrderDetailScreenDao dao;
    private final ExperimentsStore experimentsStore;
    private final Endpoint<UUID, ApiOptionOrderDetailScreen> getOptionOrderDetailScreen;
    private final OptionsBonfireApi optionsBonfireApi;
    private final Query<UUID, OptionOrderDetailScreen> streamOptionOrderDetailScreen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionOrderNomenclatureStore(OptionOrderDetailScreenDao dao, ExperimentsStore experimentsStore, OptionsBonfireApi optionsBonfireApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(optionsBonfireApi, "optionsBonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.dao = dao;
        this.experimentsStore = experimentsStore;
        this.optionsBonfireApi = optionsBonfireApi;
        Endpoint<UUID, ApiOptionOrderDetailScreen> endpointCreate = Endpoint.INSTANCE.create(new OptionOrderNomenclatureStore2(this, null), getLogoutKillswitch(), new OptionOrderNomenclatureStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(Durations.INSTANCE.getONE_HOUR(), storeBundle.getClock()));
        this.getOptionOrderDetailScreen = endpointCreate;
        this.streamOptionOrderDetailScreen = Store.create$default(this, Query.INSTANCE, CollectionsKt.listOf(new RefreshEach(new OptionOrderNomenclatureStore4(endpointCreate))), new OptionOrderNomenclatureStore5(dao), false, 4, null);
    }

    public final Observable<Boolean> isInNomenclatureExperiment() {
        return ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiment.OPTIONS_SERVER_DRIVEN_NOMENCLATURE.INSTANCE}, false, null, 6, null);
    }

    public final Query<UUID, OptionOrderDetailScreen> getStreamOptionOrderDetailScreen() {
        return this.streamOptionOrderDetailScreen;
    }
}
