package com.robinhood.android.doc.serverdriven.capture;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.doc.C14254R;
import com.robinhood.android.doc.databinding.FragmentDocUploadReviewPhotoBinding;
import com.robinhood.android.doc.p109ui.UtilKt;
import com.robinhood.android.doc.serverdriven.parent.SddrDestination;
import com.robinhood.android.doc.serverdriven.parent.SddrFlowEvent;
import com.robinhood.android.doc.serverdriven.parent.SddrFlowEventReceiver;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.models.api.IdDocument;
import com.robinhood.models.api.PhotoDocument;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.io.File;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SddrReviewPhotoFragment.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0014\u0010\u001b\u001a\u00020\u001c*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/capture/SddrReviewPhotoFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/doc/databinding/FragmentDocUploadReviewPhotoBinding;", "getBinding", "()Lcom/robinhood/android/doc/databinding/FragmentDocUploadReviewPhotoBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEventReceiver;", "getCallbacks", "()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEventReceiver;", "callbacks$delegate", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "transformForDocumentSide", "Lcom/robinhood/android/rhimage/ImageLoader$ImageRequest;", "side", "Lcom/robinhood/models/api/IdDocument$Side;", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SddrReviewPhotoFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public ImageLoader imageLoader;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SddrReviewPhotoFragment.class, "binding", "getBinding()Lcom/robinhood/android/doc/databinding/FragmentDocUploadReviewPhotoBinding;", 0)), Reflection.property1(new PropertyReference1Impl(SddrReviewPhotoFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEventReceiver;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SddrReviewPhotoFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdDocument.Side.values().length];
            try {
                iArr[IdDocument.Side.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdDocument.Side.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdDocument.Side.SELFIE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdDocument.Side.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SddrReviewPhotoFragment() {
        super(C14254R.layout.fragment_doc_upload_review_photo);
        this.binding = ViewBinding5.viewBinding(this, SddrReviewPhotoFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(SddrFlowEventReceiver.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.doc.serverdriven.capture.SddrReviewPhotoFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    private final FragmentDocUploadReviewPhotoBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDocUploadReviewPhotoBinding) value;
    }

    private final SddrFlowEventReceiver getCallbacks() {
        return (SddrFlowEventReceiver) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RhTextView rhTextView = getBinding().photoReviewTitle;
        Resources resources = getResources();
        Companion companion = INSTANCE;
        rhTextView.setText(resources.getString(UtilKt.toIdDocumentReviewPhotoTitle(((SddrDestination.PhotoReview) companion.getArgs((Fragment) this)).getState().getDocumentTypeToUpload())));
        RhTextView rhTextView2 = getBinding().photoReviewSubtitle;
        String documentTypeToUpload = ((SddrDestination.PhotoReview) companion.getArgs((Fragment) this)).getState().getDocumentTypeToUpload();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        rhTextView2.setText(UtilKt.toIdDocumentReviewPhotoSubtitle(documentTypeToUpload, resources2));
        PhotoDocument photo = ((SddrDestination.PhotoReview) companion.getArgs((Fragment) this)).getPhoto();
        ImageLoader imageLoader = getImageLoader();
        File fileStreamPath = requireContext().getFileStreamPath(photo.getSide().name());
        Intrinsics.checkNotNullExpressionValue(fileStreamPath, "getFileStreamPath(...)");
        ImageLoader.ImageRequest imageRequestMemoryPolicy = transformForDocumentSide(imageLoader.load(fileStreamPath), photo.getSide()).memoryPolicy(ImageLoader.MemoryPolicy.NO_CACHE);
        ImageView photoReviewImage = getBinding().photoReviewImage;
        Intrinsics.checkNotNullExpressionValue(photoReviewImage, "photoReviewImage");
        ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestMemoryPolicy, photoReviewImage, null, null, 6, null);
        RdsButton photoReviewNextBtn = getBinding().photoReviewNextBtn;
        Intrinsics.checkNotNullExpressionValue(photoReviewNextBtn, "photoReviewNextBtn");
        OnClickListeners.onClick(photoReviewNextBtn, new Function0() { // from class: com.robinhood.android.doc.serverdriven.capture.SddrReviewPhotoFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SddrReviewPhotoFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        RdsButton photoReviewRetryCta = getBinding().photoReviewRetryCta;
        Intrinsics.checkNotNullExpressionValue(photoReviewRetryCta, "photoReviewRetryCta");
        OnClickListeners.onClick(photoReviewRetryCta, new Function0() { // from class: com.robinhood.android.doc.serverdriven.capture.SddrReviewPhotoFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SddrReviewPhotoFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(SddrReviewPhotoFragment sddrReviewPhotoFragment) {
        SddrFlowEventReceiver callbacks = sddrReviewPhotoFragment.getCallbacks();
        Companion companion = INSTANCE;
        callbacks.onFlowEvent(new SddrFlowEvent.PhotoAccepted(((SddrDestination.PhotoReview) companion.getArgs((Fragment) sddrReviewPhotoFragment)).getState(), ((SddrDestination.PhotoReview) companion.getArgs((Fragment) sddrReviewPhotoFragment)).getPhoto()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(SddrReviewPhotoFragment sddrReviewPhotoFragment) {
        sddrReviewPhotoFragment.getCallbacks().onFlowEvent(SddrFlowEvent.PopBack.INSTANCE);
        return Unit.INSTANCE;
    }

    private final ImageLoader.ImageRequest transformForDocumentSide(ImageLoader.ImageRequest imageRequest, IdDocument.Side side) {
        int i = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
        if (i == 1 || i == 2) {
            return imageRequest.rounded(getResources().getDimension(C13997R.dimen.rds_spacing_small));
        }
        if (i == 3) {
            return imageRequest.circle();
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(side);
        throw new ExceptionsH();
    }

    /* compiled from: SddrReviewPhotoFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/capture/SddrReviewPhotoFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/doc/serverdriven/capture/SddrReviewPhotoFragment;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination$PhotoReview;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<SddrReviewPhotoFragment, SddrDestination.PhotoReview> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public SddrDestination.PhotoReview getArgs(SddrReviewPhotoFragment sddrReviewPhotoFragment) {
            return (SddrDestination.PhotoReview) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, sddrReviewPhotoFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SddrReviewPhotoFragment newInstance(SddrDestination.PhotoReview photoReview) {
            return (SddrReviewPhotoFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, photoReview);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SddrReviewPhotoFragment sddrReviewPhotoFragment, SddrDestination.PhotoReview photoReview) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, sddrReviewPhotoFragment, photoReview);
        }
    }
}
