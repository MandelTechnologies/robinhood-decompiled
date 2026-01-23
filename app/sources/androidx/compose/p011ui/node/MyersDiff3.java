package androidx.compose.p011ui.node;

import androidx.compose.p011ui.internal.InlineClassHelper4;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.singular.sdk.internal.Constants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MyersDiff.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0011\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0086\u0002J\u0006\u0010\u0011\u001a\u00020\fJ \u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\u0006\u0010\u0016\u001a\u00020\u0003J\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003J&\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003J \u0010 \u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\u0010\u0010!\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010\"\u001a\u00020\u0018J\u0018\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\u0002R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Landroidx/compose/ui/node/IntStack;", "", "initialCapacity", "", "(I)V", "lastIndex", "size", "getSize", "()I", "stack", "", "compareDiagonal", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "b", "get", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "isNotEmpty", "partition", "start", "end", "elSize", "pop", "pushDiagonal", "", "x", "y", "pushRange", "oldStart", "oldEnd", "newStart", "newEnd", "quickSort", "resizeStack", "sortDiagonals", "swapDiagonal", Constants.RequestParamsKeys.PACKAGE_NAME_KEY, "j", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.IntStack, reason: use source file name */
/* loaded from: classes.dex */
final class MyersDiff3 {
    private int lastIndex;
    private int[] stack;

    public MyersDiff3(int i) {
        this.stack = new int[i];
    }

    public final int get(int index) {
        return this.stack[index];
    }

    /* renamed from: getSize, reason: from getter */
    public final int getLastIndex() {
        return this.lastIndex;
    }

    private final int[] resizeStack(int[] stack) {
        int[] iArrCopyOf = Arrays.copyOf(stack, stack.length * 2);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        this.stack = iArrCopyOf;
        return iArrCopyOf;
    }

    public final void pushRange(int oldStart, int oldEnd, int newStart, int newEnd) {
        int i = this.lastIndex;
        int[] iArrResizeStack = this.stack;
        int i2 = i + 4;
        if (i2 >= iArrResizeStack.length) {
            iArrResizeStack = resizeStack(iArrResizeStack);
        }
        iArrResizeStack[i] = oldStart;
        iArrResizeStack[i + 1] = oldEnd;
        iArrResizeStack[i + 2] = newStart;
        iArrResizeStack[i + 3] = newEnd;
        this.lastIndex = i2;
    }

    public final void pushDiagonal(int x, int y, int size) {
        int i = this.lastIndex;
        int[] iArrResizeStack = this.stack;
        int i2 = i + 3;
        if (i2 >= iArrResizeStack.length) {
            iArrResizeStack = resizeStack(iArrResizeStack);
        }
        iArrResizeStack[i] = x + size;
        iArrResizeStack[i + 1] = y + size;
        iArrResizeStack[i + 2] = size;
        this.lastIndex = i2;
    }

    public final int pop() {
        int[] iArr = this.stack;
        int i = this.lastIndex - 1;
        this.lastIndex = i;
        return iArr[i];
    }

    public final boolean isNotEmpty() {
        return this.lastIndex != 0;
    }

    public final void sortDiagonals() {
        int i = this.lastIndex;
        if (!(i % 3 == 0)) {
            InlineClassHelper4.throwIllegalStateException("Array size not a multiple of 3");
        }
        if (i > 3) {
            quickSort(0, i - 3, 3);
        }
    }

    private final void quickSort(int start, int end, int elSize) {
        if (start < end) {
            int iPartition = partition(start, end, elSize);
            quickSort(start, iPartition - elSize, elSize);
            quickSort(iPartition + elSize, end, elSize);
        }
    }

    private final int partition(int start, int end, int elSize) {
        int i = start - elSize;
        while (start < end) {
            if (compareDiagonal(start, end)) {
                i += elSize;
                swapDiagonal(i, start);
            }
            start += elSize;
        }
        int i2 = i + elSize;
        swapDiagonal(i2, end);
        return i2;
    }

    private final void swapDiagonal(int i, int j) {
        int[] iArr = this.stack;
        MyersDiff4.swap(iArr, i, j);
        MyersDiff4.swap(iArr, i + 1, j + 1);
        MyersDiff4.swap(iArr, i + 2, j + 2);
    }

    private final boolean compareDiagonal(int a, int b) {
        int[] iArr = this.stack;
        int i = iArr[a];
        int i2 = iArr[b];
        return i < i2 || (i == i2 && iArr[a + 1] <= iArr[b + 1]);
    }
}
