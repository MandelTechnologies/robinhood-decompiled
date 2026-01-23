package com.robinhood.android.rhy.referral.welcome;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhy.referral.welcome.WelcomeRhyFragment;
import com.robinhood.android.rhyonboarding.contracts.WelcomeRhyKey;
import com.robinhood.prefs.StringPreference;
import com.robinhood.referral.AttributionManager;
import com.robinhood.rhy.referral.RhyReferralOnboardingDataPref;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.user.contracts.auth.Login;
import com.robinhood.shared.user.contracts.auth.UserCreation;
import com.robinhood.utils.extensions.Activity;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WelcomeRhyActivity.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001/B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010!\u001a\u00020\"H\u0016J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\b\u0010'\u001a\u00020$H\u0016J\b\u0010(\u001a\u00020$H\u0016J\t\u0010)\u001a\u00020\"H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\n \u001a*\u0004\u0018\u00010\u00190\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+X\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyFragment$Callbacks;", "<init>", "()V", "rhyReferralOnboardingDataPref", "Lcom/robinhood/prefs/StringPreference;", "getRhyReferralOnboardingDataPref", "()Lcom/robinhood/prefs/StringPreference;", "setRhyReferralOnboardingDataPref", "(Lcom/robinhood/prefs/StringPreference;)V", "attributionManager", "Lcom/robinhood/referral/AttributionManager;", "getAttributionManager", "()Lcom/robinhood/referral/AttributionManager;", "setAttributionManager", "(Lcom/robinhood/referral/AttributionManager;)V", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "getAuthManager", "()Lcom/robinhood/shared/security/auth/AuthManager;", "setAuthManager", "(Lcom/robinhood/shared/security/auth/AuthManager;)V", "exitDeepLinkOverride", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "welcomeKey", "Lcom/robinhood/android/rhyonboarding/contracts/WelcomeRhyKey;", "getWelcomeKey", "()Lcom/robinhood/android/rhyonboarding/contracts/WelcomeRhyKey;", "welcomeKey$delegate", "Lkotlin/Lazy;", "requiresAuthentication", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onSignInClicked", "onSignUpClicked", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class WelcomeRhyActivity extends BaseActivity implements RegionGated, WelcomeRhyFragment.Callbacks {
    private static final String EXTRA_WELCOME_KEY = "welcome_key_extra";
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public AttributionManager attributionManager;
    public AuthManager authManager;
    private final Uri exitDeepLinkOverride;

    @RhyReferralOnboardingDataPref
    public StringPreference rhyReferralOnboardingDataPref;

    /* renamed from: welcomeKey$delegate, reason: from kotlin metadata */
    private final Lazy welcomeKey;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean requiresAuthentication() {
        return false;
    }

    public WelcomeRhyActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.exitDeepLinkOverride = new Uri.Builder().scheme(DeepLinkPath.INSTANCE.getSCHEME_ROBINHOOD()).encodedAuthority("rhy_referral_onboarding").appendQueryParameter("variant", "rhy").build();
        this.welcomeKey = Activity.intentExtra(this, EXTRA_WELCOME_KEY);
    }

    public final StringPreference getRhyReferralOnboardingDataPref() {
        StringPreference stringPreference = this.rhyReferralOnboardingDataPref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhyReferralOnboardingDataPref");
        return null;
    }

    public final void setRhyReferralOnboardingDataPref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.rhyReferralOnboardingDataPref = stringPreference;
    }

    public final AttributionManager getAttributionManager() {
        AttributionManager attributionManager = this.attributionManager;
        if (attributionManager != null) {
            return attributionManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("attributionManager");
        return null;
    }

    public final void setAttributionManager(AttributionManager attributionManager) {
        Intrinsics.checkNotNullParameter(attributionManager, "<set-?>");
        this.attributionManager = attributionManager;
    }

    public final AuthManager getAuthManager() {
        AuthManager authManager = this.authManager;
        if (authManager != null) {
            return authManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("authManager");
        return null;
    }

    public final void setAuthManager(AuthManager authManager) {
        Intrinsics.checkNotNullParameter(authManager, "<set-?>");
        this.authManager = authManager;
    }

    private final WelcomeRhyKey getWelcomeKey() {
        return (WelcomeRhyKey) this.welcomeKey.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().getDecorView().setSystemUiVisibility(1280);
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            StringPreference rhyReferralOnboardingDataPref = getRhyReferralOnboardingDataPref();
            String referralCode = getWelcomeKey().getReferralCode();
            if (referralCode == null) {
                referralCode = "";
            }
            rhyReferralOnboardingDataPref.set(referralCode);
            setFragment(C11048R.id.fragment_container, WelcomeRhyFragment.INSTANCE.newInstance((Parcelable) getWelcomeKey()));
        }
        if (getAuthManager().isLoggedIn()) {
            getAttributionManager().clearPersistedData();
        }
    }

    @Override // com.robinhood.android.rhy.referral.welcome.WelcomeRhyFragment.Callbacks
    public void onSignInClicked() {
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new Login(null, this.exitDeepLinkOverride, false, 5, null), null, false, null, null, 60, null);
        finish();
    }

    @Override // com.robinhood.android.rhy.referral.welcome.WelcomeRhyFragment.Callbacks
    public void onSignUpClicked() {
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new UserCreation(null, null, this.exitDeepLinkOverride, null, null, false, 59, null), null, false, null, null, 60, null);
        finish();
    }

    /* compiled from: WelcomeRhyActivity.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/rhyonboarding/contracts/WelcomeRhyKey;", "<init>", "()V", "EXTRA_WELCOME_KEY", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<WelcomeRhyKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, WelcomeRhyKey key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) WelcomeRhyActivity.class);
            intent.addFlags(67108864);
            intent.putExtra(WelcomeRhyActivity.EXTRA_WELCOME_KEY, key);
            return intent;
        }
    }
}
