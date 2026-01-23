package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.pluto.PlutoApi;
import com.robinhood.models.dao.MerchantOfferTermsDao;
import com.robinhood.models.p320db.mcduckling.MerchantOfferTerms;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* compiled from: MerchantOfferTermsStore.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00162\u0006\u0010\u0012\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/MerchantOfferTermsStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/MerchantOfferTermsDao;", "pluto", "Lcom/robinhood/api/pluto/PlutoApi;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/MerchantOfferTermsDao;Lcom/robinhood/api/pluto/PlutoApi;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/models/db/mcduckling/MerchantOfferTerms;", "query", "Lcom/robinhood/android/moria/db/Query;", "refresh", "Lkotlinx/coroutines/Job;", "id", "force", "", "stream", "Lio/reactivex/Observable;", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class MerchantOfferTermsStore extends Store {
    private final MerchantOfferTermsDao dao;
    private final Endpoint<UUID, MerchantOfferTerms> endpoint;
    private final PlutoApi pluto;
    private final Query<UUID, MerchantOfferTerms> query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerchantOfferTermsStore(StoreBundle storeBundle, MerchantOfferTermsDao dao, PlutoApi pluto) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(pluto, "pluto");
        this.dao = dao;
        this.pluto = pluto;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new MerchantOfferTermsStore2(this, null), getLogoutKillswitch(), new MerchantOfferTermsStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.query = Store.create$default(this, Query.INSTANCE, "streamMerchantOfferTerms", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.MerchantOfferTermsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantOfferTermsStore.query$lambda$0(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.MerchantOfferTermsStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantOfferTermsStore.query$lambda$1(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(MerchantOfferTermsStore merchantOfferTermsStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(merchantOfferTermsStore.endpoint, it, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(MerchantOfferTermsStore merchantOfferTermsStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return merchantOfferTermsStore.dao.getMerchantOfferTerms(it);
    }

    public static /* synthetic */ Job refresh$default(MerchantOfferTermsStore merchantOfferTermsStore, UUID uuid, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return merchantOfferTermsStore.refresh(uuid, z);
    }

    public final Job refresh(UUID id, boolean force) {
        Intrinsics.checkNotNullParameter(id, "id");
        return Endpoint.DefaultImpls.refresh$default(this.endpoint, id, force, null, 4, null);
    }

    public final Observable<MerchantOfferTerms> stream(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.query.asObservable(id);
    }
}
