package com.ionspin.kotlin.bignum.integer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BigIntegerExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u001b\u0010\u0002\u001a\u00020\u0001*\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"", "Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "toBigInteger", "(J)Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "", "(I)Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "", "base", "(Ljava/lang/String;I)Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "bignum"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.ionspin.kotlin.bignum.integer.BigIntegerExtensionsKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class BigIntegerExtensions {
    public static final BigInteger toBigInteger(long j) {
        return BigInteger.INSTANCE.fromLong(j);
    }

    public static final BigInteger toBigInteger(int i) {
        return BigInteger.INSTANCE.fromInt(i);
    }

    public static /* synthetic */ BigInteger toBigInteger$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 10;
        }
        return toBigInteger(str, i);
    }

    public static final BigInteger toBigInteger(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return BigInteger.INSTANCE.parseString(str, i);
    }
}
