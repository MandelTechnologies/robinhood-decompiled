package com.robinhood.android.inbox.p156ui.thread;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.mediaservice.MediaImageLoader;
import com.robinhood.android.navigation.Navigator;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThreadMessageRowView_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadMessageRowView_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/inbox/ui/thread/ThreadMessageRowView;", "mediaImageLoader", "Ljavax/inject/Provider;", "Lcom/robinhood/android/mediaservice/MediaImageLoader;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class ThreadMessageRowView_MembersInjector implements MembersInjector<ThreadMessageRowView> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<MediaImageLoader> mediaImageLoader;
    private final Provider<Navigator> navigator;

    @JvmStatic
    public static final MembersInjector<ThreadMessageRowView> create(Provider<MediaImageLoader> provider, Provider<Navigator> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final void injectMediaImageLoader(ThreadMessageRowView threadMessageRowView, MediaImageLoader mediaImageLoader) {
        INSTANCE.injectMediaImageLoader(threadMessageRowView, mediaImageLoader);
    }

    @JvmStatic
    public static final void injectNavigator(ThreadMessageRowView threadMessageRowView, Navigator navigator) {
        INSTANCE.injectNavigator(threadMessageRowView, navigator);
    }

    public ThreadMessageRowView_MembersInjector(Provider<MediaImageLoader> mediaImageLoader, Provider<Navigator> navigator) {
        Intrinsics.checkNotNullParameter(mediaImageLoader, "mediaImageLoader");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.mediaImageLoader = mediaImageLoader;
        this.navigator = navigator;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ThreadMessageRowView instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        MediaImageLoader mediaImageLoader = this.mediaImageLoader.get();
        Intrinsics.checkNotNullExpressionValue(mediaImageLoader, "get(...)");
        companion.injectMediaImageLoader(instance, mediaImageLoader);
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        companion.injectNavigator(instance, navigator);
    }

    /* compiled from: ThreadMessageRowView_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadMessageRowView_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/inbox/ui/thread/ThreadMessageRowView;", "mediaImageLoader", "Ljavax/inject/Provider;", "Lcom/robinhood/android/mediaservice/MediaImageLoader;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "injectMediaImageLoader", "", "instance", "injectNavigator", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<ThreadMessageRowView> create(Provider<MediaImageLoader> mediaImageLoader, Provider<Navigator> navigator) {
            Intrinsics.checkNotNullParameter(mediaImageLoader, "mediaImageLoader");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            return new ThreadMessageRowView_MembersInjector(mediaImageLoader, navigator);
        }

        @JvmStatic
        public final void injectMediaImageLoader(ThreadMessageRowView instance, MediaImageLoader mediaImageLoader) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(mediaImageLoader, "mediaImageLoader");
            instance.setMediaImageLoader(mediaImageLoader);
        }

        @JvmStatic
        public final void injectNavigator(ThreadMessageRowView instance, Navigator navigator) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            instance.setNavigator(navigator);
        }
    }
}
