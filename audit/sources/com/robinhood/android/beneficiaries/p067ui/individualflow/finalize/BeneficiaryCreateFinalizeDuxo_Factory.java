package com.robinhood.android.beneficiaries.p067ui.individualflow.finalize;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryDetailStore;
import com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryListStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryCreateFinalizeDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeDuxo;", "beneficiaryListStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryListStore;", "beneficiaryDetailStore", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryDetailStore;", "stateProvider", "Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BeneficiaryCreateFinalizeDuxo_Factory implements Factory<BeneficiaryCreateFinalizeDuxo> {
    private final Provider<BeneficiaryDetailStore> beneficiaryDetailStore;
    private final Provider<BeneficiaryListStore> beneficiaryListStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<BeneficiaryCreateFinalizeStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final BeneficiaryCreateFinalizeDuxo_Factory create(Provider<BeneficiaryListStore> provider, Provider<BeneficiaryDetailStore> provider2, Provider<BeneficiaryCreateFinalizeStateProvider> provider3, Provider<DuxoBundle> provider4, Provider<SavedStateHandle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final BeneficiaryCreateFinalizeDuxo newInstance(BeneficiaryListStore beneficiaryListStore, BeneficiaryDetailStore beneficiaryDetailStore, BeneficiaryCreateFinalizeStateProvider beneficiaryCreateFinalizeStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(beneficiaryListStore, beneficiaryDetailStore, beneficiaryCreateFinalizeStateProvider, duxoBundle, savedStateHandle);
    }

    public BeneficiaryCreateFinalizeDuxo_Factory(Provider<BeneficiaryListStore> beneficiaryListStore, Provider<BeneficiaryDetailStore> beneficiaryDetailStore, Provider<BeneficiaryCreateFinalizeStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(beneficiaryListStore, "beneficiaryListStore");
        Intrinsics.checkNotNullParameter(beneficiaryDetailStore, "beneficiaryDetailStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.beneficiaryListStore = beneficiaryListStore;
        this.beneficiaryDetailStore = beneficiaryDetailStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public BeneficiaryCreateFinalizeDuxo get() {
        Companion companion = INSTANCE;
        BeneficiaryListStore beneficiaryListStore = this.beneficiaryListStore.get();
        Intrinsics.checkNotNullExpressionValue(beneficiaryListStore, "get(...)");
        BeneficiaryDetailStore beneficiaryDetailStore = this.beneficiaryDetailStore.get();
        Intrinsics.checkNotNullExpressionValue(beneficiaryDetailStore, "get(...)");
        BeneficiaryCreateFinalizeStateProvider beneficiaryCreateFinalizeStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(beneficiaryCreateFinalizeStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(beneficiaryListStore, beneficiaryDetailStore, beneficiaryCreateFinalizeStateProvider, duxoBundle, savedStateHandle);
    }

    /* compiled from: BeneficiaryCreateFinalizeDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeDuxo_Factory;", "beneficiaryListStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryListStore;", "beneficiaryDetailStore", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryDetailStore;", "stateProvider", "Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeDuxo;", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BeneficiaryCreateFinalizeDuxo_Factory create(Provider<BeneficiaryListStore> beneficiaryListStore, Provider<BeneficiaryDetailStore> beneficiaryDetailStore, Provider<BeneficiaryCreateFinalizeStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(beneficiaryListStore, "beneficiaryListStore");
            Intrinsics.checkNotNullParameter(beneficiaryDetailStore, "beneficiaryDetailStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new BeneficiaryCreateFinalizeDuxo_Factory(beneficiaryListStore, beneficiaryDetailStore, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final BeneficiaryCreateFinalizeDuxo newInstance(BeneficiaryListStore beneficiaryListStore, BeneficiaryDetailStore beneficiaryDetailStore, BeneficiaryCreateFinalizeStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(beneficiaryListStore, "beneficiaryListStore");
            Intrinsics.checkNotNullParameter(beneficiaryDetailStore, "beneficiaryDetailStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new BeneficiaryCreateFinalizeDuxo(beneficiaryListStore, beneficiaryDetailStore, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
