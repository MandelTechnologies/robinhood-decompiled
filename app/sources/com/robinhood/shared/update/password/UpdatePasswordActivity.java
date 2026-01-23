package com.robinhood.shared.update.password;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.security.screenprotect.ScreenProtectFlow;
import com.robinhood.security.screenprotect.ScreenProtectManager;
import com.robinhood.shared.security.contracts.UpdatePasswordIntentKey;
import com.robinhood.shared.update.password.UpdatePasswordFragment;
import com.robinhood.shared.update.password.UpdatePasswordSuccessFragment;
import com.robinhood.shared.update.password.reset.CheckEmailFragment;
import com.robinhood.shared.update.password.reset.ResetPasswordFragment;
import com.robinhood.shared.user.contracts.verification.EmailVerificationSettingIntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdatePasswordActivity.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u001aB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u000fH\u0016R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/update/password/UpdatePasswordActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "Lcom/robinhood/shared/update/password/UpdatePasswordFragment$Callbacks;", "Lcom/robinhood/shared/update/password/UpdatePasswordSuccessFragment$Callbacks;", "Lcom/robinhood/shared/update/password/reset/ResetPasswordFragment$Callbacks;", "<init>", "()V", "screenProtectManager", "Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "getScreenProtectManager", "()Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "setScreenProtectManager", "(Lcom/robinhood/security/screenprotect/ScreenProtectManager;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDialogDismissed", "id", "", "onUpdatePasswordSuccess", "onForgotPassword", "onUpdatePasswordComplete", "onEmailSent", "onUpdateEmail", "Companion", "feature-update-password_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class UpdatePasswordActivity extends BaseActivity implements RhDialogFragment.OnDismissListener, UpdatePasswordFragment.Callbacks, UpdatePasswordSuccessFragment.Callbacks, ResetPasswordFragment.Callbacks {
    public ScreenProtectManager screenProtectManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public UpdatePasswordActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    public final ScreenProtectManager getScreenProtectManager() {
        ScreenProtectManager screenProtectManager = this.screenProtectManager;
        if (screenProtectManager != null) {
            return screenProtectManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("screenProtectManager");
        return null;
    }

    public final void setScreenProtectManager(ScreenProtectManager screenProtectManager) {
        Intrinsics.checkNotNullParameter(screenProtectManager, "<set-?>");
        this.screenProtectManager = screenProtectManager;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, UpdatePasswordFragment.INSTANCE.newInstance());
        }
        ScreenProtectManager screenProtectManager = getScreenProtectManager();
        screenProtectManager.blockScreenSharing(this, ScreenProtectFlow.UPDATE_PASSWORD);
        screenProtectManager.setFlagSecure(this);
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_create_challenge_error) {
            finish();
        }
    }

    @Override // com.robinhood.shared.update.password.UpdatePasswordFragment.Callbacks
    public void onUpdatePasswordSuccess() {
        replaceFragment(UpdatePasswordSuccessFragment.INSTANCE.newInstance());
    }

    @Override // com.robinhood.shared.update.password.UpdatePasswordFragment.Callbacks
    public void onForgotPassword() {
        replaceFragment(ResetPasswordFragment.INSTANCE.newInstance());
    }

    @Override // com.robinhood.shared.update.password.UpdatePasswordSuccessFragment.Callbacks
    public void onUpdatePasswordComplete() {
        finish();
    }

    @Override // com.robinhood.shared.update.password.reset.ResetPasswordFragment.Callbacks
    public void onEmailSent() {
        replaceFragment(CheckEmailFragment.INSTANCE.newInstance());
    }

    @Override // com.robinhood.shared.update.password.reset.ResetPasswordFragment.Callbacks
    public void onUpdateEmail() {
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new EmailVerificationSettingIntentKey(null, 1, null), null, false, null, null, 60, null);
    }

    /* compiled from: UpdatePasswordActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/update/password/UpdatePasswordActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/shared/update/password/UpdatePasswordActivity;", "Lcom/robinhood/shared/security/contracts/UpdatePasswordIntentKey;", "<init>", "()V", "feature-update-password_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<UpdatePasswordActivity, UpdatePasswordIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public UpdatePasswordIntentKey getExtras(UpdatePasswordActivity updatePasswordActivity) {
            return (UpdatePasswordIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, updatePasswordActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, UpdatePasswordIntentKey updatePasswordIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, updatePasswordIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, UpdatePasswordIntentKey updatePasswordIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, updatePasswordIntentKey);
        }
    }
}
