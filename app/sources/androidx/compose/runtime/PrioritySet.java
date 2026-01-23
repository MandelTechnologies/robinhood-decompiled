package androidx.compose.runtime;

import androidx.collection.IntList3;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SlotTable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, m3636d2 = {"Landroidx/compose/runtime/PrioritySet;", "", "Landroidx/collection/MutableIntList;", "list", "constructor-impl", "(Landroidx/collection/MutableIntList;)Landroidx/collection/MutableIntList;", "", "value", "", "add-impl", "(Landroidx/collection/MutableIntList;I)V", "add", "", "isNotEmpty-impl", "(Landroidx/collection/MutableIntList;)Z", "isNotEmpty", "peek-impl", "(Landroidx/collection/MutableIntList;)I", "peek", "takeMax-impl", "takeMax", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class PrioritySet {
    /* renamed from: constructor-impl, reason: not valid java name */
    public static IntList3 m6365constructorimpl(IntList3 intList3) {
        return intList3;
    }

    /* renamed from: takeMax-impl, reason: not valid java name */
    public static final int m6369takeMaximpl(IntList3 intList3) {
        int i;
        int i2 = intList3._size;
        int i3 = intList3.get(0);
        while (intList3._size != 0 && intList3.get(0) == i3) {
            intList3.set(0, intList3.last());
            intList3.removeAt(intList3._size - 1);
            int i4 = intList3._size;
            int i5 = i4 >>> 1;
            int i6 = 0;
            while (i6 < i5) {
                int i7 = intList3.get(i6);
                int i8 = (i6 + 1) * 2;
                int i9 = i8 - 1;
                int i10 = intList3.get(i9);
                if (i8 >= i4 || (i = intList3.get(i8)) <= i10) {
                    if (i10 > i7) {
                        intList3.set(i6, i10);
                        intList3.set(i9, i7);
                        i6 = i9;
                    }
                } else if (i > i7) {
                    intList3.set(i6, i);
                    intList3.set(i8, i7);
                    i6 = i8;
                }
            }
        }
        return i3;
    }

    /* renamed from: add-impl, reason: not valid java name */
    public static final void m6364addimpl(IntList3 intList3, int i) {
        if (intList3._size == 0 || !(intList3.get(0) == i || intList3.get(intList3._size - 1) == i)) {
            int i2 = intList3._size;
            intList3.add(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int i4 = intList3.get(i3);
                if (i <= i4) {
                    break;
                }
                intList3.set(i2, i4);
                i2 = i3;
            }
            intList3.set(i2, i);
        }
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m6367isNotEmptyimpl(IntList3 intList3) {
        return intList3._size != 0;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ IntList3 m6366constructorimpl$default(IntList3 intList3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = 1;
        if ((i & 1) != 0) {
            intList3 = new IntList3(0, i2, null);
        }
        return m6365constructorimpl(intList3);
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final int m6368peekimpl(IntList3 intList3) {
        return intList3.first();
    }
}
