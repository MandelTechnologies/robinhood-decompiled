package androidx.collection;

import androidx.collection.internal.RuntimeHelpers;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LongList.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0005J\u0017\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00102\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\u001b\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Landroidx/collection/MutableLongList;", "Landroidx/collection/LongList;", "", "initialCapacity", "<init>", "(I)V", "", "element", "", "add", "(J)Z", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "elements", "addAll", "(I[J)Z", "", "clear", "()V", "capacity", "ensureCapacity", "removeAt", "(I)J", "start", "end", "removeRange", "(II)V", "set", "(IJ)J", "collection"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.collection.MutableLongList, reason: use source file name */
/* loaded from: classes4.dex */
public final class LongList2 extends LongList {
    public LongList2() {
        this(0, 1, null);
    }

    public LongList2(int i) {
        super(i, null);
    }

    public /* synthetic */ LongList2(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public final boolean add(long element) {
        ensureCapacity(this._size + 1);
        long[] jArr = this.content;
        int i = this._size;
        jArr[i] = element;
        this._size = i + 1;
        return true;
    }

    public final boolean addAll(int index, long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (index < 0 || index > this._size) {
            RuntimeHelpers.throwIndexOutOfBoundsException("");
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this._size + elements.length);
        long[] jArr = this.content;
        int i = this._size;
        if (index != i) {
            ArraysKt.copyInto(jArr, jArr, elements.length + index, index, i);
        }
        ArraysKt.copyInto$default(elements, jArr, index, 0, 0, 12, (Object) null);
        this._size += elements.length;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int capacity) {
        long[] jArr = this.content;
        if (jArr.length < capacity) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(capacity, (jArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.content = jArrCopyOf;
        }
    }

    public final long removeAt(int index) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpers.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        long[] jArr = this.content;
        long j = jArr[index];
        int i = this._size;
        if (index != i - 1) {
            ArraysKt.copyInto(jArr, jArr, index, index + 1, i);
        }
        this._size--;
        return j;
    }

    public final void removeRange(int start, int end) {
        int i;
        if (start < 0 || start > (i = this._size) || end < 0 || end > i) {
            RuntimeHelpers.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        if (end < start) {
            RuntimeHelpers.throwIllegalArgumentException("The end index must be < start index");
        }
        if (end != start) {
            int i2 = this._size;
            if (end < i2) {
                long[] jArr = this.content;
                ArraysKt.copyInto(jArr, jArr, start, end, i2);
            }
            this._size -= end - start;
        }
    }

    public final long set(int index, long element) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpers.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        long[] jArr = this.content;
        long j = jArr[index];
        jArr[index] = element;
        return j;
    }
}
