package kotlin.collections.unsigned;

import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.Unsigned;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _UArrays.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\f\u001a\u00020\t*\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\f\u001a\u00020\t*\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\f\u001a\u00020\t*\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\f\u001a\u00020\t*\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lkotlin/ULongArray;", "Lkotlin/ranges/IntRange;", "indices", "", "Lkotlin/ULong;", "slice-ZRhS8yI", "([JLkotlin/ranges/IntRange;)Ljava/util/List;", "slice", "Lkotlin/UIntArray;", "", "contentToString-XUkPCBk", "([I)Ljava/lang/String;", "contentToString", "contentToString-uLth9ew", "([J)Ljava/lang/String;", "Lkotlin/UByteArray;", "contentToString-2csIQuQ", "([B)Ljava/lang/String;", "Lkotlin/UShortArray;", "contentToString-d-6D3K8", "([S)Ljava/lang/String;", "kotlin-stdlib"}, m3637k = 5, m3638mv = {2, 1, 0}, m3640xi = 49, m3641xs = "kotlin/collections/unsigned/UArraysKt")
@SourceDebugExtension
/* renamed from: kotlin.collections.unsigned.UArraysKt___UArraysKt, reason: use source file name */
/* loaded from: classes14.dex */
public class _UArrays extends _UArraysJvm {
    @SinceKotlin
    @Unsigned
    /* renamed from: slice-ZRhS8yI, reason: not valid java name */
    public static List<ULong> m28677sliceZRhS8yI(long[] slice, PrimitiveRanges2 indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt.emptyList() : _UArraysJvm.m28656asListQwZRm1k(ULongArray.m28613constructorimpl(ArraysKt.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    @SinceKotlin
    @Unsigned
    /* renamed from: contentToString-XUkPCBk, reason: not valid java name */
    public static String m28674contentToStringXUkPCBk(int[] iArr) {
        String strJoinToString$default;
        return (iArr == null || (strJoinToString$default = CollectionsKt.joinToString$default(UIntArray.m28587boximpl(iArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strJoinToString$default;
    }

    @SinceKotlin
    @Unsigned
    /* renamed from: contentToString-uLth9ew, reason: not valid java name */
    public static String m28676contentToStringuLth9ew(long[] jArr) {
        String strJoinToString$default;
        return (jArr == null || (strJoinToString$default = CollectionsKt.joinToString$default(ULongArray.m28611boximpl(jArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strJoinToString$default;
    }

    @SinceKotlin
    @Unsigned
    /* renamed from: contentToString-2csIQuQ, reason: not valid java name */
    public static String m28673contentToString2csIQuQ(byte[] bArr) {
        String strJoinToString$default;
        return (bArr == null || (strJoinToString$default = CollectionsKt.joinToString$default(UByteArray.m28565boximpl(bArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strJoinToString$default;
    }

    @SinceKotlin
    @Unsigned
    /* renamed from: contentToString-d-6D3K8, reason: not valid java name */
    public static String m28675contentToStringd6D3K8(short[] sArr) {
        String strJoinToString$default;
        return (sArr == null || (strJoinToString$default = CollectionsKt.joinToString$default(UShortArray.m28634boximpl(sArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strJoinToString$default;
    }
}
