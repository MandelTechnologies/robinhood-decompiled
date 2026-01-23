package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsBonfireApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.dao.OptionLateCloseAnnouncementFlagDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionLateCloseStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionLateCloseStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/OptionLateCloseStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/OptionLateCloseAnnouncementFlagDao;", "optionsBonfireApi", "Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OptionLateCloseStore_Factory implements Factory<OptionLateCloseStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<OptionLateCloseAnnouncementFlagDao> dao;
    private final Provider<OptionsBonfireApi> optionsBonfireApi;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final OptionLateCloseStore_Factory create(Provider<StoreBundle> provider, Provider<OptionLateCloseAnnouncementFlagDao> provider2, Provider<OptionsBonfireApi> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final OptionLateCloseStore newInstance(StoreBundle storeBundle, OptionLateCloseAnnouncementFlagDao optionLateCloseAnnouncementFlagDao, OptionsBonfireApi optionsBonfireApi) {
        return INSTANCE.newInstance(storeBundle, optionLateCloseAnnouncementFlagDao, optionsBonfireApi);
    }

    public OptionLateCloseStore_Factory(Provider<StoreBundle> storeBundle, Provider<OptionLateCloseAnnouncementFlagDao> dao, Provider<OptionsBonfireApi> optionsBonfireApi) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(optionsBonfireApi, "optionsBonfireApi");
        this.storeBundle = storeBundle;
        this.dao = dao;
        this.optionsBonfireApi = optionsBonfireApi;
    }

    @Override // javax.inject.Provider
    public OptionLateCloseStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        OptionLateCloseAnnouncementFlagDao optionLateCloseAnnouncementFlagDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(optionLateCloseAnnouncementFlagDao, "get(...)");
        OptionsBonfireApi optionsBonfireApi = this.optionsBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(optionsBonfireApi, "get(...)");
        return companion.newInstance(storeBundle, optionLateCloseAnnouncementFlagDao, optionsBonfireApi);
    }

    /* compiled from: OptionLateCloseStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionLateCloseStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/OptionLateCloseStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/OptionLateCloseAnnouncementFlagDao;", "optionsBonfireApi", "Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;", "newInstance", "Lcom/robinhood/librobinhood/data/store/OptionLateCloseStore;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionLateCloseStore_Factory create(Provider<StoreBundle> storeBundle, Provider<OptionLateCloseAnnouncementFlagDao> dao, Provider<OptionsBonfireApi> optionsBonfireApi) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(optionsBonfireApi, "optionsBonfireApi");
            return new OptionLateCloseStore_Factory(storeBundle, dao, optionsBonfireApi);
        }

        @JvmStatic
        public final OptionLateCloseStore newInstance(StoreBundle storeBundle, OptionLateCloseAnnouncementFlagDao dao, OptionsBonfireApi optionsBonfireApi) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(optionsBonfireApi, "optionsBonfireApi");
            return new OptionLateCloseStore(storeBundle, dao, optionsBonfireApi);
        }
    }
}
