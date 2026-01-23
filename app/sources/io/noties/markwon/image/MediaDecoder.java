package io.noties.markwon.image;

import android.graphics.drawable.Drawable;
import java.io.InputStream;
import java.util.Collection;

/* loaded from: classes14.dex */
public abstract class MediaDecoder {
    public abstract Drawable decode(String str, InputStream inputStream);

    public abstract Collection<String> supportedTypes();
}
