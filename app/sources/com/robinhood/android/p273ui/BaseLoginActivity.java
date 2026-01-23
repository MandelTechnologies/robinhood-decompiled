package com.robinhood.android.p273ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.authlock.biometric.BiometricChangeManager;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p081cx.CxTopic;
import com.robinhood.android.common.p081cx.SupportEmailHandler;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.home.contracts.MainActivityIntentKey;
import com.robinhood.android.navigation.DeepLinkOrigin;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.login.LoginStatus;
import com.robinhood.models.api.Challenge;
import com.robinhood.shared.login.lib.C39090R;
import com.robinhood.shared.security.contracts.BackupCodeVerificationInput;
import com.robinhood.shared.security.contracts.BackupCodeVerificationIntentKey;
import com.robinhood.shared.security.contracts.PasswordResetFragmentKey;
import com.robinhood.shared.user.contracts.auth.Login;
import com.robinhood.shared.user.contracts.auth.LoginFragmentKey;
import com.robinhood.shared.user.contracts.auth.LoginMfa;
import com.robinhood.shared.user.contracts.auth.LoginMfaBackup;
import com.robinhood.shared.user.contracts.auth.UserCreation;
import com.robinhood.shared.user.contracts.auth.UserCreationFlow;
import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.Contexts8;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Standard2;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BaseLoginActivity.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\b\u0010-\u001a\u00020.H\u0014J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020*H\u0016J$\u00102\u001a\u00020*2\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u000106H\u0016J\u001a\u00108\u001a\u00020*2\u0006\u00103\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u000106H\u0002J\u0014\u0010;\u001a\u00020*2\n\b\u0002\u0010<\u001a\u0004\u0018\u000106H\u0014J\b\u0010=\u001a\u00020*H\u0016J\u0010\u0010>\u001a\u00020*2\u0006\u00103\u001a\u000204H\u0016J\b\u0010?\u001a\u00020*H\u0016J\u0012\u0010@\u001a\u00020*2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\u001a\u0010C\u001a\u0002002\u0006\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010,H\u0016R\u0018\u0010\u0007\u001a\u00020\bX¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u00020\u000eX¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u00020\u0014X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u00020\u001aX¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020&8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006G"}, m3636d2 = {"Lcom/robinhood/android/ui/BaseLoginActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/shared/user/contracts/auth/LoginFragmentKey$Callbacks;", "Lcom/robinhood/shared/user/contracts/auth/LoginMfaBackup$Callbacks;", "Lcom/robinhood/shared/user/contracts/auth/LoginMfa$Callbacks;", "<init>", "()V", "supportEmailHandler", "Lcom/robinhood/android/common/cx/SupportEmailHandler;", "getSupportEmailHandler", "()Lcom/robinhood/android/common/cx/SupportEmailHandler;", "setSupportEmailHandler", "(Lcom/robinhood/android/common/cx/SupportEmailHandler;)V", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "getTargetBackend", "()Lcom/robinhood/targetbackend/TargetBackend;", "setTargetBackend", "(Lcom/robinhood/targetbackend/TargetBackend;)V", "biometricChangeManager", "Lcom/robinhood/android/authlock/biometric/BiometricChangeManager;", "getBiometricChangeManager", "()Lcom/robinhood/android/authlock/biometric/BiometricChangeManager;", "setBiometricChangeManager", "(Lcom/robinhood/android/authlock/biometric/BiometricChangeManager;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "loginExtras", "Lcom/robinhood/shared/user/contracts/auth/Login;", "getLoginExtras", "()Lcom/robinhood/shared/user/contracts/auth/Login;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "createFirstFragment", "Landroidx/fragment/app/Fragment;", "requiresAuthentication", "", "onForgotPasswordClicked", "onAuthenticated", "loginStatus", "Lcom/robinhood/login/LoginStatus;", "email", "", "password", "onMfaRequested", "Lcom/robinhood/login/LoginStatus$MfaRequired;", "username", "onAuthenticatedInternal", "redirectUri", "onMfaAuthenticated", "mfaUseBackupCode", "abortMfaFlow", "onBackupAuthenticated", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "onPositiveButtonClicked", "id", "", "passthroughArgs", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public abstract class BaseLoginActivity extends BaseActivity implements LoginFragmentKey.Callbacks, LoginMfaBackup.Callbacks, LoginMfa.Callbacks {
    public static final int $stable = 8;
    public AnalyticsLogger analytics;

    public abstract BiometricChangeManager getBiometricChangeManager();

    public abstract ExperimentsStore getExperimentsStore();

    public abstract SupportEmailHandler getSupportEmailHandler();

    public abstract TargetBackend getTargetBackend();

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean requiresAuthentication() {
        return false;
    }

    public abstract void setBiometricChangeManager(BiometricChangeManager biometricChangeManager);

    public abstract void setExperimentsStore(ExperimentsStore experimentsStore);

    public abstract void setSupportEmailHandler(SupportEmailHandler supportEmailHandler);

    public abstract void setTargetBackend(TargetBackend targetBackend);

    public BaseLoginActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    protected Login getLoginExtras() {
        throw new Standard2(null, 1, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showCloseIcon();
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, createFirstFragment());
        }
    }

    protected Fragment createFirstFragment() {
        return Navigator.DefaultImpls.createFragment$default(getNavigator(), new LoginFragmentKey(getLoginExtras().getUsername(), getLoginExtras().getLaunchForgotEmail()), null, 2, null);
    }

    @Override // com.robinhood.shared.user.contracts.auth.LoginFragmentKey.Callbacks
    public void onForgotPasswordClicked() {
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), PasswordResetFragmentKey.INSTANCE, null, 2, null));
    }

    @Override // com.robinhood.shared.user.contracts.auth.LoginFragmentKey.Callbacks
    public void onAuthenticated(LoginStatus loginStatus, String email, String password) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(loginStatus, "loginStatus");
        if (loginStatus instanceof LoginStatus.Success) {
            getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_LOGIN);
            onAuthenticatedInternal(((LoginStatus.Success) loginStatus).getRedirectUri());
        } else if (loginStatus instanceof LoginStatus.MfaRequired) {
            onMfaRequested((LoginStatus.MfaRequired) loginStatus, email);
        } else {
            if (!(loginStatus instanceof LoginStatus.SuccessWithBackupCode)) {
                throw new NoWhenBranchMatchedException();
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(loginStatus);
            throw new ExceptionsH();
        }
    }

    private final void onMfaRequested(LoginStatus.MfaRequired loginStatus, String username) {
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new LoginMfa(loginStatus, username), null, 2, null));
    }

    public static /* synthetic */ void onAuthenticatedInternal$default(BaseLoginActivity baseLoginActivity, String str, int i, Object obj) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAuthenticatedInternal");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        baseLoginActivity.onAuthenticatedInternal(str);
    }

    protected void onAuthenticatedInternal(String redirectUri) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        getBiometricChangeManager().deleteSecretKey();
        if (getBiometricChangeManager().canAuthenticate()) {
            getBiometricChangeManager().generateSecretKey();
        }
        Uri exitDeeplinkOverride = getLoginExtras().getExitDeeplinkOverride();
        Uri uri = redirectUri != null ? Uri.parse(redirectUri) : null;
        Intent intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(getNavigator(), this, MainActivityIntentKey.INSTANCE, null, false, 12, null);
        intentCreateIntent$default.setFlags(268468224);
        if (uri != null && getNavigator().isDeepLinkSupported(uri)) {
            startActivities((Intent[]) ArraysKt.plus((Object[]) new Intent[]{intentCreateIntent$default}, (Object[]) Navigator.DefaultImpls.resolveDeepLink$default(getNavigator(), this, uri, Boolean.TRUE, DeepLinkOrigin.Internal.INSTANCE, false, 16, null)));
        } else if (exitDeeplinkOverride != null) {
            startActivities(Navigator.DefaultImpls.resolveDeepLink$default(getNavigator(), this, exitDeeplinkOverride, Boolean.TRUE, DeepLinkOrigin.Internal.INSTANCE, false, 16, null));
            finish();
        } else {
            startActivity(intentCreateIntent$default);
        }
    }

    @Override // com.robinhood.shared.user.contracts.auth.LoginMfa.Callbacks
    public void onMfaAuthenticated() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_LOGIN_MFA);
        onAuthenticatedInternal$default(this, null, 1, null);
    }

    @Override // com.robinhood.shared.user.contracts.auth.LoginMfa.Callbacks
    public void mfaUseBackupCode(LoginStatus loginStatus) {
        Intrinsics.checkNotNullParameter(loginStatus, "loginStatus");
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new LoginMfaBackup(loginStatus), null, 2, null));
    }

    @Override // com.robinhood.shared.user.contracts.auth.LoginMfa.Callbacks
    public void abortMfaFlow() {
        popEntireFragmentBackstack();
    }

    @Override // com.robinhood.shared.user.contracts.auth.LoginMfaBackup.Callbacks
    public void onBackupAuthenticated(UUID challengeId) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_LOGIN_BACKUP_CODE);
        onAuthenticatedInternal$default(this, null, 1, null);
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new BackupCodeVerificationIntentKey(new BackupCodeVerificationInput(Challenge.Flow.LOGIN.getId(), challengeId, null, null, null, null, 60, null)), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C39090R.id.dialog_id_account_lockout_manual_password_reset) {
            onForgotPasswordClicked();
            return true;
        }
        if (id == C39090R.id.dialog_id_account_lockout_contact_support) {
            getSupportEmailHandler().handleExternalSupportLink(this, String.valueOf(CxTopic.ACCOUNT_LOCKOUT.getTopicId()));
            return true;
        }
        if (id == C39090R.id.dialog_id_error_with_create_account_cta) {
            Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new UserCreation(null, null, null, Contexts8.isRhcApp(this) ? UserCreationFlow.RHC : UserCreationFlow.TRADER, null, false, 55, null), null, false, null, null, 60, null);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }
}
