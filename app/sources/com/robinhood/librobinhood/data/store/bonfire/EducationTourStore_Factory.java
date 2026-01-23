package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.education.EducationApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.models.dao.EducationTourDao;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationTourStore_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/EducationTourStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationTourStore;", "educationApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/education/EducationApi;", "hiddenEducationToursPref", "Lcom/robinhood/prefs/StringPreference;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/shared/models/dao/EducationTourDao;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class EducationTourStore_Factory implements Factory<EducationTourStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<EducationTourDao> dao;
    private final Provider<EducationApi> educationApi;
    private final Provider<StringPreference> hiddenEducationToursPref;
    private final Provider<LazyMoshi> moshi;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final EducationTourStore_Factory create(Provider<EducationApi> provider, Provider<StringPreference> provider2, Provider<LazyMoshi> provider3, Provider<StoreBundle> provider4, Provider<EducationTourDao> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final EducationTourStore newInstance(EducationApi educationApi, StringPreference stringPreference, LazyMoshi lazyMoshi, StoreBundle storeBundle, EducationTourDao educationTourDao) {
        return INSTANCE.newInstance(educationApi, stringPreference, lazyMoshi, storeBundle, educationTourDao);
    }

    public EducationTourStore_Factory(Provider<EducationApi> educationApi, Provider<StringPreference> hiddenEducationToursPref, Provider<LazyMoshi> moshi, Provider<StoreBundle> storeBundle, Provider<EducationTourDao> dao) {
        Intrinsics.checkNotNullParameter(educationApi, "educationApi");
        Intrinsics.checkNotNullParameter(hiddenEducationToursPref, "hiddenEducationToursPref");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.educationApi = educationApi;
        this.hiddenEducationToursPref = hiddenEducationToursPref;
        this.moshi = moshi;
        this.storeBundle = storeBundle;
        this.dao = dao;
    }

    @Override // javax.inject.Provider
    public EducationTourStore get() {
        Companion companion = INSTANCE;
        EducationApi educationApi = this.educationApi.get();
        Intrinsics.checkNotNullExpressionValue(educationApi, "get(...)");
        StringPreference stringPreference = this.hiddenEducationToursPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        EducationTourDao educationTourDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(educationTourDao, "get(...)");
        return companion.newInstance(educationApi, stringPreference, lazyMoshi, storeBundle, educationTourDao);
    }

    /* compiled from: EducationTourStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/EducationTourStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/bonfire/EducationTourStore_Factory;", "educationApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/education/EducationApi;", "hiddenEducationToursPref", "Lcom/robinhood/prefs/StringPreference;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/shared/models/dao/EducationTourDao;", "newInstance", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationTourStore;", "lib-store-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EducationTourStore_Factory create(Provider<EducationApi> educationApi, Provider<StringPreference> hiddenEducationToursPref, Provider<LazyMoshi> moshi, Provider<StoreBundle> storeBundle, Provider<EducationTourDao> dao) {
            Intrinsics.checkNotNullParameter(educationApi, "educationApi");
            Intrinsics.checkNotNullParameter(hiddenEducationToursPref, "hiddenEducationToursPref");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            return new EducationTourStore_Factory(educationApi, hiddenEducationToursPref, moshi, storeBundle, dao);
        }

        @JvmStatic
        public final EducationTourStore newInstance(EducationApi educationApi, StringPreference hiddenEducationToursPref, LazyMoshi moshi, StoreBundle storeBundle, EducationTourDao dao) {
            Intrinsics.checkNotNullParameter(educationApi, "educationApi");
            Intrinsics.checkNotNullParameter(hiddenEducationToursPref, "hiddenEducationToursPref");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            return new EducationTourStore(educationApi, hiddenEducationToursPref, moshi, storeBundle, dao);
        }
    }
}
