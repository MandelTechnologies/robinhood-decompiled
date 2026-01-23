package kotlinx.collections.immutable.implementations.persistentOrderedSet;

import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableSet3;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import kotlinx.collections.immutable.internal.EndOfChain;
import kotlinx.collections.immutable.internal.commonFunctions2;

/* compiled from: PersistentOrderedSetBuilder.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001fR&\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020&0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001c¨\u0006-"}, m3636d2 = {"Lkotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetBuilder;", "E", "Lkotlin/collections/AbstractMutableSet;", "Lkotlinx/collections/immutable/PersistentSet$Builder;", "Lkotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "set", "<init>", "(Lkotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;)V", "Lkotlinx/collections/immutable/PersistentSet;", "build", "()Lkotlinx/collections/immutable/PersistentSet;", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "remove", "", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "", "other", "equals", "", "hashCode", "()I", "Lkotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "firstElement", "Ljava/lang/Object;", "getFirstElement$kotlinx_collections_immutable", "()Ljava/lang/Object;", "setFirstElement$kotlinx_collections_immutable", "(Ljava/lang/Object;)V", "lastElement", "Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "Lkotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "hashMapBuilder", "Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "getHashMapBuilder$kotlinx_collections_immutable", "()Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "getSize", "size", "kotlinx-collections-immutable"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class PersistentOrderedSetBuilder<E> extends AbstractMutableSet<E> implements ImmutableSet3.Builder<E> {
    private Object firstElement;
    private final PersistentHashMapBuilder<E, PersistentOrderedSet3> hashMapBuilder;
    private Object lastElement;
    private PersistentOrderedSet<E> set;

    public PersistentOrderedSetBuilder(PersistentOrderedSet<E> set) {
        Intrinsics.checkNotNullParameter(set, "set");
        this.set = set;
        this.firstElement = set.getFirstElement();
        this.lastElement = this.set.getLastElement();
        this.hashMapBuilder = this.set.getHashMap$kotlinx_collections_immutable().builder();
    }

    /* renamed from: getFirstElement$kotlinx_collections_immutable, reason: from getter */
    public final Object getFirstElement() {
        return this.firstElement;
    }

    public final PersistentHashMapBuilder<E, PersistentOrderedSet3> getHashMapBuilder$kotlinx_collections_immutable() {
        return this.hashMapBuilder;
    }

    @Override // kotlin.collections.AbstractMutableSet
    public int getSize() {
        return this.hashMapBuilder.size();
    }

    @Override // kotlinx.collections.immutable.ImmutableSet3.Builder
    public ImmutableSet3<E> build() {
        PersistentOrderedSet<E> persistentOrderedSet;
        PersistentHashMap<E, PersistentOrderedSet3> persistentHashMapBuild = this.hashMapBuilder.build();
        if (persistentHashMapBuild == this.set.getHashMap$kotlinx_collections_immutable()) {
            commonFunctions2.m28783assert(this.firstElement == this.set.getFirstElement());
            commonFunctions2.m28783assert(this.lastElement == this.set.getLastElement());
            persistentOrderedSet = this.set;
        } else {
            persistentOrderedSet = new PersistentOrderedSet<>(this.firstElement, this.lastElement, persistentHashMapBuild);
        }
        this.set = persistentOrderedSet;
        return persistentOrderedSet;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object element) {
        return this.hashMapBuilder.containsKey(element);
    }

    @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E element) {
        if (this.hashMapBuilder.containsKey(element)) {
            return false;
        }
        if (isEmpty()) {
            this.firstElement = element;
            this.lastElement = element;
            this.hashMapBuilder.put(element, new PersistentOrderedSet3());
            return true;
        }
        PersistentOrderedSet3 persistentOrderedSet3 = this.hashMapBuilder.get(this.lastElement);
        Intrinsics.checkNotNull(persistentOrderedSet3);
        this.hashMapBuilder.put(this.lastElement, persistentOrderedSet3.withNext(element));
        this.hashMapBuilder.put(element, new PersistentOrderedSet3(this.lastElement));
        this.lastElement = element;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object element) {
        PersistentOrderedSet3 persistentOrderedSet3Remove = this.hashMapBuilder.remove(element);
        if (persistentOrderedSet3Remove == null) {
            return false;
        }
        if (persistentOrderedSet3Remove.getHasPrevious()) {
            PersistentOrderedSet3 persistentOrderedSet3 = this.hashMapBuilder.get(persistentOrderedSet3Remove.getPrevious());
            Intrinsics.checkNotNull(persistentOrderedSet3);
            this.hashMapBuilder.put(persistentOrderedSet3Remove.getPrevious(), persistentOrderedSet3.withNext(persistentOrderedSet3Remove.getNext()));
        } else {
            this.firstElement = persistentOrderedSet3Remove.getNext();
        }
        if (persistentOrderedSet3Remove.getHasNext()) {
            PersistentOrderedSet3 persistentOrderedSet32 = this.hashMapBuilder.get(persistentOrderedSet3Remove.getNext());
            Intrinsics.checkNotNull(persistentOrderedSet32);
            this.hashMapBuilder.put(persistentOrderedSet3Remove.getNext(), persistentOrderedSet32.withPrevious(persistentOrderedSet3Remove.getPrevious()));
            return true;
        }
        this.lastElement = persistentOrderedSet3Remove.getPrevious();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.hashMapBuilder.clear();
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        this.firstElement = endOfChain;
        this.lastElement = endOfChain;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new PersistentOrderedSetMutableIterator(this);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Set)) {
            return false;
        }
        Set set = (Set) other;
        if (size() != set.size()) {
            return false;
        }
        if (set instanceof PersistentOrderedSet) {
            return this.hashMapBuilder.getNode$kotlinx_collections_immutable().equalsWith$kotlinx_collections_immutable(((PersistentOrderedSet) other).getHashMap$kotlinx_collections_immutable().getNode$kotlinx_collections_immutable(), new Function2<PersistentOrderedSet3, PersistentOrderedSet3, Boolean>() { // from class: kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder.equals.1
                @Override // kotlin.jvm.functions.Function2
                public final Boolean invoke(PersistentOrderedSet3 persistentOrderedSet3, PersistentOrderedSet3 persistentOrderedSet32) {
                    Intrinsics.checkNotNullParameter(persistentOrderedSet3, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(persistentOrderedSet32, "<anonymous parameter 1>");
                    return Boolean.TRUE;
                }
            });
        }
        if (set instanceof PersistentOrderedSetBuilder) {
            return this.hashMapBuilder.getNode$kotlinx_collections_immutable().equalsWith$kotlinx_collections_immutable(((PersistentOrderedSetBuilder) other).hashMapBuilder.getNode$kotlinx_collections_immutable(), new Function2<PersistentOrderedSet3, PersistentOrderedSet3, Boolean>() { // from class: kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder.equals.2
                @Override // kotlin.jvm.functions.Function2
                public final Boolean invoke(PersistentOrderedSet3 persistentOrderedSet3, PersistentOrderedSet3 persistentOrderedSet32) {
                    Intrinsics.checkNotNullParameter(persistentOrderedSet3, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(persistentOrderedSet32, "<anonymous parameter 1>");
                    return Boolean.TRUE;
                }
            });
        }
        return super.equals(other);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return super.hashCode();
    }
}
