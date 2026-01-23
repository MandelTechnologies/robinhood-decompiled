package io.ktor.utils.p478io.jvm.javaio;

import io.ktor.utils.p478io.ByteReadChannelJVM;
import io.ktor.utils.p478io.pool.ByteArrayPool2;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Writing.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m3636d2 = {"copyTo", "", "Lio/ktor/utils/io/ByteReadChannel;", "out", "Ljava/io/OutputStream;", "limit", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/io/OutputStream;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.utils.io.jvm.javaio.WritingKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class Writing2 {

    /* compiled from: Writing.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.jvm.javaio.WritingKt", m3645f = "Writing.kt", m3646l = {22}, m3647m = "copyTo")
    /* renamed from: io.ktor.utils.io.jvm.javaio.WritingKt$copyTo$1 */
    static final class C456481 extends ContinuationImpl {
        long J$0;
        long J$1;
        long J$2;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C456481(Continuation<? super C456481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Writing2.copyTo(null, null, 0L, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0092 -> B:49:0x0096). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyTo(ByteReadChannelJVM byteReadChannelJVM, OutputStream outputStream, long j, Continuation<? super Long> continuation) throws Throwable {
        C456481 c456481;
        long length;
        long j2;
        byte[] bArr;
        C456481 c4564812;
        long j3;
        ByteReadChannelJVM byteReadChannelJVM2;
        OutputStream outputStream2;
        if (continuation instanceof C456481) {
            c456481 = (C456481) continuation;
            int i = c456481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c456481.label = i - Integer.MIN_VALUE;
            } else {
                c456481 = new C456481(continuation);
            }
        }
        Object obj = c456481.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r5 = c456481.label;
        try {
            if (r5 == 0) {
                ResultKt.throwOnFailure(obj);
                if (j < 0) {
                    throw new IllegalArgumentException(("Limit shouldn't be negative: " + j).toString());
                }
                byte[] bArrBorrow = ByteArrayPool2.getByteArrayPool().borrow();
                length = bArrBorrow.length;
                j2 = 0;
                bArr = bArrBorrow;
                c4564812 = c456481;
                j3 = j;
                byteReadChannelJVM2 = byteReadChannelJVM;
                outputStream2 = outputStream;
                if (j2 < j3) {
                }
                r5 = bArr;
                Long lBoxLong = boxing.boxLong(j2);
                ByteArrayPool2.getByteArrayPool().recycle(r5);
                return lBoxLong;
            }
            if (r5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j4 = c456481.J$2;
            long j5 = c456481.J$1;
            long j6 = c456481.J$0;
            byte[] bArr2 = (byte[]) c456481.L$2;
            OutputStream outputStream3 = (OutputStream) c456481.L$1;
            ByteReadChannelJVM byteReadChannelJVM3 = (ByteReadChannelJVM) c456481.L$0;
            ResultKt.throwOnFailure(obj);
            long j7 = j5;
            bArr = bArr2;
            c4564812 = c456481;
            outputStream2 = outputStream3;
            byteReadChannelJVM2 = byteReadChannelJVM3;
            long j8 = j4;
            try {
                int iIntValue = ((Number) obj).intValue();
                if (iIntValue == -1) {
                    j2 = j7;
                    r5 = bArr;
                    Long lBoxLong2 = boxing.boxLong(j2);
                    ByteArrayPool2.getByteArrayPool().recycle(r5);
                    return lBoxLong2;
                }
                if (iIntValue > 0) {
                    outputStream2.write(bArr, 0, iIntValue);
                    long j9 = j8;
                    j2 = iIntValue + j7;
                    j3 = j6;
                    length = j9;
                } else {
                    j3 = j6;
                    length = j8;
                    j2 = j7;
                }
                if (j2 < j3) {
                    int iMin = (int) Math.min(j3 - j2, length);
                    c4564812.L$0 = byteReadChannelJVM2;
                    c4564812.L$1 = outputStream2;
                    c4564812.L$2 = bArr;
                    c4564812.J$0 = j3;
                    c4564812.J$1 = j2;
                    c4564812.J$2 = length;
                    c4564812.label = 1;
                    Object available = byteReadChannelJVM2.readAvailable(bArr, 0, iMin, c4564812);
                    if (available == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j7 = j2;
                    j8 = length;
                    j6 = j3;
                    obj = available;
                    int iIntValue2 = ((Number) obj).intValue();
                    if (iIntValue2 == -1) {
                    }
                }
                r5 = bArr;
                Long lBoxLong22 = boxing.boxLong(j2);
                ByteArrayPool2.getByteArrayPool().recycle(r5);
                return lBoxLong22;
            } catch (Throwable th) {
                th = th;
                r5 = bArr;
                ByteArrayPool2.getByteArrayPool().recycle(r5);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static /* synthetic */ Object copyTo$default(ByteReadChannelJVM byteReadChannelJVM, OutputStream outputStream, long j, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Long.MAX_VALUE;
        }
        return copyTo(byteReadChannelJVM, outputStream, j, continuation);
    }
}
