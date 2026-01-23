package kotlinx.collections.immutable.implementations.immutableList;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.internal.ListImplementation;
import kotlinx.collections.immutable.internal.commonFunctions2;

/* compiled from: SmallPersistentVector.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010*\n\u0002\b\n\b\u0000\u0018\u0000 %*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001%B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0017H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0014\u0010$\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006&"}, m3636d2 = {"Lkotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", "E", "Lkotlinx/collections/immutable/ImmutableList;", "Lkotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "", "", "buffer", "<init>", "([Ljava/lang/Object;)V", "", "elements", "Lkotlinx/collections/immutable/PersistentList;", "addAll", "(Ljava/util/Collection;)Lkotlinx/collections/immutable/PersistentList;", "Lkotlin/Function1;", "", "predicate", "removeAll", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/collections/immutable/PersistentList;", "Lkotlinx/collections/immutable/PersistentList$Builder;", "builder", "()Lkotlinx/collections/immutable/PersistentList$Builder;", "element", "", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "listIterator", "(I)Ljava/util/ListIterator;", "get", "(I)Ljava/lang/Object;", "[Ljava/lang/Object;", "getSize", "()I", "size", "Companion", "kotlinx-collections-immutable"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class SmallPersistentVector<E> extends AbstractPersistentList<E> implements ImmutableList<E> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final SmallPersistentVector EMPTY = new SmallPersistentVector(new Object[0]);
    private final Object[] buffer;

    public SmallPersistentVector(Object[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.buffer = buffer;
        commonFunctions2.m28783assert(buffer.length <= 32);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.buffer.length;
    }

    @Override // kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.Collection, java.util.List, kotlinx.collections.immutable.ImmutableList3
    public ImmutableList3<E> addAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (size() + elements.size() <= 32) {
            Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() + elements.size());
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            int size = size();
            Iterator<? extends E> it = elements.iterator();
            while (it.hasNext()) {
                objArrCopyOf[size] = it.next();
                size++;
            }
            return new SmallPersistentVector(objArrCopyOf);
        }
        ImmutableList3.Builder<E> builder = builder();
        builder.addAll(elements);
        return builder.build();
    }

    @Override // kotlinx.collections.immutable.ImmutableList3
    public ImmutableList3<E> removeAll(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArrCopyOf = this.buffer;
        int size = size();
        int size2 = size();
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = this.buffer[i];
            if (predicate.invoke(obj).booleanValue()) {
                if (!z) {
                    Object[] objArr = this.buffer;
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        if (size == 0) {
            return EMPTY;
        }
        return new SmallPersistentVector(ArraysKt.copyOfRange(objArrCopyOf, 0, size));
    }

    @Override // kotlinx.collections.immutable.ImmutableList3
    public ImmutableList3.Builder<E> builder() {
        return new PersistentVectorBuilder(this, null, this.buffer, 0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public int indexOf(Object element) {
        return ArraysKt.indexOf(this.buffer, element);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        return ArraysKt.lastIndexOf(this.buffer, element);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public ListIterator<E> listIterator(int index) {
        ListImplementation.checkPositionIndex$kotlinx_collections_immutable(index, size());
        return new BufferIterator(this.buffer, index, size());
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public E get(int index) {
        ListImplementation.checkElementIndex$kotlinx_collections_immutable(index, size());
        return (E) this.buffer[index];
    }

    /* compiled from: SmallPersistentVector.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lkotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector$Companion;", "", "()V", "EMPTY", "Lkotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", "", "getEMPTY", "()Lkotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", "kotlinx-collections-immutable"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SmallPersistentVector getEMPTY() {
            return SmallPersistentVector.EMPTY;
        }
    }
}
