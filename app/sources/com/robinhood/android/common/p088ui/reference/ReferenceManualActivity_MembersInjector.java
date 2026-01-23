package com.robinhood.android.common.p088ui.reference;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.markdown.ContentRenderer;
import dagger.MembersInjector;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReferenceManualActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/ui/reference/ReferenceManualActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/ui/reference/ReferenceManualActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "contentRenderer", "Lcom/robinhood/contentful/markdown/ContentRenderer;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "markwonBuilder", "Lio/noties/markwon/Markwon$Builder;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ReferenceManualActivity_MembersInjector implements MembersInjector<ReferenceManualActivity> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<ContentRenderer> contentRenderer;
    private final Provider<Markwon.Builder> markwonBuilder;
    private final Provider<BaseActivitySingletons> singletons;
    private final Provider<StaticContentStore> staticContentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<ReferenceManualActivity> create(Provider<BaseActivitySingletons> provider, Provider<ContentRenderer> provider2, Provider<StaticContentStore> provider3, Provider<Markwon.Builder> provider4, Provider<AnalyticsLogger> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectAnalytics(ReferenceManualActivity referenceManualActivity, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(referenceManualActivity, analyticsLogger);
    }

    @JvmStatic
    public static final void injectContentRenderer(ReferenceManualActivity referenceManualActivity, ContentRenderer contentRenderer) {
        INSTANCE.injectContentRenderer(referenceManualActivity, contentRenderer);
    }

    @JvmStatic
    public static final void injectMarkwonBuilder(ReferenceManualActivity referenceManualActivity, Markwon.Builder builder) {
        INSTANCE.injectMarkwonBuilder(referenceManualActivity, builder);
    }

    @JvmStatic
    public static final void injectStaticContentStore(ReferenceManualActivity referenceManualActivity, StaticContentStore staticContentStore) {
        INSTANCE.injectStaticContentStore(referenceManualActivity, staticContentStore);
    }

    public ReferenceManualActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<ContentRenderer> contentRenderer, Provider<StaticContentStore> staticContentStore, Provider<Markwon.Builder> markwonBuilder, Provider<AnalyticsLogger> analytics) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(contentRenderer, "contentRenderer");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(markwonBuilder, "markwonBuilder");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.singletons = singletons;
        this.contentRenderer = contentRenderer;
        this.staticContentStore = staticContentStore;
        this.markwonBuilder = markwonBuilder;
        this.analytics = analytics;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ReferenceManualActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        ContentRenderer contentRenderer = this.contentRenderer.get();
        Intrinsics.checkNotNullExpressionValue(contentRenderer, "get(...)");
        companion2.injectContentRenderer(instance, contentRenderer);
        StaticContentStore staticContentStore = this.staticContentStore.get();
        Intrinsics.checkNotNullExpressionValue(staticContentStore, "get(...)");
        companion2.injectStaticContentStore(instance, staticContentStore);
        Markwon.Builder builder = this.markwonBuilder.get();
        Intrinsics.checkNotNullExpressionValue(builder, "get(...)");
        companion2.injectMarkwonBuilder(instance, builder);
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion2.injectAnalytics(instance, analyticsLogger);
    }

    /* compiled from: ReferenceManualActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/common/ui/reference/ReferenceManualActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/ui/reference/ReferenceManualActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "contentRenderer", "Lcom/robinhood/contentful/markdown/ContentRenderer;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "markwonBuilder", "Lio/noties/markwon/Markwon$Builder;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "injectContentRenderer", "", "instance", "injectStaticContentStore", "injectMarkwonBuilder", "injectAnalytics", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<ReferenceManualActivity> create(Provider<BaseActivitySingletons> singletons, Provider<ContentRenderer> contentRenderer, Provider<StaticContentStore> staticContentStore, Provider<Markwon.Builder> markwonBuilder, Provider<AnalyticsLogger> analytics) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(contentRenderer, "contentRenderer");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(markwonBuilder, "markwonBuilder");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            return new ReferenceManualActivity_MembersInjector(singletons, contentRenderer, staticContentStore, markwonBuilder, analytics);
        }

        @JvmStatic
        public final void injectContentRenderer(ReferenceManualActivity instance, ContentRenderer contentRenderer) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(contentRenderer, "contentRenderer");
            instance.setContentRenderer(contentRenderer);
        }

        @JvmStatic
        public final void injectStaticContentStore(ReferenceManualActivity instance, StaticContentStore staticContentStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            instance.setStaticContentStore(staticContentStore);
        }

        @JvmStatic
        public final void injectMarkwonBuilder(ReferenceManualActivity instance, Markwon.Builder markwonBuilder) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(markwonBuilder, "markwonBuilder");
            instance.setMarkwonBuilder(markwonBuilder);
        }

        @JvmStatic
        public final void injectAnalytics(ReferenceManualActivity instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }
    }
}
