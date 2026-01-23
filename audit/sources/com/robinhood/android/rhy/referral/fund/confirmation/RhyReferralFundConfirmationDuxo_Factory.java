package com.robinhood.android.rhy.referral.fund.confirmation;

import com.robinhood.android.common.mcduckling.util.GooglePayManager;
import com.robinhood.android.common.mcduckling.util.RhySuvManger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.prefs.BooleanPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralFundConfirmationDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationDuxo;", "googlePayManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;", "rhySuvManager", "Lcom/robinhood/android/common/mcduckling/util/RhySuvManger;", "debugAddedCardToGooglePayPref", "Lcom/robinhood/prefs/BooleanPreference;", "addToGooglePayTappedPref", "stateProvider", "Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RhyReferralFundConfirmationDuxo_Factory implements Factory<RhyReferralFundConfirmationDuxo> {
    private final Provider<BooleanPreference> addToGooglePayTappedPref;
    private final Provider<BooleanPreference> debugAddedCardToGooglePayPref;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<GooglePayManager> googlePayManager;
    private final Provider<RhySuvManger> rhySuvManager;
    private final Provider<RhyReferralFundConfirmationStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RhyReferralFundConfirmationDuxo_Factory create(Provider<GooglePayManager> provider, Provider<RhySuvManger> provider2, Provider<BooleanPreference> provider3, Provider<BooleanPreference> provider4, Provider<RhyReferralFundConfirmationStateProvider> provider5, Provider<DuxoBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final RhyReferralFundConfirmationDuxo newInstance(GooglePayManager googlePayManager, RhySuvManger rhySuvManger, BooleanPreference booleanPreference, BooleanPreference booleanPreference2, RhyReferralFundConfirmationStateProvider rhyReferralFundConfirmationStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(googlePayManager, rhySuvManger, booleanPreference, booleanPreference2, rhyReferralFundConfirmationStateProvider, duxoBundle);
    }

    public RhyReferralFundConfirmationDuxo_Factory(Provider<GooglePayManager> googlePayManager, Provider<RhySuvManger> rhySuvManager, Provider<BooleanPreference> debugAddedCardToGooglePayPref, Provider<BooleanPreference> addToGooglePayTappedPref, Provider<RhyReferralFundConfirmationStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(rhySuvManager, "rhySuvManager");
        Intrinsics.checkNotNullParameter(debugAddedCardToGooglePayPref, "debugAddedCardToGooglePayPref");
        Intrinsics.checkNotNullParameter(addToGooglePayTappedPref, "addToGooglePayTappedPref");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.googlePayManager = googlePayManager;
        this.rhySuvManager = rhySuvManager;
        this.debugAddedCardToGooglePayPref = debugAddedCardToGooglePayPref;
        this.addToGooglePayTappedPref = addToGooglePayTappedPref;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public RhyReferralFundConfirmationDuxo get() {
        Companion companion = INSTANCE;
        GooglePayManager googlePayManager = this.googlePayManager.get();
        Intrinsics.checkNotNullExpressionValue(googlePayManager, "get(...)");
        RhySuvManger rhySuvManger = this.rhySuvManager.get();
        Intrinsics.checkNotNullExpressionValue(rhySuvManger, "get(...)");
        BooleanPreference booleanPreference = this.debugAddedCardToGooglePayPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = this.addToGooglePayTappedPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        RhyReferralFundConfirmationStateProvider rhyReferralFundConfirmationStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(rhyReferralFundConfirmationStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(googlePayManager, rhySuvManger, booleanPreference, booleanPreference2, rhyReferralFundConfirmationStateProvider, duxoBundle);
    }

    /* compiled from: RhyReferralFundConfirmationDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007H\u0007J8\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationDuxo_Factory;", "googlePayManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;", "rhySuvManager", "Lcom/robinhood/android/common/mcduckling/util/RhySuvManger;", "debugAddedCardToGooglePayPref", "Lcom/robinhood/prefs/BooleanPreference;", "addToGooglePayTappedPref", "stateProvider", "Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationDuxo;", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RhyReferralFundConfirmationDuxo_Factory create(Provider<GooglePayManager> googlePayManager, Provider<RhySuvManger> rhySuvManager, Provider<BooleanPreference> debugAddedCardToGooglePayPref, Provider<BooleanPreference> addToGooglePayTappedPref, Provider<RhyReferralFundConfirmationStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
            Intrinsics.checkNotNullParameter(rhySuvManager, "rhySuvManager");
            Intrinsics.checkNotNullParameter(debugAddedCardToGooglePayPref, "debugAddedCardToGooglePayPref");
            Intrinsics.checkNotNullParameter(addToGooglePayTappedPref, "addToGooglePayTappedPref");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new RhyReferralFundConfirmationDuxo_Factory(googlePayManager, rhySuvManager, debugAddedCardToGooglePayPref, addToGooglePayTappedPref, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final RhyReferralFundConfirmationDuxo newInstance(GooglePayManager googlePayManager, RhySuvManger rhySuvManager, BooleanPreference debugAddedCardToGooglePayPref, BooleanPreference addToGooglePayTappedPref, RhyReferralFundConfirmationStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
            Intrinsics.checkNotNullParameter(rhySuvManager, "rhySuvManager");
            Intrinsics.checkNotNullParameter(debugAddedCardToGooglePayPref, "debugAddedCardToGooglePayPref");
            Intrinsics.checkNotNullParameter(addToGooglePayTappedPref, "addToGooglePayTappedPref");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new RhyReferralFundConfirmationDuxo(googlePayManager, rhySuvManager, debugAddedCardToGooglePayPref, addToGooglePayTappedPref, stateProvider, duxoBundle);
        }
    }
}
