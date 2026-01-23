package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.ConcurrentLinkedList3;

/* compiled from: ConcurrentLinkedList.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081@\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u0088\u0001\u0004\u0092\u0001\u0004\u0018\u00010\u0003¨\u0006\u0010"}, m3636d2 = {"Lkotlinx/coroutines/internal/SegmentOrClosed;", "Lkotlinx/coroutines/internal/Segment;", "S", "", "value", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "isClosed-impl", "(Ljava/lang/Object;)Z", "isClosed", "getSegment-impl", "(Ljava/lang/Object;)Lkotlinx/coroutines/internal/Segment;", "getSegment$annotations", "()V", "segment", "kotlinx-coroutines-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmInline
/* renamed from: kotlinx.coroutines.internal.SegmentOrClosed, reason: use source file name */
/* loaded from: classes23.dex */
public final class ConcurrentLinkedList4<S extends ConcurrentLinkedList3<S>> {
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <S extends ConcurrentLinkedList3<S>> Object m28836constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m28838isClosedimpl(Object obj) {
        return obj == ConcurrentLinkedList.CLOSED;
    }

    /* renamed from: getSegment-impl, reason: not valid java name */
    public static final S m28837getSegmentimpl(Object obj) {
        if (obj == ConcurrentLinkedList.CLOSED) {
            throw new IllegalStateException("Does not contain segment");
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (S) obj;
    }
}
