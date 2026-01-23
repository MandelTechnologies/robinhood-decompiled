package com.robinhood.android.profiles.p218ui.view;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.mediaservice.MediaImageLoader;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfilePictureView_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/profiles/ui/view/ProfilePictureView_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/profiles/ui/view/ProfilePictureView;", "mediaImageLoader", "Ljavax/inject/Provider;", "Lcom/robinhood/android/mediaservice/MediaImageLoader;", "<init>", "(Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-lib-profiles_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ProfilePictureView_MembersInjector implements MembersInjector<ProfilePictureView> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<MediaImageLoader> mediaImageLoader;

    @JvmStatic
    public static final MembersInjector<ProfilePictureView> create(Provider<MediaImageLoader> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final void injectMediaImageLoader(ProfilePictureView profilePictureView, MediaImageLoader mediaImageLoader) {
        INSTANCE.injectMediaImageLoader(profilePictureView, mediaImageLoader);
    }

    public ProfilePictureView_MembersInjector(Provider<MediaImageLoader> mediaImageLoader) {
        Intrinsics.checkNotNullParameter(mediaImageLoader, "mediaImageLoader");
        this.mediaImageLoader = mediaImageLoader;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ProfilePictureView instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        MediaImageLoader mediaImageLoader = this.mediaImageLoader.get();
        Intrinsics.checkNotNullExpressionValue(mediaImageLoader, "get(...)");
        companion.injectMediaImageLoader(instance, mediaImageLoader);
    }

    /* compiled from: ProfilePictureView_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/profiles/ui/view/ProfilePictureView_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/profiles/ui/view/ProfilePictureView;", "mediaImageLoader", "Ljavax/inject/Provider;", "Lcom/robinhood/android/mediaservice/MediaImageLoader;", "injectMediaImageLoader", "", "instance", "feature-lib-profiles_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<ProfilePictureView> create(Provider<MediaImageLoader> mediaImageLoader) {
            Intrinsics.checkNotNullParameter(mediaImageLoader, "mediaImageLoader");
            return new ProfilePictureView_MembersInjector(mediaImageLoader);
        }

        @JvmStatic
        public final void injectMediaImageLoader(ProfilePictureView instance, MediaImageLoader mediaImageLoader) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(mediaImageLoader, "mediaImageLoader");
            instance.setMediaImageLoader(mediaImageLoader);
        }
    }
}
