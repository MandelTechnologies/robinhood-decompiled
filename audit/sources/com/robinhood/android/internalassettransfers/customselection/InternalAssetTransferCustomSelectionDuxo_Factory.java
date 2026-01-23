package com.robinhood.android.internalassettransfers.customselection;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.internalassettransfers.validation.AccountFeatureParityChecker;
import com.robinhood.android.lib.margin.MarginEligibilityStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferCustomSelectionDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionDuxo;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "accountFeatureParityChecker", "Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityChecker;", "marginEligibilityStore", "Lcom/robinhood/android/lib/margin/MarginEligibilityStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class InternalAssetTransferCustomSelectionDuxo_Factory implements Factory<InternalAssetTransferCustomSelectionDuxo> {
    private final Provider<AccountFeatureParityChecker> accountFeatureParityChecker;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<MarginEligibilityStore> marginEligibilityStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<InternalAssetTransferCustomSelectionStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final InternalAssetTransferCustomSelectionDuxo_Factory create(Provider<InternalAssetTransferCustomSelectionStateProvider> provider, Provider<DuxoBundle> provider2, Provider<SavedStateHandle> provider3, Provider<AccountFeatureParityChecker> provider4, Provider<MarginEligibilityStore> provider5, Provider<ExperimentsStore> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final InternalAssetTransferCustomSelectionDuxo newInstance(InternalAssetTransferCustomSelectionStateProvider internalAssetTransferCustomSelectionStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, AccountFeatureParityChecker accountFeatureParityChecker, MarginEligibilityStore marginEligibilityStore, ExperimentsStore experimentsStore) {
        return INSTANCE.newInstance(internalAssetTransferCustomSelectionStateProvider, duxoBundle, savedStateHandle, accountFeatureParityChecker, marginEligibilityStore, experimentsStore);
    }

    public InternalAssetTransferCustomSelectionDuxo_Factory(Provider<InternalAssetTransferCustomSelectionStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<AccountFeatureParityChecker> accountFeatureParityChecker, Provider<MarginEligibilityStore> marginEligibilityStore, Provider<ExperimentsStore> experimentsStore) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(accountFeatureParityChecker, "accountFeatureParityChecker");
        Intrinsics.checkNotNullParameter(marginEligibilityStore, "marginEligibilityStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
        this.accountFeatureParityChecker = accountFeatureParityChecker;
        this.marginEligibilityStore = marginEligibilityStore;
        this.experimentsStore = experimentsStore;
    }

    @Override // javax.inject.Provider
    public InternalAssetTransferCustomSelectionDuxo get() {
        Companion companion = INSTANCE;
        InternalAssetTransferCustomSelectionStateProvider internalAssetTransferCustomSelectionStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(internalAssetTransferCustomSelectionStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        AccountFeatureParityChecker accountFeatureParityChecker = this.accountFeatureParityChecker.get();
        Intrinsics.checkNotNullExpressionValue(accountFeatureParityChecker, "get(...)");
        MarginEligibilityStore marginEligibilityStore = this.marginEligibilityStore.get();
        Intrinsics.checkNotNullExpressionValue(marginEligibilityStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        return companion.newInstance(internalAssetTransferCustomSelectionStateProvider, duxoBundle, savedStateHandle, accountFeatureParityChecker, marginEligibilityStore, experimentsStore);
    }

    /* compiled from: InternalAssetTransferCustomSelectionDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionDuxo_Factory;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "accountFeatureParityChecker", "Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityChecker;", "marginEligibilityStore", "Lcom/robinhood/android/lib/margin/MarginEligibilityStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "newInstance", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionDuxo;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InternalAssetTransferCustomSelectionDuxo_Factory create(Provider<InternalAssetTransferCustomSelectionStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<AccountFeatureParityChecker> accountFeatureParityChecker, Provider<MarginEligibilityStore> marginEligibilityStore, Provider<ExperimentsStore> experimentsStore) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(accountFeatureParityChecker, "accountFeatureParityChecker");
            Intrinsics.checkNotNullParameter(marginEligibilityStore, "marginEligibilityStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            return new InternalAssetTransferCustomSelectionDuxo_Factory(stateProvider, duxoBundle, savedStateHandle, accountFeatureParityChecker, marginEligibilityStore, experimentsStore);
        }

        @JvmStatic
        public final InternalAssetTransferCustomSelectionDuxo newInstance(InternalAssetTransferCustomSelectionStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, AccountFeatureParityChecker accountFeatureParityChecker, MarginEligibilityStore marginEligibilityStore, ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(accountFeatureParityChecker, "accountFeatureParityChecker");
            Intrinsics.checkNotNullParameter(marginEligibilityStore, "marginEligibilityStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            return new InternalAssetTransferCustomSelectionDuxo(stateProvider, duxoBundle, savedStateHandle, accountFeatureParityChecker, marginEligibilityStore, experimentsStore);
        }
    }
}
