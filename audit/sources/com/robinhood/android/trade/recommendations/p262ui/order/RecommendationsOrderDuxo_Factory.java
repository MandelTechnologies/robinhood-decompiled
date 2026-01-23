package com.robinhood.android.trade.recommendations.p262ui.order;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsCheckoutAmountStore;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsCheckoutReviewStore;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsOrderSummaryStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsOrderDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB¡\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderDuxo;", "orderManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderSubmissionManager;", "recsOrderSummaryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsOrderSummaryStore;", "recsCheckoutReviewStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsCheckoutReviewStore;", "recsCheckoutAmountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsCheckoutAmountStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RecommendationsOrderDuxo_Factory implements Factory<RecommendationsOrderDuxo> {
    private final Provider<AchRelationshipStore> achRelationshipStore;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<EventLogger> eventLogger;
    private final Provider<RecommendationsOrderSubmissionManager> orderManager;
    private final Provider<RecommendationsCheckoutAmountStore> recsCheckoutAmountStore;
    private final Provider<RecommendationsCheckoutReviewStore> recsCheckoutReviewStore;
    private final Provider<RecommendationsOrderSummaryStore> recsOrderSummaryStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<UnifiedAccountStore> unifiedAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RecommendationsOrderDuxo_Factory create(Provider<RecommendationsOrderSubmissionManager> provider, Provider<RecommendationsOrderSummaryStore> provider2, Provider<RecommendationsCheckoutReviewStore> provider3, Provider<RecommendationsCheckoutAmountStore> provider4, Provider<UnifiedAccountStore> provider5, Provider<AchRelationshipStore> provider6, Provider<EventLogger> provider7, Provider<SavedStateHandle> provider8, Provider<DispatcherProvider> provider9, Provider<RxFactory> provider10, Provider<RxGlobalErrorHandler> provider11) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    @JvmStatic
    public static final RecommendationsOrderDuxo newInstance(RecommendationsOrderSubmissionManager recommendationsOrderSubmissionManager, RecommendationsOrderSummaryStore recommendationsOrderSummaryStore, RecommendationsCheckoutReviewStore recommendationsCheckoutReviewStore, RecommendationsCheckoutAmountStore recommendationsCheckoutAmountStore, UnifiedAccountStore unifiedAccountStore, AchRelationshipStore achRelationshipStore, EventLogger eventLogger, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(recommendationsOrderSubmissionManager, recommendationsOrderSummaryStore, recommendationsCheckoutReviewStore, recommendationsCheckoutAmountStore, unifiedAccountStore, achRelationshipStore, eventLogger, savedStateHandle);
    }

    public RecommendationsOrderDuxo_Factory(Provider<RecommendationsOrderSubmissionManager> orderManager, Provider<RecommendationsOrderSummaryStore> recsOrderSummaryStore, Provider<RecommendationsCheckoutReviewStore> recsCheckoutReviewStore, Provider<RecommendationsCheckoutAmountStore> recsCheckoutAmountStore, Provider<UnifiedAccountStore> unifiedAccountStore, Provider<AchRelationshipStore> achRelationshipStore, Provider<EventLogger> eventLogger, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(orderManager, "orderManager");
        Intrinsics.checkNotNullParameter(recsOrderSummaryStore, "recsOrderSummaryStore");
        Intrinsics.checkNotNullParameter(recsCheckoutReviewStore, "recsCheckoutReviewStore");
        Intrinsics.checkNotNullParameter(recsCheckoutAmountStore, "recsCheckoutAmountStore");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.orderManager = orderManager;
        this.recsOrderSummaryStore = recsOrderSummaryStore;
        this.recsCheckoutReviewStore = recsCheckoutReviewStore;
        this.recsCheckoutAmountStore = recsCheckoutAmountStore;
        this.unifiedAccountStore = unifiedAccountStore;
        this.achRelationshipStore = achRelationshipStore;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public RecommendationsOrderDuxo get() {
        Companion companion = INSTANCE;
        RecommendationsOrderSubmissionManager recommendationsOrderSubmissionManager = this.orderManager.get();
        Intrinsics.checkNotNullExpressionValue(recommendationsOrderSubmissionManager, "get(...)");
        RecommendationsOrderSummaryStore recommendationsOrderSummaryStore = this.recsOrderSummaryStore.get();
        Intrinsics.checkNotNullExpressionValue(recommendationsOrderSummaryStore, "get(...)");
        RecommendationsCheckoutReviewStore recommendationsCheckoutReviewStore = this.recsCheckoutReviewStore.get();
        Intrinsics.checkNotNullExpressionValue(recommendationsCheckoutReviewStore, "get(...)");
        RecommendationsCheckoutAmountStore recommendationsCheckoutAmountStore = this.recsCheckoutAmountStore.get();
        Intrinsics.checkNotNullExpressionValue(recommendationsCheckoutAmountStore, "get(...)");
        UnifiedAccountStore unifiedAccountStore = this.unifiedAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(unifiedAccountStore, "get(...)");
        AchRelationshipStore achRelationshipStore = this.achRelationshipStore.get();
        Intrinsics.checkNotNullExpressionValue(achRelationshipStore, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        RecommendationsOrderDuxo recommendationsOrderDuxoNewInstance = companion.newInstance(recommendationsOrderSubmissionManager, recommendationsOrderSummaryStore, recommendationsCheckoutReviewStore, recommendationsCheckoutAmountStore, unifiedAccountStore, achRelationshipStore, eventLogger, savedStateHandle);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(recommendationsOrderDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(recommendationsOrderDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(recommendationsOrderDuxoNewInstance, rxGlobalErrorHandler);
        return recommendationsOrderDuxoNewInstance;
    }

    /* compiled from: RecommendationsOrderDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¢\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007H\u0007JH\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderDuxo_Factory;", "orderManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderSubmissionManager;", "recsOrderSummaryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsOrderSummaryStore;", "recsCheckoutReviewStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsCheckoutReviewStore;", "recsCheckoutAmountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsCheckoutAmountStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderDuxo;", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RecommendationsOrderDuxo_Factory create(Provider<RecommendationsOrderSubmissionManager> orderManager, Provider<RecommendationsOrderSummaryStore> recsOrderSummaryStore, Provider<RecommendationsCheckoutReviewStore> recsCheckoutReviewStore, Provider<RecommendationsCheckoutAmountStore> recsCheckoutAmountStore, Provider<UnifiedAccountStore> unifiedAccountStore, Provider<AchRelationshipStore> achRelationshipStore, Provider<EventLogger> eventLogger, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(orderManager, "orderManager");
            Intrinsics.checkNotNullParameter(recsOrderSummaryStore, "recsOrderSummaryStore");
            Intrinsics.checkNotNullParameter(recsCheckoutReviewStore, "recsCheckoutReviewStore");
            Intrinsics.checkNotNullParameter(recsCheckoutAmountStore, "recsCheckoutAmountStore");
            Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new RecommendationsOrderDuxo_Factory(orderManager, recsOrderSummaryStore, recsCheckoutReviewStore, recsCheckoutAmountStore, unifiedAccountStore, achRelationshipStore, eventLogger, savedStateHandle, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final RecommendationsOrderDuxo newInstance(RecommendationsOrderSubmissionManager orderManager, RecommendationsOrderSummaryStore recsOrderSummaryStore, RecommendationsCheckoutReviewStore recsCheckoutReviewStore, RecommendationsCheckoutAmountStore recsCheckoutAmountStore, UnifiedAccountStore unifiedAccountStore, AchRelationshipStore achRelationshipStore, EventLogger eventLogger, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(orderManager, "orderManager");
            Intrinsics.checkNotNullParameter(recsOrderSummaryStore, "recsOrderSummaryStore");
            Intrinsics.checkNotNullParameter(recsCheckoutReviewStore, "recsCheckoutReviewStore");
            Intrinsics.checkNotNullParameter(recsCheckoutAmountStore, "recsCheckoutAmountStore");
            Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new RecommendationsOrderDuxo(orderManager, recsOrderSummaryStore, recsCheckoutReviewStore, recsCheckoutAmountStore, unifiedAccountStore, achRelationshipStore, eventLogger, savedStateHandle);
        }
    }
}
