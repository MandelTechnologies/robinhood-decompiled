package com.robinhood.android.common.recurring.assetSelection;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.SweepsStatusStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementContributionsSummaryStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementMatchStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringAssetCategorySelectionDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionDuxo;", "sweepsStatusStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/SweepsStatusStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "retirementContributionsSummaryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementContributionsSummaryStore;", "retirementMatchStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;", "stateProvider", "Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RecurringAssetCategorySelectionDuxo_Factory implements Factory<RecurringAssetCategorySelectionDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<RetirementContributionsSummaryStore> retirementContributionsSummaryStore;
    private final Provider<RetirementMatchStore> retirementMatchStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<RecurringAssetCategorySelectionStateProvider> stateProvider;
    private final Provider<SweepsStatusStore> sweepsStatusStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RecurringAssetCategorySelectionDuxo_Factory create(Provider<SweepsStatusStore> provider, Provider<AccountProvider> provider2, Provider<RetirementContributionsSummaryStore> provider3, Provider<RetirementMatchStore> provider4, Provider<RecurringAssetCategorySelectionStateProvider> provider5, Provider<DuxoBundle> provider6, Provider<SavedStateHandle> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final RecurringAssetCategorySelectionDuxo newInstance(SweepsStatusStore sweepsStatusStore, AccountProvider accountProvider, RetirementContributionsSummaryStore retirementContributionsSummaryStore, RetirementMatchStore retirementMatchStore, RecurringAssetCategorySelectionStateProvider recurringAssetCategorySelectionStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(sweepsStatusStore, accountProvider, retirementContributionsSummaryStore, retirementMatchStore, recurringAssetCategorySelectionStateProvider, duxoBundle, savedStateHandle);
    }

    public RecurringAssetCategorySelectionDuxo_Factory(Provider<SweepsStatusStore> sweepsStatusStore, Provider<AccountProvider> accountProvider, Provider<RetirementContributionsSummaryStore> retirementContributionsSummaryStore, Provider<RetirementMatchStore> retirementMatchStore, Provider<RecurringAssetCategorySelectionStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(sweepsStatusStore, "sweepsStatusStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(retirementContributionsSummaryStore, "retirementContributionsSummaryStore");
        Intrinsics.checkNotNullParameter(retirementMatchStore, "retirementMatchStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.sweepsStatusStore = sweepsStatusStore;
        this.accountProvider = accountProvider;
        this.retirementContributionsSummaryStore = retirementContributionsSummaryStore;
        this.retirementMatchStore = retirementMatchStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public RecurringAssetCategorySelectionDuxo get() {
        Companion companion = INSTANCE;
        SweepsStatusStore sweepsStatusStore = this.sweepsStatusStore.get();
        Intrinsics.checkNotNullExpressionValue(sweepsStatusStore, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        RetirementContributionsSummaryStore retirementContributionsSummaryStore = this.retirementContributionsSummaryStore.get();
        Intrinsics.checkNotNullExpressionValue(retirementContributionsSummaryStore, "get(...)");
        RetirementMatchStore retirementMatchStore = this.retirementMatchStore.get();
        Intrinsics.checkNotNullExpressionValue(retirementMatchStore, "get(...)");
        RecurringAssetCategorySelectionStateProvider recurringAssetCategorySelectionStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(recurringAssetCategorySelectionStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(sweepsStatusStore, accountProvider, retirementContributionsSummaryStore, retirementMatchStore, recurringAssetCategorySelectionStateProvider, duxoBundle, savedStateHandle);
    }

    /* compiled from: RecurringAssetCategorySelectionDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionDuxo_Factory;", "sweepsStatusStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/SweepsStatusStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "retirementContributionsSummaryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementContributionsSummaryStore;", "retirementMatchStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;", "stateProvider", "Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionDuxo;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RecurringAssetCategorySelectionDuxo_Factory create(Provider<SweepsStatusStore> sweepsStatusStore, Provider<AccountProvider> accountProvider, Provider<RetirementContributionsSummaryStore> retirementContributionsSummaryStore, Provider<RetirementMatchStore> retirementMatchStore, Provider<RecurringAssetCategorySelectionStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(sweepsStatusStore, "sweepsStatusStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(retirementContributionsSummaryStore, "retirementContributionsSummaryStore");
            Intrinsics.checkNotNullParameter(retirementMatchStore, "retirementMatchStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new RecurringAssetCategorySelectionDuxo_Factory(sweepsStatusStore, accountProvider, retirementContributionsSummaryStore, retirementMatchStore, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final RecurringAssetCategorySelectionDuxo newInstance(SweepsStatusStore sweepsStatusStore, AccountProvider accountProvider, RetirementContributionsSummaryStore retirementContributionsSummaryStore, RetirementMatchStore retirementMatchStore, RecurringAssetCategorySelectionStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(sweepsStatusStore, "sweepsStatusStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(retirementContributionsSummaryStore, "retirementContributionsSummaryStore");
            Intrinsics.checkNotNullParameter(retirementMatchStore, "retirementMatchStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new RecurringAssetCategorySelectionDuxo(sweepsStatusStore, accountProvider, retirementContributionsSummaryStore, retirementMatchStore, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
