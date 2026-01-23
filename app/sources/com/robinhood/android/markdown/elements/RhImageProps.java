package com.robinhood.android.markdown.elements;

import android.util.Size;
import io.noties.markwon.Prop;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhImageProps.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001f\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/markdown/elements/RhImageProps;", "", "<init>", "()V", "IMAGE_DIMENSIONS", "Lio/noties/markwon/Prop;", "Landroid/util/Size;", "kotlin.jvm.PlatformType", "getIMAGE_DIMENSIONS", "()Lio/noties/markwon/Prop;", "lib-markdown_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class RhImageProps {
    private static final Prop<Size> IMAGE_DIMENSIONS;
    public static final RhImageProps INSTANCE = new RhImageProps();

    private RhImageProps() {
    }

    static {
        Prop<Size> propM3342of = Prop.m3342of(Size.class, "image-dimensions");
        Intrinsics.checkNotNullExpressionValue(propM3342of, "of(...)");
        IMAGE_DIMENSIONS = propM3342of;
    }

    public final Prop<Size> getIMAGE_DIMENSIONS() {
        return IMAGE_DIMENSIONS;
    }
}
