package kotlin.random;

import com.robinhood.utils.extensions.ResourceTypes;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.PlatformImplementations2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Random.kt */
@SinceKotlin
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\n\b'\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010!J\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010#¨\u0006%"}, m3636d2 = {"Lkotlin/random/Random;", "", "<init>", "()V", "", "bitCount", "nextBits", "(I)I", "nextInt", "()I", "until", "from", "(II)I", "", "nextLong", "()J", "(JJ)J", "", "nextBoolean", "()Z", "", "nextDouble", "()D", "(DD)D", "", "nextFloat", "()F", "", ResourceTypes.ARRAY, "fromIndex", "toIndex", "nextBytes", "([BII)[B", "([B)[B", "size", "(I)[B", "Default", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public abstract class Random {

    /* renamed from: Default, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Random defaultRandom = PlatformImplementations2.IMPLEMENTATIONS.defaultPlatformRandom();

    public abstract int nextBits(int bitCount);

    public int nextInt() {
        return nextBits(32);
    }

    public int nextInt(int until) {
        return nextInt(0, until);
    }

    public int nextInt(int from, int until) {
        int iNextInt;
        int i;
        int iNextBits;
        Random2.checkRangeBounds(from, until);
        int i2 = until - from;
        if (i2 > 0 || i2 == Integer.MIN_VALUE) {
            if (((-i2) & i2) == i2) {
                iNextBits = nextBits(Random2.fastLog2(i2));
            } else {
                do {
                    iNextInt = nextInt() >>> 1;
                    i = iNextInt % i2;
                } while ((iNextInt - i) + (i2 - 1) < 0);
                iNextBits = i;
            }
            return from + iNextBits;
        }
        while (true) {
            int iNextInt2 = nextInt();
            if (from <= iNextInt2 && iNextInt2 < until) {
                return iNextInt2;
            }
        }
    }

    public long nextLong() {
        return (nextInt() << 32) + nextInt();
    }

    public long nextLong(long from, long until) {
        long jNextLong;
        long j;
        long jNextBits;
        int iNextInt;
        Random2.checkRangeBounds(from, until);
        long j2 = until - from;
        if (j2 > 0) {
            if (((-j2) & j2) == j2) {
                int i = (int) j2;
                int i2 = (int) (j2 >>> 32);
                if (i != 0) {
                    iNextInt = nextBits(Random2.fastLog2(i));
                } else if (i2 == 1) {
                    iNextInt = nextInt();
                } else {
                    jNextBits = (nextBits(Random2.fastLog2(i2)) << 32) + (nextInt() & 4294967295L);
                }
                jNextBits = iNextInt & 4294967295L;
            } else {
                do {
                    jNextLong = nextLong() >>> 1;
                    j = jNextLong % j2;
                } while ((jNextLong - j) + (j2 - 1) < 0);
                jNextBits = j;
            }
            return from + jNextBits;
        }
        while (true) {
            long jNextLong2 = nextLong();
            if (from <= jNextLong2 && jNextLong2 < until) {
                return jNextLong2;
            }
        }
    }

    public boolean nextBoolean() {
        return nextBits(1) != 0;
    }

    public double nextDouble() {
        return PlatformRandom4.doubleFromParts(nextBits(26), nextBits(27));
    }

    public double nextDouble(double from, double until) {
        double dNextDouble;
        Random2.checkRangeBounds(from, until);
        double d = until - from;
        if (Double.isInfinite(d) && Math.abs(from) <= Double.MAX_VALUE && Math.abs(until) <= Double.MAX_VALUE) {
            double d2 = 2;
            double dNextDouble2 = nextDouble() * ((until / d2) - (from / d2));
            dNextDouble = from + dNextDouble2 + dNextDouble2;
        } else {
            dNextDouble = from + (nextDouble() * d);
        }
        return dNextDouble >= until ? Math.nextAfter(until, Double.NEGATIVE_INFINITY) : dNextDouble;
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public byte[] nextBytes(byte[] array2, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(array2, "array");
        if (fromIndex < 0 || fromIndex > array2.length || toIndex < 0 || toIndex > array2.length) {
            throw new IllegalArgumentException(("fromIndex (" + fromIndex + ") or toIndex (" + toIndex + ") are out of range: 0.." + array2.length + '.').toString());
        }
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException(("fromIndex (" + fromIndex + ") must be not greater than toIndex (" + toIndex + ").").toString());
        }
        int i = (toIndex - fromIndex) / 4;
        for (int i2 = 0; i2 < i; i2++) {
            int iNextInt = nextInt();
            array2[fromIndex] = (byte) iNextInt;
            array2[fromIndex + 1] = (byte) (iNextInt >>> 8);
            array2[fromIndex + 2] = (byte) (iNextInt >>> 16);
            array2[fromIndex + 3] = (byte) (iNextInt >>> 24);
            fromIndex += 4;
        }
        int i3 = toIndex - fromIndex;
        int iNextBits = nextBits(i3 * 8);
        for (int i4 = 0; i4 < i3; i4++) {
            array2[fromIndex + i4] = (byte) (iNextBits >>> (i4 * 8));
        }
        return array2;
    }

    public byte[] nextBytes(byte[] array2) {
        Intrinsics.checkNotNullParameter(array2, "array");
        return nextBytes(array2, 0, array2.length);
    }

    public byte[] nextBytes(int size) {
        return nextBytes(new byte[size]);
    }

    /* compiled from: Random.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u001f\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\"J'\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010%R\u0014\u0010&\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, m3636d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "", "bitCount", "nextBits", "(I)I", "nextInt", "()I", "until", "from", "(II)I", "", "nextLong", "()J", "(JJ)J", "", "nextBoolean", "()Z", "", "nextDouble", "()D", "(DD)D", "", "nextFloat", "()F", "", ResourceTypes.ARRAY, "nextBytes", "([B)[B", "size", "(I)[B", "fromIndex", "toIndex", "([BII)[B", "defaultRandom", "Lkotlin/random/Random;", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: kotlin.random.Random$Default, reason: from kotlin metadata */
    public static final class Companion extends Random implements Serializable {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // kotlin.random.Random
        public int nextBits(int bitCount) {
            return Random.defaultRandom.nextBits(bitCount);
        }

        @Override // kotlin.random.Random
        public int nextInt() {
            return Random.defaultRandom.nextInt();
        }

        @Override // kotlin.random.Random
        public int nextInt(int until) {
            return Random.defaultRandom.nextInt(until);
        }

        @Override // kotlin.random.Random
        public int nextInt(int from, int until) {
            return Random.defaultRandom.nextInt(from, until);
        }

        @Override // kotlin.random.Random
        public long nextLong() {
            return Random.defaultRandom.nextLong();
        }

        @Override // kotlin.random.Random
        public long nextLong(long from, long until) {
            return Random.defaultRandom.nextLong(from, until);
        }

        @Override // kotlin.random.Random
        public boolean nextBoolean() {
            return Random.defaultRandom.nextBoolean();
        }

        @Override // kotlin.random.Random
        public double nextDouble() {
            return Random.defaultRandom.nextDouble();
        }

        @Override // kotlin.random.Random
        public double nextDouble(double from, double until) {
            return Random.defaultRandom.nextDouble(from, until);
        }

        @Override // kotlin.random.Random
        public float nextFloat() {
            return Random.defaultRandom.nextFloat();
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(byte[] array2) {
            Intrinsics.checkNotNullParameter(array2, "array");
            return Random.defaultRandom.nextBytes(array2);
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(int size) {
            return Random.defaultRandom.nextBytes(size);
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(byte[] array2, int fromIndex, int toIndex) {
            Intrinsics.checkNotNullParameter(array2, "array");
            return Random.defaultRandom.nextBytes(array2, fromIndex, toIndex);
        }
    }
}
