package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.models.api.ApiProfileAccountBreakdown;
import com.robinhood.models.dao.ProfileAccountBreakdownDao;
import com.robinhood.models.p355ui.ProfileAccountBreakdown;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import retrofit2.Response;

/* compiled from: ProfileAccountBreakdownStore.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/ProfileAccountBreakdownStore;", "Lcom/robinhood/store/Store;", "bonfireApi", "Lcom/robinhood/api/retrofit/BonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/ProfileAccountBreakdownDao;", "<init>", "(Lcom/robinhood/api/retrofit/BonfireApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/ProfileAccountBreakdownDao;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiProfileAccountBreakdown;", "query", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/ui/ProfileAccountBreakdown;", "pollForProfileAccountBreakdown", "Lio/reactivex/Observable;", "lib-store-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class ProfileAccountBreakdownStore extends Store {
    private final BonfireApi bonfireApi;
    private final ProfileAccountBreakdownDao dao;
    private final Endpoint<Unit, Response<ApiProfileAccountBreakdown>> endpoint;
    private final Query<Unit, ProfileAccountBreakdown> query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAccountBreakdownStore(BonfireApi bonfireApi, StoreBundle storeBundle, ProfileAccountBreakdownDao dao) {
        super(storeBundle, ProfileAccountBreakdown.INSTANCE);
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.bonfireApi = bonfireApi;
        this.dao = dao;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new ProfileAccountBreakdownStore2(this, null), getLogoutKillswitch(), new ProfileAccountBreakdownStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.query = Store.create$default(this, Query.INSTANCE, "queryProfileAccountBreakdown", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.ProfileAccountBreakdownStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileAccountBreakdownStore.query$lambda$0(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.ProfileAccountBreakdownStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileAccountBreakdownStore.query$lambda$1(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(ProfileAccountBreakdownStore profileAccountBreakdownStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint8.backendPoll$default(profileAccountBreakdownStore.endpoint, Unit.INSTANCE, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(ProfileAccountBreakdownStore profileAccountBreakdownStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return profileAccountBreakdownStore.dao.get();
    }

    public final Observable<ProfileAccountBreakdown> pollForProfileAccountBreakdown() {
        return this.query.asObservable(Unit.INSTANCE);
    }
}
