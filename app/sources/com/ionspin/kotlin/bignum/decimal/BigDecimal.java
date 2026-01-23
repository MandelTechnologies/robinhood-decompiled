package com.ionspin.kotlin.bignum.decimal;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.ionspin.kotlin.bignum.BigNumber;
import com.ionspin.kotlin.bignum.BigNumber2;
import com.ionspin.kotlin.bignum.integer.BigInteger;
import com.ionspin.kotlin.bignum.integer.BigIntegerArithmetic2;
import com.ionspin.kotlin.bignum.integer.BigIntegerExtensions;
import com.ionspin.kotlin.bignum.integer.PlatformWorkarounds;
import com.ionspin.kotlin.bignum.integer.PlatformWorkarounds2;
import com.ionspin.kotlin.bignum.integer.util.VariousUtil;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* compiled from: BigDecimal.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\f\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 w2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0002wxB'\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ1\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u001d2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\"H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\"H\u0002¢\u0006\u0004\b*\u0010)J\u0015\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0007¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00000-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0000H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0016¢\u0006\u0004\b2\u0010\u000fJ!\u00102\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u00103\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b2\u00104J\u0017\u00105\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0016¢\u0006\u0004\b5\u0010\u000fJ!\u00105\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u00103\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b5\u00104J\u0017\u00106\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0016¢\u0006\u0004\b6\u0010\u000fJ!\u00106\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u00103\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b6\u00104J\u0017\u00107\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0016¢\u0006\u0004\b7\u0010\u000fJ!\u00107\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u00103\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b7\u00104J\u0017\u00108\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0016¢\u0006\u0004\b8\u0010\u000fJ#\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000092\u0006\u0010\u0010\u001a\u00020\u0000H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0015H\u0016¢\u0006\u0004\b<\u0010=J-\u0010@\u001a\u00020\u00002\b\b\u0002\u0010>\u001a\u00020\u00052\b\b\u0002\u0010?\u001a\u00020\u00072\n\b\u0002\u00103\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b@\u0010AJ\u0015\u0010C\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\"¢\u0006\u0004\bC\u0010DJ\u0015\u0010C\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u0007¢\u0006\u0004\bC\u0010,J\r\u0010E\u001a\u00020\u0000¢\u0006\u0004\bE\u00101J\r\u0010F\u001a\u00020\u0005¢\u0006\u0004\bF\u0010GJ$\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000092\u0006\u0010\u0010\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\bH\u0010;J\u0018\u0010I\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\bI\u0010\u000fJ\u0018\u0010J\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\bJ\u0010\u000fJ\u0018\u0010K\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\bK\u0010\u000fJ\u000f\u0010L\u001a\u00020\u0000H\u0016¢\u0006\u0004\bL\u00101J\u000f\u0010M\u001a\u00020\u0000H\u0016¢\u0006\u0004\bM\u00101J\u0017\u0010N\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\bN\u0010OJ\r\u0010P\u001a\u00020\u0015¢\u0006\u0004\bP\u0010=J\u0017\u0010Q\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bQ\u0010RJ\u0015\u0010S\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\u0000¢\u0006\u0004\bS\u0010TJ\u0018\u0010U\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\bU\u0010VJ\u001a\u0010W\u001a\u00020\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\"H\u0016¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020%H\u0016¢\u0006\u0004\b[\u0010\\J\r\u0010]\u001a\u00020%¢\u0006\u0004\b]\u0010\\J\r\u0010^\u001a\u00020%¢\u0006\u0004\b^\u0010\\J\u001c\u0010K\u001a\u00020%*\u00020\u00072\u0006\u0010`\u001a\u00020_H\u0086\u0002¢\u0006\u0004\bK\u0010aR\u0017\u0010b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0017\u0010>\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b>\u0010f\u001a\u0004\bg\u0010GR\u0017\u0010?\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b?\u0010c\u001a\u0004\bh\u0010eR\u0019\u00103\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b3\u0010i\u001a\u0004\bj\u0010kR\u0017\u0010l\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bl\u0010c\u001a\u0004\bm\u0010eR\u0017\u0010o\u001a\u00020n8\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u0017\u0010+\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b+\u0010c\u001a\u0004\bs\u0010eR\u0017\u0010t\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010=¨\u0006y"}, m3636d2 = {"Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "Lcom/ionspin/kotlin/bignum/BigNumber;", "Lcom/ionspin/kotlin/bignum/CommonBigNumberOperations;", "", "", "Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "_significand", "", "_exponent", "Lcom/ionspin/kotlin/bignum/decimal/DecimalMode;", "_decimalMode", "<init>", "(Lcom/ionspin/kotlin/bignum/integer/BigInteger;JLcom/ionspin/kotlin/bignum/decimal/DecimalMode;)V", "bigDecimal", "removeTrailingZeroes", "(Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;)Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "other", "Lcom/ionspin/kotlin/bignum/decimal/BigDecimal$ScaleOps;", "op", "computeMode", "(Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal$ScaleOps;)Lcom/ionspin/kotlin/bignum/decimal/DecimalMode;", "", "exactRequired", "", "checkWholeness", "(Z)V", "getRidOfRadix", "first", "second", "Lkotlin/Triple;", "bringSignificandToSameExponent", "(Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;)Lkotlin/Triple;", "", InquiryField.FloatField.TYPE2, "", "javascriptNumberComparison", "(Ljava/lang/Number;)I", "", "input", "position", "placeADotInStringExpanded", "(Ljava/lang/String;I)Ljava/lang/String;", "placeADotInString", "scale", "(J)Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "Lcom/ionspin/kotlin/bignum/BigNumber$Creator;", "getCreator", "()Lcom/ionspin/kotlin/bignum/BigNumber$Creator;", "getInstance", "()Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "add", "decimalMode", "(Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lcom/ionspin/kotlin/bignum/decimal/DecimalMode;)Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "subtract", "multiply", "divide", "remainder", "Lkotlin/Pair;", "divideAndRemainder", "(Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;)Lkotlin/Pair;", "isZero", "()Z", "significand", "exponent", "copy", "(Lcom/ionspin/kotlin/bignum/integer/BigInteger;JLcom/ionspin/kotlin/bignum/decimal/DecimalMode;)Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "places", "moveDecimalPoint", "(I)Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", PlaceTypes.FLOOR, "toBigInteger", "()Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "divrem", "plus", "minus", "times", "abs", "negate", "longValue", "(Z)J", "isWholeNumber", "roundSignificand", "(Lcom/ionspin/kotlin/bignum/decimal/DecimalMode;)Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "compare", "(Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;)I", "compareTo", "(Ljava/lang/Object;)I", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "toPlainString", "toStringExpanded", "", "char", "(JC)Ljava/lang/String;", "precision", "J", "getPrecision", "()J", "Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "getSignificand", "getExponent", "Lcom/ionspin/kotlin/bignum/decimal/DecimalMode;", "getDecimalMode", "()Lcom/ionspin/kotlin/bignum/decimal/DecimalMode;", "precisionLimit", "getPrecisionLimit", "Lcom/ionspin/kotlin/bignum/decimal/RoundingMode;", "roundingMode", "Lcom/ionspin/kotlin/bignum/decimal/RoundingMode;", "getRoundingMode", "()Lcom/ionspin/kotlin/bignum/decimal/RoundingMode;", "getScale", "usingScale", "Z", "getUsingScale", "Companion", "ScaleOps", "bignum"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class BigDecimal implements BigNumber<BigDecimal>, BigNumber2<BigDecimal>, Comparable<Object> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final BigDecimal ONE;
    private static final BigDecimal TEN;
    private static final BigDecimal TWO;
    private static final BigDecimal ZERO;
    private static final double[] double10pow;
    private static final float[] float10pow;
    private static final BigDecimal leastSignificantDouble;
    private static final BigDecimal leastSignificantFloat;
    private static final BigDecimal maximumDouble;
    private static final BigDecimal maximumFloat;
    private static boolean useToStringExpanded;
    private final DecimalMode decimalMode;
    private final long exponent;
    private final long precision;
    private final long precisionLimit;
    private final DecimalMode2 roundingMode;
    private final long scale;
    private final BigInteger significand;
    private final boolean usingScale;

    /* compiled from: BigDecimal.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[ScaleOps.values().length];
            try {
                iArr2[ScaleOps.Max.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ScaleOps.Min.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ScaleOps.Add.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public /* synthetic */ BigDecimal(BigInteger bigInteger, long j, DecimalMode decimalMode, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigInteger, j, decimalMode);
    }

    @Override // com.ionspin.kotlin.bignum.BigNumber2
    public BigDecimal getInstance() {
        return this;
    }

    private BigDecimal(BigInteger bigInteger, long j, DecimalMode decimalMode) {
        DecimalMode2 roundingMode;
        if (decimalMode == null || !decimalMode.getUsingScale()) {
            this.significand = bigInteger;
            this.precision = bigInteger.numberOfDecimalDigits();
            this.exponent = j;
            this.decimalMode = decimalMode;
        } else {
            BigDecimal bigDecimalApplyScale = INSTANCE.applyScale(bigInteger, j, decimalMode);
            if (!bigDecimalApplyScale.isZero()) {
                BigInteger bigInteger2 = bigDecimalApplyScale.significand;
                this.significand = bigInteger2;
                this.exponent = bigDecimalApplyScale.exponent;
                long jNumberOfDecimalDigits = bigInteger2.numberOfDecimalDigits();
                this.precision = jNumberOfDecimalDigits;
                this.decimalMode = DecimalMode.copy$default(decimalMode, jNumberOfDecimalDigits, null, 0L, 6, null);
            } else {
                this.significand = bigDecimalApplyScale.significand;
                this.exponent = bigDecimalApplyScale.exponent * (decimalMode.getDecimalPrecision() + decimalMode.getScale());
                long decimalPrecision = decimalMode.getDecimalPrecision() + decimalMode.getScale();
                this.precision = decimalPrecision;
                this.decimalMode = DecimalMode.copy$default(decimalMode, decimalPrecision, null, 0L, 6, null);
            }
        }
        DecimalMode decimalMode2 = this.decimalMode;
        this.precisionLimit = decimalMode2 != null ? decimalMode2.getDecimalPrecision() : 0L;
        DecimalMode decimalMode3 = this.decimalMode;
        this.roundingMode = (decimalMode3 == null || (roundingMode = decimalMode3.getRoundingMode()) == null) ? DecimalMode2.NONE : roundingMode;
        DecimalMode decimalMode4 = this.decimalMode;
        long scale = decimalMode4 != null ? decimalMode4.getScale() : -1L;
        this.scale = scale;
        this.usingScale = scale >= 0;
    }

    /* synthetic */ BigDecimal(BigInteger bigInteger, long j, DecimalMode decimalMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigInteger, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? null : decimalMode);
    }

    public BigDecimal minus(int i) {
        return (BigDecimal) BigNumber2.DefaultImpls.minus((BigNumber2) this, i);
    }

    public BigDecimal minus(long j) {
        return (BigDecimal) BigNumber2.DefaultImpls.minus(this, j);
    }

    public BigDecimal plus(int i) {
        return (BigDecimal) BigNumber2.DefaultImpls.plus(this, i);
    }

    public final long getPrecision() {
        return this.precision;
    }

    public final BigInteger getSignificand() {
        return this.significand;
    }

    public final long getExponent() {
        return this.exponent;
    }

    /* compiled from: BigDecimal.kt */
    @Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\b\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001SB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\fJ'\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\fJ-\u0010\u0018\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\fJ!\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b \u0010!J!\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b$\u0010%J!\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b(\u0010)J!\u0010,\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b,\u0010-J!\u00100\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b0\u00101J\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u00102J\u0017\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u00103J\u0017\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u00104J\u0017\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u00105J\u001f\u00108\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u001f\u0010:\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b:\u0010;J\u001f\u0010?\u001a\u00020\u00022\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\u001eH\u0016¢\u0006\u0004\b?\u0010@J\u0015\u0010?\u001a\u00020\u00022\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b?\u0010AJ!\u0010C\u001a\u00020\u00022\u0006\u0010B\u001a\u00020<2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bC\u0010DR\u001a\u0010E\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010FR\u0014\u0010P\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010FR\u0014\u0010Q\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010FR\u0014\u0010R\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010F¨\u0006T"}, m3636d2 = {"Lcom/ionspin/kotlin/bignum/decimal/BigDecimal$Companion;", "Lcom/ionspin/kotlin/bignum/BigNumber$Creator;", "Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "<init>", "()V", "Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "significand", "", "exponent", "Lcom/ionspin/kotlin/bignum/decimal/DecimalMode;", "decimalMode", "roundOrDont", "(Lcom/ionspin/kotlin/bignum/integer/BigInteger;JLcom/ionspin/kotlin/bignum/decimal/DecimalMode;)Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "discarded", "Lcom/ionspin/kotlin/bignum/decimal/BigDecimal$Companion$SignificantDecider;", "determineDecider", "(Lcom/ionspin/kotlin/bignum/integer/BigInteger;)Lcom/ionspin/kotlin/bignum/decimal/BigDecimal$Companion$SignificantDecider;", "roundDiscarded", "(Lcom/ionspin/kotlin/bignum/integer/BigInteger;Lcom/ionspin/kotlin/bignum/integer/BigInteger;Lcom/ionspin/kotlin/bignum/decimal/DecimalMode;)Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "roundSignificand", "applyScale", "firstDecimalMode", "secondDecimalMode", "suppliedDecimalMode", "resolveDecimalMode", "(Lcom/ionspin/kotlin/bignum/decimal/DecimalMode;Lcom/ionspin/kotlin/bignum/decimal/DecimalMode;Lcom/ionspin/kotlin/bignum/decimal/DecimalMode;)Lcom/ionspin/kotlin/bignum/decimal/DecimalMode;", "handleZeroRounding", "long", "fromLong", "(JLcom/ionspin/kotlin/bignum/decimal/DecimalMode;)Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "", "int", "fromInt", "(ILcom/ionspin/kotlin/bignum/decimal/DecimalMode;)Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "", "short", "fromShort", "(SLcom/ionspin/kotlin/bignum/decimal/DecimalMode;)Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "", "byte", "fromByte", "(BLcom/ionspin/kotlin/bignum/decimal/DecimalMode;)Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "", "float", "fromFloat", "(FLcom/ionspin/kotlin/bignum/decimal/DecimalMode;)Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "", "double", "fromDouble", "(DLcom/ionspin/kotlin/bignum/decimal/DecimalMode;)Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "(J)Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "(I)Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "(S)Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "(B)Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "", "exactRequired", "tryFromFloat", "(FZ)Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "tryFromDouble", "(DZ)Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "", "string", "base", "parseString", "(Ljava/lang/String;I)Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "(Ljava/lang/String;)Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "floatingPointString", "parseStringWithMode", "(Ljava/lang/String;Lcom/ionspin/kotlin/bignum/decimal/DecimalMode;)Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "ZERO", "Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "getZERO", "()Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "", "double10pow", "[D", "", "float10pow", "[F", "leastSignificantDouble", "leastSignificantFloat", "maximumDouble", "maximumFloat", "SignificantDecider", "bignum"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements BigNumber.Creator<BigDecimal> {

        /* compiled from: BigDecimal.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
                int[] iArr2 = new int[DecimalMode2.values().length];
                try {
                    iArr2[DecimalMode2.AWAY_FROM_ZERO.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[DecimalMode2.TOWARDS_ZERO.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[DecimalMode2.CEILING.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[DecimalMode2.FLOOR.ordinal()] = 4;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[DecimalMode2.ROUND_HALF_AWAY_FROM_ZERO.ordinal()] = 5;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[DecimalMode2.ROUND_HALF_TOWARDS_ZERO.ordinal()] = 6;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr2[DecimalMode2.ROUND_HALF_CEILING.ordinal()] = 7;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr2[DecimalMode2.ROUND_HALF_FLOOR.ordinal()] = 8;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr2[DecimalMode2.ROUND_HALF_TO_EVEN.ordinal()] = 9;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr2[DecimalMode2.ROUND_HALF_TO_ODD.ordinal()] = 10;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr2[DecimalMode2.NONE.ordinal()] = 11;
                } catch (NoSuchFieldError unused14) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public BigDecimal getZERO() {
            return BigDecimal.ZERO;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final BigDecimal roundOrDont(BigInteger significand, long exponent, DecimalMode decimalMode) {
            if (decimalMode.getIsPrecisionUnlimited()) {
                return new BigDecimal(significand, exponent, null, 4, null);
            }
            return roundSignificand(significand, exponent, decimalMode);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: BigDecimal.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/ionspin/kotlin/bignum/decimal/BigDecimal$Companion$SignificantDecider;", "", "(Ljava/lang/String;I)V", "FIVE", "LESS_THAN_FIVE", "MORE_THAN_FIVE", "bignum"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class SignificantDecider {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ SignificantDecider[] $VALUES;
            public static final SignificantDecider FIVE = new SignificantDecider("FIVE", 0);
            public static final SignificantDecider LESS_THAN_FIVE = new SignificantDecider("LESS_THAN_FIVE", 1);
            public static final SignificantDecider MORE_THAN_FIVE = new SignificantDecider("MORE_THAN_FIVE", 2);

            private static final /* synthetic */ SignificantDecider[] $values() {
                return new SignificantDecider[]{FIVE, LESS_THAN_FIVE, MORE_THAN_FIVE};
            }

            public static EnumEntries<SignificantDecider> getEntries() {
                return $ENTRIES;
            }

            public static SignificantDecider valueOf(String str) {
                return (SignificantDecider) Enum.valueOf(SignificantDecider.class, str);
            }

            public static SignificantDecider[] values() {
                return (SignificantDecider[]) $VALUES.clone();
            }

            private SignificantDecider(String str, int i) {
            }

            static {
                SignificantDecider[] significantDeciderArr$values = $values();
                $VALUES = significantDeciderArr$values;
                $ENTRIES = EnumEntries2.enumEntries(significantDeciderArr$values);
            }
        }

        private final SignificantDecider determineDecider(BigInteger discarded) {
            BigInteger.Companion companion = BigInteger.INSTANCE;
            BigInteger.QuotientAndRemainder quotientAndRemainderDivrem = discarded.divrem(companion.getTEN().pow(discarded.numberOfDecimalDigits() - 1));
            int iIntValue = quotientAndRemainderDivrem.getQuotient().abs().intValue(true);
            BigInteger bigIntegerAbs = quotientAndRemainderDivrem.getRemainder().abs();
            if (iIntValue == 5) {
                if (Intrinsics.areEqual(bigIntegerAbs, companion.getZERO())) {
                    return SignificantDecider.FIVE;
                }
                return SignificantDecider.MORE_THAN_FIVE;
            }
            if (iIntValue > 5) {
                return SignificantDecider.MORE_THAN_FIVE;
            }
            if (iIntValue < 5) {
                return SignificantDecider.LESS_THAN_FIVE;
            }
            throw new RuntimeException("Couldn't determine decider");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final BigInteger roundDiscarded(BigInteger significand, BigInteger discarded, DecimalMode decimalMode) {
            Tuples2 tuples2;
            BigIntegerArithmetic2 sign$bignum;
            long jNumberOfDecimalDigits = significand.numberOfDecimalDigits() - decimalMode.getDecimalPrecision();
            if (jNumberOfDecimalDigits > 0) {
                BigInteger.QuotientAndRemainder quotientAndRemainderDivrem = significand.divrem(BigInteger.INSTANCE.getTEN().pow(jNumberOfDecimalDigits));
                tuples2 = new Tuples2(quotientAndRemainderDivrem.getQuotient(), quotientAndRemainderDivrem.getRemainder());
            } else {
                tuples2 = new Tuples2(significand, discarded);
            }
            BigInteger bigIntegerInc = (BigInteger) tuples2.component1();
            BigInteger bigInteger = (BigInteger) tuples2.component2();
            BigInteger.Companion companion = BigInteger.INSTANCE;
            if (Intrinsics.areEqual(significand, companion.getZERO())) {
                sign$bignum = discarded.getSign();
            } else {
                sign$bignum = significand.getSign();
            }
            if (decimalMode.getRoundingMode() == DecimalMode2.AWAY_FROM_ZERO || decimalMode.getRoundingMode() == DecimalMode2.TOWARDS_ZERO ? !bigInteger.isZero() || !discarded.isZero() : !bigInteger.isZero()) {
                SignificantDecider significantDeciderDetermineDecider = determineDecider(bigInteger);
                switch (WhenMappings.$EnumSwitchMapping$1[decimalMode.getRoundingMode().ordinal()]) {
                    case 1:
                        if (sign$bignum == BigIntegerArithmetic2.POSITIVE) {
                            return bigIntegerInc.inc();
                        }
                        return bigIntegerInc.dec();
                    case 3:
                        if (sign$bignum == BigIntegerArithmetic2.POSITIVE) {
                            return bigIntegerInc.inc();
                        }
                        break;
                    case 4:
                        if (sign$bignum != BigIntegerArithmetic2.POSITIVE) {
                            return bigIntegerInc.dec();
                        }
                        break;
                    case 5:
                        int i = WhenMappings.$EnumSwitchMapping$0[sign$bignum.ordinal()];
                        if (i == 1) {
                            if (significantDeciderDetermineDecider != SignificantDecider.LESS_THAN_FIVE) {
                                return bigIntegerInc.inc();
                            }
                        } else if (i == 2 && significantDeciderDetermineDecider != SignificantDecider.LESS_THAN_FIVE) {
                            return bigIntegerInc.dec();
                        }
                        break;
                    case 6:
                        int i2 = WhenMappings.$EnumSwitchMapping$0[sign$bignum.ordinal()];
                        if (i2 == 1) {
                            if (significantDeciderDetermineDecider == SignificantDecider.MORE_THAN_FIVE) {
                                return bigIntegerInc.inc();
                            }
                        } else if (i2 == 2 && significantDeciderDetermineDecider == SignificantDecider.MORE_THAN_FIVE) {
                            return bigIntegerInc.dec();
                        }
                        break;
                    case 7:
                        int i3 = WhenMappings.$EnumSwitchMapping$0[sign$bignum.ordinal()];
                        if (i3 == 1) {
                            if (significantDeciderDetermineDecider != SignificantDecider.LESS_THAN_FIVE) {
                                return bigIntegerInc.inc();
                            }
                        } else if (i3 == 2 && significantDeciderDetermineDecider == SignificantDecider.MORE_THAN_FIVE) {
                            return bigIntegerInc.dec();
                        }
                        break;
                    case 8:
                        int i4 = WhenMappings.$EnumSwitchMapping$0[sign$bignum.ordinal()];
                        if (i4 == 1) {
                            if (significantDeciderDetermineDecider == SignificantDecider.MORE_THAN_FIVE) {
                                return bigIntegerInc.inc();
                            }
                        } else if (i4 == 2 && significantDeciderDetermineDecider != SignificantDecider.LESS_THAN_FIVE) {
                            return bigIntegerInc.dec();
                        }
                        break;
                    case 9:
                        if (significantDeciderDetermineDecider == SignificantDecider.FIVE) {
                            if (Intrinsics.areEqual(((BigInteger) significand.rem(2)).abs(), companion.getONE())) {
                                int i5 = WhenMappings.$EnumSwitchMapping$0[sign$bignum.ordinal()];
                                if (i5 == 1) {
                                    return bigIntegerInc.inc();
                                }
                                if (i5 == 2) {
                                    return bigIntegerInc.dec();
                                }
                            }
                        } else if (significantDeciderDetermineDecider == SignificantDecider.MORE_THAN_FIVE) {
                            if (sign$bignum == BigIntegerArithmetic2.POSITIVE) {
                                bigIntegerInc = bigIntegerInc.inc();
                            }
                            return sign$bignum == BigIntegerArithmetic2.NEGATIVE ? bigIntegerInc.dec() : bigIntegerInc;
                        }
                        break;
                    case 10:
                        if (significantDeciderDetermineDecider == SignificantDecider.FIVE) {
                            if (Intrinsics.areEqual(significand.rem(2), companion.getZERO())) {
                                int i6 = WhenMappings.$EnumSwitchMapping$0[sign$bignum.ordinal()];
                                if (i6 == 1) {
                                    return bigIntegerInc.inc();
                                }
                                if (i6 == 2) {
                                    return bigIntegerInc.dec();
                                }
                            }
                        } else if (significantDeciderDetermineDecider == SignificantDecider.MORE_THAN_FIVE) {
                            if (sign$bignum == BigIntegerArithmetic2.POSITIVE) {
                                bigIntegerInc = bigIntegerInc.inc();
                            }
                            return sign$bignum == BigIntegerArithmetic2.NEGATIVE ? bigIntegerInc.dec() : bigIntegerInc;
                        }
                        break;
                    case 11:
                        throw new ArithmeticException("Non-terminating result of division operation. Specify decimalPrecision");
                }
            }
            return bigIntegerInc;
        }

        public final BigDecimal handleZeroRounding(BigInteger significand, long exponent, DecimalMode decimalMode) {
            Intrinsics.checkNotNullParameter(significand, "significand");
            Intrinsics.checkNotNullParameter(decimalMode, "decimalMode");
            if (significand.getSign() == BigIntegerArithmetic2.POSITIVE) {
                int i = WhenMappings.$EnumSwitchMapping$1[decimalMode.getRoundingMode().ordinal()];
                if (i == 1 || i == 3) {
                    BigInteger bigIntegerInc = significand.inc();
                    return new BigDecimal(bigIntegerInc, exponent + (bigIntegerInc.numberOfDecimalDigits() - significand.numberOfDecimalDigits()), decimalMode, null);
                }
                return new BigDecimal(significand, exponent, decimalMode, null);
            }
            if (significand.getSign() == BigIntegerArithmetic2.NEGATIVE) {
                int i2 = WhenMappings.$EnumSwitchMapping$1[decimalMode.getRoundingMode().ordinal()];
                if (i2 == 1 || i2 == 4) {
                    BigInteger bigIntegerDec = significand.dec();
                    return new BigDecimal(bigIntegerDec, exponent + (bigIntegerDec.numberOfDecimalDigits() - significand.numberOfDecimalDigits()), decimalMode, null);
                }
                return new BigDecimal(significand, exponent, decimalMode, null);
            }
            return new BigDecimal(significand, exponent, decimalMode, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final BigDecimal roundSignificand(BigInteger significand, long exponent, DecimalMode decimalMode) {
            long decimalPrecision;
            BigInteger.Companion companion = BigInteger.INSTANCE;
            if (Intrinsics.areEqual(significand, companion.getZERO())) {
                return new BigDecimal(companion.getZERO(), exponent, decimalMode, null);
            }
            long jNumberOfDecimalDigits = significand.numberOfDecimalDigits();
            if (decimalMode.getUsingScale()) {
                decimalPrecision = decimalMode.getDecimalPrecision() + decimalMode.getScale();
            } else {
                decimalPrecision = decimalMode.getDecimalPrecision();
            }
            if (decimalPrecision > jNumberOfDecimalDigits) {
                return new BigDecimal((BigInteger) significand.times((BigNumber) companion.getTEN().pow(decimalPrecision - jNumberOfDecimalDigits)), exponent, decimalMode, null);
            }
            if (decimalPrecision < jNumberOfDecimalDigits) {
                BigInteger.QuotientAndRemainder quotientAndRemainderDivrem = significand.divrem(companion.getTEN().pow(jNumberOfDecimalDigits - decimalPrecision));
                BigInteger remainder = quotientAndRemainderDivrem.getRemainder();
                if (Intrinsics.areEqual(quotientAndRemainderDivrem.getRemainder(), companion.getZERO())) {
                    return new BigDecimal(quotientAndRemainderDivrem.getQuotient(), exponent, decimalMode, null);
                }
                if (significand.numberOfDecimalDigits() == quotientAndRemainderDivrem.getQuotient().numberOfDecimalDigits() + quotientAndRemainderDivrem.getRemainder().numberOfDecimalDigits()) {
                    BigInteger bigIntegerRoundDiscarded = roundDiscarded(quotientAndRemainderDivrem.getQuotient(), remainder, decimalMode);
                    return new BigDecimal(bigIntegerRoundDiscarded, exponent + (bigIntegerRoundDiscarded.numberOfDecimalDigits() - quotientAndRemainderDivrem.getQuotient().numberOfDecimalDigits()), decimalMode, null);
                }
                return handleZeroRounding(quotientAndRemainderDivrem.getQuotient(), exponent, decimalMode);
            }
            return new BigDecimal(significand, exponent, decimalMode, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final BigDecimal applyScale(BigInteger significand, long exponent, DecimalMode decimalMode) {
            DecimalMode decimalMode2;
            if (!decimalMode.getUsingScale()) {
                return new BigDecimal(significand, exponent, decimalMode, null);
            }
            if (exponent >= 0) {
                decimalMode2 = new DecimalMode(decimalMode.getScale() + exponent + 1, decimalMode.getRoundingMode(), 0L, 4, null);
            } else if (exponent < 0) {
                decimalMode2 = new DecimalMode(decimalMode.getScale() + 1, decimalMode.getRoundingMode(), 0L, 4, null);
            } else {
                throw new RuntimeException("Unexpected state");
            }
            if (exponent >= 0) {
                return roundSignificand(significand, exponent, decimalMode2);
            }
            if (decimalMode.getRoundingMode() == DecimalMode2.ROUND_HALF_TO_EVEN) {
                BigDecimal bigDecimal = (BigDecimal) new BigDecimal(significand, exponent, null, 4, null).plus(significand.signum() * 2);
                return (BigDecimal) roundSignificand(bigDecimal.getSignificand(), bigDecimal.getExponent(), decimalMode2).minus(significand.signum() * 2);
            }
            BigDecimal bigDecimal2 = (BigDecimal) new BigDecimal(significand, exponent, null, 4, null).plus(significand.signum());
            return (BigDecimal) roundSignificand(bigDecimal2.getSignificand(), bigDecimal2.getExponent(), decimalMode2).minus(significand.signum());
        }

        public final BigDecimal fromLong(long j, DecimalMode decimalMode) {
            BigInteger bigIntegerFromLong = BigInteger.INSTANCE.fromLong(j);
            return new BigDecimal(bigIntegerFromLong, bigIntegerFromLong.numberOfDecimalDigits() - 1, decimalMode, null).roundSignificand(decimalMode);
        }

        public final BigDecimal fromInt(int i, DecimalMode decimalMode) {
            BigInteger bigIntegerFromInt = BigInteger.INSTANCE.fromInt(i);
            return new BigDecimal(bigIntegerFromInt, bigIntegerFromInt.numberOfDecimalDigits() - 1, decimalMode, null).roundSignificand(decimalMode);
        }

        public final BigDecimal fromShort(short s, DecimalMode decimalMode) {
            BigInteger bigIntegerFromShort = BigInteger.INSTANCE.fromShort(s);
            return new BigDecimal(bigIntegerFromShort, bigIntegerFromShort.numberOfDecimalDigits() - 1, decimalMode, null).roundSignificand(decimalMode);
        }

        public final BigDecimal fromByte(byte b, DecimalMode decimalMode) {
            BigInteger bigIntegerFromByte = BigInteger.INSTANCE.fromByte(b);
            return new BigDecimal(bigIntegerFromByte, bigIntegerFromByte.numberOfDecimalDigits() - 1, decimalMode, null).roundSignificand(decimalMode);
        }

        public static /* synthetic */ BigDecimal fromFloat$default(Companion companion, float f, DecimalMode decimalMode, int i, Object obj) {
            if ((i & 2) != 0) {
                decimalMode = null;
            }
            return companion.fromFloat(f, decimalMode);
        }

        public final BigDecimal fromFloat(float f, DecimalMode decimalMode) {
            String strSubstring;
            String strValueOf = String.valueOf(f);
            if (!StringsKt.contains$default((CharSequence) strValueOf, '.', false, 2, (Object) null) || StringsKt.contains((CharSequence) strValueOf, 'E', true)) {
                return parseStringWithMode(strValueOf, decimalMode).roundSignificand(decimalMode);
            }
            int lastIndex = StringsKt.getLastIndex(strValueOf);
            while (true) {
                if (-1 < lastIndex) {
                    if (strValueOf.charAt(lastIndex) != '0') {
                        strSubstring = strValueOf.substring(0, lastIndex + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        break;
                    }
                    lastIndex--;
                } else {
                    strSubstring = "";
                    break;
                }
            }
            return parseStringWithMode(strSubstring, decimalMode).roundSignificand(decimalMode);
        }

        public static /* synthetic */ BigDecimal fromDouble$default(Companion companion, double d, DecimalMode decimalMode, int i, Object obj) {
            if ((i & 2) != 0) {
                decimalMode = null;
            }
            return companion.fromDouble(d, decimalMode);
        }

        public final BigDecimal fromDouble(double d, DecimalMode decimalMode) {
            String strSubstring;
            String strValueOf = String.valueOf(d);
            if (!StringsKt.contains$default((CharSequence) strValueOf, '.', false, 2, (Object) null) || StringsKt.contains((CharSequence) strValueOf, 'E', true)) {
                return parseStringWithMode(strValueOf, decimalMode).roundSignificand(decimalMode).roundSignificand(decimalMode);
            }
            int lastIndex = StringsKt.getLastIndex(strValueOf);
            while (true) {
                if (-1 < lastIndex) {
                    if (strValueOf.charAt(lastIndex) != '0') {
                        strSubstring = strValueOf.substring(0, lastIndex + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        break;
                    }
                    lastIndex--;
                } else {
                    strSubstring = "";
                    break;
                }
            }
            return parseStringWithMode(strSubstring, decimalMode).roundSignificand(decimalMode);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.ionspin.kotlin.bignum.BigNumber.Creator
        public BigDecimal fromLong(long j) {
            return fromLong(j, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.ionspin.kotlin.bignum.BigNumber.Creator
        public BigDecimal fromInt(int i) {
            return fromInt(i, null);
        }

        public BigDecimal fromShort(short s) {
            return fromShort(s, null);
        }

        public BigDecimal fromByte(byte b) {
            return fromByte(b, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.ionspin.kotlin.bignum.BigNumber.Creator
        public BigDecimal tryFromFloat(float f, boolean exactRequired) {
            return fromFloat(f, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.ionspin.kotlin.bignum.BigNumber.Creator
        public BigDecimal tryFromDouble(double d, boolean exactRequired) {
            return fromDouble(d, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.ionspin.kotlin.bignum.BigNumber.Creator
        public BigDecimal parseString(String string2, int base) {
            Intrinsics.checkNotNullParameter(string2, "string");
            return parseStringWithMode(string2, null);
        }

        public final BigDecimal parseString(String string2) {
            Intrinsics.checkNotNullParameter(string2, "string");
            return parseStringWithMode$default(this, string2, null, 2, null);
        }

        public static /* synthetic */ BigDecimal parseStringWithMode$default(Companion companion, String str, DecimalMode decimalMode, int i, Object obj) {
            if ((i & 2) != 0) {
                decimalMode = null;
            }
            return companion.parseStringWithMode(str, decimalMode);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final BigDecimal parseStringWithMode(String floatingPointString, DecimalMode decimalMode) throws NumberFormatException {
            BigIntegerArithmetic2 bigIntegerArithmetic2;
            int length;
            int length2;
            int i;
            int i2;
            long j;
            String str;
            List listSplit$default;
            BigIntegerArithmetic2 bigIntegerArithmetic22;
            BigIntegerArithmetic2 bigIntegerArithmetic23;
            long j2;
            long length3;
            Intrinsics.checkNotNullParameter(floatingPointString, "floatingPointString");
            if (floatingPointString.length() == 0) {
                throw new ArithmeticException("Empty string is not a valid decimal number");
            }
            if (StringsKt.contains((CharSequence) floatingPointString, 'E', true)) {
                if (!StringsKt.contains$default((CharSequence) floatingPointString, '.', false, 2, (Object) null)) {
                    i = -1;
                    i2 = 0;
                    j = 1;
                    List listSplit$default2 = StringsKt.split$default((CharSequence) floatingPointString, new char[]{'E', 'e'}, false, 0, 6, (Object) null);
                    listSplit$default = CollectionsKt.listOf((Object[]) new String[]{listSplit$default2.get(0), "0E" + ((String) listSplit$default2.get(1))});
                    str = floatingPointString;
                } else {
                    i = -1;
                    i2 = 0;
                    j = 1;
                    str = floatingPointString;
                    listSplit$default = StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
                }
                if (listSplit$default.size() == 2) {
                    int i3 = (str.charAt(i2) == '-' || str.charAt(i2) == '+') ? 1 : i2;
                    if (i3 != 0 && str.charAt(i2) == '-') {
                        bigIntegerArithmetic22 = BigIntegerArithmetic2.NEGATIVE;
                    } else {
                        bigIntegerArithmetic22 = BigIntegerArithmetic2.POSITIVE;
                    }
                    String strSubstring = ((String) listSplit$default.get(i2)).substring(i3);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    List listSplit$default3 = StringsKt.split$default((CharSequence) listSplit$default.get(1), new char[]{'E', 'e'}, false, 0, 6, (Object) null);
                    String str2 = (String) listSplit$default3.get(i2);
                    String str3 = (String) listSplit$default3.get(1);
                    int i4 = (str3.charAt(i2) == '-' || str3.charAt(i2) == '+') ? 1 : i2;
                    if (str3.charAt(i2) == '-') {
                        bigIntegerArithmetic23 = BigIntegerArithmetic2.NEGATIVE;
                    } else {
                        bigIntegerArithmetic23 = BigIntegerArithmetic2.POSITIVE;
                    }
                    String strSubstring2 = str3.substring(i4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    if (bigIntegerArithmetic23 == BigIntegerArithmetic2.POSITIVE) {
                        j2 = Long.parseLong(strSubstring2, CharsKt.checkRadix(10));
                    } else {
                        j2 = Long.parseLong(strSubstring2, CharsKt.checkRadix(10)) * i;
                    }
                    int length4 = strSubstring.length();
                    int i5 = i2;
                    while (true) {
                        if (i5 >= length4) {
                            i5 = i;
                            break;
                        }
                        if (strSubstring.charAt(i5) != '0') {
                            break;
                        }
                        i5++;
                    }
                    if (i5 == i) {
                        i5 = i2;
                    }
                    int length5 = str2.length() + i;
                    if (length5 >= 0) {
                        while (true) {
                            int i6 = length5 - 1;
                            if (str2.charAt(length5) != '0') {
                                break;
                            }
                            if (i6 < 0) {
                                break;
                            }
                            length5 = i6;
                        }
                        length5 = i;
                    } else {
                        length5 = i;
                    }
                    if (length5 == i) {
                        length5 = str2.length() - 1;
                    }
                    String strSubstring3 = strSubstring.substring(i5, strSubstring.length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                    String strSubstring4 = str2.substring(i2, length5 + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                    BigInteger.Companion companion = BigInteger.INSTANCE;
                    BigInteger string2 = companion.parseString(strSubstring3 + strSubstring4, 10);
                    if (Intrinsics.areEqual(string2, companion.getZERO())) {
                        bigIntegerArithmetic22 = BigIntegerArithmetic2.ZERO;
                    }
                    if (bigIntegerArithmetic22 == BigIntegerArithmetic2.NEGATIVE) {
                        string2 = string2.negate();
                    }
                    BigInteger bigInteger = string2;
                    if (!Intrinsics.areEqual(strSubstring3, "0")) {
                        length3 = j2 + strSubstring3.length();
                    } else {
                        length3 = j2 - (strSubstring4.length() - bigInteger.numberOfDecimalDigits());
                    }
                    return new BigDecimal(bigInteger, length3 - j, decimalMode, null);
                }
                throw new ArithmeticException("Invalid (or unsupported) floating point number format: " + str);
            }
            if (StringsKt.contains$default((CharSequence) floatingPointString, '.', false, 2, (Object) null)) {
                List listSplit$default4 = StringsKt.split$default((CharSequence) floatingPointString, new char[]{'.'}, false, 0, 6, (Object) null);
                if (listSplit$default4.size() == 2) {
                    int i7 = (floatingPointString.charAt(0) == '-' || floatingPointString.charAt(0) == '+') ? 1 : 0;
                    if (i7 != 0 && floatingPointString.charAt(0) == '-') {
                        bigIntegerArithmetic2 = BigIntegerArithmetic2.NEGATIVE;
                    } else {
                        bigIntegerArithmetic2 = BigIntegerArithmetic2.POSITIVE;
                    }
                    String strSubstring5 = ((String) listSplit$default4.get(0)).substring(i7);
                    Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
                    String str4 = (String) listSplit$default4.get(1);
                    int length6 = strSubstring5.length();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length6) {
                            i8 = -1;
                            break;
                        }
                        if (strSubstring5.charAt(i8) != '0') {
                            break;
                        }
                        i8++;
                    }
                    int i9 = i8 == -1 ? 0 : i8;
                    int length7 = str4.length() - 1;
                    if (length7 >= 0) {
                        do {
                            length = length7;
                            length7 = length - 1;
                            if (str4.charAt(length) != '0') {
                                break;
                            }
                        } while (length7 >= 0);
                        length = -1;
                    } else {
                        length = -1;
                    }
                    if (length == -1) {
                        length = str4.length() - 1;
                    }
                    String strSubstring6 = strSubstring5.substring(i9, strSubstring5.length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
                    String strSubstring7 = str4.substring(0, length + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring7, "substring(...)");
                    BigInteger string3 = BigInteger.INSTANCE.parseString(strSubstring6 + strSubstring7, 10);
                    if (strSubstring6.length() <= 0 || strSubstring6.charAt(0) == '0') {
                        int length8 = strSubstring7.length();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length8) {
                                i10 = -1;
                                break;
                            }
                            if (strSubstring7.charAt(i10) != '0') {
                                break;
                            }
                            i10++;
                        }
                        length2 = (i10 + 1) * (-1);
                    } else {
                        length2 = strSubstring6.length() - 1;
                    }
                    if (Intrinsics.areEqual(string3, BigInteger.INSTANCE.getZERO())) {
                        bigIntegerArithmetic2 = BigIntegerArithmetic2.ZERO;
                    }
                    if (bigIntegerArithmetic2 == BigIntegerArithmetic2.NEGATIVE) {
                        string3 = string3.negate();
                    }
                    return new BigDecimal(string3, length2, decimalMode, null);
                }
                throw new ArithmeticException("Invalid (or unsupported) floating point number format: " + floatingPointString);
            }
            BigInteger string4 = BigInteger.INSTANCE.parseString(floatingPointString, 10);
            return new BigDecimal(string4, string4.numberOfDecimalDigits() - 1, decimalMode, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DecimalMode resolveDecimalMode(DecimalMode firstDecimalMode, DecimalMode secondDecimalMode, DecimalMode suppliedDecimalMode) {
            if (suppliedDecimalMode != null) {
                return suppliedDecimalMode;
            }
            if (firstDecimalMode == null && secondDecimalMode == null) {
                return new DecimalMode(0L, null, 0L, 7, null);
            }
            if (firstDecimalMode == null && secondDecimalMode != null) {
                return secondDecimalMode;
            }
            if (secondDecimalMode == null && firstDecimalMode != null) {
                return firstDecimalMode;
            }
            Intrinsics.checkNotNull(firstDecimalMode);
            DecimalMode2 roundingMode = firstDecimalMode.getRoundingMode();
            Intrinsics.checkNotNull(secondDecimalMode);
            if (roundingMode == secondDecimalMode.getRoundingMode()) {
                return firstDecimalMode.getDecimalPrecision() >= secondDecimalMode.getDecimalPrecision() ? firstDecimalMode : secondDecimalMode;
            }
            throw new ArithmeticException("Different rounding modes! This: " + firstDecimalMode.getRoundingMode() + " Other: " + secondDecimalMode.getRoundingMode());
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        BigInteger.Companion companion2 = BigInteger.INSTANCE;
        ZERO = new BigDecimal(companion2.getZERO(), 0L, null, 6, null);
        ONE = new BigDecimal(companion2.getONE(), 0L, null, 6, null);
        TWO = new BigDecimal(companion2.getTWO(), 0L, null, 6, null);
        TEN = new BigDecimal(companion2.getTEN(), 1L, null, 4, null);
        double10pow = new double[]{1.0d, 10.0d, 100.0d, 1000.0d, 10000.0d, 100000.0d, 1000000.0d, 1.0E7d, 1.0E8d, 1.0E9d, 1.0E10d, 1.0E11d, 1.0E12d, 1.0E13d, 1.0E14d, 1.0E15d, 1.0E16d, 1.0E17d, 1.0E18d, 1.0E19d, 1.0E20d, 1.0E21d, 1.0E22d};
        maximumDouble = Companion.fromDouble$default(companion, Double.MAX_VALUE, null, 2, null);
        leastSignificantDouble = Companion.fromDouble$default(companion, Double.MIN_VALUE, null, 2, null);
        float10pow = new float[]{1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
        maximumFloat = Companion.fromFloat$default(companion, Float.MAX_VALUE, null, 2, null);
        leastSignificantFloat = Companion.fromFloat$default(companion, Float.MIN_VALUE, null, 2, null);
    }

    public final BigDecimal scale(long scale) {
        DecimalMode decimalMode;
        if (scale < 0) {
            throw new ArithmeticException("Negative Scale is unsupported.");
        }
        if (this.decimalMode != null) {
            decimalMode = new DecimalMode(this.decimalMode.getDecimalPrecision() - this.decimalMode.getScale(), this.decimalMode.getRoundingMode(), scale);
        } else if (scale == -1) {
            decimalMode = DecimalMode.INSTANCE.getDEFAULT();
        } else {
            decimalMode = new DecimalMode(0L, DecimalMode2.ROUND_HALF_AWAY_FROM_ZERO, scale);
        }
        return new BigDecimal(this.significand, this.exponent, decimalMode);
    }

    @Override // com.ionspin.kotlin.bignum.BigNumber2
    public BigNumber.Creator<BigDecimal> getCreator() {
        return INSTANCE;
    }

    @Override // com.ionspin.kotlin.bignum.BigNumber
    public BigDecimal add(BigDecimal other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return add(other, computeMode(other, ScaleOps.Max));
    }

    public final BigDecimal add(BigDecimal other, DecimalMode decimalMode) {
        Intrinsics.checkNotNullParameter(other, "other");
        Companion companion = INSTANCE;
        DecimalMode decimalModeResolveDecimalMode = companion.resolveDecimalMode(this.decimalMode, other.decimalMode, decimalMode);
        BigDecimal bigDecimal = ZERO;
        if (Intrinsics.areEqual(this, bigDecimal)) {
            return companion.roundOrDont(other.significand, other.exponent, decimalModeResolveDecimalMode);
        }
        if (Intrinsics.areEqual(other, bigDecimal)) {
            return companion.roundOrDont(this.significand, this.exponent, decimalModeResolveDecimalMode);
        }
        Tuples3<BigInteger, BigInteger, Long> tuples3BringSignificandToSameExponent = bringSignificandToSameExponent(this, other);
        BigInteger bigIntegerComponent1 = tuples3BringSignificandToSameExponent.component1();
        BigInteger bigIntegerComponent2 = tuples3BringSignificandToSameExponent.component2();
        long jNumberOfDecimalDigits = bigIntegerComponent1.numberOfDecimalDigits();
        long jNumberOfDecimalDigits2 = bigIntegerComponent2.numberOfDecimalDigits();
        BigInteger bigInteger = (BigInteger) bigIntegerComponent1.plus((BigNumber) bigIntegerComponent2);
        long j = jNumberOfDecimalDigits;
        long jNumberOfDecimalDigits3 = bigInteger.numberOfDecimalDigits();
        if (j <= jNumberOfDecimalDigits2) {
            j = jNumberOfDecimalDigits2;
        }
        long jMax = (jNumberOfDecimalDigits3 - j) + Math.max(this.exponent, other.exponent);
        return decimalModeResolveDecimalMode.getUsingScale() ? companion.roundOrDont(bigInteger, jMax, DecimalMode.copy$default(decimalModeResolveDecimalMode, jNumberOfDecimalDigits3, null, 0L, 6, null)) : companion.roundOrDont(bigInteger, jMax, decimalModeResolveDecimalMode);
    }

    @Override // com.ionspin.kotlin.bignum.BigNumber
    public BigDecimal subtract(BigDecimal other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return subtract(other, computeMode(other, ScaleOps.Max));
    }

    public final BigDecimal subtract(BigDecimal other, DecimalMode decimalMode) {
        Intrinsics.checkNotNullParameter(other, "other");
        Companion companion = INSTANCE;
        DecimalMode decimalModeResolveDecimalMode = companion.resolveDecimalMode(this.decimalMode, other.decimalMode, decimalMode);
        BigDecimal bigDecimal = ZERO;
        if (Intrinsics.areEqual(this, bigDecimal)) {
            return companion.roundOrDont(other.significand.negate(), other.exponent, decimalModeResolveDecimalMode);
        }
        if (Intrinsics.areEqual(other, bigDecimal)) {
            return companion.roundOrDont(this.significand, this.exponent, decimalModeResolveDecimalMode);
        }
        Tuples3<BigInteger, BigInteger, Long> tuples3BringSignificandToSameExponent = bringSignificandToSameExponent(this, other);
        BigInteger bigIntegerComponent1 = tuples3BringSignificandToSameExponent.component1();
        BigInteger bigIntegerComponent2 = tuples3BringSignificandToSameExponent.component2();
        long jNumberOfDecimalDigits = bigIntegerComponent1.numberOfDecimalDigits();
        long jNumberOfDecimalDigits2 = bigIntegerComponent2.numberOfDecimalDigits();
        BigInteger bigInteger = (BigInteger) bigIntegerComponent1.minus((BigNumber) bigIntegerComponent2);
        long j = jNumberOfDecimalDigits;
        long jNumberOfDecimalDigits3 = bigInteger.numberOfDecimalDigits();
        if (j <= jNumberOfDecimalDigits2) {
            j = jNumberOfDecimalDigits2;
        }
        long jMax = (jNumberOfDecimalDigits3 - j) + Math.max(this.exponent, other.exponent);
        return this.usingScale ? companion.roundOrDont(bigInteger, jMax, DecimalMode.copy$default(decimalModeResolveDecimalMode, jNumberOfDecimalDigits3, null, 0L, 6, null)) : companion.roundOrDont(bigInteger, jMax, decimalModeResolveDecimalMode);
    }

    @Override // com.ionspin.kotlin.bignum.BigNumber
    public BigDecimal multiply(BigDecimal other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return multiply(other, computeMode(other, ScaleOps.Max));
    }

    public final BigDecimal multiply(BigDecimal other, DecimalMode decimalMode) {
        Intrinsics.checkNotNullParameter(other, "other");
        Companion companion = INSTANCE;
        DecimalMode decimalModeResolveDecimalMode = companion.resolveDecimalMode(this.decimalMode, other.decimalMode, decimalMode);
        long jNumberOfDecimalDigits = this.significand.numberOfDecimalDigits();
        long jNumberOfDecimalDigits2 = other.significand.numberOfDecimalDigits();
        BigInteger bigInteger = (BigInteger) this.significand.times((BigNumber) other.significand);
        long jNumberOfDecimalDigits3 = bigInteger.numberOfDecimalDigits();
        long j = 1 + this.exponent + other.exponent + (jNumberOfDecimalDigits3 - (jNumberOfDecimalDigits + jNumberOfDecimalDigits2));
        return decimalModeResolveDecimalMode.getUsingScale() ? companion.roundOrDont(bigInteger, j, DecimalMode.copy$default(decimalModeResolveDecimalMode, jNumberOfDecimalDigits3, null, 0L, 6, null)) : companion.roundOrDont(bigInteger, j, decimalModeResolveDecimalMode);
    }

    @Override // com.ionspin.kotlin.bignum.BigNumber
    public BigDecimal divide(BigDecimal other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return divide(other, computeMode(other, ScaleOps.Max));
    }

    public final BigDecimal divide(BigDecimal other, DecimalMode decimalMode) {
        BigInteger bigInteger;
        Intrinsics.checkNotNullParameter(other, "other");
        Companion companion = INSTANCE;
        DecimalMode decimalModeResolveDecimalMode = companion.resolveDecimalMode(this.decimalMode, other.decimalMode, decimalMode);
        if (decimalModeResolveDecimalMode.getIsPrecisionUnlimited() && !decimalModeResolveDecimalMode.getUsingScale()) {
            long j = this.exponent - other.exponent;
            long j2 = (other.precision * 2) + 6;
            BigInteger bigInteger2 = this.significand;
            BigInteger.Companion companion2 = BigInteger.INSTANCE;
            BigInteger bigInteger3 = (BigInteger) bigInteger2.times((BigNumber) companion2.getTEN().pow(j2));
            BigInteger.QuotientAndRemainder quotientAndRemainderDivrem = bigInteger3.divrem(other.significand);
            BigInteger quotient = quotientAndRemainderDivrem.getQuotient();
            long jNumberOfDecimalDigits = (other.precision - 1) + (quotient.numberOfDecimalDigits() - bigInteger3.numberOfDecimalDigits());
            if (!Intrinsics.areEqual(quotientAndRemainderDivrem.getRemainder(), companion2.getZERO())) {
                throw new ArithmeticException("Non-terminating result of division operation (i.e. 1/3 = 0.3333... library needs to know when to stop and how to round up at that point). Specify decimalPrecision inside your decimal mode.");
            }
            return new BigDecimal(quotient, j + jNumberOfDecimalDigits, decimalModeResolveDecimalMode);
        }
        long j3 = this.exponent - other.exponent;
        long j4 = j3 - 1;
        long decimalPrecision = (decimalModeResolveDecimalMode.getDecimalPrecision() - this.precision) + other.precision;
        if (decimalPrecision > 0) {
            bigInteger = (BigInteger) this.significand.times((BigNumber) BigIntegerExtensions.toBigInteger(10).pow(decimalPrecision));
        } else if (decimalPrecision < 0) {
            bigInteger = (BigInteger) this.significand.div((BigNumber) BigIntegerExtensions.toBigInteger(10).pow(Math.abs(decimalPrecision)));
        } else {
            bigInteger = this.significand;
        }
        BigInteger.QuotientAndRemainder quotientAndRemainderDivrem2 = bigInteger.divrem(other.significand);
        BigInteger quotient2 = quotientAndRemainderDivrem2.getQuotient();
        if (Intrinsics.areEqual(quotient2, BigInteger.INSTANCE.getZERO())) {
            j4 = j3 - 2;
        }
        long jNumberOfDecimalDigits2 = quotient2.numberOfDecimalDigits() - decimalModeResolveDecimalMode.getDecimalPrecision();
        if (this.usingScale) {
            return new BigDecimal(companion.roundDiscarded(quotient2, quotientAndRemainderDivrem2.getRemainder(), decimalModeResolveDecimalMode), j4 + jNumberOfDecimalDigits2, DecimalMode.copy$default(decimalModeResolveDecimalMode, quotient2.numberOfDecimalDigits(), null, 0L, 6, null));
        }
        return new BigDecimal(companion.roundDiscarded(quotient2, quotientAndRemainderDivrem2.getRemainder(), decimalModeResolveDecimalMode), j4 + jNumberOfDecimalDigits2, decimalModeResolveDecimalMode);
    }

    @Override // com.ionspin.kotlin.bignum.BigNumber
    public BigDecimal remainder(BigDecimal other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return divideAndRemainder(other).getSecond();
    }

    public Tuples2<BigDecimal, BigDecimal> divideAndRemainder(BigDecimal other) {
        DecimalMode decimalMode;
        Intrinsics.checkNotNullParameter(other, "other");
        if (this.exponent < 0) {
            return new Tuples2<>(ZERO, this);
        }
        if (other.abs().compareTo(abs()) > 0) {
            return new Tuples2<>(ZERO, this);
        }
        DecimalMode decimalMode2 = this.decimalMode;
        if (decimalMode2 == null || (decimalMode = DecimalMode.copy$default(decimalMode2, (this.exponent - other.exponent) + 1, null, 0L, 6, null)) == null) {
            decimalMode = new DecimalMode((this.exponent - other.exponent) + 1, DecimalMode2.FLOOR, 0L, 4, null);
        }
        BigDecimal bigDecimalDivide = divide(other, decimalMode);
        return new Tuples2<>(bigDecimalDivide, minus(copy$default(bigDecimalDivide, null, 0L, DecimalMode.INSTANCE.getDEFAULT(), 3, null).times(other)));
    }

    public boolean isZero() {
        return this.significand.isZero();
    }

    public static /* synthetic */ BigDecimal copy$default(BigDecimal bigDecimal, BigInteger bigInteger, long j, DecimalMode decimalMode, int i, Object obj) {
        if ((i & 1) != 0) {
            bigInteger = bigDecimal.significand;
        }
        if ((i & 2) != 0) {
            j = bigDecimal.exponent;
        }
        if ((i & 4) != 0) {
            decimalMode = bigDecimal.decimalMode;
        }
        return bigDecimal.copy(bigInteger, j, decimalMode);
    }

    public final BigDecimal copy(BigInteger significand, long exponent, DecimalMode decimalMode) {
        Intrinsics.checkNotNullParameter(significand, "significand");
        return new BigDecimal(significand, exponent, decimalMode);
    }

    public final BigDecimal moveDecimalPoint(int places) {
        return places == 0 ? this : copy$default(this, null, this.exponent + places, null, 5, null);
    }

    public final BigDecimal moveDecimalPoint(long places) {
        return places == 0 ? this : copy$default(this, null, this.exponent + places, null, 5, null);
    }

    public final BigDecimal floor() {
        if (this.exponent < 0) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.significand.getSign().ordinal()];
            if (i == 1) {
                return ZERO;
            }
            if (i == 2) {
                return ONE.negate();
            }
            if (i == 3) {
                return ZERO;
            }
            throw new NoWhenBranchMatchedException();
        }
        return roundSignificand(new DecimalMode(this.exponent + 1, DecimalMode2.FLOOR, 0L, 4, null));
    }

    public final BigInteger toBigInteger() {
        long j = this.exponent;
        if (j < 0) {
            return BigInteger.INSTANCE.getZERO();
        }
        long j2 = j - this.precision;
        if (j2 > 0) {
            return (BigInteger) this.significand.times((BigNumber) BigIntegerExtensions.toBigInteger(10).pow(j2 + 1));
        }
        if (j2 < 0) {
            return (BigInteger) this.significand.div((BigNumber) BigIntegerExtensions.toBigInteger(10).pow(Math.abs(j2) - 1));
        }
        return (BigInteger) this.significand.times(10);
    }

    private final BigDecimal removeTrailingZeroes(BigDecimal bigDecimal) {
        if (Intrinsics.areEqual(bigDecimal, ZERO)) {
            return this;
        }
        BigInteger quotient = bigDecimal.significand;
        BigInteger.QuotientAndRemainder quotientAndRemainder = new BigInteger.QuotientAndRemainder(quotient, BigInteger.INSTANCE.getZERO());
        while (true) {
            BigInteger quotient2 = quotientAndRemainder.getQuotient();
            BigInteger.Companion companion = BigInteger.INSTANCE;
            quotientAndRemainder = quotient2.divrem(companion.getTEN());
            if (Intrinsics.areEqual(quotientAndRemainder.getRemainder(), companion.getZERO())) {
                quotient = quotientAndRemainder.getQuotient();
            }
            BigInteger bigInteger = quotient;
            if (!Intrinsics.areEqual(quotientAndRemainder.getRemainder(), companion.getZERO())) {
                return new BigDecimal(bigInteger, bigDecimal.exponent, null, 4, null);
            }
            quotient = bigInteger;
        }
    }

    public final Tuples2<BigDecimal, BigDecimal> divrem(BigDecimal other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return divideAndRemainder(other);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BigDecimal.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/ionspin/kotlin/bignum/decimal/BigDecimal$ScaleOps;", "", "(Ljava/lang/String;I)V", "Max", "Min", "Add", "bignum"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class ScaleOps {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ScaleOps[] $VALUES;
        public static final ScaleOps Max = new ScaleOps("Max", 0);
        public static final ScaleOps Min = new ScaleOps("Min", 1);
        public static final ScaleOps Add = new ScaleOps("Add", 2);

        private static final /* synthetic */ ScaleOps[] $values() {
            return new ScaleOps[]{Max, Min, Add};
        }

        public static EnumEntries<ScaleOps> getEntries() {
            return $ENTRIES;
        }

        public static ScaleOps valueOf(String str) {
            return (ScaleOps) Enum.valueOf(ScaleOps.class, str);
        }

        public static ScaleOps[] values() {
            return (ScaleOps[]) $VALUES.clone();
        }

        private ScaleOps(String str, int i) {
        }

        static {
            ScaleOps[] scaleOpsArr$values = $values();
            $VALUES = scaleOpsArr$values;
            $ENTRIES = EnumEntries2.enumEntries(scaleOpsArr$values);
        }
    }

    private final DecimalMode computeMode(BigDecimal other, ScaleOps op) {
        DecimalMode decimalMode;
        long jMax;
        DecimalMode decimalMode2 = this.decimalMode;
        if (decimalMode2 == null || decimalMode2.getIsPrecisionUnlimited() || (decimalMode = other.decimalMode) == null || decimalMode.getIsPrecisionUnlimited()) {
            return DecimalMode.INSTANCE.getDEFAULT();
        }
        long jMax2 = Math.max(this.decimalMode.getDecimalPrecision(), other.decimalMode.getDecimalPrecision());
        DecimalMode2 roundingMode = this.decimalMode.getRoundingMode();
        if (this.decimalMode.getUsingScale() && other.decimalMode.getUsingScale()) {
            int i = WhenMappings.$EnumSwitchMapping$1[op.ordinal()];
            if (i == 1) {
                jMax = Math.max(this.decimalMode.getScale(), other.decimalMode.getScale());
            } else if (i == 2) {
                jMax = Math.min(this.decimalMode.getScale(), other.decimalMode.getScale());
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                jMax = this.decimalMode.getScale() + other.decimalMode.getScale();
            }
        } else {
            jMax = -1;
        }
        return new DecimalMode(jMax2, roundingMode, jMax);
    }

    public BigDecimal plus(BigDecimal other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return add(other, computeMode(other, ScaleOps.Max));
    }

    public BigDecimal minus(BigDecimal other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return subtract(other, computeMode(other, ScaleOps.Max));
    }

    public BigDecimal times(BigDecimal other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return multiply(other, computeMode(other, ScaleOps.Max));
    }

    public BigDecimal abs() {
        return new BigDecimal(this.significand.abs(), this.exponent, this.decimalMode);
    }

    public BigDecimal negate() {
        return new BigDecimal(this.significand.negate(), this.exponent, this.decimalMode);
    }

    public long longValue(boolean exactRequired) {
        checkWholeness(exactRequired);
        return toBigInteger().longValue(exactRequired);
    }

    public final boolean isWholeNumber() {
        return abs().divrem(ONE).getSecond().isZero();
    }

    private final void checkWholeness(boolean exactRequired) {
        if (exactRequired && !isWholeNumber()) {
            throw new ArithmeticException("Cannot convert to int and provide exact value");
        }
    }

    public final BigDecimal roundSignificand(DecimalMode decimalMode) {
        return decimalMode == null ? this : INSTANCE.roundSignificand(this.significand, this.exponent, decimalMode);
    }

    private final BigDecimal getRidOfRadix(BigDecimal bigDecimal) {
        return new BigDecimal(bigDecimal.significand, (bigDecimal.exponent - bigDecimal.significand.numberOfDecimalDigits()) + 1, null, 4, null);
    }

    private final Tuples3<BigInteger, BigInteger, Long> bringSignificandToSameExponent(BigDecimal first, BigDecimal second) {
        BigDecimal ridOfRadix = getRidOfRadix(first);
        BigDecimal ridOfRadix2 = getRidOfRadix(second);
        long j = ridOfRadix.exponent;
        long j2 = ridOfRadix2.exponent;
        long j3 = first.exponent;
        long j4 = second.exponent;
        if (j3 > j4) {
            long j5 = j - j2;
            if (j5 >= 0) {
                return new Tuples3<>((BigInteger) ridOfRadix.significand.times((BigNumber) BigIntegerExtensions.toBigInteger(10).pow(j5)), second.significand, Long.valueOf(j2));
            }
            return new Tuples3<>(first.significand, (BigInteger) ridOfRadix2.significand.times((BigNumber) BigIntegerExtensions.toBigInteger(10).pow(j5 * (-1))), Long.valueOf(j));
        }
        if (j3 < j4) {
            long j6 = j2 - j;
            if (j6 >= 0) {
                return new Tuples3<>(first.significand, (BigInteger) ridOfRadix2.significand.times((BigNumber) BigIntegerExtensions.toBigInteger(10).pow(j6)), Long.valueOf(j));
            }
            return new Tuples3<>((BigInteger) ridOfRadix.significand.times((BigNumber) BigIntegerExtensions.toBigInteger(10).pow(j6 * (-1))), second.significand, Long.valueOf(j));
        }
        if (j3 != j4) {
            throw new RuntimeException("Invalid comparison state BigInteger: " + first.exponent + ", " + second.exponent);
        }
        long j7 = j - j2;
        if (j7 > 0) {
            return new Tuples3<>((BigInteger) first.significand.times((BigNumber) BigIntegerExtensions.toBigInteger(10).pow(j7)), second.significand, Long.valueOf(j));
        }
        if (j7 < 0) {
            return new Tuples3<>(first.significand, (BigInteger) second.significand.times((BigNumber) BigIntegerExtensions.toBigInteger(10).pow(j7 * (-1))), Long.valueOf(j));
        }
        if (Intrinsics.compare(j7, 0L) == 0) {
            return new Tuples3<>(first.significand, second.significand, Long.valueOf(j));
        }
        throw new RuntimeException("Invalid delta: " + j7);
    }

    public final int compare(BigDecimal other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (this.exponent == other.exponent && this.precision == other.precision) {
            return this.significand.compare(other.significand);
        }
        Tuples3<BigInteger, BigInteger, Long> tuples3BringSignificandToSameExponent = bringSignificandToSameExponent(this, other);
        return tuples3BringSignificandToSameExponent.component1().compare(tuples3BringSignificandToSameExponent.component2());
    }

    @Override // java.lang.Comparable
    public int compareTo(Object other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof Number) {
            PlatformWorkarounds2 platformWorkarounds2 = PlatformWorkarounds2.INSTANCE;
            if (platformWorkarounds2.currentPlatform() == PlatformWorkarounds.f964JS || platformWorkarounds2.currentPlatform() == PlatformWorkarounds.WASMJS) {
                return javascriptNumberComparison((Number) other);
            }
        }
        if (other instanceof BigDecimal) {
            return compare((BigDecimal) other);
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
        if (other instanceof Double) {
            return compare(Companion.fromDouble$default(INSTANCE, ((Number) other).doubleValue(), null, 2, null));
        }
        if (other instanceof Float) {
            return compare(Companion.fromFloat$default(INSTANCE, ((Number) other).floatValue(), null, 2, null));
        }
        throw new RuntimeException("Invalid comparison type for BigDecimal: " + Reflection.getOrCreateKotlinClass(other.getClass()).getSimpleName());
    }

    private final int javascriptNumberComparison(Number number) {
        double dDoubleValue = number.doubleValue();
        if (dDoubleValue > 9.223372036854776E18d) {
            return compare(INSTANCE.parseString(String.valueOf(dDoubleValue)));
        }
        if (dDoubleValue % 1 == 0.0d) {
            return compare(INSTANCE.fromLong(number.longValue()));
        }
        return compare(BigDecimalExtensions.toBigDecimal$default(number.doubleValue(), (Long) null, (DecimalMode) null, 3, (Object) null));
    }

    public boolean equals(Object other) {
        int iCompare;
        if (other instanceof BigDecimal) {
            iCompare = compare((BigDecimal) other);
        } else if (other instanceof Long) {
            iCompare = compare(INSTANCE.fromLong(((Number) other).longValue()));
        } else if (other instanceof Integer) {
            iCompare = compare(INSTANCE.fromInt(((Number) other).intValue()));
        } else if (other instanceof Short) {
            iCompare = compare(INSTANCE.fromShort(((Number) other).shortValue()));
        } else if (other instanceof Byte) {
            iCompare = compare(INSTANCE.fromByte(((Number) other).byteValue()));
        } else if (other instanceof Double) {
            iCompare = compare(Companion.fromDouble$default(INSTANCE, ((Number) other).doubleValue(), null, 2, null));
        } else {
            iCompare = other instanceof Float ? compare(Companion.fromFloat$default(INSTANCE, ((Number) other).floatValue(), null, 2, null)) : -1;
        }
        return iCompare == 0;
    }

    public int hashCode() {
        if (Intrinsics.areEqual(this, ZERO)) {
            return 0;
        }
        return removeTrailingZeroes(this).significand.hashCode() + Long.hashCode(this.exponent);
    }

    public String toString() {
        String strSubstring;
        if (useToStringExpanded) {
            return toStringExpanded();
        }
        String string2 = this.significand.toString(10);
        int i = this.significand.compareTo(0) < 0 ? 2 : 1;
        String string3 = this.significand.toString();
        int lastIndex = StringsKt.getLastIndex(string3);
        while (true) {
            if (-1 >= lastIndex) {
                strSubstring = "";
                break;
            }
            if (string3.charAt(lastIndex) != '0') {
                strSubstring = string3.substring(0, lastIndex + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                break;
            }
            lastIndex--;
        }
        String str = strSubstring.length() <= 1 ? "0" : "";
        long j = this.exponent;
        if (j > 0) {
            return placeADotInString(string2, string2.length() - i) + str + "E+" + this.exponent;
        }
        if (j < 0) {
            return placeADotInString(string2, string2.length() - i) + str + 'E' + this.exponent;
        }
        if (j != 0) {
            throw new RuntimeException("Invalid state, please report a bug (Integer compareTo invalid)");
        }
        return placeADotInString(string2, string2.length() - i) + str;
    }

    public final String toPlainString() {
        String stringExpanded = toStringExpanded();
        if (!this.usingScale || this.scale <= 0) {
            return stringExpanded;
        }
        if (StringsKt.split$default((CharSequence) stringExpanded, new String[]{"."}, false, 0, 6, (Object) null).size() == 1) {
            return stringExpanded + '.' + VariousUtil.times('0', this.scale);
        }
        long length = this.scale - ((String) r1.get(1)).length();
        if (length <= 0) {
            return stringExpanded;
        }
        return stringExpanded + VariousUtil.times('0', length);
    }

    public final String toStringExpanded() {
        String str;
        String strPlaceADotInStringExpanded;
        if (Intrinsics.areEqual(this, ZERO)) {
            return "0";
        }
        long jNumberOfDecimalDigits = this.significand.numberOfDecimalDigits();
        if (this.exponent > 2147483647L) {
            throw new RuntimeException("Invalid toStringExpanded request (exponent > Int.MAX_VALUE)");
        }
        String stringWithoutSign$bignum = this.significand.toStringWithoutSign$bignum(10);
        if (this.significand.getSign() == BigIntegerArithmetic2.NEGATIVE) {
            str = "-";
        } else {
            str = "";
        }
        long j = this.exponent;
        if (j > 0) {
            long j2 = (j - jNumberOfDecimalDigits) + 1;
            if (j2 > 0) {
                strPlaceADotInStringExpanded = stringWithoutSign$bignum + times(j2, '0');
            } else {
                strPlaceADotInStringExpanded = placeADotInStringExpanded(stringWithoutSign$bignum, (stringWithoutSign$bignum.length() - ((int) this.exponent)) - 1);
            }
        } else if (j < 0) {
            if (Math.abs((int) j) > 0) {
                strPlaceADotInStringExpanded = placeADotInStringExpanded(times(Math.abs(this.exponent), '0') + stringWithoutSign$bignum, (r0 + stringWithoutSign$bignum.length()) - 1);
            } else {
                strPlaceADotInStringExpanded = placeADotInStringExpanded(stringWithoutSign$bignum, stringWithoutSign$bignum.length() - 1);
            }
        } else {
            if (j != 0) {
                throw new RuntimeException("Invalid state, please report a bug (Integer compareTo invalid)");
            }
            if (jNumberOfDecimalDigits == 1) {
                return str + stringWithoutSign$bignum;
            }
            strPlaceADotInStringExpanded = placeADotInStringExpanded(stringWithoutSign$bignum, stringWithoutSign$bignum.length() - 1);
        }
        return str + strPlaceADotInStringExpanded;
    }

    private final String placeADotInStringExpanded(String input, int position) {
        String strSubstring;
        String strSubstring2 = StringsKt.substring(input, RangesKt.until(0, input.length() - position));
        String strSubstring3 = StringsKt.substring(input, RangesKt.until(input.length() - position, input.length()));
        int lastIndex = StringsKt.getLastIndex(strSubstring3);
        while (true) {
            if (-1 < lastIndex) {
                if (strSubstring3.charAt(lastIndex) != '0') {
                    strSubstring = strSubstring3.substring(0, lastIndex + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    break;
                }
                lastIndex--;
            } else {
                strSubstring = "";
                break;
            }
        }
        if (strSubstring.length() <= 0) {
            return strSubstring2;
        }
        return strSubstring2 + '.' + strSubstring;
    }

    private final String placeADotInString(String input, int position) {
        String str = StringsKt.substring(input, RangesKt.until(0, input.length() - position)) + '.' + StringsKt.substring(input, RangesKt.until(input.length() - position, input.length()));
        for (int lastIndex = StringsKt.getLastIndex(str); -1 < lastIndex; lastIndex--) {
            if (str.charAt(lastIndex) != '0') {
                String strSubstring = str.substring(0, lastIndex + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return "";
    }

    public final String times(long j, char c) {
        if (j < 0) {
            throw new RuntimeException("Char cannot be multiplied with negative number");
        }
        StringBuilder sb = new StringBuilder();
        while (j > 0) {
            sb.append(c);
            j--;
        }
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }
}
