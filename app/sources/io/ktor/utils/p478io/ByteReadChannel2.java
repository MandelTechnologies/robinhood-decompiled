package io.ktor.utils.p478io;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ByteReadChannel.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a)\u0010\u000e\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m3636d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "", "cancel", "(Lio/ktor/utils/io/ByteReadChannel;)Z", "", "dst", "", "readAvailable", "(Lio/ktor/utils/io/ByteReadChannel;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteWriteChannel;", "", "copyTo", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "limit", "copyAndClose", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.utils.io.ByteReadChannelKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ByteReadChannel2 {

    /* compiled from: ByteReadChannel.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.ByteReadChannelKt", m3645f = "ByteReadChannel.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, m3647m = "copyAndClose")
    /* renamed from: io.ktor.utils.io.ByteReadChannelKt$copyAndClose$1 */
    static final class C456361 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C456361(Continuation<? super C456361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannel2.copyAndClose(null, null, 0L, this);
        }
    }

    public static final boolean cancel(ByteReadChannelJVM byteReadChannelJVM) {
        Intrinsics.checkNotNullParameter(byteReadChannelJVM, "<this>");
        return byteReadChannelJVM.cancel(null);
    }

    public static final Object readAvailable(ByteReadChannelJVM byteReadChannelJVM, byte[] bArr, Continuation<? super Integer> continuation) {
        return byteReadChannelJVM.readAvailable(bArr, 0, bArr.length, continuation);
    }

    public static final Object copyTo(ByteReadChannelJVM byteReadChannelJVM, ByteWriteChannel byteWriteChannel, Continuation<? super Long> continuation) {
        return ByteReadChannelJVM3.copyTo(byteReadChannelJVM, byteWriteChannel, Long.MAX_VALUE, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyAndClose(ByteReadChannelJVM byteReadChannelJVM, ByteWriteChannel byteWriteChannel, long j, Continuation<? super Long> continuation) {
        C456361 c456361;
        if (continuation instanceof C456361) {
            c456361 = (C456361) continuation;
            int i = c456361.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c456361.label = i - Integer.MIN_VALUE;
            } else {
                c456361 = new C456361(continuation);
            }
        }
        Object objCopyTo = c456361.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c456361.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCopyTo);
            c456361.L$0 = byteWriteChannel;
            c456361.label = 1;
            objCopyTo = ByteReadChannelJVM3.copyTo(byteReadChannelJVM, byteWriteChannel, j, c456361);
            if (objCopyTo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteWriteChannel = (ByteWriteChannel) c456361.L$0;
            ResultKt.throwOnFailure(objCopyTo);
        }
        long jLongValue = ((Number) objCopyTo).longValue();
        ByteWriteChannel2.close(byteWriteChannel);
        return boxing.boxLong(jLongValue);
    }

    public static /* synthetic */ Object copyAndClose$default(ByteReadChannelJVM byteReadChannelJVM, ByteWriteChannel byteWriteChannel, long j, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Long.MAX_VALUE;
        }
        return copyAndClose(byteReadChannelJVM, byteWriteChannel, j, continuation);
    }
}
