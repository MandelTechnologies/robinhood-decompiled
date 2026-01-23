package com.robinhood.utils.extensions;

import android.graphics.BitmapFactory;
import android.graphics.Rect;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BitmapFactoryUtils.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/utils/extensions/BitmapFactoryUtils;", "", "<init>", "()V", "calculateSampleSize", "", "inputStream", "Ljava/io/InputStream;", "outPadding", "Landroid/graphics/Rect;", "maxBytes", "", "width", "height", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class BitmapFactoryUtils {
    public static final int $stable = 0;
    public static final BitmapFactoryUtils INSTANCE = new BitmapFactoryUtils();

    private BitmapFactoryUtils() {
    }

    public static /* synthetic */ int calculateSampleSize$default(BitmapFactoryUtils bitmapFactoryUtils, InputStream inputStream, Rect rect, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            rect = null;
        }
        return bitmapFactoryUtils.calculateSampleSize(inputStream, rect, j);
    }

    public final int calculateSampleSize(InputStream inputStream, Rect outPadding, long maxBytes) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        if (maxBytes <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, outPadding, options);
        return calculateSampleSize(options.outWidth, options.outHeight, maxBytes);
    }

    public final int calculateSampleSize(int width, int height, long maxBytes) {
        if (width <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (maxBytes <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return (int) Math.pow(2.0d, Math.ceil(Math.log(((width * height) * 4) / maxBytes) / Math.log(4.0d)));
    }
}
