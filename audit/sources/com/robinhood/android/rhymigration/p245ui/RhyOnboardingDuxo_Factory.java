package com.robinhood.android.rhymigration.p245ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.mcduckling.util.RhySuvManger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.librobinhood.data.store.rhy.RhyAccountLoggingStore;
import com.robinhood.librobinhood.store.PaymentCardStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyOnboardingDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB¡\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/RhyOnboardingDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingDuxo;", "experimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "rhyAccountLoggingStore", "Lcom/robinhood/librobinhood/data/store/rhy/RhyAccountLoggingStore;", "rhySuvManger", "Lcom/robinhood/android/common/mcduckling/util/RhySuvManger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RhyOnboardingDuxo_Factory implements Factory<RhyOnboardingDuxo> {
    private final Provider<DirectDepositRelationshipStore> directDepositRelationshipStore;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<MinervaAccountStore> minervaAccountStore;
    private final Provider<PaymentCardStore> paymentCardStore;
    private final Provider<RhyAccountLoggingStore> rhyAccountLoggingStore;
    private final Provider<RhySuvManger> rhySuvManger;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<UnifiedAccountStore> unifiedAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RhyOnboardingDuxo_Factory create(Provider<ExperimentsStore> provider, Provider<MinervaAccountStore> provider2, Provider<UnifiedAccountStore> provider3, Provider<PaymentCardStore> provider4, Provider<DirectDepositRelationshipStore> provider5, Provider<RhyAccountLoggingStore> provider6, Provider<RhySuvManger> provider7, Provider<SavedStateHandle> provider8, Provider<DispatcherProvider> provider9, Provider<RxFactory> provider10, Provider<RxGlobalErrorHandler> provider11) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    @JvmStatic
    public static final RhyOnboardingDuxo newInstance(ExperimentsStore experimentsStore, MinervaAccountStore minervaAccountStore, UnifiedAccountStore unifiedAccountStore, PaymentCardStore paymentCardStore, DirectDepositRelationshipStore directDepositRelationshipStore, RhyAccountLoggingStore rhyAccountLoggingStore, RhySuvManger rhySuvManger, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(experimentsStore, minervaAccountStore, unifiedAccountStore, paymentCardStore, directDepositRelationshipStore, rhyAccountLoggingStore, rhySuvManger, savedStateHandle);
    }

    public RhyOnboardingDuxo_Factory(Provider<ExperimentsStore> experimentsStore, Provider<MinervaAccountStore> minervaAccountStore, Provider<UnifiedAccountStore> unifiedAccountStore, Provider<PaymentCardStore> paymentCardStore, Provider<DirectDepositRelationshipStore> directDepositRelationshipStore, Provider<RhyAccountLoggingStore> rhyAccountLoggingStore, Provider<RhySuvManger> rhySuvManger, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
        Intrinsics.checkNotNullParameter(rhyAccountLoggingStore, "rhyAccountLoggingStore");
        Intrinsics.checkNotNullParameter(rhySuvManger, "rhySuvManger");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.experimentsStore = experimentsStore;
        this.minervaAccountStore = minervaAccountStore;
        this.unifiedAccountStore = unifiedAccountStore;
        this.paymentCardStore = paymentCardStore;
        this.directDepositRelationshipStore = directDepositRelationshipStore;
        this.rhyAccountLoggingStore = rhyAccountLoggingStore;
        this.rhySuvManger = rhySuvManger;
        this.savedStateHandle = savedStateHandle;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public RhyOnboardingDuxo get() {
        Companion companion = INSTANCE;
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        MinervaAccountStore minervaAccountStore = this.minervaAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(minervaAccountStore, "get(...)");
        UnifiedAccountStore unifiedAccountStore = this.unifiedAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(unifiedAccountStore, "get(...)");
        PaymentCardStore paymentCardStore = this.paymentCardStore.get();
        Intrinsics.checkNotNullExpressionValue(paymentCardStore, "get(...)");
        DirectDepositRelationshipStore directDepositRelationshipStore = this.directDepositRelationshipStore.get();
        Intrinsics.checkNotNullExpressionValue(directDepositRelationshipStore, "get(...)");
        RhyAccountLoggingStore rhyAccountLoggingStore = this.rhyAccountLoggingStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyAccountLoggingStore, "get(...)");
        RhySuvManger rhySuvManger = this.rhySuvManger.get();
        Intrinsics.checkNotNullExpressionValue(rhySuvManger, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        RhyOnboardingDuxo rhyOnboardingDuxoNewInstance = companion.newInstance(experimentsStore, minervaAccountStore, unifiedAccountStore, paymentCardStore, directDepositRelationshipStore, rhyAccountLoggingStore, rhySuvManger, savedStateHandle);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(rhyOnboardingDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(rhyOnboardingDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(rhyOnboardingDuxoNewInstance, rxGlobalErrorHandler);
        return rhyOnboardingDuxoNewInstance;
    }

    /* compiled from: RhyOnboardingDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¢\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007H\u0007JH\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/RhyOnboardingDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingDuxo_Factory;", "experimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "rhyAccountLoggingStore", "Lcom/robinhood/librobinhood/data/store/rhy/RhyAccountLoggingStore;", "rhySuvManger", "Lcom/robinhood/android/common/mcduckling/util/RhySuvManger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingDuxo;", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RhyOnboardingDuxo_Factory create(Provider<ExperimentsStore> experimentsStore, Provider<MinervaAccountStore> minervaAccountStore, Provider<UnifiedAccountStore> unifiedAccountStore, Provider<PaymentCardStore> paymentCardStore, Provider<DirectDepositRelationshipStore> directDepositRelationshipStore, Provider<RhyAccountLoggingStore> rhyAccountLoggingStore, Provider<RhySuvManger> rhySuvManger, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
            Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
            Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
            Intrinsics.checkNotNullParameter(rhyAccountLoggingStore, "rhyAccountLoggingStore");
            Intrinsics.checkNotNullParameter(rhySuvManger, "rhySuvManger");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new RhyOnboardingDuxo_Factory(experimentsStore, minervaAccountStore, unifiedAccountStore, paymentCardStore, directDepositRelationshipStore, rhyAccountLoggingStore, rhySuvManger, savedStateHandle, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final RhyOnboardingDuxo newInstance(ExperimentsStore experimentsStore, MinervaAccountStore minervaAccountStore, UnifiedAccountStore unifiedAccountStore, PaymentCardStore paymentCardStore, DirectDepositRelationshipStore directDepositRelationshipStore, RhyAccountLoggingStore rhyAccountLoggingStore, RhySuvManger rhySuvManger, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
            Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
            Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
            Intrinsics.checkNotNullParameter(rhyAccountLoggingStore, "rhyAccountLoggingStore");
            Intrinsics.checkNotNullParameter(rhySuvManger, "rhySuvManger");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new RhyOnboardingDuxo(experimentsStore, minervaAccountStore, unifiedAccountStore, paymentCardStore, directDepositRelationshipStore, rhyAccountLoggingStore, rhySuvManger, savedStateHandle);
        }
    }
}
