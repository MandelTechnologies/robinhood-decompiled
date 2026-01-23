package com.robinhood.android.challenge.verification.backup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentResultListener;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.challenge.verification.UpdateMfaMethodFragment;
import com.robinhood.android.challenge.verification.backup.BackupCodeVerificationFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.security.contracts.MfaSettingsFragmentKey;
import com.robinhood.android.settings.MfaSettingsConstants;
import com.robinhood.models.api.Challenge;
import com.robinhood.shared.lib.challenge.BackupCodeVerificationResult;
import com.robinhood.shared.security.contracts.BackupCodeVerificationInput;
import com.robinhood.shared.security.contracts.BackupCodeVerificationIntentKey;
import com.robinhood.utils.extensions.Activity;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: BackupCodeVerificationActivity.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001eB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u001c\u001a\u00020\u0018H\u0016J\b\u0010\u001d\u001a\u00020\u0018H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR/\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/backup/BackupCodeVerificationActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/challenge/verification/backup/BackupCodeVerificationFragment$Callbacks;", "Lcom/robinhood/android/challenge/verification/UpdateMfaMethodFragment$Callbacks;", "<init>", "()V", "extraInput", "Lcom/robinhood/shared/security/contracts/BackupCodeVerificationInput;", "getExtraInput", "()Lcom/robinhood/shared/security/contracts/BackupCodeVerificationInput;", "extraInput$delegate", "Lkotlin/Lazy;", "<set-?>", "Ljava/util/UUID;", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "getChallengeId", "()Ljava/util/UUID;", "setChallengeId", "(Ljava/util/UUID;)V", "challengeId$delegate", "Lkotlin/properties/ReadWriteProperty;", "requiresAuthentication", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onContinueBackupCode", "onSelectVerifySms", "onSelectVerifyAuthApp", "Companion", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BackupCodeVerificationActivity extends BaseActivity implements BackupCodeVerificationFragment.Callbacks, UpdateMfaMethodFragment.Callbacks {
    private static final String EXTRA_VERIFICATION_INPUT = "extraVerificationInput";

    /* renamed from: challengeId$delegate, reason: from kotlin metadata */
    private final Interfaces3 challengeId;

    /* renamed from: extraInput$delegate, reason: from kotlin metadata */
    private final Lazy extraInput;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(BackupCodeVerificationActivity.class, ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "getChallengeId()Ljava/util/UUID;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public BackupCodeVerificationActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.extraInput = Activity.intentExtra(this, EXTRA_VERIFICATION_INPUT);
        this.challengeId = (Interfaces3) BindSavedState2.savedSerializable(this).provideDelegate(this, $$delegatedProperties[0]);
    }

    private final BackupCodeVerificationInput getExtraInput() {
        return (BackupCodeVerificationInput) this.extraInput.getValue();
    }

    private final UUID getChallengeId() {
        return (UUID) this.challengeId.getValue(this, $$delegatedProperties[0]);
    }

    private final void setChallengeId(UUID uuid) {
        this.challengeId.setValue(this, $$delegatedProperties[0], uuid);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean requiresAuthentication() {
        return getAuthManagerDoNotUse().isLoggedIn();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            String flowId = getExtraInput().getFlowId();
            Challenge.Flow flow = Challenge.Flow.UNVERIFIED_ACCOUNT_RECOVERY_APP_MFA;
            if (Intrinsics.areEqual(flowId, flow.getId())) {
                setFragment(C11048R.id.fragment_container, Navigator.DefaultImpls.createFragment$default(getNavigator(), new MfaSettingsFragmentKey(MfaSettingsFragmentKey.LaunchType.VERIFY_AUTH_APP, null, getExtraInput().getTotpToken(), getExtraInput().getEnrollmentToken(), null, flow, 18, null), null, 2, null));
            } else {
                String flowId2 = getExtraInput().getFlowId();
                Challenge.Flow flow2 = Challenge.Flow.UNVERIFIED_ACCOUNT_RECOVERY_SMS_MFA;
                if (Intrinsics.areEqual(flowId2, flow2.getId())) {
                    setFragment(C11048R.id.fragment_container, Navigator.DefaultImpls.createFragment$default(getNavigator(), new MfaSettingsFragmentKey(MfaSettingsFragmentKey.LaunchType.VERIFY_SMS, getExtraInput().getChallengeId(), null, getExtraInput().getEnrollmentToken(), getExtraInput().getPhoneNumber(), flow2, 4, null), null, 2, null));
                } else if (getExtraInput().getChallengeId() != null) {
                    setChallengeId(getExtraInput().getChallengeId());
                    setFragment(C11048R.id.fragment_container, UpdateMfaMethodFragment.INSTANCE.newInstance());
                } else {
                    setFragment(C11048R.id.fragment_container, BackupCodeVerificationFragment.INSTANCE.newInstance((Parcelable) getExtraInput()));
                }
            }
        }
        getSupportFragmentManager().setFragmentResultListener(MfaSettingsConstants.MFA_FRAGMENT_RESULT_REQUEST_KEY, this, new FragmentResultListener() { // from class: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationActivity.onCreate.1
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle result) {
                Intrinsics.checkNotNullParameter(str, "<unused var>");
                Intrinsics.checkNotNullParameter(result, "result");
                NavigationActivityResultContract3.finishWithResult$default(BackupCodeVerificationActivity.this, new BackupCodeVerificationResult((UUID) result.getSerializable(MfaSettingsConstants.CHALLENGE_VERIFICATION_RESULT_KEY)), 0, 2, null);
            }
        });
    }

    @Override // com.robinhood.android.challenge.verification.backup.BackupCodeVerificationFragment.Callbacks
    public void onContinueBackupCode(UUID challengeId) {
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        if (Intrinsics.areEqual(getExtraInput().getFlowId(), Challenge.Flow.RESET_PASSWORD_WHEN_LOGGED_OUT.getId())) {
            NavigationActivityResultContract3.finishWithResult$default(this, new BackupCodeVerificationResult(challengeId), 0, 2, null);
        } else {
            setChallengeId(challengeId);
            replaceFragmentWithoutBackStack(UpdateMfaMethodFragment.INSTANCE.newInstance());
        }
    }

    @Override // com.robinhood.android.challenge.verification.UpdateMfaMethodFragment.Callbacks
    public void onSelectVerifySms() {
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new MfaSettingsFragmentKey(MfaSettingsFragmentKey.LaunchType.VERIFY_SMS, getChallengeId(), null, null, null, null, 60, null), null, 2, null));
    }

    @Override // com.robinhood.android.challenge.verification.UpdateMfaMethodFragment.Callbacks
    public void onSelectVerifyAuthApp() {
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new MfaSettingsFragmentKey(MfaSettingsFragmentKey.LaunchType.VERIFY_AUTH_APP, getChallengeId(), null, null, null, null, 60, null), null, 2, null));
    }

    /* compiled from: BackupCodeVerificationActivity.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/backup/BackupCodeVerificationActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/shared/security/contracts/BackupCodeVerificationIntentKey;", "<init>", "()V", "EXTRA_VERIFICATION_INPUT", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<BackupCodeVerificationIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, BackupCodeVerificationIntentKey key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intentPutExtra = new Intent(context, (Class<?>) BackupCodeVerificationActivity.class).putExtra(BackupCodeVerificationActivity.EXTRA_VERIFICATION_INPUT, key.getInput());
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }
}
