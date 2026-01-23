package com.robinhood.android.markdown.elements;

import android.net.Uri;
import android.util.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.commonmark.node.Image;

/* compiled from: MeasuredImage.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/markdown/elements/MeasuredImage;", "Lorg/commonmark/node/Image;", "dimensions", "Landroid/util/Size;", "title", "", "uri", "Landroid/net/Uri;", "<init>", "(Landroid/util/Size;Ljava/lang/String;Landroid/net/Uri;)V", "getDimensions", "()Landroid/util/Size;", "getUri", "()Landroid/net/Uri;", "lib-markdown_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MeasuredImage extends Image {
    private final Size dimensions;
    private final Uri uri;

    public final Size getDimensions() {
        return this.dimensions;
    }

    public final Uri getUri() {
        return this.uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeasuredImage(Size dimensions, String title, Uri uri) {
        super(uri.toString(), title);
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.dimensions = dimensions;
        this.uri = uri;
    }
}
