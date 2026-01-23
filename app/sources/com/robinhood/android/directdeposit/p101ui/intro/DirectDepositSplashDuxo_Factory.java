package com.robinhood.android.directdeposit.p101ui.intro;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.EarlyPayEnrollmentStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.cashier.DirectDepositSwitchStatusStore;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectDepositSplashDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0093\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashDuxo;", "directDepositSwitchStatusStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/cashier/DirectDepositSwitchStatusStore;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "earlyPayEnrollmentStore", "Lcom/robinhood/librobinhood/data/store/EarlyPayEnrollmentStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "sweepsInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DirectDepositSplashDuxo_Factory implements Factory<DirectDepositSplashDuxo> {
    private final Provider<DirectDepositRelationshipStore> directDepositRelationshipStore;
    private final Provider<DirectDepositSwitchStatusStore> directDepositSwitchStatusStore;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<EarlyPayEnrollmentStore> earlyPayEnrollmentStore;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<RhyAccountStore> rhyAccountStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SweepsInterestStore> sweepsInterestStore;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final DirectDepositSplashDuxo_Factory create(Provider<DirectDepositSwitchStatusStore> provider, Provider<DirectDepositRelationshipStore> provider2, Provider<EarlyPayEnrollmentStore> provider3, Provider<ExperimentsStore> provider4, Provider<SweepsInterestStore> provider5, Provider<RhyAccountStore> provider6, Provider<UserStore> provider7, Provider<DispatcherProvider> provider8, Provider<RxFactory> provider9, Provider<RxGlobalErrorHandler> provider10) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    @JvmStatic
    public static final DirectDepositSplashDuxo newInstance(DirectDepositSwitchStatusStore directDepositSwitchStatusStore, DirectDepositRelationshipStore directDepositRelationshipStore, EarlyPayEnrollmentStore earlyPayEnrollmentStore, ExperimentsStore experimentsStore, SweepsInterestStore sweepsInterestStore, RhyAccountStore rhyAccountStore, UserStore userStore) {
        return INSTANCE.newInstance(directDepositSwitchStatusStore, directDepositRelationshipStore, earlyPayEnrollmentStore, experimentsStore, sweepsInterestStore, rhyAccountStore, userStore);
    }

    public DirectDepositSplashDuxo_Factory(Provider<DirectDepositSwitchStatusStore> directDepositSwitchStatusStore, Provider<DirectDepositRelationshipStore> directDepositRelationshipStore, Provider<EarlyPayEnrollmentStore> earlyPayEnrollmentStore, Provider<ExperimentsStore> experimentsStore, Provider<SweepsInterestStore> sweepsInterestStore, Provider<RhyAccountStore> rhyAccountStore, Provider<UserStore> userStore, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(directDepositSwitchStatusStore, "directDepositSwitchStatusStore");
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
        Intrinsics.checkNotNullParameter(earlyPayEnrollmentStore, "earlyPayEnrollmentStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.directDepositSwitchStatusStore = directDepositSwitchStatusStore;
        this.directDepositRelationshipStore = directDepositRelationshipStore;
        this.earlyPayEnrollmentStore = earlyPayEnrollmentStore;
        this.experimentsStore = experimentsStore;
        this.sweepsInterestStore = sweepsInterestStore;
        this.rhyAccountStore = rhyAccountStore;
        this.userStore = userStore;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public DirectDepositSplashDuxo get() {
        Companion companion = INSTANCE;
        DirectDepositSwitchStatusStore directDepositSwitchStatusStore = this.directDepositSwitchStatusStore.get();
        Intrinsics.checkNotNullExpressionValue(directDepositSwitchStatusStore, "get(...)");
        DirectDepositRelationshipStore directDepositRelationshipStore = this.directDepositRelationshipStore.get();
        Intrinsics.checkNotNullExpressionValue(directDepositRelationshipStore, "get(...)");
        EarlyPayEnrollmentStore earlyPayEnrollmentStore = this.earlyPayEnrollmentStore.get();
        Intrinsics.checkNotNullExpressionValue(earlyPayEnrollmentStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        SweepsInterestStore sweepsInterestStore = this.sweepsInterestStore.get();
        Intrinsics.checkNotNullExpressionValue(sweepsInterestStore, "get(...)");
        RhyAccountStore rhyAccountStore = this.rhyAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyAccountStore, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        DirectDepositSplashDuxo directDepositSplashDuxoNewInstance = companion.newInstance(directDepositSwitchStatusStore, directDepositRelationshipStore, earlyPayEnrollmentStore, experimentsStore, sweepsInterestStore, rhyAccountStore, userStore);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(directDepositSplashDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(directDepositSplashDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(directDepositSplashDuxoNewInstance, rxGlobalErrorHandler);
        return directDepositSplashDuxoNewInstance;
    }

    /* compiled from: DirectDepositSplashDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0094\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007H\u0007J@\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashDuxo_Factory;", "directDepositSwitchStatusStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/cashier/DirectDepositSwitchStatusStore;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "earlyPayEnrollmentStore", "Lcom/robinhood/librobinhood/data/store/EarlyPayEnrollmentStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "sweepsInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashDuxo;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DirectDepositSplashDuxo_Factory create(Provider<DirectDepositSwitchStatusStore> directDepositSwitchStatusStore, Provider<DirectDepositRelationshipStore> directDepositRelationshipStore, Provider<EarlyPayEnrollmentStore> earlyPayEnrollmentStore, Provider<ExperimentsStore> experimentsStore, Provider<SweepsInterestStore> sweepsInterestStore, Provider<RhyAccountStore> rhyAccountStore, Provider<UserStore> userStore, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(directDepositSwitchStatusStore, "directDepositSwitchStatusStore");
            Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
            Intrinsics.checkNotNullParameter(earlyPayEnrollmentStore, "earlyPayEnrollmentStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new DirectDepositSplashDuxo_Factory(directDepositSwitchStatusStore, directDepositRelationshipStore, earlyPayEnrollmentStore, experimentsStore, sweepsInterestStore, rhyAccountStore, userStore, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final DirectDepositSplashDuxo newInstance(DirectDepositSwitchStatusStore directDepositSwitchStatusStore, DirectDepositRelationshipStore directDepositRelationshipStore, EarlyPayEnrollmentStore earlyPayEnrollmentStore, ExperimentsStore experimentsStore, SweepsInterestStore sweepsInterestStore, RhyAccountStore rhyAccountStore, UserStore userStore) {
            Intrinsics.checkNotNullParameter(directDepositSwitchStatusStore, "directDepositSwitchStatusStore");
            Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
            Intrinsics.checkNotNullParameter(earlyPayEnrollmentStore, "earlyPayEnrollmentStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            return new DirectDepositSplashDuxo(directDepositSwitchStatusStore, directDepositRelationshipStore, earlyPayEnrollmentStore, experimentsStore, sweepsInterestStore, rhyAccountStore, userStore);
        }
    }
}
