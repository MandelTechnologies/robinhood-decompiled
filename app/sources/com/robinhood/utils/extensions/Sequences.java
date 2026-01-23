package com.robinhood.utils.extensions;

import java.util.Comparator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

/* compiled from: Sequences.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00050\u00052\u001a\u0010\b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00060\tj\n\u0012\u0006\b\u0000\u0012\u0002H\u0006`\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/utils/extensions/Sequences;", "", "<init>", "()V", "mergeSorted", "Lkotlin/sequences/Sequence;", "T", "sequences", "itemComparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class Sequences {
    public static final Sequences INSTANCE = new Sequences();

    private Sequences() {
    }

    public final <T> Sequence<T> mergeSorted(Sequence<? extends Sequence<? extends T>> sequences, Comparator<? super T> itemComparator) {
        Intrinsics.checkNotNullParameter(sequences, "sequences");
        Intrinsics.checkNotNullParameter(itemComparator, "itemComparator");
        Sequence<T> sequenceEmptySequence = kotlin.sequences.SequencesKt.emptySequence();
        Iterator<? extends Sequence<? extends T>> itIterator2 = sequences.iterator2();
        while (itIterator2.hasNext()) {
            sequenceEmptySequence = new MergeSortedSequence(itemComparator, sequenceEmptySequence, itIterator2.next());
        }
        return sequenceEmptySequence;
    }
}
