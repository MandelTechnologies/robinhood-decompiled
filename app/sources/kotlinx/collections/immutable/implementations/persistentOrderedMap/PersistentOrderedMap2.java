package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import kotlin.Metadata;
import kotlinx.collections.immutable.internal.EndOfChain;

/* compiled from: PersistentOrderedMap.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0006B!\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\bJ\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002J\u0019\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0002\u0010\u001aR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lkotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "V", "", "value", "(Ljava/lang/Object;)V", "previous", "(Ljava/lang/Object;Ljava/lang/Object;)V", "next", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "hasNext", "", "getHasNext", "()Z", "hasPrevious", "getHasPrevious", "getNext", "()Ljava/lang/Object;", "getPrevious", "getValue", "Ljava/lang/Object;", "withNext", "newNext", "withPrevious", "newPrevious", "withValue", "newValue", "(Ljava/lang/Object;)Lkotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "kotlinx-collections-immutable"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue, reason: use source file name */
/* loaded from: classes23.dex */
public final class PersistentOrderedMap2<V> {
    private final Object next;
    private final Object previous;
    private final V value;

    public PersistentOrderedMap2(V v, Object obj, Object obj2) {
        this.value = v;
        this.previous = obj;
        this.next = obj2;
    }

    public final Object getNext() {
        return this.next;
    }

    public final Object getPrevious() {
        return this.previous;
    }

    public final V getValue() {
        return this.value;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PersistentOrderedMap2(V v) {
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        this(v, endOfChain, endOfChain);
    }

    public PersistentOrderedMap2(V v, Object obj) {
        this(v, obj, EndOfChain.INSTANCE);
    }

    public final PersistentOrderedMap2<V> withValue(V newValue) {
        return new PersistentOrderedMap2<>(newValue, this.previous, this.next);
    }

    public final PersistentOrderedMap2<V> withPrevious(Object newPrevious) {
        return new PersistentOrderedMap2<>(this.value, newPrevious, this.next);
    }

    public final PersistentOrderedMap2<V> withNext(Object newNext) {
        return new PersistentOrderedMap2<>(this.value, this.previous, newNext);
    }

    public final boolean getHasNext() {
        return this.next != EndOfChain.INSTANCE;
    }

    public final boolean getHasPrevious() {
        return this.previous != EndOfChain.INSTANCE;
    }
}
