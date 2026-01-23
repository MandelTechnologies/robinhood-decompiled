package com.robinhood.android.recommendations.p224ui.risk;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsQuestionnaireStore;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsRiskProfileStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsRiskProfileLandingDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileLandingDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileLandingDuxo;", "recsRiskProfileStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsRiskProfileStore;", "recsQuestionnaireStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsQuestionnaireStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RecommendationsRiskProfileLandingDuxo_Factory implements Factory<RecommendationsRiskProfileLandingDuxo> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RecommendationsQuestionnaireStore> recsQuestionnaireStore;
    private final Provider<RecommendationsRiskProfileStore> recsRiskProfileStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;

    @JvmStatic
    public static final RecommendationsRiskProfileLandingDuxo_Factory create(Provider<RecommendationsRiskProfileStore> provider, Provider<RecommendationsQuestionnaireStore> provider2, Provider<SavedStateHandle> provider3, Provider<DispatcherProvider> provider4, Provider<RxFactory> provider5, Provider<RxGlobalErrorHandler> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final RecommendationsRiskProfileLandingDuxo newInstance(RecommendationsRiskProfileStore recommendationsRiskProfileStore, RecommendationsQuestionnaireStore recommendationsQuestionnaireStore, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(recommendationsRiskProfileStore, recommendationsQuestionnaireStore, savedStateHandle);
    }

    public RecommendationsRiskProfileLandingDuxo_Factory(Provider<RecommendationsRiskProfileStore> recsRiskProfileStore, Provider<RecommendationsQuestionnaireStore> recsQuestionnaireStore, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(recsRiskProfileStore, "recsRiskProfileStore");
        Intrinsics.checkNotNullParameter(recsQuestionnaireStore, "recsQuestionnaireStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.recsRiskProfileStore = recsRiskProfileStore;
        this.recsQuestionnaireStore = recsQuestionnaireStore;
        this.savedStateHandle = savedStateHandle;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public RecommendationsRiskProfileLandingDuxo get() {
        Companion companion = INSTANCE;
        RecommendationsRiskProfileStore recommendationsRiskProfileStore = this.recsRiskProfileStore.get();
        Intrinsics.checkNotNullExpressionValue(recommendationsRiskProfileStore, "get(...)");
        RecommendationsQuestionnaireStore recommendationsQuestionnaireStore = this.recsQuestionnaireStore.get();
        Intrinsics.checkNotNullExpressionValue(recommendationsQuestionnaireStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        RecommendationsRiskProfileLandingDuxo recommendationsRiskProfileLandingDuxoNewInstance = companion.newInstance(recommendationsRiskProfileStore, recommendationsQuestionnaireStore, savedStateHandle);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(recommendationsRiskProfileLandingDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(recommendationsRiskProfileLandingDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(recommendationsRiskProfileLandingDuxoNewInstance, rxGlobalErrorHandler);
        return recommendationsRiskProfileLandingDuxoNewInstance;
    }

    /* compiled from: RecommendationsRiskProfileLandingDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileLandingDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileLandingDuxo_Factory;", "recsRiskProfileStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsRiskProfileStore;", "recsQuestionnaireStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsQuestionnaireStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileLandingDuxo;", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RecommendationsRiskProfileLandingDuxo_Factory create(Provider<RecommendationsRiskProfileStore> recsRiskProfileStore, Provider<RecommendationsQuestionnaireStore> recsQuestionnaireStore, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(recsRiskProfileStore, "recsRiskProfileStore");
            Intrinsics.checkNotNullParameter(recsQuestionnaireStore, "recsQuestionnaireStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new RecommendationsRiskProfileLandingDuxo_Factory(recsRiskProfileStore, recsQuestionnaireStore, savedStateHandle, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final RecommendationsRiskProfileLandingDuxo newInstance(RecommendationsRiskProfileStore recsRiskProfileStore, RecommendationsQuestionnaireStore recsQuestionnaireStore, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(recsRiskProfileStore, "recsRiskProfileStore");
            Intrinsics.checkNotNullParameter(recsQuestionnaireStore, "recsQuestionnaireStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new RecommendationsRiskProfileLandingDuxo(recsRiskProfileStore, recsQuestionnaireStore, savedStateHandle);
        }
    }
}
