package com.robinhood.android.slip.onboarding.agreements.updateagreement;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment_MembersInjector;
import com.robinhood.android.common.p088ui.BaseDialogFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseDialogSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipUpdatedAgreementsStore;
import com.robinhood.librobinhood.data.store.identi.UserAgreementsStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipUpdateAgreementBottomSheetFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/updateagreement/SlipUpdateAgreementBottomSheetFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/slip/onboarding/agreements/updateagreement/SlipUpdateAgreementBottomSheetFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "slipUpdatedAgreementsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipUpdatedAgreementsStore;", "userAgreementsStore", "Lcom/robinhood/librobinhood/data/store/identi/UserAgreementsStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SlipUpdateAgreementBottomSheetFragment_MembersInjector implements MembersInjector<SlipUpdateAgreementBottomSheetFragment> {
    private final Provider<EventLogger> eventLogger;
    private final Provider<Navigator> navigator;
    private final Provider<BaseDialogSingletons> singletons;
    private final Provider<SlipUpdatedAgreementsStore> slipUpdatedAgreementsStore;
    private final Provider<UserAgreementsStore> userAgreementsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<SlipUpdateAgreementBottomSheetFragment> create(Provider<BaseDialogSingletons> provider, Provider<Navigator> provider2, Provider<EventLogger> provider3, Provider<SlipUpdatedAgreementsStore> provider4, Provider<UserAgreementsStore> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectEventLogger(SlipUpdateAgreementBottomSheetFragment slipUpdateAgreementBottomSheetFragment, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(slipUpdateAgreementBottomSheetFragment, eventLogger);
    }

    @JvmStatic
    public static final void injectSlipUpdatedAgreementsStore(SlipUpdateAgreementBottomSheetFragment slipUpdateAgreementBottomSheetFragment, SlipUpdatedAgreementsStore slipUpdatedAgreementsStore) {
        INSTANCE.injectSlipUpdatedAgreementsStore(slipUpdateAgreementBottomSheetFragment, slipUpdatedAgreementsStore);
    }

    @JvmStatic
    public static final void injectUserAgreementsStore(SlipUpdateAgreementBottomSheetFragment slipUpdateAgreementBottomSheetFragment, UserAgreementsStore userAgreementsStore) {
        INSTANCE.injectUserAgreementsStore(slipUpdateAgreementBottomSheetFragment, userAgreementsStore);
    }

    public SlipUpdateAgreementBottomSheetFragment_MembersInjector(Provider<BaseDialogSingletons> singletons, Provider<Navigator> navigator, Provider<EventLogger> eventLogger, Provider<SlipUpdatedAgreementsStore> slipUpdatedAgreementsStore, Provider<UserAgreementsStore> userAgreementsStore) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(slipUpdatedAgreementsStore, "slipUpdatedAgreementsStore");
        Intrinsics.checkNotNullParameter(userAgreementsStore, "userAgreementsStore");
        this.singletons = singletons;
        this.navigator = navigator;
        this.eventLogger = eventLogger;
        this.slipUpdatedAgreementsStore = slipUpdatedAgreementsStore;
        this.userAgreementsStore = userAgreementsStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SlipUpdateAgreementBottomSheetFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseDialogFragment_MembersInjector.Companion companion = BaseDialogFragment_MembersInjector.INSTANCE;
        BaseDialogSingletons baseDialogSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseDialogSingletons, "get(...)");
        companion.injectSingletons(instance, baseDialogSingletons);
        BaseBottomSheetDialogFragment_MembersInjector.Companion companion2 = BaseBottomSheetDialogFragment_MembersInjector.INSTANCE;
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        companion2.injectNavigator(instance, navigator);
        Companion companion3 = INSTANCE;
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion3.injectEventLogger(instance, eventLogger);
        SlipUpdatedAgreementsStore slipUpdatedAgreementsStore = this.slipUpdatedAgreementsStore.get();
        Intrinsics.checkNotNullExpressionValue(slipUpdatedAgreementsStore, "get(...)");
        companion3.injectSlipUpdatedAgreementsStore(instance, slipUpdatedAgreementsStore);
        UserAgreementsStore userAgreementsStore = this.userAgreementsStore.get();
        Intrinsics.checkNotNullExpressionValue(userAgreementsStore, "get(...)");
        companion3.injectUserAgreementsStore(instance, userAgreementsStore);
    }

    /* compiled from: SlipUpdateAgreementBottomSheetFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/updateagreement/SlipUpdateAgreementBottomSheetFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/slip/onboarding/agreements/updateagreement/SlipUpdateAgreementBottomSheetFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "slipUpdatedAgreementsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipUpdatedAgreementsStore;", "userAgreementsStore", "Lcom/robinhood/librobinhood/data/store/identi/UserAgreementsStore;", "injectEventLogger", "", "instance", "injectSlipUpdatedAgreementsStore", "injectUserAgreementsStore", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<SlipUpdateAgreementBottomSheetFragment> create(Provider<BaseDialogSingletons> singletons, Provider<Navigator> navigator, Provider<EventLogger> eventLogger, Provider<SlipUpdatedAgreementsStore> slipUpdatedAgreementsStore, Provider<UserAgreementsStore> userAgreementsStore) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(slipUpdatedAgreementsStore, "slipUpdatedAgreementsStore");
            Intrinsics.checkNotNullParameter(userAgreementsStore, "userAgreementsStore");
            return new SlipUpdateAgreementBottomSheetFragment_MembersInjector(singletons, navigator, eventLogger, slipUpdatedAgreementsStore, userAgreementsStore);
        }

        @JvmStatic
        public final void injectEventLogger(SlipUpdateAgreementBottomSheetFragment instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectSlipUpdatedAgreementsStore(SlipUpdateAgreementBottomSheetFragment instance, SlipUpdatedAgreementsStore slipUpdatedAgreementsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(slipUpdatedAgreementsStore, "slipUpdatedAgreementsStore");
            instance.setSlipUpdatedAgreementsStore(slipUpdatedAgreementsStore);
        }

        @JvmStatic
        public final void injectUserAgreementsStore(SlipUpdateAgreementBottomSheetFragment instance, UserAgreementsStore userAgreementsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userAgreementsStore, "userAgreementsStore");
            instance.setUserAgreementsStore(userAgreementsStore);
        }
    }
}
