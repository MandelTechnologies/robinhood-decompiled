package com.ionspin.kotlin.bignum.integer;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.ULongArray;

/* compiled from: BigIntegerArithmetic.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u000f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0011\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\"\u0010\u0013\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000eJ.\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H&ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\"\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u0004H&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\"\u0010&\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0004H&ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001a\u0010+\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H&ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001a\u00100\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,H&ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u001a\u00105\u001a\u00020\u00022\u0006\u00102\u001a\u000201H&ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u001a\u0010:\u001a\u00020\u00022\u0006\u00107\u001a\u000206H&ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u001d\u0010=\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u0019H&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010*J\u001d\u0010@\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u0004H&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010/J\u001d\u0010D\u001a\u00020\u00022\u0006\u0010B\u001a\u00020AH&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bC\u00104J\u001d\u0010H\u001a\u00020\u00022\u0006\u0010F\u001a\u00020EH&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bG\u00109R\u001a\u0010K\u001a\u00020\u00028&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bI\u0010JR\u001a\u0010M\u001a\u00020\u00028&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bL\u0010JR\u001a\u0010O\u001a\u00020\u00028&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bN\u0010JR\u001a\u0010Q\u001a\u00020\u00028&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bP\u0010J\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006R"}, m3636d2 = {"Lcom/ionspin/kotlin/bignum/integer/BigIntegerArithmetic;", "", "Lkotlin/ULongArray;", "value", "", "bitLength-QwZRm1k", "([J)I", "bitLength", "first", "second", "compare-GR1PJdc", "([J[J)I", "compare", "add-j68ebKY", "([J[J)[J", "add", "subtract-j68ebKY", "subtract", "multiply-j68ebKY", "multiply", "Lkotlin/Pair;", "divide-GR1PJdc", "([J[J)Lkotlin/Pair;", "divide", "base", "", "exponent", "pow-GERUpyg", "([JJ)[J", "pow", "", InquiryField.FloatField.TYPE2, "parseForBase-_llDaS8", "(Ljava/lang/String;I)[J", "parseForBase", "operand", "toString-tBf0fek", "([JI)Ljava/lang/String;", "toString", "Lkotlin/ULong;", "uLong", "fromULong--GCcj4Q", "(J)[J", "fromULong", "Lkotlin/UInt;", "uInt", "fromUInt-kOc6_GI", "(I)[J", "fromUInt", "Lkotlin/UShort;", "uShort", "fromUShort-jOPi9CM", "(S)[J", "fromUShort", "Lkotlin/UByte;", "uByte", "fromUByte-ab45Ak8", "(B)[J", "fromUByte", "long", "fromLong-DHQ6RzY", "fromLong", "int", "fromInt-DHQ6RzY", "fromInt", "", "short", "fromShort-DHQ6RzY", "fromShort", "", "byte", "fromByte-DHQ6RzY", "fromByte", "getZERO-Y2RjT0g", "()[J", "ZERO", "getONE-Y2RjT0g", "ONE", "getTWO-Y2RjT0g", "TWO", "getTEN-Y2RjT0g", "TEN", "bignum"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public interface BigIntegerArithmetic {
    /* renamed from: add-j68ebKY, reason: not valid java name */
    long[] mo9372addj68ebKY(long[] first, long[] second);

    /* renamed from: bitLength-QwZRm1k, reason: not valid java name */
    int mo9373bitLengthQwZRm1k(long[] value);

    /* renamed from: compare-GR1PJdc, reason: not valid java name */
    int mo9374compareGR1PJdc(long[] first, long[] second);

    /* renamed from: divide-GR1PJdc, reason: not valid java name */
    Tuples2<ULongArray, ULongArray> mo9375divideGR1PJdc(long[] first, long[] second);

    /* renamed from: fromByte-DHQ6RzY, reason: not valid java name */
    long[] mo9376fromByteDHQ6RzY(byte b);

    /* renamed from: fromInt-DHQ6RzY, reason: not valid java name */
    long[] mo9377fromIntDHQ6RzY(int i);

    /* renamed from: fromLong-DHQ6RzY, reason: not valid java name */
    long[] mo9378fromLongDHQ6RzY(long j);

    /* renamed from: fromShort-DHQ6RzY, reason: not valid java name */
    long[] mo9379fromShortDHQ6RzY(short s);

    /* renamed from: fromUByte-ab45Ak8, reason: not valid java name */
    long[] mo9380fromUByteab45Ak8(byte uByte);

    /* renamed from: fromUInt-kOc6_GI, reason: not valid java name */
    long[] mo9381fromUIntkOc6_GI(int uInt);

    /* renamed from: fromULong--GCcj4Q, reason: not valid java name */
    long[] mo9382fromULongGCcj4Q(long uLong);

    /* renamed from: fromUShort-jOPi9CM, reason: not valid java name */
    long[] mo9383fromUShortjOPi9CM(short uShort);

    /* renamed from: getONE-Y2RjT0g, reason: not valid java name */
    long[] mo9384getONEY2RjT0g();

    /* renamed from: getTEN-Y2RjT0g, reason: not valid java name */
    long[] mo9385getTENY2RjT0g();

    /* renamed from: getTWO-Y2RjT0g, reason: not valid java name */
    long[] mo9386getTWOY2RjT0g();

    /* renamed from: getZERO-Y2RjT0g, reason: not valid java name */
    long[] mo9387getZEROY2RjT0g();

    /* renamed from: multiply-j68ebKY, reason: not valid java name */
    long[] mo9388multiplyj68ebKY(long[] first, long[] second);

    /* renamed from: parseForBase-_llDaS8, reason: not valid java name */
    long[] mo9389parseForBase_llDaS8(String number, int base);

    /* renamed from: pow-GERUpyg, reason: not valid java name */
    long[] mo9390powGERUpyg(long[] base, long exponent);

    /* renamed from: subtract-j68ebKY, reason: not valid java name */
    long[] mo9391subtractj68ebKY(long[] first, long[] second);

    /* renamed from: toString-tBf0fek, reason: not valid java name */
    String mo9392toStringtBf0fek(long[] operand, int base);
}
