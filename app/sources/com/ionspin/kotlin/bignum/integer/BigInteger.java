package com.ionspin.kotlin.bignum.integer;

import com.ionspin.kotlin.bignum.BigNumber;
import com.ionspin.kotlin.bignum.BigNumber2;
import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import com.ionspin.kotlin.bignum.integer.base63.array.BigInteger63Arithmetic;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* compiled from: BigInteger.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0019\u0018\u0000 i2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\b\u0012\u0004\u0012\u00020\u00000\u00032\b\u0012\u0004\u0012\u00020\u00030\u00042\u00020\u0003:\u0002ijB\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0007\u0010\u0011B\u001d\b\u0000\u0012\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0007\u0010\u0017J\u001e\u0010\u001c\u001a\u00020\u00192\n\u0010\u0018\u001a\u00060\u0012j\u0002`\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00000!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0000H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0016¢\u0006\u0004\b)\u0010(J\u0017\u0010*\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0016¢\u0006\u0004\b*\u0010(J\u0017\u0010+\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0016¢\u0006\u0004\b+\u0010(J\u0017\u0010,\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0016¢\u0006\u0004\b,\u0010(J#\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000-2\u0006\u0010&\u001a\u00020\u0000H\u0016¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u0000¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0019H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0000H\u0016¢\u0006\u0004\b4\u0010%J\u000f\u00105\u001a\u00020\u0000H\u0016¢\u0006\u0004\b5\u0010%J\u0017\u00107\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u0005H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00107\u001a\u00020\u00002\u0006\u00106\u001a\u00020\tH\u0016¢\u0006\u0004\b7\u00109J\u000f\u0010:\u001a\u00020\tH\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0005H\u0016¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b>\u0010%J\u0010\u0010?\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b?\u0010%J\u0018\u0010A\u001a\u00020@2\u0006\u0010&\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\bA\u0010BJ\u0018\u0010C\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\bC\u0010DJ)\u0010I\u001a\u00020\t2\u0006\u0010F\u001a\u00020E2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0G¢\u0006\u0004\bI\u0010JJ)\u0010M\u001a\u00020\t2\u0006\u0010L\u001a\u00020K2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0G¢\u0006\u0004\bM\u0010NJ\u001a\u0010O\u001a\u00020\u00192\b\u0010&\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\tH\u0016¢\u0006\u0004\bQ\u0010;J\u000f\u0010S\u001a\u00020RH\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010S\u001a\u00020R2\u0006\u0010U\u001a\u00020\tH\u0016¢\u0006\u0004\bS\u0010VJ\u0017\u0010X\u001a\u00020R2\u0006\u0010U\u001a\u00020\tH\u0000¢\u0006\u0004\bW\u0010VJ\u0017\u0010Z\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\u0019H\u0016¢\u0006\u0004\bZ\u0010[J\u0017\u0010\\\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\\\u0010]R$\u0010^\u001a\u00060\u0012j\u0002`\u00138\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u001a\u0010b\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0017\u0010f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010;\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006k"}, m3636d2 = {"Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "Lcom/ionspin/kotlin/bignum/BigNumber;", "Lcom/ionspin/kotlin/bignum/CommonBigNumberOperations;", "", "", "", "long", "<init>", "(J)V", "", "int", "(I)V", "", "short", "(S)V", "", "byte", "(B)V", "Lkotlin/ULongArray;", "Lcom/ionspin/kotlin/bignum/integer/WordArray;", "wordArray", "Lcom/ionspin/kotlin/bignum/integer/Sign;", "requestedSign", "([JLcom/ionspin/kotlin/bignum/integer/Sign;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "resultMagnitude", "", "isResultZero-QwZRm1k", "([J)Z", "isResultZero", "", InquiryField.FloatField.TYPE2, "javascriptNumberComparison", "(Ljava/lang/Number;)I", "Lcom/ionspin/kotlin/bignum/BigNumber$Creator;", "getCreator", "()Lcom/ionspin/kotlin/bignum/BigNumber$Creator;", "getInstance", "()Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "other", "add", "(Lcom/ionspin/kotlin/bignum/integer/BigInteger;)Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "subtract", "multiply", "divide", "remainder", "Lkotlin/Pair;", "divideAndRemainder", "(Lcom/ionspin/kotlin/bignum/integer/BigInteger;)Lkotlin/Pair;", "compare", "(Lcom/ionspin/kotlin/bignum/integer/BigInteger;)I", "isZero", "()Z", "negate", "abs", "exponent", "pow", "(J)Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "(I)Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "signum", "()I", "numberOfDecimalDigits", "()J", "dec", "inc", "Lcom/ionspin/kotlin/bignum/integer/BigInteger$QuotientAndRemainder;", "divrem", "(Lcom/ionspin/kotlin/bignum/integer/BigInteger;)Lcom/ionspin/kotlin/bignum/integer/BigInteger$QuotientAndRemainder;", "compareTo", "(Ljava/lang/Object;)I", "", "float", "Lkotlin/Function1;", "comparisonBlock", "compareFloatAndBigInt", "(FLkotlin/jvm/functions/Function1;)I", "", "double", "compareDoubleAndBigInt", "(DLkotlin/jvm/functions/Function1;)I", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "base", "(I)Ljava/lang/String;", "toStringWithoutSign$bignum", "toStringWithoutSign", "exactRequired", "intValue", "(Z)I", "longValue", "(Z)J", "magnitude", "[J", "getMagnitude-Y2RjT0g$bignum", "()[J", "sign", "Lcom/ionspin/kotlin/bignum/integer/Sign;", "getSign$bignum", "()Lcom/ionspin/kotlin/bignum/integer/Sign;", "numberOfWords", "I", "getNumberOfWords", "Companion", "QuotientAndRemainder", "bignum"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class BigInteger implements BigNumber<BigInteger>, BigNumber2<BigInteger>, Comparable<Object> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final double LOG_10_OF_2;
    private static final BigInteger ONE;
    private static final BigInteger TEN;
    private static final BigInteger TWO;
    private static final BigInteger ZERO;
    private static final BigIntegerArithmetic arithmetic;
    private final long[] magnitude;
    private final int numberOfWords;
    private final BigIntegerArithmetic2 sign;

    /* compiled from: BigInteger.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BigIntegerArithmetic2.values().length];
            try {
                iArr[BigIntegerArithmetic2.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BigIntegerArithmetic2.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BigIntegerArithmetic2.ZERO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ BigInteger(long[] jArr, BigIntegerArithmetic2 bigIntegerArithmetic2, DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr, bigIntegerArithmetic2);
    }

    @Override // com.ionspin.kotlin.bignum.BigNumber2
    public BigInteger getInstance() {
        return this;
    }

    private BigInteger(long[] wordArray, BigIntegerArithmetic2 requestedSign) {
        Intrinsics.checkNotNullParameter(wordArray, "wordArray");
        Intrinsics.checkNotNullParameter(requestedSign, "requestedSign");
        BigIntegerArithmetic2 bigIntegerArithmetic2 = BigIntegerArithmetic2.ZERO;
        if (requestedSign == bigIntegerArithmetic2 && !m9363isResultZeroQwZRm1k(wordArray)) {
            throw new IllegalArgumentException("sign should be Sign.ZERO iff magnitude has a value of 0");
        }
        long[] jArrM9447removeLeadingZerosJIhQxVY = BigInteger63Arithmetic.INSTANCE.m9447removeLeadingZerosJIhQxVY(wordArray);
        this.magnitude = jArrM9447removeLeadingZerosJIhQxVY;
        this.sign = m9363isResultZeroQwZRm1k(jArrM9447removeLeadingZerosJIhQxVY) ? bigIntegerArithmetic2 : requestedSign;
        this.numberOfWords = ULongArray.m28619getSizeimpl(jArrM9447removeLeadingZerosJIhQxVY);
    }

    public BigInteger div(int i) {
        return (BigInteger) BigNumber2.DefaultImpls.div(this, i);
    }

    public BigInteger div(BigInteger bigInteger) {
        return (BigInteger) BigNumber2.DefaultImpls.div(this, bigInteger);
    }

    public BigInteger minus(BigInteger bigInteger) {
        return (BigInteger) BigNumber2.DefaultImpls.minus(this, bigInteger);
    }

    public BigInteger plus(BigInteger bigInteger) {
        return (BigInteger) BigNumber2.DefaultImpls.plus(this, bigInteger);
    }

    public BigInteger rem(int i) {
        return (BigInteger) BigNumber2.DefaultImpls.rem(this, i);
    }

    public BigInteger times(int i) {
        return (BigInteger) BigNumber2.DefaultImpls.times(this, i);
    }

    public BigInteger times(BigInteger bigInteger) {
        return (BigInteger) BigNumber2.DefaultImpls.times(this, bigInteger);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BigInteger(long j) {
        BigIntegerArithmetic2 bigIntegerArithmetic2;
        long[] jArrMo9378fromLongDHQ6RzY = arithmetic.mo9378fromLongDHQ6RzY(j);
        Number numberValueOf = Long.valueOf(j);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Long.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            if (numberValueOf.longValue() < 0) {
                bigIntegerArithmetic2 = BigIntegerArithmetic2.NEGATIVE;
            } else {
                bigIntegerArithmetic2 = numberValueOf.longValue() > 0 ? BigIntegerArithmetic2.POSITIVE : BigIntegerArithmetic2.ZERO;
            }
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            if (numberValueOf.intValue() < 0) {
                bigIntegerArithmetic2 = BigIntegerArithmetic2.NEGATIVE;
            } else {
                bigIntegerArithmetic2 = numberValueOf.intValue() > 0 ? BigIntegerArithmetic2.POSITIVE : BigIntegerArithmetic2.ZERO;
            }
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Short.TYPE))) {
            if (numberValueOf.shortValue() < 0) {
                bigIntegerArithmetic2 = BigIntegerArithmetic2.NEGATIVE;
            } else {
                bigIntegerArithmetic2 = numberValueOf.shortValue() > 0 ? BigIntegerArithmetic2.POSITIVE : BigIntegerArithmetic2.ZERO;
            }
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Byte.TYPE))) {
            if (numberValueOf.byteValue() < 0) {
                bigIntegerArithmetic2 = BigIntegerArithmetic2.NEGATIVE;
            } else {
                bigIntegerArithmetic2 = numberValueOf.byteValue() > 0 ? BigIntegerArithmetic2.POSITIVE : BigIntegerArithmetic2.ZERO;
            }
        } else {
            throw new RuntimeException("Unsupported type " + Reflection.getOrCreateKotlinClass(Long.class));
        }
        this(jArrMo9378fromLongDHQ6RzY, bigIntegerArithmetic2, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BigInteger(int i) {
        BigIntegerArithmetic2 bigIntegerArithmetic2;
        long[] jArrMo9377fromIntDHQ6RzY = arithmetic.mo9377fromIntDHQ6RzY(i);
        Number numberValueOf = Integer.valueOf(i);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Integer.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            if (numberValueOf.longValue() < 0) {
                bigIntegerArithmetic2 = BigIntegerArithmetic2.NEGATIVE;
            } else {
                bigIntegerArithmetic2 = numberValueOf.longValue() > 0 ? BigIntegerArithmetic2.POSITIVE : BigIntegerArithmetic2.ZERO;
            }
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            if (numberValueOf.intValue() < 0) {
                bigIntegerArithmetic2 = BigIntegerArithmetic2.NEGATIVE;
            } else {
                bigIntegerArithmetic2 = numberValueOf.intValue() > 0 ? BigIntegerArithmetic2.POSITIVE : BigIntegerArithmetic2.ZERO;
            }
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Short.TYPE))) {
            if (numberValueOf.shortValue() < 0) {
                bigIntegerArithmetic2 = BigIntegerArithmetic2.NEGATIVE;
            } else {
                bigIntegerArithmetic2 = numberValueOf.shortValue() > 0 ? BigIntegerArithmetic2.POSITIVE : BigIntegerArithmetic2.ZERO;
            }
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Byte.TYPE))) {
            if (numberValueOf.byteValue() < 0) {
                bigIntegerArithmetic2 = BigIntegerArithmetic2.NEGATIVE;
            } else {
                bigIntegerArithmetic2 = numberValueOf.byteValue() > 0 ? BigIntegerArithmetic2.POSITIVE : BigIntegerArithmetic2.ZERO;
            }
        } else {
            throw new RuntimeException("Unsupported type " + Reflection.getOrCreateKotlinClass(Integer.class));
        }
        this(jArrMo9377fromIntDHQ6RzY, bigIntegerArithmetic2, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BigInteger(short s) {
        BigIntegerArithmetic2 bigIntegerArithmetic2;
        long[] jArrMo9379fromShortDHQ6RzY = arithmetic.mo9379fromShortDHQ6RzY(s);
        Number numberValueOf = Short.valueOf(s);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Short.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            if (numberValueOf.longValue() < 0) {
                bigIntegerArithmetic2 = BigIntegerArithmetic2.NEGATIVE;
            } else {
                bigIntegerArithmetic2 = numberValueOf.longValue() > 0 ? BigIntegerArithmetic2.POSITIVE : BigIntegerArithmetic2.ZERO;
            }
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            if (numberValueOf.intValue() < 0) {
                bigIntegerArithmetic2 = BigIntegerArithmetic2.NEGATIVE;
            } else {
                bigIntegerArithmetic2 = numberValueOf.intValue() > 0 ? BigIntegerArithmetic2.POSITIVE : BigIntegerArithmetic2.ZERO;
            }
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Short.TYPE))) {
            if (numberValueOf.shortValue() < 0) {
                bigIntegerArithmetic2 = BigIntegerArithmetic2.NEGATIVE;
            } else {
                bigIntegerArithmetic2 = numberValueOf.shortValue() > 0 ? BigIntegerArithmetic2.POSITIVE : BigIntegerArithmetic2.ZERO;
            }
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Byte.TYPE))) {
            if (numberValueOf.byteValue() < 0) {
                bigIntegerArithmetic2 = BigIntegerArithmetic2.NEGATIVE;
            } else {
                bigIntegerArithmetic2 = numberValueOf.byteValue() > 0 ? BigIntegerArithmetic2.POSITIVE : BigIntegerArithmetic2.ZERO;
            }
        } else {
            throw new RuntimeException("Unsupported type " + Reflection.getOrCreateKotlinClass(Short.class));
        }
        this(jArrMo9379fromShortDHQ6RzY, bigIntegerArithmetic2, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BigInteger(byte b) {
        BigIntegerArithmetic2 bigIntegerArithmetic2;
        long[] jArrMo9376fromByteDHQ6RzY = arithmetic.mo9376fromByteDHQ6RzY(b);
        Number numberValueOf = Byte.valueOf(b);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Byte.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            if (numberValueOf.longValue() < 0) {
                bigIntegerArithmetic2 = BigIntegerArithmetic2.NEGATIVE;
            } else {
                bigIntegerArithmetic2 = numberValueOf.longValue() > 0 ? BigIntegerArithmetic2.POSITIVE : BigIntegerArithmetic2.ZERO;
            }
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            if (numberValueOf.intValue() < 0) {
                bigIntegerArithmetic2 = BigIntegerArithmetic2.NEGATIVE;
            } else {
                bigIntegerArithmetic2 = numberValueOf.intValue() > 0 ? BigIntegerArithmetic2.POSITIVE : BigIntegerArithmetic2.ZERO;
            }
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Short.TYPE))) {
            if (numberValueOf.shortValue() < 0) {
                bigIntegerArithmetic2 = BigIntegerArithmetic2.NEGATIVE;
            } else {
                bigIntegerArithmetic2 = numberValueOf.shortValue() > 0 ? BigIntegerArithmetic2.POSITIVE : BigIntegerArithmetic2.ZERO;
            }
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Byte.TYPE))) {
            if (numberValueOf.byteValue() < 0) {
                bigIntegerArithmetic2 = BigIntegerArithmetic2.NEGATIVE;
            } else {
                bigIntegerArithmetic2 = numberValueOf.byteValue() > 0 ? BigIntegerArithmetic2.POSITIVE : BigIntegerArithmetic2.ZERO;
            }
        } else {
            throw new RuntimeException("Unsupported type " + Reflection.getOrCreateKotlinClass(Byte.class));
        }
        this(jArrMo9376fromByteDHQ6RzY, bigIntegerArithmetic2, null);
    }

    @Override // com.ionspin.kotlin.bignum.BigNumber2
    public BigNumber.Creator<BigInteger> getCreator() {
        return INSTANCE;
    }

    /* compiled from: BigInteger.kt */
    @Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u00032\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010\u000fJ\u0017\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u0014J\u0017\u0010'\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010\u0019J\u0017\u0010*\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010\u001eJ\u001f\u0010/\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u00022\u0006\u00102\u001a\u0002012\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b3\u00104R\u001a\u00105\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u00109\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u00108R\u001a\u0010;\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u00108R\u001a\u0010=\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u00106\u001a\u0004\b>\u00108R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006B"}, m3636d2 = {"Lcom/ionspin/kotlin/bignum/integer/BigInteger$Companion;", "Lcom/ionspin/kotlin/bignum/BigNumber$Creator;", "Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "", "<init>", "()V", "", "string", "", "base", "parseString", "(Ljava/lang/String;I)Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "Lkotlin/ULong;", "uLong", "fromULong-VKZWuLQ", "(J)Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "fromULong", "Lkotlin/UInt;", "uInt", "fromUInt-WZ4Q5Ns", "(I)Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "fromUInt", "Lkotlin/UShort;", "uShort", "fromUShort-xj2QHRw", "(S)Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "fromUShort", "Lkotlin/UByte;", "uByte", "fromUByte-7apg3OU", "(B)Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "fromUByte", "", "long", "fromLong", "int", "fromInt", "", "short", "fromShort", "", "byte", "fromByte", "", "float", "", "exactRequired", "tryFromFloat", "(FZ)Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "", "double", "tryFromDouble", "(DZ)Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "ZERO", "Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "getZERO", "()Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "ONE", "getONE", "TWO", "getTWO", "TEN", "getTEN", "Lcom/ionspin/kotlin/bignum/integer/BigIntegerArithmetic;", "arithmetic", "Lcom/ionspin/kotlin/bignum/integer/BigIntegerArithmetic;", "bignum"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion implements BigNumber.Creator<BigInteger> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public BigInteger getZERO() {
            return BigInteger.ZERO;
        }

        public BigInteger getONE() {
            return BigInteger.ONE;
        }

        public BigInteger getTWO() {
            return BigInteger.TWO;
        }

        public BigInteger getTEN() {
            return BigInteger.TEN;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.ionspin.kotlin.bignum.BigNumber.Creator
        public BigInteger parseString(String string2, int base) {
            BigIntegerArithmetic2 bigIntegerArithmetic2;
            Intrinsics.checkNotNullParameter(string2, "string");
            if (base < 2 || base > 36) {
                throw new NumberFormatException("Unsupported base: " + base + ". Supported base range is from 2 to 36");
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (StringsKt.contains$default((CharSequence) string2, '.', false, 2, (Object) null)) {
                BigDecimal string3 = BigDecimal.INSTANCE.parseString(string2);
                if (string3.minus(string3.floor()).compareTo(0) > 0) {
                    throw new NumberFormatException("Supplied string is decimal, which cannot be converted to BigInteger without precision loss.");
                }
                return string3.toBigInteger();
            }
            if (string2.charAt(0) == '-' || string2.charAt(0) == '+') {
                if (string2.length() == 1) {
                    throw new NumberFormatException("Invalid big integer: " + string2);
                }
                if (string2.charAt(0) == '-') {
                    bigIntegerArithmetic2 = BigIntegerArithmetic2.NEGATIVE;
                } else {
                    bigIntegerArithmetic2 = BigIntegerArithmetic2.POSITIVE;
                }
                if (string2.length() != 2 || string2.charAt(1) != '0') {
                    BigIntegerArithmetic bigIntegerArithmetic = BigInteger.arithmetic;
                    String strSubstring = string2.substring(1, string2.length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    return new BigInteger(bigIntegerArithmetic.mo9389parseForBase_llDaS8(strSubstring, base), bigIntegerArithmetic2, defaultConstructorMarker);
                }
                return getZERO();
            }
            if (string2.length() == 1 && string2.charAt(0) == '0') {
                return getZERO();
            }
            return new BigInteger(BigInteger.arithmetic.mo9389parseForBase_llDaS8(string2, base), BigIntegerArithmetic2.POSITIVE, defaultConstructorMarker);
        }

        /* renamed from: fromULong-VKZWuLQ, reason: not valid java name */
        public BigInteger m9370fromULongVKZWuLQ(long uLong) {
            return new BigInteger(BigInteger.arithmetic.mo9382fromULongGCcj4Q(uLong), BigIntegerArithmetic2.POSITIVE, null);
        }

        /* renamed from: fromUInt-WZ4Q5Ns, reason: not valid java name */
        public BigInteger m9369fromUIntWZ4Q5Ns(int uInt) {
            return new BigInteger(BigInteger.arithmetic.mo9381fromUIntkOc6_GI(uInt), BigIntegerArithmetic2.POSITIVE, null);
        }

        /* renamed from: fromUShort-xj2QHRw, reason: not valid java name */
        public BigInteger m9371fromUShortxj2QHRw(short uShort) {
            return new BigInteger(BigInteger.arithmetic.mo9383fromUShortjOPi9CM(uShort), BigIntegerArithmetic2.POSITIVE, null);
        }

        /* renamed from: fromUByte-7apg3OU, reason: not valid java name */
        public BigInteger m9368fromUByte7apg3OU(byte uByte) {
            return new BigInteger(BigInteger.arithmetic.mo9380fromUByteab45Ak8(uByte), BigIntegerArithmetic2.POSITIVE, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.ionspin.kotlin.bignum.BigNumber.Creator
        public BigInteger fromLong(long j) {
            return new BigInteger(j);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.ionspin.kotlin.bignum.BigNumber.Creator
        public BigInteger fromInt(int i) {
            return new BigInteger(i);
        }

        public BigInteger fromShort(short s) {
            return new BigInteger(s);
        }

        public BigInteger fromByte(byte b) {
            return new BigInteger(b);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.ionspin.kotlin.bignum.BigNumber.Creator
        public BigInteger tryFromFloat(float f, boolean exactRequired) {
            double d = f;
            float fFloor = f - ((float) Math.floor(d));
            BigDecimal bigDecimalFromFloat = BigDecimal.INSTANCE.fromFloat((float) Math.floor(d), null);
            if (exactRequired && fFloor > 0.0f) {
                throw new ArithmeticException("Cant create BigInteger without precision loss, and exact  value was required");
            }
            return bigDecimalFromFloat.toBigInteger();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.ionspin.kotlin.bignum.BigNumber.Creator
        public BigInteger tryFromDouble(double d, boolean exactRequired) {
            double dFloor = d - Math.floor(d);
            BigDecimal bigDecimalFromDouble = BigDecimal.INSTANCE.fromDouble(Math.floor(d), null);
            if (exactRequired && dFloor > 0.0d) {
                throw new ArithmeticException("Cant create BigInteger without precision loss, and exact  value was required");
            }
            return bigDecimalFromDouble.toBigInteger();
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        BigIntegerArithmetic chosenArithmetic = Configuration4.getChosenArithmetic();
        arithmetic = chosenArithmetic;
        ZERO = new BigInteger(chosenArithmetic.mo9387getZEROY2RjT0g(), BigIntegerArithmetic2.ZERO, defaultConstructorMarker);
        long[] jArrMo9384getONEY2RjT0g = chosenArithmetic.mo9384getONEY2RjT0g();
        BigIntegerArithmetic2 bigIntegerArithmetic2 = BigIntegerArithmetic2.POSITIVE;
        ONE = new BigInteger(jArrMo9384getONEY2RjT0g, bigIntegerArithmetic2, defaultConstructorMarker);
        TWO = new BigInteger(chosenArithmetic.mo9386getTWOY2RjT0g(), bigIntegerArithmetic2, defaultConstructorMarker);
        TEN = new BigInteger(chosenArithmetic.mo9385getTENY2RjT0g(), bigIntegerArithmetic2, defaultConstructorMarker);
        LOG_10_OF_2 = Math.log10(2.0d);
    }

    /* renamed from: getMagnitude-Y2RjT0g$bignum, reason: not valid java name and from getter */
    public final long[] getMagnitude() {
        return this.magnitude;
    }

    /* renamed from: getSign$bignum, reason: from getter */
    public final BigIntegerArithmetic2 getSign() {
        return this.sign;
    }

    /* renamed from: isResultZero-QwZRm1k, reason: not valid java name */
    private final boolean m9363isResultZeroQwZRm1k(long[] resultMagnitude) {
        BigIntegerArithmetic bigIntegerArithmetic = arithmetic;
        return bigIntegerArithmetic.mo9374compareGR1PJdc(resultMagnitude, bigIntegerArithmetic.mo9387getZEROY2RjT0g()) == 0;
    }

    @Override // com.ionspin.kotlin.bignum.BigNumber
    public BigInteger add(BigInteger other) {
        Intrinsics.checkNotNullParameter(other, "other");
        BigIntegerArithmetic bigIntegerArithmetic = arithmetic;
        int iMo9374compareGR1PJdc = bigIntegerArithmetic.mo9374compareGR1PJdc(this.magnitude, other.magnitude);
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (other.sign == this.sign) {
            return new BigInteger(bigIntegerArithmetic.mo9372addj68ebKY(this.magnitude, other.magnitude), this.sign, defaultConstructorMarker);
        }
        if (iMo9374compareGR1PJdc > 0) {
            return new BigInteger(bigIntegerArithmetic.mo9391subtractj68ebKY(this.magnitude, other.magnitude), this.sign, defaultConstructorMarker);
        }
        if (iMo9374compareGR1PJdc < 0) {
            return new BigInteger(bigIntegerArithmetic.mo9391subtractj68ebKY(other.magnitude, this.magnitude), other.sign, defaultConstructorMarker);
        }
        return ZERO;
    }

    @Override // com.ionspin.kotlin.bignum.BigNumber
    public BigInteger subtract(BigInteger other) {
        Intrinsics.checkNotNullParameter(other, "other");
        BigIntegerArithmetic bigIntegerArithmetic = arithmetic;
        int iMo9374compareGR1PJdc = bigIntegerArithmetic.mo9374compareGR1PJdc(this.magnitude, other.magnitude);
        BigInteger bigInteger = ZERO;
        if (Intrinsics.areEqual(this, bigInteger)) {
            return other.negate();
        }
        if (Intrinsics.areEqual(other, bigInteger)) {
            return this;
        }
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (other.sign != this.sign) {
            return new BigInteger(bigIntegerArithmetic.mo9372addj68ebKY(this.magnitude, other.magnitude), this.sign, defaultConstructorMarker);
        }
        if (iMo9374compareGR1PJdc > 0) {
            return new BigInteger(bigIntegerArithmetic.mo9391subtractj68ebKY(this.magnitude, other.magnitude), this.sign, defaultConstructorMarker);
        }
        return iMo9374compareGR1PJdc < 0 ? new BigInteger(bigIntegerArithmetic.mo9391subtractj68ebKY(other.magnitude, this.magnitude), this.sign.not(), defaultConstructorMarker) : bigInteger;
    }

    @Override // com.ionspin.kotlin.bignum.BigNumber
    public BigInteger multiply(BigInteger other) {
        BigIntegerArithmetic2 bigIntegerArithmetic2;
        Intrinsics.checkNotNullParameter(other, "other");
        if (isZero() || other.isZero()) {
            return ZERO;
        }
        if (Intrinsics.areEqual(other, ONE)) {
            return this;
        }
        if (this.sign != other.sign) {
            bigIntegerArithmetic2 = BigIntegerArithmetic2.NEGATIVE;
        } else {
            bigIntegerArithmetic2 = BigIntegerArithmetic2.POSITIVE;
        }
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (bigIntegerArithmetic2 == BigIntegerArithmetic2.POSITIVE) {
            return new BigInteger(arithmetic.mo9388multiplyj68ebKY(this.magnitude, other.magnitude), bigIntegerArithmetic2, defaultConstructorMarker);
        }
        return new BigInteger(arithmetic.mo9388multiplyj68ebKY(this.magnitude, other.magnitude), bigIntegerArithmetic2, defaultConstructorMarker);
    }

    @Override // com.ionspin.kotlin.bignum.BigNumber
    public BigInteger divide(BigInteger other) {
        BigIntegerArithmetic2 bigIntegerArithmetic2;
        Intrinsics.checkNotNullParameter(other, "other");
        if (other.isZero()) {
            throw new ArithmeticException("Division by zero! " + this + " / " + other);
        }
        BigIntegerArithmetic bigIntegerArithmetic = arithmetic;
        long[] storage = bigIntegerArithmetic.mo9375divideGR1PJdc(this.magnitude, other.magnitude).getFirst().getStorage();
        if (ULongArray.m28617equalsimpl0(storage, bigIntegerArithmetic.mo9387getZEROY2RjT0g())) {
            return ZERO;
        }
        if (this.sign != other.sign) {
            bigIntegerArithmetic2 = BigIntegerArithmetic2.NEGATIVE;
        } else {
            bigIntegerArithmetic2 = BigIntegerArithmetic2.POSITIVE;
        }
        return new BigInteger(storage, bigIntegerArithmetic2, null);
    }

    @Override // com.ionspin.kotlin.bignum.BigNumber
    public BigInteger remainder(BigInteger other) {
        BigIntegerArithmetic2 bigIntegerArithmetic2;
        Intrinsics.checkNotNullParameter(other, "other");
        if (other.isZero()) {
            throw new ArithmeticException("Division by zero! " + this + " / " + other);
        }
        if (this.sign != other.sign) {
            bigIntegerArithmetic2 = BigIntegerArithmetic2.NEGATIVE;
        } else {
            bigIntegerArithmetic2 = BigIntegerArithmetic2.POSITIVE;
        }
        BigIntegerArithmetic bigIntegerArithmetic = arithmetic;
        long[] storage = bigIntegerArithmetic.mo9375divideGR1PJdc(this.magnitude, other.magnitude).getSecond().getStorage();
        if (ULongArray.m28617equalsimpl0(storage, bigIntegerArithmetic.mo9387getZEROY2RjT0g())) {
            bigIntegerArithmetic2 = BigIntegerArithmetic2.ZERO;
        }
        return new BigInteger(storage, bigIntegerArithmetic2, null);
    }

    public Tuples2<BigInteger, BigInteger> divideAndRemainder(BigInteger other) {
        BigIntegerArithmetic2 bigIntegerArithmetic2;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        Intrinsics.checkNotNullParameter(other, "other");
        if (other.isZero()) {
            throw new ArithmeticException("Division by zero! " + this + " / " + other);
        }
        if (this.sign != other.sign) {
            bigIntegerArithmetic2 = BigIntegerArithmetic2.NEGATIVE;
        } else {
            bigIntegerArithmetic2 = BigIntegerArithmetic2.POSITIVE;
        }
        BigIntegerArithmetic bigIntegerArithmetic = arithmetic;
        Tuples2<ULongArray, ULongArray> tuples2Mo9375divideGR1PJdc = bigIntegerArithmetic.mo9375divideGR1PJdc(this.magnitude, other.magnitude);
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (ULongArray.m28617equalsimpl0(tuples2Mo9375divideGR1PJdc.getFirst().getStorage(), bigIntegerArithmetic.mo9387getZEROY2RjT0g())) {
            bigInteger = ZERO;
        } else {
            bigInteger = new BigInteger(tuples2Mo9375divideGR1PJdc.getFirst().getStorage(), bigIntegerArithmetic2, defaultConstructorMarker);
        }
        if (ULongArray.m28617equalsimpl0(tuples2Mo9375divideGR1PJdc.getSecond().getStorage(), bigIntegerArithmetic.mo9387getZEROY2RjT0g())) {
            bigInteger2 = ZERO;
        } else {
            bigInteger2 = new BigInteger(tuples2Mo9375divideGR1PJdc.getSecond().getStorage(), this.sign, defaultConstructorMarker);
        }
        return new Tuples2<>(bigInteger, bigInteger2);
    }

    public final int compare(BigInteger other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (isZero() && other.isZero()) {
            return 0;
        }
        if (other.isZero() && this.sign == BigIntegerArithmetic2.POSITIVE) {
            return 1;
        }
        if (other.isZero() && this.sign == BigIntegerArithmetic2.NEGATIVE) {
            return -1;
        }
        if (isZero() && other.sign == BigIntegerArithmetic2.POSITIVE) {
            return -1;
        }
        if (isZero() && other.sign == BigIntegerArithmetic2.NEGATIVE) {
            return 1;
        }
        BigIntegerArithmetic2 bigIntegerArithmetic2 = this.sign;
        if (bigIntegerArithmetic2 != other.sign) {
            return bigIntegerArithmetic2 == BigIntegerArithmetic2.POSITIVE ? 1 : -1;
        }
        int iMo9374compareGR1PJdc = arithmetic.mo9374compareGR1PJdc(this.magnitude, other.magnitude);
        BigIntegerArithmetic2 bigIntegerArithmetic22 = this.sign;
        BigIntegerArithmetic2 bigIntegerArithmetic23 = BigIntegerArithmetic2.NEGATIVE;
        return (bigIntegerArithmetic22 == bigIntegerArithmetic23 && other.sign == bigIntegerArithmetic23) ? iMo9374compareGR1PJdc * (-1) : iMo9374compareGR1PJdc;
    }

    public boolean isZero() {
        return this.sign == BigIntegerArithmetic2.ZERO || Configuration4.getChosenArithmetic().mo9374compareGR1PJdc(this.magnitude, Configuration4.getChosenArithmetic().mo9387getZEROY2RjT0g()) == 0;
    }

    public BigInteger negate() {
        return new BigInteger(this.magnitude, this.sign.not(), null);
    }

    public BigInteger abs() {
        return new BigInteger(this.magnitude, BigIntegerArithmetic2.POSITIVE, null);
    }

    public BigInteger pow(long exponent) {
        if (exponent < 0) {
            throw new ArithmeticException("Negative exponent not supported with BigInteger");
        }
        BigInteger bigInteger = ZERO;
        if (Intrinsics.areEqual(this, bigInteger)) {
            return bigInteger;
        }
        BigInteger bigInteger2 = ONE;
        if (Intrinsics.areEqual(this, bigInteger2)) {
            return bigInteger2;
        }
        BigIntegerArithmetic2 bigIntegerArithmetic2 = this.sign;
        BigIntegerArithmetic2 bigIntegerArithmetic22 = BigIntegerArithmetic2.NEGATIVE;
        if (bigIntegerArithmetic2 != bigIntegerArithmetic22 || exponent % 2 == 0) {
            bigIntegerArithmetic22 = BigIntegerArithmetic2.POSITIVE;
        }
        return new BigInteger(arithmetic.mo9390powGERUpyg(this.magnitude, exponent), bigIntegerArithmetic22, null);
    }

    public BigInteger pow(int exponent) {
        return pow(exponent);
    }

    public int signum() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.sign.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return -1;
        }
        if (i == 3) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public long numberOfDecimalDigits() {
        if (isZero()) {
            return 1L;
        }
        int iCeil = (int) Math.ceil((arithmetic.mo9373bitLengthQwZRm1k(this.magnitude) - 1) * LOG_10_OF_2);
        BigInteger bigInteger = (BigInteger) div((BigNumber) BigIntegerExtensions.toBigInteger(10).pow(iCeil));
        long j = 0;
        while (bigInteger.compareTo(0) != 0) {
            bigInteger = (BigInteger) bigInteger.div(10);
            j++;
        }
        return j + iCeil;
    }

    public final BigInteger dec() {
        return (BigInteger) minus((BigNumber) ONE);
    }

    public final BigInteger inc() {
        return (BigInteger) plus((BigNumber) ONE);
    }

    public final QuotientAndRemainder divrem(BigInteger other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Tuples2<BigInteger, BigInteger> tuples2DivideAndRemainder = divideAndRemainder(other);
        return new QuotientAndRemainder(tuples2DivideAndRemainder.getFirst(), tuples2DivideAndRemainder.getSecond());
    }

    @Override // java.lang.Comparable
    public int compareTo(Object other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if ((other instanceof Number) && PlatformWorkarounds2.INSTANCE.currentPlatform() == PlatformWorkarounds.f964JS) {
            return javascriptNumberComparison((Number) other);
        }
        if (other instanceof BigInteger) {
            return compare((BigInteger) other);
        }
        if (other instanceof Long) {
            return compare(INSTANCE.fromLong(((Number) other).longValue()));
        }
        if (other instanceof Integer) {
            return compare(INSTANCE.fromInt(((Number) other).intValue()));
        }
        if (other instanceof Short) {
            return compare(INSTANCE.fromShort(((Number) other).shortValue()));
        }
        if (other instanceof Byte) {
            return compare(INSTANCE.fromByte(((Number) other).byteValue()));
        }
        if (other instanceof ULong) {
            return compare(INSTANCE.m9370fromULongVKZWuLQ(((ULong) other).getData()));
        }
        if (other instanceof UInt) {
            return compare(INSTANCE.m9369fromUIntWZ4Q5Ns(((UInt) other).getData()));
        }
        if (other instanceof UShort) {
            return compare(INSTANCE.m9371fromUShortxj2QHRw(((UShort) other).getData()));
        }
        if (other instanceof UByte) {
            return compare(INSTANCE.m9368fromUByte7apg3OU(((UByte) other).getData()));
        }
        if (other instanceof Float) {
            return compareFloatAndBigInt(((Number) other).floatValue(), new Function1<BigInteger, Integer>() { // from class: com.ionspin.kotlin.bignum.integer.BigInteger.compareTo.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Integer invoke(BigInteger it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Integer.valueOf(BigInteger.this.compare(it));
                }
            });
        }
        if (other instanceof Double) {
            return compareDoubleAndBigInt(((Number) other).doubleValue(), new Function1<BigInteger, Integer>() { // from class: com.ionspin.kotlin.bignum.integer.BigInteger.compareTo.2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Integer invoke(BigInteger it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Integer.valueOf(BigInteger.this.compare(it));
                }
            });
        }
        throw new RuntimeException("Invalid comparison type for BigInteger: " + Reflection.getOrCreateKotlinClass(other.getClass()));
    }

    private final int javascriptNumberComparison(Number number) {
        double dDoubleValue = number.doubleValue();
        if (dDoubleValue > 9.223372036854776E18d) {
            return compare((BigInteger) BigNumber.Creator.DefaultImpls.parseString$default(INSTANCE, String.valueOf(dDoubleValue), 0, 2, null));
        }
        if (dDoubleValue % 1 == 0.0d) {
            return compare(INSTANCE.fromLong(number.longValue()));
        }
        return compareFloatAndBigInt(number.floatValue(), new Function1<BigInteger, Integer>() { // from class: com.ionspin.kotlin.bignum.integer.BigInteger.javascriptNumberComparison.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Integer invoke(BigInteger it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(BigInteger.this.compare(it));
            }
        });
    }

    public final int compareFloatAndBigInt(float f, Function1<? super BigInteger, Integer> comparisonBlock) {
        Intrinsics.checkNotNullParameter(comparisonBlock, "comparisonBlock");
        float fFloor = (float) Math.floor(f);
        float f2 = 1;
        if (!(f % f2 == 0.0f)) {
            int iIntValue = comparisonBlock.invoke(BigNumber.Creator.DefaultImpls.tryFromFloat$default(INSTANCE, fFloor + f2, false, 2, null)).intValue();
            if (iIntValue == 0) {
                return 1;
            }
            return iIntValue;
        }
        return comparisonBlock.invoke(BigNumber.Creator.DefaultImpls.tryFromFloat$default(INSTANCE, fFloor, false, 2, null)).intValue();
    }

    public final int compareDoubleAndBigInt(double d, Function1<? super BigInteger, Integer> comparisonBlock) {
        Intrinsics.checkNotNullParameter(comparisonBlock, "comparisonBlock");
        double dFloor = Math.floor(d);
        double d2 = 1;
        if (!(d % d2 == 0.0d)) {
            int iIntValue = comparisonBlock.invoke(BigNumber.Creator.DefaultImpls.tryFromDouble$default(INSTANCE, dFloor + d2, false, 2, null)).intValue();
            if (iIntValue == 0) {
                return 1;
            }
            return iIntValue;
        }
        return comparisonBlock.invoke(BigNumber.Creator.DefaultImpls.tryFromDouble$default(INSTANCE, dFloor, false, 2, null)).intValue();
    }

    public boolean equals(Object other) {
        int iCompare;
        if (other instanceof BigInteger) {
            iCompare = compare((BigInteger) other);
        } else if (other instanceof Long) {
            iCompare = compare(INSTANCE.fromLong(((Number) other).longValue()));
        } else if (other instanceof Integer) {
            iCompare = compare(INSTANCE.fromInt(((Number) other).intValue()));
        } else if (other instanceof Short) {
            iCompare = compare(INSTANCE.fromShort(((Number) other).shortValue()));
        } else if (other instanceof Byte) {
            iCompare = compare(INSTANCE.fromByte(((Number) other).byteValue()));
        } else if (other instanceof ULong) {
            iCompare = compare(INSTANCE.m9370fromULongVKZWuLQ(((ULong) other).getData()));
        } else if (other instanceof UInt) {
            iCompare = compare(INSTANCE.m9369fromUIntWZ4Q5Ns(((UInt) other).getData()));
        } else if (other instanceof UShort) {
            iCompare = compare(INSTANCE.m9371fromUShortxj2QHRw(((UShort) other).getData()));
        } else {
            iCompare = other instanceof UByte ? compare(INSTANCE.m9368fromUByte7apg3OU(((UByte) other).getData())) : -1;
        }
        return iCompare == 0;
    }

    public int hashCode() {
        long[] jArr = this.magnitude;
        int iM28619getSizeimpl = ULongArray.m28619getSizeimpl(jArr);
        int iM28608hashCodeimpl = 0;
        for (int i = 0; i < iM28619getSizeimpl; i++) {
            iM28608hashCodeimpl += ULong.m28608hashCodeimpl(ULongArray.m28618getsVKNKU(jArr, i));
        }
        return iM28608hashCodeimpl + this.sign.hashCode();
    }

    public String toString() {
        return toString(10);
    }

    public String toString(int base) {
        String str;
        if (this.sign == BigIntegerArithmetic2.NEGATIVE) {
            str = "-";
        } else {
            str = "";
        }
        return str + toStringWithoutSign$bignum(base);
    }

    public final String toStringWithoutSign$bignum(int base) {
        return arithmetic.mo9392toStringtBf0fek(this.magnitude, base);
    }

    /* compiled from: BigInteger.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m3636d2 = {"Lcom/ionspin/kotlin/bignum/integer/BigInteger$QuotientAndRemainder;", "", "Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "quotient", "remainder", "<init>", "(Lcom/ionspin/kotlin/bignum/integer/BigInteger;Lcom/ionspin/kotlin/bignum/integer/BigInteger;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "getQuotient", "()Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "getRemainder", "bignum"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class QuotientAndRemainder {
        private final BigInteger quotient;
        private final BigInteger remainder;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuotientAndRemainder)) {
                return false;
            }
            QuotientAndRemainder quotientAndRemainder = (QuotientAndRemainder) other;
            return Intrinsics.areEqual(this.quotient, quotientAndRemainder.quotient) && Intrinsics.areEqual(this.remainder, quotientAndRemainder.remainder);
        }

        public int hashCode() {
            return (this.quotient.hashCode() * 31) + this.remainder.hashCode();
        }

        public String toString() {
            return "QuotientAndRemainder(quotient=" + this.quotient + ", remainder=" + this.remainder + ')';
        }

        public QuotientAndRemainder(BigInteger quotient, BigInteger remainder) {
            Intrinsics.checkNotNullParameter(quotient, "quotient");
            Intrinsics.checkNotNullParameter(remainder, "remainder");
            this.quotient = quotient;
            this.remainder = remainder;
        }

        public final BigInteger getQuotient() {
            return this.quotient;
        }

        public final BigInteger getRemainder() {
            return this.remainder;
        }
    }

    public int intValue(boolean exactRequired) {
        if (exactRequired && (compareTo(Integer.MAX_VALUE) > 0 || compareTo(Integer.MIN_VALUE) < 0)) {
            throw new ArithmeticException("Cannot convert to int and provide exact value");
        }
        return ((int) ULongArray.m28618getsVKNKU(this.magnitude, 0)) * signum();
    }

    public long longValue(boolean exactRequired) {
        long jM28618getsVKNKU;
        int iSignum;
        if (exactRequired && (compareTo(Long.MAX_VALUE) > 0 || compareTo(Long.MIN_VALUE) < 0)) {
            throw new ArithmeticException("Cannot convert to long and provide exact value");
        }
        if (ULongArray.m28619getSizeimpl(this.magnitude) > 1) {
            jM28618getsVKNKU = ULongArray.m28618getsVKNKU(this.magnitude, 0) | ULong.m28605constructorimpl(ULongArray.m28618getsVKNKU(this.magnitude, 1) << 63);
            iSignum = signum();
        } else {
            jM28618getsVKNKU = ULongArray.m28618getsVKNKU(this.magnitude, 0);
            iSignum = signum();
        }
        return jM28618getsVKNKU * iSignum;
    }
}
