package io.ktor.utils.p478io;

import com.plaid.internal.EnumC7081g;
import io.ktor.utils.p478io.core.internal.ChunkBuffer;
import io.ktor.utils.p478io.internal.SequentialCopyTo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;

/* compiled from: ByteReadChannelJVM.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, m3636d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/utils/io/ByteWriteChannel;", "dst", "", "limit", "copyTo", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copyToImpl", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.utils.io.ByteReadChannelJVMKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ByteReadChannelJVM3 {

    /* compiled from: ByteReadChannelJVM.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.ByteReadChannelJVMKt", m3645f = "ByteReadChannelJVM.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE, EnumC7081g.f2774x74902ae0}, m3647m = "copyToImpl")
    /* renamed from: io.ktor.utils.io.ByteReadChannelJVMKt$copyToImpl$1 */
    static final class C456351 extends ContinuationImpl {
        int I$0;
        int I$1;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C456351(Continuation<? super C456351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelJVM3.copyToImpl(null, null, 0L, this);
        }
    }

    public static final Object copyTo(ByteReadChannelJVM byteReadChannelJVM, ByteWriteChannel byteWriteChannel, long j, Continuation<? super Long> continuation) {
        if (byteReadChannelJVM == byteWriteChannel) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (j == 0) {
            return boxing.boxLong(0L);
        }
        if ((byteReadChannelJVM instanceof ByteBufferChannel) && (byteWriteChannel instanceof ByteBufferChannel)) {
            return ((ByteBufferChannel) byteWriteChannel).copyDirect$ktor_io((ByteBufferChannel) byteReadChannelJVM, j, null, continuation);
        }
        if ((byteReadChannelJVM instanceof ByteChannelSequential) && (byteWriteChannel instanceof ByteChannelSequential)) {
            return SequentialCopyTo.copyToSequentialImpl((ByteChannelSequential) byteReadChannelJVM, (ByteChannelSequential) byteWriteChannel, Long.MAX_VALUE, continuation);
        }
        return copyToImpl(byteReadChannelJVM, byteWriteChannel, j, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f A[Catch: all -> 0x00f0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:38:0x00e6, B:40:0x00ec, B:26:0x008f), top: B:55:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4 A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #2 {all -> 0x0048, blocks: (B:13:0x0040, B:30:0x00bb, B:32:0x00c4, B:47:0x00ff, B:21:0x0067), top: B:59:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00db -> B:15:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyToImpl(ByteReadChannelJVM byteReadChannelJVM, ByteWriteChannel byteWriteChannel, long j, Continuation<? super Long> continuation) {
        C456351 c456351;
        ByteWriteChannel byteWriteChannel2;
        ChunkBuffer chunkBufferBorrow;
        long j2;
        ?? r10;
        long j3;
        ByteReadChannelJVM byteReadChannelJVM2;
        C456351 c4563512;
        ByteWriteChannel byteWriteChannel3;
        ByteReadChannelJVM byteReadChannelJVM3;
        long j4;
        long j5;
        int i;
        int iIntValue;
        long j6;
        if (continuation instanceof C456351) {
            c456351 = (C456351) continuation;
            int i2 = c456351.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c456351.label = i2 - Integer.MIN_VALUE;
            } else {
                c456351 = new C456351(continuation);
            }
        }
        Object obj = c456351.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c456351.label;
        long j7 = 0;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                j2 = j;
                chunkBufferBorrow = ChunkBuffer.INSTANCE.getPool().borrow();
                r10 = !byteWriteChannel.getAutoFlush();
                j3 = 0;
                byteReadChannelJVM2 = byteReadChannelJVM;
                c4563512 = c456351;
                byteWriteChannel3 = byteWriteChannel;
                j6 = j2 - j3;
                if (j6 != j7) {
                }
            } else if (i3 == 1) {
                j5 = c456351.J$1;
                i = c456351.I$0;
                j4 = c456351.J$0;
                chunkBufferBorrow = (ChunkBuffer) c456351.L$2;
                byteWriteChannel2 = (ByteWriteChannel) c456351.L$1;
                byteReadChannelJVM3 = (ByteReadChannelJVM) c456351.L$0;
                ResultKt.throwOnFailure(obj);
                iIntValue = ((Number) obj).intValue();
                if (iIntValue == -1) {
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = c456351.I$1;
                j5 = c456351.J$1;
                int i5 = c456351.I$0;
                long j8 = c456351.J$0;
                chunkBufferBorrow = (ChunkBuffer) c456351.L$2;
                byteWriteChannel2 = (ByteWriteChannel) c456351.L$1;
                ByteReadChannelJVM byteReadChannelJVM4 = (ByteReadChannelJVM) c456351.L$0;
                ResultKt.throwOnFailure(obj);
                byteReadChannelJVM2 = byteReadChannelJVM4;
                int i6 = i5;
                C456351 c4563513 = c456351;
                byteWriteChannel3 = byteWriteChannel2;
                long j9 = j5 + i4;
                if (i6 != 0) {
                    try {
                        if (byteReadChannelJVM2.get_availableForRead() == 0) {
                            byteWriteChannel3.flush();
                        }
                    } catch (Throwable th) {
                        th = th;
                        byteWriteChannel2 = byteWriteChannel3;
                        try {
                            byteWriteChannel2.close(th);
                            throw th;
                        } finally {
                            chunkBufferBorrow.release(ChunkBuffer.INSTANCE.getPool());
                        }
                    }
                }
                long j10 = j8;
                j3 = j9;
                j2 = j10;
                c4563512 = c4563513;
                j7 = 0;
                r10 = i6;
                j6 = j2 - j3;
                if (j6 != j7) {
                    chunkBufferBorrow.resetForWrite((int) Math.min(chunkBufferBorrow.getCapacity(), j6));
                    c4563512.L$0 = byteReadChannelJVM2;
                    c4563512.L$1 = byteWriteChannel3;
                    c4563512.L$2 = chunkBufferBorrow;
                    c4563512.J$0 = j2;
                    c4563512.I$0 = r10;
                    c4563512.J$1 = j3;
                    c4563512.label = 1;
                    Object available = byteReadChannelJVM2.readAvailable(chunkBufferBorrow, c4563512);
                    if (available != coroutine_suspended) {
                        byteWriteChannel2 = byteWriteChannel3;
                        c456351 = c4563512;
                        i = r10;
                        byteReadChannelJVM3 = byteReadChannelJVM2;
                        obj = available;
                        j4 = j2;
                        j5 = j3;
                        iIntValue = ((Number) obj).intValue();
                        if (iIntValue == -1) {
                            c456351.L$0 = byteReadChannelJVM3;
                            c456351.L$1 = byteWriteChannel2;
                            c456351.L$2 = chunkBufferBorrow;
                            c456351.J$0 = j4;
                            c456351.I$0 = i;
                            c456351.J$1 = j5;
                            c456351.I$1 = iIntValue;
                            c456351.label = 2;
                            if (byteWriteChannel2.writeFully(chunkBufferBorrow, c456351) != coroutine_suspended) {
                                int i7 = i;
                                i4 = iIntValue;
                                byteReadChannelJVM2 = byteReadChannelJVM3;
                                j8 = j4;
                                i6 = i7;
                                C456351 c45635132 = c456351;
                                byteWriteChannel3 = byteWriteChannel2;
                                long j92 = j5 + i4;
                                if (i6 != 0) {
                                }
                                long j102 = j8;
                                j3 = j92;
                                j2 = j102;
                                c4563512 = c45635132;
                                j7 = 0;
                                r10 = i6;
                                j6 = j2 - j3;
                                if (j6 != j7) {
                                    byteWriteChannel2 = byteWriteChannel3;
                                    return boxing.boxLong(j3);
                                }
                            }
                        } else {
                            j3 = j5;
                            return boxing.boxLong(j3);
                        }
                    }
                    return coroutine_suspended;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
