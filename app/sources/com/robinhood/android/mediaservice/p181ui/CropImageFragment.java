package com.robinhood.android.mediaservice.p181ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.canhub.cropper.CropImageView;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.mediaservice.C21792R;
import com.robinhood.android.mediaservice.CropImageArgs;
import com.robinhood.android.mediaservice.ImagePicker;
import com.robinhood.android.mediaservice.p181ui.CropImageFragment;
import com.robinhood.android.mediaservice.utils.internal.MediaUtils;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.BitmapFactoryUtils;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.io.IOException;
import java.util.NoSuchElementException;
import kotlin.Lazy;
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
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;

/* compiled from: CropImageFragment.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 52\u00020\u0001:\u000245B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0016J\u001a\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u00020+H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b\"\u0010#R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u000f\u001a\u0004\b'\u0010(¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/mediaservice/ui/CropImageFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "mediaUtils", "Lcom/robinhood/android/mediaservice/utils/internal/MediaUtils;", "getMediaUtils", "()Lcom/robinhood/android/mediaservice/utils/internal/MediaUtils;", "setMediaUtils", "(Lcom/robinhood/android/mediaservice/utils/internal/MediaUtils;)V", "cropImageView", "Lcom/canhub/cropper/CropImageView;", "getCropImageView", "()Lcom/canhub/cropper/CropImageView;", "cropImageView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "progressBar$delegate", "acceptBtn", "Landroid/widget/Button;", "getAcceptBtn", "()Landroid/widget/Button;", "acceptBtn$delegate", CropImageFragment.ARG_IMAGE_URI, "Landroid/net/Uri;", "getImageUri", "()Landroid/net/Uri;", "imageUri$delegate", "Lkotlin/Lazy;", "args", "Lcom/robinhood/android/mediaservice/CropImageArgs;", "getArgs", "()Lcom/robinhood/android/mediaservice/CropImageArgs;", "args$delegate", "callbacks", "Lcom/robinhood/android/mediaservice/ui/CropImageFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/mediaservice/ui/CropImageFragment$Callbacks;", "callbacks$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "Callbacks", "Companion", "lib-media-service_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CropImageFragment extends BaseFragment {
    private static final String ARG_CROP_ARGS = "cropArgs";
    private static final String ARG_IMAGE_URI = "imageUri";

    /* renamed from: acceptBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 acceptBtn;

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final Lazy args;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: cropImageView$delegate, reason: from kotlin metadata */
    private final Interfaces2 cropImageView;

    /* renamed from: imageUri$delegate, reason: from kotlin metadata */
    private final Lazy imageUri;
    public MediaUtils mediaUtils;

    /* renamed from: progressBar$delegate, reason: from kotlin metadata */
    private final Interfaces2 progressBar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CropImageFragment.class, "cropImageView", "getCropImageView()Lcom/canhub/cropper/CropImageView;", 0)), Reflection.property1(new PropertyReference1Impl(CropImageFragment.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0)), Reflection.property1(new PropertyReference1Impl(CropImageFragment.class, "acceptBtn", "getAcceptBtn()Landroid/widget/Button;", 0)), Reflection.property1(new PropertyReference1Impl(CropImageFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/mediaservice/ui/CropImageFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CropImageFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/mediaservice/ui/CropImageFragment$Callbacks;", "", "onImageCropSuccess", "", "bitmap", "Landroid/graphics/Bitmap;", "onImageCropFailure", "lib-media-service_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onImageCropFailure();

        void onImageCropSuccess(Bitmap bitmap);
    }

    /* compiled from: CropImageFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImagePicker.CropShape.values().length];
            try {
                iArr[ImagePicker.CropShape.RECTANGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImagePicker.CropShape.OVAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CropImageFragment() {
        super(C21792R.layout.fragment_crop_image);
        this.cropImageView = bindView(C21792R.id.crop_image_crop_image_view);
        this.progressBar = bindView(C21792R.id.crop_image_progress_bar);
        this.acceptBtn = bindView(C21792R.id.crop_image_accept_btn);
        this.imageUri = Fragments2.argument(this, ARG_IMAGE_URI);
        this.args = Fragments2.argument(this, ARG_CROP_ARGS);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.mediaservice.ui.CropImageFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof CropImageFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    public final MediaUtils getMediaUtils() {
        MediaUtils mediaUtils = this.mediaUtils;
        if (mediaUtils != null) {
            return mediaUtils;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mediaUtils");
        return null;
    }

    public final void setMediaUtils(MediaUtils mediaUtils) {
        Intrinsics.checkNotNullParameter(mediaUtils, "<set-?>");
        this.mediaUtils = mediaUtils;
    }

    private final CropImageView getCropImageView() {
        return (CropImageView) this.cropImageView.getValue(this, $$delegatedProperties[0]);
    }

    private final ProgressBar getProgressBar() {
        return (ProgressBar) this.progressBar.getValue(this, $$delegatedProperties[1]);
    }

    private final Button getAcceptBtn() {
        return (Button) this.acceptBtn.getValue(this, $$delegatedProperties[2]);
    }

    private final Uri getImageUri() {
        return (Uri) this.imageUri.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CropImageArgs getArgs() {
        return (CropImageArgs) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[3]);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (!(context instanceof Callbacks)) {
            throw new IllegalArgumentException((context + " must implement " + Callbacks.class.getName()).toString());
        }
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        CropImageView.CropShape cropShape;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ViewCompat.setOnApplyWindowInsetsListener(view, new OnApplyWindowInsetsListener() { // from class: com.robinhood.android.mediaservice.ui.CropImageFragment.onViewCreated.1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat insets) {
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(insets, "insets");
                Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), insets2.bottom);
                return insets;
            }
        });
        if (getArgs().getAlwaysUseNightTheme()) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(fragmentActivityRequireActivity), DayNightOverlay.NIGHT, null, 2, null);
        }
        String confirmButtonTitle = getArgs().getConfirmButtonTitle();
        if (confirmButtonTitle != null) {
            getAcceptBtn().setText(confirmButtonTitle);
        }
        Integer aspectRatioWidth = getArgs().getAspectRatioWidth();
        Integer aspectRatioHeight = getArgs().getAspectRatioHeight();
        if (aspectRatioWidth != null && aspectRatioHeight != null) {
            getCropImageView().setAspectRatio(aspectRatioWidth.intValue(), aspectRatioHeight.intValue());
            CropImageView cropImageView = getCropImageView();
            int i = WhenMappings.$EnumSwitchMapping$0[getArgs().getCropShape().ordinal()];
            if (i == 1) {
                cropShape = CropImageView.CropShape.RECTANGLE;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                cropShape = CropImageView.CropShape.OVAL;
            }
            cropImageView.setCropShape(cropShape);
        }
        getCropImageView().setImageUriAsync(getImageUri());
        OnClickListeners.onClick(getAcceptBtn(), new Function0() { // from class: com.robinhood.android.mediaservice.ui.CropImageFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CropImageFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
        getCropImageView().setOnCropImageCompleteListener(new CropImageView.OnCropImageCompleteListener() { // from class: com.robinhood.android.mediaservice.ui.CropImageFragment.onViewCreated.4
            @Override // com.canhub.cropper.CropImageView.OnCropImageCompleteListener
            public final void onCropImageComplete(CropImageView cropImageView2, CropImageView.CropResult result) throws IOException {
                Intrinsics.checkNotNullParameter(cropImageView2, "cropImageView");
                Intrinsics.checkNotNullParameter(result, "result");
                if (!result.isSuccessful()) {
                    CropImageFragment.this.getCallbacks().onImageCropFailure();
                    return;
                }
                Bitmap bitmap = result.getBitmap();
                if (bitmap == null) {
                    Context context = cropImageView2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    bitmap = result.getBitmap(context);
                    Intrinsics.checkNotNull(bitmap);
                }
                int iCalculateSampleSize = BitmapFactoryUtils.INSTANCE.calculateSampleSize(bitmap.getWidth(), bitmap.getHeight(), CropImageFragment.this.getArgs().getMaxFinalImageSizeBytes());
                if (iCalculateSampleSize > 1) {
                    bitmap = Bitmap.createScaledBitmap(bitmap, RangesKt.coerceAtLeast(bitmap.getWidth() / iCalculateSampleSize, 1), RangesKt.coerceAtLeast(bitmap.getHeight() / iCalculateSampleSize, 1), false);
                }
                Intrinsics.checkNotNull(bitmap);
                Uri uriContent = result.getUriContent();
                if (uriContent != null) {
                    CropImageFragment.this.getMediaUtils().deleteImageFromDisk$lib_media_service_externalDebug(uriContent);
                }
                CropImageFragment.this.getCallbacks().onImageCropSuccess(bitmap);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(CropImageFragment cropImageFragment) {
        cropImageFragment.getAcceptBtn().setEnabled(false);
        cropImageFragment.getProgressBar().setVisibility(0);
        CropImageView.croppedImageAsync$default(cropImageFragment.getCropImageView(), null, 0, 0, 0, CropImageView.RequestSizeOptions.NONE, null, 47, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getCropImageView().setOnCropImageCompleteListener(null);
    }

    /* compiled from: CropImageFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/mediaservice/ui/CropImageFragment$Companion;", "", "<init>", "()V", "ARG_IMAGE_URI", "", "ARG_CROP_ARGS", "newInstance", "Lcom/robinhood/android/mediaservice/ui/CropImageFragment;", CropImageFragment.ARG_IMAGE_URI, "Landroid/net/Uri;", "cropImageArgs", "Lcom/robinhood/android/mediaservice/CropImageArgs;", "lib-media-service_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CropImageFragment newInstance(Uri imageUri, CropImageArgs cropImageArgs) {
            Intrinsics.checkNotNullParameter(imageUri, "imageUri");
            Intrinsics.checkNotNullParameter(cropImageArgs, "cropImageArgs");
            CropImageFragment cropImageFragment = new CropImageFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(CropImageFragment.ARG_IMAGE_URI, imageUri);
            bundle.putParcelable(CropImageFragment.ARG_CROP_ARGS, cropImageArgs);
            cropImageFragment.setArguments(bundle);
            return cropImageFragment;
        }
    }
}
