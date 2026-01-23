package kotlin.jvm.internal;

import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.collections.PrimitiveIterators;
import kotlin.collections.PrimitiveIterators2;
import kotlin.collections.PrimitiveIterators3;
import kotlin.collections.PrimitiveIterators4;
import kotlin.collections.PrimitiveIterators5;
import kotlin.collections.PrimitiveIterators6;
import kotlin.collections.PrimitiveIterators7;
import kotlin.collections.PrimitiveIterators8;

/* compiled from: ArrayIterators.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0005\u001a\u000e\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007\u001a\u000e\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\t\u001a\u000e\u0010\u0000\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u000b\u001a\u000e\u0010\u0000\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\r\u001a\u000e\u0010\u0000\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000f\u001a\u000e\u0010\u0000\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0011¨\u0006\u0012"}, m3636d2 = {"iterator", "Lkotlin/collections/ByteIterator;", ResourceTypes.ARRAY, "", "Lkotlin/collections/CharIterator;", "", "Lkotlin/collections/ShortIterator;", "", "Lkotlin/collections/IntIterator;", "", "Lkotlin/collections/LongIterator;", "", "Lkotlin/collections/FloatIterator;", "", "Lkotlin/collections/DoubleIterator;", "", "Lkotlin/collections/BooleanIterator;", "", "kotlin-stdlib"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlin.jvm.internal.ArrayIteratorsKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ArrayIterators7 {
    public static final PrimitiveIterators2 iterator(byte[] array2) {
        Intrinsics.checkNotNullParameter(array2, "array");
        return new ArrayIterators2(array2);
    }

    public static final PrimitiveIterators3 iterator(char[] array2) {
        Intrinsics.checkNotNullParameter(array2, "array");
        return new ArrayIterators3(array2);
    }

    public static final PrimitiveIterators8 iterator(short[] array2) {
        Intrinsics.checkNotNullParameter(array2, "array");
        return new ArrayIterators9(array2);
    }

    public static final PrimitiveIterators6 iterator(int[] array2) {
        Intrinsics.checkNotNullParameter(array2, "array");
        return new ArrayIterators6(array2);
    }

    public static final PrimitiveIterators7 iterator(long[] array2) {
        Intrinsics.checkNotNullParameter(array2, "array");
        return new ArrayIterators8(array2);
    }

    public static final PrimitiveIterators5 iterator(float[] array2) {
        Intrinsics.checkNotNullParameter(array2, "array");
        return new ArrayIterators5(array2);
    }

    public static final PrimitiveIterators4 iterator(double[] array2) {
        Intrinsics.checkNotNullParameter(array2, "array");
        return new ArrayIterators4(array2);
    }

    public static final PrimitiveIterators iterator(boolean[] array2) {
        Intrinsics.checkNotNullParameter(array2, "array");
        return new ArrayIterators(array2);
    }
}
