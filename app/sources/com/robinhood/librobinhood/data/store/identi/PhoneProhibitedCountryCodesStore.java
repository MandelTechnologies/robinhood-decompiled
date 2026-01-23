package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.identi.IdentiApi;
import com.robinhood.models.api.identi.ApiPhoneProhibitedCountryCodes;
import com.robinhood.models.dao.PhoneProhibitedCountryCodesDao;
import com.robinhood.models.p355ui.identi.PhoneProhibitedCountryCodes;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* compiled from: PhoneProhibitedCountryCodesStore.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/PhoneProhibitedCountryCodesStore;", "Lcom/robinhood/store/Store;", "api", "Lcom/robinhood/api/identi/IdentiApi;", "dao", "Lcom/robinhood/models/dao/PhoneProhibitedCountryCodesDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/identi/IdentiApi;Lcom/robinhood/models/dao/PhoneProhibitedCountryCodesDao;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/identi/ApiPhoneProhibitedCountryCodes;", "query", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/ui/identi/PhoneProhibitedCountryCodes;", "stream", "Lio/reactivex/Observable;", "refresh", "Lkotlinx/coroutines/Job;", "force", "", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class PhoneProhibitedCountryCodesStore extends Store {
    private final Endpoint<Unit, ApiPhoneProhibitedCountryCodes> endpoint;
    private final Query<Unit, PhoneProhibitedCountryCodes> query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneProhibitedCountryCodesStore(IdentiApi api, final PhoneProhibitedCountryCodesDao dao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new PhoneProhibitedCountryCodesStore2(api, null), getLogoutKillswitch(), new PhoneProhibitedCountryCodesStore3(dao, null), storeBundle.getClock(), null, 16, null);
        this.query = Store.create$default(this, Query.INSTANCE, "streamPhoneProhibitedCountryCodes", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.identi.PhoneProhibitedCountryCodesStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhoneProhibitedCountryCodesStore.query$lambda$0(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.identi.PhoneProhibitedCountryCodesStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhoneProhibitedCountryCodesStore.query$lambda$1(dao, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job query$lambda$0(PhoneProhibitedCountryCodesStore phoneProhibitedCountryCodesStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.refresh$default(phoneProhibitedCountryCodesStore.endpoint, Unit.INSTANCE, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(PhoneProhibitedCountryCodesDao phoneProhibitedCountryCodesDao, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return phoneProhibitedCountryCodesDao.get();
    }

    public final Observable<PhoneProhibitedCountryCodes> stream() {
        return this.query.asObservable(Unit.INSTANCE);
    }

    public static /* synthetic */ Job refresh$default(PhoneProhibitedCountryCodesStore phoneProhibitedCountryCodesStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return phoneProhibitedCountryCodesStore.refresh(z);
    }

    public final Job refresh(boolean force) {
        return Endpoint.DefaultImpls.refresh$default(this.endpoint, Unit.INSTANCE, force, null, 4, null);
    }
}
