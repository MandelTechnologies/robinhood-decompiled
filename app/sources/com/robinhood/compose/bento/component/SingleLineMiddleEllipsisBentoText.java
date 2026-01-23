package com.robinhood.compose.bento.component;

import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SingleLineMiddleEllipsisBentoText.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0016\u001a\u00020\u000fJ\b\u0010\u0017\u001a\u00020\u000fH\u0002J\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BoundCounter;", "", "text", "", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "charPosition", "Lkotlin/Function1;", "", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextLayoutResult;Lkotlin/jvm/functions/Function1;)V", "value", "string", "getString", "()Ljava/lang/String;", "", "width", "getWidth", "()F", "_nextCharWidth", "Ljava/lang/Float;", "invalidCharsCount", "widthWithNextChar", "nextCharWidth", "addNextChar", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BoundCounter, reason: use source file name */
/* loaded from: classes15.dex */
final class SingleLineMiddleEllipsisBentoText {
    private Float _nextCharWidth;
    private final Function1<Integer, Integer> charPosition;
    private int invalidCharsCount;
    private String string;
    private final String text;
    private final TextLayoutResult textLayoutResult;
    private float width;

    /* JADX WARN: Multi-variable type inference failed */
    public SingleLineMiddleEllipsisBentoText(String text, TextLayoutResult textLayoutResult, Function1<? super Integer, Integer> charPosition) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Intrinsics.checkNotNullParameter(charPosition, "charPosition");
        this.text = text;
        this.textLayoutResult = textLayoutResult;
        this.charPosition = charPosition;
        this.string = "";
    }

    public final String getString() {
        return this.string;
    }

    public final float getWidth() {
        return this.width;
    }

    public final float widthWithNextChar() {
        return this.width + nextCharWidth();
    }

    private final float nextCharWidth() {
        Rect boundingBox;
        Float f = this._nextCharWidth;
        if (f != null) {
            return f.floatValue();
        }
        this.invalidCharsCount--;
        do {
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            Function1<Integer, Integer> function1 = this.charPosition;
            int length = this.string.length();
            int i = this.invalidCharsCount + 1;
            this.invalidCharsCount = i;
            boundingBox = textLayoutResult.getBoundingBox(function1.invoke(Integer.valueOf(length + i)).intValue());
        } while (boundingBox.getRight() == 0.0f);
        this._nextCharWidth = Float.valueOf(boundingBox.getRight() - boundingBox.getLeft());
        return boundingBox.getRight() - boundingBox.getLeft();
    }

    public final void addNextChar() {
        String str = this.string;
        this.string = str + this.text.charAt(this.charPosition.invoke(Integer.valueOf(str.length())).intValue());
        this.width = this.width + nextCharWidth();
        this._nextCharWidth = null;
    }
}
