package io.ktor.utils.p478io;

import androidx.concurrent.futures.C2031xc40028dd;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import io.ktor.utils.p478io.core.Buffer;
import io.ktor.utils.p478io.core.BufferPrimitivesJvm;
import io.ktor.utils.p478io.core.BufferUtilsJvm;
import io.ktor.utils.p478io.core.ByteBuffers;
import io.ktor.utils.p478io.core.BytePacketBuilder;
import io.ktor.utils.p478io.core.ByteReadPacket;
import io.ktor.utils.p478io.core.Output;
import io.ktor.utils.p478io.core.internal.ChunkBuffer;
import io.ktor.utils.p478io.core.internal.Unsafe;
import io.ktor.utils.p478io.internal.ByteBufferChannelInternals;
import io.ktor.utils.p478io.internal.ByteBufferChannelInternals2;
import io.ktor.utils.p478io.internal.CancellableReusableContinuation;
import io.ktor.utils.p478io.internal.ObjectPool2;
import io.ktor.utils.p478io.internal.ReadSessionImpl;
import io.ktor.utils.p478io.internal.ReadWriteBufferState;
import io.ktor.utils.p478io.internal.RingBufferCapacity;
import io.ktor.utils.p478io.internal.WriteSessionImpl;
import io.ktor.utils.p478io.pool.Pool3;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Job;

/* compiled from: ByteBufferChannel.kt */
@Metadata(m3635d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0010\u0018\u0000 Ý\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00042\u00020\u0005:\u0002Ý\u0001B)\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\u0013*\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u00020\u000b*\u00020\u000f2\u0006\u0010%\u001a\u00020\u000bH\u0002¢\u0006\u0004\b&\u0010'J+\u0010,\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000bH\u0002¢\u0006\u0004\b,\u0010-J'\u0010,\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bH\u0002¢\u0006\u0004\b,\u00101J+\u00102\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u001b\u00102\u001a\u00020\u000b2\u0006\u0010)\u001a\u000204H\u0082@ø\u0001\u0000¢\u0006\u0004\b2\u00105J#\u00109\u001a\u00020\u0013*\u00020\u000f2\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u000bH\u0002¢\u0006\u0004\b9\u0010:J#\u0010;\u001a\u00020\u0013*\u00020\u000f2\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u000bH\u0002¢\u0006\u0004\b;\u0010:J!\u0010>\u001a\u0004\u0018\u00010\u00002\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u001eH\u0002¢\u0006\u0004\b>\u0010?J\u001b\u0010A\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ\u001b\u0010A\u001a\u00020\u00132\u0006\u0010@\u001a\u00020(H\u0082@ø\u0001\u0000¢\u0006\u0004\bA\u0010CJ\u0017\u0010D\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u000fH\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010F\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020(H\u0002¢\u0006\u0004\bF\u0010HJ'\u0010F\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bH\u0002¢\u0006\u0004\bF\u00101J+\u0010A\u001a\u00020\u00132\u0006\u0010@\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\bA\u00103J+\u0010I\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\bI\u00103J\u001b\u0010L\u001a\u00020\u00132\u0006\u0010K\u001a\u00020JH\u0082@ø\u0001\u0000¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010R\u001a\u00020J2\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bR\u0010SJ\u001b\u0010T\u001a\u00020J2\u0006\u0010Q\u001a\u00020PH\u0082@ø\u0001\u0000¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u0013H\u0002¢\u0006\u0004\bV\u0010\u001dJ\u000f\u0010W\u001a\u00020\u0013H\u0002¢\u0006\u0004\bW\u0010\u001dJ\u0019\u0010Z\u001a\u00020\u00132\b\u0010Y\u001a\u0004\u0018\u00010XH\u0002¢\u0006\u0004\bZ\u0010[J\u001b\u0010]\u001a\u00020\u00062\u0006\u0010\\\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b]\u0010^J\u001b\u0010_\u001a\u00020\u00062\u0006\u0010\\\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b_\u0010^J%\u0010b\u001a\u00020\u00042\u0006\u0010\\\u001a\u00020\u000b2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00060`H\u0002¢\u0006\u0004\bb\u0010^J\u001b\u0010c\u001a\u00020\u00062\u0006\u0010\\\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\bc\u0010^J\u000f\u0010d\u001a\u00020\u0006H\u0002¢\u0006\u0004\bd\u0010eJ\u0017\u0010f\u001a\u00020\u00062\u0006\u0010\\\u001a\u00020\u000bH\u0002¢\u0006\u0004\bf\u0010gJ\u001b\u0010I\u001a\u00020\u00132\u0006\u0010\\\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\bI\u0010^J%\u0010j\u001a\u00020\u00132\u0006\u0010\\\u001a\u00020\u000b2\f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00130hH\u0002¢\u0006\u0004\bj\u0010kJ\u000f\u0010l\u001a\u00020\tH\u0002¢\u0006\u0004\bl\u0010mJ\u0017\u0010o\u001a\u00020\u00132\u0006\u0010n\u001a\u00020\tH\u0002¢\u0006\u0004\bo\u0010pJ\u000f\u0010t\u001a\u00020qH\u0000¢\u0006\u0004\br\u0010sJ\u0011\u0010w\u001a\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0004\bu\u0010vJ\u0017\u0010z\u001a\u00020\u00132\u0006\u0010y\u001a\u00020xH\u0017¢\u0006\u0004\bz\u0010{J\u0019\u0010|\u001a\u00020\u00062\b\u0010Y\u001a\u0004\u0018\u00010XH\u0016¢\u0006\u0004\b|\u0010}J\u0019\u0010~\u001a\u00020\u00062\b\u0010Y\u001a\u0004\u0018\u00010XH\u0016¢\u0006\u0004\b~\u0010}J\u000f\u0010\u007f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u007f\u0010\u001dJ#\u0010\u0083\u0001\u001a\u00020\u00132\u0006\u0010n\u001a\u00020\u000f2\u0007\u0010\u0080\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0013\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0005\b\u0084\u0001\u0010\u001bJ\u0011\u0010\u0087\u0001\u001a\u00020\u0013H\u0000¢\u0006\u0005\b\u0086\u0001\u0010\u001dJ\u0011\u0010\u0089\u0001\u001a\u00020\u0006H\u0000¢\u0006\u0005\b\u0088\u0001\u0010eJ-\u0010\u008a\u0001\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0005\b\u008a\u0001\u00103J\u001d\u0010\u008a\u0001\u001a\u00020\u000b2\u0006\u0010)\u001a\u000204H\u0096@ø\u0001\u0000¢\u0006\u0005\b\u008a\u0001\u00105J)\u0010\u008c\u0001\u001a\u00020\u00132\u0006\u0010n\u001a\u00020\u000f2\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u000bH\u0000¢\u0006\u0005\b\u008b\u0001\u0010:J\u0012\u0010\u008f\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001d\u0010\u0090\u0001\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0005\b\u0090\u0001\u0010BJ\u001d\u0010\u0090\u0001\u001a\u00020\u00132\u0006\u0010@\u001a\u00020(H\u0096@ø\u0001\u0000¢\u0006\u0005\b\u0090\u0001\u0010CJ0\u0010\u0093\u0001\u001a\u00020P2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020P2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0080@ø\u0001\u0000¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J-\u0010\u0090\u0001\u001a\u00020\u00132\u0006\u0010@\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0005\b\u0090\u0001\u00103J-\u0010\u0094\u0001\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0005\b\u0094\u0001\u00103J\u0015\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u0001H\u0016¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001a\u0010\u0099\u0001\u001a\u00020\u00132\u0007\u0010\u0098\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u0099\u0001\u0010\u0015J\u001d\u0010\u009a\u0001\u001a\u00020\u00132\u0006\u0010K\u001a\u00020JH\u0096@ø\u0001\u0000¢\u0006\u0005\b\u009a\u0001\u0010MJ\u001d\u0010\u009b\u0001\u001a\u00020J2\u0006\u0010Q\u001a\u00020PH\u0096@ø\u0001\u0000¢\u0006\u0005\b\u009b\u0001\u0010UJ\u001d\u0010\u009d\u0001\u001a\u00020\u00132\u0006\u0010\\\u001a\u00020\u000bH\u0080@ø\u0001\u0000¢\u0006\u0005\b\u009c\u0001\u0010^J\u0013\u0010\u009f\u0001\u001a\u00030\u009e\u0001H\u0016¢\u0006\u0006\b\u009f\u0001\u0010 \u0001R\u001c\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0007\u0010¡\u0001\u001a\u0005\b¢\u0001\u0010eR\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010£\u0001R\u001d\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\f\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0019\u0010=\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b=\u0010§\u0001R\u0019\u0010¨\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010¤\u0001R\u0019\u0010©\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010¤\u0001R\u001b\u0010ª\u0001\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R2\u0010\u00ad\u0001\u001a\u00020P2\u0007\u0010¬\u0001\u001a\u00020P8\u0016@PX\u0096\u000e¢\u0006\u0018\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R2\u0010³\u0001\u001a\u00020P2\u0007\u0010¬\u0001\u001a\u00020P8\u0016@PX\u0096\u000e¢\u0006\u0018\n\u0006\b³\u0001\u0010®\u0001\u001a\u0006\b´\u0001\u0010°\u0001\"\u0006\bµ\u0001\u0010²\u0001R\u001f\u0010·\u0001\u001a\u00030¶\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b·\u0001\u0010¸\u0001\u0012\u0005\b¹\u0001\u0010\u001dR\u0018\u0010»\u0001\u001a\u00030º\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R\u001e\u0010¾\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u001e\u0010À\u0001\u001a\t\u0012\u0004\u0012\u00020\u00130½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010¿\u0001R\u0019\u0010Á\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010¤\u0001R*\u0010Ã\u0001\u001a\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130`\u0012\u0004\u0012\u00020\u00040Â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u0016\u0010Æ\u0001\u001a\u00020q8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÅ\u0001\u0010sR0\u0010Í\u0001\u001a\u0005\u0018\u00010Ç\u00012\n\u0010È\u0001\u001a\u0005\u0018\u00010Ç\u00018B@BX\u0082\u000e¢\u0006\u0010\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R:\u0010Ò\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010`2\u000f\u0010È\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010`8B@BX\u0082\u000e¢\u0006\u0010\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R:\u0010Õ\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010`2\u000f\u0010È\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010`8B@BX\u0082\u000e¢\u0006\u0010\u001a\u0006\bÓ\u0001\u0010Ï\u0001\"\u0006\bÔ\u0001\u0010Ñ\u0001R\u0017\u0010×\u0001\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÖ\u0001\u0010¦\u0001R\u0016\u0010Ø\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bØ\u0001\u0010eR\u0016\u0010Ù\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÙ\u0001\u0010eR\u0019\u0010Ü\u0001\u001a\u0004\u0018\u00010X8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÚ\u0001\u0010Û\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Þ\u0001"}, m3636d2 = {"Lio/ktor/utils/io/ByteBufferChannel;", "Lio/ktor/utils/io/ByteChannel;", "Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/utils/io/ByteWriteChannel;", "", "Lio/ktor/utils/io/HasWriteSession;", "", "autoFlush", "Lio/ktor/utils/io/pool/ObjectPool;", "Lio/ktor/utils/io/internal/ReadWriteBufferState$Initial;", "pool", "", "reservedSize", "<init>", "(ZLio/ktor/utils/io/pool/ObjectPool;I)V", "Ljava/nio/ByteBuffer;", "content", "(Ljava/nio/ByteBuffer;)V", "minWriteSize", "", "flushImpl", "(I)V", "position", "available", "prepareBuffer", "(Ljava/nio/ByteBuffer;II)V", "setupStateForRead", "()Ljava/nio/ByteBuffer;", "restoreStateAfterRead", "()V", "Lio/ktor/utils/io/internal/JoiningState;", "joined", "tryCompleteJoining", "(Lio/ktor/utils/io/internal/JoiningState;)Z", "forceTermination", "tryReleaseBuffer", "(Z)Z", "idx", "carryIndex", "(Ljava/nio/ByteBuffer;I)I", "Lio/ktor/utils/io/core/Buffer;", "dst", "consumed", AnalyticsStrings.MAX_WELCOME_TAG, "readAsMuchAsPossible", "(Lio/ktor/utils/io/core/Buffer;II)I", "", "offset", "length", "([BII)I", "readAvailableSuspend", "([BIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/internal/RingBufferCapacity;", "capacity", "count", "bytesWritten", "(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/internal/RingBufferCapacity;I)V", "bytesRead", "current", "joining", "resolveDelegation", "(Lio/ktor/utils/io/ByteBufferChannel;Lio/ktor/utils/io/internal/JoiningState;)Lio/ktor/utils/io/ByteBufferChannel;", "src", "writeFullySuspend", "(Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lio/ktor/utils/io/core/Buffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ensureClosedJoined", "(Lio/ktor/utils/io/internal/JoiningState;)V", "writeAsMuchAsPossible", "(Ljava/nio/ByteBuffer;)I", "(Lio/ktor/utils/io/core/Buffer;)I", "writeSuspend", "Lio/ktor/utils/io/core/ByteReadPacket;", "packet", "writePacketSuspend", "(Lio/ktor/utils/io/core/ByteReadPacket;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryWritePacketPart", "(Lio/ktor/utils/io/core/ByteReadPacket;)I", "", "limit", "remainingPacket", "(J)Lio/ktor/utils/io/core/ByteReadPacket;", "readRemainingSuspend", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resumeReadOp", "resumeWriteOp", "", "cause", "resumeClosed", "(Ljava/lang/Throwable;)V", "size", "readSuspend", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readSuspendLoop", "Lkotlin/coroutines/Continuation;", "continuation", "suspensionForSize", "readSuspendImpl", "shouldResumeReadOp", "()Z", "writeSuspendPredicate", "(I)Z", "Lkotlinx/coroutines/CancellableContinuation;", "c", "writeSuspendBlock", "(ILkotlinx/coroutines/CancellableContinuation;)V", "newBuffer", "()Lio/ktor/utils/io/internal/ReadWriteBufferState$Initial;", "buffer", "releaseBuffer", "(Lio/ktor/utils/io/internal/ReadWriteBufferState$Initial;)V", "Lio/ktor/utils/io/internal/ReadWriteBufferState;", "currentState$ktor_io", "()Lio/ktor/utils/io/internal/ReadWriteBufferState;", "currentState", "getJoining$ktor_io", "()Lio/ktor/utils/io/internal/JoiningState;", "getJoining", "Lkotlinx/coroutines/Job;", "job", "attachJob", "(Lkotlinx/coroutines/Job;)V", "close", "(Ljava/lang/Throwable;)Z", "cancel", "flush", "lockedSpace", "prepareWriteBuffer$ktor_io", "(Ljava/nio/ByteBuffer;I)V", "prepareWriteBuffer", "setupStateForWrite$ktor_io", "setupStateForWrite", "restoreStateAfterWrite$ktor_io", "restoreStateAfterWrite", "tryTerminate$ktor_io", "tryTerminate", "readAvailable", "bytesWrittenFromSession$ktor_io", "bytesWrittenFromSession", "resolveChannelInstance$ktor_io", "()Lio/ktor/utils/io/ByteBufferChannel;", "resolveChannelInstance", "writeFully", "copyDirect$ktor_io", "(Lio/ktor/utils/io/ByteBufferChannel;JLio/ktor/utils/io/internal/JoiningState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copyDirect", "writeAvailable", "Lio/ktor/utils/io/WriterSuspendSession;", "beginWriteSession", "()Lio/ktor/utils/io/WriterSuspendSession;", "written", "endWriteSession", "writePacket", "readRemaining", "tryWriteSuspend$ktor_io", "tryWriteSuspend", "", "toString", "()Ljava/lang/String;", "Z", "getAutoFlush", "Lio/ktor/utils/io/pool/ObjectPool;", "I", "getReservedSize$ktor_io", "()I", "Lio/ktor/utils/io/internal/JoiningState;", "readPosition", "writePosition", "attachedJob", "Lkotlinx/coroutines/Job;", "<set-?>", "totalBytesRead", "J", "getTotalBytesRead", "()J", "setTotalBytesRead$ktor_io", "(J)V", "totalBytesWritten", "getTotalBytesWritten", "setTotalBytesWritten$ktor_io", "Lio/ktor/utils/io/internal/ReadSessionImpl;", "readSession", "Lio/ktor/utils/io/internal/ReadSessionImpl;", "getReadSession$annotations", "Lio/ktor/utils/io/internal/WriteSessionImpl;", "writeSession", "Lio/ktor/utils/io/internal/WriteSessionImpl;", "Lio/ktor/utils/io/internal/CancellableReusableContinuation;", "readSuspendContinuationCache", "Lio/ktor/utils/io/internal/CancellableReusableContinuation;", "writeSuspendContinuationCache", "writeSuspensionSize", "Lkotlin/Function1;", "writeSuspension", "Lkotlin/jvm/functions/Function1;", "getState", "state", "Lio/ktor/utils/io/internal/ClosedElement;", "value", "getClosed", "()Lio/ktor/utils/io/internal/ClosedElement;", "setClosed", "(Lio/ktor/utils/io/internal/ClosedElement;)V", "closed", "getReadOp", "()Lkotlin/coroutines/Continuation;", "setReadOp", "(Lkotlin/coroutines/Continuation;)V", "readOp", "getWriteOp", "setWriteOp", "writeOp", "getAvailableForRead", "availableForRead", "isClosedForRead", "isClosedForWrite", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "Companion", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public class ByteBufferChannel implements ByteChannelCtor, ByteReadChannelJVM, ByteWriteChannel, WriterSession2 {
    private volatile /* synthetic */ Object _closed;
    private volatile /* synthetic */ Object _readOp;
    private volatile /* synthetic */ Object _state;
    volatile /* synthetic */ Object _writeOp;
    private volatile Job attachedJob;
    private final boolean autoFlush;
    private volatile ByteBufferChannelInternals2 joining;
    private final Pool3<ReadWriteBufferState.Initial> pool;
    private int readPosition;
    private final ReadSessionImpl readSession;
    private final CancellableReusableContinuation<Boolean> readSuspendContinuationCache;
    private final int reservedSize;
    private volatile long totalBytesRead;
    private volatile long totalBytesWritten;
    private int writePosition;
    private final WriteSessionImpl writeSession;
    private final CancellableReusableContinuation<Unit> writeSuspendContinuationCache;
    private final Function1<Continuation<? super Unit>, Object> writeSuspension;
    private volatile int writeSuspensionSize;
    private static final /* synthetic */ AtomicReferenceFieldUpdater _state$FU = AtomicReferenceFieldUpdater.newUpdater(ByteBufferChannel.class, Object.class, "_state");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _closed$FU = AtomicReferenceFieldUpdater.newUpdater(ByteBufferChannel.class, Object.class, "_closed");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _readOp$FU = AtomicReferenceFieldUpdater.newUpdater(ByteBufferChannel.class, Object.class, "_readOp");
    static final /* synthetic */ AtomicReferenceFieldUpdater _writeOp$FU = AtomicReferenceFieldUpdater.newUpdater(ByteBufferChannel.class, Object.class, "_writeOp");

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.ByteBufferChannel", m3645f = "ByteBufferChannel.kt", m3646l = {729, 733}, m3647m = "readAvailableSuspend")
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readAvailableSuspend$1 */
    static final class C456151 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C456151(Continuation<? super C456151> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readAvailableSuspend(null, 0, 0, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.ByteBufferChannel", m3645f = "ByteBufferChannel.kt", m3646l = {745, 749}, m3647m = "readAvailableSuspend")
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readAvailableSuspend$3 */
    static final class C456163 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C456163(Continuation<? super C456163> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readAvailableSuspend(null, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.ByteBufferChannel", m3645f = "ByteBufferChannel.kt", m3646l = {2093}, m3647m = "readRemainingSuspend")
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readRemainingSuspend$1 */
    static final class C456171 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C456171(Continuation<? super C456171> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readRemainingSuspend(0L, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.ByteBufferChannel", m3645f = "ByteBufferChannel.kt", m3646l = {2236}, m3647m = "readSuspendImpl")
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readSuspendImpl$1 */
    static final class C456181 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C456181(Continuation<? super C456181> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readSuspendImpl(0, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.ByteBufferChannel", m3645f = "ByteBufferChannel.kt", m3646l = {2189}, m3647m = "readSuspendLoop")
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readSuspendLoop$1 */
    static final class C456191 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C456191(Continuation<? super C456191> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readSuspendLoop(0, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.ByteBufferChannel", m3645f = "ByteBufferChannel.kt", m3646l = {1113, 1115}, m3647m = "writeFullySuspend")
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$1 */
    static final class C456201 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C456201(Continuation<? super C456201> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.writeFullySuspend((ByteBuffer) null, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.ByteBufferChannel", m3645f = "ByteBufferChannel.kt", m3646l = {1123, 1125}, m3647m = "writeFullySuspend")
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$3 */
    static final class C456213 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C456213(Continuation<? super C456213> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.writeFullySuspend((Buffer) null, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.ByteBufferChannel", m3645f = "ByteBufferChannel.kt", m3646l = {1422}, m3647m = "writeFullySuspend")
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$5 */
    static final class C456225 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C456225(Continuation<? super C456225> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.writeFullySuspend(null, 0, 0, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.ByteBufferChannel", m3645f = "ByteBufferChannel.kt", m3646l = {1742, 1744}, m3647m = "writePacketSuspend")
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writePacketSuspend$1 */
    static final class C456231 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C456231(Continuation<? super C456231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.writePacketSuspend(null, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.ByteBufferChannel", m3645f = "ByteBufferChannel.kt", m3646l = {1439, 1441}, m3647m = "writeSuspend")
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeSuspend$1 */
    static final class C456241 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C456241(Continuation<? super C456241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.writeSuspend(null, 0, 0, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.utils.io.ByteBufferChannel", m3645f = "ByteBufferChannel.kt", m3646l = {2412}, m3647m = "writeSuspend")
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeSuspend$3 */
    static final class C456253 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C456253(Continuation<? super C456253> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.writeSuspend(0, this);
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

    public Object writeAvailable(byte[] bArr, int i, int i2, Continuation<? super Integer> continuation) {
        return writeAvailable$suspendImpl(this, bArr, i, i2, continuation);
    }

    @Override // io.ktor.utils.p478io.ByteWriteChannel
    public Object writeFully(Buffer buffer, Continuation<? super Unit> continuation) {
        return writeFully$suspendImpl(this, buffer, continuation);
    }

    @Override // io.ktor.utils.p478io.ByteWriteChannel
    public Object writeFully(ByteBuffer byteBuffer, Continuation<? super Unit> continuation) {
        return writeFully$suspendImpl(this, byteBuffer, continuation);
    }

    @Override // io.ktor.utils.p478io.ByteWriteChannel
    public Object writeFully(byte[] bArr, int i, int i2, Continuation<? super Unit> continuation) {
        return writeFully$suspendImpl(this, bArr, i, i2, continuation);
    }

    @Override // io.ktor.utils.p478io.ByteWriteChannel
    public Object writePacket(ByteReadPacket byteReadPacket, Continuation<? super Unit> continuation) {
        return writePacket$suspendImpl(this, byteReadPacket, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ByteReadPacket remainingPacket(long limit) {
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, 0 == true ? 1 : 0);
        try {
            ChunkBuffer chunkBufferPrepareWriteHead = Unsafe.prepareWriteHead(bytePacketBuilder, 1, null);
            while (true) {
                try {
                    if (chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition() > limit) {
                        chunkBufferPrepareWriteHead.resetForWrite((int) limit);
                    }
                    limit -= readAsMuchAsPossible$default(this, chunkBufferPrepareWriteHead, 0, 0, 6, null);
                    if (limit <= 0 || isClosedForRead()) {
                        break;
                    }
                    chunkBufferPrepareWriteHead = Unsafe.prepareWriteHead(bytePacketBuilder, 1, chunkBufferPrepareWriteHead);
                } catch (Throwable th) {
                    bytePacketBuilder.afterHeadWrite();
                    throw th;
                }
            }
            bytePacketBuilder.afterHeadWrite();
            return bytePacketBuilder.build();
        } catch (Throwable th2) {
            bytePacketBuilder.release();
            throw th2;
        }
    }

    public ByteBufferChannel(boolean z, Pool3<ReadWriteBufferState.Initial> pool, int i) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.autoFlush = z;
        this.pool = pool;
        this.reservedSize = i;
        this._state = ReadWriteBufferState.IdleEmpty.INSTANCE;
        this._closed = null;
        this._readOp = null;
        this._writeOp = null;
        this.readSession = new ReadSessionImpl(this);
        this.writeSession = new WriteSessionImpl(this);
        this.readSuspendContinuationCache = new CancellableReusableContinuation<>();
        this.writeSuspendContinuationCache = new CancellableReusableContinuation<>();
        this.writeSuspension = new Function1<Continuation<? super Unit>, Object>() { // from class: io.ktor.utils.io.ByteBufferChannel$writeSuspension$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Unit> ucont) throws Throwable {
                Throwable sendException;
                Intrinsics.checkNotNullParameter(ucont, "ucont");
                int i2 = this.this$0.writeSuspensionSize;
                while (true) {
                    ByteBufferChannelInternals closed = this.this$0.getClosed();
                    if (closed != null && (sendException = closed.getSendException()) != null) {
                        ByteBufferChannel4.rethrowClosed(sendException);
                        throw new ExceptionsH();
                    }
                    if (!this.this$0.writeSuspendPredicate(i2)) {
                        Result.Companion companion = Result.INSTANCE;
                        ucont.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
                        break;
                    }
                    ByteBufferChannel byteBufferChannel = this.this$0;
                    Continuation continuationIntercepted = IntrinsicsKt.intercepted(ucont);
                    ByteBufferChannel byteBufferChannel2 = this.this$0;
                    while (byteBufferChannel.getWriteOp() == null) {
                        if (!byteBufferChannel2.writeSuspendPredicate(i2)) {
                            break;
                        }
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ByteBufferChannel._writeOp$FU;
                        if (C2031xc40028dd.m363m(atomicReferenceFieldUpdater, byteBufferChannel, null, continuationIntercepted)) {
                            if (byteBufferChannel2.writeSuspendPredicate(i2) || !C2031xc40028dd.m363m(atomicReferenceFieldUpdater, byteBufferChannel, continuationIntercepted, null)) {
                                break;
                            }
                        }
                    }
                    throw new IllegalStateException("Operation is already in progress");
                }
                this.this$0.flushImpl(i2);
                if (this.this$0.shouldResumeReadOp()) {
                    this.this$0.resumeReadOp();
                }
                return IntrinsicsKt.getCOROUTINE_SUSPENDED();
            }
        };
    }

    @Override // io.ktor.utils.p478io.ByteWriteChannel
    public boolean getAutoFlush() {
        return this.autoFlush;
    }

    public /* synthetic */ ByteBufferChannel(boolean z, Pool3 pool3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i2 & 2) != 0 ? ObjectPool2.getBufferObjectPool() : pool3, (i2 & 4) != 0 ? 8 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ByteBufferChannel(ByteBuffer content) {
        this(false, ObjectPool2.getBufferObjectNoPool(), 0);
        Intrinsics.checkNotNullParameter(content, "content");
        ByteBuffer byteBufferSlice = content.slice();
        Intrinsics.checkNotNullExpressionValue(byteBufferSlice, "content.slice()");
        ReadWriteBufferState.Initial initial = new ReadWriteBufferState.Initial(byteBufferSlice, 0);
        initial.capacity.resetForRead();
        this._state = initial.startWriting$ktor_io();
        restoreStateAfterWrite$ktor_io();
        ByteWriteChannel2.close(this);
        tryTerminate$ktor_io();
    }

    private final ReadWriteBufferState getState() {
        return (ReadWriteBufferState) this._state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ByteBufferChannelInternals getClosed() {
        return (ByteBufferChannelInternals) this._closed;
    }

    private final Continuation<Boolean> getReadOp() {
        return (Continuation) this._readOp;
    }

    private final void setReadOp(Continuation<? super Boolean> continuation) {
        this._readOp = continuation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Continuation<Unit> getWriteOp() {
        return (Continuation) this._writeOp;
    }

    static /* synthetic */ int readAsMuchAsPossible$default(ByteBufferChannel byteBufferChannel, Buffer buffer, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readAsMuchAsPossible");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = buffer.getLimit() - buffer.getWritePosition();
        }
        return byteBufferChannel.readAsMuchAsPossible(buffer, i, i2);
    }

    public final ReadWriteBufferState currentState$ktor_io() {
        return getState();
    }

    /* renamed from: getJoining$ktor_io, reason: from getter */
    public final ByteBufferChannelInternals2 getJoining() {
        return this.joining;
    }

    @Override // io.ktor.utils.p478io.ByteChannelCtor
    @Deprecated
    public void attachJob(Job job) {
        Intrinsics.checkNotNullParameter(job, "job");
        Job job2 = this.attachedJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, null, 1, null);
        }
        this.attachedJob = job;
        Job.DefaultImpls.invokeOnCompletion$default(job, true, false, new Function1<Throwable, Unit>() { // from class: io.ktor.utils.io.ByteBufferChannel.attachJob.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                ByteBufferChannel.this.attachedJob = null;
                if (th == null) {
                    return;
                }
                ByteBufferChannel.this.cancel(ExceptionUtils4.unwrapCancellationException(th));
            }
        }, 2, null);
    }

    @Override // io.ktor.utils.p478io.ByteReadChannelJVM
    /* renamed from: getAvailableForRead */
    public int get_availableForRead() {
        return getState().capacity._availableForRead$internal;
    }

    @Override // io.ktor.utils.p478io.ByteReadChannelJVM
    public boolean isClosedForRead() {
        return getState() == ReadWriteBufferState.Terminated.INSTANCE && getClosed() != null;
    }

    public boolean isClosedForWrite() {
        return getClosed() != null;
    }

    public long getTotalBytesRead() {
        return this.totalBytesRead;
    }

    public void setTotalBytesRead$ktor_io(long j) {
        this.totalBytesRead = j;
    }

    public long getTotalBytesWritten() {
        return this.totalBytesWritten;
    }

    public void setTotalBytesWritten$ktor_io(long j) {
        this.totalBytesWritten = j;
    }

    @Override // io.ktor.utils.p478io.ByteReadChannelJVM
    public Throwable getClosedCause() {
        ByteBufferChannelInternals closed = getClosed();
        if (closed != null) {
            return closed.getCause();
        }
        return null;
    }

    @Override // io.ktor.utils.p478io.ByteWriteChannel
    public boolean close(Throwable cause) {
        ByteBufferChannelInternals byteBufferChannelInternals;
        ByteBufferChannelInternals2 byteBufferChannelInternals2;
        if (getClosed() != null) {
            return false;
        }
        if (cause == null) {
            byteBufferChannelInternals = ByteBufferChannelInternals.INSTANCE.getEmptyCause();
        } else {
            byteBufferChannelInternals = new ByteBufferChannelInternals(cause);
        }
        getState().capacity.flush();
        if (!C2031xc40028dd.m363m(_closed$FU, this, null, byteBufferChannelInternals)) {
            return false;
        }
        getState().capacity.flush();
        if (getState().capacity.isEmpty() || cause != null) {
            tryTerminate$ktor_io();
        }
        resumeClosed(cause);
        if (getState() == ReadWriteBufferState.Terminated.INSTANCE && (byteBufferChannelInternals2 = this.joining) != null) {
            ensureClosedJoined(byteBufferChannelInternals2);
        }
        if (cause != null) {
            Job job = this.attachedJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
            this.readSuspendContinuationCache.close(cause);
            this.writeSuspendContinuationCache.close(cause);
            return true;
        }
        this.writeSuspendContinuationCache.close(new ByteWriteChannel3("Byte channel was closed"));
        this.readSuspendContinuationCache.close((CancellableReusableContinuation<Boolean>) Boolean.valueOf(getState().capacity.flush()));
        return true;
    }

    @Override // io.ktor.utils.p478io.ByteReadChannelJVM
    public boolean cancel(Throwable cause) {
        if (cause == null) {
            cause = new CancellationException("Channel has been cancelled");
        }
        return close(cause);
    }

    private final boolean tryReleaseBuffer(boolean forceTermination) {
        Object obj;
        ReadWriteBufferState.Terminated terminated;
        ReadWriteBufferState.Initial initial = null;
        do {
            obj = this._state;
            ReadWriteBufferState readWriteBufferState = (ReadWriteBufferState) obj;
            ByteBufferChannelInternals closed = getClosed();
            if (initial != null) {
                if ((closed != null ? closed.getCause() : null) == null) {
                    initial.capacity.resetForWrite();
                }
                resumeWriteOp();
                initial = null;
            }
            terminated = ReadWriteBufferState.Terminated.INSTANCE;
            if (readWriteBufferState == terminated) {
                return true;
            }
            if (readWriteBufferState != ReadWriteBufferState.IdleEmpty.INSTANCE) {
                if (closed != null && (readWriteBufferState instanceof ReadWriteBufferState.IdleNonEmpty) && (readWriteBufferState.capacity.tryLockForRelease() || closed.getCause() != null)) {
                    if (closed.getCause() != null) {
                        readWriteBufferState.capacity.forceLockForRelease();
                    }
                    initial = ((ReadWriteBufferState.IdleNonEmpty) readWriteBufferState).getInitial();
                } else {
                    if (!forceTermination || !(readWriteBufferState instanceof ReadWriteBufferState.IdleNonEmpty) || !readWriteBufferState.capacity.tryLockForRelease()) {
                        return false;
                    }
                    initial = ((ReadWriteBufferState.IdleNonEmpty) readWriteBufferState).getInitial();
                }
            }
        } while (!C2031xc40028dd.m363m(_state$FU, this, obj, terminated));
        if (initial != null && getState() == terminated) {
            releaseBuffer(initial);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void flushImpl(int minWriteSize) {
        ReadWriteBufferState state;
        ReadWriteBufferState.Terminated terminated;
        ByteBufferChannel delegatedTo;
        ByteBufferChannelInternals2 byteBufferChannelInternals2 = this.joining;
        if (byteBufferChannelInternals2 != null && (delegatedTo = byteBufferChannelInternals2.getDelegatedTo()) != null) {
            delegatedTo.flush();
        }
        do {
            state = getState();
            terminated = ReadWriteBufferState.Terminated.INSTANCE;
            if (state == terminated) {
                return;
            } else {
                state.capacity.flush();
            }
        } while (state != getState());
        int i = state.capacity._availableForWrite$internal;
        if (state.capacity._availableForRead$internal >= 1) {
            resumeReadOp();
        }
        ByteBufferChannelInternals2 byteBufferChannelInternals22 = this.joining;
        if (i >= minWriteSize) {
            if (byteBufferChannelInternals22 == null || getState() == terminated) {
                resumeWriteOp();
            }
        }
    }

    private final void restoreStateAfterRead() {
        Object obj;
        ReadWriteBufferState readWriteBufferStateStopReading$ktor_io;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ReadWriteBufferState readWriteBufferState = null;
        do {
            obj = this._state;
            ReadWriteBufferState readWriteBufferState2 = (ReadWriteBufferState) obj;
            ReadWriteBufferState.IdleNonEmpty idleNonEmpty = (ReadWriteBufferState.IdleNonEmpty) readWriteBufferState;
            if (idleNonEmpty != null) {
                idleNonEmpty.capacity.resetForWrite();
                resumeWriteOp();
                readWriteBufferState = null;
            }
            readWriteBufferStateStopReading$ktor_io = readWriteBufferState2.stopReading$ktor_io();
            if ((readWriteBufferStateStopReading$ktor_io instanceof ReadWriteBufferState.IdleNonEmpty) && getState() == readWriteBufferState2 && readWriteBufferStateStopReading$ktor_io.capacity.tryLockForRelease()) {
                readWriteBufferStateStopReading$ktor_io = ReadWriteBufferState.IdleEmpty.INSTANCE;
                readWriteBufferState = readWriteBufferStateStopReading$ktor_io;
            }
            atomicReferenceFieldUpdater = _state$FU;
        } while (!C2031xc40028dd.m363m(atomicReferenceFieldUpdater, this, obj, readWriteBufferStateStopReading$ktor_io));
        ReadWriteBufferState.IdleEmpty idleEmpty = ReadWriteBufferState.IdleEmpty.INSTANCE;
        if (readWriteBufferStateStopReading$ktor_io == idleEmpty) {
            ReadWriteBufferState.IdleNonEmpty idleNonEmpty2 = (ReadWriteBufferState.IdleNonEmpty) readWriteBufferState;
            if (idleNonEmpty2 != null) {
                releaseBuffer(idleNonEmpty2.getInitial());
            }
            resumeWriteOp();
            return;
        }
        if ((readWriteBufferStateStopReading$ktor_io instanceof ReadWriteBufferState.IdleNonEmpty) && readWriteBufferStateStopReading$ktor_io.capacity.isEmpty() && readWriteBufferStateStopReading$ktor_io.capacity.tryLockForRelease() && C2031xc40028dd.m363m(atomicReferenceFieldUpdater, this, readWriteBufferStateStopReading$ktor_io, idleEmpty)) {
            readWriteBufferStateStopReading$ktor_io.capacity.resetForWrite();
            releaseBuffer(((ReadWriteBufferState.IdleNonEmpty) readWriteBufferStateStopReading$ktor_io).getInitial());
            resumeWriteOp();
        }
    }

    private final ByteBuffer setupStateForRead() throws Throwable {
        Object obj;
        Throwable cause;
        ReadWriteBufferState readWriteBufferStateStartReading$ktor_io;
        Throwable cause2;
        do {
            obj = this._state;
            ReadWriteBufferState readWriteBufferState = (ReadWriteBufferState) obj;
            if (Intrinsics.areEqual(readWriteBufferState, ReadWriteBufferState.Terminated.INSTANCE) ? true : Intrinsics.areEqual(readWriteBufferState, ReadWriteBufferState.IdleEmpty.INSTANCE)) {
                ByteBufferChannelInternals closed = getClosed();
                if (closed == null || (cause = closed.getCause()) == null) {
                    return null;
                }
                ByteBufferChannel4.rethrowClosed(cause);
                throw new ExceptionsH();
            }
            ByteBufferChannelInternals closed2 = getClosed();
            if (closed2 != null && (cause2 = closed2.getCause()) != null) {
                ByteBufferChannel4.rethrowClosed(cause2);
                throw new ExceptionsH();
            }
            if (readWriteBufferState.capacity._availableForRead$internal == 0) {
                return null;
            }
            readWriteBufferStateStartReading$ktor_io = readWriteBufferState.startReading$ktor_io();
        } while (!C2031xc40028dd.m363m(_state$FU, this, obj, readWriteBufferStateStartReading$ktor_io));
        ByteBuffer readBuffer = readWriteBufferStateStartReading$ktor_io.getReadBuffer();
        prepareBuffer(readBuffer, this.readPosition, readWriteBufferStateStartReading$ktor_io.capacity._availableForRead$internal);
        return readBuffer;
    }

    public final void restoreStateAfterWrite$ktor_io() {
        Object obj;
        ReadWriteBufferState readWriteBufferStateStopWriting$ktor_io;
        ReadWriteBufferState.IdleNonEmpty idleNonEmpty;
        ReadWriteBufferState readWriteBufferState = null;
        do {
            obj = this._state;
            readWriteBufferStateStopWriting$ktor_io = ((ReadWriteBufferState) obj).stopWriting$ktor_io();
            if ((readWriteBufferStateStopWriting$ktor_io instanceof ReadWriteBufferState.IdleNonEmpty) && readWriteBufferStateStopWriting$ktor_io.capacity.isEmpty()) {
                readWriteBufferStateStopWriting$ktor_io = ReadWriteBufferState.IdleEmpty.INSTANCE;
                readWriteBufferState = readWriteBufferStateStopWriting$ktor_io;
            }
        } while (!C2031xc40028dd.m363m(_state$FU, this, obj, readWriteBufferStateStopWriting$ktor_io));
        if (readWriteBufferStateStopWriting$ktor_io != ReadWriteBufferState.IdleEmpty.INSTANCE || (idleNonEmpty = (ReadWriteBufferState.IdleNonEmpty) readWriteBufferState) == null) {
            return;
        }
        releaseBuffer(idleNonEmpty.getInitial());
    }

    @Override // io.ktor.utils.p478io.ByteWriteChannel
    public void flush() {
        flushImpl(1);
    }

    public final void prepareWriteBuffer$ktor_io(ByteBuffer buffer, int lockedSpace) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        prepareBuffer(buffer, this.writePosition, lockedSpace);
    }

    private final void prepareBuffer(ByteBuffer byteBuffer, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        byteBuffer.limit(RangesKt.coerceAtMost(i2 + i, byteBuffer.capacity() - this.reservedSize));
        byteBuffer.position(i);
    }

    public final ByteBuffer setupStateForWrite$ktor_io() throws Throwable {
        Object obj;
        ReadWriteBufferState readWriteBufferState;
        ReadWriteBufferState.IdleEmpty idleEmpty;
        ReadWriteBufferState readWriteBufferStateStartWriting$ktor_io;
        Continuation<Unit> writeOp = getWriteOp();
        if (writeOp != null) {
            throw new IllegalStateException("Write operation is already in progress: " + writeOp);
        }
        ReadWriteBufferState readWriteBufferState2 = null;
        ReadWriteBufferState.Initial initialNewBuffer = null;
        do {
            obj = this._state;
            readWriteBufferState = (ReadWriteBufferState) obj;
            if (this.joining != null) {
                if (initialNewBuffer != null) {
                    releaseBuffer(initialNewBuffer);
                }
                return null;
            }
            if (getClosed() != null) {
                if (initialNewBuffer != null) {
                    releaseBuffer(initialNewBuffer);
                }
                ByteBufferChannelInternals closed = getClosed();
                Intrinsics.checkNotNull(closed);
                ByteBufferChannel4.rethrowClosed(closed.getSendException());
                throw new ExceptionsH();
            }
            idleEmpty = ReadWriteBufferState.IdleEmpty.INSTANCE;
            if (readWriteBufferState == idleEmpty) {
                if (initialNewBuffer == null) {
                    initialNewBuffer = newBuffer();
                }
                readWriteBufferStateStartWriting$ktor_io = initialNewBuffer.startWriting$ktor_io();
            } else {
                if (readWriteBufferState == ReadWriteBufferState.Terminated.INSTANCE) {
                    if (initialNewBuffer != null) {
                        releaseBuffer(initialNewBuffer);
                    }
                    if (this.joining != null) {
                        return null;
                    }
                    ByteBufferChannelInternals closed2 = getClosed();
                    Intrinsics.checkNotNull(closed2);
                    ByteBufferChannel4.rethrowClosed(closed2.getSendException());
                    throw new ExceptionsH();
                }
                readWriteBufferStateStartWriting$ktor_io = readWriteBufferState.startWriting$ktor_io();
            }
        } while (!C2031xc40028dd.m363m(_state$FU, this, obj, readWriteBufferStateStartWriting$ktor_io));
        if (getClosed() != null) {
            restoreStateAfterWrite$ktor_io();
            tryTerminate$ktor_io();
            ByteBufferChannelInternals closed3 = getClosed();
            Intrinsics.checkNotNull(closed3);
            ByteBufferChannel4.rethrowClosed(closed3.getSendException());
            throw new ExceptionsH();
        }
        ByteBuffer writeBuffer = readWriteBufferStateStartWriting$ktor_io.getWriteBuffer();
        if (initialNewBuffer != null) {
            if (readWriteBufferState == null) {
                Intrinsics.throwUninitializedPropertyAccessException("old");
            } else {
                readWriteBufferState2 = readWriteBufferState;
            }
            if (readWriteBufferState2 != idleEmpty) {
                releaseBuffer(initialNewBuffer);
            }
        }
        prepareBuffer(writeBuffer, this.writePosition, readWriteBufferStateStartWriting$ktor_io.capacity._availableForWrite$internal);
        return writeBuffer;
    }

    private final boolean tryCompleteJoining(ByteBufferChannelInternals2 joined) {
        if (!tryReleaseBuffer(true)) {
            return false;
        }
        ensureClosedJoined(joined);
        Continuation continuation = (Continuation) _readOp$FU.getAndSet(this, null);
        if (continuation != null) {
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new IllegalStateException("Joining is in progress"))));
        }
        resumeWriteOp();
        return true;
    }

    public final boolean tryTerminate$ktor_io() {
        if (getClosed() == null || !tryReleaseBuffer(false)) {
            return false;
        }
        ByteBufferChannelInternals2 byteBufferChannelInternals2 = this.joining;
        if (byteBufferChannelInternals2 != null) {
            ensureClosedJoined(byteBufferChannelInternals2);
        }
        resumeReadOp();
        resumeWriteOp();
        return true;
    }

    private final int carryIndex(ByteBuffer byteBuffer, int i) {
        return i >= byteBuffer.capacity() - this.reservedSize ? i - (byteBuffer.capacity() - this.reservedSize) : i;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int tryWritePacketPart(ByteReadPacket packet) throws Throwable {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        ByteBufferChannelInternals2 byteBufferChannelInternals2 = this.joining;
        if (byteBufferChannelInternals2 == null || (byteBufferChannelResolveDelegation = resolveDelegation(this, byteBufferChannelInternals2)) == null) {
            byteBufferChannelResolveDelegation = this;
        }
        ByteBuffer byteBuffer = byteBufferChannelResolveDelegation.setupStateForWrite$ktor_io();
        if (byteBuffer == null) {
            return 0;
        }
        RingBufferCapacity ringBufferCapacity = byteBufferChannelResolveDelegation.getState().capacity;
        long totalBytesWritten = byteBufferChannelResolveDelegation.getTotalBytesWritten();
        try {
            ByteBufferChannelInternals closed = byteBufferChannelResolveDelegation.getClosed();
            if (closed != null) {
                ByteBufferChannel4.rethrowClosed(closed.getSendException());
                throw new ExceptionsH();
            }
            int iTryWriteAtMost = ringBufferCapacity.tryWriteAtMost((int) Math.min(packet.getRemaining(), byteBuffer.remaining()));
            if (iTryWriteAtMost > 0) {
                byteBuffer.limit(byteBuffer.position() + iTryWriteAtMost);
                ByteBuffers.readFully(packet, byteBuffer);
                byteBufferChannelResolveDelegation.bytesWritten(byteBuffer, ringBufferCapacity, iTryWriteAtMost);
            }
            return iTryWriteAtMost;
        } finally {
            if (ringBufferCapacity.isFull() || byteBufferChannelResolveDelegation.getAutoFlush()) {
                byteBufferChannelResolveDelegation.flush();
            }
            if (byteBufferChannelResolveDelegation != this) {
                setTotalBytesWritten$ktor_io(getTotalBytesWritten() + (byteBufferChannelResolveDelegation.getTotalBytesWritten() - totalBytesWritten));
            }
            byteBufferChannelResolveDelegation.restoreStateAfterWrite$ktor_io();
            byteBufferChannelResolveDelegation.tryTerminate$ktor_io();
        }
    }

    private final int writeAsMuchAsPossible(Buffer src) throws Throwable {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        ByteBufferChannelInternals2 byteBufferChannelInternals2 = this.joining;
        if (byteBufferChannelInternals2 == null || (byteBufferChannelResolveDelegation = resolveDelegation(this, byteBufferChannelInternals2)) == null) {
            byteBufferChannelResolveDelegation = this;
        }
        ByteBuffer byteBuffer = byteBufferChannelResolveDelegation.setupStateForWrite$ktor_io();
        int i = 0;
        if (byteBuffer == null) {
            return 0;
        }
        RingBufferCapacity ringBufferCapacity = byteBufferChannelResolveDelegation.getState().capacity;
        long totalBytesWritten = byteBufferChannelResolveDelegation.getTotalBytesWritten();
        try {
            ByteBufferChannelInternals closed = byteBufferChannelResolveDelegation.getClosed();
            if (closed != null) {
                ByteBufferChannel4.rethrowClosed(closed.getSendException());
                throw new ExceptionsH();
            }
            while (true) {
                int iTryWriteAtMost = ringBufferCapacity.tryWriteAtMost(Math.min(src.getWritePosition() - src.getReadPosition(), byteBuffer.remaining()));
                if (iTryWriteAtMost == 0) {
                    break;
                }
                BufferUtilsJvm.readFully(src, byteBuffer, iTryWriteAtMost);
                i += iTryWriteAtMost;
                byteBufferChannelResolveDelegation.prepareBuffer(byteBuffer, byteBufferChannelResolveDelegation.carryIndex(byteBuffer, byteBufferChannelResolveDelegation.writePosition + i), ringBufferCapacity._availableForWrite$internal);
            }
            byteBufferChannelResolveDelegation.bytesWritten(byteBuffer, ringBufferCapacity, i);
            if (ringBufferCapacity.isFull() || byteBufferChannelResolveDelegation.getAutoFlush()) {
                byteBufferChannelResolveDelegation.flush();
            }
            if (byteBufferChannelResolveDelegation != this) {
                setTotalBytesWritten$ktor_io(getTotalBytesWritten() + (byteBufferChannelResolveDelegation.getTotalBytesWritten() - totalBytesWritten));
            }
            byteBufferChannelResolveDelegation.restoreStateAfterWrite$ktor_io();
            byteBufferChannelResolveDelegation.tryTerminate$ktor_io();
            return i;
        } catch (Throwable th) {
            if (ringBufferCapacity.isFull() || byteBufferChannelResolveDelegation.getAutoFlush()) {
                byteBufferChannelResolveDelegation.flush();
            }
            if (byteBufferChannelResolveDelegation != this) {
                setTotalBytesWritten$ktor_io(getTotalBytesWritten() + (byteBufferChannelResolveDelegation.getTotalBytesWritten() - totalBytesWritten));
            }
            byteBufferChannelResolveDelegation.restoreStateAfterWrite$ktor_io();
            byteBufferChannelResolveDelegation.tryTerminate$ktor_io();
            throw th;
        }
    }

    private final int writeAsMuchAsPossible(ByteBuffer src) throws Throwable {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        int iTryWriteAtMost;
        ByteBufferChannelInternals2 byteBufferChannelInternals2 = this.joining;
        if (byteBufferChannelInternals2 == null || (byteBufferChannelResolveDelegation = resolveDelegation(this, byteBufferChannelInternals2)) == null) {
            byteBufferChannelResolveDelegation = this;
        }
        ByteBuffer byteBuffer = byteBufferChannelResolveDelegation.setupStateForWrite$ktor_io();
        int i = 0;
        if (byteBuffer == null) {
            return 0;
        }
        RingBufferCapacity ringBufferCapacity = byteBufferChannelResolveDelegation.getState().capacity;
        long totalBytesWritten = byteBufferChannelResolveDelegation.getTotalBytesWritten();
        try {
            ByteBufferChannelInternals closed = byteBufferChannelResolveDelegation.getClosed();
            if (closed != null) {
                ByteBufferChannel4.rethrowClosed(closed.getSendException());
                throw new ExceptionsH();
            }
            int iLimit = src.limit();
            while (true) {
                int iPosition = iLimit - src.position();
                if (iPosition == 0 || (iTryWriteAtMost = ringBufferCapacity.tryWriteAtMost(Math.min(iPosition, byteBuffer.remaining()))) == 0) {
                    break;
                }
                if (iTryWriteAtMost <= 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                src.limit(src.position() + iTryWriteAtMost);
                byteBuffer.put(src);
                i += iTryWriteAtMost;
                byteBufferChannelResolveDelegation.prepareBuffer(byteBuffer, byteBufferChannelResolveDelegation.carryIndex(byteBuffer, byteBufferChannelResolveDelegation.writePosition + i), ringBufferCapacity._availableForWrite$internal);
            }
            src.limit(iLimit);
            byteBufferChannelResolveDelegation.bytesWritten(byteBuffer, ringBufferCapacity, i);
            if (ringBufferCapacity.isFull() || byteBufferChannelResolveDelegation.getAutoFlush()) {
                byteBufferChannelResolveDelegation.flush();
            }
            if (byteBufferChannelResolveDelegation != this) {
                setTotalBytesWritten$ktor_io(getTotalBytesWritten() + (byteBufferChannelResolveDelegation.getTotalBytesWritten() - totalBytesWritten));
            }
            byteBufferChannelResolveDelegation.restoreStateAfterWrite$ktor_io();
            byteBufferChannelResolveDelegation.tryTerminate$ktor_io();
            return i;
        } catch (Throwable th) {
            if (ringBufferCapacity.isFull() || byteBufferChannelResolveDelegation.getAutoFlush()) {
                byteBufferChannelResolveDelegation.flush();
            }
            if (byteBufferChannelResolveDelegation != this) {
                setTotalBytesWritten$ktor_io(getTotalBytesWritten() + (byteBufferChannelResolveDelegation.getTotalBytesWritten() - totalBytesWritten));
            }
            byteBufferChannelResolveDelegation.restoreStateAfterWrite$ktor_io();
            byteBufferChannelResolveDelegation.tryTerminate$ktor_io();
            throw th;
        }
    }

    private final int writeAsMuchAsPossible(byte[] src, int offset, int length) throws Throwable {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        ByteBufferChannelInternals2 byteBufferChannelInternals2 = this.joining;
        if (byteBufferChannelInternals2 == null || (byteBufferChannelResolveDelegation = resolveDelegation(this, byteBufferChannelInternals2)) == null) {
            byteBufferChannelResolveDelegation = this;
        }
        ByteBuffer byteBuffer = byteBufferChannelResolveDelegation.setupStateForWrite$ktor_io();
        int i = 0;
        if (byteBuffer == null) {
            return 0;
        }
        RingBufferCapacity ringBufferCapacity = byteBufferChannelResolveDelegation.getState().capacity;
        long totalBytesWritten = byteBufferChannelResolveDelegation.getTotalBytesWritten();
        try {
            ByteBufferChannelInternals closed = byteBufferChannelResolveDelegation.getClosed();
            if (closed != null) {
                ByteBufferChannel4.rethrowClosed(closed.getSendException());
                throw new ExceptionsH();
            }
            while (true) {
                int iTryWriteAtMost = ringBufferCapacity.tryWriteAtMost(Math.min(length - i, byteBuffer.remaining()));
                if (iTryWriteAtMost == 0) {
                    byteBufferChannelResolveDelegation.bytesWritten(byteBuffer, ringBufferCapacity, i);
                    if (ringBufferCapacity.isFull() || byteBufferChannelResolveDelegation.getAutoFlush()) {
                        byteBufferChannelResolveDelegation.flush();
                    }
                    if (byteBufferChannelResolveDelegation != this) {
                        setTotalBytesWritten$ktor_io(getTotalBytesWritten() + (byteBufferChannelResolveDelegation.getTotalBytesWritten() - totalBytesWritten));
                    }
                    byteBufferChannelResolveDelegation.restoreStateAfterWrite$ktor_io();
                    byteBufferChannelResolveDelegation.tryTerminate$ktor_io();
                    return i;
                }
                if (iTryWriteAtMost <= 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                byteBuffer.put(src, offset + i, iTryWriteAtMost);
                i += iTryWriteAtMost;
                byteBufferChannelResolveDelegation.prepareBuffer(byteBuffer, byteBufferChannelResolveDelegation.carryIndex(byteBuffer, byteBufferChannelResolveDelegation.writePosition + i), ringBufferCapacity._availableForWrite$internal);
            }
        } catch (Throwable th) {
            if (ringBufferCapacity.isFull() || byteBufferChannelResolveDelegation.getAutoFlush()) {
                byteBufferChannelResolveDelegation.flush();
            }
            if (byteBufferChannelResolveDelegation != this) {
                setTotalBytesWritten$ktor_io(getTotalBytesWritten() + (byteBufferChannelResolveDelegation.getTotalBytesWritten() - totalBytesWritten));
            }
            byteBufferChannelResolveDelegation.restoreStateAfterWrite$ktor_io();
            byteBufferChannelResolveDelegation.tryTerminate$ktor_io();
            throw th;
        }
    }

    private final int readAsMuchAsPossible(Buffer dst, int consumed, int max) throws Throwable {
        int iTryReadAtMost;
        do {
            ByteBuffer byteBuffer = setupStateForRead();
            boolean z = false;
            if (byteBuffer == null) {
                iTryReadAtMost = 0;
            } else {
                RingBufferCapacity ringBufferCapacity = getState().capacity;
                try {
                    if (ringBufferCapacity._availableForRead$internal != 0) {
                        int limit = dst.getLimit() - dst.getWritePosition();
                        iTryReadAtMost = ringBufferCapacity.tryReadAtMost(Math.min(byteBuffer.remaining(), Math.min(limit, max)));
                        if (iTryReadAtMost > 0) {
                            if (limit < byteBuffer.remaining()) {
                                byteBuffer.limit(byteBuffer.position() + limit);
                            }
                            BufferPrimitivesJvm.writeFully(dst, byteBuffer);
                            bytesRead(byteBuffer, ringBufferCapacity, iTryReadAtMost);
                            z = true;
                        }
                    } else {
                        restoreStateAfterRead();
                        tryTerminate$ktor_io();
                        iTryReadAtMost = 0;
                    }
                } finally {
                    restoreStateAfterRead();
                    tryTerminate$ktor_io();
                }
            }
            consumed += iTryReadAtMost;
            max -= iTryReadAtMost;
            if (!z || dst.getLimit() <= dst.getWritePosition()) {
                break;
            }
        } while (getState().capacity._availableForRead$internal > 0);
        return consumed;
    }

    private final int readAsMuchAsPossible(byte[] dst, int offset, int length) throws Throwable {
        ByteBuffer byteBuffer = setupStateForRead();
        int i = 0;
        if (byteBuffer == null) {
            return 0;
        }
        RingBufferCapacity ringBufferCapacity = getState().capacity;
        try {
            if (ringBufferCapacity._availableForRead$internal != 0) {
                int iCapacity = byteBuffer.capacity() - this.reservedSize;
                while (true) {
                    int i2 = length - i;
                    if (i2 == 0) {
                        break;
                    }
                    int i3 = this.readPosition;
                    int iTryReadAtMost = ringBufferCapacity.tryReadAtMost(Math.min(iCapacity - i3, i2));
                    if (iTryReadAtMost == 0) {
                        break;
                    }
                    byteBuffer.limit(i3 + iTryReadAtMost);
                    byteBuffer.position(i3);
                    byteBuffer.get(dst, offset + i, iTryReadAtMost);
                    bytesRead(byteBuffer, ringBufferCapacity, iTryReadAtMost);
                    i += iTryReadAtMost;
                }
            }
            return i;
        } finally {
            restoreStateAfterRead();
            tryTerminate$ktor_io();
        }
    }

    static /* synthetic */ Object readAvailable$suspendImpl(ByteBufferChannel byteBufferChannel, byte[] bArr, int i, int i2, Continuation<? super Integer> continuation) throws Throwable {
        int asMuchAsPossible = byteBufferChannel.readAsMuchAsPossible(bArr, i, i2);
        if (asMuchAsPossible == 0 && byteBufferChannel.getClosed() != null) {
            asMuchAsPossible = byteBufferChannel.getState().capacity.flush() ? byteBufferChannel.readAsMuchAsPossible(bArr, i, i2) : -1;
        } else if (asMuchAsPossible <= 0 && i2 != 0) {
            return byteBufferChannel.readAvailableSuspend(bArr, i, i2, continuation);
        }
        return boxing.boxInt(asMuchAsPossible);
    }

    static /* synthetic */ Object readAvailable$suspendImpl(ByteBufferChannel byteBufferChannel, ChunkBuffer chunkBuffer, Continuation<? super Integer> continuation) {
        int asMuchAsPossible$default = readAsMuchAsPossible$default(byteBufferChannel, chunkBuffer, 0, 0, 6, null);
        if (asMuchAsPossible$default != 0 || byteBufferChannel.getClosed() == null) {
            if (asMuchAsPossible$default <= 0 && chunkBuffer.getLimit() > chunkBuffer.getWritePosition()) {
                return byteBufferChannel.readAvailableSuspend(chunkBuffer, continuation);
            }
        } else {
            asMuchAsPossible$default = byteBufferChannel.getState().capacity.flush() ? readAsMuchAsPossible$default(byteBufferChannel, chunkBuffer, 0, 0, 6, null) : -1;
        }
        return boxing.boxInt(asMuchAsPossible$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAvailableSuspend(byte[] bArr, int i, int i2, Continuation<? super Integer> continuation) throws Throwable {
        C456151 c456151;
        ByteBufferChannel byteBufferChannel;
        if (continuation instanceof C456151) {
            c456151 = (C456151) continuation;
            int i3 = c456151.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c456151.label = i3 - Integer.MIN_VALUE;
            } else {
                c456151 = new C456151(continuation);
            }
        }
        Object suspend = c456151.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c456151.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(suspend);
            c456151.L$0 = this;
            c456151.L$1 = bArr;
            c456151.I$0 = i;
            c456151.I$1 = i2;
            c456151.label = 1;
            suspend = readSuspend(1, c456151);
            if (suspend != coroutine_suspended) {
                byteBufferChannel = this;
            }
        }
        if (i4 != 1) {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(suspend);
            return suspend;
        }
        i2 = c456151.I$1;
        i = c456151.I$0;
        bArr = (byte[]) c456151.L$1;
        byteBufferChannel = (ByteBufferChannel) c456151.L$0;
        ResultKt.throwOnFailure(suspend);
        if (!((Boolean) suspend).booleanValue()) {
            return boxing.boxInt(-1);
        }
        c456151.L$0 = null;
        c456151.L$1 = null;
        c456151.label = 2;
        Object available = byteBufferChannel.readAvailable(bArr, i, i2, c456151);
        return available == coroutine_suspended ? coroutine_suspended : available;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAvailableSuspend(ChunkBuffer chunkBuffer, Continuation<? super Integer> continuation) throws Throwable {
        C456163 c456163;
        ByteBufferChannel byteBufferChannel;
        if (continuation instanceof C456163) {
            c456163 = (C456163) continuation;
            int i = c456163.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c456163.label = i - Integer.MIN_VALUE;
            } else {
                c456163 = new C456163(continuation);
            }
        }
        Object suspend = c456163.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c456163.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(suspend);
            c456163.L$0 = this;
            c456163.L$1 = chunkBuffer;
            c456163.label = 1;
            suspend = readSuspend(1, c456163);
            if (suspend != coroutine_suspended) {
                byteBufferChannel = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(suspend);
            return suspend;
        }
        chunkBuffer = (ChunkBuffer) c456163.L$1;
        byteBufferChannel = (ByteBufferChannel) c456163.L$0;
        ResultKt.throwOnFailure(suspend);
        if (!((Boolean) suspend).booleanValue()) {
            return boxing.boxInt(-1);
        }
        c456163.L$0 = null;
        c456163.L$1 = null;
        c456163.label = 2;
        Object available = byteBufferChannel.readAvailable(chunkBuffer, c456163);
        return available == coroutine_suspended ? coroutine_suspended : available;
    }

    public final void bytesWrittenFromSession$ktor_io(ByteBuffer buffer, RingBufferCapacity capacity, int count) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(capacity, "capacity");
        bytesWritten(buffer, capacity, count);
    }

    private final void bytesWritten(ByteBuffer byteBuffer, RingBufferCapacity ringBufferCapacity, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.writePosition = carryIndex(byteBuffer, this.writePosition + i);
        ringBufferCapacity.completeWrite(i);
        setTotalBytesWritten$ktor_io(getTotalBytesWritten() + i);
    }

    private final void bytesRead(ByteBuffer byteBuffer, RingBufferCapacity ringBufferCapacity, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.readPosition = carryIndex(byteBuffer, this.readPosition + i);
        ringBufferCapacity.completeRead(i);
        setTotalBytesRead$ktor_io(getTotalBytesRead() + i);
        resumeWriteOp();
    }

    public final ByteBufferChannel resolveChannelInstance$ktor_io() {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        ByteBufferChannelInternals2 byteBufferChannelInternals2 = this.joining;
        return (byteBufferChannelInternals2 == null || (byteBufferChannelResolveDelegation = resolveDelegation(this, byteBufferChannelInternals2)) == null) ? this : byteBufferChannelResolveDelegation;
    }

    private final ByteBufferChannel resolveDelegation(ByteBufferChannel current, ByteBufferChannelInternals2 joining) {
        while (current.getState() == ReadWriteBufferState.Terminated.INSTANCE) {
            current = joining.getDelegatedTo();
            joining = current.joining;
            if (joining == null) {
                return current;
            }
        }
        return null;
    }

    static /* synthetic */ Object writeFully$suspendImpl(ByteBufferChannel byteBufferChannel, ByteBuffer byteBuffer, Continuation<? super Unit> continuation) throws Throwable {
        Object objWriteFullySuspend;
        ByteBufferChannel byteBufferChannelResolveDelegation;
        ByteBufferChannelInternals2 byteBufferChannelInternals2 = byteBufferChannel.joining;
        if (byteBufferChannelInternals2 == null || (byteBufferChannelResolveDelegation = byteBufferChannel.resolveDelegation(byteBufferChannel, byteBufferChannelInternals2)) == null) {
            byteBufferChannel.writeAsMuchAsPossible(byteBuffer);
            return (byteBuffer.hasRemaining() && (objWriteFullySuspend = byteBufferChannel.writeFullySuspend(byteBuffer, continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? objWriteFullySuspend : Unit.INSTANCE;
        }
        Object objWriteFully = byteBufferChannelResolveDelegation.writeFully(byteBuffer, continuation);
        return objWriteFully == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteFully : Unit.INSTANCE;
    }

    static /* synthetic */ Object writeFully$suspendImpl(ByteBufferChannel byteBufferChannel, Buffer buffer, Continuation<? super Unit> continuation) throws Throwable {
        byteBufferChannel.writeAsMuchAsPossible(buffer);
        if (buffer.getWritePosition() <= buffer.getReadPosition()) {
            return Unit.INSTANCE;
        }
        Object objWriteFullySuspend = byteBufferChannel.writeFullySuspend(buffer, continuation);
        return objWriteFullySuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteFullySuspend : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        if (r7.writeFully(r6, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0054 -> B:22:0x0057). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeFullySuspend(ByteBuffer byteBuffer, Continuation<? super Unit> continuation) throws Throwable {
        C456201 c456201;
        ByteBufferChannel byteBufferChannel;
        if (continuation instanceof C456201) {
            c456201 = (C456201) continuation;
            int i = c456201.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c456201.label = i - Integer.MIN_VALUE;
            } else {
                c456201 = new C456201(continuation);
            }
        }
        Object obj = c456201.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c456201.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            byteBufferChannel = this;
            if (byteBuffer.hasRemaining()) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            byteBuffer = (ByteBuffer) c456201.L$1;
            byteBufferChannel = (ByteBufferChannel) c456201.L$0;
            ResultKt.throwOnFailure(obj);
            ByteBufferChannelInternals2 byteBufferChannelInternals2 = byteBufferChannel.joining;
            if (byteBufferChannelInternals2 != null || (r7 = byteBufferChannel.resolveDelegation(byteBufferChannel, byteBufferChannelInternals2)) == null) {
                byteBufferChannel.writeAsMuchAsPossible(byteBuffer);
                if (byteBuffer.hasRemaining()) {
                    c456201.L$0 = byteBufferChannel;
                    c456201.L$1 = byteBuffer;
                    c456201.label = 1;
                    if (byteBufferChannel.tryWriteSuspend$ktor_io(1, c456201) != coroutine_suspended) {
                        ByteBufferChannelInternals2 byteBufferChannelInternals22 = byteBufferChannel.joining;
                        if (byteBufferChannelInternals22 != null) {
                        }
                        byteBufferChannel.writeAsMuchAsPossible(byteBuffer);
                        if (byteBuffer.hasRemaining()) {
                            return Unit.INSTANCE;
                        }
                    }
                    return coroutine_suspended;
                }
            } else {
                c456201.L$0 = null;
                c456201.L$1 = null;
                c456201.label = 2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        if (r8.writeFully(r7, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:22:0x005b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeFullySuspend(Buffer buffer, Continuation<? super Unit> continuation) throws Throwable {
        C456213 c456213;
        ByteBufferChannel byteBufferChannel;
        if (continuation instanceof C456213) {
            c456213 = (C456213) continuation;
            int i = c456213.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c456213.label = i - Integer.MIN_VALUE;
            } else {
                c456213 = new C456213(continuation);
            }
        }
        Object obj = c456213.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c456213.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            byteBufferChannel = this;
            if (buffer.getWritePosition() > buffer.getReadPosition()) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            buffer = (Buffer) c456213.L$1;
            byteBufferChannel = (ByteBufferChannel) c456213.L$0;
            ResultKt.throwOnFailure(obj);
            ByteBufferChannelInternals2 byteBufferChannelInternals2 = byteBufferChannel.joining;
            if (byteBufferChannelInternals2 != null || (r8 = byteBufferChannel.resolveDelegation(byteBufferChannel, byteBufferChannelInternals2)) == null) {
                byteBufferChannel.writeAsMuchAsPossible(buffer);
                if (buffer.getWritePosition() > buffer.getReadPosition()) {
                    c456213.L$0 = byteBufferChannel;
                    c456213.L$1 = buffer;
                    c456213.label = 1;
                    if (byteBufferChannel.tryWriteSuspend$ktor_io(1, c456213) != coroutine_suspended) {
                        ByteBufferChannelInternals2 byteBufferChannelInternals22 = byteBufferChannel.joining;
                        if (byteBufferChannelInternals22 != null) {
                        }
                        byteBufferChannel.writeAsMuchAsPossible(buffer);
                        if (buffer.getWritePosition() > buffer.getReadPosition()) {
                            return Unit.INSTANCE;
                        }
                    }
                    return coroutine_suspended;
                }
            } else {
                c456213.L$0 = null;
                c456213.L$1 = null;
                c456213.label = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:229:0x0151, code lost:
    
        r4 = r27;
        r7 = r30;
        r14 = r15;
        r12 = r16;
        r8 = r18;
        r27 = r19;
        r11 = r22;
        r16 = r0;
        r15 = r1;
        r0 = r2;
        r2 = r3;
        r3 = r21;
     */
    /* JADX WARN: Path cross not found for [B:136:0x02ed, B:141:0x02f9], limit reached: 228 */
    /* JADX WARN: Path cross not found for [B:141:0x02f9, B:136:0x02ed], limit reached: 228 */
    /* JADX WARN: Path cross not found for [B:147:0x031b, B:153:0x033a], limit reached: 228 */
    /* JADX WARN: Path cross not found for [B:153:0x033a, B:147:0x031b], limit reached: 228 */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ed A[Catch: all -> 0x02f4, TryCatch #10 {all -> 0x02f4, blocks: (B:134:0x02e7, B:136:0x02ed, B:143:0x02fe, B:144:0x030d, B:141:0x02f9), top: B:222:0x02e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02fe A[Catch: all -> 0x02f4, TryCatch #10 {all -> 0x02f4, blocks: (B:134:0x02e7, B:136:0x02ed, B:143:0x02fe, B:144:0x030d, B:141:0x02f9), top: B:222:0x02e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x031b A[Catch: all -> 0x0056, TRY_ENTER, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0340 A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x039c A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03de A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03e4 A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03e9 A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03ff A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0274 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0157 A[Catch: all -> 0x01c8, TryCatch #4 {all -> 0x01c8, blocks: (B:63:0x0151, B:65:0x0157, B:67:0x015b), top: B:210:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a1 A[Catch: all -> 0x01b0, TRY_LEAVE, TryCatch #7 {all -> 0x01b0, blocks: (B:74:0x019d, B:76:0x01a1), top: B:216:0x019d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0206 A[Catch: all -> 0x02c7, TRY_LEAVE, TryCatch #2 {all -> 0x02c7, blocks: (B:87:0x01e7, B:91:0x0206), top: B:206:0x01e7 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x032f -> B:49:0x0118). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:176:0x039a -> B:180:0x03c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:178:0x03bd -> B:180:0x03c0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copyDirect$ktor_io(ByteBufferChannel byteBufferChannel, long j, ByteBufferChannelInternals2 byteBufferChannelInternals2, Continuation<? super Long> continuation) throws Throwable {
        ByteBufferChannel2 byteBufferChannel2;
        ByteBufferChannel byteBufferChannel3;
        ByteBufferChannel byteBufferChannel4;
        ByteBufferChannel2 byteBufferChannel22;
        Ref.LongRef longRef;
        ByteBufferChannelInternals2 byteBufferChannelInternals22;
        boolean z;
        long j2;
        ByteBufferChannel byteBufferChannel5;
        long j3;
        ByteBufferChannel byteBufferChannel6;
        ByteBufferChannel byteBufferChannel7;
        RingBufferCapacity ringBufferCapacity;
        Throwable th;
        ByteBufferChannel byteBufferChannel8;
        long j4;
        long j5;
        Ref.LongRef longRef2;
        ByteBufferChannelInternals2 byteBufferChannelInternals23;
        ByteBufferChannel byteBufferChannel9;
        Object obj;
        ByteBufferChannelInternals2 byteBufferChannelInternals24;
        long j6;
        ByteBufferChannelInternals2 byteBufferChannelInternals25;
        ByteBufferChannel byteBufferChannel10;
        RingBufferCapacity ringBufferCapacity2;
        ByteBuffer byteBuffer;
        ByteBufferChannel byteBufferChannel11;
        RingBufferCapacity ringBufferCapacity3;
        RingBufferCapacity ringBufferCapacity4;
        ByteBuffer byteBuffer2;
        ByteBufferChannel2 byteBufferChannel23;
        ByteBufferChannel byteBufferChannel12;
        long j7;
        int i;
        RingBufferCapacity ringBufferCapacity5;
        ByteBufferChannel byteBufferChannel13;
        ByteBufferChannelInternals2 byteBufferChannelInternals26;
        ByteBufferChannel byteBufferChannel14;
        long j8;
        ByteBufferChannelInternals2 byteBufferChannelInternals27;
        ByteBufferChannel byteBufferChannel15;
        long j9;
        Ref.LongRef longRef3;
        ByteBufferChannel byteBufferChannelResolveDelegation;
        ByteBufferChannel byteBufferChannel16 = byteBufferChannel;
        if (continuation instanceof ByteBufferChannel2) {
            byteBufferChannel2 = (ByteBufferChannel2) continuation;
            int i2 = byteBufferChannel2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                byteBufferChannel2.label = i2 - Integer.MIN_VALUE;
            } else {
                byteBufferChannel2 = new ByteBufferChannel2(this, continuation);
            }
        }
        Object obj2 = byteBufferChannel2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = byteBufferChannel2.label;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj2);
                if (byteBufferChannel16.isClosedForRead()) {
                    if (byteBufferChannelInternals2 != null && !byteBufferChannel16.tryCompleteJoining(byteBufferChannelInternals2)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (byteBufferChannel16.getClosedCause() != null) {
                        close(byteBufferChannel16.getClosedCause());
                    }
                    return boxing.boxLong(0L);
                }
                if (byteBufferChannelInternals2 != null && byteBufferChannel16.tryCompleteJoining(byteBufferChannelInternals2)) {
                    return boxing.boxLong(0L);
                }
                boolean autoFlush = getAutoFlush();
                try {
                    byteBufferChannel4 = this;
                    byteBufferChannel22 = byteBufferChannel2;
                    longRef = new Ref.LongRef();
                    byteBufferChannelInternals22 = byteBufferChannelInternals2;
                    z = autoFlush;
                    j2 = j;
                    if (longRef.element < j2) {
                    }
                    if (z) {
                    }
                    return boxing.boxLong(longRef.element);
                } catch (Throwable th2) {
                    th = th2;
                    byteBufferChannel3 = this;
                    byteBufferChannel3.close(th);
                    throw th;
                }
            }
            if (i3 != 1) {
                if (i3 == 2) {
                    boolean z2 = byteBufferChannel2.Z$0;
                    j9 = byteBufferChannel2.J$0;
                    longRef3 = (Ref.LongRef) byteBufferChannel2.L$3;
                    ByteBufferChannelInternals2 byteBufferChannelInternals28 = (ByteBufferChannelInternals2) byteBufferChannel2.L$2;
                    byteBufferChannel15 = (ByteBufferChannel) byteBufferChannel2.L$1;
                    byteBufferChannel4 = (ByteBufferChannel) byteBufferChannel2.L$0;
                    ResultKt.throwOnFailure(obj2);
                    byteBufferChannelInternals24 = byteBufferChannelInternals28;
                    z = z2;
                    obj = coroutine_suspended;
                    if (((Boolean) obj2).booleanValue()) {
                    }
                    coroutine_suspended = obj;
                    byteBufferChannel16 = byteBufferChannel15;
                    if (longRef.element < j2) {
                    }
                    if (z) {
                    }
                    return boxing.boxLong(longRef.element);
                }
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z3 = byteBufferChannel2.Z$0;
                long j10 = byteBufferChannel2.J$0;
                Ref.LongRef longRef4 = (Ref.LongRef) byteBufferChannel2.L$3;
                ByteBufferChannelInternals2 byteBufferChannelInternals29 = (ByteBufferChannelInternals2) byteBufferChannel2.L$2;
                byteBufferChannel15 = (ByteBufferChannel) byteBufferChannel2.L$1;
                byteBufferChannel4 = (ByteBufferChannel) byteBufferChannel2.L$0;
                ResultKt.throwOnFailure(obj2);
                byteBufferChannel22 = byteBufferChannel2;
                byteBufferChannelInternals22 = byteBufferChannelInternals29;
                z = z3;
                obj = coroutine_suspended;
                longRef = longRef4;
                j2 = j10;
                coroutine_suspended = obj;
                byteBufferChannel16 = byteBufferChannel15;
                if (longRef.element < j2) {
                    ByteBufferChannelInternals2 byteBufferChannelInternals210 = byteBufferChannel4.joining;
                    if (byteBufferChannelInternals210 == null || (byteBufferChannelResolveDelegation = byteBufferChannel4.resolveDelegation(byteBufferChannel4, byteBufferChannelInternals210)) == null) {
                        byteBufferChannelResolveDelegation = byteBufferChannel4;
                    }
                    byteBuffer = byteBufferChannelResolveDelegation.setupStateForWrite$ktor_io();
                    if (byteBuffer == null) {
                        byteBufferChannelInternals24 = byteBufferChannelInternals22;
                        j6 = j2;
                        byteBufferChannel9 = byteBufferChannel16;
                        obj = coroutine_suspended;
                        if (byteBufferChannelInternals24 != null) {
                            if (!byteBufferChannel9.tryCompleteJoining(byteBufferChannelInternals24)) {
                                if (byteBufferChannel9.getState().capacity.flush()) {
                                    byteBufferChannel9.resumeWriteOp();
                                    coroutine_suspended = obj;
                                    byteBufferChannel16 = byteBufferChannel9;
                                    j2 = j6;
                                    byteBufferChannelInternals22 = byteBufferChannelInternals24;
                                    if (longRef.element < j2) {
                                    }
                                }
                            }
                        }
                        if (longRef.element < j6) {
                            byteBufferChannel4.flush();
                            if (byteBufferChannel9.get_availableForRead() == 0) {
                                byteBufferChannel22.L$0 = byteBufferChannel4;
                                byteBufferChannel22.L$1 = byteBufferChannel9;
                                byteBufferChannel22.L$2 = byteBufferChannelInternals24;
                                byteBufferChannel22.L$3 = longRef;
                                byteBufferChannel22.L$4 = null;
                                byteBufferChannel22.L$5 = null;
                                byteBufferChannel22.L$6 = null;
                                byteBufferChannel22.L$7 = null;
                                byteBufferChannel22.L$8 = null;
                                byteBufferChannel22.L$9 = null;
                                byteBufferChannel22.J$0 = j6;
                                byteBufferChannel22.Z$0 = z;
                                byteBufferChannel22.label = 2;
                                Object suspendImpl = byteBufferChannel9.readSuspendImpl(1, byteBufferChannel22);
                                if (suspendImpl == obj) {
                                    return obj;
                                }
                                byteBufferChannel15 = byteBufferChannel9;
                                j9 = j6;
                                byteBufferChannel2 = byteBufferChannel22;
                                longRef3 = longRef;
                                obj2 = suspendImpl;
                                if (((Boolean) obj2).booleanValue()) {
                                    if (byteBufferChannelInternals24 != null && byteBufferChannel15.tryCompleteJoining(byteBufferChannelInternals24)) {
                                        longRef = longRef3;
                                    }
                                    longRef = longRef3;
                                    byteBufferChannel22 = byteBufferChannel2;
                                    j2 = j9;
                                    byteBufferChannelInternals22 = byteBufferChannelInternals24;
                                    if (byteBufferChannel4.joining != null) {
                                    }
                                } else {
                                    if (byteBufferChannelInternals24 != null) {
                                        if (!byteBufferChannel15.tryCompleteJoining(byteBufferChannelInternals24)) {
                                        }
                                        longRef = longRef3;
                                        byteBufferChannel22 = byteBufferChannel2;
                                        j2 = j9;
                                        byteBufferChannelInternals22 = byteBufferChannelInternals24;
                                        if (byteBufferChannel4.joining != null) {
                                            byteBufferChannel22.L$0 = byteBufferChannel4;
                                            byteBufferChannel22.L$1 = byteBufferChannel15;
                                            byteBufferChannel22.L$2 = byteBufferChannelInternals22;
                                            byteBufferChannel22.L$3 = longRef;
                                            byteBufferChannel22.L$4 = null;
                                            byteBufferChannel22.L$5 = null;
                                            byteBufferChannel22.L$6 = null;
                                            byteBufferChannel22.L$7 = null;
                                            byteBufferChannel22.L$8 = null;
                                            byteBufferChannel22.L$9 = null;
                                            byteBufferChannel22.J$0 = j2;
                                            byteBufferChannel22.Z$0 = z;
                                            byteBufferChannel22.label = 3;
                                            if (byteBufferChannel4.tryWriteSuspend$ktor_io(1, byteBufferChannel22) == obj) {
                                                return obj;
                                            }
                                        }
                                    }
                                    longRef = longRef3;
                                }
                                coroutine_suspended = obj;
                                byteBufferChannel16 = byteBufferChannel15;
                                if (longRef.element < j2) {
                                }
                            } else {
                                byteBufferChannel15 = byteBufferChannel9;
                                j2 = j6;
                                byteBufferChannelInternals22 = byteBufferChannelInternals24;
                                if (byteBufferChannel4.joining != null) {
                                }
                                coroutine_suspended = obj;
                                byteBufferChannel16 = byteBufferChannel15;
                                if (longRef.element < j2) {
                                }
                            }
                        }
                    } else {
                        RingBufferCapacity ringBufferCapacity6 = byteBufferChannelResolveDelegation.getState().capacity;
                        long totalBytesWritten = byteBufferChannelResolveDelegation.getTotalBytesWritten();
                        try {
                            ByteBufferChannelInternals closed = byteBufferChannelResolveDelegation.getClosed();
                            if (closed != null) {
                                ByteBufferChannel4.rethrowClosed(closed.getSendException());
                                throw new ExceptionsH();
                            }
                            Object obj3 = coroutine_suspended;
                            boolean z4 = z;
                            ringBufferCapacity5 = ringBufferCapacity6;
                            long j11 = totalBytesWritten;
                            long j12 = j2;
                            ByteBufferChannel byteBufferChannel17 = byteBufferChannelResolveDelegation;
                            ByteBufferChannel byteBufferChannel18 = byteBufferChannel4;
                            longRef2 = longRef;
                            byteBufferChannel7 = byteBufferChannel17;
                            try {
                                if (longRef2.element < j12) {
                                    int i4 = ringBufferCapacity5._availableForWrite$internal;
                                    if (i4 == 0) {
                                        try {
                                            byteBufferChannel22.L$0 = byteBufferChannel18;
                                            byteBufferChannel22.L$1 = byteBufferChannel16;
                                            byteBufferChannel22.L$2 = byteBufferChannelInternals22;
                                            byteBufferChannel22.L$3 = longRef2;
                                            byteBufferChannel22.L$4 = byteBufferChannel4;
                                            byteBufferChannel22.L$5 = byteBufferChannel7;
                                            byteBufferChannel22.L$6 = ringBufferCapacity6;
                                            byteBufferChannel22.L$7 = ringBufferCapacity5;
                                            byteBufferChannel22.L$8 = byteBuffer;
                                            byteBufferChannel22.L$9 = byteBufferChannel17;
                                            byteBufferChannel22.J$0 = j12;
                                            z = z4;
                                            byteBufferChannel22.Z$0 = z;
                                            byteBufferChannel22.J$1 = j8;
                                            byteBufferChannel22.label = 1;
                                            byteBufferChannel13 = byteBufferChannel16;
                                            coroutine_suspended = obj3;
                                            if (byteBufferChannel17.tryWriteSuspend$ktor_io(1, byteBufferChannel22) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            j4 = j12;
                                            byteBufferChannel5 = byteBufferChannel14;
                                            ByteBufferChannel byteBufferChannel19 = byteBufferChannel17;
                                            byteBufferChannelInternals26 = byteBufferChannelInternals27;
                                            byteBufferChannel11 = byteBufferChannel19;
                                            byteBufferChannel2 = byteBufferChannel22;
                                            ringBufferCapacity = ringBufferCapacity6;
                                            j3 = j8;
                                            try {
                                                if (byteBufferChannel11.joining == null) {
                                                    obj = coroutine_suspended;
                                                    byteBufferChannel8 = byteBufferChannel5;
                                                    j5 = j3;
                                                    ringBufferCapacity6 = ringBufferCapacity;
                                                    byteBufferChannel22 = byteBufferChannel2;
                                                    byteBufferChannelInternals23 = byteBufferChannelInternals26;
                                                    byteBufferChannel9 = byteBufferChannel13;
                                                    if (!ringBufferCapacity6.isFull()) {
                                                    }
                                                    byteBufferChannel7.flush();
                                                    if (byteBufferChannel7 != byteBufferChannel4) {
                                                    }
                                                    byteBufferChannel7.restoreStateAfterWrite$ktor_io();
                                                    byteBufferChannel7.tryTerminate$ktor_io();
                                                    byteBufferChannelInternals24 = byteBufferChannelInternals23;
                                                    longRef = longRef2;
                                                    j6 = j4;
                                                    byteBufferChannel4 = byteBufferChannel8;
                                                    if (byteBufferChannelInternals24 != null) {
                                                    }
                                                    if (longRef.element < j6) {
                                                    }
                                                } else {
                                                    try {
                                                        byteBufferChannel11.prepareBuffer(byteBuffer, byteBufferChannel11.writePosition, i4);
                                                        Ref.IntRef intRef = new Ref.IntRef();
                                                        int i5 = i4;
                                                        byteBuffer2 = byteBufferChannel9.setupStateForRead();
                                                        if (byteBuffer2 != null) {
                                                            z4 = z;
                                                            byteBufferChannel23 = byteBufferChannel22;
                                                        } else {
                                                            try {
                                                                z4 = z;
                                                                RingBufferCapacity ringBufferCapacity7 = byteBufferChannel9.getState().capacity;
                                                                if (ringBufferCapacity7._availableForRead$internal == 0) {
                                                                    try {
                                                                        byteBufferChannel9.restoreStateAfterRead();
                                                                        byteBufferChannel9.tryTerminate$ktor_io();
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        ringBufferCapacity = ringBufferCapacity2;
                                                                        byteBufferChannel6 = byteBufferChannel10;
                                                                        if (!ringBufferCapacity.isFull()) {
                                                                        }
                                                                        if (byteBufferChannel7 != byteBufferChannel6) {
                                                                        }
                                                                        byteBufferChannel7.restoreStateAfterWrite$ktor_io();
                                                                        byteBufferChannel7.tryTerminate$ktor_io();
                                                                        throw th;
                                                                    }
                                                                } else {
                                                                    try {
                                                                        try {
                                                                            int iTryWriteAtMost = ringBufferCapacity3.tryWriteAtMost((int) Math.min(byteBuffer2.remaining(), Math.min(byteBuffer.remaining(), j4 - longRef2.element)));
                                                                            if (iTryWriteAtMost > 0) {
                                                                                if (!ringBufferCapacity7.tryReadExact(iTryWriteAtMost)) {
                                                                                    throw new AssertionError();
                                                                                }
                                                                                byteBuffer2.limit(byteBuffer2.position() + iTryWriteAtMost);
                                                                                byteBuffer.put(byteBuffer2);
                                                                                intRef.element = iTryWriteAtMost;
                                                                                byteBufferChannel9.bytesRead(byteBuffer2, ringBufferCapacity7, iTryWriteAtMost);
                                                                            }
                                                                            byteBufferChannel9.restoreStateAfterRead();
                                                                            byteBufferChannel9.tryTerminate$ktor_io();
                                                                            i = intRef.element;
                                                                            if (i <= 0) {
                                                                                byteBufferChannelInternals23 = byteBufferChannelInternals25;
                                                                                z = z4;
                                                                                byteBufferChannel22 = byteBufferChannel23;
                                                                                byteBufferChannel4 = byteBufferChannel10;
                                                                                byteBufferChannel7 = byteBufferChannel12;
                                                                                j5 = j7;
                                                                                ringBufferCapacity6 = ringBufferCapacity4;
                                                                                if (!ringBufferCapacity6.isFull()) {
                                                                                }
                                                                                byteBufferChannel7.flush();
                                                                                if (byteBufferChannel7 != byteBufferChannel4) {
                                                                                }
                                                                                byteBufferChannel7.restoreStateAfterWrite$ktor_io();
                                                                                byteBufferChannel7.tryTerminate$ktor_io();
                                                                                byteBufferChannelInternals24 = byteBufferChannelInternals23;
                                                                                longRef = longRef2;
                                                                                j6 = j4;
                                                                                byteBufferChannel4 = byteBufferChannel8;
                                                                                if (byteBufferChannelInternals24 != null) {
                                                                                }
                                                                                if (longRef.element < j6) {
                                                                                }
                                                                            } else {
                                                                                try {
                                                                                    byteBufferChannel11.bytesWritten(byteBuffer, ringBufferCapacity3, i);
                                                                                    long j13 = longRef2.element;
                                                                                    int i6 = intRef.element;
                                                                                    longRef2.element = j13 + i6;
                                                                                    if (i5 - i6 == 0 || z4) {
                                                                                        byteBufferChannel11.flush();
                                                                                        byteBufferChannelInternals22 = byteBufferChannelInternals25;
                                                                                        byteBufferChannel22 = byteBufferChannel23;
                                                                                        byteBufferChannel4 = byteBufferChannel10;
                                                                                        j12 = j4;
                                                                                        byteBufferChannel7 = byteBufferChannel12;
                                                                                        j11 = j7;
                                                                                        ringBufferCapacity6 = ringBufferCapacity4;
                                                                                        obj3 = obj;
                                                                                        ringBufferCapacity5 = ringBufferCapacity3;
                                                                                        byteBufferChannel16 = byteBufferChannel9;
                                                                                        byteBufferChannel17 = byteBufferChannel11;
                                                                                        byteBufferChannel18 = byteBufferChannel8;
                                                                                    } else {
                                                                                        byteBufferChannelInternals22 = byteBufferChannelInternals25;
                                                                                        byteBufferChannel22 = byteBufferChannel23;
                                                                                        byteBufferChannel4 = byteBufferChannel10;
                                                                                        j12 = j4;
                                                                                        byteBufferChannel7 = byteBufferChannel12;
                                                                                        j11 = j7;
                                                                                        ringBufferCapacity6 = ringBufferCapacity4;
                                                                                        obj3 = obj;
                                                                                        ringBufferCapacity5 = ringBufferCapacity3;
                                                                                        byteBufferChannel16 = byteBufferChannel9;
                                                                                        byteBufferChannel17 = byteBufferChannel11;
                                                                                        byteBufferChannel18 = byteBufferChannel8;
                                                                                    }
                                                                                    if (longRef2.element < j12) {
                                                                                    }
                                                                                } catch (Throwable th4) {
                                                                                    th = th4;
                                                                                    byteBufferChannel6 = byteBufferChannel10;
                                                                                    byteBufferChannel7 = byteBufferChannel12;
                                                                                    j3 = j7;
                                                                                    ringBufferCapacity = ringBufferCapacity4;
                                                                                    if (!ringBufferCapacity.isFull() || byteBufferChannel7.getAutoFlush()) {
                                                                                        byteBufferChannel7.flush();
                                                                                    }
                                                                                    if (byteBufferChannel7 != byteBufferChannel6) {
                                                                                        byteBufferChannel6.setTotalBytesWritten$ktor_io(byteBufferChannel6.getTotalBytesWritten() + (byteBufferChannel7.getTotalBytesWritten() - j3));
                                                                                    }
                                                                                    byteBufferChannel7.restoreStateAfterWrite$ktor_io();
                                                                                    byteBufferChannel7.tryTerminate$ktor_io();
                                                                                    throw th;
                                                                                }
                                                                            }
                                                                        } catch (Throwable th5) {
                                                                            th = th5;
                                                                            byteBufferChannel9.restoreStateAfterRead();
                                                                            byteBufferChannel9.tryTerminate$ktor_io();
                                                                            throw th;
                                                                        }
                                                                        byteBufferChannel8 = byteBufferChannel5;
                                                                        ringBufferCapacity4 = ringBufferCapacity2;
                                                                    } catch (Throwable th6) {
                                                                        th = th6;
                                                                        byteBufferChannel8 = byteBufferChannel5;
                                                                        ringBufferCapacity4 = ringBufferCapacity2;
                                                                        byteBufferChannel9.restoreStateAfterRead();
                                                                        byteBufferChannel9.tryTerminate$ktor_io();
                                                                        throw th;
                                                                    }
                                                                    byteBufferChannel12 = byteBufferChannel7;
                                                                    j7 = j3;
                                                                }
                                                            } catch (Throwable th7) {
                                                                th = th7;
                                                                byteBufferChannel12 = byteBufferChannel7;
                                                                j7 = j3;
                                                            }
                                                            byteBufferChannel23 = byteBufferChannel22;
                                                        }
                                                        byteBufferChannel12 = byteBufferChannel7;
                                                        j7 = j3;
                                                        byteBufferChannel8 = byteBufferChannel5;
                                                        ringBufferCapacity4 = ringBufferCapacity2;
                                                        i = intRef.element;
                                                        if (i <= 0) {
                                                        }
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        byteBufferChannel8 = byteBufferChannel5;
                                                        ringBufferCapacity4 = ringBufferCapacity2;
                                                        byteBufferChannel6 = byteBufferChannel10;
                                                    }
                                                    ByteBufferChannelInternals2 byteBufferChannelInternals211 = byteBufferChannelInternals26;
                                                    byteBufferChannel9 = byteBufferChannel13;
                                                    byteBufferChannelInternals25 = byteBufferChannelInternals211;
                                                    Object obj4 = coroutine_suspended;
                                                    i4 = ringBufferCapacity5._availableForWrite$internal;
                                                    obj = obj4;
                                                    ringBufferCapacity3 = ringBufferCapacity5;
                                                    byteBufferChannel10 = byteBufferChannel4;
                                                    ringBufferCapacity2 = ringBufferCapacity;
                                                    byteBufferChannel22 = byteBufferChannel2;
                                                }
                                            } catch (Throwable th9) {
                                                th = th9;
                                                byteBufferChannel6 = byteBufferChannel4;
                                                if (!ringBufferCapacity.isFull()) {
                                                }
                                                if (byteBufferChannel7 != byteBufferChannel6) {
                                                }
                                                byteBufferChannel7.restoreStateAfterWrite$ktor_io();
                                                byteBufferChannel7.tryTerminate$ktor_io();
                                                throw th;
                                            }
                                        } catch (Throwable th10) {
                                            th = th10;
                                            ringBufferCapacity = ringBufferCapacity6;
                                            byteBufferChannel6 = byteBufferChannel4;
                                            j3 = j8;
                                            if (!ringBufferCapacity.isFull()) {
                                                byteBufferChannel7.flush();
                                            }
                                            if (byteBufferChannel7 != byteBufferChannel6) {
                                            }
                                            byteBufferChannel7.restoreStateAfterWrite$ktor_io();
                                            byteBufferChannel7.tryTerminate$ktor_io();
                                            throw th;
                                        }
                                        byteBufferChannel14 = byteBufferChannel18;
                                        byteBufferChannelInternals27 = byteBufferChannelInternals22;
                                        j8 = j11;
                                    } else {
                                        z = z4;
                                        ByteBufferChannel byteBufferChannel20 = byteBufferChannel18;
                                        long j14 = j11;
                                        ByteBufferChannel byteBufferChannel21 = byteBufferChannel16;
                                        obj = obj3;
                                        j4 = j12;
                                        ringBufferCapacity3 = ringBufferCapacity5;
                                        byteBufferChannel5 = byteBufferChannel20;
                                        byteBufferChannel10 = byteBufferChannel4;
                                        ringBufferCapacity2 = ringBufferCapacity6;
                                        j3 = j14;
                                        byteBufferChannel11 = byteBufferChannel17;
                                        byteBufferChannel9 = byteBufferChannel21;
                                        byteBufferChannelInternals25 = byteBufferChannelInternals22;
                                        byteBufferChannel11.prepareBuffer(byteBuffer, byteBufferChannel11.writePosition, i4);
                                        Ref.IntRef intRef2 = new Ref.IntRef();
                                        int i52 = i4;
                                        byteBuffer2 = byteBufferChannel9.setupStateForRead();
                                        if (byteBuffer2 != null) {
                                        }
                                        byteBufferChannel12 = byteBufferChannel7;
                                        j7 = j3;
                                        byteBufferChannel8 = byteBufferChannel5;
                                        ringBufferCapacity4 = ringBufferCapacity2;
                                        i = intRef2.element;
                                        if (i <= 0) {
                                        }
                                    }
                                } else {
                                    z = z4;
                                    ByteBufferChannel byteBufferChannel24 = byteBufferChannel18;
                                    long j15 = j11;
                                    ByteBufferChannel byteBufferChannel25 = byteBufferChannel16;
                                    obj = obj3;
                                    byteBufferChannel9 = byteBufferChannel25;
                                    byteBufferChannel8 = byteBufferChannel24;
                                    j4 = j12;
                                    j5 = j15;
                                    byteBufferChannelInternals23 = byteBufferChannelInternals22;
                                    try {
                                        if (!ringBufferCapacity6.isFull() || byteBufferChannel7.getAutoFlush()) {
                                            byteBufferChannel7.flush();
                                        }
                                        if (byteBufferChannel7 != byteBufferChannel4) {
                                            byteBufferChannel4.setTotalBytesWritten$ktor_io(byteBufferChannel4.getTotalBytesWritten() + (byteBufferChannel7.getTotalBytesWritten() - j5));
                                        }
                                        byteBufferChannel7.restoreStateAfterWrite$ktor_io();
                                        byteBufferChannel7.tryTerminate$ktor_io();
                                        byteBufferChannelInternals24 = byteBufferChannelInternals23;
                                        longRef = longRef2;
                                        j6 = j4;
                                        byteBufferChannel4 = byteBufferChannel8;
                                        if (byteBufferChannelInternals24 != null) {
                                        }
                                        if (longRef.element < j6) {
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                        byteBufferChannel3 = byteBufferChannel8;
                                        byteBufferChannel3.close(th);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th12) {
                                th = th12;
                                byteBufferChannel14 = byteBufferChannel18;
                                j8 = j11;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            byteBufferChannel7 = byteBufferChannelResolveDelegation;
                            ringBufferCapacity = ringBufferCapacity6;
                            j3 = totalBytesWritten;
                            byteBufferChannel6 = byteBufferChannel4;
                            if (!ringBufferCapacity.isFull()) {
                            }
                            if (byteBufferChannel7 != byteBufferChannel6) {
                            }
                            byteBufferChannel7.restoreStateAfterWrite$ktor_io();
                            byteBufferChannel7.tryTerminate$ktor_io();
                            throw th;
                        }
                    }
                }
                if (z) {
                    byteBufferChannel4.flush();
                }
                return boxing.boxLong(longRef.element);
            }
            j3 = byteBufferChannel2.J$1;
            boolean z5 = byteBufferChannel2.Z$0;
            long j16 = byteBufferChannel2.J$0;
            ByteBufferChannel byteBufferChannel26 = (ByteBufferChannel) byteBufferChannel2.L$9;
            ByteBuffer byteBuffer3 = (ByteBuffer) byteBufferChannel2.L$8;
            ringBufferCapacity5 = (RingBufferCapacity) byteBufferChannel2.L$7;
            ringBufferCapacity = (RingBufferCapacity) byteBufferChannel2.L$6;
            byteBufferChannel7 = (ByteBufferChannel) byteBufferChannel2.L$5;
            byteBufferChannel6 = (ByteBufferChannel) byteBufferChannel2.L$4;
            longRef2 = (Ref.LongRef) byteBufferChannel2.L$3;
            ByteBufferChannelInternals2 byteBufferChannelInternals212 = (ByteBufferChannelInternals2) byteBufferChannel2.L$2;
            ByteBufferChannel byteBufferChannel27 = (ByteBufferChannel) byteBufferChannel2.L$1;
            ByteBufferChannel byteBufferChannel28 = (ByteBufferChannel) byteBufferChannel2.L$0;
            try {
                ResultKt.throwOnFailure(obj2);
                byteBufferChannel5 = byteBufferChannel28;
                j4 = j16;
                byteBufferChannel11 = byteBufferChannel26;
                byteBufferChannel4 = byteBufferChannel6;
                byteBufferChannelInternals26 = byteBufferChannelInternals212;
                byteBuffer = byteBuffer3;
                z = z5;
                byteBufferChannel13 = byteBufferChannel27;
                if (byteBufferChannel11.joining == null) {
                }
            } catch (Throwable th14) {
                th = th14;
                if (!ringBufferCapacity.isFull()) {
                }
                if (byteBufferChannel7 != byteBufferChannel6) {
                }
                byteBufferChannel7.restoreStateAfterWrite$ktor_io();
                byteBufferChannel7.tryTerminate$ktor_io();
                throw th;
            }
        } catch (Throwable th15) {
            th = th15;
        }
    }

    private final void ensureClosedJoined(ByteBufferChannelInternals2 joined) {
        ByteBufferChannelInternals closed = getClosed();
        if (closed == null) {
            return;
        }
        this.joining = null;
        if (!joined.getDelegateClose()) {
            joined.getDelegatedTo().flush();
            joined.complete();
            return;
        }
        ReadWriteBufferState state = joined.getDelegatedTo().getState();
        boolean z = (state instanceof ReadWriteBufferState.Writing) || (state instanceof ReadWriteBufferState.ReadingWriting);
        if (closed.getCause() != null || !z) {
            joined.getDelegatedTo().close(closed.getCause());
        } else {
            joined.getDelegatedTo().flush();
        }
        joined.complete();
    }

    static /* synthetic */ Object writeFully$suspendImpl(ByteBufferChannel byteBufferChannel, byte[] bArr, int i, int i2, Continuation<? super Unit> continuation) throws Throwable {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        ByteBufferChannelInternals2 byteBufferChannelInternals2 = byteBufferChannel.joining;
        if (byteBufferChannelInternals2 != null && (byteBufferChannelResolveDelegation = byteBufferChannel.resolveDelegation(byteBufferChannel, byteBufferChannelInternals2)) != null) {
            Object objWriteFully = byteBufferChannelResolveDelegation.writeFully(bArr, i, i2, continuation);
            return objWriteFully == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteFully : Unit.INSTANCE;
        }
        while (i2 > 0) {
            int iWriteAsMuchAsPossible = byteBufferChannel.writeAsMuchAsPossible(bArr, i, i2);
            if (iWriteAsMuchAsPossible == 0) {
                break;
            }
            i += iWriteAsMuchAsPossible;
            i2 -= iWriteAsMuchAsPossible;
        }
        if (i2 == 0) {
            return Unit.INSTANCE;
        }
        Object objWriteFullySuspend = byteBufferChannel.writeFullySuspend(bArr, i, i2, continuation);
        return objWriteFullySuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteFullySuspend : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0054 -> B:20:0x0057). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeFullySuspend(byte[] bArr, int i, int i2, Continuation<? super Unit> continuation) {
        C456225 c456225;
        ByteBufferChannel byteBufferChannel;
        if (continuation instanceof C456225) {
            c456225 = (C456225) continuation;
            int i3 = c456225.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c456225.label = i3 - Integer.MIN_VALUE;
            } else {
                c456225 = new C456225(continuation);
            }
        }
        Object objWriteAvailable = c456225.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c456225.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objWriteAvailable);
            byteBufferChannel = this;
            if (i2 > 0) {
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = c456225.I$1;
            i = c456225.I$0;
            byte[] bArr2 = (byte[]) c456225.L$1;
            byteBufferChannel = (ByteBufferChannel) c456225.L$0;
            ResultKt.throwOnFailure(objWriteAvailable);
            int iIntValue = ((Number) objWriteAvailable).intValue();
            i += iIntValue;
            byte[] bArr3 = bArr2;
            i2 = i5 - iIntValue;
            bArr = bArr3;
            if (i2 > 0) {
                c456225.L$0 = byteBufferChannel;
                c456225.L$1 = bArr;
                c456225.I$0 = i;
                c456225.I$1 = i2;
                c456225.label = 1;
                objWriteAvailable = byteBufferChannel.writeAvailable(bArr, i, i2, c456225);
                if (objWriteAvailable == coroutine_suspended) {
                    return coroutine_suspended;
                }
                int i6 = i2;
                bArr2 = bArr;
                i5 = i6;
                int iIntValue2 = ((Number) objWriteAvailable).intValue();
                i += iIntValue2;
                byte[] bArr32 = bArr2;
                i2 = i5 - iIntValue2;
                bArr = bArr32;
                if (i2 > 0) {
                    return Unit.INSTANCE;
                }
            }
        }
    }

    static /* synthetic */ Object writeAvailable$suspendImpl(ByteBufferChannel byteBufferChannel, byte[] bArr, int i, int i2, Continuation<? super Integer> continuation) throws Throwable {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        ByteBufferChannelInternals2 byteBufferChannelInternals2 = byteBufferChannel.joining;
        if (byteBufferChannelInternals2 != null && (byteBufferChannelResolveDelegation = byteBufferChannel.resolveDelegation(byteBufferChannel, byteBufferChannelInternals2)) != null) {
            return byteBufferChannelResolveDelegation.writeAvailable(bArr, i, i2, continuation);
        }
        int iWriteAsMuchAsPossible = byteBufferChannel.writeAsMuchAsPossible(bArr, i, i2);
        if (iWriteAsMuchAsPossible > 0) {
            return boxing.boxInt(iWriteAsMuchAsPossible);
        }
        return byteBufferChannel.writeSuspend(bArr, i, i2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[PHI: r2 r7 r8 r9
      0x005c: PHI (r2v3 io.ktor.utils.io.ByteBufferChannel) = (r2v2 io.ktor.utils.io.ByteBufferChannel), (r2v6 io.ktor.utils.io.ByteBufferChannel) binds: [B:19:0x0059, B:16:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r7v2 byte[]) = (r7v1 byte[]), (r7v6 byte[]) binds: [B:19:0x0059, B:16:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:19:0x0059, B:16:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r9v2 int) = (r9v1 int), (r9v5 int) binds: [B:19:0x0059, B:16:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0059 -> B:21:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeSuspend(byte[] bArr, int i, int i2, Continuation<? super Integer> continuation) throws Throwable {
        C456241 c456241;
        ByteBufferChannel byteBufferChannel;
        ByteBufferChannel byteBufferChannelResolveDelegation;
        if (continuation instanceof C456241) {
            c456241 = (C456241) continuation;
            int i3 = c456241.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c456241.label = i3 - Integer.MIN_VALUE;
            } else {
                c456241 = new C456241(continuation);
            }
        }
        Object obj = c456241.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c456241.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            byteBufferChannel = this;
            c456241.L$0 = byteBufferChannel;
            c456241.L$1 = bArr;
            c456241.I$0 = i;
            c456241.I$1 = i2;
            c456241.label = 1;
            if (byteBufferChannel.tryWriteSuspend$ktor_io(1, c456241) != coroutine_suspended) {
            }
        }
        if (i4 != 1) {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        int i5 = c456241.I$1;
        i = c456241.I$0;
        byte[] bArr2 = (byte[]) c456241.L$1;
        byteBufferChannel = (ByteBufferChannel) c456241.L$0;
        ResultKt.throwOnFailure(obj);
        i2 = i5;
        bArr = bArr2;
        ByteBufferChannelInternals2 byteBufferChannelInternals2 = byteBufferChannel.joining;
        if (byteBufferChannelInternals2 == null && (byteBufferChannelResolveDelegation = byteBufferChannel.resolveDelegation(byteBufferChannel, byteBufferChannelInternals2)) != null) {
            c456241.L$0 = null;
            c456241.L$1 = null;
            c456241.label = 2;
            Object objWriteSuspend = byteBufferChannelResolveDelegation.writeSuspend(bArr, i, i2, c456241);
            return objWriteSuspend == coroutine_suspended ? coroutine_suspended : objWriteSuspend;
        }
        int iWriteAsMuchAsPossible = byteBufferChannel.writeAsMuchAsPossible(bArr, i, i2);
        if (iWriteAsMuchAsPossible > 0) {
            return boxing.boxInt(iWriteAsMuchAsPossible);
        }
        c456241.L$0 = byteBufferChannel;
        c456241.L$1 = bArr;
        c456241.I$0 = i;
        c456241.I$1 = i2;
        c456241.label = 1;
        if (byteBufferChannel.tryWriteSuspend$ktor_io(1, c456241) != coroutine_suspended) {
            ByteBufferChannelInternals2 byteBufferChannelInternals22 = byteBufferChannel.joining;
            if (byteBufferChannelInternals22 == null) {
            }
            int iWriteAsMuchAsPossible2 = byteBufferChannel.writeAsMuchAsPossible(bArr, i, i2);
            if (iWriteAsMuchAsPossible2 > 0) {
            }
            c456241.L$0 = byteBufferChannel;
            c456241.L$1 = bArr;
            c456241.I$0 = i;
            c456241.I$1 = i2;
            c456241.label = 1;
            if (byteBufferChannel.tryWriteSuspend$ktor_io(1, c456241) != coroutine_suspended) {
            }
        }
    }

    @Override // io.ktor.utils.p478io.WriterSession2
    public WriterSession4 beginWriteSession() {
        WriteSessionImpl writeSessionImpl = this.writeSession;
        writeSessionImpl.begin();
        return writeSessionImpl;
    }

    @Override // io.ktor.utils.p478io.WriterSession2
    public void endWriteSession(int written) {
        this.writeSession.written(written);
        this.writeSession.complete();
    }

    static /* synthetic */ Object writePacket$suspendImpl(ByteBufferChannel byteBufferChannel, ByteReadPacket byteReadPacket, Continuation<? super Unit> continuation) {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        ByteBufferChannel byteBufferChannelResolveDelegation2;
        ByteBufferChannelInternals2 byteBufferChannelInternals2 = byteBufferChannel.joining;
        if (byteBufferChannelInternals2 != null && (byteBufferChannelResolveDelegation2 = byteBufferChannel.resolveDelegation(byteBufferChannel, byteBufferChannelInternals2)) != null) {
            Object objWritePacket = byteBufferChannelResolveDelegation2.writePacket(byteReadPacket, continuation);
            return objWritePacket == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWritePacket : Unit.INSTANCE;
        }
        while (!byteReadPacket.getEndOfInput() && byteBufferChannel.tryWritePacketPart(byteReadPacket) != 0) {
            try {
            } catch (Throwable th) {
                byteReadPacket.release();
                throw th;
            }
        }
        if (byteReadPacket.getRemaining() > 0) {
            ByteBufferChannelInternals2 byteBufferChannelInternals22 = byteBufferChannel.joining;
            if (byteBufferChannelInternals22 == null || (byteBufferChannelResolveDelegation = byteBufferChannel.resolveDelegation(byteBufferChannel, byteBufferChannelInternals22)) == null) {
                Object objWritePacketSuspend = byteBufferChannel.writePacketSuspend(byteReadPacket, continuation);
                return objWritePacketSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWritePacketSuspend : Unit.INSTANCE;
            }
            Object objWritePacket2 = byteBufferChannelResolveDelegation.writePacket(byteReadPacket, continuation);
            return objWritePacket2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWritePacket2 : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        if (r7.writePacket(r6, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002c, B:35:0x0075, B:20:0x0042, B:28:0x005d, B:30:0x0061, B:32:0x0067, B:38:0x007b, B:23:0x004a, B:25:0x0050), top: B:44:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005a -> B:28:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writePacketSuspend(ByteReadPacket byteReadPacket, Continuation<? super Unit> continuation) {
        C456231 c456231;
        ByteBufferChannel byteBufferChannel;
        if (continuation instanceof C456231) {
            c456231 = (C456231) continuation;
            int i = c456231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c456231.label = i - Integer.MIN_VALUE;
            } else {
                c456231 = new C456231(continuation);
            }
        }
        Object obj = c456231.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c456231.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                byteBufferChannel = this;
                if (!byteReadPacket.getEndOfInput()) {
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteReadPacket = (ByteReadPacket) c456231.L$0;
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                byteReadPacket = (ByteReadPacket) c456231.L$1;
                byteBufferChannel = (ByteBufferChannel) c456231.L$0;
                ResultKt.throwOnFailure(obj);
                ByteBufferChannelInternals2 byteBufferChannelInternals2 = byteBufferChannel.joining;
                if (byteBufferChannelInternals2 != null || (r7 = byteBufferChannel.resolveDelegation(byteBufferChannel, byteBufferChannelInternals2)) == null) {
                    byteBufferChannel.tryWritePacketPart(byteReadPacket);
                    if (!byteReadPacket.getEndOfInput()) {
                        c456231.L$0 = byteBufferChannel;
                        c456231.L$1 = byteReadPacket;
                        c456231.label = 1;
                        if (byteBufferChannel.writeSuspend(1, c456231) != coroutine_suspended) {
                            ByteBufferChannelInternals2 byteBufferChannelInternals22 = byteBufferChannel.joining;
                            if (byteBufferChannelInternals22 != null) {
                            }
                            byteBufferChannel.tryWritePacketPart(byteReadPacket);
                            if (!byteReadPacket.getEndOfInput()) {
                                byteReadPacket.release();
                                return Unit.INSTANCE;
                            }
                        }
                        return coroutine_suspended;
                    }
                } else {
                    c456231.L$0 = byteReadPacket;
                    c456231.L$1 = null;
                    c456231.label = 2;
                }
            }
        } finally {
            byteReadPacket.release();
        }
    }

    static /* synthetic */ Object readRemaining$suspendImpl(ByteBufferChannel byteBufferChannel, long j, Continuation<? super ByteReadPacket> continuation) throws Throwable {
        if (byteBufferChannel.isClosedForWrite()) {
            Throwable closedCause = byteBufferChannel.getClosedCause();
            if (closedCause != null) {
                ByteBufferChannel4.rethrowClosed(closedCause);
                throw new ExceptionsH();
            }
            return byteBufferChannel.remainingPacket(j);
        }
        return byteBufferChannel.readRemainingSuspend(j, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:12:0x0039, B:32:0x00a4, B:37:0x00b2, B:21:0x0062, B:23:0x0072, B:24:0x0076, B:26:0x008a, B:28:0x0090), top: B:53:0x0039, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:12:0x0039, B:32:0x00a4, B:37:0x00b2, B:21:0x0062, B:23:0x0072, B:24:0x0076, B:26:0x008a, B:28:0x0090), top: B:53:0x0039, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:12:0x0039, B:32:0x00a4, B:37:0x00b2, B:21:0x0062, B:23:0x0072, B:24:0x0076, B:26:0x008a, B:28:0x0090), top: B:53:0x0039, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7 A[Catch: all -> 0x00c5, TRY_ENTER, TryCatch #0 {all -> 0x00c5, blocks: (B:39:0x00b7, B:41:0x00c0, B:45:0x00c9, B:46:0x00ca, B:47:0x00cd, B:12:0x0039, B:32:0x00a4, B:37:0x00b2, B:21:0x0062, B:23:0x0072, B:24:0x0076, B:26:0x008a, B:28:0x0090), top: B:52:0x0021, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a3 -> B:32:0x00a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00af -> B:36:0x00b0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readRemainingSuspend(long j, Continuation<? super ByteReadPacket> continuation) throws Throwable {
        C456171 c456171;
        BytePacketBuilder bytePacketBuilder;
        Throwable th;
        BytePacketBuilder bytePacketBuilder2;
        ByteBufferChannel byteBufferChannel;
        ChunkBuffer chunkBufferPrepareWriteHead;
        Ref.LongRef longRef;
        Output output;
        boolean z;
        Output output2;
        long limit;
        long j2;
        long asMuchAsPossible$default;
        Output output3;
        if (continuation instanceof C456171) {
            c456171 = (C456171) continuation;
            int i = c456171.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c456171.label = i - Integer.MIN_VALUE;
            } else {
                c456171 = new C456171(continuation);
            }
        }
        Object suspend = c456171.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c456171.label;
        int i3 = 1;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(suspend);
                bytePacketBuilder2 = new BytePacketBuilder(null, i3, false ? 1 : 0);
                try {
                    Ref.LongRef longRef2 = new Ref.LongRef();
                    longRef2.element = j;
                    byteBufferChannel = this;
                    chunkBufferPrepareWriteHead = Unsafe.prepareWriteHead(bytePacketBuilder2, 1, null);
                    BytePacketBuilder bytePacketBuilder3 = bytePacketBuilder2;
                    longRef = longRef2;
                    bytePacketBuilder = bytePacketBuilder3;
                    output2 = bytePacketBuilder3;
                    limit = chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition();
                    j2 = longRef.element;
                    if (limit > j2) {
                    }
                    asMuchAsPossible$default = longRef.element - readAsMuchAsPossible$default(byteBufferChannel, chunkBufferPrepareWriteHead, 0, 0, 6, null);
                    longRef.element = asMuchAsPossible$default;
                    output = output2;
                    if (asMuchAsPossible$default > 0) {
                    }
                    z = false;
                    output3 = output;
                    if (!z) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bytePacketBuilder2.release();
                    throw th;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ChunkBuffer chunkBuffer = (ChunkBuffer) c456171.L$4;
                Output output4 = (Output) c456171.L$3;
                longRef = (Ref.LongRef) c456171.L$2;
                bytePacketBuilder = (BytePacketBuilder) c456171.L$1;
                byteBufferChannel = (ByteBufferChannel) c456171.L$0;
                try {
                    ResultKt.throwOnFailure(suspend);
                    output4 = output4;
                    chunkBufferPrepareWriteHead = chunkBuffer;
                    output = output4;
                    if (((Boolean) suspend).booleanValue()) {
                        z = false;
                        output3 = output;
                    } else {
                        z = true;
                        output3 = output4;
                    }
                    if (!z) {
                        chunkBufferPrepareWriteHead = Unsafe.prepareWriteHead(output3, 1, chunkBufferPrepareWriteHead);
                        output2 = output3;
                        limit = chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition();
                        j2 = longRef.element;
                        if (limit > j2) {
                            chunkBufferPrepareWriteHead.resetForWrite((int) j2);
                        }
                        asMuchAsPossible$default = longRef.element - readAsMuchAsPossible$default(byteBufferChannel, chunkBufferPrepareWriteHead, 0, 0, 6, null);
                        longRef.element = asMuchAsPossible$default;
                        output = output2;
                        if (asMuchAsPossible$default > 0) {
                            output = output2;
                            if (!byteBufferChannel.isClosedForRead()) {
                                c456171.L$0 = byteBufferChannel;
                                c456171.L$1 = bytePacketBuilder;
                                c456171.L$2 = longRef;
                                c456171.L$3 = output2;
                                c456171.L$4 = chunkBufferPrepareWriteHead;
                                c456171.label = 1;
                                suspend = byteBufferChannel.readSuspend(1, c456171);
                                if (suspend == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                chunkBuffer = chunkBufferPrepareWriteHead;
                                output4 = output2;
                                chunkBufferPrepareWriteHead = chunkBuffer;
                                output = output4;
                                if (((Boolean) suspend).booleanValue()) {
                                }
                                if (!z) {
                                    output3.afterHeadWrite();
                                    Throwable closedCause = byteBufferChannel.getClosedCause();
                                    if (closedCause == null) {
                                        return bytePacketBuilder.build();
                                    }
                                    throw closedCause;
                                }
                            }
                        }
                        z = false;
                        output3 = output;
                        if (!z) {
                        }
                    }
                } catch (Throwable th3) {
                    output4.afterHeadWrite();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            bytePacketBuilder2 = bytePacketBuilder;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resumeReadOp() {
        Continuation continuation = (Continuation) _readOp$FU.getAndSet(this, null);
        if (continuation != null) {
            ByteBufferChannelInternals closed = getClosed();
            Throwable cause = closed != null ? closed.getCause() : null;
            if (cause != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(cause)));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                continuation.resumeWith(Result.m28550constructorimpl(Boolean.TRUE));
            }
        }
    }

    private final void resumeWriteOp() {
        Continuation<Unit> writeOp;
        ByteBufferChannelInternals closed;
        Object objCreateFailure;
        do {
            writeOp = getWriteOp();
            if (writeOp == null) {
                return;
            }
            closed = getClosed();
            if (closed == null && this.joining != null) {
                ReadWriteBufferState state = getState();
                if (!(state instanceof ReadWriteBufferState.Writing) && !(state instanceof ReadWriteBufferState.ReadingWriting) && state != ReadWriteBufferState.Terminated.INSTANCE) {
                    return;
                }
            }
        } while (!C2031xc40028dd.m363m(_writeOp$FU, this, writeOp, null));
        if (closed == null) {
            Result.Companion companion = Result.INSTANCE;
            objCreateFailure = Unit.INSTANCE;
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            objCreateFailure = ResultKt.createFailure(closed.getSendException());
        }
        writeOp.resumeWith(Result.m28550constructorimpl(objCreateFailure));
    }

    private final void resumeClosed(Throwable cause) {
        Continuation continuation = (Continuation) _readOp$FU.getAndSet(this, null);
        if (continuation != null) {
            if (cause != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(cause)));
            } else {
                continuation.resumeWith(Result.m28550constructorimpl(Boolean.valueOf(getState().capacity._availableForRead$internal > 0)));
            }
        }
        Continuation continuation2 = (Continuation) _writeOp$FU.getAndSet(this, null);
        if (continuation2 != null) {
            Result.Companion companion2 = Result.INSTANCE;
            if (cause == null) {
                cause = new ByteWriteChannel3("Byte channel was closed");
            }
            continuation2.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(cause)));
        }
    }

    private final Object readSuspend(int i, Continuation<? super Boolean> continuation) throws Throwable {
        if (getState().capacity._availableForRead$internal >= i) {
            return boxing.boxBoolean(true);
        }
        ByteBufferChannelInternals closed = getClosed();
        if (closed == null) {
            if (i == 1) {
                return readSuspendImpl(1, continuation);
            }
            return readSuspendLoop(i, continuation);
        }
        Throwable cause = closed.getCause();
        if (cause != null) {
            ByteBufferChannel4.rethrowClosed(cause);
            throw new ExceptionsH();
        }
        RingBufferCapacity ringBufferCapacity = getState().capacity;
        boolean z = ringBufferCapacity.flush() && ringBufferCapacity._availableForRead$internal >= i;
        if (getReadOp() != null) {
            throw new IllegalStateException("Read operation is already in progress");
        }
        return boxing.boxBoolean(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0092 -> B:39:0x0095). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readSuspendLoop(int i, Continuation<? super Boolean> continuation) throws Throwable {
        C456191 c456191;
        ByteBufferChannel byteBufferChannel;
        if (continuation instanceof C456191) {
            c456191 = (C456191) continuation;
            int i2 = c456191.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c456191.label = i2 - Integer.MIN_VALUE;
            } else {
                c456191 = new C456191(continuation);
            }
        }
        Object suspendImpl = c456191.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c456191.label;
        boolean z = false;
        if (i3 == 0) {
            ResultKt.throwOnFailure(suspendImpl);
            byteBufferChannel = this;
            if (byteBufferChannel.getState().capacity._availableForRead$internal >= i) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c456191.I$0;
            byteBufferChannel = (ByteBufferChannel) c456191.L$0;
            ResultKt.throwOnFailure(suspendImpl);
            if (!((Boolean) suspendImpl).booleanValue()) {
                return boxing.boxBoolean(false);
            }
            if (byteBufferChannel.getState().capacity._availableForRead$internal >= i) {
                ByteBufferChannelInternals closed = byteBufferChannel.getClosed();
                if (closed != null) {
                    if (closed.getCause() != null) {
                        ByteBufferChannel4.rethrowClosed(closed.getCause());
                        throw new ExceptionsH();
                    }
                    RingBufferCapacity ringBufferCapacity = byteBufferChannel.getState().capacity;
                    if (ringBufferCapacity.flush() && ringBufferCapacity._availableForRead$internal >= i) {
                        z = true;
                    }
                    if (byteBufferChannel.getReadOp() != null) {
                        throw new IllegalStateException("Read operation is already in progress");
                    }
                    return boxing.boxBoolean(z);
                }
                c456191.L$0 = byteBufferChannel;
                c456191.I$0 = i;
                c456191.label = 1;
                suspendImpl = byteBufferChannel.readSuspendImpl(i, c456191);
                if (suspendImpl == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (!((Boolean) suspendImpl).booleanValue()) {
                }
                if (byteBufferChannel.getState().capacity._availableForRead$internal >= i) {
                    return boxing.boxBoolean(true);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d1, code lost:
    
        r5 = kotlin.Result.INSTANCE;
        r6.resumeWith(kotlin.Result.m28550constructorimpl(java.lang.Boolean.TRUE));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object suspensionForSize(int size, Continuation<? super Boolean> continuation) {
        while (true) {
            ReadWriteBufferState state = getState();
            if (state.capacity._availableForRead$internal >= size || !(this.joining == null || getWriteOp() == null || (state != ReadWriteBufferState.IdleEmpty.INSTANCE && !(state instanceof ReadWriteBufferState.IdleNonEmpty)))) {
                break;
            }
            ByteBufferChannelInternals closed = getClosed();
            if (closed != null) {
                if (closed.getCause() != null) {
                    Result.Companion companion = Result.INSTANCE;
                    continuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(closed.getCause())));
                    return IntrinsicsKt.getCOROUTINE_SUSPENDED();
                }
                boolean zFlush = getState().capacity.flush();
                boolean z = false;
                boolean z2 = getState().capacity._availableForRead$internal >= size;
                Result.Companion companion2 = Result.INSTANCE;
                if (zFlush && z2) {
                    z = true;
                }
                continuation.resumeWith(Result.m28550constructorimpl(Boolean.valueOf(z)));
                return IntrinsicsKt.getCOROUTINE_SUSPENDED();
            }
            while (getReadOp() == null) {
                if (getClosed() == null) {
                    ReadWriteBufferState state2 = getState();
                    if (state2.capacity._availableForRead$internal >= size || !(this.joining == null || getWriteOp() == null || (state2 != ReadWriteBufferState.IdleEmpty.INSTANCE && !(state2 instanceof ReadWriteBufferState.IdleNonEmpty)))) {
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _readOp$FU;
                    if (C2031xc40028dd.m363m(atomicReferenceFieldUpdater, this, null, continuation)) {
                        if (getClosed() == null) {
                            ReadWriteBufferState state3 = getState();
                            if (state3.capacity._availableForRead$internal < size && (this.joining == null || getWriteOp() == null || (state3 != ReadWriteBufferState.IdleEmpty.INSTANCE && !(state3 instanceof ReadWriteBufferState.IdleNonEmpty)))) {
                                break;
                            }
                        }
                        if (!C2031xc40028dd.m363m(atomicReferenceFieldUpdater, this, continuation, null)) {
                            break;
                        }
                    }
                }
            }
            throw new IllegalStateException("Operation is already in progress");
        }
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readSuspendImpl(int i, Continuation<? super Boolean> continuation) throws Throwable {
        C456181 c456181;
        ByteBufferChannel byteBufferChannel;
        if (continuation instanceof C456181) {
            c456181 = (C456181) continuation;
            int i2 = c456181.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c456181.label = i2 - Integer.MIN_VALUE;
            } else {
                c456181 = new C456181(continuation);
            }
        }
        Object obj = c456181.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c456181.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            ReadWriteBufferState state = getState();
            if (state.capacity._availableForRead$internal >= i || (this.joining != null && getWriteOp() != null && (state == ReadWriteBufferState.IdleEmpty.INSTANCE || (state instanceof ReadWriteBufferState.IdleNonEmpty)))) {
                return boxing.boxBoolean(true);
            }
            try {
                c456181.L$0 = this;
                c456181.I$0 = i;
                c456181.label = 1;
                CancellableReusableContinuation<Boolean> cancellableReusableContinuation = this.readSuspendContinuationCache;
                suspensionForSize(i, cancellableReusableContinuation);
                Object objCompleteSuspendBlock = cancellableReusableContinuation.completeSuspendBlock(IntrinsicsKt.intercepted(c456181));
                if (objCompleteSuspendBlock == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbes.probeCoroutineSuspended(c456181);
                }
                return objCompleteSuspendBlock == coroutine_suspended ? coroutine_suspended : objCompleteSuspendBlock;
            } catch (Throwable th) {
                th = th;
                byteBufferChannel = this;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteBufferChannel = (ByteBufferChannel) c456181.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                return obj;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        byteBufferChannel.setReadOp(null);
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldResumeReadOp() {
        if (this.joining != null) {
            return getState() == ReadWriteBufferState.IdleEmpty.INSTANCE || (getState() instanceof ReadWriteBufferState.IdleNonEmpty);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean writeSuspendPredicate(int size) {
        ByteBufferChannelInternals2 byteBufferChannelInternals2 = this.joining;
        ReadWriteBufferState state = getState();
        if (getClosed() != null) {
            return false;
        }
        return byteBufferChannelInternals2 == null ? state.capacity._availableForWrite$internal < size && state != ReadWriteBufferState.IdleEmpty.INSTANCE : (state == ReadWriteBufferState.Terminated.INSTANCE || (state instanceof ReadWriteBufferState.Writing) || (state instanceof ReadWriteBufferState.ReadingWriting)) ? false : true;
    }

    public final Object tryWriteSuspend$ktor_io(int i, Continuation<? super Unit> continuation) throws Throwable {
        Throwable sendException;
        if (!writeSuspendPredicate(i)) {
            ByteBufferChannelInternals closed = getClosed();
            if (closed != null && (sendException = closed.getSendException()) != null) {
                ByteBufferChannel4.rethrowClosed(sendException);
                throw new ExceptionsH();
            }
            return Unit.INSTANCE;
        }
        this.writeSuspensionSize = i;
        if (this.attachedJob != null) {
            Object objInvoke = this.writeSuspension.invoke(continuation);
            if (objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbes.probeCoroutineSuspended(continuation);
            }
            return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
        }
        CancellableReusableContinuation<Unit> cancellableReusableContinuation = this.writeSuspendContinuationCache;
        this.writeSuspension.invoke(cancellableReusableContinuation);
        Object objCompleteSuspendBlock = cancellableReusableContinuation.completeSuspendBlock(IntrinsicsKt.intercepted(continuation));
        if (objCompleteSuspendBlock == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return objCompleteSuspendBlock == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCompleteSuspendBlock : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeSuspend(int i, Continuation<? super Unit> continuation) throws Throwable {
        C456253 c456253;
        ByteBufferChannel byteBufferChannel;
        Throwable sendException;
        if (continuation instanceof C456253) {
            c456253 = (C456253) continuation;
            int i2 = c456253.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c456253.label = i2 - Integer.MIN_VALUE;
            } else {
                c456253 = new C456253(continuation);
            }
        }
        Object obj = c456253.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c456253.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            byteBufferChannel = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c456253.I$0;
            byteBufferChannel = (ByteBufferChannel) c456253.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (byteBufferChannel.writeSuspendPredicate(i)) {
            c456253.L$0 = byteBufferChannel;
            c456253.I$0 = i;
            c456253.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(c456253), 1);
            cancellableContinuationImpl.initCancellability();
            byteBufferChannel.writeSuspendBlock(i, cancellableContinuationImpl);
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbes.probeCoroutineSuspended(c456253);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        ByteBufferChannelInternals closed = byteBufferChannel.getClosed();
        if (closed != null && (sendException = closed.getSendException()) != null) {
            ByteBufferChannel4.rethrowClosed(sendException);
            throw new ExceptionsH();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeSuspendBlock(int size, CancellableContinuation<? super Unit> c) throws Throwable {
        Throwable sendException;
        while (true) {
            ByteBufferChannelInternals closed = getClosed();
            if (closed != null && (sendException = closed.getSendException()) != null) {
                ByteBufferChannel4.rethrowClosed(sendException);
                throw new ExceptionsH();
            }
            if (!writeSuspendPredicate(size)) {
                Result.Companion companion = Result.INSTANCE;
                c.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
                break;
            }
            while (getWriteOp() == null) {
                if (!writeSuspendPredicate(size)) {
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _writeOp$FU;
                if (C2031xc40028dd.m363m(atomicReferenceFieldUpdater, this, null, c)) {
                    if (writeSuspendPredicate(size) || !C2031xc40028dd.m363m(atomicReferenceFieldUpdater, this, c, null)) {
                        break;
                    }
                }
            }
            throw new IllegalStateException("Operation is already in progress");
        }
        flushImpl(size);
        if (shouldResumeReadOp()) {
            resumeReadOp();
        }
    }

    private final ReadWriteBufferState.Initial newBuffer() {
        ReadWriteBufferState.Initial initialBorrow = this.pool.borrow();
        initialBorrow.capacity.resetForWrite();
        return initialBorrow;
    }

    private final void releaseBuffer(ReadWriteBufferState.Initial buffer) {
        this.pool.recycle(buffer);
    }

    public String toString() {
        return "ByteBufferChannel(" + hashCode() + ", " + getState() + ')';
    }
}
