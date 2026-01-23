package com.robinhood.android.rhy.referral.referee;

import com.robinhood.android.common.mcduckling.util.GooglePayManager;
import com.robinhood.android.common.mcduckling.util.RhySuvManger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.RhyReferralLandingStore;
import com.robinhood.librobinhood.store.PaymentCardStore;
import com.robinhood.librobinhood.store.RhyOverviewAccountStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.targetbackend.TargetBackend;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralsRefereeLandingDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB¡\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingDuxo;", "referralLandingStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/RhyReferralLandingStore;", "rhySuvManager", "Lcom/robinhood/android/common/mcduckling/util/RhySuvManger;", "googlePayManager", "Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;", "rhyOverviewAccountStore", "Lcom/robinhood/librobinhood/store/RhyOverviewAccountStore;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "debugAddedCardToGooglePayPref", "Lcom/robinhood/prefs/BooleanPreference;", "alwaysShowAddToGPayPref", "hasViewedRefereeOfferPref", "stateProvider", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RhyReferralsRefereeLandingDuxo_Factory implements Factory<RhyReferralsRefereeLandingDuxo> {
    private final Provider<BooleanPreference> alwaysShowAddToGPayPref;
    private final Provider<BooleanPreference> debugAddedCardToGooglePayPref;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<GooglePayManager> googlePayManager;
    private final Provider<BooleanPreference> hasViewedRefereeOfferPref;
    private final Provider<PaymentCardStore> paymentCardStore;
    private final Provider<RhyReferralLandingStore> referralLandingStore;
    private final Provider<RhyOverviewAccountStore> rhyOverviewAccountStore;
    private final Provider<RhySuvManger> rhySuvManager;
    private final Provider<RhyReferralsRefereeLandingStateProvider> stateProvider;
    private final Provider<TargetBackend> targetBackend;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RhyReferralsRefereeLandingDuxo_Factory create(Provider<RhyReferralLandingStore> provider, Provider<RhySuvManger> provider2, Provider<GooglePayManager> provider3, Provider<RhyOverviewAccountStore> provider4, Provider<PaymentCardStore> provider5, Provider<TargetBackend> provider6, Provider<BooleanPreference> provider7, Provider<BooleanPreference> provider8, Provider<BooleanPreference> provider9, Provider<RhyReferralsRefereeLandingStateProvider> provider10, Provider<DuxoBundle> provider11) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    @JvmStatic
    public static final RhyReferralsRefereeLandingDuxo newInstance(RhyReferralLandingStore rhyReferralLandingStore, RhySuvManger rhySuvManger, GooglePayManager googlePayManager, RhyOverviewAccountStore rhyOverviewAccountStore, PaymentCardStore paymentCardStore, TargetBackend targetBackend, BooleanPreference booleanPreference, BooleanPreference booleanPreference2, BooleanPreference booleanPreference3, RhyReferralsRefereeLandingStateProvider rhyReferralsRefereeLandingStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(rhyReferralLandingStore, rhySuvManger, googlePayManager, rhyOverviewAccountStore, paymentCardStore, targetBackend, booleanPreference, booleanPreference2, booleanPreference3, rhyReferralsRefereeLandingStateProvider, duxoBundle);
    }

    public RhyReferralsRefereeLandingDuxo_Factory(Provider<RhyReferralLandingStore> referralLandingStore, Provider<RhySuvManger> rhySuvManager, Provider<GooglePayManager> googlePayManager, Provider<RhyOverviewAccountStore> rhyOverviewAccountStore, Provider<PaymentCardStore> paymentCardStore, Provider<TargetBackend> targetBackend, Provider<BooleanPreference> debugAddedCardToGooglePayPref, Provider<BooleanPreference> alwaysShowAddToGPayPref, Provider<BooleanPreference> hasViewedRefereeOfferPref, Provider<RhyReferralsRefereeLandingStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(referralLandingStore, "referralLandingStore");
        Intrinsics.checkNotNullParameter(rhySuvManager, "rhySuvManager");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(rhyOverviewAccountStore, "rhyOverviewAccountStore");
        Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(debugAddedCardToGooglePayPref, "debugAddedCardToGooglePayPref");
        Intrinsics.checkNotNullParameter(alwaysShowAddToGPayPref, "alwaysShowAddToGPayPref");
        Intrinsics.checkNotNullParameter(hasViewedRefereeOfferPref, "hasViewedRefereeOfferPref");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.referralLandingStore = referralLandingStore;
        this.rhySuvManager = rhySuvManager;
        this.googlePayManager = googlePayManager;
        this.rhyOverviewAccountStore = rhyOverviewAccountStore;
        this.paymentCardStore = paymentCardStore;
        this.targetBackend = targetBackend;
        this.debugAddedCardToGooglePayPref = debugAddedCardToGooglePayPref;
        this.alwaysShowAddToGPayPref = alwaysShowAddToGPayPref;
        this.hasViewedRefereeOfferPref = hasViewedRefereeOfferPref;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public RhyReferralsRefereeLandingDuxo get() {
        Companion companion = INSTANCE;
        RhyReferralLandingStore rhyReferralLandingStore = this.referralLandingStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyReferralLandingStore, "get(...)");
        RhySuvManger rhySuvManger = this.rhySuvManager.get();
        Intrinsics.checkNotNullExpressionValue(rhySuvManger, "get(...)");
        GooglePayManager googlePayManager = this.googlePayManager.get();
        Intrinsics.checkNotNullExpressionValue(googlePayManager, "get(...)");
        RhyOverviewAccountStore rhyOverviewAccountStore = this.rhyOverviewAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyOverviewAccountStore, "get(...)");
        PaymentCardStore paymentCardStore = this.paymentCardStore.get();
        Intrinsics.checkNotNullExpressionValue(paymentCardStore, "get(...)");
        TargetBackend targetBackend = this.targetBackend.get();
        Intrinsics.checkNotNullExpressionValue(targetBackend, "get(...)");
        BooleanPreference booleanPreference = this.debugAddedCardToGooglePayPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = this.alwaysShowAddToGPayPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        BooleanPreference booleanPreference3 = this.hasViewedRefereeOfferPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference3, "get(...)");
        RhyReferralsRefereeLandingStateProvider rhyReferralsRefereeLandingStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(rhyReferralsRefereeLandingStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(rhyReferralLandingStore, rhySuvManger, googlePayManager, rhyOverviewAccountStore, paymentCardStore, targetBackend, booleanPreference, booleanPreference2, booleanPreference3, rhyReferralsRefereeLandingStateProvider, duxoBundle);
    }

    /* compiled from: RhyReferralsRefereeLandingDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¢\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007H\u0007J`\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingDuxo_Factory;", "referralLandingStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/RhyReferralLandingStore;", "rhySuvManager", "Lcom/robinhood/android/common/mcduckling/util/RhySuvManger;", "googlePayManager", "Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;", "rhyOverviewAccountStore", "Lcom/robinhood/librobinhood/store/RhyOverviewAccountStore;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "debugAddedCardToGooglePayPref", "Lcom/robinhood/prefs/BooleanPreference;", "alwaysShowAddToGPayPref", "hasViewedRefereeOfferPref", "stateProvider", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingDuxo;", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RhyReferralsRefereeLandingDuxo_Factory create(Provider<RhyReferralLandingStore> referralLandingStore, Provider<RhySuvManger> rhySuvManager, Provider<GooglePayManager> googlePayManager, Provider<RhyOverviewAccountStore> rhyOverviewAccountStore, Provider<PaymentCardStore> paymentCardStore, Provider<TargetBackend> targetBackend, Provider<BooleanPreference> debugAddedCardToGooglePayPref, Provider<BooleanPreference> alwaysShowAddToGPayPref, Provider<BooleanPreference> hasViewedRefereeOfferPref, Provider<RhyReferralsRefereeLandingStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(referralLandingStore, "referralLandingStore");
            Intrinsics.checkNotNullParameter(rhySuvManager, "rhySuvManager");
            Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
            Intrinsics.checkNotNullParameter(rhyOverviewAccountStore, "rhyOverviewAccountStore");
            Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            Intrinsics.checkNotNullParameter(debugAddedCardToGooglePayPref, "debugAddedCardToGooglePayPref");
            Intrinsics.checkNotNullParameter(alwaysShowAddToGPayPref, "alwaysShowAddToGPayPref");
            Intrinsics.checkNotNullParameter(hasViewedRefereeOfferPref, "hasViewedRefereeOfferPref");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new RhyReferralsRefereeLandingDuxo_Factory(referralLandingStore, rhySuvManager, googlePayManager, rhyOverviewAccountStore, paymentCardStore, targetBackend, debugAddedCardToGooglePayPref, alwaysShowAddToGPayPref, hasViewedRefereeOfferPref, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final RhyReferralsRefereeLandingDuxo newInstance(RhyReferralLandingStore referralLandingStore, RhySuvManger rhySuvManager, GooglePayManager googlePayManager, RhyOverviewAccountStore rhyOverviewAccountStore, PaymentCardStore paymentCardStore, TargetBackend targetBackend, BooleanPreference debugAddedCardToGooglePayPref, BooleanPreference alwaysShowAddToGPayPref, BooleanPreference hasViewedRefereeOfferPref, RhyReferralsRefereeLandingStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(referralLandingStore, "referralLandingStore");
            Intrinsics.checkNotNullParameter(rhySuvManager, "rhySuvManager");
            Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
            Intrinsics.checkNotNullParameter(rhyOverviewAccountStore, "rhyOverviewAccountStore");
            Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            Intrinsics.checkNotNullParameter(debugAddedCardToGooglePayPref, "debugAddedCardToGooglePayPref");
            Intrinsics.checkNotNullParameter(alwaysShowAddToGPayPref, "alwaysShowAddToGPayPref");
            Intrinsics.checkNotNullParameter(hasViewedRefereeOfferPref, "hasViewedRefereeOfferPref");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new RhyReferralsRefereeLandingDuxo(referralLandingStore, rhySuvManager, googlePayManager, rhyOverviewAccountStore, paymentCardStore, targetBackend, debugAddedCardToGooglePayPref, alwaysShowAddToGPayPref, hasViewedRefereeOfferPref, stateProvider, duxoBundle);
        }
    }
}
