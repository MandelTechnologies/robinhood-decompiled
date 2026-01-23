package com.robinhood.android.syp.retirement;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment_MembersInjector;
import com.robinhood.compose.app.GenericComposeFragment_MembersInjector;
import com.robinhood.compose.app.GenericComposeSingletons;
import com.robinhood.librobinhood.logging.RhyGlobalLoggingContext;
import dagger.MembersInjector;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SypRetirementUpsellFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/syp/retirement/SypRetirementUpsellFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/syp/retirement/SypRetirementUpsellFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "genericComposeSingletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "markwon", "Lio/noties/markwon/Markwon;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "rhyGlobalLoggingContext", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-rhy-syp-retirement-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SypRetirementUpsellFragment_MembersInjector implements MembersInjector<SypRetirementUpsellFragment> {
    private final Provider<EventLogger> eventLogger;
    private final Provider<GenericComposeSingletons> genericComposeSingletons;
    private final Provider<Markwon> markwon;
    private final Provider<RhyGlobalLoggingContext> rhyGlobalLoggingContext;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<SypRetirementUpsellFragment> create(Provider<BaseFragmentSingletons> provider, Provider<GenericComposeSingletons> provider2, Provider<Markwon> provider3, Provider<EventLogger> provider4, Provider<RhyGlobalLoggingContext> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectEventLogger(SypRetirementUpsellFragment sypRetirementUpsellFragment, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(sypRetirementUpsellFragment, eventLogger);
    }

    @JvmStatic
    public static final void injectRhyGlobalLoggingContext(SypRetirementUpsellFragment sypRetirementUpsellFragment, RhyGlobalLoggingContext rhyGlobalLoggingContext) {
        INSTANCE.injectRhyGlobalLoggingContext(sypRetirementUpsellFragment, rhyGlobalLoggingContext);
    }

    public SypRetirementUpsellFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<Markwon> markwon, Provider<EventLogger> eventLogger, Provider<RhyGlobalLoggingContext> rhyGlobalLoggingContext) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "rhyGlobalLoggingContext");
        this.singletons = singletons;
        this.genericComposeSingletons = genericComposeSingletons;
        this.markwon = markwon;
        this.eventLogger = eventLogger;
        this.rhyGlobalLoggingContext = rhyGlobalLoggingContext;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SypRetirementUpsellFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        GenericComposeFragment_MembersInjector.Companion companion2 = GenericComposeFragment_MembersInjector.INSTANCE;
        GenericComposeSingletons genericComposeSingletons = this.genericComposeSingletons.get();
        Intrinsics.checkNotNullExpressionValue(genericComposeSingletons, "get(...)");
        companion2.injectGenericComposeSingletons(instance, genericComposeSingletons);
        GenericActionHandlingFragment_MembersInjector.Companion companion3 = GenericActionHandlingFragment_MembersInjector.INSTANCE;
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        companion3.injectMarkwon(instance, markwon);
        Companion companion4 = INSTANCE;
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion4.injectEventLogger(instance, eventLogger);
        RhyGlobalLoggingContext rhyGlobalLoggingContext = this.rhyGlobalLoggingContext.get();
        Intrinsics.checkNotNullExpressionValue(rhyGlobalLoggingContext, "get(...)");
        companion4.injectRhyGlobalLoggingContext(instance, rhyGlobalLoggingContext);
    }

    /* compiled from: SypRetirementUpsellFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/syp/retirement/SypRetirementUpsellFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/syp/retirement/SypRetirementUpsellFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "genericComposeSingletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "markwon", "Lio/noties/markwon/Markwon;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "rhyGlobalLoggingContext", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "injectEventLogger", "", "instance", "injectRhyGlobalLoggingContext", "feature-rhy-syp-retirement-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<SypRetirementUpsellFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<Markwon> markwon, Provider<EventLogger> eventLogger, Provider<RhyGlobalLoggingContext> rhyGlobalLoggingContext) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "rhyGlobalLoggingContext");
            return new SypRetirementUpsellFragment_MembersInjector(singletons, genericComposeSingletons, markwon, eventLogger, rhyGlobalLoggingContext);
        }

        @JvmStatic
        public final void injectEventLogger(SypRetirementUpsellFragment instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectRhyGlobalLoggingContext(SypRetirementUpsellFragment instance, RhyGlobalLoggingContext rhyGlobalLoggingContext) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "rhyGlobalLoggingContext");
            instance.setRhyGlobalLoggingContext(rhyGlobalLoggingContext);
        }
    }
}
