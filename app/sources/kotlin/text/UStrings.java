package kotlin.text;

import com.ionspin.kotlin.bignum.integer.base32.BigInteger32Arithmetic$$ExternalSyntheticBackport0;
import com.ionspin.kotlin.bignum.integer.base32.BigInteger32Arithmetic$$ExternalSyntheticBackport2;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.UnsignedJVM;
import kotlin.WasExperimental;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: UStrings.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0003H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0003H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\u0000*\u00020\u0003H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0007*\u00020\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u0007*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0012\u0010\u0014\u001a\u0015\u0010\u0015\u001a\u0004\u0018\u00010\n*\u00020\u0003H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001d\u0010\u0015\u001a\u0004\u0018\u00010\n*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0017\u001a\u0015\u0010\u0018\u001a\u0004\u0018\u00010\r*\u00020\u0003H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u0018\u001a\u0004\u0018\u00010\r*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0018\u0010\u001a\u001a\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0000*\u00020\u0003H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u0000*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"Lkotlin/ULong;", "", "radix", "", "toString-JSWoG40", "(JI)Ljava/lang/String;", "toString", "Lkotlin/UByte;", "toUByte", "(Ljava/lang/String;)B", "Lkotlin/UShort;", "toUShort", "(Ljava/lang/String;)S", "Lkotlin/UInt;", "toUInt", "(Ljava/lang/String;)I", "toULong", "(Ljava/lang/String;)J", "toUByteOrNull", "(Ljava/lang/String;)Lkotlin/UByte;", "(Ljava/lang/String;I)Lkotlin/UByte;", "toUShortOrNull", "(Ljava/lang/String;)Lkotlin/UShort;", "(Ljava/lang/String;I)Lkotlin/UShort;", "toUIntOrNull", "(Ljava/lang/String;)Lkotlin/UInt;", "(Ljava/lang/String;I)Lkotlin/UInt;", "toULongOrNull", "(Ljava/lang/String;)Lkotlin/ULong;", "(Ljava/lang/String;I)Lkotlin/ULong;", "kotlin-stdlib"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmName
/* renamed from: kotlin.text.UStringsKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class UStrings {
    @SinceKotlin
    @WasExperimental
    /* renamed from: toString-JSWoG40, reason: not valid java name */
    public static final String m28722toStringJSWoG40(long j, int i) {
        return UnsignedJVM.ulongToString(j, CharJVM.checkRadix(i));
    }

    @SinceKotlin
    @WasExperimental
    public static final byte toUByte(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UByte uByteOrNull = toUByteOrNull(str);
        if (uByteOrNull != null) {
            return uByteOrNull.getData();
        }
        StringNumberConversions.numberFormatError(str);
        throw new ExceptionsH();
    }

    @SinceKotlin
    @WasExperimental
    public static final short toUShort(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UShort uShortOrNull = toUShortOrNull(str);
        if (uShortOrNull != null) {
            return uShortOrNull.getData();
        }
        StringNumberConversions.numberFormatError(str);
        throw new ExceptionsH();
    }

    @SinceKotlin
    @WasExperimental
    public static final int toUInt(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str);
        if (uIntOrNull != null) {
            return uIntOrNull.getData();
        }
        StringNumberConversions.numberFormatError(str);
        throw new ExceptionsH();
    }

    @SinceKotlin
    @WasExperimental
    public static final long toULong(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ULong uLongOrNull = toULongOrNull(str);
        if (uLongOrNull != null) {
            return uLongOrNull.getData();
        }
        StringNumberConversions.numberFormatError(str);
        throw new ExceptionsH();
    }

    @SinceKotlin
    @WasExperimental
    public static final UByte toUByteOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUByteOrNull(str, 10);
    }

    @SinceKotlin
    @WasExperimental
    public static final UByte toUByteOrNull(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str, i);
        if (uIntOrNull == null) {
            return null;
        }
        int data = uIntOrNull.getData();
        if (Integer.compare(data ^ Integer.MIN_VALUE, UInt.m28582constructorimpl(255) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return UByte.m28559boximpl(UByte.m28560constructorimpl((byte) data));
    }

    @SinceKotlin
    @WasExperimental
    public static final UShort toUShortOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUShortOrNull(str, 10);
    }

    @SinceKotlin
    @WasExperimental
    public static final UShort toUShortOrNull(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str, i);
        if (uIntOrNull == null) {
            return null;
        }
        int data = uIntOrNull.getData();
        if (Integer.compare(data ^ Integer.MIN_VALUE, UInt.m28582constructorimpl(Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return UShort.m28628boximpl(UShort.m28629constructorimpl((short) data));
    }

    @SinceKotlin
    @WasExperimental
    public static final UInt toUIntOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUIntOrNull(str, 10);
    }

    @SinceKotlin
    @WasExperimental
    public static final UInt toUIntOrNull(String str, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharJVM.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int iM28582constructorimpl = UInt.m28582constructorimpl(i);
        int iM1062m = 119304647;
        while (i2 < length) {
            int iDigitOf = CharJVM.digitOf(str.charAt(i2), i);
            if (iDigitOf < 0) {
                return null;
            }
            if (Integer.compare(i3 ^ Integer.MIN_VALUE, iM1062m ^ Integer.MIN_VALUE) > 0) {
                if (iM1062m == 119304647) {
                    iM1062m = BigInteger32Arithmetic$$ExternalSyntheticBackport0.m1062m(-1, iM28582constructorimpl);
                    if (Integer.compare(i3 ^ Integer.MIN_VALUE, iM1062m ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int iM28582constructorimpl2 = UInt.m28582constructorimpl(i3 * iM28582constructorimpl);
            int iM28582constructorimpl3 = UInt.m28582constructorimpl(UInt.m28582constructorimpl(iDigitOf) + iM28582constructorimpl2);
            if (Integer.compare(iM28582constructorimpl3 ^ Integer.MIN_VALUE, iM28582constructorimpl2 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i2++;
            i3 = iM28582constructorimpl3;
        }
        return UInt.m28581boximpl(i3);
    }

    @SinceKotlin
    @WasExperimental
    public static final ULong toULongOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toULongOrNull(str, 10);
    }

    @SinceKotlin
    @WasExperimental
    public static final ULong toULongOrNull(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharJVM.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long jM28605constructorimpl = ULong.m28605constructorimpl(i);
        long j = 0;
        long jM1064m = 512409557603043100L;
        while (i2 < length) {
            if (CharJVM.digitOf(str.charAt(i2), i) < 0) {
                return null;
            }
            if (Long.compare(j ^ Long.MIN_VALUE, jM1064m ^ Long.MIN_VALUE) > 0) {
                if (jM1064m == 512409557603043100L) {
                    jM1064m = BigInteger32Arithmetic$$ExternalSyntheticBackport2.m1064m(-1L, jM28605constructorimpl);
                    if (Long.compare(j ^ Long.MIN_VALUE, jM1064m ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long jM28605constructorimpl2 = ULong.m28605constructorimpl(j * jM28605constructorimpl);
            long jM28605constructorimpl3 = ULong.m28605constructorimpl(ULong.m28605constructorimpl(UInt.m28582constructorimpl(r13) & 4294967295L) + jM28605constructorimpl2);
            if (Long.compare(jM28605constructorimpl3 ^ Long.MIN_VALUE, jM28605constructorimpl2 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i2++;
            j = jM28605constructorimpl3;
        }
        return ULong.m28604boximpl(j);
    }
}
