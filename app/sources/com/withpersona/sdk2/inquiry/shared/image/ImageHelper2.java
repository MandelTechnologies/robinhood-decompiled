package com.withpersona.sdk2.inquiry.shared.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.p481io.Closeable;
import kotlin.ranges.RangesKt;

/* compiled from: ImageHelper.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J&\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0002J\u001e\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002¨\u0006\u0013"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/image/RealImageHelper;", "Lcom/withpersona/sdk2/inquiry/shared/image/ImageHelper;", "<init>", "()V", "resizeAndCompressImageInPlace", "", "file", "Ljava/io/File;", "writeExifData", "exifData", "", "", "extractExifData", "calculateInSampleSize", "", "options", "Landroid/graphics/BitmapFactory$Options;", "reqWidth", "reqHeight", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.shared.image.RealImageHelper, reason: use source file name */
/* loaded from: classes18.dex */
public final class ImageHelper2 implements ImageHelper {
    @Override // com.withpersona.sdk2.inquiry.shared.image.ImageHelper
    public void resizeAndCompressImageInPlace(File file) throws Throwable {
        Intrinsics.checkNotNullParameter(file, "file");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        Map<String, String> mapExtractExifData = extractExifData(file);
        try {
            String absolutePath = file.getAbsolutePath();
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = calculateInSampleSize(options, 2000, 2000);
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(absolutePath, options2);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            if (bitmapDecodeFile != null) {
                try {
                    bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                } finally {
                }
            }
            Closeable.closeFinally(fileOutputStream, null);
            if (bitmapDecodeFile != null) {
                bitmapDecodeFile.recycle();
            }
        } catch (IllegalArgumentException unused) {
        }
        writeExifData(file, mapExtractExifData);
    }

    private final void writeExifData(File file, Map<String, String> exifData) throws Throwable {
        try {
            ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
            Iterator<T> it = exifData.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    exifInterface.setAttribute(str, str2);
                }
            }
            exifInterface.saveAttributes();
        } catch (IOException unused) {
        }
    }

    private final Map<String, String> extractExifData(File file) {
        try {
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{"DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "Make", "Model", "Orientation", "SubSecTime", "WhiteBalance"});
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                ExifInterface exifInterface = new ExifInterface(fileInputStream);
                List list = listListOf;
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                for (Object obj : list) {
                    linkedHashMap.put(obj, exifInterface.getAttribute((String) obj));
                }
                Closeable.closeFinally(fileInputStream, null);
                return linkedHashMap;
            } finally {
            }
        } catch (IOException unused) {
            return MapsKt.emptyMap();
        }
    }

    private final int calculateInSampleSize(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        int i = options.outHeight;
        int i2 = options.outWidth;
        if (i > reqHeight || i2 > reqWidth) {
            return Math.min(MathKt.roundToInt(i / reqHeight), MathKt.roundToInt(i2 / reqWidth));
        }
        return 1;
    }
}
