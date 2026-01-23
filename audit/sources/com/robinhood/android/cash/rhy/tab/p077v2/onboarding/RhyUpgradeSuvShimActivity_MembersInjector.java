package com.robinhood.android.cash.rhy.tab.p077v2.onboarding;

import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.api.stepupverification.StepUpVerificationApi;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyUpgradeSuvShimActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/onboarding/RhyUpgradeSuvShimActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/cash/rhy/tab/v2/onboarding/RhyUpgradeSuvShimActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "stepUpVerificationApi", "Lcom/robinhood/api/stepupverification/StepUpVerificationApi;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RhyUpgradeSuvShimActivity_MembersInjector implements MembersInjector<RhyUpgradeSuvShimActivity> {
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<BaseActivitySingletons> singletons;
    private final Provider<StepUpVerificationApi> stepUpVerificationApi;
    private final Provider<SuvWorkflowManager> suvWorkflowManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<RhyUpgradeSuvShimActivity> create(Provider<BaseActivitySingletons> provider, Provider<ExperimentsStore> provider2, Provider<SuvWorkflowManager> provider3, Provider<StepUpVerificationApi> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectExperimentsStore(RhyUpgradeSuvShimActivity rhyUpgradeSuvShimActivity, ExperimentsStore experimentsStore) {
        INSTANCE.injectExperimentsStore(rhyUpgradeSuvShimActivity, experimentsStore);
    }

    @JvmStatic
    public static final void injectStepUpVerificationApi(RhyUpgradeSuvShimActivity rhyUpgradeSuvShimActivity, StepUpVerificationApi stepUpVerificationApi) {
        INSTANCE.injectStepUpVerificationApi(rhyUpgradeSuvShimActivity, stepUpVerificationApi);
    }

    @JvmStatic
    public static final void injectSuvWorkflowManager(RhyUpgradeSuvShimActivity rhyUpgradeSuvShimActivity, SuvWorkflowManager suvWorkflowManager) {
        INSTANCE.injectSuvWorkflowManager(rhyUpgradeSuvShimActivity, suvWorkflowManager);
    }

    public RhyUpgradeSuvShimActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<ExperimentsStore> experimentsStore, Provider<SuvWorkflowManager> suvWorkflowManager, Provider<StepUpVerificationApi> stepUpVerificationApi) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        Intrinsics.checkNotNullParameter(stepUpVerificationApi, "stepUpVerificationApi");
        this.singletons = singletons;
        this.experimentsStore = experimentsStore;
        this.suvWorkflowManager = suvWorkflowManager;
        this.stepUpVerificationApi = stepUpVerificationApi;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RhyUpgradeSuvShimActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        companion2.injectExperimentsStore(instance, experimentsStore);
        SuvWorkflowManager suvWorkflowManager = this.suvWorkflowManager.get();
        Intrinsics.checkNotNullExpressionValue(suvWorkflowManager, "get(...)");
        companion2.injectSuvWorkflowManager(instance, suvWorkflowManager);
        StepUpVerificationApi stepUpVerificationApi = this.stepUpVerificationApi.get();
        Intrinsics.checkNotNullExpressionValue(stepUpVerificationApi, "get(...)");
        companion2.injectStepUpVerificationApi(instance, stepUpVerificationApi);
    }

    /* compiled from: RhyUpgradeSuvShimActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/onboarding/RhyUpgradeSuvShimActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/cash/rhy/tab/v2/onboarding/RhyUpgradeSuvShimActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "stepUpVerificationApi", "Lcom/robinhood/api/stepupverification/StepUpVerificationApi;", "injectExperimentsStore", "", "instance", "injectSuvWorkflowManager", "injectStepUpVerificationApi", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<RhyUpgradeSuvShimActivity> create(Provider<BaseActivitySingletons> singletons, Provider<ExperimentsStore> experimentsStore, Provider<SuvWorkflowManager> suvWorkflowManager, Provider<StepUpVerificationApi> stepUpVerificationApi) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
            Intrinsics.checkNotNullParameter(stepUpVerificationApi, "stepUpVerificationApi");
            return new RhyUpgradeSuvShimActivity_MembersInjector(singletons, experimentsStore, suvWorkflowManager, stepUpVerificationApi);
        }

        @JvmStatic
        public final void injectExperimentsStore(RhyUpgradeSuvShimActivity instance, ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            instance.setExperimentsStore(experimentsStore);
        }

        @JvmStatic
        public final void injectSuvWorkflowManager(RhyUpgradeSuvShimActivity instance, SuvWorkflowManager suvWorkflowManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
            instance.setSuvWorkflowManager(suvWorkflowManager);
        }

        @JvmStatic
        public final void injectStepUpVerificationApi(RhyUpgradeSuvShimActivity instance, StepUpVerificationApi stepUpVerificationApi) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(stepUpVerificationApi, "stepUpVerificationApi");
            instance.setStepUpVerificationApi(stepUpVerificationApi);
        }
    }
}
