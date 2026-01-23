package com.robinhood.utils.extensions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Lists.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JS\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u00062\u001e\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00050\b\"\b\u0012\u0004\u0012\u0002H\u00060\u00052\u001a\u0010\t\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00060\nj\n\u0012\u0006\b\u0000\u0012\u0002H\u0006`\u000b¢\u0006\u0002\u0010\fJt\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0005\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u0010\"\u0004\b\u0002\u0010\u0011\"\u0004\b\u0003\u0010\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00052\u001e\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u000e0\u0016H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/utils/extensions/Lists;", "", "<init>", "()V", "combineSorted", "", "T", "lists", "", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "([Ljava/util/List;Ljava/util/Comparator;)Ljava/util/List;", "cartesianProduct", "R", "A", "B", "C", "first", "second", "third", "combiner", "Lkotlin/Function3;", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class Lists {
    public static final Lists INSTANCE = new Lists();

    private Lists() {
    }

    public final <A, B, C, R> List<R> cartesianProduct(List<? extends A> first, List<? extends B> second, List<? extends C> third, Function3<? super A, ? super B, ? super C, ? extends R> combiner) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        Intrinsics.checkNotNullParameter(third, "third");
        Intrinsics.checkNotNullParameter(combiner, "combiner");
        ArrayList arrayList = new ArrayList(first.size() * second.size() * third.size());
        for (A a : first) {
            for (B b : second) {
                Iterator<? extends C> it = third.iterator();
                while (it.hasNext()) {
                    arrayList.add(combiner.invoke(a, b, it.next()));
                }
            }
        }
        return arrayList;
    }

    public final <T> List<T> combineSorted(List<? extends T>[] lists, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(lists, "lists");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int size = 0;
        for (List<? extends T> list : lists) {
            size += list.size();
        }
        ArrayList arrayList = new ArrayList(size);
        for (List<? extends T> list2 : lists) {
            arrayList.addAll(list2);
        }
        CollectionsKt.sortWith(arrayList, comparator);
        return arrayList;
    }
}
