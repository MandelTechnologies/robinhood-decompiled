package io.ktor.utils.p478io.internal;

import io.ktor.utils.p478io.ByteChannelSequential;
import io.ktor.utils.p478io.core.internal.ChunkBuffer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.ranges.RangesKt;

/* compiled from: SequentialCopyTo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u001a'\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\u0006\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m3636d2 = {"Lio/ktor/utils/io/ByteChannelSequentialBase;", "dst", "", "limit", "copyToSequentialImpl", "(Lio/ktor/utils/io/ByteChannelSequentialBase;Lio/ktor/utils/io/ByteChannelSequentialBase;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copyToTail", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.utils.io.internal.SequentialCopyToKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class SequentialCopyTo {

    /* compiled from: SequentialCopyTo.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.internal.SequentialCopyToKt", m3645f = "SequentialCopyTo.kt", m3646l = {26, 31, 39}, m3647m = "copyToSequentialImpl")
    /* renamed from: io.ktor.utils.io.internal.SequentialCopyToKt$copyToSequentialImpl$1 */
    static final class C456431 extends ContinuationImpl {
        long J$0;
        long J$1;
        long J$2;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C456431(Continuation<? super C456431> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SequentialCopyTo.copyToSequentialImpl(null, null, 0L, this);
        }
    }

    /* compiled from: SequentialCopyTo.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.internal.SequentialCopyToKt", m3645f = "SequentialCopyTo.kt", m3646l = {60, 66}, m3647m = "copyToTail")
    /* renamed from: io.ktor.utils.io.internal.SequentialCopyToKt$copyToTail$1 */
    static final class C456441 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C456441(Continuation<? super C456441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SequentialCopyTo.copyToTail(null, null, 0L, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d2, code lost:
    
        if (r14 != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ed, code lost:
    
        if (r0.awaitAtLeastNBytesAvailableForWrite$ktor_io(1, r2) == r3) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00d2 -> B:44:0x00d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00db -> B:50:0x00f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00ed -> B:50:0x00f0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyToSequentialImpl(ByteChannelSequential byteChannelSequential, ByteChannelSequential byteChannelSequential2, long j, Continuation<? super Long> continuation) throws Throwable {
        C456431 c456431;
        ByteChannelSequential byteChannelSequential3;
        long j2;
        long j3;
        ByteChannelSequential byteChannelSequential4;
        long jLongValue;
        long j4;
        long j5;
        ByteChannelSequential byteChannelSequential5 = byteChannelSequential2;
        if (continuation instanceof C456431) {
            c456431 = (C456431) continuation;
            int i = c456431.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c456431.label = i - Integer.MIN_VALUE;
            } else {
                c456431 = new C456431(continuation);
            }
        }
        Object objCopyToTail = c456431.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c456431.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCopyToTail);
            byteChannelSequential3 = byteChannelSequential;
            if (byteChannelSequential3 == byteChannelSequential5) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (byteChannelSequential3.getClosedCause() != null) {
                byteChannelSequential5.close(byteChannelSequential3.getClosedCause());
                return boxing.boxLong(0L);
            }
            j2 = j;
            j3 = j2;
            if (j2 > 0) {
            }
            return boxing.boxLong(j3 - j2);
        }
        if (i2 == 1) {
            j2 = c456431.J$1;
            j3 = c456431.J$0;
            byteChannelSequential5 = (ByteChannelSequential) c456431.L$1;
            byteChannelSequential4 = (ByteChannelSequential) c456431.L$0;
            ResultKt.throwOnFailure(objCopyToTail);
            j4 = j3;
            j5 = j2;
            if (((Boolean) objCopyToTail).booleanValue()) {
            }
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long jTransferTo$ktor_io = c456431.J$2;
                j5 = c456431.J$1;
                j4 = c456431.J$0;
                byteChannelSequential5 = (ByteChannelSequential) c456431.L$1;
                byteChannelSequential4 = (ByteChannelSequential) c456431.L$0;
                ResultKt.throwOnFailure(objCopyToTail);
                long j6 = j4;
                jLongValue = jTransferTo$ktor_io;
                j2 = j5;
                j3 = j6;
                byteChannelSequential3 = byteChannelSequential4;
                j2 -= jLongValue;
                if (jLongValue > 0) {
                    byteChannelSequential5.flush();
                }
                if (j2 > 0) {
                    c456431.L$0 = byteChannelSequential3;
                    c456431.L$1 = byteChannelSequential5;
                    c456431.J$0 = j3;
                    c456431.J$1 = j2;
                    c456431.label = 1;
                    Object objAwaitInternalAtLeast1$ktor_io = byteChannelSequential3.awaitInternalAtLeast1$ktor_io(c456431);
                    if (objAwaitInternalAtLeast1$ktor_io != coroutine_suspended) {
                        byteChannelSequential4 = byteChannelSequential3;
                        objCopyToTail = objAwaitInternalAtLeast1$ktor_io;
                        j4 = j3;
                        j5 = j2;
                        if (((Boolean) objCopyToTail).booleanValue()) {
                            j2 = j5;
                            j3 = j4;
                        } else {
                            jTransferTo$ktor_io = byteChannelSequential4.transferTo$ktor_io(byteChannelSequential5, j5);
                            if (jTransferTo$ktor_io == 0) {
                                c456431.L$0 = byteChannelSequential4;
                                c456431.L$1 = byteChannelSequential5;
                                c456431.J$0 = j4;
                                c456431.J$1 = j5;
                                c456431.label = 2;
                                objCopyToTail = copyToTail(byteChannelSequential4, byteChannelSequential5, j5, c456431);
                                if (objCopyToTail != coroutine_suspended) {
                                    j2 = j5;
                                    j3 = j4;
                                    jLongValue = ((Number) objCopyToTail).longValue();
                                }
                            } else {
                                if (byteChannelSequential5.getAvailableForWrite() == 0) {
                                    c456431.L$0 = byteChannelSequential4;
                                    c456431.L$1 = byteChannelSequential5;
                                    c456431.J$0 = j4;
                                    c456431.J$1 = j5;
                                    c456431.J$2 = jTransferTo$ktor_io;
                                    c456431.label = 3;
                                }
                                long j62 = j4;
                                jLongValue = jTransferTo$ktor_io;
                                j2 = j5;
                                j3 = j62;
                                byteChannelSequential3 = byteChannelSequential4;
                                j2 -= jLongValue;
                                if (jLongValue > 0) {
                                }
                                if (j2 > 0) {
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                return boxing.boxLong(j3 - j2);
            }
            j2 = c456431.J$1;
            j3 = c456431.J$0;
            byteChannelSequential5 = (ByteChannelSequential) c456431.L$1;
            byteChannelSequential4 = (ByteChannelSequential) c456431.L$0;
            ResultKt.throwOnFailure(objCopyToTail);
            jLongValue = ((Number) objCopyToTail).longValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v10, types: [io.ktor.utils.io.core.internal.ChunkBuffer] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyToTail(ByteChannelSequential byteChannelSequential, ByteChannelSequential byteChannelSequential2, long j, Continuation<? super Long> continuation) throws Throwable {
        C456441 c456441;
        ChunkBuffer chunkBufferBorrow;
        Object available;
        ByteChannelSequential byteChannelSequential3;
        int iIntValue;
        if (continuation instanceof C456441) {
            c456441 = (C456441) continuation;
            int i = c456441.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c456441.label = i - Integer.MIN_VALUE;
            } else {
                c456441 = new C456441(continuation);
            }
        }
        Object obj = c456441.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c456441.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                chunkBufferBorrow = ChunkBuffer.INSTANCE.getPool().borrow();
                try {
                    chunkBufferBorrow.resetForWrite((int) RangesKt.coerceAtMost(j, chunkBufferBorrow.getCapacity()));
                    c456441.L$0 = byteChannelSequential2;
                    c456441.L$1 = chunkBufferBorrow;
                    c456441.label = 1;
                    available = byteChannelSequential.readAvailable(chunkBufferBorrow, c456441);
                    byteChannelSequential3 = byteChannelSequential2;
                    if (available == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                } catch (Throwable th) {
                    th = th;
                    byteChannelSequential2 = chunkBufferBorrow;
                    byteChannelSequential2.release(ChunkBuffer.INSTANCE.getPool());
                    throw th;
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iIntValue = c456441.I$0;
                ChunkBuffer chunkBuffer = (ChunkBuffer) c456441.L$0;
                ResultKt.throwOnFailure(obj);
                byteChannelSequential2 = chunkBuffer;
                Long lBoxLong = boxing.boxLong(iIntValue);
                byteChannelSequential2.release(ChunkBuffer.INSTANCE.getPool());
                return lBoxLong;
            }
            ChunkBuffer chunkBuffer2 = (ChunkBuffer) c456441.L$1;
            ByteChannelSequential byteChannelSequential4 = (ByteChannelSequential) c456441.L$0;
            ResultKt.throwOnFailure(obj);
            byteChannelSequential3 = byteChannelSequential4;
            available = obj;
            chunkBufferBorrow = chunkBuffer2;
            iIntValue = ((Number) available).intValue();
            if (iIntValue == -1) {
                ChunkBuffer.Companion companion = ChunkBuffer.INSTANCE;
                chunkBufferBorrow.release(companion.getPool());
                Long lBoxLong2 = boxing.boxLong(0L);
                chunkBufferBorrow.release(companion.getPool());
                return lBoxLong2;
            }
            c456441.L$0 = chunkBufferBorrow;
            c456441.L$1 = null;
            c456441.I$0 = iIntValue;
            c456441.label = 2;
            if (byteChannelSequential3.writeFully(chunkBufferBorrow, c456441) != coroutine_suspended) {
                byteChannelSequential2 = chunkBufferBorrow;
                Long lBoxLong3 = boxing.boxLong(iIntValue);
                byteChannelSequential2.release(ChunkBuffer.INSTANCE.getPool());
                return lBoxLong3;
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
