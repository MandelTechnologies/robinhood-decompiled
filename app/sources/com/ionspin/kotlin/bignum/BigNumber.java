package com.ionspin.kotlin.bignum;

import com.ionspin.kotlin.bignum.BigNumber;
import kotlin.Metadata;

/* compiled from: BigNumber.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0001\nJ\u0017\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\u0005J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/ionspin/kotlin/bignum/BigNumber;", "BigType", "", "other", "add", "(Lcom/ionspin/kotlin/bignum/BigNumber;)Lcom/ionspin/kotlin/bignum/BigNumber;", "subtract", "multiply", "divide", "remainder", "Creator", "bignum"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public interface BigNumber<BigType extends BigNumber<BigType>> {
    BigType add(BigType other);

    BigType divide(BigType other);

    BigType multiply(BigType other);

    BigType remainder(BigType other);

    BigType subtract(BigType other);

    /* compiled from: BigNumber.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J!\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00028\u00012\u0006\u0010\r\u001a\u00020\u0005H&¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/ionspin/kotlin/bignum/BigNumber$Creator;", "BigType", "", "", "string", "", "base", "parseString", "(Ljava/lang/String;I)Ljava/lang/Object;", "", "long", "fromLong", "(J)Ljava/lang/Object;", "int", "fromInt", "(I)Ljava/lang/Object;", "", "float", "", "exactRequired", "tryFromFloat", "(FZ)Ljava/lang/Object;", "", "double", "tryFromDouble", "(DZ)Ljava/lang/Object;", "bignum"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface Creator<BigType> {
        BigType fromInt(int i);

        BigType fromLong(long j);

        BigType parseString(String string2, int base);

        BigType tryFromDouble(double d, boolean exactRequired);

        BigType tryFromFloat(float f, boolean exactRequired);

        /* compiled from: BigNumber.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ Object parseString$default(Creator creator, String str, int i, int i2, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: parseString");
                }
                if ((i2 & 2) != 0) {
                    i = 10;
                }
                return creator.parseString(str, i);
            }

            public static /* synthetic */ Object tryFromFloat$default(Creator creator, float f, boolean z, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryFromFloat");
                }
                if ((i & 2) != 0) {
                    z = false;
                }
                return creator.tryFromFloat(f, z);
            }

            public static /* synthetic */ Object tryFromDouble$default(Creator creator, double d, boolean z, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryFromDouble");
                }
                if ((i & 2) != 0) {
                    z = false;
                }
                return creator.tryFromDouble(d, z);
            }
        }
    }
}
