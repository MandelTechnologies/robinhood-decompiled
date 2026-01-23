package com.robinhood.shared.login.lockscreen;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.biometric.BiometricPrompt;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.android.authlock.C9622R;
import com.robinhood.android.authlock.biometric.BiometricAuthManager;
import com.robinhood.android.authlock.biometric.BiometricManagerCompat;
import com.robinhood.android.authlock.pin.PinManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.style.p099di.BrandLogo;
import com.robinhood.android.designsystem.style.p099di.LockscreenScarletOverlay;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.plt.contract.PltZeroLoadingScreen;
import com.robinhood.android.util.LockscreenManager;
import com.robinhood.rosetta.converters.platform.Booleans2;
import com.robinhood.rosetta.eventlogging.LocalAuthInfo;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.shared.login.C39089R;
import com.robinhood.shared.login.databinding.FragmentBiometricAuthBinding;
import com.robinhood.shared.user.contracts.auth.AuthenticationCallbacks;
import com.robinhood.shared.user.contracts.auth.AuthenticationCallbacks2;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BiometricAuthFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0001RB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\u001a\u0010J\u001a\u00020G2\u0006\u0010K\u001a\u00020L2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\b\u0010M\u001a\u00020GH\u0016J\b\u0010N\u001a\u00020GH\u0016J\b\u0010O\u001a\u00020GH\u0016J\b\u0010P\u001a\u00020GH\u0002J\b\u0010Q\u001a\u00020GH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010/\u001a\b\u0012\u0004\u0012\u000201008\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u00108\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b8\u0010:R\u001b\u0010=\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\n\u001a\u0004\b?\u0010@R\u000e\u0010B\u001a\u00020CX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010D\u001a\u000209X\u0096D¢\u0006\b\n\u0000\u001a\u0004\bE\u0010:¨\u0006S"}, m3636d2 = {"Lcom/robinhood/shared/login/lockscreen/BiometricAuthFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/plt/contract/PltZeroLoadingScreen;", "<init>", "()V", "binding", "Lcom/robinhood/shared/login/databinding/FragmentBiometricAuthBinding;", "getBinding", "()Lcom/robinhood/shared/login/databinding/FragmentBiometricAuthBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/SharedEventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/SharedEventLogger;)V", "biometricAuthManager", "Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;", "getBiometricAuthManager", "()Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;", "setBiometricAuthManager", "(Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;)V", "pinManager", "Lcom/robinhood/android/authlock/pin/PinManager;", "getPinManager", "()Lcom/robinhood/android/authlock/pin/PinManager;", "setPinManager", "(Lcom/robinhood/android/authlock/pin/PinManager;)V", "lockscreenManager", "Lcom/robinhood/android/util/LockscreenManager;", "getLockscreenManager", "()Lcom/robinhood/android/util/LockscreenManager;", "setLockscreenManager", "(Lcom/robinhood/android/util/LockscreenManager;)V", "lockscreenOverlay", "Lcom/robinhood/scarlet/ScarletOverlay;", "getLockscreenOverlay", "()Lcom/robinhood/scarlet/ScarletOverlay;", "setLockscreenOverlay", "(Lcom/robinhood/scarlet/ScarletOverlay;)V", "brandLogo", "Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "Landroid/graphics/drawable/Drawable;", "getBrandLogo", "()Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "setBrandLogo", "(Lcom/robinhood/scarlet/util/resource/DirectResourceReference;)V", "biometricPrompt", "Landroidx/biometric/BiometricPrompt;", "isSetup", "", "()Z", "isSetup$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/shared/user/contracts/auth/AuthenticationCallbacks;", "getCallbacks", "()Lcom/robinhood/shared/user/contracts/auth/AuthenticationCallbacks;", "callbacks$delegate", "authenticationCallbacks", "Landroidx/biometric/BiometricPrompt$AuthenticationCallback;", "toolbarVisible", "getToolbarVisible", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onStart", "onStop", "onDestroy", "launchBiometricsPrompt", "showBiometricErrorDialog", "Companion", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class BiometricAuthFragment extends BaseFragment implements PltZeroLoadingScreen {
    private static final String ARG_IS_SETUP = "argIsSetup";
    public AnalyticsLogger analytics;
    private final BiometricPrompt.AuthenticationCallback authenticationCallbacks;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public BiometricAuthManager biometricAuthManager;
    private BiometricPrompt biometricPrompt;

    @BrandLogo
    public DirectResourceReference<Drawable> brandLogo;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public SharedEventLogger eventLogger;

    /* renamed from: isSetup$delegate, reason: from kotlin metadata */
    private final Lazy isSetup;
    public LockscreenManager lockscreenManager;

    @LockscreenScarletOverlay
    public ScarletOverlay lockscreenOverlay;
    public PinManager pinManager;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BiometricAuthFragment.class, "binding", "getBinding()Lcom/robinhood/shared/login/databinding/FragmentBiometricAuthBinding;", 0)), Reflection.property1(new PropertyReference1Impl(BiometricAuthFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/user/contracts/auth/AuthenticationCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final Fragment newInstance(boolean z) {
        return INSTANCE.newInstance(z);
    }

    public BiometricAuthFragment() {
        super(C39089R.layout.fragment_biometric_auth);
        this.binding = ViewBinding5.viewBinding(this, BiometricAuthFragment4.INSTANCE);
        this.isSetup = Fragments2.argument(this, ARG_IS_SETUP);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AuthenticationCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.login.lockscreen.BiometricAuthFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AuthenticationCallbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.authenticationCallbacks = new BiometricPrompt.AuthenticationCallback() { // from class: com.robinhood.shared.login.lockscreen.BiometricAuthFragment$authenticationCallbacks$1
            @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationError(int errorCode, CharSequence errString) {
                Intrinsics.checkNotNullParameter(errString, "errString");
                super.onAuthenticationError(errorCode, errString);
                boolean z = false;
                String str = null;
                SharedEventLogger.DefaultImpls.logAccountSecurityEvent$default(this.this$0.getEventLogger(), null, null, null, null, new LocalAuthInfo(z, errorCode, str, errString.toString(), Booleans2.toProtobuf(Boolean.FALSE), null, 37, null), 15, null);
                if (errorCode == 1 || errorCode == 2 || errorCode == 5 || errorCode == 7 || errorCode == 9) {
                    this.this$0.showBiometricErrorDialog();
                } else if (errorCode == 13 && this.this$0.getActivity() != null && this.this$0.getPinManager().isPinEnabled()) {
                    this.this$0.getCallbacks().onBackupAuthenticationSelected();
                }
            }

            @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                super.onAuthenticationSucceeded(result);
                SharedEventLogger.DefaultImpls.logAccountSecurityEvent$default(this.this$0.getEventLogger(), null, null, null, null, new LocalAuthInfo(false, 0, null, null, Booleans2.toProtobuf(Boolean.TRUE), null, 47, null), 15, null);
                View view = this.this$0.getView();
                if (view != null) {
                    final BiometricAuthFragment biometricAuthFragment = this.this$0;
                    view.post(new Runnable() { // from class: com.robinhood.shared.login.lockscreen.BiometricAuthFragment$authenticationCallbacks$1$onAuthenticationSucceeded$1

                        /* compiled from: BiometricAuthFragment.kt */
                        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.login.lockscreen.BiometricAuthFragment$authenticationCallbacks$1$onAuthenticationSucceeded$1$1", m3645f = "BiometricAuthFragment.kt", m3646l = {105}, m3647m = "invokeSuspend")
                        /* renamed from: com.robinhood.shared.login.lockscreen.BiometricAuthFragment$authenticationCallbacks$1$onAuthenticationSucceeded$1$1, reason: invalid class name */
                        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            int label;
                            final /* synthetic */ BiometricAuthFragment this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(BiometricAuthFragment biometricAuthFragment, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.this$0 = biometricAuthFragment;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new AnonymousClass1(this.this$0, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    BiometricAuthManager biometricAuthManager = this.this$0.getBiometricAuthManager();
                                    this.label = 1;
                                    if (biometricAuthManager.enableBiometricAuth(this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            if (biometricAuthFragment.isSetup()) {
                                biometricAuthFragment.getLifecycleScope().launchWhenStarted(new AnonymousClass1(biometricAuthFragment, null));
                            }
                            if (biometricAuthFragment.getActivity() != null) {
                                biometricAuthFragment.getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_BIOMETRIC_AUTH_SUCCESS);
                                biometricAuthFragment.getCallbacks().onAuthenticated(AuthenticationCallbacks2.BIOMETRIC);
                            }
                        }
                    });
                }
            }

            @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationFailed() {
                super.onAuthenticationFailed();
                SharedEventLogger.DefaultImpls.logAccountSecurityEvent$default(this.this$0.getEventLogger(), null, null, null, null, new LocalAuthInfo(false, 0, null, null, Booleans2.toProtobuf(Boolean.FALSE), null, 47, null), 15, null);
                this.this$0.getCallbacks().onAuthenticationFailed(AuthenticationCallbacks2.BIOMETRIC);
            }
        };
    }

    private final FragmentBiometricAuthBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentBiometricAuthBinding) value;
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

    public final SharedEventLogger getEventLogger() {
        SharedEventLogger sharedEventLogger = this.eventLogger;
        if (sharedEventLogger != null) {
            return sharedEventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(SharedEventLogger sharedEventLogger) {
        Intrinsics.checkNotNullParameter(sharedEventLogger, "<set-?>");
        this.eventLogger = sharedEventLogger;
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

    public final LockscreenManager getLockscreenManager() {
        LockscreenManager lockscreenManager = this.lockscreenManager;
        if (lockscreenManager != null) {
            return lockscreenManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lockscreenManager");
        return null;
    }

    public final void setLockscreenManager(LockscreenManager lockscreenManager) {
        Intrinsics.checkNotNullParameter(lockscreenManager, "<set-?>");
        this.lockscreenManager = lockscreenManager;
    }

    public final ScarletOverlay getLockscreenOverlay() {
        ScarletOverlay scarletOverlay = this.lockscreenOverlay;
        if (scarletOverlay != null) {
            return scarletOverlay;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lockscreenOverlay");
        return null;
    }

    public final void setLockscreenOverlay(ScarletOverlay scarletOverlay) {
        Intrinsics.checkNotNullParameter(scarletOverlay, "<set-?>");
        this.lockscreenOverlay = scarletOverlay;
    }

    public final DirectResourceReference<Drawable> getBrandLogo() {
        DirectResourceReference<Drawable> directResourceReference = this.brandLogo;
        if (directResourceReference != null) {
            return directResourceReference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("brandLogo");
        return null;
    }

    public final void setBrandLogo(DirectResourceReference<Drawable> directResourceReference) {
        Intrinsics.checkNotNullParameter(directResourceReference, "<set-?>");
        this.brandLogo = directResourceReference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSetup() {
        return ((Boolean) this.isSetup.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuthenticationCallbacks getCallbacks() {
        return (AuthenticationCallbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        this.biometricPrompt = new BiometricPrompt(this, ContextCompat.getMainExecutor(contextRequireContext), this.authenticationCallbacks);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26684getVerticalXedK2Rk());
        getBinding().fragmentBiometricRobinhoodLogo.setImageResource(getBrandLogo().getResId());
        boolean zIsPinEnabled = getPinManager().isPinEnabled();
        if (isSetup()) {
            getBinding().fragmentBiometricAuthPrimaryButton.setText(getString(C39089R.string.auth_setup_biometrics_auth));
            getBinding().fragmentBiometricAuthSecondaryButton.setText(getString(C39089R.string.auth_pin_set_pin_prompt));
            getBinding().fragmentBiometricAuthSecondaryButton.setVisibility(zIsPinEnabled ? 4 : 0);
            RdsButton fragmentBiometricAuthBackupAuthButton = getBinding().fragmentBiometricAuthBackupAuthButton;
            Intrinsics.checkNotNullExpressionValue(fragmentBiometricAuthBackupAuthButton, "fragmentBiometricAuthBackupAuthButton");
            fragmentBiometricAuthBackupAuthButton.setVisibility(8);
        } else {
            getBinding().fragmentBiometricAuthPrimaryButton.setText(getString(C39089R.string.auth_unlock));
            getBinding().fragmentBiometricAuthSecondaryButton.setText(getString(C39089R.string.auth_log_out));
            RdsButton fragmentBiometricAuthBackupAuthButton2 = getBinding().fragmentBiometricAuthBackupAuthButton;
            Intrinsics.checkNotNullExpressionValue(fragmentBiometricAuthBackupAuthButton2, "fragmentBiometricAuthBackupAuthButton");
            fragmentBiometricAuthBackupAuthButton2.setVisibility(zIsPinEnabled ? 0 : 8);
            getBinding().fragmentBiometricAuthBackupAuthButton.setText(getString(C11048R.string.auth_use_pin));
            RdsButton fragmentBiometricAuthBackupAuthButton3 = getBinding().fragmentBiometricAuthBackupAuthButton;
            Intrinsics.checkNotNullExpressionValue(fragmentBiometricAuthBackupAuthButton3, "fragmentBiometricAuthBackupAuthButton");
            OnClickListeners.onClick(fragmentBiometricAuthBackupAuthButton3, new Function0() { // from class: com.robinhood.shared.login.lockscreen.BiometricAuthFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BiometricAuthFragment.onViewCreated$lambda$0(this.f$0);
                }
            });
        }
        RdsButton fragmentBiometricAuthPrimaryButton = getBinding().fragmentBiometricAuthPrimaryButton;
        Intrinsics.checkNotNullExpressionValue(fragmentBiometricAuthPrimaryButton, "fragmentBiometricAuthPrimaryButton");
        OnClickListeners.onClick(fragmentBiometricAuthPrimaryButton, new Function0() { // from class: com.robinhood.shared.login.lockscreen.BiometricAuthFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BiometricAuthFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        RdsButton fragmentBiometricAuthSecondaryButton = getBinding().fragmentBiometricAuthSecondaryButton;
        Intrinsics.checkNotNullExpressionValue(fragmentBiometricAuthSecondaryButton, "fragmentBiometricAuthSecondaryButton");
        OnClickListeners.onClick(fragmentBiometricAuthSecondaryButton, new Function0() { // from class: com.robinhood.shared.login.lockscreen.BiometricAuthFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BiometricAuthFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(BiometricAuthFragment biometricAuthFragment) {
        KeyEventDispatcher.Component activity = biometricAuthFragment.getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.robinhood.shared.user.contracts.auth.AuthenticationCallbacks");
        ((AuthenticationCallbacks) activity).onBackupAuthenticationSelected();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(BiometricAuthFragment biometricAuthFragment) {
        biometricAuthFragment.launchBiometricsPrompt();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(BiometricAuthFragment biometricAuthFragment) {
        if (biometricAuthFragment.isSetup()) {
            KeyEventDispatcher.Component activity = biometricAuthFragment.getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.robinhood.shared.user.contracts.auth.AuthenticationCallbacks");
            ((AuthenticationCallbacks) activity).onBackupAuthenticationSelected();
        } else {
            FragmentActivity fragmentActivityRequireActivity = biometricAuthFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            Navigator navigator = biometricAuthFragment.getNavigator();
            FragmentManager supportFragmentManager = fragmentActivityRequireActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            Navigator.DefaultImpls.createDialogFragment$default(navigator, new LegacyDialogFragmentKey.Logout(fragmentActivityRequireActivity, supportFragmentManager), null, 2, null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getScarletManager().putOverlay(getLockscreenOverlay(), Boolean.FALSE);
        launchBiometricsPrompt();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getScarletManager().removeOverlay(getLockscreenOverlay().getPriority(), Boolean.FALSE);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.biometricPrompt = null;
    }

    private final void launchBiometricsPrompt() {
        String string2;
        BiometricPrompt.PromptInfo promptInfoBuild;
        String string3;
        BiometricManagerCompat.Companion companion = BiometricManagerCompat.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (companion.from(contextRequireContext).canAuthenticate() == BiometricManagerCompat.Status.SUCCESS) {
            boolean zIsPinEnabled = getPinManager().isPinEnabled();
            if (isSetup()) {
                BiometricPrompt.PromptInfo.Builder title = new BiometricPrompt.PromptInfo.Builder().setTitle(getString(C39089R.string.auth_biometric_setup_prompt));
                if (zIsPinEnabled) {
                    string3 = getString(C11048R.string.general_label_dismiss);
                } else {
                    string3 = getString(C11048R.string.auth_use_pin);
                }
                promptInfoBuild = title.setNegativeButtonText(string3).setConfirmationRequired(true).build();
                Intrinsics.checkNotNullExpressionValue(promptInfoBuild, "build(...)");
            } else {
                BiometricPrompt.PromptInfo.Builder title2 = new BiometricPrompt.PromptInfo.Builder().setTitle(getString(C39089R.string.auth_unlock_robinhood));
                if (zIsPinEnabled) {
                    string2 = getString(C11048R.string.auth_use_pin);
                } else {
                    string2 = getString(C11048R.string.general_label_dismiss);
                }
                promptInfoBuild = title2.setNegativeButtonText(string2).setConfirmationRequired(false).build();
                Intrinsics.checkNotNullExpressionValue(promptInfoBuild, "build(...)");
            }
            BiometricPrompt biometricPrompt = this.biometricPrompt;
            Intrinsics.checkNotNull(biometricPrompt);
            biometricPrompt.authenticate(promptInfoBuild);
            return;
        }
        showBiometricErrorDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showBiometricErrorDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder theme = companion.create(contextRequireContext).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(C9622R.string.auth_biometric_error_not_available, new Object[0]).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(theme, childFragmentManager, "biometricErrorDialog", false, 4, null);
    }

    /* compiled from: BiometricAuthFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/login/lockscreen/BiometricAuthFragment$Companion;", "", "<init>", "()V", "ARG_IS_SETUP", "", "newInstance", "Landroidx/fragment/app/Fragment;", "isSetup", "", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Fragment newInstance(boolean isSetup) {
            BiometricAuthFragment biometricAuthFragment = new BiometricAuthFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean(BiometricAuthFragment.ARG_IS_SETUP, isSetup);
            biometricAuthFragment.setArguments(bundle);
            return biometricAuthFragment;
        }
    }
}
