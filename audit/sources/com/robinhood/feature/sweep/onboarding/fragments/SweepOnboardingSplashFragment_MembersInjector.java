package com.robinhood.feature.sweep.onboarding.fragments;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.sweep.SweepOnboardingEventLogger;
import com.robinhood.android.rhimage.ImageLoader;
import dagger.MembersInjector;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SweepOnboardingSplashFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSplashFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSplashFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "markwon", "Lio/noties/markwon/Markwon;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "sweepOnboardingEventLogger", "Lcom/robinhood/android/lib/sweep/SweepOnboardingEventLogger;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SweepOnboardingSplashFragment_MembersInjector implements MembersInjector<SweepOnboardingSplashFragment> {
    private final Provider<ImageLoader> imageLoader;
    private final Provider<Markwon> markwon;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<SweepOnboardingEventLogger> sweepOnboardingEventLogger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<SweepOnboardingSplashFragment> create(Provider<BaseFragmentSingletons> provider, Provider<Markwon> provider2, Provider<ImageLoader> provider3, Provider<SweepOnboardingEventLogger> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectImageLoader(SweepOnboardingSplashFragment sweepOnboardingSplashFragment, ImageLoader imageLoader) {
        INSTANCE.injectImageLoader(sweepOnboardingSplashFragment, imageLoader);
    }

    @JvmStatic
    public static final void injectMarkwon(SweepOnboardingSplashFragment sweepOnboardingSplashFragment, Markwon markwon) {
        INSTANCE.injectMarkwon(sweepOnboardingSplashFragment, markwon);
    }

    @JvmStatic
    public static final void injectSweepOnboardingEventLogger(SweepOnboardingSplashFragment sweepOnboardingSplashFragment, SweepOnboardingEventLogger sweepOnboardingEventLogger) {
        INSTANCE.injectSweepOnboardingEventLogger(sweepOnboardingSplashFragment, sweepOnboardingEventLogger);
    }

    public SweepOnboardingSplashFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<Markwon> markwon, Provider<ImageLoader> imageLoader, Provider<SweepOnboardingEventLogger> sweepOnboardingEventLogger) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(sweepOnboardingEventLogger, "sweepOnboardingEventLogger");
        this.singletons = singletons;
        this.markwon = markwon;
        this.imageLoader = imageLoader;
        this.sweepOnboardingEventLogger = sweepOnboardingEventLogger;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SweepOnboardingSplashFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        companion2.injectMarkwon(instance, markwon);
        ImageLoader imageLoader = this.imageLoader.get();
        Intrinsics.checkNotNullExpressionValue(imageLoader, "get(...)");
        companion2.injectImageLoader(instance, imageLoader);
        SweepOnboardingEventLogger sweepOnboardingEventLogger = this.sweepOnboardingEventLogger.get();
        Intrinsics.checkNotNullExpressionValue(sweepOnboardingEventLogger, "get(...)");
        companion2.injectSweepOnboardingEventLogger(instance, sweepOnboardingEventLogger);
    }

    /* compiled from: SweepOnboardingSplashFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSplashFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSplashFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "markwon", "Lio/noties/markwon/Markwon;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "sweepOnboardingEventLogger", "Lcom/robinhood/android/lib/sweep/SweepOnboardingEventLogger;", "injectMarkwon", "", "instance", "injectImageLoader", "injectSweepOnboardingEventLogger", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<SweepOnboardingSplashFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<Markwon> markwon, Provider<ImageLoader> imageLoader, Provider<SweepOnboardingEventLogger> sweepOnboardingEventLogger) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            Intrinsics.checkNotNullParameter(sweepOnboardingEventLogger, "sweepOnboardingEventLogger");
            return new SweepOnboardingSplashFragment_MembersInjector(singletons, markwon, imageLoader, sweepOnboardingEventLogger);
        }

        @JvmStatic
        public final void injectMarkwon(SweepOnboardingSplashFragment instance, Markwon markwon) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            instance.setMarkwon(markwon);
        }

        @JvmStatic
        public final void injectImageLoader(SweepOnboardingSplashFragment instance, ImageLoader imageLoader) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            instance.setImageLoader(imageLoader);
        }

        @JvmStatic
        public final void injectSweepOnboardingEventLogger(SweepOnboardingSplashFragment instance, SweepOnboardingEventLogger sweepOnboardingEventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(sweepOnboardingEventLogger, "sweepOnboardingEventLogger");
            instance.setSweepOnboardingEventLogger(sweepOnboardingEventLogger);
        }
    }
}
