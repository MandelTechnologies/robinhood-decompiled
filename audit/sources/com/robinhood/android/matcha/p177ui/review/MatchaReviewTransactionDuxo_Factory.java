package com.robinhood.android.matcha.p177ui.review;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.stepupverification.SuvMigrationManager;
import com.robinhood.android.store.matcha.MatchaIncentivesSummaryStore;
import com.robinhood.android.store.matcha.MatchaPendingTransactionStore;
import com.robinhood.android.store.matcha.MatchaTransferStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.api.matcha.MatchaApi;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.store.stripe.StripeStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaReviewTransactionDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB¯\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionDuxo;", "matchaApi", "Ljavax/inject/Provider;", "Lcom/robinhood/api/matcha/MatchaApi;", "matchaPendingTransactionStore", "Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore;", "matchaTransferStore", "Lcom/robinhood/android/store/matcha/MatchaTransferStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "matchaIncentivesSummaryStore", "Lcom/robinhood/android/store/matcha/MatchaIncentivesSummaryStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "stripeStore", "Lcom/robinhood/store/stripe/StripeStore;", "suvMigrationManager", "Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;", "stateProvider", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class MatchaReviewTransactionDuxo_Factory implements Factory<MatchaReviewTransactionDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<MatchaApi> matchaApi;
    private final Provider<MatchaIncentivesSummaryStore> matchaIncentivesSummaryStore;
    private final Provider<MatchaPendingTransactionStore> matchaPendingTransactionStore;
    private final Provider<MatchaTransferStore> matchaTransferStore;
    private final Provider<RhyAccountStore> rhyAccountStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<MatchaReviewTransactionStateProvider> stateProvider;
    private final Provider<StripeStore> stripeStore;
    private final Provider<SuvMigrationManager> suvMigrationManager;
    private final Provider<TransferAccountStore> transferAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MatchaReviewTransactionDuxo_Factory create(Provider<MatchaApi> provider, Provider<MatchaPendingTransactionStore> provider2, Provider<MatchaTransferStore> provider3, Provider<RhyAccountStore> provider4, Provider<TransferAccountStore> provider5, Provider<MatchaIncentivesSummaryStore> provider6, Provider<ExperimentsStore> provider7, Provider<StripeStore> provider8, Provider<SuvMigrationManager> provider9, Provider<MatchaReviewTransactionStateProvider> provider10, Provider<DuxoBundle> provider11, Provider<SavedStateHandle> provider12) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    @JvmStatic
    public static final MatchaReviewTransactionDuxo newInstance(MatchaApi matchaApi, MatchaPendingTransactionStore matchaPendingTransactionStore, MatchaTransferStore matchaTransferStore, RhyAccountStore rhyAccountStore, TransferAccountStore transferAccountStore, MatchaIncentivesSummaryStore matchaIncentivesSummaryStore, ExperimentsStore experimentsStore, StripeStore stripeStore, SuvMigrationManager suvMigrationManager, MatchaReviewTransactionStateProvider matchaReviewTransactionStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(matchaApi, matchaPendingTransactionStore, matchaTransferStore, rhyAccountStore, transferAccountStore, matchaIncentivesSummaryStore, experimentsStore, stripeStore, suvMigrationManager, matchaReviewTransactionStateProvider, duxoBundle, savedStateHandle);
    }

    public MatchaReviewTransactionDuxo_Factory(Provider<MatchaApi> matchaApi, Provider<MatchaPendingTransactionStore> matchaPendingTransactionStore, Provider<MatchaTransferStore> matchaTransferStore, Provider<RhyAccountStore> rhyAccountStore, Provider<TransferAccountStore> transferAccountStore, Provider<MatchaIncentivesSummaryStore> matchaIncentivesSummaryStore, Provider<ExperimentsStore> experimentsStore, Provider<StripeStore> stripeStore, Provider<SuvMigrationManager> suvMigrationManager, Provider<MatchaReviewTransactionStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
        Intrinsics.checkNotNullParameter(matchaPendingTransactionStore, "matchaPendingTransactionStore");
        Intrinsics.checkNotNullParameter(matchaTransferStore, "matchaTransferStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(matchaIncentivesSummaryStore, "matchaIncentivesSummaryStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(stripeStore, "stripeStore");
        Intrinsics.checkNotNullParameter(suvMigrationManager, "suvMigrationManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.matchaApi = matchaApi;
        this.matchaPendingTransactionStore = matchaPendingTransactionStore;
        this.matchaTransferStore = matchaTransferStore;
        this.rhyAccountStore = rhyAccountStore;
        this.transferAccountStore = transferAccountStore;
        this.matchaIncentivesSummaryStore = matchaIncentivesSummaryStore;
        this.experimentsStore = experimentsStore;
        this.stripeStore = stripeStore;
        this.suvMigrationManager = suvMigrationManager;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public MatchaReviewTransactionDuxo get() {
        Companion companion = INSTANCE;
        MatchaApi matchaApi = this.matchaApi.get();
        Intrinsics.checkNotNullExpressionValue(matchaApi, "get(...)");
        MatchaPendingTransactionStore matchaPendingTransactionStore = this.matchaPendingTransactionStore.get();
        Intrinsics.checkNotNullExpressionValue(matchaPendingTransactionStore, "get(...)");
        MatchaTransferStore matchaTransferStore = this.matchaTransferStore.get();
        Intrinsics.checkNotNullExpressionValue(matchaTransferStore, "get(...)");
        RhyAccountStore rhyAccountStore = this.rhyAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyAccountStore, "get(...)");
        TransferAccountStore transferAccountStore = this.transferAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(transferAccountStore, "get(...)");
        MatchaIncentivesSummaryStore matchaIncentivesSummaryStore = this.matchaIncentivesSummaryStore.get();
        Intrinsics.checkNotNullExpressionValue(matchaIncentivesSummaryStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        StripeStore stripeStore = this.stripeStore.get();
        Intrinsics.checkNotNullExpressionValue(stripeStore, "get(...)");
        SuvMigrationManager suvMigrationManager = this.suvMigrationManager.get();
        Intrinsics.checkNotNullExpressionValue(suvMigrationManager, "get(...)");
        MatchaReviewTransactionStateProvider matchaReviewTransactionStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(matchaReviewTransactionStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(matchaApi, matchaPendingTransactionStore, matchaTransferStore, rhyAccountStore, transferAccountStore, matchaIncentivesSummaryStore, experimentsStore, stripeStore, suvMigrationManager, matchaReviewTransactionStateProvider, duxoBundle, savedStateHandle);
    }

    /* compiled from: MatchaReviewTransactionDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J°\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0007H\u0007Jh\u0010\u001f\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionDuxo_Factory;", "matchaApi", "Ljavax/inject/Provider;", "Lcom/robinhood/api/matcha/MatchaApi;", "matchaPendingTransactionStore", "Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore;", "matchaTransferStore", "Lcom/robinhood/android/store/matcha/MatchaTransferStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "matchaIncentivesSummaryStore", "Lcom/robinhood/android/store/matcha/MatchaIncentivesSummaryStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "stripeStore", "Lcom/robinhood/store/stripe/StripeStore;", "suvMigrationManager", "Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;", "stateProvider", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionDuxo;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MatchaReviewTransactionDuxo_Factory create(Provider<MatchaApi> matchaApi, Provider<MatchaPendingTransactionStore> matchaPendingTransactionStore, Provider<MatchaTransferStore> matchaTransferStore, Provider<RhyAccountStore> rhyAccountStore, Provider<TransferAccountStore> transferAccountStore, Provider<MatchaIncentivesSummaryStore> matchaIncentivesSummaryStore, Provider<ExperimentsStore> experimentsStore, Provider<StripeStore> stripeStore, Provider<SuvMigrationManager> suvMigrationManager, Provider<MatchaReviewTransactionStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
            Intrinsics.checkNotNullParameter(matchaPendingTransactionStore, "matchaPendingTransactionStore");
            Intrinsics.checkNotNullParameter(matchaTransferStore, "matchaTransferStore");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(matchaIncentivesSummaryStore, "matchaIncentivesSummaryStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(stripeStore, "stripeStore");
            Intrinsics.checkNotNullParameter(suvMigrationManager, "suvMigrationManager");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new MatchaReviewTransactionDuxo_Factory(matchaApi, matchaPendingTransactionStore, matchaTransferStore, rhyAccountStore, transferAccountStore, matchaIncentivesSummaryStore, experimentsStore, stripeStore, suvMigrationManager, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final MatchaReviewTransactionDuxo newInstance(MatchaApi matchaApi, MatchaPendingTransactionStore matchaPendingTransactionStore, MatchaTransferStore matchaTransferStore, RhyAccountStore rhyAccountStore, TransferAccountStore transferAccountStore, MatchaIncentivesSummaryStore matchaIncentivesSummaryStore, ExperimentsStore experimentsStore, StripeStore stripeStore, SuvMigrationManager suvMigrationManager, MatchaReviewTransactionStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
            Intrinsics.checkNotNullParameter(matchaPendingTransactionStore, "matchaPendingTransactionStore");
            Intrinsics.checkNotNullParameter(matchaTransferStore, "matchaTransferStore");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(matchaIncentivesSummaryStore, "matchaIncentivesSummaryStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(stripeStore, "stripeStore");
            Intrinsics.checkNotNullParameter(suvMigrationManager, "suvMigrationManager");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new MatchaReviewTransactionDuxo(matchaApi, matchaPendingTransactionStore, matchaTransferStore, rhyAccountStore, transferAccountStore, matchaIncentivesSummaryStore, experimentsStore, stripeStore, suvMigrationManager, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
