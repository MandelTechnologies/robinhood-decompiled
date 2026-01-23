package androidx.compose.runtime.collection;

import androidx.collection.ObjectList;
import androidx.collection.ObjectList2;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Extensions.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aK\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001aE\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007H\u0000¢\u0006\u0004\b\f\u0010\r\u001aE\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"T", "Landroidx/collection/ObjectList;", "Landroidx/collection/MutableObjectList;", "toMutableObjectList", "(Landroidx/collection/ObjectList;)Landroidx/collection/MutableObjectList;", "", "K", "Lkotlin/Function1;", "selector", "sortedBy", "(Landroidx/collection/ObjectList;Lkotlin/jvm/functions/Function1;)Landroidx/collection/ObjectList;", "", "isSorted", "(Landroidx/collection/ObjectList;Lkotlin/jvm/functions/Function1;)Z", "", "sortBy", "(Landroidx/collection/MutableObjectList;Lkotlin/jvm/functions/Function1;)V", "removeLast", "(Landroidx/collection/MutableObjectList;)Ljava/lang/Object;", "runtime_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ExtensionsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> ObjectList2<T> toMutableObjectList(ObjectList<T> objectList) {
        ObjectList2<T> objectList2 = (ObjectList2<T>) new ObjectList2(objectList.get_size());
        Object[] objArr = objectList.content;
        int i = objectList._size;
        for (int i2 = 0; i2 < i; i2++) {
            objectList2.add(objArr[i2]);
        }
        return objectList2;
    }

    public static final <T, K extends Comparable<? super K>> ObjectList<T> sortedBy(ObjectList<T> objectList, Function1<? super T, ? extends K> function1) {
        if (isSorted(objectList, function1)) {
            return objectList;
        }
        ObjectList2 mutableObjectList = toMutableObjectList(objectList);
        sortBy(mutableObjectList, function1);
        return mutableObjectList;
    }

    public static final <T, K extends Comparable<? super K>> boolean isSorted(ObjectList<T> objectList, Function1<? super T, ? extends K> function1) {
        if (objectList.get_size() <= 1) {
            return true;
        }
        K kInvoke = function1.invoke(objectList.get(0));
        if (kInvoke == null) {
            return false;
        }
        int i = objectList.get_size();
        int i2 = 1;
        while (i2 < i) {
            K kInvoke2 = function1.invoke(objectList.get(i2));
            if (kInvoke2 == null || kInvoke.compareTo(kInvoke2) > 0) {
                return false;
            }
            i2++;
            kInvoke = kInvoke2;
        }
        return true;
    }

    public static final <T, K extends Comparable<? super K>> void sortBy(ObjectList2<T> objectList2, final Function1<? super T, ? extends K> function1) {
        List<T> listAsMutableList = objectList2.asMutableList();
        if (listAsMutableList.size() > 1) {
            CollectionsKt.sortWith(listAsMutableList, new Comparator() { // from class: androidx.compose.runtime.collection.ExtensionsKt$sortBy$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    Function1 function12 = function1;
                    return ComparisonsKt.compareValues((Comparable) function12.invoke(t), (Comparable) function12.invoke(t2));
                }
            });
        }
    }

    public static final <T> T removeLast(ObjectList2<T> objectList2) {
        if (objectList2.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i = objectList2.get_size() - 1;
        T t = objectList2.get(i);
        objectList2.removeAt(i);
        return t;
    }
}
