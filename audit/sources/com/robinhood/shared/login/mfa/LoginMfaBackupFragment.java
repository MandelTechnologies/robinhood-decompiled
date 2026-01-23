package com.robinhood.shared.login.mfa;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.numpad.RdsNumpadContainerView;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.login.LoginStatus;
import com.robinhood.shared.login.C39089R;
import com.robinhood.shared.login.databinding.FragmentLoginMfaBackupBinding;
import com.robinhood.shared.login.lib.p385ui.LoginErrorHandler;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.user.contracts.auth.LoginMfaBackup;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import io.reactivex.Observable;
import io.reactivex.functions.Action;
import java.util.NoSuchElementException;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: LoginMfaBackupFragment.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020!H\u0002J\b\u0010*\u001a\u00020!H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\t\u001a\u0004\b\u001d\u0010\u001e¨\u0006,"}, m3636d2 = {"Lcom/robinhood/shared/login/mfa/LoginMfaBackupFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "binding", "Lcom/robinhood/shared/login/databinding/FragmentLoginMfaBackupBinding;", "getBinding", "()Lcom/robinhood/shared/login/databinding/FragmentLoginMfaBackupBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "getAuthManager", "()Lcom/robinhood/shared/security/auth/AuthManager;", "setAuthManager", "(Lcom/robinhood/shared/security/auth/AuthManager;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "value", "", "isLoading", "setLoading", "(Z)V", "callbacks", "Lcom/robinhood/shared/user/contracts/auth/LoginMfaBackup$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/user/contracts/auth/LoginMfaBackup$Callbacks;", "callbacks$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "refreshUi", "onContinueClick", "Companion", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class LoginMfaBackupFragment extends BaseFragment {
    private static final int BACKUP_CODE_LENGTH = 12;
    public AnalyticsLogger analytics;
    public AuthManager authManager;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private boolean isLoading;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(LoginMfaBackupFragment.class, "binding", "getBinding()Lcom/robinhood/shared/login/databinding/FragmentLoginMfaBackupBinding;", 0)), Reflection.property1(new PropertyReference1Impl(LoginMfaBackupFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/user/contracts/auth/LoginMfaBackup$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public LoginMfaBackupFragment() {
        super(C39089R.layout.fragment_login_mfa_backup);
        this.binding = ViewBinding5.viewBinding(this, LoginMfaBackupFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(LoginMfaBackup.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.login.mfa.LoginMfaBackupFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof LoginMfaBackup.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    private final FragmentLoginMfaBackupBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentLoginMfaBackupBinding) value;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLoading(boolean z) {
        this.isLoading = z;
        refreshUi();
    }

    private final LoginMfaBackup.Callbacks getCallbacks() {
        return (LoginMfaBackup.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        LifecycleHost.DefaultImpls.bind$default(this, getBinding().numpad.getKeyEvents(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.login.mfa.LoginMfaBackupFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LoginMfaBackupFragment.onViewCreated$lambda$0(this.f$0, (KeyEvent) obj);
            }
        });
        RhEditText codeEdt = getBinding().codeEdt;
        Intrinsics.checkNotNullExpressionValue(codeEdt, "codeEdt");
        LifecycleHost.DefaultImpls.bind$default(this, RxTextView.textChanges(codeEdt), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.login.mfa.LoginMfaBackupFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LoginMfaBackupFragment.onViewCreated$lambda$1(this.f$0, (CharSequence) obj);
            }
        });
        getBinding().numpad.setOnButtonClick(new C391393(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(LoginMfaBackupFragment loginMfaBackupFragment, KeyEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        loginMfaBackupFragment.getBinding().codeEdt.dispatchKeyEvent(it);
        return Unit.INSTANCE;
    }

    /* compiled from: LoginMfaBackupFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.login.mfa.LoginMfaBackupFragment$onViewCreated$3 */
    /* synthetic */ class C391393 extends FunctionReferenceImpl implements Function0<Unit> {
        C391393(Object obj) {
            super(0, obj, LoginMfaBackupFragment.class, "onContinueClick", "onContinueClick()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((LoginMfaBackupFragment) this.receiver).onContinueClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(LoginMfaBackupFragment loginMfaBackupFragment, CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        loginMfaBackupFragment.refreshUi();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
        toolbar.setTitle(C39089R.string.login_mfa_backup_title);
    }

    private final void refreshUi() {
        RdsNumpadContainerView rdsNumpadContainerView = getBinding().numpad;
        rdsNumpadContainerView.setButtonEnabled(getBinding().codeEdt.length() >= 12 && !this.isLoading);
        rdsNumpadContainerView.setButtonLoading(this.isLoading);
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity != null) {
            baseActivity.showProgressBar(this.isLoading);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onContinueClick() {
        String strValueOf = String.valueOf(getBinding().codeEdt.getText());
        if (strValueOf.length() > 0) {
            setLoading(true);
            Observable<LoginStatus> observable = getAuthManager().verifyWithBackupCode(strValueOf).toObservable();
            Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
            Observable observableDoOnTerminate = ObservablesAndroid.observeOnMainThread(observable).doOnTerminate(new Action() { // from class: com.robinhood.shared.login.mfa.LoginMfaBackupFragment.onContinueClick.1
                @Override // io.reactivex.functions.Action
                public final void run() {
                    LoginMfaBackupFragment.this.setLoading(false);
                }
            });
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            Observable observableOnErrorResumeNext = observableDoOnTerminate.onErrorResumeNext(new LoginErrorHandler(fragmentActivityRequireActivity, null, null, null, 14, null));
            Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableOnErrorResumeNext, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.login.mfa.LoginMfaBackupFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LoginMfaBackupFragment.onContinueClick$lambda$3(this.f$0, (LoginStatus) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onContinueClick$lambda$3(LoginMfaBackupFragment loginMfaBackupFragment, LoginStatus loginStatus) {
        Intrinsics.checkNotNull(loginStatus);
        if (loginStatus instanceof LoginStatus.SuccessWithBackupCode) {
            loginMfaBackupFragment.getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_MFA_BACKUP_CODE);
            loginMfaBackupFragment.getCallbacks().onBackupAuthenticated(((LoginStatus.SuccessWithBackupCode) loginStatus).getChallengeId());
            return Unit.INSTANCE;
        }
        if (!(loginStatus instanceof LoginStatus.Success) && !(loginStatus instanceof LoginStatus.MfaRequired)) {
            throw new NoWhenBranchMatchedException();
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(loginStatus);
        throw new ExceptionsH();
    }

    /* compiled from: LoginMfaBackupFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/login/mfa/LoginMfaBackupFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/login/mfa/LoginMfaBackupFragment;", "Lcom/robinhood/shared/user/contracts/auth/LoginMfaBackup;", "<init>", "()V", "BACKUP_CODE_LENGTH", "", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<LoginMfaBackupFragment, LoginMfaBackup> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LoginMfaBackup loginMfaBackup) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, loginMfaBackup);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LoginMfaBackup getArgs(LoginMfaBackupFragment loginMfaBackupFragment) {
            return (LoginMfaBackup) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, loginMfaBackupFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public LoginMfaBackupFragment newInstance(LoginMfaBackup loginMfaBackup) {
            return (LoginMfaBackupFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, loginMfaBackup);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(LoginMfaBackupFragment loginMfaBackupFragment, LoginMfaBackup loginMfaBackup) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, loginMfaBackupFragment, loginMfaBackup);
        }
    }
}
