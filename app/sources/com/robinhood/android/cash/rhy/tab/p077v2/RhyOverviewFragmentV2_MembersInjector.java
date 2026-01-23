package com.robinhood.android.cash.rhy.tab.p077v2;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.cash.rhy.tab.p077v2.prefs.PaycheckModuleInfoBannerDismissTimeoutsPref;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.compose.app.GenericComposeFragment_MembersInjector;
import com.robinhood.compose.app.GenericComposeSingletons;
import com.robinhood.librobinhood.logging.RhyGlobalLoggingContext;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.shared.history.navigation.HistoryNavigator;
import com.robinhood.targetbackend.TargetBackend;
import dagger.MembersInjector;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyOverviewFragmentV2_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0093\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewFragmentV2_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewFragmentV2;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "genericComposeSingletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "mediaImageLoader", "Lcoil/ImageLoader;", "markwon", "Lio/noties/markwon/Markwon;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "rhyGlobalLoggingContext", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "historyNavigator", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "paycheckModuleInfoBannerDismissTimeoutsPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RhyOverviewFragmentV2_MembersInjector implements MembersInjector<RhyOverviewFragmentV2> {
    private final Provider<EventLogger> eventLogger;
    private final Provider<GenericComposeSingletons> genericComposeSingletons;
    private final Provider<HistoryNavigator> historyNavigator;
    private final Provider<ImageLoader> imageLoader;
    private final Provider<Markwon> markwon;
    private final Provider<coil.ImageLoader> mediaImageLoader;
    private final Provider<StringToLongMapPreference> paycheckModuleInfoBannerDismissTimeoutsPref;
    private final Provider<RhyGlobalLoggingContext> rhyGlobalLoggingContext;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<TargetBackend> targetBackend;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<RhyOverviewFragmentV2> create(Provider<BaseFragmentSingletons> provider, Provider<GenericComposeSingletons> provider2, Provider<ImageLoader> provider3, Provider<coil.ImageLoader> provider4, Provider<Markwon> provider5, Provider<EventLogger> provider6, Provider<TargetBackend> provider7, Provider<RhyGlobalLoggingContext> provider8, Provider<HistoryNavigator> provider9, Provider<StringToLongMapPreference> provider10) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    @JvmStatic
    public static final void injectEventLogger(RhyOverviewFragmentV2 rhyOverviewFragmentV2, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(rhyOverviewFragmentV2, eventLogger);
    }

    @JvmStatic
    public static final void injectHistoryNavigator(RhyOverviewFragmentV2 rhyOverviewFragmentV2, HistoryNavigator historyNavigator) {
        INSTANCE.injectHistoryNavigator(rhyOverviewFragmentV2, historyNavigator);
    }

    @JvmStatic
    public static final void injectImageLoader(RhyOverviewFragmentV2 rhyOverviewFragmentV2, ImageLoader imageLoader) {
        INSTANCE.injectImageLoader(rhyOverviewFragmentV2, imageLoader);
    }

    @JvmStatic
    public static final void injectMarkwon(RhyOverviewFragmentV2 rhyOverviewFragmentV2, Markwon markwon) {
        INSTANCE.injectMarkwon(rhyOverviewFragmentV2, markwon);
    }

    @JvmStatic
    public static final void injectMediaImageLoader(RhyOverviewFragmentV2 rhyOverviewFragmentV2, coil.ImageLoader imageLoader) {
        INSTANCE.injectMediaImageLoader(rhyOverviewFragmentV2, imageLoader);
    }

    @JvmStatic
    @PaycheckModuleInfoBannerDismissTimeoutsPref
    public static final void injectPaycheckModuleInfoBannerDismissTimeoutsPref(RhyOverviewFragmentV2 rhyOverviewFragmentV2, StringToLongMapPreference stringToLongMapPreference) {
        INSTANCE.injectPaycheckModuleInfoBannerDismissTimeoutsPref(rhyOverviewFragmentV2, stringToLongMapPreference);
    }

    @JvmStatic
    public static final void injectRhyGlobalLoggingContext(RhyOverviewFragmentV2 rhyOverviewFragmentV2, RhyGlobalLoggingContext rhyGlobalLoggingContext) {
        INSTANCE.injectRhyGlobalLoggingContext(rhyOverviewFragmentV2, rhyGlobalLoggingContext);
    }

    @JvmStatic
    public static final void injectTargetBackend(RhyOverviewFragmentV2 rhyOverviewFragmentV2, TargetBackend targetBackend) {
        INSTANCE.injectTargetBackend(rhyOverviewFragmentV2, targetBackend);
    }

    public RhyOverviewFragmentV2_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<ImageLoader> imageLoader, Provider<coil.ImageLoader> mediaImageLoader, Provider<Markwon> markwon, Provider<EventLogger> eventLogger, Provider<TargetBackend> targetBackend, Provider<RhyGlobalLoggingContext> rhyGlobalLoggingContext, Provider<HistoryNavigator> historyNavigator, Provider<StringToLongMapPreference> paycheckModuleInfoBannerDismissTimeoutsPref) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(mediaImageLoader, "mediaImageLoader");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "rhyGlobalLoggingContext");
        Intrinsics.checkNotNullParameter(historyNavigator, "historyNavigator");
        Intrinsics.checkNotNullParameter(paycheckModuleInfoBannerDismissTimeoutsPref, "paycheckModuleInfoBannerDismissTimeoutsPref");
        this.singletons = singletons;
        this.genericComposeSingletons = genericComposeSingletons;
        this.imageLoader = imageLoader;
        this.mediaImageLoader = mediaImageLoader;
        this.markwon = markwon;
        this.eventLogger = eventLogger;
        this.targetBackend = targetBackend;
        this.rhyGlobalLoggingContext = rhyGlobalLoggingContext;
        this.historyNavigator = historyNavigator;
        this.paycheckModuleInfoBannerDismissTimeoutsPref = paycheckModuleInfoBannerDismissTimeoutsPref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RhyOverviewFragmentV2 instance) {
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
        ImageLoader imageLoader = this.imageLoader.get();
        Intrinsics.checkNotNullExpressionValue(imageLoader, "get(...)");
        companion3.injectImageLoader(instance, imageLoader);
        coil.ImageLoader imageLoader2 = this.mediaImageLoader.get();
        Intrinsics.checkNotNullExpressionValue(imageLoader2, "get(...)");
        companion3.injectMediaImageLoader(instance, imageLoader2);
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        companion3.injectMarkwon(instance, markwon);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion3.injectEventLogger(instance, eventLogger);
        TargetBackend targetBackend = this.targetBackend.get();
        Intrinsics.checkNotNullExpressionValue(targetBackend, "get(...)");
        companion3.injectTargetBackend(instance, targetBackend);
        RhyGlobalLoggingContext rhyGlobalLoggingContext = this.rhyGlobalLoggingContext.get();
        Intrinsics.checkNotNullExpressionValue(rhyGlobalLoggingContext, "get(...)");
        companion3.injectRhyGlobalLoggingContext(instance, rhyGlobalLoggingContext);
        HistoryNavigator historyNavigator = this.historyNavigator.get();
        Intrinsics.checkNotNullExpressionValue(historyNavigator, "get(...)");
        companion3.injectHistoryNavigator(instance, historyNavigator);
        StringToLongMapPreference stringToLongMapPreference = this.paycheckModuleInfoBannerDismissTimeoutsPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToLongMapPreference, "get(...)");
        companion3.injectPaycheckModuleInfoBannerDismissTimeoutsPref(instance, stringToLongMapPreference);
    }

    /* compiled from: RhyOverviewFragmentV2_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u009a\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\bH\u0007J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010!\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010$\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0018\u0010%\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0007¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewFragmentV2_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewFragmentV2;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "genericComposeSingletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "mediaImageLoader", "Lcoil/ImageLoader;", "markwon", "Lio/noties/markwon/Markwon;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "rhyGlobalLoggingContext", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "historyNavigator", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "paycheckModuleInfoBannerDismissTimeoutsPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "injectImageLoader", "", "instance", "injectMediaImageLoader", "injectMarkwon", "injectEventLogger", "injectTargetBackend", "injectRhyGlobalLoggingContext", "injectHistoryNavigator", "injectPaycheckModuleInfoBannerDismissTimeoutsPref", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<RhyOverviewFragmentV2> create(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<ImageLoader> imageLoader, Provider<coil.ImageLoader> mediaImageLoader, Provider<Markwon> markwon, Provider<EventLogger> eventLogger, Provider<TargetBackend> targetBackend, Provider<RhyGlobalLoggingContext> rhyGlobalLoggingContext, Provider<HistoryNavigator> historyNavigator, Provider<StringToLongMapPreference> paycheckModuleInfoBannerDismissTimeoutsPref) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            Intrinsics.checkNotNullParameter(mediaImageLoader, "mediaImageLoader");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "rhyGlobalLoggingContext");
            Intrinsics.checkNotNullParameter(historyNavigator, "historyNavigator");
            Intrinsics.checkNotNullParameter(paycheckModuleInfoBannerDismissTimeoutsPref, "paycheckModuleInfoBannerDismissTimeoutsPref");
            return new RhyOverviewFragmentV2_MembersInjector(singletons, genericComposeSingletons, imageLoader, mediaImageLoader, markwon, eventLogger, targetBackend, rhyGlobalLoggingContext, historyNavigator, paycheckModuleInfoBannerDismissTimeoutsPref);
        }

        @JvmStatic
        public final void injectImageLoader(RhyOverviewFragmentV2 instance, ImageLoader imageLoader) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            instance.setImageLoader(imageLoader);
        }

        @JvmStatic
        public final void injectMediaImageLoader(RhyOverviewFragmentV2 instance, coil.ImageLoader mediaImageLoader) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(mediaImageLoader, "mediaImageLoader");
            instance.setMediaImageLoader(mediaImageLoader);
        }

        @JvmStatic
        public final void injectMarkwon(RhyOverviewFragmentV2 instance, Markwon markwon) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            instance.setMarkwon(markwon);
        }

        @JvmStatic
        public final void injectEventLogger(RhyOverviewFragmentV2 instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectTargetBackend(RhyOverviewFragmentV2 instance, TargetBackend targetBackend) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            instance.setTargetBackend(targetBackend);
        }

        @JvmStatic
        public final void injectRhyGlobalLoggingContext(RhyOverviewFragmentV2 instance, RhyGlobalLoggingContext rhyGlobalLoggingContext) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "rhyGlobalLoggingContext");
            instance.setRhyGlobalLoggingContext(rhyGlobalLoggingContext);
        }

        @JvmStatic
        public final void injectHistoryNavigator(RhyOverviewFragmentV2 instance, HistoryNavigator historyNavigator) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(historyNavigator, "historyNavigator");
            instance.setHistoryNavigator(historyNavigator);
        }

        @JvmStatic
        @PaycheckModuleInfoBannerDismissTimeoutsPref
        public final void injectPaycheckModuleInfoBannerDismissTimeoutsPref(RhyOverviewFragmentV2 instance, StringToLongMapPreference paycheckModuleInfoBannerDismissTimeoutsPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(paycheckModuleInfoBannerDismissTimeoutsPref, "paycheckModuleInfoBannerDismissTimeoutsPref");
            instance.setPaycheckModuleInfoBannerDismissTimeoutsPref(paycheckModuleInfoBannerDismissTimeoutsPref);
        }
    }
}
