package kotlin.collections.unsigned;

import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.Unsigned;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: _UArraysJvm.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m3636d2 = {"Lkotlin/ULongArray;", "", "Lkotlin/ULong;", "asList-QwZRm1k", "([J)Ljava/util/List;", "asList", "kotlin-stdlib"}, m3637k = 5, m3638mv = {2, 1, 0}, m3640xi = 49, m3641xs = "kotlin/collections/unsigned/UArraysKt")
/* renamed from: kotlin.collections.unsigned.UArraysKt___UArraysJvmKt, reason: use source file name */
/* loaded from: classes14.dex */
class _UArraysJvm {
    @SinceKotlin
    @Unsigned
    /* renamed from: asList-QwZRm1k, reason: not valid java name */
    public static final List<ULong> m28656asListQwZRm1k(long[] asList) {
        Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new _UArraysJvm3(asList);
    }
}
