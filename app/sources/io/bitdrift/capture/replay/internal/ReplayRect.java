package io.bitdrift.capture.replay.internal;

import io.bitdrift.capture.replay.ReplayType;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: ReplayRect.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\"\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b#\u0010\fR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b$\u0010\f¨\u0006%"}, m3636d2 = {"Lio/bitdrift/capture/replay/internal/ReplayRect;", "", "Lio/bitdrift/capture/replay/ReplayType;", "type", "", "x", "y", "width", "height", "<init>", "(Lio/bitdrift/capture/replay/ReplayType;IIII)V", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/io/OutputStream;", "outputStream", "", "to", "(Ljava/io/OutputStream;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toByteArray$platform_jvm_replay_lib_kt", "()[B", "toByteArray", "Lio/bitdrift/capture/replay/ReplayType;", "getType", "()Lio/bitdrift/capture/replay/ReplayType;", "I", "getX", "getY", "getWidth", "getHeight", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ReplayRect {
    private final int height;
    private final ReplayType type;
    private final int width;
    private final int x;
    private final int y;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReplayRect)) {
            return false;
        }
        ReplayRect replayRect = (ReplayRect) other;
        return Intrinsics.areEqual(this.type, replayRect.type) && this.x == replayRect.x && this.y == replayRect.y && this.width == replayRect.width && this.height == replayRect.height;
    }

    public int hashCode() {
        return (((((((this.type.hashCode() * 31) + this.x) * 31) + this.y) * 31) + this.width) * 31) + this.height;
    }

    public String toString() {
        return "ReplayRect(type=" + this.type + ", x=" + this.x + ", y=" + this.y + ", width=" + this.width + ", height=" + this.height + ')';
    }

    public ReplayRect(ReplayType type2, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(type2, "type");
        this.type = type2;
        this.x = i;
        this.y = i2;
        this.width = i3;
        this.height = i4;
    }

    public final ReplayType getType() {
        return this.type;
    }

    /* renamed from: to */
    public final void m3329to(OutputStream outputStream) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        outputStream.write(toByteArray$platform_jvm_replay_lib_kt());
    }

    public final byte[] toByteArray$platform_jvm_replay_lib_kt() {
        byte[] bArr = new byte[9];
        bArr[0] = (byte) this.type.getTypeValue();
        Integer[] numArr = {Integer.valueOf(this.x), Integer.valueOf(this.y), Integer.valueOf(this.width), Integer.valueOf(this.height)};
        int i = 1;
        for (int i2 = 0; i2 < 4; i2++) {
            int iIntValue = numArr[i2].intValue();
            if (iIntValue > 255 || iIntValue < 0) {
                bArr[0] = (byte) (bArr[0] | ((byte) (1 << (7 - i2))));
                bArr[i] = (byte) (255 & (iIntValue >> 8));
                i++;
                bArr[i] = (byte) (iIntValue & 255);
            } else {
                bArr[i] = (byte) iIntValue;
            }
            i++;
        }
        return ArraysKt.sliceArray(bArr, RangesKt.until(0, i));
    }
}
