package com.robinhood.android.supportchat;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import coil.Coil;
import coil.request.ImageRequest;
import coil.request.ImageResult2;
import coil.request.ImageResult3;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.mediaservice.RedirectImageLoader;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.android.supportchat.SupportChatImageViewerKey;
import com.robinhood.android.supportchat.databinding.FragmentImageViewerBinding;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.shared.support.supportchat.util.ChatImages;
import com.robinhood.targetbackend.Endpoint;
import java.io.File;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SupportChatImageViewerFragment.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0002J&\u0010\u001d\u001a\u00020\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001fH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/supportchat/SupportChatImageViewerFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "endpoint", "Lcom/robinhood/targetbackend/Endpoint;", "getEndpoint", "()Lcom/robinhood/targetbackend/Endpoint;", "setEndpoint", "(Lcom/robinhood/targetbackend/Endpoint;)V", "redirectImageLoader", "Lcom/robinhood/android/mediaservice/RedirectImageLoader;", "getRedirectImageLoader", "()Lcom/robinhood/android/mediaservice/RedirectImageLoader;", "setRedirectImageLoader", "(Lcom/robinhood/android/mediaservice/RedirectImageLoader;)V", "binding", "Lcom/robinhood/android/supportchat/databinding/FragmentImageViewerBinding;", "getBinding", "()Lcom/robinhood/android/supportchat/databinding/FragmentImageViewerBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "loadImage", "setVisibleElements", "loading", "", "image", "error", "Companion", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class SupportChatImageViewerFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public Endpoint endpoint;
    public RedirectImageLoader redirectImageLoader;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SupportChatImageViewerFragment.class, "binding", "getBinding()Lcom/robinhood/android/supportchat/databinding/FragmentImageViewerBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public SupportChatImageViewerFragment() {
        super(C29104R.layout.fragment_image_viewer);
        this.binding = ViewBinding5.viewBinding(this, SupportChatImageViewerFragment2.INSTANCE);
    }

    public final Endpoint getEndpoint() {
        Endpoint endpoint = this.endpoint;
        if (endpoint != null) {
            return endpoint;
        }
        Intrinsics.throwUninitializedPropertyAccessException("endpoint");
        return null;
    }

    public final void setEndpoint(Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(endpoint, "<set-?>");
        this.endpoint = endpoint;
    }

    public final RedirectImageLoader getRedirectImageLoader() {
        RedirectImageLoader redirectImageLoader = this.redirectImageLoader;
        if (redirectImageLoader != null) {
            return redirectImageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("redirectImageLoader");
        return null;
    }

    public final void setRedirectImageLoader(RedirectImageLoader redirectImageLoader) {
        Intrinsics.checkNotNullParameter(redirectImageLoader, "<set-?>");
        this.redirectImageLoader = redirectImageLoader;
    }

    private final FragmentImageViewerBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentImageViewerBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        loadImage();
        getBinding().imageError.setOnPrimaryButtonClick(new Function0() { // from class: com.robinhood.android.supportchat.SupportChatImageViewerFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SupportChatImageViewerFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(SupportChatImageViewerFragment supportChatImageViewerFragment) {
        supportChatImageViewerFragment.loadImage();
        return Unit.INSTANCE;
    }

    private final void loadImage() {
        setVisibleElements$default(this, true, false, false, 6, null);
        SupportChatImageViewerKey supportChatImageViewerKey = (SupportChatImageViewerKey) INSTANCE.getArgs((Fragment) this);
        if (supportChatImageViewerKey instanceof SupportChatImageViewerKey.IdentiSource) {
            ImageLoader.ImageRequest imageRequestLoad = getRedirectImageLoader().load(ChatImages.generateImageUrl$default(getEndpoint().getIdentiUrl(), ((SupportChatImageViewerKey.IdentiSource) supportChatImageViewerKey).getDocumentId(), null, null, 12, null));
            ImageView imageView = getBinding().imageView;
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            imageRequestLoad.into(imageView, new Function0() { // from class: com.robinhood.android.supportchat.SupportChatImageViewerFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SupportChatImageViewerFragment.loadImage$lambda$1(this.f$0);
                }
            }, new Function0() { // from class: com.robinhood.android.supportchat.SupportChatImageViewerFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SupportChatImageViewerFragment.loadImage$lambda$2(this.f$0);
                }
            });
            return;
        }
        if (!(supportChatImageViewerKey instanceof SupportChatImageViewerKey.FileSource)) {
            throw new NoWhenBranchMatchedException();
        }
        ImageView imageView2 = getBinding().imageView;
        Intrinsics.checkNotNullExpressionValue(imageView2, "imageView");
        File file = ((SupportChatImageViewerKey.FileSource) supportChatImageViewerKey).getFile();
        coil.ImageLoader imageLoader = Coil.imageLoader(imageView2.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView2.getContext()).data(file).target(imageView2);
        builderTarget.listener(new ImageRequest.Listener(this) { // from class: com.robinhood.android.supportchat.SupportChatImageViewerFragment$loadImage$lambda$5$$inlined$listener$default$1
            @Override // coil.request.ImageRequest.Listener
            public void onCancel(ImageRequest request) {
            }

            @Override // coil.request.ImageRequest.Listener
            public void onStart(ImageRequest request) {
            }

            @Override // coil.request.ImageRequest.Listener
            public void onError(ImageRequest request, ImageResult2 result) {
                SupportChatImageViewerFragment.setVisibleElements$default(this.this$0, false, false, true, 3, null);
            }

            @Override // coil.request.ImageRequest.Listener
            public void onSuccess(ImageRequest request, ImageResult3 result) {
                SupportChatImageViewerFragment.setVisibleElements$default(this.this$0, false, true, false, 5, null);
            }
        });
        imageLoader.enqueue(builderTarget.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadImage$lambda$1(SupportChatImageViewerFragment supportChatImageViewerFragment) {
        setVisibleElements$default(supportChatImageViewerFragment, false, true, false, 5, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadImage$lambda$2(SupportChatImageViewerFragment supportChatImageViewerFragment) {
        setVisibleElements$default(supportChatImageViewerFragment, false, false, true, 3, null);
        return Unit.INSTANCE;
    }

    static /* synthetic */ void setVisibleElements$default(SupportChatImageViewerFragment supportChatImageViewerFragment, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        supportChatImageViewerFragment.setVisibleElements(z, z2, z3);
    }

    private final void setVisibleElements(boolean loading, boolean image, boolean error) {
        if (isAtMost(LifecycleEvent.ON_STOP)) {
            ShimmerLoadingView imageLoadingView = getBinding().imageLoadingView;
            Intrinsics.checkNotNullExpressionValue(imageLoadingView, "imageLoadingView");
            imageLoadingView.setVisibility(loading ? 0 : 8);
            ImageView imageView = getBinding().imageView;
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            imageView.setVisibility(!image ? 4 : 0);
            ErrorView imageError = getBinding().imageError;
            Intrinsics.checkNotNullExpressionValue(imageError, "imageError");
            imageError.setVisibility(error ? 0 : 8);
        }
    }

    /* compiled from: SupportChatImageViewerFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/supportchat/SupportChatImageViewerFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/supportchat/SupportChatImageViewerFragment;", "Lcom/robinhood/android/supportchat/SupportChatImageViewerKey;", "<init>", "()V", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<SupportChatImageViewerFragment, SupportChatImageViewerKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(SupportChatImageViewerKey supportChatImageViewerKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, supportChatImageViewerKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public SupportChatImageViewerKey getArgs(SupportChatImageViewerFragment supportChatImageViewerFragment) {
            return (SupportChatImageViewerKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, supportChatImageViewerFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SupportChatImageViewerFragment newInstance(SupportChatImageViewerKey supportChatImageViewerKey) {
            return (SupportChatImageViewerFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, supportChatImageViewerKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SupportChatImageViewerFragment supportChatImageViewerFragment, SupportChatImageViewerKey supportChatImageViewerKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, supportChatImageViewerFragment, supportChatImageViewerKey);
        }
    }
}
