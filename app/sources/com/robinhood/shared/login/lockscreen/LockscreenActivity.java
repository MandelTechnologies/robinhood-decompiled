package com.robinhood.shared.login.lockscreen;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.analytics.performance.startup.StartupActivity;
import com.robinhood.analytics.performance.startup.StartupPerformanceLogger;
import com.robinhood.android.authlock.biometric.BiometricAuthManager;
import com.robinhood.android.authlock.pin.PinManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.style.p099di.LockscreenScarletOverlay;
import com.robinhood.android.gdpr.manager.PrivacySettingsBottomSheetExclusion;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.resumeapplication.ResumeApplicationManager;
import com.robinhood.android.security.contracts.Lockscreen;
import com.robinhood.android.util.LockscreenManager;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.Account;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.prefs.LockscreenTimeout;
import com.robinhood.prefs.annotation.LockscreenTimeoutPref;
import com.robinhood.rosetta.converters.platform.Booleans2;
import com.robinhood.rosetta.converters.security.LockscreenTimeouts2;
import com.robinhood.rosetta.eventlogging.DeviceSecurityConfig;
import com.robinhood.rosetta.eventlogging.DeviceSecurityEventData;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.shared.security.prompts.ExcludedFromPromptsFetching;
import com.robinhood.shared.user.contracts.auth.AuthenticationCallbacks;
import com.robinhood.shared.user.contracts.auth.AuthenticationCallbacks2;
import com.robinhood.shared.user.contracts.auth.PinFragmentKey;
import com.robinhood.targetbackend.TargetBackend;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LockscreenActivity.kt */
@Metadata(m3635d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 e2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001eB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010UH\u0014J\b\u0010V\u001a\u00020SH\u0014J\b\u0010W\u001a\u00020SH\u0014J\b\u0010X\u001a\u00020SH\u0014J\b\u0010Y\u001a\u00020SH\u0016J\b\u0010Z\u001a\u00020SH\u0016J\u0012\u0010[\u001a\u00020S2\b\u0010\\\u001a\u0004\u0018\u00010]H\u0016J\u0012\u0010^\u001a\u00020S2\b\u0010\\\u001a\u0004\u0018\u00010]H\u0016J\u001a\u0010_\u001a\u00020S2\u0006\u0010`\u001a\u00020L2\b\u0010\\\u001a\u0004\u0018\u00010]H\u0002J\u0010\u0010a\u001a\u00020L2\u0006\u0010b\u001a\u00020cH\u0016J\b\u0010d\u001a\u00020LH\u0016R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00102\u001a\u0002038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u00108\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001e\u0010>\u001a\u00020?8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010D\u001a\b\u0012\u0004\u0012\u00020F0E8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020L8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010MR\u0014\u0010N\u001a\u00020O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006f"}, m3636d2 = {"Lcom/robinhood/shared/login/lockscreen/LockscreenActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/analytics/performance/startup/StartupActivity;", "Lcom/robinhood/shared/user/contracts/auth/AuthenticationCallbacks;", "Lcom/robinhood/android/gdpr/manager/PrivacySettingsBottomSheetExclusion;", "Lcom/robinhood/shared/security/prompts/ExcludedFromPromptsFetching;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/SharedEventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/SharedEventLogger;)V", "pinManager", "Lcom/robinhood/android/authlock/pin/PinManager;", "getPinManager", "()Lcom/robinhood/android/authlock/pin/PinManager;", "setPinManager", "(Lcom/robinhood/android/authlock/pin/PinManager;)V", "biometricAuthManager", "Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;", "getBiometricAuthManager", "()Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;", "setBiometricAuthManager", "(Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;)V", "lockscreenManager", "Lcom/robinhood/android/util/LockscreenManager;", "getLockscreenManager", "()Lcom/robinhood/android/util/LockscreenManager;", "setLockscreenManager", "(Lcom/robinhood/android/util/LockscreenManager;)V", "startupPerformanceLogger", "Lcom/robinhood/analytics/performance/startup/StartupPerformanceLogger;", "getStartupPerformanceLogger", "()Lcom/robinhood/analytics/performance/startup/StartupPerformanceLogger;", "setStartupPerformanceLogger", "(Lcom/robinhood/analytics/performance/startup/StartupPerformanceLogger;)V", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "resumeApplicationManager", "Lcom/robinhood/android/resumeapplication/ResumeApplicationManager;", "getResumeApplicationManager", "()Lcom/robinhood/android/resumeapplication/ResumeApplicationManager;", "setResumeApplicationManager", "(Lcom/robinhood/android/resumeapplication/ResumeApplicationManager;)V", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "getTargetBackend", "()Lcom/robinhood/targetbackend/TargetBackend;", "setTargetBackend", "(Lcom/robinhood/targetbackend/TargetBackend;)V", "lockscreenOverlay", "Lcom/robinhood/scarlet/ScarletOverlay;", "getLockscreenOverlay", "()Lcom/robinhood/scarlet/ScarletOverlay;", "setLockscreenOverlay", "(Lcom/robinhood/scarlet/ScarletOverlay;)V", "lockscreenTimeoutPref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/prefs/LockscreenTimeout;", "getLockscreenTimeoutPref", "()Lcom/robinhood/prefs/EnumPreference;", "setLockscreenTimeoutPref", "(Lcom/robinhood/prefs/EnumPreference;)V", "isSecondaryAuthentication", "", "()Z", "screen", "Lcom/robinhood/analytics/performance/startup/StartupActivity$Screen;", "getScreen", "()Lcom/robinhood/analytics/performance/startup/StartupActivity$Screen;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onResume", "finishThisActivity", "onBackPressed", "onBackupAuthenticationSelected", "onAuthenticated", "authenticationType", "Lcom/robinhood/shared/user/contracts/auth/AuthenticationType;", "onAuthenticationFailed", "logDeviceSecurityOnAuthenticated", "unlockSuccess", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "requiresAuthentication", "Companion", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class LockscreenActivity extends BaseActivity implements StartupActivity, AuthenticationCallbacks, PrivacySettingsBottomSheetExclusion, ExcludedFromPromptsFetching {
    public AccountProvider accountProvider;
    public AnalyticsLogger analytics;
    public BiometricAuthManager biometricAuthManager;
    public SharedEventLogger eventLogger;
    public LockscreenManager lockscreenManager;

    @LockscreenScarletOverlay
    public ScarletOverlay lockscreenOverlay;

    @LockscreenTimeoutPref
    public EnumPreference<LockscreenTimeout> lockscreenTimeoutPref;
    public PinManager pinManager;
    public ResumeApplicationManager resumeApplicationManager;
    public StartupPerformanceLogger startupPerformanceLogger;
    public TargetBackend targetBackend;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean requiresAuthentication() {
        return false;
    }

    public LockscreenActivity() {
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

    public final StartupPerformanceLogger getStartupPerformanceLogger() {
        StartupPerformanceLogger startupPerformanceLogger = this.startupPerformanceLogger;
        if (startupPerformanceLogger != null) {
            return startupPerformanceLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("startupPerformanceLogger");
        return null;
    }

    public final void setStartupPerformanceLogger(StartupPerformanceLogger startupPerformanceLogger) {
        Intrinsics.checkNotNullParameter(startupPerformanceLogger, "<set-?>");
        this.startupPerformanceLogger = startupPerformanceLogger;
    }

    public final AccountProvider getAccountProvider() {
        AccountProvider accountProvider = this.accountProvider;
        if (accountProvider != null) {
            return accountProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountProvider");
        return null;
    }

    public final void setAccountProvider(AccountProvider accountProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "<set-?>");
        this.accountProvider = accountProvider;
    }

    public final ResumeApplicationManager getResumeApplicationManager() {
        ResumeApplicationManager resumeApplicationManager = this.resumeApplicationManager;
        if (resumeApplicationManager != null) {
            return resumeApplicationManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("resumeApplicationManager");
        return null;
    }

    public final void setResumeApplicationManager(ResumeApplicationManager resumeApplicationManager) {
        Intrinsics.checkNotNullParameter(resumeApplicationManager, "<set-?>");
        this.resumeApplicationManager = resumeApplicationManager;
    }

    public final TargetBackend getTargetBackend() {
        TargetBackend targetBackend = this.targetBackend;
        if (targetBackend != null) {
            return targetBackend;
        }
        Intrinsics.throwUninitializedPropertyAccessException("targetBackend");
        return null;
    }

    public final void setTargetBackend(TargetBackend targetBackend) {
        Intrinsics.checkNotNullParameter(targetBackend, "<set-?>");
        this.targetBackend = targetBackend;
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

    public final EnumPreference<LockscreenTimeout> getLockscreenTimeoutPref() {
        EnumPreference<LockscreenTimeout> enumPreference = this.lockscreenTimeoutPref;
        if (enumPreference != null) {
            return enumPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lockscreenTimeoutPref");
        return null;
    }

    public final void setLockscreenTimeoutPref(EnumPreference<LockscreenTimeout> enumPreference) {
        Intrinsics.checkNotNullParameter(enumPreference, "<set-?>");
        this.lockscreenTimeoutPref = enumPreference;
    }

    private final boolean isSecondaryAuthentication() {
        return ((Lockscreen) INSTANCE.getExtras((Activity) this)).isSecondaryAuthentication();
    }

    @Override // com.robinhood.analytics.performance.startup.StartupActivity
    public StartupActivity.Screen getScreen() {
        return StartupActivity.Screen.LOCKSCREEN;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScarletManager2.getScarletManager(this).putOverlay(getLockscreenOverlay(), Boolean.FALSE);
        if (savedInstanceState == null) {
            if (isSecondaryAuthentication()) {
                setFragment(C11048R.id.fragment_container, Navigator.DefaultImpls.createFragment$default(getNavigator(), PinFragmentKey.INSTANCE, null, 2, null));
                return;
            }
            if (getBiometricAuthManager().isBiometricsAuthEnabled()) {
                getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_BIOMETRIC_AUTH_LAUNCHED);
                setFragment(C11048R.id.fragment_container, BiometricAuthFragment.INSTANCE.newInstance(false));
            } else if (getPinManager().isPinEnabled()) {
                setFragment(C11048R.id.fragment_container, Navigator.DefaultImpls.createFragment$default(getNavigator(), PinFragmentKey.INSTANCE, null, 2, null));
            } else {
                onAuthenticated(null);
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        getResumeApplicationManager().refresh();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        final View viewFindViewById = findViewById(C11048R.id.fragment_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        OneShotPreDrawListener.add(viewFindViewById, new Runnable() { // from class: com.robinhood.shared.login.lockscreen.LockscreenActivity$onResume$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                this.getStartupPerformanceLogger().onLockscreenReady();
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    protected void finishThisActivity() {
        startActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"));
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (isSecondaryAuthentication()) {
            super.onBackPressed();
            return;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        if (supportFragmentManager.isStateSaved() || supportFragmentManager.popBackStackImmediate()) {
            return;
        }
        try {
            finishThisActivity();
        } catch (Exception unused) {
        }
    }

    @Override // com.robinhood.shared.user.contracts.auth.AuthenticationCallbacks
    public void onBackupAuthenticationSelected() {
        if (getPinManager().isPinEnabled()) {
            replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), PinFragmentKey.INSTANCE, null, 2, null));
        }
    }

    @Override // com.robinhood.shared.user.contracts.auth.AuthenticationCallbacks
    public void onAuthenticated(AuthenticationCallbacks2 authenticationType) {
        logDeviceSecurityOnAuthenticated(true, authenticationType);
        getLockscreenManager().unlock();
        setResult(-1);
        finish();
    }

    @Override // com.robinhood.shared.user.contracts.auth.AuthenticationCallbacks
    public void onAuthenticationFailed(AuthenticationCallbacks2 authenticationType) {
        logDeviceSecurityOnAuthenticated(false, authenticationType);
    }

    private final void logDeviceSecurityOnAuthenticated(final boolean unlockSuccess, AuthenticationCallbacks2 authenticationType) {
        final DeviceSecurityEventData.SecurityType securityType = authenticationType != null ? authenticationType.getSecurityType() : null;
        final DeviceSecurityConfig deviceSecurityConfig = new DeviceSecurityConfig(Booleans2.toProtobuf(Boolean.valueOf(getPinManager().isPinEnabled())), null, null, null, Booleans2.toProtobuf(Boolean.valueOf(getBiometricAuthManager().isBiometricsAuthEnabled())), null, null, 110, null);
        if (securityType != null) {
            Single<Account> singleFirstOrError = getAccountProvider().streamIndividualAccount().firstOrError();
            Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
            LifecycleHost.DefaultImpls.bind$default(this, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.login.lockscreen.LockscreenActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LockscreenActivity.logDeviceSecurityOnAuthenticated$lambda$1(this.f$0, securityType, deviceSecurityConfig, unlockSuccess, (Account) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logDeviceSecurityOnAuthenticated$lambda$1(LockscreenActivity lockscreenActivity, DeviceSecurityEventData.SecurityType securityType, DeviceSecurityConfig deviceSecurityConfig, boolean z, Account account) {
        lockscreenActivity.getEventLogger().logDeviceSecurityEvent(securityType, deviceSecurityConfig, account.getAccountAgeInWeeks(), Booleans2.toProtobuf(Boolean.valueOf(z)), LockscreenTimeouts2.toProtobuf((LockscreenTimeout) lockscreenActivity.getLockscreenTimeoutPref().get()));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != 16908332) {
            return true;
        }
        onBackPressed();
        return true;
    }

    /* compiled from: LockscreenActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/login/lockscreen/LockscreenActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/shared/login/lockscreen/LockscreenActivity;", "Lcom/robinhood/android/security/contracts/Lockscreen;", "<init>", "()V", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<LockscreenActivity, Lockscreen> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public Lockscreen getExtras(LockscreenActivity lockscreenActivity) {
            return (Lockscreen) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, lockscreenActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, Lockscreen lockscreen) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, lockscreen);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, Lockscreen lockscreen) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, lockscreen);
        }
    }
}
