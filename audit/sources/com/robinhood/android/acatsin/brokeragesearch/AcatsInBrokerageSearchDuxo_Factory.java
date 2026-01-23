package com.robinhood.android.acatsin.brokeragesearch;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.AcatsBrokerageStore;
import com.robinhood.librobinhood.data.store.bonfire.AcatsValidationStore;
import com.robinhood.shared.data.store.iac.IacInfoBannerStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInBrokerageSearchDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchDuxo;", "acatsValidationStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsValidationStore;", "brokerageStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBrokerageStore;", "iacInfoBannerStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AcatsInBrokerageSearchDuxo_Factory implements Factory<AcatsInBrokerageSearchDuxo> {
    private final Provider<AcatsValidationStore> acatsValidationStore;
    private final Provider<AcatsBrokerageStore> brokerageStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<IacInfoBannerStore> iacInfoBannerStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<AcatsInBrokerageSearchStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AcatsInBrokerageSearchDuxo_Factory create(Provider<AcatsValidationStore> provider, Provider<AcatsBrokerageStore> provider2, Provider<IacInfoBannerStore> provider3, Provider<SavedStateHandle> provider4, Provider<AcatsInBrokerageSearchStateProvider> provider5, Provider<DuxoBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final AcatsInBrokerageSearchDuxo newInstance(AcatsValidationStore acatsValidationStore, AcatsBrokerageStore acatsBrokerageStore, IacInfoBannerStore iacInfoBannerStore, SavedStateHandle savedStateHandle, AcatsInBrokerageSearchStateProvider acatsInBrokerageSearchStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(acatsValidationStore, acatsBrokerageStore, iacInfoBannerStore, savedStateHandle, acatsInBrokerageSearchStateProvider, duxoBundle);
    }

    public AcatsInBrokerageSearchDuxo_Factory(Provider<AcatsValidationStore> acatsValidationStore, Provider<AcatsBrokerageStore> brokerageStore, Provider<IacInfoBannerStore> iacInfoBannerStore, Provider<SavedStateHandle> savedStateHandle, Provider<AcatsInBrokerageSearchStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(acatsValidationStore, "acatsValidationStore");
        Intrinsics.checkNotNullParameter(brokerageStore, "brokerageStore");
        Intrinsics.checkNotNullParameter(iacInfoBannerStore, "iacInfoBannerStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.acatsValidationStore = acatsValidationStore;
        this.brokerageStore = brokerageStore;
        this.iacInfoBannerStore = iacInfoBannerStore;
        this.savedStateHandle = savedStateHandle;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public AcatsInBrokerageSearchDuxo get() {
        Companion companion = INSTANCE;
        AcatsValidationStore acatsValidationStore = this.acatsValidationStore.get();
        Intrinsics.checkNotNullExpressionValue(acatsValidationStore, "get(...)");
        AcatsBrokerageStore acatsBrokerageStore = this.brokerageStore.get();
        Intrinsics.checkNotNullExpressionValue(acatsBrokerageStore, "get(...)");
        IacInfoBannerStore iacInfoBannerStore = this.iacInfoBannerStore.get();
        Intrinsics.checkNotNullExpressionValue(iacInfoBannerStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        AcatsInBrokerageSearchStateProvider acatsInBrokerageSearchStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(acatsInBrokerageSearchStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(acatsValidationStore, acatsBrokerageStore, iacInfoBannerStore, savedStateHandle, acatsInBrokerageSearchStateProvider, duxoBundle);
    }

    /* compiled from: AcatsInBrokerageSearchDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchDuxo_Factory;", "acatsValidationStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsValidationStore;", "brokerageStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBrokerageStore;", "iacInfoBannerStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchDuxo;", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AcatsInBrokerageSearchDuxo_Factory create(Provider<AcatsValidationStore> acatsValidationStore, Provider<AcatsBrokerageStore> brokerageStore, Provider<IacInfoBannerStore> iacInfoBannerStore, Provider<SavedStateHandle> savedStateHandle, Provider<AcatsInBrokerageSearchStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(acatsValidationStore, "acatsValidationStore");
            Intrinsics.checkNotNullParameter(brokerageStore, "brokerageStore");
            Intrinsics.checkNotNullParameter(iacInfoBannerStore, "iacInfoBannerStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AcatsInBrokerageSearchDuxo_Factory(acatsValidationStore, brokerageStore, iacInfoBannerStore, savedStateHandle, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final AcatsInBrokerageSearchDuxo newInstance(AcatsValidationStore acatsValidationStore, AcatsBrokerageStore brokerageStore, IacInfoBannerStore iacInfoBannerStore, SavedStateHandle savedStateHandle, AcatsInBrokerageSearchStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(acatsValidationStore, "acatsValidationStore");
            Intrinsics.checkNotNullParameter(brokerageStore, "brokerageStore");
            Intrinsics.checkNotNullParameter(iacInfoBannerStore, "iacInfoBannerStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AcatsInBrokerageSearchDuxo(acatsValidationStore, brokerageStore, iacInfoBannerStore, savedStateHandle, stateProvider, duxoBundle);
        }
    }
}
