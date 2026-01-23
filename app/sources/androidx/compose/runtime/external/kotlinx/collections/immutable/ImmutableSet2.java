package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMarkers2;
import kotlin.jvm.internal.markers.KMarkers8;

/* compiled from: ImmutableSet.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0010J\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\u0006J#\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH&¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, m3636d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "", "element", "add", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "", "elements", "addAll", "(Ljava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "remove", "removeAll", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "builder", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "Builder", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet, reason: use source file name */
/* loaded from: classes.dex */
public interface ImmutableSet2<E> extends ImmutableSet<E>, ImmutableCollection {

    /* compiled from: ImmutableSet.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003J\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m3636d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "E", "", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "build", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet$Builder */
    /* loaded from: classes4.dex */
    public interface Builder<E> extends Set<E>, Collection, KMarkers2, KMarkers8 {
        ImmutableSet2<E> build();
    }

    @Override // java.util.Set, java.util.Collection
    ImmutableSet2<E> add(E element);

    @Override // java.util.Set, java.util.Collection
    ImmutableSet2<E> addAll(Collection<? extends E> elements);

    Builder<E> builder();

    @Override // java.util.Set, java.util.Collection
    ImmutableSet2<E> remove(E element);

    @Override // java.util.Set, java.util.Collection
    ImmutableSet2<E> removeAll(Collection<? extends E> elements);
}
