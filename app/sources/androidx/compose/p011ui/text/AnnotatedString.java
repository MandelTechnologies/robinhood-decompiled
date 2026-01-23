package androidx.compose.p011ui.text;

import androidx.collection.IntList2;
import androidx.collection.IntList3;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkAnnotation;
import androidx.compose.p011ui.text.internal.InlineClassHelper5;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AnnotatedString.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 L2\u00020\u0001:\u0004MNLOB)\b\u0000\u0012\u0016\u0010\u0005\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB=\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u0002\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u0002¢\u0006\u0004\b\b\u0010\u000eB)\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\b\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J%\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J)\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00022\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b#\u0010(J)\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00030\u00022\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b*\u0010(J+\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00030\u00022\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010H\u0007¢\u0006\u0004\b,\u0010(J)\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00030\u00022\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b.\u0010(J\u001d\u0010/\u001a\u00020%2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020%2\b\u0010\u001d\u001a\u0004\u0018\u000101H\u0096\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0010H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b8\u00109J1\u0010<\u001a\u00020\u00002\"\u0010;\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030:¢\u0006\u0004\b<\u0010=J7\u0010>\u001a\u00020\u00002(\u0010;\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u00020:¢\u0006\u0004\b>\u0010=R*\u0010\u0005\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\bC\u00107R(\u0010D\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0003\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010AR(\u0010F\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0003\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010?\u001a\u0004\bG\u0010AR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u00028F¢\u0006\u0006\u001a\u0004\bH\u0010AR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00028F¢\u0006\u0006\u001a\u0004\bI\u0010AR\u0014\u0010K\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u00105\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006P"}, m3636d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "annotations", "", "text", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Landroidx/compose/ui/text/ParagraphStyle;", "paragraphStyles", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/util/List;)V", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "get", "(I)C", "startIndex", "endIndex", "subSequence", "(II)Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/TextRange;", "range", "subSequence-5zc-tL8", "(J)Landroidx/compose/ui/text/AnnotatedString;", "other", "plus", "(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/AnnotatedString;", "tag", "start", "end", "getStringAnnotations", "(Ljava/lang/String;II)Ljava/util/List;", "", "hasStringAnnotations", "(Ljava/lang/String;II)Z", "(II)Ljava/util/List;", "Landroidx/compose/ui/text/TtsAnnotation;", "getTtsAnnotations", "Landroidx/compose/ui/text/UrlAnnotation;", "getUrlAnnotations", "Landroidx/compose/ui/text/LinkAnnotation;", "getLinkAnnotations", "hasLinkAnnotations", "(II)Z", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "hasEqualAnnotations", "(Landroidx/compose/ui/text/AnnotatedString;)Z", "Lkotlin/Function1;", "transform", "mapAnnotations", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/AnnotatedString;", "flatMapAnnotations", "Ljava/util/List;", "getAnnotations$ui_text_release", "()Ljava/util/List;", "Ljava/lang/String;", "getText", "spanStylesOrNull", "getSpanStylesOrNull$ui_text_release", "paragraphStylesOrNull", "getParagraphStylesOrNull$ui_text_release", "getSpanStyles", "getParagraphStyles", "getLength", "length", "Companion", "Annotation", "Builder", "Range", "ui-text_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AnnotatedString implements CharSequence {
    private static final Saver<AnnotatedString, ?> Saver = SaversKt.getAnnotatedStringSaver();
    private final List<Range<? extends Annotation>> annotations;
    private final List<Range<ParagraphStyle>> paragraphStylesOrNull;
    private final List<Range<SpanStyle>> spanStylesOrNull;
    private final String text;

    /* compiled from: AnnotatedString.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0007\u0002\u0003\u0004\u0005\u0006\u0007\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m3636d2 = {"Landroidx/compose/ui/text/AnnotatedString$Annotation;", "", "Landroidx/compose/ui/text/Bullet;", "Landroidx/compose/ui/text/LinkAnnotation;", "Landroidx/compose/ui/text/ParagraphStyle;", "Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/text/StringAnnotation;", "Landroidx/compose/ui/text/TtsAnnotation;", "Landroidx/compose/ui/text/UrlAnnotation;", "ui-text_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* loaded from: classes4.dex */
    public interface Annotation {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotatedString(List<? extends Range<? extends Annotation>> list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.annotations = list;
        this.text = str;
        if (list != 0) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                Range<SpanStyle> range = (Range) list.get(i);
                if (range.getItem() instanceof SpanStyle) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    Intrinsics.checkNotNull(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                    arrayList.add(range);
                } else if (range.getItem() instanceof ParagraphStyle) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    Intrinsics.checkNotNull(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>");
                    arrayList2.add(range);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.spanStylesOrNull = arrayList;
        this.paragraphStylesOrNull = arrayList2;
        List listSortedWith = arrayList2 != null ? CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: androidx.compose.ui.text.AnnotatedString$special$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((AnnotatedString.Range) t).getStart()), Integer.valueOf(((AnnotatedString.Range) t2).getStart()));
            }
        }) : null;
        List list2 = listSortedWith;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        IntList3 intList3MutableIntListOf = IntList2.mutableIntListOf(((Range) CollectionsKt.first(listSortedWith)).getEnd());
        int size2 = listSortedWith.size();
        for (int i2 = 1; i2 < size2; i2++) {
            Range range2 = (Range) listSortedWith.get(i2);
            while (true) {
                if (intList3MutableIntListOf._size == 0) {
                    break;
                }
                int iLast = intList3MutableIntListOf.last();
                if (range2.getStart() >= iLast) {
                    intList3MutableIntListOf.removeAt(intList3MutableIntListOf._size - 1);
                } else if (!(range2.getEnd() <= iLast)) {
                    InlineClassHelper5.throwIllegalArgumentException("Paragraph overlap not allowed, end " + range2.getEnd() + " should be less than or equal to " + iLast);
                }
            }
            intList3MutableIntListOf.add(range2.getEnd());
        }
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return get(i);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public final List<Range<? extends Annotation>> getAnnotations$ui_text_release() {
        return this.annotations;
    }

    public final String getText() {
        return this.text;
    }

    public final List<Range<SpanStyle>> getSpanStylesOrNull$ui_text_release() {
        return this.spanStylesOrNull;
    }

    public final List<Range<SpanStyle>> getSpanStyles() {
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final List<Range<ParagraphStyle>> getParagraphStylesOrNull$ui_text_release() {
        return this.paragraphStylesOrNull;
    }

    public final List<Range<ParagraphStyle>> getParagraphStyles() {
        List<Range<ParagraphStyle>> list = this.paragraphStylesOrNull;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public /* synthetic */ AnnotatedString(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public AnnotatedString(String str, List<Range<SpanStyle>> list, List<Range<ParagraphStyle>> list2) {
        this((List<? extends Range<? extends Annotation>>) AnnotatedString2.constructAnnotationsFromSpansAndParagraphs(list, list2), str);
    }

    public /* synthetic */ AnnotatedString(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (List<? extends Range<? extends Annotation>>) ((i & 2) != 0 ? CollectionsKt.emptyList() : list));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AnnotatedString(String str, List<? extends Range<? extends Annotation>> list) {
        List<? extends Range<? extends Annotation>> list2 = list;
        this(list2.isEmpty() ? null : list2, str);
    }

    public int getLength() {
        return this.text.length();
    }

    public char get(int index) {
        return this.text.charAt(index);
    }

    @Override // java.lang.CharSequence
    public AnnotatedString subSequence(int startIndex, int endIndex) {
        if (!(startIndex <= endIndex)) {
            InlineClassHelper5.throwIllegalArgumentException("start (" + startIndex + ") should be less or equal to end (" + endIndex + ')');
        }
        if (startIndex == 0 && endIndex == this.text.length()) {
            return this;
        }
        String strSubstring = this.text.substring(startIndex, endIndex);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return new AnnotatedString((List<? extends Range<? extends Annotation>>) AnnotatedString2.filterRanges(this.annotations, startIndex, endIndex), strSubstring);
    }

    /* renamed from: subSequence-5zc-tL8, reason: not valid java name */
    public final AnnotatedString m7530subSequence5zctL8(long range) {
        return subSequence(TextRange.m7644getMinimpl(range), TextRange.m7643getMaximpl(range));
    }

    public final AnnotatedString plus(AnnotatedString other) {
        Builder builder = new Builder(this);
        builder.append(other);
        return builder.toAnnotatedString();
    }

    public final List<Range<String>> getStringAnnotations(String tag, int start, int end) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Range<? extends Annotation> range = list.get(i);
            if ((range.getItem() instanceof StringAnnotation) && Intrinsics.areEqual(tag, range.getTag()) && AnnotatedString2.intersect(start, end, range.getStart(), range.getEnd())) {
                arrayList.add(StringAnnotation2.unbox(range));
            }
        }
        return arrayList;
    }

    public final boolean hasStringAnnotations(String tag, int start, int end) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Range<? extends Annotation> range = list.get(i);
                if ((range.getItem() instanceof StringAnnotation) && Intrinsics.areEqual(tag, range.getTag()) && AnnotatedString2.intersect(start, end, range.getStart(), range.getEnd())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final List<Range<String>> getStringAnnotations(int start, int end) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Range<? extends Annotation> range = list.get(i);
            if ((range.getItem() instanceof StringAnnotation) && AnnotatedString2.intersect(start, end, range.getStart(), range.getEnd())) {
                arrayList.add(StringAnnotation2.unbox(range));
            }
        }
        return arrayList;
    }

    public final List<Range<TtsAnnotation>> getTtsAnnotations(int start, int end) {
        List listEmptyList;
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            listEmptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Range<? extends Annotation> range = list.get(i);
                Range<? extends Annotation> range2 = range;
                if ((range2.getItem() instanceof TtsAnnotation) && AnnotatedString2.intersect(start, end, range2.getStart(), range2.getEnd())) {
                    listEmptyList.add(range);
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return listEmptyList;
    }

    @Deprecated
    public final List<Range<UrlAnnotation>> getUrlAnnotations(int start, int end) {
        List listEmptyList;
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            listEmptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Range<? extends Annotation> range = list.get(i);
                Range<? extends Annotation> range2 = range;
                if ((range2.getItem() instanceof UrlAnnotation) && AnnotatedString2.intersect(start, end, range2.getStart(), range2.getEnd())) {
                    listEmptyList.add(range);
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return listEmptyList;
    }

    public final List<Range<LinkAnnotation>> getLinkAnnotations(int start, int end) {
        List listEmptyList;
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            listEmptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Range<? extends Annotation> range = list.get(i);
                Range<? extends Annotation> range2 = range;
                if ((range2.getItem() instanceof LinkAnnotation) && AnnotatedString2.intersect(start, end, range2.getStart(), range2.getEnd())) {
                    listEmptyList.add(range);
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return listEmptyList;
    }

    public final boolean hasLinkAnnotations(int start, int end) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Range<? extends Annotation> range = list.get(i);
                if ((range.getItem() instanceof LinkAnnotation) && AnnotatedString2.intersect(start, end, range.getStart(), range.getEnd())) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnnotatedString)) {
            return false;
        }
        AnnotatedString annotatedString = (AnnotatedString) other;
        return Intrinsics.areEqual(this.text, annotatedString.text) && Intrinsics.areEqual(this.annotations, annotatedString.annotations);
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        List<Range<? extends Annotation>> list = this.annotations;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.text;
    }

    public final boolean hasEqualAnnotations(AnnotatedString other) {
        return Intrinsics.areEqual(this.annotations, other.annotations);
    }

    public final AnnotatedString mapAnnotations(Function1<? super Range<? extends Annotation>, ? extends Range<? extends Annotation>> transform) {
        Builder builder = new Builder(this);
        builder.mapAnnotations$ui_text_release(transform);
        return builder.toAnnotatedString();
    }

    public final AnnotatedString flatMapAnnotations(Function1<? super Range<? extends Annotation>, ? extends List<? extends Range<? extends Annotation>>> transform) {
        Builder builder = new Builder(this);
        builder.flatMapAnnotations$ui_text_release(transform);
        return builder.toAnnotatedString();
    }

    /* compiled from: AnnotatedString.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ>\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0014¨\u0006!"}, m3636d2 = {"Landroidx/compose/ui/text/AnnotatedString$Range;", "T", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "", "start", "end", "", "tag", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "(Ljava/lang/Object;II)V", "component1", "()Ljava/lang/Object;", "component2", "()I", "component3", "copy", "(Ljava/lang/Object;IILjava/lang/String;)Landroidx/compose/ui/text/AnnotatedString$Range;", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getItem", "I", "getStart", "getEnd", "Ljava/lang/String;", "getTag", "ui-text_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Range<T> {
        private final int end;
        private final T item;
        private final int start;
        private final String tag;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Range copy$default(Range range, Object obj, int i, int i2, String str, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                obj = range.item;
            }
            if ((i3 & 2) != 0) {
                i = range.start;
            }
            if ((i3 & 4) != 0) {
                i2 = range.end;
            }
            if ((i3 & 8) != 0) {
                str = range.tag;
            }
            return range.copy(obj, i, i2, str);
        }

        public final T component1() {
            return this.item;
        }

        /* renamed from: component2, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* renamed from: component3, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        public final Range<T> copy(T item, int start, int end, String tag) {
            return new Range<>(item, start, end, tag);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Range)) {
                return false;
            }
            Range range = (Range) other;
            return Intrinsics.areEqual(this.item, range.item) && this.start == range.start && this.end == range.end && Intrinsics.areEqual(this.tag, range.tag);
        }

        public int hashCode() {
            T t = this.item;
            return ((((((t == null ? 0 : t.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
        }

        public Range(T t, int i, int i2, String str) {
            this.item = t;
            this.start = i;
            this.end = i2;
            this.tag = str;
            if (i <= i2) {
                return;
            }
            InlineClassHelper5.throwIllegalArgumentException("Reversed range is not supported");
        }

        public final int getEnd() {
            return this.end;
        }

        public final T getItem() {
            return this.item;
        }

        public final int getStart() {
            return this.start;
        }

        public final String getTag() {
            return this.tag;
        }

        public Range(T t, int i, int i2) {
            this(t, i, i2, "");
        }
    }

    /* compiled from: AnnotatedString.kt */
    @Metadata(m3635d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002WXB\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\f\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\f\u0010\u000fJ)\u0010\f\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\u0012J\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\f\u0010\u0015J\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\tJ%\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\u0016J%\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001cJ-\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u001f\u0010 J%\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b#\u0010$J'\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0007¢\u0006\u0004\b'\u0010(J%\u0010+\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b+\u0010,J%\u0010+\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b+\u0010/J\u0015\u00100\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b0\u00101J\u0015\u00100\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u001b¢\u0006\u0004\b0\u00102J\u001d\u00103\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b3\u00104J\u0015\u00107\u001a\u00020\u00032\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u000b¢\u0006\u0004\b9\u0010:J\u0015\u00109\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u0003¢\u0006\u0004\b9\u0010\u0006J\r\u0010<\u001a\u00020\u0007¢\u0006\u0004\b<\u0010=J3\u0010D\u001a\u00020\u000b2\"\u0010A\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020@0?\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020@0?0>H\u0000¢\u0006\u0004\bB\u0010CJ9\u0010G\u001a\u00020\u000b2(\u0010A\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020@0?\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020@0?0E0>H\u0000¢\u0006\u0004\bF\u0010CR\u0018\u0010\b\u001a\u00060Hj\u0002`I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010JR\"\u0010N\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020M0L0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\"\u0010P\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020@0L0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010OR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0011\u0010V\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006Y"}, m3636d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "", "capacity", "<init>", "(I)V", "Landroidx/compose/ui/text/AnnotatedString;", "text", "(Landroidx/compose/ui/text/AnnotatedString;)V", "", "", "append", "(Ljava/lang/String;)V", "", "(Ljava/lang/CharSequence;)Landroidx/compose/ui/text/AnnotatedString$Builder;", "start", "end", "(Ljava/lang/CharSequence;II)Landroidx/compose/ui/text/AnnotatedString$Builder;", "", "char", "(C)Landroidx/compose/ui/text/AnnotatedString$Builder;", "(Landroidx/compose/ui/text/AnnotatedString;II)V", "Landroidx/compose/ui/text/SpanStyle;", ResourceTypes.STYLE, "addStyle", "(Landroidx/compose/ui/text/SpanStyle;II)V", "Landroidx/compose/ui/text/ParagraphStyle;", "(Landroidx/compose/ui/text/ParagraphStyle;II)V", "tag", "annotation", "addStringAnnotation", "(Ljava/lang/String;Ljava/lang/String;II)V", "Landroidx/compose/ui/text/TtsAnnotation;", "ttsAnnotation", "addTtsAnnotation", "(Landroidx/compose/ui/text/TtsAnnotation;II)V", "Landroidx/compose/ui/text/UrlAnnotation;", "urlAnnotation", "addUrlAnnotation", "(Landroidx/compose/ui/text/UrlAnnotation;II)V", "Landroidx/compose/ui/text/LinkAnnotation$Url;", "url", "addLink", "(Landroidx/compose/ui/text/LinkAnnotation$Url;II)V", "Landroidx/compose/ui/text/LinkAnnotation$Clickable;", "clickable", "(Landroidx/compose/ui/text/LinkAnnotation$Clickable;II)V", "pushStyle", "(Landroidx/compose/ui/text/SpanStyle;)I", "(Landroidx/compose/ui/text/ParagraphStyle;)I", "pushStringAnnotation", "(Ljava/lang/String;Ljava/lang/String;)I", "Landroidx/compose/ui/text/LinkAnnotation;", "link", "pushLink", "(Landroidx/compose/ui/text/LinkAnnotation;)I", "pop", "()V", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "toAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "Lkotlin/Function1;", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "transform", "mapAnnotations$ui_text_release", "(Lkotlin/jvm/functions/Function1;)V", "mapAnnotations", "", "flatMapAnnotations$ui_text_release", "flatMapAnnotations", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "", "Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "", "styleStack", "Ljava/util/List;", "annotations", "Landroidx/compose/ui/text/AnnotatedString$Builder$BulletScope;", "bulletScope", "Landroidx/compose/ui/text/AnnotatedString$Builder$BulletScope;", "getLength", "()I", "length", "BulletScope", "MutableRange", "ui-text_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Builder implements Appendable {
        public static final int $stable = 8;
        private final List<MutableRange<? extends Annotation>> annotations;
        private final BulletScope bulletScope;
        private final List<MutableRange<? extends Object>> styleStack;
        private final StringBuilder text;

        public Builder(int i) {
            this.text = new StringBuilder(i);
            this.styleStack = new ArrayList();
            this.annotations = new ArrayList();
            this.bulletScope = new BulletScope(this);
        }

        public /* synthetic */ Builder(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 16 : i);
        }

        /* compiled from: AnnotatedString.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0082\b\u0018\u0000 !*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001!B+\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010¨\u0006\""}, m3636d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "T", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "", "start", "end", "", "tag", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "defaultEnd", "Landroidx/compose/ui/text/AnnotatedString$Range;", "toRange", "(I)Landroidx/compose/ui/text/AnnotatedString$Range;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getItem", "()Ljava/lang/Object;", "I", "getStart", "getEnd", "setEnd", "(I)V", "Ljava/lang/String;", "getTag", "Companion", "ui-text_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @SourceDebugExtension
        private static final /* data */ class MutableRange<T> {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private int end;
            private final T item;
            private final int start;
            private final String tag;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) other;
                return Intrinsics.areEqual(this.item, mutableRange.item) && this.start == mutableRange.start && this.end == mutableRange.end && Intrinsics.areEqual(this.tag, mutableRange.tag);
            }

            public int hashCode() {
                T t = this.item;
                return ((((((t == null ? 0 : t.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
            }

            public MutableRange(T t, int i, int i2, String str) {
                this.item = t;
                this.start = i;
                this.end = i2;
                this.tag = str;
            }

            public final void setEnd(int i) {
                this.end = i;
            }

            public /* synthetic */ MutableRange(Object obj, int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(obj, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, (i3 & 8) != 0 ? "" : str);
            }

            public static /* synthetic */ Range toRange$default(MutableRange mutableRange, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = Integer.MIN_VALUE;
                }
                return mutableRange.toRange(i);
            }

            public final Range<T> toRange(int defaultEnd) {
                int i = this.end;
                if (i != Integer.MIN_VALUE) {
                    defaultEnd = i;
                }
                if (!(defaultEnd != Integer.MIN_VALUE)) {
                    InlineClassHelper5.throwIllegalStateException("Item.end should be set first");
                }
                return new Range<>(this.item, this.start, defaultEnd, this.tag);
            }

            /* compiled from: AnnotatedString.kt */
            @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007¨\u0006\b"}, m3636d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange$Companion;", "", "()V", "fromRange", "Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "T", "range", "Landroidx/compose/ui/text/AnnotatedString$Range;", "ui-text_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            /* loaded from: classes4.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final <T> MutableRange<T> fromRange(Range<T> range) {
                    return new MutableRange<>(range.getItem(), range.getStart(), range.getEnd(), range.getTag());
                }
            }
        }

        public Builder(AnnotatedString annotatedString) {
            this(0, 1, null);
            append(annotatedString);
        }

        public final int getLength() {
            return this.text.length();
        }

        public final void append(String text) {
            this.text.append(text);
        }

        @Override // java.lang.Appendable
        public Builder append(CharSequence text) {
            if (text instanceof AnnotatedString) {
                append((AnnotatedString) text);
                return this;
            }
            this.text.append(text);
            return this;
        }

        @Override // java.lang.Appendable
        public Builder append(CharSequence text, int start, int end) {
            if (text instanceof AnnotatedString) {
                append((AnnotatedString) text, start, end);
                return this;
            }
            this.text.append(text, start, end);
            return this;
        }

        @Override // java.lang.Appendable
        public Builder append(char c) {
            this.text.append(c);
            return this;
        }

        public final void append(AnnotatedString text) {
            int length = this.text.length();
            this.text.append(text.getText());
            List<Range<? extends Annotation>> annotations$ui_text_release = text.getAnnotations$ui_text_release();
            if (annotations$ui_text_release != null) {
                int size = annotations$ui_text_release.size();
                for (int i = 0; i < size; i++) {
                    Range<? extends Annotation> range = annotations$ui_text_release.get(i);
                    this.annotations.add(new MutableRange<>(range.getItem(), range.getStart() + length, range.getEnd() + length, range.getTag()));
                }
            }
        }

        public final void append(AnnotatedString text, int start, int end) {
            int length = this.text.length();
            this.text.append((CharSequence) text.getText(), start, end);
            List localAnnotations$default = AnnotatedString2.getLocalAnnotations$default(text, start, end, null, 4, null);
            if (localAnnotations$default != null) {
                int size = localAnnotations$default.size();
                for (int i = 0; i < size; i++) {
                    Range range = (Range) localAnnotations$default.get(i);
                    this.annotations.add(new MutableRange<>(range.getItem(), range.getStart() + length, range.getEnd() + length, range.getTag()));
                }
            }
        }

        public final void addStyle(SpanStyle style, int start, int end) {
            this.annotations.add(new MutableRange<>(style, start, end, null, 8, null));
        }

        public final void addStyle(ParagraphStyle style, int start, int end) {
            this.annotations.add(new MutableRange<>(style, start, end, null, 8, null));
        }

        public final void addStringAnnotation(String tag, String annotation, int start, int end) {
            this.annotations.add(new MutableRange<>(StringAnnotation.m7606boximpl(StringAnnotation.m7607constructorimpl(annotation)), start, end, tag));
        }

        public final void addTtsAnnotation(TtsAnnotation ttsAnnotation, int start, int end) {
            this.annotations.add(new MutableRange<>(ttsAnnotation, start, end, null, 8, null));
        }

        @Deprecated
        public final void addUrlAnnotation(UrlAnnotation urlAnnotation, int start, int end) {
            this.annotations.add(new MutableRange<>(urlAnnotation, start, end, null, 8, null));
        }

        public final void addLink(LinkAnnotation.Url url, int start, int end) {
            this.annotations.add(new MutableRange<>(url, start, end, null, 8, null));
        }

        public final void addLink(LinkAnnotation.Clickable clickable, int start, int end) {
            this.annotations.add(new MutableRange<>(clickable, start, end, null, 8, null));
        }

        public final int pushStyle(SpanStyle style) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(style, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushStyle(ParagraphStyle style) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(style, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        /* compiled from: AnnotatedString.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR,\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$BulletScope;", "", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "builder", "<init>", "(Landroidx/compose/ui/text/AnnotatedString$Builder;)V", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "getBuilder$ui_text_release", "()Landroidx/compose/ui/text/AnnotatedString$Builder;", "", "Lkotlin/Pair;", "Landroidx/compose/ui/unit/TextUnit;", "Landroidx/compose/ui/text/Bullet;", "bulletListSettingStack", "Ljava/util/List;", "getBulletListSettingStack$ui_text_release", "()Ljava/util/List;", "ui-text_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        /* loaded from: classes4.dex */
        public static final class BulletScope {
            private final Builder builder;
            private final List<Tuples2<TextUnit, Bullet>> bulletListSettingStack = new ArrayList();

            public BulletScope(Builder builder) {
                this.builder = builder;
            }
        }

        public final int pushStringAnnotation(String tag, String annotation) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(StringAnnotation.m7606boximpl(StringAnnotation.m7607constructorimpl(annotation)), this.text.length(), 0, tag, 4, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushLink(LinkAnnotation link) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(link, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final void pop() {
            if (this.styleStack.isEmpty()) {
                InlineClassHelper5.throwIllegalStateException("Nothing to pop.");
            }
            this.styleStack.remove(r0.size() - 1).setEnd(this.text.length());
        }

        public final void pop(int index) {
            if (!(index < this.styleStack.size())) {
                InlineClassHelper5.throwIllegalStateException(index + " should be less than " + this.styleStack.size());
            }
            while (this.styleStack.size() - 1 >= index) {
                pop();
            }
        }

        public final AnnotatedString toAnnotatedString() {
            String string2 = this.text.toString();
            List<MutableRange<? extends Annotation>> list = this.annotations;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(list.get(i).toRange(this.text.length()));
            }
            return new AnnotatedString(string2, arrayList);
        }

        public final void mapAnnotations$ui_text_release(Function1<? super Range<? extends Annotation>, ? extends Range<? extends Annotation>> transform) {
            int size = this.annotations.size();
            for (int i = 0; i < size; i++) {
                this.annotations.set(i, MutableRange.INSTANCE.fromRange(transform.invoke(MutableRange.toRange$default(this.annotations.get(i), 0, 1, null))));
            }
        }

        public final void flatMapAnnotations$ui_text_release(Function1<? super Range<? extends Annotation>, ? extends List<? extends Range<? extends Annotation>>> transform) {
            List<MutableRange<? extends Annotation>> list = this.annotations;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                List<? extends Range<? extends Annotation>> listInvoke = transform.invoke(MutableRange.toRange$default(list.get(i), 0, 1, null));
                ArrayList arrayList2 = new ArrayList(listInvoke.size());
                int size2 = listInvoke.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList2.add(MutableRange.INSTANCE.fromRange(listInvoke.get(i2)));
                }
                CollectionsKt.addAll(arrayList, arrayList2);
            }
            this.annotations.clear();
            this.annotations.addAll(arrayList);
        }
    }
}
