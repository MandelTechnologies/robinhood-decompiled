package com.robinhood.android.rhy.referral.fund.confirmation;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.compose.app.GenericComposeFragment_MembersInjector;
import com.robinhood.compose.app.GenericComposeSingletons;
import com.robinhood.librobinhood.logging.RhyGlobalLoggingContext;
import com.robinhood.targetbackend.TargetBackend;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralFundConfirmationFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "genericComposeSingletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "rhyGlobalLoggingContext", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RhyReferralFundConfirmationFragment_MembersInjector implements MembersInjector<RhyReferralFundConfirmationFragment> {
    private final Provider<EventLogger> eventLogger;
    private final Provider<GenericComposeSingletons> genericComposeSingletons;
    private final Provider<RhyGlobalLoggingContext> rhyGlobalLoggingContext;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<TargetBackend> targetBackend;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<RhyReferralFundConfirmationFragment> create(Provider<BaseFragmentSingletons> provider, Provider<GenericComposeSingletons> provider2, Provider<TargetBackend> provider3, Provider<EventLogger> provider4, Provider<RhyGlobalLoggingContext> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectEventLogger(RhyReferralFundConfirmationFragment rhyReferralFundConfirmationFragment, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(rhyReferralFundConfirmationFragment, eventLogger);
    }

    @JvmStatic
    public static final void injectRhyGlobalLoggingContext(RhyReferralFundConfirmationFragment rhyReferralFundConfirmationFragment, RhyGlobalLoggingContext rhyGlobalLoggingContext) {
        INSTANCE.injectRhyGlobalLoggingContext(rhyReferralFundConfirmationFragment, rhyGlobalLoggingContext);
    }

    @JvmStatic
    public static final void injectTargetBackend(RhyReferralFundConfirmationFragment rhyReferralFundConfirmationFragment, TargetBackend targetBackend) {
        INSTANCE.injectTargetBackend(rhyReferralFundConfirmationFragment, targetBackend);
    }

    public RhyReferralFundConfirmationFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<TargetBackend> targetBackend, Provider<EventLogger> eventLogger, Provider<RhyGlobalLoggingContext> rhyGlobalLoggingContext) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "rhyGlobalLoggingContext");
        this.singletons = singletons;
        this.genericComposeSingletons = genericComposeSingletons;
        this.targetBackend = targetBackend;
        this.eventLogger = eventLogger;
        this.rhyGlobalLoggingContext = rhyGlobalLoggingContext;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RhyReferralFundConfirmationFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        GenericComposeFragment_MembersInjector.Companion companion2 = GenericComposeFragment_MembersInjector.INSTANCE;
        GenericComposeSingletons genericComposeSingletons = this.genericComposeSingletons.get();
        Intrinsics.checkNotNullExpressionValue(genericComposeSingletons, "get(...)");
        companion2.injectGenericComposeSingletons(instance, genericComposeSingletons);
        Companion companion3 = INSTANCE;
        TargetBackend targetBackend = this.targetBackend.get();
        Intrinsics.checkNotNullExpressionValue(targetBackend, "get(...)");
        companion3.injectTargetBackend(instance, targetBackend);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion3.injectEventLogger(instance, eventLogger);
        RhyGlobalLoggingContext rhyGlobalLoggingContext = this.rhyGlobalLoggingContext.get();
        Intrinsics.checkNotNullExpressionValue(rhyGlobalLoggingContext, "get(...)");
        companion3.injectRhyGlobalLoggingContext(instance, rhyGlobalLoggingContext);
    }

    /* compiled from: RhyReferralFundConfirmationFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "genericComposeSingletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "rhyGlobalLoggingContext", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "injectTargetBackend", "", "instance", "injectEventLogger", "injectRhyGlobalLoggingContext", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<RhyReferralFundConfirmationFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<TargetBackend> targetBackend, Provider<EventLogger> eventLogger, Provider<RhyGlobalLoggingContext> rhyGlobalLoggingContext) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "rhyGlobalLoggingContext");
            return new RhyReferralFundConfirmationFragment_MembersInjector(singletons, genericComposeSingletons, targetBackend, eventLogger, rhyGlobalLoggingContext);
        }

        @JvmStatic
        public final void injectTargetBackend(RhyReferralFundConfirmationFragment instance, TargetBackend targetBackend) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            instance.setTargetBackend(targetBackend);
        }

        @JvmStatic
        public final void injectEventLogger(RhyReferralFundConfirmationFragment instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectRhyGlobalLoggingContext(RhyReferralFundConfirmationFragment instance, RhyGlobalLoggingContext rhyGlobalLoggingContext) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "rhyGlobalLoggingContext");
            instance.setRhyGlobalLoggingContext(rhyGlobalLoggingContext);
        }
    }
}
