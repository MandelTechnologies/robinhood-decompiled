package kotlinx.collections.immutable;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMarkers2;
import kotlin.jvm.internal.markers.KMarkers5;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: ImmutableList.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0010J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m3636d2 = {"Lkotlinx/collections/immutable/PersistentList;", "E", "Lkotlinx/collections/immutable/ImmutableList;", "", "", "elements", "addAll", "(Ljava/util/Collection;)Lkotlinx/collections/immutable/PersistentList;", "Lkotlin/Function1;", "", "predicate", "removeAll", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/collections/immutable/PersistentList;", "Lkotlinx/collections/immutable/PersistentList$Builder;", "builder", "()Lkotlinx/collections/immutable/PersistentList$Builder;", "Builder", "kotlinx-collections-immutable"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: kotlinx.collections.immutable.PersistentList, reason: use source file name */
/* loaded from: classes23.dex */
public interface ImmutableList3<E> extends ImmutableList<E>, ImmutableCollection {

    /* compiled from: ImmutableList.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003J\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lkotlinx/collections/immutable/PersistentList$Builder;", "E", "", "", "Lkotlinx/collections/immutable/PersistentList;", "build", "()Lkotlinx/collections/immutable/PersistentList;", "kotlinx-collections-immutable"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: kotlinx.collections.immutable.PersistentList$Builder */
    public interface Builder<E> extends List<E>, Collection, KMarkers2, KMarkers5 {
        ImmutableList3<E> build();
    }

    @Override // java.util.List, java.util.Collection
    ImmutableList3<E> addAll(Collection<? extends E> elements);

    Builder<E> builder();

    ImmutableList3<E> removeAll(Function1<? super E, Boolean> predicate);

    /* compiled from: ImmutableList.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: kotlinx.collections.immutable.PersistentList$DefaultImpls */
    /* loaded from: classes14.dex */
    public static final class DefaultImpls {
        public static <E> ImmutableList<E> subList(ImmutableList3<? extends E> immutableList3, int i, int i2) {
            return ImmutableList.DefaultImpls.subList(immutableList3, i, i2);
        }
    }
}
