package com.robinhood.shared.login.mfa;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.Dialogs;
import com.robinhood.android.common.util.extensions.ClipboardManagers;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.settings.util.MfaSmsRetriever;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.login.LoginStatus;
import com.robinhood.models.api.Challenge;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.lib.challenge.C39076R;
import com.robinhood.shared.login.C39089R;
import com.robinhood.shared.login.databinding.FragmentLoginMfaV2Binding;
import com.robinhood.shared.login.lib.p385ui.LoginErrorHandler;
import com.robinhood.shared.login.mfa.LoginMfaV2BottomSheetFragment;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.support.contracts.ContactSupportFragmentKey;
import com.robinhood.shared.user.contracts.auth.Login;
import com.robinhood.shared.user.contracts.auth.LoginMfa;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.data.LogoutType;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: LoginMfaV2Fragment.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0002>?B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\u0012\u0010)\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u001a\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020.2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010/\u001a\u00020&H\u0016J\b\u00100\u001a\u00020&H\u0016J\u0010\u00101\u001a\u00020&2\u0006\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020&H\u0002J\u0010\u00105\u001a\u00020&2\u0006\u00106\u001a\u00020\"H\u0002J\b\u00107\u001a\u00020&H\u0016J\u001a\u00108\u001a\u00020\u001b2\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010+H\u0016J\b\u0010<\u001a\u00020&H\u0016J\b\u0010=\u001a\u00020&H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006@"}, m3636d2 = {"Lcom/robinhood/shared/login/mfa/LoginMfaV2Fragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/shared/login/mfa/LoginMfaV2BottomSheetFragment$Callbacks;", "<init>", "()V", "binding", "Lcom/robinhood/shared/login/databinding/FragmentLoginMfaV2Binding;", "getBinding", "()Lcom/robinhood/shared/login/databinding/FragmentLoginMfaV2Binding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "loginStatus", "Lcom/robinhood/login/LoginStatus;", "getLoginStatus", "()Lcom/robinhood/login/LoginStatus;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "getAuthManager", "()Lcom/robinhood/shared/security/auth/AuthManager;", "setAuthManager", "(Lcom/robinhood/shared/security/auth/AuthManager;)V", "callbacks", "Lcom/robinhood/shared/user/contracts/auth/LoginMfa$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/user/contracts/auth/LoginMfa$Callbacks;", "callbacks$delegate", "value", "", "isLoading", "setLoading", "(Z)V", "hasVerifiedMfa", "Ljava/util/concurrent/atomic/AtomicBoolean;", "screenName", "", "getScreenName", "()Ljava/lang/String;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onStart", "onResume", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "refreshUi", "submitCode", "code", "onContactSupportClicked", "onPositiveButtonClicked", "id", "", "passthroughArgs", "resendCode", "useBackupCode", "LoginMfaV2ViewState", "Companion", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class LoginMfaV2Fragment extends BaseFragment implements LoginMfaV2BottomSheetFragment.Callbacks {
    private static final int INPUT_CODE_LENGTH = 6;
    public AuthManager authManager;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final AtomicBoolean hasVerifiedMfa;
    private boolean isLoading;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(LoginMfaV2Fragment.class, "binding", "getBinding()Lcom/robinhood/shared/login/databinding/FragmentLoginMfaV2Binding;", 0)), Reflection.property1(new PropertyReference1Impl(LoginMfaV2Fragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/user/contracts/auth/LoginMfa$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: LoginMfaV2Fragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Challenge.Type.values().length];
            try {
                iArr[Challenge.Type.SMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Challenge.Type.AUTH_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LoginMfaV2Fragment() {
        super(C39089R.layout.fragment_login_mfa_v2);
        this.binding = ViewBinding5.viewBinding(this, LoginMfaV2Fragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(LoginMfa.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.login.mfa.LoginMfaV2Fragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof LoginMfa.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.hasVerifiedMfa = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentLoginMfaV2Binding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentLoginMfaV2Binding) value;
    }

    private final LoginStatus getLoginStatus() {
        return ((LoginMfa) INSTANCE.getArgs((Fragment) this)).getLoginStatus();
    }

    public final AuthManager getAuthManager() {
        AuthManager authManager = this.authManager;
        if (authManager != null) {
            return authManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("authManager");
        return null;
    }

    public final void setAuthManager(AuthManager authManager) {
        Intrinsics.checkNotNullParameter(authManager, "<set-?>");
        this.authManager = authManager;
    }

    private final LoginMfa.Callbacks getCallbacks() {
        return (LoginMfa.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLoading(boolean z) {
        this.isLoading = z;
        refreshUi();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return "LoginMfaFragment";
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requireActivity().getWindow().setSoftInputMode(3);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        LoginMfaV2ViewState loginMfaV2ViewState = new LoginMfaV2ViewState(getLoginStatus());
        getBinding().challengeVerificationTitleText.setText(loginMfaV2ViewState.getTitle());
        getBinding().challengeVerificationSubtitleTxt.setText(loginMfaV2ViewState.getSubtitle());
        getBinding().challengeVerificationInputContainer.setContentDescription(getString(loginMfaV2ViewState.getInputContentDescription()));
        RdsButton challengeVerificationHelpBtn = getBinding().challengeVerificationHelpBtn;
        Intrinsics.checkNotNullExpressionValue(challengeVerificationHelpBtn, "challengeVerificationHelpBtn");
        OnClickListeners.onClick(challengeVerificationHelpBtn, new Function0() { // from class: com.robinhood.shared.login.mfa.LoginMfaV2Fragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LoginMfaV2Fragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        getBinding().numpad.useDefaultKeyHandler();
        RdsFormattedEditText challengeVerificationInput = getBinding().challengeVerificationInput;
        Intrinsics.checkNotNullExpressionValue(challengeVerificationInput, "challengeVerificationInput");
        Observable observableDistinctUntilChanged = RxTextView.textChanges(challengeVerificationInput).map(new Function() { // from class: com.robinhood.shared.login.mfa.LoginMfaV2Fragment.onViewCreated.2
            @Override // io.reactivex.functions.Function
            public final CharSequence apply(CharSequence p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return StringsKt.trim(p0);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.login.mfa.LoginMfaV2Fragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LoginMfaV2Fragment.onViewCreated$lambda$2(this.f$0, (CharSequence) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(LoginMfaV2Fragment loginMfaV2Fragment) {
        LoginMfaV2BottomSheetFragment loginMfaV2BottomSheetFragment = (LoginMfaV2BottomSheetFragment) LoginMfaV2BottomSheetFragment.INSTANCE.newInstance((Parcelable) new LoginMfaV2BottomSheetFragment.Args(loginMfaV2Fragment.getLoginStatus()));
        FragmentManager childFragmentManager = loginMfaV2Fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        loginMfaV2BottomSheetFragment.show(childFragmentManager, LoginMfaV2BottomSheetFragment.TAG);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(LoginMfaV2Fragment loginMfaV2Fragment, CharSequence charSequence) {
        loginMfaV2Fragment.refreshUi();
        if (charSequence.length() >= 6) {
            loginMfaV2Fragment.submitCode(charSequence.toString());
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        MfaSmsRetriever mfaSmsRetriever = MfaSmsRetriever.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        LifecycleHost.DefaultImpls.bind$default(this, mfaSmsRetriever.listenForMfaCode(fragmentActivityRequireActivity), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.login.mfa.LoginMfaV2Fragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LoginMfaV2Fragment.onStart$lambda$3(this.f$0, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(LoginMfaV2Fragment loginMfaV2Fragment, String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        loginMfaV2Fragment.getBinding().challengeVerificationInput.setText(code);
        loginMfaV2Fragment.submitCode(code);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        String mfaCode = ClipboardManagers.getMfaCode(ContextSystemServices.getClipboardManager(fragmentActivityRequireActivity));
        if (mfaCode != null) {
            getBinding().challengeVerificationInput.setText(mfaCode);
            getBinding().challengeVerificationInput.setSelection(mfaCode.length());
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    private final void refreshUi() {
        getBinding().challengeVerificationHelpBtn.setEnabled(!this.isLoading);
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity != null) {
            baseActivity.showProgressBar(this.isLoading);
        }
    }

    private final void submitCode(String code) {
        if (this.hasVerifiedMfa.compareAndSet(false, true)) {
            Observable<LoginStatus> observable = getAuthManager().verifyMfa(code).toObservable();
            Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
            Observable observableDoOnTerminate = ObservablesAndroid.observeOnMainThread(observable).doOnSubscribe(new Consumer() { // from class: com.robinhood.shared.login.mfa.LoginMfaV2Fragment.submitCode.1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Disposable disposable) {
                    LoginMfaV2Fragment.this.setLoading(true);
                }
            }).doOnError(new Consumer() { // from class: com.robinhood.shared.login.mfa.LoginMfaV2Fragment.submitCode.2
                @Override // io.reactivex.functions.Consumer
                public final void accept(Throwable th) {
                    LoginMfaV2Fragment.this.hasVerifiedMfa.set(false);
                }
            }).doOnTerminate(new Action() { // from class: com.robinhood.shared.login.mfa.LoginMfaV2Fragment.submitCode.3
                @Override // io.reactivex.functions.Action
                public final void run() {
                    LoginMfaV2Fragment.this.setLoading(false);
                    LoginMfaV2Fragment.this.getBinding().challengeVerificationInput.setText("");
                }
            });
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            Observable observableOnErrorResumeNext = observableDoOnTerminate.onErrorResumeNext(new LoginErrorHandler(fragmentActivityRequireActivity, null, null, null, 14, null));
            Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableOnErrorResumeNext, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.login.mfa.LoginMfaV2Fragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LoginMfaV2Fragment.submitCode$lambda$5(this.f$0, (LoginStatus) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitCode$lambda$5(LoginMfaV2Fragment loginMfaV2Fragment, LoginStatus loginStatus) {
        Intrinsics.checkNotNull(loginStatus);
        if (!(loginStatus instanceof LoginStatus.Success)) {
            if (!(loginStatus instanceof LoginStatus.SuccessWithBackupCode) && !(loginStatus instanceof LoginStatus.MfaRequired)) {
                throw new NoWhenBranchMatchedException();
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(loginStatus);
            throw new ExceptionsH();
        }
        loginMfaV2Fragment.getCallbacks().onMfaAuthenticated();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.shared.login.mfa.LoginMfaV2BottomSheetFragment.Callbacks
    public void onContactSupportClicked() {
        int i;
        if (!getAuthManager().isLoggedIn()) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Companion companion = INSTANCE;
            String username = ((LoginMfa) companion.getArgs((Fragment) this)).getUsername();
            Intrinsics.checkNotNull(username);
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new ContactSupportFragmentKey.Uar(username, ((LoginMfa) companion.getArgs((Fragment) this)).getLoginStatus().getChallengeType(), getScreenName()), false, false, false, false, null, false, null, null, 988, null);
            return;
        }
        RhDialogFragment.Companion companion2 = RhDialogFragment.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        RhDialogFragment.Builder builderCreate = companion2.create(fragmentActivityRequireActivity);
        Challenge.Type challengeType = ((LoginMfa) INSTANCE.getArgs((Fragment) this)).getLoginStatus().getChallengeType();
        int i2 = WhenMappings.$EnumSwitchMapping$0[challengeType.ordinal()];
        if (i2 == 1) {
            i = C39076R.string.challenge_verification_help_update_phone_number;
        } else if (i2 == 2) {
            i = C39076R.string.challenge_verification_help_update_authenticator_app;
        } else {
            Preconditions.INSTANCE.failUnexpectedItemKotlin(challengeType);
            throw new ExceptionsH();
        }
        RhDialogFragment.Builder id = builderCreate.setTitle(i, new Object[0]).setMessage(C39076R.string.uar_log_out_dialog_message, new Object[0]).setUseDesignSystemOverlay(true).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setPositiveButton(C11048R.string.general_label_continue, new Object[0]).setNegativeButton(C11048R.string.general_label_cancel, new Object[0]).setId(C39076R.id.dialog_id_uar_log_out_confirm);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(id, childFragmentManager, "uar-logout", false, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C39076R.id.dialog_id_uar_log_out_confirm) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            AuthManager authManager = getAuthManager();
            LogoutType logoutType = LogoutType.OTHER;
            Navigator navigator = getNavigator();
            Companion companion = INSTANCE;
            Intent intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new Login(((LoginMfa) companion.getArgs((Fragment) this)).getUsername(), null, false, 6, null), null, false, 12, null);
            Navigator navigator2 = getNavigator();
            String username = ((LoginMfa) companion.getArgs((Fragment) this)).getUsername();
            Intrinsics.checkNotNull(username);
            AuthManager.DefaultImpls.initiateLogout$default(authManager, contextRequireContext, logoutType, null, false, CollectionsKt.listOf((Object[]) new Intent[]{intentCreateIntent$default, Navigator.DefaultImpls.createIntentForFragment$default(navigator2, contextRequireContext, new ContactSupportFragmentKey.Uar(username, ((LoginMfa) companion.getArgs((Fragment) this)).getLoginStatus().getChallengeType(), getScreenName()), false, false, false, null, false, true, false, false, false, null, false, 7028, null)}), "update_mfa", 12, null);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.shared.login.mfa.LoginMfaV2BottomSheetFragment.Callbacks
    public void resendCode() {
        Observable<LoginStatus> observable = getAuthManager().verifyMfa(null).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        Observable observableObserveOnMainThread = ObservablesAndroid.observeOnMainThread(observable);
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNull(baseActivity);
        Observable observableOnErrorResumeNext = observableObserveOnMainThread.onErrorResumeNext(baseActivity.getActivityErrorHandler());
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableOnErrorResumeNext, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.login.mfa.LoginMfaV2Fragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LoginMfaV2Fragment.resendCode$lambda$6(this.f$0, (LoginStatus) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resendCode$lambda$6(LoginMfaV2Fragment loginMfaV2Fragment, LoginStatus loginStatus) {
        Intrinsics.checkNotNull(loginStatus);
        if (loginStatus instanceof LoginStatus.MfaRequired.Sms) {
            loginMfaV2Fragment.getBinding().challengeVerificationInput.setText((CharSequence) null);
            FragmentActivity fragmentActivityRequireActivity = loginMfaV2Fragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            String string2 = loginMfaV2Fragment.getString(C39089R.string.login_mfa_default_phone_number);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            Dialogs.showMfaVerificationResentDialog(fragmentActivityRequireActivity, string2, true);
        } else if (loginStatus instanceof LoginStatus.Success) {
            loginMfaV2Fragment.getCallbacks().abortMfaFlow();
        } else {
            if (!(loginStatus instanceof LoginStatus.SuccessWithBackupCode) && !(loginStatus instanceof LoginStatus.MfaRequired.App)) {
                throw new NoWhenBranchMatchedException();
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(loginStatus);
            throw new ExceptionsH();
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.shared.login.mfa.LoginMfaV2BottomSheetFragment.Callbacks
    public void useBackupCode() {
        getCallbacks().mfaUseBackupCode(getLoginStatus());
    }

    /* compiled from: LoginMfaV2Fragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/login/mfa/LoginMfaV2Fragment$LoginMfaV2ViewState;", "", "loginStatus", "Lcom/robinhood/login/LoginStatus;", "<init>", "(Lcom/robinhood/login/LoginStatus;)V", "getLoginStatus", "()Lcom/robinhood/login/LoginStatus;", "subtitle", "", "getSubtitle", "()I", "title", "getTitle", "inputContentDescription", "getInputContentDescription", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class LoginMfaV2ViewState {
        private final LoginStatus loginStatus;

        public LoginMfaV2ViewState(LoginStatus loginStatus) {
            Intrinsics.checkNotNullParameter(loginStatus, "loginStatus");
            this.loginStatus = loginStatus;
        }

        public final LoginStatus getLoginStatus() {
            return this.loginStatus;
        }

        public final int getSubtitle() {
            LoginStatus loginStatus = this.loginStatus;
            if (loginStatus instanceof LoginStatus.MfaRequired.Sms) {
                return C39076R.string.challenge_verification_subtitle_sms_logged_out;
            }
            if (loginStatus instanceof LoginStatus.MfaRequired.App) {
                return C39076R.string.challenge_verification_subtitle_auth_app_default;
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(loginStatus);
            throw new ExceptionsH();
        }

        public final int getTitle() {
            LoginStatus loginStatus = this.loginStatus;
            if (loginStatus instanceof LoginStatus.MfaRequired.Sms) {
                return C39076R.string.challenge_verification_title_sms;
            }
            if (loginStatus instanceof LoginStatus.MfaRequired.App) {
                return C39076R.string.challenge_verification_title_auth_app_default;
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(loginStatus);
            throw new ExceptionsH();
        }

        public final int getInputContentDescription() {
            LoginStatus loginStatus = this.loginStatus;
            if (loginStatus instanceof LoginStatus.MfaRequired.Sms) {
                return C39076R.string.challenge_verification_sms_accessibility_talkback;
            }
            if (loginStatus instanceof LoginStatus.MfaRequired.App) {
                return C39076R.string.challenge_verification_auth_app_accessibility_talkback;
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(loginStatus);
            throw new ExceptionsH();
        }
    }

    /* compiled from: LoginMfaV2Fragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/login/mfa/LoginMfaV2Fragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/login/mfa/LoginMfaV2Fragment;", "Lcom/robinhood/shared/user/contracts/auth/LoginMfa;", "<init>", "()V", "INPUT_CODE_LENGTH", "", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<LoginMfaV2Fragment, LoginMfa> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LoginMfa loginMfa) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, loginMfa);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LoginMfa getArgs(LoginMfaV2Fragment loginMfaV2Fragment) {
            return (LoginMfa) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, loginMfaV2Fragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public LoginMfaV2Fragment newInstance(LoginMfa loginMfa) {
            return (LoginMfaV2Fragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, loginMfa);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(LoginMfaV2Fragment loginMfaV2Fragment, LoginMfa loginMfa) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, loginMfaV2Fragment, loginMfa);
        }
    }
}
