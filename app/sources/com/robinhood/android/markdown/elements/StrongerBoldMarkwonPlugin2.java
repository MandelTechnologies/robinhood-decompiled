package com.robinhood.android.markdown.elements;

import android.graphics.Typeface;
import android.text.TextPaint;
import io.noties.markwon.core.spans.StrongEmphasisSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StrongerBoldMarkwonPlugin.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/markdown/elements/BoldSpan;", "Lio/noties/markwon/core/spans/StrongEmphasisSpan;", "typeface", "Landroid/graphics/Typeface;", "<init>", "(Landroid/graphics/Typeface;)V", "getTypeface", "()Landroid/graphics/Typeface;", "updateDrawState", "", "tp", "Landroid/text/TextPaint;", "lib-markdown_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.markdown.elements.BoldSpan, reason: use source file name */
/* loaded from: classes8.dex */
public final class StrongerBoldMarkwonPlugin2 extends StrongEmphasisSpan {
    private final Typeface typeface;

    public StrongerBoldMarkwonPlugin2(Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        this.typeface = typeface;
    }

    public final Typeface getTypeface() {
        return this.typeface;
    }

    @Override // io.noties.markwon.core.spans.StrongEmphasisSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint tp) {
        Intrinsics.checkNotNullParameter(tp, "tp");
        tp.setTypeface(this.typeface);
        tp.setFakeBoldText(false);
    }
}
