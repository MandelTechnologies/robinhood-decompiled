package com.robinhood.librobinhood.data.store;

import android.app.Application;
import android.os.PowerManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.models.dao.IpoQuoteDao;
import com.robinhood.models.dao.QuoteDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuoteStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/QuoteStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "quoteDao", "Lcom/robinhood/models/dao/QuoteDao;", "ipoQuoteDao", "Lcom/robinhood/models/dao/IpoQuoteDao;", "brokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "equitiesBrokeback", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "powerManager", "Landroid/os/PowerManager;", "application", "Landroid/app/Application;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class QuoteStore_Factory implements Factory<QuoteStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Application> application;
    private final Provider<Brokeback> brokeback;
    private final Provider<EquitiesBrokeback> equitiesBrokeback;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<IpoQuoteDao> ipoQuoteDao;
    private final Provider<PowerManager> powerManager;
    private final Provider<QuoteDao> quoteDao;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final QuoteStore_Factory create(Provider<StoreBundle> provider, Provider<QuoteDao> provider2, Provider<IpoQuoteDao> provider3, Provider<Brokeback> provider4, Provider<EquitiesBrokeback> provider5, Provider<ExperimentsStore> provider6, Provider<PowerManager> provider7, Provider<Application> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final QuoteStore newInstance(StoreBundle storeBundle, QuoteDao quoteDao, IpoQuoteDao ipoQuoteDao, Brokeback brokeback, EquitiesBrokeback equitiesBrokeback, ExperimentsStore experimentsStore, PowerManager powerManager, Application application) {
        return INSTANCE.newInstance(storeBundle, quoteDao, ipoQuoteDao, brokeback, equitiesBrokeback, experimentsStore, powerManager, application);
    }

    public QuoteStore_Factory(Provider<StoreBundle> storeBundle, Provider<QuoteDao> quoteDao, Provider<IpoQuoteDao> ipoQuoteDao, Provider<Brokeback> brokeback, Provider<EquitiesBrokeback> equitiesBrokeback, Provider<ExperimentsStore> experimentsStore, Provider<PowerManager> powerManager, Provider<Application> application) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(quoteDao, "quoteDao");
        Intrinsics.checkNotNullParameter(ipoQuoteDao, "ipoQuoteDao");
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(equitiesBrokeback, "equitiesBrokeback");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(powerManager, "powerManager");
        Intrinsics.checkNotNullParameter(application, "application");
        this.storeBundle = storeBundle;
        this.quoteDao = quoteDao;
        this.ipoQuoteDao = ipoQuoteDao;
        this.brokeback = brokeback;
        this.equitiesBrokeback = equitiesBrokeback;
        this.experimentsStore = experimentsStore;
        this.powerManager = powerManager;
        this.application = application;
    }

    @Override // javax.inject.Provider
    public QuoteStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        QuoteDao quoteDao = this.quoteDao.get();
        Intrinsics.checkNotNullExpressionValue(quoteDao, "get(...)");
        IpoQuoteDao ipoQuoteDao = this.ipoQuoteDao.get();
        Intrinsics.checkNotNullExpressionValue(ipoQuoteDao, "get(...)");
        Brokeback brokeback = this.brokeback.get();
        Intrinsics.checkNotNullExpressionValue(brokeback, "get(...)");
        EquitiesBrokeback equitiesBrokeback = this.equitiesBrokeback.get();
        Intrinsics.checkNotNullExpressionValue(equitiesBrokeback, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        PowerManager powerManager = this.powerManager.get();
        Intrinsics.checkNotNullExpressionValue(powerManager, "get(...)");
        Application application = this.application.get();
        Intrinsics.checkNotNullExpressionValue(application, "get(...)");
        return companion.newInstance(storeBundle, quoteDao, ipoQuoteDao, brokeback, equitiesBrokeback, experimentsStore, powerManager, application);
    }

    /* compiled from: QuoteStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/QuoteStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/QuoteStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "quoteDao", "Lcom/robinhood/models/dao/QuoteDao;", "ipoQuoteDao", "Lcom/robinhood/models/dao/IpoQuoteDao;", "brokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "equitiesBrokeback", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "powerManager", "Landroid/os/PowerManager;", "application", "Landroid/app/Application;", "newInstance", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final QuoteStore_Factory create(Provider<StoreBundle> storeBundle, Provider<QuoteDao> quoteDao, Provider<IpoQuoteDao> ipoQuoteDao, Provider<Brokeback> brokeback, Provider<EquitiesBrokeback> equitiesBrokeback, Provider<ExperimentsStore> experimentsStore, Provider<PowerManager> powerManager, Provider<Application> application) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(quoteDao, "quoteDao");
            Intrinsics.checkNotNullParameter(ipoQuoteDao, "ipoQuoteDao");
            Intrinsics.checkNotNullParameter(brokeback, "brokeback");
            Intrinsics.checkNotNullParameter(equitiesBrokeback, "equitiesBrokeback");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(powerManager, "powerManager");
            Intrinsics.checkNotNullParameter(application, "application");
            return new QuoteStore_Factory(storeBundle, quoteDao, ipoQuoteDao, brokeback, equitiesBrokeback, experimentsStore, powerManager, application);
        }

        @JvmStatic
        public final QuoteStore newInstance(StoreBundle storeBundle, QuoteDao quoteDao, IpoQuoteDao ipoQuoteDao, Brokeback brokeback, EquitiesBrokeback equitiesBrokeback, ExperimentsStore experimentsStore, PowerManager powerManager, Application application) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(quoteDao, "quoteDao");
            Intrinsics.checkNotNullParameter(ipoQuoteDao, "ipoQuoteDao");
            Intrinsics.checkNotNullParameter(brokeback, "brokeback");
            Intrinsics.checkNotNullParameter(equitiesBrokeback, "equitiesBrokeback");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(powerManager, "powerManager");
            Intrinsics.checkNotNullParameter(application, "application");
            return new QuoteStore(storeBundle, quoteDao, ipoQuoteDao, brokeback, equitiesBrokeback, experimentsStore, powerManager, application);
        }
    }
}
