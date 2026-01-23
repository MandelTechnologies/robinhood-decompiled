package com.robinhood.android.p273ui.login.app;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.authlock.biometric.BiometricChangeManager;
import com.robinhood.android.common.p081cx.SupportEmailHandler;
import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.p273ui.BaseLoginActivity_MembersInjector;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.targetbackend.TargetBackend;
import dagger.MembersInjector;
import dagger.internal.Provider;

/* loaded from: classes20.dex */
public final class LoginActivity_MembersInjector implements MembersInjector<LoginActivity> {
    private final Provider<AnalyticsLogger> analyticsProvider;
    private final Provider<BiometricChangeManager> biometricChangeManagerProvider;
    private final Provider<ExperimentsStore> experimentsStoreProvider;
    private final Provider<BaseActivitySingletons> singletonsProvider;
    private final Provider<SupportEmailHandler> supportEmailHandlerProvider;
    private final Provider<TargetBackend> targetBackendProvider;

    private LoginActivity_MembersInjector(Provider<BaseActivitySingletons> provider, Provider<AnalyticsLogger> provider2, Provider<SupportEmailHandler> provider3, Provider<TargetBackend> provider4, Provider<BiometricChangeManager> provider5, Provider<ExperimentsStore> provider6) {
        this.singletonsProvider = provider;
        this.analyticsProvider = provider2;
        this.supportEmailHandlerProvider = provider3;
        this.targetBackendProvider = provider4;
        this.biometricChangeManagerProvider = provider5;
        this.experimentsStoreProvider = provider6;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(LoginActivity loginActivity) {
        BaseActivity_MembersInjector.injectSingletons(loginActivity, this.singletonsProvider.get());
        BaseLoginActivity_MembersInjector.injectAnalytics(loginActivity, this.analyticsProvider.get());
        injectSupportEmailHandler(loginActivity, this.supportEmailHandlerProvider.get());
        injectTargetBackend(loginActivity, this.targetBackendProvider.get());
        injectBiometricChangeManager(loginActivity, this.biometricChangeManagerProvider.get());
        injectExperimentsStore(loginActivity, this.experimentsStoreProvider.get());
    }

    public static MembersInjector<LoginActivity> create(Provider<BaseActivitySingletons> provider, Provider<AnalyticsLogger> provider2, Provider<SupportEmailHandler> provider3, Provider<TargetBackend> provider4, Provider<BiometricChangeManager> provider5, Provider<ExperimentsStore> provider6) {
        return new LoginActivity_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static void injectSupportEmailHandler(LoginActivity loginActivity, SupportEmailHandler supportEmailHandler) {
        loginActivity.supportEmailHandler = supportEmailHandler;
    }

    public static void injectTargetBackend(LoginActivity loginActivity, TargetBackend targetBackend) {
        loginActivity.targetBackend = targetBackend;
    }

    public static void injectBiometricChangeManager(LoginActivity loginActivity, BiometricChangeManager biometricChangeManager) {
        loginActivity.biometricChangeManager = biometricChangeManager;
    }

    public static void injectExperimentsStore(LoginActivity loginActivity, ExperimentsStore experimentsStore) {
        loginActivity.experimentsStore = experimentsStore;
    }
}
