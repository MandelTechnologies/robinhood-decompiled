package androidx.compose.runtime.snapshots;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SnapshotDoubleIndexHeap.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u001b\u0010\u0017\u001a\u00020\u00142\f\b\u0002\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00042\n\u0010\u0019\u001a\u00060\u0014j\u0002`\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\bR$\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0011R\u001a\u0010#\u001a\u00060!j\u0002`\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0005\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001f¨\u0006)"}, m3636d2 = {"Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "", "<init>", "()V", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "shiftUp", "(I)V", "shiftDown", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "b", "swap", "(II)V", "atLeast", "ensure", "allocateHandle", "()I", "handle", "freeHandle", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "lowestOrDefault", "(J)J", "value", "add", "(J)I", "remove", "<set-?>", "size", "I", "getSize", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "values", "[J", "", "[I", "handles", "firstFreeHandle", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SnapshotDoubleIndexHeap {
    private int firstFreeHandle;
    private int[] handles;
    private int size;
    private long[] values = SnapshotId_jvmKt.snapshotIdArrayWithCapacity(16);
    private int[] index = new int[16];

    public SnapshotDoubleIndexHeap() {
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        this.handles = iArr;
    }

    public final long lowestOrDefault(long j) {
        return this.size > 0 ? this.values[0] : j;
    }

    public final int add(long value) {
        ensure(this.size + 1);
        int i = this.size;
        this.size = i + 1;
        int iAllocateHandle = allocateHandle();
        this.values[i] = value;
        this.index[i] = iAllocateHandle;
        this.handles[iAllocateHandle] = i;
        shiftUp(i);
        return iAllocateHandle;
    }

    public final void remove(int handle) {
        int i = this.handles[handle];
        swap(i, this.size - 1);
        this.size--;
        shiftUp(i);
        shiftDown(i);
        freeHandle(handle);
    }

    private final void shiftUp(int index) {
        long[] jArr = this.values;
        long j = jArr[index];
        while (index > 0) {
            int i = ((index + 1) >> 1) - 1;
            if (jArr[i] <= j) {
                return;
            }
            swap(i, index);
            index = i;
        }
    }

    private final void shiftDown(int index) {
        long[] jArr = this.values;
        int i = this.size >> 1;
        while (index < i) {
            int i2 = (index + 1) << 1;
            int i3 = i2 - 1;
            if (i2 < this.size) {
                long j = jArr[i2];
                if (j < jArr[i3]) {
                    if (j >= jArr[index]) {
                        return;
                    }
                    swap(i2, index);
                    index = i2;
                }
            }
            if (jArr[i3] >= jArr[index]) {
                return;
            }
            swap(i3, index);
            index = i3;
        }
    }

    private final void swap(int a, int b) {
        long[] jArr = this.values;
        int[] iArr = this.index;
        int[] iArr2 = this.handles;
        long j = jArr[a];
        jArr[a] = jArr[b];
        jArr[b] = j;
        int i = iArr[a];
        int i2 = iArr[b];
        iArr[a] = i2;
        iArr[b] = i;
        iArr2[i2] = a;
        iArr2[i] = b;
    }

    private final void ensure(int atLeast) {
        int length = this.values.length;
        if (atLeast <= length) {
            return;
        }
        int i = length * 2;
        long[] jArrSnapshotIdArrayWithCapacity = SnapshotId_jvmKt.snapshotIdArrayWithCapacity(i);
        int[] iArr = new int[i];
        ArraysKt.copyInto$default(this.values, jArrSnapshotIdArrayWithCapacity, 0, 0, 0, 12, (Object) null);
        ArraysKt.copyInto$default(this.index, iArr, 0, 0, 0, 14, (Object) null);
        this.values = jArrSnapshotIdArrayWithCapacity;
        this.index = iArr;
    }

    private final int allocateHandle() {
        int length = this.handles.length;
        if (this.firstFreeHandle >= length) {
            int i = length * 2;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                iArr[i2] = i3;
                i2 = i3;
            }
            ArraysKt.copyInto$default(this.handles, iArr, 0, 0, 0, 14, (Object) null);
            this.handles = iArr;
        }
        int i4 = this.firstFreeHandle;
        this.firstFreeHandle = this.handles[i4];
        return i4;
    }

    private final void freeHandle(int handle) {
        this.handles[handle] = this.firstFreeHandle;
        this.firstFreeHandle = handle;
    }
}
