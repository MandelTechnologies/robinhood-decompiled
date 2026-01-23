package kotlinx.collections.immutable.implementations.persistentOrderedSet;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableSet3;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import kotlinx.collections.immutable.internal.EndOfChain;

/* compiled from: PersistentOrderedSet.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u0000 +*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001+B/\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u000fJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b%\u0010$R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010!¨\u0006,"}, m3636d2 = {"Lkotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "E", "Lkotlin/collections/AbstractSet;", "Lkotlinx/collections/immutable/PersistentSet;", "", "firstElement", "lastElement", "Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "Lkotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "(Ljava/lang/Object;)Lkotlinx/collections/immutable/PersistentSet;", "", "elements", "addAll", "(Ljava/util/Collection;)Lkotlinx/collections/immutable/PersistentSet;", "removeAll", "", "iterator", "()Ljava/util/Iterator;", "Lkotlinx/collections/immutable/PersistentSet$Builder;", "builder", "()Lkotlinx/collections/immutable/PersistentSet$Builder;", "other", "equals", "", "hashCode", "()I", "Ljava/lang/Object;", "getFirstElement$kotlinx_collections_immutable", "()Ljava/lang/Object;", "getLastElement$kotlinx_collections_immutable", "Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "getHashMap$kotlinx_collections_immutable", "()Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "getSize", "size", "Companion", "kotlinx-collections-immutable"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class PersistentOrderedSet<E> extends AbstractSet<E> implements ImmutableSet3<E> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final PersistentOrderedSet EMPTY;
    private final Object firstElement;
    private final PersistentHashMap<E, PersistentOrderedSet3> hashMap;
    private final Object lastElement;

    /* renamed from: getFirstElement$kotlinx_collections_immutable, reason: from getter */
    public final Object getFirstElement() {
        return this.firstElement;
    }

    /* renamed from: getLastElement$kotlinx_collections_immutable, reason: from getter */
    public final Object getLastElement() {
        return this.lastElement;
    }

    public final PersistentHashMap<E, PersistentOrderedSet3> getHashMap$kotlinx_collections_immutable() {
        return this.hashMap;
    }

    public PersistentOrderedSet(Object obj, Object obj2, PersistentHashMap<E, PersistentOrderedSet3> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "hashMap");
        this.firstElement = obj;
        this.lastElement = obj2;
        this.hashMap = hashMap;
    }

    @Override // java.util.Collection, java.util.Set, kotlinx.collections.immutable.ImmutableSet3
    public ImmutableSet3<E> addAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        ImmutableSet3.Builder<E> builder = builder();
        builder.addAll(elements);
        return builder.build();
    }

    @Override // java.util.Collection, java.util.Set, kotlinx.collections.immutable.ImmutableSet3
    public ImmutableSet3<E> removeAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        ImmutableSet3.Builder<E> builder = builder();
        builder.removeAll(elements);
        return builder.build();
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.hashMap.size();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return this.hashMap.containsKey(element);
    }

    @Override // java.util.Collection, java.util.Set, kotlinx.collections.immutable.ImmutableSet3
    public ImmutableSet3<E> add(E element) {
        if (this.hashMap.containsKey(element)) {
            return this;
        }
        if (isEmpty()) {
            return new PersistentOrderedSet(element, element, this.hashMap.put((PersistentHashMap<E, PersistentOrderedSet3>) element, (E) new PersistentOrderedSet3()));
        }
        Object obj = this.lastElement;
        PersistentOrderedSet3 persistentOrderedSet3 = this.hashMap.get(obj);
        Intrinsics.checkNotNull(persistentOrderedSet3);
        return new PersistentOrderedSet(this.firstElement, element, this.hashMap.put((PersistentHashMap<E, PersistentOrderedSet3>) obj, (Object) persistentOrderedSet3.withNext(element)).put((PersistentHashMap) element, (E) new PersistentOrderedSet3(obj)));
    }

    @Override // kotlin.collections.AbstractSet, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new PersistentOrderedSetIterator(this.firstElement, this.hashMap);
    }

    @Override // kotlinx.collections.immutable.ImmutableSet3
    public ImmutableSet3.Builder<E> builder() {
        return new PersistentOrderedSetBuilder(this);
    }

    @Override // kotlin.collections.AbstractSet, java.util.Collection, java.util.Set
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
            return this.hashMap.getNode$kotlinx_collections_immutable().equalsWith$kotlinx_collections_immutable(((PersistentOrderedSet) other).hashMap.getNode$kotlinx_collections_immutable(), new Function2<PersistentOrderedSet3, PersistentOrderedSet3, Boolean>() { // from class: kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet.equals.1
                @Override // kotlin.jvm.functions.Function2
                public final Boolean invoke(PersistentOrderedSet3 persistentOrderedSet3, PersistentOrderedSet3 persistentOrderedSet32) {
                    Intrinsics.checkNotNullParameter(persistentOrderedSet3, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(persistentOrderedSet32, "<anonymous parameter 1>");
                    return Boolean.TRUE;
                }
            });
        }
        if (set instanceof PersistentOrderedSetBuilder) {
            return this.hashMap.getNode$kotlinx_collections_immutable().equalsWith$kotlinx_collections_immutable(((PersistentOrderedSetBuilder) other).getHashMapBuilder$kotlinx_collections_immutable().getNode$kotlinx_collections_immutable(), new Function2<PersistentOrderedSet3, PersistentOrderedSet3, Boolean>() { // from class: kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet.equals.2
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

    @Override // kotlin.collections.AbstractSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return super.hashCode();
    }

    /* compiled from: PersistentOrderedSet.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0001\u0010\bH\u0000¢\u0006\u0002\b\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lkotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet$Companion;", "", "()V", "EMPTY", "Lkotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "", "emptyOf", "Lkotlinx/collections/immutable/PersistentSet;", "E", "emptyOf$kotlinx_collections_immutable", "kotlinx-collections-immutable"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <E> ImmutableSet3<E> emptyOf$kotlinx_collections_immutable() {
            return PersistentOrderedSet.EMPTY;
        }
    }

    static {
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        EMPTY = new PersistentOrderedSet(endOfChain, endOfChain, PersistentHashMap.INSTANCE.emptyOf$kotlinx_collections_immutable());
    }
}
