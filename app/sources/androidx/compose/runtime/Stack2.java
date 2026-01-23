package androidx.compose.runtime;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Stack.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\rJ\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0003J\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0010R\u0016\u0010\u0016\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Landroidx/compose/runtime/IntStack;", "", "<init>", "()V", "", "resize", "()[I", "", "value", "", "push", "(I)V", "pop", "()I", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "peekOr", "(I)I", "peek", "peek2", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "clear", "indexOf", "slots", "[I", "tos", "I", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.runtime.IntStack, reason: use source file name */
/* loaded from: classes.dex */
public final class Stack2 {

    @JvmField
    public int[] slots = new int[10];

    @JvmField
    public int tos;

    private final int[] resize() {
        int[] iArr = this.slots;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        this.slots = iArrCopyOf;
        return iArrCopyOf;
    }

    public final void push(int value) {
        int[] iArrResize = this.slots;
        if (this.tos >= iArrResize.length) {
            iArrResize = resize();
        }
        int i = this.tos;
        this.tos = i + 1;
        iArrResize[i] = value;
    }

    public final int pop() {
        int[] iArr = this.slots;
        int i = this.tos - 1;
        this.tos = i;
        return iArr[i];
    }

    public final int peekOr(int i) {
        int i2 = this.tos - 1;
        return i2 >= 0 ? this.slots[i2] : i;
    }

    public final int peek() {
        return this.slots[this.tos - 1];
    }

    public final int peek2() {
        return this.slots[this.tos - 2];
    }

    public final int peek(int index) {
        return this.slots[index];
    }

    public final void clear() {
        this.tos = 0;
    }

    public final int indexOf(int value) {
        int[] iArr = this.slots;
        int iMin = Math.min(iArr.length, this.tos);
        for (int i = 0; i < iMin; i++) {
            if (iArr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
