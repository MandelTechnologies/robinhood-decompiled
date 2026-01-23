package io.ktor.utils.p478io.internal;

import com.singular.sdk.internal.Constants;
import io.ktor.utils.p478io.ByteBufferChannel;
import io.ktor.utils.p478io.WriterSession4;
import io.ktor.utils.p478io.core.BufferUtilsJvm;
import io.ktor.utils.p478io.core.internal.ChunkBuffer;
import java.nio.ByteBuffer;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WriteSessionImpl.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0001\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0019\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\tH\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\tH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, m3636d2 = {"Lio/ktor/utils/io/internal/WriteSessionImpl;", "Lio/ktor/utils/io/WriterSuspendSession;", "channel", "Lio/ktor/utils/io/ByteBufferChannel;", "(Lio/ktor/utils/io/ByteBufferChannel;)V", "byteBuffer", "Ljava/nio/ByteBuffer;", "current", "locked", "", "ringBufferCapacity", "Lio/ktor/utils/io/internal/RingBufferCapacity;", "view", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "begin", "", "complete", "flush", "request", "min", "tryAwait", Constants.RequestParamsKeys.APP_NAME_KEY, "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryAwaitJoinSwitch", "written", "writtenFailed", "", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class WriteSessionImpl implements WriterSession4 {
    private ByteBuffer byteBuffer;
    private ByteBufferChannel current;
    private int locked;
    private RingBufferCapacity ringBufferCapacity;
    private ChunkBuffer view;

    /* compiled from: WriteSessionImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.internal.WriteSessionImpl", m3645f = "WriteSessionImpl.kt", m3646l = {86}, m3647m = "tryAwaitJoinSwitch")
    /* renamed from: io.ktor.utils.io.internal.WriteSessionImpl$tryAwaitJoinSwitch$1 */
    static final class C456451 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C456451(Continuation<? super C456451> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WriteSessionImpl.this.tryAwaitJoinSwitch(0, this);
        }
    }

    public WriteSessionImpl(ByteBufferChannel channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.current = channel.resolveChannelInstance$ktor_io();
        ChunkBuffer.Companion companion = ChunkBuffer.INSTANCE;
        this.byteBuffer = companion.getEmpty().getMemory();
        this.view = companion.getEmpty();
        this.ringBufferCapacity = this.current.currentState$ktor_io().capacity;
    }

    public final void begin() {
        ByteBufferChannel byteBufferChannelResolveChannelInstance$ktor_io = this.current.resolveChannelInstance$ktor_io();
        this.current = byteBufferChannelResolveChannelInstance$ktor_io;
        ByteBuffer byteBuffer = byteBufferChannelResolveChannelInstance$ktor_io.setupStateForWrite$ktor_io();
        if (byteBuffer == null) {
            return;
        }
        this.byteBuffer = byteBuffer;
        ChunkBuffer chunkBufferChunkBuffer$default = BufferUtilsJvm.ChunkBuffer$default(this.current.currentState$ktor_io().backingBuffer, null, 2, null);
        this.view = chunkBufferChunkBuffer$default;
        BufferUtilsJvm.resetFromContentToWrite(chunkBufferChunkBuffer$default, this.byteBuffer);
        this.ringBufferCapacity = this.current.currentState$ktor_io().capacity;
    }

    public final void complete() {
        int i = this.locked;
        if (i > 0) {
            this.ringBufferCapacity.completeRead(i);
            this.locked = 0;
        }
        this.current.restoreStateAfterWrite$ktor_io();
        this.current.tryTerminate$ktor_io();
    }

    @Override // io.ktor.utils.p478io.WriterSession
    public ChunkBuffer request(int min) {
        int iTryWriteAtLeast = this.locked + this.ringBufferCapacity.tryWriteAtLeast(0);
        this.locked = iTryWriteAtLeast;
        if (iTryWriteAtLeast < min) {
            return null;
        }
        this.current.prepareWriteBuffer$ktor_io(this.byteBuffer, iTryWriteAtLeast);
        if (this.byteBuffer.remaining() < min) {
            return null;
        }
        BufferUtilsJvm.resetFromContentToWrite(this.view, this.byteBuffer);
        return this.view;
    }

    public void written(int n) {
        int i;
        if (n < 0 || n > (i = this.locked)) {
            writtenFailed(n);
            throw new ExceptionsH();
        }
        this.locked = i - n;
        this.current.bytesWrittenFromSession$ktor_io(this.byteBuffer, this.ringBufferCapacity, n);
    }

    private final Void writtenFailed(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Written bytes count shouldn't be negative: " + n);
        }
        throw new IllegalStateException("Unable to mark " + n + " bytes as written: only " + this.locked + " were pre-locked.");
    }

    @Override // io.ktor.utils.p478io.WriterSession4
    public Object tryAwait(int i, Continuation<? super Unit> continuation) throws Throwable {
        if (this.current.getJoining() != null) {
            Object objTryAwaitJoinSwitch = tryAwaitJoinSwitch(i, continuation);
            return objTryAwaitJoinSwitch == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTryAwaitJoinSwitch : Unit.INSTANCE;
        }
        int i2 = this.locked;
        if (i2 >= i) {
            return Unit.INSTANCE;
        }
        if (i2 > 0) {
            this.ringBufferCapacity.completeRead(i2);
            this.locked = 0;
        }
        Object objTryWriteSuspend$ktor_io = this.current.tryWriteSuspend$ktor_io(i, continuation);
        return objTryWriteSuspend$ktor_io == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTryWriteSuspend$ktor_io : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object tryAwaitJoinSwitch(int i, Continuation<? super Unit> continuation) throws Throwable {
        C456451 c456451;
        WriteSessionImpl writeSessionImpl;
        if (continuation instanceof C456451) {
            c456451 = (C456451) continuation;
            int i2 = c456451.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c456451.label = i2 - Integer.MIN_VALUE;
            } else {
                c456451 = new C456451(continuation);
            }
        }
        Object obj = c456451.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c456451.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            int i4 = this.locked;
            if (i4 > 0) {
                this.ringBufferCapacity.completeRead(i4);
                this.locked = 0;
            }
            flush();
            this.current.restoreStateAfterWrite$ktor_io();
            this.current.tryTerminate$ktor_io();
            ByteBufferChannel byteBufferChannel = this.current;
            c456451.L$0 = this;
            c456451.label = 1;
            if (byteBufferChannel.tryWriteSuspend$ktor_io(i, c456451) == coroutine_suspended) {
                return coroutine_suspended;
            }
            writeSessionImpl = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            writeSessionImpl = (WriteSessionImpl) c456451.L$0;
            ResultKt.throwOnFailure(obj);
        }
        ByteBufferChannel byteBufferChannelResolveChannelInstance$ktor_io = writeSessionImpl.current.resolveChannelInstance$ktor_io();
        writeSessionImpl.current = byteBufferChannelResolveChannelInstance$ktor_io;
        ByteBuffer byteBuffer = byteBufferChannelResolveChannelInstance$ktor_io.setupStateForWrite$ktor_io();
        if (byteBuffer != null) {
            writeSessionImpl.byteBuffer = byteBuffer;
            ChunkBuffer chunkBufferChunkBuffer$default = BufferUtilsJvm.ChunkBuffer$default(writeSessionImpl.current.currentState$ktor_io().backingBuffer, null, 2, null);
            writeSessionImpl.view = chunkBufferChunkBuffer$default;
            BufferUtilsJvm.resetFromContentToWrite(chunkBufferChunkBuffer$default, writeSessionImpl.byteBuffer);
            writeSessionImpl.ringBufferCapacity = writeSessionImpl.current.currentState$ktor_io().capacity;
        }
        return Unit.INSTANCE;
    }

    public void flush() {
        this.current.flush();
    }
}
