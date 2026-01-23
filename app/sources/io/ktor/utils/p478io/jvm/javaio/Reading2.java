package io.ktor.utils.p478io.jvm.javaio;

import io.ktor.utils.p478io.ByteReadChannelJVM;
import io.ktor.utils.p478io.ByteWriteChannel;
import io.ktor.utils.p478io.Coroutines3;
import io.ktor.utils.p478io.Coroutines6;
import io.ktor.utils.p478io.pool.ByteArrayPool2;
import io.ktor.utils.p478io.pool.Pool3;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope3;
import kotlinx.coroutines.Dispatchers;

/* compiled from: Reading.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u0007¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, m3636d2 = {"Ljava/io/InputStream;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "pool", "Lio/ktor/utils/io/ByteReadChannel;", "toByteReadChannel", "(Ljava/io/InputStream;Lkotlin/coroutines/CoroutineContext;Lio/ktor/utils/io/pool/ObjectPool;)Lio/ktor/utils/io/ByteReadChannel;", "", "toByteReadChannelWithArrayPool", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.utils.io.jvm.javaio.ReadingKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class Reading2 {

    /* compiled from: Reading.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.jvm.javaio.ReadingKt$toByteReadChannel$1", m3645f = "Reading.kt", m3646l = {61}, m3647m = "invokeSuspend")
    /* renamed from: io.ktor.utils.io.jvm.javaio.ReadingKt$toByteReadChannel$1 */
    static final class C456461 extends ContinuationImpl7 implements Function2<Coroutines6, Continuation<? super Unit>, Object> {
        final /* synthetic */ Pool3<ByteBuffer> $pool;
        final /* synthetic */ InputStream $this_toByteReadChannel;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C456461(Pool3<ByteBuffer> pool3, InputStream inputStream, Continuation<? super C456461> continuation) {
            super(2, continuation);
            this.$pool = pool3;
            this.$this_toByteReadChannel = inputStream;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C456461 c456461 = new C456461(this.$pool, this.$this_toByteReadChannel, continuation);
            c456461.L$0 = obj;
            return c456461;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Coroutines6 coroutines6, Continuation<? super Unit> continuation) {
            return ((C456461) create(coroutines6, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws IOException {
            ByteBuffer byteBufferBorrow;
            Coroutines6 coroutines6;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Coroutines6 coroutines62 = (Coroutines6) this.L$0;
                byteBufferBorrow = this.$pool.borrow();
                coroutines6 = coroutines62;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                byteBufferBorrow = (ByteBuffer) this.L$1;
                coroutines6 = (Coroutines6) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } finally {
                    try {
                        return Unit.INSTANCE;
                    } finally {
                    }
                }
            }
            while (true) {
                byteBufferBorrow.clear();
                int i2 = this.$this_toByteReadChannel.read(byteBufferBorrow.array(), byteBufferBorrow.arrayOffset() + byteBufferBorrow.position(), byteBufferBorrow.remaining());
                if (i2 < 0) {
                    break;
                }
                if (i2 != 0) {
                    byteBufferBorrow.position(byteBufferBorrow.position() + i2);
                    byteBufferBorrow.flip();
                    ByteWriteChannel channel = coroutines6.getChannel();
                    this.L$0 = coroutines6;
                    this.L$1 = byteBufferBorrow;
                    this.label = 1;
                    if (channel.writeFully(byteBufferBorrow, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final ByteReadChannelJVM toByteReadChannel(InputStream inputStream, CoroutineContext context, Pool3<ByteBuffer> pool) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pool, "pool");
        return Coroutines3.writer((CoroutineScope) CoroutineScope3.INSTANCE, context, true, (Function2<? super Coroutines6, ? super Continuation<? super Unit>, ? extends Object>) new C456461(pool, inputStream, null)).getChannel();
    }

    public static /* synthetic */ ByteReadChannelJVM toByteReadChannelWithArrayPool$default(InputStream inputStream, CoroutineContext coroutineContext, Pool3 pool3, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getIO();
        }
        if ((i & 2) != 0) {
            pool3 = ByteArrayPool2.getByteArrayPool();
        }
        return toByteReadChannelWithArrayPool(inputStream, coroutineContext, pool3);
    }

    /* compiled from: Reading.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.jvm.javaio.ReadingKt$toByteReadChannel$2", m3645f = "Reading.kt", m3646l = {90}, m3647m = "invokeSuspend")
    /* renamed from: io.ktor.utils.io.jvm.javaio.ReadingKt$toByteReadChannel$2 */
    static final class C456472 extends ContinuationImpl7 implements Function2<Coroutines6, Continuation<? super Unit>, Object> {
        final /* synthetic */ Pool3<byte[]> $pool;
        final /* synthetic */ InputStream $this_toByteReadChannel;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C456472(Pool3<byte[]> pool3, InputStream inputStream, Continuation<? super C456472> continuation) {
            super(2, continuation);
            this.$pool = pool3;
            this.$this_toByteReadChannel = inputStream;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C456472 c456472 = new C456472(this.$pool, this.$this_toByteReadChannel, continuation);
            c456472.L$0 = obj;
            return c456472;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Coroutines6 coroutines6, Continuation<? super Unit> continuation) {
            return ((C456472) create(coroutines6, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws IOException {
            byte[] bArrBorrow;
            Coroutines6 coroutines6;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Coroutines6 coroutines62 = (Coroutines6) this.L$0;
                bArrBorrow = this.$pool.borrow();
                coroutines6 = coroutines62;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bArrBorrow = (byte[]) this.L$1;
                coroutines6 = (Coroutines6) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th) {
                    try {
                        coroutines6.getChannel().close(th);
                        this.$pool.recycle(bArrBorrow);
                    } catch (Throwable th2) {
                        this.$pool.recycle(bArrBorrow);
                        this.$this_toByteReadChannel.close();
                        throw th2;
                    }
                }
            }
            while (true) {
                int i2 = this.$this_toByteReadChannel.read(bArrBorrow, 0, bArrBorrow.length);
                if (i2 < 0) {
                    this.$pool.recycle(bArrBorrow);
                    break;
                }
                if (i2 != 0) {
                    ByteWriteChannel channel = coroutines6.getChannel();
                    this.L$0 = coroutines6;
                    this.L$1 = bArrBorrow;
                    this.label = 1;
                    if (channel.writeFully(bArrBorrow, 0, i2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            this.$this_toByteReadChannel.close();
            return Unit.INSTANCE;
        }
    }

    @JvmName
    public static final ByteReadChannelJVM toByteReadChannelWithArrayPool(InputStream inputStream, CoroutineContext context, Pool3<byte[]> pool) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pool, "pool");
        return Coroutines3.writer((CoroutineScope) CoroutineScope3.INSTANCE, context, true, (Function2<? super Coroutines6, ? super Continuation<? super Unit>, ? extends Object>) new C456472(pool, inputStream, null)).getChannel();
    }
}
