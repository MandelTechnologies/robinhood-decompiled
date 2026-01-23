package com.robinhood.android.securitycenter.p251ui.mfa;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.os.Bundle2;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.security.contracts.MfaSettingsFragmentKey;
import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.android.securitycenter.p251ui.mfa.MfaSettingsFragment;
import com.robinhood.android.securitycenter.p251ui.mfa.app.MfaAuthAppKeyFragment;
import com.robinhood.android.securitycenter.p251ui.mfa.app.MfaAuthAppSelectionFragment;
import com.robinhood.android.securitycenter.p251ui.mfa.app.MfaAuthAppVerifyFragment;
import com.robinhood.android.securitycenter.p251ui.mfa.prompts.MfaPromptsEnrollmentFragment;
import com.robinhood.android.securitycenter.p251ui.mfa.sms.MfaSmsVerifyFragment;
import com.robinhood.android.settings.MfaSettingsConstants;
import com.robinhood.android.util.play.GooglePlay;
import com.robinhood.models.api.Challenge;
import com.robinhood.security.screenprotect.ScreenProtectFlow;
import com.robinhood.security.screenprotect.ScreenProtectManager;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: MfaSettingsParentFragment.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 V2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0002UVB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010:\u001a\u000207H\u0016J\b\u0010;\u001a\u000207H\u0016J\b\u0010<\u001a\u000207H\u0002J\b\u0010=\u001a\u000207H\u0016J\b\u0010>\u001a\u000207H\u0016J\b\u0010?\u001a\u000207H\u0016J\b\u0010@\u001a\u000207H\u0016J\b\u0010A\u001a\u000207H\u0016J\b\u0010B\u001a\u000207H\u0016J\u0010\u0010C\u001a\u0002072\u0006\u0010D\u001a\u000203H\u0016J\u0010\u0010E\u001a\u0002072\u0006\u0010D\u001a\u000203H\u0002J\b\u0010F\u001a\u000207H\u0016J\u001a\u0010G\u001a\u0002032\u0006\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u000109H\u0016J\u001a\u0010K\u001a\u0002032\u0006\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u000109H\u0016J\u0010\u0010L\u001a\u0002072\u0006\u0010H\u001a\u00020IH\u0016J\b\u0010M\u001a\u000203H\u0016J\u0010\u0010N\u001a\u0002072\u0006\u0010O\u001a\u00020PH\u0002J\u0012\u0010Q\u001a\u0002072\b\u0010R\u001a\u0004\u0018\u00010!H\u0002J\b\u0010S\u001a\u000207H\u0002J\b\u0010T\u001a\u000207H\u0002R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001b\u0010\u0018R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b\u001e\u0010\u0018R\u001d\u0010 \u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u000f\u001a\u0004\b\"\u0010#R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R/\u0010,\u001a\u0004\u0018\u00010\u00112\b\u0010+\u001a\u0004\u0018\u00010\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010/R\u0014\u00102\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006W"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsFragment$Callbacks;", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppSelectionFragment$Callbacks;", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppKeyFragment$Callbacks;", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyFragment$Callbacks;", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyFragment$Callbacks;", "Lcom/robinhood/android/securitycenter/ui/mfa/prompts/MfaPromptsEnrollmentFragment$Callbacks;", "<init>", "()V", "launchType", "Lcom/robinhood/android/security/contracts/MfaSettingsFragmentKey$LaunchType;", "getLaunchType", "()Lcom/robinhood/android/security/contracts/MfaSettingsFragmentKey$LaunchType;", "launchType$delegate", "Lkotlin/Lazy;", "launchTypeChallengeId", "Ljava/util/UUID;", "getLaunchTypeChallengeId", "()Ljava/util/UUID;", "launchTypeChallengeId$delegate", "launchTotpToken", "", "getLaunchTotpToken", "()Ljava/lang/String;", "launchTotpToken$delegate", "launchEnrollmentToken", "getLaunchEnrollmentToken", "launchEnrollmentToken$delegate", "launchPhoneNumber", "getLaunchPhoneNumber", "launchPhoneNumber$delegate", "flowId", "Lcom/robinhood/models/api/Challenge$Flow;", "getFlowId", "()Lcom/robinhood/models/api/Challenge$Flow;", "flowId$delegate", "screenProtectManager", "Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "getScreenProtectManager", "()Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "setScreenProtectManager", "(Lcom/robinhood/security/screenprotect/ScreenProtectManager;)V", "<set-?>", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "getChallengeId", "setChallengeId", "(Ljava/util/UUID;)V", "challengeId$delegate", "Lkotlin/properties/ReadWriteProperty;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "launchSettings", "onMfaMethodSmsSelected", "onMfaMethodAuthAppSelected", "onMfaMethodPromptsSelected", "onMfaAuthAppTypeAppSelected", "onMfaAuthAppTypeOtherSelected", "onAuthAppKeyContinue", "onFinishMfaFlow", "hasCompletedSetup", "setFragmentResult", "onErrorDialogDismissed", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onNegativeButtonClicked", "onDialogDismissed", "onBackPressed", "startMfaEnrollment", "enrollmentType", "Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsParentFragment$MfaEnrollmentType;", "startAppEnrollmentFlow", "challengeFlow", "startSmsEnrollmentFlow", "startPromptsEnrollmentFlow", "MfaEnrollmentType", "Companion", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class MfaSettingsParentFragment extends BaseFragment implements MfaSettingsFragment.Callbacks, MfaAuthAppSelectionFragment.Callbacks, MfaAuthAppKeyFragment.Callbacks, MfaAuthAppVerifyFragment.Callbacks, MfaSmsVerifyFragment.Callbacks, MfaPromptsEnrollmentFragment.Callbacks {
    private static final String EXTRA_CHALLENGE_ID = "extraChallengeId";
    private static final String EXTRA_ENROLLMENT_TOKEN = "extraEnrollmentToken";
    private static final String EXTRA_FLOW_ID = "extraFlowId";
    private static final String EXTRA_LAUNCH_TYPE = "extraLaunchType";
    private static final String EXTRA_PHONE_NUMBER = "extraPhoneNumber";
    private static final String EXTRA_TOTP_TOKEN = "extraTotpToken";
    private static final String TAG_NO_AUTH_APP = "noAuthAppErrorDialog";
    private static final String TAG_RECOVERY_SUCCESS = "recoverySuccessDialog";

    /* renamed from: challengeId$delegate, reason: from kotlin metadata */
    private final Interfaces3 challengeId;

    /* renamed from: flowId$delegate, reason: from kotlin metadata */
    private final Lazy flowId;

    /* renamed from: launchEnrollmentToken$delegate, reason: from kotlin metadata */
    private final Lazy launchEnrollmentToken;

    /* renamed from: launchPhoneNumber$delegate, reason: from kotlin metadata */
    private final Lazy launchPhoneNumber;

    /* renamed from: launchTotpToken$delegate, reason: from kotlin metadata */
    private final Lazy launchTotpToken;

    /* renamed from: launchType$delegate, reason: from kotlin metadata */
    private final Lazy launchType;

    /* renamed from: launchTypeChallengeId$delegate, reason: from kotlin metadata */
    private final Lazy launchTypeChallengeId;
    public ScreenProtectManager screenProtectManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(MfaSettingsParentFragment.class, ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "getChallengeId()Ljava/util/UUID;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MfaSettingsParentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MfaSettingsFragmentKey.LaunchType.values().length];
            try {
                iArr[MfaSettingsFragmentKey.LaunchType.VERIFY_AUTH_APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MfaSettingsFragmentKey.LaunchType.VERIFY_SMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MfaSettingsFragmentKey.LaunchType.CRYPTO_AUTH_APP_ENROLL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MfaSettingsFragmentKey.LaunchType.CRYPTO_PROMPTS_ENROLL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MfaEnrollmentType.values().length];
            try {
                iArr2[MfaEnrollmentType.SMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MfaEnrollmentType.AUTH_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[MfaEnrollmentType.PROMPTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    public MfaSettingsParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.launchType = Fragments2.argument(this, EXTRA_LAUNCH_TYPE);
        this.launchTypeChallengeId = Fragments2.argument(this, EXTRA_CHALLENGE_ID);
        this.launchTotpToken = Fragments2.argument(this, EXTRA_TOTP_TOKEN);
        this.launchEnrollmentToken = Fragments2.argument(this, EXTRA_ENROLLMENT_TOKEN);
        this.launchPhoneNumber = Fragments2.argument(this, EXTRA_PHONE_NUMBER);
        this.flowId = Fragments2.argument(this, EXTRA_FLOW_ID);
        this.challengeId = (Interfaces3) BindSavedState2.savedSerializable(this).provideDelegate(this, $$delegatedProperties[0]);
    }

    private final MfaSettingsFragmentKey.LaunchType getLaunchType() {
        return (MfaSettingsFragmentKey.LaunchType) this.launchType.getValue();
    }

    private final UUID getLaunchTypeChallengeId() {
        return (UUID) this.launchTypeChallengeId.getValue();
    }

    private final String getLaunchTotpToken() {
        return (String) this.launchTotpToken.getValue();
    }

    private final String getLaunchEnrollmentToken() {
        return (String) this.launchEnrollmentToken.getValue();
    }

    private final String getLaunchPhoneNumber() {
        return (String) this.launchPhoneNumber.getValue();
    }

    private final Challenge.Flow getFlowId() {
        return (Challenge.Flow) this.flowId.getValue();
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

    private final UUID getChallengeId() {
        return (UUID) this.challengeId.getValue(this, $$delegatedProperties[0]);
    }

    private final void setChallengeId(UUID uuid) {
        this.challengeId.setValue(this, $$delegatedProperties[0], uuid);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            launchSettings();
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ScreenProtectManager screenProtectManager = getScreenProtectManager();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        screenProtectManager.blockScreenSharing(contextRequireContext, ScreenProtectFlow.MFA_SETTINGS);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        screenProtectManager.setFlagSecure(fragmentActivityRequireActivity);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        ScreenProtectManager screenProtectManager = getScreenProtectManager();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        screenProtectManager.clearFlagSecure(fragmentActivityRequireActivity);
    }

    private final void launchSettings() {
        setChallengeId(getLaunchTypeChallengeId());
        int i = WhenMappings.$EnumSwitchMapping$0[getLaunchType().ordinal()];
        if (i == 1) {
            setFragment(C11048R.id.fragment_container, MfaAuthAppSelectionFragment.INSTANCE.newInstance((Parcelable) new MfaAuthAppSelectionFragment.Args(getFlowId())));
            return;
        }
        if (i == 2) {
            setFragment(C11048R.id.fragment_container, MfaSmsVerifyFragment.INSTANCE.newInstance((Parcelable) new MfaSmsVerifyFragment.Args(getChallengeId(), getLaunchEnrollmentToken(), getFlowId(), getLaunchPhoneNumber())));
            return;
        }
        if (i == 3) {
            startMfaEnrollment(MfaEnrollmentType.AUTH_APP);
        } else if (i == 4) {
            startMfaEnrollment(MfaEnrollmentType.PROMPTS);
        } else {
            setFragment(C11048R.id.fragment_container, MfaSettingsFragment.INSTANCE.newInstance());
        }
    }

    @Override // com.robinhood.android.securitycenter.ui.mfa.MfaSettingsFragment.Callbacks
    public void onMfaMethodSmsSelected() {
        startMfaEnrollment(MfaEnrollmentType.SMS);
    }

    @Override // com.robinhood.android.securitycenter.ui.mfa.MfaSettingsFragment.Callbacks
    public void onMfaMethodAuthAppSelected() {
        startMfaEnrollment(MfaEnrollmentType.AUTH_APP);
    }

    @Override // com.robinhood.android.securitycenter.ui.mfa.MfaSettingsFragment.Callbacks
    public void onMfaMethodPromptsSelected() {
        startMfaEnrollment(MfaEnrollmentType.PROMPTS);
    }

    @Override // com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppSelectionFragment.Callbacks
    public void onMfaAuthAppTypeAppSelected() {
        List<ResolveInfo> listQueryIntentActivities = requireActivity().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(getString(C28186R.string.url_auth_app_deeplink))), 65536);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
        if (!listQueryIntentActivities.isEmpty()) {
            replaceFragment(MfaAuthAppVerifyFragment.INSTANCE.newInstance((Parcelable) new MfaAuthAppVerifyFragment.Args(true, getChallengeId(), getLaunchTotpToken(), getLaunchEnrollmentToken(), getFlowId())));
            return;
        }
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder negativeButton = companion.create(contextRequireContext).setId(C28186R.id.dialog_id_settings_mfa_no_auth_app).setUseDesignSystemOverlay(true).setTitle(C28186R.string.setting_mfa_auth_app_no_app_dialog_title, new Object[0]).setMessage(C28186R.string.setting_mfa_auth_app_no_app_dialog_message, new Object[0]).setPositiveButton(C28186R.string.setting_mfa_auth_app_no_app_dialog_positive_label, new Object[0]).setNegativeButton(C28186R.string.setting_mfa_auth_app_no_app_dialog_negative_label, new Object[0]);
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(negativeButton, supportFragmentManager, TAG_NO_AUTH_APP, false, 4, null);
    }

    @Override // com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppSelectionFragment.Callbacks
    public void onMfaAuthAppTypeOtherSelected() {
        replaceFragment(MfaAuthAppKeyFragment.INSTANCE.newInstance((Parcelable) new MfaAuthAppKeyFragment.Args(getChallengeId(), getLaunchTotpToken())));
    }

    @Override // com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyFragment.Callbacks
    public void onAuthAppKeyContinue() {
        replaceFragment(MfaAuthAppVerifyFragment.INSTANCE.newInstance((Parcelable) new MfaAuthAppVerifyFragment.Args(false, getChallengeId(), null, getLaunchEnrollmentToken(), getFlowId(), 4, null)));
    }

    @Override // com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyFragment.Callbacks, com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyFragment.Callbacks, com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyFragment.Callbacks, com.robinhood.android.securitycenter.ui.mfa.prompts.MfaPromptsEnrollmentFragment.Callbacks
    public void onFinishMfaFlow(boolean hasCompletedSetup) {
        if (getFlowId() == Challenge.Flow.UNVERIFIED_ACCOUNT_RECOVERY_APP_MFA) {
            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setId(C28186R.id.dialog_id_settings_mfa_recovery_success).setTitle(C28186R.string.setting_mfa_auth_app_recovery_success_title, new Object[0]).setMessage(C28186R.string.setting_mfa_auth_app_recovery_success_message, new Object[0]).setPositiveButton(C11048R.string.general_label_ok, new Object[0]);
            FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, TAG_RECOVERY_SUCCESS, false, 4, null);
            return;
        }
        setFragmentResult(hasCompletedSetup);
        if (getLaunchType() == MfaSettingsFragmentKey.LaunchType.DEFAULT) {
            BaseFragment.popEntireFragmentBackstack$default(this, false, 1, null);
        }
    }

    private final void setFragmentResult(boolean hasCompletedSetup) {
        getParentFragmentManager().setFragmentResult(MfaSettingsConstants.MFA_FRAGMENT_RESULT_REQUEST_KEY, Bundle2.bundleOf(Tuples4.m3642to(MfaSettingsConstants.CHALLENGE_VERIFICATION_RESULT_KEY, getChallengeId()), Tuples4.m3642to(MfaSettingsConstants.MFA_SETUP_LAUNCH_TYPE_RESULT_KEY, getLaunchType()), Tuples4.m3642to(MfaSettingsConstants.MFA_SETUP_COMPLETED_RESULT_KEY, Boolean.valueOf(hasCompletedSetup))));
    }

    @Override // com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyFragment.Callbacks, com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyFragment.Callbacks, com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyFragment.Callbacks
    public void onErrorDialogDismissed() {
        BaseFragment.popEntireFragmentBackstack$default(this, false, 1, null);
        if (getLaunchType() == MfaSettingsFragmentKey.LaunchType.VERIFY_SMS) {
            requireActivity().getOnBackPressedDispatcher().onBackPressed();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id != C28186R.id.dialog_id_settings_mfa_no_auth_app) {
            return super.onPositiveButtonClicked(id, passthroughArgs);
        }
        GooglePlay googlePlay = GooglePlay.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return googlePlay.launchStore(contextRequireContext);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C28186R.id.dialog_id_settings_mfa_no_auth_app) {
            replaceFragment(MfaAuthAppKeyFragment.INSTANCE.newInstance((Parcelable) new MfaAuthAppKeyFragment.Args(getChallengeId(), getLaunchTotpToken())));
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_create_challenge_error) {
            popLastFragment();
        } else if (id == C28186R.id.dialog_id_settings_mfa_recovery_success) {
            setFragmentResult(true);
        } else {
            super.onDialogDismissed(id);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (getLaunchType() == MfaSettingsFragmentKey.LaunchType.CRYPTO_AUTH_APP_ENROLL && getChildFragmentManager().getBackStackEntryCount() == 1) {
            onFinishMfaFlow(false);
            return true;
        }
        return super.onBackPressed();
    }

    private final void startMfaEnrollment(MfaEnrollmentType enrollmentType) {
        int i = WhenMappings.$EnumSwitchMapping$1[enrollmentType.ordinal()];
        if (i == 1) {
            startSmsEnrollmentFlow();
        } else if (i == 2) {
            startAppEnrollmentFlow(enrollmentType.getChallengeFlow());
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            startPromptsEnrollmentFlow();
        }
    }

    private final void startAppEnrollmentFlow(Challenge.Flow challengeFlow) {
        replaceFragment(MfaAuthAppSelectionFragment.INSTANCE.newInstance((Parcelable) new MfaAuthAppSelectionFragment.Args(challengeFlow)));
    }

    private final void startSmsEnrollmentFlow() {
        replaceFragment(MfaSmsVerifyFragment.INSTANCE.newInstance((Parcelable) new MfaSmsVerifyFragment.Args(getChallengeId(), null, null, null)));
    }

    private final void startPromptsEnrollmentFlow() {
        replaceFragment(MfaPromptsEnrollmentFragment.INSTANCE.newInstance((Parcelable) new MfaPromptsEnrollmentFragment.Args(getChallengeId(), getLaunchType() == MfaSettingsFragmentKey.LaunchType.CRYPTO_PROMPTS_ENROLL)));
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MfaSettingsParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsParentFragment$MfaEnrollmentType;", "", "challengeFlow", "Lcom/robinhood/models/api/Challenge$Flow;", "<init>", "(Ljava/lang/String;ILcom/robinhood/models/api/Challenge$Flow;)V", "getChallengeFlow", "()Lcom/robinhood/models/api/Challenge$Flow;", "SMS", "AUTH_APP", "PROMPTS", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class MfaEnrollmentType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MfaEnrollmentType[] $VALUES;
        public static final MfaEnrollmentType AUTH_APP;
        public static final MfaEnrollmentType PROMPTS;
        public static final MfaEnrollmentType SMS;
        private final Challenge.Flow challengeFlow;

        private static final /* synthetic */ MfaEnrollmentType[] $values() {
            return new MfaEnrollmentType[]{SMS, AUTH_APP, PROMPTS};
        }

        public static EnumEntries<MfaEnrollmentType> getEntries() {
            return $ENTRIES;
        }

        private MfaEnrollmentType(String str, int i, Challenge.Flow flow) {
            this.challengeFlow = flow;
        }

        public final Challenge.Flow getChallengeFlow() {
            return this.challengeFlow;
        }

        static {
            Challenge.Flow flow = Challenge.Flow.CHANGE_MFA;
            SMS = new MfaEnrollmentType("SMS", 0, flow);
            AUTH_APP = new MfaEnrollmentType("AUTH_APP", 1, flow);
            PROMPTS = new MfaEnrollmentType("PROMPTS", 2, flow);
            MfaEnrollmentType[] mfaEnrollmentTypeArr$values = $values();
            $VALUES = mfaEnrollmentTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(mfaEnrollmentTypeArr$values);
        }

        public static MfaEnrollmentType valueOf(String str) {
            return (MfaEnrollmentType) Enum.valueOf(MfaEnrollmentType.class, str);
        }

        public static MfaEnrollmentType[] values() {
            return (MfaEnrollmentType[]) $VALUES.clone();
        }
    }

    /* compiled from: MfaSettingsParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/security/contracts/MfaSettingsFragmentKey;", "<init>", "()V", "EXTRA_LAUNCH_TYPE", "", "EXTRA_CHALLENGE_ID", "EXTRA_TOTP_TOKEN", "EXTRA_ENROLLMENT_TOKEN", "EXTRA_PHONE_NUMBER", "EXTRA_FLOW_ID", "TAG_NO_AUTH_APP", "TAG_RECOVERY_SUCCESS", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements FragmentResolver<MfaSettingsFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(MfaSettingsFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            MfaSettingsParentFragment mfaSettingsParentFragment = new MfaSettingsParentFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(MfaSettingsParentFragment.EXTRA_LAUNCH_TYPE, key.getLaunchType());
            bundle.putSerializable(MfaSettingsParentFragment.EXTRA_CHALLENGE_ID, key.getChallengeId());
            bundle.putSerializable(MfaSettingsParentFragment.EXTRA_TOTP_TOKEN, key.getTotpToken());
            bundle.putSerializable(MfaSettingsParentFragment.EXTRA_ENROLLMENT_TOKEN, key.getEnrollmentToken());
            bundle.putSerializable(MfaSettingsParentFragment.EXTRA_PHONE_NUMBER, key.getPhoneNumber());
            bundle.putSerializable(MfaSettingsParentFragment.EXTRA_FLOW_ID, key.getFlowId());
            mfaSettingsParentFragment.setArguments(bundle);
            return mfaSettingsParentFragment;
        }
    }
}
