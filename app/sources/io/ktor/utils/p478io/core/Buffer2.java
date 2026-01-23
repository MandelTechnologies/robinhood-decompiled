package io.ktor.utils.p478io.core;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Buffer.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001b\u0010\n\u001a\u00020\u0003*\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\u0003*\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\b2\u0006\u0010\r\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u00020\u000e*\u00020\b2\u0006\u0010\r\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0010\u001a\u001b\u0010\u0012\u001a\u00020\u000e*\u00020\b2\u0006\u0010\r\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0010\u001a\u001b\u0010\u0014\u001a\u00020\u000e*\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, m3636d2 = {"", "count", "readRemaining", "", "discardFailed", "(II)Ljava/lang/Void;", "writeRemaining", "commitWrittenFailed", "Lio/ktor/utils/io/core/Buffer;", "startGap", "startGapReservationFailedDueToLimit", "(Lio/ktor/utils/io/core/Buffer;I)Ljava/lang/Void;", "startGapReservationFailed", "endGap", "", "endGapReservationFailedDueToCapacity", "(Lio/ktor/utils/io/core/Buffer;I)V", "endGapReservationFailedDueToStartGap", "endGapReservationFailedDueToContent", "size", "restoreStartGap", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.utils.io.core.BufferKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class Buffer2 {
    public static final Void discardFailed(int i, int i2) {
        throw new EOFException("Unable to discard " + i + " bytes: only " + i2 + " available for reading");
    }

    public static final Void commitWrittenFailed(int i, int i2) {
        throw new EOFException("Unable to discard " + i + " bytes: only " + i2 + " available for writing");
    }

    public static final Void startGapReservationFailedDueToLimit(Buffer buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i > buffer.getCapacity()) {
            throw new IllegalArgumentException("Start gap " + i + " is bigger than the capacity " + buffer.getCapacity());
        }
        throw new IllegalStateException("Unable to reserve " + i + " start gap: there are already " + (buffer.getCapacity() - buffer.getLimit()) + " bytes reserved in the end");
    }

    public static final Void startGapReservationFailed(Buffer buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        throw new IllegalStateException("Unable to reserve " + i + " start gap: there are already " + (buffer.getWritePosition() - buffer.getReadPosition()) + " content bytes starting at offset " + buffer.getReadPosition());
    }

    public static final void endGapReservationFailedDueToCapacity(Buffer buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        throw new IllegalArgumentException("End gap " + i + " is too big: capacity is " + buffer.getCapacity());
    }

    public static final void endGapReservationFailedDueToStartGap(Buffer buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        throw new IllegalArgumentException("End gap " + i + " is too big: there are already " + buffer.getStartGap() + " bytes reserved in the beginning");
    }

    public static final void endGapReservationFailedDueToContent(Buffer buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        throw new IllegalArgumentException("Unable to reserve end gap " + i + ": there are already " + (buffer.getWritePosition() - buffer.getReadPosition()) + " content bytes at offset " + buffer.getReadPosition());
    }

    public static final void restoreStartGap(Buffer buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        buffer.releaseStartGap$ktor_io(buffer.getReadPosition() - i);
    }
}
