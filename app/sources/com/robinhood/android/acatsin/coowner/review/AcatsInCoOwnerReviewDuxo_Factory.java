package com.robinhood.android.acatsin.coowner.review;

import androidx.lifecycle.SavedStateHandle;
import bonfire.proto.idl.acats.p027v1.AcatsService;
import com.robinhood.android.acatsin.util.names.FetchAccountNamesUseCase;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.AcatsTransferStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInCoOwnerReviewDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewDuxo;", "acatsTransferStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsTransferStore;", "fetchAccountNamesUseCase", "Lcom/robinhood/android/acatsin/util/names/FetchAccountNamesUseCase;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "acatsService", "Lbonfire/proto/idl/acats/v1/AcatsService;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-acats-in-coowner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInCoOwnerReviewDuxo_Factory implements Factory<AcatsInCoOwnerReviewDuxo> {
    private final Provider<AcatsService> acatsService;
    private final Provider<AcatsTransferStore> acatsTransferStore;
    private final Provider<AccountProvider> accountProvider;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<FetchAccountNamesUseCase> fetchAccountNamesUseCase;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<AcatsInCoOwnerReviewState4> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AcatsInCoOwnerReviewDuxo_Factory create(Provider<AcatsTransferStore> provider, Provider<FetchAccountNamesUseCase> provider2, Provider<AccountProvider> provider3, Provider<AcatsService> provider4, Provider<SavedStateHandle> provider5, Provider<AcatsInCoOwnerReviewState4> provider6, Provider<DuxoBundle> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final AcatsInCoOwnerReviewDuxo newInstance(AcatsTransferStore acatsTransferStore, FetchAccountNamesUseCase fetchAccountNamesUseCase, AccountProvider accountProvider, AcatsService acatsService, SavedStateHandle savedStateHandle, AcatsInCoOwnerReviewState4 acatsInCoOwnerReviewState4, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(acatsTransferStore, fetchAccountNamesUseCase, accountProvider, acatsService, savedStateHandle, acatsInCoOwnerReviewState4, duxoBundle);
    }

    public AcatsInCoOwnerReviewDuxo_Factory(Provider<AcatsTransferStore> acatsTransferStore, Provider<FetchAccountNamesUseCase> fetchAccountNamesUseCase, Provider<AccountProvider> accountProvider, Provider<AcatsService> acatsService, Provider<SavedStateHandle> savedStateHandle, Provider<AcatsInCoOwnerReviewState4> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(acatsTransferStore, "acatsTransferStore");
        Intrinsics.checkNotNullParameter(fetchAccountNamesUseCase, "fetchAccountNamesUseCase");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(acatsService, "acatsService");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.acatsTransferStore = acatsTransferStore;
        this.fetchAccountNamesUseCase = fetchAccountNamesUseCase;
        this.accountProvider = accountProvider;
        this.acatsService = acatsService;
        this.savedStateHandle = savedStateHandle;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public AcatsInCoOwnerReviewDuxo get() {
        Companion companion = INSTANCE;
        AcatsTransferStore acatsTransferStore = this.acatsTransferStore.get();
        Intrinsics.checkNotNullExpressionValue(acatsTransferStore, "get(...)");
        FetchAccountNamesUseCase fetchAccountNamesUseCase = this.fetchAccountNamesUseCase.get();
        Intrinsics.checkNotNullExpressionValue(fetchAccountNamesUseCase, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AcatsService acatsService = this.acatsService.get();
        Intrinsics.checkNotNullExpressionValue(acatsService, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        AcatsInCoOwnerReviewState4 acatsInCoOwnerReviewState4 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(acatsInCoOwnerReviewState4, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(acatsTransferStore, fetchAccountNamesUseCase, accountProvider, acatsService, savedStateHandle, acatsInCoOwnerReviewState4, duxoBundle);
    }

    /* compiled from: AcatsInCoOwnerReviewDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewDuxo_Factory;", "acatsTransferStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsTransferStore;", "fetchAccountNamesUseCase", "Lcom/robinhood/android/acatsin/util/names/FetchAccountNamesUseCase;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "acatsService", "Lbonfire/proto/idl/acats/v1/AcatsService;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewDuxo;", "feature-acats-in-coowner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AcatsInCoOwnerReviewDuxo_Factory create(Provider<AcatsTransferStore> acatsTransferStore, Provider<FetchAccountNamesUseCase> fetchAccountNamesUseCase, Provider<AccountProvider> accountProvider, Provider<AcatsService> acatsService, Provider<SavedStateHandle> savedStateHandle, Provider<AcatsInCoOwnerReviewState4> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(acatsTransferStore, "acatsTransferStore");
            Intrinsics.checkNotNullParameter(fetchAccountNamesUseCase, "fetchAccountNamesUseCase");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(acatsService, "acatsService");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AcatsInCoOwnerReviewDuxo_Factory(acatsTransferStore, fetchAccountNamesUseCase, accountProvider, acatsService, savedStateHandle, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final AcatsInCoOwnerReviewDuxo newInstance(AcatsTransferStore acatsTransferStore, FetchAccountNamesUseCase fetchAccountNamesUseCase, AccountProvider accountProvider, AcatsService acatsService, SavedStateHandle savedStateHandle, AcatsInCoOwnerReviewState4 stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(acatsTransferStore, "acatsTransferStore");
            Intrinsics.checkNotNullParameter(fetchAccountNamesUseCase, "fetchAccountNamesUseCase");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(acatsService, "acatsService");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AcatsInCoOwnerReviewDuxo(acatsTransferStore, fetchAccountNamesUseCase, accountProvider, acatsService, savedStateHandle, stateProvider, duxoBundle);
        }
    }
}
