package com.robinhood.android.verification.email;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.FrameLayout;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.databinding.ActivityFragmentContainerBinding;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.verification.C31368R;
import com.robinhood.android.verification.email.EmailConfirmationFragment;
import com.robinhood.android.verification.email.EmailExceededNumberOfAttemptsFragment;
import com.robinhood.android.verification.email.EmailInitialLoadingFragment;
import com.robinhood.android.verification.email.EmailLinkSentFragment;
import com.robinhood.android.verification.email.EmailUpdateFragment;
import com.robinhood.android.verification.email.EmailVerifySuccessFragment;
import com.robinhood.security.screenprotect.ScreenProtectFlow;
import com.robinhood.security.screenprotect.ScreenProtectManager;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.shared.support.contracts.ContactSupportFragmentKey;
import com.robinhood.shared.user.contracts.verification.EmailVerificationSettingIntentKey;
import com.robinhood.shared.user.contracts.verification.EmailVerificationSettingIntentKey2;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SettingEmailVerificationActivity.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u00019B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020#H\u0016J\b\u0010(\u001a\u00020\u001eH\u0016J\u0010\u0010)\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020#H\u0016J\b\u0010,\u001a\u00020\u001eH\u0016J\b\u0010-\u001a\u00020\u001eH\u0016J\b\u0010.\u001a\u00020\u001eH\u0016J\b\u0010/\u001a\u00020\u001eH\u0016J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020\u001eH\u0014J\u0010\u00106\u001a\u00020\u001e2\u0006\u00107\u001a\u000208H\u0016R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u0014\u00103\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/verification/email/SettingEmailVerificationActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/verification/email/EmailInitialLoadingFragment$Callbacks;", "Lcom/robinhood/android/verification/email/EmailConfirmationFragment$Callbacks;", "Lcom/robinhood/android/verification/email/EmailLinkSentFragment$Callbacks;", "Lcom/robinhood/android/verification/email/EmailVerifySuccessFragment$Callbacks;", "Lcom/robinhood/android/verification/email/EmailUpdateFragment$Callbacks;", "Lcom/robinhood/android/verification/email/EmailExceededNumberOfAttemptsFragment$Callbacks;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "<init>", "()V", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "getUserStore", "()Lcom/robinhood/shared/store/user/UserStore;", "setUserStore", "(Lcom/robinhood/shared/store/user/UserStore;)V", "screenProtectManager", "Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "getScreenProtectManager", "()Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "setScreenProtectManager", "(Lcom/robinhood/security/screenprotect/ScreenProtectManager;)V", "bindings", "Lcom/robinhood/android/common/databinding/ActivityFragmentContainerBinding;", "getBindings", "()Lcom/robinhood/android/common/databinding/ActivityFragmentContainerBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onInitialLoadingFinished", "userEmail", "", "verificationType", "Lcom/robinhood/android/verification/email/EmailVerificationType;", "onEmailConfirmed", "email", "onEmailConfirmationLearnMoreClick", "onChangeEmailClicked", "onEmailUpdateFinished", "newEmail", "onEmailVerified", "onEmailVerifySuccessDone", "handleTooManyRequests", "onEmailExceededNumberOfAttemptsPrimaryCtaClicked", "onEmailExceededNumberOfAttemptsBackPressed", "", "onDestroy", "screenDescription", "getScreenDescription", "()Ljava/lang/String;", "onDialogDismissed", "id", "", "Companion", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class SettingEmailVerificationActivity extends BaseActivity implements EmailInitialLoadingFragment.Callbacks, EmailConfirmationFragment.Callbacks, EmailLinkSentFragment.Callbacks, EmailVerifySuccessFragment.Callbacks, EmailUpdateFragment.Callbacks, EmailExceededNumberOfAttemptsFragment.Callbacks, RhDialogFragment.OnDismissListener {

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;
    public ScreenProtectManager screenProtectManager;
    public UserStore userStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SettingEmailVerificationActivity.class, "bindings", "getBindings()Lcom/robinhood/android/common/databinding/ActivityFragmentContainerBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SettingEmailVerificationActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmailVerificationType.values().length];
            try {
                iArr[EmailVerificationType.VERIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EmailVerificationType.REVERIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SettingEmailVerificationActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.bindings = ViewBinding5.viewBinding(this, SettingEmailVerificationActivity2.INSTANCE);
    }

    public final UserStore getUserStore() {
        UserStore userStore = this.userStore;
        if (userStore != null) {
            return userStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userStore");
        return null;
    }

    public final void setUserStore(UserStore userStore) {
        Intrinsics.checkNotNullParameter(userStore, "<set-?>");
        this.userStore = userStore;
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

    private final ActivityFragmentContainerBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ActivityFragmentContainerBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout root = getBindings().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ApplyWindowInsets.m26663applyWindowInsetsAsMarginqNU9l24(root, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, EmailInitialLoadingFragment.INSTANCE.newInstance());
        }
        ScreenProtectManager screenProtectManager = getScreenProtectManager();
        screenProtectManager.blockScreenSharing(this, ScreenProtectFlow.UPDATE_EMAIL);
        screenProtectManager.setFlagSecure(this);
    }

    @Override // com.robinhood.android.verification.email.EmailInitialLoadingFragment.Callbacks
    public void onInitialLoadingFinished(String userEmail, EmailVerificationType verificationType) {
        Intrinsics.checkNotNullParameter(userEmail, "userEmail");
        Intrinsics.checkNotNullParameter(verificationType, "verificationType");
        int i = WhenMappings.$EnumSwitchMapping$0[verificationType.ordinal()];
        if (i == 1) {
            replaceFragmentWithoutAnimation(EmailConfirmationFragment.INSTANCE.newInstance((Parcelable) new EmailConfirmationFragment.Args(userEmail, verificationType)));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            replaceFragmentWithoutAnimation(EmailUpdateFragment.INSTANCE.newInstance((Parcelable) new EmailUpdateFragment.Args(verificationType)));
        }
    }

    @Override // com.robinhood.android.verification.email.EmailConfirmationFragment.Callbacks
    public void onEmailConfirmed(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        replaceFragment(EmailLinkSentFragment.INSTANCE.newInstance((Parcelable) new EmailLinkSentFragment.Args(email)));
    }

    @Override // com.robinhood.android.verification.email.EmailConfirmationFragment.Callbacks
    public void onEmailConfirmationLearnMoreClick() {
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, LegacyIntentKey.EmailValueProp.INSTANCE, null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.verification.email.EmailConfirmationFragment.Callbacks
    public void onChangeEmailClicked(EmailVerificationType verificationType) {
        Intrinsics.checkNotNullParameter(verificationType, "verificationType");
        replaceFragment(EmailUpdateFragment.INSTANCE.newInstance((Parcelable) new EmailUpdateFragment.Args(verificationType)));
    }

    @Override // com.robinhood.android.verification.email.EmailUpdateFragment.Callbacks
    public void onEmailUpdateFinished(String newEmail) {
        Intrinsics.checkNotNullParameter(newEmail, "newEmail");
        replaceFragment(EmailLinkSentFragment.INSTANCE.newInstance((Parcelable) new EmailLinkSentFragment.Args(newEmail)));
    }

    @Override // com.robinhood.android.verification.email.EmailLinkSentFragment.Callbacks
    public void onEmailVerified() {
        if (((EmailVerificationSettingIntentKey) INSTANCE.getExtras((Activity) this)).getSource() == EmailVerificationSettingIntentKey2.REACTIVATION) {
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(getNavigator(), this, new ContactSupportFragmentKey.TriageFlow(null, "36", null, null, null, 29, null), false, false, false, false, null, false, null, null, 1020, null);
            setResult(-1);
            finish();
            return;
        }
        replaceFragment(EmailVerifySuccessFragment.INSTANCE.newInstance());
    }

    @Override // com.robinhood.android.verification.email.EmailVerifySuccessFragment.Callbacks
    public void onEmailVerifySuccessDone() {
        setResult(-1);
        finish();
    }

    @Override // com.robinhood.android.verification.email.BaseEmailVerificationFragment.BaseCallbacks
    public void handleTooManyRequests() {
        replaceFragment(EmailExceededNumberOfAttemptsFragment.INSTANCE.newInstance((Parcelable) new EmailExceededNumberOfAttemptsFragment.Args(C31368R.string.email_exceeded_number_of_attempts_got_it)));
    }

    @Override // com.robinhood.android.verification.email.EmailExceededNumberOfAttemptsFragment.Callbacks
    public void onEmailExceededNumberOfAttemptsPrimaryCtaClicked() {
        setResult(0);
        finish();
    }

    @Override // com.robinhood.android.verification.email.EmailExceededNumberOfAttemptsFragment.Callbacks
    public boolean onEmailExceededNumberOfAttemptsBackPressed() {
        setResult(0);
        finish();
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        getUserStore().refresh(true);
        super.onDestroy();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return "update_account";
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_create_challenge_error) {
            setResult(0);
            finish();
        }
    }

    /* compiled from: SettingEmailVerificationActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/verification/email/SettingEmailVerificationActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/verification/email/SettingEmailVerificationActivity;", "Lcom/robinhood/shared/user/contracts/verification/EmailVerificationSettingIntentKey;", "<init>", "()V", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<SettingEmailVerificationActivity, EmailVerificationSettingIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public EmailVerificationSettingIntentKey getExtras(SettingEmailVerificationActivity settingEmailVerificationActivity) {
            return (EmailVerificationSettingIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, settingEmailVerificationActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, EmailVerificationSettingIntentKey emailVerificationSettingIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, emailVerificationSettingIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, EmailVerificationSettingIntentKey emailVerificationSettingIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, emailVerificationSettingIntentKey);
        }
    }
}
