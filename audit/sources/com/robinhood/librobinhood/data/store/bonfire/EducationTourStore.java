package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.education.EducationApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.HiddenEducationToursPref;
import com.robinhood.shared.models.api.bonfire.education.tour.ApiEducationTourResult;
import com.robinhood.shared.models.dao.EducationTourDao;
import com.robinhood.shared.models.p387db.bonfire.education.tour.EducationTourResult;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.Completables;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import com.squareup.moshi.JsonAdapter;
import io.reactivex.Completable;
import io.reactivex.Observable;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: EducationTourStore.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001a\u001a\u00020\u001bJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0012\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/EducationTourStore;", "Lcom/robinhood/store/Store;", "educationApi", "Lcom/robinhood/android/api/education/EducationApi;", "hiddenEducationToursPref", "Lcom/robinhood/prefs/StringPreference;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/shared/models/dao/EducationTourDao;", "<init>", "(Lcom/robinhood/android/api/education/EducationApi;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/shared/models/dao/EducationTourDao;)V", "stringSetAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "Lcom/robinhood/shared/models/api/bonfire/education/tour/ApiEducationTourResult;", "refreshEducationTour", "Lio/reactivex/Completable;", "screen", "screenUniqueId", "force", "", "streamEducationTour", "Lio/reactivex/Observable;", "Lcom/robinhood/shared/models/db/bonfire/education/tour/EducationTourResult;", "setEducationTourShouldHide", "", "trackingId", "shouldHide", "lib-store-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class EducationTourStore extends Store {
    private final EducationTourDao dao;
    private final EducationApi educationApi;
    private final Endpoint<Tuples2<String, String>, ApiEducationTourResult> endpoint;
    private final StringPreference hiddenEducationToursPref;
    private final JsonAdapter<Set<String>> stringSetAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationTourStore(EducationApi educationApi, @HiddenEducationToursPref StringPreference hiddenEducationToursPref, LazyMoshi moshi, StoreBundle storeBundle, EducationTourDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(educationApi, "educationApi");
        Intrinsics.checkNotNullParameter(hiddenEducationToursPref, "hiddenEducationToursPref");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.educationApi = educationApi;
        this.hiddenEducationToursPref = hiddenEducationToursPref;
        this.dao = dao;
        Types types = Types.INSTANCE;
        this.stringSetAdapter = moshi.adapter(new TypeToken<Set<? extends String>>() { // from class: com.robinhood.librobinhood.data.store.bonfire.EducationTourStore$special$$inlined$getAdapter$1
        }.getType());
        this.endpoint = Endpoint.INSTANCE.createWithParams(new EducationTourStore2(this, null), getLogoutKillswitch(), new EducationTourStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(Durations.INSTANCE.getTHIRTY_MINUTES(), storeBundle.getClock()));
    }

    public final Completable refreshEducationTour(String screen, String screenUniqueId, boolean force) {
        Completable completableRxCompletable$default;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (force) {
            completableRxCompletable$default = RxFactory.DefaultImpls.rxCompletable$default(this, null, new EducationTourStore4(this, screen, screenUniqueId, null), 1, null);
        } else {
            completableRxCompletable$default = RxFactory.DefaultImpls.rxCompletable$default(this, null, new EducationTourStore5(this, screen, screenUniqueId, null), 1, null);
        }
        Completable completableCache = completableRxCompletable$default.cache();
        Intrinsics.checkNotNull(completableCache);
        ScopedSubscriptionKt.subscribeIn(Completables.ignoreNetworkExceptions(completableCache), getStoreScope());
        return completableCache;
    }

    public final Observable<EducationTourResult> streamEducationTour(String screen, String screenUniqueId) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        EducationTourDao educationTourDao = this.dao;
        if (screenUniqueId == null) {
            screenUniqueId = "";
        }
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(educationTourDao.get(screen, screenUniqueId))));
    }

    public final void setEducationTourShouldHide(String trackingId, boolean shouldHide) {
        Set<String> setEmptySet;
        Set<String> setMinus;
        Intrinsics.checkNotNullParameter(trackingId, "trackingId");
        String str = this.hiddenEducationToursPref.get();
        if (str == null || (setEmptySet = this.stringSetAdapter.fromJson(str)) == null) {
            setEmptySet = SetsKt.emptySet();
        }
        if (shouldHide) {
            setMinus = SetsKt.plus(setEmptySet, trackingId);
        } else {
            setMinus = SetsKt.minus(setEmptySet, trackingId);
        }
        this.hiddenEducationToursPref.set(this.stringSetAdapter.toJson(setMinus));
    }
}
