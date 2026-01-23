package io.ktor.utils.p478io.core.internal;

import kotlin.Metadata;
import kotlin.UShort;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: EncodeResult.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0081@\u0018\u00002\u00020\u0001B\u001c\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006B\u0012\u0012\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\tJ\u0019\u0010\f\u001a\u00020\u0002H\u0086\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u0002H\u0086\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028Fø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028Fø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000b\u0088\u0001\b\u0092\u0001\u00020\u0007ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, m3636d2 = {"Lio/ktor/utils/io/core/internal/EncodeResult;", "", "Lkotlin/UShort;", "characters", "bytes", "constructor-impl", "(SS)I", "", "value", "(I)I", "component1-Mh2AYeg", "(I)S", "component1", "component2-Mh2AYeg", "component2", "getCharacters-Mh2AYeg", "getBytes-Mh2AYeg", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class EncodeResult {
    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m28487constructorimpl(int i) {
        return i;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m28488constructorimpl(short s, short s2) {
        return m28487constructorimpl(((s & 65535) << 16) | (s2 & 65535));
    }

    /* renamed from: getCharacters-Mh2AYeg, reason: not valid java name */
    public static final short m28490getCharactersMh2AYeg(int i) {
        return UShort.m28629constructorimpl((short) (i >>> 16));
    }

    /* renamed from: getBytes-Mh2AYeg, reason: not valid java name */
    public static final short m28489getBytesMh2AYeg(int i) {
        return UShort.m28629constructorimpl((short) (i & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
    }

    /* renamed from: component1-Mh2AYeg, reason: not valid java name */
    public static final short m28485component1Mh2AYeg(int i) {
        return m28490getCharactersMh2AYeg(i);
    }

    /* renamed from: component2-Mh2AYeg, reason: not valid java name */
    public static final short m28486component2Mh2AYeg(int i) {
        return m28489getBytesMh2AYeg(i);
    }
}
