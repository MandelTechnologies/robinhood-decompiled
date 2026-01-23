package com.robinhood.android.mediaservice;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.robinhood.android.mediaservice.p181ui.ImagePickerActivity;
import com.robinhood.android.mediaservice.utils.internal.MediaUtils;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Single;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImagePicker.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0019\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0002\u0010\u0011J\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00132\u0006\u0010\u0016\u001a\u00020\u0007J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00142\u0006\u0010\u0016\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/mediaservice/ImagePicker;", "", "mediaUtils", "Lcom/robinhood/android/mediaservice/utils/internal/MediaUtils;", "<init>", "(Lcom/robinhood/android/mediaservice/utils/internal/MediaUtils;)V", "getImagePickerIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "cropImageArgs", "Lcom/robinhood/android/mediaservice/CropImageArgs;", "sizeLimitInBytes", "", "applyExifRotation", "", "supportHeic", "(Landroid/content/Context;Lcom/robinhood/android/mediaservice/CropImageArgs;Ljava/lang/Long;ZZ)Landroid/content/Intent;", "extractImagesFromResultIntent", "Lio/reactivex/Single;", "", "Landroid/graphics/Bitmap;", WebsocketGatewayConstants.DATA_KEY, "extractImageFilesFromData", "Ljava/io/File;", "CropShape", "Companion", "lib-media-service_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class ImagePicker {
    public static final int RESULT_ERROR = 3;
    public static final int RESULT_EXCEEDED_SIZE_LIMIT = 4;
    public static final int RESULT_NO_ACTIVITY_FOUND = 2;
    private final MediaUtils mediaUtils;
    public static final int $stable = 8;

    public ImagePicker(MediaUtils mediaUtils) {
        Intrinsics.checkNotNullParameter(mediaUtils, "mediaUtils");
        this.mediaUtils = mediaUtils;
    }

    public static /* synthetic */ Intent getImagePickerIntent$default(ImagePicker imagePicker, Context context, CropImageArgs cropImageArgs, Long l, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            cropImageArgs = null;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        return imagePicker.getImagePickerIntent(context, cropImageArgs, l, z, z2);
    }

    public final Intent getImagePickerIntent(Context context, CropImageArgs cropImageArgs, Long sizeLimitInBytes, boolean applyExifRotation, boolean supportHeic) {
        Intrinsics.checkNotNullParameter(context, "context");
        return ImagePickerActivity.INSTANCE.getIntent$lib_media_service_externalDebug(context, cropImageArgs, sizeLimitInBytes, applyExifRotation, supportHeic);
    }

    public final Single<List<Bitmap>> extractImagesFromResultIntent(Intent data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return this.mediaUtils.extractAndDeleteImagesFromResultIntent(data);
    }

    public final List<File> extractImageFilesFromData(Intent data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return this.mediaUtils.extractCanonicalFilesFromData(data);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImagePicker.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/mediaservice/ImagePicker$CropShape;", "", "<init>", "(Ljava/lang/String;I)V", "RECTANGLE", "OVAL", "lib-media-service_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CropShape {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CropShape[] $VALUES;
        public static final CropShape RECTANGLE = new CropShape("RECTANGLE", 0);
        public static final CropShape OVAL = new CropShape("OVAL", 1);

        private static final /* synthetic */ CropShape[] $values() {
            return new CropShape[]{RECTANGLE, OVAL};
        }

        public static EnumEntries<CropShape> getEntries() {
            return $ENTRIES;
        }

        private CropShape(String str, int i) {
        }

        static {
            CropShape[] cropShapeArr$values = $values();
            $VALUES = cropShapeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(cropShapeArr$values);
        }

        public static CropShape valueOf(String str) {
            return (CropShape) Enum.valueOf(CropShape.class, str);
        }

        public static CropShape[] values() {
            return (CropShape[]) $VALUES.clone();
        }
    }
}
