package com.robinhood.android.mediaservice.p181ui;

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
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CropImageActivity.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0017H\u0016J\u0016\u0010\u001e\u001a\u00020\u00172\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J\b\u0010\"\u001a\u00020\u0017H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/mediaservice/ui/CropImageActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/mediaservice/ui/CropImageFragment$Callbacks;", "<init>", "()V", "mediaUtils", "Lcom/robinhood/android/mediaservice/utils/internal/MediaUtils;", "getMediaUtils", "()Lcom/robinhood/android/mediaservice/utils/internal/MediaUtils;", "setMediaUtils", "(Lcom/robinhood/android/mediaservice/utils/internal/MediaUtils;)V", "originalUri", "Landroid/net/Uri;", "getOriginalUri", "()Landroid/net/Uri;", "originalUri$delegate", "Lkotlin/Lazy;", "cropImageArgs", "Lcom/robinhood/android/mediaservice/CropImageArgs;", "getCropImageArgs", "()Lcom/robinhood/android/mediaservice/CropImageArgs;", "cropImageArgs$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onImageCropSuccess", "bitmap", "Landroid/graphics/Bitmap;", "onImageCropFailure", "setSuccessResultAndFinish", "imageFileNames", "", "", "setErrorResultAndFinish", "Companion", "lib-media-service_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CropImageActivity extends BaseActivity implements CropImageFragment.Callbacks {
    private static final String EXTRA_CROP_ARGS = "cropArgs";
    private static final String EXTRA_IMAGE_URI = "cropImageUri";
    public static final int RESULT_ERROR = 2;

    /* renamed from: cropImageArgs$delegate, reason: from kotlin metadata */
    private final Lazy cropImageArgs;
    public MediaUtils mediaUtils;

    /* renamed from: originalUri$delegate, reason: from kotlin metadata */
    private final Lazy originalUri;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public CropImageActivity() {
        super(C21792R.layout.activity_crop_image);
        this.originalUri = Activity.intentExtra(this, EXTRA_IMAGE_URI);
        this.cropImageArgs = Activity.intentExtra(this, EXTRA_CROP_ARGS);
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

    private final Uri getOriginalUri() {
        return (Uri) this.originalUri.getValue();
    }

    private final CropImageArgs getCropImageArgs() {
        return (CropImageArgs) this.cropImageArgs.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setFragment(C21792R.id.fragment_container, CropImageFragment.INSTANCE.newInstance(getOriginalUri(), getCropImageArgs()));
    }

    @Override // com.robinhood.android.mediaservice.ui.CropImageFragment.Callbacks
    public void onImageCropSuccess(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        bind(SinglesAndroid.observeOnMainThread(getMediaUtils().saveImageToDisk$lib_media_service_externalDebug(bitmap)), LifecycleEvent.ON_DESTROY).subscribeKotlin(new Function1() { // from class: com.robinhood.android.mediaservice.ui.CropImageActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CropImageActivity.onImageCropSuccess$lambda$0(this.f$0, (String) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.mediaservice.ui.CropImageActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CropImageActivity.onImageCropSuccess$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onImageCropSuccess$lambda$0(CropImageActivity cropImageActivity, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cropImageActivity.setSuccessResultAndFinish(CollectionsKt.listOf(it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onImageCropSuccess$lambda$1(CropImageActivity cropImageActivity, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cropImageActivity.setErrorResultAndFinish();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.mediaservice.ui.CropImageFragment.Callbacks
    public void onImageCropFailure() {
        setErrorResultAndFinish();
    }

    private final void setSuccessResultAndFinish(List<String> imageFileNames) {
        Intent intent = new Intent();
        getMediaUtils().putImageFileNamesToIntent$lib_media_service_externalDebug(imageFileNames, intent);
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
        finish();
    }

    private final void setErrorResultAndFinish() {
        setResult(2);
        finish();
    }

    /* compiled from: CropImageActivity.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/mediaservice/ui/CropImageActivity$Companion;", "", "<init>", "()V", "RESULT_ERROR", "", "EXTRA_IMAGE_URI", "", "EXTRA_CROP_ARGS", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "cropImageArgs", "Lcom/robinhood/android/mediaservice/CropImageArgs;", "lib-media-service_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent getIntent(Context context, Uri uri, CropImageArgs cropImageArgs) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intent intent = new Intent(context, (Class<?>) CropImageActivity.class);
            intent.putExtra(CropImageActivity.EXTRA_IMAGE_URI, uri);
            intent.putExtra(CropImageActivity.EXTRA_CROP_ARGS, cropImageArgs);
            return intent;
        }
    }
}
