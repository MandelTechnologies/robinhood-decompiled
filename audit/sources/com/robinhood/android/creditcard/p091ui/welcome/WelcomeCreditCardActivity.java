package com.robinhood.android.creditcard.p091ui.welcome;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.view.WindowCompat;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.creditcard.contracts.WelcomeCreditCardKey;
import com.robinhood.android.creditcard.p091ui.welcome.WelcomeCreditCardFragment;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.lib.store.creditcard.prefs.CreditCardWaitlistReferralCodePref;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.CreditCardRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.user.contracts.auth.Login;
import com.robinhood.shared.user.contracts.auth.UserCreation;
import com.robinhood.utils.extensions.Activity;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WelcomeCreditCardActivity.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001#B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u0018H\u0016J\t\u0010\u001d\u001a\u00020\rH\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/welcome/WelcomeCreditCardActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/creditcard/ui/welcome/WelcomeCreditCardFragment$Callbacks;", "<init>", "()V", "creditCardWaitlistReferralCode", "Lcom/robinhood/prefs/StringPreference;", "getCreditCardWaitlistReferralCode", "()Lcom/robinhood/prefs/StringPreference;", "setCreditCardWaitlistReferralCode", "(Lcom/robinhood/prefs/StringPreference;)V", "requiresAuthentication", "", "referralCode", "", "getReferralCode", "()Ljava/lang/String;", "referralCode$delegate", "Lkotlin/Lazy;", "exitDeepLinkOverride", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onSignUpClicked", "onLoginClicked", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class WelcomeCreditCardActivity extends BaseActivity implements RegionGated, WelcomeCreditCardFragment.Callbacks {
    private static final String EXTRA_REFERRAL_CODE = "referral_code";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    @CreditCardWaitlistReferralCodePref
    public StringPreference creditCardWaitlistReferralCode;
    private final Uri exitDeepLinkOverride;

    /* renamed from: referralCode$delegate, reason: from kotlin metadata */
    private final Lazy referralCode;

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

    public WelcomeCreditCardActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(CreditCardRegionGate.INSTANCE);
        this.referralCode = Activity.intentExtra(this, EXTRA_REFERRAL_CODE);
        this.exitDeepLinkOverride = new Uri.Builder().scheme(DeepLinkPath.INSTANCE.getSCHEME_ROBINHOOD()).encodedAuthority("credit_card_waitlist_post_login").build();
    }

    public final StringPreference getCreditCardWaitlistReferralCode() {
        StringPreference stringPreference = this.creditCardWaitlistReferralCode;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("creditCardWaitlistReferralCode");
        return null;
    }

    public final void setCreditCardWaitlistReferralCode(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.creditCardWaitlistReferralCode = stringPreference;
    }

    private final String getReferralCode() {
        return (String) this.referralCode.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, WelcomeCreditCardFragment.INSTANCE.newInstance());
        }
        if (getReferralCode() != null) {
            getCreditCardWaitlistReferralCode().set(getReferralCode());
        }
    }

    @Override // com.robinhood.android.creditcard.ui.welcome.WelcomeCreditCardFragment.Callbacks
    public void onSignUpClicked() {
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new UserCreation(null, null, this.exitDeepLinkOverride, null, null, false, 59, null), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.creditcard.ui.welcome.WelcomeCreditCardFragment.Callbacks
    public void onLoginClicked() {
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new Login(null, this.exitDeepLinkOverride, false, 5, null), null, false, null, null, 60, null);
    }

    /* compiled from: WelcomeCreditCardActivity.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/welcome/WelcomeCreditCardActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/creditcard/contracts/WelcomeCreditCardKey;", "<init>", "()V", "EXTRA_REFERRAL_CODE", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<WelcomeCreditCardKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, WelcomeCreditCardKey key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) WelcomeCreditCardActivity.class);
            intent.addFlags(67108864);
            intent.putExtra(WelcomeCreditCardActivity.EXTRA_REFERRAL_CODE, key.getReferralCode());
            return intent;
        }
    }
}
