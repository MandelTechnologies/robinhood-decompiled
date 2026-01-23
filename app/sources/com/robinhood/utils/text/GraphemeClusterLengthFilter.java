package com.robinhood.utils.text;

import android.text.InputFilter;
import android.text.Spanned;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.extensions.ClosedRanges;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;

/* compiled from: GraphemeClusterLengthFilter.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0003J:\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/utils/text/GraphemeClusterLengthFilter;", "Landroid/text/InputFilter;", AnalyticsStrings.MAX_WELCOME_TAG, "", "excludedSpanTypes", "", "Ljava/lang/Class;", "<init>", "(ILjava/util/List;)V", "getMax", "()I", "getExcludedSpanTypes", "()Ljava/util/List;", "graphemeIterator", "Lcom/robinhood/utils/text/GraphemeClusterIterator;", "count", "text", "", "beginIndex", "endIndex", "filter", "source", "start", "end", "dest", "Landroid/text/Spanned;", "destStart", "destEnd", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class GraphemeClusterLengthFilter implements InputFilter {
    private final List<Class<?>> excludedSpanTypes;
    private final GraphemeClusterIterator graphemeIterator;
    private final int max;

    /* JADX WARN: Multi-variable type inference failed */
    public GraphemeClusterLengthFilter(int i, List<? extends Class<?>> excludedSpanTypes) {
        Intrinsics.checkNotNullParameter(excludedSpanTypes, "excludedSpanTypes");
        this.max = i;
        this.excludedSpanTypes = excludedSpanTypes;
        this.graphemeIterator = new GraphemeClusterIterator();
    }

    public final int getMax() {
        return this.max;
    }

    public /* synthetic */ GraphemeClusterLengthFilter(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<Class<?>> getExcludedSpanTypes() {
        return this.excludedSpanTypes;
    }

    public static /* synthetic */ int count$default(GraphemeClusterLengthFilter graphemeClusterLengthFilter, CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        return graphemeClusterLengthFilter.count(charSequence, i, i2);
    }

    public final int count(CharSequence text, int beginIndex, int endIndex) {
        CharSequence text2 = text;
        Intrinsics.checkNotNullParameter(text2, "text");
        PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(beginIndex, endIndex);
        int iCount$default = GraphemeClusterIterator.count$default(this.graphemeIterator, text2, primitiveRanges2Until, 0, 4, null);
        if (!(text2 instanceof Spanned)) {
            return iCount$default;
        }
        Iterator<T> it = this.excludedSpanTypes.iterator();
        int i = 0;
        while (it.hasNext()) {
            Spanned spanned = (Spanned) text2;
            Object[] spans$default = SpannablesKt.getSpans$default(spanned, (Class) it.next(), 0, 0, 6, null);
            int length = spans$default.length;
            int i2 = 0;
            int iCount$default2 = 0;
            while (i2 < length) {
                Object obj = spans$default[i2];
                Intrinsics.checkNotNull(obj);
                PrimitiveRanges2 spanRange = SpannablesKt.getSpanRange(spanned, obj);
                Intrinsics.checkNotNull(spanRange);
                PrimitiveRanges2 primitiveRanges2Intersect = ClosedRanges.intersect(spanRange, primitiveRanges2Until);
                iCount$default2 += primitiveRanges2Intersect.isEmpty() ? 0 : GraphemeClusterIterator.count$default(this.graphemeIterator, text2, primitiveRanges2Intersect, 0, 4, null);
                i2++;
                text2 = text;
            }
            i += iCount$default2;
            text2 = text;
        }
        return iCount$default - i;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int destStart, int destEnd) {
        int i;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dest, "dest");
        int iCount$default = count$default(this, dest, 0, destStart, 2, null) + count$default(this, dest, destEnd, 0, 4, null) + count(source, start, end);
        int i2 = this.max;
        if (iCount$default <= i2) {
            return null;
        }
        int i3 = iCount$default - i2;
        int iLast = this.graphemeIterator.last();
        int iPrevious = this.graphemeIterator.previous();
        int i4 = 0;
        while (true) {
            int i5 = iPrevious;
            i = iLast;
            iLast = i5;
            if (iLast == -1 || i4 >= i3) {
                break;
            }
            i4++;
            iPrevious = this.graphemeIterator.previous();
        }
        return source.subSequence(start, i);
    }
}
