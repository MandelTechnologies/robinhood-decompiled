package io.ktor.utils.p478io;

import io.ktor.utils.p478io.core.ByteReadPacket;
import io.ktor.utils.p478io.core.internal.ChunkBuffer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* compiled from: ByteReadChannelJVM.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\bf\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dJ+\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m3636d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "", "", "dst", "", "offset", "length", "readAvailable", "([BIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "limit", "Lio/ktor/utils/io/core/ByteReadPacket;", "readRemaining", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cause", "", "cancel", "(Ljava/lang/Throwable;)Z", "getAvailableForRead", "()I", "availableForRead", "isClosedForRead", "()Z", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "Companion", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.utils.io.ByteReadChannel, reason: use source file name */
/* loaded from: classes14.dex */
public interface ByteReadChannelJVM {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    boolean cancel(Throwable cause);

    int getAvailableForRead();

    Throwable getClosedCause();

    boolean isClosedForRead();

    Object readAvailable(ChunkBuffer chunkBuffer, Continuation<? super Integer> continuation);

    Object readAvailable(byte[] bArr, int i, int i2, Continuation<? super Integer> continuation);

    Object readRemaining(long j, Continuation<? super ByteReadPacket> continuation);

    /* compiled from: ByteReadChannelJVM.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannel$DefaultImpls */
    public static final class DefaultImpls {
        public static /* synthetic */ Object readRemaining$default(ByteReadChannelJVM byteReadChannelJVM, long j, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readRemaining");
            }
            if ((i & 1) != 0) {
                j = Long.MAX_VALUE;
            }
            return byteReadChannelJVM.readRemaining(j, continuation);
        }
    }

    /* compiled from: ByteReadChannelJVM.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m3636d2 = {"Lio/ktor/utils/io/ByteReadChannel$Companion;", "", "()V", "Empty", "Lio/ktor/utils/io/ByteReadChannel;", "getEmpty", "()Lio/ktor/utils/io/ByteReadChannel;", "Empty$delegate", "Lkotlin/Lazy;", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannel$Companion, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* renamed from: Empty$delegate, reason: from kotlin metadata */
        private static final Lazy<ByteChannelCtor> Empty = LazyKt.lazy(new Function0<ByteChannelCtor>() { // from class: io.ktor.utils.io.ByteReadChannel$Companion$Empty$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ByteChannelCtor invoke() {
                ByteChannelCtor byteChannelCtorByteChannel$default = ByteChannel2.ByteChannel$default(false, 1, null);
                ByteWriteChannel2.close(byteChannelCtorByteChannel$default);
                return byteChannelCtorByteChannel$default;
            }
        });

        private Companion() {
        }

        public final ByteReadChannelJVM getEmpty() {
            return Empty.getValue();
        }
    }
}
