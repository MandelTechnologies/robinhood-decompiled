package com.robinhood.android.mediaservice.p181ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.mediaservice.C21792R;
import com.robinhood.android.mediaservice.CropImageArgs;
import com.robinhood.android.mediaservice.p181ui.CropImageFragment;
import com.robinhood.android.mediaservice.utils.internal.MediaUtils;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImagePickerActivity.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 82\u00020\u00012\u00020\u0002:\u00018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\b\u0010'\u001a\u00020$H\u0014J\"\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\"H\u0014J\u0010\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020$H\u0016J\u0010\u00101\u001a\u00020$2\u0006\u0010,\u001a\u00020\"H\u0002J\u0016\u00102\u001a\u00020$2\f\u00103\u001a\b\u0012\u0004\u0012\u00020504H\u0002J\b\u00106\u001a\u00020$H\u0002J\b\u00107\u001a\u00020$H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001c\u0010\u000eR\u001b\u0010\u001e\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b\u001f\u0010\u000eR\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/mediaservice/ui/ImagePickerActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/mediaservice/ui/CropImageFragment$Callbacks;", "<init>", "()V", "mediaUtils", "Lcom/robinhood/android/mediaservice/utils/internal/MediaUtils;", "getMediaUtils", "()Lcom/robinhood/android/mediaservice/utils/internal/MediaUtils;", "setMediaUtils", "(Lcom/robinhood/android/mediaservice/utils/internal/MediaUtils;)V", ImagePickerActivity.EXTRA_ALLOW_MULTIPLE, "", "getAllowMultiple", "()Z", "allowMultiple$delegate", "Lkotlin/Lazy;", "cropImageArgs", "Lcom/robinhood/android/mediaservice/CropImageArgs;", "getCropImageArgs", "()Lcom/robinhood/android/mediaservice/CropImageArgs;", "cropImageArgs$delegate", ImagePickerActivity.EXTRA_SIZE_LIMIT_IN_BYTES, "", "getSizeLimitInBytes", "()Ljava/lang/Long;", "sizeLimitInBytes$delegate", ImagePickerActivity.EXTRA_APPLY_EXIF_ROTATION, "getApplyExifRotation", "applyExifRotation$delegate", ImagePickerActivity.EXTRA_SUPPORT_HEIC, "getSupportHeic", "supportHeic$delegate", "pendingResult", "Landroid/content/Intent;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "onImageCropSuccess", "bitmap", "Landroid/graphics/Bitmap;", "onImageCropFailure", "handleSelectedImage", "setSuccessResultAndFinish", "imageFileNames", "", "", "setErrorResultAndFinish", "setSizeErrorResultAndFinish", "Companion", "lib-media-service_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class ImagePickerActivity extends BaseActivity implements CropImageFragment.Callbacks {
    private static final String EXTRA_ALLOW_MULTIPLE = "allowMultiple";
    private static final String EXTRA_APPLY_EXIF_ROTATION = "applyExifRotation";
    private static final String EXTRA_CROP_ARGS = "cropArgs";
    private static final String EXTRA_SIZE_LIMIT_IN_BYTES = "sizeLimitInBytes";
    private static final String EXTRA_SUPPORT_HEIC = "supportHeic";
    private static final int REQUEST_CODE = 1;

    /* renamed from: allowMultiple$delegate, reason: from kotlin metadata */
    private final Lazy allowMultiple;

    /* renamed from: applyExifRotation$delegate, reason: from kotlin metadata */
    private final Lazy applyExifRotation;

    /* renamed from: cropImageArgs$delegate, reason: from kotlin metadata */
    private final Lazy cropImageArgs;
    public MediaUtils mediaUtils;
    private Intent pendingResult;

    /* renamed from: sizeLimitInBytes$delegate, reason: from kotlin metadata */
    private final Lazy sizeLimitInBytes;

    /* renamed from: supportHeic$delegate, reason: from kotlin metadata */
    private final Lazy supportHeic;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public ImagePickerActivity() {
        super(C21792R.layout.activity_image_picker);
        this.allowMultiple = Activity.intentExtra(this, EXTRA_ALLOW_MULTIPLE);
        this.cropImageArgs = Activity.intentExtra(this, EXTRA_CROP_ARGS);
        this.sizeLimitInBytes = Activity.intentExtra(this, EXTRA_SIZE_LIMIT_IN_BYTES);
        this.applyExifRotation = Activity.intentExtra(this, EXTRA_APPLY_EXIF_ROTATION);
        this.supportHeic = Activity.intentExtra(this, EXTRA_SUPPORT_HEIC);
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

    private final boolean getAllowMultiple() {
        return ((Boolean) this.allowMultiple.getValue()).booleanValue();
    }

    private final CropImageArgs getCropImageArgs() {
        return (CropImageArgs) this.cropImageArgs.getValue();
    }

    private final Long getSizeLimitInBytes() {
        return (Long) this.sizeLimitInBytes.getValue();
    }

    private final boolean getApplyExifRotation() {
        return ((Boolean) this.applyExifRotation.getValue()).booleanValue();
    }

    private final boolean getSupportHeic() {
        return ((Boolean) this.supportHeic.getValue()).booleanValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            try {
                startActivityForResult(getMediaUtils().getImagePickerIntent$lib_media_service_externalDebug(getAllowMultiple(), getSupportHeic()), 1);
            } catch (ActivityNotFoundException unused) {
                setResult(2);
                finish();
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        Single map;
        super.onResume();
        final Intent intent = this.pendingResult;
        if (intent == null) {
            return;
        }
        this.pendingResult = null;
        Uri data = intent.getData();
        Intrinsics.checkNotNull(data);
        final Long sizeLimitInBytes = getSizeLimitInBytes();
        if (sizeLimitInBytes == null) {
            map = Single.just(Boolean.TRUE);
        } else {
            map = getMediaUtils().getFileSizeFromContentUri(this, data).map(new Function() { // from class: com.robinhood.android.mediaservice.ui.ImagePickerActivity.onResume.1
                @Override // io.reactivex.functions.Function
                public final Boolean apply(Long it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(it.longValue() < sizeLimitInBytes.longValue());
                }
            });
        }
        Single singleSubscribeOn = map.subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "subscribeOn(...)");
        bind(SinglesAndroid.observeOnMainThread(singleSubscribeOn), LifecycleEvent.ON_DESTROY).subscribeKotlin(new Function1() { // from class: com.robinhood.android.mediaservice.ui.ImagePickerActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImagePickerActivity.onResume$lambda$0(this.f$0, intent, (Boolean) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.mediaservice.ui.ImagePickerActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImagePickerActivity.onResume$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(ImagePickerActivity imagePickerActivity, Intent intent, Boolean bool) {
        if (bool.booleanValue()) {
            imagePickerActivity.handleSelectedImage(intent);
        } else {
            imagePickerActivity.setSizeErrorResultAndFinish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(ImagePickerActivity imagePickerActivity, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        imagePickerActivity.setErrorResultAndFinish();
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != 1) {
            super.onActivityResult(requestCode, resultCode, data);
        } else if (resultCode == -1) {
            this.pendingResult = data;
        } else {
            finish();
        }
    }

    @Override // com.robinhood.android.mediaservice.ui.CropImageFragment.Callbacks
    public void onImageCropSuccess(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        bind(SinglesAndroid.observeOnMainThread(getMediaUtils().saveImageToDisk$lib_media_service_externalDebug(bitmap)), LifecycleEvent.ON_DESTROY).subscribeKotlin(new Function1() { // from class: com.robinhood.android.mediaservice.ui.ImagePickerActivity$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImagePickerActivity.onImageCropSuccess$lambda$2(this.f$0, (String) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.mediaservice.ui.ImagePickerActivity$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImagePickerActivity.onImageCropSuccess$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onImageCropSuccess$lambda$2(ImagePickerActivity imagePickerActivity, String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        imagePickerActivity.setSuccessResultAndFinish(CollectionsKt.listOf(fileName));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onImageCropSuccess$lambda$3(ImagePickerActivity imagePickerActivity, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        imagePickerActivity.setErrorResultAndFinish();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.mediaservice.ui.CropImageFragment.Callbacks
    public void onImageCropFailure() {
        setErrorResultAndFinish();
    }

    private final void handleSelectedImage(Intent data) {
        if (getCropImageArgs() != null) {
            Uri data2 = data.getData();
            if (data2 != null) {
                int i = C21792R.id.fragment_container;
                CropImageFragment.Companion companion = CropImageFragment.INSTANCE;
                CropImageArgs cropImageArgs = getCropImageArgs();
                Intrinsics.checkNotNull(cropImageArgs);
                setFragment(i, companion.newInstance(data2, cropImageArgs));
                return;
            }
            return;
        }
        bind(SinglesAndroid.observeOnMainThread(getMediaUtils().saveImagesToDisk$lib_media_service_externalDebug(this, data, getAllowMultiple(), getApplyExifRotation())), LifecycleEvent.ON_DESTROY).subscribeKotlin(new Function1() { // from class: com.robinhood.android.mediaservice.ui.ImagePickerActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImagePickerActivity.handleSelectedImage$lambda$4(this.f$0, (List) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.mediaservice.ui.ImagePickerActivity$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImagePickerActivity.handleSelectedImage$lambda$5(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleSelectedImage$lambda$4(ImagePickerActivity imagePickerActivity, List fileNames) {
        Intrinsics.checkNotNullParameter(fileNames, "fileNames");
        imagePickerActivity.setSuccessResultAndFinish(fileNames);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleSelectedImage$lambda$5(ImagePickerActivity imagePickerActivity, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        imagePickerActivity.setErrorResultAndFinish();
        return Unit.INSTANCE;
    }

    private final void setSuccessResultAndFinish(List<String> imageFileNames) {
        Intent intent = new Intent();
        getMediaUtils().putImageFileNamesToIntent$lib_media_service_externalDebug(imageFileNames, intent);
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
        finish();
    }

    private final void setErrorResultAndFinish() {
        setResult(3);
        finish();
    }

    private final void setSizeErrorResultAndFinish() {
        setResult(4);
        finish();
    }

    /* compiled from: ImagePickerActivity.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/mediaservice/ui/ImagePickerActivity$Companion;", "", "<init>", "()V", "REQUEST_CODE", "", "EXTRA_ALLOW_MULTIPLE", "", "EXTRA_CROP_ARGS", "EXTRA_SIZE_LIMIT_IN_BYTES", "EXTRA_APPLY_EXIF_ROTATION", "EXTRA_SUPPORT_HEIC", "getMultipleImageIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", ImagePickerActivity.EXTRA_SIZE_LIMIT_IN_BYTES, "", ImagePickerActivity.EXTRA_APPLY_EXIF_ROTATION, "", ImagePickerActivity.EXTRA_SUPPORT_HEIC, "getMultipleImageIntent$lib_media_service_externalDebug", "(Landroid/content/Context;Ljava/lang/Long;ZZ)Landroid/content/Intent;", "getIntent", "cropImageArgs", "Lcom/robinhood/android/mediaservice/CropImageArgs;", "getIntent$lib_media_service_externalDebug", "(Landroid/content/Context;Lcom/robinhood/android/mediaservice/CropImageArgs;Ljava/lang/Long;ZZ)Landroid/content/Intent;", "lib-media-service_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent getMultipleImageIntent$lib_media_service_externalDebug(Context context, Long sizeLimitInBytes, boolean applyExifRotation, boolean supportHeic) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) ImagePickerActivity.class);
            intent.putExtra(ImagePickerActivity.EXTRA_ALLOW_MULTIPLE, true);
            intent.putExtra(ImagePickerActivity.EXTRA_SIZE_LIMIT_IN_BYTES, sizeLimitInBytes);
            intent.putExtra(ImagePickerActivity.EXTRA_APPLY_EXIF_ROTATION, applyExifRotation);
            intent.putExtra(ImagePickerActivity.EXTRA_SUPPORT_HEIC, supportHeic);
            return intent;
        }

        public final Intent getIntent$lib_media_service_externalDebug(Context context, CropImageArgs cropImageArgs, Long sizeLimitInBytes, boolean applyExifRotation, boolean supportHeic) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) ImagePickerActivity.class);
            intent.putExtra(ImagePickerActivity.EXTRA_ALLOW_MULTIPLE, false);
            intent.putExtra(ImagePickerActivity.EXTRA_CROP_ARGS, cropImageArgs);
            intent.putExtra(ImagePickerActivity.EXTRA_SIZE_LIMIT_IN_BYTES, sizeLimitInBytes);
            intent.putExtra(ImagePickerActivity.EXTRA_APPLY_EXIF_ROTATION, applyExifRotation);
            intent.putExtra(ImagePickerActivity.EXTRA_SUPPORT_HEIC, supportHeic);
            return intent;
        }
    }
}
