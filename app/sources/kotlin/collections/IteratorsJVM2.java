package kotlin.collections;

import java.util.Enumeration;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMarkers;

/* compiled from: IteratorsJVM.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0005\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"kotlin/collections/CollectionsKt__IteratorsJVMKt$iterator$1", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlin.collections.CollectionsKt__IteratorsJVMKt$iterator$1, reason: use source file name */
/* loaded from: classes14.dex */
public final class IteratorsJVM2 implements Iterator<Object>, KMarkers {
    final /* synthetic */ Enumeration<Object> $this_iterator;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.$this_iterator.hasMoreElements();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.$this_iterator.nextElement();
    }
}
