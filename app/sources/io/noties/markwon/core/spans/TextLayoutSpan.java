package io.noties.markwon.core.spans;

import android.text.Layout;
import android.text.Spanned;
import java.lang.ref.WeakReference;

/* loaded from: classes14.dex */
public class TextLayoutSpan {
    private final WeakReference<Layout> reference;

    public static Layout layoutOf(Spanned spanned) {
        TextLayoutSpan[] textLayoutSpanArr = (TextLayoutSpan[]) spanned.getSpans(0, spanned.length(), TextLayoutSpan.class);
        if (textLayoutSpanArr == null || textLayoutSpanArr.length <= 0) {
            return null;
        }
        return textLayoutSpanArr[0].layout();
    }

    public Layout layout() {
        return this.reference.get();
    }
}
