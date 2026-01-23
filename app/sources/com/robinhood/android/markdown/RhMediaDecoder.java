package com.robinhood.android.markdown;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import io.noties.markwon.image.MediaDecoder;
import java.io.InputStream;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhMediaDecoder.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/markdown/RhMediaDecoder;", "Lio/noties/markwon/image/MediaDecoder;", "<init>", "()V", "resources", "Landroid/content/res/Resources;", "getResources", "()Landroid/content/res/Resources;", "decode", "Landroid/graphics/drawable/Drawable;", "contentType", "", "inputStream", "Ljava/io/InputStream;", "supportedTypes", "", "lib-markdown_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class RhMediaDecoder extends MediaDecoder {
    public static final RhMediaDecoder INSTANCE = new RhMediaDecoder();
    private static final Resources resources;

    private RhMediaDecoder() {
    }

    static {
        Resources system = Resources.getSystem();
        Intrinsics.checkNotNullExpressionValue(system, "getSystem(...)");
        resources = system;
    }

    public final Resources getResources() {
        return resources;
    }

    @Override // io.noties.markwon.image.MediaDecoder
    public Drawable decode(String contentType, InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
            inputStream.close();
            return new BitmapDrawable(resources, bitmapDecodeStream);
        } catch (Throwable th) {
            throw new IllegalStateException("Exception decoding input-stream", th);
        }
    }

    @Override // io.noties.markwon.image.MediaDecoder
    public Set<String> supportedTypes() {
        return SetsKt.emptySet();
    }
}
