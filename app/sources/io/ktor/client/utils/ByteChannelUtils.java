package io.ktor.client.utils;

import io.ktor.utils.p478io.ByteReadChannel2;
import io.ktor.utils.p478io.ByteReadChannelJVM;
import io.ktor.utils.p478io.ByteWriteChannel;
import io.ktor.utils.p478io.Coroutines3;
import io.ktor.utils.p478io.Coroutines6;
import io.ktor.utils.p478io.pool.ByteArrayPool2;
import io.ktor.utils.p478io.pool.Pool3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope3;

/* compiled from: ByteChannelUtils.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001an\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052F\u0010\u0006\u001aB\b\u0001\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0007H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m3636d2 = {"observable", "Lio/ktor/utils/io/ByteReadChannel;", "context", "Lkotlin/coroutines/CoroutineContext;", "contentLength", "", "listener", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "bytesSentTotal", "Lkotlin/coroutines/Continuation;", "", "", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Long;Lkotlin/jvm/functions/Function3;)Lio/ktor/utils/io/ByteReadChannel;", "ktor-client-core"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.client.utils.ByteChannelUtilsKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ByteChannelUtils {

    /* compiled from: ByteChannelUtils.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.client.utils.ByteChannelUtilsKt$observable$1", m3645f = "ByteChannelUtils.kt", m3646l = {23, 24, 26, 31}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: io.ktor.client.utils.ByteChannelUtilsKt$observable$1 */
    static final class C455921 extends ContinuationImpl7 implements Function2<Coroutines6, Continuation<? super Unit>, Object> {
        final /* synthetic */ Long $contentLength;
        final /* synthetic */ Function3<Long, Long, Continuation<? super Unit>, Object> $listener;
        final /* synthetic */ ByteReadChannelJVM $this_observable;
        int I$0;
        long J$0;
        long J$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C455921(Long l, ByteReadChannelJVM byteReadChannelJVM, Function3<? super Long, ? super Long, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super C455921> continuation) {
            super(2, continuation);
            this.$contentLength = l;
            this.$this_observable = byteReadChannelJVM;
            this.$listener = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C455921 c455921 = new C455921(this.$contentLength, this.$this_observable, this.$listener, continuation);
            c455921.L$0 = obj;
            return c455921;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Coroutines6 coroutines6, Continuation<? super Unit> continuation) {
            return ((C455921) create(coroutines6, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:62:0x019c, code lost:
        
            if (r11.invoke(r6, r4, r22) == r0) goto L63;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00f3 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001d, B:64:0x019f, B:40:0x00ed, B:42:0x00f3, B:45:0x010d, B:57:0x016f, B:61:0x0180), top: B:69:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x016f A[Catch: all -> 0x0022, TRY_ENTER, TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001d, B:64:0x019f, B:40:0x00ed, B:42:0x00f3, B:45:0x010d, B:57:0x016f, B:61:0x0180), top: B:69:0x000c }] */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v21 */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* JADX WARN: Type inference failed for: r2v28 */
        /* JADX WARN: Type inference failed for: r2v29 */
        /* JADX WARN: Type inference failed for: r2v30 */
        /* JADX WARN: Type inference failed for: r2v31 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0161 -> B:18:0x0059). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Pool3 byteArrayPool;
            long j;
            ByteReadChannelJVM byteReadChannelJVM;
            long jLongValue;
            Function3<Long, Long, Continuation<? super Unit>, Object> function3;
            byte[] bArr;
            Coroutines6 coroutines6;
            Object obj2;
            long j2;
            long j3;
            Object obj3;
            ByteReadChannelJVM byteReadChannelJVM2;
            long j4;
            Pool3 pool3;
            int i;
            long j5;
            Long lBoxLong;
            Long lBoxLong2;
            Object available;
            Object obj4;
            int iIntValue;
            ByteWriteChannel channel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r2 = this.label;
            int i2 = 1;
            try {
                if (r2 == 0) {
                    j = 0;
                    ResultKt.throwOnFailure(obj);
                    Coroutines6 coroutines62 = (Coroutines6) this.L$0;
                    byteArrayPool = ByteArrayPool2.getByteArrayPool();
                    Long l = this.$contentLength;
                    ByteReadChannelJVM byteReadChannelJVM3 = this.$this_observable;
                    Function3<Long, Long, Continuation<? super Unit>, Object> function32 = this.$listener;
                    Object objBorrow = byteArrayPool.borrow();
                    try {
                        byte[] bArr2 = (byte[]) objBorrow;
                        byteReadChannelJVM = byteReadChannelJVM3;
                        jLongValue = l != null ? l.longValue() : -1L;
                        function3 = function32;
                        bArr = bArr2;
                        coroutines6 = coroutines62;
                        obj2 = objBorrow;
                        j2 = 0;
                        if (!byteReadChannelJVM.isClosedForRead()) {
                        }
                        return coroutine_suspended;
                    } catch (Throwable th) {
                        th = th;
                        r2 = objBorrow;
                    }
                } else if (r2 == 1) {
                    j = 0;
                    long j6 = this.J$1;
                    jLongValue = this.J$0;
                    bArr = (byte[]) this.L$5;
                    Object obj5 = this.L$4;
                    function3 = (Function3) this.L$3;
                    byteReadChannelJVM = (ByteReadChannelJVM) this.L$2;
                    Pool3 pool32 = (Pool3) this.L$1;
                    coroutines6 = (Coroutines6) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        j2 = j6;
                        obj4 = obj5;
                        byteArrayPool = pool32;
                        available = obj;
                        iIntValue = ((Number) available).intValue();
                        channel = coroutines6.getChannel();
                        this.L$0 = coroutines6;
                        this.L$1 = byteArrayPool;
                        this.L$2 = byteReadChannelJVM;
                        this.L$3 = function3;
                        this.L$4 = obj4;
                        this.L$5 = bArr;
                        this.J$0 = jLongValue;
                        this.J$1 = j2;
                        this.I$0 = iIntValue;
                        this.label = 2;
                        if (channel.writeFully(bArr, 0, iIntValue, this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    } catch (Throwable th2) {
                        th = th2;
                        r2 = obj5;
                        byteArrayPool = pool32;
                    }
                } else if (r2 == 2) {
                    j = 0;
                    i = this.I$0;
                    long j7 = this.J$1;
                    long j8 = this.J$0;
                    byte[] bArr3 = (byte[]) this.L$5;
                    obj3 = this.L$4;
                    Function3<Long, Long, Continuation<? super Unit>, Object> function33 = (Function3) this.L$3;
                    ByteReadChannelJVM byteReadChannelJVM4 = (ByteReadChannelJVM) this.L$2;
                    Pool3 pool33 = (Pool3) this.L$1;
                    Coroutines6 coroutines63 = (Coroutines6) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        j3 = j7;
                        byteReadChannelJVM2 = byteReadChannelJVM4;
                        coroutines6 = coroutines63;
                        pool3 = pool33;
                        j4 = j8;
                        bArr = bArr3;
                        function3 = function33;
                        j5 = j3 + i;
                        lBoxLong = boxing.boxLong(j5);
                        lBoxLong2 = boxing.boxLong(j4);
                        this.L$0 = coroutines6;
                        this.L$1 = pool3;
                        this.L$2 = byteReadChannelJVM2;
                        this.L$3 = function3;
                        this.L$4 = obj3;
                        this.L$5 = bArr;
                        this.J$0 = j4;
                        this.J$1 = j5;
                        this.label = 3;
                        if (function3.invoke(lBoxLong, lBoxLong2, this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    } catch (Throwable th3) {
                        th = th3;
                        r2 = obj3;
                        byteArrayPool = pool33;
                    }
                } else {
                    if (r2 != 3) {
                        if (r2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj6 = this.L$1;
                        byteArrayPool = (Pool3) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        r2 = obj6;
                        Unit unit = Unit.INSTANCE;
                        byteArrayPool.recycle(r2);
                        return Unit.INSTANCE;
                    }
                    long j9 = this.J$1;
                    long j10 = this.J$0;
                    byte[] bArr4 = (byte[]) this.L$5;
                    Object obj7 = this.L$4;
                    Function3<Long, Long, Continuation<? super Unit>, Object> function34 = (Function3) this.L$3;
                    ByteReadChannelJVM byteReadChannelJVM5 = (ByteReadChannelJVM) this.L$2;
                    j = 0;
                    byteArrayPool = (Pool3) this.L$1;
                    Coroutines6 coroutines64 = (Coroutines6) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        coroutines6 = coroutines64;
                        jLongValue = j10;
                        function3 = function34;
                        byteReadChannelJVM = byteReadChannelJVM5;
                        long j11 = j9;
                        bArr = bArr4;
                        Object obj8 = obj7;
                        j2 = j11;
                        i2 = 1;
                        obj2 = obj8;
                        if (!byteReadChannelJVM.isClosedForRead()) {
                            this.L$0 = coroutines6;
                            this.L$1 = byteArrayPool;
                            this.L$2 = byteReadChannelJVM;
                            this.L$3 = function3;
                            this.L$4 = obj2;
                            this.L$5 = bArr;
                            this.J$0 = jLongValue;
                            this.J$1 = j2;
                            this.label = i2;
                            available = ByteReadChannel2.readAvailable(byteReadChannelJVM, bArr, this);
                            obj4 = obj2;
                            if (available != coroutine_suspended) {
                                iIntValue = ((Number) available).intValue();
                                channel = coroutines6.getChannel();
                                this.L$0 = coroutines6;
                                this.L$1 = byteArrayPool;
                                this.L$2 = byteReadChannelJVM;
                                this.L$3 = function3;
                                this.L$4 = obj4;
                                this.L$5 = bArr;
                                this.J$0 = jLongValue;
                                this.J$1 = j2;
                                this.I$0 = iIntValue;
                                this.label = 2;
                                if (channel.writeFully(bArr, 0, iIntValue, this) != coroutine_suspended) {
                                    try {
                                        j3 = j2;
                                        byteReadChannelJVM2 = byteReadChannelJVM;
                                        obj3 = obj4;
                                        j4 = jLongValue;
                                        i = iIntValue;
                                        pool3 = byteArrayPool;
                                        lBoxLong = boxing.boxLong(j5);
                                        lBoxLong2 = boxing.boxLong(j4);
                                        this.L$0 = coroutines6;
                                        this.L$1 = pool3;
                                        this.L$2 = byteReadChannelJVM2;
                                        this.L$3 = function3;
                                        this.L$4 = obj3;
                                        this.L$5 = bArr;
                                        this.J$0 = j4;
                                        this.J$1 = j5;
                                        this.label = 3;
                                        if (function3.invoke(lBoxLong, lBoxLong2, this) != coroutine_suspended) {
                                            j11 = j5;
                                            byteArrayPool = pool3;
                                            jLongValue = j4;
                                            obj8 = obj3;
                                            byteReadChannelJVM = byteReadChannelJVM2;
                                            j2 = j11;
                                            i2 = 1;
                                            obj2 = obj8;
                                            if (!byteReadChannelJVM.isClosedForRead()) {
                                                Throwable closedCause = byteReadChannelJVM.getClosedCause();
                                                coroutines6.getChannel().close(closedCause);
                                                r2 = obj2;
                                                if (closedCause == null) {
                                                    r2 = obj2;
                                                    if (j2 == j) {
                                                        Long lBoxLong3 = boxing.boxLong(j2);
                                                        Long lBoxLong4 = boxing.boxLong(jLongValue);
                                                        this.L$0 = byteArrayPool;
                                                        this.L$1 = obj2;
                                                        this.L$2 = null;
                                                        this.L$3 = null;
                                                        this.L$4 = null;
                                                        this.L$5 = null;
                                                        this.label = 4;
                                                        r2 = obj2;
                                                    }
                                                }
                                                Unit unit2 = Unit.INSTANCE;
                                                byteArrayPool.recycle(r2);
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        byteArrayPool = pool3;
                                        r2 = obj3;
                                    }
                                    j5 = j3 + i;
                                }
                            }
                        }
                        return coroutine_suspended;
                    } catch (Throwable th5) {
                        th = th5;
                        r2 = obj7;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
            byteArrayPool.recycle(r2);
            throw th;
        }
    }

    public static final ByteReadChannelJVM observable(ByteReadChannelJVM byteReadChannelJVM, CoroutineContext context, Long l, Function3<? super Long, ? super Long, ? super Continuation<? super Unit>, ? extends Object> listener) {
        Intrinsics.checkNotNullParameter(byteReadChannelJVM, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return Coroutines3.writer((CoroutineScope) CoroutineScope3.INSTANCE, context, true, (Function2<? super Coroutines6, ? super Continuation<? super Unit>, ? extends Object>) new C455921(l, byteReadChannelJVM, listener, null)).getChannel();
    }
}
