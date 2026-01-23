package androidx.compose.p011ui.text;

import androidx.collection.LruCache;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextMeasurer.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\bR\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Landroidx/compose/ui/text/TextLayoutCache;", "", "capacity", "", "(I)V", "cache", "Landroidx/collection/LruCache;", "Landroidx/compose/ui/text/CacheTextLayoutInput;", "Landroidx/compose/ui/text/TextLayoutResult;", "singleSizeCacheInput", "singleSizeCacheResult", "get", "key", "Landroidx/compose/ui/text/TextLayoutInput;", "put", "", "value", "ui-text_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.ui.text.TextLayoutCache, reason: use source file name */
/* loaded from: classes4.dex */
public final class TextMeasurer3 {
    private final LruCache<TextMeasurer2, TextLayoutResult> cache;
    private TextMeasurer2 singleSizeCacheInput;
    private TextLayoutResult singleSizeCacheResult;

    public TextMeasurer3(int i) {
        this.cache = i != 1 ? new LruCache<>(i) : null;
    }

    public final TextLayoutResult get(TextLayoutInput key) {
        TextLayoutResult textLayoutResult;
        TextMeasurer2 textMeasurer2 = new TextMeasurer2(key);
        LruCache<TextMeasurer2, TextLayoutResult> lruCache = this.cache;
        if (lruCache != null) {
            textLayoutResult = lruCache.get(textMeasurer2);
        } else {
            if (!Intrinsics.areEqual(this.singleSizeCacheInput, textMeasurer2)) {
                return null;
            }
            textLayoutResult = this.singleSizeCacheResult;
        }
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts()) {
            return null;
        }
        return textLayoutResult;
    }

    public final void put(TextLayoutInput key, TextLayoutResult value) {
        LruCache<TextMeasurer2, TextLayoutResult> lruCache = this.cache;
        if (lruCache != null) {
            lruCache.put(new TextMeasurer2(key), value);
        } else {
            this.singleSizeCacheInput = new TextMeasurer2(key);
            this.singleSizeCacheResult = value;
        }
    }
}
