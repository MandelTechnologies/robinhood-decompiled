package kotlin.jvm.internal;

import com.robinhood.utils.extensions.ResourceTypes;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: ArrayIterator.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"iterator", "", "T", ResourceTypes.ARRAY, "", "([Ljava/lang/Object;)Ljava/util/Iterator;", "kotlin-stdlib"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlin.jvm.internal.ArrayIteratorKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class ArrayIterator2 {
    public static final <T> Iterator<T> iterator(T[] array2) {
        Intrinsics.checkNotNullParameter(array2, "array");
        return new ArrayIterator(array2);
    }
}
