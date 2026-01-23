package com.robinhood.android.matcha.p177ui.review.multiuser;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.store.matcha.MatchaIncentivesSummaryStore;
import com.robinhood.android.store.matcha.MatchaTransferStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.api.matcha.MatchaApi;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.store.stripe.StripeStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaReviewMultiuserTransactionDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0085\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionDuxo;", "matchaApi", "Ljavax/inject/Provider;", "Lcom/robinhood/api/matcha/MatchaApi;", "matchaTransferStore", "Lcom/robinhood/android/store/matcha/MatchaTransferStore;", "matchaIncentivesSummaryStore", "Lcom/robinhood/android/store/matcha/MatchaIncentivesSummaryStore;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "stripeStore", "Lcom/robinhood/store/stripe/StripeStore;", "stateProvider", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class MatchaReviewMultiuserTransactionDuxo_Factory implements Factory<MatchaReviewMultiuserTransactionDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<MatchaApi> matchaApi;
    private final Provider<MatchaIncentivesSummaryStore> matchaIncentivesSummaryStore;
    private final Provider<MatchaTransferStore> matchaTransferStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<MatchaReviewMultiuserTransactionStateProvider> stateProvider;
    private final Provider<StripeStore> stripeStore;
    private final Provider<TransferAccountStore> transferAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MatchaReviewMultiuserTransactionDuxo_Factory create(Provider<MatchaApi> provider, Provider<MatchaTransferStore> provider2, Provider<MatchaIncentivesSummaryStore> provider3, Provider<TransferAccountStore> provider4, Provider<ExperimentsStore> provider5, Provider<StripeStore> provider6, Provider<MatchaReviewMultiuserTransactionStateProvider> provider7, Provider<DuxoBundle> provider8, Provider<SavedStateHandle> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final MatchaReviewMultiuserTransactionDuxo newInstance(MatchaApi matchaApi, MatchaTransferStore matchaTransferStore, MatchaIncentivesSummaryStore matchaIncentivesSummaryStore, TransferAccountStore transferAccountStore, ExperimentsStore experimentsStore, StripeStore stripeStore, MatchaReviewMultiuserTransactionStateProvider matchaReviewMultiuserTransactionStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(matchaApi, matchaTransferStore, matchaIncentivesSummaryStore, transferAccountStore, experimentsStore, stripeStore, matchaReviewMultiuserTransactionStateProvider, duxoBundle, savedStateHandle);
    }

    public MatchaReviewMultiuserTransactionDuxo_Factory(Provider<MatchaApi> matchaApi, Provider<MatchaTransferStore> matchaTransferStore, Provider<MatchaIncentivesSummaryStore> matchaIncentivesSummaryStore, Provider<TransferAccountStore> transferAccountStore, Provider<ExperimentsStore> experimentsStore, Provider<StripeStore> stripeStore, Provider<MatchaReviewMultiuserTransactionStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
        Intrinsics.checkNotNullParameter(matchaTransferStore, "matchaTransferStore");
        Intrinsics.checkNotNullParameter(matchaIncentivesSummaryStore, "matchaIncentivesSummaryStore");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(stripeStore, "stripeStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.matchaApi = matchaApi;
        this.matchaTransferStore = matchaTransferStore;
        this.matchaIncentivesSummaryStore = matchaIncentivesSummaryStore;
        this.transferAccountStore = transferAccountStore;
        this.experimentsStore = experimentsStore;
        this.stripeStore = stripeStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public MatchaReviewMultiuserTransactionDuxo get() {
        Companion companion = INSTANCE;
        MatchaApi matchaApi = this.matchaApi.get();
        Intrinsics.checkNotNullExpressionValue(matchaApi, "get(...)");
        MatchaTransferStore matchaTransferStore = this.matchaTransferStore.get();
        Intrinsics.checkNotNullExpressionValue(matchaTransferStore, "get(...)");
        MatchaIncentivesSummaryStore matchaIncentivesSummaryStore = this.matchaIncentivesSummaryStore.get();
        Intrinsics.checkNotNullExpressionValue(matchaIncentivesSummaryStore, "get(...)");
        TransferAccountStore transferAccountStore = this.transferAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(transferAccountStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        StripeStore stripeStore = this.stripeStore.get();
        Intrinsics.checkNotNullExpressionValue(stripeStore, "get(...)");
        MatchaReviewMultiuserTransactionStateProvider matchaReviewMultiuserTransactionStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(matchaReviewMultiuserTransactionStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(matchaApi, matchaTransferStore, matchaIncentivesSummaryStore, transferAccountStore, experimentsStore, stripeStore, matchaReviewMultiuserTransactionStateProvider, duxoBundle, savedStateHandle);
    }

    /* compiled from: MatchaReviewMultiuserTransactionDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0086\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H\u0007JP\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionDuxo_Factory;", "matchaApi", "Ljavax/inject/Provider;", "Lcom/robinhood/api/matcha/MatchaApi;", "matchaTransferStore", "Lcom/robinhood/android/store/matcha/MatchaTransferStore;", "matchaIncentivesSummaryStore", "Lcom/robinhood/android/store/matcha/MatchaIncentivesSummaryStore;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "stripeStore", "Lcom/robinhood/store/stripe/StripeStore;", "stateProvider", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionDuxo;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MatchaReviewMultiuserTransactionDuxo_Factory create(Provider<MatchaApi> matchaApi, Provider<MatchaTransferStore> matchaTransferStore, Provider<MatchaIncentivesSummaryStore> matchaIncentivesSummaryStore, Provider<TransferAccountStore> transferAccountStore, Provider<ExperimentsStore> experimentsStore, Provider<StripeStore> stripeStore, Provider<MatchaReviewMultiuserTransactionStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
            Intrinsics.checkNotNullParameter(matchaTransferStore, "matchaTransferStore");
            Intrinsics.checkNotNullParameter(matchaIncentivesSummaryStore, "matchaIncentivesSummaryStore");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(stripeStore, "stripeStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new MatchaReviewMultiuserTransactionDuxo_Factory(matchaApi, matchaTransferStore, matchaIncentivesSummaryStore, transferAccountStore, experimentsStore, stripeStore, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final MatchaReviewMultiuserTransactionDuxo newInstance(MatchaApi matchaApi, MatchaTransferStore matchaTransferStore, MatchaIncentivesSummaryStore matchaIncentivesSummaryStore, TransferAccountStore transferAccountStore, ExperimentsStore experimentsStore, StripeStore stripeStore, MatchaReviewMultiuserTransactionStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
            Intrinsics.checkNotNullParameter(matchaTransferStore, "matchaTransferStore");
            Intrinsics.checkNotNullParameter(matchaIncentivesSummaryStore, "matchaIncentivesSummaryStore");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(stripeStore, "stripeStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new MatchaReviewMultiuserTransactionDuxo(matchaApi, matchaTransferStore, matchaIncentivesSummaryStore, transferAccountStore, experimentsStore, stripeStore, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
