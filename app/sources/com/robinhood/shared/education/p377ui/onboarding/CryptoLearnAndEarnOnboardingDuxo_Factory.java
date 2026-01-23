package com.robinhood.shared.education.p377ui.onboarding;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.shared.app.type.AppType;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoLearnAndEarnOnboardingDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/onboarding/CryptoLearnAndEarnOnboardingDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/education/ui/onboarding/CryptoLearnAndEarnOnboardingDuxo;", "cryptoExperimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/education/ui/onboarding/CryptoLearnAndEarnOnboardingStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CryptoLearnAndEarnOnboardingDuxo_Factory implements Factory<CryptoLearnAndEarnOnboardingDuxo> {
    private final Provider<AppType> appType;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CurrencyPairV2Store> currencyPairStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<CryptoLearnAndEarnOnboardingDuxo3> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoLearnAndEarnOnboardingDuxo_Factory create(Provider<CryptoExperimentsStore> provider, Provider<CurrencyPairV2Store> provider2, Provider<AppType> provider3, Provider<DuxoBundle> provider4, Provider<CryptoLearnAndEarnOnboardingDuxo3> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final CryptoLearnAndEarnOnboardingDuxo newInstance(CryptoExperimentsStore cryptoExperimentsStore, CurrencyPairV2Store currencyPairV2Store, AppType appType, DuxoBundle duxoBundle, CryptoLearnAndEarnOnboardingDuxo3 cryptoLearnAndEarnOnboardingDuxo3) {
        return INSTANCE.newInstance(cryptoExperimentsStore, currencyPairV2Store, appType, duxoBundle, cryptoLearnAndEarnOnboardingDuxo3);
    }

    public CryptoLearnAndEarnOnboardingDuxo_Factory(Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CurrencyPairV2Store> currencyPairStore, Provider<AppType> appType, Provider<DuxoBundle> duxoBundle, Provider<CryptoLearnAndEarnOnboardingDuxo3> stateProvider) {
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.currencyPairStore = currencyPairStore;
        this.appType = appType;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public CryptoLearnAndEarnOnboardingDuxo get() {
        Companion companion = INSTANCE;
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        CurrencyPairV2Store currencyPairV2Store = this.currencyPairStore.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairV2Store, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CryptoLearnAndEarnOnboardingDuxo3 cryptoLearnAndEarnOnboardingDuxo3 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoLearnAndEarnOnboardingDuxo3, "get(...)");
        return companion.newInstance(cryptoExperimentsStore, currencyPairV2Store, appType, duxoBundle, cryptoLearnAndEarnOnboardingDuxo3);
    }

    /* compiled from: CryptoLearnAndEarnOnboardingDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/onboarding/CryptoLearnAndEarnOnboardingDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/education/ui/onboarding/CryptoLearnAndEarnOnboardingDuxo_Factory;", "cryptoExperimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/education/ui/onboarding/CryptoLearnAndEarnOnboardingStateProvider;", "newInstance", "Lcom/robinhood/shared/education/ui/onboarding/CryptoLearnAndEarnOnboardingDuxo;", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoLearnAndEarnOnboardingDuxo_Factory create(Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CurrencyPairV2Store> currencyPairStore, Provider<AppType> appType, Provider<DuxoBundle> duxoBundle, Provider<CryptoLearnAndEarnOnboardingDuxo3> stateProvider) {
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new CryptoLearnAndEarnOnboardingDuxo_Factory(cryptoExperimentsStore, currencyPairStore, appType, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final CryptoLearnAndEarnOnboardingDuxo newInstance(CryptoExperimentsStore cryptoExperimentsStore, CurrencyPairV2Store currencyPairStore, AppType appType, DuxoBundle duxoBundle, CryptoLearnAndEarnOnboardingDuxo3 stateProvider) {
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new CryptoLearnAndEarnOnboardingDuxo(cryptoExperimentsStore, currencyPairStore, appType, duxoBundle, stateProvider);
        }
    }
}
