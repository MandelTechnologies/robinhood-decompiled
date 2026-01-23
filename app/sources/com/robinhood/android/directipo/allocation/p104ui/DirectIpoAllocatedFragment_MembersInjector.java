package com.robinhood.android.directipo.allocation.p104ui;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.api.directipo.DirectIpoApi;
import dagger.MembersInjector;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoAllocatedFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/DirectIpoAllocatedFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/directipo/allocation/ui/DirectIpoAllocatedFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "markwon", "Lio/noties/markwon/Markwon;", "directIpoSharableImageManager", "Lcom/robinhood/android/directipo/allocation/ui/DirectIpoSharableImageManager;", "api", "Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DirectIpoAllocatedFragment_MembersInjector implements MembersInjector<DirectIpoAllocatedFragment> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<DirectIpoApi> api;
    private final Provider<DirectIpoSharableImageManager> directIpoSharableImageManager;
    private final Provider<Markwon> markwon;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<DirectIpoAllocatedFragment> create(Provider<BaseFragmentSingletons> provider, Provider<AnalyticsLogger> provider2, Provider<Markwon> provider3, Provider<DirectIpoSharableImageManager> provider4, Provider<DirectIpoApi> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectAnalytics(DirectIpoAllocatedFragment directIpoAllocatedFragment, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(directIpoAllocatedFragment, analyticsLogger);
    }

    @JvmStatic
    public static final void injectApi(DirectIpoAllocatedFragment directIpoAllocatedFragment, DirectIpoApi directIpoApi) {
        INSTANCE.injectApi(directIpoAllocatedFragment, directIpoApi);
    }

    @JvmStatic
    public static final void injectDirectIpoSharableImageManager(DirectIpoAllocatedFragment directIpoAllocatedFragment, DirectIpoSharableImageManager directIpoSharableImageManager) {
        INSTANCE.injectDirectIpoSharableImageManager(directIpoAllocatedFragment, directIpoSharableImageManager);
    }

    @JvmStatic
    public static final void injectMarkwon(DirectIpoAllocatedFragment directIpoAllocatedFragment, Markwon markwon) {
        INSTANCE.injectMarkwon(directIpoAllocatedFragment, markwon);
    }

    public DirectIpoAllocatedFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<Markwon> markwon, Provider<DirectIpoSharableImageManager> directIpoSharableImageManager, Provider<DirectIpoApi> api) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(directIpoSharableImageManager, "directIpoSharableImageManager");
        Intrinsics.checkNotNullParameter(api, "api");
        this.singletons = singletons;
        this.analytics = analytics;
        this.markwon = markwon;
        this.directIpoSharableImageManager = directIpoSharableImageManager;
        this.api = api;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DirectIpoAllocatedFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion2.injectAnalytics(instance, analyticsLogger);
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        companion2.injectMarkwon(instance, markwon);
        DirectIpoSharableImageManager directIpoSharableImageManager = this.directIpoSharableImageManager.get();
        Intrinsics.checkNotNullExpressionValue(directIpoSharableImageManager, "get(...)");
        companion2.injectDirectIpoSharableImageManager(instance, directIpoSharableImageManager);
        DirectIpoApi directIpoApi = this.api.get();
        Intrinsics.checkNotNullExpressionValue(directIpoApi, "get(...)");
        companion2.injectApi(instance, directIpoApi);
    }

    /* compiled from: DirectIpoAllocatedFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/DirectIpoAllocatedFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/directipo/allocation/ui/DirectIpoAllocatedFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "markwon", "Lio/noties/markwon/Markwon;", "directIpoSharableImageManager", "Lcom/robinhood/android/directipo/allocation/ui/DirectIpoSharableImageManager;", "api", "Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;", "injectAnalytics", "", "instance", "injectMarkwon", "injectDirectIpoSharableImageManager", "injectApi", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<DirectIpoAllocatedFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<Markwon> markwon, Provider<DirectIpoSharableImageManager> directIpoSharableImageManager, Provider<DirectIpoApi> api) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(directIpoSharableImageManager, "directIpoSharableImageManager");
            Intrinsics.checkNotNullParameter(api, "api");
            return new DirectIpoAllocatedFragment_MembersInjector(singletons, analytics, markwon, directIpoSharableImageManager, api);
        }

        @JvmStatic
        public final void injectAnalytics(DirectIpoAllocatedFragment instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }

        @JvmStatic
        public final void injectMarkwon(DirectIpoAllocatedFragment instance, Markwon markwon) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            instance.setMarkwon(markwon);
        }

        @JvmStatic
        public final void injectDirectIpoSharableImageManager(DirectIpoAllocatedFragment instance, DirectIpoSharableImageManager directIpoSharableImageManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(directIpoSharableImageManager, "directIpoSharableImageManager");
            instance.setDirectIpoSharableImageManager(directIpoSharableImageManager);
        }

        @JvmStatic
        public final void injectApi(DirectIpoAllocatedFragment instance, DirectIpoApi api) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(api, "api");
            instance.setApi(api);
        }
    }
}
