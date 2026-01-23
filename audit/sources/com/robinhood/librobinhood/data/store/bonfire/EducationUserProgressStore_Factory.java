package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.education.EducationApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.models.dao.EducationUserProgressDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationUserProgressStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/EducationUserProgressStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationUserProgressStore;", "educationApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/education/EducationApi;", "userProgressDao", "Lcom/robinhood/shared/models/dao/EducationUserProgressDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class EducationUserProgressStore_Factory implements Factory<EducationUserProgressStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<EducationApi> educationApi;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<EducationUserProgressDao> userProgressDao;

    @JvmStatic
    public static final EducationUserProgressStore_Factory create(Provider<EducationApi> provider, Provider<EducationUserProgressDao> provider2, Provider<StoreBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final EducationUserProgressStore newInstance(EducationApi educationApi, EducationUserProgressDao educationUserProgressDao, StoreBundle storeBundle) {
        return INSTANCE.newInstance(educationApi, educationUserProgressDao, storeBundle);
    }

    public EducationUserProgressStore_Factory(Provider<EducationApi> educationApi, Provider<EducationUserProgressDao> userProgressDao, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(educationApi, "educationApi");
        Intrinsics.checkNotNullParameter(userProgressDao, "userProgressDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.educationApi = educationApi;
        this.userProgressDao = userProgressDao;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public EducationUserProgressStore get() {
        Companion companion = INSTANCE;
        EducationApi educationApi = this.educationApi.get();
        Intrinsics.checkNotNullExpressionValue(educationApi, "get(...)");
        EducationUserProgressDao educationUserProgressDao = this.userProgressDao.get();
        Intrinsics.checkNotNullExpressionValue(educationUserProgressDao, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(educationApi, educationUserProgressDao, storeBundle);
    }

    /* compiled from: EducationUserProgressStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/EducationUserProgressStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/bonfire/EducationUserProgressStore_Factory;", "educationApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/education/EducationApi;", "userProgressDao", "Lcom/robinhood/shared/models/dao/EducationUserProgressDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationUserProgressStore;", "lib-store-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EducationUserProgressStore_Factory create(Provider<EducationApi> educationApi, Provider<EducationUserProgressDao> userProgressDao, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(educationApi, "educationApi");
            Intrinsics.checkNotNullParameter(userProgressDao, "userProgressDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new EducationUserProgressStore_Factory(educationApi, userProgressDao, storeBundle);
        }

        @JvmStatic
        public final EducationUserProgressStore newInstance(EducationApi educationApi, EducationUserProgressDao userProgressDao, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(educationApi, "educationApi");
            Intrinsics.checkNotNullParameter(userProgressDao, "userProgressDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new EducationUserProgressStore(educationApi, userProgressDao, storeBundle);
        }
    }
}
