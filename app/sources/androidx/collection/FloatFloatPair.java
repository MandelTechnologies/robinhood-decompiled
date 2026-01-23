package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FloatFloatPair.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t\u0088\u0001\b\u0092\u0001\u00020\u0007¨\u0006\n"}, m3636d2 = {"Landroidx/collection/FloatFloatPair;", "", "", "first", "second", "constructor-impl", "(FF)J", "", "packedValue", "(J)J", "collection"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class FloatFloatPair {
    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m4734constructorimpl(long j) {
        return j;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m4733constructorimpl(float f, float f2) {
        return m4734constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }
}
