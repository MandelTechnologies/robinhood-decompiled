package com.robinhood.android.jointaccounts.onboarding.confirmation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.account.contracts.jointaccounts.JointAccountConfirmSecondaryKey;
import com.robinhood.android.account.contracts.jointaccounts.JointAccountCreatedKey;
import com.robinhood.android.account.contracts.jointaccounts.JointAccountOnboardingPrimaryIntro;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryFragment;
import com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationFragment;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.JointAccountsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JointAccountConfirmSecondaryActivity.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0017B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\t\u0010\u0010\u001a\u00020\u0011H\u0096\u0001R\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryFragment$Callbacks;", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/submit/JointAccountSubmitConfirmationFragment$Callbacks;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onConfirmClicked", "onRejectionComplete", "onAccountCreated", "accountNumber", "", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class JointAccountConfirmSecondaryActivity extends BaseActivity implements RegionGated, JointAccountConfirmSecondaryFragment.Callbacks, JointAccountSubmitConfirmationFragment.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;

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

    public JointAccountConfirmSecondaryActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(JointAccountsRegionGate.INSTANCE);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            JointAccountConfirmSecondaryFragment.Companion companion = JointAccountConfirmSecondaryFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            setFragment(i, companion.newInstance((Parcelable) new JointAccountConfirmSecondaryFragment.Args(((JointAccountConfirmSecondaryKey) companion2.getExtras((Activity) this)).getInvitationId(), ((JointAccountConfirmSecondaryKey) companion2.getExtras((Activity) this)).getSource())));
        }
    }

    @Override // com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryFragment.Callbacks
    public void onConfirmClicked() {
        JointAccountSubmitConfirmationFragment.Companion companion = JointAccountSubmitConfirmationFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        replaceFragment(companion.newInstance((Parcelable) new JointAccountSubmitConfirmationFragment.Args(((JointAccountConfirmSecondaryKey) companion2.getExtras((Activity) this)).getInvitationId(), ((JointAccountConfirmSecondaryKey) companion2.getExtras((Activity) this)).getSource())));
    }

    @Override // com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryFragment.Callbacks
    public void onRejectionComplete() {
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(getNavigator(), this, new JointAccountOnboardingPrimaryIntro(((JointAccountConfirmSecondaryKey) INSTANCE.getExtras((Activity) this)).getSource(), null, 2, null), false, false, false, false, null, false, null, null, 1020, null);
        finish();
    }

    @Override // com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationFragment.Callbacks
    public void onAccountCreated(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new JointAccountCreatedKey(accountNumber, ((JointAccountConfirmSecondaryKey) INSTANCE.getExtras((Activity) this)).getSource()), null, 2, null));
    }

    /* compiled from: JointAccountConfirmSecondaryActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryActivity;", "Lcom/robinhood/android/account/contracts/jointaccounts/JointAccountConfirmSecondaryKey;", "<init>", "()V", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<JointAccountConfirmSecondaryActivity, JointAccountConfirmSecondaryKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public JointAccountConfirmSecondaryKey getExtras(JointAccountConfirmSecondaryActivity jointAccountConfirmSecondaryActivity) {
            return (JointAccountConfirmSecondaryKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, jointAccountConfirmSecondaryActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, JointAccountConfirmSecondaryKey jointAccountConfirmSecondaryKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, jointAccountConfirmSecondaryKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, JointAccountConfirmSecondaryKey jointAccountConfirmSecondaryKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, jointAccountConfirmSecondaryKey);
        }
    }
}
