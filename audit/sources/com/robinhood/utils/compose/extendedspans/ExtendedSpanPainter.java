package com.robinhood.utils.compose.extendedspans;

import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.style.ResolvedTextDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: ExtendedSpanPainter.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J,\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\u00020\u00112\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0004¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/utils/compose/extendedspans/ExtendedSpanPainter;", "", "<init>", "()V", "decorate", "Landroidx/compose/ui/text/SpanStyle;", "span", "start", "", "end", "text", "Landroidx/compose/ui/text/AnnotatedString;", "builder", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "drawInstructionsFor", "Lcom/robinhood/utils/compose/extendedspans/SpanDrawInstructions;", "layoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "getBoundingBoxes", "", "Landroidx/compose/ui/geometry/Rect;", "startOffset", "endOffset", "flattenForFullParagraphs", "", "lib-utils-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public abstract class ExtendedSpanPainter {
    public static final int $stable = 0;

    public abstract SpanStyle decorate(SpanStyle span, int start, int end, AnnotatedString text, AnnotatedString.Builder builder);

    public abstract ExtendedSpanPainter2 drawInstructionsFor(TextLayoutResult layoutResult);

    public static /* synthetic */ List getBoundingBoxes$default(ExtendedSpanPainter extendedSpanPainter, TextLayoutResult textLayoutResult, int i, int i2, boolean z, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBoundingBoxes");
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return extendedSpanPainter.getBoundingBoxes(textLayoutResult, i, i2, z);
    }

    protected final List<Rect> getBoundingBoxes(TextLayoutResult textLayoutResult, int i, int i2, boolean z) {
        float lineLeft;
        float lineRight;
        Intrinsics.checkNotNullParameter(textLayoutResult, "<this>");
        if (i == i2) {
            return CollectionsKt.emptyList();
        }
        int lineForOffset = textLayoutResult.getLineForOffset(i);
        int lineForOffset2 = textLayoutResult.getLineForOffset(i2);
        if (z && lineForOffset != lineForOffset2 && textLayoutResult.getLineStart(lineForOffset) == i && textLayoutResult.getMultiParagraph().getLineEnd(lineForOffset2, true) == i2) {
            return CollectionsKt.listOf(new Rect(0.0f, textLayoutResult.getLineTop(lineForOffset), (int) (textLayoutResult.getSize() >> 32), textLayoutResult.getLineBottom(lineForOffset2)));
        }
        boolean z2 = textLayoutResult.getMultiParagraph().getParagraphDirection(StringsKt.getLastIndex(textLayoutResult.getLayoutInput().getText())) == ResolvedTextDirection.Ltr;
        ArrayList arrayList = new ArrayList((lineForOffset2 - lineForOffset) + 1);
        if (lineForOffset <= lineForOffset2) {
            int i3 = lineForOffset;
            while (true) {
                float lineTop = textLayoutResult.getLineTop(i3);
                float lineBottom = textLayoutResult.getLineBottom(i3);
                if (i3 == lineForOffset) {
                    lineLeft = textLayoutResult.getHorizontalPosition(i, z2);
                } else {
                    lineLeft = textLayoutResult.getLineLeft(i3);
                }
                if (i3 == lineForOffset2) {
                    lineRight = textLayoutResult.getHorizontalPosition(i2, z2);
                } else {
                    lineRight = textLayoutResult.getLineRight(i3);
                }
                arrayList.add(new Rect(lineLeft, lineTop, lineRight, lineBottom));
                if (i3 == lineForOffset2) {
                    break;
                }
                i3++;
            }
        }
        return arrayList;
    }
}
