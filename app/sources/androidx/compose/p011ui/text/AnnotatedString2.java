package androidx.compose.p011ui.text;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.internal.InlineClassHelper5;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: AnnotatedString.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0010\u001aG\u0010\u0007\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0001\u0018\u00010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00010\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00010\u0000*\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u0013\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0001\u0018\u00010\u0000*\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0015\u001a\u00020\t*\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001aK\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0018\u00010\u0000\"\u0004\b\u0000\u0010\u00172\u0016\u0010\u0018\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a)\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001f\u0010 \u001a/\u0010%\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\rH\u0000¢\u0006\u0004\b%\u0010&\u001a\u000f\u0010'\u001a\u00020\tH\u0000¢\u0006\u0004\b'\u0010(\"\u0014\u0010)\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, m3636d2 = {"", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Landroidx/compose/ui/text/ParagraphStyle;", "paragraphStyles", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "constructAnnotationsFromSpansAndParagraphs", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Landroidx/compose/ui/text/AnnotatedString;", "defaultParagraphStyle", "normalizedParagraphStyles", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/ParagraphStyle;)Ljava/util/List;", "", "start", "end", "Lkotlin/Function1;", "", "predicate", "getLocalAnnotations", "(Landroidx/compose/ui/text/AnnotatedString;IILkotlin/jvm/functions/Function1;)Ljava/util/List;", "substringWithoutParagraphStyles", "(Landroidx/compose/ui/text/AnnotatedString;II)Landroidx/compose/ui/text/AnnotatedString;", "T", "ranges", "filterRanges", "(Ljava/util/List;II)Ljava/util/List;", "", "text", "spanStyle", "paragraphStyle", "AnnotatedString", "(Ljava/lang/String;Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/ParagraphStyle;)Landroidx/compose/ui/text/AnnotatedString;", "lStart", "lEnd", "rStart", "rEnd", "intersect", "(IIII)Z", "emptyAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "EmptyAnnotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "ui-text_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.text.AnnotatedStringKt, reason: use source file name */
/* loaded from: classes.dex */
public final class AnnotatedString2 {
    private static final AnnotatedString EmptyAnnotatedString = new AnnotatedString("", null, 2, 0 == true ? 1 : 0);

    public static final boolean intersect(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> constructAnnotationsFromSpansAndParagraphs(List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<ParagraphStyle>> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        if (list2.isEmpty()) {
            return list;
        }
        if (list.isEmpty()) {
            return list2;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i));
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(list2.get(i2));
        }
        return arrayList;
    }

    public static final List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles(AnnotatedString annotatedString, ParagraphStyle paragraphStyle) {
        List listEmptyList;
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release();
        if (paragraphStylesOrNull$ui_text_release == null || (listEmptyList = CollectionsKt.sortedWith(paragraphStylesOrNull$ui_text_release, new Comparator() { // from class: androidx.compose.ui.text.AnnotatedStringKt$normalizedParagraphStyles$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((AnnotatedString.Range) t).getStart()), Integer.valueOf(((AnnotatedString.Range) t2).getStart()));
            }
        })) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        int size = listEmptyList.size();
        int end = 0;
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range range = (AnnotatedString.Range) listEmptyList.get(i);
            AnnotatedString.Range rangeCopy$default = AnnotatedString.Range.copy$default(range, paragraphStyle.merge((ParagraphStyle) range.getItem()), 0, 0, null, 14, null);
            while (end < rangeCopy$default.getStart() && !arrayDeque.isEmpty()) {
                AnnotatedString.Range range2 = (AnnotatedString.Range) arrayDeque.last();
                if (rangeCopy$default.getStart() < range2.getEnd()) {
                    arrayList.add(new AnnotatedString.Range(range2.getItem(), end, rangeCopy$default.getStart()));
                    end = rangeCopy$default.getStart();
                } else {
                    arrayList.add(new AnnotatedString.Range(range2.getItem(), end, range2.getEnd()));
                    end = range2.getEnd();
                    while (!arrayDeque.isEmpty() && end == ((AnnotatedString.Range) arrayDeque.last()).getEnd()) {
                        arrayDeque.removeLast();
                    }
                }
            }
            if (end < rangeCopy$default.getStart()) {
                arrayList.add(new AnnotatedString.Range(paragraphStyle, end, rangeCopy$default.getStart()));
                end = rangeCopy$default.getStart();
            }
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayDeque.lastOrNull();
            if (range3 != null) {
                if (range3.getStart() == rangeCopy$default.getStart() && range3.getEnd() == rangeCopy$default.getEnd()) {
                    arrayDeque.removeLast();
                    arrayDeque.add(new AnnotatedString.Range(((ParagraphStyle) range3.getItem()).merge((ParagraphStyle) rangeCopy$default.getItem()), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
                } else if (range3.getStart() == range3.getEnd()) {
                    arrayList.add(new AnnotatedString.Range(range3.getItem(), range3.getStart(), range3.getEnd()));
                    arrayDeque.removeLast();
                    arrayDeque.add(new AnnotatedString.Range(rangeCopy$default.getItem(), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
                } else {
                    if (range3.getEnd() < rangeCopy$default.getEnd()) {
                        throw new IllegalArgumentException();
                    }
                    arrayDeque.add(new AnnotatedString.Range(((ParagraphStyle) range3.getItem()).merge((ParagraphStyle) rangeCopy$default.getItem()), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
                }
            } else {
                arrayDeque.add(new AnnotatedString.Range(rangeCopy$default.getItem(), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
            }
        }
        while (end <= annotatedString.getText().length() && !arrayDeque.isEmpty()) {
            AnnotatedString.Range range4 = (AnnotatedString.Range) arrayDeque.last();
            arrayList.add(new AnnotatedString.Range(range4.getItem(), end, range4.getEnd()));
            end = range4.getEnd();
            while (!arrayDeque.isEmpty() && end == ((AnnotatedString.Range) arrayDeque.last()).getEnd()) {
                arrayDeque.removeLast();
            }
        }
        if (end < annotatedString.getText().length()) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, end, annotatedString.getText().length()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, 0, 0));
        }
        return arrayList;
    }

    static /* synthetic */ List getLocalAnnotations$default(AnnotatedString annotatedString, int i, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        return getLocalAnnotations(annotatedString, i, i2, function1);
    }

    private static final List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> getLocalAnnotations(AnnotatedString annotatedString, int i, int i2, Function1<? super AnnotatedString.Annotation, Boolean> function1) {
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> annotations$ui_text_release;
        if (i == i2 || (annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release()) == null) {
            return null;
        }
        if (i != 0 || i2 < annotatedString.getText().length()) {
            ArrayList arrayList = new ArrayList(annotations$ui_text_release.size());
            int size = annotations$ui_text_release.size();
            for (int i3 = 0; i3 < size; i3++) {
                AnnotatedString.Range<? extends AnnotatedString.Annotation> range = annotations$ui_text_release.get(i3);
                if ((function1 != null ? function1.invoke(range.getItem()).booleanValue() : true) && intersect(i, i2, range.getStart(), range.getEnd())) {
                    arrayList.add(new AnnotatedString.Range(range.getItem(), RangesKt.coerceIn(range.getStart(), i, i2) - i, RangesKt.coerceIn(range.getEnd(), i, i2) - i, range.getTag()));
                }
            }
            return arrayList;
        }
        if (function1 == null) {
            return annotations$ui_text_release;
        }
        ArrayList arrayList2 = new ArrayList(annotations$ui_text_release.size());
        int size2 = annotations$ui_text_release.size();
        for (int i4 = 0; i4 < size2; i4++) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range2 = annotations$ui_text_release.get(i4);
            if (function1.invoke(range2.getItem()).booleanValue()) {
                arrayList2.add(range2);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString substringWithoutParagraphStyles(AnnotatedString annotatedString, int i, int i2) {
        String strSubstring;
        if (i != i2) {
            strSubstring = annotatedString.getText().substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        } else {
            strSubstring = "";
        }
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> localAnnotations = getLocalAnnotations(annotatedString, i, i2, new Function1<AnnotatedString.Annotation, Boolean>() { // from class: androidx.compose.ui.text.AnnotatedStringKt.substringWithoutParagraphStyles.1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(AnnotatedString.Annotation annotation) {
                return Boolean.valueOf(!(annotation instanceof ParagraphStyle));
            }
        });
        if (localAnnotations == null) {
            localAnnotations = CollectionsKt.emptyList();
        }
        return new AnnotatedString(strSubstring, localAnnotations);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<AnnotatedString.Range<T>> filterRanges(List<? extends AnnotatedString.Range<? extends T>> list, int i, int i2) {
        if (!(i <= i2)) {
            InlineClassHelper5.throwIllegalArgumentException("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnnotatedString.Range<? extends T> range = list.get(i3);
            if (intersect(i, i2, range.getStart(), range.getEnd())) {
                arrayList.add(new AnnotatedString.Range(range.getItem(), Math.max(i, range.getStart()) - i, Math.min(i2, range.getEnd()) - i, range.getTag()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static /* synthetic */ AnnotatedString AnnotatedString$default(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle, int i, Object obj) {
        if ((i & 4) != 0) {
            paragraphStyle = null;
        }
        return AnnotatedString(str, spanStyle, paragraphStyle);
    }

    public static final AnnotatedString AnnotatedString(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        return new AnnotatedString(str, CollectionsKt.listOf(new AnnotatedString.Range(spanStyle, 0, str.length())), paragraphStyle == null ? CollectionsKt.emptyList() : CollectionsKt.listOf(new AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }

    public static final AnnotatedString emptyAnnotatedString() {
        return EmptyAnnotatedString;
    }
}
