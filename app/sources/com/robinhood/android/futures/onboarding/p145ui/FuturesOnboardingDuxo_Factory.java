package com.robinhood.android.futures.onboarding.p145ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.futures.trade.StreamMarketSessionChangeStateUseCase;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.store.futures.FuturesAccountStore;
import com.robinhood.store.futures.FuturesLocaleStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOnboardingDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingDuxo;", "agreementsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/agreements/AgreementsStore;", "ceres", "Lcom/robinhood/ceres/v1/Ceres;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresLocaleStore", "Lcom/robinhood/store/futures/FuturesLocaleStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "streamMarketSessionChangeStateUseCase", "Lcom/robinhood/android/lib/futures/trade/StreamMarketSessionChangeStateUseCase;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class FuturesOnboardingDuxo_Factory implements Factory<FuturesOnboardingDuxo> {
    private final Provider<AgreementsStore> agreementsStore;
    private final Provider<Ceres> ceres;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<FuturesAccountStore> futuresAccountStore;
    private final Provider<FuturesLocaleStore> futuresLocaleStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<StreamMarketSessionChangeStateUseCase> streamMarketSessionChangeStateUseCase;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final FuturesOnboardingDuxo_Factory create(Provider<AgreementsStore> provider, Provider<Ceres> provider2, Provider<FuturesAccountStore> provider3, Provider<FuturesLocaleStore> provider4, Provider<RegionGateProvider> provider5, Provider<StreamMarketSessionChangeStateUseCase> provider6, Provider<SavedStateHandle> provider7, Provider<DuxoBundle> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final FuturesOnboardingDuxo newInstance(AgreementsStore agreementsStore, Ceres ceres, FuturesAccountStore futuresAccountStore, FuturesLocaleStore futuresLocaleStore, RegionGateProvider regionGateProvider, StreamMarketSessionChangeStateUseCase streamMarketSessionChangeStateUseCase, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(agreementsStore, ceres, futuresAccountStore, futuresLocaleStore, regionGateProvider, streamMarketSessionChangeStateUseCase, savedStateHandle, duxoBundle);
    }

    public FuturesOnboardingDuxo_Factory(Provider<AgreementsStore> agreementsStore, Provider<Ceres> ceres, Provider<FuturesAccountStore> futuresAccountStore, Provider<FuturesLocaleStore> futuresLocaleStore, Provider<RegionGateProvider> regionGateProvider, Provider<StreamMarketSessionChangeStateUseCase> streamMarketSessionChangeStateUseCase, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(ceres, "ceres");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(futuresLocaleStore, "futuresLocaleStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(streamMarketSessionChangeStateUseCase, "streamMarketSessionChangeStateUseCase");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.agreementsStore = agreementsStore;
        this.ceres = ceres;
        this.futuresAccountStore = futuresAccountStore;
        this.futuresLocaleStore = futuresLocaleStore;
        this.regionGateProvider = regionGateProvider;
        this.streamMarketSessionChangeStateUseCase = streamMarketSessionChangeStateUseCase;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public FuturesOnboardingDuxo get() {
        Companion companion = INSTANCE;
        AgreementsStore agreementsStore = this.agreementsStore.get();
        Intrinsics.checkNotNullExpressionValue(agreementsStore, "get(...)");
        Ceres ceres = this.ceres.get();
        Intrinsics.checkNotNullExpressionValue(ceres, "get(...)");
        FuturesAccountStore futuresAccountStore = this.futuresAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresAccountStore, "get(...)");
        FuturesLocaleStore futuresLocaleStore = this.futuresLocaleStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresLocaleStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        StreamMarketSessionChangeStateUseCase streamMarketSessionChangeStateUseCase = this.streamMarketSessionChangeStateUseCase.get();
        Intrinsics.checkNotNullExpressionValue(streamMarketSessionChangeStateUseCase, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(agreementsStore, ceres, futuresAccountStore, futuresLocaleStore, regionGateProvider, streamMarketSessionChangeStateUseCase, savedStateHandle, duxoBundle);
    }

    /* compiled from: FuturesOnboardingDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingDuxo_Factory;", "agreementsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/agreements/AgreementsStore;", "ceres", "Lcom/robinhood/ceres/v1/Ceres;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresLocaleStore", "Lcom/robinhood/store/futures/FuturesLocaleStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "streamMarketSessionChangeStateUseCase", "Lcom/robinhood/android/lib/futures/trade/StreamMarketSessionChangeStateUseCase;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingDuxo;", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FuturesOnboardingDuxo_Factory create(Provider<AgreementsStore> agreementsStore, Provider<Ceres> ceres, Provider<FuturesAccountStore> futuresAccountStore, Provider<FuturesLocaleStore> futuresLocaleStore, Provider<RegionGateProvider> regionGateProvider, Provider<StreamMarketSessionChangeStateUseCase> streamMarketSessionChangeStateUseCase, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
            Intrinsics.checkNotNullParameter(ceres, "ceres");
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(futuresLocaleStore, "futuresLocaleStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(streamMarketSessionChangeStateUseCase, "streamMarketSessionChangeStateUseCase");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new FuturesOnboardingDuxo_Factory(agreementsStore, ceres, futuresAccountStore, futuresLocaleStore, regionGateProvider, streamMarketSessionChangeStateUseCase, savedStateHandle, duxoBundle);
        }

        @JvmStatic
        public final FuturesOnboardingDuxo newInstance(AgreementsStore agreementsStore, Ceres ceres, FuturesAccountStore futuresAccountStore, FuturesLocaleStore futuresLocaleStore, RegionGateProvider regionGateProvider, StreamMarketSessionChangeStateUseCase streamMarketSessionChangeStateUseCase, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
            Intrinsics.checkNotNullParameter(ceres, "ceres");
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(futuresLocaleStore, "futuresLocaleStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(streamMarketSessionChangeStateUseCase, "streamMarketSessionChangeStateUseCase");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new FuturesOnboardingDuxo(agreementsStore, ceres, futuresAccountStore, futuresLocaleStore, regionGateProvider, streamMarketSessionChangeStateUseCase, savedStateHandle, duxoBundle);
        }
    }
}
