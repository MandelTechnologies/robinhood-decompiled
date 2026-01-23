package com.robinhood.feature.sweep.onboarding.fragments;

import bonfire.proto.idl.joint_accounts_onboarding.p035v1.JointAccountsOnboardingService;
import com.robinhood.android.common.onboarding.p085ui.BaseAgreementFragmentSingletons;
import com.robinhood.android.common.onboarding.p085ui.BaseAgreementFragment_MembersInjector;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.sweep.SweepOnboardingEventLogger;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SweepOnboardingSweepAgreementFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSweepAgreementFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSweepAgreementFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "agreementSingletons", "Lcom/robinhood/android/common/onboarding/ui/BaseAgreementFragmentSingletons;", "sweepOnboardingEventLogger", "Lcom/robinhood/android/lib/sweep/SweepOnboardingEventLogger;", "jointAccountsOnboardingService", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/JointAccountsOnboardingService;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SweepOnboardingSweepAgreementFragment_MembersInjector implements MembersInjector<SweepOnboardingSweepAgreementFragment> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<BaseAgreementFragmentSingletons> agreementSingletons;
    private final Provider<JointAccountsOnboardingService> jointAccountsOnboardingService;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<SweepOnboardingEventLogger> sweepOnboardingEventLogger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<SweepOnboardingSweepAgreementFragment> create(Provider<BaseFragmentSingletons> provider, Provider<BaseAgreementFragmentSingletons> provider2, Provider<SweepOnboardingEventLogger> provider3, Provider<JointAccountsOnboardingService> provider4, Provider<AccountProvider> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectAccountProvider(SweepOnboardingSweepAgreementFragment sweepOnboardingSweepAgreementFragment, AccountProvider accountProvider) {
        INSTANCE.injectAccountProvider(sweepOnboardingSweepAgreementFragment, accountProvider);
    }

    @JvmStatic
    public static final void injectJointAccountsOnboardingService(SweepOnboardingSweepAgreementFragment sweepOnboardingSweepAgreementFragment, JointAccountsOnboardingService jointAccountsOnboardingService) {
        INSTANCE.injectJointAccountsOnboardingService(sweepOnboardingSweepAgreementFragment, jointAccountsOnboardingService);
    }

    @JvmStatic
    public static final void injectSweepOnboardingEventLogger(SweepOnboardingSweepAgreementFragment sweepOnboardingSweepAgreementFragment, SweepOnboardingEventLogger sweepOnboardingEventLogger) {
        INSTANCE.injectSweepOnboardingEventLogger(sweepOnboardingSweepAgreementFragment, sweepOnboardingEventLogger);
    }

    public SweepOnboardingSweepAgreementFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<BaseAgreementFragmentSingletons> agreementSingletons, Provider<SweepOnboardingEventLogger> sweepOnboardingEventLogger, Provider<JointAccountsOnboardingService> jointAccountsOnboardingService, Provider<AccountProvider> accountProvider) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(agreementSingletons, "agreementSingletons");
        Intrinsics.checkNotNullParameter(sweepOnboardingEventLogger, "sweepOnboardingEventLogger");
        Intrinsics.checkNotNullParameter(jointAccountsOnboardingService, "jointAccountsOnboardingService");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        this.singletons = singletons;
        this.agreementSingletons = agreementSingletons;
        this.sweepOnboardingEventLogger = sweepOnboardingEventLogger;
        this.jointAccountsOnboardingService = jointAccountsOnboardingService;
        this.accountProvider = accountProvider;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SweepOnboardingSweepAgreementFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        BaseAgreementFragment_MembersInjector.Companion companion2 = BaseAgreementFragment_MembersInjector.INSTANCE;
        BaseAgreementFragmentSingletons baseAgreementFragmentSingletons = this.agreementSingletons.get();
        Intrinsics.checkNotNullExpressionValue(baseAgreementFragmentSingletons, "get(...)");
        companion2.injectAgreementSingletons(instance, baseAgreementFragmentSingletons);
        Companion companion3 = INSTANCE;
        SweepOnboardingEventLogger sweepOnboardingEventLogger = this.sweepOnboardingEventLogger.get();
        Intrinsics.checkNotNullExpressionValue(sweepOnboardingEventLogger, "get(...)");
        companion3.injectSweepOnboardingEventLogger(instance, sweepOnboardingEventLogger);
        JointAccountsOnboardingService jointAccountsOnboardingService = this.jointAccountsOnboardingService.get();
        Intrinsics.checkNotNullExpressionValue(jointAccountsOnboardingService, "get(...)");
        companion3.injectJointAccountsOnboardingService(instance, jointAccountsOnboardingService);
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        companion3.injectAccountProvider(instance, accountProvider);
    }

    /* compiled from: SweepOnboardingSweepAgreementFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSweepAgreementFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSweepAgreementFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "agreementSingletons", "Lcom/robinhood/android/common/onboarding/ui/BaseAgreementFragmentSingletons;", "sweepOnboardingEventLogger", "Lcom/robinhood/android/lib/sweep/SweepOnboardingEventLogger;", "jointAccountsOnboardingService", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/JointAccountsOnboardingService;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "injectSweepOnboardingEventLogger", "", "instance", "injectJointAccountsOnboardingService", "injectAccountProvider", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<SweepOnboardingSweepAgreementFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<BaseAgreementFragmentSingletons> agreementSingletons, Provider<SweepOnboardingEventLogger> sweepOnboardingEventLogger, Provider<JointAccountsOnboardingService> jointAccountsOnboardingService, Provider<AccountProvider> accountProvider) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(agreementSingletons, "agreementSingletons");
            Intrinsics.checkNotNullParameter(sweepOnboardingEventLogger, "sweepOnboardingEventLogger");
            Intrinsics.checkNotNullParameter(jointAccountsOnboardingService, "jointAccountsOnboardingService");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            return new SweepOnboardingSweepAgreementFragment_MembersInjector(singletons, agreementSingletons, sweepOnboardingEventLogger, jointAccountsOnboardingService, accountProvider);
        }

        @JvmStatic
        public final void injectSweepOnboardingEventLogger(SweepOnboardingSweepAgreementFragment instance, SweepOnboardingEventLogger sweepOnboardingEventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(sweepOnboardingEventLogger, "sweepOnboardingEventLogger");
            instance.setSweepOnboardingEventLogger(sweepOnboardingEventLogger);
        }

        @JvmStatic
        public final void injectJointAccountsOnboardingService(SweepOnboardingSweepAgreementFragment instance, JointAccountsOnboardingService jointAccountsOnboardingService) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(jointAccountsOnboardingService, "jointAccountsOnboardingService");
            instance.setJointAccountsOnboardingService(jointAccountsOnboardingService);
        }

        @JvmStatic
        public final void injectAccountProvider(SweepOnboardingSweepAgreementFragment instance, AccountProvider accountProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            instance.setAccountProvider(accountProvider);
        }
    }
}
