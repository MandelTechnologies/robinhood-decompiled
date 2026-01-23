package io.ktor.utils.p478io;

import androidx.concurrent.futures.C2031xc40028dd;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equities.companyfinancials.p116ui.CompanyFinancialsSection;
import io.ktor.utils.p478io.core.Buffer;
import io.ktor.utils.p478io.core.BytePacketBuilder;
import io.ktor.utils.p478io.core.ByteReadPacket;
import io.ktor.utils.p478io.core.InputArrays;
import io.ktor.utils.p478io.core.Output2;
import io.ktor.utils.p478io.core.internal.ChunkBuffer;
import io.ktor.utils.p478io.core.internal.Unsafe;
import io.ktor.utils.p478io.internal.AwaitingSlot;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ByteChannelSequential.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00042\u00020\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\r\u0010\u0010J#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u001b\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u000bJ\u000f\u0010\"\u001a\u00020\tH\u0004¢\u0006\u0004\b\"\u0010\u000bJ\u001b\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001b\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020&H\u0096@ø\u0001\u0000¢\u0006\u0004\b(\u0010)J+\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b(\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\t2\u0006\u00101\u001a\u00020\u0017H\u0016¢\u0006\u0004\b2\u0010\u001aJ\u0017\u00103\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0004¢\u0006\u0004\b3\u0010\u001aJ\u001b\u00104\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u001b\u00108\u001a\u00020\u00172\u0006\u00107\u001a\u000206H\u0096@ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u001b\u00108\u001a\u00020\u00172\u0006\u00107\u001a\u00020&H\u0080@ø\u0001\u0000¢\u0006\u0004\b:\u0010)J+\u00108\u001a\u00020\u00172\u0006\u00107\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b8\u0010-J\u0013\u0010=\u001a\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b;\u0010<J\u001b\u0010?\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u0017H\u0084@ø\u0001\u0000¢\u0006\u0004\b?\u0010\u001dJ\u0019\u0010B\u001a\u00020\u00062\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bB\u0010CJ\u0019\u0010D\u001a\u00020\u00062\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bD\u0010CJ\u001f\u0010G\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0004¢\u0006\u0004\bH\u0010\u001aR\u001a\u0010I\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010\bR\u001a\u0010L\u001a\u00020\u000e8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001a\u0010P\u001a\u00020\u00148\u0004X\u0084\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010X\u001a\u00060\u0004j\u0002`W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010Z\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010MR\u0014\u0010[\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\bR$\u0010`\u001a\u00020\u00062\u0006\u0010\\\u001a\u00020\u00068D@DX\u0084\u000e¢\u0006\f\u001a\u0004\b]\u0010\b\"\u0004\b^\u0010_R\u0014\u0010c\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010e\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010bR\u0014\u0010f\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010\bR(\u0010k\u001a\u0004\u0018\u00010@2\b\u0010\\\u001a\u0004\u0018\u00010@8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010j\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006l"}, m3636d2 = {"Lio/ktor/utils/io/ByteChannelSequentialBase;", "Lio/ktor/utils/io/ByteChannel;", "Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/utils/io/ByteWriteChannel;", "", "Lio/ktor/utils/io/HasWriteSession;", "", "flushImpl", "()Z", "", "flushWrittenBytes", "()V", "ensureNotClosed", "ensureNotFailed", "Lio/ktor/utils/io/core/BytePacketBuilder;", "closeable", "(Lio/ktor/utils/io/core/BytePacketBuilder;)V", "builder", "", "limit", "Lio/ktor/utils/io/core/ByteReadPacket;", "readRemainingSuspend", "(Lio/ktor/utils/io/core/BytePacketBuilder;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "count", "addBytesRead", "(I)V", "addBytesWritten", "awaitAtLeastNBytesAvailableForWrite$ktor_io", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitAtLeastNBytesAvailableForWrite", "awaitAtLeastNBytesAvailableForRead$ktor_io", "awaitAtLeastNBytesAvailableForRead", "flush", "prepareFlushedBytes", "packet", "writePacket", "(Lio/ktor/utils/io/core/ByteReadPacket;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/core/Buffer;", "src", "writeFully", "(Lio/ktor/utils/io/core/Buffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "offset", "length", "([BIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/WriterSuspendSession;", "beginWriteSession", "()Lio/ktor/utils/io/WriterSuspendSession;", "written", "endWriteSession", "afterRead", "readRemaining", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "dst", "readAvailable", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAvailable$ktor_io", "awaitInternalAtLeast1$ktor_io", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitInternalAtLeast1", "atLeast", "awaitSuspend", "", "cause", "cancel", "(Ljava/lang/Throwable;)Z", "close", "transferTo$ktor_io", "(Lio/ktor/utils/io/ByteChannelSequentialBase;J)J", "transferTo", "afterWrite", "autoFlush", "Z", "getAutoFlush", "writable", "Lio/ktor/utils/io/core/BytePacketBuilder;", "getWritable", "()Lio/ktor/utils/io/core/BytePacketBuilder;", "readable", "Lio/ktor/utils/io/core/ByteReadPacket;", "getReadable", "()Lio/ktor/utils/io/core/ByteReadPacket;", "Lio/ktor/utils/io/internal/AwaitingSlot;", "slot", "Lio/ktor/utils/io/internal/AwaitingSlot;", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "flushMutex", "Ljava/lang/Object;", "flushBuffer", "isCancelled", "<anonymous parameter 0>", "getClosed", "setClosed", "(Z)V", "closed", "getAvailableForRead", "()I", "availableForRead", "getAvailableForWrite", "availableForWrite", "isClosedForRead", "getClosedCause", "()Ljava/lang/Throwable;", "setClosedCause", "(Ljava/lang/Throwable;)V", "closedCause", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.utils.io.ByteChannelSequentialBase, reason: use source file name */
/* loaded from: classes14.dex */
public abstract class ByteChannelSequential implements ByteChannelCtor, ByteReadChannelJVM, ByteWriteChannel, WriterSession2 {
    private volatile /* synthetic */ int _availableForRead;
    private volatile /* synthetic */ Object _closed;
    private volatile /* synthetic */ Object _lastReadView;
    private volatile /* synthetic */ long _totalBytesRead;
    private volatile /* synthetic */ long _totalBytesWritten;
    private final boolean autoFlush;
    private volatile /* synthetic */ int channelSize;
    private final BytePacketBuilder flushBuffer;
    private final Object flushMutex;
    private volatile /* synthetic */ int lastReadAvailable$delegate;
    private volatile /* synthetic */ Object lastReadView$delegate;
    private final ByteReadPacket readable;
    private final AwaitingSlot slot;
    private final BytePacketBuilder writable;
    private static final /* synthetic */ AtomicLongFieldUpdater _totalBytesRead$FU = AtomicLongFieldUpdater.newUpdater(ByteChannelSequential.class, "_totalBytesRead");
    private static final /* synthetic */ AtomicLongFieldUpdater _totalBytesWritten$FU = AtomicLongFieldUpdater.newUpdater(ByteChannelSequential.class, "_totalBytesWritten");
    private static final /* synthetic */ AtomicIntegerFieldUpdater _availableForRead$FU = AtomicIntegerFieldUpdater.newUpdater(ByteChannelSequential.class, "_availableForRead");
    private static final /* synthetic */ AtomicIntegerFieldUpdater channelSize$FU = AtomicIntegerFieldUpdater.newUpdater(ByteChannelSequential.class, "channelSize");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _closed$FU = AtomicReferenceFieldUpdater.newUpdater(ByteChannelSequential.class, Object.class, "_closed");

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.ByteChannelSequentialBase", m3645f = "ByteChannelSequential.kt", m3646l = {611}, m3647m = "awaitSuspend")
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$awaitSuspend$1 */
    static final class C456271 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C456271(Continuation<? super C456271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequential.this.awaitSuspend(0, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.ByteChannelSequentialBase", m3645f = "ByteChannelSequential.kt", m3646l = {486}, m3647m = "readAvailable$ktor_io")
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readAvailable$2 */
    static final class C456292 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C456292(Continuation<? super C456292> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequential.this.readAvailable$ktor_io(null, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.ByteChannelSequentialBase", m3645f = "ByteChannelSequential.kt", m3646l = {530}, m3647m = "readAvailable$suspendImpl")
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readAvailable$4 */
    static final class C456304 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C456304(Continuation<? super C456304> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequential.readAvailable$suspendImpl(ByteChannelSequential.this, null, 0, 0, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.ByteChannelSequentialBase", m3645f = "ByteChannelSequential.kt", m3646l = {CompanyFinancialsSection.BAR_ANIMATION_DURATION}, m3647m = "readRemainingSuspend")
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readRemainingSuspend$1 */
    static final class C456311 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C456311(Continuation<? super C456311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequential.this.readRemainingSuspend(null, 0L, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.ByteChannelSequentialBase", m3645f = "ByteChannelSequential.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE}, m3647m = "writeFully$suspendImpl")
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$writeFully$1 */
    static final class C456321 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C456321(Continuation<? super C456321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequential.writeFully$suspendImpl(ByteChannelSequential.this, null, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.ByteChannelSequentialBase", m3645f = "ByteChannelSequential.kt", m3646l = {204}, m3647m = "writeFully$suspendImpl")
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$writeFully$2 */
    static final class C456332 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C456332(Continuation<? super C456332> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequential.writeFully$suspendImpl(ByteChannelSequential.this, null, 0, 0, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.ByteChannelSequentialBase", m3645f = "ByteChannelSequential.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE}, m3647m = "writePacket$suspendImpl")
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$writePacket$1 */
    static final class C456341 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C456341(Continuation<? super C456341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequential.writePacket$suspendImpl(ByteChannelSequential.this, null, this);
        }
    }

    @Override // io.ktor.utils.p478io.ByteReadChannelJVM
    public Object readAvailable(ChunkBuffer chunkBuffer, Continuation<? super Integer> continuation) {
        return readAvailable$suspendImpl(this, chunkBuffer, continuation);
    }

    @Override // io.ktor.utils.p478io.ByteReadChannelJVM
    public Object readAvailable(byte[] bArr, int i, int i2, Continuation<? super Integer> continuation) {
        return readAvailable$suspendImpl(this, bArr, i, i2, continuation);
    }

    @Override // io.ktor.utils.p478io.ByteReadChannelJVM
    public Object readRemaining(long j, Continuation<? super ByteReadPacket> continuation) {
        return readRemaining$suspendImpl(this, j, continuation);
    }

    @Override // io.ktor.utils.p478io.ByteWriteChannel
    public Object writeFully(Buffer buffer, Continuation<? super Unit> continuation) {
        return writeFully$suspendImpl(this, buffer, continuation);
    }

    @Override // io.ktor.utils.p478io.ByteWriteChannel
    public Object writeFully(byte[] bArr, int i, int i2, Continuation<? super Unit> continuation) {
        return writeFully$suspendImpl(this, bArr, i, i2, continuation);
    }

    @Override // io.ktor.utils.p478io.ByteWriteChannel
    public Object writePacket(ByteReadPacket byteReadPacket, Continuation<? super Unit> continuation) {
        return writePacket$suspendImpl(this, byteReadPacket, continuation);
    }

    @Override // io.ktor.utils.p478io.ByteWriteChannel
    public boolean getAutoFlush() {
        return this.autoFlush;
    }

    private final boolean isCancelled() {
        CloseElement closeElement = (CloseElement) this._closed;
        return (closeElement != null ? closeElement.getCause() : null) != null;
    }

    protected final boolean getClosed() {
        return this._closed != null;
    }

    protected final BytePacketBuilder getWritable() {
        return this.writable;
    }

    @Override // io.ktor.utils.p478io.ByteReadChannelJVM
    /* renamed from: getAvailableForRead, reason: from getter */
    public int get_availableForRead() {
        return this._availableForRead;
    }

    public int getAvailableForWrite() {
        return Math.max(0, 4088 - this.channelSize);
    }

    @Override // io.ktor.utils.p478io.ByteReadChannelJVM
    public boolean isClosedForRead() {
        if (isCancelled()) {
            return true;
        }
        return getClosed() && this.channelSize == 0;
    }

    @Override // io.ktor.utils.p478io.ByteReadChannelJVM
    public final Throwable getClosedCause() {
        CloseElement closeElement = (CloseElement) this._closed;
        if (closeElement != null) {
            return closeElement.getCause();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitAtLeastNBytesAvailableForWrite$ktor_io(final int i, Continuation<? super Unit> continuation) {
        ByteChannelSequential4 byteChannelSequential4;
        final ByteChannelSequential byteChannelSequential;
        if (continuation instanceof ByteChannelSequential4) {
            byteChannelSequential4 = (ByteChannelSequential4) continuation;
            int i2 = byteChannelSequential4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                byteChannelSequential4.label = i2 - Integer.MIN_VALUE;
            } else {
                byteChannelSequential4 = new ByteChannelSequential4(this, continuation);
            }
        }
        Object obj = byteChannelSequential4.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = byteChannelSequential4.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            byteChannelSequential = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = byteChannelSequential4.I$0;
            byteChannelSequential = (ByteChannelSequential) byteChannelSequential4.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (byteChannelSequential.getAvailableForWrite() < i && !byteChannelSequential.getClosed()) {
            if (!byteChannelSequential.flushImpl()) {
                AwaitingSlot awaitingSlot = byteChannelSequential.slot;
                Function0<Boolean> function0 = new Function0<Boolean>() { // from class: io.ktor.utils.io.ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return Boolean.valueOf(this.this$0.getAvailableForWrite() < i && !this.this$0.getClosed());
                    }
                };
                byteChannelSequential4.L$0 = byteChannelSequential;
                byteChannelSequential4.I$0 = i;
                byteChannelSequential4.label = 1;
                if (awaitingSlot.sleep(function0, byteChannelSequential4) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitAtLeastNBytesAvailableForRead$ktor_io(final int i, Continuation<? super Unit> continuation) {
        ByteChannelSequential2 byteChannelSequential2;
        final ByteChannelSequential byteChannelSequential;
        if (continuation instanceof ByteChannelSequential2) {
            byteChannelSequential2 = (ByteChannelSequential2) continuation;
            int i2 = byteChannelSequential2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                byteChannelSequential2.label = i2 - Integer.MIN_VALUE;
            } else {
                byteChannelSequential2 = new ByteChannelSequential2(this, continuation);
            }
        }
        Object obj = byteChannelSequential2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = byteChannelSequential2.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            byteChannelSequential = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = byteChannelSequential2.I$0;
            byteChannelSequential = (ByteChannelSequential) byteChannelSequential2.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (byteChannelSequential.get_availableForRead() < i && !byteChannelSequential.isClosedForRead()) {
            AwaitingSlot awaitingSlot = byteChannelSequential.slot;
            Function0<Boolean> function0 = new Function0<Boolean>() { // from class: io.ktor.utils.io.ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.valueOf(this.this$0.get_availableForRead() < i && !this.this$0.isClosedForRead());
                }
            };
            byteChannelSequential2.L$0 = byteChannelSequential;
            byteChannelSequential2.I$0 = i;
            byteChannelSequential2.label = 1;
            if (awaitingSlot.sleep(function0, byteChannelSequential2) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // io.ktor.utils.p478io.ByteWriteChannel
    public void flush() {
        flushImpl();
    }

    private final boolean flushImpl() {
        if (this.writable.isEmpty()) {
            this.slot.resume();
            return false;
        }
        flushWrittenBytes();
        this.slot.resume();
        return true;
    }

    private final void flushWrittenBytes() {
        synchronized (this.flushMutex) {
            int size = this.writable.getSize();
            ChunkBuffer chunkBufferStealAll$ktor_io = this.writable.stealAll$ktor_io();
            Intrinsics.checkNotNull(chunkBufferStealAll$ktor_io);
            this.flushBuffer.writeChunkBuffer$ktor_io(chunkBufferStealAll$ktor_io);
            _availableForRead$FU.addAndGet(this, size);
        }
    }

    protected final void prepareFlushedBytes() {
        synchronized (this.flushMutex) {
            Unsafe.unsafeAppend(this.readable, this.flushBuffer);
        }
    }

    private final void ensureNotClosed() throws Throwable {
        if (getClosed()) {
            Throwable closedCause = getClosedCause();
            if (closedCause != null) {
                throw closedCause;
            }
            throw new ByteWriteChannel3("Channel " + this + " is already closed");
        }
    }

    private final void ensureNotFailed() throws Throwable {
        Throwable closedCause = getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
    }

    private final void ensureNotFailed(BytePacketBuilder closeable) throws Throwable {
        Throwable closedCause = getClosedCause();
        if (closedCause == null) {
            return;
        }
        closeable.release();
        throw closedCause;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object writePacket$suspendImpl(ByteChannelSequential byteChannelSequential, ByteReadPacket byteReadPacket, Continuation<? super Unit> continuation) throws Throwable {
        C456341 c456341;
        if (continuation instanceof C456341) {
            c456341 = (C456341) continuation;
            int i = c456341.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c456341.label = i - Integer.MIN_VALUE;
            } else {
                c456341 = byteChannelSequential.new C456341(continuation);
            }
        }
        Object obj = c456341.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c456341.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c456341.L$0 = byteChannelSequential;
            c456341.L$1 = byteReadPacket;
            c456341.label = 1;
            if (byteChannelSequential.awaitAtLeastNBytesAvailableForWrite$ktor_io(1, c456341) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteReadPacket = (ByteReadPacket) c456341.L$1;
            byteChannelSequential = (ByteChannelSequential) c456341.L$0;
            ResultKt.throwOnFailure(obj);
        }
        int remaining = (int) byteReadPacket.getRemaining();
        byteChannelSequential.writable.writePacket(byteReadPacket);
        byteChannelSequential.afterWrite(remaining);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object writeFully$suspendImpl(ByteChannelSequential byteChannelSequential, Buffer buffer, Continuation<? super Unit> continuation) throws Throwable {
        C456321 c456321;
        if (continuation instanceof C456321) {
            c456321 = (C456321) continuation;
            int i = c456321.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c456321.label = i - Integer.MIN_VALUE;
            } else {
                c456321 = byteChannelSequential.new C456321(continuation);
            }
        }
        Object obj = c456321.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c456321.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c456321.L$0 = byteChannelSequential;
            c456321.L$1 = buffer;
            c456321.label = 1;
            if (byteChannelSequential.awaitAtLeastNBytesAvailableForWrite$ktor_io(1, c456321) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            buffer = (Buffer) c456321.L$1;
            byteChannelSequential = (ByteChannelSequential) c456321.L$0;
            ResultKt.throwOnFailure(obj);
        }
        int writePosition = buffer.getWritePosition() - buffer.getReadPosition();
        Output2.writeFully$default(byteChannelSequential.writable, buffer, 0, 2, null);
        byteChannelSequential.afterWrite(writePosition);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0059 -> B:19:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object writeFully$suspendImpl(ByteChannelSequential byteChannelSequential, byte[] bArr, int i, int i2, Continuation<? super Unit> continuation) throws Throwable {
        C456332 c456332;
        ByteChannelSequential byteChannelSequential2;
        int i3;
        int i4;
        byte[] bArr2;
        if (continuation instanceof C456332) {
            c456332 = (C456332) continuation;
            int i5 = c456332.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c456332.label = i5 - Integer.MIN_VALUE;
            } else {
                c456332 = byteChannelSequential.new C456332(continuation);
            }
        }
        Object obj = c456332.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = c456332.label;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            byteChannelSequential2 = byteChannelSequential;
            i3 = i2 + i;
            i4 = i;
            bArr2 = bArr;
            if (i4 < i3) {
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c456332.I$1;
            int i7 = c456332.I$0;
            bArr2 = (byte[]) c456332.L$1;
            ByteChannelSequential byteChannelSequential3 = (ByteChannelSequential) c456332.L$0;
            ResultKt.throwOnFailure(obj);
            i4 = i7;
            byteChannelSequential2 = byteChannelSequential3;
            int iMin = Math.min(byteChannelSequential2.getAvailableForWrite(), i3 - i4);
            Output2.writeFully(byteChannelSequential2.writable, bArr2, i4, iMin);
            i4 += iMin;
            byteChannelSequential2.afterWrite(iMin);
            if (i4 < i3) {
                c456332.L$0 = byteChannelSequential2;
                c456332.L$1 = bArr2;
                c456332.I$0 = i4;
                c456332.I$1 = i3;
                c456332.label = 1;
                if (byteChannelSequential2.awaitAtLeastNBytesAvailableForWrite$ktor_io(1, c456332) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                int iMin2 = Math.min(byteChannelSequential2.getAvailableForWrite(), i3 - i4);
                Output2.writeFully(byteChannelSequential2.writable, bArr2, i4, iMin2);
                i4 += iMin2;
                byteChannelSequential2.afterWrite(iMin2);
                if (i4 < i3) {
                    return Unit.INSTANCE;
                }
            }
        }
    }

    @Override // io.ktor.utils.p478io.WriterSession2
    public WriterSession4 beginWriteSession() {
        return new WriterSession4() { // from class: io.ktor.utils.io.ByteChannelSequentialBase.beginWriteSession.1
            @Override // io.ktor.utils.p478io.WriterSession
            public ChunkBuffer request(int min) {
                if (ByteChannelSequential.this.getAvailableForWrite() == 0) {
                    return null;
                }
                return ByteChannelSequential.this.getWritable().prepareWriteHead(min);
            }

            @Override // io.ktor.utils.p478io.WriterSession4
            public Object tryAwait(int i, Continuation<? super Unit> continuation) {
                if (ByteChannelSequential.this.getAvailableForWrite() < i) {
                    Object objAwaitAtLeastNBytesAvailableForWrite$ktor_io = ByteChannelSequential.this.awaitAtLeastNBytesAvailableForWrite$ktor_io(i, continuation);
                    return objAwaitAtLeastNBytesAvailableForWrite$ktor_io == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitAtLeastNBytesAvailableForWrite$ktor_io : Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        };
    }

    @Override // io.ktor.utils.p478io.WriterSession2
    public void endWriteSession(int written) throws Throwable {
        this.writable.afterHeadWrite();
        afterWrite(written);
    }

    private final void addBytesWritten(int count) {
        if (count >= 0) {
            channelSize$FU.getAndAdd(this, count);
            _totalBytesWritten$FU.addAndGet(this, count);
            if (this.channelSize >= 0) {
                return;
            }
            throw new IllegalStateException(("Readable bytes count is negative: " + this.channelSize + ", " + count + " in " + this).toString());
        }
        throw new IllegalArgumentException(("Can't write negative amount of bytes: " + count).toString());
    }

    private final void addBytesRead(int count) {
        if (count >= 0) {
            int i = -count;
            channelSize$FU.getAndAdd(this, i);
            _totalBytesRead$FU.addAndGet(this, count);
            _availableForRead$FU.getAndAdd(this, i);
            if (this.channelSize < 0) {
                throw new IllegalStateException(("Readable bytes count is negative: " + get_availableForRead() + ", " + count + " in " + this).toString());
            }
            if (get_availableForRead() >= 0) {
                return;
            }
            throw new IllegalStateException(("Readable bytes count is negative: " + get_availableForRead() + ", " + count + " in " + this).toString());
        }
        throw new IllegalArgumentException(("Can't read negative amount of bytes: " + count).toString());
    }

    protected final void afterRead(int count) {
        addBytesRead(count);
        this.slot.resume();
    }

    static /* synthetic */ Object readRemaining$suspendImpl(ByteChannelSequential byteChannelSequential, long j, Continuation<? super ByteReadPacket> continuation) throws Throwable {
        byteChannelSequential.ensureNotFailed();
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        long jMin = Math.min(j, byteChannelSequential.readable.getRemaining());
        bytePacketBuilder.writePacket(byteChannelSequential.readable, jMin);
        byteChannelSequential.afterRead((int) jMin);
        if (j - bytePacketBuilder.getSize() == 0 || byteChannelSequential.isClosedForRead()) {
            byteChannelSequential.ensureNotFailed(bytePacketBuilder);
            return bytePacketBuilder.build();
        }
        return byteChannelSequential.readRemainingSuspend(bytePacketBuilder, j, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readRemainingSuspend(BytePacketBuilder bytePacketBuilder, long j, Continuation<? super ByteReadPacket> continuation) throws Throwable {
        C456311 c456311;
        ByteChannelSequential byteChannelSequential;
        if (continuation instanceof C456311) {
            c456311 = (C456311) continuation;
            int i = c456311.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c456311.label = i - Integer.MIN_VALUE;
            } else {
                c456311 = new C456311(continuation);
            }
        }
        Object obj = c456311.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c456311.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            byteChannelSequential = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = c456311.J$0;
            BytePacketBuilder bytePacketBuilder2 = (BytePacketBuilder) c456311.L$1;
            byteChannelSequential = (ByteChannelSequential) c456311.L$0;
            ResultKt.throwOnFailure(obj);
            bytePacketBuilder = bytePacketBuilder2;
            j = j2;
        }
        while (bytePacketBuilder.getSize() < j) {
            long jMin = Math.min(j - bytePacketBuilder.getSize(), byteChannelSequential.readable.getRemaining());
            bytePacketBuilder.writePacket(byteChannelSequential.readable, jMin);
            byteChannelSequential.afterRead((int) jMin);
            byteChannelSequential.ensureNotFailed(bytePacketBuilder);
            if (byteChannelSequential.isClosedForRead() || bytePacketBuilder.getSize() == ((int) j)) {
                break;
            }
            c456311.L$0 = byteChannelSequential;
            c456311.L$1 = bytePacketBuilder;
            c456311.J$0 = j;
            c456311.label = 1;
            if (byteChannelSequential.awaitSuspend(1, c456311) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        byteChannelSequential.ensureNotFailed(bytePacketBuilder);
        return bytePacketBuilder.build();
    }

    static /* synthetic */ Object readAvailable$suspendImpl(ByteChannelSequential byteChannelSequential, ChunkBuffer chunkBuffer, Continuation<? super Integer> continuation) {
        Intrinsics.checkNotNull(chunkBuffer, "null cannot be cast to non-null type io.ktor.utils.io.core.Buffer");
        return byteChannelSequential.readAvailable$ktor_io(chunkBuffer, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAvailable$ktor_io(Buffer buffer, Continuation<? super Integer> continuation) throws Throwable {
        C456292 c456292;
        ByteChannelSequential byteChannelSequential;
        if (continuation instanceof C456292) {
            c456292 = (C456292) continuation;
            int i = c456292.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c456292.label = i - Integer.MIN_VALUE;
            } else {
                c456292 = new C456292(continuation);
            }
        }
        Object obj = c456292.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c456292.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Throwable closedCause = getClosedCause();
            if (closedCause != null) {
                throw closedCause;
            }
            if (getClosed() && get_availableForRead() == 0) {
                return boxing.boxInt(-1);
            }
            if (buffer.getLimit() - buffer.getWritePosition() == 0) {
                return boxing.boxInt(0);
            }
            if (get_availableForRead() == 0) {
                c456292.L$0 = this;
                c456292.L$1 = buffer;
                c456292.label = 1;
                if (awaitSuspend(1, c456292) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            byteChannelSequential = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            buffer = (Buffer) c456292.L$1;
            byteChannelSequential = (ByteChannelSequential) c456292.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (!byteChannelSequential.readable.canRead()) {
            byteChannelSequential.prepareFlushedBytes();
        }
        int iMin = (int) Math.min(buffer.getLimit() - buffer.getWritePosition(), byteChannelSequential.readable.getRemaining());
        InputArrays.readFully(byteChannelSequential.readable, buffer, iMin);
        byteChannelSequential.afterRead(iMin);
        return boxing.boxInt(iMin);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object readAvailable$suspendImpl(ByteChannelSequential byteChannelSequential, byte[] bArr, int i, int i2, Continuation<? super Integer> continuation) throws Throwable {
        C456304 c456304;
        if (continuation instanceof C456304) {
            c456304 = (C456304) continuation;
            int i3 = c456304.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c456304.label = i3 - Integer.MIN_VALUE;
            } else {
                c456304 = byteChannelSequential.new C456304(continuation);
            }
        }
        Object obj = c456304.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c456304.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            Throwable closedCause = byteChannelSequential.getClosedCause();
            if (closedCause != null) {
                throw closedCause;
            }
            if (byteChannelSequential.getClosed() && byteChannelSequential.get_availableForRead() == 0) {
                return boxing.boxInt(-1);
            }
            if (i2 == 0) {
                return boxing.boxInt(0);
            }
            if (byteChannelSequential.get_availableForRead() == 0) {
                c456304.L$0 = byteChannelSequential;
                c456304.L$1 = bArr;
                c456304.I$0 = i;
                c456304.I$1 = i2;
                c456304.label = 1;
                if (byteChannelSequential.awaitSuspend(1, c456304) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = c456304.I$1;
            i = c456304.I$0;
            bArr = (byte[]) c456304.L$1;
            byteChannelSequential = (ByteChannelSequential) c456304.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (!byteChannelSequential.readable.canRead()) {
            byteChannelSequential.prepareFlushedBytes();
        }
        int iMin = (int) Math.min(i2, byteChannelSequential.readable.getRemaining());
        InputArrays.readFully(byteChannelSequential.readable, bArr, i, iMin);
        byteChannelSequential.afterRead(iMin);
        return boxing.boxInt(iMin);
    }

    public final Object awaitInternalAtLeast1$ktor_io(Continuation<? super Boolean> continuation) {
        if (this.readable.getEndOfInput()) {
            return awaitSuspend(1, continuation);
        }
        return boxing.boxBoolean(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Object awaitSuspend(int i, Continuation<? super Boolean> continuation) throws Throwable {
        C456271 c456271;
        ByteChannelSequential byteChannelSequential;
        if (continuation instanceof C456271) {
            c456271 = (C456271) continuation;
            int i2 = c456271.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c456271.label = i2 - Integer.MIN_VALUE;
            } else {
                c456271 = new C456271(continuation);
            }
        }
        Object obj = c456271.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c456271.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (i < 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            c456271.L$0 = this;
            c456271.I$0 = i;
            c456271.label = 1;
            if (awaitAtLeastNBytesAvailableForRead$ktor_io(i, c456271) == coroutine_suspended) {
                return coroutine_suspended;
            }
            byteChannelSequential = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c456271.I$0;
            byteChannelSequential = (ByteChannelSequential) c456271.L$0;
            ResultKt.throwOnFailure(obj);
        }
        byteChannelSequential.prepareFlushedBytes();
        Throwable closedCause = byteChannelSequential.getClosedCause();
        if (closedCause == null) {
            return boxing.boxBoolean(!byteChannelSequential.isClosedForRead() && byteChannelSequential.get_availableForRead() >= i);
        }
        throw closedCause;
    }

    @Override // io.ktor.utils.p478io.ByteReadChannelJVM
    public boolean cancel(Throwable cause) {
        if (getClosedCause() != null || getClosed()) {
            return false;
        }
        if (cause == null) {
            cause = new CancellationException("Channel cancelled");
        }
        return close(cause);
    }

    @Override // io.ktor.utils.p478io.ByteWriteChannel
    public boolean close(Throwable cause) {
        if (!C2031xc40028dd.m363m(_closed$FU, this, null, cause == null ? CloseElement2.getCLOSED_SUCCESS() : new CloseElement(cause))) {
            return false;
        }
        if (cause != null) {
            this.readable.release();
            this.writable.release();
            this.flushBuffer.release();
        } else {
            flush();
            this.writable.release();
        }
        this.slot.cancel(cause);
        return true;
    }

    public final long transferTo$ktor_io(ByteChannelSequential dst, long limit) throws Throwable {
        Intrinsics.checkNotNullParameter(dst, "dst");
        long remaining = this.readable.getRemaining();
        if (remaining > limit) {
            return 0L;
        }
        dst.writable.writePacket(this.readable);
        int i = (int) remaining;
        dst.afterWrite(i);
        afterRead(i);
        return remaining;
    }

    protected final void afterWrite(int count) throws Throwable {
        addBytesWritten(count);
        if (getClosed()) {
            this.writable.release();
            ensureNotClosed();
        }
        if (getAutoFlush() || getAvailableForWrite() == 0) {
            flush();
        }
    }
}
