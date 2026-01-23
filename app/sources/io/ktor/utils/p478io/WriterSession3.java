package io.ktor.utils.p478io;

import io.ktor.utils.p478io.core.Buffer;
import io.ktor.utils.p478io.core.internal.ChunkBuffer;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WriterSession.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0081@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001H\u0081@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0013\u001a\u0004\u0018\u00010\r*\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m3636d2 = {"Lio/ktor/utils/io/ByteWriteChannel;", "", "desiredSpace", "Lio/ktor/utils/io/core/Buffer;", "requestWriteBuffer", "(Lio/ktor/utils/io/ByteWriteChannel;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buffer", "written", "", "completeWriting", "(Lio/ktor/utils/io/ByteWriteChannel;Lio/ktor/utils/io/core/Buffer;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completeWritingFallback", "(Lio/ktor/utils/io/ByteWriteChannel;Lio/ktor/utils/io/core/Buffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/WriterSuspendSession;", "session", "writeBufferSuspend", "(Lio/ktor/utils/io/WriterSuspendSession;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeBufferFallback", "()Lio/ktor/utils/io/core/Buffer;", "writeSessionFor", "(Lio/ktor/utils/io/ByteWriteChannel;)Lio/ktor/utils/io/WriterSuspendSession;", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.utils.io.WriterSessionKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class WriterSession3 {

    /* compiled from: WriterSession.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.WriterSessionKt", m3645f = "WriterSession.kt", m3646l = {83}, m3647m = "completeWritingFallback")
    /* renamed from: io.ktor.utils.io.WriterSessionKt$completeWritingFallback$1 */
    static final class C456391 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C456391(Continuation<? super C456391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WriterSession3.completeWritingFallback(null, null, this);
        }
    }

    /* compiled from: WriterSession.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.WriterSessionKt", m3645f = "WriterSession.kt", m3646l = {93}, m3647m = "writeBufferSuspend")
    /* renamed from: io.ktor.utils.io.WriterSessionKt$writeBufferSuspend$1 */
    static final class C456401 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C456401(Continuation<? super C456401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WriterSession3.writeBufferSuspend(null, 0, this);
        }
    }

    @PublishedApi
    public static final Object requestWriteBuffer(ByteWriteChannel byteWriteChannel, int i, Continuation<? super Buffer> continuation) {
        WriterSession4 writerSession4WriteSessionFor = writeSessionFor(byteWriteChannel);
        if (writerSession4WriteSessionFor != null) {
            ChunkBuffer chunkBufferRequest = writerSession4WriteSessionFor.request(i);
            return chunkBufferRequest != null ? chunkBufferRequest : writeBufferSuspend(writerSession4WriteSessionFor, i, continuation);
        }
        return writeBufferFallback();
    }

    @PublishedApi
    public static final Object completeWriting(ByteWriteChannel byteWriteChannel, Buffer buffer, int i, Continuation<? super Unit> continuation) {
        if (byteWriteChannel instanceof WriterSession2) {
            ((WriterSession2) byteWriteChannel).endWriteSession(i);
            return Unit.INSTANCE;
        }
        Object objCompleteWritingFallback = completeWritingFallback(byteWriteChannel, buffer, continuation);
        return objCompleteWritingFallback == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCompleteWritingFallback : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object completeWritingFallback(ByteWriteChannel byteWriteChannel, Buffer buffer, Continuation<? super Unit> continuation) {
        C456391 c456391;
        if (continuation instanceof C456391) {
            c456391 = (C456391) continuation;
            int i = c456391.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c456391.label = i - Integer.MIN_VALUE;
            } else {
                c456391 = new C456391(continuation);
            }
        }
        Object obj = c456391.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c456391.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (buffer instanceof ChunkBuffer) {
                c456391.L$0 = buffer;
                c456391.label = 1;
                if (byteWriteChannel.writeFully(buffer, c456391) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw new UnsupportedOperationException("Only ChunkBuffer instance is supported.");
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            buffer = (Buffer) c456391.L$0;
            ResultKt.throwOnFailure(obj);
        }
        ((ChunkBuffer) buffer).release(ChunkBuffer.INSTANCE.getPool());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object writeBufferSuspend(WriterSession4 writerSession4, int i, Continuation<? super Buffer> continuation) {
        C456401 c456401;
        if (continuation instanceof C456401) {
            c456401 = (C456401) continuation;
            int i2 = c456401.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c456401.label = i2 - Integer.MIN_VALUE;
            } else {
                c456401 = new C456401(continuation);
            }
        }
        Object obj = c456401.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c456401.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            c456401.L$0 = writerSession4;
            c456401.I$0 = i;
            c456401.label = 1;
            if (writerSession4.tryAwait(i, c456401) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c456401.I$0;
            writerSession4 = (WriterSession4) c456401.L$0;
            ResultKt.throwOnFailure(obj);
        }
        ChunkBuffer chunkBufferRequest = writerSession4.request(i);
        return chunkBufferRequest != null ? chunkBufferRequest : writerSession4.request(1);
    }

    private static final Buffer writeBufferFallback() {
        ChunkBuffer chunkBufferBorrow = ChunkBuffer.INSTANCE.getPool().borrow();
        ChunkBuffer chunkBuffer = chunkBufferBorrow;
        chunkBuffer.resetForWrite();
        chunkBuffer.reserveEndGap(8);
        return chunkBufferBorrow;
    }

    private static final WriterSession4 writeSessionFor(ByteWriteChannel byteWriteChannel) {
        if (byteWriteChannel instanceof WriterSession2) {
            return ((WriterSession2) byteWriteChannel).beginWriteSession();
        }
        return null;
    }
}
