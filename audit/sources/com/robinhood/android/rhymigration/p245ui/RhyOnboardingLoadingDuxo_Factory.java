package com.robinhood.android.rhymigration.p245ui;

import android.app.Application;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.data.store.RhyApplicationStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyOnboardingLoadingDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingDuxo;", "app", "Ljavax/inject/Provider;", "Landroid/app/Application;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "rhyApplicationStore", "Lcom/robinhood/librobinhood/data/store/RhyApplicationStore;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RhyOnboardingLoadingDuxo_Factory implements Factory<RhyOnboardingLoadingDuxo> {
    private final Provider<Application> app;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<MinervaAccountStore> minervaAccountStore;
    private final Provider<RhyApplicationStore> rhyApplicationStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<StaticContentStore> staticContentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RhyOnboardingLoadingDuxo_Factory create(Provider<Application> provider, Provider<StaticContentStore> provider2, Provider<RhyApplicationStore> provider3, Provider<MinervaAccountStore> provider4, Provider<ExperimentsStore> provider5, Provider<DispatcherProvider> provider6, Provider<RxFactory> provider7, Provider<RxGlobalErrorHandler> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final RhyOnboardingLoadingDuxo newInstance(Application application, StaticContentStore staticContentStore, RhyApplicationStore rhyApplicationStore, MinervaAccountStore minervaAccountStore, ExperimentsStore experimentsStore) {
        return INSTANCE.newInstance(application, staticContentStore, rhyApplicationStore, minervaAccountStore, experimentsStore);
    }

    public RhyOnboardingLoadingDuxo_Factory(Provider<Application> app, Provider<StaticContentStore> staticContentStore, Provider<RhyApplicationStore> rhyApplicationStore, Provider<MinervaAccountStore> minervaAccountStore, Provider<ExperimentsStore> experimentsStore, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(rhyApplicationStore, "rhyApplicationStore");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.app = app;
        this.staticContentStore = staticContentStore;
        this.rhyApplicationStore = rhyApplicationStore;
        this.minervaAccountStore = minervaAccountStore;
        this.experimentsStore = experimentsStore;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public RhyOnboardingLoadingDuxo get() {
        Companion companion = INSTANCE;
        Application application = this.app.get();
        Intrinsics.checkNotNullExpressionValue(application, "get(...)");
        StaticContentStore staticContentStore = this.staticContentStore.get();
        Intrinsics.checkNotNullExpressionValue(staticContentStore, "get(...)");
        RhyApplicationStore rhyApplicationStore = this.rhyApplicationStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyApplicationStore, "get(...)");
        MinervaAccountStore minervaAccountStore = this.minervaAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(minervaAccountStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        RhyOnboardingLoadingDuxo rhyOnboardingLoadingDuxoNewInstance = companion.newInstance(application, staticContentStore, rhyApplicationStore, minervaAccountStore, experimentsStore);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(rhyOnboardingLoadingDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(rhyOnboardingLoadingDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(rhyOnboardingLoadingDuxoNewInstance, rxGlobalErrorHandler);
        return rhyOnboardingLoadingDuxoNewInstance;
    }

    /* compiled from: RhyOnboardingLoadingDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007J0\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingDuxo_Factory;", "app", "Ljavax/inject/Provider;", "Landroid/app/Application;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "rhyApplicationStore", "Lcom/robinhood/librobinhood/data/store/RhyApplicationStore;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingDuxo;", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RhyOnboardingLoadingDuxo_Factory create(Provider<Application> app, Provider<StaticContentStore> staticContentStore, Provider<RhyApplicationStore> rhyApplicationStore, Provider<MinervaAccountStore> minervaAccountStore, Provider<ExperimentsStore> experimentsStore, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(rhyApplicationStore, "rhyApplicationStore");
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new RhyOnboardingLoadingDuxo_Factory(app, staticContentStore, rhyApplicationStore, minervaAccountStore, experimentsStore, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final RhyOnboardingLoadingDuxo newInstance(Application app, StaticContentStore staticContentStore, RhyApplicationStore rhyApplicationStore, MinervaAccountStore minervaAccountStore, ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(rhyApplicationStore, "rhyApplicationStore");
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            return new RhyOnboardingLoadingDuxo(app, staticContentStore, rhyApplicationStore, minervaAccountStore, experimentsStore);
        }
    }
}
