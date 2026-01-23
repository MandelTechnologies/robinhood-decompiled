package com.robinhood.android.mediaservice.p181ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.mediaservice.C21792R;
import com.robinhood.android.mediaservice.MediaImageLoader;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.models.p320db.MediaMetadata;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ImageViewerFragment.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0016J\u001a\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020!H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/mediaservice/ui/ImageViewerFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "mediaImageLoader", "Lcom/robinhood/android/mediaservice/MediaImageLoader;", "getMediaImageLoader", "()Lcom/robinhood/android/mediaservice/MediaImageLoader;", "setMediaImageLoader", "(Lcom/robinhood/android/mediaservice/MediaImageLoader;)V", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "progressBar$delegate", "Lkotlin/properties/ReadOnlyProperty;", "errorView", "Lcom/robinhood/android/common/view/ErrorView;", "getErrorView", "()Lcom/robinhood/android/common/view/ErrorView;", "errorView$delegate", "mediaImg", "Landroid/widget/ImageView;", "getMediaImg", "()Landroid/widget/ImageView;", "mediaImg$delegate", ImageViewerFragment.ARG_MEDIA_METADATA, "Lcom/robinhood/models/db/MediaMetadata;", "getMediaMetadata", "()Lcom/robinhood/models/db/MediaMetadata;", "mediaMetadata$delegate", "Lkotlin/Lazy;", "onAttach", "", "context", "Landroid/content/Context;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "Companion", "lib-media-service_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ImageViewerFragment extends BaseFragment {
    private static final String ARG_MEDIA_METADATA = "mediaMetadata";

    /* renamed from: errorView$delegate, reason: from kotlin metadata */
    private final Interfaces2 errorView;
    public MediaImageLoader mediaImageLoader;

    /* renamed from: mediaImg$delegate, reason: from kotlin metadata */
    private final Interfaces2 mediaImg;

    /* renamed from: mediaMetadata$delegate, reason: from kotlin metadata */
    private final Lazy mediaMetadata;

    /* renamed from: progressBar$delegate, reason: from kotlin metadata */
    private final Interfaces2 progressBar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ImageViewerFragment.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0)), Reflection.property1(new PropertyReference1Impl(ImageViewerFragment.class, "errorView", "getErrorView()Lcom/robinhood/android/common/view/ErrorView;", 0)), Reflection.property1(new PropertyReference1Impl(ImageViewerFragment.class, "mediaImg", "getMediaImg()Landroid/widget/ImageView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public ImageViewerFragment() {
        super(C21792R.layout.fragment_image_viewer);
        this.progressBar = bindView(C21792R.id.image_viewer_progress_bar);
        this.errorView = bindView(C21792R.id.image_viewer_error_view);
        this.mediaImg = bindView(C21792R.id.image_viewer_media_img);
        this.mediaMetadata = Fragments2.argument(this, ARG_MEDIA_METADATA);
    }

    public final MediaImageLoader getMediaImageLoader() {
        MediaImageLoader mediaImageLoader = this.mediaImageLoader;
        if (mediaImageLoader != null) {
            return mediaImageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mediaImageLoader");
        return null;
    }

    public final void setMediaImageLoader(MediaImageLoader mediaImageLoader) {
        Intrinsics.checkNotNullParameter(mediaImageLoader, "<set-?>");
        this.mediaImageLoader = mediaImageLoader;
    }

    private final ProgressBar getProgressBar() {
        return (ProgressBar) this.progressBar.getValue(this, $$delegatedProperties[0]);
    }

    private final ErrorView getErrorView() {
        return (ErrorView) this.errorView.getValue(this, $$delegatedProperties[1]);
    }

    private final ImageView getMediaImg() {
        return (ImageView) this.mediaImg.getValue(this, $$delegatedProperties[2]);
    }

    private final MediaMetadata getMediaMetadata() {
        return (MediaMetadata) this.mediaMetadata.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        getScarletManager().putOverlay(DayNightOverlay.NIGHT, Boolean.FALSE);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getErrorView().showPrimaryButton(false);
        getMediaImageLoader().load(getMediaMetadata()).fit().centerInside().into(getMediaImg(), new Function0() { // from class: com.robinhood.android.mediaservice.ui.ImageViewerFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ImageViewerFragment.onViewCreated$lambda$0(this.f$0);
            }
        }, new Function0() { // from class: com.robinhood.android.mediaservice.ui.ImageViewerFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ImageViewerFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(ImageViewerFragment imageViewerFragment) {
        imageViewerFragment.getProgressBar().setVisibility(8);
        imageViewerFragment.getErrorView().setVisibility(8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(ImageViewerFragment imageViewerFragment) {
        imageViewerFragment.getProgressBar().setVisibility(8);
        imageViewerFragment.getErrorView().setVisibility(0);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getMediaImageLoader().cancelRequest(getMediaImg());
        super.onDestroyView();
    }

    /* compiled from: ImageViewerFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/mediaservice/ui/ImageViewerFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$MediaImageViewer;", "<init>", "()V", "ARG_MEDIA_METADATA", "", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "lib-media-service_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.MediaImageViewer> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.MediaImageViewer key) {
            Intrinsics.checkNotNullParameter(key, "key");
            ImageViewerFragment imageViewerFragment = new ImageViewerFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(ImageViewerFragment.ARG_MEDIA_METADATA, key.getMediaMetadata());
            imageViewerFragment.setArguments(bundle);
            return imageViewerFragment;
        }
    }
}
