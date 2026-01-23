package kotlin.jvm.internal;

import kotlin.Metadata;

/* compiled from: PrimitiveSpreadBuilders.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0003*\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u0004\u0010\rJ\u001f\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00038\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u0006R\"\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00168\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "", "T", "", "size", "<init>", "(I)V", "getSize", "(Ljava/lang/Object;)I", "spreadArgument", "", "addSpread", "(Ljava/lang/Object;)V", "()I", "values", "result", "toArray", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "I", "position", "getPosition", "setPosition", "", "spreads", "[Ljava/lang/Object;", "getSpreads$annotations", "()V", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlin.jvm.internal.PrimitiveSpreadBuilder, reason: use source file name */
/* loaded from: classes14.dex */
public abstract class PrimitiveSpreadBuilders8<T> {
    private int position;
    private final int size;
    private final T[] spreads;

    protected abstract int getSize(T t);

    public PrimitiveSpreadBuilders8(int i) {
        this.size = i;
        this.spreads = (T[]) new Object[i];
    }

    protected final int getPosition() {
        return this.position;
    }

    protected final void setPosition(int i) {
        this.position = i;
    }

    public final void addSpread(T spreadArgument) {
        Intrinsics.checkNotNullParameter(spreadArgument, "spreadArgument");
        T[] tArr = this.spreads;
        int i = this.position;
        this.position = i + 1;
        tArr[i] = spreadArgument;
    }

    protected final int size() {
        int i = this.size - 1;
        int size = 0;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                T t = this.spreads[i2];
                size += t != null ? getSize(t) : 1;
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        return size;
    }

    protected final T toArray(T values, T result) {
        int i;
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(result, "result");
        int i2 = this.size - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int i4 = 0;
            int i5 = 0;
            i = 0;
            while (true) {
                T t = this.spreads[i4];
                if (t != null) {
                    if (i5 < i4) {
                        int i6 = i4 - i5;
                        System.arraycopy(values, i5, result, i, i6);
                        i += i6;
                    }
                    int size = getSize(t);
                    System.arraycopy(t, 0, result, i, size);
                    i += size;
                    i5 = i4 + 1;
                }
                if (i4 == i2) {
                    break;
                }
                i4++;
            }
            i3 = i5;
        } else {
            i = 0;
        }
        int i7 = this.size;
        if (i3 < i7) {
            System.arraycopy(values, i3, result, i, i7 - i3);
        }
        return result;
    }
}
