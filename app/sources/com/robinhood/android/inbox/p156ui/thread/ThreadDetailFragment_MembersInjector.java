package com.robinhood.android.inbox.p156ui.thread;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.notification.NotificationManager;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.mediaservice.ImagePicker;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThreadDetailFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadDetailFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "imagePicker", "Lcom/robinhood/android/mediaservice/ImagePicker;", "notificationHandler", "Lcom/robinhood/android/common/notification/NotificationManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ThreadDetailFragment_MembersInjector implements MembersInjector<ThreadDetailFragment> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<ImagePicker> imagePicker;
    private final Provider<NotificationManager> notificationHandler;
    private final Provider<BaseFragmentSingletons> singletons;

    @JvmStatic
    public static final MembersInjector<ThreadDetailFragment> create(Provider<BaseFragmentSingletons> provider, Provider<AnalyticsLogger> provider2, Provider<ImagePicker> provider3, Provider<NotificationManager> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectAnalytics(ThreadDetailFragment threadDetailFragment, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(threadDetailFragment, analyticsLogger);
    }

    @JvmStatic
    public static final void injectImagePicker(ThreadDetailFragment threadDetailFragment, ImagePicker imagePicker) {
        INSTANCE.injectImagePicker(threadDetailFragment, imagePicker);
    }

    @JvmStatic
    public static final void injectNotificationHandler(ThreadDetailFragment threadDetailFragment, NotificationManager notificationManager) {
        INSTANCE.injectNotificationHandler(threadDetailFragment, notificationManager);
    }

    public ThreadDetailFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<ImagePicker> imagePicker, Provider<NotificationManager> notificationHandler) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(imagePicker, "imagePicker");
        Intrinsics.checkNotNullParameter(notificationHandler, "notificationHandler");
        this.singletons = singletons;
        this.analytics = analytics;
        this.imagePicker = imagePicker;
        this.notificationHandler = notificationHandler;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ThreadDetailFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion2.injectAnalytics(instance, analyticsLogger);
        ImagePicker imagePicker = this.imagePicker.get();
        Intrinsics.checkNotNullExpressionValue(imagePicker, "get(...)");
        companion2.injectImagePicker(instance, imagePicker);
        NotificationManager notificationManager = this.notificationHandler.get();
        Intrinsics.checkNotNullExpressionValue(notificationManager, "get(...)");
        companion2.injectNotificationHandler(instance, notificationManager);
    }

    /* compiled from: ThreadDetailFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadDetailFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "imagePicker", "Lcom/robinhood/android/mediaservice/ImagePicker;", "notificationHandler", "Lcom/robinhood/android/common/notification/NotificationManager;", "injectAnalytics", "", "instance", "injectImagePicker", "injectNotificationHandler", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<ThreadDetailFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<ImagePicker> imagePicker, Provider<NotificationManager> notificationHandler) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(imagePicker, "imagePicker");
            Intrinsics.checkNotNullParameter(notificationHandler, "notificationHandler");
            return new ThreadDetailFragment_MembersInjector(singletons, analytics, imagePicker, notificationHandler);
        }

        @JvmStatic
        public final void injectAnalytics(ThreadDetailFragment instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }

        @JvmStatic
        public final void injectImagePicker(ThreadDetailFragment instance, ImagePicker imagePicker) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(imagePicker, "imagePicker");
            instance.setImagePicker(imagePicker);
        }

        @JvmStatic
        public final void injectNotificationHandler(ThreadDetailFragment instance, NotificationManager notificationHandler) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(notificationHandler, "notificationHandler");
            instance.setNotificationHandler(notificationHandler);
        }
    }
}
