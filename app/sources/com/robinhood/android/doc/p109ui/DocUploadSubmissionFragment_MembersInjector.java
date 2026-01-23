package com.robinhood.android.doc.p109ui;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idupload.IdUploadSubmissionStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocUploadSubmissionFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/DocUploadSubmissionFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/doc/ui/DocUploadSubmissionFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "idUploadSubmissionStore", "Lcom/robinhood/android/idupload/IdUploadSubmissionStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DocUploadSubmissionFragment_MembersInjector implements MembersInjector<DocUploadSubmissionFragment> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<IdUploadSubmissionStore> idUploadSubmissionStore;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<DocUploadSubmissionFragment> create(Provider<BaseFragmentSingletons> provider, Provider<IdUploadSubmissionStore> provider2, Provider<AnalyticsLogger> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectAnalytics(DocUploadSubmissionFragment docUploadSubmissionFragment, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(docUploadSubmissionFragment, analyticsLogger);
    }

    @JvmStatic
    public static final void injectIdUploadSubmissionStore(DocUploadSubmissionFragment docUploadSubmissionFragment, IdUploadSubmissionStore idUploadSubmissionStore) {
        INSTANCE.injectIdUploadSubmissionStore(docUploadSubmissionFragment, idUploadSubmissionStore);
    }

    public DocUploadSubmissionFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<IdUploadSubmissionStore> idUploadSubmissionStore, Provider<AnalyticsLogger> analytics) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(idUploadSubmissionStore, "idUploadSubmissionStore");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.singletons = singletons;
        this.idUploadSubmissionStore = idUploadSubmissionStore;
        this.analytics = analytics;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DocUploadSubmissionFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        IdUploadSubmissionStore idUploadSubmissionStore = this.idUploadSubmissionStore.get();
        Intrinsics.checkNotNullExpressionValue(idUploadSubmissionStore, "get(...)");
        companion2.injectIdUploadSubmissionStore(instance, idUploadSubmissionStore);
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion2.injectAnalytics(instance, analyticsLogger);
    }

    /* compiled from: DocUploadSubmissionFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/DocUploadSubmissionFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/doc/ui/DocUploadSubmissionFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "idUploadSubmissionStore", "Lcom/robinhood/android/idupload/IdUploadSubmissionStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "injectIdUploadSubmissionStore", "", "instance", "injectAnalytics", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<DocUploadSubmissionFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<IdUploadSubmissionStore> idUploadSubmissionStore, Provider<AnalyticsLogger> analytics) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(idUploadSubmissionStore, "idUploadSubmissionStore");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            return new DocUploadSubmissionFragment_MembersInjector(singletons, idUploadSubmissionStore, analytics);
        }

        @JvmStatic
        public final void injectIdUploadSubmissionStore(DocUploadSubmissionFragment instance, IdUploadSubmissionStore idUploadSubmissionStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(idUploadSubmissionStore, "idUploadSubmissionStore");
            instance.setIdUploadSubmissionStore(idUploadSubmissionStore);
        }

        @JvmStatic
        public final void injectAnalytics(DocUploadSubmissionFragment instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }
    }
}
