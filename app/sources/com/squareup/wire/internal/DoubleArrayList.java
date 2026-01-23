package com.squareup.wire.internal;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: DoubleArrayList.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/squareup/wire/internal/DoubleArrayList;", "", "initialCapacity", "", "<init>", "(I)V", WebsocketGatewayConstants.DATA_KEY, "", "size", "toArray", "add", "", "double", "", "isNotEmpty", "", "ensureCapacity", "minCapacity", "toString", "", "Companion", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class DoubleArrayList {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private double[] data;
    private int size;

    public DoubleArrayList(int i) {
        this.data = new double[i];
    }

    public final double[] toArray() {
        int i = this.size;
        double[] dArr = this.data;
        if (i < dArr.length) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, i);
            Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
            this.data = dArrCopyOf;
        }
        return this.data;
    }

    public final void add(double d) {
        ensureCapacity(this.size + 1);
        double[] dArr = this.data;
        int i = this.size;
        this.size = i + 1;
        dArr[i] = d;
    }

    public final boolean isNotEmpty() {
        return this.size > 0;
    }

    private final void ensureCapacity(int minCapacity) {
        double[] dArr = this.data;
        if (minCapacity > dArr.length) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, Math.max(((dArr.length * 3) / 2) + 1, minCapacity));
            Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
            this.data = dArrCopyOf;
        }
    }

    public String toString() {
        double[] dArrCopyOf = Arrays.copyOf(this.data, this.size);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        String string2 = Arrays.toString(dArrCopyOf);
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    /* compiled from: DoubleArrayList.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m3636d2 = {"Lcom/squareup/wire/internal/DoubleArrayList$Companion;", "", "<init>", "()V", "forDecoding", "Lcom/squareup/wire/internal/DoubleArrayList;", "minLengthInBytes", "", "minimumElementByteSize", "", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DoubleArrayList forDecoding(long minLengthInBytes, long minimumElementByteSize) {
            return new DoubleArrayList((int) RangesKt.coerceAtMost(minLengthInBytes / minimumElementByteSize, 2147483647L));
        }

        public final DoubleArrayList forDecoding(int minLengthInBytes, int minimumElementByteSize) {
            return new DoubleArrayList(minLengthInBytes / minimumElementByteSize);
        }
    }
}
