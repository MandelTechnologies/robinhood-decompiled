package io.ktor.util;

import io.ktor.utils.p478io.ByteReadChannelJVM;
import io.ktor.utils.p478io.core.ByteReadPacket;
import io.ktor.utils.p478io.core.StringsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannels.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, m3636d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "", "toByteArray", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-utils"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.util.ByteChannelsKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ByteChannels {

    /* compiled from: ByteChannels.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.util.ByteChannelsKt", m3645f = "ByteChannels.kt", m3646l = {91}, m3647m = "toByteArray")
    /* renamed from: io.ktor.util.ByteChannelsKt$toByteArray$1 */
    static final class C456091 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C456091(Continuation<? super C456091> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannels.toByteArray(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object toByteArray(ByteReadChannelJVM byteReadChannelJVM, Continuation<? super byte[]> continuation) {
        C456091 c456091;
        if (continuation instanceof C456091) {
            c456091 = (C456091) continuation;
            int i = c456091.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c456091.label = i - Integer.MIN_VALUE;
            } else {
                c456091 = new C456091(continuation);
            }
        }
        C456091 c4560912 = c456091;
        Object remaining$default = c4560912.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4560912.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(remaining$default);
            c4560912.label = 1;
            remaining$default = ByteReadChannelJVM.DefaultImpls.readRemaining$default(byteReadChannelJVM, 0L, c4560912, 1, null);
            if (remaining$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(remaining$default);
        }
        return StringsKt.readBytes$default((ByteReadPacket) remaining$default, 0, 1, null);
    }
}
