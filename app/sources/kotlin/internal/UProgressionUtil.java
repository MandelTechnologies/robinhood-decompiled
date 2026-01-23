package kotlin.internal;

import com.ionspin.kotlin.bignum.integer.base32.BigInteger32Arithmetic$$ExternalSyntheticBackport1;
import com.ionspin.kotlin.bignum.integer.base63.array.BigInteger63Arithmetic$$ExternalSyntheticBackport0;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;

/* compiled from: UProgressionUtil.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0006\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, m3636d2 = {"differenceModulo", "Lkotlin/UInt;", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlin.internal.UProgressionUtilKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class UProgressionUtil {
    /* renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m28678differenceModuloWZ9TVnA(int i, int i2, int i3) {
        int iM1063m = BigInteger32Arithmetic$$ExternalSyntheticBackport1.m1063m(i, i3);
        int iM1063m2 = BigInteger32Arithmetic$$ExternalSyntheticBackport1.m1063m(i2, i3);
        int iCompare = Integer.compare(iM1063m ^ Integer.MIN_VALUE, iM1063m2 ^ Integer.MIN_VALUE);
        int iM28582constructorimpl = UInt.m28582constructorimpl(iM1063m - iM1063m2);
        return iCompare >= 0 ? iM28582constructorimpl : UInt.m28582constructorimpl(iM28582constructorimpl + i3);
    }

    /* renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m28679differenceModulosambcqE(long j, long j2, long j3) {
        long jM1068m = BigInteger63Arithmetic$$ExternalSyntheticBackport0.m1068m(j, j3);
        long jM1068m2 = BigInteger63Arithmetic$$ExternalSyntheticBackport0.m1068m(j2, j3);
        int iCompare = Long.compare(jM1068m ^ Long.MIN_VALUE, jM1068m2 ^ Long.MIN_VALUE);
        long jM28605constructorimpl = ULong.m28605constructorimpl(jM1068m - jM1068m2);
        return iCompare >= 0 ? jM28605constructorimpl : ULong.m28605constructorimpl(jM28605constructorimpl + j3);
    }

    @SinceKotlin
    @PublishedApi
    /* renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m28681getProgressionLastElementNkh28Cs(int i, int i2, int i3) {
        if (i3 > 0) {
            if (Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) < 0) {
                return UInt.m28582constructorimpl(i2 - m28678differenceModuloWZ9TVnA(i2, i, UInt.m28582constructorimpl(i3)));
            }
        } else if (i3 < 0) {
            if (Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) > 0) {
                return UInt.m28582constructorimpl(i2 + m28678differenceModuloWZ9TVnA(i, i2, UInt.m28582constructorimpl(-i3)));
            }
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
        return i2;
    }

    @SinceKotlin
    @PublishedApi
    /* renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m28680getProgressionLastElement7ftBX0g(long j, long j2, long j3) {
        if (j3 > 0) {
            return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) >= 0 ? j2 : ULong.m28605constructorimpl(j2 - m28679differenceModulosambcqE(j2, j, ULong.m28605constructorimpl(j3)));
        }
        if (j3 < 0) {
            return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) <= 0 ? j2 : ULong.m28605constructorimpl(j2 + m28679differenceModulosambcqE(j, j2, ULong.m28605constructorimpl(-j3)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
