package com.robinhood.librobinhood.data.store.alert;

import com.robinhood.android.advanced.alert.api.AdvancedAlertApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.advanced.alert.dao.AlertHubUiResourcesDao;
import com.robinhood.models.dao.AdvancedAlertDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedAlertStore_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertStore;", "advancedAlertApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/advanced/alert/api/AdvancedAlertApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/AdvancedAlertDao;", "resourceDao", "Lcom/robinhood/models/advanced/alert/dao/AlertHubUiResourcesDao;", "alertHubSettingsStore", "Lcom/robinhood/librobinhood/data/store/alert/AlertHubSettingsStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class AdvancedAlertStore_Factory implements Factory<AdvancedAlertStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AdvancedAlertApi> advancedAlertApi;
    private final Provider<AlertHubSettingsStore> alertHubSettingsStore;
    private final Provider<AdvancedAlertDao> dao;
    private final Provider<AlertHubUiResourcesDao> resourceDao;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final AdvancedAlertStore_Factory create(Provider<AdvancedAlertApi> provider, Provider<StoreBundle> provider2, Provider<AdvancedAlertDao> provider3, Provider<AlertHubUiResourcesDao> provider4, Provider<AlertHubSettingsStore> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final AdvancedAlertStore newInstance(AdvancedAlertApi advancedAlertApi, StoreBundle storeBundle, AdvancedAlertDao advancedAlertDao, AlertHubUiResourcesDao alertHubUiResourcesDao, AlertHubSettingsStore alertHubSettingsStore) {
        return INSTANCE.newInstance(advancedAlertApi, storeBundle, advancedAlertDao, alertHubUiResourcesDao, alertHubSettingsStore);
    }

    public AdvancedAlertStore_Factory(Provider<AdvancedAlertApi> advancedAlertApi, Provider<StoreBundle> storeBundle, Provider<AdvancedAlertDao> dao, Provider<AlertHubUiResourcesDao> resourceDao, Provider<AlertHubSettingsStore> alertHubSettingsStore) {
        Intrinsics.checkNotNullParameter(advancedAlertApi, "advancedAlertApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(resourceDao, "resourceDao");
        Intrinsics.checkNotNullParameter(alertHubSettingsStore, "alertHubSettingsStore");
        this.advancedAlertApi = advancedAlertApi;
        this.storeBundle = storeBundle;
        this.dao = dao;
        this.resourceDao = resourceDao;
        this.alertHubSettingsStore = alertHubSettingsStore;
    }

    @Override // javax.inject.Provider
    public AdvancedAlertStore get() {
        Companion companion = INSTANCE;
        AdvancedAlertApi advancedAlertApi = this.advancedAlertApi.get();
        Intrinsics.checkNotNullExpressionValue(advancedAlertApi, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        AdvancedAlertDao advancedAlertDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(advancedAlertDao, "get(...)");
        AlertHubUiResourcesDao alertHubUiResourcesDao = this.resourceDao.get();
        Intrinsics.checkNotNullExpressionValue(alertHubUiResourcesDao, "get(...)");
        AlertHubSettingsStore alertHubSettingsStore = this.alertHubSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(alertHubSettingsStore, "get(...)");
        return companion.newInstance(advancedAlertApi, storeBundle, advancedAlertDao, alertHubUiResourcesDao, alertHubSettingsStore);
    }

    /* compiled from: AdvancedAlertStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertStore_Factory;", "advancedAlertApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/advanced/alert/api/AdvancedAlertApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/AdvancedAlertDao;", "resourceDao", "Lcom/robinhood/models/advanced/alert/dao/AlertHubUiResourcesDao;", "alertHubSettingsStore", "Lcom/robinhood/librobinhood/data/store/alert/AlertHubSettingsStore;", "newInstance", "Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertStore;", "lib-store-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AdvancedAlertStore_Factory create(Provider<AdvancedAlertApi> advancedAlertApi, Provider<StoreBundle> storeBundle, Provider<AdvancedAlertDao> dao, Provider<AlertHubUiResourcesDao> resourceDao, Provider<AlertHubSettingsStore> alertHubSettingsStore) {
            Intrinsics.checkNotNullParameter(advancedAlertApi, "advancedAlertApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(resourceDao, "resourceDao");
            Intrinsics.checkNotNullParameter(alertHubSettingsStore, "alertHubSettingsStore");
            return new AdvancedAlertStore_Factory(advancedAlertApi, storeBundle, dao, resourceDao, alertHubSettingsStore);
        }

        @JvmStatic
        public final AdvancedAlertStore newInstance(AdvancedAlertApi advancedAlertApi, StoreBundle storeBundle, AdvancedAlertDao dao, AlertHubUiResourcesDao resourceDao, AlertHubSettingsStore alertHubSettingsStore) {
            Intrinsics.checkNotNullParameter(advancedAlertApi, "advancedAlertApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(resourceDao, "resourceDao");
            Intrinsics.checkNotNullParameter(alertHubSettingsStore, "alertHubSettingsStore");
            return new AdvancedAlertStore(advancedAlertApi, storeBundle, dao, resourceDao, alertHubSettingsStore);
        }
    }
}
