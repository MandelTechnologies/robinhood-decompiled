package com.ionspin.kotlin.bignum.integer.base32;

import com.ionspin.kotlin.bignum.integer.Quadruple;
import com.robinhood.models.card.p311db.Card;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BigInteger32Arithmetic.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001lB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\bJ\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\fJ\"\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018J2\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u001e2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J \u0010%\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0018J\"\u0010*\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\"\u0010-\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\"\u0010/\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b.\u0010,J \u00101\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0018J.\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n022\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b3\u00104J,\u00109\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n022\u0006\u00106\u001a\u00020\n2\u0006\u00107\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b8\u00104J\u001f\u0010;\u001a\u00020\n*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0006H\u0080\u0004ø\u0001\u0000¢\u0006\u0004\b:\u0010\u0018J\u001f\u0010=\u001a\u00020\n*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0006H\u0080\u0004ø\u0001\u0000¢\u0006\u0004\b<\u0010\u0018J\u001f\u0010@\u001a\u00020\n*\u00020\n2\u0006\u0010>\u001a\u00020\nH\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010,J\u001f\u0010B\u001a\u00020\n*\u00020\n2\u0006\u0010>\u001a\u00020\u0004H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\bA\u0010\u0018J\u001f\u0010D\u001a\u00020\n*\u00020\n2\u0006\u0010>\u001a\u00020\u0004H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\bC\u0010\u0018J\u001f\u0010F\u001a\u00020\u0006*\u00020\n2\u0006\u0010>\u001a\u00020\nH\u0080\u0002ø\u0001\u0000¢\u0006\u0004\bE\u0010)R\u001a\u0010H\u001a\u00020G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR \u0010M\u001a\u00020L8\u0006X\u0086Dø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR \u0010Q\u001a\u00020\u00048\u0006X\u0086Dø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR \u0010U\u001a\u00020L8\u0006X\u0086Dø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bU\u0010N\u001a\u0004\bV\u0010PR \u0010W\u001a\u00020L8\u0006X\u0086Dø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bW\u0010N\u001a\u0004\bX\u0010PR \u0010Y\u001a\u00020\u00048\u0006X\u0086Dø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bY\u0010R\u001a\u0004\bZ\u0010TR\u001a\u0010[\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b[\u0010R\u001a\u0004\b\\\u0010TR\u001a\u0010]\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b]\u0010R\u001a\u0004\b^\u0010TR \u0010_\u001a\u00020\n8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b_\u0010I\u001a\u0004\b`\u0010KR \u0010a\u001a\u00020\n8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\ba\u0010I\u001a\u0004\bb\u0010KR \u0010c\u001a\u00020\n8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bc\u0010I\u001a\u0004\bd\u0010KR \u0010e\u001a\u00020\n8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\be\u0010I\u001a\u0004\bf\u0010KR\u0017\u0010h\u001a\u00020g8\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006m"}, m3636d2 = {"Lcom/ionspin/kotlin/bignum/integer/base32/BigInteger32Arithmetic;", "", "<init>", "()V", "Lkotlin/UInt;", "value", "", "numberOfLeadingZerosInAWord-WZ4Q5Ns", "(I)I", "numberOfLeadingZerosInAWord", "Lkotlin/UIntArray;", "bitLength--ajY-9A", "([I)I", "bitLength", "bitLength-WZ4Q5Ns", "bigInteger", "removeLeadingZeros-hkIa6DI", "([I)[I", "removeLeadingZeros", "countLeadingZeroWords--ajY-9A", "countLeadingZeroWords", "operand", "places", "shiftLeft-Wj2uyrI", "([II)[I", "shiftLeft", "shiftRight-Wj2uyrI", "shiftRight", Card.Icon.DIVIDEND, "divisor", "Lkotlin/Triple;", "normalize-Ynv0uTE", "([I[I)Lkotlin/Triple;", "normalize", "remainderNormalized", "normalizationShift", "denormalize-Wj2uyrI", "denormalize", "first", "second", "compare-Ynv0uTE", "([I[I)I", "compare", "add-0-0sMy4", "([I[I)[I", "add", "subtract-0-0sMy4", "subtract", "multiply-FE_7wA8", "multiply", "Lkotlin/Pair;", "divide-Ynv0uTE", "([I[I)Lkotlin/Pair;", "divide", "unnormalizedDividend", "unnormalizedDivisor", "basicDivide-Ynv0uTE", "basicDivide", "shl-Wj2uyrI$bignum", "shl", "shr-Wj2uyrI$bignum", "shr", "other", "minus-0-0sMy4$bignum", "minus", "plus-FE_7wA8$bignum", "plus", "times-FE_7wA8$bignum", "times", "compareTo-Ynv0uTE$bignum", "compareTo", "", "_emitIntArray", "[I", "get_emitIntArray", "()[I", "Lkotlin/ULong;", "baseMask", "J", "getBaseMask-s-VKNKU", "()J", "baseMaskInt", "I", "getBaseMaskInt-pVg5ArA", "()I", "overflowMask", "getOverflowMask-s-VKNKU", "lowerMask", "getLowerMask-s-VKNKU", "base", "getBase-pVg5ArA", "basePowerOfTwo", "getBasePowerOfTwo", "wordSizeInBits", "getWordSizeInBits", "ZERO", "getZERO--hP7Qyg", "ONE", "getONE--hP7Qyg", "TWO", "getTWO--hP7Qyg", "TEN", "getTEN--hP7Qyg", "Lcom/ionspin/kotlin/bignum/integer/base32/BigInteger32Arithmetic$SignedUIntArray;", "SIGNED_POSITIVE_TWO", "Lcom/ionspin/kotlin/bignum/integer/base32/BigInteger32Arithmetic$SignedUIntArray;", "getSIGNED_POSITIVE_TWO", "()Lcom/ionspin/kotlin/bignum/integer/base32/BigInteger32Arithmetic$SignedUIntArray;", "SignedUIntArray", "bignum"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class BigInteger32Arithmetic {
    public static final BigInteger32Arithmetic INSTANCE;
    private static final int[] ONE;
    private static final SignedUIntArray SIGNED_POSITIVE_TWO;
    private static final int[] TEN;
    private static final int[] TWO;
    private static final int[] ZERO;
    private static final int[] _emitIntArray;
    private static final int base;
    private static final long baseMask;
    private static final int baseMaskInt;
    private static final int basePowerOfTwo;
    private static final long lowerMask;
    private static final long overflowMask;
    private static final int wordSizeInBits;

    private BigInteger32Arithmetic() {
    }

    static {
        BigInteger32Arithmetic bigInteger32Arithmetic = new BigInteger32Arithmetic();
        INSTANCE = bigInteger32Arithmetic;
        _emitIntArray = new int[0];
        baseMask = 4294967295L;
        baseMaskInt = -1;
        overflowMask = 4294967296L;
        lowerMask = 65535L;
        base = -1;
        basePowerOfTwo = 32;
        wordSizeInBits = 32;
        ZERO = UIntArray.m28588constructorimpl(0);
        ONE = UIntArray.m28589constructorimpl(new int[]{1});
        TWO = UIntArray.m28589constructorimpl(new int[]{2});
        TEN = UIntArray.m28589constructorimpl(new int[]{10});
        SIGNED_POSITIVE_TWO = new SignedUIntArray(bigInteger32Arithmetic.m9403getTWOhP7Qyg(), true, null);
    }

    /* renamed from: getBase-pVg5ArA, reason: not valid java name */
    public final int m9402getBasepVg5ArA() {
        return base;
    }

    public int getBasePowerOfTwo() {
        return basePowerOfTwo;
    }

    /* renamed from: getZERO--hP7Qyg, reason: not valid java name */
    public int[] m9404getZEROhP7Qyg() {
        return ZERO;
    }

    /* renamed from: getTWO--hP7Qyg, reason: not valid java name */
    public int[] m9403getTWOhP7Qyg() {
        return TWO;
    }

    /* renamed from: numberOfLeadingZerosInAWord-WZ4Q5Ns, reason: not valid java name */
    public int m9408numberOfLeadingZerosInAWordWZ4Q5Ns(int value) {
        int basePowerOfTwo2 = getBasePowerOfTwo();
        int iM28582constructorimpl = UInt.m28582constructorimpl(value >>> 16);
        if (iM28582constructorimpl != 0) {
            basePowerOfTwo2 -= 16;
            value = iM28582constructorimpl;
        }
        int iM28582constructorimpl2 = UInt.m28582constructorimpl(value >>> 8);
        if (iM28582constructorimpl2 != 0) {
            basePowerOfTwo2 -= 8;
            value = iM28582constructorimpl2;
        }
        int iM28582constructorimpl3 = UInt.m28582constructorimpl(value >>> 4);
        if (iM28582constructorimpl3 != 0) {
            basePowerOfTwo2 -= 4;
            value = iM28582constructorimpl3;
        }
        int iM28582constructorimpl4 = UInt.m28582constructorimpl(value >>> 2);
        if (iM28582constructorimpl4 != 0) {
            basePowerOfTwo2 -= 2;
            value = iM28582constructorimpl4;
        }
        return UInt.m28582constructorimpl(value >>> 1) != 0 ? basePowerOfTwo2 - 2 : basePowerOfTwo2 - value;
    }

    /* renamed from: bitLength--ajY-9A, reason: not valid java name */
    public int m9395bitLengthajY9A(int[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (UIntArray.m28597isEmptyimpl(value)) {
            return 0;
        }
        return m9396bitLengthWZ4Q5Ns(UIntArray.m28594getpVg5ArA(value, UIntArray.m28595getSizeimpl(value) - 1)) + ((UIntArray.m28595getSizeimpl(value) - 1) * getBasePowerOfTwo());
    }

    /* renamed from: bitLength-WZ4Q5Ns, reason: not valid java name */
    public final int m9396bitLengthWZ4Q5Ns(int value) {
        return getBasePowerOfTwo() - m9408numberOfLeadingZerosInAWordWZ4Q5Ns(value);
    }

    /* renamed from: removeLeadingZeros-hkIa6DI, reason: not valid java name */
    public final int[] m9410removeLeadingZeroshkIa6DI(int[] bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "bigInteger");
        int length = bigInteger.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (UInt.m28582constructorimpl(bigInteger[length]) != 0) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            length = -1;
        } else {
            length = -1;
        }
        int i2 = length + 1;
        if (i2 == -1 || i2 == 0) {
            return m9404getZEROhP7Qyg();
        }
        return UIntArray.m28589constructorimpl(ArraysKt.copyOfRange(bigInteger, 0, i2));
    }

    /* renamed from: countLeadingZeroWords--ajY-9A, reason: not valid java name */
    public final int m9399countLeadingZeroWordsajY9A(int[] bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "bigInteger");
        int iM28595getSizeimpl = UIntArray.m28595getSizeimpl(bigInteger) - 1;
        if (iM28595getSizeimpl <= 0) {
            return 0;
        }
        int iM28594getpVg5ArA = UIntArray.m28594getpVg5ArA(bigInteger, iM28595getSizeimpl);
        while (iM28594getpVg5ArA == 0 && iM28595getSizeimpl > 0) {
            iM28595getSizeimpl--;
            iM28594getpVg5ArA = UIntArray.m28594getpVg5ArA(bigInteger, iM28595getSizeimpl);
        }
        if (UIntArray.m28594getpVg5ArA(bigInteger, iM28595getSizeimpl) == 0) {
            iM28595getSizeimpl--;
        }
        return (UIntArray.m28595getSizeimpl(bigInteger) - iM28595getSizeimpl) - 1;
    }

    /* renamed from: shiftLeft-Wj2uyrI, reason: not valid java name */
    public int[] m9411shiftLeftWj2uyrI(int[] operand, int places) {
        int iM28582constructorimpl;
        Intrinsics.checkNotNullParameter(operand, "operand");
        if (UIntArray.m28597isEmptyimpl(operand) || places == 0) {
            return operand;
        }
        int iM28595getSizeimpl = UIntArray.m28595getSizeimpl(operand);
        int iM9408numberOfLeadingZerosInAWordWZ4Q5Ns = m9408numberOfLeadingZerosInAWordWZ4Q5Ns(UIntArray.m28594getpVg5ArA(operand, UIntArray.m28595getSizeimpl(operand) - 1));
        int basePowerOfTwo2 = places / getBasePowerOfTwo();
        int basePowerOfTwo3 = places % getBasePowerOfTwo();
        int i = basePowerOfTwo3 > iM9408numberOfLeadingZerosInAWordWZ4Q5Ns ? basePowerOfTwo2 + 1 : basePowerOfTwo2;
        if (basePowerOfTwo3 == 0) {
            int iM28595getSizeimpl2 = UIntArray.m28595getSizeimpl(operand) + i;
            int[] iArr = new int[iM28595getSizeimpl2];
            int i2 = 0;
            while (i2 < iM28595getSizeimpl2) {
                iArr[i2] = (i2 < 0 || i2 >= basePowerOfTwo2) ? UIntArray.m28594getpVg5ArA(operand, i2 - basePowerOfTwo2) : 0;
                i2++;
            }
            return UIntArray.m28589constructorimpl(iArr);
        }
        int iM28595getSizeimpl3 = UIntArray.m28595getSizeimpl(operand) + i;
        int[] iArr2 = new int[iM28595getSizeimpl3];
        for (int i3 = 0; i3 < iM28595getSizeimpl3; i3++) {
            if (i3 >= 0 && i3 < basePowerOfTwo2) {
                iM28582constructorimpl = 0;
            } else if (i3 == basePowerOfTwo2) {
                iM28582constructorimpl = UInt.m28582constructorimpl(UIntArray.m28594getpVg5ArA(operand, i3 - basePowerOfTwo2) << basePowerOfTwo3);
            } else {
                int i4 = basePowerOfTwo2 + 1;
                if (i3 < iM28595getSizeimpl + basePowerOfTwo2 && i4 <= i3) {
                    int i5 = i3 - basePowerOfTwo2;
                    iM28582constructorimpl = UInt.m28582constructorimpl(UInt.m28582constructorimpl(UIntArray.m28594getpVg5ArA(operand, i5 - 1) >>> (INSTANCE.getBasePowerOfTwo() - basePowerOfTwo3)) | UInt.m28582constructorimpl(UIntArray.m28594getpVg5ArA(operand, i5) << basePowerOfTwo3));
                } else if (i3 == (iM28595getSizeimpl + i) - 1) {
                    iM28582constructorimpl = UInt.m28582constructorimpl(UIntArray.m28594getpVg5ArA(operand, i3 - i) >>> (INSTANCE.getBasePowerOfTwo() - basePowerOfTwo3));
                } else {
                    throw new RuntimeException("Invalid case " + i3);
                }
            }
            iArr2[i3] = iM28582constructorimpl;
        }
        return UIntArray.m28589constructorimpl(iArr2);
    }

    /* renamed from: shiftRight-Wj2uyrI, reason: not valid java name */
    public int[] m9412shiftRightWj2uyrI(int[] operand, int places) {
        int iM28582constructorimpl;
        Intrinsics.checkNotNullParameter(operand, "operand");
        if (UIntArray.m28597isEmptyimpl(operand) || places == 0) {
            return operand;
        }
        int basePowerOfTwo2 = places % getBasePowerOfTwo();
        int basePowerOfTwo3 = places / getBasePowerOfTwo();
        if (basePowerOfTwo3 >= UIntArray.m28595getSizeimpl(operand)) {
            return m9404getZEROhP7Qyg();
        }
        if (basePowerOfTwo2 == 0) {
            return UIntArray.m28589constructorimpl(ArraysKt.copyOfRange(operand, basePowerOfTwo3, UIntArray.m28595getSizeimpl(operand)));
        }
        if (UIntArray.m28595getSizeimpl(operand) > 1 && UIntArray.m28595getSizeimpl(operand) - basePowerOfTwo3 == 1) {
            return new int[]{UInt.m28582constructorimpl(UIntArray.m28594getpVg5ArA(operand, UIntArray.m28595getSizeimpl(operand) - 1) >>> basePowerOfTwo2)};
        }
        int iM28595getSizeimpl = UIntArray.m28595getSizeimpl(operand) - basePowerOfTwo3;
        int[] iArr = new int[iM28595getSizeimpl];
        for (int i = 0; i < iM28595getSizeimpl; i++) {
            if (i >= 0 && i < (UIntArray.m28595getSizeimpl(operand) - 1) - basePowerOfTwo3) {
                int i2 = i + basePowerOfTwo3;
                iM28582constructorimpl = UInt.m28582constructorimpl(UInt.m28582constructorimpl(UIntArray.m28594getpVg5ArA(operand, i2 + 1) << (INSTANCE.getBasePowerOfTwo() - basePowerOfTwo2)) | UInt.m28582constructorimpl(UIntArray.m28594getpVg5ArA(operand, i2) >>> basePowerOfTwo2));
            } else if (i == (UIntArray.m28595getSizeimpl(operand) - 1) - basePowerOfTwo3) {
                iM28582constructorimpl = UInt.m28582constructorimpl(UIntArray.m28594getpVg5ArA(operand, i + basePowerOfTwo3) >>> basePowerOfTwo2);
            } else {
                throw new RuntimeException("Invalid case " + i);
            }
            iArr[i] = iM28582constructorimpl;
        }
        return m9410removeLeadingZeroshkIa6DI(UIntArray.m28589constructorimpl(iArr));
    }

    /* renamed from: normalize-Ynv0uTE, reason: not valid java name */
    public final Tuples3<UIntArray, UIntArray, Integer> m9407normalizeYnv0uTE(int[] dividend, int[] divisor) {
        Intrinsics.checkNotNullParameter(dividend, "dividend");
        Intrinsics.checkNotNullParameter(divisor, "divisor");
        int iM9408numberOfLeadingZerosInAWordWZ4Q5Ns = m9408numberOfLeadingZerosInAWordWZ4Q5Ns(UIntArray.m28594getpVg5ArA(divisor, UIntArray.m28595getSizeimpl(divisor) - 1));
        return new Tuples3<>(UIntArray.m28587boximpl(m9413shlWj2uyrI$bignum(dividend, iM9408numberOfLeadingZerosInAWordWZ4Q5Ns)), UIntArray.m28587boximpl(m9413shlWj2uyrI$bignum(divisor, iM9408numberOfLeadingZerosInAWordWZ4Q5Ns)), Integer.valueOf(iM9408numberOfLeadingZerosInAWordWZ4Q5Ns));
    }

    /* renamed from: denormalize-Wj2uyrI, reason: not valid java name */
    public final int[] m9400denormalizeWj2uyrI(int[] remainderNormalized, int normalizationShift) {
        Intrinsics.checkNotNullParameter(remainderNormalized, "remainderNormalized");
        return m9414shrWj2uyrI$bignum(remainderNormalized, normalizationShift);
    }

    /* renamed from: compare-Ynv0uTE, reason: not valid java name */
    public int m9397compareYnv0uTE(int[] first, int[] second) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        int iM28595getSizeimpl = UIntArray.m28595getSizeimpl(first) - m9399countLeadingZeroWordsajY9A(first);
        int iM28595getSizeimpl2 = UIntArray.m28595getSizeimpl(second) - m9399countLeadingZeroWordsajY9A(second);
        if (iM28595getSizeimpl > iM28595getSizeimpl2) {
            return 1;
        }
        if (iM28595getSizeimpl2 > iM28595getSizeimpl) {
            return -1;
        }
        int i = iM28595getSizeimpl - 1;
        while (true) {
            if (i < 0) {
                z = false;
                z2 = true;
                break;
            }
            if (Integer.compare(UIntArray.m28594getpVg5ArA(first, i) ^ Integer.MIN_VALUE, UIntArray.m28594getpVg5ArA(second, i) ^ Integer.MIN_VALUE) > 0) {
                z2 = false;
                z = true;
                break;
            }
            if (Integer.compare(UIntArray.m28594getpVg5ArA(first, i) ^ Integer.MIN_VALUE, UIntArray.m28594getpVg5ArA(second, i) ^ Integer.MIN_VALUE) < 0) {
                z2 = false;
                z = false;
                break;
            }
            i--;
        }
        if (z2) {
            return 0;
        }
        return z ? 1 : -1;
    }

    /* renamed from: add-0-0sMy4, reason: not valid java name */
    public int[] m9393add00sMy4(int[] first, int[] second) {
        Quadruple quadruple;
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (UIntArray.m28595getSizeimpl(first) == 1 && UIntArray.m28594getpVg5ArA(first, 0) == 0) {
            return second;
        }
        if (UIntArray.m28595getSizeimpl(second) == 1 && UIntArray.m28594getpVg5ArA(second, 0) == 0) {
            return first;
        }
        if (UIntArray.m28595getSizeimpl(first) > UIntArray.m28595getSizeimpl(second)) {
            quadruple = new Quadruple(Integer.valueOf(UIntArray.m28595getSizeimpl(first)), Integer.valueOf(UIntArray.m28595getSizeimpl(second)), UIntArray.m28587boximpl(first), UIntArray.m28587boximpl(second));
        } else {
            quadruple = new Quadruple(Integer.valueOf(UIntArray.m28595getSizeimpl(second)), Integer.valueOf(UIntArray.m28595getSizeimpl(first)), UIntArray.m28587boximpl(second), UIntArray.m28587boximpl(first));
        }
        int iIntValue = ((Number) quadruple.component1()).intValue();
        int iIntValue2 = ((Number) quadruple.component2()).intValue();
        int[] storage = ((UIntArray) quadruple.component3()).getStorage();
        int[] storage2 = ((UIntArray) quadruple.component4()).getStorage();
        int i = iIntValue + 1;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = 0;
        }
        int[] iArrM28589constructorimpl = UIntArray.m28589constructorimpl(iArr);
        int i3 = 0;
        long jM28605constructorimpl = 0;
        while (i3 < iIntValue2) {
            long jM28605constructorimpl2 = ULong.m28605constructorimpl(ULong.m28605constructorimpl(jM28605constructorimpl + ULong.m28605constructorimpl(UIntArray.m28594getpVg5ArA(storage, i3) & 4294967295L)) + ULong.m28605constructorimpl(4294967295L & UIntArray.m28594getpVg5ArA(storage2, i3)));
            UIntArray.m28599setVXSXFK8(iArrM28589constructorimpl, i3, UInt.m28582constructorimpl((int) ULong.m28605constructorimpl(baseMask & jM28605constructorimpl2)));
            jM28605constructorimpl = ULong.m28605constructorimpl(jM28605constructorimpl2 >>> getBasePowerOfTwo());
            i3++;
        }
        while (jM28605constructorimpl != 0) {
            if (i3 == iIntValue) {
                UIntArray.m28599setVXSXFK8(iArrM28589constructorimpl, iIntValue, UInt.m28582constructorimpl((int) jM28605constructorimpl));
                return iArrM28589constructorimpl;
            }
            long jM28605constructorimpl3 = ULong.m28605constructorimpl(jM28605constructorimpl + ULong.m28605constructorimpl(UIntArray.m28594getpVg5ArA(storage, i3) & 4294967295L));
            UIntArray.m28599setVXSXFK8(iArrM28589constructorimpl, i3, UInt.m28582constructorimpl((int) ULong.m28605constructorimpl(baseMask & jM28605constructorimpl3)));
            jM28605constructorimpl = ULong.m28605constructorimpl(jM28605constructorimpl3 >>> getBasePowerOfTwo());
            i3++;
        }
        while (i3 < iIntValue) {
            UIntArray.m28599setVXSXFK8(iArrM28589constructorimpl, i3, UIntArray.m28594getpVg5ArA(storage, i3));
            i3++;
        }
        return UIntArray.m28594getpVg5ArA(iArrM28589constructorimpl, UIntArray.m28595getSizeimpl(iArrM28589constructorimpl) - 1) == 0 ? UIntArray.m28589constructorimpl(ArraysKt.copyOfRange(iArrM28589constructorimpl, 0, UIntArray.m28595getSizeimpl(iArrM28589constructorimpl) - 1)) : iArrM28589constructorimpl;
    }

    /* renamed from: subtract-0-0sMy4, reason: not valid java name */
    public int[] m9415subtract00sMy4(int[] first, int[] second) {
        Quadruple quadruple;
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        int[] iArrM9410removeLeadingZeroshkIa6DI = m9410removeLeadingZeroshkIa6DI(first);
        int[] iArrM9410removeLeadingZeroshkIa6DI2 = m9410removeLeadingZeroshkIa6DI(second);
        boolean z = true;
        if (m9397compareYnv0uTE(iArrM9410removeLeadingZeroshkIa6DI, iArrM9410removeLeadingZeroshkIa6DI2) == 1) {
            quadruple = new Quadruple(Integer.valueOf(UIntArray.m28595getSizeimpl(iArrM9410removeLeadingZeroshkIa6DI)), Integer.valueOf(UIntArray.m28595getSizeimpl(iArrM9410removeLeadingZeroshkIa6DI2)), UIntArray.m28587boximpl(iArrM9410removeLeadingZeroshkIa6DI), UIntArray.m28587boximpl(iArrM9410removeLeadingZeroshkIa6DI2));
        } else {
            quadruple = new Quadruple(Integer.valueOf(UIntArray.m28595getSizeimpl(iArrM9410removeLeadingZeroshkIa6DI2)), Integer.valueOf(UIntArray.m28595getSizeimpl(iArrM9410removeLeadingZeroshkIa6DI)), UIntArray.m28587boximpl(iArrM9410removeLeadingZeroshkIa6DI2), UIntArray.m28587boximpl(iArrM9410removeLeadingZeroshkIa6DI));
        }
        int iIntValue = ((Number) quadruple.component1()).intValue();
        int iIntValue2 = ((Number) quadruple.component2()).intValue();
        int[] storage = ((UIntArray) quadruple.component3()).getStorage();
        int[] storage2 = ((UIntArray) quadruple.component4()).getStorage();
        int i = iIntValue + 1;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = 0;
        }
        int[] iArrM28589constructorimpl = UIntArray.m28589constructorimpl(iArr);
        int i3 = 0;
        long jM28605constructorimpl = 0;
        while (i3 < iIntValue2) {
            boolean z2 = z;
            if (i3 >= UIntArray.m28595getSizeimpl(storage)) {
                System.out.println((Object) "Breakpoint");
            }
            if (i3 >= UIntArray.m28595getSizeimpl(storage2)) {
                System.out.println((Object) "Breakpoint");
            }
            long jM28605constructorimpl2 = ULong.m28605constructorimpl(ULong.m28605constructorimpl(ULong.m28605constructorimpl(UIntArray.m28594getpVg5ArA(storage, i3) & 4294967295L) - ULong.m28605constructorimpl(UIntArray.m28594getpVg5ArA(storage2, i3) & 4294967295L)) - jM28605constructorimpl);
            UIntArray.m28599setVXSXFK8(iArrM28589constructorimpl, i3, UInt.m28582constructorimpl((int) jM28605constructorimpl2));
            jM28605constructorimpl = ULong.m28605constructorimpl(ULong.m28605constructorimpl(jM28605constructorimpl2 & overflowMask) >>> wordSizeInBits);
            i3++;
            z = z2;
        }
        while (jM28605constructorimpl != 0) {
            long jM28605constructorimpl3 = ULong.m28605constructorimpl(ULong.m28605constructorimpl(UIntArray.m28594getpVg5ArA(storage, i3) & 4294967295L) - jM28605constructorimpl);
            UIntArray.m28599setVXSXFK8(iArrM28589constructorimpl, i3, UInt.m28582constructorimpl(UInt.m28582constructorimpl((int) jM28605constructorimpl3) & baseMaskInt));
            jM28605constructorimpl = ULong.m28605constructorimpl(ULong.m28605constructorimpl(jM28605constructorimpl3 & overflowMask) >>> wordSizeInBits);
            i3++;
        }
        while (i3 < iIntValue) {
            UIntArray.m28599setVXSXFK8(iArrM28589constructorimpl, i3, UIntArray.m28594getpVg5ArA(storage, i3));
            i3++;
        }
        ArrayList arrayList = new ArrayList();
        int iM28595getSizeimpl = UIntArray.m28595getSizeimpl(iArrM28589constructorimpl);
        for (int i4 = 0; i4 < iM28595getSizeimpl; i4++) {
            int iM28594getpVg5ArA = UIntArray.m28594getpVg5ArA(iArrM28589constructorimpl, i4);
            if (iM28594getpVg5ArA == 0) {
                arrayList.add(UInt.m28581boximpl(iM28594getpVg5ArA));
            }
        }
        if (arrayList.isEmpty()) {
            return m9404getZEROhP7Qyg();
        }
        int i5 = -1;
        int length = iArrM28589constructorimpl.length - 1;
        if (length >= 0) {
            while (true) {
                int i6 = length - 1;
                if (UInt.m28582constructorimpl(iArrM28589constructorimpl[length]) != 0) {
                    i5 = length;
                    break;
                }
                if (i6 < 0) {
                    break;
                }
                length = i6;
            }
        }
        return UIntArray.m28589constructorimpl(ArraysKt.copyOfRange(iArrM28589constructorimpl, 0, i5 + 1));
    }

    /* renamed from: multiply-FE_7wA8, reason: not valid java name */
    public final int[] m9406multiplyFE_7wA8(int[] first, int second) {
        Intrinsics.checkNotNullParameter(first, "first");
        int[] iArrM28588constructorimpl = UIntArray.m28588constructorimpl(UIntArray.m28595getSizeimpl(first) + 1);
        int iM28595getSizeimpl = UIntArray.m28595getSizeimpl(first);
        int i = 0;
        while (i < iM28595getSizeimpl) {
            long jM28605constructorimpl = ULong.m28605constructorimpl(ULong.m28605constructorimpl(UIntArray.m28594getpVg5ArA(first, i) & 4294967295L) * ULong.m28605constructorimpl(second & 4294967295L));
            long jM28605constructorimpl2 = ULong.m28605constructorimpl(UIntArray.m28594getpVg5ArA(iArrM28588constructorimpl, i) & 4294967295L);
            long j = baseMask;
            long jM28605constructorimpl3 = ULong.m28605constructorimpl(jM28605constructorimpl2 + ULong.m28605constructorimpl(4294967295L & UInt.m28582constructorimpl((int) ULong.m28605constructorimpl(jM28605constructorimpl & j))));
            UIntArray.m28599setVXSXFK8(iArrM28588constructorimpl, i, UInt.m28582constructorimpl((int) ULong.m28605constructorimpl(jM28605constructorimpl3 & j)));
            i++;
            UIntArray.m28599setVXSXFK8(iArrM28588constructorimpl, i, UInt.m28582constructorimpl(UInt.m28582constructorimpl((int) ULong.m28605constructorimpl(jM28605constructorimpl >>> getBasePowerOfTwo())) + UInt.m28582constructorimpl((int) ULong.m28605constructorimpl(jM28605constructorimpl3 >>> getBasePowerOfTwo()))));
        }
        return m9410removeLeadingZeroshkIa6DI(iArrM28588constructorimpl);
    }

    /* compiled from: BigInteger32Arithmetic.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, m3636d2 = {"Lcom/ionspin/kotlin/bignum/integer/base32/BigInteger32Arithmetic$SignedUIntArray;", "", "Lkotlin/UIntArray;", "unsignedValue", "", "sign", "<init>", "([IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "[I", "getUnsignedValue--hP7Qyg", "()[I", "Z", "getSign", "()Z", "bignum"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class SignedUIntArray {
        private final boolean sign;
        private final int[] unsignedValue;

        public /* synthetic */ SignedUIntArray(int[] iArr, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(iArr, z);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SignedUIntArray)) {
                return false;
            }
            SignedUIntArray signedUIntArray = (SignedUIntArray) other;
            return UIntArray.m28593equalsimpl0(this.unsignedValue, signedUIntArray.unsignedValue) && this.sign == signedUIntArray.sign;
        }

        public int hashCode() {
            return (UIntArray.m28596hashCodeimpl(this.unsignedValue) * 31) + Boolean.hashCode(this.sign);
        }

        public String toString() {
            return "SignedUIntArray(unsignedValue=" + ((Object) UIntArray.m28600toStringimpl(this.unsignedValue)) + ", sign=" + this.sign + ')';
        }

        private SignedUIntArray(int[] unsignedValue, boolean z) {
            Intrinsics.checkNotNullParameter(unsignedValue, "unsignedValue");
            this.unsignedValue = unsignedValue;
            this.sign = z;
        }
    }

    /* renamed from: divide-Ynv0uTE, reason: not valid java name */
    public Tuples2<UIntArray, UIntArray> m9401divideYnv0uTE(int[] first, int[] second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        return m9394basicDivideYnv0uTE(first, second);
    }

    /* renamed from: basicDivide-Ynv0uTE, reason: not valid java name */
    public final Tuples2<UIntArray, UIntArray> m9394basicDivideYnv0uTE(int[] unnormalizedDividend, int[] unnormalizedDivisor) {
        long jM28605constructorimpl;
        int iM28582constructorimpl;
        Intrinsics.checkNotNullParameter(unnormalizedDividend, "unnormalizedDividend");
        Intrinsics.checkNotNullParameter(unnormalizedDivisor, "unnormalizedDivisor");
        if (m9398compareToYnv0uTE$bignum(unnormalizedDivisor, unnormalizedDividend) > 0) {
            return new Tuples2<>(UIntArray.m28587boximpl(m9404getZEROhP7Qyg()), UIntArray.m28587boximpl(unnormalizedDividend));
        }
        if (UIntArray.m28595getSizeimpl(unnormalizedDivisor) == 1 && UIntArray.m28595getSizeimpl(unnormalizedDividend) == 1) {
            return new Tuples2<>(UIntArray.m28587boximpl(m9410removeLeadingZeroshkIa6DI(new int[]{BigInteger32Arithmetic$$ExternalSyntheticBackport0.m1062m(UIntArray.m28594getpVg5ArA(unnormalizedDividend, 0), UIntArray.m28594getpVg5ArA(unnormalizedDivisor, 0))})), UIntArray.m28587boximpl(m9410removeLeadingZeroshkIa6DI(new int[]{BigInteger32Arithmetic$$ExternalSyntheticBackport1.m1063m(UIntArray.m28594getpVg5ArA(unnormalizedDividend, 0), UIntArray.m28594getpVg5ArA(unnormalizedDivisor, 0))})));
        }
        if (m9395bitLengthajY9A(unnormalizedDividend) - m9395bitLengthajY9A(unnormalizedDivisor) == 0) {
            return new Tuples2<>(UIntArray.m28587boximpl(new int[]{1}), UIntArray.m28587boximpl(m9405minus00sMy4$bignum(unnormalizedDividend, unnormalizedDivisor)));
        }
        Tuples3<UIntArray, UIntArray, Integer> tuples3M9407normalizeYnv0uTE = m9407normalizeYnv0uTE(unnormalizedDividend, unnormalizedDivisor);
        int[] storage = tuples3M9407normalizeYnv0uTE.component1().getStorage();
        int[] storage2 = tuples3M9407normalizeYnv0uTE.component2().getStorage();
        int iIntValue = tuples3M9407normalizeYnv0uTE.component3().intValue();
        int iM28595getSizeimpl = UIntArray.m28595getSizeimpl(storage);
        int iM28595getSizeimpl2 = UIntArray.m28595getSizeimpl(storage2);
        int i = iM28595getSizeimpl - iM28595getSizeimpl2;
        int[] iArrM28588constructorimpl = UIntArray.m28588constructorimpl(i);
        int[] iArrM9413shlWj2uyrI$bignum = m9413shlWj2uyrI$bignum(storage2, getBasePowerOfTwo() * i);
        if (m9398compareToYnv0uTE$bignum(storage, iArrM9413shlWj2uyrI$bignum) >= 0) {
            iArrM28588constructorimpl = UIntArray.m28588constructorimpl(i + 1);
            UIntArray.m28599setVXSXFK8(iArrM28588constructorimpl, i, 1);
            storage = m9405minus00sMy4$bignum(storage, iArrM9413shlWj2uyrI$bignum);
        }
        for (int i2 = i - 1; -1 < i2; i2--) {
            int i3 = iM28595getSizeimpl2 + i2;
            if (i3 < UIntArray.m28595getSizeimpl(storage)) {
                jM28605constructorimpl = BigInteger32Arithmetic$$ExternalSyntheticBackport2.m1064m(ULong.m28605constructorimpl(ULong.m28605constructorimpl(ULong.m28605constructorimpl(UIntArray.m28594getpVg5ArA(storage, i3) & 4294967295L) << getBasePowerOfTwo()) + ULong.m28605constructorimpl(UIntArray.m28594getpVg5ArA(storage, i3 - 1) & 4294967295L)), ULong.m28605constructorimpl(UIntArray.m28594getpVg5ArA(storage2, iM28595getSizeimpl2 - 1) & 4294967295L));
            } else {
                jM28605constructorimpl = i3 == UIntArray.m28595getSizeimpl(storage) ? ULong.m28605constructorimpl(BigInteger32Arithmetic$$ExternalSyntheticBackport0.m1062m(UIntArray.m28594getpVg5ArA(storage, i3 - 1), UIntArray.m28594getpVg5ArA(storage2, iM28595getSizeimpl2 - 1)) & 4294967295L) : 0L;
            }
            int i4 = base;
            if (Long.compare(jM28605constructorimpl ^ Long.MIN_VALUE, ULong.m28605constructorimpl(ULong.m28605constructorimpl(4294967295L & i4) - 1) ^ Long.MIN_VALUE) < 0) {
                iM28582constructorimpl = UInt.m28582constructorimpl((int) jM28605constructorimpl);
            } else {
                iM28582constructorimpl = UInt.m28582constructorimpl(i4 - 1);
            }
            UIntArray.m28599setVXSXFK8(iArrM28588constructorimpl, i2, iM28582constructorimpl);
            int[] iArrM9413shlWj2uyrI$bignum2 = m9413shlWj2uyrI$bignum(m9416timesFE_7wA8$bignum(storage2, UIntArray.m28594getpVg5ArA(iArrM28588constructorimpl, i2)), getBasePowerOfTwo() * i2);
            while (m9398compareToYnv0uTE$bignum(iArrM9413shlWj2uyrI$bignum2, storage) > 0) {
                UIntArray.m28599setVXSXFK8(iArrM28588constructorimpl, i2, UInt.m28582constructorimpl(UIntArray.m28594getpVg5ArA(iArrM28588constructorimpl, i2) - 1));
                iArrM9413shlWj2uyrI$bignum2 = m9413shlWj2uyrI$bignum(m9416timesFE_7wA8$bignum(storage2, UIntArray.m28594getpVg5ArA(iArrM28588constructorimpl, i2)), getBasePowerOfTwo() * i2);
            }
            storage = m9405minus00sMy4$bignum(storage, iArrM9413shlWj2uyrI$bignum2);
        }
        while (m9398compareToYnv0uTE$bignum(storage, storage2) >= 0) {
            iArrM28588constructorimpl = m9409plusFE_7wA8$bignum(iArrM28588constructorimpl, 1);
            storage = m9405minus00sMy4$bignum(storage, storage2);
        }
        return new Tuples2<>(UIntArray.m28587boximpl(m9410removeLeadingZeroshkIa6DI(iArrM28588constructorimpl)), UIntArray.m28587boximpl(m9400denormalizeWj2uyrI(storage, iIntValue)));
    }

    /* renamed from: shl-Wj2uyrI$bignum, reason: not valid java name */
    public final int[] m9413shlWj2uyrI$bignum(int[] shl, int i) {
        Intrinsics.checkNotNullParameter(shl, "$this$shl");
        return m9411shiftLeftWj2uyrI(shl, i);
    }

    /* renamed from: shr-Wj2uyrI$bignum, reason: not valid java name */
    public final int[] m9414shrWj2uyrI$bignum(int[] shr, int i) {
        Intrinsics.checkNotNullParameter(shr, "$this$shr");
        return m9412shiftRightWj2uyrI(shr, i);
    }

    /* renamed from: minus-0-0sMy4$bignum, reason: not valid java name */
    public final int[] m9405minus00sMy4$bignum(int[] minus, int[] other) {
        Intrinsics.checkNotNullParameter(minus, "$this$minus");
        Intrinsics.checkNotNullParameter(other, "other");
        return m9415subtract00sMy4(minus, other);
    }

    /* renamed from: plus-FE_7wA8$bignum, reason: not valid java name */
    public final int[] m9409plusFE_7wA8$bignum(int[] plus, int i) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        return m9393add00sMy4(plus, new int[]{i});
    }

    /* renamed from: times-FE_7wA8$bignum, reason: not valid java name */
    public final int[] m9416timesFE_7wA8$bignum(int[] times, int i) {
        Intrinsics.checkNotNullParameter(times, "$this$times");
        return m9406multiplyFE_7wA8(times, i);
    }

    /* renamed from: compareTo-Ynv0uTE$bignum, reason: not valid java name */
    public final int m9398compareToYnv0uTE$bignum(int[] compareTo, int[] other) {
        Intrinsics.checkNotNullParameter(compareTo, "$this$compareTo");
        Intrinsics.checkNotNullParameter(other, "other");
        return m9397compareYnv0uTE(compareTo, other);
    }
}
