package com.robinhood.android.history.p153ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore;
import com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyAchTransferDetailDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/history/ui/RhyAchTransferDetailDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/history/ui/RhyAchTransferDetailDuxo;", "achRelationshipStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "rhyTransferIraInfoStore", "Lcom/robinhood/librobinhood/data/store/rhy/RhyTransferIraInfoStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RhyAchTransferDetailDuxo_Factory implements Factory<RhyAchTransferDetailDuxo> {
    private final Provider<AchRelationshipStore> achRelationshipStore;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<PaymentTransferStore> paymentTransferStore;
    private final Provider<RhyTransferIraInfoStore> rhyTransferIraInfoStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RhyAchTransferDetailDuxo_Factory create(Provider<AchRelationshipStore> provider, Provider<PaymentTransferStore> provider2, Provider<RhyTransferIraInfoStore> provider3, Provider<SavedStateHandle> provider4, Provider<DispatcherProvider> provider5, Provider<RxFactory> provider6, Provider<RxGlobalErrorHandler> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final RhyAchTransferDetailDuxo newInstance(AchRelationshipStore achRelationshipStore, PaymentTransferStore paymentTransferStore, RhyTransferIraInfoStore rhyTransferIraInfoStore, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(achRelationshipStore, paymentTransferStore, rhyTransferIraInfoStore, savedStateHandle);
    }

    public RhyAchTransferDetailDuxo_Factory(Provider<AchRelationshipStore> achRelationshipStore, Provider<PaymentTransferStore> paymentTransferStore, Provider<RhyTransferIraInfoStore> rhyTransferIraInfoStore, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
        Intrinsics.checkNotNullParameter(rhyTransferIraInfoStore, "rhyTransferIraInfoStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.achRelationshipStore = achRelationshipStore;
        this.paymentTransferStore = paymentTransferStore;
        this.rhyTransferIraInfoStore = rhyTransferIraInfoStore;
        this.savedStateHandle = savedStateHandle;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public RhyAchTransferDetailDuxo get() {
        Companion companion = INSTANCE;
        AchRelationshipStore achRelationshipStore = this.achRelationshipStore.get();
        Intrinsics.checkNotNullExpressionValue(achRelationshipStore, "get(...)");
        PaymentTransferStore paymentTransferStore = this.paymentTransferStore.get();
        Intrinsics.checkNotNullExpressionValue(paymentTransferStore, "get(...)");
        RhyTransferIraInfoStore rhyTransferIraInfoStore = this.rhyTransferIraInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyTransferIraInfoStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        RhyAchTransferDetailDuxo rhyAchTransferDetailDuxoNewInstance = companion.newInstance(achRelationshipStore, paymentTransferStore, rhyTransferIraInfoStore, savedStateHandle);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(rhyAchTransferDetailDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(rhyAchTransferDetailDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(rhyAchTransferDetailDuxoNewInstance, rxGlobalErrorHandler);
        return rhyAchTransferDetailDuxoNewInstance;
    }

    /* compiled from: RhyAchTransferDetailDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J(\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/history/ui/RhyAchTransferDetailDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/history/ui/RhyAchTransferDetailDuxo_Factory;", "achRelationshipStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "rhyTransferIraInfoStore", "Lcom/robinhood/librobinhood/data/store/rhy/RhyTransferIraInfoStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/history/ui/RhyAchTransferDetailDuxo;", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RhyAchTransferDetailDuxo_Factory create(Provider<AchRelationshipStore> achRelationshipStore, Provider<PaymentTransferStore> paymentTransferStore, Provider<RhyTransferIraInfoStore> rhyTransferIraInfoStore, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
            Intrinsics.checkNotNullParameter(rhyTransferIraInfoStore, "rhyTransferIraInfoStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new RhyAchTransferDetailDuxo_Factory(achRelationshipStore, paymentTransferStore, rhyTransferIraInfoStore, savedStateHandle, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final RhyAchTransferDetailDuxo newInstance(AchRelationshipStore achRelationshipStore, PaymentTransferStore paymentTransferStore, RhyTransferIraInfoStore rhyTransferIraInfoStore, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
            Intrinsics.checkNotNullParameter(rhyTransferIraInfoStore, "rhyTransferIraInfoStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new RhyAchTransferDetailDuxo(achRelationshipStore, paymentTransferStore, rhyTransferIraInfoStore, savedStateHandle);
        }
    }
}
