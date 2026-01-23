package com.ionspin.kotlin.bignum;

import com.ionspin.kotlin.bignum.BigNumber;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BigNumber.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003J\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/ionspin/kotlin/bignum/CommonBigNumberOperations;", "Lcom/ionspin/kotlin/bignum/BigNumber;", "BigType", "", "Lcom/ionspin/kotlin/bignum/BigNumber$Creator;", "getCreator", "()Lcom/ionspin/kotlin/bignum/BigNumber$Creator;", "getInstance", "()Lcom/ionspin/kotlin/bignum/BigNumber;", "bignum"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.ionspin.kotlin.bignum.CommonBigNumberOperations, reason: use source file name */
/* loaded from: classes27.dex */
public interface BigNumber2<BigType extends BigNumber<BigType>> {
    BigNumber.Creator<BigType> getCreator();

    BigType getInstance();

    /* compiled from: BigNumber.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.ionspin.kotlin.bignum.CommonBigNumberOperations$DefaultImpls */
    public static final class DefaultImpls {
        public static <BigType extends BigNumber<BigType>> BigType plus(BigNumber2<BigType> bigNumber2, BigType other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return (BigType) bigNumber2.getInstance().add(other);
        }

        public static <BigType extends BigNumber<BigType>> BigType minus(BigNumber2<BigType> bigNumber2, BigType other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return (BigType) bigNumber2.getInstance().subtract(other);
        }

        public static <BigType extends BigNumber<BigType>> BigType times(BigNumber2<BigType> bigNumber2, BigType other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return (BigType) bigNumber2.getInstance().multiply(other);
        }

        public static <BigType extends BigNumber<BigType>> BigType div(BigNumber2<BigType> bigNumber2, BigType other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return (BigType) bigNumber2.getInstance().divide(other);
        }

        public static <BigType extends BigNumber<BigType>> BigType plus(BigNumber2<BigType> bigNumber2, int i) {
            return (BigType) bigNumber2.getInstance().add(bigNumber2.getCreator().fromInt(i));
        }

        public static <BigType extends BigNumber<BigType>> BigType times(BigNumber2<BigType> bigNumber2, int i) {
            return (BigType) bigNumber2.getInstance().multiply(bigNumber2.getCreator().fromInt(i));
        }

        public static <BigType extends BigNumber<BigType>> BigType minus(BigNumber2<BigType> bigNumber2, int i) {
            return (BigType) bigNumber2.getInstance().subtract(bigNumber2.getCreator().fromInt(i));
        }

        public static <BigType extends BigNumber<BigType>> BigType minus(BigNumber2<BigType> bigNumber2, long j) {
            return (BigType) bigNumber2.getInstance().subtract(bigNumber2.getCreator().fromLong(j));
        }

        public static <BigType extends BigNumber<BigType>> BigType div(BigNumber2<BigType> bigNumber2, int i) {
            return (BigType) bigNumber2.getInstance().divide(bigNumber2.getCreator().fromInt(i));
        }

        public static <BigType extends BigNumber<BigType>> BigType rem(BigNumber2<BigType> bigNumber2, int i) {
            return (BigType) bigNumber2.getInstance().remainder(bigNumber2.getCreator().fromInt(i));
        }
    }
}
