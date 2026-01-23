package com.robinhood.android.cash.cushion.details;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.bonfire.CashCushionDetailsStore;
import com.robinhood.librobinhood.data.store.bonfire.CashCushionStatusStore;
import com.robinhood.librobinhood.data.store.rhy.RhyAccountLoggingStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CashCushionDetailsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/cash/cushion/details/CashCushionDetailsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/cash/cushion/details/CashCushionDetailsDuxo;", "cashCushionDetailsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/CashCushionDetailsStore;", "cashCushionStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/CashCushionStatusStore;", "rhyAccountLoggingStore", "Lcom/robinhood/librobinhood/data/store/rhy/RhyAccountLoggingStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-lib-cash-cushion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CashCushionDetailsDuxo_Factory implements Factory<CashCushionDetailsDuxo> {
    private final Provider<CashCushionDetailsStore> cashCushionDetailsStore;
    private final Provider<CashCushionStatusStore> cashCushionStatusStore;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RhyAccountLoggingStore> rhyAccountLoggingStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CashCushionDetailsDuxo_Factory create(Provider<CashCushionDetailsStore> provider, Provider<CashCushionStatusStore> provider2, Provider<RhyAccountLoggingStore> provider3, Provider<SavedStateHandle> provider4, Provider<DispatcherProvider> provider5, Provider<RxFactory> provider6, Provider<RxGlobalErrorHandler> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final CashCushionDetailsDuxo newInstance(CashCushionDetailsStore cashCushionDetailsStore, CashCushionStatusStore cashCushionStatusStore, RhyAccountLoggingStore rhyAccountLoggingStore, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(cashCushionDetailsStore, cashCushionStatusStore, rhyAccountLoggingStore, savedStateHandle);
    }

    public CashCushionDetailsDuxo_Factory(Provider<CashCushionDetailsStore> cashCushionDetailsStore, Provider<CashCushionStatusStore> cashCushionStatusStore, Provider<RhyAccountLoggingStore> rhyAccountLoggingStore, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(cashCushionDetailsStore, "cashCushionDetailsStore");
        Intrinsics.checkNotNullParameter(cashCushionStatusStore, "cashCushionStatusStore");
        Intrinsics.checkNotNullParameter(rhyAccountLoggingStore, "rhyAccountLoggingStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.cashCushionDetailsStore = cashCushionDetailsStore;
        this.cashCushionStatusStore = cashCushionStatusStore;
        this.rhyAccountLoggingStore = rhyAccountLoggingStore;
        this.savedStateHandle = savedStateHandle;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public CashCushionDetailsDuxo get() {
        Companion companion = INSTANCE;
        CashCushionDetailsStore cashCushionDetailsStore = this.cashCushionDetailsStore.get();
        Intrinsics.checkNotNullExpressionValue(cashCushionDetailsStore, "get(...)");
        CashCushionStatusStore cashCushionStatusStore = this.cashCushionStatusStore.get();
        Intrinsics.checkNotNullExpressionValue(cashCushionStatusStore, "get(...)");
        RhyAccountLoggingStore rhyAccountLoggingStore = this.rhyAccountLoggingStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyAccountLoggingStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        CashCushionDetailsDuxo cashCushionDetailsDuxoNewInstance = companion.newInstance(cashCushionDetailsStore, cashCushionStatusStore, rhyAccountLoggingStore, savedStateHandle);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(cashCushionDetailsDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(cashCushionDetailsDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(cashCushionDetailsDuxoNewInstance, rxGlobalErrorHandler);
        return cashCushionDetailsDuxoNewInstance;
    }

    /* compiled from: CashCushionDetailsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J(\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/cash/cushion/details/CashCushionDetailsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/cash/cushion/details/CashCushionDetailsDuxo_Factory;", "cashCushionDetailsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/CashCushionDetailsStore;", "cashCushionStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/CashCushionStatusStore;", "rhyAccountLoggingStore", "Lcom/robinhood/librobinhood/data/store/rhy/RhyAccountLoggingStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/cash/cushion/details/CashCushionDetailsDuxo;", "feature-lib-cash-cushion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CashCushionDetailsDuxo_Factory create(Provider<CashCushionDetailsStore> cashCushionDetailsStore, Provider<CashCushionStatusStore> cashCushionStatusStore, Provider<RhyAccountLoggingStore> rhyAccountLoggingStore, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(cashCushionDetailsStore, "cashCushionDetailsStore");
            Intrinsics.checkNotNullParameter(cashCushionStatusStore, "cashCushionStatusStore");
            Intrinsics.checkNotNullParameter(rhyAccountLoggingStore, "rhyAccountLoggingStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new CashCushionDetailsDuxo_Factory(cashCushionDetailsStore, cashCushionStatusStore, rhyAccountLoggingStore, savedStateHandle, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final CashCushionDetailsDuxo newInstance(CashCushionDetailsStore cashCushionDetailsStore, CashCushionStatusStore cashCushionStatusStore, RhyAccountLoggingStore rhyAccountLoggingStore, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(cashCushionDetailsStore, "cashCushionDetailsStore");
            Intrinsics.checkNotNullParameter(cashCushionStatusStore, "cashCushionStatusStore");
            Intrinsics.checkNotNullParameter(rhyAccountLoggingStore, "rhyAccountLoggingStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CashCushionDetailsDuxo(cashCushionDetailsStore, cashCushionStatusStore, rhyAccountLoggingStore, savedStateHandle);
        }
    }
}
