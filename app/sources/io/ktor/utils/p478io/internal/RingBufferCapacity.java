package io.ktor.utils.p478io.internal;

import com.singular.sdk.internal.Constants;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RingBufferCapacity.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u0005J\u0015\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u0005J\r\u0010\u001c\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010\u0011J\r\u0010 \u001a\u00020\u0013¢\u0006\u0004\b \u0010\u001dJ\r\u0010!\u001a\u00020\u0013¢\u0006\u0004\b!\u0010\u001dJ\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%¨\u0006&"}, m3636d2 = {"Lio/ktor/utils/io/internal/RingBufferCapacity;", "", "", "totalCapacity", "<init>", "(I)V", "remaining", "update", Constants.RequestParamsKeys.APP_NAME_KEY, "", "completeReadOverflow", "(III)Ljava/lang/Void;", "pending", "completeWriteOverflow", "(II)Ljava/lang/Void;", "", "resetForWrite", "()V", "resetForRead", "", "tryReadExact", "(I)Z", "tryReadAtMost", "(I)I", "tryWriteAtLeast", "tryWriteAtMost", "completeRead", "completeWrite", "flush", "()Z", "tryLockForRelease", "forceLockForRelease", "isEmpty", "isFull", "", "toString", "()Ljava/lang/String;", "I", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class RingBufferCapacity {
    public static final /* synthetic */ AtomicIntegerFieldUpdater _availableForRead$FU$internal = AtomicIntegerFieldUpdater.newUpdater(RingBufferCapacity.class, "_availableForRead$internal");
    public static final /* synthetic */ AtomicIntegerFieldUpdater _availableForWrite$FU$internal = AtomicIntegerFieldUpdater.newUpdater(RingBufferCapacity.class, "_availableForWrite$internal");
    static final /* synthetic */ AtomicIntegerFieldUpdater _pendingToFlush$FU = AtomicIntegerFieldUpdater.newUpdater(RingBufferCapacity.class, "_pendingToFlush");
    public volatile /* synthetic */ int _availableForWrite$internal;
    private final int totalCapacity;
    public volatile /* synthetic */ int _availableForRead$internal = 0;
    volatile /* synthetic */ int _pendingToFlush = 0;

    public RingBufferCapacity(int i) {
        this.totalCapacity = i;
        this._availableForWrite$internal = i;
    }

    public final void resetForWrite() {
        this._availableForRead$internal = 0;
        this._pendingToFlush = 0;
        this._availableForWrite$internal = this.totalCapacity;
    }

    public final void resetForRead() {
        this._availableForRead$internal = this.totalCapacity;
        this._availableForWrite$internal = 0;
        this._pendingToFlush = 0;
    }

    private final Void completeReadOverflow(int remaining, int update, int n) {
        throw new IllegalArgumentException("Completed read overflow: " + remaining + " + " + n + " = " + update + " > " + this.totalCapacity);
    }

    private final Void completeWriteOverflow(int pending, int n) {
        throw new IllegalArgumentException("Complete write overflow: " + pending + " + " + n + " > " + this.totalCapacity);
    }

    public final boolean flush() {
        int andSet = _pendingToFlush$FU.getAndSet(this, 0);
        return andSet == 0 ? this._availableForRead$internal > 0 : _availableForRead$FU$internal.addAndGet(this, andSet) > 0;
    }

    public final void forceLockForRelease() {
        _availableForWrite$FU$internal.getAndSet(this, 0);
    }

    public final boolean isEmpty() {
        return this._availableForWrite$internal == this.totalCapacity;
    }

    public final boolean isFull() {
        return this._availableForWrite$internal == 0;
    }

    public String toString() {
        return "RingBufferCapacity[read: " + this._availableForRead$internal + ", write: " + this._availableForWrite$internal + ", flush: " + this._pendingToFlush + ", capacity: " + this.totalCapacity + ']';
    }

    public final void completeRead(int n) {
        int i;
        int i2;
        do {
            i = this._availableForWrite$internal;
            i2 = i + n;
            if (i2 > this.totalCapacity) {
                completeReadOverflow(i, i2, n);
                throw new ExceptionsH();
            }
        } while (!_availableForWrite$FU$internal.compareAndSet(this, i, i2));
    }

    public final void completeWrite(int n) {
        int i;
        int i2;
        do {
            i = this._pendingToFlush;
            i2 = i + n;
            if (i2 > this.totalCapacity) {
                completeWriteOverflow(i, n);
                throw new ExceptionsH();
            }
        } while (!_pendingToFlush$FU.compareAndSet(this, i, i2));
    }

    public final boolean tryLockForRelease() {
        int i;
        do {
            i = this._availableForWrite$internal;
            if (this._pendingToFlush > 0 || this._availableForRead$internal > 0 || i != this.totalCapacity) {
                return false;
            }
        } while (!_availableForWrite$FU$internal.compareAndSet(this, i, 0));
        return true;
    }

    public final boolean tryReadExact(int n) {
        int i;
        do {
            i = this._availableForRead$internal;
            if (i < n) {
                return false;
            }
        } while (!_availableForRead$FU$internal.compareAndSet(this, i, i - n));
        return true;
    }

    public final int tryReadAtMost(int n) {
        int i;
        int iMin;
        do {
            i = this._availableForRead$internal;
            iMin = Math.min(n, i);
            if (iMin == 0) {
                return 0;
            }
        } while (!_availableForRead$FU$internal.compareAndSet(this, i, i - iMin));
        return Math.min(n, i);
    }

    public final int tryWriteAtLeast(int n) {
        int i;
        do {
            i = this._availableForWrite$internal;
            if (i < n) {
                return 0;
            }
        } while (!_availableForWrite$FU$internal.compareAndSet(this, i, 0));
        return i;
    }

    public final int tryWriteAtMost(int n) {
        int i;
        int iMin;
        do {
            i = this._availableForWrite$internal;
            iMin = Math.min(n, i);
            if (iMin == 0) {
                return 0;
            }
        } while (!_availableForWrite$FU$internal.compareAndSet(this, i, i - iMin));
        return Math.min(n, i);
    }
}
