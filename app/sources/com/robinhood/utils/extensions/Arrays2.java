package com.robinhood.utils.extensions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Arrays.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0005\u001aN\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0086\b¢\u0006\u0002\u0010\t\u001a'\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000b0\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003¢\u0006\u0002\u0010\f\u001a6\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u000e\"\b\b\u0000\u0010\u000f*\u00020\u0010*\u00020\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u0001H\u000f0\u0013H\u0086\bø\u0001\u0000\u001aO\u0010\u0014\u001a\u0002H\u0015\"\b\b\u0000\u0010\u000f*\u00020\u0010\"\u0010\b\u0001\u0010\u0015*\n\u0012\u0006\b\u0000\u0012\u0002H\u000f0\u0016*\u00020\u00112\u0006\u0010\u0004\u001a\u0002H\u00152\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u0001H\u000f0\u0013H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a*\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u0001H\u0002H\u0086\b¢\u0006\u0002\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b"}, m3636d2 = {"copyTo", "", "T", "", "destination", "sourcePosition", "", "destinationPosition", "length", "([Ljava/lang/Object;[Ljava/lang/Object;III)V", "arrayWithIndex", "Lkotlin/collections/IndexedValue;", "([Ljava/lang/Object;)[Lkotlin/collections/IndexedValue;", "mapNotNull", "", "R", "", "", "transform", "Lkotlin/Function1;", "mapNotNullTo", "C", "", "([ILjava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "arrayOfNotNull", "element", "(Ljava/lang/Object;)[Ljava/lang/Object;", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.extensions.ArraysKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Arrays2 {
    public static /* synthetic */ void copyTo$default(Object[] objArr, Object[] destination, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(objArr, i, destination, i2, i3);
    }

    public static final <T> void copyTo(T[] tArr, Object[] destination, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(tArr, i, destination, i2, i3);
    }

    public static final <T> IndexedValue<T>[] arrayWithIndex(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        IndexedValue<T>[] indexedValueArr = new IndexedValue[length];
        for (int i = 0; i < length; i++) {
            indexedValueArr[i] = new IndexedValue<>(i, tArr[i]);
        }
        return indexedValueArr;
    }

    public static final <R> List<R> mapNotNull(int[] iArr, Function1<? super Integer, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            R rInvoke = transform.invoke(Integer.valueOf(i));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <T> T[] arrayOfNotNull(T t) {
        Intrinsics.reifiedOperationMarker(0, "T");
        if (t == null) {
            return (T[]) new Object[0];
        }
        T[] tArr = (T[]) new Object[1];
        tArr[0] = t;
        return tArr;
    }

    public static final <R, C extends Collection<? super R>> C mapNotNullTo(int[] iArr, C destination, Function1<? super Integer, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i : iArr) {
            R rInvoke = transform.invoke(Integer.valueOf(i));
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
        }
        return destination;
    }
}
