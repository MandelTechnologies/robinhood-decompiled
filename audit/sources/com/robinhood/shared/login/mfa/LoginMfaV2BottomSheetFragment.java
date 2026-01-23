package com.robinhood.shared.login.mfa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.BaseBottomSheetDialogFragments;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.login.LoginStatus;
import com.robinhood.shared.lib.challenge.C39076R;
import com.robinhood.shared.login.C39089R;
import com.robinhood.shared.login.databinding.FragmentLoginMfaV2BottomSheetBinding;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: LoginMfaV2BottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0004\u0015\u0016\u0017\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/login/mfa/LoginMfaV2BottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "binding", "Lcom/robinhood/shared/login/databinding/FragmentLoginMfaV2BottomSheetBinding;", "getBinding", "()Lcom/robinhood/shared/login/databinding/FragmentLoginMfaV2BottomSheetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/shared/login/mfa/LoginMfaV2BottomSheetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/login/mfa/LoginMfaV2BottomSheetFragment$Callbacks;", "callbacks$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Callbacks", "Args", "LoginMfaV2HelpBottomSheetViewState", "Companion", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class LoginMfaV2BottomSheetFragment extends BaseBottomSheetDialogFragment {
    public static final String TAG = "loginMfaV2BottomSheet";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(LoginMfaV2BottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/shared/login/databinding/FragmentLoginMfaV2BottomSheetBinding;", 0)), Reflection.property1(new PropertyReference1Impl(LoginMfaV2BottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/login/mfa/LoginMfaV2BottomSheetFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: LoginMfaV2BottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/login/mfa/LoginMfaV2BottomSheetFragment$Callbacks;", "", "onContactSupportClicked", "", "resendCode", "useBackupCode", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContactSupportClicked();

        void resendCode();

        void useBackupCode();
    }

    public LoginMfaV2BottomSheetFragment() {
        super(C39089R.layout.fragment_login_mfa_v2_bottom_sheet);
        this.binding = ViewBinding5.viewBinding(this, LoginMfaV2BottomSheetFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.login.mfa.LoginMfaV2BottomSheetFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    private final FragmentLoginMfaV2BottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentLoginMfaV2BottomSheetBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LinearLayout challengeVerificationHelpBottomSheetContainer = getBinding().challengeVerificationHelpBottomSheetContainer;
        Intrinsics.checkNotNullExpressionValue(challengeVerificationHelpBottomSheetContainer, "challengeVerificationHelpBottomSheetContainer");
        BaseBottomSheetDialogFragments.enforceMaxHeight$default(this, challengeVerificationHelpBottomSheetContainer, 0.0f, 2, null);
        RdsButton challengeVerificationHelpDismiss = getBinding().challengeVerificationHelpDismiss;
        Intrinsics.checkNotNullExpressionValue(challengeVerificationHelpDismiss, "challengeVerificationHelpDismiss");
        OnClickListeners.onClick(challengeVerificationHelpDismiss, new C391411(this));
        RdsRowView challengeVerificationHelpResendCode = getBinding().challengeVerificationHelpResendCode;
        Intrinsics.checkNotNullExpressionValue(challengeVerificationHelpResendCode, "challengeVerificationHelpResendCode");
        OnClickListeners.onClick(challengeVerificationHelpResendCode, new Function0() { // from class: com.robinhood.shared.login.mfa.LoginMfaV2BottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LoginMfaV2BottomSheetFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        RdsRowView challengeVerificationHelpUseBackupCode = getBinding().challengeVerificationHelpUseBackupCode;
        Intrinsics.checkNotNullExpressionValue(challengeVerificationHelpUseBackupCode, "challengeVerificationHelpUseBackupCode");
        OnClickListeners.onClick(challengeVerificationHelpUseBackupCode, new Function0() { // from class: com.robinhood.shared.login.mfa.LoginMfaV2BottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LoginMfaV2BottomSheetFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        RdsRowView challengeVerificationHelpSelfServiceRecovery = getBinding().challengeVerificationHelpSelfServiceRecovery;
        Intrinsics.checkNotNullExpressionValue(challengeVerificationHelpSelfServiceRecovery, "challengeVerificationHelpSelfServiceRecovery");
        OnClickListeners.onClick(challengeVerificationHelpSelfServiceRecovery, new Function0() { // from class: com.robinhood.shared.login.mfa.LoginMfaV2BottomSheetFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LoginMfaV2BottomSheetFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
        LoginMfaV2HelpBottomSheetViewState loginMfaV2HelpBottomSheetViewState = new LoginMfaV2HelpBottomSheetViewState(((Args) INSTANCE.getArgs((Fragment) this)).getLoginStatus());
        RdsRowView challengeVerificationHelpResendCode2 = getBinding().challengeVerificationHelpResendCode;
        Intrinsics.checkNotNullExpressionValue(challengeVerificationHelpResendCode2, "challengeVerificationHelpResendCode");
        challengeVerificationHelpResendCode2.setVisibility(loginMfaV2HelpBottomSheetViewState.isResendCodeButtonVisible() ? 0 : 8);
        getBinding().challengeVerificationHelpBottomSheetSubtitle.setText(loginMfaV2HelpBottomSheetViewState.getSubtitle());
        getBinding().challengeVerificationHelpSelfServiceRecovery.setPrimaryText(getResources().getString(loginMfaV2HelpBottomSheetViewState.getChallengeVerificationHelpSelfServiceRecoveryText()));
        getBinding().challengeVerificationHelpBottomSheetTitle.setText(loginMfaV2HelpBottomSheetViewState.getChallengeVerificationTitleText());
        getBinding().challengeVerificationHelpUseBackupCode.setPrimaryText(getResources().getString(loginMfaV2HelpBottomSheetViewState.getUseBackupCodeText()));
        getBinding().challengeVerificationHelpDismiss.setText(loginMfaV2HelpBottomSheetViewState.getDismissButtonText());
    }

    /* compiled from: LoginMfaV2BottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.login.mfa.LoginMfaV2BottomSheetFragment$onViewCreated$1 */
    /* synthetic */ class C391411 extends FunctionReferenceImpl implements Function0<Unit> {
        C391411(Object obj) {
            super(0, obj, LoginMfaV2BottomSheetFragment.class, "dismiss", "dismiss()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((LoginMfaV2BottomSheetFragment) this.receiver).dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(LoginMfaV2BottomSheetFragment loginMfaV2BottomSheetFragment) {
        loginMfaV2BottomSheetFragment.getCallbacks().resendCode();
        loginMfaV2BottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(LoginMfaV2BottomSheetFragment loginMfaV2BottomSheetFragment) {
        loginMfaV2BottomSheetFragment.getCallbacks().useBackupCode();
        loginMfaV2BottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(LoginMfaV2BottomSheetFragment loginMfaV2BottomSheetFragment) {
        loginMfaV2BottomSheetFragment.getCallbacks().onContactSupportClicked();
        loginMfaV2BottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: LoginMfaV2BottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/login/mfa/LoginMfaV2BottomSheetFragment$Args;", "Landroid/os/Parcelable;", "loginStatus", "Lcom/robinhood/login/LoginStatus;", "<init>", "(Lcom/robinhood/login/LoginStatus;)V", "getLoginStatus", "()Lcom/robinhood/login/LoginStatus;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final LoginStatus loginStatus;

        /* compiled from: LoginMfaV2BottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((LoginStatus) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, LoginStatus loginStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                loginStatus = args.loginStatus;
            }
            return args.copy(loginStatus);
        }

        /* renamed from: component1, reason: from getter */
        public final LoginStatus getLoginStatus() {
            return this.loginStatus;
        }

        public final Args copy(LoginStatus loginStatus) {
            Intrinsics.checkNotNullParameter(loginStatus, "loginStatus");
            return new Args(loginStatus);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.loginStatus, ((Args) other).loginStatus);
        }

        public int hashCode() {
            return this.loginStatus.hashCode();
        }

        public String toString() {
            return "Args(loginStatus=" + this.loginStatus + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.loginStatus, flags);
        }

        public Args(LoginStatus loginStatus) {
            Intrinsics.checkNotNullParameter(loginStatus, "loginStatus");
            this.loginStatus = loginStatus;
        }

        public final LoginStatus getLoginStatus() {
            return this.loginStatus;
        }
    }

    /* compiled from: LoginMfaV2BottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u00020\u00078G¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0013\u0010\u000e\u001a\u00020\u00078G¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0013\u0010\u0010\u001a\u00020\u00078G¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/login/mfa/LoginMfaV2BottomSheetFragment$LoginMfaV2HelpBottomSheetViewState;", "", "loginStatus", "Lcom/robinhood/login/LoginStatus;", "<init>", "(Lcom/robinhood/login/LoginStatus;)V", "challengeVerificationTitleText", "", "getChallengeVerificationTitleText", "()I", "challengeVerificationHelpSelfServiceRecoveryText", "getChallengeVerificationHelpSelfServiceRecoveryText", "subtitle", "getSubtitle", "useBackupCodeText", "getUseBackupCodeText", "dismissButtonText", "getDismissButtonText", "isResendCodeButtonVisible", "", "()Z", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class LoginMfaV2HelpBottomSheetViewState {
        private final int challengeVerificationTitleText;
        private final int dismissButtonText;
        private final LoginStatus loginStatus;
        private final int useBackupCodeText;

        public LoginMfaV2HelpBottomSheetViewState(LoginStatus loginStatus) {
            Intrinsics.checkNotNullParameter(loginStatus, "loginStatus");
            this.loginStatus = loginStatus;
            this.challengeVerificationTitleText = C39076R.string.uar_challenge_verification_help_bottom_sheet_title;
            this.useBackupCodeText = C39076R.string.uar_challenge_verification_help_use_backup_code;
            this.dismissButtonText = C11048R.string.general_label_cancel;
        }

        public final int getChallengeVerificationTitleText() {
            return this.challengeVerificationTitleText;
        }

        public final int getChallengeVerificationHelpSelfServiceRecoveryText() {
            LoginStatus loginStatus = this.loginStatus;
            if (loginStatus instanceof LoginStatus.MfaRequired.Sms) {
                return C39076R.string.challenge_verification_help_update_phone_number;
            }
            if (loginStatus instanceof LoginStatus.MfaRequired.App) {
                return C39076R.string.challenge_verification_help_update_authenticator_app;
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(loginStatus);
            throw new ExceptionsH();
        }

        public final int getSubtitle() {
            LoginStatus loginStatus = this.loginStatus;
            if (loginStatus instanceof LoginStatus.MfaRequired.Sms) {
                return C39076R.string.uar_challenge_verification_help_bottom_sheet_sms_subtitle;
            }
            if (loginStatus instanceof LoginStatus.MfaRequired.App) {
                return C39076R.string.uar_challenge_verification_help_bottom_sheet_auth_subtitle;
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(loginStatus);
            throw new ExceptionsH();
        }

        public final int getUseBackupCodeText() {
            return this.useBackupCodeText;
        }

        public final int getDismissButtonText() {
            return this.dismissButtonText;
        }

        public final boolean isResendCodeButtonVisible() {
            LoginStatus loginStatus = this.loginStatus;
            if (loginStatus instanceof LoginStatus.MfaRequired.Sms) {
                return true;
            }
            if (loginStatus instanceof LoginStatus.MfaRequired.App) {
                return false;
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(loginStatus);
            throw new ExceptionsH();
        }
    }

    /* compiled from: LoginMfaV2BottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/login/mfa/LoginMfaV2BottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/login/mfa/LoginMfaV2BottomSheetFragment;", "Lcom/robinhood/shared/login/mfa/LoginMfaV2BottomSheetFragment$Args;", "<init>", "()V", "TAG", "", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<LoginMfaV2BottomSheetFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(LoginMfaV2BottomSheetFragment loginMfaV2BottomSheetFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, loginMfaV2BottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public LoginMfaV2BottomSheetFragment newInstance(Args args) {
            return (LoginMfaV2BottomSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(LoginMfaV2BottomSheetFragment loginMfaV2BottomSheetFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, loginMfaV2BottomSheetFragment, args);
        }
    }
}
