package com.robinhood.android.futures.onboarding.p145ui.valueprops;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOnboardingValuePropsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/valueprops/FuturesOnboardingValuePropsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/futures/onboarding/ui/valueprops/FuturesOnboardingValuePropsDuxo;", "savedStateHandle", "Ljavax/inject/Provider;", "Landroidx/lifecycle/SavedStateHandle;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FuturesOnboardingValuePropsDuxo_Factory implements Factory<FuturesOnboardingValuePropsDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsProvider> experimentsProvider;
    private final Provider<MicrogramManager> microgramManager;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final FuturesOnboardingValuePropsDuxo_Factory create(Provider<SavedStateHandle> provider, Provider<MicrogramManager> provider2, Provider<DuxoBundle> provider3, Provider<ExperimentsProvider> provider4, Provider<RegionGateProvider> provider5, Provider<UserStore> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final FuturesOnboardingValuePropsDuxo newInstance(SavedStateHandle savedStateHandle, MicrogramManager microgramManager, DuxoBundle duxoBundle, ExperimentsProvider experimentsProvider, RegionGateProvider regionGateProvider, UserStore userStore) {
        return INSTANCE.newInstance(savedStateHandle, microgramManager, duxoBundle, experimentsProvider, regionGateProvider, userStore);
    }

    public FuturesOnboardingValuePropsDuxo_Factory(Provider<SavedStateHandle> savedStateHandle, Provider<MicrogramManager> microgramManager, Provider<DuxoBundle> duxoBundle, Provider<ExperimentsProvider> experimentsProvider, Provider<RegionGateProvider> regionGateProvider, Provider<UserStore> userStore) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        this.savedStateHandle = savedStateHandle;
        this.microgramManager = microgramManager;
        this.duxoBundle = duxoBundle;
        this.experimentsProvider = experimentsProvider;
        this.regionGateProvider = regionGateProvider;
        this.userStore = userStore;
    }

    @Override // javax.inject.Provider
    public FuturesOnboardingValuePropsDuxo get() {
        Companion companion = INSTANCE;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        MicrogramManager microgramManager = this.microgramManager.get();
        Intrinsics.checkNotNullExpressionValue(microgramManager, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        ExperimentsProvider experimentsProvider = this.experimentsProvider.get();
        Intrinsics.checkNotNullExpressionValue(experimentsProvider, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        return companion.newInstance(savedStateHandle, microgramManager, duxoBundle, experimentsProvider, regionGateProvider, userStore);
    }

    /* compiled from: FuturesOnboardingValuePropsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/valueprops/FuturesOnboardingValuePropsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/futures/onboarding/ui/valueprops/FuturesOnboardingValuePropsDuxo_Factory;", "savedStateHandle", "Ljavax/inject/Provider;", "Landroidx/lifecycle/SavedStateHandle;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "newInstance", "Lcom/robinhood/android/futures/onboarding/ui/valueprops/FuturesOnboardingValuePropsDuxo;", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FuturesOnboardingValuePropsDuxo_Factory create(Provider<SavedStateHandle> savedStateHandle, Provider<MicrogramManager> microgramManager, Provider<DuxoBundle> duxoBundle, Provider<ExperimentsProvider> experimentsProvider, Provider<RegionGateProvider> regionGateProvider, Provider<UserStore> userStore) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            return new FuturesOnboardingValuePropsDuxo_Factory(savedStateHandle, microgramManager, duxoBundle, experimentsProvider, regionGateProvider, userStore);
        }

        @JvmStatic
        public final FuturesOnboardingValuePropsDuxo newInstance(SavedStateHandle savedStateHandle, MicrogramManager microgramManager, DuxoBundle duxoBundle, ExperimentsProvider experimentsProvider, RegionGateProvider regionGateProvider, UserStore userStore) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            return new FuturesOnboardingValuePropsDuxo(savedStateHandle, microgramManager, duxoBundle, experimentsProvider, regionGateProvider, userStore);
        }
    }
}
