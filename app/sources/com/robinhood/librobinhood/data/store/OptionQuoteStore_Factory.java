package com.robinhood.librobinhood.data.store;

import android.app.Application;
import android.os.PowerManager;
import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.dao.OptionQuoteDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionQuoteStore_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionQuoteStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionsApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/OptionQuoteDao;", "optionsExtendedHoursEnabledStore", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "powerManager", "Landroid/os/PowerManager;", "application", "Landroid/app/Application;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OptionQuoteStore_Factory implements Factory<OptionQuoteStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Application> application;
    private final Provider<OptionQuoteDao> dao;
    private final Provider<OptionsApi> optionsApi;
    private final Provider<OptionsExtendedHoursEnabledStore> optionsExtendedHoursEnabledStore;
    private final Provider<PowerManager> powerManager;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final OptionQuoteStore_Factory create(Provider<OptionsApi> provider, Provider<StoreBundle> provider2, Provider<OptionQuoteDao> provider3, Provider<OptionsExtendedHoursEnabledStore> provider4, Provider<PowerManager> provider5, Provider<Application> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final OptionQuoteStore newInstance(OptionsApi optionsApi, StoreBundle storeBundle, OptionQuoteDao optionQuoteDao, OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore, PowerManager powerManager, Application application) {
        return INSTANCE.newInstance(optionsApi, storeBundle, optionQuoteDao, optionsExtendedHoursEnabledStore, powerManager, application);
    }

    public OptionQuoteStore_Factory(Provider<OptionsApi> optionsApi, Provider<StoreBundle> storeBundle, Provider<OptionQuoteDao> dao, Provider<OptionsExtendedHoursEnabledStore> optionsExtendedHoursEnabledStore, Provider<PowerManager> powerManager, Provider<Application> application) {
        Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
        Intrinsics.checkNotNullParameter(powerManager, "powerManager");
        Intrinsics.checkNotNullParameter(application, "application");
        this.optionsApi = optionsApi;
        this.storeBundle = storeBundle;
        this.dao = dao;
        this.optionsExtendedHoursEnabledStore = optionsExtendedHoursEnabledStore;
        this.powerManager = powerManager;
        this.application = application;
    }

    @Override // javax.inject.Provider
    public OptionQuoteStore get() {
        Companion companion = INSTANCE;
        OptionsApi optionsApi = this.optionsApi.get();
        Intrinsics.checkNotNullExpressionValue(optionsApi, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        OptionQuoteDao optionQuoteDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(optionQuoteDao, "get(...)");
        OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore = this.optionsExtendedHoursEnabledStore.get();
        Intrinsics.checkNotNullExpressionValue(optionsExtendedHoursEnabledStore, "get(...)");
        PowerManager powerManager = this.powerManager.get();
        Intrinsics.checkNotNullExpressionValue(powerManager, "get(...)");
        Application application = this.application.get();
        Intrinsics.checkNotNullExpressionValue(application, "get(...)");
        return companion.newInstance(optionsApi, storeBundle, optionQuoteDao, optionsExtendedHoursEnabledStore, powerManager, application);
    }

    /* compiled from: OptionQuoteStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionQuoteStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore_Factory;", "optionsApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/OptionQuoteDao;", "optionsExtendedHoursEnabledStore", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "powerManager", "Landroid/os/PowerManager;", "application", "Landroid/app/Application;", "newInstance", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionQuoteStore_Factory create(Provider<OptionsApi> optionsApi, Provider<StoreBundle> storeBundle, Provider<OptionQuoteDao> dao, Provider<OptionsExtendedHoursEnabledStore> optionsExtendedHoursEnabledStore, Provider<PowerManager> powerManager, Provider<Application> application) {
            Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
            Intrinsics.checkNotNullParameter(powerManager, "powerManager");
            Intrinsics.checkNotNullParameter(application, "application");
            return new OptionQuoteStore_Factory(optionsApi, storeBundle, dao, optionsExtendedHoursEnabledStore, powerManager, application);
        }

        @JvmStatic
        public final OptionQuoteStore newInstance(OptionsApi optionsApi, StoreBundle storeBundle, OptionQuoteDao dao, OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore, PowerManager powerManager, Application application) {
            Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
            Intrinsics.checkNotNullParameter(powerManager, "powerManager");
            Intrinsics.checkNotNullParameter(application, "application");
            return new OptionQuoteStore(optionsApi, storeBundle, dao, optionsExtendedHoursEnabledStore, powerManager, application);
        }
    }
}
