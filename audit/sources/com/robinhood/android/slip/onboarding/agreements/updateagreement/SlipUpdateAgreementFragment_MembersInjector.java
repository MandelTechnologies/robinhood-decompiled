package com.robinhood.android.slip.onboarding.agreements.updateagreement;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.onboarding.p085ui.BaseAgreementFragmentSingletons;
import com.robinhood.android.common.onboarding.p085ui.BaseAgreementFragment_MembersInjector;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.slip.lib.SlipUpdatedAgreementManager;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipUpdatedAgreementsStore;
import com.robinhood.librobinhood.data.store.identi.UserAgreementsStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipUpdateAgreementFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/updateagreement/SlipUpdateAgreementFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/slip/onboarding/agreements/updateagreement/SlipUpdateAgreementFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "agreementSingletons", "Lcom/robinhood/android/common/onboarding/ui/BaseAgreementFragmentSingletons;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "userAgreementsStore", "Lcom/robinhood/librobinhood/data/store/identi/UserAgreementsStore;", "slipUpdatedAgreementsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipUpdatedAgreementsStore;", "slipUpdatedAgreementManager", "Lcom/robinhood/android/slip/lib/SlipUpdatedAgreementManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SlipUpdateAgreementFragment_MembersInjector implements MembersInjector<SlipUpdateAgreementFragment> {
    private final Provider<BaseAgreementFragmentSingletons> agreementSingletons;
    private final Provider<EventLogger> eventLogger;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<SlipUpdatedAgreementManager> slipUpdatedAgreementManager;
    private final Provider<SlipUpdatedAgreementsStore> slipUpdatedAgreementsStore;
    private final Provider<UserAgreementsStore> userAgreementsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<SlipUpdateAgreementFragment> create(Provider<BaseFragmentSingletons> provider, Provider<BaseAgreementFragmentSingletons> provider2, Provider<EventLogger> provider3, Provider<UserAgreementsStore> provider4, Provider<SlipUpdatedAgreementsStore> provider5, Provider<SlipUpdatedAgreementManager> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final void injectEventLogger(SlipUpdateAgreementFragment slipUpdateAgreementFragment, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(slipUpdateAgreementFragment, eventLogger);
    }

    @JvmStatic
    public static final void injectSlipUpdatedAgreementManager(SlipUpdateAgreementFragment slipUpdateAgreementFragment, SlipUpdatedAgreementManager slipUpdatedAgreementManager) {
        INSTANCE.injectSlipUpdatedAgreementManager(slipUpdateAgreementFragment, slipUpdatedAgreementManager);
    }

    @JvmStatic
    public static final void injectSlipUpdatedAgreementsStore(SlipUpdateAgreementFragment slipUpdateAgreementFragment, SlipUpdatedAgreementsStore slipUpdatedAgreementsStore) {
        INSTANCE.injectSlipUpdatedAgreementsStore(slipUpdateAgreementFragment, slipUpdatedAgreementsStore);
    }

    @JvmStatic
    public static final void injectUserAgreementsStore(SlipUpdateAgreementFragment slipUpdateAgreementFragment, UserAgreementsStore userAgreementsStore) {
        INSTANCE.injectUserAgreementsStore(slipUpdateAgreementFragment, userAgreementsStore);
    }

    public SlipUpdateAgreementFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<BaseAgreementFragmentSingletons> agreementSingletons, Provider<EventLogger> eventLogger, Provider<UserAgreementsStore> userAgreementsStore, Provider<SlipUpdatedAgreementsStore> slipUpdatedAgreementsStore, Provider<SlipUpdatedAgreementManager> slipUpdatedAgreementManager) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(agreementSingletons, "agreementSingletons");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(userAgreementsStore, "userAgreementsStore");
        Intrinsics.checkNotNullParameter(slipUpdatedAgreementsStore, "slipUpdatedAgreementsStore");
        Intrinsics.checkNotNullParameter(slipUpdatedAgreementManager, "slipUpdatedAgreementManager");
        this.singletons = singletons;
        this.agreementSingletons = agreementSingletons;
        this.eventLogger = eventLogger;
        this.userAgreementsStore = userAgreementsStore;
        this.slipUpdatedAgreementsStore = slipUpdatedAgreementsStore;
        this.slipUpdatedAgreementManager = slipUpdatedAgreementManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SlipUpdateAgreementFragment instance) {
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
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion3.injectEventLogger(instance, eventLogger);
        UserAgreementsStore userAgreementsStore = this.userAgreementsStore.get();
        Intrinsics.checkNotNullExpressionValue(userAgreementsStore, "get(...)");
        companion3.injectUserAgreementsStore(instance, userAgreementsStore);
        SlipUpdatedAgreementsStore slipUpdatedAgreementsStore = this.slipUpdatedAgreementsStore.get();
        Intrinsics.checkNotNullExpressionValue(slipUpdatedAgreementsStore, "get(...)");
        companion3.injectSlipUpdatedAgreementsStore(instance, slipUpdatedAgreementsStore);
        SlipUpdatedAgreementManager slipUpdatedAgreementManager = this.slipUpdatedAgreementManager.get();
        Intrinsics.checkNotNullExpressionValue(slipUpdatedAgreementManager, "get(...)");
        companion3.injectSlipUpdatedAgreementManager(instance, slipUpdatedAgreementManager);
    }

    /* compiled from: SlipUpdateAgreementFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/updateagreement/SlipUpdateAgreementFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/slip/onboarding/agreements/updateagreement/SlipUpdateAgreementFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "agreementSingletons", "Lcom/robinhood/android/common/onboarding/ui/BaseAgreementFragmentSingletons;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "userAgreementsStore", "Lcom/robinhood/librobinhood/data/store/identi/UserAgreementsStore;", "slipUpdatedAgreementsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipUpdatedAgreementsStore;", "slipUpdatedAgreementManager", "Lcom/robinhood/android/slip/lib/SlipUpdatedAgreementManager;", "injectEventLogger", "", "instance", "injectUserAgreementsStore", "injectSlipUpdatedAgreementsStore", "injectSlipUpdatedAgreementManager", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<SlipUpdateAgreementFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<BaseAgreementFragmentSingletons> agreementSingletons, Provider<EventLogger> eventLogger, Provider<UserAgreementsStore> userAgreementsStore, Provider<SlipUpdatedAgreementsStore> slipUpdatedAgreementsStore, Provider<SlipUpdatedAgreementManager> slipUpdatedAgreementManager) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(agreementSingletons, "agreementSingletons");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(userAgreementsStore, "userAgreementsStore");
            Intrinsics.checkNotNullParameter(slipUpdatedAgreementsStore, "slipUpdatedAgreementsStore");
            Intrinsics.checkNotNullParameter(slipUpdatedAgreementManager, "slipUpdatedAgreementManager");
            return new SlipUpdateAgreementFragment_MembersInjector(singletons, agreementSingletons, eventLogger, userAgreementsStore, slipUpdatedAgreementsStore, slipUpdatedAgreementManager);
        }

        @JvmStatic
        public final void injectEventLogger(SlipUpdateAgreementFragment instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectUserAgreementsStore(SlipUpdateAgreementFragment instance, UserAgreementsStore userAgreementsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userAgreementsStore, "userAgreementsStore");
            instance.setUserAgreementsStore(userAgreementsStore);
        }

        @JvmStatic
        public final void injectSlipUpdatedAgreementsStore(SlipUpdateAgreementFragment instance, SlipUpdatedAgreementsStore slipUpdatedAgreementsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(slipUpdatedAgreementsStore, "slipUpdatedAgreementsStore");
            instance.setSlipUpdatedAgreementsStore(slipUpdatedAgreementsStore);
        }

        @JvmStatic
        public final void injectSlipUpdatedAgreementManager(SlipUpdateAgreementFragment instance, SlipUpdatedAgreementManager slipUpdatedAgreementManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(slipUpdatedAgreementManager, "slipUpdatedAgreementManager");
            instance.setSlipUpdatedAgreementManager(slipUpdatedAgreementManager);
        }
    }
}
