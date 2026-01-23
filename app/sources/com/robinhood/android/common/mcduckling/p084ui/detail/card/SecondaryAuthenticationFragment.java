package com.robinhood.android.common.mcduckling.p084ui.detail.card;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.biometric.BiometricPrompt;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.android.authlock.biometric.BiometricAuthManager;
import com.robinhood.android.authlock.pin.PinManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.security.contracts.Lockscreen;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SecondaryAuthenticationFragment.kt */
@Metadata(m3635d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001!\b\u0007\u0018\u0000 62\u00020\u0001:\u000256B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J&\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u00010*H\u0016J\b\u00102\u001a\u00020(H\u0016J\b\u00103\u001a\u00020(H\u0002J\b\u00104\u001a\u00020(H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\"R\u001c\u0010#\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u00010%0%0$X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/detail/card/SecondaryAuthenticationFragment;", "Lcom/robinhood/android/common/ui/BaseDialogFragment;", "<init>", "()V", "biometricAuthManager", "Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;", "getBiometricAuthManager", "()Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;", "setBiometricAuthManager", "(Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;)V", "pinManager", "Lcom/robinhood/android/authlock/pin/PinManager;", "getPinManager", "()Lcom/robinhood/android/authlock/pin/PinManager;", "setPinManager", "(Lcom/robinhood/android/authlock/pin/PinManager;)V", "title", "", "getTitle", "()Ljava/lang/String;", "title$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/common/mcduckling/ui/detail/card/SecondaryAuthenticationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/mcduckling/ui/detail/card/SecondaryAuthenticationFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "isPinEnabled", "", "()Z", SecondaryAuthenticationFragment.AWAITING_PIN_AUTH, "authenticationCallbacks", "com/robinhood/android/common/mcduckling/ui/detail/card/SecondaryAuthenticationFragment$authenticationCallbacks$1", "Lcom/robinhood/android/common/mcduckling/ui/detail/card/SecondaryAuthenticationFragment$authenticationCallbacks$1;", "pinAuthenticationLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "onSaveInstanceState", "", "outState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "onStart", "finishSuccessfully", "launchPinAuthentication", "Callbacks", "Companion", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SecondaryAuthenticationFragment extends BaseDialogFragment {
    private static final String ARG_TITLE = "title";
    private static final String AWAITING_PIN_AUTH = "awaitingPinAuth";
    private boolean awaitingPinAuth;
    public BiometricAuthManager biometricAuthManager;
    private final ActivityResultLauncher<Intent> pinAuthenticationLauncher;
    public PinManager pinManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SecondaryAuthenticationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/mcduckling/ui/detail/card/SecondaryAuthenticationFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: title$delegate, reason: from kotlin metadata */
    private final Lazy title = Fragments2.argument(this, "title");

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.mcduckling.ui.detail.card.SecondaryAuthenticationFragment$special$$inlined$targetFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment targetFragment = CallbacksProperty.getTargetFragment();
            if (targetFragment != null) {
                return targetFragment;
            }
            throw new IllegalStateException("Required value was null.");
        }
    });
    private final SecondaryAuthenticationFragment2 authenticationCallbacks = new BiometricPrompt.AuthenticationCallback() { // from class: com.robinhood.android.common.mcduckling.ui.detail.card.SecondaryAuthenticationFragment$authenticationCallbacks$1
        @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            super.onAuthenticationSucceeded(result);
            this.this$0.finishSuccessfully();
        }

        @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationError(int errorCode, CharSequence errString) {
            Intrinsics.checkNotNullParameter(errString, "errString");
            super.onAuthenticationError(errorCode, errString);
            if (errorCode == 13) {
                if (this.this$0.isPinEnabled()) {
                    this.this$0.launchPinAuthentication();
                    return;
                } else {
                    this.this$0.dismiss();
                    return;
                }
            }
            this.this$0.dismiss();
        }

        @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationFailed() {
            super.onAuthenticationFailed();
            Toast.makeText(this.this$0.getContext(), "Failed to authenticate", 0).show();
            this.this$0.dismiss();
        }
    };

    /* compiled from: SecondaryAuthenticationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/detail/card/SecondaryAuthenticationFragment$Callbacks;", "", "onSecondaryAuthenticationSuccess", "", "requestCode", "", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSecondaryAuthenticationSuccess(int requestCode);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.robinhood.android.common.mcduckling.ui.detail.card.SecondaryAuthenticationFragment$authenticationCallbacks$1] */
    public SecondaryAuthenticationFragment() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.common.mcduckling.ui.detail.card.SecondaryAuthenticationFragment$pinAuthenticationLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    this.this$0.finishSuccessfully();
                } else {
                    this.this$0.dismiss();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.pinAuthenticationLauncher = activityResultLauncherRegisterForActivityResult;
    }

    public final BiometricAuthManager getBiometricAuthManager() {
        BiometricAuthManager biometricAuthManager = this.biometricAuthManager;
        if (biometricAuthManager != null) {
            return biometricAuthManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("biometricAuthManager");
        return null;
    }

    public final void setBiometricAuthManager(BiometricAuthManager biometricAuthManager) {
        Intrinsics.checkNotNullParameter(biometricAuthManager, "<set-?>");
        this.biometricAuthManager = biometricAuthManager;
    }

    public final PinManager getPinManager() {
        PinManager pinManager = this.pinManager;
        if (pinManager != null) {
            return pinManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pinManager");
        return null;
    }

    public final void setPinManager(PinManager pinManager) {
        Intrinsics.checkNotNullParameter(pinManager, "<set-?>");
        this.pinManager = pinManager;
    }

    private final String getTitle() {
        return (String) this.title.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPinEnabled() {
        return getPinManager().isPinEnabled();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean(AWAITING_PIN_AUTH, this.awaitingPinAuth);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (savedInstanceState != null) {
            this.awaitingPinAuth = savedInstanceState.getBoolean(AWAITING_PIN_AUTH);
        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        String string2;
        super.onStart();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (getBiometricAuthManager().isBiometricsAuthEnabled()) {
            BiometricPrompt.PromptInfo.Builder title = new BiometricPrompt.PromptInfo.Builder().setTitle(getTitle());
            if (isPinEnabled()) {
                string2 = getString(C11048R.string.auth_use_pin);
            } else {
                string2 = getString(C11048R.string.general_label_dismiss);
            }
            BiometricPrompt.PromptInfo promptInfoBuild = title.setNegativeButtonText(string2).setConfirmationRequired(true).build();
            Intrinsics.checkNotNullExpressionValue(promptInfoBuild, "build(...)");
            new BiometricPrompt(this, ContextCompat.getMainExecutor(contextRequireContext), this.authenticationCallbacks).authenticate(promptInfoBuild);
            return;
        }
        if (isPinEnabled()) {
            if (this.awaitingPinAuth) {
                return;
            }
            launchPinAuthentication();
            return;
        }
        finishSuccessfully();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishSuccessfully() {
        getCallbacks().onSecondaryAuthenticationSuccess(getTargetRequestCode());
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchPinAuthentication() {
        this.awaitingPinAuth = true;
        ActivityResultLauncher<Intent> activityResultLauncher = this.pinAuthenticationLauncher;
        Navigator navigator = Fragments2.getBaseActivity(this).getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        activityResultLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new Lockscreen(true), null, false, 12, null));
    }

    /* compiled from: SecondaryAuthenticationFragment.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u0007\u001a\u00020\b\"\f\b\u0000\u0010\t*\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u0002H\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/detail/card/SecondaryAuthenticationFragment$Companion;", "", "<init>", "()V", "ARG_TITLE", "", "AWAITING_PIN_AUTH", "newInstance", "Lcom/robinhood/android/common/mcduckling/ui/detail/card/SecondaryAuthenticationFragment;", "C", "Landroidx/fragment/app/Fragment;", "Lcom/robinhood/android/common/mcduckling/ui/detail/card/SecondaryAuthenticationFragment$Callbacks;", "callbacks", "title", "requestCode", "", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;I)Lcom/robinhood/android/common/mcduckling/ui/detail/card/SecondaryAuthenticationFragment;", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <C extends Fragment & Callbacks> SecondaryAuthenticationFragment newInstance(C callbacks, String title, int requestCode) {
            Intrinsics.checkNotNullParameter(callbacks, "callbacks");
            Intrinsics.checkNotNullParameter(title, "title");
            SecondaryAuthenticationFragment secondaryAuthenticationFragment = new SecondaryAuthenticationFragment();
            secondaryAuthenticationFragment.setTargetFragment(callbacks, requestCode);
            Bundle bundle = new Bundle();
            bundle.putString("title", title);
            secondaryAuthenticationFragment.setArguments(bundle);
            return secondaryAuthenticationFragment;
        }
    }
}
