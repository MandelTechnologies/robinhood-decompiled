package com.robinhood.utils.compose.extendedspans;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkAnnotation;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.unit.C2002Dp;
import com.robinhood.utils.compose.extendedspans.internal.serialize;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: DottedUnderlineSpanPainter.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/utils/compose/extendedspans/DottedUnderlineSpanPainter;", "Lcom/robinhood/utils/compose/extendedspans/ExtendedSpanPainter;", "underlineColor", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getUnderlineColor-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "decorate", "Landroidx/compose/ui/text/SpanStyle;", "span", "start", "", "end", "text", "Landroidx/compose/ui/text/AnnotatedString;", "builder", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "drawInstructionsFor", "Lcom/robinhood/utils/compose/extendedspans/SpanDrawInstructions;", "layoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "Companion", "lib-utils-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class DottedUnderlineSpanPainter extends ExtendedSpanPainter {
    public static final int $stable = 0;
    private static final String TAG = "dotted_underline_span";
    private final Color underlineColor;

    public /* synthetic */ DottedUnderlineSpanPainter(Color color, DefaultConstructorMarker defaultConstructorMarker) {
        this(color);
    }

    public /* synthetic */ DottedUnderlineSpanPainter(Color color, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : color, null);
    }

    /* renamed from: getUnderlineColor-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getUnderlineColor() {
        return this.underlineColor;
    }

    private DottedUnderlineSpanPainter(Color color) {
        this.underlineColor = color;
    }

    @Override // com.robinhood.utils.compose.extendedspans.ExtendedSpanPainter
    public SpanStyle decorate(SpanStyle span, int start, int end, AnnotatedString text, AnnotatedString.Builder builder) {
        AnnotatedString.Range<SpanStyle> range;
        SpanStyle item;
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(builder, "builder");
        TextDecoration textDecoration = span.getTextDecoration();
        if (textDecoration == null || !textDecoration.contains(TextDecoration.INSTANCE.getUnderline())) {
            return span;
        }
        List<AnnotatedString.Range<SpanStyle>> spanStyles = text.getSpanStyles();
        int size = spanStyles.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                range = null;
                break;
            }
            range = spanStyles.get(i);
            AnnotatedString.Range<SpanStyle> range2 = range;
            if (range2.getStart() <= start && range2.getEnd() >= end && range2.getItem().m7599getColor0d7_KjU() != 16) {
                break;
            }
            i++;
        }
        AnnotatedString.Range<SpanStyle> range3 = range;
        builder.addStringAnnotation(TAG, serialize.m26600serializeY2TPw74(Color.m6701boximpl((range3 == null || (item = range3.getItem()) == null) ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : item.m7599getColor0d7_KjU())), start, end);
        TextDecoration.Companion companion = TextDecoration.INSTANCE;
        return SpanStyle.m7595copyGSF8kmg$default(span, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, textDecoration.contains(companion.getLineThrough()) ? companion.getLineThrough() : companion.getNone(), null, null, null, 61439, null);
    }

    @Override // com.robinhood.utils.compose.extendedspans.ExtendedSpanPainter
    public ExtendedSpanPainter2 drawInstructionsFor(final TextLayoutResult layoutResult) {
        Intrinsics.checkNotNullParameter(layoutResult, "layoutResult");
        AnnotatedString text = layoutResult.getLayoutInput().getText();
        final List<AnnotatedString.Range<String>> stringAnnotations = text.getStringAnnotations(TAG, 0, text.length());
        final List<AnnotatedString.Range<LinkAnnotation>> linkAnnotations = text.getLinkAnnotations(0, text.length());
        return new ExtendedSpanPainter2() { // from class: com.robinhood.utils.compose.extendedspans.DottedUnderlineSpanPainter.drawInstructionsFor.1
            @Override // com.robinhood.utils.compose.extendedspans.ExtendedSpanPainter2
            public final void draw(DrawScope drawScope) {
                long value;
                DrawScope SpanDrawInstructions = drawScope;
                Intrinsics.checkNotNullParameter(SpanDrawInstructions, "$this$SpanDrawInstructions");
                List<AnnotatedString.Range<String>> list = stringAnnotations;
                DottedUnderlineSpanPainter dottedUnderlineSpanPainter = this;
                TextLayoutResult textLayoutResult = layoutResult;
                Iterator<T> it = list.iterator();
                while (true) {
                    int i = 3;
                    float f = 0.0f;
                    int i2 = 4;
                    if (!it.hasNext()) {
                        break;
                    }
                    AnnotatedString.Range range = (AnnotatedString.Range) it.next();
                    List<Rect> boundingBoxes$default = ExtendedSpanPainter.getBoundingBoxes$default(dottedUnderlineSpanPainter, textLayoutResult, range.getStart(), range.getEnd(), false, 4, null);
                    DottedUnderlineSpanPainter dottedUnderlineSpanPainter2 = dottedUnderlineSpanPainter;
                    TextLayoutResult textLayoutResult2 = textLayoutResult;
                    Color underlineColor = dottedUnderlineSpanPainter2.getUnderlineColor();
                    if (underlineColor != null) {
                        value = underlineColor.getValue();
                    } else {
                        Color colorDeserializeToColor = serialize.deserializeToColor((String) range.getItem());
                        value = colorDeserializeToColor != null ? colorDeserializeToColor.getValue() : textLayoutResult2.getLayoutInput().getStyle().m7661getColor0d7_KjU();
                    }
                    for (Rect rect : boundingBoxes$default) {
                        float bottom = rect.getBottom();
                        float fMo5016toPx0680j_4 = SpanDrawInstructions.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(1));
                        float fMo5016toPx0680j_42 = SpanDrawInstructions.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(i2));
                        int iCeil = (int) Math.ceil(r5 / fMo5016toPx0680j_42);
                        float fCoerceAtLeast = (RangesKt.coerceAtLeast(rect.getRight() - rect.getLeft(), f) - ((iCeil - 1) * fMo5016toPx0680j_42)) / 2.0f;
                        int i3 = 0;
                        while (i3 < iCeil) {
                            float left = fCoerceAtLeast + rect.getLeft() + (i3 * fMo5016toPx0680j_42);
                            DrawScope.m6947drawCircleVaOC9Bg$default(SpanDrawInstructions, value, fMo5016toPx0680j_4, Offset.m6535constructorimpl((Float.floatToRawIntBits(bottom - SpanDrawInstructions.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(i))) & 4294967295L) | (Float.floatToRawIntBits(left) << 32)), 0.0f, null, null, 0, 120, null);
                            i3++;
                            iCeil = iCeil;
                            i = 3;
                            f = 0.0f;
                            i2 = 4;
                        }
                    }
                    dottedUnderlineSpanPainter = dottedUnderlineSpanPainter2;
                    textLayoutResult = textLayoutResult2;
                }
                List<AnnotatedString.Range<LinkAnnotation>> list2 = linkAnnotations;
                DottedUnderlineSpanPainter dottedUnderlineSpanPainter3 = this;
                TextLayoutResult textLayoutResult3 = layoutResult;
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    AnnotatedString.Range range2 = (AnnotatedString.Range) it2.next();
                    List<Rect> boundingBoxes$default2 = ExtendedSpanPainter.getBoundingBoxes$default(dottedUnderlineSpanPainter3, textLayoutResult3, range2.getStart(), range2.getEnd(), false, 4, null);
                    DottedUnderlineSpanPainter dottedUnderlineSpanPainter4 = dottedUnderlineSpanPainter3;
                    TextLayoutResult textLayoutResult4 = textLayoutResult3;
                    Color underlineColor2 = dottedUnderlineSpanPainter4.getUnderlineColor();
                    long value2 = underlineColor2 != null ? underlineColor2.getValue() : textLayoutResult4.getLayoutInput().getStyle().m7661getColor0d7_KjU();
                    for (Rect rect2 : boundingBoxes$default2) {
                        float bottom2 = rect2.getBottom();
                        float fMo5016toPx0680j_43 = SpanDrawInstructions.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(1));
                        float fMo5016toPx0680j_44 = SpanDrawInstructions.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(4));
                        int iCeil2 = (int) Math.ceil(r6 / fMo5016toPx0680j_44);
                        float fCoerceAtLeast2 = (RangesKt.coerceAtLeast(rect2.getRight() - rect2.getLeft(), 0.0f) - ((iCeil2 - 1) * fMo5016toPx0680j_44)) / 2.0f;
                        int i4 = 0;
                        while (i4 < iCeil2) {
                            long j = value2;
                            float f2 = fMo5016toPx0680j_43;
                            DrawScope.m6947drawCircleVaOC9Bg$default(SpanDrawInstructions, j, f2, Offset.m6535constructorimpl((Float.floatToRawIntBits((fCoerceAtLeast2 + rect2.getLeft()) + (i4 * fMo5016toPx0680j_44)) << 32) | (Float.floatToRawIntBits(bottom2 - SpanDrawInstructions.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(3))) & 4294967295L)), 0.0f, null, null, 0, 120, null);
                            i4++;
                            fMo5016toPx0680j_43 = f2;
                            value2 = j;
                            SpanDrawInstructions = drawScope;
                            iCeil2 = iCeil2;
                        }
                        SpanDrawInstructions = drawScope;
                        value2 = value2;
                    }
                    SpanDrawInstructions = drawScope;
                    dottedUnderlineSpanPainter3 = dottedUnderlineSpanPainter4;
                    textLayoutResult3 = textLayoutResult4;
                }
            }
        };
    }
}
