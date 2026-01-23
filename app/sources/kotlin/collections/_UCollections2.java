package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.Unsigned;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _UCollections.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"", "Lkotlin/ULong;", "Lkotlin/ULongArray;", "toULongArray", "(Ljava/util/Collection;)[J", "kotlin-stdlib"}, m3637k = 5, m3638mv = {2, 1, 0}, m3640xi = 49, m3641xs = "kotlin/collections/UCollectionsKt")
/* renamed from: kotlin.collections.UCollectionsKt___UCollectionsKt, reason: use source file name */
/* loaded from: classes14.dex */
public class _UCollections2 {
    @SinceKotlin
    @Unsigned
    public static long[] toULongArray(Collection<ULong> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        long[] jArrM28612constructorimpl = ULongArray.m28612constructorimpl(collection.size());
        Iterator<ULong> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            ULongArray.m28623setk8EXiF4(jArrM28612constructorimpl, i, it.next().getData());
            i++;
        }
        return jArrM28612constructorimpl;
    }
}
