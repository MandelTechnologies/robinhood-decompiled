package com.robinhood.utils.extensions;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMarkers;
import kotlin.sequences.Sequence;

/* compiled from: Sequences.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0002\b\u0002\u0018\u0000 \f*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\fB?\u0012\u001a\u0010\u0003\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0002R\"\u0010\u0003\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/utils/extensions/MergeSortedSequence;", "T", "Lkotlin/sequences/Sequence;", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "sequence1", "sequence2", "<init>", "(Ljava/util/Comparator;Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;)V", "iterator", "", "Companion", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
final class MergeSortedSequence<T> implements Sequence<T> {
    private static final Object NONE = new Object();
    private final Comparator<? super T> comparator;
    private final Sequence<T> sequence1;
    private final Sequence<T> sequence2;

    /* JADX WARN: Multi-variable type inference failed */
    public MergeSortedSequence(Comparator<? super T> comparator, Sequence<? extends T> sequence1, Sequence<? extends T> sequence2) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(sequence1, "sequence1");
        Intrinsics.checkNotNullParameter(sequence2, "sequence2");
        this.comparator = comparator;
        this.sequence1 = sequence1;
        this.sequence2 = sequence2;
    }

    /* compiled from: Sequences.kt */
    @Metadata(m3635d1 = {"\u0000\u0013\n\u0000\n\u0002\u0010(\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000e\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0004J\t\u0010\u0011\u001a\u00020\u0012H\u0096\u0002R\u001c\u0010\u0002\u001a\u00028\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0007\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00028\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0004\"\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, m3636d2 = {"com/robinhood/utils/extensions/MergeSortedSequence$iterator$1", "", "head1", "getHead1", "()Ljava/lang/Object;", "setHead1", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "head2", "getHead2", "setHead2", "iterator1", "getIterator1", "()Ljava/util/Iterator;", "iterator2", "getIterator2", "next", "hasNext", "", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.utils.extensions.MergeSortedSequence$iterator$1 */
    public static final class C419211 implements Iterator<T>, KMarkers {
        private T head1 = (T) MergeSortedSequence.NONE;
        private T head2 = (T) MergeSortedSequence.NONE;
        private final Iterator<T> iterator1;
        private final Iterator<T> iterator2;
        final /* synthetic */ MergeSortedSequence<T> this$0;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C419211(MergeSortedSequence<T> mergeSortedSequence) {
            this.this$0 = mergeSortedSequence;
            this.iterator1 = ((MergeSortedSequence) mergeSortedSequence).sequence1.iterator();
            this.iterator2 = ((MergeSortedSequence) mergeSortedSequence).sequence2.iterator();
        }

        public final T getHead1() {
            return this.head1;
        }

        public final void setHead1(T t) {
            this.head1 = t;
        }

        public final T getHead2() {
            return this.head2;
        }

        public final void setHead2(T t) {
            this.head2 = t;
        }

        public final Iterator<T> getIterator1() {
            return this.iterator1;
        }

        public final Iterator<T> getIterator2() {
            return this.iterator2;
        }

        @Override // java.util.Iterator
        public T next() {
            T next;
            T next2;
            if (this.head1 != MergeSortedSequence.NONE) {
                next = this.head1;
                this.head1 = (T) MergeSortedSequence.NONE;
            } else {
                next = this.iterator1.hasNext() ? this.iterator1.next() : (T) MergeSortedSequence.NONE;
            }
            if (this.head2 != MergeSortedSequence.NONE) {
                next2 = this.head2;
                this.head2 = (T) MergeSortedSequence.NONE;
            } else {
                next2 = this.iterator2.hasNext() ? this.iterator2.next() : (T) MergeSortedSequence.NONE;
            }
            if (next != MergeSortedSequence.NONE) {
                if (next2 == MergeSortedSequence.NONE) {
                    return next;
                }
                if (((MergeSortedSequence) this.this$0).comparator.compare(next, next2) <= 0) {
                    this.head2 = next2;
                    return next;
                }
                this.head1 = next;
                return next2;
            }
            if (next2 != MergeSortedSequence.NONE) {
                return next2;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.head1 != MergeSortedSequence.NONE || this.head2 != MergeSortedSequence.NONE || this.iterator1.hasNext() || this.iterator2.hasNext();
        }
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> iterator() {
        return new C419211(this);
    }
}
