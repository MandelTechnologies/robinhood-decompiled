package com.squareup.wire.internal;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: LongArrayList.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/squareup/wire/internal/LongArrayList;", "", "initialCapacity", "", "<init>", "(I)V", WebsocketGatewayConstants.DATA_KEY, "", "size", "toArray", "add", "", "long", "", "isNotEmpty", "", "ensureCapacity", "minCapacity", "toString", "", "Companion", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class LongArrayList {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long[] data;
    private int size;

    public LongArrayList(int i) {
        this.data = new long[i];
    }

    public final long[] toArray() {
        int i = this.size;
        long[] jArr = this.data;
        if (i < jArr.length) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, i);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.data = jArrCopyOf;
        }
        return this.data;
    }

    public final void add(long j) {
        ensureCapacity(this.size + 1);
        long[] jArr = this.data;
        int i = this.size;
        this.size = i + 1;
        jArr[i] = j;
    }

    public final boolean isNotEmpty() {
        return this.size > 0;
    }

    private final void ensureCapacity(int minCapacity) {
        long[] jArr = this.data;
        if (minCapacity > jArr.length) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(((jArr.length * 3) / 2) + 1, minCapacity));
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.data = jArrCopyOf;
        }
    }

    public String toString() {
        long[] jArrCopyOf = Arrays.copyOf(this.data, this.size);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        String string2 = Arrays.toString(jArrCopyOf);
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    /* compiled from: LongArrayList.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m3636d2 = {"Lcom/squareup/wire/internal/LongArrayList$Companion;", "", "<init>", "()V", "forDecoding", "Lcom/squareup/wire/internal/LongArrayList;", "minLengthInBytes", "", "minimumElementByteSize", "", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LongArrayList forDecoding(long minLengthInBytes, long minimumElementByteSize) {
            return new LongArrayList((int) RangesKt.coerceAtMost(minLengthInBytes / minimumElementByteSize, 2147483647L));
        }

        public final LongArrayList forDecoding(int minLengthInBytes, int minimumElementByteSize) {
            return new LongArrayList(minLengthInBytes / minimumElementByteSize);
        }
    }
}
