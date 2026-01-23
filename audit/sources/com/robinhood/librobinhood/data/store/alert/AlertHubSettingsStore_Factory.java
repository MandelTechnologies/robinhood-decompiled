package com.robinhood.librobinhood.data.store.alert;

import com.robinhood.android.advanced.alert.api.AdvancedAlertApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.advanced.alert.dao.AlertHubSettingsDao;
import com.robinhood.models.dao.AdvancedAlertDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AlertHubSettingsStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/alert/AlertHubSettingsStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/alert/AlertHubSettingsStore;", "advancedAlertApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/advanced/alert/api/AdvancedAlertApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/advanced/alert/dao/AlertHubSettingsDao;", "advancedAlertDao", "Lcom/robinhood/models/dao/AdvancedAlertDao;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class AlertHubSettingsStore_Factory implements Factory<AlertHubSettingsStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AdvancedAlertApi> advancedAlertApi;
    private final Provider<AdvancedAlertDao> advancedAlertDao;
    private final Provider<AlertHubSettingsDao> dao;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final AlertHubSettingsStore_Factory create(Provider<AdvancedAlertApi> provider, Provider<StoreBundle> provider2, Provider<AlertHubSettingsDao> provider3, Provider<AdvancedAlertDao> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final AlertHubSettingsStore newInstance(AdvancedAlertApi advancedAlertApi, StoreBundle storeBundle, AlertHubSettingsDao alertHubSettingsDao, AdvancedAlertDao advancedAlertDao) {
        return INSTANCE.newInstance(advancedAlertApi, storeBundle, alertHubSettingsDao, advancedAlertDao);
    }

    public AlertHubSettingsStore_Factory(Provider<AdvancedAlertApi> advancedAlertApi, Provider<StoreBundle> storeBundle, Provider<AlertHubSettingsDao> dao, Provider<AdvancedAlertDao> advancedAlertDao) {
        Intrinsics.checkNotNullParameter(advancedAlertApi, "advancedAlertApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(advancedAlertDao, "advancedAlertDao");
        this.advancedAlertApi = advancedAlertApi;
        this.storeBundle = storeBundle;
        this.dao = dao;
        this.advancedAlertDao = advancedAlertDao;
    }

    @Override // javax.inject.Provider
    public AlertHubSettingsStore get() {
        Companion companion = INSTANCE;
        AdvancedAlertApi advancedAlertApi = this.advancedAlertApi.get();
        Intrinsics.checkNotNullExpressionValue(advancedAlertApi, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        AlertHubSettingsDao alertHubSettingsDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(alertHubSettingsDao, "get(...)");
        AdvancedAlertDao advancedAlertDao = this.advancedAlertDao.get();
        Intrinsics.checkNotNullExpressionValue(advancedAlertDao, "get(...)");
        return companion.newInstance(advancedAlertApi, storeBundle, alertHubSettingsDao, advancedAlertDao);
    }

    /* compiled from: AlertHubSettingsStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/alert/AlertHubSettingsStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/alert/AlertHubSettingsStore_Factory;", "advancedAlertApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/advanced/alert/api/AdvancedAlertApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/advanced/alert/dao/AlertHubSettingsDao;", "advancedAlertDao", "Lcom/robinhood/models/dao/AdvancedAlertDao;", "newInstance", "Lcom/robinhood/librobinhood/data/store/alert/AlertHubSettingsStore;", "lib-store-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AlertHubSettingsStore_Factory create(Provider<AdvancedAlertApi> advancedAlertApi, Provider<StoreBundle> storeBundle, Provider<AlertHubSettingsDao> dao, Provider<AdvancedAlertDao> advancedAlertDao) {
            Intrinsics.checkNotNullParameter(advancedAlertApi, "advancedAlertApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(advancedAlertDao, "advancedAlertDao");
            return new AlertHubSettingsStore_Factory(advancedAlertApi, storeBundle, dao, advancedAlertDao);
        }

        @JvmStatic
        public final AlertHubSettingsStore newInstance(AdvancedAlertApi advancedAlertApi, StoreBundle storeBundle, AlertHubSettingsDao dao, AdvancedAlertDao advancedAlertDao) {
            Intrinsics.checkNotNullParameter(advancedAlertApi, "advancedAlertApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(advancedAlertDao, "advancedAlertDao");
            return new AlertHubSettingsStore(advancedAlertApi, storeBundle, dao, advancedAlertDao);
        }
    }
}
