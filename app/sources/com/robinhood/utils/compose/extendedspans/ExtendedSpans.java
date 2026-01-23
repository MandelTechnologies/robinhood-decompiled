package com.robinhood.utils.compose.extendedspans;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkAnnotation;
import androidx.compose.p011ui.text.ParagraphStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TtsAnnotation;
import androidx.compose.p011ui.text.UrlAnnotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ExtendedSpans.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001b\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\f\u0010\u0015\u001a\u00020\u0012*\u00020\u0014H\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/utils/compose/extendedspans/ExtendedSpans;", "", "painters", "", "Lcom/robinhood/utils/compose/extendedspans/ExtendedSpanPainter;", "<init>", "([Lcom/robinhood/utils/compose/extendedspans/ExtendedSpanPainter;)V", "", "drawInstructions", "Lcom/robinhood/utils/compose/extendedspans/SpanDrawInstructions;", "getDrawInstructions$lib_utils_compose_externalDebug", "()Ljava/util/List;", "setDrawInstructions$lib_utils_compose_externalDebug", "(Ljava/util/List;)V", "extend", "Landroidx/compose/ui/text/AnnotatedString;", "text", "onTextLayout", "", "layoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "checkIfExtendWasCalled", "Companion", "lib-utils-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ExtendedSpans {
    public static final int $stable = 0;
    private static final String EXTENDED_SPANS_MARKER_TAG = "extended_spans_marker";
    private List<? extends ExtendedSpanPainter2> drawInstructions;
    private final List<ExtendedSpanPainter> painters;

    public ExtendedSpans(ExtendedSpanPainter... painters) {
        Intrinsics.checkNotNullParameter(painters, "painters");
        this.painters = ArraysKt.toList(painters);
        this.drawInstructions = CollectionsKt.emptyList();
    }

    public final List<ExtendedSpanPainter2> getDrawInstructions$lib_utils_compose_externalDebug() {
        return this.drawInstructions;
    }

    public final void setDrawInstructions$lib_utils_compose_externalDebug(List<? extends ExtendedSpanPainter2> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.drawInstructions = list;
    }

    public final void onTextLayout(TextLayoutResult layoutResult) {
        Intrinsics.checkNotNullParameter(layoutResult, "layoutResult");
        checkIfExtendWasCalled(layoutResult);
        List<ExtendedSpanPainter> list = this.painters;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i).drawInstructionsFor(layoutResult));
        }
        this.drawInstructions = arrayList;
    }

    private final void checkIfExtendWasCalled(TextLayoutResult textLayoutResult) {
        if (textLayoutResult.getLayoutInput().getText().getStringAnnotations(EXTENDED_SPANS_MARKER_TAG, 0, 0).isEmpty()) {
            throw new IllegalStateException("ExtendedSpans#extend(AnnotatedString) wasn't called for this Text().");
        }
    }

    public final AnnotatedString extend(AnnotatedString text) {
        Intrinsics.checkNotNullParameter(text, "text");
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(text.getText());
        builder.addStringAnnotation(EXTENDED_SPANS_MARKER_TAG, String.valueOf(hashCode()), 0, 0);
        List<AnnotatedString.Range<SpanStyle>> spanStyles = text.getSpanStyles();
        int size = spanStyles.size();
        int i = 0;
        while (i < size) {
            AnnotatedString.Range<SpanStyle> range = spanStyles.get(i);
            List<ExtendedSpanPainter> list = this.painters;
            SpanStyle item = range.getItem();
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                item = list.get(i2).decorate(item, range.getStart(), range.getEnd(), text, builder);
            }
            builder.addStyle(item, range.getStart(), range.getEnd());
            i++;
            text = text;
        }
        AnnotatedString annotatedString = text;
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStyles = annotatedString.getParagraphStyles();
        int size3 = paragraphStyles.size();
        for (int i3 = 0; i3 < size3; i3++) {
            AnnotatedString.Range<ParagraphStyle> range2 = paragraphStyles.get(i3);
            builder.addStyle(range2.getItem(), range2.getStart(), range2.getEnd());
        }
        List<AnnotatedString.Range<String>> stringAnnotations = annotatedString.getStringAnnotations(0, annotatedString.length());
        int size4 = stringAnnotations.size();
        for (int i4 = 0; i4 < size4; i4++) {
            AnnotatedString.Range<String> range3 = stringAnnotations.get(i4);
            builder.addStringAnnotation(range3.getTag(), range3.getItem(), range3.getStart(), range3.getEnd());
        }
        List<AnnotatedString.Range<TtsAnnotation>> ttsAnnotations = annotatedString.getTtsAnnotations(0, annotatedString.length());
        int size5 = ttsAnnotations.size();
        for (int i5 = 0; i5 < size5; i5++) {
            AnnotatedString.Range<TtsAnnotation> range4 = ttsAnnotations.get(i5);
            builder.addTtsAnnotation(range4.getItem(), range4.getStart(), range4.getEnd());
        }
        List<AnnotatedString.Range<UrlAnnotation>> urlAnnotations = annotatedString.getUrlAnnotations(0, annotatedString.length());
        int size6 = urlAnnotations.size();
        for (int i6 = 0; i6 < size6; i6++) {
            AnnotatedString.Range<UrlAnnotation> range5 = urlAnnotations.get(i6);
            builder.addUrlAnnotation(range5.getItem(), range5.getStart(), range5.getEnd());
        }
        List<AnnotatedString.Range<LinkAnnotation>> linkAnnotations = annotatedString.getLinkAnnotations(0, annotatedString.length());
        int size7 = linkAnnotations.size();
        for (int i7 = 0; i7 < size7; i7++) {
            AnnotatedString.Range<LinkAnnotation> range6 = linkAnnotations.get(i7);
            LinkAnnotation item2 = range6.getItem();
            if (item2 instanceof LinkAnnotation.Url) {
                builder.addLink((LinkAnnotation.Url) item2, range6.getStart(), range6.getEnd());
            } else if (item2 instanceof LinkAnnotation.Clickable) {
                builder.addLink((LinkAnnotation.Clickable) item2, range6.getStart(), range6.getEnd());
            }
        }
        return builder.toAnnotatedString();
    }
}
