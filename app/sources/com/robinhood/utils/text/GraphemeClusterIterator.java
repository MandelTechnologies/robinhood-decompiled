package com.robinhood.utils.text;

import java.text.BreakIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges2;

/* compiled from: GraphemeClusterIterator.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eJ \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0010\u001a\u00020\u000eJ\u0006\u0010\u0013\u001a\u00020\u000eJ\u0006\u0010\u0014\u001a\u00020\u000eJ\u0006\u0010\u0015\u001a\u00020\u000eJ\u0006\u0010\u0016\u001a\u00020\u000eJ\u0006\u0010\u0017\u001a\u00020\u000eJ \u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0010\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/utils/text/GraphemeClusterIterator;", "", "<init>", "()V", "characterIterator", "Lcom/robinhood/utils/text/CharSequenceCharacterIterator;", "breakIterator", "Ljava/text/BreakIterator;", "kotlin.jvm.PlatformType", "replaceText", "", "text", "", "beginIndex", "", "endIndex", "position", "range", "Lkotlin/ranges/IntRange;", "first", "last", "next", "previous", "count", "Companion", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class GraphemeClusterIterator {
    public static final int DONE = -1;
    private final BreakIterator breakIterator;
    private final CharSequenceCharacterIterator characterIterator;

    public GraphemeClusterIterator() {
        CharSequenceCharacterIterator charSequenceCharacterIterator = new CharSequenceCharacterIterator(null, 0, 0, 0, 15, null);
        this.characterIterator = charSequenceCharacterIterator;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequenceCharacterIterator);
        this.breakIterator = characterInstance;
    }

    public static /* synthetic */ void replaceText$default(GraphemeClusterIterator graphemeClusterIterator, CharSequence charSequence, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = charSequence.length();
        }
        if ((i4 & 8) != 0) {
            i3 = i;
        }
        graphemeClusterIterator.replaceText(charSequence, i, i2, i3);
    }

    public final void replaceText(CharSequence text, int beginIndex, int endIndex, int position) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.characterIterator.replaceText(text, beginIndex, endIndex, position);
        this.breakIterator.setText(this.characterIterator);
    }

    public static /* synthetic */ void replaceText$default(GraphemeClusterIterator graphemeClusterIterator, CharSequence charSequence, PrimitiveRanges2 primitiveRanges2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = primitiveRanges2.getFirst();
        }
        graphemeClusterIterator.replaceText(charSequence, primitiveRanges2, i);
    }

    public final void replaceText(CharSequence text, PrimitiveRanges2 range, int position) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(range, "range");
        replaceText(text, range.getFirst(), range.getLast() + 1, position);
    }

    public final int first() {
        return this.breakIterator.first();
    }

    public final int last() {
        return this.breakIterator.last();
    }

    public final int next() {
        return this.breakIterator.next();
    }

    public final int previous() {
        return this.breakIterator.previous();
    }

    public final int count() {
        BreakIterator breakIterator = this.breakIterator;
        Intrinsics.checkNotNullExpressionValue(breakIterator, "breakIterator");
        return BreakIterators.count(breakIterator);
    }

    public static /* synthetic */ int count$default(GraphemeClusterIterator graphemeClusterIterator, CharSequence charSequence, PrimitiveRanges2 primitiveRanges2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = primitiveRanges2.getFirst();
        }
        return graphemeClusterIterator.count(charSequence, primitiveRanges2, i);
    }

    public final int count(CharSequence text, PrimitiveRanges2 range, int position) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(range, "range");
        replaceText(text, range, position);
        return count();
    }
}
