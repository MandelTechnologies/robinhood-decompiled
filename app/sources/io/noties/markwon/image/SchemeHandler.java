package io.noties.markwon.image;

import android.net.Uri;
import java.util.Collection;

/* loaded from: classes14.dex */
public abstract class SchemeHandler {
    public abstract ImageItem handle(String str, Uri uri);

    public abstract Collection<String> supportedSchemes();
}
