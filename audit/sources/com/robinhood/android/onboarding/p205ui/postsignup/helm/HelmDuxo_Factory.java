package com.robinhood.android.onboarding.p205ui.postsignup.helm;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.helm.Helm;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.FundAccountScreenStore;
import com.robinhood.librobinhood.data.store.UserApplicationStore;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.librobinhood.data.store.identi.DocumentRequestStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HelmDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0085\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmDuxo;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "documentRequestStore", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "fundAccountScreenStore", "Lcom/robinhood/librobinhood/data/store/FundAccountScreenStore;", "helm", "Lcom/robinhood/android/helm/Helm;", "userApplicationStore", "Lcom/robinhood/librobinhood/data/store/UserApplicationStore;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class HelmDuxo_Factory implements Factory<HelmDuxo> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<CardManager> cardManager;
    private final Provider<DocumentRequestStore> documentRequestStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<FundAccountScreenStore> fundAccountScreenStore;
    private final Provider<Helm> helm;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<BaseSortingHatStore> sortingHatStore;
    private final Provider<UserApplicationStore> userApplicationStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final HelmDuxo_Factory create(Provider<AnalyticsLogger> provider, Provider<CardManager> provider2, Provider<DocumentRequestStore> provider3, Provider<FundAccountScreenStore> provider4, Provider<Helm> provider5, Provider<UserApplicationStore> provider6, Provider<BaseSortingHatStore> provider7, Provider<DuxoBundle> provider8, Provider<SavedStateHandle> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final HelmDuxo newInstance(AnalyticsLogger analyticsLogger, CardManager cardManager, DocumentRequestStore documentRequestStore, FundAccountScreenStore fundAccountScreenStore, Helm helm, UserApplicationStore userApplicationStore, BaseSortingHatStore baseSortingHatStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(analyticsLogger, cardManager, documentRequestStore, fundAccountScreenStore, helm, userApplicationStore, baseSortingHatStore, duxoBundle, savedStateHandle);
    }

    public HelmDuxo_Factory(Provider<AnalyticsLogger> analytics, Provider<CardManager> cardManager, Provider<DocumentRequestStore> documentRequestStore, Provider<FundAccountScreenStore> fundAccountScreenStore, Provider<Helm> helm, Provider<UserApplicationStore> userApplicationStore, Provider<BaseSortingHatStore> sortingHatStore, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(cardManager, "cardManager");
        Intrinsics.checkNotNullParameter(documentRequestStore, "documentRequestStore");
        Intrinsics.checkNotNullParameter(fundAccountScreenStore, "fundAccountScreenStore");
        Intrinsics.checkNotNullParameter(helm, "helm");
        Intrinsics.checkNotNullParameter(userApplicationStore, "userApplicationStore");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.analytics = analytics;
        this.cardManager = cardManager;
        this.documentRequestStore = documentRequestStore;
        this.fundAccountScreenStore = fundAccountScreenStore;
        this.helm = helm;
        this.userApplicationStore = userApplicationStore;
        this.sortingHatStore = sortingHatStore;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public HelmDuxo get() {
        Companion companion = INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        CardManager cardManager = this.cardManager.get();
        Intrinsics.checkNotNullExpressionValue(cardManager, "get(...)");
        DocumentRequestStore documentRequestStore = this.documentRequestStore.get();
        Intrinsics.checkNotNullExpressionValue(documentRequestStore, "get(...)");
        FundAccountScreenStore fundAccountScreenStore = this.fundAccountScreenStore.get();
        Intrinsics.checkNotNullExpressionValue(fundAccountScreenStore, "get(...)");
        Helm helm = this.helm.get();
        Intrinsics.checkNotNullExpressionValue(helm, "get(...)");
        UserApplicationStore userApplicationStore = this.userApplicationStore.get();
        Intrinsics.checkNotNullExpressionValue(userApplicationStore, "get(...)");
        BaseSortingHatStore baseSortingHatStore = this.sortingHatStore.get();
        Intrinsics.checkNotNullExpressionValue(baseSortingHatStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(analyticsLogger, cardManager, documentRequestStore, fundAccountScreenStore, helm, userApplicationStore, baseSortingHatStore, duxoBundle, savedStateHandle);
    }

    /* compiled from: HelmDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0086\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H\u0007JP\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmDuxo_Factory;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "documentRequestStore", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "fundAccountScreenStore", "Lcom/robinhood/librobinhood/data/store/FundAccountScreenStore;", "helm", "Lcom/robinhood/android/helm/Helm;", "userApplicationStore", "Lcom/robinhood/librobinhood/data/store/UserApplicationStore;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmDuxo;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final HelmDuxo_Factory create(Provider<AnalyticsLogger> analytics, Provider<CardManager> cardManager, Provider<DocumentRequestStore> documentRequestStore, Provider<FundAccountScreenStore> fundAccountScreenStore, Provider<Helm> helm, Provider<UserApplicationStore> userApplicationStore, Provider<BaseSortingHatStore> sortingHatStore, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(cardManager, "cardManager");
            Intrinsics.checkNotNullParameter(documentRequestStore, "documentRequestStore");
            Intrinsics.checkNotNullParameter(fundAccountScreenStore, "fundAccountScreenStore");
            Intrinsics.checkNotNullParameter(helm, "helm");
            Intrinsics.checkNotNullParameter(userApplicationStore, "userApplicationStore");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new HelmDuxo_Factory(analytics, cardManager, documentRequestStore, fundAccountScreenStore, helm, userApplicationStore, sortingHatStore, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final HelmDuxo newInstance(AnalyticsLogger analytics, CardManager cardManager, DocumentRequestStore documentRequestStore, FundAccountScreenStore fundAccountScreenStore, Helm helm, UserApplicationStore userApplicationStore, BaseSortingHatStore sortingHatStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(cardManager, "cardManager");
            Intrinsics.checkNotNullParameter(documentRequestStore, "documentRequestStore");
            Intrinsics.checkNotNullParameter(fundAccountScreenStore, "fundAccountScreenStore");
            Intrinsics.checkNotNullParameter(helm, "helm");
            Intrinsics.checkNotNullParameter(userApplicationStore, "userApplicationStore");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new HelmDuxo(analytics, cardManager, documentRequestStore, fundAccountScreenStore, helm, userApplicationStore, sortingHatStore, duxoBundle, savedStateHandle);
        }
    }
}
