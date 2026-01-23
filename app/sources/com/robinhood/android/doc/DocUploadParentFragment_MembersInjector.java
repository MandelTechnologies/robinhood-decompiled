package com.robinhood.android.doc;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.librobinhood.data.store.identi.DocumentRequestStore;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.onboarding.handler.OnboardingClickHandler;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocUploadParentFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/doc/DocUploadParentFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/doc/DocUploadParentFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "clickHandler", "Lcom/robinhood/shared/onboarding/handler/OnboardingClickHandler;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "documentRequestStore", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DocUploadParentFragment_MembersInjector implements MembersInjector<DocUploadParentFragment> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<AppType> appType;
    private final Provider<CardManager> cardManager;
    private final Provider<OnboardingClickHandler> clickHandler;
    private final Provider<DocumentRequestStore> documentRequestStore;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<BaseSortingHatStore> sortingHatStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<DocUploadParentFragment> create(Provider<BaseFragmentSingletons> provider, Provider<AnalyticsLogger> provider2, Provider<CardManager> provider3, Provider<OnboardingClickHandler> provider4, Provider<BaseSortingHatStore> provider5, Provider<AppType> provider6, Provider<DocumentRequestStore> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final void injectAnalytics(DocUploadParentFragment docUploadParentFragment, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(docUploadParentFragment, analyticsLogger);
    }

    @JvmStatic
    public static final void injectAppType(DocUploadParentFragment docUploadParentFragment, AppType appType) {
        INSTANCE.injectAppType(docUploadParentFragment, appType);
    }

    @JvmStatic
    public static final void injectCardManager(DocUploadParentFragment docUploadParentFragment, CardManager cardManager) {
        INSTANCE.injectCardManager(docUploadParentFragment, cardManager);
    }

    @JvmStatic
    public static final void injectClickHandler(DocUploadParentFragment docUploadParentFragment, OnboardingClickHandler onboardingClickHandler) {
        INSTANCE.injectClickHandler(docUploadParentFragment, onboardingClickHandler);
    }

    @JvmStatic
    public static final void injectDocumentRequestStore(DocUploadParentFragment docUploadParentFragment, DocumentRequestStore documentRequestStore) {
        INSTANCE.injectDocumentRequestStore(docUploadParentFragment, documentRequestStore);
    }

    @JvmStatic
    public static final void injectSortingHatStore(DocUploadParentFragment docUploadParentFragment, BaseSortingHatStore baseSortingHatStore) {
        INSTANCE.injectSortingHatStore(docUploadParentFragment, baseSortingHatStore);
    }

    public DocUploadParentFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<CardManager> cardManager, Provider<OnboardingClickHandler> clickHandler, Provider<BaseSortingHatStore> sortingHatStore, Provider<AppType> appType, Provider<DocumentRequestStore> documentRequestStore) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(cardManager, "cardManager");
        Intrinsics.checkNotNullParameter(clickHandler, "clickHandler");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(documentRequestStore, "documentRequestStore");
        this.singletons = singletons;
        this.analytics = analytics;
        this.cardManager = cardManager;
        this.clickHandler = clickHandler;
        this.sortingHatStore = sortingHatStore;
        this.appType = appType;
        this.documentRequestStore = documentRequestStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DocUploadParentFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion2.injectAnalytics(instance, analyticsLogger);
        CardManager cardManager = this.cardManager.get();
        Intrinsics.checkNotNullExpressionValue(cardManager, "get(...)");
        companion2.injectCardManager(instance, cardManager);
        OnboardingClickHandler onboardingClickHandler = this.clickHandler.get();
        Intrinsics.checkNotNullExpressionValue(onboardingClickHandler, "get(...)");
        companion2.injectClickHandler(instance, onboardingClickHandler);
        BaseSortingHatStore baseSortingHatStore = this.sortingHatStore.get();
        Intrinsics.checkNotNullExpressionValue(baseSortingHatStore, "get(...)");
        companion2.injectSortingHatStore(instance, baseSortingHatStore);
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        companion2.injectAppType(instance, appType);
        DocumentRequestStore documentRequestStore = this.documentRequestStore.get();
        Intrinsics.checkNotNullExpressionValue(documentRequestStore, "get(...)");
        companion2.injectDocumentRequestStore(instance, documentRequestStore);
    }

    /* compiled from: DocUploadParentFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jp\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\bH\u0007J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/doc/DocUploadParentFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/doc/DocUploadParentFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "clickHandler", "Lcom/robinhood/shared/onboarding/handler/OnboardingClickHandler;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "documentRequestStore", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "injectAnalytics", "", "instance", "injectCardManager", "injectClickHandler", "injectSortingHatStore", "injectAppType", "injectDocumentRequestStore", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<DocUploadParentFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<CardManager> cardManager, Provider<OnboardingClickHandler> clickHandler, Provider<BaseSortingHatStore> sortingHatStore, Provider<AppType> appType, Provider<DocumentRequestStore> documentRequestStore) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(cardManager, "cardManager");
            Intrinsics.checkNotNullParameter(clickHandler, "clickHandler");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(documentRequestStore, "documentRequestStore");
            return new DocUploadParentFragment_MembersInjector(singletons, analytics, cardManager, clickHandler, sortingHatStore, appType, documentRequestStore);
        }

        @JvmStatic
        public final void injectAnalytics(DocUploadParentFragment instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }

        @JvmStatic
        public final void injectCardManager(DocUploadParentFragment instance, CardManager cardManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(cardManager, "cardManager");
            instance.setCardManager(cardManager);
        }

        @JvmStatic
        public final void injectClickHandler(DocUploadParentFragment instance, OnboardingClickHandler clickHandler) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(clickHandler, "clickHandler");
            instance.setClickHandler(clickHandler);
        }

        @JvmStatic
        public final void injectSortingHatStore(DocUploadParentFragment instance, BaseSortingHatStore sortingHatStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            instance.setSortingHatStore(sortingHatStore);
        }

        @JvmStatic
        public final void injectAppType(DocUploadParentFragment instance, AppType appType) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(appType, "appType");
            instance.setAppType(appType);
        }

        @JvmStatic
        public final void injectDocumentRequestStore(DocUploadParentFragment instance, DocumentRequestStore documentRequestStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(documentRequestStore, "documentRequestStore");
            instance.setDocumentRequestStore(documentRequestStore);
        }
    }
}
