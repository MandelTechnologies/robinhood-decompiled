package com.robinhood.android.mediaservice.p181ui;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.mediaservice.MediaImageLoader;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageViewerFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/mediaservice/ui/ImageViewerFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/mediaservice/ui/ImageViewerFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "mediaImageLoader", "Lcom/robinhood/android/mediaservice/MediaImageLoader;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-media-service_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ImageViewerFragment_MembersInjector implements MembersInjector<ImageViewerFragment> {
    private final Provider<MediaImageLoader> mediaImageLoader;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<ImageViewerFragment> create(Provider<BaseFragmentSingletons> provider, Provider<MediaImageLoader> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final void injectMediaImageLoader(ImageViewerFragment imageViewerFragment, MediaImageLoader mediaImageLoader) {
        INSTANCE.injectMediaImageLoader(imageViewerFragment, mediaImageLoader);
    }

    public ImageViewerFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<MediaImageLoader> mediaImageLoader) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(mediaImageLoader, "mediaImageLoader");
        this.singletons = singletons;
        this.mediaImageLoader = mediaImageLoader;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ImageViewerFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        MediaImageLoader mediaImageLoader = this.mediaImageLoader.get();
        Intrinsics.checkNotNullExpressionValue(mediaImageLoader, "get(...)");
        companion2.injectMediaImageLoader(instance, mediaImageLoader);
    }

    /* compiled from: ImageViewerFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/mediaservice/ui/ImageViewerFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/mediaservice/ui/ImageViewerFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "mediaImageLoader", "Lcom/robinhood/android/mediaservice/MediaImageLoader;", "injectMediaImageLoader", "", "instance", "lib-media-service_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<ImageViewerFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<MediaImageLoader> mediaImageLoader) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(mediaImageLoader, "mediaImageLoader");
            return new ImageViewerFragment_MembersInjector(singletons, mediaImageLoader);
        }

        @JvmStatic
        public final void injectMediaImageLoader(ImageViewerFragment instance, MediaImageLoader mediaImageLoader) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(mediaImageLoader, "mediaImageLoader");
            instance.setMediaImageLoader(mediaImageLoader);
        }
    }
}
