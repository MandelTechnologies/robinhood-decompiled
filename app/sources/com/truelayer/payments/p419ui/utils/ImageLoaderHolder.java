package com.truelayer.payments.p419ui.utils;

import android.content.Context;
import coil.ComponentRegistry;
import coil.ImageLoader;
import coil.decode.SvgDecoder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ImageLoaderHolder.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/truelayer/payments/ui/utils/ImageLoaderHolder;", "", "()V", "loader", "Lcoil/ImageLoader;", "context", "Landroid/content/Context;", "localInspectionMode", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ImageLoaderHolder {
    private static volatile ImageLoader loader;
    public static final ImageLoaderHolder INSTANCE = new ImageLoaderHolder();
    public static final int $stable = 8;

    private ImageLoaderHolder() {
    }

    public final ImageLoader loader(Context context, boolean localInspectionMode) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (this) {
            try {
                ImageLoader imageLoader = loader;
                if (imageLoader != null) {
                    return imageLoader;
                }
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                ImageLoader.Builder builder = new ImageLoader.Builder(applicationContext);
                if (!localInspectionMode) {
                    ComponentRegistry.Builder builder2 = new ComponentRegistry.Builder();
                    builder2.add(new SvgDecoder.Factory(false, 1, null));
                    builder.components(builder2.build());
                }
                loader = builder.build();
                ImageLoader imageLoader2 = loader;
                Intrinsics.checkNotNull(imageLoader2);
                return imageLoader2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
